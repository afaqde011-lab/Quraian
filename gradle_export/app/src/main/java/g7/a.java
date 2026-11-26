package g7;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.datasource.AssetDataSource$AssetDataSourceException;
import com.google.android.gms.cast.CastStatusCodes;
import e7.i0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class a extends b {
    public final AssetManager E;
    public Uri F;
    public InputStream G;
    public long H;
    public boolean I;

    public a(Context context) {
        super(false);
        this.E = context.getAssets();
    }

    @Override
    public final void close() {
        this.F = null;
        try {
            try {
                InputStream inputStream = this.G;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.G = null;
                if (this.I) {
                    this.I = false;
                    c();
                }
            } catch (IOException e3) {
                throw new AssetDataSource$AssetDataSourceException(CastStatusCodes.AUTHENTICATION_FAILED, e3);
            }
        } catch (Throwable th2) {
            this.G = null;
            if (this.I) {
                this.I = false;
                c();
            }
            throw th2;
        }
    }

    @Override
    public final long p(j jVar) throws AssetDataSource$AssetDataSourceException {
        try {
            Uri uri = jVar.f6218a;
            long j9 = jVar.f6222e;
            this.F = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            e();
            InputStream inputStreamOpen = this.E.open(path, 1);
            this.G = inputStreamOpen;
            if (inputStreamOpen.skip(j9) < j9) {
                throw new AssetDataSource$AssetDataSourceException(2008, null);
            }
            long j10 = jVar.f6223f;
            if (j10 != -1) {
                this.H = j10;
            } else {
                long jAvailable = this.G.available();
                this.H = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.H = -1L;
                }
            }
            this.I = true;
            h(jVar);
            return this.H;
        } catch (AssetDataSource$AssetDataSourceException e3) {
            throw e3;
        } catch (IOException e10) {
            throw new AssetDataSource$AssetDataSourceException(e10 instanceof FileNotFoundException ? CastStatusCodes.APPLICATION_NOT_RUNNING : CastStatusCodes.AUTHENTICATION_FAILED, e10);
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) throws AssetDataSource$AssetDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j9 = this.H;
        if (j9 != 0) {
            if (j9 != -1) {
                try {
                    i11 = (int) Math.min(j9, i11);
                } catch (IOException e3) {
                    throw new AssetDataSource$AssetDataSourceException(CastStatusCodes.AUTHENTICATION_FAILED, e3);
                }
            }
            InputStream inputStream = this.G;
            String str = i0.f5136a;
            int i12 = inputStream.read(bArr, i10, i11);
            if (i12 != -1) {
                long j10 = this.H;
                if (j10 != -1) {
                    this.H = j10 - ((long) i12);
                }
                b(i12);
                return i12;
            }
        }
        return -1;
    }

    @Override
    public final Uri y() {
        return this.F;
    }
}

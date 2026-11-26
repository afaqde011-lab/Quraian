package g7;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.datasource.FileDataSource$FileDataSourceException;
import com.google.android.gms.cast.CastStatusCodes;
import e7.i0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class o extends b {
    public RandomAccessFile E;
    public Uri F;
    public long G;
    public boolean H;

    @Override
    public final void close() {
        this.F = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.E;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.E = null;
                if (this.H) {
                    this.H = false;
                    c();
                }
            } catch (IOException e3) {
                throw new FileDataSource$FileDataSourceException(CastStatusCodes.AUTHENTICATION_FAILED, e3);
            }
        } catch (Throwable th2) {
            this.E = null;
            if (this.H) {
                this.H = false;
                c();
            }
            throw th2;
        }
    }

    @Override
    public final long p(j jVar) throws FileDataSource$FileDataSourceException {
        Uri uri = jVar.f6218a;
        long j9 = jVar.f6222e;
        this.F = uri;
        e();
        int i10 = CastStatusCodes.MESSAGE_TOO_LARGE;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.E = randomAccessFile;
            try {
                randomAccessFile.seek(j9);
                long length = jVar.f6223f;
                if (length == -1) {
                    length = this.E.length() - j9;
                }
                this.G = length;
                if (length < 0) {
                    throw new FileDataSource$FileDataSourceException(null, null, 2008);
                }
                this.H = true;
                h(jVar);
                return this.G;
            } catch (IOException e3) {
                throw new FileDataSource$FileDataSourceException(CastStatusCodes.AUTHENTICATION_FAILED, e3);
            }
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (!(e10.getCause() instanceof ErrnoException) || ((ErrnoException) e10.getCause()).errno != OsConstants.EACCES) {
                    i10 = CastStatusCodes.APPLICATION_NOT_RUNNING;
                }
                throw new FileDataSource$FileDataSourceException(i10, e10);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbS = a1.b.s("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbS.append(fragment);
            throw new FileDataSource$FileDataSourceException(sbS.toString(), e10, 1004);
        } catch (SecurityException e11) {
            throw new FileDataSource$FileDataSourceException(CastStatusCodes.MESSAGE_TOO_LARGE, e11);
        } catch (RuntimeException e12) {
            throw new FileDataSource$FileDataSourceException(CastStatusCodes.AUTHENTICATION_FAILED, e12);
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) throws FileDataSource$FileDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j9 = this.G;
        if (j9 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.E;
            String str = i0.f5136a;
            int i12 = randomAccessFile.read(bArr, i10, (int) Math.min(j9, i11));
            if (i12 > 0) {
                this.G -= (long) i12;
                b(i12);
            }
            return i12;
        } catch (IOException e3) {
            throw new FileDataSource$FileDataSourceException(CastStatusCodes.AUTHENTICATION_FAILED, e3);
        }
    }

    @Override
    public final Uri y() {
        return this.F;
    }
}

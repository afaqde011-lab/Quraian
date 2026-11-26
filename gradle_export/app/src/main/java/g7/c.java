package g7;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.datasource.ContentDataSource$ContentDataSourceException;
import com.google.android.gms.cast.CastStatusCodes;
import e7.i0;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

public final class c extends b {
    public final ContentResolver E;
    public Uri F;
    public AssetFileDescriptor G;
    public FileInputStream H;
    public long I;
    public boolean J;

    public c(Context context) {
        super(false);
        this.E = context.getContentResolver();
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException("Method not decompiled: g7.c.close():void");
    }

    @Override
    public final long p(j jVar) throws ContentDataSource$ContentDataSourceException {
        int i10;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = jVar.f6218a;
                long j9 = jVar.f6223f;
                long j10 = jVar.f6222e;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.F = uriNormalizeScheme;
                e();
                boolean zEquals = Objects.equals(uriNormalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.E;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.G = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    IOException iOException = new IOException("Could not open file descriptor for: " + uriNormalizeScheme);
                    i10 = CastStatusCodes.AUTHENTICATION_FAILED;
                    try {
                        throw new ContentDataSource$ContentDataSourceException(CastStatusCodes.AUTHENTICATION_FAILED, iOException);
                    } catch (IOException e3) {
                        e = e3;
                        throw new ContentDataSource$ContentDataSourceException(e instanceof FileNotFoundException ? CastStatusCodes.APPLICATION_NOT_RUNNING : i10, e);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.H = fileInputStream;
                if (length != -1 && j10 > length) {
                    throw new ContentDataSource$ContentDataSourceException(2008, null);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j10) - startOffset;
                if (jSkip != j10) {
                    throw new ContentDataSource$ContentDataSourceException(2008, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.I = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.I = jPosition;
                        if (jPosition < 0) {
                            throw new ContentDataSource$ContentDataSourceException(2008, null);
                        }
                    }
                } else {
                    long j11 = length - jSkip;
                    this.I = j11;
                    if (j11 < 0) {
                        throw new ContentDataSource$ContentDataSourceException(2008, null);
                    }
                }
                if (j9 != -1) {
                    long j12 = this.I;
                    this.I = j12 == -1 ? j9 : Math.min(j12, j9);
                }
                this.J = true;
                h(jVar);
                return j9 != -1 ? j9 : this.I;
            } catch (ContentDataSource$ContentDataSourceException e10) {
                throw e10;
            }
        } catch (IOException e11) {
            e = e11;
            i10 = CastStatusCodes.AUTHENTICATION_FAILED;
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) throws ContentDataSource$ContentDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j9 = this.I;
        if (j9 != 0) {
            if (j9 != -1) {
                try {
                    i11 = (int) Math.min(j9, i11);
                } catch (IOException e3) {
                    throw new ContentDataSource$ContentDataSourceException(CastStatusCodes.AUTHENTICATION_FAILED, e3);
                }
            }
            FileInputStream fileInputStream = this.H;
            String str = i0.f5136a;
            int i12 = fileInputStream.read(bArr, i10, i11);
            if (i12 != -1) {
                long j10 = this.I;
                if (j10 != -1) {
                    this.I = j10 - ((long) i12);
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

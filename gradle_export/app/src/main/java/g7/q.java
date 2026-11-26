package g7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.internal.measurement.x5;
import e7.i0;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

public final class q extends b {
    public final Context E;
    public j F;
    public AssetFileDescriptor G;
    public FileInputStream H;
    public long I;
    public boolean J;

    public q(Context context) {
        super(false);
        this.E = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException("Method not decompiled: g7.q.close():void");
    }

    @Override
    public final long p(j jVar) throws RawResourceDataSource$RawResourceDataSourceException {
        Resources resourcesForApplication;
        int identifier;
        int i10;
        Resources resources;
        this.F = jVar;
        e();
        Uri uri = jVar.f6218a;
        long j9 = jVar.f6223f;
        long j10 = jVar.f6222e;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.E;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new RawResourceDataSource$RawResourceDataSourceException("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, CastStatusCodes.AUTHENTICATION_FAILED);
            }
            try {
                i10 = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSource$RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new RawResourceDataSource$RawResourceDataSourceException("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e3) {
                    throw new RawResourceDataSource$RawResourceDataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e3, CastStatusCodes.APPLICATION_NOT_RUNNING);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new RawResourceDataSource$RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(x5.m(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new RawResourceDataSource$RawResourceDataSourceException("Resource not found.", null, CastStatusCodes.APPLICATION_NOT_RUNNING);
                }
            }
            i10 = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i10);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new RawResourceDataSource$RawResourceDataSourceException("Resource is compressed: " + uriNormalizeScheme, null, CastStatusCodes.AUTHENTICATION_FAILED);
            }
            this.G = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.G.getFileDescriptor());
            this.H = fileInputStream;
            try {
                if (length != -1 && j10 > length) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                }
                long startOffset = this.G.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j10) - startOffset;
                if (jSkip != j10) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.I = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.I = size;
                        if (size < 0) {
                            throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                        }
                    }
                } else {
                    long j11 = length - jSkip;
                    this.I = j11;
                    if (j11 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
                if (j9 != -1) {
                    long j12 = this.I;
                    this.I = j12 == -1 ? j9 : Math.min(j12, j9);
                }
                this.J = true;
                h(jVar);
                return j9 != -1 ? j9 : this.I;
            } catch (RawResourceDataSource$RawResourceDataSourceException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RawResourceDataSource$RawResourceDataSourceException(null, e11, CastStatusCodes.AUTHENTICATION_FAILED);
            }
        } catch (Resources.NotFoundException e12) {
            throw new RawResourceDataSource$RawResourceDataSourceException(null, e12, CastStatusCodes.APPLICATION_NOT_RUNNING);
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) throws RawResourceDataSource$RawResourceDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j9 = this.I;
        if (j9 != 0) {
            if (j9 != -1) {
                try {
                    i11 = (int) Math.min(j9, i11);
                } catch (IOException e3) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, e3, CastStatusCodes.AUTHENTICATION_FAILED);
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
            if (this.I != -1) {
                throw new RawResourceDataSource$RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), CastStatusCodes.AUTHENTICATION_FAILED);
            }
        }
        return -1;
    }

    @Override
    public final Uri y() {
        j jVar = this.F;
        if (jVar != null) {
            return jVar.f6218a;
        }
        return null;
    }
}

package z9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import d4.m;
import java.io.File;
import java.io.IOException;
import tf.x;

public abstract class e {

    public static final m f17330a = new m();

    public static final Object f17331b = new Object();

    public static x f17332c = null;

    public static void a(Context context, boolean z10) {
        int i10;
        boolean z11;
        File file;
        boolean z12;
        File file2;
        long length;
        boolean z13;
        File file3;
        d dVarA;
        d dVar;
        int i11;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z10 || f17332c == null) {
            synchronized (f17331b) {
                if (z10) {
                    i10 = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length2 = file.length();
                    if (file.exists()) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists()) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    long j9 = context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).lastUpdateTime;
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        dVarA = d.a(file3);
                    } else {
                        dVarA = null;
                    }
                    if (dVarA == null) {
                        if (!z11) {
                            i10 = 327680;
                        } else if (z12) {
                            i10 = 1;
                        } else if (z13) {
                            i10 = 2;
                        }
                    } else if (!z11) {
                        i10 = 327680;
                    } else if (z12) {
                        i10 = 1;
                    } else if (z13) {
                        i10 = 2;
                    }
                    if (z10) {
                        i10 = 2;
                    }
                    if (dVarA != null) {
                        i10 = 3;
                    }
                    dVar = new d(j9, 1, i10, length);
                    if (dVarA != null) {
                        dVar.b(file3);
                    } else {
                        dVar.b(file3);
                    }
                    x xVar = new x(25);
                    f17332c = xVar;
                    f17330a.k(xVar);
                    return;
                }
                if (f17332c != null) {
                    return;
                }
                i10 = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (assetFileDescriptorOpenFd.getLength() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        assetFileDescriptorOpenFd.close();
                    } catch (Throwable th2) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th2;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (IOException unused) {
                    z11 = false;
                }
                file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length3 = file.length();
                if (file.exists() || length3 <= 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                length = file2.length();
                if (file2.exists() || length <= 0) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                try {
                    long j10 = context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).lastUpdateTime;
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            dVarA = d.a(file3);
                        } catch (IOException unused2) {
                            x xVar2 = new x(25);
                            f17332c = xVar2;
                            f17330a.k(xVar2);
                            return;
                        }
                    } else {
                        dVarA = null;
                    }
                    if (dVarA == null && dVarA.f17328c == j10 && (i11 = dVarA.f17327b) != 2) {
                        i10 = i11;
                    } else if (!z11) {
                        i10 = 327680;
                    } else if (z12) {
                        i10 = 1;
                    } else if (z13) {
                        i10 = 2;
                    }
                    if (z10 && z13 && i10 != 1) {
                        i10 = 2;
                    }
                    if (dVarA != null && dVarA.f17327b == 2 && i10 == 1 && length3 < dVarA.f17329d) {
                        i10 = 3;
                    }
                    dVar = new d(j10, 1, i10, length);
                    if (dVarA != null || !dVarA.equals(dVar)) {
                        try {
                            dVar.b(file3);
                        } catch (IOException unused3) {
                        }
                    }
                    x xVar3 = new x(25);
                    f17332c = xVar3;
                    f17330a.k(xVar3);
                    return;
                } catch (PackageManager.NameNotFoundException unused4) {
                    x xVar4 = new x(25);
                    f17332c = xVar4;
                    f17330a.k(xVar4);
                    return;
                }
                throw th;
            }
        }
    }
}

package pe;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class g {

    public static boolean f12495b = false;

    public static boolean f12496c = false;

    public static final int f12498e = 0;

    public static final AtomicBoolean f12494a = new AtomicBoolean();

    public static final AtomicBoolean f12497d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!f12496c) {
                PackageInfo packageInfoB = xe.b.a(context).b(134217792, "com.google.android.gms");
                h.a(context);
                if (packageInfoB == null || h.c(packageInfoB, false) || !h.c(packageInfoB, true)) {
                    f12495b = false;
                } else {
                    f12495b = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e3) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e3);
        } finally {
            f12496c = true;
        }
        return f12495b || !"user".equals(Build.TYPE);
    }

    public static boolean b(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}

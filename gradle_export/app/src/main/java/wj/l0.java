package wj;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

public final class l0 {

    public static final l0 f16190a = new l0();

    public static final me.i f16191b;

    static {
        dj.d dVar = new dj.d();
        dVar.a(k0.class, g.f16153a);
        dVar.a(r0.class, h.f16157a);
        dVar.a(k.class, e.f16140a);
        dVar.a(b.class, d.f16132a);
        dVar.a(a.class, c.f16120a);
        dVar.a(c0.class, f.f16144a);
        dVar.f4908d = true;
        f16191b = new me.i(dVar, 19);
    }

    public static b a(bi.g gVar) throws PackageManager.NameNotFoundException {
        gVar.a();
        Context context = gVar.f2531a;
        kotlin.jvm.internal.m.d(context, "getApplicationContext(...)");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = String.valueOf(packageInfo.getLongVersionCode());
        gVar.a();
        String str = gVar.f2533c.f2542b;
        kotlin.jvm.internal.m.d(str, "getApplicationId(...)");
        kotlin.jvm.internal.m.d(Build.MODEL, "MODEL");
        kotlin.jvm.internal.m.d(Build.VERSION.RELEASE, "RELEASE");
        v vVar = v.LOG_ENVIRONMENT_PROD;
        kotlin.jvm.internal.m.b(packageName);
        String str2 = packageInfo.versionName;
        String str3 = str2 == null ? strValueOf : str2;
        kotlin.jvm.internal.m.d(Build.MANUFACTURER, "MANUFACTURER");
        gVar.a();
        c0 c0VarB = r.b(context);
        gVar.a();
        return new b(str, new a(packageName, str3, strValueOf, c0VarB, r.a(context)));
    }
}

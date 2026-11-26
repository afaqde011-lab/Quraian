package wj;

import android.os.Build;

public final class c implements bj.c {

    public static final c f16120a = new c();

    public static final bj.b f16121b = bj.b.a("packageName");

    public static final bj.b f16122c = bj.b.a("versionName");

    public static final bj.b f16123d = bj.b.a("appBuildVersion");

    public static final bj.b f16124e = bj.b.a("deviceManufacturer");

    public static final bj.b f16125f = bj.b.a("currentProcessDetails");

    public static final bj.b f16126g = bj.b.a("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        bj.d dVar = (bj.d) obj2;
        dVar.f(f16121b, aVar.f16103a);
        dVar.f(f16122c, aVar.f16104b);
        dVar.f(f16123d, aVar.f16105c);
        dVar.f(f16124e, Build.MANUFACTURER);
        dVar.f(f16125f, aVar.f16106d);
        dVar.f(f16126g, aVar.f16107e);
    }
}

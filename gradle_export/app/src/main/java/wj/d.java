package wj;

import android.os.Build;

public final class d implements bj.c {

    public static final d f16132a = new d();

    public static final bj.b f16133b = bj.b.a("appId");

    public static final bj.b f16134c = bj.b.a("deviceModel");

    public static final bj.b f16135d = bj.b.a("sessionSdkVersion");

    public static final bj.b f16136e = bj.b.a("osVersion");

    public static final bj.b f16137f = bj.b.a("logEnvironment");

    public static final bj.b f16138g = bj.b.a("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        bj.d dVar = (bj.d) obj2;
        dVar.f(f16133b, bVar.f16117a);
        dVar.f(f16134c, Build.MODEL);
        dVar.f(f16135d, "3.0.3");
        dVar.f(f16136e, Build.VERSION.RELEASE);
        dVar.f(f16137f, v.LOG_ENVIRONMENT_PROD);
        dVar.f(f16138g, bVar.f16118b);
    }
}

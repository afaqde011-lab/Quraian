package wd;

public final class j implements bj.c {

    public static final j f16020a = new j();

    public static final bj.b f16021b = bj.b.a("requestTimeMs");

    public static final bj.b f16022c = bj.b.a("requestUptimeMs");

    public static final bj.b f16023d = bj.b.a("clientInfo");

    public static final bj.b f16024e = bj.b.a("logSource");

    public static final bj.b f16025f = bj.b.a("logSourceName");

    public static final bj.b f16026g = bj.b.a("logEvent");

    public static final bj.b f16027h = bj.b.a("qosTier");

    @Override
    public final void a(Object obj, Object obj2) {
        bj.d dVar = (bj.d) obj2;
        t tVar = (t) ((f0) obj);
        dVar.e(f16021b, tVar.f16058a);
        dVar.e(f16022c, tVar.f16059b);
        dVar.f(f16023d, tVar.f16060c);
        dVar.f(f16024e, tVar.f16061d);
        dVar.f(f16025f, tVar.f16062e);
        dVar.f(f16026g, tVar.f16063f);
        dVar.f(f16027h, j0.A);
    }
}

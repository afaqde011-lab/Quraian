package wj;

public final class g implements bj.c {

    public static final g f16153a = new g();

    public static final bj.b f16154b = bj.b.a("eventType");

    public static final bj.b f16155c = bj.b.a("sessionData");

    public static final bj.b f16156d = bj.b.a("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        bj.d dVar = (bj.d) obj2;
        k0Var.getClass();
        dVar.f(f16154b, n.SESSION_START);
        dVar.f(f16155c, k0Var.f16187a);
        dVar.f(f16156d, k0Var.f16188b);
    }
}

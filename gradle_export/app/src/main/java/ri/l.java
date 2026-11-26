package ri;

public final class l implements bj.c {

    public static final l f13423a = new l();

    public static final bj.b f13424b = bj.b.a("baseAddress");

    public static final bj.b f13425c = bj.b.a("size");

    public static final bj.b f13426d = bj.b.a("name");

    public static final bj.b f13427e = bj.b.a("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        bj.d dVar = (bj.d) obj2;
        s0 s0Var = (s0) ((w1) obj);
        dVar.e(f13424b, s0Var.f13524a);
        dVar.e(f13425c, s0Var.f13525b);
        dVar.f(f13426d, s0Var.f13526c);
        String str = s0Var.f13527d;
        dVar.f(f13427e, str != null ? str.getBytes(n2.f13472a) : null);
    }
}

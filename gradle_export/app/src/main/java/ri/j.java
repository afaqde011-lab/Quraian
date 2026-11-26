package ri;

public final class j implements bj.c {

    public static final j f13383a = new j();

    public static final bj.b f13384b = bj.b.a("generator");

    public static final bj.b f13385c = bj.b.a("identifier");

    public static final bj.b f13386d = bj.b.a("appQualitySessionId");

    public static final bj.b f13387e = bj.b.a("startedAt");

    public static final bj.b f13388f = bj.b.a("endedAt");

    public static final bj.b f13389g = bj.b.a("crashed");

    public static final bj.b f13390h = bj.b.a("app");

    public static final bj.b f13391i = bj.b.a("user");

    public static final bj.b f13392j = bj.b.a("os");

    public static final bj.b f13393k = bj.b.a("device");
    public static final bj.b l = bj.b.a("events");
    public static final bj.b m = bj.b.a("generatorType");

    @Override
    public final void a(Object obj, Object obj2) {
        bj.d dVar = (bj.d) obj2;
        j0 j0Var = (j0) ((m2) obj);
        dVar.f(f13384b, j0Var.f13394a);
        dVar.f(f13385c, j0Var.f13395b.getBytes(n2.f13472a));
        dVar.f(f13386d, j0Var.f13396c);
        dVar.e(f13387e, j0Var.f13397d);
        dVar.f(f13388f, j0Var.f13398e);
        dVar.g(f13389g, j0Var.f13399f);
        dVar.f(f13390h, j0Var.f13400g);
        dVar.f(f13391i, j0Var.f13401h);
        dVar.f(f13392j, j0Var.f13402i);
        dVar.f(f13393k, j0Var.f13403j);
        dVar.f(l, j0Var.f13404k);
        dVar.d(m, j0Var.l);
    }
}

package ri;

public final class s implements bj.c {

    public static final s f13517a = new s();

    public static final bj.b f13518b = bj.b.a("batteryLevel");

    public static final bj.b f13519c = bj.b.a("batteryVelocity");

    public static final bj.b f13520d = bj.b.a("proximityOn");

    public static final bj.b f13521e = bj.b.a("orientation");

    public static final bj.b f13522f = bj.b.a("ramUsed");

    public static final bj.b f13523g = bj.b.a("diskUsed");

    @Override
    public final void a(Object obj, Object obj2) {
        bj.d dVar = (bj.d) obj2;
        b1 b1Var = (b1) ((e2) obj);
        dVar.f(f13518b, b1Var.f13277a);
        dVar.d(f13519c, b1Var.f13278b);
        dVar.g(f13520d, b1Var.f13279c);
        dVar.d(f13521e, b1Var.f13280d);
        dVar.e(f13522f, b1Var.f13281e);
        dVar.e(f13523g, b1Var.f13282f);
    }
}

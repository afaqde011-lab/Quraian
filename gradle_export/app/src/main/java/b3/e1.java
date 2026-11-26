package b3;

public abstract class e1 implements b2.p, c3.a2 {
    public c3.d2 A;

    @Override
    public final q30.j b() {
        c3.d2 d2Var = this.A;
        if (d2Var == null) {
            d2Var = new c3.d2();
            d2Var.f2644a = kotlin.jvm.internal.a0.a.b(getClass()).n();
            h(d2Var);
            this.A = d2Var;
        }
        return d2Var.f2646c;
    }

    @Override
    public final String c() {
        c3.d2 d2Var = this.A;
        if (d2Var == null) {
            d2Var = new c3.d2();
            d2Var.f2644a = kotlin.jvm.internal.a0.a.b(getClass()).n();
            h(d2Var);
            this.A = d2Var;
        }
        return d2Var.f2644a;
    }

    public abstract b2.q d();

    public abstract void h(c3.d2 d2Var);

    public abstract void i(b2.q qVar);
}

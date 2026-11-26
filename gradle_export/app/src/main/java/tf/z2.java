package tf;

public final class z2 extends n {

    public final int f14781e;

    public final c3 f14782f;

    public z2(c3 c3Var, h1 h1Var, int i10) {
        super(h1Var);
        this.f14781e = i10;
        this.f14782f = c3Var;
    }

    @Override
    public final void a() {
        switch (this.f14781e) {
            case 0:
                c3 c3Var = this.f14782f;
                c3Var.V0();
                if (c3Var.m1()) {
                    q0 q0Var = ((h1) c3Var.B).F;
                    h1.g(q0Var);
                    q0Var.O.b("Inactivity, disconnecting from the service");
                    c3Var.d1();
                    break;
                }
                break;
            default:
                q0 q0Var2 = ((h1) this.f14782f.B).F;
                h1.g(q0Var2);
                q0Var2.J.b("Tasks have been queued for a long time");
                break;
        }
    }
}

package g1;

public final class q implements u00.k {
    public final int A;
    public final m6 B;

    public q(m6 m6Var, int i10) {
        this.A = i10;
        this.B = m6Var;
    }

    public final Object invoke(Object obj) {
        i2.c0 c0Var = (i2.c0) obj;
        switch (this.A) {
            case 0:
                fc.n nVar = this.B.f5887d;
                float fH = ((l1.e1) nVar.f5635j).h();
                float fC = nVar.g().c();
                float f3 = fH < fC ? fC - fH : 0.0f;
                c0Var.N(f3 > 0.0f ? 1 / ((Float.intBitsToFloat((int) (c0Var.b() & 4294967295L)) + f3) / Float.intBitsToFloat((int) (c0Var.b() & 4294967295L))) : 1.0f);
                c0Var.S0(i2.b0.h(0.5f, 0.0f));
                break;
            default:
                fc.n nVar2 = this.B.f5887d;
                float fH2 = ((l1.e1) nVar2.f5635j).h();
                float fC2 = nVar2.g().c();
                float f10 = fH2 < fC2 ? fC2 - fH2 : 0.0f;
                c0Var.N(f10 > 0.0f ? (Float.intBitsToFloat((int) (c0Var.b() & 4294967295L)) + f10) / Float.intBitsToFloat((int) (4294967295L & c0Var.b())) : 1.0f);
                c0Var.S0(i2.b0.h(0.5f, 0.0f));
                break;
        }
        return g00.b0.a;
    }
}

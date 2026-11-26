package g1;

public final class e1 implements u00.n {
    public final int A;
    public final l1.z0 B;

    public e1(l1.z0 z0Var, int i10) {
        this.A = i10;
        this.B = z0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        l1.g0 g0Var;
        boolean z10;
        switch (this.A) {
            case 0:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.g0 g0Var2 = (l1.g0) jVar;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l1.z0 z0Var = this.B;
                    if (r30.k.L0((CharSequence) z0Var.getValue())) {
                        g0Var = g0Var2;
                        z10 = false;
                        g0Var.c0(-1548950640);
                    } else {
                        g0Var2.c0(-327061465);
                        String str = (String) z0Var.getValue();
                        g0Var = g0Var2;
                        z6.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, jVar, 0, 0, 262142);
                        z10 = false;
                    }
                    g0Var.r(z10);
                } else {
                    g0Var2.V();
                }
                break;
            default:
                l1.j jVar2 = (l1.j) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                l1.g0 g0Var3 = (l1.g0) jVar2;
                if (g0Var3.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objN = g0Var3.N();
                    if (objN == l1.i.f9868a) {
                        objN = new e6.c(25);
                        g0Var3.n0(objN);
                    }
                    b2.r rVarC = j3.q.c(b2.o.A, false, (u00.k) objN);
                    z2.w0 w0VarD = h0.o.d(b2.b.A, false);
                    int iT = l1.q.t(jVar2);
                    l1.m1 m1VarM = g0Var3.m();
                    b2.r rVarC2 = b2.a.c(rVarC, jVar2);
                    b3.i.f2042c.getClass();
                    b3.g gVar = b3.h.f2035b;
                    g0Var3.g0();
                    if (g0Var3.S) {
                        g0Var3.l(gVar);
                    } else {
                        g0Var3.q0();
                    }
                    l1.q.I(w0VarD, jVar2, b3.h.f2039f);
                    l1.q.I(m1VarM, jVar2, b3.h.f2038e);
                    b3.f fVar = b3.h.f2040g;
                    if (g0Var3.S || !kotlin.jvm.internal.m.a(g0Var3.N(), Integer.valueOf(iT))) {
                        com.google.android.gms.internal.measurement.x5.v(iT, g0Var3, iT, fVar);
                    }
                    l1.q.I(rVarC2, jVar2, b3.h.f2037d);
                    ((u00.n) this.B.getValue()).invoke(jVar2, 0);
                    g0Var3.r(true);
                } else {
                    g0Var3.V();
                }
                break;
        }
        return g00.b0.a;
    }
}

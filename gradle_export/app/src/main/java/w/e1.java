package w;

import kotlin.NoWhenBranchMatchedException;

public final class e1 extends kotlin.jvm.internal.n implements u00.k {
    public final int A = 0;
    public final z2.l1 B;
    public final f1 C;

    public e1(f1 f1Var, z2.l1 l1Var) {
        super(1);
        this.C = f1Var;
        this.B = l1Var;
    }

    public e1(z2.l1 l1Var, f1 f1Var) {
        super(1);
        this.B = l1Var;
        this.C = f1Var;
    }

    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        long j9;
        long jE;
        z2.a0 a0VarE;
        switch (this.A) {
            case 0:
                z2.k1 k1Var = (z2.k1) obj;
                f1 f1Var = this.C;
                f1Var.P = true;
                h2.b bVar = null;
                f1Var.O = null;
                a2 a2VarD = f1Var.Q.e().f15782c.d();
                boolean zH = f1Var.Q.h();
                z2.l1 l1Var = this.B;
                if (zH && a2VarD.d()) {
                    p10.a aVarE = a2VarD.e();
                    if (aVarE == null) {
                        throw new IllegalArgumentException(("Match State is configured, but target data is null. State = " + a2VarD).toString());
                    }
                    h2.c cVarC = a2VarD.c();
                    if (cVarC == null) {
                        throw new IllegalArgumentException(("Match State is configured, but current bounds is null. State = " + a2VarD).toString());
                    }
                    if (f1Var.Q.e().f15781b.b()) {
                        z2.a0 a0VarE2 = k1Var.e();
                        if (a0VarE2 == null) {
                            k1Var.h(l1Var, 0, 0, 0.0f);
                        } else {
                            boolean zB = f1Var.Q.e().f15782c.d().b();
                            long jV = f1Var.C1().V(a0VarE2, 0L);
                            c0.j(aVarE);
                            if (zB) {
                                j9 = 4294967295L;
                                f1Var.Q.a().a(cVarC, c0.j(aVarE), null);
                            } else {
                                j9 = 4294967295L;
                                f1Var.Q.a().a(cVarC, c0.j(aVarE), new oo.k0(2));
                            }
                            h2.c cVarC2 = f1Var.Q.a().c();
                            if (cVarC2 != null) {
                                bVar = new h2.b(h2.b.f(h2.b.e(cVarC2.e(), ((h2.b) ((l1.i1) aVarE.B).getValue()).f6544a), ((h2.b) ((l1.i1) aVarE.D).getValue()).f6544a));
                            }
                            if (f1Var.Q.a().b() || !zB) {
                                long j10 = bVar != null ? bVar.f6544a : jV;
                                f1Var.Q.e().f15782c.d().i(bVar == null ? bi.b.g(jV, kh.n.m0(a0VarE2.p())) : bi.b.g(bVar.f6544a, cVarC2.d()));
                                jE = j10;
                            } else {
                                jE = bVar != null ? bVar.f6544a : cVarC.e();
                            }
                            long jE2 = h2.b.e(jE, jV);
                            k1Var.h(l1Var, Math.round(Float.intBitsToFloat((int) (jE2 >> 32))), Math.round(Float.intBitsToFloat((int) (jE2 & j9))), 0.0f);
                        }
                    } else if (f1Var.Q.a().b()) {
                        k1Var.h(l1Var, 0, 0, 0.0f);
                    } else {
                        z2.a0 a0VarE3 = k1Var.e();
                        long jC = a0VarE3 != null ? f50.k.C(h2.b.e(cVarC.e(), f1Var.C1().V(a0VarE3, 0L))) : 0L;
                        k1Var.h(l1Var, (int) (jC >> 32), (int) (jC & 4294967295L), 0.0f);
                    }
                } else {
                    k1Var.h(l1Var, 0, 0, 0.0f);
                }
                return g00.b0.a;
            default:
                z2.k1 k1Var2 = (z2.k1) obj;
                k1Var2.h(this.B, 0, 0, 0.0f);
                f1 f1Var2 = this.C;
                j1 j1VarE = f1Var2.Q.e();
                k1 k1Var3 = f1Var2.Q;
                ba.v0 v0Var = j1VarE.f15782c;
                v0Var.i();
                if (!kotlin.jvm.internal.m.a(v0Var.d(), c1.f15743a) && k1Var3.h()) {
                    a2 a2VarD2 = v0Var.d();
                    if (k1Var3.a().b() && a2VarD2.b() && (a0VarE = k1Var2.e()) != null) {
                        long jM0 = kh.n.m0(a0VarE.p());
                        u1 u1Var = k1Var3.e().f15781b;
                        z2.a0 a0Var = k1Var3.e().f15781b.F;
                        if (a0Var == null) {
                            throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                        }
                        long jD = u1Var.A.d(a0Var, a0VarE);
                        u1 u1Var2 = k1Var3.e().f15781b;
                        z2.a0 a0Var2 = k1Var3.e().f15781b.F;
                        if (a0Var2 == null) {
                            throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                        }
                        long jO = a0Var2.o(a0VarE, 0L, (6 & 4) != 0);
                        a2 a2VarD3 = v0Var.d();
                        j1 j1Var = (j1) v0Var.f2440d;
                        f1 f1Var3 = (f1) v0Var.f2443g;
                        kotlin.jvm.internal.m.b(f1Var3);
                        ((l1.i1) v0Var.f2441e).setValue(a2VarD3.a(j1Var, f1Var3, jM0, jD, jO));
                    }
                }
                return g00.b0.a;
        }
    }
}

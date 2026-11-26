package g1;

import kotlin.NoWhenBranchMatchedException;

public final class k2 implements u00.n {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;

    public k2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
        this.E = obj4;
        this.F = obj5;
    }

    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        switch (this.A) {
            case 0:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                b3 b3Var = (b3) this.B;
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Long lB = b3Var.b();
                    long j9 = ((h1.w) b3Var.f5732e.getValue()).f6538e;
                    int iA = b3Var.a();
                    boolean zG = g0Var.g(b3Var);
                    Object objN = g0Var.N();
                    l1.c cVar = l1.i.f9868a;
                    if (zG || objN == cVar) {
                        objN = new j2(b3Var, 1);
                        g0Var.n0(objN);
                    }
                    u00.k kVar = (u00.k) objN;
                    boolean zG2 = g0Var.g(b3Var);
                    Object objN2 = g0Var.N();
                    if (zG2 || objN2 == cVar) {
                        objN2 = new j2(b3Var, 2);
                        g0Var.n0(objN2);
                    }
                    a3.k(lB, j9, iA, kVar, (u00.k) objN2, (h1.t) this.C, b3Var.f5728a, (r1) this.D, (d6) b3Var.f5731d.getValue(), (h1) this.E, (g2.t) this.F, jVar, 0);
                } else {
                    g0Var.V();
                }
                break;
            default:
                l1.j jVar2 = (l1.j) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    final l1.z0 z0Var = (l1.z0) this.B;
                    final b8 b8Var = (b8) this.C;
                    final b3.f2 f2Var = (b3.f2) this.D;
                    a7 a7Var = (a7) this.E;
                    final l1.z0 z0Var2 = (l1.z0) this.F;
                    h0.v1 v1VarA = h0.t1.a(h0.i.f6406a, b2.b.J, jVar2, 0);
                    int iT = l1.q.t(jVar2);
                    l1.m1 m1VarM = g0Var2.m();
                    b2.o oVar = b2.o.A;
                    b2.r rVarC = b2.a.c(oVar, jVar2);
                    b3.i.f2042c.getClass();
                    b3.g gVar = b3.h.f2035b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(v1VarA, jVar2, b3.h.f2039f);
                    l1.q.I(m1VarM, jVar2, b3.h.f2038e);
                    b3.f fVar = b3.h.f2040g;
                    if (g0Var2.S || !kotlin.jvm.internal.m.a(g0Var2.N(), Integer.valueOf(iT))) {
                        com.google.android.gms.internal.measurement.x5.v(iT, g0Var2, iT, fVar);
                    }
                    l1.q.I(rVarC, jVar2, b3.h.f2037d);
                    boolean zG3 = g0Var2.g(z0Var) | g0Var2.i(b8Var);
                    Object objN3 = g0Var2.N();
                    l1.c cVar2 = l1.i.f9868a;
                    if (zG3 || objN3 == cVar2) {
                        objN3 = new v7(b8Var, z0Var, 0);
                        g0Var2.n0(objN3);
                    }
                    b2.r rVarD = t2.d.d(oVar, (u00.k) objN3);
                    r3.w wVar = (r3.w) z0Var.getValue();
                    boolean zI = g0Var2.i(b8Var) | g0Var2.g(z0Var) | g0Var2.i(f2Var);
                    Object objN4 = g0Var2.N();
                    if (zI || objN4 == cVar2) {
                        final int i10 = 0;
                        objN4 = new u00.k() {
                            public final Object invoke(Object obj3) {
                                int i11 = i10;
                                g00.b0 b0Var = g00.b0.a;
                                l1.z0 z0Var3 = z0Var;
                                switch (i11) {
                                    case 0:
                                        r3.w wVar2 = (r3.w) obj3;
                                        float f3 = z7.f6046a;
                                        r3.w wVar3 = (r3.w) z0Var3.getValue();
                                        b8 b8Var2 = b8Var;
                                        z7.t(0, b8Var2, wVar2, wVar3, b8Var2.f() ? 23 : 12, f2Var, new d0.o2(z0Var3, 4));
                                        break;
                                    default:
                                        float f10 = z7.f6046a;
                                        z7.t(1, b8Var, (r3.w) obj3, (r3.w) z0Var3.getValue(), 59, f2Var, new d0.o2(z0Var3, 5));
                                        break;
                                }
                                return b0Var;
                            }
                        };
                        g0Var2.n0(objN4);
                    }
                    u00.k kVar2 = (u00.k) objN4;
                    q0.i1 i1Var = new q0.i1(0, 3, 6, 115);
                    boolean zI2 = g0Var2.i(b8Var);
                    Object objN5 = g0Var2.N();
                    if (zI2 || objN5 == cVar2) {
                        final int i11 = 0;
                        objN5 = new u00.k() {
                            public final Object invoke(Object obj3) {
                                switch (i11) {
                                    case 0:
                                        b8Var.d(1);
                                        break;
                                    default:
                                        b8Var.d(1);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        };
                        g0Var2.n0(objN5);
                    }
                    z7.m(rVarD, wVar, kVar2, b8Var, 0, i1Var, new q0.h1(null, (u00.k) objN5, 59), a7Var, jVar2, 24576);
                    z7.e(h0.z1.n(oVar, z7.f6050e, k1.c0.f8577a), jVar2, 6);
                    boolean zG4 = g0Var2.g(z0Var2) | g0Var2.i(b8Var);
                    Object objN6 = g0Var2.N();
                    if (zG4 || objN6 == cVar2) {
                        objN6 = new v7(b8Var, z0Var2, 1);
                        g0Var2.n0(objN6);
                    }
                    b2.r rVarE = t2.d.e(oVar, (u00.k) objN6);
                    r3.w wVar2 = (r3.w) z0Var2.getValue();
                    boolean zI3 = g0Var2.i(b8Var) | g0Var2.g(z0Var2) | g0Var2.i(f2Var);
                    Object objN7 = g0Var2.N();
                    if (zI3 || objN7 == cVar2) {
                        final int i12 = 1;
                        objN7 = new u00.k() {
                            public final Object invoke(Object obj3) {
                                int i13 = i12;
                                g00.b0 b0Var = g00.b0.a;
                                l1.z0 z0Var3 = z0Var2;
                                switch (i13) {
                                    case 0:
                                        r3.w wVar3 = (r3.w) obj3;
                                        float f3 = z7.f6046a;
                                        r3.w wVar4 = (r3.w) z0Var3.getValue();
                                        b8 b8Var2 = b8Var;
                                        z7.t(0, b8Var2, wVar3, wVar4, b8Var2.f() ? 23 : 12, f2Var, new d0.o2(z0Var3, 4));
                                        break;
                                    default:
                                        float f10 = z7.f6046a;
                                        z7.t(1, b8Var, (r3.w) obj3, (r3.w) z0Var3.getValue(), 59, f2Var, new d0.o2(z0Var3, 5));
                                        break;
                                }
                                return b0Var;
                            }
                        };
                        g0Var2.n0(objN7);
                    }
                    u00.k kVar3 = (u00.k) objN7;
                    q0.i1 i1Var2 = new q0.i1(0, 3, 7, 115);
                    boolean zI4 = g0Var2.i(b8Var);
                    Object objN8 = g0Var2.N();
                    if (zI4 || objN8 == cVar2) {
                        final int i13 = 1;
                        objN8 = new u00.k() {
                            public final Object invoke(Object obj3) {
                                switch (i13) {
                                    case 0:
                                        b8Var.d(1);
                                        break;
                                    default:
                                        b8Var.d(1);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        };
                        g0Var2.n0(objN8);
                    }
                    z7.m(rVarE, wVar2, kVar3, b8Var, 1, i1Var2, new q0.h1(null, (u00.k) objN8, 59), a7Var, jVar2, 24576);
                    g0Var2.r(true);
                } else {
                    g0Var2.V();
                }
                break;
        }
        return g00.b0.a;
    }
}

package bt;

import com.google.android.gms.internal.measurement.x5;

public final class o0 implements u00.o {
    public final int A;
    public final a1 B;
    public final gm.a C;
    public final float D;
    public final u00.k E;

    public o0(a1 a1Var, gm.a aVar, float f, u00.k kVar, int i) {
        this.A = i;
        this.B = a1Var;
        this.C = aVar;
        this.D = f;
        this.E = kVar;
    }

    public o0(a1 a1Var, u00.k kVar, float f, gm.a aVar) {
        this.A = 2;
        this.B = a1Var;
        this.E = kVar;
        this.D = f;
        this.C = aVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        boolean zG;
        Object objN;
        boolean zG2;
        Object objN2;
        boolean z;
        switch (this.A) {
            case 0:
                j0.b item = (j0.b) obj;
                l1.g0 g0Var = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item, "$this$item");
                l1.g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    a.f(this.B, this.C, this.D, this.E, g0Var, 0);
                } else {
                    g0Var2.V();
                }
                break;
            case 1:
                j0.b item2 = (j0.b) obj;
                l1.g0 g0Var3 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item2, "$this$item");
                l1.g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    a.c(this.B, this.C, this.D, this.E, h0.c.G(b2.o.A, 0.0f, 16, 0.0f, 0.0f, 13), g0Var3, 24576, 0);
                } else {
                    g0Var4.V();
                }
                break;
            default:
                j0.b item3 = (j0.b) obj;
                l1.j jVar = (l1.j) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item3, "$this$item");
                boolean z2 = (iIntValue3 & 17) != 16;
                l1.g0 g0Var5 = (l1.g0) jVar;
                a30.x xVar = g0Var5.a;
                if (g0Var5.S(iIntValue3 & 1, z2)) {
                    b2.o oVar = b2.o.A;
                    b2.r rVarD = h0.z1.d(oVar, 1.0f);
                    z2.w0 w0VarD = h0.o.d(b2.b.A, false);
                    int iHashCode = Long.hashCode(g0Var5.T);
                    l1.m1 m1VarM = g0Var5.m();
                    b2.r rVarC = b2.a.c(rVarD, jVar);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var5.g0();
                    if (g0Var5.S) {
                        g0Var5.l(gVar);
                    } else {
                        g0Var5.q0();
                    }
                    b3.f fVar = b3.h.f;
                    l1.q.I(w0VarD, jVar, fVar);
                    b3.f fVar2 = b3.h.e;
                    l1.q.I(m1VarM, jVar, fVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b3.f fVar3 = b3.h.g;
                    l1.q.I(numValueOf, jVar, fVar3);
                    b3.e eVar = b3.h.h;
                    l1.q.E(jVar, eVar);
                    b3.f fVar4 = b3.h.d;
                    l1.q.I(rVarC, jVar, fVar4);
                    b2.r rVarF = z.n.f(h0.z1.d(oVar, 1.0f), dl.a.L, i2.b0.b);
                    Object objN3 = g0Var5.N();
                    Object obj5 = l1.i.a;
                    if (objN3 == obj5) {
                        objN3 = new a1.s0(22);
                        g0Var5.n0(objN3);
                    }
                    b2.r rVarD2 = d00.h0.d(rVarF, (u00.k) objN3);
                    float f = 16;
                    h0.v vVarA = h0.u.a(h0.i.g(f), b2.b.M, jVar, 6);
                    int iHashCode2 = Long.hashCode(g0Var5.T);
                    l1.m1 m1VarM2 = g0Var5.m();
                    b2.r rVarC2 = b2.a.c(rVarD2, jVar);
                    g0Var5.g0();
                    if (g0Var5.S) {
                        g0Var5.l(gVar);
                    } else {
                        g0Var5.q0();
                    }
                    l1.q.I(vVarA, jVar, fVar);
                    l1.q.I(m1VarM2, jVar, fVar2);
                    x5.u(iHashCode2, jVar, fVar3, jVar, eVar);
                    l1.q.I(rVarC2, jVar, fVar4);
                    a1 a1Var = this.B;
                    gm.a aVar = this.C;
                    float f2 = this.D;
                    u00.k kVar = this.E;
                    a.f(a1Var, aVar, f2, kVar, jVar, 0);
                    a.c(a1Var, aVar, f2, kVar, null, jVar, 0, 16);
                    l1.j jVar2 = jVar;
                    if (aVar == gm.a.A) {
                        g0Var5.c0(-644394183);
                        a.g(a1Var, f2, null, jVar2, 0, 4);
                        f2 = f2;
                        jVar2 = jVar2;
                        if (a1Var.u || a1Var.n != null) {
                            z = false;
                            g0Var5.c0(-644239152);
                            a.h(a1Var, f2, null, jVar2, 0, 4);
                            f2 = f2;
                            jVar2 = jVar2;
                            g0Var5.r(false);
                        } else {
                            g0Var5.c0(-644117105);
                            z = false;
                            g0Var5.r(false);
                        }
                        ys.a aVar2 = a1Var.o;
                        if (aVar2 == null) {
                            g0Var5.c0(-644040629);
                            g0Var5.r(z);
                        } else {
                            g0Var5.c0(-644040628);
                            a.a(aVar2, a1Var.t, f2, null, jVar2, 0, 8);
                            g0Var5.r(z);
                        }
                        g0Var5.r(z);
                    } else {
                        a1Var = a1Var;
                        g0Var5.c0(-643604241);
                        g0Var5.r(false);
                    }
                    g0Var5.r(true);
                    b2.r rVarB = h0.s.a.b();
                    boolean z3 = a1Var.g;
                    boolean zG3 = g0Var5.g(kVar);
                    Object objN4 = g0Var5.N();
                    if (zG3) {
                        obj4 = obj5;
                    } else {
                        obj4 = obj5;
                        if (objN4 == obj4) {
                        }
                        bi.b.d(0, rVarB, jVar2, (u00.a) objN4, z3);
                        if (a1Var.g) {
                            g0Var5.c0(1389833273);
                            b2.r rVarE = h0.c.E(h0.c.G(oVar, 0.0f, f, 0.0f, f, 5), f2, 0.0f, 2);
                            zG = g0Var5.g(kVar);
                            objN = g0Var5.N();
                            if (zG || objN == obj4) {
                                objN = new as.e0(27, kVar);
                                g0Var5.n0(objN);
                            }
                            u00.a aVar3 = (u00.a) objN;
                            zG2 = g0Var5.g(kVar);
                            objN2 = g0Var5.N();
                            if (zG2 || objN2 == obj4) {
                                objN2 = new as.e0(28, kVar);
                                g0Var5.n0(objN2);
                            }
                            wr.k.b(aVar3, (u00.a) objN2, rVarE, true, jVar2, 3072, 0);
                            g0Var5.r(false);
                        } else {
                            g0Var5.c0(1390366597);
                            g0Var5.r(false);
                        }
                        g0Var5.r(true);
                    }
                    objN4 = new as.e0(25, kVar);
                    g0Var5.n0(objN4);
                    bi.b.d(0, rVarB, jVar2, (u00.a) objN4, z3);
                    if (a1Var.g) {
                        g0Var5.c0(1389833273);
                        b2.r rVarE2 = h0.c.E(h0.c.G(oVar, 0.0f, f, 0.0f, f, 5), f2, 0.0f, 2);
                        zG = g0Var5.g(kVar);
                        objN = g0Var5.N();
                        if (zG) {
                            objN = new as.e0(27, kVar);
                            g0Var5.n0(objN);
                        } else {
                            objN = new as.e0(27, kVar);
                            g0Var5.n0(objN);
                        }
                        u00.a aVar4 = (u00.a) objN;
                        zG2 = g0Var5.g(kVar);
                        objN2 = g0Var5.N();
                        if (zG2) {
                            objN2 = new as.e0(28, kVar);
                            g0Var5.n0(objN2);
                        } else {
                            objN2 = new as.e0(28, kVar);
                            g0Var5.n0(objN2);
                        }
                        wr.k.b(aVar4, (u00.a) objN2, rVarE2, true, jVar2, 3072, 0);
                        g0Var5.r(false);
                    } else {
                        g0Var5.c0(1390366597);
                        g0Var5.r(false);
                    }
                    g0Var5.r(true);
                } else {
                    g0Var5.V();
                }
                break;
        }
        return g00.b0.a;
    }
}

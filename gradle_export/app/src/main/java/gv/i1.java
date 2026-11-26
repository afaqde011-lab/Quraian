package gv;

import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import l1.p2;

public final class i1 implements u00.o {
    public final int A;
    public final bv.o1 B;
    public final u00.k C;
    public final Object D;
    public final long E;

    public i1(bv.o1 o1Var, long j, u00.k kVar, p2 p2Var) {
        this.A = 3;
        this.B = o1Var;
        this.E = j;
        this.C = kVar;
        this.D = p2Var;
    }

    public i1(bv.o1 o1Var, u00.k kVar, kk.c cVar, long j, int i) {
        this.A = i;
        this.B = o1Var;
        this.C = kVar;
        this.D = cVar;
        this.E = j;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                kk.c cVar = (kk.c) this.D;
                h0.t BoxWithConstraints = (h0.t) obj;
                l1.g0 g0Var = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= g0Var.g(BoxWithConstraints) ? 4 : 2;
                }
                boolean z = (iIntValue & 19) != 18;
                l1.g0 g0Var2 = g0Var;
                a30.x xVar = g0Var2.a;
                if (g0Var2.S(iIntValue & 1, z)) {
                    bv.o1 o1Var = this.B;
                    u00.k kVar = this.C;
                    long j = this.E;
                    v1.c cVarD = v1.d.d(1862680620, new d6.b(o1Var, kVar, cVar, j), g0Var);
                    int iA = y3.f.a(BoxWithConstraints.b(), n1.d);
                    b2.o oVar = b2.o.A;
                    if (iA >= 0) {
                        g0Var2.c0(2092067568);
                        h0.a0 a0Var = h0.z1.c;
                        h0.v vVarA = h0.u.a(h0.i.c, b2.b.N, g0Var, 48);
                        int iHashCode = Long.hashCode(g0Var2.T);
                        l1.m1 m1VarM = g0Var2.m();
                        b2.r rVarC = b2.a.c(a0Var, g0Var);
                        b3.i.c.getClass();
                        b3.g gVar = b3.h.b;
                        g0Var2.g0();
                        if (g0Var2.S) {
                            g0Var2.l(gVar);
                        } else {
                            g0Var2.q0();
                        }
                        b3.f fVar = b3.h.f;
                        l1.q.I(vVarA, g0Var, fVar);
                        b3.f fVar2 = b3.h.e;
                        l1.q.I(m1VarM, g0Var, fVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        b3.f fVar3 = b3.h.g;
                        l1.q.I(numValueOf, g0Var, fVar3);
                        b3.e eVar = b3.h.h;
                        l1.q.E(g0Var, eVar);
                        b3.f fVar4 = b3.h.d;
                        l1.q.I(rVarC, g0Var, fVar4);
                        cVarD.invoke(g0Var, 6);
                        b2.r rVarD = h0.z1.d(oVar, 1.0f);
                        if (1.0f <= 0.0d) {
                            i0.a.a("invalid weight; must be greater than zero");
                        }
                        b2.r rVarV = rVarD.V(new h0.c1(1.0f, true));
                        z2.w0 w0VarD = h0.o.d(b2.b.E, false);
                        int iHashCode2 = Long.hashCode(g0Var2.T);
                        l1.m1 m1VarM2 = g0Var2.m();
                        b2.r rVarC2 = b2.a.c(rVarV, g0Var);
                        g0Var2.g0();
                        if (g0Var2.S) {
                            g0Var2.l(gVar);
                        } else {
                            g0Var2.q0();
                        }
                        l1.q.I(w0VarD, g0Var, fVar);
                        l1.q.I(m1VarM2, g0Var, fVar2);
                        x5.u(iHashCode2, g0Var, fVar3, g0Var, eVar);
                        l1.q.I(rVarC2, g0Var, fVar4);
                        iv.k.a(o1Var, kVar, cVar, j, null, 0.0f, false, g0Var, 0, 112);
                        x5.z(g0Var2, true, true, false);
                    } else {
                        g0Var2.c0(2092776383);
                        b2.r rVarA = h0.s.a.a(oVar, b2.b.B);
                        h0.v1 v1VarA = h0.t1.a(h0.i.g(8), b2.b.J, g0Var, 6);
                        int iHashCode3 = Long.hashCode(g0Var2.T);
                        l1.m1 m1VarM3 = g0Var2.m();
                        b2.r rVarC3 = b2.a.c(rVarA, g0Var);
                        b3.i.c.getClass();
                        b3.g gVar2 = b3.h.b;
                        g0Var2.g0();
                        if (g0Var2.S) {
                            g0Var2.l(gVar2);
                        } else {
                            g0Var2.q0();
                        }
                        l1.q.I(v1VarA, g0Var, b3.h.f);
                        l1.q.I(m1VarM3, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode3), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC3, g0Var, b3.h.d);
                        cVarD.invoke(g0Var, 6);
                        iv.k.a(o1Var, kVar, cVar, j, null, 0.0f, false, g0Var, 1572864, 48);
                        g0Var2.r(true);
                        g0Var2.r(false);
                    }
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
            case 1:
                kk.c cVar2 = (kk.c) this.D;
                w.d0 PlayerScreenAnimatedVisibility = (w.d0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(PlayerScreenAnimatedVisibility, "$this$PlayerScreenAnimatedVisibility");
                kv.a.d(this.B, this.C, cVar2, this.E, h0.z1.c, p0.f.a(32), (l1.j) obj2, 24576, 0);
                break;
            case 2:
                kk.c cVar3 = (kk.c) this.D;
                w.d0 PlayerScreenAnimatedVisibility2 = (w.d0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(PlayerScreenAnimatedVisibility2, "$this$PlayerScreenAnimatedVisibility");
                kv.a.d(this.B, this.C, cVar3, this.E, h0.c.G(h0.z1.c, 0.0f, 0.0f, 0.0f, 16, 7), null, (l1.j) obj2, 24576, 32);
                break;
            default:
                p2 p2Var = (p2) this.D;
                h0.w1 ActionGroupContainer = (h0.w1) obj;
                l1.g0 g0Var3 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(ActionGroupContainer, "$this$ActionGroupContainer");
                l1.g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    m2.b bVarR = y3.R(2131231091, g0Var3, 0);
                    bv.o1 o1Var2 = this.B;
                    boolean z2 = o1Var2.k;
                    float f = s.b;
                    float f2 = s.c;
                    u00.k kVar2 = this.C;
                    boolean zG = g0Var4.g(kVar2);
                    Object objN = g0Var4.N();
                    Object obj4 = l1.i.a;
                    if (zG || objN == obj4) {
                        objN = new fy.r(7, kVar2);
                        g0Var4.n0(objN);
                    }
                    p.i(bVarR, this.E, z2, (u00.a) objN, null, false, f, f2, 0L, g0Var3, 14155784, RCHTTPStatusCodes.NOT_MODIFIED);
                    m2.b bVarR2 = y3.R(2131231418, g0Var3, 0);
                    boolean z3 = o1Var2.w;
                    long jB = i2.t.b(((Number) p2Var.getValue()).floatValue(), dl.a.i);
                    boolean zG2 = g0Var4.g(kVar2);
                    Object objN2 = g0Var4.N();
                    if (zG2 || objN2 == obj4) {
                        objN2 = new fy.r(8, kVar2);
                        g0Var4.n0(objN2);
                    }
                    p.i(bVarR2, jB, z3, (u00.a) objN2, null, false, f, f2, 0L, g0Var3, 14155784, RCHTTPStatusCodes.NOT_MODIFIED);
                } else {
                    g0Var4.V();
                }
                return g00.b0.a;
        }
        return g00.b0.a;
    }
}

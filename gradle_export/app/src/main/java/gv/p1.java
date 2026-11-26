package gv;

import com.google.android.gms.internal.measurement.x5;
import l1.p2;

public final class p1 implements u00.o {
    public final int A = 0;
    public final bv.o1 B;
    public final float C;
    public final float D;
    public final h0.t0 E;
    public final u00.k F;
    public final kk.c G;
    public final p2 H;

    public p1(float f, float f2, h0.t0 t0Var, bv.o1 o1Var, u00.k kVar, kk.c cVar, p2 p2Var) {
        this.C = f;
        this.D = f2;
        this.E = t0Var;
        this.B = o1Var;
        this.F = kVar;
        this.G = cVar;
        this.H = p2Var;
    }

    public p1(bv.o1 o1Var, float f, float f2, h0.t0 t0Var, u00.k kVar, kk.c cVar, p2 p2Var) {
        this.B = o1Var;
        this.C = f;
        this.D = f2;
        this.E = t0Var;
        this.F = kVar;
        this.G = cVar;
        this.H = p2Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                l1.g0 g0Var = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= g0Var.h(zBooleanValue) ? 4 : 2;
                }
                boolean z = (iIntValue & 19) != 18;
                l1.g0 g0Var2 = g0Var;
                a30.x xVar = g0Var2.a;
                if (g0Var2.S(iIntValue & 1, z)) {
                    float f = zBooleanValue ? this.C : this.D;
                    h0.a0 a0Var = h0.z1.c;
                    b2.r rVarB = h0.c.B(a0Var, this.E);
                    z2.w0 w0VarD = h0.o.d(b2.b.C, false);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    l1.m1 m1VarM = g0Var2.m();
                    b2.r rVarC = b2.a.c(rVarB, g0Var);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    b3.f fVar = b3.h.f;
                    l1.q.I(w0VarD, g0Var, fVar);
                    b3.f fVar2 = b3.h.e;
                    l1.q.I(m1VarM, g0Var, fVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b3.f fVar3 = b3.h.g;
                    l1.q.I(numValueOf, g0Var, fVar3);
                    b3.e eVar = b3.h.h;
                    l1.q.E(g0Var, eVar);
                    b3.f fVar4 = b3.h.d;
                    l1.q.I(rVarC, g0Var, fVar4);
                    b2.r rVarG = h0.c.G(h0.z1.c(h0.z1.q(b2.o.A, f), 1.0f), zBooleanValue ? 4 : v1.d, 20, 0.0f, 0.0f, 12);
                    z2.w0 w0VarD2 = h0.o.d(b2.b.A, false);
                    int i = iIntValue;
                    int iHashCode2 = Long.hashCode(g0Var2.T);
                    l1.m1 m1VarM2 = g0Var2.m();
                    b2.r rVarC2 = b2.a.c(rVarG, g0Var);
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(w0VarD2, g0Var, fVar);
                    l1.q.I(m1VarM2, g0Var, fVar2);
                    x5.u(iHashCode2, g0Var, fVar3, g0Var, eVar);
                    l1.q.I(rVarC2, g0Var, fVar4);
                    hv.n.a(this.B, this.F, this.G, ((i2.t) this.H.getValue()).a, a0Var, false, zBooleanValue ? 0 : s.a + 12, bool, 0.0f, 0.0f, 0.0f, g0Var, ((i << 21) & 29360128) | 24576, 1824);
                    g0Var2.r(true);
                    g0Var2.r(true);
                } else {
                    g0Var2.V();
                }
                break;
            default:
                w.d0 AnimatedVisibility = (w.d0) obj;
                l1.j jVar = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                bv.o1 o1Var = this.B;
                ta.c0.e(Boolean.valueOf(o1Var.x), h0.z1.c, p.J(), v1.d.d(2114215792, new p1(this.C, this.D, this.E, o1Var, this.F, this.G, this.H), jVar), jVar, 3120);
                break;
        }
        return g00.b0.a;
    }
}

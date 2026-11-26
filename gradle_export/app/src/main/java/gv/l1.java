package gv;

import com.google.android.gms.internal.measurement.x5;
import h0.m2;
import java.util.WeakHashMap;
import l1.p2;

public final class l1 implements u00.o {
    public final int A = 1;
    public final float B;
    public final float C;
    public final bv.o1 D;
    public final u00.k E;
    public final kk.c F;
    public final p2 G;

    public l1(float f, float f2, bv.o1 o1Var, u00.k kVar, kk.c cVar, p2 p2Var) {
        this.B = f;
        this.C = f2;
        this.D = o1Var;
        this.E = kVar;
        this.F = cVar;
        this.G = p2Var;
    }

    public l1(bv.o1 o1Var, float f, float f2, u00.k kVar, kk.c cVar, p2 p2Var) {
        this.D = o1Var;
        this.B = f;
        this.C = f2;
        this.E = kVar;
        this.F = cVar;
        this.G = p2Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        h0.c0 c0VarI;
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        switch (i) {
            case 0:
                w.d0 PlayerScreenAnimatedVisibility = (w.d0) obj;
                l1.j jVar = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(PlayerScreenAnimatedVisibility, "$this$PlayerScreenAnimatedVisibility");
                bv.o1 o1Var = this.D;
                ta.c0.e(Boolean.valueOf(o1Var.x), h0.z1.c, p.J(), v1.d.d(-1827610944, new l1(this.B, this.C, o1Var, this.E, this.F, this.G), jVar), jVar, 3120);
                break;
            default:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                l1.g0 g0Var = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= g0Var.h(zBooleanValue) ? 4 : 2;
                }
                boolean z2 = (iIntValue & 19) != 18;
                l1.g0 g0Var2 = g0Var;
                a30.x xVar = g0Var2.a;
                if (!g0Var2.S(iIntValue & 1, z2)) {
                    g0Var2.V();
                } else {
                    h0.a0 a0Var = h0.z1.c;
                    b2.i iVar = b2.b.A;
                    z2.w0 w0VarD = h0.o.d(iVar, false);
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
                    b2.r rVarC2 = h0.z1.c(h0.z1.q(b2.o.A, zBooleanValue ? this.B : this.C), 1.0f);
                    if (zBooleanValue) {
                        g0Var2.c0(208493769);
                        z = false;
                        g0Var2.r(false);
                        c0VarI = h0.c.i(0, 14);
                    } else {
                        z = false;
                        g0Var2.c0(208494870);
                        WeakHashMap weakHashMap = m2.w;
                        c0VarI = h0.b.e(g0Var).p;
                        g0Var2.r(false);
                    }
                    int i2 = iIntValue;
                    b2.r rVarE = h0.c.E(h0.c.L(rVarC2, c0VarI), 12, 0.0f, 2);
                    z2.w0 w0VarD2 = h0.o.d(iVar, z);
                    int iHashCode2 = Long.hashCode(g0Var2.T);
                    l1.m1 m1VarM2 = g0Var2.m();
                    b2.r rVarC3 = b2.a.c(rVarE, g0Var);
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(w0VarD2, g0Var, fVar);
                    l1.q.I(m1VarM2, g0Var, fVar2);
                    x5.u(iHashCode2, g0Var, fVar3, g0Var, eVar);
                    l1.q.I(rVarC3, g0Var, fVar4);
                    hv.n.a(this.D, this.E, this.F, ((i2.t) this.G.getValue()).a, a0Var, false, 0.0f, bool, 0.0f, zBooleanValue ? 0 : n1.b, zBooleanValue ? 0 : n1.c, g0Var, ((i2 << 21) & 29360128) | 221184, 320);
                    g0Var2.r(true);
                    g0Var2.r(true);
                }
                break;
        }
        return b0Var;
    }
}

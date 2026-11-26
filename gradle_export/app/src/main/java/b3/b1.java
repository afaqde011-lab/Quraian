package b3;

import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

public final class b1 extends kotlin.jvm.internal.n implements u00.a {
    public final int A;
    public final c1 B;

    public b1(c1 c1Var, int i10) {
        super(0);
        this.A = i10;
        this.B = c1Var;
    }

    public final Object invoke() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        z2.k1 placementScope;
        switch (this.A) {
            case 0:
                c1 c1Var = this.B;
                q0 q0Var = c1Var.F;
                q0Var.f2117i = 0;
                m1.e eVarB = q0Var.f2109a.B();
                Object[] objArr = eVarB.A;
                int i10 = eVarB.C;
                for (int i11 = 0; i11 < i10; i11++) {
                    c1 c1Var2 = ((l0) objArr[i11]).f2060h0.f2122p;
                    c1Var2.H = c1Var2.I;
                    c1Var2.I = Integer.MAX_VALUE;
                    c1Var2.T = false;
                    if (c1Var2.L == h0.B) {
                        c1Var2.L = h0.C;
                    }
                }
                l0 l0Var = q0Var.f2109a;
                l0 l0Var2 = q0Var.f2109a;
                m1.e eVarB2 = l0Var.B();
                Object[] objArr2 = eVarB2.A;
                int i12 = eVarB2.C;
                for (int i13 = 0; i13 < i12; i13++) {
                    ((l0) objArr2[i13]).f2060h0.f2122p.X.f2075d = false;
                }
                if (c1Var.g().K) {
                    m1.b bVar = (m1.b) l0Var2.o();
                    int i14 = ((m1.e) bVar.B).C;
                    for (int i15 = 0; i15 < i14; i15++) {
                        ((p1) ((l0) bVar.get(i15)).f2059g0.E).K = true;
                    }
                }
                c1Var.g().Z0().b();
                if (c1Var.g().K) {
                    m1.b bVar2 = (m1.b) l0Var2.o();
                    int i16 = ((m1.e) bVar2.B).C;
                    for (int i17 = 0; i17 < i16; i17++) {
                        ((p1) ((l0) bVar2.get(i17)).f2059g0.E).K = false;
                    }
                }
                m1.e eVarB3 = l0Var2.B();
                Object[] objArr3 = eVarB3.A;
                int i18 = eVarB3.C;
                for (int i19 = 0; i19 < i18; i19++) {
                    l0 l0Var3 = (l0) objArr3[i19];
                    q0 q0Var2 = l0Var3.f2060h0;
                    if (q0Var2.f2122p.H != l0Var3.y()) {
                        l0Var2.Q();
                        l0Var2.E();
                        if (l0Var3.y() == Integer.MAX_VALUE) {
                            if (q0Var2.f2111c || m.s(l0Var3)) {
                                y0 y0Var = q0Var2.f2123q;
                                kotlin.jvm.internal.m.b(y0Var);
                                y0Var.C0(false);
                            }
                            q0Var2.f2122p.E0();
                        }
                    }
                }
                m1.e eVarB4 = l0Var2.B();
                Object[] objArr4 = eVarB4.A;
                int i20 = eVarB4.C;
                for (int i21 = 0; i21 < i20; i21++) {
                    m0 m0Var = ((l0) objArr4[i21]).f2060h0.f2122p.X;
                    m0Var.f2076e = m0Var.f2075d;
                }
                break;
            case 1:
                c1 c1Var3 = this.B;
                c1Var3.F.a().O(c1Var3.f2012b0);
                break;
            default:
                c1 c1Var4 = this.B;
                q0 q0Var3 = c1Var4.F;
                p1 p1Var = q0Var3.a().S;
                if (p1Var == null || (placementScope = p1Var.L) == null) {
                    placementScope = ((c3.z) p0.a(q0Var3.f2109a)).getPlacementScope();
                }
                u00.k kVar = c1Var4.f2017g0;
                l2.b bVar3 = c1Var4.f2018h0;
                if (bVar3 != null) {
                    p1 p1VarA = q0Var3.a();
                    long j9 = c1Var4.f2019i0;
                    float f3 = c1Var4.f2020j0;
                    placementScope.getClass();
                    z2.k1.a(placementScope, p1VarA);
                    p1VarA.q0(y3.j.d(j9, p1VarA.E), f3, bVar3);
                } else if (kVar == null) {
                    p1 p1VarA2 = q0Var3.a();
                    long j10 = c1Var4.f2019i0;
                    float f10 = c1Var4.f2020j0;
                    placementScope.getClass();
                    z2.k1.a(placementScope, p1VarA2);
                    p1VarA2.r0(y3.j.d(j10, p1VarA2.E), f10, null);
                } else {
                    p1 p1VarA3 = q0Var3.a();
                    long j11 = c1Var4.f2019i0;
                    float f11 = c1Var4.f2020j0;
                    placementScope.getClass();
                    z2.k1.a(placementScope, p1VarA3);
                    p1VarA3.r0(y3.j.d(j11, p1VarA3.E), f11, kVar);
                }
                break;
        }
        return g00.b0.a;
    }
}

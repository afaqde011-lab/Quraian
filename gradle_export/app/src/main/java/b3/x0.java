package b3;

public final class x0 extends kotlin.jvm.internal.n implements u00.a {
    public final int A;
    public final y0 B;

    public x0(y0 y0Var, int i10) {
        super(0);
        this.A = i10;
        this.B = y0Var;
    }

    public final Object invoke() {
        v0 v0VarX1;
        switch (this.A) {
            case 0:
                y0 y0Var = this.B;
                q0 q0Var = y0Var.F;
                q0Var.f2116h = 0;
                m1.e eVarB = q0Var.f2109a.B();
                Object[] objArr = eVarB.A;
                int i10 = eVarB.C;
                for (int i11 = 0; i11 < i10; i11++) {
                    y0 y0Var2 = ((l0) objArr[i11]).f2060h0.f2123q;
                    kotlin.jvm.internal.m.b(y0Var2);
                    y0Var2.H = y0Var2.I;
                    y0Var2.I = Integer.MAX_VALUE;
                    if (y0Var2.J == h0.B) {
                        y0Var2.J = h0.C;
                    }
                }
                l0 l0Var = q0Var.f2109a;
                l0 l0Var2 = q0Var.f2109a;
                m1.e eVarB2 = l0Var.B();
                Object[] objArr2 = eVarB2.A;
                int i12 = eVarB2.C;
                for (int i13 = 0; i13 < i12; i13++) {
                    y0 y0Var3 = ((l0) objArr2[i13]).f2060h0.f2123q;
                    kotlin.jvm.internal.m.b(y0Var3);
                    y0Var3.R.f2075d = false;
                }
                t tVar = y0Var.g().f2134v0;
                if (tVar != null) {
                    boolean z10 = tVar.K;
                    m1.b bVar = (m1.b) l0Var2.o();
                    int i14 = ((m1.e) bVar.B).C;
                    for (int i15 = 0; i15 < i14; i15++) {
                        v0 v0VarX2 = ((p1) ((l0) bVar.get(i15)).f2059g0.E).x1();
                        if (v0VarX2 != null) {
                            v0VarX2.K = z10;
                        }
                    }
                }
                t tVar2 = y0Var.g().f2134v0;
                kotlin.jvm.internal.m.b(tVar2);
                tVar2.Z0().b();
                if (y0Var.g().f2134v0 != null) {
                    m1.b bVar2 = (m1.b) l0Var2.o();
                    int i16 = ((m1.e) bVar2.B).C;
                    for (int i17 = 0; i17 < i16; i17++) {
                        v0 v0VarX3 = ((p1) ((l0) bVar2.get(i17)).f2059g0.E).x1();
                        if (v0VarX3 != null) {
                            v0VarX3.K = false;
                        }
                    }
                }
                m1.e eVarB3 = l0Var2.B();
                Object[] objArr3 = eVarB3.A;
                int i18 = eVarB3.C;
                for (int i19 = 0; i19 < i18; i19++) {
                    y0 y0Var4 = ((l0) objArr3[i19]).f2060h0.f2123q;
                    kotlin.jvm.internal.m.b(y0Var4);
                    int i20 = y0Var4.H;
                    int i21 = y0Var4.I;
                    if (i20 != i21 && i21 == Integer.MAX_VALUE) {
                        y0Var4.C0(true);
                    }
                }
                m1.e eVarB4 = l0Var2.B();
                Object[] objArr4 = eVarB4.A;
                int i22 = eVarB4.C;
                for (int i23 = 0; i23 < i22; i23++) {
                    y0 y0Var5 = ((l0) objArr4[i23]).f2060h0.f2123q;
                    kotlin.jvm.internal.m.b(y0Var5);
                    m0 m0Var = y0Var5.R;
                    m0Var.f2076e = m0Var.f2075d;
                }
                break;
            case 1:
                y0 y0Var6 = this.B;
                q0 q0Var2 = y0Var6.F;
                z2.k1 placementScope = null;
                if (m.s(q0Var2.f2109a) || q0Var2.f2111c) {
                    p1 p1Var = q0Var2.a().S;
                    if (p1Var != null) {
                        placementScope = p1Var.L;
                    }
                } else {
                    p1 p1Var2 = q0Var2.a().S;
                    if (p1Var2 != null && (v0VarX1 = p1Var2.x1()) != null) {
                        placementScope = v0VarX1.L;
                    }
                }
                if (placementScope == null) {
                    placementScope = ((c3.z) p0.a(q0Var2.f2109a)).getPlacementScope();
                }
                v0 v0VarX4 = q0Var2.a().x1();
                kotlin.jvm.internal.m.b(v0VarX4);
                z2.k1.j(placementScope, v0VarX4, y0Var6.N);
                break;
            default:
                y0 y0Var7 = this.B;
                v0 v0VarX5 = y0Var7.F.a().x1();
                kotlin.jvm.internal.m.b(v0VarX5);
                v0VarX5.O(y0Var7.Y);
                break;
        }
        return g00.b0.a;
    }
}

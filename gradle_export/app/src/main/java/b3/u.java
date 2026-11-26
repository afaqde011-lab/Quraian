package b3;

import androidx.compose.ui.node.Owner;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

public final class u extends p1 {

    public static final i2.e f2132w0;

    public final l2 f2133u0;

    public t f2134v0;

    static {
        i2.e eVarG = i2.b0.g();
        eVarG.e(i2.t.f7164d);
        eVarG.l(1.0f);
        eVarG.m(1);
        f2132w0 = eVarG;
    }

    public u(l0 l0Var) {
        super(l0Var);
        l2 l2Var = new l2();
        l2Var.D = 0;
        this.f2133u0 = l2Var;
        l2Var.H = this;
        this.f2134v0 = l0Var.I != null ? new t(this) : null;
    }

    @Override
    public final int C0(z2.a aVar) {
        t tVar = this.f2134v0;
        if (tVar != null) {
            return tVar.C0(aVar);
        }
        c1 c1Var = this.O.f2060h0.f2122p;
        m0 m0Var = c1Var.X;
        if (c1Var.F.f2112d == f0.A) {
            m0Var.f2077f = true;
            if (m0Var.f2073b) {
                c1Var.V = true;
                c1Var.W = true;
            }
        } else {
            m0Var.f2078g = true;
        }
        u uVarG = c1Var.g();
        boolean z10 = uVarG.K;
        uVarG.K = true;
        c1Var.a0();
        uVarG.K = z10;
        Integer num = (Integer) m0Var.f2080i.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final int D(int i10) {
        a1.u0 u0VarW = this.O.w();
        z2.w0 w0VarJ = u0VarW.J();
        l0 l0Var = (l0) u0VarW.B;
        return w0VarJ.i((p1) l0Var.f2059g0.E, l0Var.n(), i10);
    }

    @Override
    public final void F1(k1 k1Var, long j9, s sVar, int i10, boolean z10) {
        int i11;
        boolean z11;
        Object[] objArr;
        int i12;
        l0 l0Var;
        long jA;
        l0 l0Var2 = this.O;
        boolean z12 = false;
        if (k1Var.f(l0Var2)) {
            if (!a2(j9)) {
                i11 = i10;
                if (i11 == 1 && (Float.floatToRawIntBits(r1(j9, y1())) & Integer.MAX_VALUE) < 2139095040) {
                    z11 = false;
                }
                if (z12) {
                    int i13 = sVar.C;
                    m1.e eVarA = l0Var2.A();
                    objArr = eVarA.A;
                    i12 = eVarA.C - 1;
                    while (i12 >= 0) {
                        l0Var = (l0) objArr[i12];
                        if (l0Var.K()) {
                            k1Var.e(l0Var, j9, sVar, i11, z11);
                            jA = sVar.a();
                            if (m.l(jA) >= 0.0f && m.q(jA) && !m.p(jA) && !k1Var.b(sVar, l0Var)) {
                                break;
                            }
                        }
                        i12--;
                        i11 = i10;
                    }
                    sVar.C = i13;
                }
            }
            i11 = i10;
            z11 = z10;
            z12 = true;
            if (z12) {
                int i14 = sVar.C;
                m1.e eVarA2 = l0Var2.A();
                objArr = eVarA2.A;
                i12 = eVarA2.C - 1;
                while (i12 >= 0) {
                    l0Var = (l0) objArr[i12];
                    if (l0Var.K()) {
                        k1Var.e(l0Var, j9, sVar, i11, z11);
                        jA = sVar.a();
                        if (m.l(jA) >= 0.0f) {
                            continue;
                        }
                    }
                    i12--;
                    i11 = i10;
                }
                sVar.C = i14;
            }
        }
        i11 = i10;
        z11 = z10;
        if (z12) {
            int i15 = sVar.C;
            m1.e eVarA3 = l0Var2.A();
            objArr = eVarA3.A;
            i12 = eVarA3.C - 1;
            while (i12 >= 0) {
                l0Var = (l0) objArr[i12];
                if (l0Var.K()) {
                    k1Var.e(l0Var, j9, sVar, i11, z11);
                    jA = sVar.a();
                    if (m.l(jA) >= 0.0f) {
                        continue;
                    }
                }
                i12--;
                i11 = i10;
            }
            sVar.C = i15;
        }
    }

    @Override
    public final z2.l1 O(long j9) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        if (this.Q) {
            t tVar = this.f2134v0;
            kotlin.jvm.internal.m.b(tVar);
            j9 = tVar.D;
        }
        x0(j9);
        l0 l0Var = this.O;
        m1.e eVarB = l0Var.B();
        Object[] objArr = eVarB.A;
        int i10 = eVarB.C;
        for (int i11 = 0; i11 < i10; i11++) {
            ((l0) objArr[i11]).f2060h0.f2122p.L = h0.C;
        }
        S1(l0Var.X.j(this, l0Var.n(), j9));
        J1();
        return this;
    }

    @Override
    public final void O1(i2.s sVar, l2.b bVar) {
        l0 l0Var = this.O;
        Owner ownerA = p0.a(l0Var);
        m1.e eVarA = l0Var.A();
        Object[] objArr = eVarA.A;
        int i10 = eVarA.C;
        for (int i11 = 0; i11 < i10; i11++) {
            l0 l0Var2 = (l0) objArr[i11];
            if (l0Var2.K()) {
                l0Var2.j(sVar, bVar);
            }
        }
        if (((c3.z) ownerA).getShowLayoutBounds()) {
            long j9 = this.C;
            sVar.a(0.5f, 0.5f, ((int) (j9 >> 32)) - 0.5f, ((int) (j9 & 4294967295L)) - 0.5f, f2132w0);
        }
    }

    @Override
    public final int d(int i10) {
        a1.u0 u0VarW = this.O.w();
        z2.w0 w0VarJ = u0VarW.J();
        l0 l0Var = (l0) u0VarW.B;
        return w0VarJ.g((p1) l0Var.f2059g0.E, l0Var.n(), i10);
    }

    @Override
    public final int f0(int i10) {
        a1.u0 u0VarW = this.O.w();
        z2.w0 w0VarJ = u0VarW.J();
        l0 l0Var = (l0) u0VarW.B;
        return w0VarJ.b((p1) l0Var.f2059g0.E, l0Var.n(), i10);
    }

    @Override
    public final void q0(long j9, float f3, l2.b bVar) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        u uVar;
        if (this.P) {
            v0 v0VarX1 = x1();
            kotlin.jvm.internal.m.b(v0VarX1);
            uVar = this;
            uVar.P1(v0VarX1.P, f3, null, bVar);
        } else {
            uVar = this;
            uVar.P1(j9, f3, null, bVar);
        }
        if (uVar.J) {
            return;
        }
        uVar.O.f2060h0.f2122p.J0();
    }

    @Override
    public final void r0(long j9, float f3, u00.k kVar) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        if (this.P) {
            v0 v0VarX1 = x1();
            kotlin.jvm.internal.m.b(v0VarX1);
            P1(v0VarX1.P, f3, kVar, null);
        } else {
            P1(j9, f3, kVar, null);
        }
        if (this.J) {
            return;
        }
        this.O.f2060h0.f2122p.J0();
    }

    @Override
    public final int s(int i10) {
        a1.u0 u0VarW = this.O.w();
        z2.w0 w0VarJ = u0VarW.J();
        l0 l0Var = (l0) u0VarW.B;
        return w0VarJ.d((p1) l0Var.f2059g0.E, l0Var.n(), i10);
    }

    @Override
    public final void u1() {
        if (this.f2134v0 == null) {
            this.f2134v0 = new t(this);
        }
    }

    @Override
    public final v0 x1() {
        return this.f2134v0;
    }

    @Override
    public final b2.q z1() {
        return this.f2133u0;
    }
}

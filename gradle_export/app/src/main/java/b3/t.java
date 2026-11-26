package b3;

public final class t extends v0 {
    @Override
    public final int C0(z2.a aVar) {
        y0 y0Var = this.O.O.f2060h0.f2123q;
        kotlin.jvm.internal.m.b(y0Var);
        m0 m0Var = y0Var.R;
        q0 q0Var = y0Var.F;
        if (q0Var.f2112d == f0.B) {
            m0Var.f2077f = true;
            if (m0Var.f2073b) {
                q0Var.f2114f = true;
                q0Var.f2115g = true;
            }
        } else {
            m0Var.f2078g = true;
        }
        t tVar = y0Var.g().f2134v0;
        if (tVar != null) {
            tVar.K = true;
        }
        y0Var.a0();
        t tVar2 = y0Var.g().f2134v0;
        if (tVar2 != null) {
            tVar2.K = false;
        }
        Integer num = (Integer) m0Var.f2080i.get(aVar);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.T.g(iIntValue, aVar);
        return iIntValue;
    }

    @Override
    public final int D(int i10) {
        a1.u0 u0VarW = this.O.O.w();
        z2.w0 w0VarJ = u0VarW.J();
        l0 l0Var = (l0) u0VarW.B;
        return w0VarJ.i((p1) l0Var.f2059g0.E, l0Var.m(), i10);
    }

    @Override
    public final z2.l1 O(long j9) {
        x0(j9);
        p1 p1Var = this.O;
        m1.e eVarB = p1Var.O.B();
        Object[] objArr = eVarB.A;
        int i10 = eVarB.C;
        for (int i11 = 0; i11 < i10; i11++) {
            y0 y0Var = ((l0) objArr[i11]).f2060h0.f2123q;
            kotlin.jvm.internal.m.b(y0Var);
            y0Var.J = h0.C;
        }
        l0 l0Var = p1Var.O;
        v0.o1(this, l0Var.X.j(this, l0Var.m(), j9));
        return this;
    }

    @Override
    public final int d(int i10) {
        a1.u0 u0VarW = this.O.O.w();
        z2.w0 w0VarJ = u0VarW.J();
        l0 l0Var = (l0) u0VarW.B;
        return w0VarJ.g((p1) l0Var.f2059g0.E, l0Var.m(), i10);
    }

    @Override
    public final int f0(int i10) {
        a1.u0 u0VarW = this.O.O.w();
        z2.w0 w0VarJ = u0VarW.J();
        l0 l0Var = (l0) u0VarW.B;
        return w0VarJ.b((p1) l0Var.f2059g0.E, l0Var.m(), i10);
    }

    @Override
    public final void q1() {
        y0 y0Var = this.O.O.f2060h0.f2123q;
        kotlin.jvm.internal.m.b(y0Var);
        y0Var.N0();
    }

    @Override
    public final int s(int i10) {
        a1.u0 u0VarW = this.O.O.w();
        z2.w0 w0VarJ = u0VarW.J();
        l0 l0Var = (l0) u0VarW.B;
        return w0VarJ.d((p1) l0Var.f2059g0.E, l0Var.m(), i10);
    }
}

package d1;

import b2.q;
import b3.e1;
import c3.d2;
import kotlin.Metadata;
import m3.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld1/j;", "Lb3/e1;", "Ld1/m;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends e1 {
    public final String B;
    public final r0 C;
    public final q3.h D;
    public final int E;
    public final boolean F;
    public final int G;
    public final int H;

    public j(String str, r0 r0Var, q3.h hVar, int i10, boolean z10, int i11, int i12) {
        this.B = str;
        this.C = r0Var;
        this.D = hVar;
        this.E = i10;
        this.F = z10;
        this.G = i11;
        this.H = i12;
    }

    @Override
    public final q d() {
        m mVar = new m();
        mVar.O = this.B;
        mVar.P = this.C;
        mVar.Q = this.D;
        mVar.R = this.E;
        mVar.S = this.F;
        mVar.T = this.G;
        mVar.U = this.H;
        return mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.m.a(this.B, jVar.B) && kotlin.jvm.internal.m.a(this.C, jVar.C) && kotlin.jvm.internal.m.a(this.D, jVar.D) && this.E == jVar.E && this.F == jVar.F && this.G == jVar.G && this.H == jVar.H;
    }

    @Override
    public final void h(d2 d2Var) {
    }

    public final int hashCode() {
        return (((w.c.e(w.c.d(this.E, (this.D.hashCode() + a1.b.g(this.C, this.B.hashCode() * 31, 31)) * 31, 31), 31, this.F) + this.G) * 31) + this.H) * 31;
    }

    @Override
    public final void i(q qVar) {
        boolean z10;
        String str;
        String str2;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z12;
        boolean z13;
        q3.h hVar;
        q3.h hVar2;
        int i14;
        int i15;
        m mVar = (m) qVar;
        mVar.getClass();
        r0 r0Var = mVar.P;
        boolean z14 = false;
        boolean z15 = true;
        r0 r0Var2 = this.C;
        if (r0Var2 != r0Var) {
            if (!r0Var2.f10522a.b(r0Var.f10522a)) {
                z10 = true;
            }
            str = mVar.O;
            str2 = this.B;
            if (!kotlin.jvm.internal.m.a(str, str2)) {
                mVar.O = str2;
                mVar.Z = null;
                z14 = true;
            }
            z11 = !mVar.P.d(r0Var2);
            mVar.P = r0Var2;
            i10 = mVar.U;
            i11 = this.H;
            if (i10 != i11) {
                mVar.U = i11;
                z11 = true;
            }
            i12 = mVar.T;
            i13 = this.G;
            if (i12 != i13) {
                mVar.T = i13;
                z11 = true;
            }
            z12 = mVar.S;
            z13 = this.F;
            if (z12 != z13) {
                mVar.S = z13;
                z11 = true;
            }
            hVar = mVar.Q;
            hVar2 = this.D;
            if (!kotlin.jvm.internal.m.a(hVar, hVar2)) {
                mVar.Q = hVar2;
                z11 = true;
            }
            i14 = mVar.R;
            i15 = this.E;
            if (i14 == i15) {
                z15 = z11;
            } else {
                mVar.R = i15;
            }
            if (z10 || z14 || z15) {
                mVar.X = null;
            }
            if (z14 || z15) {
                mVar.B1().f(mVar.O, mVar.P, mVar.Q, mVar.R, mVar.S, mVar.T, mVar.U);
            }
            if (mVar.N) {
                if (z14 || (z10 && mVar.Y != null)) {
                    b3.m.o(mVar);
                }
                if (z14 || z15) {
                    b3.m.n(mVar);
                    b3.m.m(mVar);
                }
                if (z10) {
                    b3.m.m(mVar);
                }
            }
            return;
        }
        r0Var2.getClass();
        z10 = false;
        str = mVar.O;
        str2 = this.B;
        if (!kotlin.jvm.internal.m.a(str, str2)) {
            mVar.O = str2;
            mVar.Z = null;
            z14 = true;
        }
        z11 = !mVar.P.d(r0Var2);
        mVar.P = r0Var2;
        i10 = mVar.U;
        i11 = this.H;
        if (i10 != i11) {
            mVar.U = i11;
            z11 = true;
        }
        i12 = mVar.T;
        i13 = this.G;
        if (i12 != i13) {
            mVar.T = i13;
            z11 = true;
        }
        z12 = mVar.S;
        z13 = this.F;
        if (z12 != z13) {
            mVar.S = z13;
            z11 = true;
        }
        hVar = mVar.Q;
        hVar2 = this.D;
        if (!kotlin.jvm.internal.m.a(hVar, hVar2)) {
            mVar.Q = hVar2;
            z11 = true;
        }
        i14 = mVar.R;
        i15 = this.E;
        if (i14 == i15) {
            z15 = z11;
        } else {
            mVar.R = i15;
        }
        if (z10) {
            mVar.X = null;
        } else {
            mVar.X = null;
        }
        if (z14) {
            mVar.B1().f(mVar.O, mVar.P, mVar.Q, mVar.R, mVar.S, mVar.T, mVar.U);
        } else {
            mVar.B1().f(mVar.O, mVar.P, mVar.Q, mVar.R, mVar.S, mVar.T, mVar.U);
        }
        if (mVar.N) {
            return;
        }
        if (z14) {
            b3.m.o(mVar);
        } else {
            b3.m.o(mVar);
        }
        if (z14) {
            b3.m.n(mVar);
            b3.m.m(mVar);
        } else {
            b3.m.n(mVar);
            b3.m.m(mVar);
        }
        if (z10) {
            b3.m.m(mVar);
        }
    }
}

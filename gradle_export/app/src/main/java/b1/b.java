package b1;

import a1.g1;
import a1.w2;
import a1.x2;
import com.google.protobuf.RuntimeVersion;
import m3.n0;
import m3.q0;

public final class b {

    public final w2 f1923a;

    public final n0 f1924b;

    public final boolean f1925c;

    public final float f1926d;

    public final i f1927e;

    public final z0.b f1928f;

    public final g1 f1929g;

    public long f1930h;

    public x2 f1931i;

    public final String f1932j;

    public b(w2 w2Var, n0 n0Var, boolean z10, float f3, i iVar) {
        this.f1923a = w2Var;
        this.f1924b = n0Var;
        this.f1925c = z10;
        this.f1926d = f3;
        this.f1927e = iVar;
        z1.f fVarF = z1.q.f();
        u00.k kVarE = fVarF != null ? fVarF.e() : null;
        z1.f fVarK = z1.q.k(fVarF);
        try {
            z0.b bVarD = w2Var.d();
            this.f1928f = bVarD;
            this.f1929g = (g1) w2Var.f139e.getValue();
            z1.q.n(fVarF, fVarK, kVarE);
            this.f1930h = bVarD.D;
            this.f1932j = bVarD.C.toString();
        } catch (Throwable th2) {
            z1.q.n(fVarF, fVarK, kVarE);
            throw th2;
        }
    }

    public final void a() {
        if (this.f1932j.length() > 0) {
            z0.b bVar = this.f1928f;
            boolean zD = q0.d(bVar.D);
            w2 w2Var = this.f1923a;
            if (zD) {
                w2.i(this.f1923a, RuntimeVersion.SUFFIX, m3.h0.b((int) (bVar.D >> 32), (int) (this.f1930h & 4294967295L)), !this.f1925c, 4);
            } else {
                w2Var.c();
            }
            this.f1930h = w2Var.d().D;
            this.f1931i = x2.A;
        }
    }

    public final boolean b() {
        n0 n0Var = this.f1924b;
        if (n0Var == null) {
            return true;
        }
        long j9 = this.f1930h;
        int i10 = q0.f10519c;
        return n0Var.i((int) (j9 & 4294967295L)) == x3.j.A;
    }

    public final int c(n0 n0Var, int i10) {
        long j9 = this.f1930h;
        int i11 = q0.f10519c;
        int i12 = (int) (j9 & 4294967295L);
        i iVar = this.f1927e;
        if (Float.isNaN(iVar.f1965b)) {
            iVar.f1965b = n0Var.c(i12).f6546a;
        }
        m3.q qVar = n0Var.f10497b;
        int iD = qVar.d(i12) + i10;
        if (iD < 0) {
            return Integer.MIN_VALUE;
        }
        if (iD >= qVar.f10515f) {
            return Integer.MAX_VALUE;
        }
        float fB = qVar.b(iD) - 1;
        float f3 = iVar.f1965b;
        if ((b() && f3 >= n0Var.g(iD)) || (!b() && f3 <= n0Var.f(iD))) {
            return qVar.c(iD, true);
        }
        return qVar.g((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L));
    }

    public final int d(int i10) {
        long j9 = this.f1928f.D;
        int i11 = q0.f10519c;
        int i12 = (int) (j9 & 4294967295L);
        n0 n0Var = this.f1924b;
        if (n0Var != null) {
            m3.q qVar = n0Var.f10497b;
            float f3 = this.f1926d;
            if (!Float.isNaN(f3)) {
                h2.c cVarI = n0Var.c(i12).i(0.0f, f3 * i10);
                float f10 = cVarI.f6549d;
                float f11 = cVarI.f6547b;
                float fB = qVar.b(qVar.e(f11));
                if (Math.abs(f11 - fB) > Math.abs(f10 - fB)) {
                    return qVar.g(cVarI.e());
                }
                return qVar.g((((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(cVarI.f6546a) << 32));
            }
        }
        return i12;
    }

    public final void e() {
        n0 n0Var = this.f1924b;
        int iC = n0Var != null ? c(n0Var, 1) : Integer.MAX_VALUE;
        if (iC == Integer.MAX_VALUE) {
            this.f1927e.f1965b = Float.NaN;
        }
        String str = this.f1932j;
        if (str.length() > 0) {
            long j9 = this.f1930h;
            int i10 = q0.f10519c;
            int i11 = (int) (j9 & 4294967295L);
            int length = str.length();
            if (iC > length) {
                iC = length;
            }
            long jO = kh.o.o(iC, i11, this.f1923a);
            int i12 = (int) (jO >> 32);
            x2 x2VarR = k00.f.r(jO);
            if (i12 != i11 || !q0.d(this.f1930h)) {
                this.f1930h = m3.h0.b(i12, i12);
            }
            if (x2VarR != null) {
                this.f1931i = x2VarR;
            }
        }
    }

    public final void f() {
        if (this.f1932j.length() > 0) {
            long j9 = this.f1930h;
            int i10 = q0.f10519c;
            int i11 = (int) (j9 & 4294967295L);
            long jO = kh.o.o(d(1), i11, this.f1923a);
            int i12 = (int) (jO >> 32);
            x2 x2VarR = k00.f.r(jO);
            if (i12 != i11 || !q0.d(this.f1930h)) {
                this.f1930h = m3.h0.b(i12, i12);
            }
            if (x2VarR != null) {
                this.f1931i = x2VarR;
            }
        }
    }

    public final void g() {
        this.f1927e.f1965b = Float.NaN;
        String str = this.f1932j;
        if (str.length() > 0) {
            long j9 = this.f1930h;
            int i10 = q0.f10519c;
            int i11 = (int) (j9 & 4294967295L);
            long jO = kh.o.o(q0.q.t(i11, str), i11, this.f1923a);
            int i12 = (int) (jO >> 32);
            x2 x2VarR = k00.f.r(jO);
            if (i12 != i11 || !q0.d(this.f1930h)) {
                this.f1930h = m3.h0.b(i12, i12);
            }
            if (x2VarR != null) {
                this.f1931i = x2VarR;
            }
        }
    }

    public final void h() {
        this.f1927e.f1965b = Float.NaN;
        String str = this.f1932j;
        if (str.length() > 0) {
            long j9 = this.f1930h;
            int i10 = (int) (4294967295L & j9);
            int iU = q0.q.u(str, q0.f(j9));
            if (iU == q0.f(this.f1930h) && iU != str.length()) {
                iU = q0.q.u(str, iU + 1);
            }
            long jO = kh.o.o(iU, i10, this.f1923a);
            int i11 = (int) (jO >> 32);
            x2 x2VarR = k00.f.r(jO);
            if (i11 != i10 || !q0.d(this.f1930h)) {
                this.f1930h = m3.h0.b(i11, i11);
            }
            if (x2VarR != null) {
                this.f1931i = x2VarR;
            }
        }
    }

    public final void i() {
        int length;
        this.f1927e.f1965b = Float.NaN;
        String str = this.f1932j;
        if (str.length() > 0) {
            long j9 = this.f1930h;
            int i10 = q0.f10519c;
            int i11 = (int) (j9 & 4294967295L);
            n0 n0Var = this.f1924b;
            if (n0Var != null) {
                int i12 = i11;
                while (true) {
                    z0.b bVar = this.f1928f;
                    if (i12 < bVar.C.length()) {
                        int length2 = str.length() - 1;
                        if (i12 <= length2) {
                            length2 = i12;
                        }
                        long jK = n0Var.k(length2);
                        int i13 = q0.f10519c;
                        int i14 = (int) (jK & 4294967295L);
                        if (i14 > i12) {
                            length = i14;
                            break;
                        }
                        i12++;
                    } else {
                        length = bVar.C.length();
                        break;
                    }
                }
            } else {
                length = str.length();
            }
            long jO = kh.o.o(length, i11, this.f1923a);
            int i15 = (int) (jO >> 32);
            x2 x2VarR = k00.f.r(jO);
            if (i15 != i11 || !q0.d(this.f1930h)) {
                this.f1930h = m3.h0.b(i15, i15);
            }
            if (x2VarR != null) {
                this.f1931i = x2VarR;
            }
        }
    }

    public final void j() {
        this.f1927e.f1965b = Float.NaN;
        String str = this.f1932j;
        if (str.length() > 0) {
            long j9 = this.f1930h;
            int i10 = q0.f10519c;
            int i11 = (int) (j9 & 4294967295L);
            long jO = kh.o.o(q0.q.w(i11, str), i11, this.f1923a);
            int i12 = (int) (jO >> 32);
            x2 x2VarR = k00.f.r(jO);
            if (i12 != i11 || !q0.d(this.f1930h)) {
                this.f1930h = m3.h0.b(i12, i12);
            }
            if (x2VarR != null) {
                this.f1931i = x2VarR;
            }
        }
    }

    public final void k() {
        this.f1927e.f1965b = Float.NaN;
        String str = this.f1932j;
        if (str.length() > 0) {
            long j9 = this.f1930h;
            int i10 = (int) (4294967295L & j9);
            int iV = q0.q.v(str, q0.g(j9));
            if (iV == q0.g(this.f1930h) && iV != 0) {
                iV = q0.q.v(str, iV - 1);
            }
            long jO = kh.o.o(iV, i10, this.f1923a);
            int i11 = (int) (jO >> 32);
            x2 x2VarR = k00.f.r(jO);
            if (i11 != i10 || !q0.d(this.f1930h)) {
                this.f1930h = m3.h0.b(i11, i11);
            }
            if (x2VarR != null) {
                this.f1931i = x2VarR;
            }
        }
    }

    public final void l() {
        this.f1927e.f1965b = Float.NaN;
        String str = this.f1932j;
        if (str.length() > 0) {
            long j9 = this.f1930h;
            int i10 = q0.f10519c;
            int i11 = (int) (j9 & 4294967295L);
            int i12 = 0;
            n0 n0Var = this.f1924b;
            if (n0Var != null) {
                for (int i13 = i11; i13 > 0; i13--) {
                    int length = str.length() - 1;
                    if (i13 <= length) {
                        length = i13;
                    }
                    long jK = n0Var.k(length);
                    int i14 = q0.f10519c;
                    int i15 = (int) (jK >> 32);
                    if (i15 < i13) {
                        i12 = i15;
                        break;
                    }
                }
            }
            long jO = kh.o.o(i12, i11, this.f1923a);
            int i16 = (int) (jO >> 32);
            x2 x2VarR = k00.f.r(jO);
            if (i16 != i11 || !q0.d(this.f1930h)) {
                this.f1930h = m3.h0.b(i16, i16);
            }
            if (x2VarR != null) {
                this.f1931i = x2VarR;
            }
        }
    }

    public final void m() {
        this.f1927e.f1965b = Float.NaN;
        String str = this.f1932j;
        if (str.length() > 0) {
            long j9 = this.f1930h;
            int i10 = q0.f10519c;
            int i11 = (int) (j9 & 4294967295L);
            long jO = kh.o.o(str.length(), i11, this.f1923a);
            int i12 = (int) (jO >> 32);
            x2 x2VarR = k00.f.r(jO);
            if (i12 != i11 || !q0.d(this.f1930h)) {
                this.f1930h = m3.h0.b(i12, i12);
            }
            if (x2VarR != null) {
                this.f1931i = x2VarR;
            }
        }
    }

    public final void n() {
        this.f1927e.f1965b = Float.NaN;
        if (this.f1932j.length() > 0) {
            long j9 = this.f1930h;
            int i10 = q0.f10519c;
            int i11 = (int) (j9 & 4294967295L);
            long jO = kh.o.o(0, i11, this.f1923a);
            int i12 = (int) (jO >> 32);
            x2 x2VarR = k00.f.r(jO);
            if (i12 != i11 || !q0.d(this.f1930h)) {
                this.f1930h = m3.h0.b(i12, i12);
            }
            if (x2VarR != null) {
                this.f1931i = x2VarR;
            }
        }
    }

    public final void o() {
        int length;
        this.f1927e.f1965b = Float.NaN;
        String str = this.f1932j;
        if (str.length() > 0) {
            long j9 = this.f1930h;
            int i10 = q0.f10519c;
            int i11 = (int) (4294967295L & j9);
            n0 n0Var = this.f1924b;
            if (n0Var != null) {
                m3.q qVar = n0Var.f10497b;
                length = qVar.c(qVar.d(q0.f(j9)), true);
            } else {
                length = str.length();
            }
            long jO = kh.o.o(length, i11, this.f1923a);
            int i12 = (int) (jO >> 32);
            x2 x2VarR = k00.f.r(jO);
            if (i12 != i11 || !q0.d(this.f1930h)) {
                this.f1930h = m3.h0.b(i12, i12);
            }
            if (x2VarR != null) {
                this.f1931i = x2VarR;
            }
        }
    }

    public final void p() {
        int iH;
        this.f1927e.f1965b = Float.NaN;
        if (this.f1932j.length() > 0) {
            long j9 = this.f1930h;
            int i10 = q0.f10519c;
            int i11 = (int) (4294967295L & j9);
            n0 n0Var = this.f1924b;
            if (n0Var != null) {
                iH = n0Var.h(n0Var.f10497b.d(q0.g(j9)));
            } else {
                iH = 0;
            }
            long jO = kh.o.o(iH, i11, this.f1923a);
            int i12 = (int) (jO >> 32);
            x2 x2VarR = k00.f.r(jO);
            if (i12 != i11 || !q0.d(this.f1930h)) {
                this.f1930h = m3.h0.b(i12, i12);
            }
            if (x2VarR != null) {
                this.f1931i = x2VarR;
            }
        }
    }

    public final void q() {
        n0 n0Var = this.f1924b;
        int iC = n0Var != null ? c(n0Var, -1) : Integer.MIN_VALUE;
        if (iC == Integer.MIN_VALUE) {
            this.f1927e.f1965b = Float.NaN;
        }
        if (this.f1932j.length() > 0) {
            long j9 = this.f1930h;
            int i10 = q0.f10519c;
            int i11 = (int) (j9 & 4294967295L);
            if (iC < 0) {
                iC = 0;
            }
            long jO = kh.o.o(iC, i11, this.f1923a);
            int i12 = (int) (jO >> 32);
            x2 x2VarR = k00.f.r(jO);
            if (i12 != i11 || !q0.d(this.f1930h)) {
                this.f1930h = m3.h0.b(i12, i12);
            }
            if (x2VarR != null) {
                this.f1931i = x2VarR;
            }
        }
    }

    public final void r() {
        if (this.f1932j.length() > 0) {
            long j9 = this.f1930h;
            int i10 = q0.f10519c;
            int i11 = (int) (j9 & 4294967295L);
            long jO = kh.o.o(d(-1), i11, this.f1923a);
            int i12 = (int) (jO >> 32);
            x2 x2VarR = k00.f.r(jO);
            if (i12 != i11 || !q0.d(this.f1930h)) {
                this.f1930h = m3.h0.b(i12, i12);
            }
            if (x2VarR != null) {
                this.f1931i = x2VarR;
            }
        }
    }

    public final void s() {
        if (this.f1932j.length() > 0) {
            long j9 = this.f1928f.D;
            int i10 = q0.f10519c;
            this.f1930h = m3.h0.b((int) (j9 >> 32), (int) (this.f1930h & 4294967295L));
        }
    }
}

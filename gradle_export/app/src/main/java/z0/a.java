package z0;

import a1.c1;
import a1.d1;
import a1.q;
import a1.u0;
import ab.a0;
import g00.k;
import java.util.List;
import m3.h0;
import m3.q0;

public final class a implements Appendable {
    public final c1 A;
    public final d1 B;
    public u0 C;
    public long D;
    public q0 E;
    public m1.e F;
    public k G;

    public a(b bVar, u0 u0Var, c1 c1Var, int i10) {
        m1.e eVar = null;
        u0Var = (i10 & 2) != 0 ? null : u0Var;
        this.A = (i10 & 8) != 0 ? null : c1Var;
        d1 d1Var = new d1();
        d1Var.A = bVar;
        d1Var.C = -1;
        d1Var.D = -1;
        this.B = d1Var;
        this.C = u0Var != null ? new u0(u0Var) : null;
        long j9 = bVar.D;
        List list = bVar.A;
        this.D = j9;
        this.E = bVar.E;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            m3.f[] fVarArr = new m3.f[size];
            for (int i11 = 0; i11 < size; i11++) {
                fVarArr[i11] = (m3.f) list.get(i11);
            }
            eVar = new m1.e(size, fVarArr);
        }
        this.F = eVar;
    }

    public static b g(a aVar, long j9, q0 q0Var, int i10) {
        List list;
        if ((i10 & 1) != 0) {
            j9 = aVar.D;
        }
        long j10 = j9;
        if ((i10 & 2) != 0) {
            q0Var = aVar.E;
        }
        q0 q0Var2 = q0Var;
        m1.e eVar = aVar.F;
        if (eVar != null) {
            List listF = eVar.f();
            if (((m1.b) listF).isEmpty()) {
                list = null;
            } else {
                list = listF;
            }
        } else {
            list = null;
        }
        return new b(aVar.B.toString(), j10, q0Var2, null, list, null, 8);
    }

    public final u0 a() {
        u0 u0Var = this.C;
        if (u0Var != null) {
            return u0Var;
        }
        u0 u0Var2 = new u0((u0) null);
        this.C = u0Var2;
        return u0Var2;
    }

    @Override
    public final Appendable append(char c10) {
        d1 d1Var = this.B;
        b(d1Var.length(), d1Var.length(), 1);
        int length = d1Var.length();
        int length2 = d1Var.length();
        String strValueOf = String.valueOf(c10);
        d1Var.a(length, length2, strValueOf, 0, strValueOf.length());
        return this;
    }

    @Override
    public final Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            d1 d1Var = this.B;
            b(d1Var.length(), d1Var.length(), charSequence.length());
            d1Var.a(d1Var.length(), d1Var.length(), charSequence, 0, charSequence.length());
        }
        return this;
    }

    @Override
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        if (charSequence != null) {
            d1 d1Var = this.B;
            b(d1Var.length(), d1Var.length(), i11 - i10);
            int length = d1Var.length();
            int length2 = d1Var.length();
            CharSequence charSequenceSubSequence = charSequence.subSequence(i10, i11);
            d1Var.a(length, length2, charSequenceSubSequence, 0, charSequenceSubSequence.length());
        }
        return this;
    }

    public final void b(int i10, int i11, int i12) {
        int i13;
        u0 u0VarA = a();
        if (i10 != i11 || i12 != 0) {
            int iMin = Math.min(i10, i11);
            int iMax = Math.max(i10, i11);
            int i14 = i12 - (iMax - iMin);
            int i15 = 0;
            q qVar = null;
            boolean z10 = false;
            while (true) {
                m1.e eVar = (m1.e) u0VarA.B;
                if (i15 >= eVar.C) {
                    break;
                }
                q qVar2 = (q) eVar.A[i15];
                int i16 = qVar2.f112a;
                if ((iMin > i16 || i16 > iMax) && ((iMin > (i13 = qVar2.f113b) || i13 > iMax) && ((iMin > i13 || i16 > iMin) && (iMax > i13 || i16 > iMax)))) {
                    if (i16 > iMax && !z10) {
                        u0VarA.s(qVar, iMin, iMax, i14);
                        z10 = true;
                    }
                    if (z10) {
                        qVar2.f112a += i14;
                        qVar2.f113b += i14;
                    }
                    ((m1.e) u0VarA.C).b(qVar2);
                } else if (qVar == null) {
                    qVar = qVar2;
                } else {
                    qVar.f113b = qVar2.f113b;
                    qVar.f115d = qVar2.f115d;
                }
                i15++;
            }
            if (!z10) {
                u0VarA.s(qVar, iMin, iMax, i14);
            }
            m1.e eVar2 = (m1.e) u0VarA.B;
            u0VarA.B = (m1.e) u0VarA.C;
            u0VarA.C = eVar2;
            eVar2.g();
        }
        c1 c1Var = this.A;
        if (c1Var != null) {
            c1Var.i(i10, i11, i12);
        }
        this.D = h.b(i10, i11, i12, this.D);
    }

    public final void c(int i10, int i11, CharSequence charSequence) {
        int length = charSequence.length();
        if (i10 > i11) {
            g0.a.a("Expected start=" + i10 + " <= end=" + i11);
        }
        if (length < 0) {
            g0.a.a("Expected textStart=0 <= textEnd=" + length);
        }
        d1 d1Var = this.B;
        int iY = a0.y(i10, 0, d1Var.length());
        int iY2 = a0.y(i11, 0, d1Var.length());
        int iY3 = a0.y(0, 0, charSequence.length());
        int iY4 = a0.y(length, 0, charSequence.length());
        b(iY, iY2, iY4 - iY3);
        this.B.a(iY, iY2, charSequence, iY3, iY4);
        e(null);
        this.G = null;
    }

    public final void d(int i10, int i11, List list) {
        d1 d1Var = this.B;
        if (i10 < 0 || i10 > d1Var.length()) {
            StringBuilder sbQ = oi.k.q("start (", i10, ") offset is outside of text region ");
            sbQ.append(d1Var.length());
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        if (i11 < 0 || i11 > d1Var.length()) {
            StringBuilder sbQ2 = oi.k.q("end (", i11, ") offset is outside of text region ");
            sbQ2.append(d1Var.length());
            throw new IndexOutOfBoundsException(sbQ2.toString());
        }
        if (i10 >= i11) {
            throw new IllegalArgumentException(w.c.h(i10, i11, "Do not set reversed or empty range: ", " > "));
        }
        e(new q0(h0.b(i10, i11)));
        m1.e eVar = this.F;
        if (eVar != null) {
            eVar.g();
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        if (this.F == null) {
            this.F = new m1.e(0, new m3.f[16]);
        }
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            m3.f fVar = (m3.f) list.get(i12);
            m1.e eVar2 = this.F;
            if (eVar2 != null) {
                eVar2.b(m3.f.a(fVar, null, fVar.f10424b + i10, fVar.f10425c + i10, 9));
            }
        }
    }

    public final void e(q0 q0Var) {
        if (q0Var != null && !q0.d(q0Var.f10520a)) {
            this.E = q0Var;
            return;
        }
        this.E = null;
        m1.e eVar = this.F;
        if (eVar != null) {
            eVar.g();
        }
    }

    public final void f(long j9) {
        long jB = h0.b(0, this.B.length());
        if (!q0.a(jB, j9)) {
            g0.a.a("Expected " + ((Object) q0.i(j9)) + " to be in " + ((Object) q0.i(jB)));
        }
        this.D = j9;
        this.G = null;
    }

    public final String toString() {
        return this.B.toString();
    }
}

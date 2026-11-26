package b1;

import a1.o1;
import a1.s2;
import a1.w2;
import m3.n0;
import m3.q0;
import q0.r1;
import q0.y0;

public final class r implements r1 {

    public final o1 f1966a;

    public int f1967b = -1;

    public long f1968c = 9205357640488583168L;

    public long f1969d = 0;

    public y0 f1970e = y0.C;

    public boolean f1971f = true;

    public du.w f1972g = e1.v.f5009d;

    public final e0 f1973h;

    public r(e0 e0Var, o1 o1Var) {
        this.f1973h = e0Var;
        this.f1966a = o1Var;
    }

    @Override
    public final void a() {
        f();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d(long j9, du.w wVar) {
        e0 e0Var = this.f1973h;
        boolean z10 = e0Var.f1949j;
        w2 w2Var = e0Var.f1940a;
        s2 s2Var = e0Var.f1941b;
        if (z10) {
            e0Var.A(this.f1970e, j9);
            e0Var.w(false);
            e0Var.f1955r.setValue(p.B);
            this.f1968c = j9;
            this.f1969d = 0L;
            e0Var.f1960w = -1;
            this.f1971f = true;
            this.f1972g = wVar;
            if (s2Var.c() == null) {
                return;
            }
            if (s2Var.f(j9)) {
                if (w2Var.d().C.length() == 0) {
                    return;
                }
                int iD = s2Var.d(true, j9);
                long jB = e0Var.B(new z0.b(e0Var.f1940a.d(), q0.f10518b, null, null, null, null, 60), iD, iD, false, this.f1972g, false, false, new q2.b(0));
                w2Var.j(jB);
                e0Var.x(k0.C);
                this.f1967b = (int) (jB >> 32);
                return;
            }
            int iD2 = s2Var.d(true, j9);
            q2.a aVar = e0Var.f1950k;
            if (aVar != null) {
                ((q2.c) aVar).a(0);
            }
            w2Var.getClass();
            w2Var.j(m3.h0.b(iD2, iD2));
            e0Var.w(true);
            this.f1971f = false;
            e0Var.x(k0.B);
        }
    }

    @Override
    public final void e(long j9) {
        int iIntValue;
        int iD;
        du.w wVar;
        m3.h hVar;
        y0 y0Var;
        e0 e0Var = this.f1973h;
        boolean z10 = e0Var.f1949j;
        w2 w2Var = e0Var.f1940a;
        s2 s2Var = e0Var.f1941b;
        if (!z10 || s2Var.c() == null || w2Var.d().C.length() == 0) {
            return;
        }
        long jF = h2.b.f(this.f1969d, j9);
        this.f1969d = jF;
        long jF2 = h2.b.f(this.f1968c, jF);
        if (this.f1967b >= 0 || s2Var.f(jF2)) {
            n0 n0VarC = s2Var.c();
            int length = (n0VarC == null || (hVar = n0VarC.f10496a.f10483a) == null) ? 0 : hVar.B.length();
            int i10 = this.f1967b;
            Integer numValueOf = Integer.valueOf(i10);
            if (i10 < 0 || i10 > length) {
                numValueOf = null;
            }
            iIntValue = numValueOf != null ? numValueOf.intValue() : s2Var.d(false, this.f1968c);
            iD = s2Var.d(false, jF2);
            if (this.f1967b < 0 && iIntValue == iD) {
                return;
            }
            wVar = this.f1972g;
            e0Var.x(k0.C);
        } else {
            iIntValue = s2Var.d(true, this.f1968c);
            iD = s2Var.d(true, jF2);
            wVar = iIntValue == iD ? e1.v.f5009d : this.f1972g;
        }
        du.w wVar2 = wVar;
        int i11 = iIntValue;
        int i12 = iD;
        long j10 = w2Var.d().D;
        long jB = e0Var.B(e0Var.f1940a.d(), i11, i12, false, wVar2, false, false, new q2.b(9));
        if (this.f1967b == -1 && !q0.d(jB)) {
            this.f1967b = (int) (jB >> 32);
        }
        if (q0.h(jB)) {
            jB = m3.h0.b((int) (jB & 4294967295L), (int) (jB >> 32));
        }
        if (!q0.c(jB, j10)) {
            int i13 = (int) (jB >> 32);
            int i14 = (int) (j10 >> 32);
            if (i13 == i14 || ((int) (jB & 4294967295L)) != ((int) (j10 & 4294967295L))) {
                y0Var = ((i13 != i14 || ((int) (jB & 4294967295L)) == ((int) (j10 & 4294967295L))) && ((float) (i13 + ((int) (jB & 4294967295L)))) / 2.0f <= ((float) (i14 + ((int) (j10 & 4294967295L)))) / 2.0f) ? y0.B : y0.C;
            } else {
                y0Var = y0.B;
            }
            this.f1970e = y0Var;
            this.f1971f = false;
        }
        if (q0.d(j10) || !q0.d(jB)) {
            w2Var.j(jB);
        }
        e0Var.A(this.f1970e, jF2);
    }

    public final void f() {
        if ((this.f1968c & 9223372034707292159L) != 9205357640488583168L) {
            e0 e0Var = this.f1973h;
            e0Var.d();
            this.f1967b = -1;
            this.f1968c = 9205357640488583168L;
            this.f1969d = 0L;
            e0Var.f1960w = -1;
            this.f1972g = e1.v.f5009d;
            e0Var.f1955r.setValue(p.A);
            this.f1966a.invoke();
            if (this.f1971f) {
                e0Var.r();
            }
        }
    }

    @Override
    public final void onCancel() {
        f();
    }
}

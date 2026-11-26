package e1;

import com.google.protobuf.RuntimeVersion;
import java.util.List;
import q0.e2;

public final class n0 {

    public final m3.h f4975a;

    public final long f4976b;

    public final m3.n0 f4977c;

    public final r3.p f4978d;

    public final z0 f4979e;

    public long f4980f;

    public final m3.h f4981g;

    public final r3.w f4982h;

    public final e2 f4983i;

    public n0(r3.w wVar, r3.p pVar, e2 e2Var, z0 z0Var) {
        m3.h hVar = wVar.f13099a;
        long j9 = wVar.f13100b;
        m3.n0 n0Var = e2Var != null ? e2Var.f12608a : null;
        this.f4975a = hVar;
        this.f4976b = j9;
        this.f4977c = n0Var;
        this.f4978d = pVar;
        this.f4979e = z0Var;
        this.f4980f = j9;
        this.f4981g = hVar;
        this.f4982h = wVar;
        this.f4983i = e2Var;
    }

    public final List a(u00.k kVar) {
        if (!m3.q0.d(this.f4980f)) {
            return va.a.S(new r3.a(RuntimeVersion.SUFFIX, 0), new r3.v(m3.q0.g(this.f4980f), m3.q0.g(this.f4980f)));
        }
        r3.g gVar = (r3.g) kVar.invoke(this);
        if (gVar != null) {
            return va.a.R(gVar);
        }
        return null;
    }

    public final Integer b() {
        m3.n0 n0Var = this.f4977c;
        if (n0Var == null) {
            return null;
        }
        m3.q qVar = n0Var.f10497b;
        int iF = m3.q0.f(this.f4980f);
        r3.p pVar = this.f4978d;
        return Integer.valueOf(pVar.k(qVar.c(qVar.d(pVar.z(iF)), true)));
    }

    public final Integer c() {
        m3.n0 n0Var = this.f4977c;
        if (n0Var == null) {
            return null;
        }
        int iG = m3.q0.g(this.f4980f);
        r3.p pVar = this.f4978d;
        return Integer.valueOf(pVar.k(n0Var.h(n0Var.f10497b.d(pVar.z(iG)))));
    }

    public final Integer d() {
        int length;
        m3.n0 n0Var = this.f4977c;
        if (n0Var == null) {
            return null;
        }
        int iR = r();
        while (true) {
            m3.h hVar = this.f4975a;
            if (iR < hVar.B.length()) {
                int length2 = this.f4981g.B.length() - 1;
                if (iR <= length2) {
                    length2 = iR;
                }
                long jK = n0Var.k(length2);
                int i10 = m3.q0.f10519c;
                int i11 = (int) (jK & 4294967295L);
                if (i11 > iR) {
                    length = this.f4978d.k(i11);
                    break;
                }
                iR++;
            } else {
                length = hVar.B.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int iK;
        m3.n0 n0Var = this.f4977c;
        if (n0Var == null) {
            return null;
        }
        for (int iR = r(); iR > 0; iR--) {
            int length = this.f4981g.B.length() - 1;
            if (iR <= length) {
                length = iR;
            }
            long jK = n0Var.k(length);
            int i10 = m3.q0.f10519c;
            int i11 = (int) (jK >> 32);
            if (i11 < iR) {
                iK = this.f4978d.k(i11);
                return Integer.valueOf(iK);
            }
        }
        iK = 0;
        return Integer.valueOf(iK);
    }

    public final boolean f() {
        m3.n0 n0Var = this.f4977c;
        return (n0Var != null ? n0Var.i(r()) : null) != x3.j.B;
    }

    public final int g(m3.n0 n0Var, int i10) {
        int iR = r();
        z0 z0Var = this.f4979e;
        if (z0Var.f5042a == null) {
            z0Var.f5042a = Float.valueOf(n0Var.c(iR).f6546a);
        }
        m3.q qVar = n0Var.f10497b;
        int iD = qVar.d(iR) + i10;
        if (iD < 0) {
            return 0;
        }
        if (iD >= qVar.f10515f) {
            return this.f4981g.B.length();
        }
        float fB = qVar.b(iD) - 1;
        Float f3 = z0Var.f5042a;
        kotlin.jvm.internal.m.b(f3);
        float fFloatValue = f3.floatValue();
        if ((f() && fFloatValue >= n0Var.g(iD)) || (!f() && fFloatValue <= n0Var.f(iD))) {
            return qVar.c(iD, true);
        }
        return this.f4978d.k(qVar.g((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f3.floatValue()) << 32)));
    }

    public final int h(e2 e2Var, int i10) {
        h2.c cVarF;
        z2.a0 a0Var = e2Var.f12609b;
        m3.n0 n0Var = e2Var.f12608a;
        if (a0Var == null) {
            cVarF = h2.c.f6545e;
        } else {
            z2.a0 a0Var2 = e2Var.f12610c;
            cVarF = a0Var2 != null ? a0Var2.F(a0Var, true) : null;
            if (cVarF == null) {
                cVarF = h2.c.f6545e;
            }
        }
        long j9 = this.f4982h.f13100b;
        int i11 = m3.q0.f10519c;
        r3.p pVar = this.f4978d;
        h2.c cVarC = n0Var.c(pVar.z((int) (j9 & 4294967295L)));
        float f3 = cVarC.f6546a;
        return pVar.k(n0Var.f10497b.g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (cVarF.d() & 4294967295L)) * i10) + cVarC.f6547b)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32)));
    }

    public final void i() {
        z0 z0Var = this.f4979e;
        z0Var.f5042a = null;
        m3.h hVar = this.f4981g;
        if (hVar.B.length() > 0) {
            if (f()) {
                k();
                return;
            }
            z0Var.f5042a = null;
            if (hVar.B.length() > 0) {
                String str = hVar.B;
                long j9 = this.f4980f;
                int i10 = m3.q0.f10519c;
                int iT = q0.q.t((int) (j9 & 4294967295L), str);
                if (iT != -1) {
                    q(iT, iT);
                }
            }
        }
    }

    public final void j() {
        this.f4979e.f5042a = null;
        m3.h hVar = this.f4981g;
        String str = hVar.B;
        String str2 = hVar.B;
        if (str.length() > 0) {
            int iU = q0.q.u(str2, m3.q0.f(this.f4980f));
            if (iU == m3.q0.f(this.f4980f) && iU != str2.length()) {
                iU = q0.q.u(str2, iU + 1);
            }
            q(iU, iU);
        }
    }

    public final void k() {
        this.f4979e.f5042a = null;
        m3.h hVar = this.f4981g;
        if (hVar.B.length() > 0) {
            String str = hVar.B;
            long j9 = this.f4980f;
            int i10 = m3.q0.f10519c;
            int iW = q0.q.w((int) (j9 & 4294967295L), str);
            if (iW != -1) {
                q(iW, iW);
            }
        }
    }

    public final void l() {
        this.f4979e.f5042a = null;
        m3.h hVar = this.f4981g;
        String str = hVar.B;
        String str2 = hVar.B;
        if (str.length() > 0) {
            int iV = q0.q.v(str2, m3.q0.g(this.f4980f));
            if (iV == m3.q0.g(this.f4980f) && iV != 0) {
                iV = q0.q.v(str2, iV - 1);
            }
            q(iV, iV);
        }
    }

    public final void m() {
        z0 z0Var = this.f4979e;
        z0Var.f5042a = null;
        m3.h hVar = this.f4981g;
        if (hVar.B.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            z0Var.f5042a = null;
            if (hVar.B.length() > 0) {
                String str = hVar.B;
                long j9 = this.f4980f;
                int i10 = m3.q0.f10519c;
                int iT = q0.q.t((int) (j9 & 4294967295L), str);
                if (iT != -1) {
                    q(iT, iT);
                }
            }
        }
    }

    public final void n() {
        Integer numB;
        this.f4979e.f5042a = null;
        if (this.f4981g.B.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        q(iIntValue, iIntValue);
    }

    public final void o() {
        Integer numC;
        this.f4979e.f5042a = null;
        if (this.f4981g.B.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        q(iIntValue, iIntValue);
    }

    public final void p() {
        if (this.f4981g.B.length() > 0) {
            int i10 = m3.q0.f10519c;
            this.f4980f = m3.h0.b((int) (this.f4976b >> 32), (int) (this.f4980f & 4294967295L));
        }
    }

    public final void q(int i10, int i11) {
        this.f4980f = m3.h0.b(i10, i11);
    }

    public final int r() {
        long j9 = this.f4980f;
        int i10 = m3.q0.f10519c;
        return this.f4978d.z((int) (j9 & 4294967295L));
    }
}

package z0;

import a1.d1;
import a1.u0;
import ab.a0;
import com.google.protobuf.RuntimeVersion;
import g1.a2;
import h00.q;
import h00.x;
import i2.s0;
import java.util.List;
import l1.g0;
import m3.h0;
import m3.i0;
import m3.q0;
import q3.e0;
import q3.o;
import q3.p;
import q3.u;
import x3.l;
import y1.j;
import y1.k;

public abstract class h implements j {
    public static final e A = new e(2);

    public static final List a(q0 q0Var, m1.e eVar) {
        if (eVar != null && eVar.C != 0) {
            return q.n1(eVar.f());
        }
        if (q0Var != null) {
            long j9 = q0Var.f10520a;
            if (!q0.d(j9)) {
                return va.a.R(new m3.f(new i0(0L, 0L, (u) null, (o) null, (p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, l.f16418c, (s0) null, 61439), q0.g(j9), q0.f(j9)));
            }
        }
        return x.A;
    }

    public static final long b(int i10, int i11, int i12, long j9) {
        int i13;
        int iG = q0.g(j9);
        int iF = q0.f(j9);
        if (iF < i10) {
            return j9;
        }
        if (iG <= i10 && i11 <= iF) {
            i13 = i12 - (i11 - i10);
            if (iG == iF) {
            }
            i10 = iF + i13;
            return h0.b(iG, i10);
        }
        if (iG > i10 && iF < i11) {
            i10 += i12;
            iG = i10;
        } else if (iG >= i11) {
            i13 = i12 - (i11 - i10);
        } else if (i10 < iG) {
            iG = i10 + i12;
            i10 = (i12 - (i11 - i10)) + iF;
        }
        return h0.b(iG, i10);
        iG += i13;
        i10 = iF + i13;
        return h0.b(iG, i10);
    }

    public static final void d(g gVar) {
        a aVarG = gVar.g();
        try {
            aVarG.c(0, aVarG.B.length(), RuntimeVersion.SUFFIX);
            e(aVarG);
            gVar.b(aVarG);
        } finally {
            gVar.c();
        }
    }

    public static final void e(a aVar) {
        d1 d1Var = aVar.B;
        int length = d1Var.length();
        int length2 = d1Var.length() + 1;
        if (length < 0 || length >= length2) {
            g0.a.a("Expected " + length + " to be in [0, " + length2 + ')');
        }
        aVar.D = h0.b(length, length);
    }

    public static final void g(e0 e0Var, b bVar, b bVar2, u0 u0Var, boolean z10) {
        m1.e eVar = (m1.e) u0Var.B;
        int i10 = eVar.C;
        if (i10 > 1) {
            e0Var.s(new c1.d(0, bVar.C.toString(), bVar2.C.toString(), bVar.D, bVar2.D, 0L, false, 32));
            return;
        }
        if (i10 == 1) {
            a1.q qVar = (a1.q) eVar.A[0];
            long jB = h0.b(qVar.f114c, qVar.f115d);
            a1.q qVar2 = (a1.q) ((m1.e) u0Var.B).A[0];
            long jB2 = h0.b(qVar2.f112a, qVar2.f113b);
            if (q0.d(jB) && q0.d(jB2)) {
                return;
            }
            e0Var.s(new c1.d(q0.g(jB), h0.k(jB, bVar), h0.k(jB2, bVar2), bVar.D, bVar2.D, 0L, z10, 32));
        }
    }

    public static final g h(String str, l1.j jVar, int i10) {
        int length = str.length();
        long jB = h0.b(length, length);
        Object[] objArr = new Object[0];
        e eVar = e.C;
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && ((g0) jVar).g(str)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && ((g0) jVar).f(jB)) || (i10 & 48) == 32);
        g0 g0Var = (g0) jVar;
        Object objN = g0Var.N();
        if (z10 || objN == l1.i.f9868a) {
            objN = new a2(str, jB, 2);
            g0Var.n0(objN);
        }
        return (g) k.f(objArr, eVar, (u00.a) objN, jVar, 48);
    }

    public static final void i(a aVar, int i10, int i11) {
        aVar.f(h0.b(a0.y(i10, 0, aVar.B.length()), a0.y(i11, 0, aVar.B.length())));
    }
}

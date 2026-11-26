package c3;

public final class d extends b {

    public static d f2638d;

    public static final x3.j f2639e = x3.j.B;

    public static final x3.j f2640f = x3.j.A;

    public m3.n0 f2641c;

    @Override
    public final int[] g(int i10) {
        int iD;
        if (k().length() <= 0 || i10 >= k().length()) {
            return null;
        }
        x3.j jVar = f2639e;
        if (i10 < 0) {
            m3.n0 n0Var = this.f2641c;
            if (n0Var == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            iD = n0Var.f10497b.d(0);
        } else {
            m3.n0 n0Var2 = this.f2641c;
            if (n0Var2 == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            int iD2 = n0Var2.f10497b.d(i10);
            iD = s(iD2, jVar) == i10 ? iD2 : iD2 + 1;
        }
        m3.n0 n0Var3 = this.f2641c;
        if (n0Var3 == null) {
            kotlin.jvm.internal.m.k("layoutResult");
            throw null;
        }
        if (iD >= n0Var3.f10497b.f10515f) {
            return null;
        }
        return j(s(iD, jVar), s(iD, f2640f) + 1);
    }

    @Override
    public final int[] o(int i10) {
        int iD;
        if (k().length() <= 0 || i10 <= 0) {
            return null;
        }
        int length = k().length();
        x3.j jVar = f2640f;
        if (i10 > length) {
            m3.n0 n0Var = this.f2641c;
            if (n0Var == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            iD = n0Var.f10497b.d(k().length());
        } else {
            m3.n0 n0Var2 = this.f2641c;
            if (n0Var2 == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            int iD2 = n0Var2.f10497b.d(i10);
            iD = s(iD2, jVar) + 1 == i10 ? iD2 : iD2 - 1;
        }
        if (iD < 0) {
            return null;
        }
        return j(s(iD, f2639e), s(iD, jVar) + 1);
    }

    public final int s(int i10, x3.j jVar) {
        m3.n0 n0Var = this.f2641c;
        if (n0Var == null) {
            kotlin.jvm.internal.m.k("layoutResult");
            throw null;
        }
        int iH = n0Var.h(i10);
        m3.n0 n0Var2 = this.f2641c;
        if (n0Var2 == null) {
            kotlin.jvm.internal.m.k("layoutResult");
            throw null;
        }
        if (jVar != n0Var2.i(iH)) {
            m3.n0 n0Var3 = this.f2641c;
            if (n0Var3 != null) {
                return n0Var3.h(i10);
            }
            kotlin.jvm.internal.m.k("layoutResult");
            throw null;
        }
        m3.n0 n0Var4 = this.f2641c;
        if (n0Var4 != null) {
            return n0Var4.f10497b.c(i10, false) - 1;
        }
        kotlin.jvm.internal.m.k("layoutResult");
        throw null;
    }
}

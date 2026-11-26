package c3;

public final class e extends b {

    public static e f2648e;

    public static final x3.j f2649f = x3.j.B;

    public static final x3.j f2650g = x3.j.A;

    public m3.n0 f2651c;

    public j3.s f2652d;

    @Override
    public final int[] g(int i10) {
        int iE;
        if (k().length() <= 0 || i10 >= k().length()) {
            return null;
        }
        try {
            j3.s sVar = this.f2652d;
            if (sVar == null) {
                kotlin.jvm.internal.m.k("node");
                throw null;
            }
            h2.c cVarG = sVar.g();
            int iRound = Math.round(cVarG.f6549d - cVarG.f6547b);
            if (i10 <= 0) {
                i10 = 0;
            }
            m3.n0 n0Var = this.f2651c;
            if (n0Var == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            int iD = n0Var.f10497b.d(i10);
            m3.n0 n0Var2 = this.f2651c;
            if (n0Var2 == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            float f3 = n0Var2.f10497b.f(iD) + iRound;
            m3.n0 n0Var3 = this.f2651c;
            if (n0Var3 == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            if (n0Var3 == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            m3.q qVar = n0Var3.f10497b;
            if (f3 < qVar.f(qVar.f10515f - 1)) {
                m3.n0 n0Var4 = this.f2651c;
                if (n0Var4 == null) {
                    kotlin.jvm.internal.m.k("layoutResult");
                    throw null;
                }
                iE = n0Var4.f10497b.e(f3);
            } else {
                m3.n0 n0Var5 = this.f2651c;
                if (n0Var5 == null) {
                    kotlin.jvm.internal.m.k("layoutResult");
                    throw null;
                }
                iE = n0Var5.f10497b.f10515f;
            }
            return j(i10, s(iE - 1, f2650g) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override
    public final int[] o(int i10) {
        int iE;
        if (k().length() <= 0 || i10 <= 0) {
            return null;
        }
        try {
            j3.s sVar = this.f2652d;
            if (sVar == null) {
                kotlin.jvm.internal.m.k("node");
                throw null;
            }
            h2.c cVarG = sVar.g();
            int iRound = Math.round(cVarG.f6549d - cVarG.f6547b);
            int length = k().length();
            if (length <= i10) {
                i10 = length;
            }
            m3.n0 n0Var = this.f2651c;
            if (n0Var == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            int iD = n0Var.f10497b.d(i10);
            m3.n0 n0Var2 = this.f2651c;
            if (n0Var2 == null) {
                kotlin.jvm.internal.m.k("layoutResult");
                throw null;
            }
            float f3 = n0Var2.f10497b.f(iD) - iRound;
            if (f3 > 0.0f) {
                m3.n0 n0Var3 = this.f2651c;
                if (n0Var3 == null) {
                    kotlin.jvm.internal.m.k("layoutResult");
                    throw null;
                }
                iE = n0Var3.f10497b.e(f3);
            } else {
                iE = 0;
            }
            if (i10 == k().length() && iE < iD) {
                iE++;
            }
            return j(s(iE, f2649f), i10);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int s(int i10, x3.j jVar) {
        m3.n0 n0Var = this.f2651c;
        if (n0Var == null) {
            kotlin.jvm.internal.m.k("layoutResult");
            throw null;
        }
        int iH = n0Var.h(i10);
        m3.n0 n0Var2 = this.f2651c;
        if (n0Var2 == null) {
            kotlin.jvm.internal.m.k("layoutResult");
            throw null;
        }
        if (jVar != n0Var2.i(iH)) {
            m3.n0 n0Var3 = this.f2651c;
            if (n0Var3 != null) {
                return n0Var3.h(i10);
            }
            kotlin.jvm.internal.m.k("layoutResult");
            throw null;
        }
        m3.n0 n0Var4 = this.f2651c;
        if (n0Var4 != null) {
            return n0Var4.f10497b.c(i10, false) - 1;
        }
        kotlin.jvm.internal.m.k("layoutResult");
        throw null;
    }
}

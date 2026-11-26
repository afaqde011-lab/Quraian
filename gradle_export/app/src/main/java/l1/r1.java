package l1;

public final class r1 {

    public s1 f9918a;

    public int f9919b;

    public o1.b f9920c;

    public u00.n f9921d;

    public int f9922e;

    public u.c0 f9923f;

    public u.i0 f9924g;

    public r1(s1 s1Var) {
        this.f9918a = s1Var;
    }

    public static boolean a(w wVar, u.i0 i0Var) {
        kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        k2 k2Var = wVar.C;
        if (k2Var == null) {
            k2Var = c.G;
        }
        return !k2Var.a(wVar.i().f9946f, i0Var.g(wVar));
    }

    public final boolean b() {
        if (this.f9918a != null) {
            o1.b bVar = this.f9920c;
            if (bVar != null ? bVar.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final m0 c(Object obj) {
        m0 m0VarA;
        s1 s1Var = this.f9918a;
        return (s1Var == null || (m0VarA = s1Var.a(this, obj)) == null) ? m0.A : m0VarA;
    }

    public final void d() {
        s1 s1Var = this.f9918a;
        if (s1Var != null) {
            s1Var.b();
        }
        this.f9918a = null;
        this.f9923f = null;
        this.f9924g = null;
        this.f9921d = null;
    }

    public final void e(boolean z10) {
        int i10 = this.f9919b;
        this.f9919b = z10 ? i10 | 32 : i10 & (-33);
    }

    public final void f() {
        this.f9919b |= 1;
    }
}

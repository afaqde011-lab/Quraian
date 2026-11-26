package l1;

public abstract class p1 {

    public final p0 f9905a;

    public p1(u00.a aVar) {
        this.f9905a = new p0(aVar);
    }

    public abstract q1 a(Object obj);

    public s2 b() {
        return this.f9905a;
    }

    public final s2 c(q1 q1Var, s2 s2Var) {
        s2 s2Var2 = null;
        s2Var2 = null;
        s2Var2 = null;
        s2Var2 = null;
        s2Var2 = null;
        s2Var2 = null;
        if (s2Var instanceof a0) {
            if (q1Var.f9911c) {
                a0 a0Var = (a0) s2Var;
                a0Var.f9824a.setValue(q1Var.c());
                s2Var2 = a0Var;
            }
        } else if (s2Var instanceof r2) {
            if ((q1Var.f9910b || q1Var.f9915g != null) && !q1Var.f9911c) {
                r2 r2Var = (r2) s2Var;
                if (kotlin.jvm.internal.m.a(q1Var.c(), r2Var.f9925a)) {
                    s2Var2 = r2Var;
                }
            }
        } else if (s2Var instanceof u) {
            q1Var.getClass();
        }
        if (s2Var2 != null) {
            return s2Var2;
        }
        if (!q1Var.f9911c) {
            return new r2(q1Var.c());
        }
        Object obj = q1Var.f9915g;
        k2 k2Var = (k2) q1Var.f9914f;
        if (k2Var == null) {
            k2Var = c.G;
        }
        return new a0(new i1(obj, k2Var));
    }
}

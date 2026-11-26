package f30;

import e30.k0;
import e30.z0;

public abstract class s {
    public static final q A;
    public static final o B;
    public static final r C;
    public static final p D;
    public static final s[] E;

    static {
        q qVar = new q();
        A = qVar;
        o oVar = new o();
        B = oVar;
        r rVar = new r();
        C = rVar;
        p pVar = new p();
        D = pVar;
        s[] sVarArr = {qVar, oVar, rVar, pVar};
        E = sVarArr;
        f50.c.v(sVarArr);
    }

    public static s b(z0 z0Var) {
        kotlin.jvm.internal.m.e(z0Var, "<this>");
        if (z0Var.t0()) {
            return B;
        }
        if (z0Var instanceof e30.l) {
        }
        return e30.c.h(m.A.l(), e30.c.m(z0Var), k0.b) ? D : C;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) E.clone();
    }

    public abstract s a(z0 z0Var);
}

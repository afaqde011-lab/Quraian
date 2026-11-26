package q0;

import c3.t2;

public final class f1 implements g1 {

    public final t2 f12611a;

    public h1 f12612b;

    public g2.l f12613c;

    public f1(t2 t2Var) {
        this.f12611a = t2Var;
    }

    public final h1 a() {
        h1 h1Var = this.f12612b;
        if (h1Var != null) {
            return h1Var;
        }
        kotlin.jvm.internal.m.k("keyboardActions");
        throw null;
    }

    public final boolean b(int i10) {
        u00.k kVar;
        t2 t2Var;
        if (i10 == 7) {
            kVar = a().f12620a;
        } else {
            if (i10 == 2) {
                a();
            } else if (i10 == 6) {
                kVar = a().f12621b;
            } else if (i10 == 5 || i10 == 3 || i10 == 4) {
                a();
            } else if (i10 != 1 && i10 != 0) {
                throw new IllegalStateException("invalid ImeAction");
            }
            kVar = null;
        }
        if (kVar != null) {
            kVar.invoke(this);
            return true;
        }
        if (i10 == 6) {
            g2.l lVar = this.f12613c;
            if (lVar != null) {
                ((g2.n) lVar).h(1, true);
                return true;
            }
            kotlin.jvm.internal.m.k("focusManager");
            throw null;
        }
        if (i10 != 5) {
            if (i10 != 7 || (t2Var = this.f12611a) == null) {
                return false;
            }
            ((c3.p1) t2Var).a();
            return true;
        }
        g2.l lVar2 = this.f12613c;
        if (lVar2 != null) {
            ((g2.n) lVar2).h(2, true);
            return true;
        }
        kotlin.jvm.internal.m.k("focusManager");
        throw null;
    }
}

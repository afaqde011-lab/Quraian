package fh;

import java.util.Map;

public final class z extends q {
    public final Object A;
    public int B;
    public final a0 C;

    public z(a0 a0Var, int i10) {
        this.C = a0Var;
        Object obj = a0.J;
        this.A = a0Var.k()[i10];
        this.B = i10;
    }

    public final void a() {
        int i10 = this.B;
        Object obj = this.A;
        a0 a0Var = this.C;
        if (i10 != -1 && i10 < a0Var.size()) {
            if (w50.c.A(obj, a0Var.k()[this.B])) {
                return;
            }
        }
        Object obj2 = a0.J;
        this.B = a0Var.f(obj);
    }

    @Override
    public final Object getKey() {
        return this.A;
    }

    @Override
    public final Object getValue() {
        a0 a0Var = this.C;
        Map mapD = a0Var.d();
        if (mapD != null) {
            return mapD.get(this.A);
        }
        a();
        int i10 = this.B;
        if (i10 == -1) {
            return null;
        }
        return a0Var.l()[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        a0 a0Var = this.C;
        Map mapD = a0Var.d();
        Object obj2 = this.A;
        if (mapD != null) {
            return mapD.put(obj2, obj);
        }
        a();
        int i10 = this.B;
        if (i10 == -1) {
            a0Var.put(obj2, obj);
            return null;
        }
        Object obj3 = a0Var.l()[i10];
        a0Var.l()[this.B] = obj;
        return obj3;
    }
}

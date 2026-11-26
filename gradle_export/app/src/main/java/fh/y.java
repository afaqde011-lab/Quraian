package fh;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public final class y extends AbstractSet {
    public final int A;
    public final a0 B;

    public y(a0 a0Var, int i10) {
        this.A = i10;
        this.B = a0Var;
    }

    @Override
    public final void clear() {
        switch (this.A) {
            case 0:
                this.B.clear();
                break;
            default:
                this.B.clear();
                break;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                a0 a0Var = this.B;
                Map mapD = a0Var.d();
                if (mapD != null) {
                    return mapD.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iF = a0Var.f(entry.getKey());
                    if (iF != -1 && w50.c.A(a0Var.l()[iF], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.B.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                a0 a0Var = this.B;
                Map mapD = a0Var.d();
                return mapD != null ? mapD.entrySet().iterator() : new x(a0Var, 1);
            default:
                a0 a0Var2 = this.B;
                Map mapD2 = a0Var2.d();
                return mapD2 != null ? mapD2.keySet().iterator() : new x(a0Var2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.A) {
            case 0:
                a0 a0Var = this.B;
                Map mapD = a0Var.d();
                if (mapD != null) {
                    return mapD.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!a0Var.h()) {
                        int iE = a0Var.e();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = a0Var.A;
                        Objects.requireNonNull(obj2);
                        int iT = w.t(key, value, iE, obj2, a0Var.j(), a0Var.k(), a0Var.l());
                        if (iT != -1) {
                            a0Var.g(iT, iE);
                            a0Var.F--;
                            a0Var.E += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                a0 a0Var2 = this.B;
                Map mapD2 = a0Var2.d();
                if (mapD2 != null) {
                    return mapD2.keySet().remove(obj);
                }
                return a0Var2.i(obj) != a0.J;
        }
    }

    @Override
    public final int size() {
        switch (this.A) {
            case 0:
                break;
        }
        return this.B.size();
    }
}

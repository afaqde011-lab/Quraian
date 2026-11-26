package androidx.media3.common;

import java.util.Collections;
import java.util.List;

public final class m2 {

    public static final String f1351c;

    public static final String f1352d;

    public final l2 f1353a;

    public final fh.t0 f1354b;

    static {
        String str = e7.i0.f5136a;
        f1351c = Integer.toString(0, 36);
        f1352d = Integer.toString(1, 36);
    }

    public m2(l2 l2Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= l2Var.f1338a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f1353a = l2Var;
        this.f1354b = fh.t0.o(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m2.class == obj.getClass()) {
            m2 m2Var = (m2) obj;
            if (this.f1353a.equals(m2Var.f1353a) && this.f1354b.equals(m2Var.f1354b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f1354b.hashCode() * 31) + this.f1353a.hashCode();
    }
}

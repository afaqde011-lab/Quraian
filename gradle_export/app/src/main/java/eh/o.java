package eh;

import java.io.Serializable;
import java.util.List;

public final class o implements n, Serializable {
    public final List A;

    public o(List list) {
        this.A = list;
    }

    @Override
    public final boolean apply(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.A;
            if (i10 >= list.size()) {
                return true;
            }
            if (!((n) list.get(i10)).apply(obj)) {
                return false;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.A.equals(((o) obj).A);
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (Object obj : this.A) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}

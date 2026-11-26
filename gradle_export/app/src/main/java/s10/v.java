package s10;

import java.util.ArrayList;

public final class v extends m0 {
    public final ArrayList a;

    public v(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.a.equals(((v) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ArrayValue(" + this.a + ')';
    }
}

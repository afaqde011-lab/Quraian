package ss;

import java.util.ArrayList;

public final class z {
    public final int a;
    public final ArrayList b;

    public z(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.a == zVar.a && this.b.equals(zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ListeningYear(year=" + this.a + ", days=" + this.b + ")";
    }
}

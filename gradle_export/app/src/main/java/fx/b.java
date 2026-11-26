package fx;

import bx.c;
import kotlin.jvm.internal.m;

public final class b {
    public final int a;
    public final Integer b;
    public final c c;

    public b(int i, Integer num, c cVar) {
        this.a = i;
        this.b = num;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && m.a(this.b, bVar.b) && m.a(this.c, bVar.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "ReciterCollectionDvo(reciterId=" + this.a + ", listensCount=" + this.b + ", reciter=" + this.c + ")";
    }
}

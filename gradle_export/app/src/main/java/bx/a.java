package bx;

import kotlin.jvm.internal.m;

public final class a {
    public final int a;
    public final Integer b;

    public a(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && m.a(this.b, aVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "CollectionReciter(reciterId=" + this.a + ", listensCount=" + this.b + ")";
    }
}

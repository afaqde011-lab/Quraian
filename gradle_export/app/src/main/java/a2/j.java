package a2;

public final class j {

    public final int f163a;

    public final Integer f164b;

    public j(int i10, Integer num) {
        this.f163a = i10;
        this.f164b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f163a == jVar.f163a && kotlin.jvm.internal.m.a(this.f164b, jVar.f164b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f163a) * 31;
        Integer num = this.f164b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f163a + ", dataOffset=" + this.f164b + ')';
    }
}

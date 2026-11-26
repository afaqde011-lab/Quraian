package w2;

public final class a {

    public long f15831a;

    public float f15832b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f15831a == aVar.f15831a && Float.compare(this.f15832b, aVar.f15832b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15832b) + (Long.hashCode(this.f15831a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPointAtTime(time=");
        sb2.append(this.f15831a);
        sb2.append(", dataPoint=");
        return w.c.k(sb2, this.f15832b, ')');
    }
}

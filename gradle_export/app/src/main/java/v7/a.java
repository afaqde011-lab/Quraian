package v7;

public final class a {

    public final long f15485a;

    public final long f15486b;

    public a(long j9, long j10) {
        this.f15485a = j9;
        this.f15486b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f15485a == aVar.f15485a && this.f15486b == aVar.f15486b;
    }

    public final int hashCode() {
        return (((int) this.f15485a) * 31) + ((int) this.f15486b);
    }
}

package bz;

public final class k implements l {
    public final int a;
    public final ol.c b;

    public k(int i, ol.c cVar) {
        this.a = i;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && this.b == kVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ShowSnackbar(messageRes=" + this.a + ", type=" + this.b + ")";
    }
}

package ry;

public final class c {
    public final String a;
    public final int b;

    public c(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a.equals(cVar.a) && this.b == cVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + w.c.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CancellationReasonDvo(id=" + this.a + ", titleRes=" + this.b + ", isStandalone=false)";
    }
}

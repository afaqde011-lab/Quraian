package e1;

public final class a1 {

    public final long f4954a;

    public final long f4955b;

    public a1(long j9, long j10) {
        this.f4954a = j9;
        this.f4955b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return i2.t.c(this.f4954a, a1Var.f4954a) && i2.t.c(this.f4955b, a1Var.f4955b);
    }

    public final int hashCode() {
        int i10 = i2.t.f7168h;
        return Long.hashCode(this.f4955b) + (Long.hashCode(this.f4954a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionColors(selectionHandleColor=");
        w.c.s(this.f4954a, ", selectionBackgroundColor=", sb2);
        sb2.append((Object) i2.t.i(this.f4955b));
        sb2.append(')');
        return sb2.toString();
    }
}

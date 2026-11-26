package h0;

public final class c0 implements l2 {

    public final int f6393a;

    public final int f6394b;

    public c0(int i10, int i11) {
        this.f6393a = i10;
        this.f6394b = i11;
    }

    @Override
    public final int a(y3.c cVar, y3.m mVar) {
        return 0;
    }

    @Override
    public final int b(y3.c cVar) {
        return 0;
    }

    @Override
    public final int c(y3.c cVar) {
        return this.f6394b;
    }

    @Override
    public final int d(y3.c cVar, y3.m mVar) {
        return this.f6393a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f6393a == c0Var.f6393a && this.f6394b == c0Var.f6394b;
    }

    public final int hashCode() {
        return ((this.f6393a * 31) + this.f6394b) * 961;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets(left=");
        sb2.append(this.f6393a);
        sb2.append(", top=");
        return g4.c.g(this.f6394b, ", right=0, bottom=0)", sb2);
    }
}

package h0;

public final class u0 {

    public final int f6466a;

    public final int f6467b;

    public final int f6468c;

    public final int f6469d;

    public u0(int i10, int i11, int i12, int i13) {
        this.f6466a = i10;
        this.f6467b = i11;
        this.f6468c = i12;
        this.f6469d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f6466a == u0Var.f6466a && this.f6467b == u0Var.f6467b && this.f6468c == u0Var.f6468c && this.f6469d == u0Var.f6469d;
    }

    public final int hashCode() {
        return (((((this.f6466a * 31) + this.f6467b) * 31) + this.f6468c) * 31) + this.f6469d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsetsValues(left=");
        sb2.append(this.f6466a);
        sb2.append(", top=");
        sb2.append(this.f6467b);
        sb2.append(", right=");
        sb2.append(this.f6468c);
        sb2.append(", bottom=");
        return oi.k.l(sb2, this.f6469d, ')');
    }
}

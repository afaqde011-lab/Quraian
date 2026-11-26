package qo;

public final class a0 {
    public final String a;
    public final boolean b;

    public a0(String shown, boolean z) {
        kotlin.jvm.internal.m.e(shown, "shown");
        this.a = shown;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.m.a(this.a, a0Var.a) && this.b == a0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DescriptionText(shown=" + this.a + ", isCut=" + this.b + ")";
    }
}

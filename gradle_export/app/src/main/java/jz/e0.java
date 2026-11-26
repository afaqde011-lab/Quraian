package jz;

public final class e0 {
    public final String a;
    public final String b;

    public e0(String str, int i) {
        this((i & 1) != 0 ? "" : str, "");
    }

    public e0(String name, String str) {
        kotlin.jvm.internal.m.e(name, "name");
        this.a = name;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return kotlin.jvm.internal.m.a(this.a, e0Var.a) && kotlin.jvm.internal.m.a(this.b, e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return a1.b.q("PurchaseDevicePresentation(name=", this.a, ", location=", this.b, ")");
    }
}

package gz;

public final class i0 implements m0 {
    public final String a;

    public i0(String code) {
        kotlin.jvm.internal.m.e(code, "code");
        this.a = code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && kotlin.jvm.internal.m.a(this.a, ((i0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("OnSubmitPromoCodeClicked(code=", this.a, ")");
    }
}

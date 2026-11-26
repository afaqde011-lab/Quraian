package gz;

public final class g0 implements m0 {
    public final String a;

    public g0(String code) {
        kotlin.jvm.internal.m.e(code, "code");
        this.a = code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && kotlin.jvm.internal.m.a(this.a, ((g0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("OnSettingsSectionClicked(code=", this.a, ")");
    }
}

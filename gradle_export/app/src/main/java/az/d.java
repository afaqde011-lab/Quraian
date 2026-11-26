package az;

public final class d implements f {
    public final String a;

    public d(String text) {
        kotlin.jvm.internal.m.e(text, "text");
        this.a = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && kotlin.jvm.internal.m.a(this.a, ((d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("OnOtherTextChanged(text=", this.a, ")");
    }
}

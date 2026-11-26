package az;

public final class e implements f {
    public final String a;

    public e(String reasonId) {
        kotlin.jvm.internal.m.e(reasonId, "reasonId");
        this.a = reasonId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && kotlin.jvm.internal.m.a(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a1.b.p("OnReasonClicked(reasonId=", this.a, ")");
    }
}

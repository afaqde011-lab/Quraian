package gz;

public final class q0 implements v0 {
    public final String a;
    public final String b;

    public q0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return kotlin.jvm.internal.m.a(this.a, q0Var.a) && kotlin.jvm.internal.m.a(this.b, q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return a1.b.q("SendEmailIntentWithMessage(subject=", this.a, ", message=", this.b, ")");
    }
}

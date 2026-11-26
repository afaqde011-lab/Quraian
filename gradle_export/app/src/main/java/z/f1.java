package z;

public final class f1 {

    public final long f16913a;

    public final h0.p1 f16914b;

    public f1() {
        long jD = i2.b0.d(4284900966L);
        h0.p1 p1VarE = h0.c.e(0.0f, 0.0f, 3);
        this.f16913a = jD;
        this.f16914b = p1VarE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        f1 f1Var = (f1) obj;
        return i2.t.c(this.f16913a, f1Var.f16913a) && kotlin.jvm.internal.m.a(this.f16914b, f1Var.f16914b);
    }

    public final int hashCode() {
        int i10 = i2.t.f7168h;
        return this.f16914b.hashCode() + (Long.hashCode(this.f16913a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverscrollConfiguration(glowColor=");
        w.c.s(this.f16913a, ", drawPadding=", sb2);
        sb2.append(this.f16914b);
        sb2.append(')');
        return sb2.toString();
    }
}

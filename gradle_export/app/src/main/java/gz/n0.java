package gz;

public final class n0 implements v0 {
    public final String a;
    public final String b;

    public n0(String str, String promoCode) {
        kotlin.jvm.internal.m.e(promoCode, "promoCode");
        this.a = str;
        this.b = promoCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return kotlin.jvm.internal.m.a(this.a, n0Var.a) && kotlin.jvm.internal.m.a(this.b, n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return a1.b.q("LaunchSubscriptionPurchase(productId=", this.a, ", promoCode=", this.b, ")");
    }
}

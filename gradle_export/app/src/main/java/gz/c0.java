package gz;

public final class c0 implements m0 {
    public final String a;
    public final boolean b;

    public c0(String promoCode, boolean z) {
        kotlin.jvm.internal.m.e(promoCode, "promoCode");
        this.a = promoCode;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return kotlin.jvm.internal.m.a(this.a, c0Var.a) && this.b == c0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnPromoCodeSubscriptionPurchased(promoCode=" + this.a + ", purchaseSucceeded=" + this.b + ")";
    }
}

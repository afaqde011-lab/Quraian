package du;

public final class n implements u {
    public final bu.b a;

    public n(bu.b plan) {
        kotlin.jvm.internal.m.e(plan, "plan");
        this.a = plan;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && kotlin.jvm.internal.m.a(this.a, ((n) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnPremiumPaywallPlanSelected(plan=" + this.a + ")";
    }
}

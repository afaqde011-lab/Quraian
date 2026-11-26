package ri;

public final class k1 {

    public final l1 f13420a;

    public final n1 f13421b;

    public final m1 f13422c;

    public k1(l1 l1Var, n1 n1Var, m1 m1Var) {
        this.f13420a = l1Var;
        this.f13421b = n1Var;
        this.f13422c = m1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            if (this.f13420a.equals(k1Var.f13420a) && this.f13421b.equals(k1Var.f13421b) && this.f13422c.equals(k1Var.f13422c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13422c.hashCode() ^ ((((this.f13420a.hashCode() ^ 1000003) * 1000003) ^ this.f13421b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f13420a + ", osData=" + this.f13421b + ", deviceData=" + this.f13422c + "}";
    }
}

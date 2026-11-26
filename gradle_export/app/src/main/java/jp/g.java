package jp;

public final class g implements t {
    public final boolean a;

    public g(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.a == ((g) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return g4.c.j("OnDeclinesMarketingEmailsChanged(declines=", ")", this.a);
    }
}

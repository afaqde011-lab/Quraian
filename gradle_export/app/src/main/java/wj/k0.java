package wj;

public final class k0 {

    public final r0 f16187a;

    public final b f16188b;

    public k0(r0 r0Var, b bVar) {
        n nVar = n.SESSION_START;
        this.f16187a = r0Var;
        this.f16188b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        n nVar = n.SESSION_START;
        return this.f16187a.equals(k0Var.f16187a) && this.f16188b.equals(k0Var.f16188b);
    }

    public final int hashCode() {
        return this.f16188b.hashCode() + ((this.f16187a.hashCode() + (n.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + n.SESSION_START + ", sessionData=" + this.f16187a + ", applicationInfo=" + this.f16188b + ')';
    }
}

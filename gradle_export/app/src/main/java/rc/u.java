package rc;

public final class u {

    public final v f13223a;

    public final h f13224b;

    public u() {
        v vVar = new v();
        h hVar = new h();
        this.f13223a = vVar;
        this.f13224b = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.m.a(this.f13223a, uVar.f13223a) && kotlin.jvm.internal.m.a(this.f13224b, uVar.f13224b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return "InteractionsOptions(rageClick=" + this.f13223a + ", deadClick=" + this.f13224b + ')';
    }
}

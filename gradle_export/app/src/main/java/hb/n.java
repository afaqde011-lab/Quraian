package hb;

import za.g0;

public final class n {

    public String f6986a;

    public g0 f6987b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.m.a(this.f6986a, nVar.f6986a) && this.f6987b == nVar.f6987b;
    }

    public final int hashCode() {
        return this.f6987b.hashCode() + (this.f6986a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f6986a + ", state=" + this.f6987b + ')';
    }
}

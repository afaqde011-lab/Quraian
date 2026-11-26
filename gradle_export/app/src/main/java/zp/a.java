package zp;

import kotlin.jvm.internal.m;

public final class a {
    public final boolean a;
    public final b b;

    public a(boolean z, b source) {
        m.e(source, "source");
        this.a = z;
        this.b = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PaywallRequest(isVisible=" + this.a + ", source=" + this.b + ")";
    }
}

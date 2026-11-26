package yu;

import kotlin.jvm.internal.m;

public final class d implements e {
    public final su.e a;

    public d(su.e repeatCount) {
        m.e(repeatCount, "repeatCount");
        this.a = repeatCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.a == ((d) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpdateRepeatCount(repeatCount=" + this.a + ")";
    }
}

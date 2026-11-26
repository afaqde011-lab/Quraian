package bv;

public final class a0 implements b {
    public final su.e a;

    public a0(su.e count) {
        kotlin.jvm.internal.m.e(count, "count");
        this.a = count;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && this.a == ((a0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnMemorizationRepeatCountChanged(count=" + this.a + ")";
    }
}

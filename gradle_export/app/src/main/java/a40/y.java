package a40;

public final class y extends k00.a {
    public static final w C = new w();
    public final String B;

    public y() {
        super(C);
        this.B = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && kotlin.jvm.internal.m.a(this.B, ((y) obj).B);
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    public final String toString() {
        return g4.c.k(new StringBuilder("CoroutineName("), this.B, ')');
    }
}

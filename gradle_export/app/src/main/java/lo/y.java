package lo;

public final class y implements z {
    public final u a;

    public y(u uVar) {
        this.a = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && kotlin.jvm.internal.m.a(this.a, ((y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Ready(readAlong=" + this.a + ")";
    }
}

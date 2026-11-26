package f40;

public final class u implements k00.h {
    public final ThreadLocal A;

    public u(ThreadLocal threadLocal) {
        this.A = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && kotlin.jvm.internal.m.a(this.A, ((u) obj).A);
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.A + ')';
    }
}

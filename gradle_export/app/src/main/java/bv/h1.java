package bv;

public final class h1 implements j1 {
    public final oq.a a;

    public h1(oq.a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1) && kotlin.jvm.internal.m.a(this.a, ((h1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Share(content=" + this.a + ")";
    }
}

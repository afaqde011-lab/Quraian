package h0;

public final class x extends c {
    public final b2.c m;

    public x(b2.g gVar) {
        this.m = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && kotlin.jvm.internal.m.a(this.m, ((x) obj).m);
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    @Override
    public final int k(int i10, int i11, y3.m mVar) {
        return this.m.a(i11, i10, mVar);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.m + ')';
    }
}

package h0;

public final class y extends c {
    public final b2.h m;

    public y(b2.h hVar) {
        this.m = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && kotlin.jvm.internal.m.a(this.m, ((y) obj).m);
    }

    public final int hashCode() {
        return Float.hashCode(this.m.f1981a);
    }

    @Override
    public final int k(int i10, int i11, y3.m mVar) {
        return this.m.a(i11, i10);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.m + ')';
    }
}

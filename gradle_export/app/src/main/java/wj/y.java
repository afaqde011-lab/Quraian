package wj;

public final class y {
    public static final x Companion = new x();

    public final int f16226a;

    public final String f16227b;

    public y(int i10, String str) {
        kotlin.jvm.internal.m.e(str, "uuid");
        this.f16226a = i10;
        this.f16227b = str;
    }

    public y(int i10, String str, int i11) {
        if (3 != (i10 & 3)) {
            p40.o0.g(i10, 3, w.f16215a.getDescriptor());
            throw null;
        }
        this.f16226a = i11;
        this.f16227b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f16226a == yVar.f16226a && kotlin.jvm.internal.m.a(this.f16227b, yVar.f16227b);
    }

    public final int hashCode() {
        return this.f16227b.hashCode() + (Integer.hashCode(this.f16226a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessData(pid=");
        sb2.append(this.f16226a);
        sb2.append(", uuid=");
        return g4.c.k(sb2, this.f16227b, ')');
    }
}

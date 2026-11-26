package j6;

public final class c {

    public static final c f8172c = new c(0, 0);

    public static final c f8173d = new c(1, 1);

    public final int f8174a;

    public final int f8175b;

    public c(int i10, int i11) {
        this.f8174a = i10;
        this.f8175b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.glance.layout.Alignment");
        c cVar = (c) obj;
        return this.f8174a == cVar.f8174a && this.f8175b == cVar.f8175b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8175b) + (Integer.hashCode(this.f8174a) * 31);
    }

    public final String toString() {
        return "Alignment(horizontal=" + ((Object) a.b(this.f8174a)) + ", vertical=" + ((Object) b.b(this.f8175b)) + ')';
    }
}

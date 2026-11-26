package w;

public final class d2 {

    public final kotlin.jvm.internal.n f15751a;

    public final x.y f15752b;

    public d2(u00.k kVar, x.y yVar) {
        this.f15751a = (kotlin.jvm.internal.n) kVar;
        this.f15752b = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return this.f15751a.equals(d2Var.f15751a) && kotlin.jvm.internal.m.a(this.f15752b, d2Var.f15752b);
    }

    public final int hashCode() {
        return this.f15752b.hashCode() + (this.f15751a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f15751a + ", animationSpec=" + this.f15752b + ')';
    }
}

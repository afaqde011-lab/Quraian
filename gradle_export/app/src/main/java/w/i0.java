package w;

public final class i0 {

    public final b2.d f15773a;

    public final u00.k f15774b;

    public final x.y f15775c;

    public i0(b2.d dVar, u00.k kVar, x.y yVar) {
        this.f15773a = dVar;
        this.f15774b = kVar;
        this.f15775c = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return kotlin.jvm.internal.m.a(this.f15773a, i0Var.f15773a) && kotlin.jvm.internal.m.a(this.f15774b, i0Var.f15774b) && kotlin.jvm.internal.m.a(this.f15775c, i0Var.f15775c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f15775c.hashCode() + ((this.f15774b.hashCode() + (this.f15773a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f15773a + ", size=" + this.f15774b + ", animationSpec=" + this.f15775c + ", clip=true)";
    }
}

package x;

public final class x1 {

    public final o f16387a;

    public final v f16388b;

    public x1(o oVar, v vVar) {
        this.f16387a = oVar;
        this.f16388b = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return kotlin.jvm.internal.m.a(this.f16387a, x1Var.f16387a) && kotlin.jvm.internal.m.a(this.f16388b, x1Var.f16388b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f16388b.hashCode() + (this.f16387a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f16387a + ", easing=" + this.f16388b + ", arcMode=ArcMode(value=0))";
    }
}

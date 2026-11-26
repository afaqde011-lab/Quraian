package a1;

public final class t2 {

    public final z0.b f132a;

    public final c1 f133b;

    public t2(z0.b bVar, c1 c1Var) {
        this.f132a = bVar;
        this.f133b = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj;
        return kotlin.jvm.internal.m.a(this.f132a, t2Var.f132a) && kotlin.jvm.internal.m.a(this.f133b, t2Var.f133b);
    }

    public final int hashCode() {
        return this.f133b.hashCode() + (this.f132a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f132a) + ", offsetMapping=" + this.f133b + ')';
    }
}

package x;

public final class h0 {

    public final Float f16291a;

    public v f16292b;

    public h0(Float f3, v vVar) {
        this.f16291a = f3;
        this.f16292b = vVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return h0Var.f16291a.equals(this.f16291a) && kotlin.jvm.internal.m.a(h0Var.f16292b, this.f16292b);
    }

    public final int hashCode() {
        return this.f16292b.hashCode() + w.c.d(0, this.f16291a.hashCode() * 31, 31);
    }
}

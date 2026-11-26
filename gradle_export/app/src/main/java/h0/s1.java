package h0;

public final class s1 {

    public float f6457a = 0.0f;

    public boolean f6458b = true;

    public c f6459c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return Float.compare(this.f6457a, s1Var.f6457a) == 0 && this.f6458b == s1Var.f6458b && kotlin.jvm.internal.m.a(this.f6459c, s1Var.f6459c);
    }

    public final int hashCode() {
        int iE = w.c.e(Float.hashCode(this.f6457a) * 31, 31, this.f6458b);
        c cVar = this.f6459c;
        return (iE + (cVar == null ? 0 : cVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f6457a + ", fill=" + this.f6458b + ", crossAxisAlignment=" + this.f6459c + ", flowLayoutData=null)";
    }
}

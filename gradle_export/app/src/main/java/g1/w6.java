package g1;

public final class w6 {

    public final b2.g f6024a;

    public final b2.g f6025b;

    public w6() {
        b2.g gVar = b2.b.M;
        this.f6024a = gVar;
        this.f6025b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return kotlin.jvm.internal.m.a(this.f6024a, w6Var.f6024a) && kotlin.jvm.internal.m.a(this.f6025b, w6Var.f6025b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f6025b.f1980a) + w.c.c(this.f6024a.f1980a, Boolean.hashCode(false) * 31, 31);
    }

    public final String toString() {
        return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.f6024a + ", expandedAlignment=" + this.f6025b + ')';
    }
}

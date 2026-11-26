package e30;

public final class o0 {
    public final j10.r0 a;
    public final c20.a b;

    public o0(j10.r0 typeParameter, c20.a typeAttr) {
        kotlin.jvm.internal.m.e(typeParameter, "typeParameter");
        kotlin.jvm.internal.m.e(typeAttr, "typeAttr");
        this.a = typeParameter;
        this.b = typeAttr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return kotlin.jvm.internal.m.a(o0Var.a, this.a) && kotlin.jvm.internal.m.a(o0Var.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        return this.b.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.a + ", typeAttr=" + this.b + ')';
    }
}

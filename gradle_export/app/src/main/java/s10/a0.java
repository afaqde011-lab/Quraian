package s10;

public final class a0 extends m0 {
    public final String a;
    public final String b;

    public a0(String enumClassName, String enumEntryName) {
        kotlin.jvm.internal.m.e(enumClassName, "enumClassName");
        kotlin.jvm.internal.m.e(enumEntryName, "enumEntryName");
        this.a = enumClassName;
        this.b = enumEntryName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.m.a(this.a, a0Var.a) && kotlin.jvm.internal.m.a(this.b, a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EnumValue(");
        sb.append(this.a);
        sb.append('.');
        return g4.c.k(sb, this.b, ')');
    }
}

package d6;

public final class v {

    public final s1 f4702a;

    public final int f4703b;

    public final int f4704c;

    public v(s1 s1Var, int i10, int i11) {
        this.f4702a = s1Var;
        this.f4703b = i10;
        this.f4704c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f4702a == vVar.f4702a && this.f4703b == vVar.f4703b && this.f4704c == vVar.f4704c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4704c) + w.c.d(this.f4703b, this.f4702a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BoxChildSelector(type=" + this.f4702a + ", horizontalAlignment=" + ((Object) j6.a.b(this.f4703b)) + ", verticalAlignment=" + ((Object) j6.b.b(this.f4704c)) + ')';
    }
}

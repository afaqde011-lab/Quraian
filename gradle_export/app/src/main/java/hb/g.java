package hb;

public final class g {

    public final String f6971a;

    public final int f6972b;

    public final int f6973c;

    public g(String str, int i10, int i11) {
        kotlin.jvm.internal.m.e(str, "workSpecId");
        this.f6971a = str;
        this.f6972b = i10;
        this.f6973c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.m.a(this.f6971a, gVar.f6971a) && this.f6972b == gVar.f6972b && this.f6973c == gVar.f6973c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6973c) + w.c.d(this.f6972b, this.f6971a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb2.append(this.f6971a);
        sb2.append(", generation=");
        sb2.append(this.f6972b);
        sb2.append(", systemId=");
        return oi.k.l(sb2, this.f6973c, ')');
    }
}

package hb;

public final class i {

    public final String f6976a;

    public final int f6977b;

    public i(String str, int i10) {
        kotlin.jvm.internal.m.e(str, "workSpecId");
        this.f6976a = str;
        this.f6977b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.m.a(this.f6976a, iVar.f6976a) && this.f6977b == iVar.f6977b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6977b) + (this.f6976a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f6976a);
        sb2.append(", generation=");
        return oi.k.l(sb2, this.f6977b, ')');
    }
}

package ys;

public final class e {
    public final String a;
    public final d b;
    public final int c;
    public final int d;
    public final boolean e;

    public e(String id, d dVar, int i, int i2, boolean z) {
        kotlin.jvm.internal.m.e(id, "id");
        this.a = id;
        this.b = dVar;
        this.c = i;
        this.d = i2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.m.a(this.a, eVar.a) && kotlin.jvm.internal.m.a(this.b, eVar.b) && this.c == eVar.c && this.d == eVar.d && this.e == eVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        d dVar = this.b;
        return Boolean.hashCode(this.e) + w.c.d(this.d, w.c.d(this.c, (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsightsSurahRowDvo(id=");
        sb.append(this.a);
        sb.append(", surah=");
        sb.append(this.b);
        sb.append(", minutes=");
        w.c.u(sb, this.c, ", percentage=", this.d, ", isOther=");
        return g4.c.l(sb, this.e, ")");
    }
}

package yu;

import kotlin.jvm.internal.m;

public final class a {
    public final z00.e a;
    public final int b;
    public final int c;
    public final su.e d;
    public final su.c e;

    public a(z00.e eVar, int i, int i2, su.e repeatCount, su.c cVar) {
        m.e(repeatCount, "repeatCount");
        this.a = eVar;
        this.b = i;
        this.c = i2;
        this.d = repeatCount;
        this.e = cVar;
    }

    public static a a(a aVar, int i, int i2, su.e eVar, int i3) {
        z00.e eVar2 = aVar.a;
        if ((i3 & 2) != 0) {
            i = aVar.b;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = aVar.c;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            eVar = aVar.d;
        }
        su.e repeatCount = eVar;
        su.c cVar = aVar.e;
        aVar.getClass();
        m.e(repeatCount, "repeatCount");
        return new a(eVar2, i4, i5, repeatCount, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && m.a(this.e, aVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + w.c.d(this.c, w.c.d(this.b, this.a.hashCode() * 31, 31), 31)) * 31;
        su.c cVar = this.e;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "MemorizationDraft(ayahRange=" + this.a + ", from=" + this.b + ", to=" + this.c + ", repeatCount=" + this.d + ", activePlan=" + this.e + ")";
    }
}

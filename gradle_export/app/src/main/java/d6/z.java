package d6;

public final class z {

    public final s1 f4719a;

    public final int f4720b;

    public final j6.a f4721c;

    public final j6.b f4722d;

    public z(s1 s1Var, int i10, j6.a aVar, j6.b bVar) {
        this.f4719a = s1Var;
        this.f4720b = i10;
        this.f4721c = aVar;
        this.f4722d = bVar;
    }

    public z(s1 s1Var, int i10, j6.a aVar, j6.b bVar, int i11) {
        this(s1Var, i10, (i11 & 4) != 0 ? null : aVar, (i11 & 8) != 0 ? null : bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f4719a == zVar.f4719a && this.f4720b == zVar.f4720b && kotlin.jvm.internal.m.a(this.f4721c, zVar.f4721c) && kotlin.jvm.internal.m.a(this.f4722d, zVar.f4722d);
    }

    public final int hashCode() {
        int iD = w.c.d(this.f4720b, this.f4719a.hashCode() * 31, 31);
        j6.a aVar = this.f4721c;
        int iHashCode = (iD + (aVar == null ? 0 : Integer.hashCode(aVar.f8170a))) * 31;
        j6.b bVar = this.f4722d;
        return iHashCode + (bVar != null ? Integer.hashCode(bVar.f8171a) : 0);
    }

    public final String toString() {
        return "ContainerSelector(type=" + this.f4719a + ", numChildren=" + this.f4720b + ", horizontalAlignment=" + this.f4721c + ", verticalAlignment=" + this.f4722d + ')';
    }
}

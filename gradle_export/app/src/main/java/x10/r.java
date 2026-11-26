package x10;

public final class r {
    public static final r d = new r(z.STRICT, 6);
    public final z a;
    public final g00.g b;
    public final z c;

    public r(z zVar, int i) {
        this(zVar, (i & 2) != 0 ? new g00.g(1, 0, 0) : null, zVar);
    }

    public r(z zVar, g00.g gVar, z zVar2) {
        this.a = zVar;
        this.b = gVar;
        this.c = zVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.a == rVar.a && kotlin.jvm.internal.m.a(this.b, rVar.b) && this.c == rVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        g00.g gVar = this.b;
        return this.c.hashCode() + ((iHashCode + (gVar == null ? 0 : gVar.D)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.a + ", sinceVersion=" + this.b + ", reportLevelAfter=" + this.c + ')';
    }
}

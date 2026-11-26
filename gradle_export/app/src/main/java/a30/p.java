package a30;

public final class p {
    public final Object a;
    public final Object b;
    public final Object c;
    public final k20.f d;
    public final String e;

    public p(Object obj, Object obj2, k20.f fVar, k20.f fVar2, String filePath) {
        kotlin.jvm.internal.m.e(filePath, "filePath");
        this.a = obj;
        this.b = obj2;
        this.c = fVar;
        this.d = fVar2;
        this.e = filePath;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a.equals(pVar.a) && kotlin.jvm.internal.m.a(this.b, pVar.b) && kotlin.jvm.internal.m.a(this.c, pVar.c) && this.d.equals(pVar.d) && kotlin.jvm.internal.m.a(this.e, pVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncompatibleVersionErrorData(actualVersion=");
        sb.append(this.a);
        sb.append(", compilerVersion=");
        sb.append(this.b);
        sb.append(", languageVersion=");
        sb.append(this.c);
        sb.append(", expectedVersion=");
        sb.append(this.d);
        sb.append(", filePath=");
        return g4.c.k(sb, this.e, ')');
    }
}

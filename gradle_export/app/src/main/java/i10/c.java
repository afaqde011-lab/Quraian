package i10;

public final class c {
    public final n20.b a;
    public final n20.b b;
    public final n20.b c;

    public c(n20.b bVar, n20.b bVar2, n20.b bVar3) {
        this.a = bVar;
        this.b = bVar2;
        this.c = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.m.a(this.a, cVar.a) && kotlin.jvm.internal.m.a(this.b, cVar.b) && kotlin.jvm.internal.m.a(this.c, cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.a + ", kotlinReadOnly=" + this.b + ", kotlinMutable=" + this.c + ')';
    }
}

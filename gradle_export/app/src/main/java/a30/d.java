package a30;

import j10.n0;

public final class d {
    public final k20.g a;
    public final i20.k b;
    public final k20.a c;
    public final n0 d;

    public d(k20.g nameResolver, i20.k classProto, k20.a aVar, n0 sourceElement) {
        kotlin.jvm.internal.m.e(nameResolver, "nameResolver");
        kotlin.jvm.internal.m.e(classProto, "classProto");
        kotlin.jvm.internal.m.e(sourceElement, "sourceElement");
        this.a = nameResolver;
        this.b = classProto;
        this.c = aVar;
        this.d = sourceElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.m.a(this.a, dVar.a) && kotlin.jvm.internal.m.a(this.b, dVar.b) && kotlin.jvm.internal.m.a(this.c, dVar.c) && kotlin.jvm.internal.m.a(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.a + ", classProto=" + this.b + ", metadataVersion=" + this.c + ", sourceElement=" + this.d + ')';
    }
}

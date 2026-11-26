package j6;

public final class o implements b6.l {

    public final n f8190a;

    public final n f8191b;

    public final n f8192c;

    public final n f8193d;

    public final n f8194e;

    public final n f8195f;

    public o(n nVar, n nVar2, n nVar3, n nVar4) {
        this(new n(0.0f, 3), nVar, nVar2, new n(0.0f, 3), nVar3, nVar4);
    }

    public o(n nVar, n nVar2, n nVar3, n nVar4, n nVar5, n nVar6) {
        this.f8190a = nVar;
        this.f8191b = nVar2;
        this.f8192c = nVar3;
        this.f8193d = nVar4;
        this.f8194e = nVar5;
        this.f8195f = nVar6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.m.a(this.f8190a, oVar.f8190a) && kotlin.jvm.internal.m.a(this.f8191b, oVar.f8191b) && kotlin.jvm.internal.m.a(this.f8192c, oVar.f8192c) && kotlin.jvm.internal.m.a(this.f8193d, oVar.f8193d) && kotlin.jvm.internal.m.a(this.f8194e, oVar.f8194e) && kotlin.jvm.internal.m.a(this.f8195f, oVar.f8195f);
    }

    public final int hashCode() {
        return this.f8195f.hashCode() + ((this.f8194e.hashCode() + ((this.f8193d.hashCode() + ((this.f8192c.hashCode() + ((this.f8191b.hashCode() + (this.f8190a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PaddingModifier(left=" + this.f8190a + ", start=" + this.f8191b + ", top=" + this.f8192c + ", right=" + this.f8193d + ", end=" + this.f8194e + ", bottom=" + this.f8195f + ')';
    }
}

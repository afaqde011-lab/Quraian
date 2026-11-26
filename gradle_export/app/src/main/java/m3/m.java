package m3;

public final class m extends o {

    public final String f10480a;

    public final o0 f10481b;

    public final p f10482c;

    public m(String str, o0 o0Var, p pVar) {
        this.f10480a = str;
        this.f10481b = o0Var;
        this.f10482c = pVar;
    }

    @Override
    public final p a() {
        return this.f10482c;
    }

    @Override
    public final o0 b() {
        return this.f10481b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.m.a(this.f10480a, mVar.f10480a) && kotlin.jvm.internal.m.a(this.f10481b, mVar.f10481b) && kotlin.jvm.internal.m.a(this.f10482c, mVar.f10482c);
    }

    public final int hashCode() {
        int iHashCode = this.f10480a.hashCode() * 31;
        o0 o0Var = this.f10481b;
        int iHashCode2 = (iHashCode + (o0Var != null ? o0Var.hashCode() : 0)) * 31;
        p pVar = this.f10482c;
        return iHashCode2 + (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        return g4.c.k(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f10480a, ')');
    }
}

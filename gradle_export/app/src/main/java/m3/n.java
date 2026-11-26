package m3;

public final class n extends o {

    public final String f10493a;

    public final o0 f10494b;

    public final p f10495c;

    public n(String str, o0 o0Var, p pVar) {
        this.f10493a = str;
        this.f10494b = o0Var;
        this.f10495c = pVar;
    }

    @Override
    public final p a() {
        return this.f10495c;
    }

    @Override
    public final o0 b() {
        return this.f10494b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.m.a(this.f10493a, nVar.f10493a) && kotlin.jvm.internal.m.a(this.f10494b, nVar.f10494b) && kotlin.jvm.internal.m.a(this.f10495c, nVar.f10495c);
    }

    public final int hashCode() {
        int iHashCode = this.f10493a.hashCode() * 31;
        o0 o0Var = this.f10494b;
        int iHashCode2 = (iHashCode + (o0Var != null ? o0Var.hashCode() : 0)) * 31;
        p pVar = this.f10495c;
        return iHashCode2 + (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        return g4.c.k(new StringBuilder("LinkAnnotation.Url(url="), this.f10493a, ')');
    }
}

package mb;

public final class x implements h0.r {

    public final h0.r f10818a;

    public final j f10819b;

    public final b2.d f10820c;

    public final z2.p f10821d;

    public x(h0.r rVar, j jVar, b2.d dVar, z2.p pVar) {
        this.f10818a = rVar;
        this.f10819b = jVar;
        this.f10820c = dVar;
        this.f10821d = pVar;
    }

    @Override
    public final b2.r a(b2.r rVar, b2.d dVar) {
        return this.f10818a.a(rVar, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.m.a(this.f10818a, xVar.f10818a) && this.f10819b.equals(xVar.f10819b) && kotlin.jvm.internal.m.a(this.f10820c, xVar.f10820c) && kotlin.jvm.internal.m.a(this.f10821d, xVar.f10821d) && Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + w.c.c(1.0f, (this.f10821d.hashCode() + ((this.f10820c.hashCode() + ((this.f10819b.hashCode() + (this.f10818a.hashCode() * 31)) * 961)) * 31)) * 31, 961);
    }

    public final String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.f10818a + ", painter=" + this.f10819b + ", contentDescription=null, alignment=" + this.f10820c + ", contentScale=" + this.f10821d + ", alpha=1.0, colorFilter=null, clipToBounds=true)";
    }
}

package g20;

import c30.x;

public final class o implements c30.k {
    public final o10.c A;

    public o(o10.c cVar, x xVar, c30.j jVar) {
        this.A = cVar;
    }

    @Override
    public final String a() {
        return g4.c.k(new StringBuilder("Class '"), p10.d.a(this.A.a).a().a.a, '\'');
    }

    public final String toString() {
        return o.class.getSimpleName() + ": " + this.A;
    }
}

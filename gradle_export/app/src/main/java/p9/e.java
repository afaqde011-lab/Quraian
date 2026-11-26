package p9;

import cq.k;
import java.util.Map;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l1.r1;

public final class e {

    public final Object f12467a;

    public final Object f12468b;

    public final Map f12469c;

    public final v1.c f12470d;

    public e(Object obj, Object obj2, Map map, v1.c cVar) {
        this.f12467a = obj;
        this.f12468b = obj2;
        this.f12469c = map;
        this.f12470d = cVar;
    }

    public e(e eVar, v1.c cVar) {
        this(eVar.f12467a, eVar.f12468b, eVar.f12469c, cVar);
    }

    public final void a(j jVar, int i10) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(295512821);
        int i11 = (g0Var.g(this) ? 4 : 2) | i10;
        if (g0Var.S(i11 & 1, (i11 & 3) != 2)) {
            this.f12470d.invoke(this.f12467a, g0Var, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new k(this, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return m.a(this.f12467a, eVar.f12467a) && m.a(this.f12468b, eVar.f12468b) && m.a(this.f12469c, eVar.f12469c) && this.f12470d == eVar.f12470d;
    }

    public final int hashCode() {
        return (this.f12470d.hashCode() * 31) + (this.f12469c.hashCode() * 31) + (this.f12468b.hashCode() * 31) + (this.f12467a.hashCode() * 31);
    }

    public final String toString() {
        return "NavEntry(key=" + this.f12467a + ", contentKey=" + this.f12468b + ", metadata=" + this.f12469c + ", content=" + this.f12470d + ')';
    }
}

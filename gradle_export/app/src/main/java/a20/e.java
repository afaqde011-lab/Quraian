package a20;

import c3.y2;
import d30.j;
import d30.l;
import g10.o;
import h00.n;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import oj.q;
import q30.r;
import ri.t1;

public final class e implements k10.h {
    public final q A;
    public final e20.b B;
    public final boolean C;
    public final j D;

    public e(q c, e20.b annotationOwner, boolean z) {
        m.e(c, "c");
        m.e(annotationOwner, "annotationOwner");
        this.A = c;
        this.B = annotationOwner;
        this.C = z;
        this.D = ((l) ((b) c.B).a).c(new d(this, 0));
    }

    @Override
    public final boolean d(n20.c cVar) {
        return t1.B(this, cVar);
    }

    @Override
    public final k10.b f(n20.c fqName) {
        k10.b bVar;
        m.e(fqName, "fqName");
        e20.b bVar2 = this.B;
        p10.e eVarA = bVar2.a(fqName);
        if (eVarA != null && (bVar = (k10.b) this.D.invoke(eVarA)) != null) {
            return bVar;
        }
        n20.e eVar = y10.c.a;
        return y10.c.a(fqName, bVar2, this.A);
    }

    @Override
    public final boolean isEmpty() {
        return this.B.getAnnotations().isEmpty();
    }

    @Override
    public final Iterator iterator() {
        e20.b bVar = this.B;
        r rVarR0 = q30.l.r0(h00.q.D0(bVar.getAnnotations()), this.D);
        n20.e eVar = y10.c.a;
        return new q30.e(new q30.f(q30.l.m0(n.l0(new q30.j[]{rVarR0, new y2(y10.c.a(o.m, bVar, this.A), 5)})), false, new pp.d(17)));
    }
}

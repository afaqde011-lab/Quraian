package e2;

import b2.q;
import b2.v;
import b3.m;
import b3.n0;
import b3.n2;
import b3.o2;
import b3.x;
import kh.o;
import kotlin.jvm.internal.z;
import u00.k;

public final class g extends q implements o2, h, x {
    public final k O;
    public g P;
    public h Q;
    public long R;

    public g(v vVar, int i10) {
        this.O = (i10 & 2) != 0 ? null : vVar;
        this.R = 0L;
    }

    @Override
    public final void E0(d dVar) {
        h hVar = this.Q;
        if (hVar != null) {
            hVar.E0(dVar);
            return;
        }
        g gVar = this.P;
        if (gVar != null) {
            gVar.E0(dVar);
        }
    }

    @Override
    public final void V0(d dVar) {
        h hVar = this.Q;
        if (hVar != null) {
            hVar.V0(dVar);
            return;
        }
        g gVar = this.P;
        if (gVar != null) {
            gVar.V0(dVar);
        }
    }

    @Override
    public final void d(long j9) {
        this.R = j9;
    }

    @Override
    public final boolean l0(d dVar) {
        g gVar = this.P;
        if (gVar != null) {
            return gVar.l0(dVar);
        }
        h hVar = this.Q;
        if (hVar != null) {
            return hVar.l0(dVar);
        }
        return false;
    }

    @Override
    public final void l1(d dVar) {
        b3.a aVar = new b3.a(dVar, 13);
        if (aVar.invoke(this) != n2.A) {
            return;
        }
        m.E(this, aVar);
    }

    @Override
    public final Object o() {
        return f.f5050a;
    }

    @Override
    public final void s(d dVar) {
        h hVar = this.Q;
        if (hVar != null) {
            hVar.s(dVar);
        }
        g gVar = this.P;
        if (gVar != null) {
            gVar.s(dVar);
        }
        this.P = null;
    }

    @Override
    public final void u1() {
        this.Q = null;
        this.P = null;
    }

    @Override
    public final void v0(d dVar) {
        o2 o2Var;
        g gVar;
        g gVar2 = this.P;
        if (gVar2 == null || !o.j(gVar2, p30.f.g0(dVar))) {
            if (this.A.N) {
                z zVar = new z();
                m.E(this, new n0(zVar, this, dVar, 3));
                o2Var = (o2) zVar.A;
            } else {
                o2Var = null;
            }
            gVar = (g) o2Var;
        } else {
            gVar = gVar2;
        }
        if (gVar != null && gVar2 == null) {
            gVar.V0(dVar);
            gVar.v0(dVar);
            h hVar = this.Q;
            if (hVar != null) {
                hVar.s(dVar);
            }
        } else if (gVar == null && gVar2 != null) {
            h hVar2 = this.Q;
            if (hVar2 != null) {
                hVar2.V0(dVar);
                hVar2.v0(dVar);
            }
            gVar2.s(dVar);
        } else if (!kotlin.jvm.internal.m.a(gVar, gVar2)) {
            if (gVar != null) {
                gVar.V0(dVar);
                gVar.v0(dVar);
            }
            if (gVar2 != null) {
                gVar2.s(dVar);
            }
        } else if (gVar != null) {
            gVar.v0(dVar);
        } else {
            h hVar3 = this.Q;
            if (hVar3 != null) {
                hVar3.v0(dVar);
            }
        }
        this.P = gVar;
    }
}

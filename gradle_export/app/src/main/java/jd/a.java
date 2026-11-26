package jd;

import a40.a0;
import a40.c0;
import a40.z;
import androidx.lifecycle.n0;
import as.y0;
import g1.b5;
import h1.l;
import id.g;
import kotlin.jvm.internal.m;

public final class a implements hd.c {
    public rc.c C;
    public b5 E;
    public g F;
    public final hd.b A = hd.b.C;
    public final l B = new l(2);
    public final boolean D = true;

    @Override
    public final void a(rc.c cVar) {
        this.C = cVar;
        l lVar = this.B;
        lVar.getClass();
        lVar.B = cVar;
        b5 b5Var = new b5(cVar);
        this.E = b5Var;
        b5Var.f5735a = true;
        z zVar = (z) b5Var.f5742h;
        rc.c cVar2 = (rc.c) b5Var.f5737c;
        c0.y(zVar, cVar2.f13156f, (a0) null, new y0(b5Var, (k00.c) null, 2), 2);
        c0.y(zVar, cVar2.f13155e, (a0) null, new n0(b5Var, null), 2);
        this.F = new g(cVar.d(), cVar, cVar.f(), cVar.f13151a, this);
        c cVar3 = new c(0);
        d();
        lVar.J0(cVar3);
    }

    @Override
    public final gd.a b(gd.a aVar) {
        return null;
    }

    public final void c(gd.a aVar) {
        if (aVar.f6289a != null || aVar.f6290b != null) {
            c0.y(d().f13153c, d().f13156f, (a0) null, new g6.a(this, aVar, null, 10), 2);
        } else {
            d().f().c("Event is invalid for missing information like userId and deviceId. Dropping event: " + aVar.a());
        }
    }

    public final rc.c d() {
        rc.c cVar = this.C;
        if (cVar != null) {
            return cVar;
        }
        m.k("amplitude");
        throw null;
    }

    @Override
    public final hd.b getType() {
        return this.A;
    }
}

package x6;

import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.media3.common.q;
import qd.s0;

public final class b extends f0 {
    public final me.d l;
    public Object m;

    public q f16466n;

    public b(me.d dVar) {
        this.l = dVar;
        if (dVar.f10881a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        dVar.f10881a = this;
    }

    @Override
    public final void e() {
        me.d dVar = this.l;
        dVar.f10882b = true;
        dVar.f10884d = false;
        dVar.f10883c = false;
        dVar.f10889i.drainPermits();
        dVar.a();
        dVar.f10887g = new y6.a(dVar);
        dVar.b();
    }

    @Override
    public final void f() {
        this.l.f10882b = false;
    }

    @Override
    public final void g(g0 g0Var) {
        super.g(g0Var);
        this.m = null;
        this.f16466n = null;
    }

    public final void j() {
        ?? r4 = this.m;
        q qVar = this.f16466n;
        if (r4 == 0 || qVar == null) {
            return;
        }
        super.g(qVar);
        d(r4, qVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LoaderInfo{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" #0 : ");
        s0.X(this.l, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}

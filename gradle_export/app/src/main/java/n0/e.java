package n0;

import b2.q;
import kotlin.jvm.internal.m;

public final class e extends q {
    public c O;

    public e(c cVar) {
        this.O = cVar;
    }

    @Override
    public final boolean q1() {
        return false;
    }

    @Override
    public final void t1() {
        c cVar = this.O;
        if (cVar != null) {
            cVar.f10997a.j(this);
        }
        if (cVar != null) {
            cVar.f10997a.b(this);
        }
        this.O = cVar;
    }

    @Override
    public final void u1() {
        c cVar = this.O;
        if (cVar != null) {
            m.c(cVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            cVar.f10997a.j(this);
        }
    }
}

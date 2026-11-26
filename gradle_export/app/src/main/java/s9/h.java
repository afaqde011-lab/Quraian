package s9;

import ab.r;
import d.e0;
import d40.p1;

public abstract class h {

    public c f13923a;

    public boolean f13924b;

    public final void a() {
        c cVar = this.f13923a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.f13924b) {
            cVar.d(this, null);
        }
        i iVar = cVar.f13911b;
        r rVar = cVar.f13910a;
        iVar.getClass();
        if (equals(iVar.f13932h) && -1 == iVar.f13931g) {
            e eVarC = iVar.f13930f;
            if (eVarC == null) {
                eVarC = iVar.c(-1);
            }
            iVar.f13930f = null;
            iVar.f13931g = 0;
            iVar.f13932h = null;
            j jVar = j.f13937a;
            if (eVarC == null) {
                ((e0) rVar.B).f4382a.run();
            } else {
                eVarC.f13917d = jVar;
                eVarC.b();
            }
            p1 p1Var = iVar.f13925a;
            p1Var.getClass();
            p1Var.k((Object) null, jVar);
        }
        this.f13924b = false;
    }

    public void b(boolean z10) {
    }
}

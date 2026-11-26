package s9;

import ab.r;
import d40.p1;
import java.util.LinkedHashSet;

public final class c {

    public final r f13910a;

    public final i f13911b = new i();

    public final LinkedHashSet f13912c;

    public final LinkedHashSet f13913d;

    public c(r rVar) {
        this.f13910a = rVar;
        new LinkedHashSet();
        this.f13912c = new LinkedHashSet();
        this.f13913d = new LinkedHashSet();
    }

    public static void a(c cVar, e eVar) {
        cVar.getClass();
        kotlin.jvm.internal.m.e(eVar, "handler");
        if (cVar.f13912c.add(eVar)) {
            i iVar = cVar.f13911b;
            iVar.getClass();
            if (eVar.f13920g == null) {
                iVar.f13929e.addFirst(eVar);
                eVar.f13920g = cVar;
                iVar.b();
            } else {
                throw new IllegalArgumentException(("Handler '" + eVar + "' is already registered with a dispatcher").toString());
            }
        }
    }

    public final void b(h hVar) {
        if (this.f13913d.add(hVar)) {
            this.f13911b.a(this, hVar, -1);
        }
    }

    public final void c(m mVar, int i10) {
        if (i10 != 1 && i10 != 0) {
            throw new IllegalArgumentException(g4.c.f(i10, "Unsupported priority value: ").toString());
        }
        if (this.f13913d.add(mVar)) {
            this.f13911b.a(this, mVar, i10);
        }
    }

    public final void d(h hVar, b bVar) {
        i iVar = this.f13911b;
        iVar.getClass();
        if (iVar.f13931g != 0) {
            return;
        }
        e eVarC = iVar.c(-1);
        iVar.f13930f = eVarC;
        iVar.f13931g = -1;
        iVar.f13932h = hVar;
        if (bVar != null) {
            if (eVarC != null) {
                eVarC.f13917d = new k(bVar, -1);
                eVarC.d(bVar);
            }
            p1 p1Var = iVar.f13925a;
            k kVar = new k(bVar, -1);
            p1Var.getClass();
            p1Var.k((Object) null, kVar);
        }
    }
}

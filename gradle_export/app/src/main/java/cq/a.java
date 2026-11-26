package cq;

import d40.p1;
import gx.o;
import h00.q;
import kotlin.NoWhenBranchMatchedException;

public final class a {
    public final b a;
    public final rr.b b;
    public final gx.e c;
    public final fw.c d;
    public final zs.b e;
    public final sy.c f;
    public final ey.b g;

    public a(b bVar, rr.b bVar2, gx.e eVar, fw.c cVar, zs.b bVar3, sy.c cVar2, ey.b bVar4) {
        this.a = bVar;
        this.b = bVar2;
        this.c = eVar;
        this.d = cVar;
        this.e = bVar3;
        this.f = cVar2;
        this.g = bVar4;
    }

    public final j a(i iVar) {
        if (kotlin.jvm.internal.m.a(iVar, c.b)) {
            return this.b;
        }
        if (kotlin.jvm.internal.m.a(iVar, f.b)) {
            return this.c;
        }
        if (kotlin.jvm.internal.m.a(iVar, e.b)) {
            return this.d;
        }
        if (kotlin.jvm.internal.m.a(iVar, d.b)) {
            return this.e;
        }
        if (kotlin.jvm.internal.m.a(iVar, h.b)) {
            return this.f;
        }
        if (kotlin.jvm.internal.m.a(iVar, g.b)) {
            return this.g;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b() {
        b bVar = this.a;
        j jVarA = a((i) bVar.b.getValue());
        if (jVarA.b().size() > 1) {
            jVarA.a();
        } else {
            bVar.a();
        }
    }

    public final void c(i tab, p9.g route) {
        kotlin.jvm.internal.m.e(tab, "tab");
        kotlin.jvm.internal.m.e(route, "route");
        e(tab, route);
    }

    public final void d(p9.g route) {
        i iVar;
        i iVar2;
        kotlin.jvm.internal.m.e(route, "route");
        p1 p1Var = this.a.b;
        if (route instanceof rr.j) {
            iVar = c.b;
        } else if (route instanceof zs.e) {
            Object value = p1Var.getValue();
            iVar2 = c.b;
            if (kotlin.jvm.internal.m.a(value, iVar2)) {
                iVar = iVar2;
            } else {
                iVar = d.b;
            }
        } else if (route instanceof sy.h) {
            iVar = h.b;
        } else if (route instanceof o) {
            i iVar3 = (i) p1Var.getValue();
            iVar2 = c.b;
            if (kotlin.jvm.internal.m.a(iVar3, iVar2)) {
                iVar = iVar2;
            } else {
                iVar2 = g.b;
                if (kotlin.jvm.internal.m.a(iVar3, iVar2)) {
                    iVar = iVar2;
                } else {
                    iVar = f.b;
                }
            }
        } else if (route instanceof fw.g) {
            Object value2 = p1Var.getValue();
            iVar2 = c.b;
            if (kotlin.jvm.internal.m.a(value2, iVar2)) {
                iVar = iVar2;
            } else {
                iVar = e.b;
            }
        } else {
            iVar = route instanceof ey.f ? g.b : (i) p1Var.getValue();
        }
        e(iVar, route);
    }

    public final void e(i iVar, p9.g gVar) {
        b bVar = this.a;
        if (!kotlin.jvm.internal.m.a(bVar.b.getValue(), iVar)) {
            bVar.b(iVar);
        }
        j jVarA = a(iVar);
        if (kotlin.jvm.internal.m.a(q.U0(jVarA.b()), gVar)) {
            return;
        }
        jVarA.c(gVar);
    }
}

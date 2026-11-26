package u20;

import c3.y2;
import f30.g;
import g10.i;
import h00.q;
import i10.n;
import j10.e0;
import j10.h;
import j10.k0;
import j10.l0;
import java.util.Collection;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import m10.c0;
import m10.g0;
import m10.r0;
import n20.e;
import n30.l;
import q30.j;
import q30.o;
import u00.k;

public abstract class d {
    public static final int a = 0;

    static {
        e.e("value");
    }

    public static final boolean a(r0 r0Var) {
        Boolean boolH = l.h(va.a.R(r0Var), a.B, c.A);
        m.d(boolH, "ifAny(...)");
        return boolH.booleanValue();
    }

    public static j10.c b(j10.c cVar, k kVar) {
        m.e(cVar, "<this>");
        return (j10.c) l.f(va.a.R(cVar), new a(1), new n(new z(), kVar));
    }

    public static final n20.c c(j10.l lVar) {
        m.e(lVar, "<this>");
        n20.d dVarH = h(lVar);
        if (!dVarH.d()) {
            dVarH = null;
        }
        if (dVarH != null) {
            return dVarH.i();
        }
        return null;
    }

    public static final j10.e d(k10.b bVar) {
        m.e(bVar, "<this>");
        h hVarG = bVar.getType().m0().g();
        if (hVarG instanceof j10.e) {
            return (j10.e) hVarG;
        }
        return null;
    }

    public static final i e(j10.k kVar) {
        m.e(kVar, "<this>");
        return j(kVar).d();
    }

    public static final n20.b f(h hVar) {
        j10.k kVarL;
        n20.b bVarF;
        if (hVar == null || (kVarL = hVar.l()) == null) {
            return null;
        }
        if (kVarL instanceof e0) {
            n20.c cVar = ((c0) ((e0) kVarL)).F;
            e name = hVar.getName();
            m.d(name, "getName(...)");
            return new n20.b(cVar, name);
        }
        if (!(kVarL instanceof j10.i) || (bVarF = f((h) kVarL)) == null) {
            return null;
        }
        e name2 = hVar.getName();
        m.d(name2, "getName(...)");
        return bVarF.d(name2);
    }

    public static final n20.c g(j10.k kVar) {
        m.e(kVar, "<this>");
        n20.c cVarG = q20.d.g(kVar);
        return cVarG != null ? cVarG : q20.d.f(kVar.l()).a(kVar.getName()).i();
    }

    public static final n20.d h(j10.k kVar) {
        m.e(kVar, "<this>");
        n20.d dVarF = q20.d.f(kVar);
        m.d(dVarF, "getFqName(...)");
        return dVarF;
    }

    public static final void i(j10.z zVar) {
        m.e(zVar, "<this>");
        if (zVar.D(g.a) != null) {
            throw new ClassCastException();
        }
    }

    public static final j10.z j(j10.k kVar) {
        m.e(kVar, "<this>");
        j10.z zVarC = q20.d.c(kVar);
        m.d(zVarC, "getContainingModule(...)");
        return zVarC;
    }

    public static final j10.c k(j10.c cVar) {
        m.e(cVar, "<this>");
        if (!(cVar instanceof k0)) {
            return cVar;
        }
        l0 l0VarY0 = ((g0) ((k0) cVar)).Y0();
        m.d(l0VarY0, "getCorrespondingProperty(...)");
        return l0VarY0;
    }

    public static final q30.g l(j10.c cVar) {
        m.e(cVar, "<this>");
        j y2Var = new y2(cVar, 5);
        Collection collectionM = cVar.m();
        m.d(collectionM, "getOverriddenDescriptors(...)");
        return q30.l.m0(h00.n.l0(new j[]{y2Var, new q30.g(q.D0(collectionM), new b(1), o.A)}));
    }
}

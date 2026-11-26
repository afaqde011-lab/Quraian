package q20;

import e30.w;
import e30.x0;
import j10.a0;
import j10.l0;
import j10.s0;
import j10.u0;
import j10.v;
import kh.o;
import m10.j0;

public abstract class f {
    public static final int a = 0;

    static {
        n20.c cVar = new n20.c("kotlin.jvm.JvmInline");
        cVar.b();
        n20.e eVarG = cVar.a.g();
        n20.c cVar2 = n20.c.c;
        o.R(eVarG).a.c();
        new n20.c("kotlin.jvm.JvmName");
    }

    public static final boolean a(j10.c cVar) {
        s0 s0VarJ0;
        kotlin.jvm.internal.m.e(cVar, "<this>");
        if (!(cVar instanceof j0)) {
            return false;
        }
        l0 l0VarY0 = ((j0) cVar).Y0();
        kotlin.jvm.internal.m.d(l0VarY0, "getCorrespondingProperty(...)");
        if (l0VarY0.X() != null) {
            return false;
        }
        j10.k kVarL = l0VarY0.l();
        j10.e eVar = kVarL instanceof j10.e ? (j10.e) kVarL : null;
        if (eVar == null || (s0VarJ0 = eVar.j0()) == null) {
            return false;
        }
        n20.e name = l0VarY0.getName();
        kotlin.jvm.internal.m.d(name, "getName(...)");
        return s0VarJ0.a(name);
    }

    public static final boolean b(j10.k kVar) {
        kotlin.jvm.internal.m.e(kVar, "<this>");
        return (kVar instanceof j10.e) && (((j10.e) kVar).j0() instanceof v);
    }

    public static final boolean c(j10.k kVar) {
        kotlin.jvm.internal.m.e(kVar, "<this>");
        return (kVar instanceof j10.e) && (((j10.e) kVar).j0() instanceof a0);
    }

    public static final boolean d(u0 u0Var) {
        if (u0Var.X() != null) {
            return false;
        }
        j10.k kVarL = u0Var.l();
        n20.e eVar = null;
        j10.e eVar2 = kVarL instanceof j10.e ? (j10.e) kVarL : null;
        if (eVar2 != null) {
            int i = u20.d.a;
            s0 s0VarJ0 = eVar2.j0();
            v vVar = s0VarJ0 instanceof v ? (v) s0VarJ0 : null;
            if (vVar != null) {
                eVar = vVar.a;
            }
        }
        return kotlin.jvm.internal.m.a(eVar, u0Var.getName());
    }

    public static final boolean e(j10.k kVar) {
        kotlin.jvm.internal.m.e(kVar, "<this>");
        return b(kVar) || c(kVar);
    }

    public static final boolean f(w wVar) {
        j10.h hVarG = wVar.m0().g();
        if (hVarG != null) {
            return e(hVarG);
        }
        return false;
    }

    public static final boolean g(w wVar) {
        kotlin.jvm.internal.m.e(wVar, "<this>");
        j10.h hVarG = wVar.m0().g();
        return (hVarG == null || !c(hVarG) || x0.e(wVar)) ? false : true;
    }

    public static final e30.a0 h(w wVar) {
        kotlin.jvm.internal.m.e(wVar, "<this>");
        j10.h hVarG = wVar.m0().g();
        j10.e eVar = hVarG instanceof j10.e ? (j10.e) hVarG : null;
        if (eVar != null) {
            int i = u20.d.a;
            s0 s0VarJ0 = eVar.j0();
            v vVar = s0VarJ0 instanceof v ? (v) s0VarJ0 : null;
            if (vVar != null) {
                return (e30.a0) vVar.b;
            }
        }
        return null;
    }
}

package c20;

import a1.u0;
import e30.a0;
import e30.a1;
import e30.f0;
import e30.h0;
import e30.m0;
import e30.p0;
import e30.s0;
import e30.v0;
import e30.w;
import g00.k;
import g30.l;
import h00.r;
import j10.r0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import x20.n;

public final class g extends s0 {
    public static final a c;
    public static final a d;
    public final u0 b = new u0(new e());

    static {
        v0 v0Var = v0.B;
        c = a.a(p30.f.t0(v0Var, false, null, 5), b.C, false, null, null, 61);
        d = a.a(p30.f.t0(v0Var, false, null, 5), b.B, false, null, null, 61);
    }

    @Override
    public final p0 d(w wVar) {
        return new f0(h(wVar, new a(v0.B, false, false, null, 62)));
    }

    public final k g(a0 a0Var, j10.e eVar, a aVar) {
        if (a0Var.m0().getParameters().isEmpty()) {
            return new k(a0Var, Boolean.FALSE);
        }
        if (g10.i.z(a0Var)) {
            p0 p0Var = (p0) a0Var.e0().get(0);
            a1 a1VarA = p0Var.a();
            w wVarB = p0Var.b();
            m.d(wVarB, "getType(...)");
            return new k(e30.c.u(a0Var.k0(), a0Var.m0(), va.a.R(new f0(h(wVarB, aVar), a1VarA)), a0Var.t0()), Boolean.FALSE);
        }
        if (e30.c.k(a0Var)) {
            return new k(l.c(g30.k.N, a0Var.m0().toString()), Boolean.FALSE);
        }
        n nVarU0 = eVar.u0(this);
        m.d(nVarU0, "getMemberScope(...)");
        h0 h0VarK0 = a0Var.k0();
        m0 m0VarF = eVar.f();
        m.d(m0VarF, "getTypeConstructor(...)");
        List<r0> parameters = eVar.f().getParameters();
        m.d(parameters, "getParameters(...)");
        ArrayList arrayList = new ArrayList(r.q0(parameters, 10));
        for (r0 r0Var : parameters) {
            m.b(r0Var);
            u0 u0Var = this.b;
            arrayList.add(e.a(r0Var, aVar, u0Var, u0Var.G(r0Var, aVar)));
        }
        return new k(e30.c.w(h0VarK0, m0VarF, arrayList, a0Var.t0(), nVarU0, new f(eVar, this, a0Var, aVar)), Boolean.TRUE);
    }

    public final w h(w wVar, a aVar) {
        j10.h hVarG = wVar.m0().g();
        if (hVarG instanceof r0) {
            aVar.getClass();
            return h(this.b.G((r0) hVarG, a.a(aVar, null, true, null, null, 59)), aVar);
        }
        if (!(hVarG instanceof j10.e)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + hVarG).toString());
        }
        j10.h hVarG2 = e30.c.G(wVar).m0().g();
        if (hVarG2 instanceof j10.e) {
            k kVarG = g(e30.c.m(wVar), (j10.e) hVarG, c);
            a0 a0Var = (a0) kVarG.A;
            boolean zBooleanValue = ((Boolean) kVarG.B).booleanValue();
            k kVarG2 = g(e30.c.G(wVar), (j10.e) hVarG2, d);
            a0 a0Var2 = (a0) kVarG2.A;
            return (zBooleanValue || ((Boolean) kVarG2.B).booleanValue()) ? new i(a0Var, a0Var2) : e30.c.f(a0Var, a0Var2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + hVarG2 + "\" while for lower it's \"" + hVarG + '\"').toString());
    }
}

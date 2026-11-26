package g30;

import e30.s0;
import e30.u0;
import h00.x;
import j10.n0;
import j10.p;
import j10.y;
import java.util.List;
import x20.n;

public final class a extends m10.k {
    public a(n20.e eVar) {
        l lVar = l.a;
        e eVar2 = l.b;
        y yVar = y.D;
        j10.f fVar = j10.f.A;
        d30.b bVar = d30.l.e;
        List list = x.A;
        super(eVar2, eVar, yVar, fVar, list, bVar);
        m10.i iVar = new m10.i(this, null, k10.g.a, true, 1, n0.n);
        iVar.m1(list, p.e);
        h hVar = h.SCOPE_FOR_ERROR_CLASS;
        String str = iVar.getName().A;
        kotlin.jvm.internal.m.d(str, "toString(...)");
        g gVarB = l.b(hVar, str, "");
        k kVar = k.V;
        iVar.H = new i(l.d(kVar, new String[0]), gVarB, kVar, list, false, new String[0]);
        e0(gVarB, w50.c.g0(iVar), iVar);
    }

    @Override
    public final j10.e e(u0 substitutor) {
        kotlin.jvm.internal.m.e(substitutor, "substitutor");
        return this;
    }

    @Override
    public final j10.l e(u0 substitutor) {
        kotlin.jvm.internal.m.e(substitutor, "substitutor");
        return this;
    }

    @Override
    public final n t(s0 s0Var, f30.f fVar) {
        h hVar = h.SCOPE_FOR_ERROR_CLASS;
        String str = getName().A;
        kotlin.jvm.internal.m.d(str, "toString(...)");
        return l.b(hVar, str, s0Var.toString());
    }

    @Override
    public final String toString() {
        String strB = getName().b();
        kotlin.jvm.internal.m.d(strB, "asString(...)");
        return strB;
    }
}

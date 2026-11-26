package x10;

import c3.y2;
import e30.u0;
import java.util.List;
import m10.l0;

public final class i implements q20.e {
    @Override
    public final int a(j10.b superDescriptor, j10.b subDescriptor, j10.e eVar) {
        kotlin.jvm.internal.m.e(superDescriptor, "superDescriptor");
        kotlin.jvm.internal.m.e(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof z10.e)) {
            return 3;
        }
        z10.e eVar2 = (z10.e) subDescriptor;
        if (!eVar2.getTypeParameters().isEmpty()) {
            return 3;
        }
        q20.i iVarI = q20.j.i(superDescriptor, subDescriptor);
        if ((iVarI != null ? iVarI.b() : 0) != 0) {
            return 3;
        }
        List listO = eVar2.O();
        kotlin.jvm.internal.m.d(listO, "getValueParameters(...)");
        q30.r rVarR0 = q30.l.r0(h00.q.D0(listO), d.E);
        e30.w wVar = eVar2.H;
        kotlin.jvm.internal.m.b(wVar);
        q30.g gVarM0 = q30.l.m0(h00.n.l0(new q30.j[]{rVarR0, new y2(wVar, 5)}));
        m10.u uVar = eVar2.J;
        q30.e eVar3 = new q30.e(q30.l.m0(h00.n.l0(new q30.j[]{gVarM0, h00.q.D0(va.a.T(uVar != null ? uVar.getType() : null))})));
        while (eVar3.hasNext()) {
            e30.w wVar2 = (e30.w) eVar3.next();
            if (!wVar2.e0().isEmpty() && !(wVar2.y0() instanceof c20.i)) {
                return 3;
            }
        }
        j10.b bVarBuild = (j10.b) superDescriptor.e(new u0(new c20.g()));
        if (bVarBuild == null) {
            return 3;
        }
        if (bVarBuild instanceof l0) {
            l0 l0Var = (l0) bVarBuild;
            if (!l0Var.getTypeParameters().isEmpty()) {
                bVarBuild = l0Var.n0().s().build();
                kotlin.jvm.internal.m.b(bVarBuild);
            }
        }
        int iB = q20.j.c.n(bVarBuild, subDescriptor, false).b();
        g4.c.r(iB, "getResult(...)");
        return h.a[e4.f.b(iB)] == 1 ? 1 : 3;
    }

    @Override
    public final int b() {
        return 2;
    }
}

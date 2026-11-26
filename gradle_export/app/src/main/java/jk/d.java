package jk;

import b2.o;
import b2.r;
import i2.b0;
import i2.i0;
import i2.j0;
import i2.k0;
import i2.l0;
import i2.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;

public abstract class d {

    public static final h.e f8313a = new h.e(4);

    public static final h.e f8314b = new h.e(5);

    public static final c f8315c = new c(0);

    public static final void a(s sVar, l0 l0Var, i2.g gVar) throws NoWhenBranchMatchedException {
        m.e(l0Var, "outline");
        if (l0Var instanceof j0) {
            s.s(sVar, ((j0) l0Var).f7140a);
            return;
        }
        if (!(l0Var instanceof k0)) {
            if (!(l0Var instanceof i0)) {
                throw new NoWhenBranchMatchedException();
            }
            sVar.e(((i0) l0Var).f7139a);
        } else {
            m.b(gVar);
            gVar.i();
            i2.g.c(gVar, ((k0) l0Var).f7142a);
            sVar.e(gVar);
        }
    }

    public static r b(r rVar, a aVar, u00.a aVar2, u00.k kVar, u00.a aVar3, u00.a aVar4, u00.a aVar5, u00.k kVar2, u00.k kVar3, int i10) {
        u00.a aVar6 = (i10 & 8) != 0 ? f8313a : aVar3;
        u00.a aVar7 = (i10 & 16) != 0 ? f8314b : aVar4;
        u00.a aVar8 = (i10 & 32) != 0 ? null : aVar5;
        u00.k kVar4 = (i10 & 64) != 0 ? null : kVar2;
        m.e(rVar, "<this>");
        m.e(aVar, "backdrop");
        m.e(aVar2, "shape");
        m.e(kVar, "effects");
        l lVar = new l(aVar2);
        r bVar = o.A;
        r rVarV = rVar.V(kVar4 != null ? b0.p(bVar, kVar4) : bVar).V(aVar8 != null ? new nk.b(lVar, aVar8) : bVar).V(aVar7 != null ? new nk.g(lVar, aVar7) : bVar);
        if (aVar6 != null) {
            bVar = new mk.b(lVar, aVar6);
        }
        return rVarV.V(bVar).V(new b(aVar, lVar, kVar, kVar4, f8315c, kVar3));
    }

    public static r c(r rVar, a aVar, u00.a aVar2, u00.k kVar) {
        m.e(rVar, "<this>");
        m.e(aVar, "backdrop");
        m.e(aVar2, "shape");
        m.e(kVar, "effects");
        return rVar.V(o.A).V(new b(aVar, new l(aVar2), kVar, null, f8315c, null));
    }

    public static final void d(b3.k kVar, k2.d dVar, l2.b bVar, long j9, u00.k kVar2) {
        m.e(dVar, "$this$recordLayer");
        m.e(bVar, "layer");
        m.e(kVar2, "block");
        dVar.M0(j9, bVar, new i(b3.m.y(kVar).Z, kVar2, 0));
    }
}

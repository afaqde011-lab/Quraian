package f30;

import e30.l0;
import e30.w;
import e30.z0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.a0;

public final class m implements b {
    public static final m A = new m();

    @Override
    public final int A(h30.g gVar) {
        return g.c(gVar);
    }

    @Override
    public final boolean A0(z0 z0Var) {
        kotlin.jvm.internal.m.e(z0Var, "<this>");
        return g.J(y0(z0Var)) != g.J(v0(z0Var));
    }

    @Override
    public final h30.j B0(h30.h hVar) {
        return g.d(hVar);
    }

    @Override
    public final boolean C(h30.l lVar) {
        return g.H(lVar);
    }

    @Override
    public final h30.p C0(h30.k kVar) {
        return g.w(kVar);
    }

    @Override
    public final h30.p D(h30.m mVar) {
        return g.x(mVar);
    }

    @Override
    public final h30.k D0(h30.g gVar) {
        return g.i(gVar);
    }

    @Override
    public final int E(h30.j jVar) {
        kotlin.jvm.internal.m.e(jVar, "<this>");
        if (jVar instanceof h30.h) {
            return g.c((h30.g) jVar);
        }
        if (jVar instanceof h30.a) {
            return ((h30.a) jVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + jVar + ", " + a0.a.b(jVar.getClass())).toString());
    }

    @Override
    public final h30.g E0(h30.k kVar) {
        return g.u(this, kVar);
    }

    @Override
    public final void F(h30.h hVar) {
        g.P(hVar);
    }

    @Override
    public final h30.h F0(h30.h hVar) {
        h30.b bVar = h30.b.A;
        return g.j(hVar);
    }

    @Override
    public final Collection G(h30.h hVar) {
        return g.V(this, hVar);
    }

    @Override
    public final e30.a0 G0(w wVar) {
        return g.h(wVar);
    }

    @Override
    public final boolean H(h30.h hVar) {
        kotlin.jvm.internal.m.e(hVar, "<this>");
        return g.f(hVar) != null;
    }

    @Override
    public final h30.f I(h30.g gVar) {
        return g.g(gVar);
    }

    @Override
    public final boolean J(h30.l lVar) {
        return g.B(lVar);
    }

    @Override
    public final h30.l K(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        h30.h hVarH = g.h(gVar);
        if (hVarH == null) {
            hVarH = y0(gVar);
        }
        return g.a0(hVarH);
    }

    @Override
    public final h30.k Q(h30.g gVar, int i) {
        return g.p(gVar, i);
    }

    @Override
    public final h30.m R(h30.l lVar, int i) {
        return g.r(lVar, i);
    }

    @Override
    public final h30.h S(h30.g gVar) {
        return g.h(gVar);
    }

    @Override
    public final boolean T(h30.h hVar) {
        return g.H(g.a0(hVar));
    }

    @Override
    public final h30.k V(h30.j jVar, int i) {
        kotlin.jvm.internal.m.e(jVar, "<this>");
        if (jVar instanceof h30.i) {
            return g.p((h30.g) jVar, i);
        }
        if (jVar instanceof h30.a) {
            E e = ((h30.a) jVar).get(i);
            kotlin.jvm.internal.m.d(e, "get(...)");
            return (h30.k) e;
        }
        throw new IllegalStateException(("unknown type argument list type: " + jVar + ", " + a0.a.b(jVar.getClass())).toString());
    }

    @Override
    public final boolean W(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        return !kotlin.jvm.internal.m.a(g.a0(y0(gVar)), g.a0(v0(gVar)));
    }

    @Override
    public final h30.l X(h30.h hVar) {
        return g.a0(hVar);
    }

    @Override
    public final boolean Y(h30.h hVar, h30.h hVar2) {
        return g.A(hVar, hVar2);
    }

    @Override
    public final h30.g Z(ArrayList arrayList) {
        e30.a0 a0Var;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (z0) h00.q.c1(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            z0 z0Var = (z0) it.next();
            z = z || e30.c.k(z0Var);
            if (z0Var instanceof e30.a0) {
                a0Var = (e30.a0) z0Var;
            } else {
                if (!(z0Var instanceof e30.q)) {
                    throw new NoWhenBranchMatchedException();
                }
                a0Var = ((e30.q) z0Var).B;
                z2 = true;
            }
            arrayList2.add(a0Var);
        }
        if (z) {
            return g30.l.c(g30.k.X, arrayList.toString());
        }
        t tVar = t.a;
        if (!z2) {
            return tVar.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(h00.r.q0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(e30.c.G((z0) it2.next()));
        }
        return e30.c.f(tVar.b(arrayList2), tVar.b(arrayList3));
    }

    @Override
    public final e30.a0 a(h30.f fVar) {
        return g.c0(fVar);
    }

    @Override
    public final h30.h a(h30.f fVar) {
        return g.c0(fVar);
    }

    @Override
    public final e30.a0 b(h30.h hVar) {
        return g.d0(hVar, true);
    }

    @Override
    public final h30.h b(h30.h hVar) {
        return g.d0(hVar, false);
    }

    @Override
    public final boolean b0(h30.l lVar, h30.l lVar2) {
        return g.b(lVar, lVar2);
    }

    @Override
    public final e30.a0 c(h30.f fVar) {
        return g.R(fVar);
    }

    @Override
    public final h30.h c(h30.f fVar) {
        return g.R(fVar);
    }

    @Override
    public final g10.i d() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public final boolean d0(h30.h hVar) {
        kotlin.jvm.internal.m.e(hVar, "<this>");
        return g.K(K(hVar)) && !g.L(hVar);
    }

    @Override
    public final boolean e(h30.g gVar) {
        return g.J(gVar);
    }

    @Override
    public final int e0(h30.l lVar) {
        return g.U(lVar);
    }

    @Override
    public final boolean f(h30.g receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        return receiver instanceof f20.g;
    }

    public final h30.g g(h30.g gVar) {
        e30.a0 a0VarD0;
        kotlin.jvm.internal.m.e(gVar, "<this>");
        e30.a0 a0VarH = g.h(gVar);
        return (a0VarH == null || (a0VarD0 = g.d0(a0VarH, true)) == null) ? gVar : a0VarD0;
    }

    @Override
    public final boolean g0(h30.k kVar) {
        return g.O(kVar);
    }

    @Override
    public final h30.g h(h30.d dVar) {
        return g.S(dVar);
    }

    @Override
    public final void i(h30.h hVar) {
        g.Q(hVar);
    }

    @Override
    public final boolean i0(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        e30.a0 a0VarH = g.h(gVar);
        return (a0VarH != null ? g.f(a0VarH) : null) != null;
    }

    @Override
    public final h30.b j(h30.d dVar) {
        return g.k(dVar);
    }

    @Override
    public final boolean j0(h30.l lVar) {
        return g.K(lVar);
    }

    @Override
    public final h30.k k(h30.c cVar) {
        return g.W(cVar);
    }

    @Override
    public final boolean k0(h30.d dVar) {
        return g.N(dVar);
    }

    public final l0 l() {
        return g.l(false, this, null, 24);
    }

    @Override
    public final h30.k l0(h30.h hVar, int i) {
        if (i < 0 || i >= g.c(hVar)) {
            return null;
        }
        return g.p(hVar, i);
    }

    @Override
    public final e30.c m(h30.h hVar) {
        return g.Y(this, hVar);
    }

    @Override
    public final h30.d m0(h30.i iVar) {
        return g.e(this, iVar);
    }

    @Override
    public final z0 n(h30.i iVar, h30.i iVar2) {
        return g.m(this, iVar, iVar2);
    }

    @Override
    public final boolean o(h30.l lVar) {
        return g.C(lVar);
    }

    public final h30.i p(h30.h hVar) {
        e30.a0 a0Var;
        e30.l lVarF = g.f(hVar);
        return (lVarF == null || (a0Var = lVarF.B) == null) ? (h30.i) hVar : a0Var;
    }

    @Override
    public final boolean p0(h30.l lVar) {
        return g.E(lVar);
    }

    @Override
    public final boolean q(h30.l lVar) {
        return g.D(lVar);
    }

    @Override
    public final void q0(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        g.g(gVar);
    }

    @Override
    public final boolean r(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        e30.a0 a0VarH = g.h(gVar);
        return (a0VarH != null ? g.e(this, p(a0VarH)) : null) != null;
    }

    @Override
    public final boolean r0(h30.d dVar) {
        return dVar instanceof r20.a;
    }

    @Override
    public final h30.g s(h30.g gVar) {
        return g.T(gVar);
    }

    @Override
    public final void s0(h30.h hVar, h30.l lVar) {
    }

    @Override
    public final boolean t(h30.g gVar) {
        return g.F(gVar);
    }

    @Override
    public final Collection t0(h30.l lVar) {
        return g.Z(lVar);
    }

    @Override
    public final h30.d u(h30.h hVar) {
        return g.e(this, p(hVar));
    }

    @Override
    public final boolean v(h30.l lVar) {
        return g.I(lVar);
    }

    @Override
    public final h30.h v0(h30.g gVar) {
        e30.a0 a0VarC0;
        kotlin.jvm.internal.m.e(gVar, "<this>");
        e30.q qVarG = g.g(gVar);
        if (qVarG != null && (a0VarC0 = g.c0(qVarG)) != null) {
            return a0VarC0;
        }
        e30.a0 a0VarH = g.h(gVar);
        kotlin.jvm.internal.m.b(a0VarH);
        return a0VarH;
    }

    @Override
    public final h30.c w(h30.d dVar) {
        return g.b0(dVar);
    }

    @Override
    public final h30.g x(h30.g gVar) {
        return g.e0(this, gVar);
    }

    @Override
    public final boolean y(h30.h hVar) {
        kotlin.jvm.internal.m.e(hVar, "<this>");
        return g.C(g.a0(hVar));
    }

    @Override
    public final h30.h y0(h30.g gVar) {
        e30.a0 a0VarR;
        kotlin.jvm.internal.m.e(gVar, "<this>");
        e30.q qVarG = g.g(gVar);
        if (qVarG != null && (a0VarR = g.R(qVarG)) != null) {
            return a0VarR;
        }
        e30.a0 a0VarH = g.h(gVar);
        kotlin.jvm.internal.m.b(a0VarH);
        return a0VarH;
    }

    @Override
    public final boolean z(h30.m mVar, h30.l lVar) {
        return g.z(mVar, lVar);
    }
}

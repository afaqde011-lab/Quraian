package l1;

import com.google.android.gms.cast.MediaError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class q {

    public static final Object f9906a = new Object();

    public static final z f9907b = new z();

    public static final b3.c0 f9908c = new b3.c0(5);

    public static final Object A(ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    public static final z0 B(Object obj, Long l, u00.n nVar, j jVar) {
        g0 g0Var = (g0) jVar;
        Object objN = g0Var.N();
        c cVar = i.f9868a;
        if (objN == cVar) {
            objN = z(obj);
            g0Var.n0(objN);
        }
        z0 z0Var = (z0) objN;
        boolean zI = g0Var.i(nVar);
        Object objN2 = g0Var.N();
        if (zI || objN2 == cVar) {
            objN2 = new m2(nVar, z0Var, null, 1);
            g0Var.n0(objN2);
        }
        i(l, jVar, (u00.n) objN2);
        return z0Var;
    }

    public static final z0 C(Object obj, j jVar, u00.n nVar) {
        g0 g0Var = (g0) jVar;
        Object objN = g0Var.N();
        c cVar = i.f9868a;
        if (objN == cVar) {
            objN = z(obj);
            g0Var.n0(objN);
        }
        z0 z0Var = (z0) objN;
        boolean zI = g0Var.i(nVar);
        Object objN2 = g0Var.N();
        if (zI || objN2 == cVar) {
            objN2 = new m2(nVar, z0Var, null, 0);
            g0Var.n0(objN2);
        }
        i(g00.b0.a, jVar, (u00.n) objN2);
        return z0Var;
    }

    public static final Object D(m1 m1Var, p1 p1Var) {
        kotlin.jvm.internal.m.c(p1Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object objB = m1Var.get(p1Var);
        if (objB == null) {
            objB = p1Var.b();
        }
        return ((s2) objB).a(m1Var);
    }

    public static final void E(j jVar, u00.k kVar) {
        ((g0) jVar).b(g00.b0.a, new bs.e(6, kVar));
    }

    public static final e0 F(j jVar) {
        g0 g0Var = (g0) jVar;
        g0Var.Y(206, l.f9895e);
        if (g0Var.S) {
            o1.k.z(g0Var.I);
        }
        Object objF = g0Var.F();
        z1 c2Var = objF instanceof z1 ? (z1) objF : null;
        if (c2Var == null) {
            c2Var = new c2(new d0(new e0(g0Var, g0Var.T, g0Var.f9856q, g0Var.C, g0Var.f9849h.T)), -1);
            g0Var.o0(c2Var);
        }
        y1 y1VarA = c2Var.a();
        kotlin.jvm.internal.m.c(y1VarA, "null cannot be cast to non-null type androidx.compose.runtime.GapComposer.CompositionContextHolder");
        e0 e0Var = ((d0) y1VarA).A;
        e0Var.f9837f.setValue(g0Var.m());
        g0Var.r(false);
        return e0Var;
    }

    public static final z0 G(Object obj, j jVar) {
        g0 g0Var = (g0) jVar;
        Object objN = g0Var.N();
        if (objN == i.f9868a) {
            objN = z(obj);
            g0Var.n0(objN);
        }
        z0 z0Var = (z0) objN;
        z0Var.setValue(obj);
        return z0Var;
    }

    public static final void H(o1.k kVar, int i10, Object obj) {
        int iH = kVar.h(i10);
        Object[] objArr = kVar.f11492c;
        Object obj2 = objArr[iH];
        objArr[iH] = i.f9868a;
        if (obj == obj2) {
            return;
        }
        l.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void I(Object obj, j jVar, u00.n nVar) {
        g0 g0Var = (g0) jVar;
        if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), obj)) {
            g0Var.n0(obj);
            g0Var.b(obj, nVar);
        }
    }

    public static final bt.a2 J(u00.a aVar) {
        return new bt.a2(new a1.f(aVar, null));
    }

    public static final int K(int i10) {
        int i11 = 306783378 & i10;
        int i12 = 613566756 & i10;
        return (i10 & (-920350135)) | (i12 >> 1) | i11 | ((i11 << 1) & i12);
    }

    public static final v1.h L(q1[] q1VarArr, m1 m1Var, m1 m1Var2) {
        v1.g gVarBuilder = v1.h.D.builder();
        for (q1 q1Var : q1VarArr) {
            p1 p1Var = (p1) q1Var.f9913e;
            if (q1Var.f9912d || !m1Var.containsKey(p1Var)) {
                gVarBuilder.put(p1Var, p1Var.c(q1Var, (s2) m1Var2.get(p1Var)));
            }
        }
        return gVarBuilder.build();
    }

    public static final Object M(u00.k kVar, m00.i iVar) {
        return u(iVar.getContext()).b0(new az.m(2, kVar), iVar);
    }

    public static final void a(q1 q1Var, u00.n nVar, j jVar, int i10) {
        s2 s2Var;
        boolean z10;
        r1 r1VarT;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-149765515);
        a1.c1 c1Var = g0Var.f9863x;
        m1 m1VarM = g0Var.m();
        g0Var.Y(MediaError.DetailedErrorCode.MEDIAKEYS_NETWORK, l.f9892b);
        Object objN = g0Var.N();
        if (kotlin.jvm.internal.m.a(objN, i.f9868a)) {
            s2Var = null;
        } else {
            kotlin.jvm.internal.m.c(objN, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            s2Var = (s2) objN;
        }
        p1 p1Var = (p1) q1Var.f9913e;
        s2 s2VarC = p1Var.c(q1Var, s2Var);
        boolean zEquals = s2VarC.equals(s2Var);
        if (!zEquals) {
            g0Var.n0(s2VarC);
        }
        if (!g0Var.S) {
            o1.g gVar = g0Var.G;
            Object objB = gVar.b(gVar.f11479b, gVar.f11484g);
            kotlin.jvm.internal.m.c(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            m1 m1Var = (m1) objB;
            if (!(g0Var.C() && zEquals) && (q1Var.f9912d || !m1VarM.containsKey(p1Var))) {
                m1VarM = ((v1.h) m1VarM).k(p1Var, s2VarC);
            } else if ((zEquals && !g0Var.f9862w) || !g0Var.f9862w) {
                m1VarM = m1Var;
            }
            if (g0Var.f9864y || m1Var != m1VarM) {
                z10 = true;
            }
            if (z10 && !g0Var.S) {
                g0Var.L(m1VarM);
            }
            c1Var.e(g0Var.f9862w ? 1 : 0);
            g0Var.f9862w = z10;
            g0Var.K = m1VarM;
            g0Var.W(l.f9893c, MediaError.DetailedErrorCode.MEDIAKEYS_UNSUPPORTED, 0, m1VarM);
            nVar.invoke(g0Var, Integer.valueOf((i10 >> 3) & 14));
            g0Var.r(false);
            g0Var.r(false);
            g0Var.f9862w = c1Var.d() != 0;
            g0Var.K = null;
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new ct.l(q1Var, nVar, i10, 9);
            }
        }
        if (q1Var.f9912d || !m1VarM.containsKey(p1Var)) {
            m1VarM = ((v1.h) m1VarM).k(p1Var, s2VarC);
        }
        g0Var.J = true;
        z10 = false;
        if (z10) {
            g0Var.L(m1VarM);
        }
        c1Var.e(g0Var.f9862w ? 1 : 0);
        g0Var.f9862w = z10;
        g0Var.K = m1VarM;
        g0Var.W(l.f9893c, MediaError.DetailedErrorCode.MEDIAKEYS_UNSUPPORTED, 0, m1VarM);
        nVar.invoke(g0Var, Integer.valueOf((i10 >> 3) & 14));
        g0Var.r(false);
        g0Var.r(false);
        g0Var.f9862w = c1Var.d() != 0;
        g0Var.K = null;
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.l(q1Var, nVar, i10, 9);
        }
    }

    public static final void b(q1[] q1VarArr, u00.n nVar, j jVar, int i10) {
        m1 m1VarM0;
        boolean z10;
        r1 r1VarT;
        g0 g0Var = (g0) jVar;
        g0Var.e0(415205898);
        a1.c1 c1Var = g0Var.f9863x;
        m1 m1VarM = g0Var.m();
        g0Var.Y(MediaError.DetailedErrorCode.MEDIAKEYS_NETWORK, l.f9892b);
        if (g0Var.S) {
            m1VarM0 = g0Var.m0(m1VarM, L(q1VarArr, m1VarM, v1.h.D));
            g0Var.J = true;
        } else {
            o1.g gVar = g0Var.G;
            Object objH = gVar.h(gVar.f11484g, 0);
            kotlin.jvm.internal.m.c(objH, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            m1 m1Var = (m1) objH;
            o1.g gVar2 = g0Var.G;
            Object objH2 = gVar2.h(gVar2.f11484g, 1);
            kotlin.jvm.internal.m.c(objH2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            m1 m1Var2 = (m1) objH2;
            v1.h hVarL = L(q1VarArr, m1VarM, m1Var2);
            if (!g0Var.C() || g0Var.f9864y || !m1Var2.equals(hVarL)) {
                m1VarM0 = g0Var.m0(m1VarM, hVarL);
                if (g0Var.f9864y || !kotlin.jvm.internal.m.a(m1VarM0, m1Var)) {
                    z10 = true;
                }
                if (z10 && !g0Var.S) {
                    g0Var.L(m1VarM0);
                }
                c1Var.e(g0Var.f9862w ? 1 : 0);
                g0Var.f9862w = z10;
                g0Var.K = m1VarM0;
                g0Var.W(l.f9893c, MediaError.DetailedErrorCode.MEDIAKEYS_UNSUPPORTED, 0, m1VarM0);
                nVar.invoke(g0Var, Integer.valueOf((i10 >> 3) & 14));
                g0Var.r(false);
                g0Var.r(false);
                g0Var.f9862w = c1Var.d() != 0;
                g0Var.K = null;
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new ct.l(q1VarArr, nVar, i10, 10);
                }
            }
            g0Var.l = g0Var.G.s() + g0Var.l;
            m1VarM0 = m1Var;
        }
        z10 = false;
        if (z10) {
            g0Var.L(m1VarM0);
        }
        c1Var.e(g0Var.f9862w ? 1 : 0);
        g0Var.f9862w = z10;
        g0Var.K = m1VarM0;
        g0Var.W(l.f9893c, MediaError.DetailedErrorCode.MEDIAKEYS_UNSUPPORTED, 0, m1VarM0);
        nVar.invoke(g0Var, Integer.valueOf((i10 >> 3) & 14));
        g0Var.r(false);
        g0Var.r(false);
        g0Var.f9862w = c1Var.d() != 0;
        g0Var.K = null;
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.l(q1VarArr, nVar, i10, 10);
        }
    }

    public static final void c(Object obj, Object obj2, u00.k kVar, j jVar) {
        g0 g0Var = (g0) jVar;
        boolean zG = g0Var.g(obj) | g0Var.g(obj2);
        Object objN = g0Var.N();
        if (zG || objN == i.f9868a) {
            objN = new x(kVar);
            g0Var.n0(objN);
        }
    }

    public static final void d(Object obj, String str, Object obj2, u00.k kVar, j jVar) {
        g0 g0Var = (g0) jVar;
        boolean zG = g0Var.g(obj) | g0Var.g(str) | g0Var.g(obj2);
        Object objN = g0Var.N();
        if (zG || objN == i.f9868a) {
            objN = new x(kVar);
            g0Var.n0(objN);
        }
    }

    public static final void e(Object obj, u00.k kVar, j jVar) {
        g0 g0Var = (g0) jVar;
        boolean zG = g0Var.g(obj);
        Object objN = g0Var.N();
        if (zG || objN == i.f9868a) {
            objN = new x(kVar);
            g0Var.n0(objN);
        }
    }

    public static final void f(Object[] objArr, u00.k kVar, j jVar) {
        boolean zG = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zG |= ((g0) jVar).g(obj);
        }
        g0 g0Var = (g0) jVar;
        Object objN = g0Var.N();
        if (zG || objN == i.f9868a) {
            g0Var.n0(new x(kVar));
        }
    }

    public static final void g(Object obj, Object obj2, Object obj3, u00.n nVar, j jVar) {
        g0 g0Var = (g0) jVar;
        k00.i iVar = g0Var.R;
        boolean zG = g0Var.g(obj) | g0Var.g(obj2) | g0Var.g(obj3);
        Object objN = g0Var.N();
        if (zG || objN == i.f9868a) {
            objN = new o0(iVar, nVar);
            g0Var.n0(objN);
        }
    }

    public static final void h(Object obj, Object obj2, u00.n nVar, j jVar) {
        g0 g0Var = (g0) jVar;
        k00.i iVar = g0Var.R;
        boolean zG = g0Var.g(obj) | g0Var.g(obj2);
        Object objN = g0Var.N();
        if (zG || objN == i.f9868a) {
            objN = new o0(iVar, nVar);
            g0Var.n0(objN);
        }
    }

    public static final void i(Object obj, j jVar, u00.n nVar) {
        g0 g0Var = (g0) jVar;
        k00.i iVar = g0Var.R;
        boolean zG = g0Var.g(obj);
        Object objN = g0Var.N();
        if (zG || objN == i.f9868a) {
            objN = new o0(iVar, nVar);
            g0Var.n0(objN);
        }
    }

    public static final void j(Object[] objArr, u00.n nVar, j jVar) {
        g0 g0Var = (g0) jVar;
        k00.i iVar = g0Var.R;
        boolean zG = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zG |= g0Var.g(obj);
        }
        Object objN = g0Var.N();
        if (zG || objN == i.f9868a) {
            g0Var.n0(new o0(iVar, nVar));
        }
    }

    public static final void k(u00.a aVar, j jVar) {
        p1.l0 l0Var = ((g0) jVar).M.f12247b.f12244a;
        l0Var.m0(p1.c0.f12260d);
        kh.n.Z(l0Var, 0, aVar);
    }

    public static final void l(int i10, int i11, List list) {
        int iS = s(i10, list);
        if (iS < 0) {
            iS = -(iS + 1);
        }
        while (iS < list.size() && ((l0) list.get(iS)).f9897b < i11) {
        }
    }

    public static void m(o1.k kVar, List list, s1 s1Var) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iC = kVar.c((o1.b) list.get(i10));
            int iP = kVar.P(kVar.f11491b, kVar.r(iC));
            Object obj = iP < kVar.g(kVar.f11491b, kVar.r(iC + 1)) ? kVar.f11492c[kVar.h(iP)] : i.f9868a;
            r1 r1Var = obj instanceof r1 ? (r1) obj : null;
            if (r1Var != null) {
                r1Var.f9918a = s1Var;
            }
        }
    }

    public static final void n(o1.g gVar, ArrayList arrayList, int i10) {
        boolean zL = gVar.l(i10);
        int[] iArr = gVar.f11479b;
        if (zL) {
            arrayList.add(gVar.n(i10));
            return;
        }
        int i11 = iArr[(i10 * 5) + 3] + i10;
        for (int i12 = i10 + 1; i12 < i11; i12 += iArr[(i12 * 5) + 3]) {
            n(gVar, arrayList, i12);
        }
    }

    public static final a40.z o(j jVar) {
        return new b2(((g0) jVar).R);
    }

    public static final m1.e p() {
        sd.p1 p1Var = l2.f9900b;
        m1.e eVar = (m1.e) p1Var.get();
        if (eVar != null) {
            return eVar;
        }
        m1.e eVar2 = new m1.e(0, new f0[0]);
        p1Var.F(eVar2);
        return eVar2;
    }

    public static final w q(k2 k2Var, u00.a aVar) {
        sd.p1 p1Var = l2.f9899a;
        return new w(k2Var, aVar);
    }

    public static final w r(u00.a aVar) {
        sd.p1 p1Var = l2.f9899a;
        return new w(null, aVar);
    }

    public static final int s(int i10, List list) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iF = kotlin.jvm.internal.m.f(((l0) list.get(i12)).f9897b, i10);
            if (iF < 0) {
                i11 = i12 + 1;
            } else {
                if (iF <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int t(j jVar) {
        return Long.hashCode(((g0) jVar).T);
    }

    public static final q0 u(k00.i iVar) {
        q0 q0Var = (q0) iVar.get(c.C);
        if (q0Var != null) {
            return q0Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final void v(j jVar, Integer num, u00.n nVar) {
        g0 g0Var = (g0) jVar;
        if (g0Var.S) {
            g0Var.b(num, nVar);
        }
    }

    public static final void w() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final boolean x(ArrayList arrayList) {
        return !arrayList.isEmpty();
    }

    public static final z1.p y(Object... objArr) {
        z1.p pVar = new z1.p();
        pVar.addAll(h00.n.V0(objArr));
        return pVar;
    }

    public static i1 z(Object obj) {
        return new i1(obj, c.G);
    }
}

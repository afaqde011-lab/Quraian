package jz;

import android.content.Context;
import androidx.lifecycle.f1;
import bt.x0;
import c3.o0;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import gv.a0;
import h0.m2;
import h0.n1;
import h0.p1;
import h0.t0;
import h0.z1;
import java.util.WeakHashMap;
import jz.t;
import kotlin.NoWhenBranchMatchedException;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.r1;
import l1.z0;
import z2.w0;

public abstract class y {
    public static final float a = 810;
    public static final float b = 32;

    public static final void a(final z zVar, final u00.k kVar, b2.r rVar, j0.v vVar, l1.j jVar, int i, int i2) {
        int i3;
        b2.r rVar2;
        int i4;
        j0.v vVar2;
        int i5;
        boolean z;
        b2.r rVar3;
        j0.v vVar3;
        r1 r1VarT;
        int i6;
        b2.r rVar4;
        int i7;
        j0.v vVarA;
        b2.r rVar5;
        gm.a aVar;
        boolean z2;
        n1 n1Var;
        t0 t0VarL;
        int iOrdinal;
        float f;
        b2.r rVarE;
        float f2;
        final float f3;
        boolean zE;
        Object objN;
        int i8;
        boolean z3;
        boolean z4;
        Object objN2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(792304742);
        if ((i & 6) == 0) {
            i3 = i | (g0Var.g(zVar) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= g0Var.i(kVar) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i4 = i3 | 384;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i4 = i3 | (g0Var.g(rVar2) ? 256 : 128);
        }
        if ((i2 & 8) == 0) {
            vVar2 = vVar;
            int i11 = g0Var.g(vVar2) ? 2048 : 1024;
            i5 = i4 | i11;
            if ((i5 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i5 & 1, z)) {
                g0Var.X();
                i6 = i & 1;
                rVar4 = b2.o.A;
                if (i6 != 0 || g0Var.A()) {
                    if (i9 != 0) {
                        rVar2 = rVar4;
                    }
                    if ((i2 & 8) != 0) {
                        i7 = i5 & (-7169);
                        vVarA = j0.x.a(0, g0Var, 3);
                        rVar5 = rVar2;
                    }
                    g0Var.s();
                    aVar = (gm.a) g0Var.k(dl.e.a);
                    if (aVar == gm.a.B) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    n1Var = (n1) g0Var.k(dq.l.a);
                    WeakHashMap weakHashMap = m2.w;
                    t0VarL = h0.c.l(h0.b.e(g0Var).g, g0Var);
                    iOrdinal = aVar.ordinal();
                    if (iOrdinal == 0) {
                        f = 16;
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f = 24;
                    }
                    if (z2) {
                        rVarE = z1.s(h0.c.E(rVar4, b, 0.0f, 2), 0.0f, a, 1);
                    } else {
                        rVarE = h0.c.E(rVar4, f, 0.0f, 2);
                    }
                    f2 = 16;
                    float fC = t0VarL.c() + n1Var.c() + 44 + f2;
                    if (!z2) {
                        f2 = 56;
                    }
                    f3 = fC + f2;
                    zE = g0Var.e(aVar.ordinal()) | g0Var.g(n1Var) | g0Var.g(t0VarL);
                    objN = g0Var.N();
                    l1.c cVar = l1.i.a;
                    if (zE || objN == cVar) {
                        objN = oi.k.t(t0VarL.a() + n1Var.a() + 24, g0Var);
                    }
                    float f4 = ((y3.f) objN).A;
                    b2.r rVarV = rVar5.V(z1.c);
                    p1 p1VarG = h0.c.g(0.0f, 0.0f, 0.0f, f4, 7);
                    b2.g gVar = b2.b.N;
                    h0.b bVar = h0.i.a;
                    if (z2) {
                        i8 = 20;
                    } else {
                        i8 = 12;
                    }
                    h0.f fVarG = h0.i.g(i8);
                    boolean zH = g0Var.h(z2) | g0Var.d(f3) | g0Var.g(rVarE);
                    if ((i7 & 14) == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = zH | z3 | ((i7 & 112) == 32);
                    objN2 = g0Var.N();
                    if (z4 || objN2 == cVar) {
                        final b2.r rVar6 = rVarE;
                        final boolean z5 = z2;
                        u00.k kVar2 = new u00.k() {
                            @Override
                            public final Object invoke(Object obj) {
                                j0.h LazyColumn = (j0.h) obj;
                                kotlin.jvm.internal.m.e(LazyColumn, "$this$LazyColumn");
                                final boolean z6 = z5;
                                final float f5 = f3;
                                final b2.r rVar7 = rVar6;
                                j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                                    @Override
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        j0.b item = (j0.b) obj2;
                                        g0 g0Var2 = (l1.j) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        kotlin.jvm.internal.m.e(item, "$this$item");
                                        boolean z7 = (iIntValue & 17) != 16;
                                        g0 g0Var3 = g0Var2;
                                        a30.x xVar = g0Var3.a;
                                        if (g0Var3.S(iIntValue & 1, z7)) {
                                            b2.o oVar = b2.o.A;
                                            b2.r rVarD = z1.d(oVar, 1.0f);
                                            w0 w0VarD = h0.o.d(b2.b.A, false);
                                            int iHashCode = Long.hashCode(g0Var3.T);
                                            m1 m1VarM = g0Var3.m();
                                            b2.r rVarC = b2.a.c(rVarD, g0Var2);
                                            b3.i.c.getClass();
                                            b3.g gVar2 = b3.h.b;
                                            g0Var3.g0();
                                            if (g0Var3.S) {
                                                g0Var3.l(gVar2);
                                            } else {
                                                g0Var3.q0();
                                            }
                                            b3.f fVar = b3.h.f;
                                            l1.q.I(w0VarD, g0Var2, fVar);
                                            b3.f fVar2 = b3.h.e;
                                            l1.q.I(m1VarM, g0Var2, fVar2);
                                            Integer numValueOf = Integer.valueOf(iHashCode);
                                            b3.f fVar3 = b3.h.g;
                                            l1.q.I(numValueOf, g0Var2, fVar3);
                                            b3.e eVar = b3.h.h;
                                            l1.q.E(g0Var2, eVar);
                                            b3.f fVar4 = b3.h.d;
                                            l1.q.I(rVarC, g0Var2, fVar4);
                                            boolean z8 = z6;
                                            if (z8) {
                                                g0Var3.c0(277371297);
                                                g0Var3.r(false);
                                            } else {
                                                g0Var3.c0(277256938);
                                                kz.a.d(h0.s.a.b(), g0Var2, 0);
                                                g0Var3.r(false);
                                            }
                                            b2.g gVar3 = b2.b.N;
                                            h0.f fVarG2 = h0.i.g(28);
                                            b2.r rVarG = h0.c.G(z1.d(oVar, 1.0f), 0.0f, f5, 0.0f, 8, 5);
                                            h0.v vVarA2 = h0.u.a(fVarG2, gVar3, g0Var2, 54);
                                            int iHashCode2 = Long.hashCode(g0Var3.T);
                                            m1 m1VarM2 = g0Var3.m();
                                            b2.r rVarC2 = b2.a.c(rVarG, g0Var2);
                                            g0Var3.g0();
                                            if (g0Var3.S) {
                                                g0Var3.l(gVar2);
                                            } else {
                                                g0Var3.q0();
                                            }
                                            l1.q.I(vVarA2, g0Var2, fVar);
                                            l1.q.I(m1VarM2, g0Var2, fVar2);
                                            x5.u(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
                                            l1.q.I(rVarC2, g0Var2, fVar4);
                                            kz.a.e(null, g0Var2, 0, 1);
                                            k00.f.a(z3.U(g0Var2, 2131886723), z1.d(rVar7, 1.0f), i2.t.b(0.62f, dl.a.k), kh.o.z(z8 ? 18 : 17), new y3.o(kh.o.z(24)), q3.u.B, new x3.k(3), 3, 0.0f, null, g0Var2, 12804096, 768);
                                            g0Var3.r(true);
                                            g0Var3.r(true);
                                        } else {
                                            g0Var3.V();
                                        }
                                        return g00.b0.a;
                                    }
                                }, -1865722117, true), 3);
                                z zVar2 = zVar;
                                boolean z7 = zVar2.a;
                                final u00.k kVar3 = kVar;
                                if (z7) {
                                    final int i12 = 2;
                                    j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                                        @Override
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            j0.b item = (j0.b) obj2;
                                            switch (i12) {
                                                case 0:
                                                    g0 g0Var2 = (l1.j) obj3;
                                                    int iIntValue = ((Integer) obj4).intValue();
                                                    kotlin.jvm.internal.m.e(item, "$this$item");
                                                    g0 g0Var3 = g0Var2;
                                                    if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                        u00.k kVar4 = kVar3;
                                                        boolean zG = g0Var3.g(kVar4);
                                                        Object objN3 = g0Var3.N();
                                                        if (zG || objN3 == l1.i.a) {
                                                            objN3 = new bt.t0(18, kVar4);
                                                            g0Var3.n0(objN3);
                                                        }
                                                        w00.a.f((u00.a) objN3, rVar7, g0Var2, 0);
                                                    } else {
                                                        g0Var3.V();
                                                    }
                                                    break;
                                                case 1:
                                                    g0 g0Var4 = (l1.j) obj3;
                                                    int iIntValue2 = ((Integer) obj4).intValue();
                                                    kotlin.jvm.internal.m.e(item, "$this$item");
                                                    g0 g0Var5 = g0Var4;
                                                    if (g0Var5.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                        String strU = z3.U(g0Var4, 2131886727);
                                                        u00.k kVar5 = kVar3;
                                                        boolean zG2 = g0Var5.g(kVar5);
                                                        Object objN4 = g0Var5.N();
                                                        if (zG2 || objN4 == l1.i.a) {
                                                            objN4 = new a0(29, kVar5);
                                                            g0Var5.n0(objN4);
                                                        }
                                                        kz.a.h(2131231110, strU, (u00.a) objN4, rVar7, null, g0Var4, 0, 48);
                                                    } else {
                                                        g0Var5.V();
                                                    }
                                                    break;
                                                default:
                                                    g0 g0Var6 = (l1.j) obj3;
                                                    int iIntValue3 = ((Integer) obj4).intValue();
                                                    kotlin.jvm.internal.m.e(item, "$this$item");
                                                    g0 g0Var7 = g0Var6;
                                                    if (g0Var7.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                        u00.k kVar6 = kVar3;
                                                        boolean zG3 = g0Var7.g(kVar6);
                                                        Object objN5 = g0Var7.N();
                                                        Object obj5 = l1.i.a;
                                                        if (zG3 || objN5 == obj5) {
                                                            objN5 = new t(2, kVar6);
                                                            g0Var7.n0(objN5);
                                                        }
                                                        u00.a aVar2 = (u00.a) objN5;
                                                        boolean zG4 = g0Var7.g(kVar6);
                                                        Object objN6 = g0Var7.N();
                                                        if (zG4 || objN6 == obj5) {
                                                            objN6 = new t(3, kVar6);
                                                            g0Var7.n0(objN6);
                                                        }
                                                        kz.a.c(aVar2, (u00.a) objN6, rVar7, g0Var6, 0);
                                                    } else {
                                                        g0Var7.V();
                                                    }
                                                    break;
                                            }
                                            return b0.a;
                                        }
                                    }, 1916785046, true), 3);
                                }
                                if (zVar2.b || zVar2.d || !r30.k.L0(zVar2.f) || !r30.k.L0(zVar2.g) || !r30.k.L0(zVar2.h)) {
                                    j0.h.q(LazyColumn, (Object) null, new v1.c(new c0.f(zVar2, rVar7, 8), -380280755, true), 3);
                                }
                                final int i13 = 1;
                                j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                                    @Override
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        j0.b item = (j0.b) obj2;
                                        switch (i13) {
                                            case 0:
                                                g0 g0Var2 = (l1.j) obj3;
                                                int iIntValue = ((Integer) obj4).intValue();
                                                kotlin.jvm.internal.m.e(item, "$this$item");
                                                g0 g0Var3 = g0Var2;
                                                if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    u00.k kVar4 = kVar3;
                                                    boolean zG = g0Var3.g(kVar4);
                                                    Object objN3 = g0Var3.N();
                                                    if (zG || objN3 == l1.i.a) {
                                                        objN3 = new bt.t0(18, kVar4);
                                                        g0Var3.n0(objN3);
                                                    }
                                                    w00.a.f((u00.a) objN3, rVar7, g0Var2, 0);
                                                } else {
                                                    g0Var3.V();
                                                }
                                                break;
                                            case 1:
                                                g0 g0Var4 = (l1.j) obj3;
                                                int iIntValue2 = ((Integer) obj4).intValue();
                                                kotlin.jvm.internal.m.e(item, "$this$item");
                                                g0 g0Var5 = g0Var4;
                                                if (g0Var5.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    String strU = z3.U(g0Var4, 2131886727);
                                                    u00.k kVar5 = kVar3;
                                                    boolean zG2 = g0Var5.g(kVar5);
                                                    Object objN4 = g0Var5.N();
                                                    if (zG2 || objN4 == l1.i.a) {
                                                        objN4 = new a0(29, kVar5);
                                                        g0Var5.n0(objN4);
                                                    }
                                                    kz.a.h(2131231110, strU, (u00.a) objN4, rVar7, null, g0Var4, 0, 48);
                                                } else {
                                                    g0Var5.V();
                                                }
                                                break;
                                            default:
                                                g0 g0Var6 = (l1.j) obj3;
                                                int iIntValue3 = ((Integer) obj4).intValue();
                                                kotlin.jvm.internal.m.e(item, "$this$item");
                                                g0 g0Var7 = g0Var6;
                                                if (g0Var7.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                    u00.k kVar6 = kVar3;
                                                    boolean zG3 = g0Var7.g(kVar6);
                                                    Object objN5 = g0Var7.N();
                                                    Object obj5 = l1.i.a;
                                                    if (zG3 || objN5 == obj5) {
                                                        objN5 = new t(2, kVar6);
                                                        g0Var7.n0(objN5);
                                                    }
                                                    u00.a aVar2 = (u00.a) objN5;
                                                    boolean zG4 = g0Var7.g(kVar6);
                                                    Object objN6 = g0Var7.N();
                                                    if (zG4 || objN6 == obj5) {
                                                        objN6 = new t(3, kVar6);
                                                        g0Var7.n0(objN6);
                                                    }
                                                    kz.a.c(aVar2, (u00.a) objN6, rVar7, g0Var6, 0);
                                                } else {
                                                    g0Var7.V();
                                                }
                                                break;
                                        }
                                        return b0.a;
                                    }
                                }, -1827331982, true), 3);
                                if (zVar2.r) {
                                    final int i14 = 0;
                                    j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                                        @Override
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            int i15 = i14;
                                            j0.b item = (j0.b) obj2;
                                            g0 g0Var2 = (l1.j) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            switch (i15) {
                                                case 0:
                                                    kotlin.jvm.internal.m.e(item, "$this$item");
                                                    g0 g0Var3 = g0Var2;
                                                    if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                        u00.k kVar4 = kVar3;
                                                        boolean zG = g0Var3.g(kVar4);
                                                        Object objN3 = g0Var3.N();
                                                        if (zG || objN3 == l1.i.a) {
                                                            objN3 = new t(0, kVar4);
                                                            g0Var3.n0(objN3);
                                                        }
                                                        kz.g.a((u00.a) objN3, h0.c.G(rVar7, 0.0f, z6 ? 0 : 12, 0.0f, 0.0f, 13), g0Var2, 0);
                                                    } else {
                                                        g0Var3.V();
                                                    }
                                                    break;
                                                default:
                                                    kotlin.jvm.internal.m.e(item, "$this$item");
                                                    g0 g0Var4 = g0Var2;
                                                    if (g0Var4.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                        u00.k kVar5 = kVar3;
                                                        boolean zG2 = g0Var4.g(kVar5);
                                                        Object objN4 = g0Var4.N();
                                                        if (zG2 || objN4 == l1.i.a) {
                                                            objN4 = new t(1, kVar5);
                                                            g0Var4.n0(objN4);
                                                        }
                                                        kz.a.a((u00.a) objN4, h0.c.G(rVar7, 0.0f, z6 ? 0 : 12, 0.0f, 0.0f, 13), g0Var2, 0);
                                                    } else {
                                                        g0Var4.V();
                                                    }
                                                    break;
                                            }
                                            return g00.b0.a;
                                        }
                                    }, -1445247986, true), 3);
                                } else if (zVar2.q) {
                                    final int i15 = 1;
                                    j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                                        @Override
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            int i16 = i15;
                                            j0.b item = (j0.b) obj2;
                                            g0 g0Var2 = (l1.j) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            switch (i16) {
                                                case 0:
                                                    kotlin.jvm.internal.m.e(item, "$this$item");
                                                    g0 g0Var3 = g0Var2;
                                                    if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                        u00.k kVar4 = kVar3;
                                                        boolean zG = g0Var3.g(kVar4);
                                                        Object objN3 = g0Var3.N();
                                                        if (zG || objN3 == l1.i.a) {
                                                            objN3 = new t(0, kVar4);
                                                            g0Var3.n0(objN3);
                                                        }
                                                        kz.g.a((u00.a) objN3, h0.c.G(rVar7, 0.0f, z6 ? 0 : 12, 0.0f, 0.0f, 13), g0Var2, 0);
                                                    } else {
                                                        g0Var3.V();
                                                    }
                                                    break;
                                                default:
                                                    kotlin.jvm.internal.m.e(item, "$this$item");
                                                    g0 g0Var4 = g0Var2;
                                                    if (g0Var4.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                        u00.k kVar5 = kVar3;
                                                        boolean zG2 = g0Var4.g(kVar5);
                                                        Object objN4 = g0Var4.N();
                                                        if (zG2 || objN4 == l1.i.a) {
                                                            objN4 = new t(1, kVar5);
                                                            g0Var4.n0(objN4);
                                                        }
                                                        kz.a.a((u00.a) objN4, h0.c.G(rVar7, 0.0f, z6 ? 0 : 12, 0.0f, 0.0f, 13), g0Var2, 0);
                                                    } else {
                                                        g0Var4.V();
                                                    }
                                                    break;
                                            }
                                            return g00.b0.a;
                                        }
                                    }, 573873463, true), 3);
                                } else if (zVar2.s) {
                                    j0.h.q(LazyColumn, (Object) null, new v1.c(new ct.e0(rVar7, z6, 3), -1841567210, true), 3);
                                }
                                return g00.b0.a;
                            }
                        };
                        g0Var.n0(kVar2);
                        objN2 = kVar2;
                    }
                    j0.v vVar4 = vVarA;
                    k00.f.d(rVarV, vVar4, p1VarG, fVarG, gVar, null, false, null, (u00.k) objN2, g0Var, ((i7 >> 6) & 112) | 196608, 456);
                    vVar3 = vVar4;
                    rVar3 = rVar5;
                } else {
                    g0Var.V();
                    if ((i2 & 8) != 0) {
                        i5 &= -7169;
                    }
                }
                i7 = i5;
                rVar5 = rVar2;
                vVarA = vVar2;
                g0Var.s();
                aVar = (gm.a) g0Var.k(dl.e.a);
                if (aVar == gm.a.B) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                n1Var = (n1) g0Var.k(dq.l.a);
                WeakHashMap weakHashMap2 = m2.w;
                t0VarL = h0.c.l(h0.b.e(g0Var).g, g0Var);
                iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    f = 16;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = 24;
                }
                if (z2) {
                    rVarE = z1.s(h0.c.E(rVar4, b, 0.0f, 2), 0.0f, a, 1);
                } else {
                    rVarE = h0.c.E(rVar4, f, 0.0f, 2);
                }
                f2 = 16;
                float fC2 = t0VarL.c() + n1Var.c() + 44 + f2;
                if (!z2) {
                    f2 = 56;
                }
                f3 = fC2 + f2;
                zE = g0Var.e(aVar.ordinal()) | g0Var.g(n1Var) | g0Var.g(t0VarL);
                objN = g0Var.N();
                l1.c cVar2 = l1.i.a;
                if (zE) {
                    objN = oi.k.t(t0VarL.a() + n1Var.a() + 24, g0Var);
                } else {
                    objN = oi.k.t(t0VarL.a() + n1Var.a() + 24, g0Var);
                }
                float f5 = ((y3.f) objN).A;
                b2.r rVarV2 = rVar5.V(z1.c);
                p1 p1VarG2 = h0.c.g(0.0f, 0.0f, 0.0f, f5, 7);
                b2.g gVar2 = b2.b.N;
                h0.b bVar2 = h0.i.a;
                if (z2) {
                    i8 = 20;
                } else {
                    i8 = 12;
                }
                h0.f fVarG2 = h0.i.g(i8);
                boolean zH2 = g0Var.h(z2) | g0Var.d(f3) | g0Var.g(rVarE);
                if ((i7 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = zH2 | z3 | ((i7 & 112) == 32);
                objN2 = g0Var.N();
                if (z4) {
                    final b2.r rVar7 = rVarE;
                    final boolean z6 = z2;
                    u00.k kVar3 = new u00.k() {
                        @Override
                        public final Object invoke(Object obj) {
                            j0.h LazyColumn = (j0.h) obj;
                            kotlin.jvm.internal.m.e(LazyColumn, "$this$LazyColumn");
                            final boolean z7 = z6;
                            final float f6 = f3;
                            final b2.r rVar8 = rVar7;
                            j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                                @Override
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    j0.b item = (j0.b) obj2;
                                    g0 g0Var2 = (l1.j) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    kotlin.jvm.internal.m.e(item, "$this$item");
                                    boolean z8 = (iIntValue & 17) != 16;
                                    g0 g0Var3 = g0Var2;
                                    a30.x xVar = g0Var3.a;
                                    if (g0Var3.S(iIntValue & 1, z8)) {
                                        b2.o oVar = b2.o.A;
                                        b2.r rVarD = z1.d(oVar, 1.0f);
                                        w0 w0VarD = h0.o.d(b2.b.A, false);
                                        int iHashCode = Long.hashCode(g0Var3.T);
                                        m1 m1VarM = g0Var3.m();
                                        b2.r rVarC = b2.a.c(rVarD, g0Var2);
                                        b3.i.c.getClass();
                                        b3.g gVar3 = b3.h.b;
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar3);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        b3.f fVar = b3.h.f;
                                        l1.q.I(w0VarD, g0Var2, fVar);
                                        b3.f fVar2 = b3.h.e;
                                        l1.q.I(m1VarM, g0Var2, fVar2);
                                        Integer numValueOf = Integer.valueOf(iHashCode);
                                        b3.f fVar3 = b3.h.g;
                                        l1.q.I(numValueOf, g0Var2, fVar3);
                                        b3.e eVar = b3.h.h;
                                        l1.q.E(g0Var2, eVar);
                                        b3.f fVar4 = b3.h.d;
                                        l1.q.I(rVarC, g0Var2, fVar4);
                                        boolean z9 = z7;
                                        if (z9) {
                                            g0Var3.c0(277371297);
                                            g0Var3.r(false);
                                        } else {
                                            g0Var3.c0(277256938);
                                            kz.a.d(h0.s.a.b(), g0Var2, 0);
                                            g0Var3.r(false);
                                        }
                                        b2.g gVar4 = b2.b.N;
                                        h0.f fVarG3 = h0.i.g(28);
                                        b2.r rVarG = h0.c.G(z1.d(oVar, 1.0f), 0.0f, f6, 0.0f, 8, 5);
                                        h0.v vVarA2 = h0.u.a(fVarG3, gVar4, g0Var2, 54);
                                        int iHashCode2 = Long.hashCode(g0Var3.T);
                                        m1 m1VarM2 = g0Var3.m();
                                        b2.r rVarC2 = b2.a.c(rVarG, g0Var2);
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar3);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        l1.q.I(vVarA2, g0Var2, fVar);
                                        l1.q.I(m1VarM2, g0Var2, fVar2);
                                        x5.u(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
                                        l1.q.I(rVarC2, g0Var2, fVar4);
                                        kz.a.e(null, g0Var2, 0, 1);
                                        k00.f.a(z3.U(g0Var2, 2131886723), z1.d(rVar8, 1.0f), i2.t.b(0.62f, dl.a.k), kh.o.z(z9 ? 18 : 17), new y3.o(kh.o.z(24)), q3.u.B, new x3.k(3), 3, 0.0f, null, g0Var2, 12804096, 768);
                                        g0Var3.r(true);
                                        g0Var3.r(true);
                                    } else {
                                        g0Var3.V();
                                    }
                                    return g00.b0.a;
                                }
                            }, -1865722117, true), 3);
                            z zVar2 = zVar;
                            boolean z8 = zVar2.a;
                            final u00.k kVar4 = kVar;
                            if (z8) {
                                final int i12 = 2;
                                j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                                    @Override
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        j0.b item = (j0.b) obj2;
                                        switch (i12) {
                                            case 0:
                                                g0 g0Var2 = (l1.j) obj3;
                                                int iIntValue = ((Integer) obj4).intValue();
                                                kotlin.jvm.internal.m.e(item, "$this$item");
                                                g0 g0Var3 = g0Var2;
                                                if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    u00.k kVar5 = kVar4;
                                                    boolean zG = g0Var3.g(kVar5);
                                                    Object objN3 = g0Var3.N();
                                                    if (zG || objN3 == l1.i.a) {
                                                        objN3 = new bt.t0(18, kVar5);
                                                        g0Var3.n0(objN3);
                                                    }
                                                    w00.a.f((u00.a) objN3, rVar8, g0Var2, 0);
                                                } else {
                                                    g0Var3.V();
                                                }
                                                break;
                                            case 1:
                                                g0 g0Var4 = (l1.j) obj3;
                                                int iIntValue2 = ((Integer) obj4).intValue();
                                                kotlin.jvm.internal.m.e(item, "$this$item");
                                                g0 g0Var5 = g0Var4;
                                                if (g0Var5.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    String strU = z3.U(g0Var4, 2131886727);
                                                    u00.k kVar6 = kVar4;
                                                    boolean zG2 = g0Var5.g(kVar6);
                                                    Object objN4 = g0Var5.N();
                                                    if (zG2 || objN4 == l1.i.a) {
                                                        objN4 = new a0(29, kVar6);
                                                        g0Var5.n0(objN4);
                                                    }
                                                    kz.a.h(2131231110, strU, (u00.a) objN4, rVar8, null, g0Var4, 0, 48);
                                                } else {
                                                    g0Var5.V();
                                                }
                                                break;
                                            default:
                                                g0 g0Var6 = (l1.j) obj3;
                                                int iIntValue3 = ((Integer) obj4).intValue();
                                                kotlin.jvm.internal.m.e(item, "$this$item");
                                                g0 g0Var7 = g0Var6;
                                                if (g0Var7.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                    u00.k kVar7 = kVar4;
                                                    boolean zG3 = g0Var7.g(kVar7);
                                                    Object objN5 = g0Var7.N();
                                                    Object obj5 = l1.i.a;
                                                    if (zG3 || objN5 == obj5) {
                                                        objN5 = new t(2, kVar7);
                                                        g0Var7.n0(objN5);
                                                    }
                                                    u00.a aVar2 = (u00.a) objN5;
                                                    boolean zG4 = g0Var7.g(kVar7);
                                                    Object objN6 = g0Var7.N();
                                                    if (zG4 || objN6 == obj5) {
                                                        objN6 = new t(3, kVar7);
                                                        g0Var7.n0(objN6);
                                                    }
                                                    kz.a.c(aVar2, (u00.a) objN6, rVar8, g0Var6, 0);
                                                } else {
                                                    g0Var7.V();
                                                }
                                                break;
                                        }
                                        return b0.a;
                                    }
                                }, 1916785046, true), 3);
                            }
                            if (zVar2.b || zVar2.d || !r30.k.L0(zVar2.f) || !r30.k.L0(zVar2.g) || !r30.k.L0(zVar2.h)) {
                                j0.h.q(LazyColumn, (Object) null, new v1.c(new c0.f(zVar2, rVar8, 8), -380280755, true), 3);
                            }
                            final int i13 = 1;
                            j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                                @Override
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    j0.b item = (j0.b) obj2;
                                    switch (i13) {
                                        case 0:
                                            g0 g0Var2 = (l1.j) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            kotlin.jvm.internal.m.e(item, "$this$item");
                                            g0 g0Var3 = g0Var2;
                                            if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                u00.k kVar5 = kVar4;
                                                boolean zG = g0Var3.g(kVar5);
                                                Object objN3 = g0Var3.N();
                                                if (zG || objN3 == l1.i.a) {
                                                    objN3 = new bt.t0(18, kVar5);
                                                    g0Var3.n0(objN3);
                                                }
                                                w00.a.f((u00.a) objN3, rVar8, g0Var2, 0);
                                            } else {
                                                g0Var3.V();
                                            }
                                            break;
                                        case 1:
                                            g0 g0Var4 = (l1.j) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            kotlin.jvm.internal.m.e(item, "$this$item");
                                            g0 g0Var5 = g0Var4;
                                            if (g0Var5.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                String strU = z3.U(g0Var4, 2131886727);
                                                u00.k kVar6 = kVar4;
                                                boolean zG2 = g0Var5.g(kVar6);
                                                Object objN4 = g0Var5.N();
                                                if (zG2 || objN4 == l1.i.a) {
                                                    objN4 = new a0(29, kVar6);
                                                    g0Var5.n0(objN4);
                                                }
                                                kz.a.h(2131231110, strU, (u00.a) objN4, rVar8, null, g0Var4, 0, 48);
                                            } else {
                                                g0Var5.V();
                                            }
                                            break;
                                        default:
                                            g0 g0Var6 = (l1.j) obj3;
                                            int iIntValue3 = ((Integer) obj4).intValue();
                                            kotlin.jvm.internal.m.e(item, "$this$item");
                                            g0 g0Var7 = g0Var6;
                                            if (g0Var7.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                u00.k kVar7 = kVar4;
                                                boolean zG3 = g0Var7.g(kVar7);
                                                Object objN5 = g0Var7.N();
                                                Object obj5 = l1.i.a;
                                                if (zG3 || objN5 == obj5) {
                                                    objN5 = new t(2, kVar7);
                                                    g0Var7.n0(objN5);
                                                }
                                                u00.a aVar2 = (u00.a) objN5;
                                                boolean zG4 = g0Var7.g(kVar7);
                                                Object objN6 = g0Var7.N();
                                                if (zG4 || objN6 == obj5) {
                                                    objN6 = new t(3, kVar7);
                                                    g0Var7.n0(objN6);
                                                }
                                                kz.a.c(aVar2, (u00.a) objN6, rVar8, g0Var6, 0);
                                            } else {
                                                g0Var7.V();
                                            }
                                            break;
                                    }
                                    return b0.a;
                                }
                            }, -1827331982, true), 3);
                            if (zVar2.r) {
                                final int i14 = 0;
                                j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                                    @Override
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        int i16 = i14;
                                        j0.b item = (j0.b) obj2;
                                        g0 g0Var2 = (l1.j) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        switch (i16) {
                                            case 0:
                                                kotlin.jvm.internal.m.e(item, "$this$item");
                                                g0 g0Var3 = g0Var2;
                                                if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    u00.k kVar5 = kVar4;
                                                    boolean zG = g0Var3.g(kVar5);
                                                    Object objN3 = g0Var3.N();
                                                    if (zG || objN3 == l1.i.a) {
                                                        objN3 = new t(0, kVar5);
                                                        g0Var3.n0(objN3);
                                                    }
                                                    kz.g.a((u00.a) objN3, h0.c.G(rVar8, 0.0f, z7 ? 0 : 12, 0.0f, 0.0f, 13), g0Var2, 0);
                                                } else {
                                                    g0Var3.V();
                                                }
                                                break;
                                            default:
                                                kotlin.jvm.internal.m.e(item, "$this$item");
                                                g0 g0Var4 = g0Var2;
                                                if (g0Var4.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    u00.k kVar6 = kVar4;
                                                    boolean zG2 = g0Var4.g(kVar6);
                                                    Object objN4 = g0Var4.N();
                                                    if (zG2 || objN4 == l1.i.a) {
                                                        objN4 = new t(1, kVar6);
                                                        g0Var4.n0(objN4);
                                                    }
                                                    kz.a.a((u00.a) objN4, h0.c.G(rVar8, 0.0f, z7 ? 0 : 12, 0.0f, 0.0f, 13), g0Var2, 0);
                                                } else {
                                                    g0Var4.V();
                                                }
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                }, -1445247986, true), 3);
                            } else if (zVar2.q) {
                                final int i15 = 1;
                                j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                                    @Override
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        int i16 = i15;
                                        j0.b item = (j0.b) obj2;
                                        g0 g0Var2 = (l1.j) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        switch (i16) {
                                            case 0:
                                                kotlin.jvm.internal.m.e(item, "$this$item");
                                                g0 g0Var3 = g0Var2;
                                                if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    u00.k kVar5 = kVar4;
                                                    boolean zG = g0Var3.g(kVar5);
                                                    Object objN3 = g0Var3.N();
                                                    if (zG || objN3 == l1.i.a) {
                                                        objN3 = new t(0, kVar5);
                                                        g0Var3.n0(objN3);
                                                    }
                                                    kz.g.a((u00.a) objN3, h0.c.G(rVar8, 0.0f, z7 ? 0 : 12, 0.0f, 0.0f, 13), g0Var2, 0);
                                                } else {
                                                    g0Var3.V();
                                                }
                                                break;
                                            default:
                                                kotlin.jvm.internal.m.e(item, "$this$item");
                                                g0 g0Var4 = g0Var2;
                                                if (g0Var4.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    u00.k kVar6 = kVar4;
                                                    boolean zG2 = g0Var4.g(kVar6);
                                                    Object objN4 = g0Var4.N();
                                                    if (zG2 || objN4 == l1.i.a) {
                                                        objN4 = new t(1, kVar6);
                                                        g0Var4.n0(objN4);
                                                    }
                                                    kz.a.a((u00.a) objN4, h0.c.G(rVar8, 0.0f, z7 ? 0 : 12, 0.0f, 0.0f, 13), g0Var2, 0);
                                                } else {
                                                    g0Var4.V();
                                                }
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                }, 573873463, true), 3);
                            } else if (zVar2.s) {
                                j0.h.q(LazyColumn, (Object) null, new v1.c(new ct.e0(rVar8, z7, 3), -1841567210, true), 3);
                            }
                            return g00.b0.a;
                        }
                    };
                    g0Var.n0(kVar3);
                    objN2 = kVar3;
                } else {
                    final b2.r rVar8 = rVarE;
                    final boolean z7 = z2;
                    u00.k kVar4 = new u00.k() {
                        @Override
                        public final Object invoke(Object obj) {
                            j0.h LazyColumn = (j0.h) obj;
                            kotlin.jvm.internal.m.e(LazyColumn, "$this$LazyColumn");
                            final boolean z8 = z7;
                            final float f6 = f3;
                            final b2.r rVar9 = rVar8;
                            j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                                @Override
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    j0.b item = (j0.b) obj2;
                                    g0 g0Var2 = (l1.j) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    kotlin.jvm.internal.m.e(item, "$this$item");
                                    boolean z9 = (iIntValue & 17) != 16;
                                    g0 g0Var3 = g0Var2;
                                    a30.x xVar = g0Var3.a;
                                    if (g0Var3.S(iIntValue & 1, z9)) {
                                        b2.o oVar = b2.o.A;
                                        b2.r rVarD = z1.d(oVar, 1.0f);
                                        w0 w0VarD = h0.o.d(b2.b.A, false);
                                        int iHashCode = Long.hashCode(g0Var3.T);
                                        m1 m1VarM = g0Var3.m();
                                        b2.r rVarC = b2.a.c(rVarD, g0Var2);
                                        b3.i.c.getClass();
                                        b3.g gVar3 = b3.h.b;
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar3);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        b3.f fVar = b3.h.f;
                                        l1.q.I(w0VarD, g0Var2, fVar);
                                        b3.f fVar2 = b3.h.e;
                                        l1.q.I(m1VarM, g0Var2, fVar2);
                                        Integer numValueOf = Integer.valueOf(iHashCode);
                                        b3.f fVar3 = b3.h.g;
                                        l1.q.I(numValueOf, g0Var2, fVar3);
                                        b3.e eVar = b3.h.h;
                                        l1.q.E(g0Var2, eVar);
                                        b3.f fVar4 = b3.h.d;
                                        l1.q.I(rVarC, g0Var2, fVar4);
                                        boolean z11 = z8;
                                        if (z11) {
                                            g0Var3.c0(277371297);
                                            g0Var3.r(false);
                                        } else {
                                            g0Var3.c0(277256938);
                                            kz.a.d(h0.s.a.b(), g0Var2, 0);
                                            g0Var3.r(false);
                                        }
                                        b2.g gVar4 = b2.b.N;
                                        h0.f fVarG3 = h0.i.g(28);
                                        b2.r rVarG = h0.c.G(z1.d(oVar, 1.0f), 0.0f, f6, 0.0f, 8, 5);
                                        h0.v vVarA2 = h0.u.a(fVarG3, gVar4, g0Var2, 54);
                                        int iHashCode2 = Long.hashCode(g0Var3.T);
                                        m1 m1VarM2 = g0Var3.m();
                                        b2.r rVarC2 = b2.a.c(rVarG, g0Var2);
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar3);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        l1.q.I(vVarA2, g0Var2, fVar);
                                        l1.q.I(m1VarM2, g0Var2, fVar2);
                                        x5.u(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
                                        l1.q.I(rVarC2, g0Var2, fVar4);
                                        kz.a.e(null, g0Var2, 0, 1);
                                        k00.f.a(z3.U(g0Var2, 2131886723), z1.d(rVar9, 1.0f), i2.t.b(0.62f, dl.a.k), kh.o.z(z11 ? 18 : 17), new y3.o(kh.o.z(24)), q3.u.B, new x3.k(3), 3, 0.0f, null, g0Var2, 12804096, 768);
                                        g0Var3.r(true);
                                        g0Var3.r(true);
                                    } else {
                                        g0Var3.V();
                                    }
                                    return g00.b0.a;
                                }
                            }, -1865722117, true), 3);
                            z zVar2 = zVar;
                            boolean z9 = zVar2.a;
                            final u00.k kVar5 = kVar;
                            if (z9) {
                                final int i12 = 2;
                                j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                                    @Override
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        j0.b item = (j0.b) obj2;
                                        switch (i12) {
                                            case 0:
                                                g0 g0Var2 = (l1.j) obj3;
                                                int iIntValue = ((Integer) obj4).intValue();
                                                kotlin.jvm.internal.m.e(item, "$this$item");
                                                g0 g0Var3 = g0Var2;
                                                if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    u00.k kVar6 = kVar5;
                                                    boolean zG = g0Var3.g(kVar6);
                                                    Object objN3 = g0Var3.N();
                                                    if (zG || objN3 == l1.i.a) {
                                                        objN3 = new bt.t0(18, kVar6);
                                                        g0Var3.n0(objN3);
                                                    }
                                                    w00.a.f((u00.a) objN3, rVar9, g0Var2, 0);
                                                } else {
                                                    g0Var3.V();
                                                }
                                                break;
                                            case 1:
                                                g0 g0Var4 = (l1.j) obj3;
                                                int iIntValue2 = ((Integer) obj4).intValue();
                                                kotlin.jvm.internal.m.e(item, "$this$item");
                                                g0 g0Var5 = g0Var4;
                                                if (g0Var5.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                    String strU = z3.U(g0Var4, 2131886727);
                                                    u00.k kVar7 = kVar5;
                                                    boolean zG2 = g0Var5.g(kVar7);
                                                    Object objN4 = g0Var5.N();
                                                    if (zG2 || objN4 == l1.i.a) {
                                                        objN4 = new a0(29, kVar7);
                                                        g0Var5.n0(objN4);
                                                    }
                                                    kz.a.h(2131231110, strU, (u00.a) objN4, rVar9, null, g0Var4, 0, 48);
                                                } else {
                                                    g0Var5.V();
                                                }
                                                break;
                                            default:
                                                g0 g0Var6 = (l1.j) obj3;
                                                int iIntValue3 = ((Integer) obj4).intValue();
                                                kotlin.jvm.internal.m.e(item, "$this$item");
                                                g0 g0Var7 = g0Var6;
                                                if (g0Var7.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                    u00.k kVar8 = kVar5;
                                                    boolean zG3 = g0Var7.g(kVar8);
                                                    Object objN5 = g0Var7.N();
                                                    Object obj5 = l1.i.a;
                                                    if (zG3 || objN5 == obj5) {
                                                        objN5 = new t(2, kVar8);
                                                        g0Var7.n0(objN5);
                                                    }
                                                    u00.a aVar2 = (u00.a) objN5;
                                                    boolean zG4 = g0Var7.g(kVar8);
                                                    Object objN6 = g0Var7.N();
                                                    if (zG4 || objN6 == obj5) {
                                                        objN6 = new t(3, kVar8);
                                                        g0Var7.n0(objN6);
                                                    }
                                                    kz.a.c(aVar2, (u00.a) objN6, rVar9, g0Var6, 0);
                                                } else {
                                                    g0Var7.V();
                                                }
                                                break;
                                        }
                                        return b0.a;
                                    }
                                }, 1916785046, true), 3);
                            }
                            if (zVar2.b || zVar2.d || !r30.k.L0(zVar2.f) || !r30.k.L0(zVar2.g) || !r30.k.L0(zVar2.h)) {
                                j0.h.q(LazyColumn, (Object) null, new v1.c(new c0.f(zVar2, rVar9, 8), -380280755, true), 3);
                            }
                            final int i13 = 1;
                            j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                                @Override
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    j0.b item = (j0.b) obj2;
                                    switch (i13) {
                                        case 0:
                                            g0 g0Var2 = (l1.j) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            kotlin.jvm.internal.m.e(item, "$this$item");
                                            g0 g0Var3 = g0Var2;
                                            if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                u00.k kVar6 = kVar5;
                                                boolean zG = g0Var3.g(kVar6);
                                                Object objN3 = g0Var3.N();
                                                if (zG || objN3 == l1.i.a) {
                                                    objN3 = new bt.t0(18, kVar6);
                                                    g0Var3.n0(objN3);
                                                }
                                                w00.a.f((u00.a) objN3, rVar9, g0Var2, 0);
                                            } else {
                                                g0Var3.V();
                                            }
                                            break;
                                        case 1:
                                            g0 g0Var4 = (l1.j) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            kotlin.jvm.internal.m.e(item, "$this$item");
                                            g0 g0Var5 = g0Var4;
                                            if (g0Var5.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                String strU = z3.U(g0Var4, 2131886727);
                                                u00.k kVar7 = kVar5;
                                                boolean zG2 = g0Var5.g(kVar7);
                                                Object objN4 = g0Var5.N();
                                                if (zG2 || objN4 == l1.i.a) {
                                                    objN4 = new a0(29, kVar7);
                                                    g0Var5.n0(objN4);
                                                }
                                                kz.a.h(2131231110, strU, (u00.a) objN4, rVar9, null, g0Var4, 0, 48);
                                            } else {
                                                g0Var5.V();
                                            }
                                            break;
                                        default:
                                            g0 g0Var6 = (l1.j) obj3;
                                            int iIntValue3 = ((Integer) obj4).intValue();
                                            kotlin.jvm.internal.m.e(item, "$this$item");
                                            g0 g0Var7 = g0Var6;
                                            if (g0Var7.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                u00.k kVar8 = kVar5;
                                                boolean zG3 = g0Var7.g(kVar8);
                                                Object objN5 = g0Var7.N();
                                                Object obj5 = l1.i.a;
                                                if (zG3 || objN5 == obj5) {
                                                    objN5 = new t(2, kVar8);
                                                    g0Var7.n0(objN5);
                                                }
                                                u00.a aVar2 = (u00.a) objN5;
                                                boolean zG4 = g0Var7.g(kVar8);
                                                Object objN6 = g0Var7.N();
                                                if (zG4 || objN6 == obj5) {
                                                    objN6 = new t(3, kVar8);
                                                    g0Var7.n0(objN6);
                                                }
                                                kz.a.c(aVar2, (u00.a) objN6, rVar9, g0Var6, 0);
                                            } else {
                                                g0Var7.V();
                                            }
                                            break;
                                    }
                                    return b0.a;
                                }
                            }, -1827331982, true), 3);
                            if (zVar2.r) {
                                final int i14 = 0;
                                j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                                    @Override
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        int i16 = i14;
                                        j0.b item = (j0.b) obj2;
                                        g0 g0Var2 = (l1.j) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        switch (i16) {
                                            case 0:
                                                kotlin.jvm.internal.m.e(item, "$this$item");
                                                g0 g0Var3 = g0Var2;
                                                if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    u00.k kVar6 = kVar5;
                                                    boolean zG = g0Var3.g(kVar6);
                                                    Object objN3 = g0Var3.N();
                                                    if (zG || objN3 == l1.i.a) {
                                                        objN3 = new t(0, kVar6);
                                                        g0Var3.n0(objN3);
                                                    }
                                                    kz.g.a((u00.a) objN3, h0.c.G(rVar9, 0.0f, z8 ? 0 : 12, 0.0f, 0.0f, 13), g0Var2, 0);
                                                } else {
                                                    g0Var3.V();
                                                }
                                                break;
                                            default:
                                                kotlin.jvm.internal.m.e(item, "$this$item");
                                                g0 g0Var4 = g0Var2;
                                                if (g0Var4.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    u00.k kVar7 = kVar5;
                                                    boolean zG2 = g0Var4.g(kVar7);
                                                    Object objN4 = g0Var4.N();
                                                    if (zG2 || objN4 == l1.i.a) {
                                                        objN4 = new t(1, kVar7);
                                                        g0Var4.n0(objN4);
                                                    }
                                                    kz.a.a((u00.a) objN4, h0.c.G(rVar9, 0.0f, z8 ? 0 : 12, 0.0f, 0.0f, 13), g0Var2, 0);
                                                } else {
                                                    g0Var4.V();
                                                }
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                }, -1445247986, true), 3);
                            } else if (zVar2.q) {
                                final int i15 = 1;
                                j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                                    @Override
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        int i16 = i15;
                                        j0.b item = (j0.b) obj2;
                                        g0 g0Var2 = (l1.j) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        switch (i16) {
                                            case 0:
                                                kotlin.jvm.internal.m.e(item, "$this$item");
                                                g0 g0Var3 = g0Var2;
                                                if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    u00.k kVar6 = kVar5;
                                                    boolean zG = g0Var3.g(kVar6);
                                                    Object objN3 = g0Var3.N();
                                                    if (zG || objN3 == l1.i.a) {
                                                        objN3 = new t(0, kVar6);
                                                        g0Var3.n0(objN3);
                                                    }
                                                    kz.g.a((u00.a) objN3, h0.c.G(rVar9, 0.0f, z8 ? 0 : 12, 0.0f, 0.0f, 13), g0Var2, 0);
                                                } else {
                                                    g0Var3.V();
                                                }
                                                break;
                                            default:
                                                kotlin.jvm.internal.m.e(item, "$this$item");
                                                g0 g0Var4 = g0Var2;
                                                if (g0Var4.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    u00.k kVar7 = kVar5;
                                                    boolean zG2 = g0Var4.g(kVar7);
                                                    Object objN4 = g0Var4.N();
                                                    if (zG2 || objN4 == l1.i.a) {
                                                        objN4 = new t(1, kVar7);
                                                        g0Var4.n0(objN4);
                                                    }
                                                    kz.a.a((u00.a) objN4, h0.c.G(rVar9, 0.0f, z8 ? 0 : 12, 0.0f, 0.0f, 13), g0Var2, 0);
                                                } else {
                                                    g0Var4.V();
                                                }
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                }, 573873463, true), 3);
                            } else if (zVar2.s) {
                                j0.h.q(LazyColumn, (Object) null, new v1.c(new ct.e0(rVar9, z8, 3), -1841567210, true), 3);
                            }
                            return g00.b0.a;
                        }
                    };
                    g0Var.n0(kVar4);
                    objN2 = kVar4;
                }
                j0.v vVar5 = vVarA;
                k00.f.d(rVarV2, vVar5, p1VarG2, fVarG2, gVar2, null, false, null, (u00.k) objN2, g0Var, ((i7 >> 6) & 112) | 196608, 456);
                vVar3 = vVar5;
                rVar3 = rVar5;
            } else {
                g0Var.V();
                rVar3 = rVar2;
                vVar3 = vVar2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new b6.p(zVar, kVar, rVar3, vVar3, i, i2, 2);
            }
        }
        vVar2 = vVar;
        i5 = i4 | i11;
        if ((i5 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (g0Var.S(i5 & 1, z)) {
            g0Var.X();
            i6 = i & 1;
            rVar4 = b2.o.A;
            if (i6 != 0) {
                if (i9 != 0) {
                    rVar2 = rVar4;
                }
                if ((i2 & 8) != 0) {
                    i7 = i5 & (-7169);
                    vVarA = j0.x.a(0, g0Var, 3);
                    rVar5 = rVar2;
                } else {
                    i7 = i5;
                    rVar5 = rVar2;
                    vVarA = vVar2;
                }
            } else {
                if (i9 != 0) {
                    rVar2 = rVar4;
                }
                if ((i2 & 8) != 0) {
                    i7 = i5 & (-7169);
                    vVarA = j0.x.a(0, g0Var, 3);
                    rVar5 = rVar2;
                } else {
                    i7 = i5;
                    rVar5 = rVar2;
                    vVarA = vVar2;
                }
            }
            g0Var.s();
            aVar = (gm.a) g0Var.k(dl.e.a);
            if (aVar == gm.a.B) {
                z2 = true;
            } else {
                z2 = false;
            }
            n1Var = (n1) g0Var.k(dq.l.a);
            WeakHashMap weakHashMap3 = m2.w;
            t0VarL = h0.c.l(h0.b.e(g0Var).g, g0Var);
            iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                f = 16;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 24;
            }
            if (z2) {
                rVarE = z1.s(h0.c.E(rVar4, b, 0.0f, 2), 0.0f, a, 1);
            } else {
                rVarE = h0.c.E(rVar4, f, 0.0f, 2);
            }
            f2 = 16;
            float fC3 = t0VarL.c() + n1Var.c() + 44 + f2;
            if (!z2) {
                f2 = 56;
            }
            f3 = fC3 + f2;
            zE = g0Var.e(aVar.ordinal()) | g0Var.g(n1Var) | g0Var.g(t0VarL);
            objN = g0Var.N();
            l1.c cVar3 = l1.i.a;
            if (zE) {
                objN = oi.k.t(t0VarL.a() + n1Var.a() + 24, g0Var);
            } else {
                objN = oi.k.t(t0VarL.a() + n1Var.a() + 24, g0Var);
            }
            float f6 = ((y3.f) objN).A;
            b2.r rVarV3 = rVar5.V(z1.c);
            p1 p1VarG3 = h0.c.g(0.0f, 0.0f, 0.0f, f6, 7);
            b2.g gVar3 = b2.b.N;
            h0.b bVar3 = h0.i.a;
            if (z2) {
                i8 = 20;
            } else {
                i8 = 12;
            }
            h0.f fVarG3 = h0.i.g(i8);
            boolean zH3 = g0Var.h(z2) | g0Var.d(f3) | g0Var.g(rVarE);
            if ((i7 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = zH3 | z3 | ((i7 & 112) == 32);
            objN2 = g0Var.N();
            if (z4) {
                final b2.r rVar9 = rVarE;
                final boolean z8 = z2;
                u00.k kVar5 = new u00.k() {
                    @Override
                    public final Object invoke(Object obj) {
                        j0.h LazyColumn = (j0.h) obj;
                        kotlin.jvm.internal.m.e(LazyColumn, "$this$LazyColumn");
                        final boolean z9 = z8;
                        final float f7 = f3;
                        final b2.r rVar10 = rVar9;
                        j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                            @Override
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                j0.b item = (j0.b) obj2;
                                g0 g0Var2 = (l1.j) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                kotlin.jvm.internal.m.e(item, "$this$item");
                                boolean z11 = (iIntValue & 17) != 16;
                                g0 g0Var3 = g0Var2;
                                a30.x xVar = g0Var3.a;
                                if (g0Var3.S(iIntValue & 1, z11)) {
                                    b2.o oVar = b2.o.A;
                                    b2.r rVarD = z1.d(oVar, 1.0f);
                                    w0 w0VarD = h0.o.d(b2.b.A, false);
                                    int iHashCode = Long.hashCode(g0Var3.T);
                                    m1 m1VarM = g0Var3.m();
                                    b2.r rVarC = b2.a.c(rVarD, g0Var2);
                                    b3.i.c.getClass();
                                    b3.g gVar4 = b3.h.b;
                                    g0Var3.g0();
                                    if (g0Var3.S) {
                                        g0Var3.l(gVar4);
                                    } else {
                                        g0Var3.q0();
                                    }
                                    b3.f fVar = b3.h.f;
                                    l1.q.I(w0VarD, g0Var2, fVar);
                                    b3.f fVar2 = b3.h.e;
                                    l1.q.I(m1VarM, g0Var2, fVar2);
                                    Integer numValueOf = Integer.valueOf(iHashCode);
                                    b3.f fVar3 = b3.h.g;
                                    l1.q.I(numValueOf, g0Var2, fVar3);
                                    b3.e eVar = b3.h.h;
                                    l1.q.E(g0Var2, eVar);
                                    b3.f fVar4 = b3.h.d;
                                    l1.q.I(rVarC, g0Var2, fVar4);
                                    boolean z12 = z9;
                                    if (z12) {
                                        g0Var3.c0(277371297);
                                        g0Var3.r(false);
                                    } else {
                                        g0Var3.c0(277256938);
                                        kz.a.d(h0.s.a.b(), g0Var2, 0);
                                        g0Var3.r(false);
                                    }
                                    b2.g gVar5 = b2.b.N;
                                    h0.f fVarG4 = h0.i.g(28);
                                    b2.r rVarG = h0.c.G(z1.d(oVar, 1.0f), 0.0f, f7, 0.0f, 8, 5);
                                    h0.v vVarA2 = h0.u.a(fVarG4, gVar5, g0Var2, 54);
                                    int iHashCode2 = Long.hashCode(g0Var3.T);
                                    m1 m1VarM2 = g0Var3.m();
                                    b2.r rVarC2 = b2.a.c(rVarG, g0Var2);
                                    g0Var3.g0();
                                    if (g0Var3.S) {
                                        g0Var3.l(gVar4);
                                    } else {
                                        g0Var3.q0();
                                    }
                                    l1.q.I(vVarA2, g0Var2, fVar);
                                    l1.q.I(m1VarM2, g0Var2, fVar2);
                                    x5.u(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
                                    l1.q.I(rVarC2, g0Var2, fVar4);
                                    kz.a.e(null, g0Var2, 0, 1);
                                    k00.f.a(z3.U(g0Var2, 2131886723), z1.d(rVar10, 1.0f), i2.t.b(0.62f, dl.a.k), kh.o.z(z12 ? 18 : 17), new y3.o(kh.o.z(24)), q3.u.B, new x3.k(3), 3, 0.0f, null, g0Var2, 12804096, 768);
                                    g0Var3.r(true);
                                    g0Var3.r(true);
                                } else {
                                    g0Var3.V();
                                }
                                return g00.b0.a;
                            }
                        }, -1865722117, true), 3);
                        z zVar2 = zVar;
                        boolean z11 = zVar2.a;
                        final u00.k kVar6 = kVar;
                        if (z11) {
                            final int i12 = 2;
                            j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                                @Override
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    j0.b item = (j0.b) obj2;
                                    switch (i12) {
                                        case 0:
                                            g0 g0Var2 = (l1.j) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            kotlin.jvm.internal.m.e(item, "$this$item");
                                            g0 g0Var3 = g0Var2;
                                            if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                u00.k kVar7 = kVar6;
                                                boolean zG = g0Var3.g(kVar7);
                                                Object objN3 = g0Var3.N();
                                                if (zG || objN3 == l1.i.a) {
                                                    objN3 = new bt.t0(18, kVar7);
                                                    g0Var3.n0(objN3);
                                                }
                                                w00.a.f((u00.a) objN3, rVar10, g0Var2, 0);
                                            } else {
                                                g0Var3.V();
                                            }
                                            break;
                                        case 1:
                                            g0 g0Var4 = (l1.j) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            kotlin.jvm.internal.m.e(item, "$this$item");
                                            g0 g0Var5 = g0Var4;
                                            if (g0Var5.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                String strU = z3.U(g0Var4, 2131886727);
                                                u00.k kVar8 = kVar6;
                                                boolean zG2 = g0Var5.g(kVar8);
                                                Object objN4 = g0Var5.N();
                                                if (zG2 || objN4 == l1.i.a) {
                                                    objN4 = new a0(29, kVar8);
                                                    g0Var5.n0(objN4);
                                                }
                                                kz.a.h(2131231110, strU, (u00.a) objN4, rVar10, null, g0Var4, 0, 48);
                                            } else {
                                                g0Var5.V();
                                            }
                                            break;
                                        default:
                                            g0 g0Var6 = (l1.j) obj3;
                                            int iIntValue3 = ((Integer) obj4).intValue();
                                            kotlin.jvm.internal.m.e(item, "$this$item");
                                            g0 g0Var7 = g0Var6;
                                            if (g0Var7.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                u00.k kVar9 = kVar6;
                                                boolean zG3 = g0Var7.g(kVar9);
                                                Object objN5 = g0Var7.N();
                                                Object obj5 = l1.i.a;
                                                if (zG3 || objN5 == obj5) {
                                                    objN5 = new t(2, kVar9);
                                                    g0Var7.n0(objN5);
                                                }
                                                u00.a aVar2 = (u00.a) objN5;
                                                boolean zG4 = g0Var7.g(kVar9);
                                                Object objN6 = g0Var7.N();
                                                if (zG4 || objN6 == obj5) {
                                                    objN6 = new t(3, kVar9);
                                                    g0Var7.n0(objN6);
                                                }
                                                kz.a.c(aVar2, (u00.a) objN6, rVar10, g0Var6, 0);
                                            } else {
                                                g0Var7.V();
                                            }
                                            break;
                                    }
                                    return b0.a;
                                }
                            }, 1916785046, true), 3);
                        }
                        if (zVar2.b || zVar2.d || !r30.k.L0(zVar2.f) || !r30.k.L0(zVar2.g) || !r30.k.L0(zVar2.h)) {
                            j0.h.q(LazyColumn, (Object) null, new v1.c(new c0.f(zVar2, rVar10, 8), -380280755, true), 3);
                        }
                        final int i13 = 1;
                        j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                            @Override
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                j0.b item = (j0.b) obj2;
                                switch (i13) {
                                    case 0:
                                        g0 g0Var2 = (l1.j) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        kotlin.jvm.internal.m.e(item, "$this$item");
                                        g0 g0Var3 = g0Var2;
                                        if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            u00.k kVar7 = kVar6;
                                            boolean zG = g0Var3.g(kVar7);
                                            Object objN3 = g0Var3.N();
                                            if (zG || objN3 == l1.i.a) {
                                                objN3 = new bt.t0(18, kVar7);
                                                g0Var3.n0(objN3);
                                            }
                                            w00.a.f((u00.a) objN3, rVar10, g0Var2, 0);
                                        } else {
                                            g0Var3.V();
                                        }
                                        break;
                                    case 1:
                                        g0 g0Var4 = (l1.j) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        kotlin.jvm.internal.m.e(item, "$this$item");
                                        g0 g0Var5 = g0Var4;
                                        if (g0Var5.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            String strU = z3.U(g0Var4, 2131886727);
                                            u00.k kVar8 = kVar6;
                                            boolean zG2 = g0Var5.g(kVar8);
                                            Object objN4 = g0Var5.N();
                                            if (zG2 || objN4 == l1.i.a) {
                                                objN4 = new a0(29, kVar8);
                                                g0Var5.n0(objN4);
                                            }
                                            kz.a.h(2131231110, strU, (u00.a) objN4, rVar10, null, g0Var4, 0, 48);
                                        } else {
                                            g0Var5.V();
                                        }
                                        break;
                                    default:
                                        g0 g0Var6 = (l1.j) obj3;
                                        int iIntValue3 = ((Integer) obj4).intValue();
                                        kotlin.jvm.internal.m.e(item, "$this$item");
                                        g0 g0Var7 = g0Var6;
                                        if (g0Var7.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                            u00.k kVar9 = kVar6;
                                            boolean zG3 = g0Var7.g(kVar9);
                                            Object objN5 = g0Var7.N();
                                            Object obj5 = l1.i.a;
                                            if (zG3 || objN5 == obj5) {
                                                objN5 = new t(2, kVar9);
                                                g0Var7.n0(objN5);
                                            }
                                            u00.a aVar2 = (u00.a) objN5;
                                            boolean zG4 = g0Var7.g(kVar9);
                                            Object objN6 = g0Var7.N();
                                            if (zG4 || objN6 == obj5) {
                                                objN6 = new t(3, kVar9);
                                                g0Var7.n0(objN6);
                                            }
                                            kz.a.c(aVar2, (u00.a) objN6, rVar10, g0Var6, 0);
                                        } else {
                                            g0Var7.V();
                                        }
                                        break;
                                }
                                return b0.a;
                            }
                        }, -1827331982, true), 3);
                        if (zVar2.r) {
                            final int i14 = 0;
                            j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                                @Override
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    int i16 = i14;
                                    j0.b item = (j0.b) obj2;
                                    g0 g0Var2 = (l1.j) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    switch (i16) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(item, "$this$item");
                                            g0 g0Var3 = g0Var2;
                                            if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                u00.k kVar7 = kVar6;
                                                boolean zG = g0Var3.g(kVar7);
                                                Object objN3 = g0Var3.N();
                                                if (zG || objN3 == l1.i.a) {
                                                    objN3 = new t(0, kVar7);
                                                    g0Var3.n0(objN3);
                                                }
                                                kz.g.a((u00.a) objN3, h0.c.G(rVar10, 0.0f, z9 ? 0 : 12, 0.0f, 0.0f, 13), g0Var2, 0);
                                            } else {
                                                g0Var3.V();
                                            }
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(item, "$this$item");
                                            g0 g0Var4 = g0Var2;
                                            if (g0Var4.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                u00.k kVar8 = kVar6;
                                                boolean zG2 = g0Var4.g(kVar8);
                                                Object objN4 = g0Var4.N();
                                                if (zG2 || objN4 == l1.i.a) {
                                                    objN4 = new t(1, kVar8);
                                                    g0Var4.n0(objN4);
                                                }
                                                kz.a.a((u00.a) objN4, h0.c.G(rVar10, 0.0f, z9 ? 0 : 12, 0.0f, 0.0f, 13), g0Var2, 0);
                                            } else {
                                                g0Var4.V();
                                            }
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, -1445247986, true), 3);
                        } else if (zVar2.q) {
                            final int i15 = 1;
                            j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                                @Override
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    int i16 = i15;
                                    j0.b item = (j0.b) obj2;
                                    g0 g0Var2 = (l1.j) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    switch (i16) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(item, "$this$item");
                                            g0 g0Var3 = g0Var2;
                                            if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                u00.k kVar7 = kVar6;
                                                boolean zG = g0Var3.g(kVar7);
                                                Object objN3 = g0Var3.N();
                                                if (zG || objN3 == l1.i.a) {
                                                    objN3 = new t(0, kVar7);
                                                    g0Var3.n0(objN3);
                                                }
                                                kz.g.a((u00.a) objN3, h0.c.G(rVar10, 0.0f, z9 ? 0 : 12, 0.0f, 0.0f, 13), g0Var2, 0);
                                            } else {
                                                g0Var3.V();
                                            }
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(item, "$this$item");
                                            g0 g0Var4 = g0Var2;
                                            if (g0Var4.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                u00.k kVar8 = kVar6;
                                                boolean zG2 = g0Var4.g(kVar8);
                                                Object objN4 = g0Var4.N();
                                                if (zG2 || objN4 == l1.i.a) {
                                                    objN4 = new t(1, kVar8);
                                                    g0Var4.n0(objN4);
                                                }
                                                kz.a.a((u00.a) objN4, h0.c.G(rVar10, 0.0f, z9 ? 0 : 12, 0.0f, 0.0f, 13), g0Var2, 0);
                                            } else {
                                                g0Var4.V();
                                            }
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, 573873463, true), 3);
                        } else if (zVar2.s) {
                            j0.h.q(LazyColumn, (Object) null, new v1.c(new ct.e0(rVar10, z9, 3), -1841567210, true), 3);
                        }
                        return g00.b0.a;
                    }
                };
                g0Var.n0(kVar5);
                objN2 = kVar5;
            } else {
                final b2.r rVar10 = rVarE;
                final boolean z9 = z2;
                u00.k kVar6 = new u00.k() {
                    @Override
                    public final Object invoke(Object obj) {
                        j0.h LazyColumn = (j0.h) obj;
                        kotlin.jvm.internal.m.e(LazyColumn, "$this$LazyColumn");
                        final boolean z11 = z9;
                        final float f7 = f3;
                        final b2.r rVar11 = rVar10;
                        j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                            @Override
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                j0.b item = (j0.b) obj2;
                                g0 g0Var2 = (l1.j) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                kotlin.jvm.internal.m.e(item, "$this$item");
                                boolean z12 = (iIntValue & 17) != 16;
                                g0 g0Var3 = g0Var2;
                                a30.x xVar = g0Var3.a;
                                if (g0Var3.S(iIntValue & 1, z12)) {
                                    b2.o oVar = b2.o.A;
                                    b2.r rVarD = z1.d(oVar, 1.0f);
                                    w0 w0VarD = h0.o.d(b2.b.A, false);
                                    int iHashCode = Long.hashCode(g0Var3.T);
                                    m1 m1VarM = g0Var3.m();
                                    b2.r rVarC = b2.a.c(rVarD, g0Var2);
                                    b3.i.c.getClass();
                                    b3.g gVar4 = b3.h.b;
                                    g0Var3.g0();
                                    if (g0Var3.S) {
                                        g0Var3.l(gVar4);
                                    } else {
                                        g0Var3.q0();
                                    }
                                    b3.f fVar = b3.h.f;
                                    l1.q.I(w0VarD, g0Var2, fVar);
                                    b3.f fVar2 = b3.h.e;
                                    l1.q.I(m1VarM, g0Var2, fVar2);
                                    Integer numValueOf = Integer.valueOf(iHashCode);
                                    b3.f fVar3 = b3.h.g;
                                    l1.q.I(numValueOf, g0Var2, fVar3);
                                    b3.e eVar = b3.h.h;
                                    l1.q.E(g0Var2, eVar);
                                    b3.f fVar4 = b3.h.d;
                                    l1.q.I(rVarC, g0Var2, fVar4);
                                    boolean z13 = z11;
                                    if (z13) {
                                        g0Var3.c0(277371297);
                                        g0Var3.r(false);
                                    } else {
                                        g0Var3.c0(277256938);
                                        kz.a.d(h0.s.a.b(), g0Var2, 0);
                                        g0Var3.r(false);
                                    }
                                    b2.g gVar5 = b2.b.N;
                                    h0.f fVarG4 = h0.i.g(28);
                                    b2.r rVarG = h0.c.G(z1.d(oVar, 1.0f), 0.0f, f7, 0.0f, 8, 5);
                                    h0.v vVarA2 = h0.u.a(fVarG4, gVar5, g0Var2, 54);
                                    int iHashCode2 = Long.hashCode(g0Var3.T);
                                    m1 m1VarM2 = g0Var3.m();
                                    b2.r rVarC2 = b2.a.c(rVarG, g0Var2);
                                    g0Var3.g0();
                                    if (g0Var3.S) {
                                        g0Var3.l(gVar4);
                                    } else {
                                        g0Var3.q0();
                                    }
                                    l1.q.I(vVarA2, g0Var2, fVar);
                                    l1.q.I(m1VarM2, g0Var2, fVar2);
                                    x5.u(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
                                    l1.q.I(rVarC2, g0Var2, fVar4);
                                    kz.a.e(null, g0Var2, 0, 1);
                                    k00.f.a(z3.U(g0Var2, 2131886723), z1.d(rVar11, 1.0f), i2.t.b(0.62f, dl.a.k), kh.o.z(z13 ? 18 : 17), new y3.o(kh.o.z(24)), q3.u.B, new x3.k(3), 3, 0.0f, null, g0Var2, 12804096, 768);
                                    g0Var3.r(true);
                                    g0Var3.r(true);
                                } else {
                                    g0Var3.V();
                                }
                                return g00.b0.a;
                            }
                        }, -1865722117, true), 3);
                        z zVar2 = zVar;
                        boolean z12 = zVar2.a;
                        final u00.k kVar7 = kVar;
                        if (z12) {
                            final int i12 = 2;
                            j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                                @Override
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    j0.b item = (j0.b) obj2;
                                    switch (i12) {
                                        case 0:
                                            g0 g0Var2 = (l1.j) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            kotlin.jvm.internal.m.e(item, "$this$item");
                                            g0 g0Var3 = g0Var2;
                                            if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                u00.k kVar8 = kVar7;
                                                boolean zG = g0Var3.g(kVar8);
                                                Object objN3 = g0Var3.N();
                                                if (zG || objN3 == l1.i.a) {
                                                    objN3 = new bt.t0(18, kVar8);
                                                    g0Var3.n0(objN3);
                                                }
                                                w00.a.f((u00.a) objN3, rVar11, g0Var2, 0);
                                            } else {
                                                g0Var3.V();
                                            }
                                            break;
                                        case 1:
                                            g0 g0Var4 = (l1.j) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            kotlin.jvm.internal.m.e(item, "$this$item");
                                            g0 g0Var5 = g0Var4;
                                            if (g0Var5.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                String strU = z3.U(g0Var4, 2131886727);
                                                u00.k kVar9 = kVar7;
                                                boolean zG2 = g0Var5.g(kVar9);
                                                Object objN4 = g0Var5.N();
                                                if (zG2 || objN4 == l1.i.a) {
                                                    objN4 = new a0(29, kVar9);
                                                    g0Var5.n0(objN4);
                                                }
                                                kz.a.h(2131231110, strU, (u00.a) objN4, rVar11, null, g0Var4, 0, 48);
                                            } else {
                                                g0Var5.V();
                                            }
                                            break;
                                        default:
                                            g0 g0Var6 = (l1.j) obj3;
                                            int iIntValue3 = ((Integer) obj4).intValue();
                                            kotlin.jvm.internal.m.e(item, "$this$item");
                                            g0 g0Var7 = g0Var6;
                                            if (g0Var7.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                u00.k kVar10 = kVar7;
                                                boolean zG3 = g0Var7.g(kVar10);
                                                Object objN5 = g0Var7.N();
                                                Object obj5 = l1.i.a;
                                                if (zG3 || objN5 == obj5) {
                                                    objN5 = new t(2, kVar10);
                                                    g0Var7.n0(objN5);
                                                }
                                                u00.a aVar2 = (u00.a) objN5;
                                                boolean zG4 = g0Var7.g(kVar10);
                                                Object objN6 = g0Var7.N();
                                                if (zG4 || objN6 == obj5) {
                                                    objN6 = new t(3, kVar10);
                                                    g0Var7.n0(objN6);
                                                }
                                                kz.a.c(aVar2, (u00.a) objN6, rVar11, g0Var6, 0);
                                            } else {
                                                g0Var7.V();
                                            }
                                            break;
                                    }
                                    return b0.a;
                                }
                            }, 1916785046, true), 3);
                        }
                        if (zVar2.b || zVar2.d || !r30.k.L0(zVar2.f) || !r30.k.L0(zVar2.g) || !r30.k.L0(zVar2.h)) {
                            j0.h.q(LazyColumn, (Object) null, new v1.c(new c0.f(zVar2, rVar11, 8), -380280755, true), 3);
                        }
                        final int i13 = 1;
                        j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                            @Override
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                j0.b item = (j0.b) obj2;
                                switch (i13) {
                                    case 0:
                                        g0 g0Var2 = (l1.j) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        kotlin.jvm.internal.m.e(item, "$this$item");
                                        g0 g0Var3 = g0Var2;
                                        if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            u00.k kVar8 = kVar7;
                                            boolean zG = g0Var3.g(kVar8);
                                            Object objN3 = g0Var3.N();
                                            if (zG || objN3 == l1.i.a) {
                                                objN3 = new bt.t0(18, kVar8);
                                                g0Var3.n0(objN3);
                                            }
                                            w00.a.f((u00.a) objN3, rVar11, g0Var2, 0);
                                        } else {
                                            g0Var3.V();
                                        }
                                        break;
                                    case 1:
                                        g0 g0Var4 = (l1.j) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        kotlin.jvm.internal.m.e(item, "$this$item");
                                        g0 g0Var5 = g0Var4;
                                        if (g0Var5.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            String strU = z3.U(g0Var4, 2131886727);
                                            u00.k kVar9 = kVar7;
                                            boolean zG2 = g0Var5.g(kVar9);
                                            Object objN4 = g0Var5.N();
                                            if (zG2 || objN4 == l1.i.a) {
                                                objN4 = new a0(29, kVar9);
                                                g0Var5.n0(objN4);
                                            }
                                            kz.a.h(2131231110, strU, (u00.a) objN4, rVar11, null, g0Var4, 0, 48);
                                        } else {
                                            g0Var5.V();
                                        }
                                        break;
                                    default:
                                        g0 g0Var6 = (l1.j) obj3;
                                        int iIntValue3 = ((Integer) obj4).intValue();
                                        kotlin.jvm.internal.m.e(item, "$this$item");
                                        g0 g0Var7 = g0Var6;
                                        if (g0Var7.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                            u00.k kVar10 = kVar7;
                                            boolean zG3 = g0Var7.g(kVar10);
                                            Object objN5 = g0Var7.N();
                                            Object obj5 = l1.i.a;
                                            if (zG3 || objN5 == obj5) {
                                                objN5 = new t(2, kVar10);
                                                g0Var7.n0(objN5);
                                            }
                                            u00.a aVar2 = (u00.a) objN5;
                                            boolean zG4 = g0Var7.g(kVar10);
                                            Object objN6 = g0Var7.N();
                                            if (zG4 || objN6 == obj5) {
                                                objN6 = new t(3, kVar10);
                                                g0Var7.n0(objN6);
                                            }
                                            kz.a.c(aVar2, (u00.a) objN6, rVar11, g0Var6, 0);
                                        } else {
                                            g0Var7.V();
                                        }
                                        break;
                                }
                                return b0.a;
                            }
                        }, -1827331982, true), 3);
                        if (zVar2.r) {
                            final int i14 = 0;
                            j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                                @Override
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    int i16 = i14;
                                    j0.b item = (j0.b) obj2;
                                    g0 g0Var2 = (l1.j) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    switch (i16) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(item, "$this$item");
                                            g0 g0Var3 = g0Var2;
                                            if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                u00.k kVar8 = kVar7;
                                                boolean zG = g0Var3.g(kVar8);
                                                Object objN3 = g0Var3.N();
                                                if (zG || objN3 == l1.i.a) {
                                                    objN3 = new t(0, kVar8);
                                                    g0Var3.n0(objN3);
                                                }
                                                kz.g.a((u00.a) objN3, h0.c.G(rVar11, 0.0f, z11 ? 0 : 12, 0.0f, 0.0f, 13), g0Var2, 0);
                                            } else {
                                                g0Var3.V();
                                            }
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(item, "$this$item");
                                            g0 g0Var4 = g0Var2;
                                            if (g0Var4.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                u00.k kVar9 = kVar7;
                                                boolean zG2 = g0Var4.g(kVar9);
                                                Object objN4 = g0Var4.N();
                                                if (zG2 || objN4 == l1.i.a) {
                                                    objN4 = new t(1, kVar9);
                                                    g0Var4.n0(objN4);
                                                }
                                                kz.a.a((u00.a) objN4, h0.c.G(rVar11, 0.0f, z11 ? 0 : 12, 0.0f, 0.0f, 13), g0Var2, 0);
                                            } else {
                                                g0Var4.V();
                                            }
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, -1445247986, true), 3);
                        } else if (zVar2.q) {
                            final int i15 = 1;
                            j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                                @Override
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    int i16 = i15;
                                    j0.b item = (j0.b) obj2;
                                    g0 g0Var2 = (l1.j) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    switch (i16) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(item, "$this$item");
                                            g0 g0Var3 = g0Var2;
                                            if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                u00.k kVar8 = kVar7;
                                                boolean zG = g0Var3.g(kVar8);
                                                Object objN3 = g0Var3.N();
                                                if (zG || objN3 == l1.i.a) {
                                                    objN3 = new t(0, kVar8);
                                                    g0Var3.n0(objN3);
                                                }
                                                kz.g.a((u00.a) objN3, h0.c.G(rVar11, 0.0f, z11 ? 0 : 12, 0.0f, 0.0f, 13), g0Var2, 0);
                                            } else {
                                                g0Var3.V();
                                            }
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(item, "$this$item");
                                            g0 g0Var4 = g0Var2;
                                            if (g0Var4.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                u00.k kVar9 = kVar7;
                                                boolean zG2 = g0Var4.g(kVar9);
                                                Object objN4 = g0Var4.N();
                                                if (zG2 || objN4 == l1.i.a) {
                                                    objN4 = new t(1, kVar9);
                                                    g0Var4.n0(objN4);
                                                }
                                                kz.a.a((u00.a) objN4, h0.c.G(rVar11, 0.0f, z11 ? 0 : 12, 0.0f, 0.0f, 13), g0Var2, 0);
                                            } else {
                                                g0Var4.V();
                                            }
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, 573873463, true), 3);
                        } else if (zVar2.s) {
                            j0.h.q(LazyColumn, (Object) null, new v1.c(new ct.e0(rVar11, z11, 3), -1841567210, true), 3);
                        }
                        return g00.b0.a;
                    }
                };
                g0Var.n0(kVar6);
                objN2 = kVar6;
            }
            j0.v vVar6 = vVarA;
            k00.f.d(rVarV3, vVar6, p1VarG3, fVarG3, gVar3, null, false, null, (u00.k) objN2, g0Var, ((i7 >> 6) & 112) | 196608, 456);
            vVar3 = vVar6;
            rVar3 = rVar5;
        } else {
            g0Var.V();
            rVar3 = rVar2;
            vVar3 = vVar2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b6.p(zVar, kVar, rVar3, vVar3, i, i2, 2);
        }
    }

    public static final void b(l1.j jVar, int i) {
        Object x0Var;
        final d0 d0Var;
        b2.r rVar;
        h0.s sVar;
        jk.a aVar;
        final int i2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1081572423);
        final int i3 = 0;
        if (g0Var.S(i & 1, i != 0)) {
            e60.a aVarA = q50.c.a(g0Var);
            boolean zG = g0Var.g((Object) null) | g0Var.g(aVarA);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (zG || objN == cVar) {
                objN = oi.k.f(kotlin.jvm.internal.a0.a, sy.c.class, aVarA, (b60.a) null, g0Var);
            }
            sy.c cVar2 = (sy.c) objN;
            u00.a aVarA2 = cq.l.a(g0Var);
            e60.a aVarA3 = q50.c.a(g0Var);
            boolean zG2 = g0Var.g((Object) null) | g0Var.g(aVarA3);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == cVar) {
                objN2 = oi.k.f(kotlin.jvm.internal.a0.a, vp.x.class, aVarA3, (b60.a) null, g0Var);
            }
            vp.x xVar = (vp.x) objN2;
            f1 f1VarA = u6.a.a(g0Var);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            t6.b bVarZ = bi.b.z(f1VarA);
            e60.a aVarA4 = q50.c.a(g0Var);
            kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
            d0 d0Var2 = (d0) c7.i.S(b0Var.b(d0.class), f1VarA.getViewModelStore(), (String) null, bVarZ, aVarA4, (u00.a) null);
            z0 z0VarQ = k00.f.q(d0Var2.c.d, g0Var, 0);
            Context context = (Context) g0Var.k(o0.b);
            jk.a aVarD = kk.e.d(g0Var);
            ol.b bVar = (ol.b) g0Var.k(ol.a.a);
            e60.a aVarA5 = q50.c.a(g0Var);
            boolean zG3 = g0Var.g((Object) null) | g0Var.g(aVarA5);
            Object objN3 = g0Var.N();
            if (zG3 || objN3 == cVar) {
                objN3 = oi.k.f(b0Var, nm.b.class, aVarA5, (b60.a) null, g0Var);
            }
            nm.b bVar2 = (nm.b) objN3;
            j0.v vVarA = j0.x.a(0, g0Var, 3);
            j1.r rVarD = j1.k.d(g0Var);
            boolean z = g0Var.k(dl.e.a) == gm.a.B;
            n1 n1Var = (n1) g0Var.k(dq.l.a);
            WeakHashMap weakHashMap = m2.w;
            t0 t0VarL = h0.c.l(h0.b.e(g0Var).g, g0Var);
            boolean zG4 = g0Var.g(vVarA);
            Object objN4 = g0Var.N();
            if (zG4 || objN4 == cVar) {
                objN4 = l1.q.r(new el.b(vVarA, 9));
                g0Var.n0(objN4);
            }
            p2 p2Var = (p2) objN4;
            androidx.lifecycle.w wVar = (androidx.lifecycle.w) g0Var.k(r6.d.a);
            boolean zI = g0Var.i(bVar2) | g0Var.g(d0Var2) | g0Var.i(wVar) | g0Var.g(aVarA2) | g0Var.i(cVar2) | g0Var.i(context) | g0Var.g(bVar) | g0Var.i(xVar);
            Object objN5 = g0Var.N();
            if (zI || objN5 == cVar) {
                x0Var = new x0(bVar2, wVar, d0Var2, aVarA2, cVar2, context, bVar, xVar, (k00.c) null);
                d0Var = d0Var2;
                g0Var.n0(x0Var);
            } else {
                x0Var = objN5;
                d0Var = d0Var2;
            }
            l1.q.i(g00.b0.a, g0Var, (u00.n) x0Var);
            h0.a0 a0Var = z1.c;
            b2.r rVarF = z.n.f(a0Var, dl.a.L, i2.b0.b);
            b2.i iVar = b2.b.A;
            w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarF, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            b2.r rVar2 = b2.o.A;
            h0.s sVar2 = h0.s.a;
            if (z) {
                g0Var.c0(-702509098);
                rVar = rVar2;
                aVar = aVarD;
                sVar = sVar2;
                wr.k.N(((Number) p2Var.getValue()).floatValue(), sVar2.a(rVar2, b2.b.B), 0.0f, 0L, 0L, g0Var, 0);
                g0Var.r(false);
            } else {
                rVar = rVar2;
                sVar = sVar2;
                aVar = aVarD;
                g0Var.c0(-702344767);
                g0Var.r(false);
            }
            boolean z2 = ((z) z0VarQ.getValue()).u;
            boolean zG5 = g0Var.g(d0Var);
            Object objN6 = g0Var.N();
            if (zG5 || objN6 == cVar) {
                objN6 = new u00.a() {
                    @Override
                    public final Object invoke() {
                        int i4 = i3;
                        d0 d0Var3 = d0Var;
                        switch (i4) {
                            case 0:
                                d0Var3.h(i.a);
                                break;
                            default:
                                d0Var3.h(d.a);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN6);
            }
            jk.a aVar2 = aVar;
            j1.k.b(z2, (u00.a) objN6, a0Var, rVarD, (b2.d) null, v1.d.d(-538153656, new eu.p(1, t0VarL, n1Var, rVarD, z0VarQ, z), g0Var), v1.d.d(-1575164057, new bz.o((kk.c) aVar2, d0Var, vVarA, z0VarQ), g0Var), g0Var, 1769856);
            b2.r rVarA = sVar.a(h0.c.M(h0.c.E(rVar, 16, 0.0f, 2), h0.c.e), iVar);
            p0.e eVar = p0.f.a;
            float f = 0;
            float f2 = 44;
            long jB = i2.t.b(0.5f, dl.a.P);
            boolean zG6 = g0Var.g(d0Var);
            Object objN7 = g0Var.N();
            if (zG6 || objN7 == cVar) {
                i2 = 1;
                objN7 = new u00.a() {
                    @Override
                    public final Object invoke() {
                        int i4 = i2;
                        d0 d0Var3 = d0Var;
                        switch (i4) {
                            case 0:
                                d0Var3.h(i.a);
                                break;
                            default:
                                d0Var3.h(d.a);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN7);
            } else {
                i2 = 1;
            }
            w50.c.f((u00.a) objN7, aVar2, rVarA, false, false, 0.0f, new y3.f(f2), 0L, jB, 10.0f, eVar, f, a.a, g0Var, 806879232, 432, 184);
            g0Var = g0Var;
            g0Var.r(i2);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new jk.c(i, 3);
        }
    }

    public static final void c(z zVar, b2.r rVar, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1525485274);
        int i2 = (g0Var.g(zVar) ? 4 : 2) | i | (g0Var.g(rVar) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            kz.a.g(rVar, v1.d.d(-1590181641, new a1.w(zVar, 9), g0Var), g0Var, ((i2 >> 3) & 14) | 48);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new al.i(zVar, rVar, i, 26);
        }
    }
}

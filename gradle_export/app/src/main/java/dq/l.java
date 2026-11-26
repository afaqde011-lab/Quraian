package dq;

import a1.e1;
import a1.y1;
import a30.x;
import android.content.res.Configuration;
import androidx.lifecycle.f1;
import as.f0;
import c3.o0;
import c3.o1;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.quranify.home.presentation.navigation.HomeRoute$AudioStoryScreen;
import com.mchutov.quranify.home.presentation.navigation.HomeRoute$PlaylistScreen;
import com.mchutov.quranify.playlist.presentation.navigation.PlaylistsRoute$PlaylistScreen;
import com.mchutov.quranify.reciters.presentation.navigation.ReciterRoute$ReciterScreen;
import com.mchutov.quranify.search.presentation.navigation.SearchRoute$PlaylistScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$DebugControlsScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$DownloadManagerScreen;
import g1.j7;
import h0.n1;
import h0.p1;
import h0.z1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.r1;
import l1.z0;
import x.y;
import z2.d0;
import z2.w0;

public abstract class l {
    public static final l1.t a = new l1.t(new a2.f(22));

    public static final void a(l1.j jVar, int i) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        p9.g gVar;
        boolean z;
        gm.a aVar;
        final z0 z0Var;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-683223997);
        if (g0Var.S(i & 1, i != 0)) {
            f1 f1VarA = u6.a.a(g0Var);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            t6.b bVarZ = bi.b.z(f1VarA);
            e60.a aVarA = q50.c.a(g0Var);
            b0 b0Var = a0.a;
            final u uVar = (u) c7.i.S(b0Var.b(u.class), f1VarA.getViewModelStore(), (String) null, bVarZ, aVarA, (u00.a) null);
            final kk.c cVarD = kk.e.d(g0Var);
            final y3.c cVar = (y3.c) g0Var.k(o1.h);
            gm.a aVar2 = (gm.a) g0Var.k(dl.e.a);
            Configuration configuration = (Configuration) g0Var.k(o0.a);
            Object objN = g0Var.N();
            Object obj6 = l1.i.a;
            if (objN == obj6) {
                objN = l1.q.z(h0.c.e(0.0f, 0.0f, 3));
                g0Var.n0(objN);
            }
            final z0 z0Var2 = (z0) objN;
            final z0 z0VarQ = k00.f.q(uVar.c.d, g0Var, 0);
            e60.a aVarA2 = q50.c.a(g0Var);
            boolean zG = g0Var.g((Object) null) | g0Var.g(aVarA2);
            Object objN2 = g0Var.N();
            if (zG || objN2 == obj6) {
                objN2 = oi.k.f(b0Var, cq.b.class, aVarA2, (b60.a) null, g0Var);
            }
            final cq.b bVar = (cq.b) objN2;
            e60.a aVarA3 = q50.c.a(g0Var);
            boolean zG2 = g0Var.g((Object) null) | g0Var.g(aVarA3);
            Object objN3 = g0Var.N();
            if (zG2 || objN3 == obj6) {
                objN3 = oi.k.f(b0Var, rr.b.class, aVarA3, (b60.a) null, g0Var);
            }
            rr.b bVar2 = (rr.b) objN3;
            e60.a aVarA4 = q50.c.a(g0Var);
            boolean zG3 = g0Var.g((Object) null) | g0Var.g(aVarA4);
            Object objN4 = g0Var.N();
            if (zG3 || objN4 == obj6) {
                objN4 = oi.k.f(b0Var, gx.e.class, aVarA4, (b60.a) null, g0Var);
            }
            gx.e eVar = (gx.e) objN4;
            e60.a aVarA5 = q50.c.a(g0Var);
            boolean zG4 = g0Var.g((Object) null) | g0Var.g(aVarA5);
            Object objN5 = g0Var.N();
            if (zG4 || objN5 == obj6) {
                objN5 = oi.k.f(b0Var, fw.c.class, aVarA5, (b60.a) null, g0Var);
            }
            fw.c cVar2 = (fw.c) objN5;
            e60.a aVarA6 = q50.c.a(g0Var);
            boolean zG5 = g0Var.g((Object) null) | g0Var.g(aVarA6);
            Object objN6 = g0Var.N();
            if (zG5 || objN6 == obj6) {
                obj = null;
                objN6 = oi.k.f(b0Var, sy.c.class, aVarA6, (b60.a) null, g0Var);
            } else {
                obj = null;
            }
            sy.c cVar3 = (sy.c) objN6;
            e60.a aVarA7 = q50.c.a(g0Var);
            boolean zG6 = g0Var.g(obj) | g0Var.g(aVarA7);
            Object objN7 = g0Var.N();
            if (zG6 || objN7 == obj6) {
                obj2 = null;
                objN7 = oi.k.f(b0Var, ey.b.class, aVarA7, (b60.a) null, g0Var);
            } else {
                obj2 = null;
            }
            ey.b bVar3 = (ey.b) objN7;
            e60.a aVarA8 = q50.c.a(g0Var);
            boolean zG7 = g0Var.g(obj2) | g0Var.g(aVarA8);
            Object objN8 = g0Var.N();
            if (zG7 || objN8 == obj6) {
                obj3 = null;
                objN8 = oi.k.f(b0Var, zs.b.class, aVarA8, (b60.a) null, g0Var);
            } else {
                obj3 = null;
            }
            zs.b bVar4 = (zs.b) objN8;
            e60.a aVarA9 = q50.c.a(g0Var);
            boolean zG8 = g0Var.g(obj3) | g0Var.g(aVarA9);
            Object objN9 = g0Var.N();
            if (zG8 || objN9 == obj6) {
                obj4 = null;
                objN9 = oi.k.f(b0Var, aq.a.class, aVarA9, (b60.a) null, g0Var);
            } else {
                obj4 = null;
            }
            final aq.a aVar3 = (aq.a) objN9;
            e60.a aVarA10 = q50.c.a(g0Var);
            boolean zG9 = g0Var.g(obj4) | g0Var.g(aVarA10);
            Object objN10 = g0Var.N();
            if (zG9 || objN10 == obj6) {
                obj5 = null;
                objN10 = oi.k.f(b0Var, zu.a.class, aVarA10, (b60.a) null, g0Var);
            } else {
                obj5 = null;
            }
            zu.a aVar4 = (zu.a) objN10;
            e60.a aVarA11 = q50.c.a(g0Var);
            boolean zG10 = g0Var.g(obj5) | g0Var.g(aVarA11);
            Object objN11 = g0Var.N();
            if (zG10 || objN11 == obj6) {
                objN11 = oi.k.f(b0Var, go.a.class, aVarA11, (b60.a) null, g0Var);
            }
            go.a aVar5 = (go.a) objN11;
            z0 z0VarQ2 = k00.f.q(new d40.z0(aVar4.c), g0Var, 0);
            boolean zG11 = g0Var.g(aVar5);
            Object objN12 = g0Var.N();
            if (zG11 || objN12 == obj6) {
                objN12 = d40.o.o(new k(new d40.z0(((no.n) aVar5).r), 0));
                g0Var.n0(objN12);
            }
            boolean z2 = ((ru.a) z0VarQ2.getValue()) == ru.a.B && ((Boolean) k00.f.p((d40.i) objN12, Boolean.FALSE, g0Var, 48).getValue()).booleanValue();
            final h00.a aVarT = f50.k.t(q50.c.b(g0Var).c("bottomNavigationScope", new b60.b("bottomNavigationScope")), g0Var);
            Object objN13 = g0Var.N();
            if (objN13 == obj6) {
                objN13 = l1.q.z(Boolean.TRUE);
                g0Var.n0(objN13);
            }
            final z0 z0Var3 = (z0) objN13;
            Object objN14 = g0Var.N();
            if (objN14 == obj6) {
                objN14 = l1.q.z(Boolean.TRUE);
                g0Var.n0(objN14);
            }
            final z0 z0Var4 = (z0) objN14;
            z0 z0VarQ3 = k00.f.q(bVar.b, g0Var, 0);
            p9.g gVar2 = (p9.g) h00.q.U0(((cq.i) z0VarQ3.getValue()).b().b());
            cq.i iVar = (cq.i) z0VarQ3.getValue();
            if (kotlin.jvm.internal.m.a(iVar, cq.c.b)) {
                gVar = (p9.g) h00.q.U0(bVar2.b);
            } else if (kotlin.jvm.internal.m.a(iVar, cq.f.b)) {
                gVar = (p9.g) h00.q.U0(eVar.a);
            } else if (kotlin.jvm.internal.m.a(iVar, cq.e.b)) {
                gVar = (p9.g) h00.q.U0(cVar2.a);
            } else if (kotlin.jvm.internal.m.a(iVar, cq.h.b)) {
                gVar = (p9.g) h00.q.U0(cVar3.b);
            } else if (kotlin.jvm.internal.m.a(iVar, cq.g.b)) {
                gVar = (p9.g) h00.q.U0(bVar3.a);
            } else {
                if (!kotlin.jvm.internal.m.a(iVar, cq.d.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                gVar = (p9.g) h00.q.U0(bVar4.a);
            }
            if (aVar2 == gm.a.B) {
                float f = configuration.screenWidthDp;
                float f2 = eq.b.a;
                float f3 = (f - eq.m.c) / 2;
                boolean z3 = gVar instanceof ReciterRoute$ReciterScreen;
                if (!z3 ? y3.f.a(f3, eq.b.b) < 0 : y3.f.a(f3, eq.b.a) < 0) {
                    z = false;
                } else if (z3 || (gVar instanceof gx.k) || (gVar instanceof gx.n) || (gVar instanceof HomeRoute$PlaylistScreen) || (gVar instanceof HomeRoute$AudioStoryScreen) || (gVar instanceof rr.i) || (gVar instanceof rr.f) || (gVar instanceof PlaylistsRoute$PlaylistScreen) || (gVar instanceof SearchRoute$PlaylistScreen) || (gVar instanceof SettingsRoute$DownloadManagerScreen) || (gVar instanceof SettingsRoute$DebugControlsScreen)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            final p2 p2VarA = x.d.a((!((m) z0VarQ.getValue()).a || z) ? 150 : 0, (y) null, (String) null, g0Var, 0, 14);
            p1 p1VarG = h0.c.g(0.0f, z ? 0 : ((n1) z0Var2.getValue()).c(), 0.0f, ((n1) z0Var2.getValue()).a(), 5);
            Object[] objArr = {aVar2, gVar2, ((cq.i) z0VarQ3.getValue()).b().c().getValue(), ((cq.i) z0VarQ3.getValue()).b().d().getValue()};
            boolean zE = g0Var.e(aVar2.ordinal()) | g0Var.i(gVar2) | g0Var.g(z0VarQ3);
            Object objN15 = g0Var.N();
            if (zE || objN15 == obj6) {
                aVar = aVar2;
                z0Var = z0VarQ3;
                objN15 = new i(aVar, gVar2, z0Var, z0Var3, z0Var4, (k00.c) null);
                g0Var.n0(objN15);
            } else {
                aVar = aVar2;
                z0Var = z0VarQ3;
            }
            l1.q.j(objArr, (u00.n) objN15, g0Var);
            final boolean z4 = z2;
            final gm.a aVar6 = aVar;
            l1.q.a(a.a(p1VarG), v1.d.d(-1649469181, new u00.n() {
                @Override
                public final Object invoke(Object obj7, Object obj8) {
                    cq.b bVar5;
                    jk.a aVar7;
                    boolean z5;
                    b2.r rVar;
                    boolean z6;
                    boolean z7;
                    boolean z8;
                    ?? r14;
                    j7 j7Var = h0.c.g;
                    l1.j jVar2 = (l1.j) obj7;
                    int iIntValue = ((Integer) obj8).intValue();
                    b2.i iVar2 = b2.b.H;
                    final int i2 = 0;
                    boolean z9 = (iIntValue & 3) != 2;
                    g0 g0Var2 = (g0) jVar2;
                    x xVar = g0Var2.a;
                    if (g0Var2.S(iIntValue & 1, z9)) {
                        b2.r rVar2 = z1.c;
                        b2.r rVarF = z.n.f(rVar2, dl.a.L, i2.b0.b);
                        w0 w0VarD = h0.o.d(b2.b.B, false);
                        int iHashCode = Long.hashCode(g0Var2.T);
                        m1 m1VarM = g0Var2.m();
                        b2.r rVarC = b2.a.c(rVarF, jVar2);
                        b3.i.c.getClass();
                        b3.g gVar3 = b3.h.b;
                        g0Var2.g0();
                        if (g0Var2.S) {
                            g0Var2.l(gVar3);
                        } else {
                            g0Var2.q0();
                        }
                        b3.f fVar = b3.h.f;
                        l1.q.I(w0VarD, jVar2, fVar);
                        b3.f fVar2 = b3.h.e;
                        l1.q.I(m1VarM, jVar2, fVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        b3.f fVar3 = b3.h.g;
                        l1.q.I(numValueOf, jVar2, fVar3);
                        b3.e eVar2 = b3.h.h;
                        l1.q.E(jVar2, eVar2);
                        b3.f fVar4 = b3.h.d;
                        l1.q.I(rVarC, jVar2, fVar4);
                        z0 z0Var5 = z0Var;
                        z1.p pVarB = ((cq.i) z0Var5.getValue()).b().b();
                        jk.a aVar8 = cVarD;
                        b2.r rVarA = kk.e.a(rVar2, aVar8);
                        final cq.b bVar6 = bVar;
                        boolean zI = g0Var2.i(bVar6);
                        Object objN16 = g0Var2.N();
                        l1.c cVar4 = l1.i.a;
                        if (zI || objN16 == cVar4) {
                            objN16 = new av.k(0, bVar6, cq.b.class, "navigateBack", "navigateBack()V", 0, 5);
                            g0Var2.n0(objN16);
                        }
                        p30.f.O(pVarB, rVarA, null, (u00.a) ((a10.g) objN16), va.a.S(new p9.f[]{bi.b.N(jVar2), p30.f.o0(jVar2)}), null, null, null, null, aVarT, jVar2, 0);
                        l1.j jVar3 = jVar2;
                        z0 z0Var6 = z0Var3;
                        boolean zBooleanValue = ((Boolean) z0Var6.getValue()).booleanValue();
                        gm.a aVar9 = aVar6;
                        y3.c cVar5 = cVar;
                        z0 z0Var7 = z0Var2;
                        b2.o oVar = b2.o.A;
                        if (zBooleanValue && aVar9 == gm.a.B) {
                            g0Var2.c0(1034808249);
                            b2.r rVarM = h0.c.M(oVar, h0.c.e);
                            boolean zG12 = g0Var2.g(cVar5);
                            Object objN17 = g0Var2.N();
                            if (zG12 || objN17 == cVar4) {
                                objN17 = new f0(cVar5, z0Var7, 6);
                                g0Var2.n0(objN17);
                            }
                            b2.r rVarA2 = h0.c.A(d0.o(rVarM, (u00.k) objN17), 0.0f, -((y3.f) p2VarA.getValue()).A, 1);
                            cq.i iVar3 = (cq.i) z0Var5.getValue();
                            boolean zI2 = g0Var2.i(bVar6);
                            Object objN18 = g0Var2.N();
                            if (zI2 || objN18 == cVar4) {
                                objN18 = new u00.k() {
                                    @Override
                                    public final Object invoke(Object obj9) {
                                        cq.i iVar4;
                                        cq.i iVar5;
                                        int i3 = i2;
                                        int iIntValue2 = ((Integer) obj9).intValue();
                                        switch (i3) {
                                            case 0:
                                                if (iIntValue2 == 0) {
                                                    iVar4 = cq.c.b;
                                                } else if (iIntValue2 == 1) {
                                                    iVar4 = cq.f.b;
                                                } else if (iIntValue2 == 2) {
                                                    iVar4 = cq.e.b;
                                                } else if (iIntValue2 == 3) {
                                                    iVar4 = cq.d.b;
                                                } else if (iIntValue2 != 4) {
                                                    iVar4 = iIntValue2 != 5 ? cq.c.b : cq.g.b;
                                                } else {
                                                    iVar4 = cq.h.b;
                                                }
                                                bVar6.b(iVar4);
                                                break;
                                            default:
                                                if (iIntValue2 == 0) {
                                                    iVar5 = cq.c.b;
                                                } else if (iIntValue2 == 1) {
                                                    iVar5 = cq.f.b;
                                                } else if (iIntValue2 == 2) {
                                                    iVar5 = cq.e.b;
                                                } else if (iIntValue2 != 3) {
                                                    iVar5 = iIntValue2 != 4 ? cq.c.b : cq.g.b;
                                                } else {
                                                    iVar5 = cq.h.b;
                                                }
                                                bVar6.b(iVar5);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                };
                                g0Var2.n0(objN18);
                            }
                            bVar5 = bVar6;
                            eq.m.a(iVar3, aVar8, (u00.k) objN18, rVarA2, jVar3, 0);
                            aVar7 = aVar8;
                            jVar3 = jVar3;
                            g0Var2.r(false);
                        } else {
                            bVar5 = r20;
                            aVar7 = aVar8;
                            g0Var2.c0(1036205977);
                            g0Var2.r(false);
                        }
                        gm.a aVar10 = gm.a.A;
                        boolean z11 = z4;
                        final aq.a aVar11 = aVar3;
                        u uVar2 = uVar;
                        h0.s sVar = h0.s.a;
                        if (aVar9 == aVar10) {
                            g0Var2.c0(1036345601);
                            b2.r rVarM2 = h0.c.M(sVar.a(oVar, iVar2), j7Var);
                            boolean zG13 = g0Var2.g(cVar5);
                            Object objN19 = g0Var2.N();
                            if (zG13 || objN19 == cVar4) {
                                objN19 = new f0(cVar5, z0Var7, 4);
                                g0Var2.n0(objN19);
                            }
                            b2.r rVarO = d0.o(rVarM2, (u00.k) objN19);
                            h0.v vVarA = h0.u.a(h0.i.g(4), b2.b.M, jVar3, 6);
                            int iHashCode2 = Long.hashCode(g0Var2.T);
                            m1 m1VarM2 = g0Var2.m();
                            b2.r rVarC2 = b2.a.c(rVarO, jVar3);
                            g0Var2.g0();
                            if (g0Var2.S) {
                                g0Var2.l(gVar3);
                            } else {
                                g0Var2.q0();
                            }
                            l1.q.I(vVarA, jVar3, fVar);
                            l1.q.I(m1VarM2, jVar3, fVar2);
                            x5.u(iHashCode2, jVar3, fVar3, jVar3, eVar2);
                            l1.q.I(rVarC2, jVar3, fVar4);
                            if (((Boolean) z0Var4.getValue()).booleanValue()) {
                                g0Var2.c0(1166167624);
                                if (z11) {
                                    g0Var2.c0(1166203801);
                                    boolean zI3 = g0Var2.i(aVar11);
                                    Object objN20 = g0Var2.N();
                                    if (zI3 || objN20 == cVar4) {
                                        r14 = 0;
                                        final boolean z12 = false ? 1 : 0;
                                        objN20 = new u00.a() {
                                            @Override
                                            public final Object invoke() {
                                                switch (z12) {
                                                    case 0:
                                                        aq.a.a(aVar11, true, 6);
                                                        break;
                                                    case 1:
                                                        aq.a.a(aVar11, true, 6);
                                                        break;
                                                    case 2:
                                                        aq.a.a(aVar11, true, 4);
                                                        break;
                                                    default:
                                                        aq.a.a(aVar11, true, 2);
                                                        break;
                                                }
                                                return g00.b0.a;
                                            }
                                        };
                                        g0Var2.n0(objN20);
                                    } else {
                                        r14 = 0;
                                    }
                                    c7.i.a(aVar7, (u00.a) objN20, (b2.r) null, jVar3, (int) r14);
                                    g0Var2.r((boolean) r14);
                                    z8 = r14;
                                } else {
                                    g0Var2.c0(1166519784);
                                    boolean zG14 = g0Var2.g(uVar2);
                                    Object objN21 = g0Var2.N();
                                    if (zG14 || objN21 == cVar4) {
                                        z7 = false;
                                        objN21 = new h(uVar2, 0);
                                        g0Var2.n0(objN21);
                                    } else {
                                        z7 = false;
                                    }
                                    k00.f.h(aVar7, (u00.a) objN21, jVar3, 384);
                                    g0Var2.r(z7);
                                    z8 = z7;
                                }
                                g0Var2.r(z8);
                            } else {
                                g0Var2.c0(1166914321);
                                g0Var2.r(false);
                            }
                            if (((Boolean) z0Var6.getValue()).booleanValue()) {
                                g0Var2.c0(1166993154);
                                cq.i iVar4 = (cq.i) z0Var5.getValue();
                                final cq.b bVar7 = bVar5;
                                boolean zI4 = g0Var2.i(bVar7);
                                Object objN22 = g0Var2.N();
                                if (zI4 || objN22 == cVar4) {
                                    z6 = true;
                                    final boolean z13 = true ? 1 : 0;
                                    objN22 = new u00.k() {
                                        @Override
                                        public final Object invoke(Object obj9) {
                                            cq.i iVar5;
                                            cq.i iVar6;
                                            int i3 = z13;
                                            int iIntValue2 = ((Integer) obj9).intValue();
                                            switch (i3) {
                                                case 0:
                                                    if (iIntValue2 == 0) {
                                                        iVar5 = cq.c.b;
                                                    } else if (iIntValue2 == 1) {
                                                        iVar5 = cq.f.b;
                                                    } else if (iIntValue2 == 2) {
                                                        iVar5 = cq.e.b;
                                                    } else if (iIntValue2 == 3) {
                                                        iVar5 = cq.d.b;
                                                    } else if (iIntValue2 != 4) {
                                                        iVar5 = iIntValue2 != 5 ? cq.c.b : cq.g.b;
                                                    } else {
                                                        iVar5 = cq.h.b;
                                                    }
                                                    bVar7.b(iVar5);
                                                    break;
                                                default:
                                                    if (iIntValue2 == 0) {
                                                        iVar6 = cq.c.b;
                                                    } else if (iIntValue2 == 1) {
                                                        iVar6 = cq.f.b;
                                                    } else if (iIntValue2 == 2) {
                                                        iVar6 = cq.e.b;
                                                    } else if (iIntValue2 != 3) {
                                                        iVar6 = iIntValue2 != 4 ? cq.c.b : cq.g.b;
                                                    } else {
                                                        iVar6 = cq.h.b;
                                                    }
                                                    bVar7.b(iVar6);
                                                    break;
                                            }
                                            return g00.b0.a;
                                        }
                                    };
                                    g0Var2.n0(objN22);
                                } else {
                                    z6 = true;
                                }
                                z5 = false;
                                eq.g.a(iVar4, aVar7, (u00.k) objN22, jVar3, 0);
                                g0Var2.r(false);
                            } else {
                                z6 = true;
                                z5 = false;
                                g0Var2.c0(1167899377);
                                g0Var2.r(false);
                            }
                            g0Var2.r(z6);
                            g0Var2.r(z5);
                        } else {
                            g0Var2.c0(1038894297);
                            final int i3 = 3;
                            if (z11) {
                                g0Var2.c0(1038906821);
                                b2.r rVarM3 = h0.c.M(sVar.a(oVar, iVar2), j7Var);
                                boolean zG15 = g0Var2.g(cVar5);
                                Object objN23 = g0Var2.N();
                                if (zG15 || objN23 == cVar4) {
                                    objN23 = new f0(cVar5, z0Var7, 5);
                                    g0Var2.n0(objN23);
                                }
                                b2.r rVarO2 = d0.o(rVarM3, (u00.k) objN23);
                                boolean zI5 = g0Var2.i(aVar11);
                                Object objN24 = g0Var2.N();
                                if (zI5 || objN24 == cVar4) {
                                    final int i4 = 1;
                                    objN24 = new u00.a() {
                                        @Override
                                        public final Object invoke() {
                                            switch (i4) {
                                                case 0:
                                                    aq.a.a(aVar11, true, 6);
                                                    break;
                                                case 1:
                                                    aq.a.a(aVar11, true, 6);
                                                    break;
                                                case 2:
                                                    aq.a.a(aVar11, true, 4);
                                                    break;
                                                default:
                                                    aq.a.a(aVar11, true, 2);
                                                    break;
                                            }
                                            return g00.b0.a;
                                        }
                                    };
                                    g0Var2.n0(objN24);
                                }
                                u00.a aVar12 = (u00.a) objN24;
                                boolean zI6 = g0Var2.i(aVar11);
                                Object objN25 = g0Var2.N();
                                if (zI6 || objN25 == cVar4) {
                                    final int i5 = 2;
                                    objN25 = new u00.a() {
                                        @Override
                                        public final Object invoke() {
                                            switch (i5) {
                                                case 0:
                                                    aq.a.a(aVar11, true, 6);
                                                    break;
                                                case 1:
                                                    aq.a.a(aVar11, true, 6);
                                                    break;
                                                case 2:
                                                    aq.a.a(aVar11, true, 4);
                                                    break;
                                                default:
                                                    aq.a.a(aVar11, true, 2);
                                                    break;
                                            }
                                            return g00.b0.a;
                                        }
                                    };
                                    g0Var2.n0(objN25);
                                }
                                u00.a aVar13 = (u00.a) objN25;
                                boolean zI7 = g0Var2.i(aVar11);
                                Object objN26 = g0Var2.N();
                                if (zI7 || objN26 == cVar4) {
                                    objN26 = new u00.a() {
                                        @Override
                                        public final Object invoke() {
                                            switch (i3) {
                                                case 0:
                                                    aq.a.a(aVar11, true, 6);
                                                    break;
                                                case 1:
                                                    aq.a.a(aVar11, true, 6);
                                                    break;
                                                case 2:
                                                    aq.a.a(aVar11, true, 4);
                                                    break;
                                                default:
                                                    aq.a.a(aVar11, true, 2);
                                                    break;
                                            }
                                            return g00.b0.a;
                                        }
                                    };
                                    g0Var2.n0(objN26);
                                }
                                c7.i.b(aVar7, aVar12, aVar13, (u00.a) objN26, rVarO2, jVar3, 0);
                                z5 = false;
                                g0Var2.r(false);
                            } else {
                                g0Var2.c0(1040157981);
                                b2.r rVarM4 = h0.c.M(sVar.a(oVar, iVar2), j7Var);
                                boolean zG16 = g0Var2.g(cVar5);
                                Object objN27 = g0Var2.N();
                                if (zG16 || objN27 == cVar4) {
                                    objN27 = new f0(cVar5, z0Var7, 7);
                                    g0Var2.n0(objN27);
                                }
                                b2.r rVarO3 = d0.o(rVarM4, (u00.k) objN27);
                                boolean zG17 = g0Var2.g(uVar2);
                                Object objN28 = g0Var2.N();
                                if (zG17 || objN28 == cVar4) {
                                    objN28 = new h(uVar2, 3);
                                    g0Var2.n0(objN28);
                                }
                                u00.a aVar14 = (u00.a) objN28;
                                boolean zG18 = g0Var2.g(uVar2);
                                Object objN29 = g0Var2.N();
                                if (zG18 || objN29 == cVar4) {
                                    objN29 = new h(uVar2, 4);
                                    g0Var2.n0(objN29);
                                }
                                u00.a aVar15 = (u00.a) objN29;
                                boolean zG19 = g0Var2.g(uVar2);
                                Object objN30 = g0Var2.N();
                                if (zG19 || objN30 == cVar4) {
                                    objN30 = new e1(uVar2, 11);
                                    g0Var2.n0(objN30);
                                }
                                lv.e.b(aVar7, aVar14, aVar15, (u00.k) objN30, rVarO3, jVar3, 0);
                                z5 = false;
                                g0Var2.r(false);
                            }
                            g0Var2.r(z5);
                        }
                        g0Var2.r(true);
                        z0 z0Var8 = z0VarQ;
                        Integer num = ((m) z0Var8.getValue()).d;
                        if (num == null) {
                            g0Var2.c0(-607762090);
                            g0Var2.r(z5);
                            rVar = rVar2;
                        } else {
                            g0Var2.c0(-607762089);
                            rVar = rVar2;
                            eq.k.a(rVar, jVar3, num.intValue(), 48);
                            g0Var2.r(z5);
                        }
                        if (((m) z0Var8.getValue()).e) {
                            g0Var2.c0(-607546329);
                            eq.a.b(rVar, jVar3, 6);
                            g0Var2.r(z5);
                        } else {
                            g0Var2.c0(-607431009);
                            g0Var2.r(z5);
                        }
                    } else {
                        g0Var2.V();
                    }
                    return g00.b0.a;
                }
            }, g0Var), g0Var, 56);
            if (((m) z0VarQ.getValue()).c || ((m) z0VarQ.getValue()).b) {
                g0Var.c0(-61420097);
                g0Var.r(false);
            } else {
                g0Var.c0(-62580210);
                b2.r rVarQ = z1.q(b2.o.A, 350);
                String strU = z3.U(g0Var, 2131886924);
                String strU2 = z3.U(g0Var, 2131886923);
                boolean zG12 = g0Var.g(uVar);
                Object objN16 = g0Var.N();
                if (zG12 || objN16 == obj6) {
                    objN16 = new h(uVar, 1);
                    g0Var.n0(objN16);
                }
                wr.k.H(strU, strU2, (u00.a) objN16, rVarQ, 0L, null, null, v1.d.d(581873759, new y1(uVar, 10), g0Var), g0Var, 12585984, 112);
                g0Var = g0Var;
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new dm.a(i, 14);
        }
    }
}

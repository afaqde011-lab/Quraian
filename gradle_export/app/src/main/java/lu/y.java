package lu;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.d1;
import androidx.lifecycle.f1;
import c3.o0;
import com.google.android.gms.internal.measurement.z3;
import h0.m2;
import h0.t1;
import h0.v1;
import h0.z1;
import i2.t0;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import l1.e1;
import l1.g0;
import l1.m1;
import l1.q2;
import l1.r1;
import l1.y0;
import l1.z0;
import qd.s0;
import w.x0;
import z2.w0;

public abstract class y {
    public static final float a = 140;

    public static final void a(l1.j jVar, int i) {
        g0 g0Var;
        float f;
        final int i2;
        boolean z;
        h.i iVar;
        Object pVar;
        k00.c cVar;
        y3.f fVar;
        boolean z2;
        boolean z3;
        boolean z4;
        u30.b bVar;
        Object nVar;
        float f2;
        m0.w wVar;
        z zVar;
        z zVar2;
        zz.a aVar;
        Object kVar;
        androidx.lifecycle.w wVar2;
        e0 e0Var;
        Object obj;
        float f3;
        b2.h hVar;
        b2.r rVarF;
        final e0 e0Var2;
        boolean z5;
        ?? r0;
        int i3;
        int i4;
        ?? r2;
        int iA;
        float f4;
        boolean zG;
        Object objN;
        b2.i iVar2 = b2.b.H;
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-1759690387);
        if (g0Var2.S(i & 1, i != 0)) {
            e60.a aVarA = q50.c.a(g0Var2);
            boolean zG2 = g0Var2.g((Object) null) | g0Var2.g(aVarA);
            Object objN2 = g0Var2.N();
            l1.c cVar2 = l1.i.a;
            if (zG2 || objN2 == cVar2) {
                objN2 = oi.k.f(kotlin.jvm.internal.a0.a, cu.a.class, aVarA, (b60.a) null, g0Var2);
            }
            cu.a aVar2 = (cu.a) objN2;
            f1 f1VarA = u6.a.a(g0Var2);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            final e0 e0Var3 = (e0) c7.i.S(kotlin.jvm.internal.a0.a.b(e0.class), f1VarA.getViewModelStore(), (String) null, bi.b.z(f1VarA), q50.c.a(g0Var2), (u00.a) null);
            final z0 z0VarQ = k00.f.q(e0Var3.c.d, g0Var2, 0);
            final gm.a aVar3 = (gm.a) g0Var2.k(dl.e.a);
            WeakHashMap weakHashMap = m2.w;
            boolean z6 = h0.b.e(g0Var2).c.e().d > 0;
            androidx.lifecycle.w wVar3 = (androidx.lifecycle.w) g0Var2.k(r6.d.a);
            float f5 = 420;
            int iOrdinal = aVar3.ordinal();
            if (iOrdinal == 0) {
                f = 48;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 64;
            }
            float f6 = f;
            q2 q2Var = o0.b;
            Context context = (Context) g0Var2.k(q2Var);
            final kk.c cVarD = kk.e.d(g0Var2);
            int i5 = ((a0) z0VarQ.getValue()).c;
            boolean zG3 = g0Var2.g(z0VarQ);
            Object objN3 = g0Var2.N();
            if (zG3 || objN3 == cVar2) {
                objN3 = new ct.k(z0VarQ, 11);
                g0Var2.n0(objN3);
            }
            m0.w wVarB = m0.z.b(i5, (u00.a) objN3, g0Var2, 0);
            a2.o oVar = wVarB.d;
            boolean z7 = ((a0) z0VarQ.getValue()).c > 1;
            boolean zG4 = g0Var2.g(e0Var3);
            Object objN4 = g0Var2.N();
            if (zG4 || objN4 == cVar2) {
                i2 = 0;
                objN4 = new u00.a() {
                    @Override
                    public final Object invoke() {
                        int i6 = i2;
                        e0 e0Var4 = e0Var3;
                        switch (i6) {
                            case 0:
                                e0Var4.k(f.a);
                                break;
                            default:
                                e0Var4.k(f.a);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                g0Var2.n0(objN4);
            } else {
                i2 = 0;
            }
            s0.E(z7, (u00.a) objN4, g0Var2, i2, i2);
            d1 d1Var = new d1(2);
            boolean zG5 = g0Var2.g(e0Var3);
            Object objN5 = g0Var2.N();
            if (zG5 || objN5 == cVar2) {
                objN5 = new h00.a(e0Var3, 20);
                g0Var2.n0(objN5);
            }
            l1.q.G(d1Var, g0Var2);
            z0 z0VarG = l1.q.G((u00.k) objN5, g0Var2);
            Object[] objArr = new Object[0];
            Object objN6 = g0Var2.N();
            if (objN6 == cVar2) {
                objN6 = new a2.f(23);
                g0Var2.n0(objN6);
            }
            String str = (String) y1.k.c(objArr, (u00.a) objN6, g0Var2, 48);
            h.j jVar2 = (h.j) g0Var2.k(e.h.a);
            if (jVar2 == null) {
                g0Var2.c0(1213380307);
                Context baseContext = (Context) g0Var2.k(q2Var);
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        baseContext = null;
                        break;
                    } else if (baseContext instanceof h.j) {
                        break;
                    } else {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    }
                }
                jVar2 = (h.j) baseContext;
                z = false;
            } else {
                z = false;
                g0Var2.c0(1213379439);
            }
            g0Var2.r(z);
            if (jVar2 == null) {
                throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            }
            h.i activityResultRegistry = jVar2.getActivityResultRegistry();
            Object objN7 = g0Var2.N();
            if (objN7 == cVar2) {
                objN7 = new e.a();
                g0Var2.n0(objN7);
            }
            e.a aVar4 = (e.a) objN7;
            Object objN8 = g0Var2.N();
            if (objN8 == cVar2) {
                objN8 = new e.j(aVar4);
                g0Var2.n0(objN8);
            }
            e.j jVar3 = (e.j) objN8;
            boolean zI = g0Var2.i(aVar4) | g0Var2.i(activityResultRegistry) | g0Var2.g(str) | g0Var2.i(d1Var) | g0Var2.g(z0VarG);
            Object objN9 = g0Var2.N();
            if (zI || objN9 == cVar2) {
                objN9 = new a1.a(aVar4, activityResultRegistry, str, d1Var, z0VarG, 2);
                iVar = activityResultRegistry;
                g0Var2.n0(objN9);
            } else {
                iVar = activityResultRegistry;
            }
            l1.q.d(iVar, str, d1Var, (u00.k) objN9, g0Var2);
            boolean zG6 = g0Var2.g(e0Var3) | g0Var2.g(aVar2) | g0Var2.i(jVar3);
            Object objN10 = g0Var2.N();
            if (zG6 || objN10 == cVar2) {
                cVar = null;
                pVar = new ev.p(e0Var3, aVar2, jVar3, null, 24);
                g0Var2.n0(pVar);
            } else {
                pVar = objN10;
                cVar = null;
            }
            g00.b0 b0Var = g00.b0.a;
            l1.q.i(b0Var, g0Var2, (u00.n) pVar);
            boolean zI2 = g0Var2.i((Object) r16) | g0Var2.g(e0Var3);
            Object objN11 = g0Var2.N();
            if (zI2 || objN11 == cVar2) {
                objN11 = new w(context, e0Var3, cVar, 0);
                g0Var2.n0(objN11);
            }
            l1.q.i(b0Var, g0Var2, (u00.n) objN11);
            Integer numValueOf = Integer.valueOf(((a0) z0VarQ.getValue()).c);
            boolean zG7 = g0Var2.g(wVarB) | g0Var2.g(z0VarQ);
            Object objN12 = g0Var2.N();
            if (zG7 || objN12 == cVar2) {
                objN12 = new g6.a(wVarB, z0VarQ, cVar, 14);
                g0Var2.n0(objN12);
            }
            l1.q.i(numValueOf, g0Var2, (u00.n) objN12);
            Integer numValueOf2 = Integer.valueOf(((l1.f1) ((a2.o) r17).B).h());
            boolean zG8 = g0Var2.g(e0Var3) | g0Var2.g(wVarB);
            Object objN13 = g0Var2.N();
            if (zG8 || objN13 == cVar2) {
                objN13 = new w(e0Var3, (Object) wVarB, cVar, 1);
                g0Var2.n0(objN13);
            }
            l1.q.i(numValueOf2, g0Var2, (u00.n) objN13);
            ju.f fVar2 = (ju.f) h00.q.O0(((l1.f1) ((a2.o) r17).B).h(), ((a0) z0VarQ.getValue()).a);
            ?? r1 = fVar2 != null ? fVar2.a : cVar;
            if (r1 == 0) {
                r1 = "";
            }
            gm.a aVar5 = gm.a.B;
            if (aVar3 != aVar5) {
                fVar = null;
            } else {
                int iHashCode = r1.hashCode();
                if (iHashCode != -1613332748) {
                    if (iHashCode == -1570882062 ? r1.equals("social_proof") : !(iHashCode != -881251677 || !r1.equals("tafsir"))) {
                        fVar = new y3.f(280 + f5);
                    }
                } else if (r1.equals("tailored_playlists")) {
                    fVar = null;
                }
                fVar = new y3.f(f5);
            }
            z zVar3 = (z) ((a0) z0VarQ.getValue()).b.get("ambient_sounds");
            z zVar4 = (z) ((a0) z0VarQ.getValue()).b.get("reciters");
            boolean zG9 = g0Var2.g(zVar4);
            Object objN14 = g0Var2.N();
            if (zG9 || objN14 == cVar2) {
                if (zVar4 == null || (bVar = zVar4.f) == null) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = !bVar.isEmpty();
                }
                if (z3) {
                    if ((zVar4 == null || zVar4.b != z2) ? false : z2) {
                        z4 = false;
                    } else {
                        if ((zVar4 == null || zVar4.a != z2) ? false : z2) {
                            z4 = false;
                        } else {
                            z4 = z2;
                        }
                    }
                } else {
                    z4 = false;
                }
                objN14 = Boolean.valueOf(z4);
                g0Var2.n0(objN14);
            } else {
                fVar = fVar;
            }
            final boolean zBooleanValue = ((Boolean) objN14).booleanValue();
            Object objN15 = g0Var2.N();
            if (objN15 == cVar2) {
                objN15 = l1.q.z(Boolean.FALSE);
                g0Var2.n0(objN15);
            }
            z0 z0Var = (z0) objN15;
            Object objN16 = g0Var2.N();
            if (objN16 == cVar2) {
                objN16 = oi.k.s(0, g0Var2);
            }
            y0 y0Var = (y0) objN16;
            Object[] objArr2 = {Integer.valueOf(((l1.f1) ((a2.o) r17).B).h()), Float.valueOf(((e1) oVar.D).h()), Integer.valueOf(((a0) z0VarQ.getValue()).c), zVar3 != null ? zVar3.h : null, Integer.valueOf(((h00.b) ((a0) z0VarQ.getValue()).a).a())};
            boolean zG10 = g0Var2.g(wVarB) | g0Var2.g(z0VarQ) | g0Var2.g(zVar3);
            Object objN17 = g0Var2.N();
            if (zG10 || objN17 == cVar2) {
                f2 = f5;
                nVar = new gc.n(wVarB, zVar3, z0VarQ, z0Var, y0Var, (k00.c) null);
                wVar = wVarB;
                zVar = zVar3;
                g0Var2.n0(nVar);
            } else {
                nVar = objN17;
                f2 = f5;
                zVar = zVar3;
                wVar = wVarB;
            }
            l1.q.j(objArr2, (u00.n) nVar, g0Var2);
            if (zVar == null) {
                zVar2 = null;
            } else {
                if ((!r1.equals("ambient_sounds") || zVar.a || zVar.b) ? false : true) {
                    zVar2 = zVar;
                } else {
                    zVar2 = null;
                }
            }
            boolean z8 = zVar2 != null;
            boolean z9 = (zVar2 == null || zVar2.h == null) ? false : true;
            zz.a aVar6 = zVar != null ? zVar.h : null;
            boolean zG11 = g0Var2.g((Object) r1) | g0Var2.g(zVar) | g0Var2.g(e0Var3) | g0Var2.i(wVar3);
            final ?? r16 = r1;
            Object objN18 = g0Var2.N();
            if (zG11 || objN18 == cVar2) {
                aVar = aVar6;
                wVar2 = wVar3;
                kVar = new az.k(wVar2, (Object) r16, zVar, e0Var3, 8);
                e0Var = e0Var3;
                g0Var2.n0(kVar);
            } else {
                zz.a aVar7 = aVar6;
                kVar = objN18;
                aVar = aVar7;
                wVar2 = wVar3;
                e0Var = e0Var3;
            }
            l1.q.d(wVar2, (String) r16, aVar, (u00.k) kVar, g0Var2);
            h0.a0 a0Var = z1.c;
            b2.i iVar3 = b2.b.B;
            w0 w0VarD = h0.o.d(iVar3, false);
            boolean z11 = z8;
            int iHashCode2 = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(a0Var, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            boolean z12 = z9;
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            b3.f fVar3 = b3.h.f;
            l1.q.I(w0VarD, g0Var2, fVar3);
            b3.f fVar4 = b3.h.e;
            l1.q.I(m1VarM, g0Var2, fVar4);
            Integer numValueOf3 = Integer.valueOf(iHashCode2);
            b3.f fVar5 = b3.h.g;
            l1.q.I(numValueOf3, g0Var2, fVar5);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var2, eVar);
            final m0.w wVar4 = wVar;
            b3.f fVar6 = b3.h.d;
            l1.q.I(rVarC, g0Var2, fVar6);
            if (zVar2 != null) {
                g0Var2.c0(-1121625038);
                mu.d.i(zVar2.h, e0Var.o.a, a0Var, g0Var2, 384);
                g0Var2.r(false);
            } else {
                g0Var2.c0(-1121351153);
                g0Var2.r(false);
            }
            b2.r rVar = b2.o.A;
            h0.s sVar = h0.s.a;
            if (z12) {
                g0Var2.c0(-1121282085);
                b2.r rVarD = z1.d(sVar.a(rVar, iVar3), 1.0f);
                float f7 = a;
                b2.r rVarE = z1.e(rVarD, f7);
                long j = dl.a.L;
                i2.t tVar = new i2.t(i2.t.b(0.7f, j));
                i2.t tVar2 = new i2.t(i2.t.b(0.5f, j));
                long j2 = i2.t.f;
                h0.o.a(z.n.e(rVarE, sg.f.P(va.a.S(new i2.t[]{tVar, tVar2, new i2.t(j2)}), 0.0f, 0.0f, 14), (t0) null, 6), g0Var2, 0);
                h0.o.a(z.n.e(z1.e(z1.d(sVar.a(rVar, iVar2), 1.0f), f7), sg.f.P(va.a.S(new i2.t[]{new i2.t(j2), new i2.t(i2.t.b(0.5f, j)), new i2.t(i2.t.b(0.7f, j))}), 0.0f, 0.0f, 14), (t0) null, 6), g0Var2, 0);
                g0Var2.r(false);
            } else {
                g0Var2.c0(-1120155793);
                g0Var2.r(false);
            }
            b2.r rVarA = kk.e.a(sVar.b(), cVarD);
            i2.o0 o0Var = i2.b0.b;
            h0.o.a(rVarA.V(z11 ? z.n.f(rVar, i2.t.f, o0Var) : z.n.e(rVar, dl.a.b0, (t0) null, 6)), g0Var2, 0);
            b2.r rVarV = h0.c.M(a0Var, h0.c.g).V(!r16.equals("reciters") ? h0.c.M(rVar, h0.c.f) : rVar);
            w0 w0VarD2 = h0.o.d(b2.b.E, false);
            int iHashCode3 = Long.hashCode(g0Var2.T);
            m1 m1VarM2 = g0Var2.m();
            b2.r rVarC2 = b2.a.c(rVarV, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(w0VarD2, g0Var2, fVar3);
            l1.q.I(m1VarM2, g0Var2, fVar4);
            a1.b.v(iHashCode3, g0Var2, fVar5, g0Var2, eVar);
            l1.q.I(rVarC2, g0Var2, fVar6);
            b2.r rVarG = h0.c.G(z1.c(rVar, 1.0f).V(fVar != null ? z1.q(rVar, fVar.A) : z1.d(rVar, 1.0f)), 0.0f, f6, 0.0f, 0.0f, 13);
            if (r16.equals("tailored_playlists")) {
                obj = r17;
            } else {
                obj = "tafsir";
                if (!r16.equals(obj)) {
                    f3 = 70;
                }
                b2.r rVarG2 = h0.c.G(rVarG, 0.0f, 0.0f, 0.0f, f3, 7);
                hVar = b2.b.K;
                final e0 e0Var4 = e0Var;
                Object obj2 = obj;
                p30.f.L(0.0f, 102236160, 16060, hVar, rVarG2, null, null, null, g0Var2, null, wVar4, null, v1.d.d(-30363215, new u00.p() {
                    @Override
                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                        m0.r HorizontalPager = (m0.r) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        g0 g0Var3 = (l1.j) obj5;
                        ((Integer) obj6).getClass();
                        kotlin.jvm.internal.m.e(HorizontalPager, "$this$HorizontalPager");
                        z0 z0Var2 = z0VarQ;
                        ju.f fVar7 = (ju.f) ((a0) z0Var2.getValue()).a.get(iIntValue);
                        boolean z13 = iIntValue == ((l1.f1) ((m0.w) wVar4).d.B).h();
                        b2.r rVarD2 = z1.d(b2.o.A, 1.0f);
                        a0 a0Var2 = (a0) z0Var2.getValue();
                        g0 g0Var4 = g0Var3;
                        e0 e0Var5 = e0Var4;
                        boolean zG12 = g0Var4.g(e0Var5);
                        Object objN19 = g0Var4.N();
                        if (zG12 || objN19 == l1.i.a) {
                            gz.e1 e1Var = new gz.e1(1, e0Var5, e0.class, "action", "action(Lcom/mchutov/quranify/onboarding/presentation/screen/OnboardingAction;)V", 0, 7);
                            g0Var4.n0(e1Var);
                            objN19 = e1Var;
                        }
                        mu.m.d(fVar7, a0Var2, cVarD, z13, (u00.k) ((a10.g) objN19), rVarD2, g0Var3, 196608);
                        return g00.b0.a;
                    }
                }, g0Var2), null, false);
                boolean zBooleanValue2 = ((Boolean) z0Var.getValue()).booleanValue();
                b2.r rVarE2 = z1.e(z1.d(sVar.a(rVar, iVar2), 1.0f), 70);
                if (!r16.equals("tailored_playlists") || r16.equals(obj2)) {
                    rVarF = z.n.f(rVar, i2.t.b(0.9f, dl.a.L), o0Var);
                } else {
                    rVarF = rVar;
                }
                final boolean z13 = z6;
                final float f8 = f2;
                e0Var2 = e0Var;
                w.c0.c(zBooleanValue2, rVarE2.V(rVarF), (x0) null, (w.y0) null, (String) null, v1.d.d(-1141878264, new u00.o() {
                    @Override
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        b2.r rVarG3;
                        int i6;
                        w.d0 AnimatedVisibility = (w.d0) obj3;
                        g0 g0Var3 = (l1.j) obj4;
                        ((Integer) obj5).getClass();
                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                        b2.o oVar2 = b2.o.A;
                        b2.r rVarD2 = z1.d(oVar2, 1.0f);
                        w0 w0VarD3 = h0.o.d(b2.b.E, false);
                        g0 g0Var4 = g0Var3;
                        int iHashCode4 = Long.hashCode(g0Var4.T);
                        m1 m1VarM3 = g0Var4.m();
                        b2.r rVarC3 = b2.a.c(rVarD2, g0Var3);
                        b3.i.c.getClass();
                        b3.g gVar2 = b3.h.b;
                        g0Var4.g0();
                        if (g0Var4.S) {
                            g0Var4.l(gVar2);
                        } else {
                            g0Var4.q0();
                        }
                        l1.q.I(w0VarD3, g0Var3, b3.h.f);
                        l1.q.I(m1VarM3, g0Var3, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode4), g0Var3, b3.h.g);
                        l1.q.E(g0Var3, b3.h.h);
                        l1.q.I(rVarC3, g0Var3, b3.h.d);
                        gm.a aVar8 = gm.a.B;
                        gm.a aVar9 = aVar3;
                        b2.r rVarQ = aVar9 == aVar8 ? z1.q(oVar2, f8) : z1.d(oVar2, 1.0f);
                        boolean z14 = z13;
                        if (aVar9 == aVar8) {
                            rVarG3 = h0.c.G(oVar2, 0.0f, 0.0f, 0.0f, z14 ? 0 : 16, 7);
                        } else {
                            float f9 = 16;
                            rVarG3 = h0.c.G(oVar2, f9, 0.0f, f9, z14 ? 0 : f9, 2);
                        }
                        b2.r rVarV2 = rVarQ.V(rVarG3);
                        String str2 = r16;
                        if (str2.equals("start")) {
                            i6 = 2131886332;
                        } else if (str2.equals("reciters")) {
                            i6 = 2131886941;
                        } else if (str2.equals("social_proof")) {
                            i6 = 2131886945;
                        } else if (str2.equals("daily_minimum")) {
                            i6 = 2131886930;
                        } else {
                            i6 = ((a0) z0VarQ.getValue()).d ? 2131886623 : 2131886239;
                        }
                        String strU = z3.U(g0Var3, i6);
                        boolean zG12 = g0Var4.g(str2);
                        e0 e0Var5 = e0Var2;
                        boolean zG13 = zG12 | g0Var4.g(e0Var5);
                        Object objN19 = g0Var4.N();
                        if (zG13 || objN19 == l1.i.a) {
                            objN19 = new l6.c(str2, e0Var5, 1);
                            g0Var4.n0(objN19);
                        }
                        mu.d.k(0, rVarV2, strU, g0Var3, (u00.a) objN19, zBooleanValue);
                        g0Var4.r(true);
                        return g00.b0.a;
                    }
                }, g0Var2), g0Var2, 196608, 28);
                g0Var = g0Var2;
                g0Var.r(true);
                if (((a0) z0VarQ.getValue()).c > 0) {
                    g0Var.c0(-1114153976);
                    b2.r rVarE3 = h0.c.E(z1.d(h0.c.G(rVar, 0.0f, 64, 0.0f, 0.0f, 13), 1.0f), 12, 0.0f, 2);
                    v1 v1VarA = t1.a(h0.i.g, hVar, g0Var, 54);
                    int iHashCode4 = Long.hashCode(g0Var.T);
                    m1 m1VarM3 = g0Var.m();
                    b2.r rVarC3 = b2.a.c(rVarE3, g0Var);
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(v1VarA, g0Var, fVar3);
                    l1.q.I(m1VarM3, g0Var, fVar4);
                    a1.b.v(iHashCode4, g0Var, fVar5, g0Var, eVar);
                    l1.q.I(rVarC3, g0Var, fVar6);
                    if (((a0) z0VarQ.getValue()).c > 1) {
                        g0Var.c0(-970674748);
                        p0.e eVar2 = p0.f.a;
                        float f9 = 44;
                        float f11 = 0;
                        long jB = i2.t.b(0.5f, dl.a.P);
                        zG = g0Var.g(e0Var2);
                        objN = g0Var.N();
                        if (zG || objN == cVar2) {
                            final int i6 = 1;
                            objN = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    int i7 = i6;
                                    e0 e0Var5 = e0Var2;
                                    switch (i7) {
                                        case 0:
                                            e0Var5.k(f.a);
                                            break;
                                        default:
                                            e0Var5.k(f.a);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            };
                            g0Var.n0(objN);
                        }
                        r0 = 0;
                        w50.c.f((u00.a) objN, cVarD, null, false, false, 0.0f, new y3.f(f9), 0L, jB, 10.0f, eVar2, f11, b.a, g0Var, 806879232, 432, 188);
                        g0Var = g0Var;
                        g0Var.r(false);
                        i3 = 6;
                    } else {
                        r0 = 0;
                        g0Var.c0(-969922068);
                        i3 = 6;
                        h0.o.a(z1.m(rVar, 44), g0Var, 6);
                        g0Var.r(false);
                    }
                    i4 = ((a0) z0VarQ.getValue()).c - 1;
                    r2 = i4;
                    if (i4 < 0) {
                        r2 = r0;
                    }
                    iA = ((h00.b) ((a0) z0VarQ.getValue()).a).a() - 2;
                    if (iA < 1) {
                        iA = 1;
                    }
                    if (aVar3 == aVar5) {
                        f4 = f2;
                    } else {
                        f4 = 170;
                    }
                    mu.n.a(z1.q(rVar, f4), r2, iA, g0Var, r0);
                    h0.o.a(z1.m(rVar, 44), g0Var, i3);
                    z5 = true;
                    g0Var.r(true);
                    g0Var.r((boolean) r0);
                } else {
                    z5 = true;
                    g0Var.c0(-1112353713);
                    g0Var.r(false);
                }
                g0Var.r(z5);
            }
            f3 = 0;
            b2.r rVarG3 = h0.c.G(rVarG, 0.0f, 0.0f, 0.0f, f3, 7);
            hVar = b2.b.K;
            final e0 e0Var5 = e0Var;
            Object obj3 = obj;
            p30.f.L(0.0f, 102236160, 16060, hVar, rVarG3, null, null, null, g0Var2, null, wVar4, null, v1.d.d(-30363215, new u00.p() {
                @Override
                public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                    m0.r HorizontalPager = (m0.r) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    g0 g0Var3 = (l1.j) obj6;
                    ((Integer) obj7).getClass();
                    kotlin.jvm.internal.m.e(HorizontalPager, "$this$HorizontalPager");
                    z0 z0Var2 = z0VarQ;
                    ju.f fVar7 = (ju.f) ((a0) z0Var2.getValue()).a.get(iIntValue);
                    boolean z14 = iIntValue == ((l1.f1) ((m0.w) wVar4).d.B).h();
                    b2.r rVarD2 = z1.d(b2.o.A, 1.0f);
                    a0 a0Var2 = (a0) z0Var2.getValue();
                    g0 g0Var4 = g0Var3;
                    e0 e0Var6 = e0Var5;
                    boolean zG12 = g0Var4.g(e0Var6);
                    Object objN19 = g0Var4.N();
                    if (zG12 || objN19 == l1.i.a) {
                        gz.e1 e1Var = new gz.e1(1, e0Var6, e0.class, "action", "action(Lcom/mchutov/quranify/onboarding/presentation/screen/OnboardingAction;)V", 0, 7);
                        g0Var4.n0(e1Var);
                        objN19 = e1Var;
                    }
                    mu.m.d(fVar7, a0Var2, cVarD, z14, (u00.k) ((a10.g) objN19), rVarD2, g0Var3, 196608);
                    return g00.b0.a;
                }
            }, g0Var2), null, false);
            boolean zBooleanValue3 = ((Boolean) z0Var.getValue()).booleanValue();
            b2.r rVarE4 = z1.e(z1.d(sVar.a(rVar, iVar2), 1.0f), 70);
            if (r16.equals("tailored_playlists")) {
                rVarF = z.n.f(rVar, i2.t.b(0.9f, dl.a.L), o0Var);
            } else {
                rVarF = z.n.f(rVar, i2.t.b(0.9f, dl.a.L), o0Var);
            }
            final boolean z14 = z6;
            final float f12 = f2;
            e0Var2 = e0Var;
            w.c0.c(zBooleanValue3, rVarE4.V(rVarF), (x0) null, (w.y0) null, (String) null, v1.d.d(-1141878264, new u00.o() {
                @Override
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    b2.r rVarG4;
                    int i7;
                    w.d0 AnimatedVisibility = (w.d0) obj4;
                    g0 g0Var3 = (l1.j) obj5;
                    ((Integer) obj6).getClass();
                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                    b2.o oVar2 = b2.o.A;
                    b2.r rVarD2 = z1.d(oVar2, 1.0f);
                    w0 w0VarD3 = h0.o.d(b2.b.E, false);
                    g0 g0Var4 = g0Var3;
                    int iHashCode5 = Long.hashCode(g0Var4.T);
                    m1 m1VarM4 = g0Var4.m();
                    b2.r rVarC4 = b2.a.c(rVarD2, g0Var3);
                    b3.i.c.getClass();
                    b3.g gVar2 = b3.h.b;
                    g0Var4.g0();
                    if (g0Var4.S) {
                        g0Var4.l(gVar2);
                    } else {
                        g0Var4.q0();
                    }
                    l1.q.I(w0VarD3, g0Var3, b3.h.f);
                    l1.q.I(m1VarM4, g0Var3, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode5), g0Var3, b3.h.g);
                    l1.q.E(g0Var3, b3.h.h);
                    l1.q.I(rVarC4, g0Var3, b3.h.d);
                    gm.a aVar8 = gm.a.B;
                    gm.a aVar9 = aVar3;
                    b2.r rVarQ = aVar9 == aVar8 ? z1.q(oVar2, f12) : z1.d(oVar2, 1.0f);
                    boolean z15 = z14;
                    if (aVar9 == aVar8) {
                        rVarG4 = h0.c.G(oVar2, 0.0f, 0.0f, 0.0f, z15 ? 0 : 16, 7);
                    } else {
                        float f13 = 16;
                        rVarG4 = h0.c.G(oVar2, f13, 0.0f, f13, z15 ? 0 : f13, 2);
                    }
                    b2.r rVarV2 = rVarQ.V(rVarG4);
                    String str2 = r16;
                    if (str2.equals("start")) {
                        i7 = 2131886332;
                    } else if (str2.equals("reciters")) {
                        i7 = 2131886941;
                    } else if (str2.equals("social_proof")) {
                        i7 = 2131886945;
                    } else if (str2.equals("daily_minimum")) {
                        i7 = 2131886930;
                    } else {
                        i7 = ((a0) z0VarQ.getValue()).d ? 2131886623 : 2131886239;
                    }
                    String strU = z3.U(g0Var3, i7);
                    boolean zG12 = g0Var4.g(str2);
                    e0 e0Var6 = e0Var2;
                    boolean zG13 = zG12 | g0Var4.g(e0Var6);
                    Object objN19 = g0Var4.N();
                    if (zG13 || objN19 == l1.i.a) {
                        objN19 = new l6.c(str2, e0Var6, 1);
                        g0Var4.n0(objN19);
                    }
                    mu.d.k(0, rVarV2, strU, g0Var3, (u00.a) objN19, zBooleanValue);
                    g0Var4.r(true);
                    return g00.b0.a;
                }
            }, g0Var2), g0Var2, 196608, 28);
            g0Var = g0Var2;
            g0Var.r(true);
            if (((a0) z0VarQ.getValue()).c > 0) {
                g0Var.c0(-1114153976);
                b2.r rVarE5 = h0.c.E(z1.d(h0.c.G(rVar, 0.0f, 64, 0.0f, 0.0f, 13), 1.0f), 12, 0.0f, 2);
                v1 v1VarA2 = t1.a(h0.i.g, hVar, g0Var, 54);
                int iHashCode5 = Long.hashCode(g0Var.T);
                m1 m1VarM4 = g0Var.m();
                b2.r rVarC4 = b2.a.c(rVarE5, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(v1VarA2, g0Var, fVar3);
                l1.q.I(m1VarM4, g0Var, fVar4);
                a1.b.v(iHashCode5, g0Var, fVar5, g0Var, eVar);
                l1.q.I(rVarC4, g0Var, fVar6);
                if (((a0) z0VarQ.getValue()).c > 1) {
                    g0Var.c0(-970674748);
                    p0.e eVar3 = p0.f.a;
                    float f13 = 44;
                    float f14 = 0;
                    long jB2 = i2.t.b(0.5f, dl.a.P);
                    zG = g0Var.g(e0Var2);
                    objN = g0Var.N();
                    if (zG) {
                        final int i7 = 1;
                        objN = new u00.a() {
                            @Override
                            public final Object invoke() {
                                int i8 = i7;
                                e0 e0Var6 = e0Var2;
                                switch (i8) {
                                    case 0:
                                        e0Var6.k(f.a);
                                        break;
                                    default:
                                        e0Var6.k(f.a);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        };
                        g0Var.n0(objN);
                    } else {
                        final int i8 = 1;
                        objN = new u00.a() {
                            @Override
                            public final Object invoke() {
                                int i9 = i8;
                                e0 e0Var6 = e0Var2;
                                switch (i9) {
                                    case 0:
                                        e0Var6.k(f.a);
                                        break;
                                    default:
                                        e0Var6.k(f.a);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        };
                        g0Var.n0(objN);
                    }
                    r0 = 0;
                    w50.c.f((u00.a) objN, cVarD, null, false, false, 0.0f, new y3.f(f13), 0L, jB2, 10.0f, eVar3, f14, b.a, g0Var, 806879232, 432, 188);
                    g0Var = g0Var;
                    g0Var.r(false);
                    i3 = 6;
                } else {
                    r0 = 0;
                    g0Var.c0(-969922068);
                    i3 = 6;
                    h0.o.a(z1.m(rVar, 44), g0Var, 6);
                    g0Var.r(false);
                }
                i4 = ((a0) z0VarQ.getValue()).c - 1;
                r2 = i4;
                if (i4 < 0) {
                    r2 = r0;
                }
                iA = ((h00.b) ((a0) z0VarQ.getValue()).a).a() - 2;
                if (iA < 1) {
                    iA = 1;
                }
                if (aVar3 == aVar5) {
                    f4 = f2;
                } else {
                    f4 = 170;
                }
                mu.n.a(z1.q(rVar, f4), r2, iA, g0Var, r0);
                h0.o.a(z1.m(rVar, 44), g0Var, i3);
                z5 = true;
                g0Var.r(true);
                g0Var.r((boolean) r0);
            } else {
                z5 = true;
                g0Var.c0(-1112353713);
                g0Var.r(false);
            }
            g0Var.r(z5);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new lt.a(i, 7);
        }
    }
}

package nx;

import android.content.Context;
import androidx.lifecycle.f1;
import c3.o1;
import com.google.android.gms.internal.measurement.x5;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.mchutov.quranify.reciters.presentation.screen.detail.main.ReciterLauncher;
import d0.o2;
import gz.e1;
import h0.c1;
import h0.m2;
import h0.n1;
import h0.p1;
import h0.t0;
import h0.t1;
import h0.v1;
import h0.z1;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import l1.m1;
import l1.p2;
import l1.r1;
import l1.z0;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new lu.a(13), 148093141, false);
    public static final v1.c b = new v1.c(new lu.a(14), 1023589466, false);
    public static final v1.c c = new v1.c(new lu.a(15), -2146508594, false);

    public static final void a(final j0.v vVar, final i0 i0Var, final PlayerItem playerItem, final boolean z, final boolean z2, final boolean z3, final float f, final u00.k kVar, final b2.r rVar, l1.j jVar, final int i) {
        l1.j jVar2;
        float fC;
        z0 z0Var;
        int i2;
        z0 z0Var2;
        boolean z4;
        boolean z5;
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(-932271106);
        int i3 = i | (jVar3.g(vVar) ? 4 : 2) | (jVar3.g(i0Var) ? 32 : 16) | (jVar3.g(playerItem) ? 256 : 128) | (jVar3.h(z) ? 2048 : 1024) | (jVar3.h(z2) ? 16384 : 8192) | (jVar3.h(z3) ? 131072 : 65536) | (jVar3.d(f) ? 1048576 : 524288) | (jVar3.i(kVar) ? 8388608 : 4194304) | (jVar3.g(rVar) ? 67108864 : 33554432);
        if (jVar3.S(i3 & 1, (i3 & 38347923) != 38347922)) {
            n1 n1Var = (n1) jVar3.k(dq.l.a);
            final gm.a aVar = (gm.a) jVar3.k(dl.e.a);
            Object objN = jVar3.N();
            l1.c cVar = l1.i.a;
            if (objN == cVar) {
                objN = new g2.t();
                jVar3.n0(objN);
            }
            final g2.t tVar = (g2.t) objN;
            WeakHashMap weakHashMap = m2.w;
            t0 t0VarL = h0.c.l(h0.b.e(jVar3).g, jVar3);
            boolean zE = ((i3 & 3670016) == 1048576) | jVar3.e(aVar.ordinal()) | jVar3.g(n1Var);
            Object objN2 = jVar3.N();
            if (zE || objN2 == cVar) {
                float fC2 = n1Var.c();
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    fC = 0;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (y3.f.a(f, fC2) > 0) {
                        fC2 = f;
                    }
                    fC = t0VarL.c() + fC2 + 16;
                }
                objN2 = oi.k.t(fC, jVar3);
            }
            float f2 = ((y3.f) objN2).A;
            boolean zG = jVar3.g(n1Var) | jVar3.g(t0VarL);
            Object objN3 = jVar3.N();
            if (zG || objN3 == cVar) {
                objN3 = oi.k.t(t0VarL.a() + n1Var.a() + 4, jVar3);
            }
            float f3 = ((y3.f) objN3).A;
            Object objN4 = jVar3.N();
            if (objN4 == cVar) {
                objN4 = l1.q.z(Boolean.FALSE);
                jVar3.n0(objN4);
            }
            final z0 z0Var3 = (z0) objN4;
            Object objN5 = jVar3.N();
            if (objN5 == cVar) {
                objN5 = l1.q.z((Object) null);
                jVar3.n0(objN5);
            }
            z0 z0Var4 = (z0) objN5;
            Object objN6 = jVar3.N();
            if (objN6 == cVar) {
                objN6 = l1.q.z((Object) null);
                jVar3.n0(objN6);
            }
            z0 z0Var5 = (z0) objN6;
            Integer num = i0Var.p;
            u30.b bVar = i0Var.d;
            u30.b bVar2 = i0Var.c;
            int i4 = i3 & 112;
            int i5 = i3 & 29360128;
            boolean z6 = (i4 == 32) | ((i3 & 14) == 4) | (i5 == 8388608);
            Object objN7 = jVar3.N();
            if (z6 || objN7 == cVar) {
                z0Var = z0Var5;
                i2 = i4;
                z0Var2 = z0Var4;
                z4 = false;
                objN7 = new h0(i0Var, vVar, kVar, z0Var, z0Var2, null);
                jVar3.n0(objN7);
            } else {
                z0Var = z0Var5;
                i2 = i4;
                z0Var2 = z0Var4;
                z4 = false;
            }
            l1.q.i(num, jVar3, (u00.n) objN7);
            boolean zH = jVar3.h(((Boolean) z0Var3.getValue()).booleanValue()) | jVar3.g((Object) r25) | jVar3.g(bVar2);
            Object objN8 = jVar3.N();
            if (zH || objN8 == cVar) {
                int iOrdinal2 = aVar.ordinal();
                if (iOrdinal2 != 0) {
                    z5 = true;
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((Boolean) z0Var3.getValue()).booleanValue()) {
                        bVar2 = bVar;
                    }
                } else {
                    z5 = true;
                }
                jVar3.n0(bVar2);
                objN8 = bVar2;
            } else {
                z5 = true;
            }
            final u30.b bVar3 = (u30.b) objN8;
            b2.r rVarV = rVar.V(z1.c);
            Object objN9 = jVar3.N();
            if (objN9 == cVar) {
                objN9 = new o2(z0Var2, 15);
                jVar3.n0(objN9);
            }
            b2.r rVarN = z2.d0.n(rVarV, (u00.k) objN9);
            p1 p1VarG = h0.c.g(0.0f, f2, 0.0f, f3, 5);
            h0.f fVarG = h0.i.g(12);
            boolean zE2 = jVar3.e(aVar.ordinal()) | (i2 == 32 ? z5 : z4) | ((i3 & 57344) == 16384 ? z5 : z4) | ((i3 & 7168) == 2048 ? z5 : z4) | (i5 == 8388608 ? z5 : z4) | jVar3.g(bVar3) | ((i3 & 896) == 256 ? z5 : z4) | ((458752 & i3) == 131072 ? z5 : z4);
            Object objN10 = jVar3.N();
            if (zE2 || objN10 == cVar) {
                final z0 z0Var6 = z0Var;
                u00.k kVar2 = new u00.k() {
                    @Override
                    public final Object invoke(Object obj) {
                        final gm.a aVar2;
                        boolean z7;
                        int i6;
                        j0.h LazyColumn = (j0.h) obj;
                        kotlin.jvm.internal.m.e(LazyColumn, "$this$LazyColumn");
                        final i0 i0Var2 = i0Var;
                        if (i0Var2.a) {
                            j0.h.q(LazyColumn, "RECITER_HEADER_KEY", a.c, 2);
                        }
                        bx.c cVar2 = i0Var2.b;
                        gm.a aVar3 = aVar;
                        boolean z8 = z;
                        u00.k kVar3 = kVar;
                        if (cVar2 != null) {
                            g0 g0Var = new g0(aVar3, i0Var2, z2, z8, cVar2, kVar3);
                            aVar2 = aVar3;
                            kVar3 = kVar3;
                            z7 = z8;
                            j0.h.q(LazyColumn, "RECITER_HEADER_KEY", new v1.c(g0Var, 2110832166, true), 2);
                            j0.h.q(LazyColumn, "RECITER_SURAHS_RECORDED_KEY", new v1.c(new az.j(aVar2, i0Var2, kVar3, 16), 854354447, true), 2);
                            if (aVar2 == gm.a.B) {
                                j0.h.q(LazyColumn, "RECITER_SURAHS_SEARCH_KEY", new v1.c(new bz.o(tVar, i0Var2, kVar3, z0Var3, 9), -1380105365, true), 2);
                            }
                        } else {
                            aVar2 = aVar3;
                            z7 = z8;
                        }
                        int iOrdinal3 = aVar2.ordinal();
                        if (iOrdinal3 == 0) {
                            i6 = 16;
                        } else {
                            if (iOrdinal3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i6 = 24;
                        }
                        final float f4 = i6;
                        final u00.k kVar4 = kVar3;
                        final u30.b bVar4 = bVar3;
                        final PlayerItem playerItem2 = playerItem;
                        final boolean z9 = z7;
                        final boolean z11 = z3;
                        final z0 z0Var7 = z0Var6;
                        j0.h.q(LazyColumn, "RECITER_SURAHS_LIST_KEY", new v1.c(new u00.o() {
                            @Override
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                j0.b item = (j0.b) obj2;
                                l1.g0 g0Var2 = (l1.j) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                kotlin.jvm.internal.m.e(item, "$this$item");
                                l1.g0 g0Var3 = g0Var2;
                                if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    ox.a.l(h0.c.E(b2.o.A, f4, 0.0f, 2), v1.d.d(1474099067, new iz.b(bVar4, i0Var2, z9, playerItem2, z11, aVar2, kVar4, z0Var7), g0Var2), g0Var2, 48);
                                } else {
                                    g0Var3.V();
                                }
                                return g00.b0.a;
                            }
                        }, 1124451785, true), 2);
                        return g00.b0.a;
                    }
                };
                jVar3.n0(kVar2);
                objN10 = kVar2;
            }
            jVar2 = jVar3;
            k00.f.d(rVarN, vVar, p1VarG, fVarG, null, null, false, null, (u00.k) objN10, jVar2, ((i3 << 3) & 112) | 24576, 488);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n(vVar, i0Var, playerItem, z, z2, z3, f, kVar, rVar, i) {
                public final j0.v A;
                public final i0 B;
                public final PlayerItem C;
                public final boolean D;
                public final boolean E;
                public final boolean F;
                public final float G;
                public final u00.k H;
                public final b2.r I;

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(1);
                    a.a(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void b(ReciterLauncher launcher, l1.j jVar, int i) {
        Object pVar;
        j0.v vVar;
        p0 p0Var;
        b3.e eVar;
        b2.r rVar;
        p0 p0Var2;
        int i2;
        Object obj;
        final p0 p0Var3;
        final p0 p0Var4;
        kotlin.jvm.internal.m.e(launcher, "launcher");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1115072779);
        int i3 = i | (g0Var.g(launcher) ? 4 : 2);
        if (g0Var.S(i3 & 1, (i3 & 3) != 2)) {
            u00.a aVarA = cq.l.a(g0Var);
            boolean z = (i3 & 14) == 4;
            Object objN = g0Var.N();
            Object obj2 = l1.i.a;
            if (z || objN == obj2) {
                objN = new g1.l0(launcher, 22);
                g0Var.n0(objN);
            }
            u00.a aVar = (u00.a) objN;
            f1 f1VarA = u6.a.a(g0Var);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            t6.b bVarZ = bi.b.z(f1VarA);
            e60.a aVarA2 = q50.c.a(g0Var);
            kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
            p0 p0Var5 = (p0) c7.i.S(b0Var.b(p0.class), f1VarA.getViewModelStore(), (String) null, bVarZ, aVarA2, aVar);
            e60.a aVarA3 = q50.c.a(g0Var);
            boolean zG = g0Var.g((Object) null) | g0Var.g(aVarA3);
            Object objN2 = g0Var.N();
            if (zG || objN2 == obj2) {
                objN2 = oi.k.f(b0Var, uu.a.class, aVarA3, (b60.a) null, g0Var);
            }
            uu.w wVar = (uu.w) ((uu.a) objN2);
            z0 z0VarQ = k00.f.q(wVar.C, g0Var, 0);
            z0 z0VarQ2 = k00.f.q(wVar.B, g0Var, 0);
            z0 z0VarQ3 = k00.f.q(wVar.G, g0Var, 0);
            z0 z0VarQ4 = k00.f.q(p0Var5.c.d, g0Var, 0);
            z0 z0VarQ5 = k00.f.q(wVar.I, g0Var, 0);
            kk.c cVarD = kk.e.d(g0Var);
            y3.c cVar = (y3.c) g0Var.k(o1.h);
            j0.v vVarA = j0.x.a(0, g0Var, 3);
            p2 p2VarB = sm.a.b(vVarA, g0Var);
            Context context = (Context) g0Var.k(c3.o0.b);
            Object objN3 = g0Var.N();
            if (objN3 == obj2) {
                objN3 = x5.s(0, g0Var);
            }
            z0 z0Var = (z0) objN3;
            boolean zG2 = g0Var.g(p0Var5) | g0Var.g(aVarA) | g0Var.i(context);
            Object objN4 = g0Var.N();
            if (zG2 || objN4 == obj2) {
                vVar = vVarA;
                pVar = new ev.p(p0Var5, aVarA, context, null, 27);
                g0Var.n0(pVar);
            } else {
                pVar = objN4;
                vVar = vVarA;
            }
            l1.q.i(g00.b0.a, g0Var, (u00.n) pVar);
            b2.r rVarF = z.n.f(z1.c, dl.a.L, i2.b0.b);
            w0 w0VarD = h0.o.d(b2.b.E, false);
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
            b3.f fVar = b3.h.f;
            l1.q.I(w0VarD, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar2 = b3.h.h;
            l1.q.E(g0Var, eVar2);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            boolean z2 = ((i0) z0VarQ4.getValue()).a;
            b2.r rVar2 = b2.o.A;
            if (z2 || ((i0) z0VarQ4.getValue()).b != null) {
                g0Var.c0(-1950170696);
                b2.r rVarA = kk.e.a(rVar2, cVarD);
                i0 i0Var = (i0) z0VarQ4.getValue();
                PlayerItem playerItem = (PlayerItem) z0VarQ.getValue();
                bx.c cVar2 = (bx.c) z0VarQ2.getValue();
                Integer numValueOf2 = cVar2 != null ? Integer.valueOf(cVar2.a) : null;
                j0.v vVar2 = vVar;
                bx.c cVar3 = ((i0) z0VarQ4.getValue()).b;
                boolean zA = kotlin.jvm.internal.m.a(numValueOf2, cVar3 != null ? Integer.valueOf(cVar3.a) : null);
                boolean zBooleanValue = ((Boolean) z0VarQ5.getValue()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) z0VarQ3.getValue()).booleanValue();
                float f = ((y3.f) z0Var.getValue()).A;
                boolean zG3 = g0Var.g(p0Var5);
                Object objN5 = g0Var.N();
                if (zG3 || objN5 == obj2) {
                    p0Var = p0Var5;
                    objN5 = new e1(1, p0Var, p0.class, "action", "action(Lcom/mchutov/quranify/reciters/presentation/screen/detail/main/ReciterAction;)V", 0, 9);
                    g0Var.n0(objN5);
                } else {
                    p0Var = p0Var5;
                }
                eVar = eVar2;
                rVar = rVar2;
                p0Var2 = p0Var;
                i2 = 0;
                a(vVar2, i0Var, playerItem, zA, zBooleanValue, zBooleanValue2, f, (u00.k) ((a10.g) objN5), rVarA, g0Var, 0);
                g0Var = g0Var;
                g0Var.r(false);
            } else {
                g0Var.c0(-1949694691);
                g0Var.r(false);
                i2 = 0;
                p0Var2 = p0Var5;
                eVar = eVar2;
                rVar = rVar2;
            }
            b2.i iVar = b2.b.B;
            h0.s sVar = h0.s.a;
            sm.a.a("", ((Number) p2VarB.getValue()).floatValue(), sVar.a(rVar, iVar), 0.0f, g0Var, 0);
            b2.r rVarD = z1.d(h0.c.M(h0.c.E(sVar.a(rVar, b2.b.A), 16, 0.0f, 2), h0.c.e), 1.0f);
            boolean zG4 = g0Var.g(cVar);
            Object objN6 = g0Var.N();
            if (zG4 || objN6 == obj2) {
                objN6 = new as.f0(cVar, z0Var, 13);
                g0Var.n0(objN6);
            }
            b2.r rVarO = z2.d0.o(rVarD, (u00.k) objN6);
            v1 v1VarA = t1.a(h0.i.a, b2.b.J, g0Var, i2);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarO, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            p0.e eVar3 = p0.f.a;
            float f2 = i2;
            float f3 = 44;
            long j = dl.a.P;
            long jB = i2.t.b(0.5f, j);
            final p0 p0Var6 = p0Var2;
            boolean zG5 = g0Var.g(p0Var6);
            Object objN7 = g0Var.N();
            if (zG5 || objN7 == obj2) {
                final int i4 = 0;
                objN7 = new u00.a() {
                    @Override
                    public final Object invoke() {
                        int i5 = i4;
                        p0 p0Var7 = p0Var6;
                        switch (i5) {
                            case 0:
                                p0Var7.j(c.a);
                                break;
                            case 1:
                                p0Var7.j(s.a);
                                break;
                            default:
                                p0Var7.j(i.a);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN7);
            }
            l1.g0 g0Var2 = g0Var;
            w50.c.f((u00.a) objN7, cVarD, null, false, false, 0.0f, new y3.f(f3), 0L, jB, 10.0f, eVar3, f2, a, g0Var2, 806879232, 432, 188);
            g0Var = g0Var2;
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            h0.c.h(new c1(1.0f, true), g0Var);
            if (((i0) z0VarQ4.getValue()).b != null) {
                g0Var.c0(1089833049);
                long jB2 = i2.t.b(0.5f, j);
                p0Var3 = p0Var6;
                boolean zG6 = g0Var.g(p0Var3);
                Object objN8 = g0Var.N();
                if (zG6) {
                    obj = obj2;
                } else {
                    obj = obj2;
                    if (objN8 == obj) {
                    }
                    w50.c.f((u00.a) objN8, cVarD, null, false, false, 0.0f, new y3.f(f3), 0L, jB2, 10.0f, eVar3, f2, b, g0Var, 806879232, 432, 188);
                    g0Var = g0Var;
                    g0Var.r(false);
                }
                final int i5 = 1;
                objN8 = new u00.a() {
                    @Override
                    public final Object invoke() {
                        int i6 = i5;
                        p0 p0Var7 = p0Var3;
                        switch (i6) {
                            case 0:
                                p0Var7.j(c.a);
                                break;
                            case 1:
                                p0Var7.j(s.a);
                                break;
                            default:
                                p0Var7.j(i.a);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN8);
                w50.c.f((u00.a) objN8, cVarD, null, false, false, 0.0f, new y3.f(f3), 0L, jB2, 10.0f, eVar3, f2, b, g0Var, 806879232, 432, 188);
                g0Var = g0Var;
                g0Var.r(false);
            } else {
                obj = obj2;
                p0Var3 = p0Var6;
                g0Var.c0(1090627393);
                g0Var.r(false);
            }
            g0Var.r(true);
            g0Var.r(true);
            i0 i0Var2 = (i0) z0VarQ4.getValue();
            boolean zG7 = g0Var.g(p0Var3);
            Object objN9 = g0Var.N();
            if (zG7 || objN9 == obj) {
                p0 p0Var7 = p0Var3;
                objN9 = new e1(1, p0Var7, p0.class, "action", "action(Lcom/mchutov/quranify/reciters/presentation/screen/detail/main/ReciterAction;)V", 0, 10);
                p0Var4 = p0Var7;
                g0Var.n0(objN9);
            } else {
                p0Var4 = p0Var3;
            }
            ox.a.j(i0Var2, (u00.k) ((a10.g) objN9), g0Var, 0);
            bx.c cVar4 = ((i0) z0VarQ4.getValue()).b;
            boolean z3 = ((i0) z0VarQ4.getValue()).o;
            boolean zG8 = g0Var.g(p0Var4);
            Object objN10 = g0Var.N();
            if (zG8 || objN10 == obj) {
                final int i6 = 2;
                objN10 = new u00.a() {
                    @Override
                    public final Object invoke() {
                        int i7 = i6;
                        p0 p0Var8 = p0Var4;
                        switch (i7) {
                            case 0:
                                p0Var8.j(c.a);
                                break;
                            case 1:
                                p0Var8.j(s.a);
                                break;
                            default:
                                p0Var8.j(i.a);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN10);
            }
            mx.a.d(cVar4, z3, (u00.a) objN10, g0Var, 8);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new m3.a(launcher, i, 3);
        }
    }
}

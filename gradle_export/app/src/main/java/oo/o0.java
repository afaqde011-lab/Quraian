package oo;

import android.content.res.Configuration;
import bv.k1;
import c3.g3;
import c3.l2;
import c3.o1;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import d0.o2;
import d40.n1;
import g1.o3;
import g1.z6;
import h0.m2;
import h0.p1;
import h0.t1;
import h0.v1;
import h0.z1;
import java.util.WeakHashMap;
import l1.m1;
import l1.p2;
import l1.r1;
import w.b2;
import w.s1;
import w.u1;
import w.x1;

public abstract class o0 {
    public static final k0 a;
    public static final k0 b;

    static {
        final int i = 0;
        a = new Object() {
        };
        final int i2 = 1;
        b = new Object() {
        };
    }

    public static final void a(z0 z0Var, u00.k kVar, jk.a aVar, b2.r rVar, l1.j jVar, int i) {
        float f;
        float f2;
        long jB;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-899990723);
        int i2 = i | (g0Var.g(z0Var) ? 4 : 2) | (g0Var.i(kVar) ? 32 : 16) | (g0Var.i(aVar) ? 256 : 128) | (g0Var.g(rVar) ? 2048 : 1024);
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zB = z0Var.b();
            if (z0Var.s) {
                if (zB) {
                    f2 = 1.0f;
                } else {
                    f = 0.7f;
                }
                p2 p2VarB = x.d.b(f, (x.y) null, (String) null, g0Var, 0, 30);
                if (z0Var.m) {
                    jB = dl.a.i;
                } else {
                    jB = i2.t.b(0.7f, dl.a.i);
                }
                w00.a.c(aVar, p0.f.a(32), z1.e(rVar, 40), 0.0f, 0L, 0.0f, 0.0f, 0.0f, b2.b.E, v1.d.d(-1504143747, new eu.p(z0Var, zB, kVar, p2VarB, b2.a(jB, (x.y) null, (String) null, g0Var, 0, 14)), g0Var), g0Var, ((i2 >> 6) & 14) | 905969664, 248);
                g0Var = g0Var;
            } else {
                f2 = 0.2f;
            }
            f = f2;
            p2 p2VarB2 = x.d.b(f, (x.y) null, (String) null, g0Var, 0, 30);
            if (z0Var.m) {
                jB = dl.a.i;
            } else {
                jB = i2.t.b(0.7f, dl.a.i);
            }
            w00.a.c(aVar, p0.f.a(32), z1.e(rVar, 40), 0.0f, 0L, 0.0f, 0.0f, 0.0f, b2.b.E, v1.d.d(-1504143747, new eu.p(z0Var, zB, kVar, p2VarB2, b2.a(jB, (x.y) null, (String) null, g0Var, 0, 14)), g0Var), g0Var, ((i2 >> 6) & 14) | 905969664, 248);
            g0Var = g0Var;
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new w0(z0Var, kVar, aVar, rVar, i, 0);
        }
    }

    public static final void b(z0 z0Var, u00.k kVar, b2.r rVar, p1 p1Var, l1.j jVar, int i) {
        l1.g0 g0Var;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(116045582);
        int i2 = i | (g0Var2.g(z0Var) ? 4 : 2) | (g0Var2.i(kVar) ? 32 : 16) | (g0Var2.g(rVar) ? 256 : 128);
        if (g0Var2.S(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zB = z0Var.b();
            Object objN = g0Var2.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = l1.q.z(Boolean.FALSE);
                g0Var2.n0(objN);
            }
            l1.z0 z0Var2 = (l1.z0) objN;
            Object objN2 = g0Var2.N();
            if (objN2 == obj) {
                objN2 = new n0(z0Var2, null, 1);
                g0Var2.n0(objN2);
            }
            l1.q.i(g00.b0.a, g0Var2, (u00.n) objN2);
            h0.c.a(rVar, b2.b.E, false, v1.d.d(1289518692, new mu.h(p1Var, z0Var, zB, ((y3.c) g0Var2.k(o1.h)).R0(16), x.d.b(zB ? 0.0f : 1.0f, ((Boolean) z0Var2.getValue()).booleanValue() ? x.c.w(RCHTTPStatusCodes.UNSUCCESSFUL, 0, x.x.a, 2) : x.c.u(), (String) null, g0Var2, 0, 28), v(z0Var.d, g0Var2), z0Var2, kVar), g0Var2), g0Var2, ((i2 >> 6) & 14) | 3120, 4);
            g0Var = g0Var2;
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new dz.k(z0Var, kVar, rVar, p1Var, i);
        }
    }

    public static final void c(int i, b2.r rVar, l1.j jVar, final z0 uiState, final u00.k onAction, final boolean z) {
        Object obj;
        boolean z2;
        Object objN;
        boolean z3;
        Object objN2;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(806773893);
        int i2 = i | (g0Var.g(uiState) ? 4 : 2) | (g0Var.i(onAction) ? 32 : 16) | (g0Var.g(rVar) ? 2048 : 1024) | (g0Var.h(z) ? 16384 : 8192);
        if (g0Var.S(i2 & 1, (i2 & 9363) != 9362)) {
            final boolean zB = uiState.b();
            Object objN3 = g0Var.N();
            Object obj2 = l1.i.a;
            if (objN3 == obj2) {
                objN3 = l1.q.z(Boolean.FALSE);
                g0Var.n0(objN3);
            }
            final l1.z0 z0Var = (l1.z0) objN3;
            Object objN4 = g0Var.N();
            if (objN4 == obj2) {
                objN4 = new n0(z0Var, null, 0);
                g0Var.n0(objN4);
            }
            l1.q.i(g00.b0.a, g0Var, (u00.n) objN4);
            final k0 k0Var = ((Boolean) z0Var.getValue()).booleanValue() ? a : b;
            long jA = ((g3) g0Var.k(o1.u)).a();
            g0Var.c0(-34999837);
            g0Var.r(false);
            final int iMin = Math.min((int) (jA >> 32), (int) (jA & 4294967295L));
            p2 p2VarA = x.d.a(zB ? 26 : 28, ((Boolean) z0Var.getValue()).booleanValue() ? x.c.w(RCHTTPStatusCodes.UNSUCCESSFUL, 0, x.x.a, 2) : x.c.u(), (String) null, g0Var, 0, 12);
            p2 p2VarB = x.d.b(zB ? 1.0f : 0.0f, ((Boolean) z0Var.getValue()).booleanValue() ? x.c.w(RCHTTPStatusCodes.UNSUCCESSFUL, 0, x.x.a, 2) : x.c.u(), (String) null, g0Var, 0, 28);
            z2.w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVar, g0Var);
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
            x1.a(z1.c, v1.d.d(-955729087, new u00.o() {
                @Override
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    final u1 SharedTransitionLayout = (u1) obj3;
                    l1.g0 g0Var2 = (l1.j) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    kotlin.jvm.internal.m.e(SharedTransitionLayout, "$this$SharedTransitionLayout");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= g0Var2.g(SharedTransitionLayout) ? 4 : 2;
                    }
                    l1.g0 g0Var3 = g0Var2;
                    if (g0Var3.S(iIntValue & 1, (iIntValue & 19) != 18)) {
                        Boolean boolValueOf = Boolean.valueOf(zB);
                        h0.a0 a0Var = z1.c;
                        Object objN5 = g0Var3.N();
                        if (objN5 == l1.i.a) {
                            objN5 = new o2(z0Var, 16);
                            g0Var3.n0(objN5);
                        }
                        final z0 z0Var2 = uiState;
                        final u00.k kVar = onAction;
                        final k0 k0Var2 = k0Var;
                        final int i3 = iMin;
                        final boolean z4 = z;
                        w.m.a(boolValueOf, a0Var, (u00.k) objN5, (b2.d) null, "audioStoryReadHeader", (u00.k) null, v1.d.d(620601246, new u00.p() {
                            @Override
                            public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                                w.p AnimatedContent = (w.p) obj6;
                                boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                                l1.g0 g0Var4 = (l1.j) obj8;
                                int iIntValue2 = ((Integer) obj9).intValue();
                                kotlin.jvm.internal.m.e(AnimatedContent, "$this$AnimatedContent");
                                z0 z0Var3 = z0Var2;
                                u00.k kVar2 = kVar;
                                u1 u1Var = SharedTransitionLayout;
                                k0 k0Var3 = k0Var2;
                                int i4 = i3;
                                if (zBooleanValue) {
                                    l1.g0 g0Var5 = g0Var4;
                                    g0Var5.c0(-1502431939);
                                    o0.r(z0Var3, kVar2, u1Var, AnimatedContent, k0Var3, i4, g0Var4, (iIntValue2 << 9) & 7168);
                                    g0Var5.r(false);
                                } else {
                                    l1.g0 g0Var6 = g0Var4;
                                    g0Var6.c0(-1502032690);
                                    o0.j(z0Var3, kVar2, z4, false, u1Var, AnimatedContent, k0Var3, i4, g0Var4, (iIntValue2 << 18) & 3670016);
                                    g0Var6.r(false);
                                }
                                return g00.b0.a;
                            }
                        }, g0Var2), g0Var2, 1597872, 40);
                    } else {
                        g0Var3.V();
                    }
                    return g00.b0.a;
                }
            }, g0Var), g0Var, 54);
            b2.r rVarG = h0.c.G(h0.s.a.a(b2.o.A, new b2.i(((Number) p2VarB.getValue()).floatValue(), -1.0f)), 0.0f, ((y3.f) p2VarA.getValue()).A, 0.0f, 0.0f, 13);
            u30.b bVar = uiState.n;
            boolean z4 = uiState.o;
            String str = uiState.q;
            int i3 = i2 & 112;
            boolean z5 = i3 == 32;
            Object objN5 = g0Var.N();
            if (z5) {
                obj = obj2;
            } else {
                obj = obj2;
                if (objN5 == obj) {
                }
                u00.a aVar = (u00.a) objN5;
                if (i3 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objN = g0Var.N();
                if (z2 || objN == obj) {
                    objN = new nz.k(5, onAction);
                    g0Var.n0(objN);
                }
                u00.a aVar2 = (u00.a) objN;
                z3 = i3 == 32;
                objN2 = g0Var.N();
                if (z3 || objN2 == obj) {
                    objN2 = new lp.k(11, onAction);
                    g0Var.n0(objN2);
                }
                po.n.b(bVar, z4, str, aVar, aVar2, (u00.k) objN2, rVarG, zB, null, g0Var, 0, 256);
                g0Var = g0Var;
                g0Var.r(true);
            }
            objN5 = new nz.k(4, onAction);
            g0Var.n0(objN5);
            u00.a aVar3 = (u00.a) objN5;
            if (i3 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            objN = g0Var.N();
            if (z2) {
                objN = new nz.k(5, onAction);
                g0Var.n0(objN);
            } else {
                objN = new nz.k(5, onAction);
                g0Var.n0(objN);
            }
            u00.a aVar4 = (u00.a) objN;
            if (i3 == 32) {
            }
            objN2 = g0Var.N();
            if (z3) {
                objN2 = new lp.k(11, onAction);
                g0Var.n0(objN2);
            } else {
                objN2 = new lp.k(11, onAction);
                g0Var.n0(objN2);
            }
            po.n.b(bVar, z4, str, aVar3, aVar4, (u00.k) objN2, rVarG, zB, null, g0Var, 0, 256);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new m0(uiState, onAction, rVar, z, i);
        }
    }

    public static final void d(z0 z0Var, u00.k kVar, l1.j jVar, int i) {
        l1.j jVar2;
        kk.c cVar;
        b2.r rVar;
        lo.e eVar;
        u00.n nVar;
        u00.a aVar;
        l1.j jVar3;
        ?? r12;
        int i2;
        ?? r13;
        l1.c cVar2;
        int i3;
        z0 uiState = z0Var;
        u00.k onAction = kVar;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        lo.e eVar2 = uiState.a;
        kotlin.jvm.internal.m.e(onAction, "onAction");
        l1.j jVar4 = (l1.g0) jVar;
        jVar4.e0(1771827284);
        int i4 = i | (jVar4.g(uiState) ? 4 : 2) | (jVar4.i(onAction) ? 32 : 16);
        if (jVar4.S(i4 & 1, (i4 & 19) != 18)) {
            l2 l2VarU = c3.m0.u(jVar4);
            Configuration configuration = (Configuration) jVar4.k(c3.o0.a);
            boolean z = configuration.orientation == 2 && configuration.smallestScreenWidthDp <= 600;
            p2 p2VarB = x.d.b((uiState.v && uiState.b() && !z) ? 1.0f : 0.0f, x.c.v(0.7f, 250.0f, (Object) null, 4), (String) null, jVar4, 48, 28);
            Boolean boolValueOf = Boolean.valueOf(z);
            int i5 = i4 & 14;
            int i6 = i4 & 112;
            boolean z2 = (i5 == 4) | (i6 == 32);
            Object objN = jVar4.N();
            l1.c cVar3 = l1.i.a;
            Object obj = objN;
            if (z2 || objN == cVar3) {
                v0 v0Var = new v0(uiState, onAction, null, 0);
                jVar4.n0(v0Var);
                obj = v0Var;
            }
            l1.q.i(boolValueOf, jVar4, (u00.n) obj);
            kk.c cVarD = kk.e.d(jVar4);
            int i7 = configuration.smallestScreenWidthDp;
            boolean z3 = i7 > 600;
            boolean z4 = !z3 && i7 <= 375;
            b2.r rVar2 = z1.c;
            b2.r rVarA = u2.f.a(rVar2, l2VarU, (u2.d) null);
            long j = dl.a.L;
            i2.o0 o0Var = i2.b0.b;
            b2.r rVarF = z.n.f(rVarA, j, o0Var);
            b2.i iVar = b2.b.A;
            z2.w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode = Long.hashCode(((l1.g0) jVar4).T);
            m1 m1VarM = jVar4.m();
            b2.r rVarC = b2.a.c(rVarF, jVar4);
            b3.i.c.getClass();
            u00.a aVar2 = b3.h.b;
            jVar4.g0();
            if (((l1.g0) jVar4).S) {
                jVar4.l(aVar2);
            } else {
                jVar4.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(w0VarD, jVar4, fVar);
            u00.n nVar2 = b3.h.e;
            l1.q.I(m1VarM, jVar4, nVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar2 = b3.h.g;
            l1.q.I(numValueOf, jVar4, fVar2);
            b3.e eVar3 = b3.h.h;
            l1.q.E(jVar4, eVar3);
            b3.f fVar3 = b3.h.d;
            l1.q.I(rVarC, jVar4, fVar3);
            boolean z5 = z4;
            b2.r rVarA2 = kk.e.a(rVar2, cVarD);
            z2.w0 w0VarD2 = h0.o.d(iVar, false);
            int iHashCode2 = Long.hashCode(((l1.g0) jVar4).T);
            m1 m1VarM2 = jVar4.m();
            b2.r rVarC2 = b2.a.c(rVarA2, jVar4);
            jVar4.g0();
            if (((l1.g0) jVar4).S) {
                jVar4.l(aVar2);
            } else {
                jVar4.q0();
            }
            l1.q.I(w0VarD2, jVar4, fVar);
            l1.q.I(m1VarM2, jVar4, nVar2);
            a1.b.v(iHashCode2, jVar4, fVar2, jVar4, eVar3);
            l1.q.I(rVarC2, jVar4, fVar3);
            if (eVar2 == null) {
                jVar4.c0(1556686998);
                jVar4.r(false);
                rVar = rVar2;
                cVar = cVarD;
                eVar = eVar2;
                r12 = 0;
                jVar3 = jVar4;
                nVar = nVar2;
                aVar = aVar2;
            } else {
                jVar4.c0(1556686999);
                cVar = cVarD;
                rVar = rVar2;
                eVar = eVar2;
                nVar = nVar2;
                aVar = aVar2;
                a10.h0.a(eVar, f2.h.b(rVar2, 100, (i2.o0) null), 0.0f, false, null, false, jVar4, 3072, 52);
                jVar3 = jVar4;
                r12 = 0;
                jVar3.r(false);
            }
            h0.o.a(z.n.f(rVar, i2.t.b(0.45f, i2.t.b), o0Var), jVar3, 6);
            jVar3.r(true);
            h0.o.a(z.n.p(rVar, z.n.l(jVar3), (boolean) r12, 14), jVar3, (int) r12);
            b2.r rVarM = h0.c.M(h0.c.M(rVar, h0.c.e), h0.c.g);
            WeakHashMap weakHashMap = m2.w;
            b2.r rVarE = h0.c.E(h0.c.L(rVarM, new h0.e1(h0.b.e(jVar3).b, h0.c.l)), 24, 0.0f, 2);
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.N, jVar3, 48);
            int iHashCode3 = Long.hashCode(((l1.g0) jVar3).T);
            m1 m1VarM3 = jVar3.m();
            b2.r rVarC3 = b2.a.c(rVarE, jVar3);
            jVar3.g0();
            if (((l1.g0) jVar3).S) {
                jVar3.l(aVar);
            } else {
                jVar3.q0();
            }
            l1.q.I(vVarA, jVar3, fVar);
            l1.q.I(m1VarM3, jVar3, nVar);
            a1.b.v(iHashCode3, jVar3, fVar2, jVar3, eVar3);
            l1.q.I(rVarC3, jVar3, fVar3);
            b2.o oVar = b2.o.A;
            if (z) {
                jVar3.c0(1184191164);
                l1.j jVar5 = jVar3;
                i2 = i6;
                r13 = 0;
                m(i4 & 126, h0.w.a(z1.d(oVar, 1.0f), 1.0f), jVar5, z0Var, kVar, z5);
                jVar2 = jVar5;
                jVar2.r(false);
                uiState = z0Var;
                onAction = kVar;
                cVar2 = cVar3;
            } else {
                jVar2 = jVar3;
                i2 = i6;
                r13 = 0;
                r13 = 0;
                if (z3) {
                    jVar2.c0(1184520570);
                    boolean zG = jVar2.g(p2VarB);
                    Object objN2 = jVar2.N();
                    cVar2 = r23;
                    Object obj2 = objN2;
                    if (zG || objN2 == cVar2) {
                        ds.l lVar = new ds.l(p2VarB, 8);
                        jVar2.n0(lVar);
                        obj2 = lVar;
                    }
                    onAction = kVar;
                    uiState = z0Var;
                    e(uiState, onAction, cVar, (u00.a) obj2, h0.w.a(z1.d(oVar, 1.0f), 1.0f), jVar2, i4 & 126);
                    jVar2 = jVar2;
                    jVar2.r(false);
                } else {
                    cVar2 = r23;
                    jVar2.c0(1184912503);
                    c(i5 | 384 | i2, h0.w.a(z1.d(oVar, 1.0f), 1.0f), jVar2, z0Var, kVar, z5);
                    h1 h1Var = h1.E;
                    boolean zG2 = jVar2.g(p2VarB);
                    Object objN3 = jVar2.N();
                    Object obj3 = objN3;
                    if (zG2 || objN3 == cVar2) {
                        ds.l lVar2 = new ds.l(p2VarB, 9);
                        jVar2.n0(lVar2);
                        obj3 = lVar2;
                    }
                    u00.a awayFraction = (u00.a) obj3;
                    kotlin.jvm.internal.m.e(awayFraction, "awayFraction");
                    onAction = kVar;
                    uiState = z0Var;
                    o(uiState, onAction, h1Var, false, z5, z2.d0.l(i2.b0.p(oVar, new ca.q(10, awayFraction)), new h1.x0(2, awayFraction)), jVar2, i5 | 3456 | i2, 0);
                    jVar2.r(false);
                }
            }
            jVar2.r(true);
            if (uiState.z) {
                jVar2.c0(1317397459);
                i3 = 32;
                ?? r15 = i2 == 32 ? 1 : r13;
                Object objN4 = jVar2.N();
                Object obj4 = objN4;
                if (r15 != 0 || objN4 == cVar2) {
                    nz.k kVar2 = new nz.k(22, onAction);
                    jVar2.n0(kVar2);
                    obj4 = kVar2;
                }
                po.n.f(eVar, (u00.a) obj4, null, jVar2, r13);
                jVar2.r((boolean) r13);
            } else {
                i3 = 32;
                jVar2.c0(1317602152);
                jVar2.r((boolean) r13);
            }
            kl.a.a(h0.s.a.a(oVar, b2.b.B), r13, jVar2, r13, 2);
            jVar2.r(true);
            if (uiState.m) {
                jVar2.c0(-636370782);
                u30.b bVar = uiState.i;
                ?? r16 = i2 == i3 ? 1 : r13;
                Object objN5 = jVar2.N();
                Object obj5 = objN5;
                if (r16 != 0 || objN5 == cVar2) {
                    lp.k kVar3 = new lp.k(17, onAction);
                    jVar2.n0(kVar3);
                    obj5 = kVar3;
                }
                u00.k kVar4 = (u00.k) obj5;
                ?? r17 = i2 == i3 ? 1 : r13;
                Object objN6 = jVar2.N();
                Object obj6 = objN6;
                if (r17 != 0 || objN6 == cVar2) {
                    lp.k kVar5 = new lp.k(18, onAction);
                    jVar2.n0(kVar5);
                    obj6 = kVar5;
                }
                u00.k kVar6 = (u00.k) obj6;
                ?? r18 = i2 == i3 ? 1 : r13;
                Object objN7 = jVar2.N();
                Object obj7 = objN7;
                if (r18 != 0 || objN7 == cVar2) {
                    nz.k kVar7 = new nz.k(23, onAction);
                    jVar2.n0(kVar7);
                    obj7 = kVar7;
                }
                l1.j jVar6 = jVar2;
                po.n.a(bVar, kVar4, kVar6, (u00.a) obj7, jVar6, 0);
                jVar2 = jVar6;
                jVar2.r((boolean) r13);
            } else {
                jVar2.c0(-636020978);
                jVar2.r((boolean) r13);
            }
        } else {
            jVar2 = jVar4;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new l0.g0(uiState, onAction, i, 12);
        }
    }

    public static final void e(z0 uiState, u00.k onAction, kk.c cVar, u00.a awayFraction, b2.r rVar, l1.j jVar, int i) {
        l1.j jVar2;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        kotlin.jvm.internal.m.e(awayFraction, "awayFraction");
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(907439643);
        int i2 = (jVar3.g(uiState) ? 4 : 2) | i | (jVar3.i(onAction) ? 32 : 16) | (jVar3.i(cVar) ? 256 : 128) | (jVar3.i(awayFraction) ? 2048 : 1024) | (jVar3.g(rVar) ? 16384 : 8192);
        if (jVar3.S(i2 & 1, (i2 & 9363) != 9362)) {
            jVar2 = jVar3;
            h0.c.a(rVar, (b2.d) null, false, v1.d.d(-889107471, new bz.o((Object) uiState, onAction, cVar, (Object) awayFraction, 10), jVar3), jVar2, ((i2 >> 12) & 14) | 3072, 6);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new cz.g(uiState, onAction, cVar, awayFraction, rVar, i);
        }
    }

    public static final void f(z0 uiState, b2.r rVar, l1.j jVar, int i, int i2) {
        int i3;
        b2.r rVar2;
        boolean z;
        l1.g0 g0Var;
        r1 r1VarT;
        b2.r rVar3;
        b3.g gVar;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(1209397561);
        if ((i & 6) == 0) {
            i3 = i | (g0Var2.g(uiState) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                rVar2 = rVar;
                i3 |= g0Var2.g(rVar2) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var2.S(i3 & 1, z)) {
                if (i4 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar2;
                }
                h0.v vVarA = h0.u.a(h0.i.g(2), b2.b.M, g0Var2, 6);
                int iHashCode = Long.hashCode(g0Var2.T);
                m1 m1VarM = g0Var2.m();
                b2.r rVarC = b2.a.c(rVar3, g0Var2);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                l1.q.I(vVarA, g0Var2, b3.h.f);
                l1.q.I(m1VarM, g0Var2, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.g);
                l1.q.E(g0Var2, b3.h.h);
                l1.q.I(rVarC, g0Var2, b3.h.d);
                b2.r rVar4 = rVar3;
                z6.b(z3.T(2131886133, new Object[]{Integer.valueOf(uiState.b)}, g0Var2), (b2.r) null, dl.a.n, kh.o.z(17), q3.u.L, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 1, 0, (u00.k) null, (m3.r0) null, g0Var2, 1597440, 24576, 245674);
                z6.b(uiState.c, (b2.r) null, dl.a.p, kh.o.z(13), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 2, false, 1, 0, (u00.k) null, (m3.r0) null, g0Var2, 24576, 24960, 241642);
                g0Var = g0Var2;
                g0Var.r(true);
                rVar2 = rVar4;
            } else {
                g0Var = g0Var2;
                g0Var.V();
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new iv.l(uiState, rVar2, i, i2, 3);
            }
        }
        i3 |= 48;
        rVar2 = rVar;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (g0Var2.S(i3 & 1, z)) {
            if (i4 != 0) {
                rVar3 = b2.o.A;
            } else {
                rVar3 = rVar2;
            }
            h0.v vVarA2 = h0.u.a(h0.i.g(2), b2.b.M, g0Var2, 6);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            m1 m1VarM2 = g0Var2.m();
            b2.r rVarC2 = b2.a.c(rVar3, g0Var2);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(vVarA2, g0Var2, b3.h.f);
            l1.q.I(m1VarM2, g0Var2, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode2), g0Var2, b3.h.g);
            l1.q.E(g0Var2, b3.h.h);
            l1.q.I(rVarC2, g0Var2, b3.h.d);
            b2.r rVar5 = rVar3;
            z6.b(z3.T(2131886133, new Object[]{Integer.valueOf(uiState.b)}, g0Var2), (b2.r) null, dl.a.n, kh.o.z(17), q3.u.L, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 1, 0, (u00.k) null, (m3.r0) null, g0Var2, 1597440, 24576, 245674);
            z6.b(uiState.c, (b2.r) null, dl.a.p, kh.o.z(13), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 2, false, 1, 0, (u00.k) null, (m3.r0) null, g0Var2, 24576, 24960, 241642);
            g0Var = g0Var2;
            g0Var.r(true);
            rVar2 = rVar5;
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new iv.l(uiState, rVar2, i, i2, 3);
        }
    }

    public static final void g(z0 uiState, u00.k onAction, b2.r rVar, b2.r rVar2, boolean z, l1.j jVar, int i, int i2) {
        int i3;
        b2.r rVar3;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        b2.r rVar4;
        boolean z4;
        b2.r rVar5;
        r1 r1VarT;
        b2.r rVar6;
        b3.g gVar;
        boolean z5;
        int i6;
        int i7;
        boolean z6;
        Object objN;
        boolean z7;
        boolean z8;
        Object objN2;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1459714019);
        if ((i & 6) == 0) {
            i3 = (g0Var.g(uiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= g0Var.i(onAction) ? 32 : 16;
        }
        int i8 = i3 | 384;
        int i9 = i2 & 8;
        if (i9 == 0) {
            if ((i & 3072) == 0) {
                rVar3 = rVar2;
                i8 |= g0Var.g(rVar3) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    if (g0Var.h(z2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i8 |= i5;
                }
                if ((i8 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (g0Var.S(i8 & 1, z3)) {
                    rVar6 = b2.o.A;
                    if (i9 != 0) {
                        rVar3 = rVar6;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    b2.r rVarD = z1.d(rVar6, 1.0f);
                    v1 v1VarA = t1.a(h0.i.g(12), b2.b.K, g0Var, 54);
                    int iHashCode = Long.hashCode(g0Var.T);
                    m1 m1VarM = g0Var.m();
                    b2.r rVarC = b2.a.c(rVarD, g0Var);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    b3.f fVar = b3.h.f;
                    l1.q.I(v1VarA, g0Var, fVar);
                    b3.f fVar2 = b3.h.e;
                    l1.q.I(m1VarM, g0Var, fVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b3.f fVar3 = b3.h.g;
                    l1.q.I(numValueOf, g0Var, fVar3);
                    b3.e eVar = b3.h.h;
                    l1.q.E(g0Var, eVar);
                    b3.f fVar4 = b3.h.d;
                    l1.q.I(rVarC, g0Var, fVar4);
                    z5 = z2;
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    h0.c1 c1Var = new h0.c1(1.0f, true);
                    z2.w0 w0VarD = h0.o.d(b2.b.A, false);
                    int iHashCode2 = Long.hashCode(g0Var.T);
                    m1 m1VarM2 = g0Var.m();
                    b2.r rVarC2 = b2.a.c(c1Var, g0Var);
                    g0Var.g0();
                    i6 = i8;
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0VarD, g0Var, fVar);
                    l1.q.I(m1VarM2, g0Var, fVar2);
                    a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
                    l1.q.I(rVarC2, g0Var, fVar4);
                    f(uiState, rVar3, g0Var, (i6 & 14) | ((i6 >> 6) & 112), 0);
                    g0Var.r(true);
                    if (uiState.a != null) {
                        g0Var.c0(592324619);
                        lo.i iVar = uiState.y;
                        i7 = i6 & 112;
                        if (i7 == 32) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objN = g0Var.N();
                        Object obj = l1.i.a;
                        if (z6 || objN == obj) {
                            objN = new nz.k(6, onAction);
                            g0Var.n0(objN);
                        }
                        po.n.d(iVar, (u00.a) objN, null, g0Var, 0);
                        if (z5) {
                            z7 = false;
                            g0Var.c0(592699099);
                            g0Var.r(false);
                        } else {
                            g0Var.c0(592538612);
                            if (i7 == 32) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            objN2 = g0Var.N();
                            if (z8 || objN2 == obj) {
                                objN2 = new nz.k(7, onAction);
                                g0Var.n0(objN2);
                            }
                            z7 = false;
                            po.n.e((u00.a) objN2, null, g0Var, 0);
                            g0Var.r(false);
                        }
                        g0Var.r(z7);
                    } else {
                        g0Var.c0(592709019);
                        g0Var.r(false);
                    }
                    g0Var.r(true);
                    z4 = z5;
                    rVar4 = rVar3;
                    rVar5 = rVar6;
                } else {
                    g0Var.V();
                    rVar4 = rVar3;
                    z4 = z2;
                    rVar5 = rVar;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new ct.w(uiState, onAction, rVar5, rVar4, z4, i, i2);
                }
            }
            i8 |= 24576;
            z2 = z;
            if ((i8 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (g0Var.S(i8 & 1, z3)) {
                rVar6 = b2.o.A;
                if (i9 != 0) {
                    rVar3 = rVar6;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                b2.r rVarD2 = z1.d(rVar6, 1.0f);
                v1 v1VarA2 = t1.a(h0.i.g(12), b2.b.K, g0Var, 54);
                int iHashCode3 = Long.hashCode(g0Var.T);
                m1 m1VarM3 = g0Var.m();
                b2.r rVarC3 = b2.a.c(rVarD2, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                b3.f fVar5 = b3.h.f;
                l1.q.I(v1VarA2, g0Var, fVar5);
                b3.f fVar6 = b3.h.e;
                l1.q.I(m1VarM3, g0Var, fVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode3);
                b3.f fVar7 = b3.h.g;
                l1.q.I(numValueOf2, g0Var, fVar7);
                b3.e eVar2 = b3.h.h;
                l1.q.E(g0Var, eVar2);
                b3.f fVar8 = b3.h.d;
                l1.q.I(rVarC3, g0Var, fVar8);
                z5 = z2;
                if (1.0f <= 0.0d) {
                    i0.a.a("invalid weight; must be greater than zero");
                }
                h0.c1 c1Var2 = new h0.c1(1.0f, true);
                z2.w0 w0VarD2 = h0.o.d(b2.b.A, false);
                int iHashCode4 = Long.hashCode(g0Var.T);
                m1 m1VarM4 = g0Var.m();
                b2.r rVarC4 = b2.a.c(c1Var2, g0Var);
                g0Var.g0();
                i6 = i8;
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD2, g0Var, fVar5);
                l1.q.I(m1VarM4, g0Var, fVar6);
                a1.b.v(iHashCode4, g0Var, fVar7, g0Var, eVar2);
                l1.q.I(rVarC4, g0Var, fVar8);
                f(uiState, rVar3, g0Var, (i6 & 14) | ((i6 >> 6) & 112), 0);
                g0Var.r(true);
                if (uiState.a != null) {
                    g0Var.c0(592324619);
                    lo.i iVar2 = uiState.y;
                    i7 = i6 & 112;
                    if (i7 == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objN = g0Var.N();
                    Object obj2 = l1.i.a;
                    if (z6) {
                        objN = new nz.k(6, onAction);
                        g0Var.n0(objN);
                    } else {
                        objN = new nz.k(6, onAction);
                        g0Var.n0(objN);
                    }
                    po.n.d(iVar2, (u00.a) objN, null, g0Var, 0);
                    if (z5) {
                        g0Var.c0(592538612);
                        if (i7 == 32) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        objN2 = g0Var.N();
                        if (z8) {
                            objN2 = new nz.k(7, onAction);
                            g0Var.n0(objN2);
                        } else {
                            objN2 = new nz.k(7, onAction);
                            g0Var.n0(objN2);
                        }
                        z7 = false;
                        po.n.e((u00.a) objN2, null, g0Var, 0);
                        g0Var.r(false);
                    } else {
                        z7 = false;
                        g0Var.c0(592699099);
                        g0Var.r(false);
                    }
                    g0Var.r(z7);
                } else {
                    g0Var.c0(592709019);
                    g0Var.r(false);
                }
                g0Var.r(true);
                z4 = z5;
                rVar4 = rVar3;
                rVar5 = rVar6;
            } else {
                g0Var.V();
                rVar4 = rVar3;
                z4 = z2;
                rVar5 = rVar;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new ct.w(uiState, onAction, rVar5, rVar4, z4, i, i2);
            }
        }
        i8 = i3 | 3456;
        rVar3 = rVar2;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                if (g0Var.h(z2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i8 |= i5;
            }
            if ((i8 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (g0Var.S(i8 & 1, z3)) {
                rVar6 = b2.o.A;
                if (i9 != 0) {
                    rVar3 = rVar6;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                b2.r rVarD3 = z1.d(rVar6, 1.0f);
                v1 v1VarA3 = t1.a(h0.i.g(12), b2.b.K, g0Var, 54);
                int iHashCode5 = Long.hashCode(g0Var.T);
                m1 m1VarM5 = g0Var.m();
                b2.r rVarC5 = b2.a.c(rVarD3, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                b3.f fVar9 = b3.h.f;
                l1.q.I(v1VarA3, g0Var, fVar9);
                b3.f fVar10 = b3.h.e;
                l1.q.I(m1VarM5, g0Var, fVar10);
                Integer numValueOf3 = Integer.valueOf(iHashCode5);
                b3.f fVar11 = b3.h.g;
                l1.q.I(numValueOf3, g0Var, fVar11);
                b3.e eVar3 = b3.h.h;
                l1.q.E(g0Var, eVar3);
                b3.f fVar12 = b3.h.d;
                l1.q.I(rVarC5, g0Var, fVar12);
                z5 = z2;
                if (1.0f <= 0.0d) {
                    i0.a.a("invalid weight; must be greater than zero");
                }
                h0.c1 c1Var3 = new h0.c1(1.0f, true);
                z2.w0 w0VarD3 = h0.o.d(b2.b.A, false);
                int iHashCode6 = Long.hashCode(g0Var.T);
                m1 m1VarM6 = g0Var.m();
                b2.r rVarC6 = b2.a.c(c1Var3, g0Var);
                g0Var.g0();
                i6 = i8;
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD3, g0Var, fVar9);
                l1.q.I(m1VarM6, g0Var, fVar10);
                a1.b.v(iHashCode6, g0Var, fVar11, g0Var, eVar3);
                l1.q.I(rVarC6, g0Var, fVar12);
                f(uiState, rVar3, g0Var, (i6 & 14) | ((i6 >> 6) & 112), 0);
                g0Var.r(true);
                if (uiState.a != null) {
                    g0Var.c0(592324619);
                    lo.i iVar3 = uiState.y;
                    i7 = i6 & 112;
                    if (i7 == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objN = g0Var.N();
                    Object obj3 = l1.i.a;
                    if (z6) {
                        objN = new nz.k(6, onAction);
                        g0Var.n0(objN);
                    } else {
                        objN = new nz.k(6, onAction);
                        g0Var.n0(objN);
                    }
                    po.n.d(iVar3, (u00.a) objN, null, g0Var, 0);
                    if (z5) {
                        g0Var.c0(592538612);
                        if (i7 == 32) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        objN2 = g0Var.N();
                        if (z8) {
                            objN2 = new nz.k(7, onAction);
                            g0Var.n0(objN2);
                        } else {
                            objN2 = new nz.k(7, onAction);
                            g0Var.n0(objN2);
                        }
                        z7 = false;
                        po.n.e((u00.a) objN2, null, g0Var, 0);
                        g0Var.r(false);
                    } else {
                        z7 = false;
                        g0Var.c0(592699099);
                        g0Var.r(false);
                    }
                    g0Var.r(z7);
                } else {
                    g0Var.c0(592709019);
                    g0Var.r(false);
                }
                g0Var.r(true);
                z4 = z5;
                rVar4 = rVar3;
                rVar5 = rVar6;
            } else {
                g0Var.V();
                rVar4 = rVar3;
                z4 = z2;
                rVar5 = rVar;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new ct.w(uiState, onAction, rVar5, rVar4, z4, i, i2);
            }
        }
        i8 |= 24576;
        z2 = z;
        if ((i8 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (g0Var.S(i8 & 1, z3)) {
            rVar6 = b2.o.A;
            if (i9 != 0) {
                rVar3 = rVar6;
            }
            if (i4 != 0) {
                z2 = false;
            }
            b2.r rVarD4 = z1.d(rVar6, 1.0f);
            v1 v1VarA4 = t1.a(h0.i.g(12), b2.b.K, g0Var, 54);
            int iHashCode7 = Long.hashCode(g0Var.T);
            m1 m1VarM7 = g0Var.m();
            b2.r rVarC7 = b2.a.c(rVarD4, g0Var);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar13 = b3.h.f;
            l1.q.I(v1VarA4, g0Var, fVar13);
            b3.f fVar14 = b3.h.e;
            l1.q.I(m1VarM7, g0Var, fVar14);
            Integer numValueOf4 = Integer.valueOf(iHashCode7);
            b3.f fVar15 = b3.h.g;
            l1.q.I(numValueOf4, g0Var, fVar15);
            b3.e eVar4 = b3.h.h;
            l1.q.E(g0Var, eVar4);
            b3.f fVar16 = b3.h.d;
            l1.q.I(rVarC7, g0Var, fVar16);
            z5 = z2;
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            h0.c1 c1Var4 = new h0.c1(1.0f, true);
            z2.w0 w0VarD4 = h0.o.d(b2.b.A, false);
            int iHashCode8 = Long.hashCode(g0Var.T);
            m1 m1VarM8 = g0Var.m();
            b2.r rVarC8 = b2.a.c(c1Var4, g0Var);
            g0Var.g0();
            i6 = i8;
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD4, g0Var, fVar13);
            l1.q.I(m1VarM8, g0Var, fVar14);
            a1.b.v(iHashCode8, g0Var, fVar15, g0Var, eVar4);
            l1.q.I(rVarC8, g0Var, fVar16);
            f(uiState, rVar3, g0Var, (i6 & 14) | ((i6 >> 6) & 112), 0);
            g0Var.r(true);
            if (uiState.a != null) {
                g0Var.c0(592324619);
                lo.i iVar4 = uiState.y;
                i7 = i6 & 112;
                if (i7 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objN = g0Var.N();
                Object obj4 = l1.i.a;
                if (z6) {
                    objN = new nz.k(6, onAction);
                    g0Var.n0(objN);
                } else {
                    objN = new nz.k(6, onAction);
                    g0Var.n0(objN);
                }
                po.n.d(iVar4, (u00.a) objN, null, g0Var, 0);
                if (z5) {
                    g0Var.c0(592538612);
                    if (i7 == 32) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    objN2 = g0Var.N();
                    if (z8) {
                        objN2 = new nz.k(7, onAction);
                        g0Var.n0(objN2);
                    } else {
                        objN2 = new nz.k(7, onAction);
                        g0Var.n0(objN2);
                    }
                    z7 = false;
                    po.n.e((u00.a) objN2, null, g0Var, 0);
                    g0Var.r(false);
                } else {
                    z7 = false;
                    g0Var.c0(592699099);
                    g0Var.r(false);
                }
                g0Var.r(z7);
            } else {
                g0Var.c0(592709019);
                g0Var.r(false);
            }
            g0Var.r(true);
            z4 = z5;
            rVar4 = rVar3;
            rVar5 = rVar6;
        } else {
            g0Var.V();
            rVar4 = rVar3;
            z4 = z2;
            rVar5 = rVar;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ct.w(uiState, onAction, rVar5, rVar4, z4, i, i2);
        }
    }

    public static final void h(z0 z0Var, u00.k kVar, jk.a aVar, b2.r rVar, l1.j jVar, int i) {
        l1.j jVar2;
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(469858625);
        int i2 = i | (jVar3.g(z0Var) ? 4 : 2) | (jVar3.i(kVar) ? 32 : 16) | (jVar3.i(aVar) ? 256 : 128) | (jVar3.g(rVar) ? 2048 : 1024);
        if (jVar3.S(i2 & 1, (i2 & 1171) != 1170)) {
            String strU = z3.U(jVar3, 2131886126);
            p0.e eVar = p0.f.a;
            b2.r rVarC = f2.h.c(z1.m(rVar, 48), eVar);
            boolean z = (i2 & 112) == 32;
            Object objN = jVar3.N();
            Object obj = l1.i.a;
            if (z || objN == obj) {
                objN = new nz.k(25, kVar);
                jVar3.n0(objN);
            }
            b2.r rVarN = w50.c.n(rVarC, true, (u00.a) objN);
            boolean zG = jVar3.g(strU);
            Object objN2 = jVar3.N();
            if (zG || objN2 == obj) {
                objN2 = new hb.u(strU, 18);
                jVar3.n0(objN2);
            }
            jVar2 = jVar3;
            w00.a.c(aVar, eVar, j3.q.c(rVarN, false, (u00.k) objN2), 0.0f, 0L, 0.0f, 0.0f, 0.0f, b2.b.E, v1.d.d(-380914175, new a1.w(z0Var, 12), jVar3), jVar2, ((i2 >> 6) & 14) | 905969664, 248);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new w0(z0Var, kVar, aVar, rVar, i, 1);
        }
    }

    public static final void i(final z0 z0Var, l1.j jVar, final int i) {
        r1 r1VarT;
        u00.n nVar;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-112580483);
        int i2 = (g0Var.g(z0Var) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            lo.e eVar = z0Var.a;
            if (eVar == null) {
                r1VarT = g0Var.t();
                if (r1VarT == null) {
                    return;
                }
                final int i3 = 0;
                nVar = new u00.n(z0Var, i, i3) {
                    public final int A;
                    public final z0 B;

                    {
                        this.A = i3;
                    }

                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = this.A;
                        l1.j jVar2 = (l1.j) obj;
                        ((Integer) obj2).getClass();
                        switch (i4) {
                            case 0:
                                o0.i(this.B, jVar2, l1.q.K(1));
                                break;
                            default:
                                o0.i(this.B, jVar2, l1.q.K(1));
                                break;
                        }
                        return g00.b0.a;
                    }
                };
            } else {
                float fV = v(z0Var.d, g0Var);
                float f = 12;
                Object objN = g0Var.N();
                Object obj = l1.i.a;
                if (objN == obj) {
                    objN = new lu.a(19);
                    g0Var.n0(objN);
                }
                b2.r rVarL = z2.d0.l(b2.o.A, (u00.o) objN);
                boolean zD = g0Var.d(fV);
                Object objN2 = g0Var.N();
                if (zD || objN2 == obj) {
                    objN2 = new cs.i(fV, 3);
                    g0Var.n0(objN2);
                }
                a10.h0.a(eVar, f2.h.c(i2.b0.p(rVarL, (u00.k) objN2), p0.f.a(f)), f, false, null, false, g0Var, 384, 56);
            }
            r1VarT.d = nVar;
        }
        g0Var.V();
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            final int i4 = 1;
            nVar = new u00.n(z0Var, i, i4) {
                public final int A;
                public final z0 B;

                {
                    this.A = i4;
                }

                @Override
                public final Object invoke(Object obj2, Object obj3) {
                    int i5 = this.A;
                    l1.j jVar2 = (l1.j) obj2;
                    ((Integer) obj3).getClass();
                    switch (i5) {
                        case 0:
                            o0.i(this.B, jVar2, l1.q.K(1));
                            break;
                        default:
                            o0.i(this.B, jVar2, l1.q.K(1));
                            break;
                    }
                    return g00.b0.a;
                }
            };
            r1VarT.d = nVar;
        }
    }

    public static final void j(final z0 z0Var, final u00.k kVar, final boolean z, final boolean z2, final u1 u1Var, final w.d0 d0Var, final k0 k0Var, final int i, l1.j jVar, final int i2) {
        int i3;
        l1.g0 g0Var;
        u1 u1Var2;
        w.d0 d0Var2;
        k0 k0Var2;
        b2.r rVar;
        boolean z3;
        boolean z4;
        l1.g0 g0Var2;
        l1.g0 g0Var3 = (l1.g0) jVar;
        g0Var3.e0(1664327049);
        if ((i2 & 6) == 0) {
            i3 = (g0Var3.g(z0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g0Var3.i(kVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g0Var3.h(true) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g0Var3.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g0Var3.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g0Var3.g(u1Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= g0Var3.i(d0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= g0Var3.i(k0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= g0Var3.e(i) ? 67108864 : 33554432;
        }
        int i4 = i3;
        if (g0Var3.S(i4 & 1, (i4 & 38347923) != 38347922)) {
            float fV = v(z0Var.d, g0Var3);
            h0.a0 a0Var = z1.c;
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var3, 0);
            int iHashCode = Long.hashCode(g0Var3.T);
            m1 m1VarM = g0Var3.m();
            b2.r rVarC = b2.a.c(a0Var, g0Var3);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var3.g0();
            if (g0Var3.S) {
                g0Var3.l(gVar);
            } else {
                g0Var3.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(vVarA, g0Var3, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var3, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var3, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var3, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var3, fVar4);
            b2.r rVar2 = b2.o.A;
            h0.c.h(z1.e(rVar2, 64), g0Var3);
            b2.r rVarD = z1.d(rVar2, 1.0f);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            b2.r rVarE = h0.c.E(rVarD.V(new h0.c1(1.0f, true)), 0.0f, z2 ? 0 : 16, 1);
            z2.w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode2 = Long.hashCode(g0Var3.T);
            m1 m1VarM2 = g0Var3.m();
            b2.r rVarC2 = b2.a.c(rVarE, g0Var3);
            g0Var3.g0();
            if (g0Var3.S) {
                g0Var3.l(gVar);
            } else {
                g0Var3.q0();
            }
            l1.q.I(w0VarD, g0Var3, fVar);
            l1.q.I(m1VarM2, g0Var3, fVar2);
            a1.b.v(iHashCode2, g0Var3, fVar3, g0Var3, eVar);
            l1.q.I(rVarC2, g0Var3, fVar4);
            if (z2) {
                g0Var3.c0(-1767045919);
                q(z0Var, kVar, a0Var, g0Var3, (i4 & 14) | 384 | (i4 & 112));
                g0Var3.r(false);
                u1Var2 = u1Var;
                d0Var2 = d0Var;
                k0Var2 = k0Var;
                g0Var2 = g0Var3;
                rVar = rVar2;
                z4 = true;
            } else {
                g0Var3.c0(-1766877031);
                lo.e eVar2 = z0Var.a;
                if (eVar2 == null) {
                    g0Var3.c0(-1766877032);
                    g0Var3.r(false);
                    u1Var2 = u1Var;
                    d0Var2 = d0Var;
                    k0Var2 = k0Var;
                    g0Var2 = g0Var3;
                    z3 = false;
                    rVar = rVar2;
                    z4 = true;
                } else {
                    g0Var3.c0(-1766877031);
                    float f = 12;
                    boolean zD = g0Var3.d(fV);
                    Object objN = g0Var3.N();
                    if (zD || objN == l1.i.a) {
                        objN = new i0(fV, 0);
                        g0Var3.n0(objN);
                    }
                    b2.r rVarL = z2.d0.l(rVar2, new c0.f((Object) null, (u00.a) objN, 15));
                    int i5 = i4 >> 15;
                    int i6 = (i5 & 14) | 3072 | (i5 & 112) | (i5 & 896);
                    u1Var2 = u1Var;
                    d0Var2 = d0Var;
                    k0Var2 = k0Var;
                    rVar = rVar2;
                    z3 = false;
                    z4 = true;
                    a10.h0.a(eVar2, f2.h.c(rVarL.V(w(u1Var2, d0Var2, k0Var2, 12, g0Var3, i6)), p0.f.a(f)), f, false, Integer.valueOf(i), false, g0Var3, ((i4 >> 12) & 57344) | 384, 40);
                    g0Var2 = g0Var3;
                    g0Var2.r(false);
                }
                g0Var2.r(z3);
            }
            g0Var2.r(z4);
            boolean z5 = z4;
            l1.g0 g0Var4 = g0Var2;
            g(z0Var, kVar, null, x(u1Var2, d0Var2, k0Var2, g0Var2, (i4 >> 15) & 1022), z, g0Var4, (57344 & (i4 << 3)) | (i4 & 126), 4);
            g0Var = g0Var4;
            h0.c.h(z1.e(rVar, h1.E.A), g0Var);
            g0Var.r(z5);
        } else {
            g0Var = g0Var3;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o0.j(z0Var, kVar, z, z2, u1Var, d0Var, k0Var, i, (l1.j) obj, l1.q.K(i2 | 1));
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void k(final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final u00.a aVar, final u00.a aVar2, final u00.a aVar3, l1.j jVar, final int i) {
        l1.g0 g0Var;
        float f;
        long jB;
        String strU;
        boolean zG;
        Object objN;
        long j;
        String strU2;
        boolean zG2;
        Object objN2;
        long jB2;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(-1788466573);
        int i2 = i | (g0Var2.h(z) ? 4 : 2) | (g0Var2.h(z2) ? 32 : 16) | (g0Var2.h(z3) ? 256 : 128) | (g0Var2.h(z4) ? 2048 : 1024) | (g0Var2.h(z5) ? 16384 : 8192) | (g0Var2.i(aVar) ? 131072 : 65536) | (g0Var2.i(aVar2) ? 1048576 : 524288) | (g0Var2.i(aVar3) ? 8388608 : 4194304);
        if (g0Var2.S(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean z6 = z && z2;
            if (z2) {
                f = z6 ? 1.0f : 0.7f;
            } else {
                f = 0.2f;
            }
            p2 p2VarB = x.d.b(f, (x.y) null, (String) null, g0Var2, 0, 30);
            b2.o oVar = b2.o.A;
            b2.r rVarD = z1.d(oVar, 1.0f);
            v1 v1VarA = t1.a(h0.i.g, b2.b.K, g0Var2, 54);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(rVarD, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(v1VarA, g0Var2, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var2, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var2, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var2, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var2, fVar4);
            String strU3 = z3.U(g0Var2, 2131886126);
            float f2 = 44;
            boolean z7 = z6;
            b2.r rVarO = w50.c.o(z1.m(oVar, f2), false, null, aVar, 7);
            boolean zG3 = g0Var2.g(strU3);
            Object objN3 = g0Var2.N();
            l1.c cVar = l1.i.a;
            if (zG3 || objN3 == cVar) {
                objN3 = new hb.u(strU3, 15);
                g0Var2.n0(objN3);
            }
            b2.r rVarC2 = j3.q.c(rVarO, false, (u00.k) objN3);
            z2.w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            m1 m1VarM2 = g0Var2.m();
            b2.r rVarC3 = b2.a.c(rVarC2, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(w0VarD, g0Var2, fVar);
            l1.q.I(m1VarM2, g0Var2, fVar2);
            a1.b.v(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
            l1.q.I(rVarC3, g0Var2, fVar4);
            b2.r rVarM = z1.m(oVar, 28);
            m2.b bVarR = y3.R(2131231091, g0Var2, 0);
            if (z4) {
                jB = dl.a.k;
            } else {
                if (z5) {
                    jB = dl.a.i;
                } else {
                    jB = i2.t.b(0.7f, dl.a.i);
                }
                o3.a(bVarR, (String) null, rVarM, jB, g0Var2, 440, 0);
                g0Var2.r(true);
                strU = z3.U(g0Var2, 2131886152);
                b2.r rVarM2 = z1.m(oVar, f2);
                zG = g0Var2.g(strU);
                objN = g0Var2.N();
                if (zG || objN == cVar) {
                    objN = new hb.u(strU, 16);
                    g0Var2.n0(objN);
                }
                b2.r rVarC4 = j3.q.c(rVarM2, false, (u00.k) objN);
                m2.b bVarR2 = y3.R(2131231393, g0Var2, 0);
                j = dl.a.i;
                gv.p.i(bVarR2, i2.t.b(((Number) p2VarB.getValue()).floatValue(), j), z7, aVar2, rVarC4, z2, 0.0f, 0.0f, 0L, g0Var2, 8 | ((i2 >> 9) & 7168) | ((i2 << 12) & 458752), 448);
                strU2 = z3.U(g0Var2, 2131886134);
                b2.r rVarM3 = z1.m(oVar, f2);
                zG2 = g0Var2.g(strU2);
                objN2 = g0Var2.N();
                if (zG2 || objN2 == cVar) {
                    objN2 = new hb.u(strU2, 17);
                    g0Var2.n0(objN2);
                }
                b2.r rVarC5 = j3.q.c(rVarM3, false, (u00.k) objN2);
                m2.b bVarR3 = y3.R(2131231206, g0Var2, 0);
                if (z3) {
                    jB2 = j;
                } else {
                    jB2 = i2.t.b(0.7f, j);
                }
                gv.p.i(bVarR3, jB2, z3, aVar3, rVarC5, false, 0.0f, 0.0f, 0L, g0Var2, 8 | (i2 & 896) | ((i2 >> 12) & 7168), 480);
                g0Var = g0Var2;
                g0Var.r(true);
            }
            o3.a(bVarR, (String) null, rVarM, jB, g0Var2, 440, 0);
            g0Var2.r(true);
            strU = z3.U(g0Var2, 2131886152);
            b2.r rVarM4 = z1.m(oVar, f2);
            zG = g0Var2.g(strU);
            objN = g0Var2.N();
            if (zG) {
                objN = new hb.u(strU, 16);
                g0Var2.n0(objN);
            } else {
                objN = new hb.u(strU, 16);
                g0Var2.n0(objN);
            }
            b2.r rVarC6 = j3.q.c(rVarM4, false, (u00.k) objN);
            m2.b bVarR4 = y3.R(2131231393, g0Var2, 0);
            j = dl.a.i;
            gv.p.i(bVarR4, i2.t.b(((Number) p2VarB.getValue()).floatValue(), j), z7, aVar2, rVarC6, z2, 0.0f, 0.0f, 0L, g0Var2, 8 | ((i2 >> 9) & 7168) | ((i2 << 12) & 458752), 448);
            strU2 = z3.U(g0Var2, 2131886134);
            b2.r rVarM5 = z1.m(oVar, f2);
            zG2 = g0Var2.g(strU2);
            objN2 = g0Var2.N();
            if (zG2) {
                objN2 = new hb.u(strU2, 17);
                g0Var2.n0(objN2);
            } else {
                objN2 = new hb.u(strU2, 17);
                g0Var2.n0(objN2);
            }
            b2.r rVarC7 = j3.q.c(rVarM5, false, (u00.k) objN2);
            m2.b bVarR5 = y3.R(2131231206, g0Var2, 0);
            if (z3) {
                jB2 = j;
            } else {
                jB2 = i2.t.b(0.7f, j);
            }
            gv.p.i(bVarR5, jB2, z3, aVar3, rVarC7, false, 0.0f, 0.0f, 0L, g0Var2, 8 | (i2 & 896) | ((i2 >> 12) & 7168), 480);
            g0Var = g0Var2;
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n(z, z2, z3, z4, z5, aVar, aVar2, aVar3, i) {
                public final boolean A;
                public final boolean B;
                public final boolean C;
                public final boolean D;
                public final boolean E;
                public final u00.a F;
                public final u00.a G;
                public final u00.a H;

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(1);
                    o0.k(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void l(jk.a aVar, b2.r rVar, v1.c cVar, l1.j jVar, int i) {
        int i2;
        l1.j jVar2;
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(-1195763430);
        if ((i & 6) == 0) {
            i2 = (jVar3.i(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= jVar3.g(rVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= jVar3.i(cVar) ? 256 : 128;
        }
        if (jVar3.S(i2 & 1, (i2 & 147) != 146)) {
            jVar2 = jVar3;
            w00.a.c(aVar, p0.f.a(32), z1.d(rVar, 1.0f), 0.0f, 0L, 0.0f, 0.0f, 0.0f, null, v1.d.d(-1785092646, new gv.r(cVar, 3), jVar3), jVar2, (i2 & 14) | 805306368, 504);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.f(i, 16, aVar, rVar, cVar);
        }
    }

    public static final void m(int i, b2.r rVar, l1.j jVar, z0 z0Var, u00.k kVar, boolean z) {
        b2.r rVar2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(256996247);
        int i2 = (g0Var.g(z0Var) ? 4 : 2) | i | (g0Var.i(kVar) ? 32 : 16) | (g0Var.h(z) ? 256 : 128) | (g0Var.g(rVar) ? 2048 : 1024);
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            rVar2 = rVar;
            h0.c.a(rVar2, (b2.d) null, false, v1.d.d(-1381992319, new u0(z, z0Var, kVar, 0), g0Var), g0Var, ((i2 >> 9) & 14) | 3072, 6);
        } else {
            rVar2 = rVar;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new m0(z0Var, kVar, z, rVar2, i);
        }
    }

    public static final void n(z0 z0Var, u00.k kVar, jk.a aVar, l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1253440647);
        int i2 = i | (g0Var.g(z0Var) ? 4 : 2) | (g0Var.i(kVar) ? 32 : 16) | (g0Var.i(aVar) ? 256 : 128);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            u30.b bVar = z0Var.n;
            boolean z = false;
            boolean z2 = z0Var.o;
            String str = z0Var.q;
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (z3 || objN == obj) {
                objN = new nz.k(28, kVar);
                g0Var.n0(objN);
            }
            u00.a aVar2 = (u00.a) objN;
            boolean z4 = i3 == 32;
            Object objN2 = g0Var.N();
            if (z4 || objN2 == obj) {
                objN2 = new nz.k(29, kVar);
                g0Var.n0(objN2);
            }
            u00.a aVar3 = (u00.a) objN2;
            if (i3 == 32) {
                z = true;
            }
            Object objN3 = g0Var.N();
            if (z || objN3 == obj) {
                objN3 = new lp.k(21, kVar);
                g0Var.n0(objN3);
            }
            po.n.b(bVar, z2, str, aVar2, aVar3, (u00.k) objN3, null, false, aVar, g0Var, ((i2 << 18) & 234881024) | 12582912, 64);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b1.n(i, 24, z0Var, kVar, aVar);
        }
    }

    public static final void o(z0 z0Var, final u00.k kVar, final h1 h1Var, final boolean z, final boolean z2, b2.r rVar, l1.j jVar, final int i, final int i2) {
        final b2.r rVar2;
        int i3;
        z0 z0Var2 = z0Var;
        l1.j jVar2 = (l1.g0) jVar;
        jVar2.e0(-638872558);
        int i4 = i | (jVar2.g(z0Var2) ? 4 : 2) | (jVar2.i(kVar) ? 32 : 16) | (jVar2.h(z2) ? 16384 : 8192);
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 = i4 | 196608;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i3 = i4 | (jVar2.g(rVar2) ? 131072 : 65536);
        }
        int i6 = i3;
        if (jVar2.S(i6 & 1, (74899 & i6) != 74898)) {
            b2.r rVar3 = b2.o.A;
            b2.r rVar4 = i5 != 0 ? rVar3 : rVar2;
            b2.r rVarD = z1.d(rVar4, 1.0f);
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.M, jVar2, 0);
            int iHashCode = Long.hashCode(((l1.g0) jVar2).T);
            m1 m1VarM = jVar2.m();
            b2.r rVarC = b2.a.c(rVarD, jVar2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            jVar2.g0();
            if (((l1.g0) jVar2).S) {
                jVar2.l(gVar);
            } else {
                jVar2.q0();
            }
            l1.q.I(vVarA, jVar2, b3.h.f);
            l1.q.I(m1VarM, jVar2, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), jVar2, b3.h.g);
            l1.q.E(jVar2, b3.h.h);
            l1.q.I(rVarC, jVar2, b3.h.d);
            if (z) {
                jVar2.c0(2146401126);
                g(z0Var2, kVar, null, null, z2, jVar2, i6 & 57470, 12);
                jVar2 = jVar2;
                h0.c.h(z1.e(rVar3, h1Var.A), jVar2);
                jVar2.r(false);
            } else {
                jVar2.c0(2146574106);
                jVar2.r(false);
            }
            boolean z3 = z0Var2.d;
            float f = z0Var2.g;
            ru.d dVar = z0Var2.h;
            boolean z4 = z0Var2.j;
            boolean z5 = z0Var2.k;
            int i7 = i6 & 112;
            boolean z6 = i7 == 32;
            Object objN = jVar2.N();
            Object obj = l1.i.a;
            if (z6 || objN == obj) {
                objN = new nz.k(8, r1);
                jVar2.n0(objN);
            }
            u00.a aVar = (u00.a) objN;
            boolean z7 = i7 == 32;
            Object objN2 = jVar2.N();
            if (z7 || objN2 == obj) {
                objN2 = new lp.k(14, r1);
                jVar2.n0(objN2);
            }
            u00.k kVar2 = (u00.k) objN2;
            boolean z8 = i7 == 32;
            Object objN3 = jVar2.N();
            if (z8 || objN3 == obj) {
                objN3 = new nz.k(13, r1);
                jVar2.n0(objN3);
            }
            u00.a aVar2 = (u00.a) objN3;
            boolean z9 = i7 == 32;
            Object objN4 = jVar2.N();
            if (z9 || objN4 == obj) {
                objN4 = new nz.k(14, r1);
                jVar2.n0(objN4);
            }
            u00.a aVar3 = (u00.a) objN4;
            boolean z11 = i7 == 32;
            Object objN5 = jVar2.N();
            if (z11 || objN5 == obj) {
                objN5 = new nz.k(15, r1);
                jVar2.n0(objN5);
            }
            u00.a aVar4 = (u00.a) objN5;
            boolean z12 = i7 == 32;
            Object objN6 = jVar2.N();
            if (z12 || objN6 == obj) {
                objN6 = new nz.k(16, r1);
                jVar2.n0(objN6);
            }
            u00.a aVar5 = (u00.a) objN6;
            boolean z13 = i7 == 32;
            Object objN7 = jVar2.N();
            if (z13 || objN7 == obj) {
                objN7 = new lp.k(15, r1);
                jVar2.n0(objN7);
            }
            u00.k kVar3 = (u00.k) objN7;
            boolean z14 = i7 == 32;
            Object objN8 = jVar2.N();
            if (z14 || objN8 == obj) {
                objN8 = new nz.k(17, r1);
                jVar2.n0(objN8);
            }
            u00.a aVar6 = (u00.a) objN8;
            boolean z15 = z0Var2.l;
            boolean z16 = i7 == 32;
            Object objN9 = jVar2.N();
            if (z16 || objN9 == obj) {
                objN9 = new nz.k(18, r1);
                jVar2.n0(objN9);
            }
            u00.a aVar7 = (u00.a) objN9;
            boolean z17 = i7 == 32;
            Object objN10 = jVar2.N();
            if (z17 || objN10 == obj) {
                objN10 = new nz.k(19, r1);
                jVar2.n0(objN10);
            }
            b2.r rVar5 = rVar4;
            po.n.c(z3, f, dVar, z4, z5, aVar, kVar2, aVar2, aVar3, aVar4, aVar5, kVar3, aVar6, null, z2, z15, aVar7, (u00.a) objN10, jVar2, 0, i6 & 57344, 8192);
            h0.c.h(z1.e(rVar3, h1Var.B), jVar2);
            n1 n1Var = z0Var2.e;
            Long l = z0Var2.f;
            boolean z18 = i7 == 32;
            Object objN11 = jVar2.N();
            if (z18 || objN11 == obj) {
                objN11 = new lp.k(13, r1);
                jVar2.n0(objN11);
            }
            po.h.a(n1Var, l, (u00.k) objN11, null, jVar2, 0);
            h0.c.h(z1.e(rVar3, h1Var.C), jVar2);
            boolean zB = z0Var2.b();
            boolean z19 = z0Var2.s;
            boolean z21 = z0Var2.m;
            boolean z22 = z0Var2.w;
            boolean z23 = z0Var2.x;
            boolean z24 = i7 == 32;
            Object objN12 = jVar2.N();
            if (z24 || objN12 == obj) {
                objN12 = new nz.k(9, r1);
                jVar2.n0(objN12);
            }
            u00.a aVar8 = (u00.a) objN12;
            boolean z25 = i7 == 32;
            Object objN13 = jVar2.N();
            if (z25 || objN13 == obj) {
                objN13 = new nz.k(10, r1);
                jVar2.n0(objN13);
            }
            u00.a aVar9 = (u00.a) objN13;
            boolean z26 = i7 == 32;
            Object objN14 = jVar2.N();
            if (z26 || objN14 == obj) {
                objN14 = new nz.k(11, kVar);
                jVar2.n0(objN14);
            }
            k(zB, z19, z21, z22, z23, aVar8, aVar9, (u00.a) objN14, jVar2, 0);
            h0.c.h(z1.e(rVar3, h1Var.D), jVar2);
            jVar2.r(true);
            rVar2 = rVar5;
        } else {
            z0Var2 = z0Var2;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            final z0 z0Var3 = z0Var2;
            r1VarT.d = new u00.n(kVar, h1Var, z, z2, rVar2, i, i2) {
                public final u00.k B;
                public final h1 C;
                public final boolean D;
                public final boolean E;
                public final b2.r F;
                public final int G;

                {
                    this.G = i2;
                }

                @Override
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iK = l1.q.K(3457);
                    o0.o(this.A, this.B, this.C, this.D, this.E, this.F, (l1.j) obj2, iK, this.G);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void p(z0 z0Var, u00.k kVar, jk.a aVar, b2.r rVar, boolean z, l1.j jVar, int i, int i2) {
        int i3;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1582308013);
        int i4 = i | (g0Var.g(z0Var) ? 4 : 2) | (g0Var.i(kVar) ? 32 : 16) | (g0Var.i(aVar) ? 256 : 128);
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 = i4 | 24576;
        } else {
            i3 = i4 | (g0Var.h(z) ? 16384 : 8192);
        }
        if (g0Var.S(i3 & 1, (i3 & 9363) != 9362)) {
            if (i5 != 0) {
                z = true;
            }
            l(aVar, rVar, v1.d.d(-1708059558, new u0(z, z0Var, kVar, 1), g0Var), g0Var, ((i3 >> 6) & 14) | 432);
        } else {
            g0Var.V();
        }
        boolean z2 = z;
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ct.r(z0Var, kVar, aVar, rVar, z2, i, i2);
        }
    }

    public static final void q(z0 z0Var, u00.k kVar, b2.r rVar, l1.j jVar, int i) {
        int i2;
        b2.r rVar2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(372410876);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(z0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(kVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            rVar2 = rVar;
            i2 |= g0Var.g(rVar2) ? 256 : 128;
        } else {
            rVar2 = rVar;
        }
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            lo.z zVar = z0Var.u;
            n1 n1Var = z0Var.e;
            boolean z = z0Var.d;
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (z2 || objN == obj) {
                objN = new lp.k(9, kVar);
                g0Var.n0(objN);
            }
            u00.k kVar2 = (u00.k) objN;
            boolean z3 = i3 == 32;
            Object objN2 = g0Var.N();
            if (z3 || objN2 == obj) {
                objN2 = new nz.k(2, kVar);
                g0Var.n0(objN2);
            }
            u00.a aVar = (u00.a) objN2;
            boolean z4 = i3 == 32;
            Object objN3 = g0Var.N();
            if (z4 || objN3 == obj) {
                objN3 = new lp.k(10, kVar);
                g0Var.n0(objN3);
            }
            u00.k kVar3 = (u00.k) objN3;
            boolean z5 = i3 == 32;
            Object objN4 = g0Var.N();
            if (z5 || objN4 == obj) {
                objN4 = new nz.k(3, kVar);
                g0Var.n0(objN4);
            }
            po.m.a(zVar, n1Var, z, kVar2, aVar, rVar2, kVar3, (u00.a) objN4, null, g0Var, (i2 << 9) & 458752, 256);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.f(z0Var, kVar, rVar, i, 15);
        }
    }

    public static final void r(z0 z0Var, u00.k kVar, u1 u1Var, w.d0 d0Var, k0 k0Var, int i, l1.j jVar, int i2) {
        int i3;
        u00.k kVar2;
        z0 z0Var2;
        u00.n nVar;
        b3.f fVar;
        u1 u1Var2 = u1Var;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(2015066458);
        if ((i2 & 6) == 0) {
            i3 = (g0Var.g(z0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g0Var.i(kVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g0Var.g(u1Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g0Var.i(d0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g0Var.i(k0Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g0Var.e(i) ? 131072 : 65536;
        }
        int i4 = i3;
        if (g0Var.S(i4 & 1, (74899 & i4) != 74898)) {
            h0.a0 a0Var = z1.c;
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var, 0);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(a0Var, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar2 = b3.h.f;
            l1.q.I(vVarA, g0Var, fVar2);
            u00.n nVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, nVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            b2.o oVar = b2.o.A;
            float f = 12;
            b2.r rVarG = h0.c.G(z1.d(oVar, 1.0f), 0.0f, 16, 0.0f, f, 5);
            v1 v1VarA = t1.a(h0.i.g(f), b2.b.K, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarG, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, fVar2);
            l1.q.I(m1VarM2, g0Var, nVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            lo.e eVar2 = z0Var.a;
            if (eVar2 == null) {
                g0Var.c0(1925883845);
                g0Var.r(false);
                nVar = nVar2;
                fVar = fVar3;
            } else {
                g0Var.c0(1925883846);
                float f2 = 8;
                int i5 = i4 >> 6;
                b2.r rVarC3 = f2.h.c(z1.m(w(u1Var, d0Var, k0Var, 8, g0Var, (i5 & 896) | (i5 & 14) | 3072 | (i5 & 112)), 56), p0.f.a(f2));
                g0Var = g0Var;
                nVar = nVar2;
                fVar = fVar3;
                a10.h0.a(eVar2, rVarC3, f2, false, Integer.valueOf(i), false, g0Var, ((i4 >> 3) & 57344) | 384, 40);
                g0Var.r(false);
            }
            double d = 1.0f;
            if (d <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            h0.c1 c1Var = new h0.c1(1.0f, true);
            z2.w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC4 = b2.a.c(c1Var, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, fVar2);
            l1.q.I(m1VarM3, g0Var, nVar);
            a1.b.v(iHashCode3, g0Var, fVar, g0Var, eVar);
            l1.q.I(rVarC4, g0Var, fVar4);
            u1Var2 = u1Var;
            z0Var2 = z0Var;
            f(z0Var2, x(u1Var2, d0Var, k0Var, g0Var, (i4 >> 6) & 1022), g0Var, i4 & 14, 0);
            g0Var.r(true);
            h0.c.h(z1.m(oVar, 36), g0Var);
            g0Var.r(true);
            b2.r rVarD = z1.d(oVar, 1.0f);
            if (d <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            kVar2 = kVar;
            q(z0Var2, kVar2, rVarD.V(new h0.c1(1.0f, true)), g0Var, i4 & 126);
            g0Var.r(true);
        } else {
            d0Var = d0Var;
            k0Var = k0Var;
            kVar2 = kVar;
            z0Var2 = z0Var;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new h0.e0(z0Var2, kVar2, u1Var2, d0Var, k0Var, i, i2);
        }
    }

    public static final void s(z0 z0Var, u00.k kVar, b2.r rVar, l1.j jVar, int i) {
        u00.n nVar;
        u00.a aVar;
        b3.e eVar;
        b3.f fVar;
        boolean z;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(446542671);
        int i2 = i | (g0Var.g(z0Var) ? 4 : 2) | (g0Var.i(kVar) ? 32 : 16) | (g0Var.g(rVar) ? 256 : 128);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            b2.r rVarG = h0.c.G(z1.e(z1.d(rVar, 1.0f), 72), 0.0f, 16, 0.0f, 0.0f, 13);
            v1 v1VarA = t1.a(h0.i.g(12), b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarG, g0Var);
            b3.i.c.getClass();
            u00.a aVar2 = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(aVar2);
            } else {
                g0Var.q0();
            }
            u00.n nVar2 = b3.h.f;
            l1.q.I(v1VarA, g0Var, nVar2);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar2 = b3.h.h;
            l1.q.E(g0Var, eVar2);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            lo.e eVar3 = z0Var.a;
            if (eVar3 == null) {
                g0Var.c0(359570548);
                g0Var.r(false);
                z = false;
                eVar = eVar2;
                fVar = fVar3;
                aVar = aVar2;
                nVar = nVar2;
            } else {
                g0Var.c0(359570549);
                float f = 8;
                nVar = nVar2;
                aVar = aVar2;
                eVar = eVar2;
                fVar = fVar3;
                z = false;
                a10.h0.a(eVar3, f2.h.c(z1.m(b2.o.A, 56), p0.f.a(f)), f, false, null, false, g0Var, 384, 56);
                g0Var.r(false);
            }
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            h0.c1 c1Var = new h0.c1(1.0f, true);
            z2.w0 w0VarD = h0.o.d(b2.b.A, z);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(c1Var, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(aVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, nVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            f(z0Var, null, g0Var, i2 & 14, 2);
            g0Var.r(true);
            u30.b bVar = z0Var.n;
            boolean z2 = z0Var.o;
            String str = z0Var.q;
            int i3 = i2 & 112;
            boolean z3 = i3 == 32 ? true : z;
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (z3 || objN == obj) {
                objN = new nz.k(26, kVar);
                g0Var.n0(objN);
            }
            u00.a aVar3 = (u00.a) objN;
            boolean z4 = i3 == 32 ? true : z;
            Object objN2 = g0Var.N();
            if (z4 || objN2 == obj) {
                objN2 = new nz.k(27, kVar);
                g0Var.n0(objN2);
            }
            u00.a aVar4 = (u00.a) objN2;
            if (i3 == 32) {
                z = true;
            }
            Object objN3 = g0Var.N();
            if (z || objN3 == obj) {
                objN3 = new lp.k(20, kVar);
                g0Var.n0(objN3);
            }
            po.n.b(bVar, z2, str, aVar3, aVar4, (u00.k) objN3, null, true, null, g0Var, 12582912, 320);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b1.n(i, 23, z0Var, kVar, rVar);
        }
    }

    public static final void t(z0 z0Var, u00.k kVar, kk.c cVar, float f, l1.j jVar, int i) {
        boolean z;
        l1.g0 g0Var;
        h0.s sVar;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(1383049661);
        int i2 = i | (g0Var2.g(z0Var) ? 4 : 2) | (g0Var2.i(kVar) ? 32 : 16) | (g0Var2.i(cVar) ? 256 : 128) | (g0Var2.d(f) ? 2048 : 1024);
        if (g0Var2.S(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zB = z0Var.b();
            float f2 = g0Var2.k(o1.n) == y3.m.B ? -1.0f : 1.0f;
            p2 p2VarB = x.d.b(zB ? 1.0f : 0.0f, x.c.w(RCHTTPStatusCodes.BAD_REQUEST, 0, x.x.a, 2), (String) null, g0Var2, 0, 28);
            h0.a0 a0Var = z1.c;
            b2.i iVar = b2.b.A;
            z2.w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(a0Var, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
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
            float f3 = 2;
            float fFloatValue = (1.0f - (((Number) p2VarB.getValue()).floatValue() / f3)) * f;
            b2.o oVar = b2.o.A;
            b2.r rVarC2 = z1.c(z1.q(oVar, fFloatValue), 1.0f);
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.N, g0Var2, 48);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            m1 m1VarM2 = g0Var2.m();
            b2.r rVarC3 = b2.a.c(rVarC2, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(vVarA, g0Var2, fVar);
            l1.q.I(m1VarM2, g0Var2, fVar2);
            a1.b.v(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
            l1.q.I(rVarC3, g0Var2, fVar4);
            b2.r rVarD = z1.d(oVar, 1.0f);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            b2.r rVarV = rVarD.V(new h0.c1(1.0f, true));
            float f4 = 32;
            float f5 = 24;
            b2.r rVarG = h0.c.G(rVarV, 0.0f, f4, 0.0f, f5, 5);
            b2.i iVar2 = b2.b.E;
            z2.w0 w0VarD2 = h0.o.d(iVar2, false);
            int iHashCode3 = Long.hashCode(g0Var2.T);
            m1 m1VarM3 = g0Var2.m();
            b2.r rVarC4 = b2.a.c(rVarG, g0Var2);
            g0Var2.g0();
            float f6 = f2;
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(w0VarD2, g0Var2, fVar);
            l1.q.I(m1VarM3, g0Var2, fVar2);
            a1.b.v(iHashCode3, g0Var2, fVar3, g0Var2, eVar);
            l1.q.I(rVarC4, g0Var2, fVar4);
            int i3 = i2 & 14;
            i(z0Var, g0Var2, i3);
            g0Var2.r(true);
            int i4 = i2 & 112;
            p(z0Var, kVar, cVar, z1.d(z1.s(oVar, 0.0f, av.j.b, 1), 1.0f), false, g0Var2, i3 | 3072 | i4 | (i2 & 896), 16);
            float f7 = 16;
            h0.c.h(z1.e(oVar, f7), g0Var2);
            b2.r rVarE = z1.e(z1.d(oVar, 1.0f), 48);
            z2.w0 w0VarD3 = h0.o.d(iVar2, false);
            int iHashCode4 = Long.hashCode(g0Var2.T);
            m1 m1VarM4 = g0Var2.m();
            b2.r rVarC5 = b2.a.c(rVarE, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(w0VarD3, g0Var2, fVar);
            l1.q.I(m1VarM4, g0Var2, fVar2);
            a1.b.v(iHashCode4, g0Var2, fVar3, g0Var2, eVar);
            l1.q.I(rVarC5, g0Var2, fVar4);
            b2.i iVar3 = b2.b.D;
            h0.s sVar2 = h0.s.a;
            int i5 = i2 & 1022;
            h(z0Var, kVar, cVar, sVar2.a(oVar, iVar3), g0Var2, i5);
            n(z0Var, kVar, cVar, g0Var2, i5);
            g0Var2.r(true);
            h0.c.h(z1.e(oVar, f7), g0Var2);
            g0Var2.r(true);
            if (((Number) p2VarB.getValue()).floatValue() > 0.0f) {
                g0Var2.c0(-25733950);
                b2.r rVarC6 = z1.c(z1.q(sVar2.a(oVar, b2.b.C), f / f3), 1.0f);
                boolean zG = g0Var2.g(p2VarB) | g0Var2.d(f6);
                Object objN = g0Var2.N();
                Object obj = l1.i.a;
                if (zG || objN == obj) {
                    objN = new s0(f6, p2VarB, 1);
                    g0Var2.n0(objN);
                }
                b2.r rVarG2 = h0.c.G(i2.b0.p(rVarC6, (u00.k) objN), f5, f4, 0.0f, 0.0f, 12);
                z2.w0 w0VarD4 = h0.o.d(iVar, false);
                int iHashCode5 = Long.hashCode(g0Var2.T);
                m1 m1VarM5 = g0Var2.m();
                b2.r rVarC7 = b2.a.c(rVarG2, g0Var2);
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                l1.q.I(w0VarD4, g0Var2, fVar);
                l1.q.I(m1VarM5, g0Var2, fVar2);
                a1.b.v(iHashCode5, g0Var2, fVar3, g0Var2, eVar);
                l1.q.I(rVarC7, g0Var2, fVar4);
                lo.z zVar = z0Var.u;
                n1 n1Var = z0Var.e;
                boolean z2 = z0Var.d;
                boolean z3 = i4 == 32;
                Object objN2 = g0Var2.N();
                if (z3 || objN2 == obj) {
                    objN2 = new lp.k(19, kVar);
                    g0Var2.n0(objN2);
                }
                u00.k kVar2 = (u00.k) objN2;
                boolean z4 = i4 == 32;
                Object objN3 = g0Var2.N();
                if (z4 || objN3 == obj) {
                    objN3 = new nz.k(24, kVar);
                    g0Var2.n0(objN3);
                }
                sVar = sVar2;
                po.m.a(zVar, n1Var, z2, kVar2, (u00.a) objN3, a0Var, null, null, null, g0Var2, 196608, 448);
                g0Var = g0Var2;
                z = true;
                g0Var.r(true);
                g0Var.r(false);
            } else {
                z = true;
                g0Var = g0Var2;
                sVar = sVar2;
                g0Var.c0(-24691265);
                g0Var.r(false);
            }
            b2.r rVarG3 = h0.c.G(sVar.a(oVar, b2.b.I), 0.0f, 0.0f, 0.0f, (8 / f3) + f7, 7);
            g0Var2 = g0Var;
            a(z0Var, kVar, cVar, rVarG3, g0Var2, i5);
            g0Var2.r(z);
        } else {
            g0Var2.V();
        }
        r1 r1VarT = g0Var2.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.g(z0Var, kVar, cVar, f, i);
        }
    }

    public static final void u(z0 z0Var, u00.k kVar, kk.c cVar, u00.a awayFraction, l1.j jVar, int i) {
        b2.r rVar;
        u00.n nVar;
        b2.r rVar2;
        l1.g0 g0Var;
        float f;
        ?? r15;
        Object obj;
        u00.k kVar2;
        z0 z0Var2 = z0Var;
        u00.k kVar3 = kVar;
        b2.i iVar = b2.b.B;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(-575136405);
        int i2 = i | (g0Var2.g(z0Var2) ? 4 : 2) | (g0Var2.i(kVar3) ? 32 : 16) | (g0Var2.i(cVar) ? 256 : 128) | (g0Var2.i(awayFraction) ? 2048 : 1024);
        if (g0Var2.S(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zB = z0Var2.b();
            p2 p2VarB = x.d.b(zB ? 1.0f : 0.0f, x.c.w(350, 0, x.x.a, 2), (String) null, g0Var2, 0, 28);
            kk.c cVarD = kk.e.d(g0Var2);
            kk.b bVarC = kk.e.c(cVar, cVarD, g0Var2, (i2 >> 6) & 14);
            y3.c cVar2 = (y3.c) g0Var2.k(o1.h);
            Object objN = g0Var2.N();
            l1.c cVar3 = l1.i.a;
            if (objN == cVar3) {
                objN = x5.s(0, g0Var2);
            }
            l1.z0 z0Var3 = (l1.z0) objN;
            b2.r rVar3 = z1.c;
            b2.i iVar2 = b2.b.A;
            z2.w0 w0VarD = h0.o.d(iVar2, false);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(rVar3, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(w0VarD, g0Var2, fVar);
            u00.n nVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var2, nVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar2 = b3.h.g;
            l1.q.I(numValueOf, g0Var2, fVar2);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var2, eVar);
            b3.f fVar3 = b3.h.d;
            l1.q.I(rVarC, g0Var2, fVar3);
            float fFloatValue = ((Number) p2VarB.getValue()).floatValue();
            b2.r rVar4 = b2.o.A;
            h0.s sVar = h0.s.a;
            if (fFloatValue > 0.0f) {
                g0Var2.c0(-826237872);
                b2.r rVarL = z2.d0.l(sVar.a(rVar4, iVar), new lu.a(18));
                float f2 = 12;
                b2.r rVarA = kk.e.a(f2.h.d(h0.c.G(z1.s(rVarL, 0.0f, (2 * f2) + 560, 1).V(rVar3), 0.0f, 72 + 8, 0.0f, 0.0f, 13)), cVarD);
                boolean zG = g0Var2.g(p2VarB);
                Object objN2 = g0Var2.N();
                if (zG || objN2 == cVar3) {
                    objN2 = new k1(p2VarB, 4);
                    g0Var2.n0(objN2);
                }
                b2.r rVarP = i2.b0.p(rVarA, (u00.k) objN2);
                z2.w0 w0VarD2 = h0.o.d(iVar2, false);
                int iHashCode2 = Long.hashCode(g0Var2.T);
                m1 m1VarM2 = g0Var2.m();
                b2.r rVarC2 = b2.a.c(rVarP, g0Var2);
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                l1.q.I(w0VarD2, g0Var2, fVar);
                l1.q.I(m1VarM2, g0Var2, nVar2);
                a1.b.v(iHashCode2, g0Var2, fVar2, g0Var2, eVar);
                l1.q.I(rVarC2, g0Var2, fVar3);
                b2.r rVarE = h0.c.E(rVar3, f2, 0.0f, 2);
                z0Var2 = z0Var;
                lo.z zVar = z0Var2.u;
                n1 n1Var = z0Var2.e;
                boolean z = z0Var2.d;
                float f3 = 24;
                p1 p1VarG = h0.c.g(0.0f, f3, 0.0f, ((y3.f) z0Var3.getValue()).A + f3, 5);
                int i3 = i2 & 112;
                boolean z2 = i3 == 32;
                Object objN3 = g0Var2.N();
                if (z2 || objN3 == cVar3) {
                    kVar2 = kVar;
                    objN3 = new lp.k(22, kVar2);
                    g0Var2.n0(objN3);
                } else {
                    kVar2 = kVar;
                }
                u00.k kVar4 = (u00.k) objN3;
                boolean z3 = i3 == 32;
                Object objN4 = g0Var2.N();
                if (z3 || objN4 == cVar3) {
                    objN4 = new y0(7, kVar2);
                    g0Var2.n0(objN4);
                }
                u00.a aVar = (u00.a) objN4;
                boolean z4 = i3 == 32;
                Object objN5 = g0Var2.N();
                if (z4 || objN5 == cVar3) {
                    objN5 = new lp.k(26, kVar2);
                    g0Var2.n0(objN5);
                }
                u00.k kVar5 = (u00.k) objN5;
                boolean z5 = i3 == 32;
                Object objN6 = g0Var2.N();
                if (z5 || objN6 == cVar3) {
                    objN6 = new y0(9, kVar2);
                    g0Var2.n0(objN6);
                }
                rVar2 = rVar4;
                rVar = rVar3;
                nVar = nVar2;
                po.m.a(zVar, n1Var, z, kVar4, aVar, rVarE, kVar5, (u00.a) objN6, p1VarG, g0Var2, 196608, 0);
                g0Var = g0Var2;
                g0Var.r(true);
                g0Var.r(false);
            } else {
                rVar = rVar3;
                nVar = nVar2;
                rVar2 = rVar4;
                g0Var = g0Var2;
                g0Var.c0(-824361039);
                g0Var.r(false);
            }
            b2.g gVar2 = b2.b.N;
            h0.d dVar = h0.i.c;
            h0.v vVarA = h0.u.a(dVar, gVar2, g0Var, 48);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC3 = b2.a.c(rVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, fVar);
            l1.q.I(m1VarM3, g0Var, nVar);
            a1.b.v(iHashCode3, g0Var, fVar2, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar3);
            b2.r rVarD = z1.d(rVar2, 1.0f);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            b2.r rVarG = h0.c.G(rVarD.V(new h0.c1(1.0f, true)), 0.0f, 32, 0.0f, 24, 5);
            boolean zG2 = g0Var.g(p2VarB);
            Object objN7 = g0Var.N();
            if (zG2 || objN7 == cVar3) {
                objN7 = new k1(p2VarB, 5);
                g0Var.n0(objN7);
            }
            b2.r rVarP2 = i2.b0.p(rVarG, (u00.k) objN7);
            b2.i iVar3 = b2.b.E;
            z2.w0 w0VarD3 = h0.o.d(iVar3, false);
            int iHashCode4 = Long.hashCode(g0Var.T);
            m1 m1VarM4 = g0Var.m();
            b2.r rVarC4 = b2.a.c(rVarP2, g0Var);
            g0Var.g0();
            p2 p2Var = p2VarB;
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD3, g0Var, fVar);
            l1.q.I(m1VarM4, g0Var, nVar);
            a1.b.v(iHashCode4, g0Var, fVar2, g0Var, eVar);
            l1.q.I(rVarC4, g0Var, fVar3);
            int i4 = r22 & 14;
            i(z0Var2, g0Var, i4);
            g0Var.r(true);
            boolean zG3 = g0Var.g(cVar2);
            Object objN8 = g0Var.N();
            if (zG3 || objN8 == cVar3) {
                objN8 = new as.f0(cVar2, z0Var3, 14);
                g0Var.n0(objN8);
            }
            b2.r rVarO = z2.d0.o(rVar2, (u00.k) objN8);
            kotlin.jvm.internal.m.e(rVarO, "<this>");
            kotlin.jvm.internal.m.e(awayFraction, "awayFraction");
            b2.r rVarL2 = z2.d0.l(i2.b0.p(rVarO, new ca.q(10, awayFraction)), new h1.x0(2, awayFraction));
            h0.v vVarA2 = h0.u.a(dVar, gVar2, g0Var, 48);
            int iHashCode5 = Long.hashCode(g0Var.T);
            m1 m1VarM5 = g0Var.m();
            b2.r rVarC5 = b2.a.c(rVarL2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA2, g0Var, fVar);
            l1.q.I(m1VarM5, g0Var, nVar);
            a1.b.v(iHashCode5, g0Var, fVar2, g0Var, eVar);
            l1.q.I(rVarC5, g0Var, fVar3);
            l1.g0 g0Var3 = g0Var;
            u00.n nVar3 = nVar;
            Object obj2 = cVar3;
            b2.r rVar5 = rVar2;
            p(z0Var, kVar, bVarC, z1.q(rVar2, av.j.b), !zB, g0Var3, i4 | 3072 | (r22 & 112), 0);
            g0Var2 = g0Var3;
            float f4 = 16;
            h0.c.h(z1.e(rVar5, f4), g0Var2);
            b2.r rVarE2 = z1.e(z1.d(rVar5, 1.0f), 48);
            z2.w0 w0VarD4 = h0.o.d(iVar3, false);
            int iHashCode6 = Long.hashCode(g0Var2.T);
            m1 m1VarM6 = g0Var2.m();
            b2.r rVarC6 = b2.a.c(rVarE2, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(w0VarD4, g0Var2, fVar);
            l1.q.I(m1VarM6, g0Var2, nVar3);
            a1.b.v(iHashCode6, g0Var2, fVar2, g0Var2, eVar);
            l1.q.I(rVarC6, g0Var2, fVar3);
            b2.r rVarA2 = sVar.a(rVar5, b2.b.D);
            int i5 = i2 & 126;
            kVar3 = kVar;
            h(z0Var, kVar3, bVarC, rVarA2, g0Var2, i5);
            if (((Number) p2Var.getValue()).floatValue() < 1.0f) {
                g0Var2.c0(-417637850);
                boolean zG4 = g0Var2.g(p2Var);
                Object objN9 = g0Var2.N();
                if (zG4) {
                    f = f4;
                    obj = obj2;
                } else {
                    f = f4;
                    obj = obj2;
                    if (objN9 != obj) {
                        obj2 = obj;
                    }
                    b2.r rVarP3 = i2.b0.p(rVar5, (u00.k) objN9);
                    p2Var = p2Var;
                    z2.w0 w0VarD5 = h0.o.d(iVar2, false);
                    int iHashCode7 = Long.hashCode(g0Var2.T);
                    m1 m1VarM7 = g0Var2.m();
                    b2.r rVarC7 = b2.a.c(rVarP3, g0Var2);
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(w0VarD5, g0Var2, fVar);
                    l1.q.I(m1VarM7, g0Var2, nVar3);
                    a1.b.v(iHashCode7, g0Var2, fVar2, g0Var2, eVar);
                    l1.q.I(rVarC7, g0Var2, fVar3);
                    n(z0Var, kVar3, bVarC, g0Var2, i5);
                    r15 = 1;
                    g0Var2.r(true);
                    g0Var2.r(false);
                }
                obj2 = obj;
                objN9 = new k1(p2Var, 6);
                g0Var2.n0(objN9);
                b2.r rVarP4 = i2.b0.p(rVar5, (u00.k) objN9);
                p2Var = p2Var;
                z2.w0 w0VarD6 = h0.o.d(iVar2, false);
                int iHashCode8 = Long.hashCode(g0Var2.T);
                m1 m1VarM8 = g0Var2.m();
                b2.r rVarC8 = b2.a.c(rVarP4, g0Var2);
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                l1.q.I(w0VarD6, g0Var2, fVar);
                l1.q.I(m1VarM8, g0Var2, nVar3);
                a1.b.v(iHashCode8, g0Var2, fVar2, g0Var2, eVar);
                l1.q.I(rVarC8, g0Var2, fVar3);
                n(z0Var, kVar3, bVarC, g0Var2, i5);
                r15 = 1;
                g0Var2.r(true);
                g0Var2.r(false);
            } else {
                f = f4;
                r15 = 1;
                g0Var2.c0(-417398561);
                g0Var2.r(false);
            }
            a(z0Var, kVar3, bVarC, sVar.a(rVar5, b2.b.F), g0Var2, i5);
            g0Var2.r((boolean) r15);
            h0.c.h(z1.e(rVar5, f), g0Var2);
            g0Var2.r((boolean) r15);
            g0Var2.r((boolean) r15);
            if (((Number) p2Var.getValue()).floatValue() > 0.0f) {
                g0Var2.c0(-821691660);
                b2.r rVarS = z1.s(sVar.a(rVar5, iVar), 0.0f, 560, (int) r15);
                p2 p2Var2 = p2Var;
                boolean zG5 = g0Var2.g(p2Var2);
                Object objN10 = g0Var2.N();
                if (zG5 || objN10 == obj2) {
                    objN10 = new k1(p2Var2, 3);
                    g0Var2.n0(objN10);
                }
                s(z0Var, kVar3, i2.b0.p(rVarS, (u00.k) objN10), g0Var2, i5);
                g0Var2.r(false);
            } else {
                g0Var2.c0(-821264015);
                g0Var2.r(false);
            }
            g0Var2.r((boolean) r15);
        } else {
            g0Var2.V();
        }
        r1 r1VarT = g0Var2.t();
        if (r1VarT != null) {
            r1VarT.d = new dz.k((Object) z0Var, kVar3, (Object) cVar, (Object) awayFraction, i, 12);
        }
    }

    public static final float v(boolean z, l1.j jVar) {
        l1.g0 g0Var = (l1.g0) jVar;
        Object objN = g0Var.N();
        Object obj = l1.i.a;
        if (objN == obj) {
            objN = l1.q.z(Boolean.valueOf(z));
            g0Var.n0(objN);
        }
        l1.z0 z0Var = (l1.z0) objN;
        Boolean boolValueOf = Boolean.valueOf(z);
        boolean zH = g0Var.h(z);
        Object objN2 = g0Var.N();
        if (zH || objN2 == obj) {
            objN2 = new ml.a(z, z0Var, null, 1);
            g0Var.n0(objN2);
        }
        l1.q.i(boolValueOf, jVar, (u00.n) objN2);
        return ((Number) x.d.b(((Boolean) z0Var.getValue()).booleanValue() ? 1.0f : 0.76f, x.c.v(0.85f, 250.0f, (Object) null, 4), (String) null, jVar, 48, 28).getValue()).floatValue();
    }

    public static final b2.r w(u1 u1Var, w.d0 d0Var, k0 k0Var, int i, l1.j jVar, int i2) {
        u1Var.getClass();
        return u1.e(u1Var, u1.c("audio_story_player_cover", jVar), d0Var, k0Var, new s1(p0.f.a(i)), 56);
    }

    public static final b2.r x(u1 u1Var, w.d0 d0Var, k0 k0Var, l1.j jVar, int i) {
        u1Var.getClass();
        return u1.e(u1Var, u1.c("audio_story_player_titles", jVar), d0Var, k0Var, (s1) null, 120);
    }
}

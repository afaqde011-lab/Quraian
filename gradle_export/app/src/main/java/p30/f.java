package p30;

import a1.e1;
import a1.f2;
import a1.y1;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.DragEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b2.r;
import bt.m0;
import bv.i2;
import c3.o1;
import c3.w2;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import com.mchutov.quranify.reciters.presentation.screen.search.SearchReciterLauncher;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import d0.q1;
import d10.w1;
import du.n0;
import e30.v0;
import eu.z;
import g1.c8;
import g1.l0;
import g1.l7;
import g1.m6;
import g1.o3;
import g1.t4;
import g1.u4;
import g1.z6;
import h0.a0;
import h0.m2;
import h0.n1;
import h0.p1;
import h0.t0;
import h0.z1;
import hx.e0;
import hx.x;
import i2.o0;
import i2.t;
import i20.a1;
import i20.b0;
import i20.c1;
import i20.d0;
import i20.g1;
import i20.j0;
import i20.u0;
import i20.w0;
import i20.z0;
import j0.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException;
import kotlinx.serialization.SerializationException;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.q2;
import l1.r1;
import m0.s;
import m0.w;
import m3.c0;
import m3.r0;
import p.d2;
import q3.u;
import ri.t1;
import s10.d1;
import s10.f1;
import s10.j1;
import s10.p0;
import s10.q0;
import s10.s0;
import s10.x0;
import v2.f0;
import w.e2;
import x.b1;
import x.k0;
import x.y;
import x.y0;
import z.h1;
import z.i1;
import z1.q;

public abstract class f implements o40.c, o40.a {
    public static h7.b a;

    public static final f1 A0(c1 c1Var, t10.i iVar) {
        int i = c1Var.D;
        int i2 = c1Var.E;
        k20.g gVar = iVar.a;
        f1 f1Var = new f1(i, gVar.getString(i2));
        h9.f fVar = iVar.b;
        y0(w50.c.k0(c1Var, fVar), iVar);
        u0 u0VarN0 = w50.c.n0(c1Var, fVar);
        if (u0VarN0 != null) {
            y0(u0VarN0, iVar);
        }
        if ((c1Var.C & 64) == 64) {
            i20.e eVar = c1Var.K;
            kotlin.jvm.internal.m.d(eVar, "getAnnotationParameterDefaultValue(...)");
            kh.o.K(eVar, gVar);
        }
        Iterator it = iVar.h.iterator();
        while (it.hasNext()) {
            ((w10.d) ((u10.l) it.next())).getClass();
            List<i20.h> list = c1Var.J;
            kotlin.jvm.internal.m.d(list, "getAnnotationList(...)");
            for (i20.h hVar : list) {
                kotlin.jvm.internal.m.b(hVar);
                f1Var.b.add(kh.o.J(hVar, gVar));
            }
        }
        return f1Var;
    }

    public static final int B0(boolean z, k0.p pVar, int i) {
        return z ? ((k0.q) pVar.m.get(i)).u : ((k0.q) pVar.m.get(i)).v;
    }

    public static final void C0(s0 s0Var, List list, List list2, List list3, t10.i iVar) {
        ArrayList arrayListE = s0Var.e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayListE.add(w0((b0) it.next(), iVar));
        }
        ArrayList arrayListD = s0Var.d();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayListD.add(x0((j0) it2.next(), iVar));
        }
        ArrayList arrayListF = s0Var.f();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            w0 w0Var = (w0) it3.next();
            s10.c1 c1Var = new s10.c1(w0Var.D, iVar.a.getString(w0Var.E));
            List list4 = w0Var.F;
            kotlin.jvm.internal.m.d(list4, "getTypeParameterList(...)");
            t10.i iVarB = iVar.b(list4);
            h9.f fVar = iVarB.b;
            List<z0> list5 = w0Var.F;
            kotlin.jvm.internal.m.d(list5, "getTypeParameterList(...)");
            for (z0 z0Var : list5) {
                kotlin.jvm.internal.m.b(z0Var);
                c1Var.b.add(z0(z0Var, iVarB));
            }
            y0(w50.c.l0(w0Var, fVar), iVarB);
            y0(w50.c.E(w0Var, fVar), iVarB);
            List<i20.h> list6 = w0Var.K;
            kotlin.jvm.internal.m.d(list6, "getAnnotationList(...)");
            for (i20.h hVar : list6) {
                kotlin.jvm.internal.m.b(hVar);
                c1Var.c.add(kh.o.J(hVar, iVarB.a));
            }
            List<Integer> list7 = w0Var.L;
            kotlin.jvm.internal.m.d(list7, "getVersionRequirementList(...)");
            for (Integer num : list7) {
                kotlin.jvm.internal.m.b(num);
                c1Var.d.add(n0(num.intValue(), iVarB));
            }
            Iterator it4 = iVarB.h.iterator();
            while (it4.hasNext()) {
                ((w10.d) ((u10.l) it4.next())).getClass();
            }
            arrayListF.add(c1Var);
        }
    }

    public static final void F(final x xVar, final v vVar, final u00.k kVar, l1.j jVar, int i) {
        l1.j jVar2;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(-793646567);
        int i2 = i | (jVar3.g(xVar) ? 4 : 2) | (jVar3.g(vVar) ? 32 : 16) | (jVar3.i(kVar) ? 256 : 128);
        if (jVar3.S(i2 & 1, (i2 & 147) != 146)) {
            final n1 n1Var = (n1) jVar3.k(dq.l.a);
            WeakHashMap weakHashMap = m2.w;
            final t0 t0VarL = h0.c.l(h0.b.e(jVar3).g, jVar3);
            final gm.a aVar = (gm.a) jVar3.k(dl.e.a);
            j1.r rVarD = j1.k.d(jVar3);
            final float f = aVar != gm.a.A ? 24 : 16;
            a0 a0Var = z1.c;
            boolean z = xVar.a;
            boolean z2 = (i2 & 896) == 256;
            Object objN = jVar3.N();
            if (z2 || objN == l1.i.a) {
                objN = new gv.a0(18, kVar);
                jVar3.n0(objN);
            }
            final int i3 = 0;
            jVar2 = jVar3;
            j1.k.b(z, (u00.a) objN, a0Var, rVarD, (b2.d) null, v1.d.d(1839501536, new m0(xVar, aVar, t0VarL, n1Var, rVarD), jVar3), v1.d.d(-744187393, new u00.o() {
                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z3;
                    Object eVar;
                    u00.k kVar2;
                    Object obj4;
                    g0 g0Var;
                    a40.z zVar;
                    boolean z4;
                    b2.r rVar;
                    int i4;
                    switch (i3) {
                        case 0:
                            n1 n1Var2 = (n1) n1Var;
                            t0 t0Var = (t0) t0VarL;
                            j0.v vVar2 = (j0.v) vVar;
                            gm.a aVar2 = (gm.a) aVar;
                            x xVar2 = (x) xVar;
                            h0.r PullToRefreshBox = (h0.r) obj;
                            g0 g0Var2 = (l1.j) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            kotlin.jvm.internal.m.e(PullToRefreshBox, "$this$PullToRefreshBox");
                            g0 g0Var3 = g0Var2;
                            if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                h0.a0 a0Var2 = z1.c;
                                p1 p1VarG = h0.c.g(0.0f, t0Var.c() + n1Var2.c() + 12, 0.0f, t0Var.a() + n1Var2.a() + 32, 5);
                                h0.f fVarG = h0.i.g(8);
                                boolean zE = g0Var3.e(aVar2.ordinal());
                                float f2 = f;
                                boolean zD = zE | g0Var3.d(f2);
                                u00.k kVar3 = kVar;
                                boolean zG = zD | g0Var3.g(kVar3) | g0Var3.g(xVar2);
                                Object objN2 = g0Var3.N();
                                if (zG || objN2 == l1.i.a) {
                                    objN2 = new fy.t(xVar2, aVar2, f2, kVar3);
                                    g0Var3.n0(objN2);
                                }
                                k00.f.d(a0Var2, vVar2, p1VarG, fVarG, null, null, false, null, (u00.k) objN2, g0Var2, 24582, 488);
                            } else {
                                g0Var3.V();
                            }
                            break;
                        default:
                            u00.a aVar3 = (u00.a) n1Var;
                            kk.c cVar = (kk.c) t0VarL;
                            jk.a aVar4 = (jk.a) vVar;
                            final z00.a aVar5 = (z00.a) aVar;
                            final u00.k kVar4 = (u00.k) xVar;
                            h0.t BoxWithConstraints = (h0.t) obj;
                            g0 g0Var4 = (l1.j) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            kotlin.jvm.internal.m.e(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= g0Var4.g(BoxWithConstraints) ? 4 : 2;
                            }
                            g0 g0Var5 = g0Var4;
                            if (g0Var5.S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                final int iH = y3.a.h(BoxWithConstraints.b);
                                final boolean z5 = g0Var5.k(o1.n) == y3.m.A;
                                Object objN3 = g0Var5.N();
                                Object obj5 = l1.i.a;
                                if (objN3 == obj5) {
                                    objN3 = l1.q.o(g0Var4);
                                    g0Var5.n0(objN3);
                                }
                                a40.z zVar2 = (a40.z) objN3;
                                Object objN4 = g0Var5.N();
                                if (objN4 == obj5) {
                                    objN4 = l1.q.z(Boolean.FALSE);
                                    g0Var5.n0(objN4);
                                }
                                final l1.z0 z0Var = (l1.z0) objN4;
                                boolean zG2 = g0Var5.g(zVar2);
                                Object objN5 = g0Var5.N();
                                if (zG2 || objN5 == obj5) {
                                    z3 = z5;
                                    kVar2 = kVar4;
                                    obj4 = obj5;
                                    g0Var = g0Var5;
                                    eVar = new tm.e(zVar2, ((Number) aVar3.invoke()).floatValue(), aVar5, f, 1.5f, new qs.c(23), new pp.e(kVar, z0Var, 1), new u00.o() {
                                        @Override
                                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                            tm.e DampedDragAnimation = (tm.e) obj6;
                                            h2.b bVar = (h2.b) obj8;
                                            kotlin.jvm.internal.m.e(DampedDragAnimation, "$this$DampedDragAnimation");
                                            l1.z0 z0Var2 = z0Var;
                                            if (!((Boolean) z0Var2.getValue()).booleanValue()) {
                                                z0Var2.setValue(Boolean.valueOf(!(Float.intBitsToFloat((int) (bVar.a >> 32)) == 0.0f)));
                                            }
                                            z00.a aVar6 = aVar5;
                                            float fIntBitsToFloat = (Float.intBitsToFloat((int) (bVar.a >> 32)) / iH) * (aVar6.B - aVar6.A);
                                            kVar4.invoke(Float.valueOf(z5 ? ((Number) ab.a0.D(Float.valueOf(DampedDragAnimation.d() + fIntBitsToFloat), aVar6)).floatValue() : ((Number) ab.a0.D(Float.valueOf(DampedDragAnimation.d() - fIntBitsToFloat), aVar6)).floatValue()));
                                            return g00.b0.a;
                                        }
                                    });
                                    zVar = zVar2;
                                    aVar5 = aVar5;
                                    g0Var.n0(eVar);
                                } else {
                                    kVar2 = kVar4;
                                    z3 = z5;
                                    eVar = objN5;
                                    g0Var = g0Var5;
                                    obj4 = obj5;
                                    zVar = zVar2;
                                }
                                tm.e eVar2 = (tm.e) eVar;
                                boolean zG3 = g0Var.g(aVar3) | g0Var.i(eVar2);
                                Object objN6 = g0Var.N();
                                if (zG3 || objN6 == obj4) {
                                    objN6 = new rm.c(aVar3, eVar2, null, 6);
                                    g0Var.n0(objN6);
                                }
                                l1.q.i(eVar2, g0Var4, (u00.n) objN6);
                                b2.o oVar = b2.o.A;
                                b2.r rVarA = kk.e.a(oVar, cVar);
                                z2.w0 w0VarD = h0.o.d(b2.b.A, false);
                                int iHashCode = Long.hashCode(g0Var.T);
                                m1 m1VarM = g0Var.m();
                                b2.r rVarC = b2.a.c(rVarA, g0Var4);
                                b3.i.c.getClass();
                                b3.g gVar = b3.h.b;
                                g0Var.g0();
                                if (g0Var.S) {
                                    g0Var.l(gVar);
                                } else {
                                    g0Var.q0();
                                }
                                l1.q.I(w0VarD, g0Var4, b3.h.f);
                                l1.q.I(m1VarM, g0Var4, b3.h.e);
                                l1.q.I(Integer.valueOf(iHashCode), g0Var4, b3.h.g);
                                l1.q.E(g0Var4, b3.h.h);
                                l1.q.I(rVarC, g0Var4, b3.h.d);
                                ok.c cVar2 = ok.e.b;
                                b2.r rVarC2 = f2.h.c(oVar, cVar2);
                                long jB = i2.t.b(0.5f, dl.a.J);
                                o0 o0Var = i2.b0.b;
                                b2.r rVarF = z.n.f(rVarC2, jB, o0Var);
                                u00.k kVar5 = kVar2;
                                boolean zG4 = g0Var.g(aVar5) | g0Var.e(iH) | g0Var.h(z3) | g0Var.i(eVar2) | g0Var.g(kVar5);
                                Object objN7 = g0Var.N();
                                if (zG4 || objN7 == obj4) {
                                    z4 = z3;
                                    rVar = rVarF;
                                    i4 = iH;
                                    sm.a0 a0Var3 = new sm.a0(aVar5, i4, z4, eVar2, kVar5);
                                    g0Var.n0(a0Var3);
                                    objN7 = a0Var3;
                                } else {
                                    z4 = z3;
                                    i4 = iH;
                                    rVar = rVarF;
                                }
                                h0.o.a(z1.d(z1.e(f0.b(rVar, zVar, (PointerInputEventHandler) objN7), 6.0f), 1.0f), g0Var4, 0);
                                b2.r rVarE = z1.e(z.n.f(f2.h.c(oVar, cVar2), dl.a.k, o0Var), 6.0f);
                                boolean zI = g0Var.i(eVar2);
                                Object objN8 = g0Var.N();
                                if (zI || objN8 == obj4) {
                                    objN8 = new a1.w(eVar2, 17);
                                    g0Var.n0(objN8);
                                }
                                h0.o.a(z2.d0.l(rVarE, (u00.o) objN8), g0Var4, 0);
                                g0Var.r(true);
                                boolean zE2 = g0Var.e(i4) | g0Var.i(eVar2) | g0Var.h(z4);
                                Object objN9 = g0Var.N();
                                if (zE2 || objN9 == obj4) {
                                    objN9 = new pl.i(i4, eVar2, z4);
                                    g0Var.n0(objN9);
                                }
                                b2.r rVarV = i2.b0.p(oVar, (u00.k) objN9).V(eVar2.t);
                                boolean zI2 = g0Var.i(eVar2);
                                Object objN10 = g0Var.N();
                                if (zI2 || objN10 == obj4) {
                                    objN10 = new sm.v(eVar2, 0);
                                    g0Var.n0(objN10);
                                }
                                kk.b bVarC = kk.e.c(aVar4, kk.e.b(cVar, (u00.n) objN10, g0Var4), g0Var4, 0);
                                Object objN11 = g0Var.N();
                                if (objN11 == obj4) {
                                    objN11 = new q50.b(20);
                                    g0Var.n0(objN11);
                                }
                                u00.a aVar6 = (u00.a) objN11;
                                boolean zI3 = g0Var.i(eVar2);
                                Object objN12 = g0Var.N();
                                if (zI3 || objN12 == obj4) {
                                    objN12 = new sm.e(eVar2, 5);
                                    g0Var.n0(objN12);
                                }
                                u00.k kVar6 = (u00.k) objN12;
                                boolean zI4 = g0Var.i(eVar2);
                                Object objN13 = g0Var.N();
                                if (zI4 || objN13 == obj4) {
                                    objN13 = new sm.b(eVar2, 5);
                                    g0Var.n0(objN13);
                                }
                                u00.a aVar7 = (u00.a) objN13;
                                Object objN14 = g0Var.N();
                                if (objN14 == obj4) {
                                    objN14 = new q50.b(21);
                                    g0Var.n0(objN14);
                                }
                                u00.a aVar8 = (u00.a) objN14;
                                boolean zI5 = g0Var.i(eVar2);
                                Object objN15 = g0Var.N();
                                if (zI5 || objN15 == obj4) {
                                    objN15 = new sm.b(eVar2, 6);
                                    g0Var.n0(objN15);
                                }
                                u00.a aVar9 = (u00.a) objN15;
                                boolean zI6 = g0Var.i(eVar2);
                                Object objN16 = g0Var.N();
                                if (zI6 || objN16 == obj4) {
                                    objN16 = new sm.e(eVar2, 6);
                                    g0Var.n0(objN16);
                                }
                                u00.k kVar7 = (u00.k) objN16;
                                boolean zI7 = g0Var.i(eVar2);
                                Object objN17 = g0Var.N();
                                if (zI7 || objN17 == obj4) {
                                    objN17 = new sm.e(eVar2, 7);
                                    g0Var.n0(objN17);
                                }
                                h0.o.a(z1.n(jk.d.b(rVarV, bVarC, aVar6, kVar6, aVar7, aVar8, aVar9, kVar7, (u00.k) objN17, 2944), 32.0f, 20.0f), g0Var4, 0);
                            } else {
                                g0Var5.V();
                            }
                            break;
                    }
                    return g00.b0.a;
                }
            }, jVar3), jVar2, 1769856);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new b1.n(i, 11, xVar, vVar, kVar);
        }
    }

    public static final void G(boolean z, u00.a aVar, u00.a aVar2, u00.a aVar3, l1.j jVar, int i) {
        l1.j jVar2;
        u00.a aVar4;
        u00.a aVar5;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(-2014454103);
        int i2 = i | (jVar3.h(false) ? 32 : 16) | (jVar3.h(z) ? 256 : 128) | (jVar3.i(aVar) ? 2048 : 1024) | (jVar3.i(aVar2) ? 16384 : 8192) | (jVar3.i(aVar3) ? 131072 : 65536);
        if (jVar3.S(i2 & 1, (74897 & i2) != 74896)) {
            m2.b bVarR = y3.R(2131231374, jVar3, 0);
            long j = dl.a.k;
            float f = 24;
            b2.o oVar = b2.o.A;
            o3.a(bVarR, (String) null, z1.m(h0.c.G(oVar, 0.0f, f, 0.0f, 0.0f, 13), 48), j, jVar3, 440, 0);
            z6.b(z3.U(jVar3, 2131887220), z1.d(h0.c.G(oVar, 0.0f, f, 0.0f, 0.0f, 13), 1.0f), j, kh.o.z(22), u.M, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(28), 0, false, 0, 0, (u00.k) null, (r0) null, jVar3, 1597488, 48, 258984);
            k00.f.a(z3.U(jVar3, 2131887219), z1.d(h0.c.G(oVar, 0.0f, 12, 0.0f, 0.0f, 13), 1.0f), t.b(0.7f, j), kh.o.z(16), new y3.o(kh.o.z(22)), u.B, new x3.k(3), 3, 0.0f, null, jVar3, 12807216, 768);
            b2.r rVarG = h0.c.G(oVar, 0.0f, f, 0.0f, 0.0f, 13);
            h0.d dVar = h0.i.c;
            b2.g gVar = b2.b.M;
            h0.v vVarA = h0.u.a(dVar, gVar, jVar3, 0);
            int iHashCode = Long.hashCode(((g0) jVar3).T);
            m1 m1VarM = jVar3.m();
            b2.r rVarC = b2.a.c(rVarG, jVar3);
            b3.i.c.getClass();
            b3.g gVar2 = b3.h.b;
            jVar3.g0();
            if (((g0) jVar3).S) {
                jVar3.l(gVar2);
            } else {
                jVar3.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(vVarA, jVar3, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, jVar3, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, jVar3, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(jVar3, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, jVar3, fVar4);
            String strU = z3.U(jVar3, 2131887213);
            int i3 = i2 & 112;
            boolean z2 = (i3 == 32) | ((i2 & 7168) == 2048);
            Object objN = jVar3.N();
            if (z2 || objN == l1.i.a) {
                objN = new ca.q(4, aVar);
                jVar3.n0(objN);
            }
            up.c.a(strU, z, (u00.k) objN, null, kh.o.z(14), kh.o.z(18), 0.0f, true, jVar3, ((i2 >> 3) & 112) | 12804096, 72);
            jVar2 = jVar3;
            b2.r rVarG2 = h0.c.G(oVar, 0.0f, 20, 0.0f, 0.0f, 13);
            float f2 = 16;
            h0.v vVarA2 = h0.u.a(h0.i.g(f2), gVar, jVar2, 6);
            int iHashCode2 = Long.hashCode(((g0) jVar2).T);
            m1 m1VarM2 = jVar2.m();
            b2.r rVarC2 = b2.a.c(rVarG2, jVar2);
            jVar2.g0();
            if (((g0) jVar2).S) {
                jVar2.l(gVar2);
            } else {
                jVar2.q0();
            }
            l1.q.I(vVarA2, jVar2, fVar);
            l1.q.I(m1VarM2, jVar2, fVar2);
            a1.b.v(iHashCode2, jVar2, fVar3, jVar2, eVar);
            l1.q.I(rVarC2, jVar2, fVar4);
            int i4 = i2 >> 6;
            aVar4 = aVar2;
            K(z, aVar4, jVar2, (i4 & 896) | (i4 & 14) | i3);
            b2.r rVarC3 = f2.h.c(z1.d(oVar, 1.0f), p0.f.a(32));
            long j2 = dl.a.i;
            aVar5 = aVar3;
            b2.r rVarE = h0.c.E(w50.c.n(z.n.f(rVarC3, t.b(0.15f, j2), i2.b0.b), true, aVar5), 0.0f, f2, 1);
            z2.w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode3 = Long.hashCode(((g0) jVar2).T);
            m1 m1VarM3 = jVar2.m();
            b2.r rVarC4 = b2.a.c(rVarE, jVar2);
            jVar2.g0();
            if (((g0) jVar2).S) {
                jVar2.l(gVar2);
            } else {
                jVar2.q0();
            }
            l1.q.I(w0VarD, jVar2, fVar);
            l1.q.I(m1VarM3, jVar2, fVar2);
            a1.b.v(iHashCode3, jVar2, fVar3, jVar2, eVar);
            l1.q.I(rVarC4, jVar2, fVar4);
            z6.b(z3.U(jVar2, 2131887214), (b2.r) null, j2, kh.o.z(16), u.C, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(20), 0, false, 0, 0, (u00.k) null, (r0) null, jVar2, 1597440, 48, 260010);
            x5.z(jVar2, true, true, true);
        } else {
            jVar2 = jVar3;
            aVar4 = aVar2;
            aVar5 = aVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new fz.a(z, aVar, aVar4, aVar5, i);
        }
    }

    public static final void H(boolean z, u00.a onDelete, u00.a onDismiss, l1.j jVar, int i) {
        l1.j jVar2;
        r1 r1VarT;
        z zVar;
        kotlin.jvm.internal.m.e(onDelete, "onDelete");
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(-1381368053);
        int i2 = i | (jVar3.h(z) ? 4 : 2) | (jVar3.h(false) ? 32 : 16) | (jVar3.i(onDelete) ? 256 : 128) | (jVar3.i(onDismiss) ? 2048 : 1024);
        if (jVar3.S(i2 & 1, (i2 & 1171) != 1170)) {
            if (z) {
                Object objN = jVar3.N();
                Object obj = l1.i.a;
                if (objN == obj) {
                    objN = l1.q.z(Boolean.FALSE);
                    jVar3.n0(objN);
                }
                l1.z0 z0Var = (l1.z0) objN;
                if (((Boolean) jVar3.k(tp.h.a)).booleanValue()) {
                    jVar3.c0(2041261726);
                    boolean zI = I(z0Var);
                    int i3 = i2 & 112;
                    boolean z2 = i3 == 32;
                    Object objN2 = jVar3.N();
                    if (z2 || objN2 == obj) {
                        objN2 = new ct.k(z0Var, 3);
                        jVar3.n0(objN2);
                    }
                    u00.a aVar = (u00.a) objN2;
                    boolean z3 = ((i2 & 896) == 256) | (i3 == 32);
                    Object objN3 = jVar3.N();
                    if (z3 || objN3 == obj) {
                        objN3 = new fz.d(onDelete, z0Var, 0);
                        jVar3.n0(objN3);
                    }
                    u00.a aVar2 = (u00.a) objN3;
                    boolean z4 = (i3 == 32) | ((i2 & 7168) == 2048);
                    Object objN4 = jVar3.N();
                    if (z4 || objN4 == obj) {
                        objN4 = new es.b(1, onDismiss);
                        jVar3.n0(objN4);
                    }
                    J(zI, aVar, aVar2, (u00.a) objN4, jVar3, (i2 >> 3) & 14);
                    jVar3.r(false);
                    r1VarT = jVar3.t();
                    if (r1VarT == null) {
                        return;
                    } else {
                        zVar = new z(z, onDelete, onDismiss, i, 4);
                    }
                } else {
                    jVar3.c0(2041624023);
                    jVar3.r(false);
                    int i4 = i2 & 112;
                    boolean z5 = i4 == 32;
                    Object objN5 = jVar3.N();
                    if (z5 || objN5 == obj) {
                        objN5 = new e6.c(16);
                        jVar3.n0(objN5);
                    }
                    m6 m6VarF = t4.f(true, (u00.k) objN5, jVar3, 6, 0);
                    Object objN6 = jVar3.N();
                    if (objN6 == obj) {
                        objN6 = l1.q.o(jVar3);
                        jVar3.n0(objN6);
                    }
                    a40.z zVar2 = (a40.z) objN6;
                    boolean zI2 = ((i2 & 7168) == 2048) | (i4 == 32) | jVar3.i(zVar2) | jVar3.g(m6VarF);
                    Object objN7 = jVar3.N();
                    if (zI2 || objN7 == obj) {
                        objN7 = new cz.c(zVar2, m6VarF, onDismiss, 4);
                        jVar3.n0(objN7);
                    }
                    u00.a aVar3 = (u00.a) objN7;
                    boolean zI3 = (i4 == 32) | jVar3.i(zVar2) | jVar3.g(m6VarF) | ((i2 & 896) == 256);
                    Object objN8 = jVar3.N();
                    if (zI3 || objN8 == obj) {
                        objN8 = new ct.m(zVar2, z0Var, m6VarF, onDelete);
                        jVar3.n0(objN8);
                    }
                    jVar2 = jVar3;
                    t4.a(aVar3, (b2.r) null, m6VarF, 0.0f, false, (i2.t0) null, dl.a.q, 0L, 0.0f, 0L, (u00.n) null, new fo.b(23, (byte) 0), (u4) null, v1.d.d(-238439063, new az.j((u00.a) objN8, aVar3, z0Var, 5), jVar3), jVar2, 0, 3078, 5050);
                }
            } else {
                r1VarT = jVar3.t();
                if (r1VarT == null) {
                    return;
                } else {
                    zVar = new z(z, onDelete, onDismiss, i, 2);
                }
            }
            r1VarT.d = zVar;
        }
        jVar2 = jVar3;
        jVar2.V();
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            zVar = new z(z, onDelete, onDismiss, i, 3);
            r1VarT.d = zVar;
        }
    }

    public static final boolean I(l1.z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final void J(boolean z, u00.a aVar, u00.a aVar2, u00.a aVar3, l1.j jVar, int i) {
        int i2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(619372261);
        if ((i & 6) == 0) {
            i2 = (g0Var.h(false) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.i(aVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= g0Var.i(aVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= g0Var.i(aVar3) ? 16384 : 8192;
        }
        if (g0Var.S(i2 & 1, (i2 & 9363) != 9362)) {
            qz.d.a(480, 640, aVar3, false, dl.a.q, false, v1.d.d(-969434193, new fz.a(z, aVar, aVar2, aVar3), g0Var), g0Var, ((i2 >> 6) & 896) | 1769526, 8);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new fz.b(z, aVar, aVar2, aVar3, i, 0);
        }
    }

    public static final void K(boolean z, u00.a aVar, l1.j jVar, int i) {
        int i2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-119915010);
        if ((i & 6) == 0) {
            i2 = (g0Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (g0Var.h(false) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= g0Var.i(aVar) ? 256 : 128;
        }
        if (g0Var.S(i3 & 1, (i3 & 147) != 146)) {
            b2.r rVarE = h0.c.E(w50.c.n(z.n.f(f2.h.c(z1.d(b2.o.A, 1.0f), p0.f.a(32)), t.b(z ? 1.0f : 0.6f, dl.a.i), i2.b0.b), z, aVar), 0.0f, 16, 1);
            z2.w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarE, g0Var);
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
            g0Var.c0(625753596);
            z6.b(z3.U(g0Var, 2131887212), (b2.r) null, t.b(z ? 1.0f : 0.5f, t.b), kh.o.z(16), u.C, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(20), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 260010);
            g0Var = g0Var;
            g0Var.r(false);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new fz.c(z, aVar, i, 0);
        }
    }

    public static final void L(float f, int i, int i2, b2.h hVar, b2.r rVar, e0.h hVar2, e0.o oVar, n1 n1Var, l1.j jVar, m0.g gVar, w wVar, u2.a aVar, v1.c cVar, h1 h1Var, boolean z) {
        b2.r rVar2;
        b2.h hVar3;
        int i3;
        boolean z2;
        l1.j jVar2;
        e0.h hVar4;
        e0.o oVar2;
        n1 n1Var2;
        m0.g gVar2;
        u2.a aVar2;
        h1 h1Var2;
        b2.h hVar5;
        float f2;
        r1 r1VarT;
        s sVar;
        x.t tVarA;
        b1 b1VarV;
        y3.m mVar;
        boolean zG;
        Object objN;
        boolean z3;
        Object objN2;
        e0.h hVar6;
        u2.a aVar3;
        e0.o oVar3;
        int i4;
        h1 h1VarB;
        m0.g gVar3;
        n1 n1Var3;
        float f3;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(1860873769);
        int i5 = (jVar3.g(wVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            rVar2 = rVar;
            i5 |= jVar3.g(rVar2) ? 32 : 16;
        } else {
            rVar2 = rVar;
        }
        int i6 = i5 | 3456;
        if ((i2 & 16) != 0) {
            i6 = i5 | 28032;
        } else if ((i & 24576) == 0) {
            i6 |= jVar3.e(0) ? 16384 : 8192;
        }
        int i7 = i6 | 196608;
        int i8 = i2 & 64;
        if (i8 == 0) {
            if ((1572864 & i) == 0) {
                hVar3 = hVar;
                i7 |= jVar3.g(hVar3) ? 1048576 : 524288;
            }
            i3 = i7 | 809500672;
            if ((306783379 & i3) == 306783378) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (jVar3.S(i3 & 1, z2)) {
                jVar3.X();
                if ((i & 1) != 0 || jVar3.A()) {
                    float f4 = 0;
                    n1 p1Var = new p1(f4, f4, f4, f4);
                    float f5 = 0;
                    if (i8 != 0) {
                        hVar3 = b2.b.K;
                    }
                    int i9 = 196608 | (i3 & 14);
                    sVar = new s();
                    tVarA = e2.a(jVar3);
                    h2.c cVar2 = x.z1.a;
                    b1VarV = x.c.v(0.0f, 400.0f, Float.valueOf(1), 1);
                    y3.c cVar3 = (y3.c) jVar3.k(o1.h);
                    mVar = (y3.m) jVar3.k(o1.n);
                    zG = ((((i9 & 14) ^ 6) <= 4 && jVar3.g(wVar)) || (i9 & 6) == 4) | jVar3.g(tVarA) | jVar3.g(b1VarV) | jVar3.g(sVar) | jVar3.g(cVar3) | jVar3.e(mVar.ordinal());
                    objN = jVar3.N();
                    l1.c cVar4 = l1.i.a;
                    if (zG || objN == cVar4) {
                        e0.c cVar5 = new e0.c(wVar, new c0.f(wVar, mVar, 12), sVar);
                        float f6 = e0.l.a;
                        e0.h hVar7 = new e0.h(cVar5, tVarA, b1VarV);
                        jVar3.n0(hVar7);
                        objN = hVar7;
                    }
                    e0.h hVar8 = (e0.h) objN;
                    int i11 = i3 & (-29360129);
                    q1 q1Var = q1.A;
                    int i12 = (i3 & 14) | 432;
                    z3 = (((i12 & 14) ^ 6) <= 4 && jVar3.g(wVar)) || (i12 & 6) == 4;
                    objN2 = jVar3.N();
                    if (z3 || objN2 == cVar4) {
                        objN2 = new m0.a(wVar);
                        jVar3.n0(objN2);
                    }
                    hVar6 = hVar8;
                    aVar3 = (m0.a) objN2;
                    oVar3 = e0.n.c;
                    i4 = i11;
                    h1VarB = i1.b(jVar3);
                    gVar3 = m0.g.a;
                    n1Var3 = p1Var;
                    f3 = f5;
                } else {
                    jVar3.V();
                    i4 = i3 & (-29360129);
                    f3 = f;
                    hVar6 = hVar2;
                    oVar3 = oVar;
                    n1Var3 = n1Var;
                    gVar3 = gVar;
                    aVar3 = aVar;
                    h1VarB = h1Var;
                }
                b2.h hVar9 = hVar3;
                jVar3.s();
                q1 q1Var2 = q1.A;
                jVar2 = jVar3;
                kh.o.d(f3, ((i4 << 12) & 234881024) | ((i4 >> 3) & 14) | 24576 | ((i4 << 3) & 112) | 1576320 | 805306368, (57344 & (i4 >> 6)) | 1772934, hVar9, rVar2, hVar6, oVar3, n1Var3, jVar2, gVar3, wVar, aVar3, cVar, h1VarB, z);
                f2 = f3;
                hVar5 = hVar9;
                hVar4 = hVar6;
                oVar2 = oVar3;
                n1Var2 = n1Var3;
                gVar2 = gVar3;
                aVar2 = aVar3;
                h1Var2 = h1VarB;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                hVar4 = hVar2;
                oVar2 = oVar;
                n1Var2 = n1Var;
                gVar2 = gVar;
                aVar2 = aVar;
                h1Var2 = h1Var;
                hVar5 = hVar3;
                f2 = f;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new m0.d(wVar, rVar, n1Var2, gVar2, f2, hVar5, hVar4, z, aVar2, oVar2, h1Var2, cVar, i, i2);
            }
        }
        i7 = 1769472 | i6;
        hVar3 = hVar;
        i3 = i7 | 809500672;
        if ((306783379 & i3) == 306783378) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (jVar3.S(i3 & 1, z2)) {
            jVar3.X();
            if ((i & 1) != 0) {
                float f7 = 0;
                n1 p1Var2 = new p1(f7, f7, f7, f7);
                float f8 = 0;
                if (i8 != 0) {
                    hVar3 = b2.b.K;
                }
                int i13 = 196608 | (i3 & 14);
                sVar = new s();
                tVarA = e2.a(jVar3);
                h2.c cVar6 = x.z1.a;
                b1VarV = x.c.v(0.0f, 400.0f, Float.valueOf(1), 1);
                y3.c cVar7 = (y3.c) jVar3.k(o1.h);
                mVar = (y3.m) jVar3.k(o1.n);
                zG = ((((i13 & 14) ^ 6) <= 4 && jVar3.g(wVar)) || (i13 & 6) == 4) | jVar3.g(tVarA) | jVar3.g(b1VarV) | jVar3.g(sVar) | jVar3.g(cVar7) | jVar3.e(mVar.ordinal());
                objN = jVar3.N();
                l1.c cVar8 = l1.i.a;
                if (zG) {
                    e0.c cVar9 = new e0.c(wVar, new c0.f(wVar, mVar, 12), sVar);
                    float f9 = e0.l.a;
                    e0.h hVar10 = new e0.h(cVar9, tVarA, b1VarV);
                    jVar3.n0(hVar10);
                    objN = hVar10;
                } else {
                    e0.c cVar10 = new e0.c(wVar, new c0.f(wVar, mVar, 12), sVar);
                    float f11 = e0.l.a;
                    e0.h hVar11 = new e0.h(cVar10, tVarA, b1VarV);
                    jVar3.n0(hVar11);
                    objN = hVar11;
                }
                e0.h hVar12 = (e0.h) objN;
                int i14 = i3 & (-29360129);
                q1 q1Var3 = q1.A;
                int i15 = (i3 & 14) | 432;
                if (((i15 & 14) ^ 6) <= 4) {
                }
                objN2 = jVar3.N();
                if (z3) {
                    objN2 = new m0.a(wVar);
                    jVar3.n0(objN2);
                } else {
                    objN2 = new m0.a(wVar);
                    jVar3.n0(objN2);
                }
                hVar6 = hVar12;
                aVar3 = (m0.a) objN2;
                oVar3 = e0.n.c;
                i4 = i14;
                h1VarB = i1.b(jVar3);
                gVar3 = m0.g.a;
                n1Var3 = p1Var2;
                f3 = f8;
            } else {
                float f12 = 0;
                n1 p1Var3 = new p1(f12, f12, f12, f12);
                float f13 = 0;
                if (i8 != 0) {
                    hVar3 = b2.b.K;
                }
                int i16 = 196608 | (i3 & 14);
                sVar = new s();
                tVarA = e2.a(jVar3);
                h2.c cVar11 = x.z1.a;
                b1VarV = x.c.v(0.0f, 400.0f, Float.valueOf(1), 1);
                y3.c cVar12 = (y3.c) jVar3.k(o1.h);
                mVar = (y3.m) jVar3.k(o1.n);
                zG = ((((i16 & 14) ^ 6) <= 4 && jVar3.g(wVar)) || (i16 & 6) == 4) | jVar3.g(tVarA) | jVar3.g(b1VarV) | jVar3.g(sVar) | jVar3.g(cVar12) | jVar3.e(mVar.ordinal());
                objN = jVar3.N();
                l1.c cVar13 = l1.i.a;
                if (zG) {
                    e0.c cVar14 = new e0.c(wVar, new c0.f(wVar, mVar, 12), sVar);
                    float f14 = e0.l.a;
                    e0.h hVar13 = new e0.h(cVar14, tVarA, b1VarV);
                    jVar3.n0(hVar13);
                    objN = hVar13;
                } else {
                    e0.c cVar15 = new e0.c(wVar, new c0.f(wVar, mVar, 12), sVar);
                    float f15 = e0.l.a;
                    e0.h hVar14 = new e0.h(cVar15, tVarA, b1VarV);
                    jVar3.n0(hVar14);
                    objN = hVar14;
                }
                e0.h hVar15 = (e0.h) objN;
                int i17 = i3 & (-29360129);
                q1 q1Var4 = q1.A;
                int i18 = (i3 & 14) | 432;
                if (((i18 & 14) ^ 6) <= 4) {
                }
                objN2 = jVar3.N();
                if (z3) {
                    objN2 = new m0.a(wVar);
                    jVar3.n0(objN2);
                } else {
                    objN2 = new m0.a(wVar);
                    jVar3.n0(objN2);
                }
                hVar6 = hVar15;
                aVar3 = (m0.a) objN2;
                oVar3 = e0.n.c;
                i4 = i17;
                h1VarB = i1.b(jVar3);
                gVar3 = m0.g.a;
                n1Var3 = p1Var3;
                f3 = f13;
            }
            b2.h hVar16 = hVar3;
            jVar3.s();
            q1 q1Var5 = q1.A;
            jVar2 = jVar3;
            kh.o.d(f3, ((i4 << 12) & 234881024) | ((i4 >> 3) & 14) | 24576 | ((i4 << 3) & 112) | 1576320 | 805306368, (57344 & (i4 >> 6)) | 1772934, hVar16, rVar2, hVar6, oVar3, n1Var3, jVar2, gVar3, wVar, aVar3, cVar, h1VarB, z);
            f2 = f3;
            hVar5 = hVar16;
            hVar4 = hVar6;
            oVar2 = oVar3;
            n1Var2 = n1Var3;
            gVar2 = gVar3;
            aVar2 = aVar3;
            h1Var2 = h1VarB;
        } else {
            jVar2 = jVar3;
            jVar2.V();
            hVar4 = hVar2;
            oVar2 = oVar;
            n1Var2 = n1Var;
            gVar2 = gVar;
            aVar2 = aVar;
            h1Var2 = h1Var;
            hVar5 = hVar3;
            f2 = f;
        }
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new m0.d(wVar, rVar, n1Var2, gVar2, f2, hVar5, hVar4, z, aVar2, oVar2, h1Var2, cVar, i, i2);
        }
    }

    public static final void M(du.t0 t0Var, l1.j jVar, int i) {
        Object objF;
        ol.b bVar;
        boolean z;
        boolean zI;
        Object objN;
        ol.b bVar2;
        k00.c cVar;
        g00.b0 b0Var;
        boolean z2;
        boolean zG;
        Object i2Var;
        am.c cVar2;
        boolean zI2;
        Object objN2;
        boolean zI3;
        Object objN3;
        Context context;
        ol.b bVar3;
        boolean zI4;
        Object objN4;
        cu.a aVar;
        g00.b0 b0Var2;
        final du.t0 t0Var2 = t0Var;
        g0 g0Var = (g0) jVar;
        g0Var.e0(916144933);
        int i2 = i | (g0Var.g(t0Var2) ? 4 : 2);
        int i3 = 1;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            g0Var.X();
            if ((i & 1) != 0 && !g0Var.A()) {
                g0Var.V();
            }
            g0Var.s();
            e60.a aVarA = q50.c.a(g0Var);
            boolean zG2 = g0Var.g((Object) null) | g0Var.g(aVarA);
            Object objN5 = g0Var.N();
            l1.c cVar3 = l1.i.a;
            if (zG2 || objN5 == cVar3) {
                objN5 = oi.k.f(kotlin.jvm.internal.a0.a, vp.x.class, aVarA, (b60.a) null, g0Var);
            }
            vp.x xVar = (vp.x) objN5;
            e60.a aVarA2 = q50.c.a(g0Var);
            boolean zG3 = g0Var.g((Object) null) | g0Var.g(aVarA2);
            Object objN6 = g0Var.N();
            if (zG3 || objN6 == cVar3) {
                objN6 = oi.k.f(kotlin.jvm.internal.a0.a, ah.e.class, aVarA2, (b60.a) null, g0Var);
            }
            ah.e eVar = (ah.e) objN6;
            e60.a aVarA3 = q50.c.a(g0Var);
            boolean zG4 = g0Var.g((Object) null) | g0Var.g(aVarA3);
            Object objN7 = g0Var.N();
            if (zG4 || objN7 == cVar3) {
                objN7 = oi.k.f(kotlin.jvm.internal.a0.a, nm.b.class, aVarA3, (b60.a) null, g0Var);
            }
            nm.b bVar4 = (nm.b) objN7;
            e60.a aVarA4 = q50.c.a(g0Var);
            boolean zG5 = g0Var.g((Object) null) | g0Var.g(aVarA4);
            Object objN8 = g0Var.N();
            if (zG5 || objN8 == cVar3) {
                objN8 = oi.k.f(kotlin.jvm.internal.a0.a, am.c.class, aVarA4, (b60.a) null, g0Var);
            }
            am.c cVar4 = (am.c) objN8;
            final l1.z0 z0VarQ = k00.f.q(t0Var2.c.d, g0Var, 0);
            Context context2 = (Context) g0Var.k(c3.o0.b);
            androidx.lifecycle.w wVar = (androidx.lifecycle.w) g0Var.k(r6.d.a);
            final rm.a aVarD0 = w50.c.d0(g0Var);
            final m6 m6VarF = t4.f(true, (u00.k) null, g0Var, 6, 2);
            q2 q2Var = ol.a.a;
            Object objN9 = g0Var.N();
            if (objN9 == cVar3) {
                objN9 = new ol.b();
                g0Var.n0(objN9);
            }
            ol.b bVar5 = (ol.b) objN9;
            boolean zG6 = g0Var.g(z0VarQ);
            Object objN10 = g0Var.N();
            if (zG6 || objN10 == cVar3) {
                objN10 = new ds.l(z0VarQ, i3);
                g0Var.n0(objN10);
            }
            e60.a aVarA5 = q50.c.a(g0Var);
            a60.a aVar2 = (a60.a) ((u00.a) objN10).invoke();
            boolean zG7 = g0Var.g((Object) null) | g0Var.g(aVarA5) | g0Var.g(aVar2);
            Object objN11 = g0Var.N();
            if (zG7 || objN11 == cVar3) {
                objF = aVarA5.f(kotlin.jvm.internal.a0.a.b(cu.a.class), aVar2, null);
                g0Var.n0(objF);
            } else {
                objF = objN11;
            }
            cu.a aVar3 = (cu.a) objF;
            final h00.a aVarT = f50.k.t(q50.c.b(g0Var).c("MAIN_SCOPE_KEY", new b60.b("MAIN_SCOPE_KEY")), g0Var);
            boolean zI5 = g0Var.i(bVar4);
            int i4 = (i2 & 14) ^ 6;
            if (i4 <= 4 || !g0Var.g(t0Var2)) {
                bVar = bVar5;
                if ((i2 & 6) != 4) {
                    z = false;
                }
                zI = zI5 | z | g0Var.i(wVar);
                objN = g0Var.N();
                if (!zI || objN == cVar3) {
                    bVar2 = bVar;
                    f2 f2Var = new f2(bVar4, wVar, t0Var2, (k00.c) null, 4);
                    cVar = null;
                    g0Var.n0(f2Var);
                    objN = f2Var;
                } else {
                    bVar2 = bVar;
                    cVar = null;
                }
                b0Var = g00.b0.a;
                l1.q.i(b0Var, g0Var, (u00.n) objN);
                if (!((n0) z0VarQ.getValue()).f || ((n0) z0VarQ.getValue()).g) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z2);
                zG = g0Var.g(aVar3) | g0Var.i(cVar4) | g0Var.h(z2);
                Object objN12 = g0Var.N();
                if (!zG || objN12 == cVar3) {
                    i2Var = new i2(aVar3, cVar4, z2, cVar, 1);
                    cVar2 = cVar4;
                    g0Var.n0(i2Var);
                } else {
                    i2Var = objN12;
                    cVar2 = cVar4;
                }
                l1.q.i(boolValueOf, g0Var, (u00.n) i2Var);
                zI2 = g0Var.i(cVar2);
                objN2 = g0Var.N();
                if (zI2 || objN2 == cVar3) {
                    objN2 = new e1(cVar2, 13);
                    g0Var.n0(objN2);
                }
                l1.q.e(b0Var, (u00.k) objN2, g0Var);
                zI3 = g0Var.i(cVar2) | g0Var.g(bVar2) | g0Var.i(context2);
                objN3 = g0Var.N();
                if (!zI3 || objN3 == cVar3) {
                    context = context2;
                    bVar3 = bVar2;
                    objN3 = new a1.e2(cVar2, bVar3, context, cVar, 24);
                    g0Var.n0(objN3);
                } else {
                    context = context2;
                    bVar3 = bVar2;
                }
                l1.q.i(b0Var, g0Var, (u00.n) objN3);
                zI4 = g0Var.i(context) | ((i4 <= 4 && g0Var.g(t0Var2)) || (i2 & 6) == 4) | g0Var.i(xVar) | g0Var.i(eVar) | g0Var.g(aVar3);
                objN4 = g0Var.N();
                if (!zI4 || objN4 == cVar3) {
                    aVar = aVar3;
                    b0Var2 = b0Var;
                    androidx.lifecycle.n0 n0Var = new androidx.lifecycle.n0(t0Var2, context, eVar, aVar, xVar, (k00.c) null, 2);
                    g0Var.n0(n0Var);
                    objN4 = n0Var;
                } else {
                    b0Var2 = b0Var;
                    aVar = aVar3;
                }
                l1.q.i(b0Var2, g0Var, (u00.n) objN4);
                t0Var2 = t0Var;
                final cu.a aVar4 = aVar;
                final ol.b bVar6 = bVar3;
                l1.q.a(ol.a.a.a(bVar3), v1.d.d(-50100251, new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        l1.g0 g0Var2 = (l1.j) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        l1.g0 g0Var3 = g0Var2;
                        if (g0Var3.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                            h0.a0 a0Var = z1.c;
                            z2.w0 w0VarD = h0.o.d(b2.b.A, false);
                            int iHashCode = Long.hashCode(g0Var3.T);
                            m1 m1VarM = g0Var3.m();
                            b2.r rVarC = b2.a.c(a0Var, g0Var2);
                            b3.i.c.getClass();
                            b3.g gVar = b3.h.b;
                            g0Var3.g0();
                            if (g0Var3.S) {
                                g0Var3.l(gVar);
                            } else {
                                g0Var3.q0();
                            }
                            l1.q.I(w0VarD, g0Var2, b3.h.f);
                            l1.q.I(m1VarM, g0Var2, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.g);
                            l1.q.E(g0Var2, b3.h.h);
                            l1.q.I(rVarC, g0Var2, b3.h.d);
                            cu.a aVar5 = aVar4;
                            z1.p pVar = aVar5.a;
                            boolean zG8 = g0Var3.g(aVar5);
                            Object objN13 = g0Var3.N();
                            l1.c cVar5 = l1.i.a;
                            if (zG8 || objN13 == cVar5) {
                                objN13 = new av.k(0, aVar5, cu.a.class, "navigateBack", "navigateBack()V", 0, 7);
                                g0Var3.n0(objN13);
                            }
                            p30.f.O(pVar, a0Var, null, (u00.a) ((a10.g) objN13), va.a.S(new p9.f[]{bi.b.N(g0Var2), p30.f.o0(g0Var2)}), null, null, null, null, aVarT, g0Var2, 48);
                            l1.z0 z0Var = z0VarQ;
                            boolean z3 = (!((n0) z0Var.getValue()).h || ((n0) z0Var.getValue()).f || ((n0) z0Var.getValue()).g) ? false : true;
                            final t0 t0Var3 = t0Var2;
                            boolean zG9 = g0Var3.g(t0Var3);
                            Object objN14 = g0Var3.N();
                            if (zG9 || objN14 == cVar5) {
                                final int i5 = 11;
                                objN14 = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        int i6 = i5;
                                        t0 t0Var4 = t0Var3;
                                        switch (i6) {
                                            case 0:
                                                t0Var4.l(c.a);
                                                break;
                                            case 1:
                                                t0Var4.l(c.a);
                                                break;
                                            case 2:
                                                t0Var4.l(b.a);
                                                break;
                                            case 3:
                                                t0Var4.l(h.a);
                                                break;
                                            case 4:
                                                t0Var4.l(g.a);
                                                break;
                                            case 5:
                                                t0Var4.l(r.a);
                                                break;
                                            case 6:
                                                t0Var4.l(t.a);
                                                break;
                                            case 7:
                                                t0Var4.l(e.a);
                                                break;
                                            case 8:
                                                t0Var4.l(m.a);
                                                break;
                                            case 9:
                                                t0Var4.l(p.a);
                                                break;
                                            case 10:
                                                t0Var4.l(o.a);
                                                break;
                                            case 11:
                                                t0Var4.l(s.a);
                                                break;
                                            case 12:
                                                t0Var4.l(k.a);
                                                break;
                                            case 13:
                                                t0Var4.l(j.a);
                                                break;
                                            case 14:
                                                t0Var4.l(f.a);
                                                break;
                                            case 15:
                                                t0Var4.l(d.a);
                                                break;
                                            default:
                                                t0Var4.l(l.a);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                };
                                g0Var3.n0(objN14);
                            }
                            u00.a aVar6 = (u00.a) objN14;
                            boolean zG10 = g0Var3.g(t0Var3);
                            Object objN15 = g0Var3.N();
                            if (zG10 || objN15 == cVar5) {
                                final int i6 = 5;
                                objN15 = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        int i7 = i6;
                                        t0 t0Var4 = t0Var3;
                                        switch (i7) {
                                            case 0:
                                                t0Var4.l(c.a);
                                                break;
                                            case 1:
                                                t0Var4.l(c.a);
                                                break;
                                            case 2:
                                                t0Var4.l(b.a);
                                                break;
                                            case 3:
                                                t0Var4.l(h.a);
                                                break;
                                            case 4:
                                                t0Var4.l(g.a);
                                                break;
                                            case 5:
                                                t0Var4.l(r.a);
                                                break;
                                            case 6:
                                                t0Var4.l(t.a);
                                                break;
                                            case 7:
                                                t0Var4.l(e.a);
                                                break;
                                            case 8:
                                                t0Var4.l(m.a);
                                                break;
                                            case 9:
                                                t0Var4.l(p.a);
                                                break;
                                            case 10:
                                                t0Var4.l(o.a);
                                                break;
                                            case 11:
                                                t0Var4.l(s.a);
                                                break;
                                            case 12:
                                                t0Var4.l(k.a);
                                                break;
                                            case 13:
                                                t0Var4.l(j.a);
                                                break;
                                            case 14:
                                                t0Var4.l(f.a);
                                                break;
                                            case 15:
                                                t0Var4.l(d.a);
                                                break;
                                            default:
                                                t0Var4.l(l.a);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                };
                                g0Var3.n0(objN15);
                            }
                            eu.b0.a(z3, aVar6, (u00.a) objN15, g0Var2, 0);
                            if (((n0) z0Var.getValue()).f) {
                                g0Var3.c0(-532357303);
                                boolean zG11 = g0Var3.g(t0Var3);
                                Object objN16 = g0Var3.N();
                                if (zG11 || objN16 == cVar5) {
                                    final int i7 = 6;
                                    objN16 = new u00.a() {
                                        @Override
                                        public final Object invoke() {
                                            int i8 = i7;
                                            t0 t0Var4 = t0Var3;
                                            switch (i8) {
                                                case 0:
                                                    t0Var4.l(c.a);
                                                    break;
                                                case 1:
                                                    t0Var4.l(c.a);
                                                    break;
                                                case 2:
                                                    t0Var4.l(b.a);
                                                    break;
                                                case 3:
                                                    t0Var4.l(h.a);
                                                    break;
                                                case 4:
                                                    t0Var4.l(g.a);
                                                    break;
                                                case 5:
                                                    t0Var4.l(r.a);
                                                    break;
                                                case 6:
                                                    t0Var4.l(t.a);
                                                    break;
                                                case 7:
                                                    t0Var4.l(e.a);
                                                    break;
                                                case 8:
                                                    t0Var4.l(m.a);
                                                    break;
                                                case 9:
                                                    t0Var4.l(p.a);
                                                    break;
                                                case 10:
                                                    t0Var4.l(o.a);
                                                    break;
                                                case 11:
                                                    t0Var4.l(s.a);
                                                    break;
                                                case 12:
                                                    t0Var4.l(k.a);
                                                    break;
                                                case 13:
                                                    t0Var4.l(j.a);
                                                    break;
                                                case 14:
                                                    t0Var4.l(f.a);
                                                    break;
                                                case 15:
                                                    t0Var4.l(d.a);
                                                    break;
                                                default:
                                                    t0Var4.l(l.a);
                                                    break;
                                            }
                                            return g00.b0.a;
                                        }
                                    };
                                    g0Var3.n0(objN16);
                                }
                                eu.b0.b((u00.a) objN16, g0Var2, 0);
                                g0Var3.r(false);
                            } else if (((n0) z0Var.getValue()).g) {
                                g0Var3.c0(-532145511);
                                boolean zG12 = g0Var3.g(t0Var3);
                                Object objN17 = g0Var3.N();
                                if (zG12 || objN17 == cVar5) {
                                    final int i8 = 7;
                                    objN17 = new u00.a() {
                                        @Override
                                        public final Object invoke() {
                                            int i9 = i8;
                                            t0 t0Var4 = t0Var3;
                                            switch (i9) {
                                                case 0:
                                                    t0Var4.l(c.a);
                                                    break;
                                                case 1:
                                                    t0Var4.l(c.a);
                                                    break;
                                                case 2:
                                                    t0Var4.l(b.a);
                                                    break;
                                                case 3:
                                                    t0Var4.l(h.a);
                                                    break;
                                                case 4:
                                                    t0Var4.l(g.a);
                                                    break;
                                                case 5:
                                                    t0Var4.l(r.a);
                                                    break;
                                                case 6:
                                                    t0Var4.l(t.a);
                                                    break;
                                                case 7:
                                                    t0Var4.l(e.a);
                                                    break;
                                                case 8:
                                                    t0Var4.l(m.a);
                                                    break;
                                                case 9:
                                                    t0Var4.l(p.a);
                                                    break;
                                                case 10:
                                                    t0Var4.l(o.a);
                                                    break;
                                                case 11:
                                                    t0Var4.l(s.a);
                                                    break;
                                                case 12:
                                                    t0Var4.l(k.a);
                                                    break;
                                                case 13:
                                                    t0Var4.l(j.a);
                                                    break;
                                                case 14:
                                                    t0Var4.l(f.a);
                                                    break;
                                                case 15:
                                                    t0Var4.l(d.a);
                                                    break;
                                                default:
                                                    t0Var4.l(l.a);
                                                    break;
                                            }
                                            return g00.b0.a;
                                        }
                                    };
                                    g0Var3.n0(objN17);
                                }
                                eu.a.b((u00.a) objN17, g0Var2, 0);
                                g0Var3.r(false);
                            } else {
                                g0Var3.c0(-531993673);
                                g0Var3.r(false);
                            }
                            boolean z4 = ((n0) z0Var.getValue()).i && !((n0) z0Var.getValue()).f;
                            bu.b bVar7 = ((n0) z0Var.getValue()).q;
                            bu.b bVar8 = ((n0) z0Var.getValue()).o;
                            bu.b bVar9 = ((n0) z0Var.getValue()).p;
                            boolean zG13 = g0Var3.g(t0Var3);
                            Object objN18 = g0Var3.N();
                            if (zG13 || objN18 == cVar5) {
                                final int i9 = 8;
                                objN18 = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        int i11 = i9;
                                        t0 t0Var4 = t0Var3;
                                        switch (i11) {
                                            case 0:
                                                t0Var4.l(c.a);
                                                break;
                                            case 1:
                                                t0Var4.l(c.a);
                                                break;
                                            case 2:
                                                t0Var4.l(b.a);
                                                break;
                                            case 3:
                                                t0Var4.l(h.a);
                                                break;
                                            case 4:
                                                t0Var4.l(g.a);
                                                break;
                                            case 5:
                                                t0Var4.l(r.a);
                                                break;
                                            case 6:
                                                t0Var4.l(t.a);
                                                break;
                                            case 7:
                                                t0Var4.l(e.a);
                                                break;
                                            case 8:
                                                t0Var4.l(m.a);
                                                break;
                                            case 9:
                                                t0Var4.l(p.a);
                                                break;
                                            case 10:
                                                t0Var4.l(o.a);
                                                break;
                                            case 11:
                                                t0Var4.l(s.a);
                                                break;
                                            case 12:
                                                t0Var4.l(k.a);
                                                break;
                                            case 13:
                                                t0Var4.l(j.a);
                                                break;
                                            case 14:
                                                t0Var4.l(f.a);
                                                break;
                                            case 15:
                                                t0Var4.l(d.a);
                                                break;
                                            default:
                                                t0Var4.l(l.a);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                };
                                g0Var3.n0(objN18);
                            }
                            u00.a aVar7 = (u00.a) objN18;
                            boolean zG14 = g0Var3.g(t0Var3);
                            Object objN19 = g0Var3.N();
                            if (zG14 || objN19 == cVar5) {
                                objN19 = new e1(t0Var3, 12);
                                g0Var3.n0(objN19);
                            }
                            u00.k kVar = (u00.k) objN19;
                            boolean zG15 = g0Var3.g(t0Var3);
                            Object objN20 = g0Var3.N();
                            if (zG15 || objN20 == cVar5) {
                                final int i11 = 9;
                                objN20 = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        int i12 = i11;
                                        t0 t0Var4 = t0Var3;
                                        switch (i12) {
                                            case 0:
                                                t0Var4.l(c.a);
                                                break;
                                            case 1:
                                                t0Var4.l(c.a);
                                                break;
                                            case 2:
                                                t0Var4.l(b.a);
                                                break;
                                            case 3:
                                                t0Var4.l(h.a);
                                                break;
                                            case 4:
                                                t0Var4.l(g.a);
                                                break;
                                            case 5:
                                                t0Var4.l(r.a);
                                                break;
                                            case 6:
                                                t0Var4.l(t.a);
                                                break;
                                            case 7:
                                                t0Var4.l(e.a);
                                                break;
                                            case 8:
                                                t0Var4.l(m.a);
                                                break;
                                            case 9:
                                                t0Var4.l(p.a);
                                                break;
                                            case 10:
                                                t0Var4.l(o.a);
                                                break;
                                            case 11:
                                                t0Var4.l(s.a);
                                                break;
                                            case 12:
                                                t0Var4.l(k.a);
                                                break;
                                            case 13:
                                                t0Var4.l(j.a);
                                                break;
                                            case 14:
                                                t0Var4.l(f.a);
                                                break;
                                            case 15:
                                                t0Var4.l(d.a);
                                                break;
                                            default:
                                                t0Var4.l(l.a);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                };
                                g0Var3.n0(objN20);
                            }
                            u00.a aVar8 = (u00.a) objN20;
                            w2 w2Var = aVarD0;
                            boolean zI6 = g0Var3.i(w2Var);
                            Object objN21 = g0Var3.N();
                            if (zI6 || objN21 == cVar5) {
                                objN21 = new h0(w2Var, 0);
                                g0Var3.n0(objN21);
                            }
                            u00.a aVar9 = (u00.a) objN21;
                            boolean zI7 = g0Var3.i(w2Var);
                            Object objN22 = g0Var3.N();
                            if (zI7 || objN22 == cVar5) {
                                objN22 = new h0(w2Var, 1);
                                g0Var3.n0(objN22);
                            }
                            u00.a aVar10 = (u00.a) objN22;
                            boolean zG16 = g0Var3.g(t0Var3);
                            Object objN23 = g0Var3.N();
                            if (zG16 || objN23 == cVar5) {
                                final int i12 = 10;
                                objN23 = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        int i13 = i12;
                                        t0 t0Var4 = t0Var3;
                                        switch (i13) {
                                            case 0:
                                                t0Var4.l(c.a);
                                                break;
                                            case 1:
                                                t0Var4.l(c.a);
                                                break;
                                            case 2:
                                                t0Var4.l(b.a);
                                                break;
                                            case 3:
                                                t0Var4.l(h.a);
                                                break;
                                            case 4:
                                                t0Var4.l(g.a);
                                                break;
                                            case 5:
                                                t0Var4.l(r.a);
                                                break;
                                            case 6:
                                                t0Var4.l(t.a);
                                                break;
                                            case 7:
                                                t0Var4.l(e.a);
                                                break;
                                            case 8:
                                                t0Var4.l(m.a);
                                                break;
                                            case 9:
                                                t0Var4.l(p.a);
                                                break;
                                            case 10:
                                                t0Var4.l(o.a);
                                                break;
                                            case 11:
                                                t0Var4.l(s.a);
                                                break;
                                            case 12:
                                                t0Var4.l(k.a);
                                                break;
                                            case 13:
                                                t0Var4.l(j.a);
                                                break;
                                            case 14:
                                                t0Var4.l(f.a);
                                                break;
                                            case 15:
                                                t0Var4.l(d.a);
                                                break;
                                            default:
                                                t0Var4.l(l.a);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                };
                                g0Var3.n0(objN23);
                            }
                            eu.a.r(z4, bVar7, bVar8, bVar9, aVar7, kVar, aVar8, aVar9, aVar10, (u00.a) objN23, g0Var2, 0);
                            eu.a.t(0, g0Var2, ((n0) z0Var.getValue()).j);
                            boolean z5 = (!((n0) z0Var.getValue()).b || ((n0) z0Var.getValue()).f || ((n0) z0Var.getValue()).g || ((n0) z0Var.getValue()).h) ? false : true;
                            boolean zG17 = g0Var3.g(t0Var3);
                            Object objN24 = g0Var3.N();
                            if (zG17 || objN24 == cVar5) {
                                final int i13 = 12;
                                objN24 = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        int i14 = i13;
                                        t0 t0Var4 = t0Var3;
                                        switch (i14) {
                                            case 0:
                                                t0Var4.l(c.a);
                                                break;
                                            case 1:
                                                t0Var4.l(c.a);
                                                break;
                                            case 2:
                                                t0Var4.l(b.a);
                                                break;
                                            case 3:
                                                t0Var4.l(h.a);
                                                break;
                                            case 4:
                                                t0Var4.l(g.a);
                                                break;
                                            case 5:
                                                t0Var4.l(r.a);
                                                break;
                                            case 6:
                                                t0Var4.l(t.a);
                                                break;
                                            case 7:
                                                t0Var4.l(e.a);
                                                break;
                                            case 8:
                                                t0Var4.l(m.a);
                                                break;
                                            case 9:
                                                t0Var4.l(p.a);
                                                break;
                                            case 10:
                                                t0Var4.l(o.a);
                                                break;
                                            case 11:
                                                t0Var4.l(s.a);
                                                break;
                                            case 12:
                                                t0Var4.l(k.a);
                                                break;
                                            case 13:
                                                t0Var4.l(j.a);
                                                break;
                                            case 14:
                                                t0Var4.l(f.a);
                                                break;
                                            case 15:
                                                t0Var4.l(d.a);
                                                break;
                                            default:
                                                t0Var4.l(l.a);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                };
                                g0Var3.n0(objN24);
                            }
                            u00.a aVar11 = (u00.a) objN24;
                            boolean zG18 = g0Var3.g(t0Var3);
                            Object objN25 = g0Var3.N();
                            if (zG18 || objN25 == cVar5) {
                                final int i14 = 13;
                                objN25 = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        int i15 = i14;
                                        t0 t0Var4 = t0Var3;
                                        switch (i15) {
                                            case 0:
                                                t0Var4.l(c.a);
                                                break;
                                            case 1:
                                                t0Var4.l(c.a);
                                                break;
                                            case 2:
                                                t0Var4.l(b.a);
                                                break;
                                            case 3:
                                                t0Var4.l(h.a);
                                                break;
                                            case 4:
                                                t0Var4.l(g.a);
                                                break;
                                            case 5:
                                                t0Var4.l(r.a);
                                                break;
                                            case 6:
                                                t0Var4.l(t.a);
                                                break;
                                            case 7:
                                                t0Var4.l(e.a);
                                                break;
                                            case 8:
                                                t0Var4.l(m.a);
                                                break;
                                            case 9:
                                                t0Var4.l(p.a);
                                                break;
                                            case 10:
                                                t0Var4.l(o.a);
                                                break;
                                            case 11:
                                                t0Var4.l(s.a);
                                                break;
                                            case 12:
                                                t0Var4.l(k.a);
                                                break;
                                            case 13:
                                                t0Var4.l(j.a);
                                                break;
                                            case 14:
                                                t0Var4.l(f.a);
                                                break;
                                            case 15:
                                                t0Var4.l(d.a);
                                                break;
                                            default:
                                                t0Var4.l(l.a);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                };
                                g0Var3.n0(objN25);
                            }
                            u00.a aVar12 = (u00.a) objN25;
                            boolean zG19 = g0Var3.g(t0Var3);
                            Object objN26 = g0Var3.N();
                            if (zG19 || objN26 == cVar5) {
                                final int i15 = 14;
                                objN26 = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        int i16 = i15;
                                        t0 t0Var4 = t0Var3;
                                        switch (i16) {
                                            case 0:
                                                t0Var4.l(c.a);
                                                break;
                                            case 1:
                                                t0Var4.l(c.a);
                                                break;
                                            case 2:
                                                t0Var4.l(b.a);
                                                break;
                                            case 3:
                                                t0Var4.l(h.a);
                                                break;
                                            case 4:
                                                t0Var4.l(g.a);
                                                break;
                                            case 5:
                                                t0Var4.l(r.a);
                                                break;
                                            case 6:
                                                t0Var4.l(t.a);
                                                break;
                                            case 7:
                                                t0Var4.l(e.a);
                                                break;
                                            case 8:
                                                t0Var4.l(m.a);
                                                break;
                                            case 9:
                                                t0Var4.l(p.a);
                                                break;
                                            case 10:
                                                t0Var4.l(o.a);
                                                break;
                                            case 11:
                                                t0Var4.l(s.a);
                                                break;
                                            case 12:
                                                t0Var4.l(k.a);
                                                break;
                                            case 13:
                                                t0Var4.l(j.a);
                                                break;
                                            case 14:
                                                t0Var4.l(f.a);
                                                break;
                                            case 15:
                                                t0Var4.l(d.a);
                                                break;
                                            default:
                                                t0Var4.l(l.a);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                };
                                g0Var3.n0(objN26);
                            }
                            u00.a aVar13 = (u00.a) objN26;
                            boolean zG20 = g0Var3.g(t0Var3);
                            Object objN27 = g0Var3.N();
                            if (zG20 || objN27 == cVar5) {
                                final int i16 = 15;
                                objN27 = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        int i17 = i16;
                                        t0 t0Var4 = t0Var3;
                                        switch (i17) {
                                            case 0:
                                                t0Var4.l(c.a);
                                                break;
                                            case 1:
                                                t0Var4.l(c.a);
                                                break;
                                            case 2:
                                                t0Var4.l(b.a);
                                                break;
                                            case 3:
                                                t0Var4.l(h.a);
                                                break;
                                            case 4:
                                                t0Var4.l(g.a);
                                                break;
                                            case 5:
                                                t0Var4.l(r.a);
                                                break;
                                            case 6:
                                                t0Var4.l(t.a);
                                                break;
                                            case 7:
                                                t0Var4.l(e.a);
                                                break;
                                            case 8:
                                                t0Var4.l(m.a);
                                                break;
                                            case 9:
                                                t0Var4.l(p.a);
                                                break;
                                            case 10:
                                                t0Var4.l(o.a);
                                                break;
                                            case 11:
                                                t0Var4.l(s.a);
                                                break;
                                            case 12:
                                                t0Var4.l(k.a);
                                                break;
                                            case 13:
                                                t0Var4.l(j.a);
                                                break;
                                            case 14:
                                                t0Var4.l(f.a);
                                                break;
                                            case 15:
                                                t0Var4.l(d.a);
                                                break;
                                            default:
                                                t0Var4.l(l.a);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                };
                                g0Var3.n0(objN27);
                            }
                            eu.a.s(z5, aVar11, aVar12, aVar13, (u00.a) objN27, g0Var2, 0);
                            boolean z6 = ((n0) z0Var.getValue()).l && !((n0) z0Var.getValue()).f;
                            boolean zG21 = g0Var3.g(t0Var3);
                            Object objN28 = g0Var3.N();
                            if (zG21 || objN28 == cVar5) {
                                final int i17 = 16;
                                objN28 = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        int i18 = i17;
                                        t0 t0Var4 = t0Var3;
                                        switch (i18) {
                                            case 0:
                                                t0Var4.l(c.a);
                                                break;
                                            case 1:
                                                t0Var4.l(c.a);
                                                break;
                                            case 2:
                                                t0Var4.l(b.a);
                                                break;
                                            case 3:
                                                t0Var4.l(h.a);
                                                break;
                                            case 4:
                                                t0Var4.l(g.a);
                                                break;
                                            case 5:
                                                t0Var4.l(r.a);
                                                break;
                                            case 6:
                                                t0Var4.l(t.a);
                                                break;
                                            case 7:
                                                t0Var4.l(e.a);
                                                break;
                                            case 8:
                                                t0Var4.l(m.a);
                                                break;
                                            case 9:
                                                t0Var4.l(p.a);
                                                break;
                                            case 10:
                                                t0Var4.l(o.a);
                                                break;
                                            case 11:
                                                t0Var4.l(s.a);
                                                break;
                                            case 12:
                                                t0Var4.l(k.a);
                                                break;
                                            case 13:
                                                t0Var4.l(j.a);
                                                break;
                                            case 14:
                                                t0Var4.l(f.a);
                                                break;
                                            case 15:
                                                t0Var4.l(d.a);
                                                break;
                                            default:
                                                t0Var4.l(l.a);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                };
                                g0Var3.n0(objN28);
                            }
                            u00.a aVar14 = (u00.a) objN28;
                            boolean zG22 = g0Var3.g(t0Var3);
                            Object objN29 = g0Var3.N();
                            if (zG22 || objN29 == cVar5) {
                                final int i18 = 0;
                                objN29 = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        int i19 = i18;
                                        t0 t0Var4 = t0Var3;
                                        switch (i19) {
                                            case 0:
                                                t0Var4.l(c.a);
                                                break;
                                            case 1:
                                                t0Var4.l(c.a);
                                                break;
                                            case 2:
                                                t0Var4.l(b.a);
                                                break;
                                            case 3:
                                                t0Var4.l(h.a);
                                                break;
                                            case 4:
                                                t0Var4.l(g.a);
                                                break;
                                            case 5:
                                                t0Var4.l(r.a);
                                                break;
                                            case 6:
                                                t0Var4.l(t.a);
                                                break;
                                            case 7:
                                                t0Var4.l(e.a);
                                                break;
                                            case 8:
                                                t0Var4.l(m.a);
                                                break;
                                            case 9:
                                                t0Var4.l(p.a);
                                                break;
                                            case 10:
                                                t0Var4.l(o.a);
                                                break;
                                            case 11:
                                                t0Var4.l(s.a);
                                                break;
                                            case 12:
                                                t0Var4.l(k.a);
                                                break;
                                            case 13:
                                                t0Var4.l(j.a);
                                                break;
                                            case 14:
                                                t0Var4.l(f.a);
                                                break;
                                            case 15:
                                                t0Var4.l(d.a);
                                                break;
                                            default:
                                                t0Var4.l(l.a);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                };
                                g0Var3.n0(objN29);
                            }
                            u00.a aVar15 = (u00.a) objN29;
                            boolean zG23 = g0Var3.g(t0Var3);
                            Object objN30 = g0Var3.N();
                            if (zG23 || objN30 == cVar5) {
                                final int i19 = 1;
                                objN30 = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        int i110 = i19;
                                        t0 t0Var4 = t0Var3;
                                        switch (i110) {
                                            case 0:
                                                t0Var4.l(c.a);
                                                break;
                                            case 1:
                                                t0Var4.l(c.a);
                                                break;
                                            case 2:
                                                t0Var4.l(b.a);
                                                break;
                                            case 3:
                                                t0Var4.l(h.a);
                                                break;
                                            case 4:
                                                t0Var4.l(g.a);
                                                break;
                                            case 5:
                                                t0Var4.l(r.a);
                                                break;
                                            case 6:
                                                t0Var4.l(t.a);
                                                break;
                                            case 7:
                                                t0Var4.l(e.a);
                                                break;
                                            case 8:
                                                t0Var4.l(m.a);
                                                break;
                                            case 9:
                                                t0Var4.l(p.a);
                                                break;
                                            case 10:
                                                t0Var4.l(o.a);
                                                break;
                                            case 11:
                                                t0Var4.l(s.a);
                                                break;
                                            case 12:
                                                t0Var4.l(k.a);
                                                break;
                                            case 13:
                                                t0Var4.l(j.a);
                                                break;
                                            case 14:
                                                t0Var4.l(f.a);
                                                break;
                                            case 15:
                                                t0Var4.l(d.a);
                                                break;
                                            default:
                                                t0Var4.l(l.a);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                };
                                g0Var3.n0(objN30);
                            }
                            eu.q.a(z6, aVar14, aVar15, (u00.a) objN30, m6VarF, g0Var2, 0, 0);
                            bi.b.b((hp.b) null, (rp.o) null, (AuthAnalytics) null, g0Var2, 0);
                            ep.k kVar2 = ((n0) z0Var.getValue()).m;
                            boolean zG24 = g0Var3.g(t0Var3);
                            Object objN31 = g0Var3.N();
                            if (zG24 || objN31 == cVar5) {
                                final int i21 = 2;
                                objN31 = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        int i110 = i21;
                                        t0 t0Var4 = t0Var3;
                                        switch (i110) {
                                            case 0:
                                                t0Var4.l(c.a);
                                                break;
                                            case 1:
                                                t0Var4.l(c.a);
                                                break;
                                            case 2:
                                                t0Var4.l(b.a);
                                                break;
                                            case 3:
                                                t0Var4.l(h.a);
                                                break;
                                            case 4:
                                                t0Var4.l(g.a);
                                                break;
                                            case 5:
                                                t0Var4.l(r.a);
                                                break;
                                            case 6:
                                                t0Var4.l(t.a);
                                                break;
                                            case 7:
                                                t0Var4.l(e.a);
                                                break;
                                            case 8:
                                                t0Var4.l(m.a);
                                                break;
                                            case 9:
                                                t0Var4.l(p.a);
                                                break;
                                            case 10:
                                                t0Var4.l(o.a);
                                                break;
                                            case 11:
                                                t0Var4.l(s.a);
                                                break;
                                            case 12:
                                                t0Var4.l(k.a);
                                                break;
                                            case 13:
                                                t0Var4.l(j.a);
                                                break;
                                            case 14:
                                                t0Var4.l(f.a);
                                                break;
                                            case 15:
                                                t0Var4.l(d.a);
                                                break;
                                            default:
                                                t0Var4.l(l.a);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                };
                                g0Var3.n0(objN31);
                            }
                            eu.a.a(kVar2, (u00.a) objN31, g0Var2, 0);
                            boolean z7 = (!((n0) z0Var.getValue()).n || ((n0) z0Var.getValue()).f || ((n0) z0Var.getValue()).g) ? false : true;
                            boolean zG25 = g0Var3.g(t0Var3);
                            Object objN32 = g0Var3.N();
                            if (zG25 || objN32 == cVar5) {
                                final int i22 = 3;
                                objN32 = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        int i110 = i22;
                                        t0 t0Var4 = t0Var3;
                                        switch (i110) {
                                            case 0:
                                                t0Var4.l(c.a);
                                                break;
                                            case 1:
                                                t0Var4.l(c.a);
                                                break;
                                            case 2:
                                                t0Var4.l(b.a);
                                                break;
                                            case 3:
                                                t0Var4.l(h.a);
                                                break;
                                            case 4:
                                                t0Var4.l(g.a);
                                                break;
                                            case 5:
                                                t0Var4.l(r.a);
                                                break;
                                            case 6:
                                                t0Var4.l(t.a);
                                                break;
                                            case 7:
                                                t0Var4.l(e.a);
                                                break;
                                            case 8:
                                                t0Var4.l(m.a);
                                                break;
                                            case 9:
                                                t0Var4.l(p.a);
                                                break;
                                            case 10:
                                                t0Var4.l(o.a);
                                                break;
                                            case 11:
                                                t0Var4.l(s.a);
                                                break;
                                            case 12:
                                                t0Var4.l(k.a);
                                                break;
                                            case 13:
                                                t0Var4.l(j.a);
                                                break;
                                            case 14:
                                                t0Var4.l(f.a);
                                                break;
                                            case 15:
                                                t0Var4.l(d.a);
                                                break;
                                            default:
                                                t0Var4.l(l.a);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                };
                                g0Var3.n0(objN32);
                            }
                            u00.a aVar16 = (u00.a) objN32;
                            boolean zG26 = g0Var3.g(t0Var3);
                            Object objN33 = g0Var3.N();
                            if (zG26 || objN33 == cVar5) {
                                final int i23 = 4;
                                objN33 = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        int i110 = i23;
                                        t0 t0Var4 = t0Var3;
                                        switch (i110) {
                                            case 0:
                                                t0Var4.l(c.a);
                                                break;
                                            case 1:
                                                t0Var4.l(c.a);
                                                break;
                                            case 2:
                                                t0Var4.l(b.a);
                                                break;
                                            case 3:
                                                t0Var4.l(h.a);
                                                break;
                                            case 4:
                                                t0Var4.l(g.a);
                                                break;
                                            case 5:
                                                t0Var4.l(r.a);
                                                break;
                                            case 6:
                                                t0Var4.l(t.a);
                                                break;
                                            case 7:
                                                t0Var4.l(e.a);
                                                break;
                                            case 8:
                                                t0Var4.l(m.a);
                                                break;
                                            case 9:
                                                t0Var4.l(p.a);
                                                break;
                                            case 10:
                                                t0Var4.l(o.a);
                                                break;
                                            case 11:
                                                t0Var4.l(s.a);
                                                break;
                                            case 12:
                                                t0Var4.l(k.a);
                                                break;
                                            case 13:
                                                t0Var4.l(j.a);
                                                break;
                                            case 14:
                                                t0Var4.l(f.a);
                                                break;
                                            case 15:
                                                t0Var4.l(d.a);
                                                break;
                                            default:
                                                t0Var4.l(l.a);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                };
                                g0Var3.n0(objN33);
                            }
                            eu.a.c(z7, aVar16, (u00.a) objN33, g0Var2, 0);
                            ol.a.a(bVar6, h0.s.a.a(b2.o.A, b2.b.B), g0Var2, 0);
                            g0Var3.r(true);
                        } else {
                            g0Var3.V();
                        }
                        return g00.b0.a;
                    }
                }, g0Var), g0Var, 56);
            } else {
                bVar = bVar5;
            }
            z = true;
            zI = zI5 | z | g0Var.i(wVar);
            objN = g0Var.N();
            if (zI) {
                bVar2 = bVar;
                f2 f2Var2 = new f2(bVar4, wVar, t0Var2, (k00.c) null, 4);
                cVar = null;
                g0Var.n0(f2Var2);
                objN = f2Var2;
            } else {
                bVar2 = bVar;
                f2 f2Var3 = new f2(bVar4, wVar, t0Var2, (k00.c) null, 4);
                cVar = null;
                g0Var.n0(f2Var3);
                objN = f2Var3;
            }
            b0Var = g00.b0.a;
            l1.q.i(b0Var, g0Var, (u00.n) objN);
            if (((n0) z0VarQ.getValue()).f) {
                z2 = true;
            } else {
                z2 = true;
            }
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            zG = g0Var.g(aVar3) | g0Var.i(cVar4) | g0Var.h(z2);
            Object objN13 = g0Var.N();
            if (zG) {
                i2Var = new i2(aVar3, cVar4, z2, cVar, 1);
                cVar2 = cVar4;
                g0Var.n0(i2Var);
            } else {
                i2Var = new i2(aVar3, cVar4, z2, cVar, 1);
                cVar2 = cVar4;
                g0Var.n0(i2Var);
            }
            l1.q.i(boolValueOf2, g0Var, (u00.n) i2Var);
            zI2 = g0Var.i(cVar2);
            objN2 = g0Var.N();
            if (zI2) {
                objN2 = new e1(cVar2, 13);
                g0Var.n0(objN2);
            } else {
                objN2 = new e1(cVar2, 13);
                g0Var.n0(objN2);
            }
            l1.q.e(b0Var, (u00.k) objN2, g0Var);
            zI3 = g0Var.i(cVar2) | g0Var.g(bVar2) | g0Var.i(context2);
            objN3 = g0Var.N();
            if (zI3) {
                context = context2;
                bVar3 = bVar2;
                objN3 = new a1.e2(cVar2, bVar3, context, cVar, 24);
                g0Var.n0(objN3);
            } else {
                context = context2;
                bVar3 = bVar2;
                objN3 = new a1.e2(cVar2, bVar3, context, cVar, 24);
                g0Var.n0(objN3);
            }
            l1.q.i(b0Var, g0Var, (u00.n) objN3);
            zI4 = g0Var.i(context) | ((i4 <= 4 && g0Var.g(t0Var2)) || (i2 & 6) == 4) | g0Var.i(xVar) | g0Var.i(eVar) | g0Var.g(aVar3);
            objN4 = g0Var.N();
            if (zI4) {
                aVar = aVar3;
                b0Var2 = b0Var;
                androidx.lifecycle.n0 n0Var2 = new androidx.lifecycle.n0(t0Var2, context, eVar, aVar, xVar, (k00.c) null, 2);
                g0Var.n0(n0Var2);
                objN4 = n0Var2;
            } else {
                aVar = aVar3;
                b0Var2 = b0Var;
                androidx.lifecycle.n0 n0Var3 = new androidx.lifecycle.n0(t0Var2, context, eVar, aVar, xVar, (k00.c) null, 2);
                g0Var.n0(n0Var3);
                objN4 = n0Var3;
            }
            l1.q.i(b0Var2, g0Var, (u00.n) objN4);
            t0Var2 = t0Var;
            final cu.a aVar5 = aVar;
            final ol.b bVar7 = bVar3;
            l1.q.a(ol.a.a.a(bVar3), v1.d.d(-50100251, new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    l1.g0 g0Var2 = (l1.j) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    l1.g0 g0Var3 = g0Var2;
                    if (g0Var3.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                        h0.a0 a0Var = z1.c;
                        z2.w0 w0VarD = h0.o.d(b2.b.A, false);
                        int iHashCode = Long.hashCode(g0Var3.T);
                        m1 m1VarM = g0Var3.m();
                        b2.r rVarC = b2.a.c(a0Var, g0Var2);
                        b3.i.c.getClass();
                        b3.g gVar = b3.h.b;
                        g0Var3.g0();
                        if (g0Var3.S) {
                            g0Var3.l(gVar);
                        } else {
                            g0Var3.q0();
                        }
                        l1.q.I(w0VarD, g0Var2, b3.h.f);
                        l1.q.I(m1VarM, g0Var2, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.g);
                        l1.q.E(g0Var2, b3.h.h);
                        l1.q.I(rVarC, g0Var2, b3.h.d);
                        cu.a aVar6 = aVar5;
                        z1.p pVar = aVar6.a;
                        boolean zG8 = g0Var3.g(aVar6);
                        Object objN14 = g0Var3.N();
                        l1.c cVar5 = l1.i.a;
                        if (zG8 || objN14 == cVar5) {
                            objN14 = new av.k(0, aVar6, cu.a.class, "navigateBack", "navigateBack()V", 0, 7);
                            g0Var3.n0(objN14);
                        }
                        p30.f.O(pVar, a0Var, null, (u00.a) ((a10.g) objN14), va.a.S(new p9.f[]{bi.b.N(g0Var2), p30.f.o0(g0Var2)}), null, null, null, null, aVarT, g0Var2, 48);
                        l1.z0 z0Var = z0VarQ;
                        boolean z3 = (!((n0) z0Var.getValue()).h || ((n0) z0Var.getValue()).f || ((n0) z0Var.getValue()).g) ? false : true;
                        final t0 t0Var3 = t0Var2;
                        boolean zG9 = g0Var3.g(t0Var3);
                        Object objN15 = g0Var3.N();
                        if (zG9 || objN15 == cVar5) {
                            final int i5 = 11;
                            objN15 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    int i110 = i5;
                                    t0 t0Var4 = t0Var3;
                                    switch (i110) {
                                        case 0:
                                            t0Var4.l(c.a);
                                            break;
                                        case 1:
                                            t0Var4.l(c.a);
                                            break;
                                        case 2:
                                            t0Var4.l(b.a);
                                            break;
                                        case 3:
                                            t0Var4.l(h.a);
                                            break;
                                        case 4:
                                            t0Var4.l(g.a);
                                            break;
                                        case 5:
                                            t0Var4.l(r.a);
                                            break;
                                        case 6:
                                            t0Var4.l(t.a);
                                            break;
                                        case 7:
                                            t0Var4.l(e.a);
                                            break;
                                        case 8:
                                            t0Var4.l(m.a);
                                            break;
                                        case 9:
                                            t0Var4.l(p.a);
                                            break;
                                        case 10:
                                            t0Var4.l(o.a);
                                            break;
                                        case 11:
                                            t0Var4.l(s.a);
                                            break;
                                        case 12:
                                            t0Var4.l(k.a);
                                            break;
                                        case 13:
                                            t0Var4.l(j.a);
                                            break;
                                        case 14:
                                            t0Var4.l(f.a);
                                            break;
                                        case 15:
                                            t0Var4.l(d.a);
                                            break;
                                        default:
                                            t0Var4.l(l.a);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            };
                            g0Var3.n0(objN15);
                        }
                        u00.a aVar7 = (u00.a) objN15;
                        boolean zG10 = g0Var3.g(t0Var3);
                        Object objN16 = g0Var3.N();
                        if (zG10 || objN16 == cVar5) {
                            final int i6 = 5;
                            objN16 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    int i110 = i6;
                                    t0 t0Var4 = t0Var3;
                                    switch (i110) {
                                        case 0:
                                            t0Var4.l(c.a);
                                            break;
                                        case 1:
                                            t0Var4.l(c.a);
                                            break;
                                        case 2:
                                            t0Var4.l(b.a);
                                            break;
                                        case 3:
                                            t0Var4.l(h.a);
                                            break;
                                        case 4:
                                            t0Var4.l(g.a);
                                            break;
                                        case 5:
                                            t0Var4.l(r.a);
                                            break;
                                        case 6:
                                            t0Var4.l(t.a);
                                            break;
                                        case 7:
                                            t0Var4.l(e.a);
                                            break;
                                        case 8:
                                            t0Var4.l(m.a);
                                            break;
                                        case 9:
                                            t0Var4.l(p.a);
                                            break;
                                        case 10:
                                            t0Var4.l(o.a);
                                            break;
                                        case 11:
                                            t0Var4.l(s.a);
                                            break;
                                        case 12:
                                            t0Var4.l(k.a);
                                            break;
                                        case 13:
                                            t0Var4.l(j.a);
                                            break;
                                        case 14:
                                            t0Var4.l(f.a);
                                            break;
                                        case 15:
                                            t0Var4.l(d.a);
                                            break;
                                        default:
                                            t0Var4.l(l.a);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            };
                            g0Var3.n0(objN16);
                        }
                        eu.b0.a(z3, aVar7, (u00.a) objN16, g0Var2, 0);
                        if (((n0) z0Var.getValue()).f) {
                            g0Var3.c0(-532357303);
                            boolean zG11 = g0Var3.g(t0Var3);
                            Object objN17 = g0Var3.N();
                            if (zG11 || objN17 == cVar5) {
                                final int i7 = 6;
                                objN17 = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        int i110 = i7;
                                        t0 t0Var4 = t0Var3;
                                        switch (i110) {
                                            case 0:
                                                t0Var4.l(c.a);
                                                break;
                                            case 1:
                                                t0Var4.l(c.a);
                                                break;
                                            case 2:
                                                t0Var4.l(b.a);
                                                break;
                                            case 3:
                                                t0Var4.l(h.a);
                                                break;
                                            case 4:
                                                t0Var4.l(g.a);
                                                break;
                                            case 5:
                                                t0Var4.l(r.a);
                                                break;
                                            case 6:
                                                t0Var4.l(t.a);
                                                break;
                                            case 7:
                                                t0Var4.l(e.a);
                                                break;
                                            case 8:
                                                t0Var4.l(m.a);
                                                break;
                                            case 9:
                                                t0Var4.l(p.a);
                                                break;
                                            case 10:
                                                t0Var4.l(o.a);
                                                break;
                                            case 11:
                                                t0Var4.l(s.a);
                                                break;
                                            case 12:
                                                t0Var4.l(k.a);
                                                break;
                                            case 13:
                                                t0Var4.l(j.a);
                                                break;
                                            case 14:
                                                t0Var4.l(f.a);
                                                break;
                                            case 15:
                                                t0Var4.l(d.a);
                                                break;
                                            default:
                                                t0Var4.l(l.a);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                };
                                g0Var3.n0(objN17);
                            }
                            eu.b0.b((u00.a) objN17, g0Var2, 0);
                            g0Var3.r(false);
                        } else if (((n0) z0Var.getValue()).g) {
                            g0Var3.c0(-532145511);
                            boolean zG12 = g0Var3.g(t0Var3);
                            Object objN18 = g0Var3.N();
                            if (zG12 || objN18 == cVar5) {
                                final int i8 = 7;
                                objN18 = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        int i110 = i8;
                                        t0 t0Var4 = t0Var3;
                                        switch (i110) {
                                            case 0:
                                                t0Var4.l(c.a);
                                                break;
                                            case 1:
                                                t0Var4.l(c.a);
                                                break;
                                            case 2:
                                                t0Var4.l(b.a);
                                                break;
                                            case 3:
                                                t0Var4.l(h.a);
                                                break;
                                            case 4:
                                                t0Var4.l(g.a);
                                                break;
                                            case 5:
                                                t0Var4.l(r.a);
                                                break;
                                            case 6:
                                                t0Var4.l(t.a);
                                                break;
                                            case 7:
                                                t0Var4.l(e.a);
                                                break;
                                            case 8:
                                                t0Var4.l(m.a);
                                                break;
                                            case 9:
                                                t0Var4.l(p.a);
                                                break;
                                            case 10:
                                                t0Var4.l(o.a);
                                                break;
                                            case 11:
                                                t0Var4.l(s.a);
                                                break;
                                            case 12:
                                                t0Var4.l(k.a);
                                                break;
                                            case 13:
                                                t0Var4.l(j.a);
                                                break;
                                            case 14:
                                                t0Var4.l(f.a);
                                                break;
                                            case 15:
                                                t0Var4.l(d.a);
                                                break;
                                            default:
                                                t0Var4.l(l.a);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                };
                                g0Var3.n0(objN18);
                            }
                            eu.a.b((u00.a) objN18, g0Var2, 0);
                            g0Var3.r(false);
                        } else {
                            g0Var3.c0(-531993673);
                            g0Var3.r(false);
                        }
                        boolean z4 = ((n0) z0Var.getValue()).i && !((n0) z0Var.getValue()).f;
                        bu.b bVar8 = ((n0) z0Var.getValue()).q;
                        bu.b bVar9 = ((n0) z0Var.getValue()).o;
                        bu.b bVar10 = ((n0) z0Var.getValue()).p;
                        boolean zG13 = g0Var3.g(t0Var3);
                        Object objN19 = g0Var3.N();
                        if (zG13 || objN19 == cVar5) {
                            final int i9 = 8;
                            objN19 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    int i110 = i9;
                                    t0 t0Var4 = t0Var3;
                                    switch (i110) {
                                        case 0:
                                            t0Var4.l(c.a);
                                            break;
                                        case 1:
                                            t0Var4.l(c.a);
                                            break;
                                        case 2:
                                            t0Var4.l(b.a);
                                            break;
                                        case 3:
                                            t0Var4.l(h.a);
                                            break;
                                        case 4:
                                            t0Var4.l(g.a);
                                            break;
                                        case 5:
                                            t0Var4.l(r.a);
                                            break;
                                        case 6:
                                            t0Var4.l(t.a);
                                            break;
                                        case 7:
                                            t0Var4.l(e.a);
                                            break;
                                        case 8:
                                            t0Var4.l(m.a);
                                            break;
                                        case 9:
                                            t0Var4.l(p.a);
                                            break;
                                        case 10:
                                            t0Var4.l(o.a);
                                            break;
                                        case 11:
                                            t0Var4.l(s.a);
                                            break;
                                        case 12:
                                            t0Var4.l(k.a);
                                            break;
                                        case 13:
                                            t0Var4.l(j.a);
                                            break;
                                        case 14:
                                            t0Var4.l(f.a);
                                            break;
                                        case 15:
                                            t0Var4.l(d.a);
                                            break;
                                        default:
                                            t0Var4.l(l.a);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            };
                            g0Var3.n0(objN19);
                        }
                        u00.a aVar8 = (u00.a) objN19;
                        boolean zG14 = g0Var3.g(t0Var3);
                        Object objN110 = g0Var3.N();
                        if (zG14 || objN110 == cVar5) {
                            objN110 = new e1(t0Var3, 12);
                            g0Var3.n0(objN110);
                        }
                        u00.k kVar = (u00.k) objN110;
                        boolean zG15 = g0Var3.g(t0Var3);
                        Object objN20 = g0Var3.N();
                        if (zG15 || objN20 == cVar5) {
                            final int i11 = 9;
                            objN20 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    int i110 = i11;
                                    t0 t0Var4 = t0Var3;
                                    switch (i110) {
                                        case 0:
                                            t0Var4.l(c.a);
                                            break;
                                        case 1:
                                            t0Var4.l(c.a);
                                            break;
                                        case 2:
                                            t0Var4.l(b.a);
                                            break;
                                        case 3:
                                            t0Var4.l(h.a);
                                            break;
                                        case 4:
                                            t0Var4.l(g.a);
                                            break;
                                        case 5:
                                            t0Var4.l(r.a);
                                            break;
                                        case 6:
                                            t0Var4.l(t.a);
                                            break;
                                        case 7:
                                            t0Var4.l(e.a);
                                            break;
                                        case 8:
                                            t0Var4.l(m.a);
                                            break;
                                        case 9:
                                            t0Var4.l(p.a);
                                            break;
                                        case 10:
                                            t0Var4.l(o.a);
                                            break;
                                        case 11:
                                            t0Var4.l(s.a);
                                            break;
                                        case 12:
                                            t0Var4.l(k.a);
                                            break;
                                        case 13:
                                            t0Var4.l(j.a);
                                            break;
                                        case 14:
                                            t0Var4.l(f.a);
                                            break;
                                        case 15:
                                            t0Var4.l(d.a);
                                            break;
                                        default:
                                            t0Var4.l(l.a);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            };
                            g0Var3.n0(objN20);
                        }
                        u00.a aVar9 = (u00.a) objN20;
                        w2 w2Var = aVarD0;
                        boolean zI6 = g0Var3.i(w2Var);
                        Object objN21 = g0Var3.N();
                        if (zI6 || objN21 == cVar5) {
                            objN21 = new h0(w2Var, 0);
                            g0Var3.n0(objN21);
                        }
                        u00.a aVar10 = (u00.a) objN21;
                        boolean zI7 = g0Var3.i(w2Var);
                        Object objN22 = g0Var3.N();
                        if (zI7 || objN22 == cVar5) {
                            objN22 = new h0(w2Var, 1);
                            g0Var3.n0(objN22);
                        }
                        u00.a aVar11 = (u00.a) objN22;
                        boolean zG16 = g0Var3.g(t0Var3);
                        Object objN23 = g0Var3.N();
                        if (zG16 || objN23 == cVar5) {
                            final int i12 = 10;
                            objN23 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    int i110 = i12;
                                    t0 t0Var4 = t0Var3;
                                    switch (i110) {
                                        case 0:
                                            t0Var4.l(c.a);
                                            break;
                                        case 1:
                                            t0Var4.l(c.a);
                                            break;
                                        case 2:
                                            t0Var4.l(b.a);
                                            break;
                                        case 3:
                                            t0Var4.l(h.a);
                                            break;
                                        case 4:
                                            t0Var4.l(g.a);
                                            break;
                                        case 5:
                                            t0Var4.l(r.a);
                                            break;
                                        case 6:
                                            t0Var4.l(t.a);
                                            break;
                                        case 7:
                                            t0Var4.l(e.a);
                                            break;
                                        case 8:
                                            t0Var4.l(m.a);
                                            break;
                                        case 9:
                                            t0Var4.l(p.a);
                                            break;
                                        case 10:
                                            t0Var4.l(o.a);
                                            break;
                                        case 11:
                                            t0Var4.l(s.a);
                                            break;
                                        case 12:
                                            t0Var4.l(k.a);
                                            break;
                                        case 13:
                                            t0Var4.l(j.a);
                                            break;
                                        case 14:
                                            t0Var4.l(f.a);
                                            break;
                                        case 15:
                                            t0Var4.l(d.a);
                                            break;
                                        default:
                                            t0Var4.l(l.a);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            };
                            g0Var3.n0(objN23);
                        }
                        eu.a.r(z4, bVar8, bVar9, bVar10, aVar8, kVar, aVar9, aVar10, aVar11, (u00.a) objN23, g0Var2, 0);
                        eu.a.t(0, g0Var2, ((n0) z0Var.getValue()).j);
                        boolean z5 = (!((n0) z0Var.getValue()).b || ((n0) z0Var.getValue()).f || ((n0) z0Var.getValue()).g || ((n0) z0Var.getValue()).h) ? false : true;
                        boolean zG17 = g0Var3.g(t0Var3);
                        Object objN24 = g0Var3.N();
                        if (zG17 || objN24 == cVar5) {
                            final int i13 = 12;
                            objN24 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    int i110 = i13;
                                    t0 t0Var4 = t0Var3;
                                    switch (i110) {
                                        case 0:
                                            t0Var4.l(c.a);
                                            break;
                                        case 1:
                                            t0Var4.l(c.a);
                                            break;
                                        case 2:
                                            t0Var4.l(b.a);
                                            break;
                                        case 3:
                                            t0Var4.l(h.a);
                                            break;
                                        case 4:
                                            t0Var4.l(g.a);
                                            break;
                                        case 5:
                                            t0Var4.l(r.a);
                                            break;
                                        case 6:
                                            t0Var4.l(t.a);
                                            break;
                                        case 7:
                                            t0Var4.l(e.a);
                                            break;
                                        case 8:
                                            t0Var4.l(m.a);
                                            break;
                                        case 9:
                                            t0Var4.l(p.a);
                                            break;
                                        case 10:
                                            t0Var4.l(o.a);
                                            break;
                                        case 11:
                                            t0Var4.l(s.a);
                                            break;
                                        case 12:
                                            t0Var4.l(k.a);
                                            break;
                                        case 13:
                                            t0Var4.l(j.a);
                                            break;
                                        case 14:
                                            t0Var4.l(f.a);
                                            break;
                                        case 15:
                                            t0Var4.l(d.a);
                                            break;
                                        default:
                                            t0Var4.l(l.a);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            };
                            g0Var3.n0(objN24);
                        }
                        u00.a aVar12 = (u00.a) objN24;
                        boolean zG18 = g0Var3.g(t0Var3);
                        Object objN25 = g0Var3.N();
                        if (zG18 || objN25 == cVar5) {
                            final int i14 = 13;
                            objN25 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    int i110 = i14;
                                    t0 t0Var4 = t0Var3;
                                    switch (i110) {
                                        case 0:
                                            t0Var4.l(c.a);
                                            break;
                                        case 1:
                                            t0Var4.l(c.a);
                                            break;
                                        case 2:
                                            t0Var4.l(b.a);
                                            break;
                                        case 3:
                                            t0Var4.l(h.a);
                                            break;
                                        case 4:
                                            t0Var4.l(g.a);
                                            break;
                                        case 5:
                                            t0Var4.l(r.a);
                                            break;
                                        case 6:
                                            t0Var4.l(t.a);
                                            break;
                                        case 7:
                                            t0Var4.l(e.a);
                                            break;
                                        case 8:
                                            t0Var4.l(m.a);
                                            break;
                                        case 9:
                                            t0Var4.l(p.a);
                                            break;
                                        case 10:
                                            t0Var4.l(o.a);
                                            break;
                                        case 11:
                                            t0Var4.l(s.a);
                                            break;
                                        case 12:
                                            t0Var4.l(k.a);
                                            break;
                                        case 13:
                                            t0Var4.l(j.a);
                                            break;
                                        case 14:
                                            t0Var4.l(f.a);
                                            break;
                                        case 15:
                                            t0Var4.l(d.a);
                                            break;
                                        default:
                                            t0Var4.l(l.a);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            };
                            g0Var3.n0(objN25);
                        }
                        u00.a aVar13 = (u00.a) objN25;
                        boolean zG19 = g0Var3.g(t0Var3);
                        Object objN26 = g0Var3.N();
                        if (zG19 || objN26 == cVar5) {
                            final int i15 = 14;
                            objN26 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    int i110 = i15;
                                    t0 t0Var4 = t0Var3;
                                    switch (i110) {
                                        case 0:
                                            t0Var4.l(c.a);
                                            break;
                                        case 1:
                                            t0Var4.l(c.a);
                                            break;
                                        case 2:
                                            t0Var4.l(b.a);
                                            break;
                                        case 3:
                                            t0Var4.l(h.a);
                                            break;
                                        case 4:
                                            t0Var4.l(g.a);
                                            break;
                                        case 5:
                                            t0Var4.l(r.a);
                                            break;
                                        case 6:
                                            t0Var4.l(t.a);
                                            break;
                                        case 7:
                                            t0Var4.l(e.a);
                                            break;
                                        case 8:
                                            t0Var4.l(m.a);
                                            break;
                                        case 9:
                                            t0Var4.l(p.a);
                                            break;
                                        case 10:
                                            t0Var4.l(o.a);
                                            break;
                                        case 11:
                                            t0Var4.l(s.a);
                                            break;
                                        case 12:
                                            t0Var4.l(k.a);
                                            break;
                                        case 13:
                                            t0Var4.l(j.a);
                                            break;
                                        case 14:
                                            t0Var4.l(f.a);
                                            break;
                                        case 15:
                                            t0Var4.l(d.a);
                                            break;
                                        default:
                                            t0Var4.l(l.a);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            };
                            g0Var3.n0(objN26);
                        }
                        u00.a aVar14 = (u00.a) objN26;
                        boolean zG20 = g0Var3.g(t0Var3);
                        Object objN27 = g0Var3.N();
                        if (zG20 || objN27 == cVar5) {
                            final int i16 = 15;
                            objN27 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    int i110 = i16;
                                    t0 t0Var4 = t0Var3;
                                    switch (i110) {
                                        case 0:
                                            t0Var4.l(c.a);
                                            break;
                                        case 1:
                                            t0Var4.l(c.a);
                                            break;
                                        case 2:
                                            t0Var4.l(b.a);
                                            break;
                                        case 3:
                                            t0Var4.l(h.a);
                                            break;
                                        case 4:
                                            t0Var4.l(g.a);
                                            break;
                                        case 5:
                                            t0Var4.l(r.a);
                                            break;
                                        case 6:
                                            t0Var4.l(t.a);
                                            break;
                                        case 7:
                                            t0Var4.l(e.a);
                                            break;
                                        case 8:
                                            t0Var4.l(m.a);
                                            break;
                                        case 9:
                                            t0Var4.l(p.a);
                                            break;
                                        case 10:
                                            t0Var4.l(o.a);
                                            break;
                                        case 11:
                                            t0Var4.l(s.a);
                                            break;
                                        case 12:
                                            t0Var4.l(k.a);
                                            break;
                                        case 13:
                                            t0Var4.l(j.a);
                                            break;
                                        case 14:
                                            t0Var4.l(f.a);
                                            break;
                                        case 15:
                                            t0Var4.l(d.a);
                                            break;
                                        default:
                                            t0Var4.l(l.a);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            };
                            g0Var3.n0(objN27);
                        }
                        eu.a.s(z5, aVar12, aVar13, aVar14, (u00.a) objN27, g0Var2, 0);
                        boolean z6 = ((n0) z0Var.getValue()).l && !((n0) z0Var.getValue()).f;
                        boolean zG21 = g0Var3.g(t0Var3);
                        Object objN28 = g0Var3.N();
                        if (zG21 || objN28 == cVar5) {
                            final int i17 = 16;
                            objN28 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    int i110 = i17;
                                    t0 t0Var4 = t0Var3;
                                    switch (i110) {
                                        case 0:
                                            t0Var4.l(c.a);
                                            break;
                                        case 1:
                                            t0Var4.l(c.a);
                                            break;
                                        case 2:
                                            t0Var4.l(b.a);
                                            break;
                                        case 3:
                                            t0Var4.l(h.a);
                                            break;
                                        case 4:
                                            t0Var4.l(g.a);
                                            break;
                                        case 5:
                                            t0Var4.l(r.a);
                                            break;
                                        case 6:
                                            t0Var4.l(t.a);
                                            break;
                                        case 7:
                                            t0Var4.l(e.a);
                                            break;
                                        case 8:
                                            t0Var4.l(m.a);
                                            break;
                                        case 9:
                                            t0Var4.l(p.a);
                                            break;
                                        case 10:
                                            t0Var4.l(o.a);
                                            break;
                                        case 11:
                                            t0Var4.l(s.a);
                                            break;
                                        case 12:
                                            t0Var4.l(k.a);
                                            break;
                                        case 13:
                                            t0Var4.l(j.a);
                                            break;
                                        case 14:
                                            t0Var4.l(f.a);
                                            break;
                                        case 15:
                                            t0Var4.l(d.a);
                                            break;
                                        default:
                                            t0Var4.l(l.a);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            };
                            g0Var3.n0(objN28);
                        }
                        u00.a aVar15 = (u00.a) objN28;
                        boolean zG22 = g0Var3.g(t0Var3);
                        Object objN29 = g0Var3.N();
                        if (zG22 || objN29 == cVar5) {
                            final int i18 = 0;
                            objN29 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    int i110 = i18;
                                    t0 t0Var4 = t0Var3;
                                    switch (i110) {
                                        case 0:
                                            t0Var4.l(c.a);
                                            break;
                                        case 1:
                                            t0Var4.l(c.a);
                                            break;
                                        case 2:
                                            t0Var4.l(b.a);
                                            break;
                                        case 3:
                                            t0Var4.l(h.a);
                                            break;
                                        case 4:
                                            t0Var4.l(g.a);
                                            break;
                                        case 5:
                                            t0Var4.l(r.a);
                                            break;
                                        case 6:
                                            t0Var4.l(t.a);
                                            break;
                                        case 7:
                                            t0Var4.l(e.a);
                                            break;
                                        case 8:
                                            t0Var4.l(m.a);
                                            break;
                                        case 9:
                                            t0Var4.l(p.a);
                                            break;
                                        case 10:
                                            t0Var4.l(o.a);
                                            break;
                                        case 11:
                                            t0Var4.l(s.a);
                                            break;
                                        case 12:
                                            t0Var4.l(k.a);
                                            break;
                                        case 13:
                                            t0Var4.l(j.a);
                                            break;
                                        case 14:
                                            t0Var4.l(f.a);
                                            break;
                                        case 15:
                                            t0Var4.l(d.a);
                                            break;
                                        default:
                                            t0Var4.l(l.a);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            };
                            g0Var3.n0(objN29);
                        }
                        u00.a aVar16 = (u00.a) objN29;
                        boolean zG23 = g0Var3.g(t0Var3);
                        Object objN30 = g0Var3.N();
                        if (zG23 || objN30 == cVar5) {
                            final int i19 = 1;
                            objN30 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    int i110 = i19;
                                    t0 t0Var4 = t0Var3;
                                    switch (i110) {
                                        case 0:
                                            t0Var4.l(c.a);
                                            break;
                                        case 1:
                                            t0Var4.l(c.a);
                                            break;
                                        case 2:
                                            t0Var4.l(b.a);
                                            break;
                                        case 3:
                                            t0Var4.l(h.a);
                                            break;
                                        case 4:
                                            t0Var4.l(g.a);
                                            break;
                                        case 5:
                                            t0Var4.l(r.a);
                                            break;
                                        case 6:
                                            t0Var4.l(t.a);
                                            break;
                                        case 7:
                                            t0Var4.l(e.a);
                                            break;
                                        case 8:
                                            t0Var4.l(m.a);
                                            break;
                                        case 9:
                                            t0Var4.l(p.a);
                                            break;
                                        case 10:
                                            t0Var4.l(o.a);
                                            break;
                                        case 11:
                                            t0Var4.l(s.a);
                                            break;
                                        case 12:
                                            t0Var4.l(k.a);
                                            break;
                                        case 13:
                                            t0Var4.l(j.a);
                                            break;
                                        case 14:
                                            t0Var4.l(f.a);
                                            break;
                                        case 15:
                                            t0Var4.l(d.a);
                                            break;
                                        default:
                                            t0Var4.l(l.a);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            };
                            g0Var3.n0(objN30);
                        }
                        eu.q.a(z6, aVar15, aVar16, (u00.a) objN30, m6VarF, g0Var2, 0, 0);
                        bi.b.b((hp.b) null, (rp.o) null, (AuthAnalytics) null, g0Var2, 0);
                        ep.k kVar2 = ((n0) z0Var.getValue()).m;
                        boolean zG24 = g0Var3.g(t0Var3);
                        Object objN31 = g0Var3.N();
                        if (zG24 || objN31 == cVar5) {
                            final int i21 = 2;
                            objN31 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    int i110 = i21;
                                    t0 t0Var4 = t0Var3;
                                    switch (i110) {
                                        case 0:
                                            t0Var4.l(c.a);
                                            break;
                                        case 1:
                                            t0Var4.l(c.a);
                                            break;
                                        case 2:
                                            t0Var4.l(b.a);
                                            break;
                                        case 3:
                                            t0Var4.l(h.a);
                                            break;
                                        case 4:
                                            t0Var4.l(g.a);
                                            break;
                                        case 5:
                                            t0Var4.l(r.a);
                                            break;
                                        case 6:
                                            t0Var4.l(t.a);
                                            break;
                                        case 7:
                                            t0Var4.l(e.a);
                                            break;
                                        case 8:
                                            t0Var4.l(m.a);
                                            break;
                                        case 9:
                                            t0Var4.l(p.a);
                                            break;
                                        case 10:
                                            t0Var4.l(o.a);
                                            break;
                                        case 11:
                                            t0Var4.l(s.a);
                                            break;
                                        case 12:
                                            t0Var4.l(k.a);
                                            break;
                                        case 13:
                                            t0Var4.l(j.a);
                                            break;
                                        case 14:
                                            t0Var4.l(f.a);
                                            break;
                                        case 15:
                                            t0Var4.l(d.a);
                                            break;
                                        default:
                                            t0Var4.l(l.a);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            };
                            g0Var3.n0(objN31);
                        }
                        eu.a.a(kVar2, (u00.a) objN31, g0Var2, 0);
                        boolean z7 = (!((n0) z0Var.getValue()).n || ((n0) z0Var.getValue()).f || ((n0) z0Var.getValue()).g) ? false : true;
                        boolean zG25 = g0Var3.g(t0Var3);
                        Object objN32 = g0Var3.N();
                        if (zG25 || objN32 == cVar5) {
                            final int i22 = 3;
                            objN32 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    int i110 = i22;
                                    t0 t0Var4 = t0Var3;
                                    switch (i110) {
                                        case 0:
                                            t0Var4.l(c.a);
                                            break;
                                        case 1:
                                            t0Var4.l(c.a);
                                            break;
                                        case 2:
                                            t0Var4.l(b.a);
                                            break;
                                        case 3:
                                            t0Var4.l(h.a);
                                            break;
                                        case 4:
                                            t0Var4.l(g.a);
                                            break;
                                        case 5:
                                            t0Var4.l(r.a);
                                            break;
                                        case 6:
                                            t0Var4.l(t.a);
                                            break;
                                        case 7:
                                            t0Var4.l(e.a);
                                            break;
                                        case 8:
                                            t0Var4.l(m.a);
                                            break;
                                        case 9:
                                            t0Var4.l(p.a);
                                            break;
                                        case 10:
                                            t0Var4.l(o.a);
                                            break;
                                        case 11:
                                            t0Var4.l(s.a);
                                            break;
                                        case 12:
                                            t0Var4.l(k.a);
                                            break;
                                        case 13:
                                            t0Var4.l(j.a);
                                            break;
                                        case 14:
                                            t0Var4.l(f.a);
                                            break;
                                        case 15:
                                            t0Var4.l(d.a);
                                            break;
                                        default:
                                            t0Var4.l(l.a);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            };
                            g0Var3.n0(objN32);
                        }
                        u00.a aVar17 = (u00.a) objN32;
                        boolean zG26 = g0Var3.g(t0Var3);
                        Object objN33 = g0Var3.N();
                        if (zG26 || objN33 == cVar5) {
                            final int i23 = 4;
                            objN33 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    int i110 = i23;
                                    t0 t0Var4 = t0Var3;
                                    switch (i110) {
                                        case 0:
                                            t0Var4.l(c.a);
                                            break;
                                        case 1:
                                            t0Var4.l(c.a);
                                            break;
                                        case 2:
                                            t0Var4.l(b.a);
                                            break;
                                        case 3:
                                            t0Var4.l(h.a);
                                            break;
                                        case 4:
                                            t0Var4.l(g.a);
                                            break;
                                        case 5:
                                            t0Var4.l(r.a);
                                            break;
                                        case 6:
                                            t0Var4.l(t.a);
                                            break;
                                        case 7:
                                            t0Var4.l(e.a);
                                            break;
                                        case 8:
                                            t0Var4.l(m.a);
                                            break;
                                        case 9:
                                            t0Var4.l(p.a);
                                            break;
                                        case 10:
                                            t0Var4.l(o.a);
                                            break;
                                        case 11:
                                            t0Var4.l(s.a);
                                            break;
                                        case 12:
                                            t0Var4.l(k.a);
                                            break;
                                        case 13:
                                            t0Var4.l(j.a);
                                            break;
                                        case 14:
                                            t0Var4.l(f.a);
                                            break;
                                        case 15:
                                            t0Var4.l(d.a);
                                            break;
                                        default:
                                            t0Var4.l(l.a);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            };
                            g0Var3.n0(objN33);
                        }
                        eu.a.c(z7, aVar17, (u00.a) objN33, g0Var2, 0);
                        ol.a.a(bVar7, h0.s.a.a(b2.o.A, b2.b.B), g0Var2, 0);
                        g0Var3.r(true);
                    } else {
                        g0Var3.V();
                    }
                    return g00.b0.a;
                }
            }, g0Var), g0Var, 56);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new y1(t0Var2, i, 11);
        }
    }

    public static final void N(ArrayList arrayList, b2.r rVar, b2.d dVar, sg.f fVar, u00.k kVar, u00.k kVar2, u00.n nVar, u00.a aVar, l1.j jVar, int i) {
        int i2;
        final int i3;
        List list;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1483975592);
        if ((i & 6) == 0) {
            i2 = (g0Var.i(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.g(rVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.g(dVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= g0Var.g(fVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= g0Var.i((Object) null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= g0Var.i(kVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= g0Var.i(kVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= g0Var.i(nVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= g0Var.i(aVar) ? 67108864 : 33554432;
        }
        int i4 = 0;
        if (g0Var.S(i2 & 1, (38347923 & i2) != 38347922)) {
            g0Var.X();
            if ((i & 1) != 0 && !g0Var.A()) {
                g0Var.V();
            }
            g0Var.s();
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("NavDisplay entries cannot be empty");
            }
            int i5 = (i2 & 14) | ((i2 >> 6) & 112) | ((i2 >> 18) & 896);
            g0Var.c0(-193177615);
            l1.t tVar = q9.f.a;
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (objN == cVar) {
                z1.s sVar = new z1.s();
                i3 = 1;
                objN = new q9.e(new q0.a(sVar, 5), new v1.c(new a1.w(sVar, 16), -1714993007, true));
                g0Var.n0(objN);
            } else {
                i3 = 1;
            }
            int i6 = i5 & 14;
            final l1.z0 z0VarG = l1.q.G(arrayList, g0Var);
            p9.f fVar2 = new p9.f(new c0(21), v1.d.d(1077673004, new u00.o() {
                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.lifecycle.p pVar;
                    switch (i3) {
                        case 0:
                            j0.b item = (j0.b) obj;
                            l1.g0 g0Var2 = (l1.j) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            kotlin.jvm.internal.m.e(item, "$this$item");
                            l1.g0 g0Var3 = g0Var2;
                            if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                l1.z0 z0Var = z0VarG;
                                iz.d.t(((g1) z0Var.getValue()).a, ((g1) z0Var.getValue()).b, h0.c.E(b2.o.A, 0.0f, 20, 1), g0Var2, 384);
                            } else {
                                g0Var3.V();
                            }
                            break;
                        default:
                            p9.e eVar = (p9.e) obj;
                            l1.g0 g0Var4 = (l1.j) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= g0Var4.g(eVar) ? 4 : 2;
                            }
                            int i7 = 0;
                            l1.g0 g0Var5 = g0Var4;
                            if (g0Var5.S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                List list2 = (List) z0VarG.getValue();
                                boolean z = (iIntValue2 & 14) == 4;
                                Object objN2 = g0Var5.N();
                                if (z || objN2 == l1.i.a) {
                                    objN2 = new q0.a(eVar, 4);
                                    g0Var5.n0(objN2);
                                }
                                u00.k kVar3 = (u00.k) objN2;
                                if (list2 instanceof RandomAccess) {
                                    int size = list2.size();
                                    while (true) {
                                        if (i7 >= size) {
                                            pVar = androidx.lifecycle.p.C;
                                        } else if (((Boolean) kVar3.invoke(list2.get(i7))).booleanValue()) {
                                            pVar = androidx.lifecycle.p.E;
                                        } else {
                                            i7++;
                                        }
                                    }
                                } else {
                                    if (list2 == null || !list2.isEmpty()) {
                                        Iterator it = list2.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if (((Boolean) kVar3.invoke(it.next())).booleanValue()) {
                                                    pVar = androidx.lifecycle.p.E;
                                                }
                                            }
                                        }
                                    }
                                    pVar = androidx.lifecycle.p.C;
                                }
                                l1.q.a(r6.d.a.a(kh.o.M(pVar, g0Var4)), v1.d.d(-1713684244, new cq.k(eVar, 3, (byte) 0), g0Var4), g0Var4, 56);
                            } else {
                                g0Var5.V();
                            }
                            break;
                    }
                    return g00.b0.a;
                }
            }, g0Var));
            p9.f[] fVarArr = new p9.f[2];
            fVarArr[0] = (q9.e) objN;
            fVarArr[i3] = fVar2;
            ArrayList arrayListX0 = ab.a0.x0(arrayList, va.a.S(fVarArr), g0Var, i6);
            fVar.getClass();
            ArrayList arrayListW = va.a.W(new q9.c[]{new q9.h(((p9.e) h00.q.T0(arrayListX0)).b, (p9.e) h00.q.T0(arrayListX0), h00.q.I0(arrayListX0))});
            h00.q.T0(arrayListW);
            List listI0 = h00.q.I0(arrayListW);
            ArrayList arrayList2 = new ArrayList(listI0.size());
            int size = listI0.size();
            int i7 = 0;
            while (i7 < size) {
                ArrayList arrayList3 = arrayListW;
                q9.b bVar = (q9.c) listI0.get(i7);
                kotlin.jvm.internal.m.c(bVar, "null cannot be cast to non-null type androidx.navigation3.scene.OverlayScene<T of androidx.navigation3.scene.SceneStateKt.rememberSceneState>");
                arrayList2.add(bVar);
                i7++;
                listI0 = listI0;
                arrayListW = arrayList3;
            }
            ArrayList arrayList4 = arrayListW;
            q9.c cVar2 = (q9.c) h00.q.T0(arrayList4);
            ArrayList arrayListW2 = va.a.W(new q9.c[]{h00.q.L0(arrayList4)});
            while (true) {
                q9.c cVar3 = (q9.c) h00.q.N0(arrayListW2);
                List listA = cVar3 != null ? cVar3.a() : null;
                if (listA == null || listA.isEmpty()) {
                    list = listA;
                } else {
                    list = listA;
                    arrayListW2.add(i4, new q9.h(((p9.e) h00.q.T0(listA)).b, (p9.e) h00.q.T0(list), h00.q.I0(list)));
                }
                if (list == null || list.isEmpty()) {
                    break;
                } else {
                    i4 = 0;
                }
            }
            arrayListW2.remove(cVar2);
            q9.g gVar = new q9.g(arrayListX0, arrayList2, cVar2, arrayListW2);
            g0Var.r(false);
            q9.d dVar2 = new q9.d(cVar2);
            ArrayList arrayList5 = new ArrayList(h00.r.q0(arrayListW2, 10));
            Iterator it = arrayListW2.iterator();
            while (it.hasNext()) {
                arrayList5.add(new q9.d((q9.c) it.next()));
            }
            Object objN2 = g0Var.N();
            h00.x xVar = h00.x.A;
            if (objN2 == cVar) {
                objN2 = new t9.d(dVar2, arrayList5, xVar);
                g0Var.n0(objN2);
            }
            t9.d dVar3 = (t9.d) objN2;
            boolean zI = g0Var.i(dVar2) | g0Var.i(arrayList5) | g0Var.i(xVar);
            Object objN3 = g0Var.N();
            if (zI || objN3 == cVar) {
                objN3 = new ct.m(dVar3, dVar2, arrayList5, xVar, 8);
                g0Var.n0(objN3);
            }
            l1.q.k((u00.a) objN3, g0Var);
            boolean z = !cVar2.a().isEmpty();
            boolean zI2 = g0Var.i(arrayList) | g0Var.g(cVar2) | ((i2 & 234881024) == 67108864);
            Object objN4 = g0Var.N();
            if (zI2 || objN4 == cVar) {
                objN4 = new d0.g(arrayList, cVar2, aVar, 11);
                g0Var.n0(objN4);
            }
            w00.a.d(dVar3, z, null, (u00.a) objN4, g0Var, 0);
            P(gVar, dVar3, rVar, dVar, kVar, kVar2, nVar, g0Var, ((i2 << 3) & 8064) | (i2 & 57344) | (i2 & 458752) | (i2 & 3670016) | (i2 & 29360128));
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new r9.c(arrayList, rVar, dVar, fVar, kVar, kVar2, nVar, aVar, i);
        }
    }

    public static final void O(List list, b2.r rVar, b2.d dVar, u00.a aVar, List list2, sg.f fVar, u00.k kVar, u00.k kVar2, u00.n nVar, u00.k kVar3, l1.j jVar, int i) {
        l1.j jVar2;
        b2.d dVar2;
        sg.f fVar2;
        u00.k kVar4;
        u00.k kVar5;
        u00.n nVar2;
        int i2;
        u00.k eVar;
        u00.k eVar2;
        u00.n cVar;
        b2.d dVar3;
        sg.f fVar3;
        ArrayList arrayList;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(807086421);
        int i3 = i | (jVar3.i(list) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= jVar3.g(rVar) ? 32 : 16;
        }
        int i4 = i3 | 384 | (jVar3.i(aVar) ? 2048 : 1024) | (jVar3.i(list2) ? 16384 : 8192) | 307822592;
        int i5 = jVar3.i(kVar3) ? 4 : 2;
        if (jVar3.S(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            jVar3.X();
            if ((i & 1) == 0 || jVar3.A()) {
                b2.d dVar4 = b2.b.A;
                sg.f fVar4 = new sg.f();
                i2 = i4 & (-2143748097);
                eVar = new r9.e(1);
                eVar2 = new r9.e(2);
                cVar = new qs.c(18);
                dVar3 = dVar4;
                fVar3 = fVar4;
            } else {
                jVar3.V();
                i2 = i4 & (-2143748097);
                dVar3 = dVar;
                fVar3 = fVar;
                eVar = kVar;
                eVar2 = kVar2;
                cVar = nVar;
            }
            jVar3.s();
            if (list.isEmpty()) {
                throw new IllegalArgumentException("NavDisplay backstack cannot be empty");
            }
            int i6 = ((i5 << 6) & 896) | (i2 & 14) | ((i2 >> 9) & 112);
            boolean zG = jVar3.g(h00.q.n1(list));
            Object objN = jVar3.N();
            if (zG || objN == l1.i.a) {
                if (list instanceof RandomAccess) {
                    arrayList = new ArrayList(list.size());
                    int size = list.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        arrayList.add((p9.e) kVar3.invoke(list.get(i7)));
                    }
                } else {
                    arrayList = new ArrayList(h00.r.q0(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add((p9.e) kVar3.invoke(it.next()));
                    }
                }
                objN = arrayList;
                jVar3.n0(objN);
            }
            jVar2 = jVar3;
            N(ab.a0.x0((List) objN, list2, jVar3, i6 & 112), rVar, dVar3, fVar3, eVar, eVar2, cVar, aVar, jVar2, (i2 & 1008) | 24576 | ((i2 << 15) & 234881024));
            dVar2 = dVar3;
            fVar2 = fVar3;
            kVar4 = eVar;
            kVar5 = eVar2;
            nVar2 = cVar;
        } else {
            jVar2 = jVar3;
            jVar2.V();
            dVar2 = dVar;
            fVar2 = fVar;
            kVar4 = kVar;
            kVar5 = kVar2;
            nVar2 = nVar;
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new r9.b(list, rVar, dVar2, aVar, list2, fVar2, kVar4, kVar5, nVar2, kVar3, i);
        }
    }

    public static final void P(q9.g gVar, t9.d dVar, b2.r rVar, b2.d dVar2, u00.k kVar, u00.k kVar2, u00.n nVar, l1.j jVar, int i) {
        l1.j jVar2;
        float f;
        int i2;
        Object next;
        boolean z;
        float f2;
        int i3;
        boolean z2;
        q9.c cVar;
        x.n1 n1Var;
        boolean z3;
        u00.n nVar2;
        boolean z4;
        u00.k kVar3;
        boolean z5;
        u00.k kVar4;
        boolean z6;
        boolean z7;
        Object objN;
        boolean zG;
        Object objN2;
        Object obj;
        int i4;
        Object objN3;
        x.n1 n1Var2;
        boolean zG2;
        Object objN4;
        ?? r18;
        int size;
        q9.c cVar2;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(-303833701);
        int i5 = (i & 6) == 0 ? (jVar3.g(gVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= jVar3.g(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= jVar3.g(rVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= jVar3.g(dVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= jVar3.i((Object) null) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i5 |= jVar3.i(kVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i5 |= jVar3.i(kVar2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i5 |= jVar3.i(nVar) ? 8388608 : 4194304;
        }
        if (jVar3.S(i5 & 1, (4793491 & i5) != 4793490)) {
            jVar3.X();
            if ((i & 1) != 0 && !jVar3.A()) {
                jVar3.V();
            }
            jVar3.s();
            q9.c cVar3 = gVar.c;
            ArrayList arrayList = gVar.a;
            Object objN5 = jVar3.N();
            l1.c cVar4 = l1.i.a;
            if (objN5 == cVar4) {
                objN5 = new y0(cVar3);
                jVar3.n0(objN5);
            }
            y0 y0Var = (y0) objN5;
            x.n1 n1VarT = x.c.t(y0Var, "scene", jVar3, 56, 0);
            f5.c cVar5 = n1VarT.a;
            l1.i1 i1Var = n1VarT.d;
            boolean zG3 = jVar3.g((q9.c) cVar5.J0());
            Object objN6 = jVar3.N();
            if (zG3 || objN6 == cVar4) {
                objN6 = h00.q.n1(arrayList);
                jVar3.n0(objN6);
            }
            List list = (List) objN6;
            int i6 = i5;
            q9.c cVar6 = (q9.c) h00.q.U0(gVar.d);
            s9.k kVar5 = (s9.l) dVar.a.getValue();
            boolean z8 = kVar5 instanceof s9.k;
            boolean z9 = z8 && cVar6 != null;
            boolean z11 = kVar5 instanceof s9.j;
            if (z11) {
                f = 0.0f;
            } else {
                if (z8 == 0) {
                    throw new NoWhenBranchMatchedException();
                }
                f = kVar5.a.b;
            }
            if (z11) {
                i2 = 2;
            } else {
                if (!z8) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = kVar5.a.a;
            }
            ArrayList arrayList2 = new ArrayList(h00.r.q0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((p9.e) it.next()).b);
            }
            ArrayList arrayList3 = new ArrayList(h00.r.q0(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((p9.e) it2.next()).b);
            }
            if (kotlin.jvm.internal.m.a(h00.q.L0(arrayList2), h00.q.L0(arrayList3)) && arrayList3.size() <= arrayList2.size()) {
                Iterator it3 = va.a.L(arrayList3).iterator();
                while (true) {
                    z00.d dVar3 = (z00.d) it3;
                    if (!dVar3.C) {
                        next = null;
                        break;
                    }
                    next = dVar3.next();
                    int iIntValue = ((Number) next).intValue();
                    Iterator it4 = it3;
                    if (!kotlin.jvm.internal.m.a(arrayList3.get(iIntValue), arrayList2.get(iIntValue))) {
                        break;
                    } else {
                        it3 = it4;
                    }
                }
                if (((Integer) next) != null || arrayList3.size() == arrayList2.size()) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            Object objN7 = jVar3.N();
            if (objN7 == cVar4) {
                objN7 = new z1.s();
                jVar3.n0(objN7);
            }
            z1.s sVar = (z1.s) objN7;
            Object objN8 = jVar3.N();
            if (objN8 == cVar4) {
                int i7 = u.m0.a;
                objN8 = new u.b0(6);
                jVar3.n0(objN8);
            }
            u.b0 b0Var = (u.b0) objN8;
            Class<?> cls = cVar5.J0().getClass();
            kotlin.jvm.internal.b0 b0Var2 = kotlin.jvm.internal.a0.a;
            boolean z12 = z;
            g00.k kVar6 = new g00.k(b0Var2.b(cls), ((q9.c) cVar5.J0()).getKey());
            g00.k kVar7 = new g00.k(b0Var2.b(i1Var.getValue().getClass()), ((q9.c) i1Var.getValue()).getKey());
            int iB = b0Var.b(kVar6);
            if (iB >= 0) {
                f2 = b0Var.c[iB];
            } else {
                f2 = 0.0f;
                b0Var.e(kVar6, 0.0f);
            }
            float f3 = kVar6.equals(kVar7) ? f2 : (z12 || z9) ? f2 - 1.0f : 1.0f + f2;
            sVar.put(kVar7, i1Var.getValue());
            z1.m mVar = sVar.B;
            b0Var.e(kVar7, f3);
            ArrayList arrayList4 = gVar.b;
            float f4 = f2;
            float f5 = f3;
            boolean zG4 = jVar3.g(h00.q.n1(mVar)) | jVar3.g(h00.q.n1(arrayList4)) | jVar3.g(b0Var.toString());
            Object objN9 = jVar3.N();
            if (zG4 || objN9 == cVar4) {
                i00.f fVar = new i00.f();
                ArrayList arrayList5 = new ArrayList();
                List listI1 = h00.q.i1(mVar, new ay.b(b0Var, 12));
                ArrayList<q9.c> arrayList6 = new ArrayList(h00.r.q0(listI1, 10));
                Iterator it5 = listI1.iterator();
                while (it5.hasNext()) {
                    arrayList6.add((q9.c) ((Map.Entry) it5.next()).getValue());
                }
                for (q9.c cVar7 : arrayList6) {
                    if (!arrayList5.contains(cVar7)) {
                        arrayList5.add(cVar7);
                    }
                }
                ArrayList arrayListY0 = h00.q.Y0(arrayList5, arrayList4);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int size2 = arrayListY0.size();
                int i8 = 0;
                while (i8 < size2) {
                    q9.c cVar8 = (q9.c) arrayListY0.get(i8);
                    ArrayList arrayList7 = arrayListY0;
                    List listD = cVar8.d();
                    int i9 = size2;
                    int i11 = i8;
                    ArrayList arrayList8 = new ArrayList(h00.r.q0(listD, 10));
                    Iterator it6 = listD.iterator();
                    while (it6.hasNext()) {
                        arrayList8.add(((p9.e) it6.next()).b);
                    }
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj2 : arrayList8) {
                        if (!linkedHashSet.contains(obj2)) {
                            arrayList9.add(obj2);
                        }
                    }
                    Set setR1 = h00.q.r1(arrayList9);
                    fVar.put(new g00.k(kotlin.jvm.internal.a0.a.b(cVar8.getClass()), cVar8.getKey()), h00.q.q1(linkedHashSet));
                    linkedHashSet.addAll(setR1);
                    i8 = i11 + 1;
                    arrayListY0 = arrayList7;
                    size2 = i9;
                }
                objN9 = fVar.c();
                jVar3.n0(objN9);
            }
            Map map = (Map) objN9;
            q9.c cVar9 = f4 >= f5 ? (q9.c) cVar5.J0() : (q9.c) i1Var.getValue();
            if (z9) {
                jVar3.c0(-2007902955);
                if (kotlin.jvm.internal.m.a(cVar5.J0(), cVar6)) {
                    arrayList4 = arrayList4;
                    i3 = 131072;
                    z3 = false;
                    z2 = false;
                    jVar3.c0(-2030319737);
                } else {
                    jVar3.c0(-2007849325);
                    Float fValueOf = Float.valueOf(f);
                    boolean zI = jVar3.i(y0Var) | jVar3.d(f) | jVar3.g(cVar6);
                    Object objN10 = jVar3.N();
                    if (zI || objN10 == cVar4) {
                        i3 = 131072;
                        z2 = false;
                        f1.g gVar2 = new f1.g(y0Var, f, cVar6, (k00.c) null, 2);
                        cVar2 = cVar6;
                        jVar3.n0(gVar2);
                        objN10 = gVar2;
                    } else {
                        cVar2 = cVar6;
                        i3 = 131072;
                        z2 = false;
                    }
                    l1.q.h(cVar2, fValueOf, (u00.n) objN10, jVar3);
                    z3 = false;
                }
                jVar3.r(z3);
                jVar3.r(z3);
                n1Var = n1VarT;
            } else {
                arrayList4 = arrayList4;
                i3 = 131072;
                z2 = false;
                jVar3.c0(-2007567752);
                boolean zI2 = jVar3.i(y0Var) | jVar3.g(cVar3) | jVar3.g(n1VarT);
                Object objN11 = jVar3.N();
                if (zI2 || objN11 == cVar4) {
                    l6.v vVar = new l6.v(y0Var, cVar3, n1VarT, (k00.c) null, 6);
                    cVar = cVar3;
                    n1Var = n1VarT;
                    jVar3.n0(vVar);
                    objN11 = vVar;
                } else {
                    cVar = cVar3;
                    n1Var = n1VarT;
                }
                l1.q.i(cVar, jVar3, (u00.n) objN11);
                z3 = false;
                jVar3.r(false);
            }
            boolean zH = jVar3.h(z9) | jVar3.g(cVar9) | jVar3.e(i2);
            if (((i6 & 29360128) ^ 12582912) > 8388608) {
                nVar2 = nVar;
                if (jVar3.g(nVar2)) {
                    z4 = true;
                }
                boolean zH2 = zH | z4 | jVar3.h(z12);
                if (((i6 & 3670016) ^ 1572864) > 1048576) {
                    kVar3 = kVar2;
                    if (!jVar3.g(kVar3)) {
                        z5 = true;
                    }
                    boolean z13 = zH2 | z5;
                    if (((i6 & 458752) ^ 196608) > i3) {
                        kVar4 = kVar;
                        if (!jVar3.g(kVar4)) {
                            z6 = true;
                        }
                        z7 = z6 | z13;
                        objN = jVar3.N();
                        if (z7 || objN == cVar4) {
                            r9.d dVar4 = new r9.d(z9, cVar9, i2, nVar2, z12, kVar3, kVar4);
                            jVar3.n0(dVar4);
                            objN = dVar4;
                        }
                        u00.k kVar8 = (u00.k) objN;
                        zG = jVar3.g(kVar8) | jVar3.d(f5) | jVar3.i(z2);
                        objN2 = jVar3.N();
                        if (zG) {
                            obj = cVar4;
                        } else {
                            obj = cVar4;
                            if (objN2 == obj) {
                                i4 = 1;
                            }
                            u00.k kVar9 = (u00.k) objN2;
                            objN3 = jVar3.N();
                            if (objN3 == obj) {
                                objN3 = new r9.e(0);
                                jVar3.n0(objN3);
                            }
                            Object obj3 = obj;
                            jVar2 = jVar3;
                            n1Var2 = n1Var;
                            w.m.b(n1Var2, rVar, kVar9, dVar2, (u00.k) objN3, v1.d.d(-1167420988, new iv.c(n1Var, map, i4), jVar3), jVar2, ((i6 >> 3) & 112) | 221184 | (i6 & 7168));
                            zG2 = jVar2.g(n1Var2) | jVar2.i(b0Var);
                            objN4 = jVar2.N();
                            if (!zG2 || objN4 == obj3) {
                                ?? r19 = z2;
                                pz.k kVar10 = new pz.k(n1Var2, sVar, b0Var, r19, 4);
                                jVar2.n0(kVar10);
                                objN4 = kVar10;
                                r18 = r19;
                            } else {
                                r18 = z2;
                            }
                            l1.q.i(n1Var2, jVar2, (u00.n) objN4);
                            size = arrayList4.size() - 1;
                            if (size >= 0) {
                                if (arrayList4.get(size) == null) {
                                    throw new ClassCastException();
                                }
                                l1.t tVar = q9.f.a;
                                throw r18;
                            }
                        }
                        i4 = 1;
                        objN2 = new kz.c(kVar8, f5, i4);
                        jVar3.n0(objN2);
                        u00.k kVar11 = (u00.k) objN2;
                        objN3 = jVar3.N();
                        if (objN3 == obj) {
                            objN3 = new r9.e(0);
                            jVar3.n0(objN3);
                        }
                        Object obj4 = obj;
                        jVar2 = jVar3;
                        n1Var2 = n1Var;
                        w.m.b(n1Var2, rVar, kVar11, dVar2, (u00.k) objN3, v1.d.d(-1167420988, new iv.c(n1Var, map, i4), jVar3), jVar2, ((i6 >> 3) & 112) | 221184 | (i6 & 7168));
                        zG2 = jVar2.g(n1Var2) | jVar2.i(b0Var);
                        objN4 = jVar2.N();
                        if (zG2) {
                            ?? r110 = z2;
                            pz.k kVar12 = new pz.k(n1Var2, sVar, b0Var, r110, 4);
                            jVar2.n0(kVar12);
                            objN4 = kVar12;
                            r18 = r110;
                        } else {
                            ?? r111 = z2;
                            pz.k kVar13 = new pz.k(n1Var2, sVar, b0Var, r111, 4);
                            jVar2.n0(kVar13);
                            objN4 = kVar13;
                            r18 = r111;
                        }
                        l1.q.i(n1Var2, jVar2, (u00.n) objN4);
                        size = arrayList4.size() - 1;
                        if (size >= 0) {
                            if (arrayList4.get(size) == null) {
                                throw new ClassCastException();
                            }
                            l1.t tVar2 = q9.f.a;
                            throw r18;
                        }
                    } else {
                        kVar4 = kVar;
                    }
                    if ((i6 & 196608) == i3) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    z7 = z6 | z13;
                    objN = jVar3.N();
                    if (z7) {
                        r9.d dVar5 = new r9.d(z9, cVar9, i2, nVar2, z12, kVar3, kVar4);
                        jVar3.n0(dVar5);
                        objN = dVar5;
                    } else {
                        r9.d dVar6 = new r9.d(z9, cVar9, i2, nVar2, z12, kVar3, kVar4);
                        jVar3.n0(dVar6);
                        objN = dVar6;
                    }
                    u00.k kVar14 = (u00.k) objN;
                    zG = jVar3.g(kVar14) | jVar3.d(f5) | jVar3.i(z2);
                    objN2 = jVar3.N();
                    if (zG) {
                        obj = cVar4;
                        if (objN2 == obj) {
                            i4 = 1;
                        }
                        u00.k kVar15 = (u00.k) objN2;
                        objN3 = jVar3.N();
                        if (objN3 == obj) {
                            objN3 = new r9.e(0);
                            jVar3.n0(objN3);
                        }
                        Object obj5 = obj;
                        jVar2 = jVar3;
                        n1Var2 = n1Var;
                        w.m.b(n1Var2, rVar, kVar15, dVar2, (u00.k) objN3, v1.d.d(-1167420988, new iv.c(n1Var, map, i4), jVar3), jVar2, ((i6 >> 3) & 112) | 221184 | (i6 & 7168));
                        zG2 = jVar2.g(n1Var2) | jVar2.i(b0Var);
                        objN4 = jVar2.N();
                        if (zG2) {
                            ?? r112 = z2;
                            pz.k kVar16 = new pz.k(n1Var2, sVar, b0Var, r112, 4);
                            jVar2.n0(kVar16);
                            objN4 = kVar16;
                            r18 = r112;
                        } else {
                            ?? r113 = z2;
                            pz.k kVar17 = new pz.k(n1Var2, sVar, b0Var, r113, 4);
                            jVar2.n0(kVar17);
                            objN4 = kVar17;
                            r18 = r113;
                        }
                        l1.q.i(n1Var2, jVar2, (u00.n) objN4);
                        size = arrayList4.size() - 1;
                        if (size >= 0) {
                            if (arrayList4.get(size) == null) {
                                throw new ClassCastException();
                            }
                            l1.t tVar3 = q9.f.a;
                            throw r18;
                        }
                    } else {
                        obj = cVar4;
                    }
                    i4 = 1;
                    objN2 = new kz.c(kVar14, f5, i4);
                    jVar3.n0(objN2);
                    u00.k kVar18 = (u00.k) objN2;
                    objN3 = jVar3.N();
                    if (objN3 == obj) {
                        objN3 = new r9.e(0);
                        jVar3.n0(objN3);
                    }
                    Object obj6 = obj;
                    jVar2 = jVar3;
                    n1Var2 = n1Var;
                    w.m.b(n1Var2, rVar, kVar18, dVar2, (u00.k) objN3, v1.d.d(-1167420988, new iv.c(n1Var, map, i4), jVar3), jVar2, ((i6 >> 3) & 112) | 221184 | (i6 & 7168));
                    zG2 = jVar2.g(n1Var2) | jVar2.i(b0Var);
                    objN4 = jVar2.N();
                    if (zG2) {
                        ?? r114 = z2;
                        pz.k kVar19 = new pz.k(n1Var2, sVar, b0Var, r114, 4);
                        jVar2.n0(kVar19);
                        objN4 = kVar19;
                        r18 = r114;
                    } else {
                        ?? r115 = z2;
                        pz.k kVar110 = new pz.k(n1Var2, sVar, b0Var, r115, 4);
                        jVar2.n0(kVar110);
                        objN4 = kVar110;
                        r18 = r115;
                    }
                    l1.q.i(n1Var2, jVar2, (u00.n) objN4);
                    size = arrayList4.size() - 1;
                    if (size >= 0) {
                        if (arrayList4.get(size) == null) {
                            throw new ClassCastException();
                        }
                        l1.t tVar4 = q9.f.a;
                        throw r18;
                    }
                } else {
                    kVar3 = kVar2;
                }
                if ((i6 & 1572864) == 1048576) {
                    z5 = true;
                } else {
                    z5 = z3;
                }
                boolean z14 = zH2 | z5;
                if (((i6 & 458752) ^ 196608) > i3) {
                    kVar4 = kVar;
                    if (!jVar3.g(kVar4)) {
                        z6 = true;
                    }
                    z7 = z6 | z14;
                    objN = jVar3.N();
                    if (z7) {
                        r9.d dVar7 = new r9.d(z9, cVar9, i2, nVar2, z12, kVar3, kVar4);
                        jVar3.n0(dVar7);
                        objN = dVar7;
                    } else {
                        r9.d dVar8 = new r9.d(z9, cVar9, i2, nVar2, z12, kVar3, kVar4);
                        jVar3.n0(dVar8);
                        objN = dVar8;
                    }
                    u00.k kVar111 = (u00.k) objN;
                    zG = jVar3.g(kVar111) | jVar3.d(f5) | jVar3.i(z2);
                    objN2 = jVar3.N();
                    if (zG) {
                        obj = cVar4;
                        if (objN2 == obj) {
                            i4 = 1;
                        }
                        u00.k kVar112 = (u00.k) objN2;
                        objN3 = jVar3.N();
                        if (objN3 == obj) {
                            objN3 = new r9.e(0);
                            jVar3.n0(objN3);
                        }
                        Object obj7 = obj;
                        jVar2 = jVar3;
                        n1Var2 = n1Var;
                        w.m.b(n1Var2, rVar, kVar112, dVar2, (u00.k) objN3, v1.d.d(-1167420988, new iv.c(n1Var, map, i4), jVar3), jVar2, ((i6 >> 3) & 112) | 221184 | (i6 & 7168));
                        zG2 = jVar2.g(n1Var2) | jVar2.i(b0Var);
                        objN4 = jVar2.N();
                        if (zG2) {
                            ?? r116 = z2;
                            pz.k kVar113 = new pz.k(n1Var2, sVar, b0Var, r116, 4);
                            jVar2.n0(kVar113);
                            objN4 = kVar113;
                            r18 = r116;
                        } else {
                            ?? r117 = z2;
                            pz.k kVar114 = new pz.k(n1Var2, sVar, b0Var, r117, 4);
                            jVar2.n0(kVar114);
                            objN4 = kVar114;
                            r18 = r117;
                        }
                        l1.q.i(n1Var2, jVar2, (u00.n) objN4);
                        size = arrayList4.size() - 1;
                        if (size >= 0) {
                            if (arrayList4.get(size) == null) {
                                throw new ClassCastException();
                            }
                            l1.t tVar5 = q9.f.a;
                            throw r18;
                        }
                    } else {
                        obj = cVar4;
                    }
                    i4 = 1;
                    objN2 = new kz.c(kVar111, f5, i4);
                    jVar3.n0(objN2);
                    u00.k kVar115 = (u00.k) objN2;
                    objN3 = jVar3.N();
                    if (objN3 == obj) {
                        objN3 = new r9.e(0);
                        jVar3.n0(objN3);
                    }
                    Object obj8 = obj;
                    jVar2 = jVar3;
                    n1Var2 = n1Var;
                    w.m.b(n1Var2, rVar, kVar115, dVar2, (u00.k) objN3, v1.d.d(-1167420988, new iv.c(n1Var, map, i4), jVar3), jVar2, ((i6 >> 3) & 112) | 221184 | (i6 & 7168));
                    zG2 = jVar2.g(n1Var2) | jVar2.i(b0Var);
                    objN4 = jVar2.N();
                    if (zG2) {
                        ?? r118 = z2;
                        pz.k kVar116 = new pz.k(n1Var2, sVar, b0Var, r118, 4);
                        jVar2.n0(kVar116);
                        objN4 = kVar116;
                        r18 = r118;
                    } else {
                        ?? r119 = z2;
                        pz.k kVar117 = new pz.k(n1Var2, sVar, b0Var, r119, 4);
                        jVar2.n0(kVar117);
                        objN4 = kVar117;
                        r18 = r119;
                    }
                    l1.q.i(n1Var2, jVar2, (u00.n) objN4);
                    size = arrayList4.size() - 1;
                    if (size >= 0) {
                        if (arrayList4.get(size) == null) {
                            throw new ClassCastException();
                        }
                        l1.t tVar6 = q9.f.a;
                        throw r18;
                    }
                } else {
                    kVar4 = kVar;
                }
                if ((i6 & 196608) == i3) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                z7 = z6 | z14;
                objN = jVar3.N();
                if (z7) {
                    r9.d dVar9 = new r9.d(z9, cVar9, i2, nVar2, z12, kVar3, kVar4);
                    jVar3.n0(dVar9);
                    objN = dVar9;
                } else {
                    r9.d dVar10 = new r9.d(z9, cVar9, i2, nVar2, z12, kVar3, kVar4);
                    jVar3.n0(dVar10);
                    objN = dVar10;
                }
                u00.k kVar118 = (u00.k) objN;
                zG = jVar3.g(kVar118) | jVar3.d(f5) | jVar3.i(z2);
                objN2 = jVar3.N();
                if (zG) {
                    obj = cVar4;
                    if (objN2 == obj) {
                        i4 = 1;
                    }
                    u00.k kVar119 = (u00.k) objN2;
                    objN3 = jVar3.N();
                    if (objN3 == obj) {
                        objN3 = new r9.e(0);
                        jVar3.n0(objN3);
                    }
                    Object obj9 = obj;
                    jVar2 = jVar3;
                    n1Var2 = n1Var;
                    w.m.b(n1Var2, rVar, kVar119, dVar2, (u00.k) objN3, v1.d.d(-1167420988, new iv.c(n1Var, map, i4), jVar3), jVar2, ((i6 >> 3) & 112) | 221184 | (i6 & 7168));
                    zG2 = jVar2.g(n1Var2) | jVar2.i(b0Var);
                    objN4 = jVar2.N();
                    if (zG2) {
                        ?? r1110 = z2;
                        pz.k kVar1110 = new pz.k(n1Var2, sVar, b0Var, r1110, 4);
                        jVar2.n0(kVar1110);
                        objN4 = kVar1110;
                        r18 = r1110;
                    } else {
                        ?? r1111 = z2;
                        pz.k kVar1111 = new pz.k(n1Var2, sVar, b0Var, r1111, 4);
                        jVar2.n0(kVar1111);
                        objN4 = kVar1111;
                        r18 = r1111;
                    }
                    l1.q.i(n1Var2, jVar2, (u00.n) objN4);
                    size = arrayList4.size() - 1;
                    if (size >= 0) {
                        if (arrayList4.get(size) == null) {
                            throw new ClassCastException();
                        }
                        l1.t tVar7 = q9.f.a;
                        throw r18;
                    }
                } else {
                    obj = cVar4;
                }
                i4 = 1;
                objN2 = new kz.c(kVar118, f5, i4);
                jVar3.n0(objN2);
                u00.k kVar1112 = (u00.k) objN2;
                objN3 = jVar3.N();
                if (objN3 == obj) {
                    objN3 = new r9.e(0);
                    jVar3.n0(objN3);
                }
                Object obj10 = obj;
                jVar2 = jVar3;
                n1Var2 = n1Var;
                w.m.b(n1Var2, rVar, kVar1112, dVar2, (u00.k) objN3, v1.d.d(-1167420988, new iv.c(n1Var, map, i4), jVar3), jVar2, ((i6 >> 3) & 112) | 221184 | (i6 & 7168));
                zG2 = jVar2.g(n1Var2) | jVar2.i(b0Var);
                objN4 = jVar2.N();
                if (zG2) {
                    ?? r1112 = z2;
                    pz.k kVar1113 = new pz.k(n1Var2, sVar, b0Var, r1112, 4);
                    jVar2.n0(kVar1113);
                    objN4 = kVar1113;
                    r18 = r1112;
                } else {
                    ?? r1113 = z2;
                    pz.k kVar1114 = new pz.k(n1Var2, sVar, b0Var, r1113, 4);
                    jVar2.n0(kVar1114);
                    objN4 = kVar1114;
                    r18 = r1113;
                }
                l1.q.i(n1Var2, jVar2, (u00.n) objN4);
                size = arrayList4.size() - 1;
                if (size >= 0) {
                    if (arrayList4.get(size) == null) {
                        throw new ClassCastException();
                    }
                    l1.t tVar8 = q9.f.a;
                    throw r18;
                }
            } else {
                nVar2 = nVar;
            }
            if ((i6 & 12582912) == 8388608) {
                z4 = true;
            } else {
                z4 = z3;
            }
            boolean zH3 = zH | z4 | jVar3.h(z12);
            if (((i6 & 3670016) ^ 1572864) > 1048576) {
                kVar3 = kVar2;
                if (!jVar3.g(kVar3)) {
                    z5 = true;
                }
                boolean z15 = zH3 | z5;
                if (((i6 & 458752) ^ 196608) > i3) {
                    kVar4 = kVar;
                    if (!jVar3.g(kVar4)) {
                        z6 = true;
                    }
                    z7 = z6 | z15;
                    objN = jVar3.N();
                    if (z7) {
                        r9.d dVar11 = new r9.d(z9, cVar9, i2, nVar2, z12, kVar3, kVar4);
                        jVar3.n0(dVar11);
                        objN = dVar11;
                    } else {
                        r9.d dVar12 = new r9.d(z9, cVar9, i2, nVar2, z12, kVar3, kVar4);
                        jVar3.n0(dVar12);
                        objN = dVar12;
                    }
                    u00.k kVar1115 = (u00.k) objN;
                    zG = jVar3.g(kVar1115) | jVar3.d(f5) | jVar3.i(z2);
                    objN2 = jVar3.N();
                    if (zG) {
                        obj = cVar4;
                        if (objN2 == obj) {
                            i4 = 1;
                        }
                        u00.k kVar1116 = (u00.k) objN2;
                        objN3 = jVar3.N();
                        if (objN3 == obj) {
                            objN3 = new r9.e(0);
                            jVar3.n0(objN3);
                        }
                        Object obj11 = obj;
                        jVar2 = jVar3;
                        n1Var2 = n1Var;
                        w.m.b(n1Var2, rVar, kVar1116, dVar2, (u00.k) objN3, v1.d.d(-1167420988, new iv.c(n1Var, map, i4), jVar3), jVar2, ((i6 >> 3) & 112) | 221184 | (i6 & 7168));
                        zG2 = jVar2.g(n1Var2) | jVar2.i(b0Var);
                        objN4 = jVar2.N();
                        if (zG2) {
                            ?? r1114 = z2;
                            pz.k kVar1117 = new pz.k(n1Var2, sVar, b0Var, r1114, 4);
                            jVar2.n0(kVar1117);
                            objN4 = kVar1117;
                            r18 = r1114;
                        } else {
                            ?? r1115 = z2;
                            pz.k kVar1118 = new pz.k(n1Var2, sVar, b0Var, r1115, 4);
                            jVar2.n0(kVar1118);
                            objN4 = kVar1118;
                            r18 = r1115;
                        }
                        l1.q.i(n1Var2, jVar2, (u00.n) objN4);
                        size = arrayList4.size() - 1;
                        if (size >= 0) {
                            if (arrayList4.get(size) == null) {
                                throw new ClassCastException();
                            }
                            l1.t tVar9 = q9.f.a;
                            throw r18;
                        }
                    } else {
                        obj = cVar4;
                    }
                    i4 = 1;
                    objN2 = new kz.c(kVar1115, f5, i4);
                    jVar3.n0(objN2);
                    u00.k kVar1119 = (u00.k) objN2;
                    objN3 = jVar3.N();
                    if (objN3 == obj) {
                        objN3 = new r9.e(0);
                        jVar3.n0(objN3);
                    }
                    Object obj12 = obj;
                    jVar2 = jVar3;
                    n1Var2 = n1Var;
                    w.m.b(n1Var2, rVar, kVar1119, dVar2, (u00.k) objN3, v1.d.d(-1167420988, new iv.c(n1Var, map, i4), jVar3), jVar2, ((i6 >> 3) & 112) | 221184 | (i6 & 7168));
                    zG2 = jVar2.g(n1Var2) | jVar2.i(b0Var);
                    objN4 = jVar2.N();
                    if (zG2) {
                        ?? r1116 = z2;
                        pz.k kVar11110 = new pz.k(n1Var2, sVar, b0Var, r1116, 4);
                        jVar2.n0(kVar11110);
                        objN4 = kVar11110;
                        r18 = r1116;
                    } else {
                        ?? r1117 = z2;
                        pz.k kVar11111 = new pz.k(n1Var2, sVar, b0Var, r1117, 4);
                        jVar2.n0(kVar11111);
                        objN4 = kVar11111;
                        r18 = r1117;
                    }
                    l1.q.i(n1Var2, jVar2, (u00.n) objN4);
                    size = arrayList4.size() - 1;
                    if (size >= 0) {
                        if (arrayList4.get(size) == null) {
                            throw new ClassCastException();
                        }
                        l1.t tVar10 = q9.f.a;
                        throw r18;
                    }
                } else {
                    kVar4 = kVar;
                }
                if ((i6 & 196608) == i3) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                z7 = z6 | z15;
                objN = jVar3.N();
                if (z7) {
                    r9.d dVar13 = new r9.d(z9, cVar9, i2, nVar2, z12, kVar3, kVar4);
                    jVar3.n0(dVar13);
                    objN = dVar13;
                } else {
                    r9.d dVar14 = new r9.d(z9, cVar9, i2, nVar2, z12, kVar3, kVar4);
                    jVar3.n0(dVar14);
                    objN = dVar14;
                }
                u00.k kVar11112 = (u00.k) objN;
                zG = jVar3.g(kVar11112) | jVar3.d(f5) | jVar3.i(z2);
                objN2 = jVar3.N();
                if (zG) {
                    obj = cVar4;
                    if (objN2 == obj) {
                        i4 = 1;
                    }
                    u00.k kVar11113 = (u00.k) objN2;
                    objN3 = jVar3.N();
                    if (objN3 == obj) {
                        objN3 = new r9.e(0);
                        jVar3.n0(objN3);
                    }
                    Object obj13 = obj;
                    jVar2 = jVar3;
                    n1Var2 = n1Var;
                    w.m.b(n1Var2, rVar, kVar11113, dVar2, (u00.k) objN3, v1.d.d(-1167420988, new iv.c(n1Var, map, i4), jVar3), jVar2, ((i6 >> 3) & 112) | 221184 | (i6 & 7168));
                    zG2 = jVar2.g(n1Var2) | jVar2.i(b0Var);
                    objN4 = jVar2.N();
                    if (zG2) {
                        ?? r1118 = z2;
                        pz.k kVar11114 = new pz.k(n1Var2, sVar, b0Var, r1118, 4);
                        jVar2.n0(kVar11114);
                        objN4 = kVar11114;
                        r18 = r1118;
                    } else {
                        ?? r1119 = z2;
                        pz.k kVar11115 = new pz.k(n1Var2, sVar, b0Var, r1119, 4);
                        jVar2.n0(kVar11115);
                        objN4 = kVar11115;
                        r18 = r1119;
                    }
                    l1.q.i(n1Var2, jVar2, (u00.n) objN4);
                    size = arrayList4.size() - 1;
                    if (size >= 0) {
                        if (arrayList4.get(size) == null) {
                            throw new ClassCastException();
                        }
                        l1.t tVar11 = q9.f.a;
                        throw r18;
                    }
                } else {
                    obj = cVar4;
                }
                i4 = 1;
                objN2 = new kz.c(kVar11112, f5, i4);
                jVar3.n0(objN2);
                u00.k kVar11116 = (u00.k) objN2;
                objN3 = jVar3.N();
                if (objN3 == obj) {
                    objN3 = new r9.e(0);
                    jVar3.n0(objN3);
                }
                Object obj14 = obj;
                jVar2 = jVar3;
                n1Var2 = n1Var;
                w.m.b(n1Var2, rVar, kVar11116, dVar2, (u00.k) objN3, v1.d.d(-1167420988, new iv.c(n1Var, map, i4), jVar3), jVar2, ((i6 >> 3) & 112) | 221184 | (i6 & 7168));
                zG2 = jVar2.g(n1Var2) | jVar2.i(b0Var);
                objN4 = jVar2.N();
                if (zG2) {
                    ?? r11110 = z2;
                    pz.k kVar11117 = new pz.k(n1Var2, sVar, b0Var, r11110, 4);
                    jVar2.n0(kVar11117);
                    objN4 = kVar11117;
                    r18 = r11110;
                } else {
                    ?? r11111 = z2;
                    pz.k kVar11118 = new pz.k(n1Var2, sVar, b0Var, r11111, 4);
                    jVar2.n0(kVar11118);
                    objN4 = kVar11118;
                    r18 = r11111;
                }
                l1.q.i(n1Var2, jVar2, (u00.n) objN4);
                size = arrayList4.size() - 1;
                if (size >= 0) {
                    if (arrayList4.get(size) == null) {
                        throw new ClassCastException();
                    }
                    l1.t tVar12 = q9.f.a;
                    throw r18;
                }
            } else {
                kVar3 = kVar2;
            }
            if ((i6 & 1572864) == 1048576) {
                z5 = true;
            } else {
                z5 = z3;
            }
            boolean z16 = zH3 | z5;
            if (((i6 & 458752) ^ 196608) > i3) {
                kVar4 = kVar;
                if (!jVar3.g(kVar4)) {
                    z6 = true;
                }
                z7 = z6 | z16;
                objN = jVar3.N();
                if (z7) {
                    r9.d dVar15 = new r9.d(z9, cVar9, i2, nVar2, z12, kVar3, kVar4);
                    jVar3.n0(dVar15);
                    objN = dVar15;
                } else {
                    r9.d dVar16 = new r9.d(z9, cVar9, i2, nVar2, z12, kVar3, kVar4);
                    jVar3.n0(dVar16);
                    objN = dVar16;
                }
                u00.k kVar11119 = (u00.k) objN;
                zG = jVar3.g(kVar11119) | jVar3.d(f5) | jVar3.i(z2);
                objN2 = jVar3.N();
                if (zG) {
                    obj = cVar4;
                    if (objN2 == obj) {
                        i4 = 1;
                    }
                    u00.k kVar111110 = (u00.k) objN2;
                    objN3 = jVar3.N();
                    if (objN3 == obj) {
                        objN3 = new r9.e(0);
                        jVar3.n0(objN3);
                    }
                    Object obj15 = obj;
                    jVar2 = jVar3;
                    n1Var2 = n1Var;
                    w.m.b(n1Var2, rVar, kVar111110, dVar2, (u00.k) objN3, v1.d.d(-1167420988, new iv.c(n1Var, map, i4), jVar3), jVar2, ((i6 >> 3) & 112) | 221184 | (i6 & 7168));
                    zG2 = jVar2.g(n1Var2) | jVar2.i(b0Var);
                    objN4 = jVar2.N();
                    if (zG2) {
                        ?? r11112 = z2;
                        pz.k kVar111111 = new pz.k(n1Var2, sVar, b0Var, r11112, 4);
                        jVar2.n0(kVar111111);
                        objN4 = kVar111111;
                        r18 = r11112;
                    } else {
                        ?? r11113 = z2;
                        pz.k kVar111112 = new pz.k(n1Var2, sVar, b0Var, r11113, 4);
                        jVar2.n0(kVar111112);
                        objN4 = kVar111112;
                        r18 = r11113;
                    }
                    l1.q.i(n1Var2, jVar2, (u00.n) objN4);
                    size = arrayList4.size() - 1;
                    if (size >= 0) {
                        if (arrayList4.get(size) == null) {
                            throw new ClassCastException();
                        }
                        l1.t tVar13 = q9.f.a;
                        throw r18;
                    }
                } else {
                    obj = cVar4;
                }
                i4 = 1;
                objN2 = new kz.c(kVar11119, f5, i4);
                jVar3.n0(objN2);
                u00.k kVar111113 = (u00.k) objN2;
                objN3 = jVar3.N();
                if (objN3 == obj) {
                    objN3 = new r9.e(0);
                    jVar3.n0(objN3);
                }
                Object obj16 = obj;
                jVar2 = jVar3;
                n1Var2 = n1Var;
                w.m.b(n1Var2, rVar, kVar111113, dVar2, (u00.k) objN3, v1.d.d(-1167420988, new iv.c(n1Var, map, i4), jVar3), jVar2, ((i6 >> 3) & 112) | 221184 | (i6 & 7168));
                zG2 = jVar2.g(n1Var2) | jVar2.i(b0Var);
                objN4 = jVar2.N();
                if (zG2) {
                    ?? r11114 = z2;
                    pz.k kVar111114 = new pz.k(n1Var2, sVar, b0Var, r11114, 4);
                    jVar2.n0(kVar111114);
                    objN4 = kVar111114;
                    r18 = r11114;
                } else {
                    ?? r11115 = z2;
                    pz.k kVar111115 = new pz.k(n1Var2, sVar, b0Var, r11115, 4);
                    jVar2.n0(kVar111115);
                    objN4 = kVar111115;
                    r18 = r11115;
                }
                l1.q.i(n1Var2, jVar2, (u00.n) objN4);
                size = arrayList4.size() - 1;
                if (size >= 0) {
                    if (arrayList4.get(size) == null) {
                        throw new ClassCastException();
                    }
                    l1.t tVar14 = q9.f.a;
                    throw r18;
                }
            } else {
                kVar4 = kVar;
            }
            if ((i6 & 196608) == i3) {
                z6 = true;
            } else {
                z6 = z3;
            }
            z7 = z6 | z16;
            objN = jVar3.N();
            if (z7) {
                r9.d dVar17 = new r9.d(z9, cVar9, i2, nVar2, z12, kVar3, kVar4);
                jVar3.n0(dVar17);
                objN = dVar17;
            } else {
                r9.d dVar18 = new r9.d(z9, cVar9, i2, nVar2, z12, kVar3, kVar4);
                jVar3.n0(dVar18);
                objN = dVar18;
            }
            u00.k kVar111116 = (u00.k) objN;
            zG = jVar3.g(kVar111116) | jVar3.d(f5) | jVar3.i(z2);
            objN2 = jVar3.N();
            if (zG) {
                obj = cVar4;
                if (objN2 == obj) {
                    i4 = 1;
                }
                u00.k kVar111117 = (u00.k) objN2;
                objN3 = jVar3.N();
                if (objN3 == obj) {
                    objN3 = new r9.e(0);
                    jVar3.n0(objN3);
                }
                Object obj17 = obj;
                jVar2 = jVar3;
                n1Var2 = n1Var;
                w.m.b(n1Var2, rVar, kVar111117, dVar2, (u00.k) objN3, v1.d.d(-1167420988, new iv.c(n1Var, map, i4), jVar3), jVar2, ((i6 >> 3) & 112) | 221184 | (i6 & 7168));
                zG2 = jVar2.g(n1Var2) | jVar2.i(b0Var);
                objN4 = jVar2.N();
                if (zG2) {
                    ?? r11116 = z2;
                    pz.k kVar111118 = new pz.k(n1Var2, sVar, b0Var, r11116, 4);
                    jVar2.n0(kVar111118);
                    objN4 = kVar111118;
                    r18 = r11116;
                } else {
                    ?? r11117 = z2;
                    pz.k kVar111119 = new pz.k(n1Var2, sVar, b0Var, r11117, 4);
                    jVar2.n0(kVar111119);
                    objN4 = kVar111119;
                    r18 = r11117;
                }
                l1.q.i(n1Var2, jVar2, (u00.n) objN4);
                size = arrayList4.size() - 1;
                if (size >= 0) {
                    if (arrayList4.get(size) == null) {
                        throw new ClassCastException();
                    }
                    l1.t tVar15 = q9.f.a;
                    throw r18;
                }
            } else {
                obj = cVar4;
            }
            i4 = 1;
            objN2 = new kz.c(kVar111116, f5, i4);
            jVar3.n0(objN2);
            u00.k kVar1111110 = (u00.k) objN2;
            objN3 = jVar3.N();
            if (objN3 == obj) {
                objN3 = new r9.e(0);
                jVar3.n0(objN3);
            }
            Object obj18 = obj;
            jVar2 = jVar3;
            n1Var2 = n1Var;
            w.m.b(n1Var2, rVar, kVar1111110, dVar2, (u00.k) objN3, v1.d.d(-1167420988, new iv.c(n1Var, map, i4), jVar3), jVar2, ((i6 >> 3) & 112) | 221184 | (i6 & 7168));
            zG2 = jVar2.g(n1Var2) | jVar2.i(b0Var);
            objN4 = jVar2.N();
            if (zG2) {
                ?? r11118 = z2;
                pz.k kVar1111111 = new pz.k(n1Var2, sVar, b0Var, r11118, 4);
                jVar2.n0(kVar1111111);
                objN4 = kVar1111111;
                r18 = r11118;
            } else {
                ?? r11119 = z2;
                pz.k kVar1111112 = new pz.k(n1Var2, sVar, b0Var, r11119, 4);
                jVar2.n0(kVar1111112);
                objN4 = kVar1111112;
                r18 = r11119;
            }
            l1.q.i(n1Var2, jVar2, (u00.n) objN4);
            size = arrayList4.size() - 1;
            if (size >= 0) {
                if (arrayList4.get(size) == null) {
                    throw new ClassCastException();
                }
                l1.t tVar16 = q9.f.a;
                throw r18;
            }
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new l7(gVar, dVar, rVar, dVar2, kVar, kVar2, nVar, i);
        }
    }

    public static final void Q(final x xVar, final u00.k kVar, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1779574139);
        int i2 = i | (g0Var.g(xVar) ? 4 : 2) | (g0Var.i(kVar) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            final v vVarA = j0.x.a(0, g0Var, 3);
            p2 p2VarB = sm.a.b(vVarA, g0Var);
            String strU = z3.U(g0Var, 2131887154);
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = l1.q.r(new el.b(vVarA, 6));
                g0Var.n0(objN);
            }
            p2 p2Var = (p2) objN;
            a0 a0Var = z1.c;
            b2.r rVarF = z.n.f(a0Var, dl.a.L, i2.b0.b);
            z2.w0 w0VarD = h0.o.d(b2.b.A, false);
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
            float fFloatValue = ((Number) p2Var.getValue()).floatValue();
            b2.i iVar = b2.b.B;
            h0.s sVar = h0.s.a;
            b2.o oVar = b2.o.A;
            wr.k.N(fFloatValue, sVar.a(oVar, iVar), 0.0f, 0L, 0L, g0Var, 0);
            Boolean boolValueOf = Boolean.valueOf(xVar.h);
            Object objN2 = g0Var.N();
            if (objN2 == obj) {
                objN2 = new hx.t(0);
                g0Var.n0(objN2);
            }
            final int i3 = 0;
            w.m.a(boolValueOf, a0Var, (u00.k) objN2, (b2.d) null, "reciterCollectionSearch", (u00.k) null, v1.d.d(-1995235438, new u00.p() {
                @Override
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    switch (i3) {
                        case 0:
                            x xVar2 = (x) xVar;
                            u00.k kVar2 = (u00.k) kVar;
                            j0.v vVar = (j0.v) vVarA;
                            w.p AnimatedContent = (w.p) obj2;
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            g0 g0Var2 = (l1.j) obj4;
                            ((Integer) obj5).intValue();
                            kotlin.jvm.internal.m.e(AnimatedContent, "$this$AnimatedContent");
                            if (zBooleanValue) {
                                g0 g0Var3 = g0Var2;
                                g0Var3.c0(-2006467351);
                                ix.o.a(xVar2, kVar2, g0Var2, 0);
                                g0Var3.r(false);
                            } else {
                                g0 g0Var4 = g0Var2;
                                g0Var4.c0(-2006294960);
                                p30.f.F(xVar2, vVar, kVar2, g0Var2, 0);
                                g0Var4.r(false);
                            }
                            break;
                        default:
                            jp.e0 e0Var = (jp.e0) xVar;
                            l1.z0 z0Var = (l1.z0) kVar;
                            l1.z0 z0Var2 = (l1.z0) vVarA;
                            m0.r HorizontalPager = (m0.r) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            g0 g0Var5 = (l1.j) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            kotlin.jvm.internal.m.e(HorizontalPager, "$this$HorizontalPager");
                            h0.a0 a0Var2 = z1.c;
                            z2.w0 w0VarD2 = h0.o.d(b2.b.A, false);
                            g0 g0Var6 = g0Var5;
                            int iHashCode2 = Long.hashCode(g0Var6.T);
                            m1 m1VarM2 = g0Var6.m();
                            b2.r rVarC2 = b2.a.c(a0Var2, g0Var5);
                            b3.i.c.getClass();
                            b3.g gVar2 = b3.h.b;
                            g0Var6.g0();
                            if (g0Var6.S) {
                                g0Var6.l(gVar2);
                            } else {
                                g0Var6.q0();
                            }
                            l1.q.I(w0VarD2, g0Var5, b3.h.f);
                            l1.q.I(m1VarM2, g0Var5, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode2), g0Var5, b3.h.g);
                            l1.q.E(g0Var5, b3.h.h);
                            l1.q.I(rVarC2, g0Var5, b3.h.d);
                            jp.x xVar3 = (jp.x) z0Var.getValue();
                            boolean z = ((Number) z0Var2.getValue()).intValue() == iIntValue;
                            boolean zG = g0Var6.g(e0Var);
                            Object objN3 = g0Var6.N();
                            if (zG || objN3 == l1.i.a) {
                                gz.e1 e1Var = new gz.e1(1, e0Var, jp.e0.class, "action", "action(Lcom/mchutov/quranify/auth/presentation/screen/auth/AuthAction;)V", 0, 3);
                                g0Var6.n0(e1Var);
                                objN3 = e1Var;
                            }
                            g4.e(iIntValue, xVar3, z, (u00.k) ((a10.g) objN3), g0Var5, (iIntValue2 >> 3) & 14);
                            g0Var6.r(true);
                            break;
                    }
                    return g00.b0.a;
                }
            }, g0Var), g0Var, 1597872, 40);
            sm.a.a(strU, xVar.h ? 0.0f : ((Number) p2VarB.getValue()).floatValue(), sVar.a(oVar, iVar), 0.0f, g0Var, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new hx.v(xVar, kVar, i, 0);
        }
    }

    public static final void R(l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(17024226);
        if (g0Var.S(i & 1, i != 0)) {
            androidx.lifecycle.f1 f1VarA = u6.a.a(g0Var);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            t6.b bVarZ = bi.b.z(f1VarA);
            e60.a aVarA = q50.c.a(g0Var);
            kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
            e0 e0Var = (e0) c7.i.S(b0Var.b(e0.class), f1VarA.getViewModelStore(), (String) null, bVarZ, aVarA, (u00.a) null);
            l1.z0 z0VarQ = k00.f.q(e0Var.c.d, g0Var, 0);
            e60.a aVarA2 = q50.c.a(g0Var);
            boolean zG = g0Var.g((Object) null) | g0Var.g(aVarA2);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (zG || objN == cVar) {
                objN = oi.k.f(b0Var, cq.a.class, aVarA2, (b60.a) null, g0Var);
            }
            cq.a aVar = (cq.a) objN;
            boolean z = ((x) z0VarQ.getValue()).h;
            boolean zG2 = g0Var.g(e0Var);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == cVar) {
                objN2 = new l0(e0Var, 9);
                g0Var.n0(objN2);
            }
            qd.s0.E(z, (u00.a) objN2, g0Var, 0, 0);
            boolean zG3 = g0Var.g(e0Var) | g0Var.i(aVar);
            Object objN3 = g0Var.N();
            if (zG3 || objN3 == cVar) {
                objN3 = new g6.a(e0Var, aVar, (k00.c) null, 7);
                g0Var.n0(objN3);
            }
            l1.q.i(g00.b0.a, g0Var, (u00.n) objN3);
            x xVar = (x) z0VarQ.getValue();
            boolean zG4 = g0Var.g(e0Var);
            Object objN4 = g0Var.N();
            if (zG4 || objN4 == cVar) {
                gz.e1 e1Var = new gz.e1(1, e0Var, e0.class, "action", "action(Lcom/mchutov/quranify/reciters/presentation/screen/collection/main/ReciterCollectionAction;)V", 0, 2);
                g0Var.n0(e1Var);
                objN4 = e1Var;
            }
            Q(xVar, (u00.k) ((a10.g) objN4), g0Var, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c8(i, 12);
        }
    }

    public static final void S(SearchReciterLauncher launcher, l1.j jVar, int i) {
        int i2;
        kotlin.jvm.internal.m.e(launcher, "launcher");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-431974443);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? g0Var.g(launcher) : g0Var.i(launcher) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            e60.a aVarA = q50.c.a(g0Var);
            k00.c cVar = null;
            boolean zG = g0Var.g((Object) null) | g0Var.g(aVarA);
            Object objN = g0Var.N();
            l1.c cVar2 = l1.i.a;
            if (zG || objN == cVar2) {
                objN = oi.k.f(kotlin.jvm.internal.a0.a, cq.a.class, aVarA, (b60.a) null, g0Var);
            }
            cq.a aVar = (cq.a) objN;
            u00.a aVarA2 = cq.l.a(g0Var);
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && g0Var.i(launcher));
            Object objN2 = g0Var.N();
            if (z || objN2 == cVar2) {
                objN2 = new q0.f2(launcher, 2);
                g0Var.n0(objN2);
            }
            u00.a aVar2 = (u00.a) objN2;
            androidx.lifecycle.f1 f1VarA = u6.a.a(g0Var);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            qx.t tVar = (qx.t) c7.i.S(kotlin.jvm.internal.a0.a.b(qx.t.class), f1VarA.getViewModelStore(), (String) null, bi.b.z(f1VarA), q50.c.a(g0Var), aVar2);
            l1.z0 z0VarQ = k00.f.q(tVar.c.d, g0Var, 0);
            boolean zG2 = g0Var.g(tVar);
            Object objN3 = g0Var.N();
            if (zG2 || objN3 == cVar2) {
                objN3 = new q0.f2(tVar, 3);
                g0Var.n0(objN3);
            }
            qd.s0.E(false, (u00.a) objN3, g0Var, 0, 1);
            boolean zG3 = g0Var.g(tVar) | g0Var.g(aVarA2) | g0Var.i(aVar);
            Object objN4 = g0Var.N();
            if (zG3 || objN4 == cVar2) {
                pz.k kVar = new pz.k(tVar, aVarA2, aVar, cVar, 2);
                g0Var.n0(kVar);
                objN4 = kVar;
            }
            l1.q.i(g00.b0.a, g0Var, (u00.n) objN4);
            qx.o oVar = (qx.o) z0VarQ.getValue();
            boolean zG4 = g0Var.g(tVar);
            Object objN5 = g0Var.N();
            if (zG4 || objN5 == cVar2) {
                objN5 = new gz.e1(1, tVar, qx.t.class, "action", "action(Lcom/mchutov/quranify/reciters/presentation/screen/search/SearchReciterAction;)V", 0, 18);
                g0Var.n0(objN5);
            }
            rx.a.h(oVar, (u00.k) ((a10.g) objN5), g0Var, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new androidx.media3.cast.e(launcher, i, 7);
        }
    }

    public static final void T(l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-673312248);
        if (g0Var.S(i & 1, i != 0)) {
            e60.a aVarA = q50.c.a(g0Var);
            boolean zG = g0Var.g((Object) null) | g0Var.g(aVarA);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (zG || objN == cVar) {
                objN = oi.k.f(kotlin.jvm.internal.a0.a, ey.a.class, aVarA, (b60.a) null, g0Var);
            }
            ey.a aVar = (ey.a) objN;
            e60.a aVarA2 = q50.c.a(g0Var);
            boolean zG2 = g0Var.g((Object) null) | g0Var.g(aVarA2);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == cVar) {
                objN2 = oi.k.f(kotlin.jvm.internal.a0.a, ey.b.class, aVarA2, (b60.a) null, g0Var);
            }
            ey.b bVar = (ey.b) objN2;
            h00.a aVarT = f50.k.t(q50.c.b(g0Var).c("SEARCH_SCOPE_KEY", new b60.b("SEARCH_SCOPE_KEY")), g0Var);
            Object objU0 = h00.q.U0(bVar.a);
            boolean zG3 = g0Var.g(bVar) | g0Var.g(aVar);
            Object objN3 = g0Var.N();
            if (zG3 || objN3 == cVar) {
                objN3 = new a1.c0(bVar, aVar, (k00.c) null, 21);
                g0Var.n0(objN3);
            }
            l1.q.i(objU0, g0Var, (u00.n) objN3);
            z1.p pVar = bVar.a;
            a0 a0Var = z1.c;
            boolean zG4 = g0Var.g(bVar);
            Object objN4 = g0Var.N();
            if (zG4 || objN4 == cVar) {
                av.k kVar = new av.k(0, bVar, ey.b.class, "navigateBack", "navigateBack()V", 0, 16);
                g0Var.n0(kVar);
                objN4 = kVar;
            }
            List listS = va.a.S(new p9.f[]{bi.b.N(g0Var), o0(g0Var)});
            q2 q2Var = cq.l.a;
            O(pVar, a0Var, null, (u00.a) ((a10.g) objN4), listS, null, null, null, null, new e1(aVarT, 7), g0Var, 48);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c8(i, 4);
        }
    }

    public static final long U(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final Object V(vp.x xVar, bu.b bVar, m00.c cVar) {
        du.m0 m0Var;
        Object objF;
        Offering current;
        if (cVar instanceof du.m0) {
            m0Var = (du.m0) cVar;
            int i = m0Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                m0Var.C = i - Integer.MIN_VALUE;
            } else {
                m0Var = new du.m0(cVar);
            }
        } else {
            m0Var = new du.m0(cVar);
        }
        Object obj = m0Var.B;
        Object obj2 = l00.a.A;
        int i2 = m0Var.C;
        if (i2 == 0) {
            t1.O(obj);
            m0Var.A = bVar;
            m0Var.C = 1;
            objF = xVar.f(m0Var);
            if (objF == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = m0Var.A;
            t1.O(obj);
            objF = ((g00.n) obj).A;
        }
        Object obj3 = null;
        if (objF instanceof g00.m) {
            objF = null;
        }
        Offerings offerings = (Offerings) objF;
        if (offerings == null || (current = offerings.getCurrent()) == null) {
            return null;
        }
        int iOrdinal = bVar.a.ordinal();
        if (iOrdinal == 0) {
            Package annual = current.getAnnual();
            if (annual != null) {
                return annual;
            }
            for (Object obj4 : current.getAvailablePackages()) {
                if (((Package) obj4).getPackageType() == PackageType.ANNUAL) {
                    obj3 = obj4;
                    break;
                }
            }
            return (Package) obj3;
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        Package monthly = current.getMonthly();
        if (monthly != null) {
            return monthly;
        }
        for (Object obj5 : current.getAvailablePackages()) {
            if (((Package) obj5).getPackageType() == PackageType.MONTHLY) {
                obj3 = obj5;
                break;
            }
        }
        return (Package) obj3;
    }

    public static final List W(a10.d dVar) {
        kotlin.jvm.internal.m.e(dVar, "<this>");
        return q30.l.u0(new q30.g(q30.l.n0(dVar, e.B), e.C, q30.n.A));
    }

    public static fg.d Y(u00.k... kVarArr) {
        if (kVarArr.length > 0) {
            return new fg.d(kVarArr, 1);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static int Z(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final i2.l0 c0(b3.o0 o0Var, i2.t0 t0Var, long j, al.n nVar, float f, i2.l0 l0Var, y3.m mVar, h2.e eVar) {
        i2.l0 l0VarA = null;
        if (t0Var == i2.b0.b) {
            k2.d.R(o0Var, j, 0L, 0L, 0.0f, (k2.h) null, 0, 126);
            k2.d.m0(o0Var, nVar.a(f, o0Var.A.b()), 0L, 0L, f <= 0.6f ? b5.A(0.0f, 1.0f, f / 0.6f) : b5.A(1.0f, 0.0f, (f - 0.6f) / (1 - 0.6f)), (k2.e) null, 0, 118);
            return null;
        }
        long jB = o0Var.A.b();
        if (eVar != null && jB == eVar.a && o0Var.getLayoutDirection() == mVar) {
            l0VarA = l0Var;
        }
        if (l0VarA == null) {
            l0VarA = t0Var.a(o0Var.A.b(), o0Var.getLayoutDirection(), o0Var);
        }
        i2.l0 l0Var2 = l0VarA;
        i2.b0.n(o0Var, l0Var2, j);
        i2.b0.m(o0Var, l0Var2, nVar.a(f, o0Var.A.b()), f <= 0.6f ? b5.A(0.0f, 1.0f, f / 0.6f) : b5.A(1.0f, 0.0f, (f - 0.6f) / (1 - 0.6f)));
        return l0Var2;
    }

    public static x30.c d0() {
        x30.c cVar = x30.c.D;
        kotlin.jvm.internal.m.c(cVar, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>");
        return cVar;
    }

    public static final int e0(int i) {
        return k20.e.b(k20.e.c.e(i).booleanValue(), (i20.i1) k20.e.d.e(i), (d0) k20.e.e.e(i));
    }

    public static Drawable f0(Context context, int i) {
        return d2.b().c(context, i);
    }

    public static final long g0(e2.d dVar) {
        DragEvent dragEvent = dVar.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    public static final ArrayList h0(a10.g gVar) {
        List parameters = gVar.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((d10.w) ((w1) obj)).C == a10.n.D) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Comparable i0(Comparable a2, y3.f fVar) {
        kotlin.jvm.internal.m.e(a2, "a");
        return a2.compareTo(fVar) >= 0 ? a2 : fVar;
    }

    public static Comparable j0(Comparable comparable, y3.f fVar) {
        return fVar.compareTo(comparable) <= 0 ? fVar : comparable;
    }

    public static b2.r k0(b2.r placeholder, final boolean z, final long j, final i2.t0 shape, final al.n nVar) {
        final al.c cVar = new al.c(0);
        final al.c cVar2 = new al.c(1);
        kotlin.jvm.internal.m.e(placeholder, "$this$placeholder");
        kotlin.jvm.internal.m.e(shape, "shape");
        return placeholder.V(new b2.l(new u00.o() {
            @Override
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Object objJ0;
                Object objJ1;
                x.e0 e0VarH;
                r composed = (r) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(composed, "$this$composed");
                g0 g0Var = (l1.j) obj2;
                g0Var.c0(41755015);
                Object objN = g0Var.N();
                l1.c cVar3 = l1.i.a;
                if (objN == cVar3) {
                    objN = new b3.f2();
                    g0Var.n0(objN);
                }
                final b3.f2 f2Var = (b3.f2) objN;
                Object objN2 = g0Var.N();
                if (objN2 == cVar3) {
                    objN2 = new b3.f2();
                    g0Var.n0(objN2);
                }
                final b3.f2 f2Var2 = (b3.f2) objN2;
                Object objN3 = g0Var.N();
                if (objN3 == cVar3) {
                    objN3 = new b3.f2();
                    g0Var.n0(objN3);
                }
                final b3.f2 f2Var3 = (b3.f2) objN3;
                Object objN4 = g0Var.N();
                boolean z2 = z;
                if (objN4 == cVar3) {
                    objN4 = new k0(Boolean.valueOf(z2));
                    g0Var.n0(objN4);
                }
                k0 k0Var = (k0) objN4;
                k0Var.W0(Boolean.valueOf(z2));
                x.n1 n1VarT = x.c.t(k0Var, "placeholder_crossfade", g0Var, 48, 0);
                x.r1 r1Var = x.c.k;
                boolean zG = n1VarT.g();
                f5.c cVar4 = n1VarT.a;
                if (zG) {
                    g0Var.c0(1666827533);
                    g0Var.r(false);
                    objJ0 = cVar4.J0();
                } else {
                    g0Var.c0(1666573488);
                    boolean zG2 = g0Var.g(n1VarT);
                    objJ0 = g0Var.N();
                    if (zG2 || objJ0 == cVar3) {
                        z1.f fVarF = q.f();
                        u00.k kVarE = fVarF != null ? fVarF.e() : null;
                        z1.f fVarK = q.k(fVarF);
                        try {
                            Object objJ2 = cVar4.J0();
                            q.n(fVarF, fVarK, kVarE);
                            g0Var.n0(objJ2);
                            objJ0 = objJ2;
                        } catch (Throwable th) {
                            q.n(fVarF, fVarK, kVarE);
                            throw th;
                        }
                    }
                    g0Var.r(false);
                }
                boolean zBooleanValue = ((Boolean) objJ0).booleanValue();
                g0Var.c0(1353077506);
                float f = zBooleanValue ? 1.0f : 0.0f;
                g0Var.r(false);
                Float fValueOf = Float.valueOf(f);
                boolean zG3 = g0Var.g(n1VarT);
                Object objN5 = g0Var.N();
                if (zG3 || objN5 == cVar3) {
                    objN5 = l1.q.r(new f(n1VarT, 0));
                    g0Var.n0(objN5);
                }
                boolean zBooleanValue2 = ((Boolean) ((p2) objN5).getValue()).booleanValue();
                g0Var.c0(1353077506);
                float f2 = zBooleanValue2 ? 1.0f : 0.0f;
                g0Var.r(false);
                Float fValueOf2 = Float.valueOf(f2);
                boolean zG4 = g0Var.g(n1VarT);
                Object objN6 = g0Var.N();
                if (zG4 || objN6 == cVar3) {
                    objN6 = l1.q.r(new f(n1VarT, 1));
                    g0Var.n0(objN6);
                }
                final x.m1 m1VarO = x.c.o(n1VarT, fValueOf, fValueOf2, (y) cVar.invoke(((p2) objN6).getValue(), g0Var, 0), r1Var, g0Var, 196608);
                if (n1VarT.g()) {
                    g0Var.c0(1666827533);
                    g0Var.r(false);
                    objJ1 = cVar4.J0();
                } else {
                    g0Var.c0(1666573488);
                    boolean zG5 = g0Var.g(n1VarT);
                    objJ1 = g0Var.N();
                    if (zG5 || objJ1 == cVar3) {
                        z1.f fVarF2 = q.f();
                        u00.k kVarE2 = fVarF2 != null ? fVarF2.e() : null;
                        z1.f fVarK2 = q.k(fVarF2);
                        try {
                            Object objJ3 = cVar4.J0();
                            q.n(fVarF2, fVarK2, kVarE2);
                            g0Var.n0(objJ3);
                            objJ1 = objJ3;
                        } catch (Throwable th2) {
                            q.n(fVarF2, fVarK2, kVarE2);
                            throw th2;
                        }
                    }
                    g0Var.r(false);
                }
                boolean zBooleanValue3 = ((Boolean) objJ1).booleanValue();
                g0Var.c0(66506376);
                float f3 = zBooleanValue3 ? 0.0f : 1.0f;
                g0Var.r(false);
                Float fValueOf3 = Float.valueOf(f3);
                boolean zG6 = g0Var.g(n1VarT);
                Object objN7 = g0Var.N();
                if (zG6 || objN7 == cVar3) {
                    objN7 = l1.q.r(new f(n1VarT, 2));
                    g0Var.n0(objN7);
                }
                boolean zBooleanValue4 = ((Boolean) ((p2) objN7).getValue()).booleanValue();
                g0Var.c0(66506376);
                float f4 = zBooleanValue4 ? 0.0f : 1.0f;
                g0Var.r(false);
                Float fValueOf4 = Float.valueOf(f4);
                boolean zG7 = g0Var.g(n1VarT);
                Object objN8 = g0Var.N();
                if (zG7 || objN8 == cVar3) {
                    objN8 = l1.q.r(new f(n1VarT, 3));
                    g0Var.n0(objN8);
                }
                final x.m1 m1VarO2 = x.c.o(n1VarT, fValueOf3, fValueOf4, (y) cVar2.invoke(((p2) objN8).getValue(), g0Var, 0), r1Var, g0Var, 196608);
                final n nVar2 = nVar;
                x.d0 d0Var = nVar2.b;
                h hVar = (h) g0Var.k(m.a);
                if (!z2 && ((Number) m1VarO.getValue()).floatValue() < 0.01d) {
                    g0Var.c0(-1615458216);
                    g0Var.r(false);
                    e0VarH = a.A;
                } else if (hVar == null || d0Var != ((x.d0) b.a.getValue())) {
                    g0Var.c0(-1615145271);
                    e0VarH = x.c.h(x.c.s("", g0Var, 0), 0.0f, 1.0f, d0Var, "", g0Var, 29112, 0);
                    g0Var.r(false);
                } else {
                    g0Var.c0(-1615326869);
                    boolean zG8 = g0Var.g(hVar);
                    Object objN9 = g0Var.N();
                    if (zG8 || objN9 == cVar3) {
                        objN9 = new e1(hVar, 3);
                        g0Var.n0(objN9);
                    }
                    l1.q.e(hVar, (u00.k) objN9, g0Var);
                    e0VarH = (p2) hVar.b.getValue();
                    g0Var.r(false);
                }
                final l1.z0 z0VarG = l1.q.G(e0VarH, g0Var);
                Object objN10 = g0Var.N();
                if (objN10 == cVar3) {
                    objN10 = i2.b0.g();
                    g0Var.n0(objN10);
                }
                final i2.e eVar = (i2.e) objN10;
                final long j2 = j;
                boolean zF = g0Var.f(j2);
                final i2.t0 t0Var = shape;
                boolean zG9 = zF | g0Var.g(t0Var) | g0Var.g(nVar2);
                Object objN11 = g0Var.N();
                if (zG9 || objN11 == cVar3) {
                    objN11 = f2.h.g(composed, new u00.k() {
                        @Override
                        public final Object invoke(Object obj4) {
                            b3.f2 f2Var4;
                            b3.o0 o0Var;
                            b3.o0 drawWithContent = (b3.o0) obj4;
                            kotlin.jvm.internal.m.e(drawWithContent, "$this$drawWithContent");
                            float fFloatValue = ((Number) ((p2) z0VarG.getValue()).getValue()).floatValue();
                            p2 p2Var = m1VarO2;
                            float fFloatValue2 = ((Number) p2Var.getValue()).floatValue();
                            i2.e eVar2 = eVar;
                            if (fFloatValue2 < 0.01f) {
                                a1.i iVar = drawWithContent.A.B;
                                long jQ = iVar.q();
                                iVar.n().i();
                                try {
                                    ((hf.c) iVar.B).y(0.0f, 0.0f, 0.0f, 0.0f, 1);
                                    drawWithContent.a();
                                    w.c.t(iVar, jQ);
                                } catch (Throwable th3) {
                                    w.c.t(iVar, jQ);
                                    throw th3;
                                }
                            } else if (((Number) p2Var.getValue()).floatValue() <= 0.99f) {
                                eVar2.c(((Number) p2Var.getValue()).floatValue());
                                k2.b bVar = drawWithContent.A;
                                i2.s sVarN = bVar.B.n();
                                sVarN.h(bi.b.g(0L, bVar.b()), eVar2);
                                drawWithContent.a();
                                sVarN.q();
                            } else {
                                drawWithContent.a();
                            }
                            p2 p2Var2 = m1VarO;
                            float fFloatValue3 = ((Number) p2Var2.getValue()).floatValue();
                            b3.f2 f2Var5 = f2Var3;
                            i2.t0 t0Var2 = t0Var;
                            long j3 = j2;
                            n nVar3 = nVar2;
                            b3.f2 f2Var6 = f2Var2;
                            b3.f2 f2Var7 = f2Var;
                            if (0.01f > fFloatValue3 || fFloatValue3 > 0.99f) {
                                f2Var4 = f2Var7;
                                o0Var = drawWithContent;
                                if (((Number) p2Var2.getValue()).floatValue() > 0.99f) {
                                    f2Var5.a = p30.f.c0(o0Var, t0Var2, j3, nVar3, fFloatValue, (i2.l0) f2Var5.a, (y3.m) f2Var6.a, (h2.e) f2Var4.a);
                                }
                            } else {
                                eVar2.c(((Number) p2Var2.getValue()).floatValue());
                                k2.b bVar2 = drawWithContent.A;
                                i2.s sVarN2 = bVar2.B.n();
                                sVarN2.h(bi.b.g(0L, bVar2.b()), eVar2);
                                i2.l0 l0Var = (i2.l0) f2Var5.a;
                                y3.m mVar = (y3.m) f2Var6.a;
                                h2.e eVar3 = (h2.e) f2Var7.a;
                                f2Var4 = f2Var7;
                                o0Var = drawWithContent;
                                f2Var5.a = p30.f.c0(o0Var, t0Var2, j3, nVar3, fFloatValue, l0Var, mVar, eVar3);
                                sVarN2.q();
                            }
                            f2Var4.a = new h2.e(o0Var.A.b());
                            f2Var6.a = o0Var.getLayoutDirection();
                            return g00.b0.a;
                        }
                    });
                    g0Var.n0(objN11);
                }
                r rVar = (r) objN11;
                g0Var.r(false);
                return rVar;
            }
        }));
    }

    public static int m0(a8.n0 n0Var, int i, int i2, int i3) {
        ta.c0.s(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        y3.v(y3.v(i4, i5), 1 << i3);
        if (n0Var.b() < i) {
            return -1;
        }
        int i6 = n0Var.i(i);
        if (i6 == i4) {
            if (n0Var.b() < i2) {
                return -1;
            }
            int i7 = n0Var.i(i2);
            i6 += i7;
            if (i7 == i5) {
                if (n0Var.b() < i3) {
                    return -1;
                }
                return n0Var.i(i3) + i6;
            }
        }
        return i6;
    }

    public static final ce.c n0(int i, t10.i iVar) {
        k20.i iVar2;
        g00.d dVar;
        ce.c cVar;
        j1 j1Var;
        s10.i1 i1Var;
        ce.c cVar2 = new ce.c(12);
        k20.g nameResolver = iVar.a;
        k20.j table = iVar.c;
        kotlin.jvm.internal.m.e(nameResolver, "nameResolver");
        kotlin.jvm.internal.m.e(table, "table");
        g1 g1Var = (g1) h00.q.O0(i, table.a);
        k20.i iVar3 = k20.i.d;
        if (g1Var == null) {
            cVar = null;
        } else {
            Integer numValueOf = (g1Var.B & 1) == 1 ? Integer.valueOf(g1Var.C) : null;
            Integer numValueOf2 = (g1Var.B & 2) == 2 ? Integer.valueOf(g1Var.D) : null;
            if (numValueOf2 != null) {
                iVar2 = new k20.i(numValueOf2.intValue() & 255, (numValueOf2.intValue() >> 8) & 255, (numValueOf2.intValue() >> 16) & 255);
            } else {
                iVar2 = numValueOf != null ? new k20.i(numValueOf.intValue() & 7, (numValueOf.intValue() >> 3) & 15, (numValueOf.intValue() >> 7) & 127) : iVar3;
            }
            i20.e1 e1Var = g1Var.E;
            kotlin.jvm.internal.m.b(e1Var);
            int iOrdinal = e1Var.ordinal();
            if (iOrdinal == 0) {
                dVar = g00.d.A;
            } else if (iOrdinal == 1) {
                dVar = g00.d.B;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = g00.d.C;
            }
            g00.d dVar2 = dVar;
            Integer numValueOf3 = (g1Var.B & 8) == 8 ? Integer.valueOf(g1Var.F) : null;
            String string = (g1Var.B & 16) == 16 ? nameResolver.getString(g1Var.G) : null;
            i20.f1 f1Var = g1Var.H;
            kotlin.jvm.internal.m.d(f1Var, "getVersionKind(...)");
            cVar = new ce.c(iVar2, f1Var, dVar2, numValueOf3, string);
        }
        if (cVar == null && !iVar.d) {
            throw new InconsistentKotlinMetadataException("No VersionRequirement with the given id in the table", 0);
        }
        i20.f1 f1Var2 = cVar != null ? (i20.f1) cVar.C : null;
        int i2 = f1Var2 == null ? -1 : t10.k.a[f1Var2.ordinal()];
        if (i2 == -1) {
            j1Var = j1.D;
        } else if (i2 == 1) {
            j1Var = j1.A;
        } else if (i2 == 2) {
            j1Var = j1.B;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j1Var = j1.C;
        }
        g00.d dVar3 = cVar != null ? (g00.d) cVar.D : null;
        int i3 = dVar3 == null ? -1 : t10.k.b[dVar3.ordinal()];
        if (i3 == -1) {
            i1Var = s10.i1.C;
        } else if (i3 == 1) {
            i1Var = s10.i1.A;
        } else if (i3 != 2) {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i1Var = s10.i1.C;
        } else {
            i1Var = s10.i1.B;
        }
        cVar2.B = j1Var;
        cVar2.C = i1Var;
        cVar2.D = cVar != null ? (Integer) cVar.E : null;
        cVar2.E = cVar != null ? (String) cVar.F : null;
        if (cVar != null) {
            iVar3 = (k20.i) cVar.B;
        }
        cVar2.F = new s10.h1(iVar3.a, iVar3.b, iVar3.c);
        return cVar2;
    }

    public static final w6.c o0(l1.j jVar) {
        androidx.lifecycle.f1 f1VarA = u6.a.a(jVar);
        if (f1VarA == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        g0 g0Var = (g0) jVar;
        Activity activity = (Activity) g0Var.k(e.g.a);
        boolean zI = g0Var.i(activity);
        Object objN = g0Var.N();
        l1.c cVar = l1.i.a;
        if (zI || objN == cVar) {
            objN = new q0.f2(activity, 13);
            g0Var.n0(objN);
        }
        u00.a aVar = (u00.a) objN;
        l1.z0 z0VarG = l1.q.G(aVar, jVar);
        g0 g0Var2 = (g0) jVar;
        boolean zG = g0Var2.g(z0VarG) | g0Var2.g(f1VarA);
        Object objN2 = g0Var2.N();
        if (zG || objN2 == cVar) {
            androidx.lifecycle.e1 viewModelStore = f1VarA.getViewModelStore();
            objN2 = new w6.c(new mu.q(aVar, viewModelStore, 17), new v1.c(new a1.w(viewModelStore, 18), -1481256515, true));
            g0Var2.n0(objN2);
        }
        return (w6.c) objN2;
    }

    public static void p0(a8.n0 n0Var) {
        n0Var.t(3);
        n0Var.t(8);
        boolean zH = n0Var.h();
        boolean zH2 = n0Var.h();
        if (zH) {
            n0Var.t(5);
        }
        if (zH2) {
            n0Var.t(6);
        }
    }

    public static void q0(a8.n0 n0Var) {
        int i;
        int i2 = n0Var.i(2);
        if (i2 == 0) {
            n0Var.t(6);
            return;
        }
        int iM0 = m0(n0Var, 5, 8, 16) + 1;
        if (i2 == 1) {
            n0Var.t(iM0 * 7);
            return;
        }
        if (i2 == 2) {
            boolean zH = n0Var.h();
            int i3 = zH ? 1 : 5;
            int i4 = zH ? 7 : 5;
            int i5 = zH ? 8 : 6;
            int i6 = 0;
            while (i6 < iM0) {
                if (n0Var.h()) {
                    n0Var.t(7);
                    i = 0;
                } else {
                    if (n0Var.i(2) == 3 && n0Var.i(i4) * i3 != 0) {
                        n0Var.s();
                    }
                    i = n0Var.i(i5) * i3;
                    if (i != 0 && i != 180) {
                        n0Var.s();
                    }
                    n0Var.s();
                }
                if (i != 0 && i != 180 && n0Var.h()) {
                    i6++;
                }
                i6++;
            }
        }
    }

    public static final Object r0(int i, Object obj, q3.a0 a0Var, u uVar, int i2) {
        boolean z;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z2 = false;
        if ((i & 1) == 0 || kotlin.jvm.internal.m.a(a0Var.b, uVar)) {
            z = false;
        } else {
            u uVar2 = u.B;
            u uVar3 = u.D;
            if (uVar.a(uVar3) < 0 || a0Var.b.a(uVar3) >= 0) {
                z = false;
            } else {
                z = true;
            }
        }
        boolean z3 = ((i & 2) == 0 || i2 == a0Var.c) ? false : true;
        if (!z3 && !z) {
            return obj;
        }
        int i3 = z ? uVar.A : a0Var.b.A;
        if (!z3 ? a0Var.c == 1 : i2 == 1) {
            z2 = true;
        }
        return Typeface.create((Typeface) obj, i3, z2);
    }

    public static final n20.c s0(n20.c cVar, n20.c prefix) {
        kotlin.jvm.internal.m.e(cVar, "<this>");
        n20.d dVar = cVar.a;
        kotlin.jvm.internal.m.e(prefix, "prefix");
        n20.d dVar2 = prefix.a;
        if (!cVar.equals(prefix) && !dVar2.c()) {
            String str = dVar.a;
            String str2 = dVar2.a;
            if (!r30.r.x0(str, str2, false) || str.charAt(str2.length()) != '.') {
                return cVar;
            }
        }
        if (dVar2.c()) {
            return cVar;
        }
        if (cVar.equals(prefix)) {
            return n20.c.c;
        }
        String strSubstring = dVar.a.substring(dVar2.a.length() + 1);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return new n20.c(strSubstring);
    }

    public static c20.a t0(v0 v0Var, boolean z, b20.f0 f0Var, int i) {
        boolean z2 = (i & 1) != 0 ? false : z;
        boolean z3 = (i & 2) == 0;
        if ((i & 4) != 0) {
            f0Var = null;
        }
        return new c20.a(v0Var, z3, z2, f0Var != null ? w50.c.g0(f0Var) : null, 34);
    }

    public static s10.n0 u0(i20.k kVar, k20.g strings, boolean z, int i) {
        boolean z2 = (i & 2) != 0 ? false : z;
        kotlin.jvm.internal.m.e(kVar, "<this>");
        kotlin.jvm.internal.m.e(strings, "strings");
        s10.n0 n0Var = new s10.n0();
        a1 a1Var = kVar.a0;
        kotlin.jvm.internal.m.d(a1Var, "getTypeTable(...)");
        h9.f fVar = new h9.f(a1Var);
        k20.j jVar = k20.j.b;
        i20.h1 h1Var = kVar.c0;
        kotlin.jvm.internal.m.d(h1Var, "getVersionRequirementTable(...)");
        t10.i iVar = new t10.i(strings, fVar, ta.c0.D(h1Var), z2, h00.x.A, 16);
        List list = kVar.G;
        kotlin.jvm.internal.m.d(list, "getTypeParameterList(...)");
        t10.i iVarB = iVar.b(list);
        List list2 = iVarB.h;
        h9.f fVar2 = iVarB.b;
        n0Var.A = kVar.D;
        int i2 = kVar.E;
        k20.g gVar = iVarB.a;
        String strX = kh.o.x(gVar, i2);
        kotlin.jvm.internal.m.e(strX, "<set-?>");
        n0Var.B = strX;
        List<z0> list3 = kVar.G;
        kotlin.jvm.internal.m.d(list3, "getTypeParameterList(...)");
        for (z0 z0Var : list3) {
            kotlin.jvm.internal.m.b(z0Var);
            n0Var.C.add(z0(z0Var, iVarB));
        }
        Iterator it = w50.c.h0(kVar, fVar2).iterator();
        while (it.hasNext()) {
            n0Var.D.add(y0((u0) it.next(), iVarB));
        }
        List<i20.n> list4 = kVar.P;
        kotlin.jvm.internal.m.d(list4, "getConstructorList(...)");
        for (i20.n nVar : list4) {
            kotlin.jvm.internal.m.b(nVar);
            s10.r0 r0Var = new s10.r0(nVar.D);
            List<c1> list5 = nVar.E;
            kotlin.jvm.internal.m.d(list5, "getValueParameterList(...)");
            for (c1 c1Var : list5) {
                kotlin.jvm.internal.m.b(c1Var);
                r0Var.b.add(A0(c1Var, iVarB));
            }
            List<Integer> list6 = nVar.F;
            kotlin.jvm.internal.m.d(list6, "getVersionRequirementList(...)");
            for (Integer num : list6) {
                kotlin.jvm.internal.m.b(num);
                r0Var.c.add(n0(num.intValue(), iVarB));
            }
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((w10.d) ((u10.l) it2.next())).getClass();
                u10.d type = w10.b.a;
                kotlin.jvm.internal.m.e(type, "type");
                List<i20.h> list7 = nVar.H;
                kotlin.jvm.internal.m.d(list7, "getAnnotationList(...)");
                for (i20.h hVar : list7) {
                    kotlin.jvm.internal.m.b(hVar);
                    r0Var.d.add(kh.o.J(hVar, gVar));
                }
                o20.h hVar2 = m20.g.a;
                m20.e eVarA = m20.g.a(nVar, gVar, fVar2);
                if (eVarA != null) {
                    String name = eVarA.b;
                    String descriptor = eVarA.c;
                    kotlin.jvm.internal.m.e(name, "name");
                    kotlin.jvm.internal.m.e(descriptor, "descriptor");
                }
            }
            n0Var.H.add(r0Var);
        }
        List list8 = kVar.Q;
        kotlin.jvm.internal.m.d(list8, "getFunctionList(...)");
        List list9 = kVar.R;
        kotlin.jvm.internal.m.d(list9, "getPropertyList(...)");
        List list10 = kVar.S;
        kotlin.jvm.internal.m.d(list10, "getTypeAliasList(...)");
        C0(n0Var, list8, list9, list10, iVarB);
        if ((kVar.C & 4) == 4) {
            gVar.getString(kVar.F);
        }
        List<Integer> list11 = kVar.K;
        kotlin.jvm.internal.m.d(list11, "getNestedClassNameList(...)");
        for (Integer num2 : list11) {
            kotlin.jvm.internal.m.b(num2);
            n0Var.I.add(gVar.getString(num2.intValue()));
        }
        for (i20.w wVar : kVar.T) {
            if ((wVar.C & 1) != 1) {
                throw new InconsistentKotlinMetadataException("No name for EnumEntry", 0);
            }
            n0Var.J.add(gVar.getString(wVar.D));
            s10.w0 w0Var = new s10.w0(gVar.getString(wVar.D));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                ((w10.d) ((u10.l) it3.next())).getClass();
                for (i20.h hVar3 : wVar.E) {
                    List list12 = list2;
                    ArrayList arrayList = (ArrayList) w0Var.C;
                    kotlin.jvm.internal.m.b(hVar3);
                    arrayList.add(kh.o.J(hVar3, gVar));
                    list2 = list12;
                }
            }
            n0Var.K.add(w0Var);
        }
        List list13 = list2;
        boolean z3 = false;
        List<Integer> list14 = kVar.U;
        kotlin.jvm.internal.m.d(list14, "getSealedSubclassFqNameList(...)");
        for (Integer num3 : list14) {
            kotlin.jvm.internal.m.b(num3);
            n0Var.L.add(kh.o.x(gVar, num3.intValue()));
        }
        if ((kVar.C & 8) == 8) {
            gVar.getString(kVar.W);
        }
        u0 u0VarR = w50.c.R(kVar, fVar2);
        if (u0VarR == null) {
            if ((kVar.C & 8) == 8) {
                List list15 = kVar.R;
                kotlin.jvm.internal.m.d(list15, "getPropertyList(...)");
                Iterator it4 = list15.iterator();
                Object obj = null;
                while (true) {
                    if (!it4.hasNext()) {
                        if (!z3) {
                            break;
                        }
                        break;
                    }
                    Object next = it4.next();
                    j0 j0Var = (j0) next;
                    kotlin.jvm.internal.m.b(j0Var);
                    if (w50.c.c0(j0Var, fVar2) == null && gVar.getString(j0Var.F).equals(gVar.getString(kVar.W))) {
                        if (!z3) {
                            obj = next;
                            z3 = true;
                        }
                    }
                    obj = null;
                    break;
                }
                j0 j0Var2 = (j0) obj;
                if (j0Var2 != null) {
                    u0VarR = w50.c.f0(j0Var2, fVar2);
                } else {
                    u0VarR = null;
                }
            } else {
                u0VarR = null;
            }
        }
        n0Var.M = u0VarR != null ? y0(u0VarR, iVarB) : null;
        Iterator it5 = w50.c.t(kVar, fVar2).iterator();
        while (it5.hasNext()) {
            n0Var.O.add(y0((u0) it5.next(), iVarB));
        }
        List<Integer> list16 = kVar.b0;
        kotlin.jvm.internal.m.d(list16, "getVersionRequirementList(...)");
        for (Integer num4 : list16) {
            kotlin.jvm.internal.m.b(num4);
            n0Var.P.add(n0(num4.intValue(), iVarB));
        }
        Iterator it6 = list13.iterator();
        while (it6.hasNext()) {
            ((w10.d) ((u10.l) it6.next())).getClass();
            u10.d type2 = w10.a.b;
            kotlin.jvm.internal.m.e(type2, "type");
            w10.a aVar = (w10.a) ((u10.a) z3.R(n0Var.Q, type2));
            List<i20.h> list17 = kVar.Z;
            kotlin.jvm.internal.m.d(list17, "getAnnotationList(...)");
            for (i20.h hVar4 : list17) {
                kotlin.jvm.internal.m.b(hVar4);
                n0Var.N.add(kh.o.J(hVar4, gVar));
            }
            o20.n anonymousObjectOriginName = l20.j.i;
            kotlin.jvm.internal.m.d(anonymousObjectOriginName, "anonymousObjectOriginName");
            Integer num5 = (Integer) w00.a.u(kVar, anonymousObjectOriginName);
            if (num5 != null) {
                gVar.getString(num5.intValue());
            }
            for (j0 j0Var3 : (List) kVar.i(l20.j.h)) {
                ArrayList arrayList2 = aVar.a;
                kotlin.jvm.internal.m.b(j0Var3);
                arrayList2.add(x0(j0Var3, iVarB));
            }
            o20.n classModuleName = l20.j.g;
            kotlin.jvm.internal.m.d(classModuleName, "classModuleName");
            Integer num6 = (Integer) w00.a.u(kVar, classModuleName);
            if (num6 != null) {
                gVar.getString(num6.intValue());
            }
            o20.n jvmClassFlags = l20.j.j;
            kotlin.jvm.internal.m.d(jvmClassFlags, "jvmClassFlags");
        }
        return n0Var;
    }

    public static final s10.t0 v0(i20.z zVar, t10.i iVar) {
        s10.t0 t0Var = new s10.t0(0);
        int i = zVar.C;
        if ((zVar.B & 4) == 4) {
            i20.y yVar = zVar.E;
            if (yVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int iOrdinal = yVar.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        h9.f typeTable = iVar.b;
        kotlin.jvm.internal.m.e(typeTable, "typeTable");
        int i2 = zVar.B;
        u0 u0VarA = (i2 & 8) == 8 ? zVar.F : (i2 & 16) == 16 ? typeTable.a(zVar.G) : null;
        if (u0VarA != null) {
            y0(u0VarA, iVar);
        }
        List<i20.z> list = zVar.H;
        kotlin.jvm.internal.m.d(list, "getAndArgumentList(...)");
        for (i20.z zVar2 : list) {
            kotlin.jvm.internal.m.b(zVar2);
            t0Var.a.add(v0(zVar2, iVar));
        }
        List<i20.z> list2 = zVar.I;
        kotlin.jvm.internal.m.d(list2, "getOrArgumentList(...)");
        for (i20.z zVar3 : list2) {
            kotlin.jvm.internal.m.b(zVar3);
            t0Var.b.add(v0(zVar3, iVar));
        }
        return t0Var;
    }

    public static final s10.y0 w0(b0 b0Var, t10.i iVar) {
        ArrayList arrayList;
        s10.v0 v0Var;
        s10.y0 y0Var = new s10.y0(b0Var.D, iVar.a.getString(b0Var.F));
        List list = b0Var.I;
        kotlin.jvm.internal.m.d(list, "getTypeParameterList(...)");
        t10.i iVarB = iVar.b(list);
        h9.f fVar = iVarB.b;
        List<z0> list2 = b0Var.I;
        kotlin.jvm.internal.m.d(list2, "getTypeParameterList(...)");
        for (z0 z0Var : list2) {
            kotlin.jvm.internal.m.b(z0Var);
            y0Var.b.add(z0(z0Var, iVarB));
        }
        u0 u0VarB0 = w50.c.b0(b0Var, fVar);
        if (u0VarB0 != null) {
            y0(u0VarB0, iVarB);
        }
        List list3 = b0Var.O;
        kotlin.jvm.internal.m.d(list3, "getContextParameterList(...)");
        Iterator it = list3.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = y0Var.e;
            if (!zHasNext) {
                break;
            }
            c1 c1Var = (c1) it.next();
            kotlin.jvm.internal.m.b(c1Var);
            arrayList.add(A0(c1Var, iVarB));
        }
        if (b0Var.O.isEmpty()) {
            List list4 = b0Var.L;
            kotlin.jvm.internal.m.d(list4, "getContextReceiverTypeList(...)");
            if (!list4.isEmpty()) {
                Iterator it2 = w50.c.u(b0Var, fVar).iterator();
                while (it2.hasNext()) {
                    y0((u0) it2.next(), iVarB);
                    arrayList.add(new f1(0, "_"));
                }
            }
        }
        List<c1> list5 = b0Var.P;
        kotlin.jvm.internal.m.d(list5, "getValueParameterList(...)");
        for (c1 c1Var2 : list5) {
            kotlin.jvm.internal.m.b(c1Var2);
            y0Var.d.add(A0(c1Var2, iVarB));
        }
        y0(w50.c.e0(b0Var, fVar), iVarB);
        if ((b0Var.C & 256) == 256) {
            i20.p pVar = b0Var.S;
            kotlin.jvm.internal.m.d(pVar, "getContract(...)");
            ArrayList arrayList2 = new ArrayList(1);
            for (i20.u uVar : pVar.B) {
                if ((uVar.B & 1) == 1) {
                    i20.s sVar = uVar.C;
                    if (sVar == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    int iOrdinal = sVar.ordinal();
                    if (iOrdinal == 0) {
                        v0Var = s10.v0.A;
                    } else if (iOrdinal == 1) {
                        v0Var = s10.v0.B;
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        v0Var = s10.v0.C;
                    }
                    if ((uVar.B & 4) == 4) {
                        i20.t tVar = uVar.F;
                        if (tVar == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        int iOrdinal2 = tVar.ordinal();
                        if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        s10.u0[] u0VarArr = s10.u0.A;
                    }
                    db.g gVar = new db.g(v0Var);
                    List<i20.z> list6 = uVar.D;
                    kotlin.jvm.internal.m.d(list6, "getEffectConstructorArgumentList(...)");
                    ArrayList arrayList3 = gVar.B;
                    for (i20.z zVar : list6) {
                        kotlin.jvm.internal.m.b(zVar);
                        arrayList3.add(v0(zVar, iVarB));
                    }
                    if ((uVar.B & 2) == 2) {
                        i20.z zVar2 = uVar.E;
                        kotlin.jvm.internal.m.d(zVar2, "getConclusionOfConditionalEffect(...)");
                        v0(zVar2, iVarB);
                    }
                    arrayList2.add(gVar);
                }
            }
        }
        List<Integer> list7 = b0Var.R;
        kotlin.jvm.internal.m.d(list7, "getVersionRequirementList(...)");
        for (Integer num : list7) {
            kotlin.jvm.internal.m.b(num);
            y0Var.f.add(n0(num.intValue(), iVarB));
        }
        Iterator it3 = iVarB.h.iterator();
        while (it3.hasNext()) {
            ((w10.d) ((u10.l) it3.next())).getClass();
            k20.g gVar2 = iVarB.a;
            u10.d type = w10.c.a;
            kotlin.jvm.internal.m.e(type, "type");
            List<i20.h> list8 = b0Var.U;
            kotlin.jvm.internal.m.d(list8, "getAnnotationList(...)");
            for (i20.h hVar : list8) {
                kotlin.jvm.internal.m.b(hVar);
                y0Var.g.add(kh.o.J(hVar, gVar2));
            }
            List<i20.h> list9 = b0Var.V;
            kotlin.jvm.internal.m.d(list9, "getExtensionReceiverAnnotationList(...)");
            for (i20.h hVar2 : list9) {
                kotlin.jvm.internal.m.b(hVar2);
                y0Var.c.add(kh.o.J(hVar2, gVar2));
            }
            o20.h hVar3 = m20.g.a;
            m20.e eVarC = m20.g.c(b0Var, gVar2, fVar);
            if (eVarC != null) {
                String name = eVarC.b;
                String descriptor = eVarC.c;
                kotlin.jvm.internal.m.e(name, "name");
                kotlin.jvm.internal.m.e(descriptor, "descriptor");
            }
            o20.n lambdaClassOriginName = l20.j.c;
            kotlin.jvm.internal.m.d(lambdaClassOriginName, "lambdaClassOriginName");
            Integer num2 = (Integer) w00.a.u(b0Var, lambdaClassOriginName);
            if (num2 != null) {
                gVar2.getString(num2.intValue());
            }
        }
        return y0Var;
    }

    public static final s10.z0 x0(j0 j0Var, t10.i iVar) {
        ArrayList arrayList;
        kotlin.jvm.internal.m.e(j0Var, "<this>");
        s10.z0 z0Var = new s10.z0(j0Var.D, (j0Var.C & 256) == 256 ? j0Var.Q : e0(j0Var.D), (j0Var.C & 512) == 512 ? j0Var.R : e0(j0Var.D), iVar.a.getString(j0Var.F));
        List list = j0Var.I;
        kotlin.jvm.internal.m.d(list, "getTypeParameterList(...)");
        t10.i iVarB = iVar.b(list);
        h9.f fVar = iVarB.b;
        List<z0> list2 = j0Var.I;
        kotlin.jvm.internal.m.d(list2, "getTypeParameterList(...)");
        for (z0 z0Var2 : list2) {
            kotlin.jvm.internal.m.b(z0Var2);
            z0Var.d.add(z0(z0Var2, iVarB));
        }
        u0 u0VarC0 = w50.c.c0(j0Var, fVar);
        if (u0VarC0 != null) {
            y0(u0VarC0, iVarB);
        }
        List list3 = j0Var.O;
        kotlin.jvm.internal.m.d(list3, "getContextParameterList(...)");
        Iterator it = list3.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = z0Var.f;
            if (!zHasNext) {
                break;
            }
            c1 c1Var = (c1) it.next();
            kotlin.jvm.internal.m.b(c1Var);
            arrayList.add(A0(c1Var, iVarB));
        }
        if (j0Var.O.isEmpty()) {
            List list4 = j0Var.L;
            kotlin.jvm.internal.m.d(list4, "getContextReceiverTypeList(...)");
            if (!list4.isEmpty()) {
                Iterator it2 = w50.c.v(j0Var, fVar).iterator();
                while (it2.hasNext()) {
                    y0((u0) it2.next(), iVarB);
                    arrayList.add(new f1(0, "_"));
                }
            }
        }
        if ((j0Var.C & 128) == 128) {
            c1 c1Var2 = j0Var.P;
            kotlin.jvm.internal.m.d(c1Var2, "getSetterValueParameter(...)");
            A0(c1Var2, iVarB);
        }
        y0(w50.c.f0(j0Var, fVar), iVarB);
        List<Integer> list5 = j0Var.S;
        kotlin.jvm.internal.m.d(list5, "getVersionRequirementList(...)");
        for (Integer num : list5) {
            kotlin.jvm.internal.m.b(num);
            z0Var.g.add(n0(num.intValue(), iVarB));
        }
        Iterator it3 = iVarB.h.iterator();
        while (it3.hasNext()) {
            ((w10.d) ((u10.l) it3.next())).getClass();
            k20.g gVar = iVarB.a;
            u10.d type = w10.f.a;
            kotlin.jvm.internal.m.e(type, "type");
            List<i20.h> list6 = j0Var.U;
            kotlin.jvm.internal.m.d(list6, "getAnnotationList(...)");
            for (i20.h hVar : list6) {
                kotlin.jvm.internal.m.b(hVar);
                z0Var.h.add(kh.o.J(hVar, gVar));
            }
            List<i20.h> list7 = j0Var.V;
            kotlin.jvm.internal.m.d(list7, "getGetterAnnotationList(...)");
            ArrayList arrayList2 = z0Var.b.b;
            for (i20.h hVar2 : list7) {
                kotlin.jvm.internal.m.b(hVar2);
                arrayList2.add(kh.o.J(hVar2, gVar));
            }
            s10.a1 a1Var = z0Var.c;
            if (a1Var != null) {
                List<i20.h> list8 = j0Var.W;
                kotlin.jvm.internal.m.d(list8, "getSetterAnnotationList(...)");
                ArrayList arrayList3 = a1Var.b;
                for (i20.h hVar3 : list8) {
                    kotlin.jvm.internal.m.b(hVar3);
                    arrayList3.add(kh.o.J(hVar3, gVar));
                }
            }
            List<i20.h> list9 = j0Var.X;
            kotlin.jvm.internal.m.d(list9, "getExtensionReceiverAnnotationList(...)");
            for (i20.h hVar4 : list9) {
                kotlin.jvm.internal.m.b(hVar4);
                z0Var.e.add(kh.o.J(hVar4, gVar));
            }
            List<i20.h> list10 = j0Var.Y;
            kotlin.jvm.internal.m.d(list10, "getBackingFieldAnnotationList(...)");
            for (i20.h hVar5 : list10) {
                kotlin.jvm.internal.m.b(hVar5);
                z0Var.i.add(kh.o.J(hVar5, gVar));
            }
            List<i20.h> list11 = j0Var.Z;
            kotlin.jvm.internal.m.d(list11, "getDelegateFieldAnnotationList(...)");
            for (i20.h hVar6 : list11) {
                kotlin.jvm.internal.m.b(hVar6);
                z0Var.j.add(kh.o.J(hVar6, gVar));
            }
            o20.h hVar7 = m20.g.a;
            m20.d dVarB = m20.g.b(j0Var, gVar, fVar, true);
            o20.n propertySignature = l20.j.d;
            kotlin.jvm.internal.m.d(propertySignature, "propertySignature");
            l20.d dVar = (l20.d) w00.a.u(j0Var, propertySignature);
            l20.c cVar = null;
            l20.c cVar2 = (dVar == null || !dVar.g()) ? null : dVar.E;
            l20.c cVar3 = (dVar == null || (dVar.B & 8) != 8) ? null : dVar.F;
            Object objI = j0Var.i(l20.j.e);
            kotlin.jvm.internal.m.d(objI, "getExtension(...)");
            ((Number) objI).intValue();
            if (dVarB != null) {
                String name = dVarB.b;
                String descriptor = dVarB.c;
                kotlin.jvm.internal.m.e(name, "name");
                kotlin.jvm.internal.m.e(descriptor, "descriptor");
            }
            if (cVar2 != null) {
                gVar.getString(cVar2.C);
                gVar.getString(cVar2.D);
            }
            if (cVar3 != null) {
                gVar.getString(cVar3.C);
                gVar.getString(cVar3.D);
            }
            l20.c cVar4 = (dVar == null || (dVar.B & 2) != 2) ? null : dVar.D;
            if (cVar4 != null) {
                gVar.getString(cVar4.C);
                gVar.getString(cVar4.D);
            }
            if (dVar != null && (dVar.B & 16) == 16) {
                cVar = dVar.G;
            }
            if (cVar != null) {
                gVar.getString(cVar.C);
                gVar.getString(cVar.D);
            }
        }
        return z0Var;
    }

    public static final s10.b1 y0(u0 u0Var, t10.i iVar) {
        z3 q0Var;
        h9.f fVar = iVar.b;
        k20.g gVar = iVar.a;
        s10.b1 b1Var = new s10.b1((u0Var.E ? 1 : 0) + (u0Var.Q << 1));
        if (u0Var.n()) {
            q0Var = new s10.o0(kh.o.x(gVar, u0Var.I));
        } else {
            int i = u0Var.C;
            if ((i & 128) == 128) {
                q0Var = new p0(kh.o.x(gVar, u0Var.L));
            } else if ((i & 32) == 32) {
                q0Var = new q0(u0Var.J);
            } else {
                if ((i & 64) != 64) {
                    throw new InconsistentKotlinMetadataException("No classifier (class, type alias or type parameter) recorded for Type", 0);
                }
                Integer numA = iVar.a(u0Var.K);
                if (numA == null) {
                    throw new InconsistentKotlinMetadataException("No type parameter id for ".concat(gVar.getString(u0Var.K)), 0);
                }
                q0Var = new q0(numA.intValue());
            }
        }
        b1Var.b = q0Var;
        Iterator it = u0Var.D.iterator();
        while (true) {
            x0 x0Var = null;
            s10.g1 g1Var = null;
            if (!it.hasNext()) {
                u0 u0VarJ = w50.c.j(u0Var, fVar);
                b1Var.d = u0VarJ != null ? y0(u0VarJ, iVar) : null;
                u0 u0VarX = w50.c.X(u0Var, fVar);
                b1Var.e = u0VarX != null ? y0(u0VarX, iVar) : null;
                u0 u0VarG = w50.c.G(u0Var, fVar);
                if (u0VarG != null) {
                    s10.b1 b1VarY0 = y0(u0VarG, iVar);
                    String string = (u0Var.C & 2) == 2 ? gVar.getString(u0Var.F) : null;
                    x0 x0Var2 = new x0();
                    x0Var2.a = b1VarY0;
                    x0Var2.b = string;
                    x0Var = x0Var2;
                }
                b1Var.f = x0Var;
                Iterator it2 = iVar.h.iterator();
                while (it2.hasNext()) {
                    ((w10.d) ((u10.l) it2.next())).getClass();
                    u10.d type = w10.g.c;
                    kotlin.jvm.internal.m.e(type, "type");
                    w10.g gVar2 = (w10.g) ((u10.h) z3.R(b1Var.g, type));
                    Object objI = u0Var.i(l20.j.f);
                    kotlin.jvm.internal.m.d(objI, "getExtension(...)");
                    gVar2.a = ((Boolean) objI).booleanValue();
                    for (i20.h hVar : u0Var.R) {
                        ArrayList arrayList = gVar2.b;
                        kotlin.jvm.internal.m.b(hVar);
                        arrayList.add(kh.o.J(hVar, gVar));
                    }
                }
                return b1Var;
            }
            i20.s0 s0Var = (i20.s0) it.next();
            i20.r0 r0Var = s0Var.C;
            if (r0Var == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int iOrdinal = r0Var.ordinal();
            if (iOrdinal == 0) {
                g1Var = s10.g1.B;
            } else if (iOrdinal == 1) {
                g1Var = s10.g1.C;
            } else if (iOrdinal == 2) {
                g1Var = s10.g1.A;
            } else if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ArrayList arrayList2 = b1Var.c;
            if (g1Var != null) {
                u0 u0VarJ0 = w50.c.j0(s0Var, fVar);
                if (u0VarJ0 == null) {
                    throw new InconsistentKotlinMetadataException("No type argument for non-STAR projection in Type", 0);
                }
                arrayList2.add(new s10.e1(g1Var, y0(u0VarJ0, iVar)));
            } else {
                arrayList2.add(s10.e1.c);
            }
        }
    }

    public static final d1 z0(z0 z0Var, t10.i iVar) {
        s10.g1 g1Var;
        k20.g gVar = iVar.a;
        i20.y0 y0Var = z0Var.G;
        if (y0Var == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int iOrdinal = y0Var.ordinal();
        if (iOrdinal == 0) {
            g1Var = s10.g1.B;
        } else if (iOrdinal == 1) {
            g1Var = s10.g1.C;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            g1Var = s10.g1.A;
        }
        boolean z = z0Var.F;
        d1 d1Var = new d1(z ? 1 : 0, gVar.getString(z0Var.E), z0Var.D, g1Var);
        Iterator it = w50.c.m0(z0Var, iVar.b).iterator();
        while (it.hasNext()) {
            d1Var.e.add(y0((u0) it.next(), iVar));
        }
        Iterator it2 = iVar.h.iterator();
        while (it2.hasNext()) {
            ((w10.d) ((u10.l) it2.next())).getClass();
            u10.d type = w10.h.b;
            kotlin.jvm.internal.m.e(type, "type");
            w10.h hVar = (w10.h) ((u10.i) z3.R(d1Var.f, type));
            for (i20.h hVar2 : z0Var.K) {
                ArrayList arrayList = hVar.a;
                kotlin.jvm.internal.m.b(hVar2);
                arrayList.add(kh.o.J(hVar2, gVar));
            }
        }
        return d1Var;
    }

    @Override
    public double A(n40.e descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return E();
    }

    @Override
    public abstract byte B();

    @Override
    public abstract short C();

    @Override
    public float D() {
        a0();
        throw null;
    }

    @Override
    public double E() {
        a0();
        throw null;
    }

    public abstract String X();

    @Override
    public void a(n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
    }

    public void a0() {
        throw new SerializationException(kotlin.jvm.internal.a0.a.b(getClass()) + " can't retrieve untyped values");
    }

    public boolean b0(sd.j1 j1Var) {
        return true;
    }

    @Override
    public o40.a c(n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return this;
    }

    @Override
    public int d(n40.e enumDescriptor) {
        kotlin.jvm.internal.m.e(enumDescriptor, "enumDescriptor");
        a0();
        throw null;
    }

    @Override
    public boolean e() {
        a0();
        throw null;
    }

    @Override
    public char f() {
        a0();
        throw null;
    }

    @Override
    public long g(n40.e descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return u();
    }

    @Override
    public short h(p40.s0 descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return C();
    }

    @Override
    public byte i(p40.s0 descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return B();
    }

    @Override
    public Object j(l40.a deserializer) {
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        return deserializer.deserialize(this);
    }

    @Override
    public char k(p40.s0 descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return f();
    }

    public abstract void l0(String str);

    @Override
    public abstract int n();

    @Override
    public o40.c o(n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return this;
    }

    @Override
    public String p() {
        a0();
        throw null;
    }

    @Override
    public int q(n40.e descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return n();
    }

    @Override
    public boolean r(n40.e descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return e();
    }

    @Override
    public Object s(n40.e descriptor, int i, l40.a deserializer, Object obj) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        return j(deserializer);
    }

    @Override
    public String t(n40.e descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return p();
    }

    @Override
    public abstract long u();

    @Override
    public Object v(n40.e descriptor, int i, l40.a deserializer, Object obj) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        if (deserializer.getDescriptor().c() || w()) {
            return j(deserializer);
        }
        return null;
    }

    @Override
    public boolean w() {
        return true;
    }

    @Override
    public float x(n40.e descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return D();
    }

    @Override
    public o40.c z(p40.s0 descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return o(descriptor.h(i));
    }
}

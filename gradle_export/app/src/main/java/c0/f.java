package c0;

import a1.e2;
import a1.o1;
import a1.q2;
import a10.h0;
import a30.x;
import ab.a0;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b2.r;
import bt.t0;
import c00.t;
import c3.g1;
import c3.o0;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import d0.q1;
import ds.l;
import g00.b0;
import g1.o3;
import g1.z6;
import gv.p;
import gz.w0;
import h0.c1;
import h0.l0;
import h0.t1;
import h0.u;
import h0.v;
import h0.v1;
import h0.w;
import h0.w1;
import h0.z1;
import jz.y;
import jz.z;
import kh.n;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.i1;
import l1.j;
import l1.m1;
import l1.p2;
import l1.q;
import l1.z0;
import m3.i0;
import q0.y1;
import qd.s0;
import sd.p1;
import u00.k;
import u00.o;
import v2.f0;
import z2.v0;
import z2.y0;

public final class f implements o {
    public final int A;
    public final Object B;
    public final Object C;

    public f(Object obj, Object obj2, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    public f(Object obj, k kVar, int i10) {
        this.A = i10;
        this.C = obj;
        this.B = kVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        g0 g0Var;
        ?? r11;
        go.a aVar = (go.a) this.B;
        to.f fVar = (to.f) this.C;
        j jVar = (j) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        m.e((w1) obj, "$this$LiquidPlayer");
        boolean z10 = (iIntValue & 17) != 16;
        g0 g0Var2 = (g0) jVar;
        x xVar = g0Var2.f9842a;
        if (g0Var2.S(iIntValue & 1, z10)) {
            b2.o oVar = b2.o.A;
            r rVarE = h0.c.E(z1.d(oVar, 1.0f), 0.0f, 6, 1);
            h0.f fVarG = h0.i.g(12);
            b2.h hVar = b2.b.K;
            v1 v1VarA = t1.a(fVarG, hVar, jVar, 54);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            r rVarC = b2.a.c(rVarE, jVar);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            b3.f fVar2 = b3.h.f2039f;
            q.I(v1VarA, jVar, fVar2);
            b3.f fVar3 = b3.h.f2038e;
            q.I(m1VarM, jVar, fVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar4 = b3.h.f2040g;
            q.I(numValueOf, jVar, fVar4);
            b3.e eVar = b3.h.f2041h;
            q.E(jVar, eVar);
            b3.f fVar5 = b3.h.f2037d;
            q.I(rVarC, jVar, fVar5);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, true);
            float f3 = 8;
            v1 v1VarA2 = t1.a(h0.i.g(f3), hVar, jVar, 54);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            m1 m1VarM2 = g0Var2.m();
            r rVarC2 = b2.a.c(c1Var, jVar);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(v1VarA2, jVar, fVar2);
            q.I(m1VarM2, jVar, fVar3);
            x5.u(iHashCode2, jVar, fVar4, jVar, eVar);
            q.I(rVarC2, jVar, fVar5);
            lo.e eVar2 = fVar.a;
            boolean z11 = fVar.d;
            h0.a(eVar2, f2.h.c(z1.m(oVar, 36), p0.f.a(f3)), 0.0f, false, (Integer) null, false, jVar, 0, 60);
            v vVarA = u.a(h0.i.f6408c, b2.b.M, jVar, 0);
            int iHashCode3 = Long.hashCode(g0Var2.T);
            m1 m1VarM3 = g0Var2.m();
            r rVarC3 = b2.a.c(oVar, jVar);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(vVarA, jVar, fVar2);
            q.I(m1VarM3, jVar, fVar3);
            x5.u(iHashCode3, jVar, fVar4, jVar, eVar);
            q.I(rVarC3, jVar, fVar5);
            z6.b(z3.T(2131886133, new Object[]{Integer.valueOf(fVar.b)}, jVar), null, dl.a.k, kh.o.z(12), null, null, 0L, null, null, kh.o.z(10), 0, false, 1, 0, null, null, jVar, 24576, 24624, 243690);
            z6.b(fVar.c, null, dl.a.o, kh.o.z(11), null, null, 0L, null, null, kh.o.z(6), 2, false, 1, 0, null, null, jVar, 24576, 25008, 239594);
            g0Var2.r(true);
            g0Var2.r(true);
            r rVarM = z1.m(oVar, 14);
            boolean zI = g0Var2.i(aVar);
            Object objN = g0Var2.N();
            l1.c cVar = l1.i.f9868a;
            if (zI || objN == cVar) {
                g0Var = g0Var2;
                r11 = 0;
                pi.c cVar2 = new pi.c(0, aVar, go.a.class, "playPause", "playPause()V", 0, 7);
                g0Var.n0(cVar2);
                objN = cVar2;
            } else {
                r11 = 0;
                g0Var = g0Var2;
            }
            o3.a(y3.R(z11 ? 2131231354 : 2131231358, jVar, r11), z3.U(jVar, z11 ? 2131886141 : 2131886151), w50.c.o(rVarM, (boolean) r11, (j3.k) null, (a10.g) objN, 7), dl.a.j, jVar, 8, 0);
            String strU = z3.U(jVar, 2131886766);
            boolean zI2 = g0Var.i(aVar);
            Object objN2 = g0Var.N();
            if (zI2 || objN2 == cVar) {
                pi.c cVar3 = new pi.c(0, aVar, go.a.class, "skipForward", "skipForward()V", 0, 8);
                g0Var.n0(cVar3);
                objN2 = cVar3;
            }
            to.m.a(2131231379, true, strU, (a10.g) objN2, (r) null, 28, 20, 0L, jVar, 1769520, 144);
            g0Var.r(true);
        } else {
            g0Var2.V();
        }
        return b0.a;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        l1.c cVar;
        Typeface typeface;
        int i10 = this.A;
        float f3 = 0.0f;
        b2.o oVar = b2.o.A;
        k00.c cVar2 = null;
        l1.c cVar3 = l1.i.f9868a;
        b0 b0Var = b0.a;
        Object obj4 = this.B;
        Object obj5 = this.C;
        switch (i10) {
            case 0:
                k kVar = (k) obj4;
                c cVar4 = (c) obj5;
                j jVar = (j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                g0 g0Var = (g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Object objN = g0Var.N();
                    if (objN == cVar3) {
                        objN = new d();
                        g0Var.n0(objN);
                    }
                    d dVar = (d) objN;
                    dVar.f2582a.clear();
                    kVar.invoke(dVar);
                    dVar.a(cVar4, jVar, 0);
                } else {
                    g0Var.V();
                }
                return b0Var;
            case 1:
                t tVar = (t) obj5;
                k kVar2 = (k) obj4;
                j jVar2 = (j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                m.e((k0.k) obj, "$this$item");
                g0 g0Var2 = (g0) jVar2;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean z10 = tVar.f == null;
                    boolean zG = g0Var2.g(kVar2);
                    Object objN2 = g0Var2.N();
                    if (zG || objN2 == cVar3) {
                        objN2 = new t0(6, kVar2);
                        g0Var2.n0(objN2);
                    }
                    c00.a.f(z10, (u00.a) objN2, jVar2, 0);
                } else {
                    g0Var2.V();
                }
                return b0Var;
            case 2:
                ry.a aVar = (ry.a) obj4;
                u00.a aVar2 = (u00.a) obj5;
                j jVar3 = (j) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                m.e((w) obj, "$this$ModalBottomSheet");
                g0 g0Var3 = (g0) jVar3;
                if (g0Var3.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    g4.d(6, dl.a.q, jVar3, true);
                    cz.a.e(aVar, aVar2, jVar3, 0);
                } else {
                    g0Var3.V();
                }
                return b0Var;
            case 3:
                String str = (String) obj4;
                j jVar4 = (j) obj2;
                ((Integer) obj3).getClass();
                m.e((j6.g) obj, "$this$Column");
                n.p(20, null, jVar4, 6);
                b6.k kVar3 = b6.k.f2179a;
                a.a.f(ze.d.D(kVar3, 8), jVar4, 0);
                ze.d.e(str, null, new n6.e(dn.d.a, new y3.o(kh.o.z(14)), new n6.b(MediaError.DetailedErrorCode.SEGMENT_UNKNOWN), new n6.c(), MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED), 0, jVar4, 0, 10);
                a.a.f(ze.d.D(kVar3, 4), jVar4, 0);
                ze.d.e((String) obj5, null, new n6.e(dn.d.b, new y3.o(kh.o.z(12)), null, new n6.c(), 108), 0, jVar4, 0, 10);
                return b0Var;
            case 4:
                u00.a aVar3 = (u00.a) obj5;
                k kVar4 = (k) obj4;
                ((Integer) obj3).getClass();
                g0 g0Var4 = (g0) ((j) obj2);
                g0Var4.c0(759876635);
                Object objN3 = g0Var4.N();
                Object obj6 = objN3;
                if (objN3 == cVar3) {
                    l1.w wVarR = q.r(aVar3);
                    g0Var4.n0(wVarR);
                    obj6 = wVarR;
                }
                p2 p2Var = (p2) obj6;
                Object objN4 = g0Var4.N();
                Object obj7 = objN4;
                if (objN4 == cVar3) {
                    x.b bVar = new x.b(new h2.b(((h2.b) p2Var.getValue()).f6544a), e1.h0.f4966b, new h2.b(e1.h0.f4967c), 8);
                    g0Var4.n0(bVar);
                    obj7 = bVar;
                }
                x.b bVar2 = (x.b) obj7;
                boolean zI = g0Var4.i(bVar2);
                Object objN5 = g0Var4.N();
                Object obj8 = objN5;
                if (zI || objN5 == cVar3) {
                    e2 e2Var = new e2(p2Var, bVar2, cVar2, 25);
                    g0Var4.n0(e2Var);
                    obj8 = e2Var;
                }
                q.i(b0Var, g0Var4, (u00.n) obj8);
                x.j jVar5 = bVar2.f16234c;
                boolean zG2 = g0Var4.g(jVar5);
                Object objN6 = g0Var4.N();
                Object obj9 = objN6;
                if (zG2 || objN6 == cVar3) {
                    l lVar = new l(jVar5, 2);
                    g0Var4.n0(lVar);
                    obj9 = lVar;
                }
                r rVar = (r) kVar4.invoke((u00.a) obj9);
                g0Var4.r(false);
                return rVar;
            case 5:
                yu.f fVar = (yu.f) obj5;
                k kVar5 = (k) obj4;
                j jVar6 = (j) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                m.e((w) obj, "$this$DropdownMenuNoPaddingVertical");
                boolean z11 = (iIntValue4 & 17) != 16;
                g0 g0Var5 = (g0) jVar6;
                x xVar = g0Var5.f9842a;
                if (g0Var5.S(iIntValue4 & 1, z11)) {
                    r rVarD = h0.c.D(z1.s(oVar, 0.0f, 340, 1), 12, 10);
                    float f10 = 8;
                    v vVarA = u.a(h0.i.g(f10), b2.b.M, jVar6, 6);
                    int iHashCode = Long.hashCode(g0Var5.T);
                    m1 m1VarM = g0Var5.m();
                    r rVarC = b2.a.c(rVarD, jVar6);
                    b3.i.f2042c.getClass();
                    b3.g gVar = b3.h.f2035b;
                    g0Var5.g0();
                    if (g0Var5.S) {
                        g0Var5.l(gVar);
                    } else {
                        g0Var5.q0();
                    }
                    b3.f fVar2 = b3.h.f2039f;
                    q.I(vVarA, jVar6, fVar2);
                    b3.f fVar3 = b3.h.f2038e;
                    q.I(m1VarM, jVar6, fVar3);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b3.f fVar4 = b3.h.f2040g;
                    q.I(numValueOf, jVar6, fVar4);
                    b3.e eVar = b3.h.f2041h;
                    q.E(jVar6, eVar);
                    b3.f fVar5 = b3.h.f2037d;
                    q.I(rVarC, jVar6, fVar5);
                    r rVarD2 = z1.d(oVar, 1.0f);
                    l1.c cVar5 = cVar3;
                    v1 v1VarA = t1.a(h0.i.f6410e, b2.b.K, jVar6, 54);
                    int iHashCode2 = Long.hashCode(g0Var5.T);
                    m1 m1VarM2 = g0Var5.m();
                    r rVarC2 = b2.a.c(rVarD2, jVar6);
                    g0Var5.g0();
                    yu.f fVar6 = fVar;
                    if (g0Var5.S) {
                        g0Var5.l(gVar);
                    } else {
                        g0Var5.q0();
                    }
                    q.I(v1VarA, jVar6, fVar2);
                    q.I(m1VarM2, jVar6, fVar3);
                    x5.u(iHashCode2, jVar6, fVar4, jVar6, eVar);
                    q.I(rVarC2, jVar6, fVar5);
                    m2.b bVarR = y3.R(2131231364, jVar6, 0);
                    r rVarM = z1.m(oVar, 18);
                    long j9 = dl.a.k;
                    o3.a(bVarR, null, rVarM, j9, jVar6, 440, 0);
                    h0.c.h(h0.c.C(oVar, f10), jVar6);
                    z6.b(z3.U(jVar6, 2131887057), null, j9, kh.o.z(14), q3.u.D, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, jVar6, 1597440, 0, 262058);
                    g0Var5.r(true);
                    g1.x5.c(null, 0.0f, i2.t.b(0.12f, j9), jVar6, 0, 3);
                    r rVarM2 = z.n.m(oVar, z.n.l(jVar6), true, false);
                    v1 v1VarA2 = t1.a(h0.i.g(f10), b2.b.J, jVar6, 6);
                    int iHashCode3 = Long.hashCode(g0Var5.T);
                    m1 m1VarM3 = g0Var5.m();
                    r rVarC3 = b2.a.c(rVarM2, jVar6);
                    g0Var5.g0();
                    if (g0Var5.S) {
                        g0Var5.l(gVar);
                    } else {
                        g0Var5.q0();
                    }
                    q.I(v1VarA2, jVar6, fVar2);
                    q.I(m1VarM3, jVar6, fVar3);
                    x5.u(iHashCode3, jVar6, fVar4, jVar6, eVar);
                    q.I(rVarC3, jVar6, fVar5);
                    g0Var5.c0(-1509421470);
                    for (yu.f fVar7 : yu.f.D) {
                        yu.f fVar8 = fVar6;
                        boolean z12 = fVar7 == fVar8;
                        String strA = fVar7.a();
                        boolean zG3 = g0Var5.g(kVar5) | g0Var5.e(fVar7.ordinal());
                        Object objN7 = g0Var5.N();
                        if (zG3) {
                            cVar = cVar5;
                        } else {
                            cVar = cVar5;
                            if (objN7 == cVar) {
                            }
                            p.l(0, strA, jVar6, (u00.a) objN7, z12);
                            fVar6 = fVar8;
                            cVar5 = cVar;
                        }
                        objN7 = new o1(kVar5, fVar7, 12);
                        g0Var5.n0(objN7);
                        p.l(0, strA, jVar6, (u00.a) objN7, z12);
                        fVar6 = fVar8;
                        cVar5 = cVar;
                    }
                    g0Var5.r(false);
                    g0Var5.r(true);
                    z6.b(z3.U(jVar6, 2131887056), z1.d(oVar, 1.0f), i2.t.b(0.45f, dl.a.k), kh.o.z(10), null, null, 0L, null, new x3.k(3), 0L, 0, false, 0, 0, null, null, jVar6, 24624, 0, 261096);
                    g0Var5.r(true);
                } else {
                    g0Var5.V();
                }
                return b0Var;
            case 6:
                jk.a aVar4 = (jk.a) obj5;
                k kVar6 = (k) obj4;
                j jVar7 = (j) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                m.e((w) obj, "$this$PlayerLiquidGlassContainer");
                g0 g0Var6 = (g0) jVar7;
                if (g0Var6.S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    p.A(aVar4, kVar6, (r) null, jVar7, 0);
                } else {
                    g0Var6.V();
                }
                return b0Var;
            case 7:
                gz.m1 m1Var = (gz.m1) obj4;
                p2 p2Var2 = (p2) obj5;
                j jVar8 = (j) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                m.e((j0.b) obj, "$this$item");
                g0 g0Var7 = (g0) jVar8;
                if (g0Var7.S(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    r rVarE = h0.c.E(oVar, s0.L(p2Var2), 0.0f, 2);
                    boolean zG4 = g0Var7.g(m1Var);
                    Object objN8 = g0Var7.N();
                    if (zG4 || objN8 == cVar3) {
                        objN8 = new w0(m1Var, 23);
                        g0Var7.n0(objN8);
                    }
                    iz.d.i((u00.a) objN8, rVarE, jVar8, 0);
                    h0.c.h(z1.e(oVar, 20), jVar8);
                } else {
                    g0Var7.V();
                }
                return b0Var;
            case 8:
                z zVar = (z) obj4;
                r rVar2 = (r) obj5;
                j jVar9 = (j) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                m.e((j0.b) obj, "$this$item");
                g0 g0Var8 = (g0) jVar9;
                if (g0Var8.S(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    y.c(zVar, rVar2, jVar9, 0);
                } else {
                    g0Var8.V();
                }
                return b0Var;
            case 9:
                j jVar10 = (j) obj2;
                ((Integer) obj3).getClass();
                m.e((j6.q) obj, "$this$Row");
                String string = ((Context) obj4).getString(2131887364, Integer.valueOf(((ln.c) obj5).b));
                m.d(string, "getString(...)");
                o6.g gVar2 = dn.d.c;
                ze.d.e(string, null, new n6.e(gVar2, new y3.o(kh.o.z(12)), null, null, 124), 1, jVar10, 3072, 2);
                a.a.f(ze.d.U(2), jVar10, 0);
                w50.c.d(new b6.a(2131231424), (String) null, ze.d.R(12), 0, new b6.e(new b6.u(gVar2)), jVar10, 32816, 8);
                return b0Var;
            case 10:
                ln.a aVar5 = (ln.a) obj4;
                ln.c cVar6 = (ln.c) obj5;
                j jVar11 = (j) obj2;
                ((Integer) obj3).getClass();
                m.e((j6.g) obj, "$this$Column");
                ln.b bVar3 = aVar5.b;
                int i11 = cVar6.b;
                f50.c.d(bVar3, i11 > 0 ? a0.x(cVar6.a / (i11 * 60), 0.0f, 1.0f) : 0.0f, 36, (b6.m) null, jVar11, 384);
                a.a.f(ze.d.D(b6.k.f2179a, 2), jVar11, 0);
                ze.d.e(aVar5.a, null, new n6.e(dn.d.a, new y3.o(kh.o.z(12)), new n6.b(MediaError.DetailedErrorCode.SEGMENT_UNKNOWN), new n6.c(), MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED), 1, jVar11, 3072, 2);
                return b0Var;
            case 11:
                a40.z zVar2 = (a40.z) obj4;
                g1 g1Var = (g1) obj5;
                j jVar12 = (j) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                m.e((j0.b) obj, "$this$item");
                boolean z13 = (iIntValue8 & 17) != 16;
                int i12 = iIntValue8 & 1;
                g0 g0Var9 = (g0) jVar12;
                if (g0Var9.S(i12, z13)) {
                    r rVarE2 = h0.c.E(oVar, 16, 0.0f, 2);
                    boolean zI2 = g0Var9.i(zVar2) | g0Var9.i(g1Var);
                    Object objN9 = g0Var9.N();
                    if (zI2 || objN9 == cVar3) {
                        objN9 = new l6.c(zVar2, g1Var, 3);
                        g0Var9.n0(objN9);
                    }
                    mz.a.h((u00.a) objN9, rVarE2, jVar12, 48);
                } else {
                    g0Var9.V();
                }
                return b0Var;
            case 12:
                m0.w wVar = (m0.w) obj4;
                y3.m mVar = (y3.m) obj5;
                float fFloatValue = ((Float) obj).floatValue();
                float fFloatValue2 = ((Float) obj2).floatValue();
                float fFloatValue3 = ((Float) obj3).floatValue();
                boolean zP = va.a.P(wVar, fFloatValue);
                if (wVar.k().f10369e != q1.A && mVar != y3.m.A) {
                    zP = !zP;
                }
                int i13 = wVar.k().f10366b;
                float fH = i13 == 0 ? 0.0f : va.a.H(wVar) / i13;
                float f11 = fH - ((int) fH);
                char c10 = Math.abs(fFloatValue) >= wVar.f10396n.A0(e0.l.f4950a) ? fFloatValue > 0.0f ? (char) 1 : (char) 2 : (char) 0;
                if (c10 == 0) {
                    if (Math.abs(f11) <= 0.5f ? Math.abs(fH) < Math.abs(Math.min(wVar.f10396n.A0(m0.z.f10409a), wVar.m() / 2.0f) / wVar.m()) ? Math.abs(fFloatValue2) >= Math.abs(fFloatValue3) : !zP : zP) {
                        f3 = fFloatValue3;
                    } else {
                        f3 = fFloatValue2;
                    }
                } else if (c10 == 1) {
                    f3 = fFloatValue3;
                } else if (c10 == 2) {
                    f3 = fFloatValue2;
                }
                return Float.valueOf(f3);
            case 13:
                ju.b bVar4 = (ju.b) obj4;
                String str2 = (String) obj5;
                h0.r rVar3 = (h0.r) obj;
                j jVar13 = (j) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                m.e(rVar3, "$this$LiquidBox");
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= ((g0) jVar13).g(rVar3) ? 4 : 2;
                }
                boolean z14 = (iIntValue9 & 19) != 18;
                g0 g0Var10 = (g0) jVar13;
                x xVar2 = g0Var10.f9842a;
                if (!g0Var10.S(iIntValue9 & 1, z14)) {
                    g0Var10.V();
                    return b0Var;
                }
                float f12 = 12;
                r rVarD3 = h0.c.D(z1.d(oVar, 1.0f), f12, f12);
                h0.b bVar5 = h0.i.f6406a;
                v1 v1VarA3 = t1.a(h0.i.g(bVar4.g), b2.b.J, jVar13, 0);
                int iHashCode4 = Long.hashCode(g0Var10.T);
                m1 m1VarM4 = g0Var10.m();
                r rVarC4 = b2.a.c(rVarD3, jVar13);
                b3.i.f2042c.getClass();
                b3.g gVar3 = b3.h.f2035b;
                g0Var10.g0();
                if (g0Var10.S) {
                    g0Var10.l(gVar3);
                } else {
                    g0Var10.q0();
                }
                b3.f fVar9 = b3.h.f2039f;
                q.I(v1VarA3, jVar13, fVar9);
                b3.f fVar10 = b3.h.f2038e;
                q.I(m1VarM4, jVar13, fVar10);
                Integer numValueOf2 = Integer.valueOf(iHashCode4);
                b3.f fVar11 = b3.h.f2040g;
                q.I(numValueOf2, jVar13, fVar11);
                b3.e eVar2 = b3.h.f2041h;
                q.E(jVar13, eVar2);
                b3.f fVar12 = b3.h.f2037d;
                q.I(rVarC4, jVar13, fVar12);
                wb.h hVar = new wb.h((Context) g0Var10.k(o0.f2722b));
                hVar.f15918c = 2131689473;
                z.n.c(mb.l.i(w.c.q(hVar, MediaError.DetailedErrorCode.TEXT_UNKNOWN), null, jVar13, 0, 62), z3.U(jVar13, 2131886927), h0.c.G(z1.m(oVar, bVar4.f), 0.0f, (float) 0.5d, 0.0f, 0.0f, 13), null, null, 0.0f, jVar13, 0, 120);
                v vVarA2 = u.a(h0.i.f6408c, b2.b.M, jVar13, 0);
                int iHashCode5 = Long.hashCode(g0Var10.T);
                m1 m1VarM5 = g0Var10.m();
                r rVarC5 = b2.a.c(oVar, jVar13);
                g0Var10.g0();
                if (g0Var10.S) {
                    g0Var10.l(gVar3);
                } else {
                    g0Var10.q0();
                }
                q.I(vVarA2, jVar13, fVar9);
                q.I(m1VarM5, jVar13, fVar10);
                x5.u(iHashCode5, jVar13, fVar11, jVar13, eVar2);
                q.I(rVarC5, jVar13, fVar12);
                String strU = z3.U(jVar13, 2131886121);
                long j10 = dl.a.k;
                z6.b(strU, null, j10, bVar4.h, q3.u.L, null, 0L, null, null, bVar4.i, 0, false, 0, 0, null, null, jVar13, 1572864, 0, 260010);
                z6.b(str2, null, j10, bVar4.k, null, null, 0L, null, null, bVar4.l, 2, false, 2, 0, null, null, jVar13, 0, 24960, 239594);
                g0Var10.r(true);
                g0Var10.r(true);
                z6.b(z3.U(jVar13, 2131886939), h0.c.G(rVar3.a(oVar, b2.b.C), 0.0f, 6, 18, 0.0f, 9), i2.t.b(0.6f, j10), bVar4.j, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, jVar13, 0, 0, 262120);
                return b0Var;
            case 14:
                u30.b<bx.e> bVar6 = (u30.b) obj5;
                k kVar7 = (k) obj4;
                j jVar14 = (j) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                m.e((l0) obj, "$this$FlowRow");
                boolean z15 = (iIntValue10 & 17) != 16;
                int i14 = 1 & iIntValue10;
                g0 g0Var11 = (g0) jVar14;
                if (g0Var11.S(i14, z15)) {
                    for (bx.e eVar3 : bVar6) {
                        boolean zG5 = g0Var11.g(kVar7) | g0Var11.g(eVar3);
                        Object objN10 = g0Var11.N();
                        if (zG5 || objN10 == cVar3) {
                            objN10 = new l6.c(kVar7, eVar3, 6);
                            g0Var11.n0(objN10);
                        }
                        mx.a.e(eVar3, (u00.a) objN10, jVar14, 0);
                    }
                } else {
                    g0Var11.V();
                }
                return b0Var;
            case 15:
                y3.f fVar13 = (y3.f) obj4;
                u00.a aVar6 = (u00.a) obj5;
                y0 y0Var = (y0) obj;
                v0 v0Var = (v0) obj2;
                y3.a aVar7 = (y3.a) obj3;
                m.e(y0Var, "$this$layout");
                m.e(v0Var, "measurable");
                int iMin = Math.min(y3.a.h(aVar7.f16587a), y3.a.g(aVar7.f16587a));
                if (fVar13 != null) {
                    iMin = Math.min(iMin, y0Var.R0(fVar13.A));
                }
                int iF = w00.a.F(((Number) aVar6.invoke()).floatValue() * iMin);
                if (!((iF >= 0) & (iF >= 0))) {
                    y3.i.a("width and height must be >= 0");
                }
                return y0Var.o0(iF, iF, h00.y.A, new q2(v0Var.O(y3.b.h(iF, iF, iF, iF)), 13));
            case 16:
                p9.f fVar14 = (p9.f) obj4;
                p9.e eVar4 = (p9.e) obj5;
                j jVar15 = (j) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                g0 g0Var12 = (g0) jVar15;
                if (g0Var12.S(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    fVar14.f12472b.invoke(eVar4, jVar15, 0);
                } else {
                    g0Var12.V();
                }
                return b0Var;
            case 17:
                lo.r rVar4 = (lo.r) obj4;
                h00.b bVar7 = (u30.b) obj5;
                j jVar16 = (j) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                m.e((h0.r) obj, "$this$LiquidBoxV2");
                g0 g0Var13 = (g0) jVar16;
                if (g0Var13.S(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    r rVarE3 = h0.c.E(z1.s(z1.g(oVar, 40, 0.0f, 2), 60, 0.0f, 2), 16, 0.0f, 2);
                    b2.h hVar2 = b2.b.K;
                    h0.b bVar8 = h0.i.f6406a;
                    v1 v1VarA4 = t1.a(h0.i.h(5, b2.b.N), hVar2, jVar16, 54);
                    int iHashCode6 = Long.hashCode(g0Var13.T);
                    m1 m1VarM6 = g0Var13.m();
                    r rVarC6 = b2.a.c(rVarE3, jVar16);
                    b3.i.f2042c.getClass();
                    b3.g gVar4 = b3.h.f2035b;
                    g0Var13.g0();
                    if (g0Var13.S) {
                        g0Var13.l(gVar4);
                    } else {
                        g0Var13.q0();
                    }
                    q.I(v1VarA4, jVar16, b3.h.f2039f);
                    q.I(m1VarM6, jVar16, b3.h.f2038e);
                    q.I(Integer.valueOf(iHashCode6), jVar16, b3.h.f2040g);
                    q.E(jVar16, b3.h.f2041h);
                    q.I(rVarC6, jVar16, b3.h.f2037d);
                    po.n.m(rVar4.b, bVar7.a() > 1, jVar16, 0);
                    g0Var13.r(true);
                } else {
                    g0Var13.V();
                }
                return b0Var;
            case TYPE_SINT64_VALUE:
                b1.o oVar2 = (b1.o) obj4;
                f0.i iVar = (f0.i) obj5;
                ((Integer) obj3).getClass();
                g0 g0Var14 = (g0) ((j) obj2);
                g0Var14.c0(-102778667);
                Object objN11 = g0Var14.N();
                Object obj10 = objN11;
                if (objN11 == cVar3) {
                    a40.z zVarO = q.o(g0Var14);
                    g0Var14.n0(zVarO);
                    obj10 = zVarO;
                }
                a40.z zVar3 = (a40.z) obj10;
                Object objN12 = g0Var14.N();
                Object obj11 = objN12;
                if (objN12 == cVar3) {
                    i1 i1VarZ = q.z(null);
                    g0Var14.n0(i1VarZ);
                    obj11 = i1VarZ;
                }
                z0 z0Var = (z0) obj11;
                z0 z0VarG = q.G(oVar2, g0Var14);
                boolean zG6 = g0Var14.g(iVar);
                Object objN13 = g0Var14.N();
                Object obj12 = objN13;
                if (zG6 || objN13 == cVar3) {
                    mu.q qVar = new mu.q(z0Var, iVar, 7);
                    g0Var14.n0(qVar);
                    obj12 = qVar;
                }
                q.e(iVar, (k) obj12, g0Var14);
                boolean zI3 = g0Var14.i(zVar3) | g0Var14.g(iVar) | g0Var14.g(z0VarG);
                Object objN14 = g0Var14.N();
                Object obj13 = objN14;
                if (zI3 || objN14 == cVar3) {
                    y1 y1Var = new y1(zVar3, z0Var, iVar, z0VarG);
                    g0Var14.n0(y1Var);
                    obj13 = y1Var;
                }
                r rVarB = f0.b(oVar, iVar, (PointerInputEventHandler) obj13);
                g0Var14.r(false);
                return rVarB;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return a(obj, obj2, obj3);
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                Spannable spannable = (Spannable) obj4;
                j0.g gVar5 = (j0.g) obj5;
                i0 i0Var = (i0) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                int iIntValue14 = ((Integer) obj3).intValue();
                q3.i iVar2 = i0Var.f10462f;
                q3.u uVar = i0Var.f10459c;
                if (uVar == null) {
                    uVar = q3.u.J;
                }
                q3.o oVar3 = i0Var.f10460d;
                int i15 = oVar3 != null ? oVar3.f12746a : 0;
                q3.p pVar = i0Var.f10461e;
                int i16 = pVar != null ? pVar.f12747a : 65535;
                u3.c cVar7 = (u3.c) gVar5.B;
                q3.h0 h0VarB = ((q3.j) cVar7.E).b(iVar2, uVar, i15, i16);
                if (h0VarB instanceof q3.g0) {
                    Object obj14 = ((q3.g0) h0VarB).A;
                    m.c(obj14, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj14;
                } else {
                    p1 p1Var = new p1(h0VarB, cVar7.J);
                    cVar7.J = p1Var;
                    Object obj15 = p1Var.D;
                    m.c(obj15, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj15;
                }
                spannable.setSpan(new p3.b(typeface, 1), iIntValue13, iIntValue14, 33);
                return b0Var;
            default:
                xy.n nVar = (xy.n) obj5;
                k kVar8 = (k) obj4;
                j jVar17 = (j) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                m.e((j0.b) obj, "$this$item");
                g0 g0Var15 = (g0) jVar17;
                if (g0Var15.S(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    String str3 = nVar.i;
                    boolean zG7 = g0Var15.g(kVar8);
                    Object objN15 = g0Var15.N();
                    if (zG7 || objN15 == cVar3) {
                        objN15 = new wy.l(1, kVar8);
                        g0Var15.n0(objN15);
                    }
                    yy.a.c(str3, (u00.a) objN15, (r) null, jVar17, 0);
                } else {
                    g0Var15.V();
                }
                return b0Var;
        }
    }
}

package al;

import a1.w2;
import a40.g1;
import a40.z;
import android.content.Context;
import az.q;
import az.r;
import b1.e0;
import bt.a1;
import c00.x;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import d0.y1;
import e1.v0;
import ev.c0;
import ev.s;
import ez.t;
import fy.u;
import g00.b0;
import g1.b5;
import g1.e3;
import g1.f6;
import g1.u3;
import gv.d1;
import gv.m0;
import h0.z1;
import jz.y;
import kh.o;
import kotlin.jvm.internal.w;
import l1.g0;
import l1.m1;
import l1.p2;
import m3.h0;
import m3.q0;
import qd.s0;
import r3.p;
import z2.w0;
import z2.w1;

public final class i implements u00.n {
    public final int A;
    public final Object B;
    public final Object C;

    public i(Object obj, Object obj2, int i) {
        this.A = i;
        this.B = obj;
        this.C = obj2;
    }

    public i(Object obj, Object obj2, int i, int i2) {
        this.A = i2;
        this.B = obj;
        this.C = obj2;
    }

    public i(Object obj, v1.c cVar, int i) {
        this.A = i;
        this.C = obj;
        this.B = cVar;
    }

    public i(z0.c cVar, v1.c cVar2, int i, int i2) {
        this.A = i2;
        this.C = cVar;
        this.B = cVar2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        q0 q0Var;
        switch (this.A) {
            case 0:
                v1.c cVar = (v1.c) this.B;
                h hVar = (h) this.C;
                g0 g0Var = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    cVar.invoke(g0Var, 0);
                    m.b(hVar, g0Var, 6);
                } else {
                    g0Var2.V();
                }
                return b0.a;
            case 1:
                r rVar = (r) this.B;
                p2 p2Var = (p2) this.C;
                g0 g0Var3 = (l1.j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    q qVar = (q) p2Var.getValue();
                    boolean zG = g0Var4.g(rVar);
                    Object objN = g0Var4.N();
                    if (zG || objN == l1.i.a) {
                        g1 g1Var = new g1(1, rVar, r.class, "action", "action(Lcom/mchutov/quranify/settings/presentation/screen/deletequestionnaire/DeleteAccountQuestionnaireAction;)V", 0, 9);
                        g0Var4.n0(g1Var);
                        objN = g1Var;
                    }
                    az.a.a(qVar, (u00.k) ((a10.g) objN), true, g0Var3, 384, 0);
                } else {
                    g0Var4.V();
                }
                return b0.a;
            case 2:
                e0 e0Var = (e0) this.B;
                z zVar = (z) this.C;
                s0.a aVar = (s0.a) obj;
                Context context = (Context) obj2;
                boolean zM = e0Var.m();
                w2 w2Var = e0Var.a;
                e1.r.a(aVar, context, zM, w2Var.d().C, new q0(w2Var.d().D), e0Var.h, new b1.l(e0Var, zVar, context));
                return b0.a;
            case 3:
                ((Integer) obj2).getClass();
                bt.a.b((a1) this.B, (u00.k) this.C, (l1.j) obj, l1.q.K(1));
                return b0.a;
            case 4:
                ((Integer) obj2).getClass();
                ((c0.d) this.B).a((c0.c) this.C, (l1.j) obj, l1.q.K(1));
                return b0.a;
            case 5:
                ((Integer) obj2).getClass();
                c00.a.g((String) this.B, (u00.k) this.C, (l1.j) obj, l1.q.K(1));
                return b0.a;
            case 6:
                ((Integer) obj2).getClass();
                cz.a.e((ry.a) this.B, (u00.a) this.C, (l1.j) obj, l1.q.K(1));
                return b0.a;
            case 7:
                w wVar = (w) this.B;
                y1 y1Var = (y1) this.C;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                float f = wVar.A;
                wVar.A = y1Var.a(fFloatValue - f) + f;
                return b0.a;
            case 8:
                g1.q0 q0Var2 = (g1.q0) this.C;
                v1.c cVar2 = (v1.c) this.B;
                g0 g0Var5 = (l1.j) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                g0 g0Var6 = g0Var5;
                if (g0Var6.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    u3.b(q0Var2, (f6) null, dl.f.d, cVar2, g0Var5, 384);
                } else {
                    g0Var6.V();
                }
                return b0.a;
            case 9:
                v0 v0Var = (v0) this.B;
                z zVar2 = (z) this.C;
                s0.a aVar2 = (s0.a) obj;
                Context context2 = (Context) obj2;
                boolean zJ = v0Var.j();
                m3.h hVarM = v0Var.m();
                String str = hVarM != null ? hVarM.B : null;
                q0 q0Var3 = v0Var.w;
                if (q0Var3 != null) {
                    long j = q0Var3.a;
                    p pVar = v0Var.b;
                    q0Var = new q0(h0.b(pVar.z((int) (j >> 32)), pVar.z((int) (j & 4294967295L))));
                } else {
                    q0Var = null;
                }
                e1.r.a(aVar2, context2, zJ, str, q0Var, v0Var.j, new b1.l(v0Var, zVar2, context2, 8));
                return b0.a;
            case 10:
                ((Integer) obj2).getClass();
                eu.a.n((bu.c) this.B, (b2.r) this.C, (l1.j) obj, l1.q.K(1));
                return b0.a;
            case 11:
                ((Integer) obj2).getClass();
                ez.a.c((t) this.B, (u00.k) this.C, (l1.j) obj, l1.q.K(1));
                return b0.a;
            case 12:
                ((Integer) obj2).getClass();
                k00.f.f((pu.e) this.B, (u00.a) this.C, (l1.j) obj, l1.q.K(1));
                return b0.a;
            case 13:
                ((Integer) obj2).getClass();
                ((fv.d) this.C).a((v1.c) this.B, (l1.j) obj, l1.q.K(7));
                return b0.a;
            case 14:
                ((Integer) obj2).getClass();
                o.g((u) this.B, (u00.k) this.C, (l1.j) obj, l1.q.K(9));
                return b0.a;
            case 15:
                ((Integer) obj2).getClass();
                ((e3) this.B).a((oj.q) this.C, (l1.j) obj, l1.q.K(1));
                return b0.a;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                ((Integer) obj2).getClass();
                ((b5) this.C).a((v1.c) this.B, (l1.j) obj, l1.q.K(7));
                return b0.a;
            case 17:
                ((Integer) obj2).getClass();
                kh.n.a((String) this.B, (u00.n) this.C, (l1.j) obj, l1.q.K(1));
                return b0.a;
            case 18:
                ((Integer) obj2).getClass();
                gn.a.f((hn.b) this.B, (dn.l) this.C, (l1.j) obj, l1.q.K(1));
                return b0.a;
            case 19:
                x xVar = (x) this.B;
                p2 p2Var2 = (p2) this.C;
                g0 g0Var7 = (l1.j) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                g0 g0Var8 = g0Var7;
                if (g0Var8.S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zG2 = g0Var8.g(xVar);
                    Object objN2 = g0Var8.N();
                    Object obj3 = l1.i.a;
                    if (zG2 || objN2 == obj3) {
                        objN2 = new gv.i(xVar, 1);
                        g0Var8.n0(objN2);
                    }
                    s0.E(false, (u00.a) objN2, g0Var7, 0, 1);
                    float f2 = 32;
                    b2.r rVarC = z1.c(f2.h.c(z1.f(z1.r(h0.c.E(b2.o.A, 0.0f, 44, 1), 500, 550), RCHTTPStatusCodes.BAD_REQUEST, 650), p0.f.c(0.0f, 0.0f, f2, f2, 3)), 1.0f);
                    w0 w0VarD = h0.o.d(b2.b.A, false);
                    int iHashCode = Long.hashCode(g0Var8.T);
                    m1 m1VarM = g0Var8.m();
                    b2.r rVarC2 = b2.a.c(rVarC, g0Var7);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var8.g0();
                    if (g0Var8.S) {
                        g0Var8.l(gVar);
                    } else {
                        g0Var8.q0();
                    }
                    l1.q.I(w0VarD, g0Var7, b3.h.f);
                    l1.q.I(m1VarM, g0Var7, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode), g0Var7, b3.h.g);
                    l1.q.E(g0Var7, b3.h.h);
                    l1.q.I(rVarC2, g0Var7, b3.h.d);
                    c00.t tVar = (c00.t) p2Var2.getValue();
                    boolean zG3 = g0Var8.g(xVar);
                    Object objN3 = g0Var8.N();
                    if (zG3 || objN3 == obj3) {
                        g1 g1Var2 = new g1(1, xVar, x.class, "action", "action(Lcom/mchutov/quranify/soundeffect/presentation/screen/picker/SoundEffectPickerAction;)V", 0, 27);
                        g0Var8.n0(g1Var2);
                        objN3 = g1Var2;
                    }
                    c00.a.h(tVar, (u00.k) ((a10.g) objN3), g0Var7, 0);
                    g0Var8.r(true);
                } else {
                    g0Var8.V();
                }
                return b0.a;
            case 20:
                c0 c0Var = (c0) this.B;
                p2 p2Var3 = (p2) this.C;
                g0 g0Var9 = (l1.j) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                g0 g0Var10 = g0Var9;
                if (g0Var10.S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zG4 = g0Var10.g(c0Var);
                    Object objN4 = g0Var10.N();
                    Object obj4 = l1.i.a;
                    if (zG4 || objN4 == obj4) {
                        objN4 = new m0(c0Var, 1);
                        g0Var10.n0(objN4);
                    }
                    s0.E(false, (u00.a) objN4, g0Var9, 0, 1);
                    b2.r rVarC3 = z1.c(z1.f(z1.r(h0.c.E(b2.o.A, 0.0f, 44, 1), 500, 550), RCHTTPStatusCodes.BAD_REQUEST, 650), 1.0f);
                    w0 w0VarD2 = h0.o.d(b2.b.A, false);
                    int iHashCode2 = Long.hashCode(g0Var10.T);
                    m1 m1VarM2 = g0Var10.m();
                    b2.r rVarC4 = b2.a.c(rVarC3, g0Var9);
                    b3.i.c.getClass();
                    b3.g gVar2 = b3.h.b;
                    g0Var10.g0();
                    if (g0Var10.S) {
                        g0Var10.l(gVar2);
                    } else {
                        g0Var10.q0();
                    }
                    l1.q.I(w0VarD2, g0Var9, b3.h.f);
                    l1.q.I(m1VarM2, g0Var9, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode2), g0Var9, b3.h.g);
                    l1.q.E(g0Var9, b3.h.h);
                    l1.q.I(rVarC4, g0Var9, b3.h.d);
                    ev.t tVar2 = (ev.t) p2Var3.getValue();
                    boolean zG5 = g0Var10.g(c0Var);
                    Object objN5 = g0Var10.N();
                    if (zG5 || objN5 == obj4) {
                        g1 g1Var3 = new g1(1, c0Var, c0.class, "action", "action(Lcom/mchutov/quranify/player/presentation/screen/fullscreen/reciterpicker/ReciterPickerAction;)V", 0, 28);
                        g0Var10.n0(g1Var3);
                        objN5 = g1Var3;
                    }
                    s.e(tVar2, (u00.k) ((a10.g) objN5), true, g0Var9, 384, 0);
                    g0Var10.r(true);
                } else {
                    g0Var10.V();
                }
                return b0.a;
            case 21:
                qt.k kVar = (qt.k) this.B;
                p2 p2Var4 = (p2) this.C;
                g0 g0Var11 = (l1.j) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                g0 g0Var12 = g0Var11;
                if (g0Var12.S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zG6 = g0Var12.g(kVar);
                    Object objN6 = g0Var12.N();
                    Object obj5 = l1.i.a;
                    if (zG6 || objN6 == obj5) {
                        objN6 = new d1(kVar, 1);
                        g0Var12.n0(objN6);
                    }
                    s0.E(false, (u00.a) objN6, g0Var11, 0, 1);
                    float f3 = 32;
                    b2.r rVarC5 = z1.c(f2.h.c(z1.f(z1.r(h0.c.E(b2.o.A, 0.0f, 44, 1), 500, 550), RCHTTPStatusCodes.BAD_REQUEST, 650), p0.f.c(0.0f, 0.0f, f3, f3, 3)), 1.0f);
                    w0 w0VarD3 = h0.o.d(b2.b.A, false);
                    int iHashCode3 = Long.hashCode(g0Var12.T);
                    m1 m1VarM3 = g0Var12.m();
                    b2.r rVarC6 = b2.a.c(rVarC5, g0Var11);
                    b3.i.c.getClass();
                    b3.g gVar3 = b3.h.b;
                    g0Var12.g0();
                    if (g0Var12.S) {
                        g0Var12.l(gVar3);
                    } else {
                        g0Var12.q0();
                    }
                    l1.q.I(w0VarD3, g0Var11, b3.h.f);
                    l1.q.I(m1VarM3, g0Var11, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode3), g0Var11, b3.h.g);
                    l1.q.E(g0Var11, b3.h.h);
                    l1.q.I(rVarC6, g0Var11, b3.h.d);
                    qt.j jVar = (qt.j) p2Var4.getValue();
                    boolean zG7 = g0Var12.g(kVar);
                    Object objN7 = g0Var12.N();
                    if (zG7 || objN7 == obj5) {
                        g1 g1Var4 = new g1(1, kVar, qt.k.class, "action", "action(Lcom/mchutov/quranify/lyrics/presentation/screen/tafsirpicker/TafsirPickerAction;)V", 0, 29);
                        g0Var12.n0(g1Var4);
                        objN7 = g1Var4;
                    }
                    qt.a.e(jVar, (u00.k) ((a10.g) objN7), g0Var11, 0);
                    g0Var12.r(true);
                } else {
                    g0Var12.V();
                }
                return b0.a;
            case 22:
                w1 w1Var = (w1) obj;
                y3.a aVar3 = (y3.a) obj2;
                return ((w0) this.C).j(w1Var, w1Var.F0(b0.a, new v1.c(new i((v1.c) this.B, new h0.t(w1Var, aVar3.a), 23), -431986394, true)), aVar3.a);
            case 23:
                v1.c cVar3 = (v1.c) this.B;
                h0.t tVar3 = (h0.t) this.C;
                g0 g0Var13 = (l1.j) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                g0 g0Var14 = g0Var13;
                if (g0Var14.S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    cVar3.invoke(tVar3, g0Var13, 0);
                } else {
                    g0Var14.V();
                }
                return b0.a;
            case 24:
                hn.b bVar = (hn.b) this.B;
                in.c cVar4 = (in.c) this.C;
                g0 g0Var15 = (l1.j) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                g0 g0Var16 = g0Var15;
                if (g0Var16.S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    gn.a.f(bVar, cVar4.b, g0Var15, 0);
                } else {
                    g0Var16.V();
                }
                return b0.a;
            case 25:
                ((Integer) obj2).getClass();
                ix.a.a((o2.f) this.B, (b2.r) this.C, (l1.j) obj, l1.q.K(1));
                return b0.a;
            case 26:
                ((Integer) obj2).getClass();
                y.c((jz.z) this.B, (b2.r) this.C, (l1.j) obj, l1.q.K(1));
                return b0.a;
            case 27:
                k0.c cVar5 = (k0.c) this.B;
                h0.e eVar = (h0.e) this.C;
                y3.c cVar6 = (y3.c) obj;
                y3.a aVar4 = (y3.a) obj2;
                if (y3.a.h(aVar4.a) == Integer.MAX_VALUE) {
                    g0.a.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int iH = y3.a.h(aVar4.a);
                int[] iArrM1 = h00.q.m1(cVar5.a(cVar6, iH, cVar6.R0(eVar.a())));
                int[] iArr = new int[iArrM1.length];
                eVar.c(cVar6, iH, iArrM1, y3.m.A, iArr);
                return new h7.b(iArrM1, iArr);
            case 28:
                ((Integer) obj2).getClass();
                f50.k.b((ln.c) this.B, (dn.l) this.C, (l1.j) obj, l1.q.K(1));
                return b0.a;
            default:
                ((Integer) obj2).getClass();
                kx.a.c((jx.s) this.B, (u00.k) this.C, (l1.j) obj, l1.q.K(1));
                return b0.a;
        }
    }
}

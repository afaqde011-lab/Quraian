package l0;

import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.measurement.y3;
import com.google.protobuf.RuntimeVersion;
import kotlin.NoWhenBranchMatchedException;
import l1.c2;
import l1.p2;
import l1.r1;
import l1.z1;
import z2.w1;

public final class g0 implements u00.n {
    public final int A;
    public final Object B;
    public final Object C;

    public g0(Object obj, Object obj2, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    public g0(Object obj, Object obj2, int i10, int i11) {
        this.A = i11;
        this.B = obj;
        this.C = obj2;
    }

    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        switch (this.A) {
            case 0:
                i0 i0Var = (i0) this.B;
                h0 h0Var = (h0) this.C;
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j0 j0Var = (j0) i0Var.f9749b.invoke();
                    int iE = h0Var.f9745c;
                    Object obj3 = h0Var.f9743a;
                    if ((iE >= j0Var.a() || !j0Var.b(iE).equals(obj3)) && (iE = j0Var.e(obj3)) != -1) {
                        h0Var.f9745c = iE;
                    }
                    if (iE != -1) {
                        g0Var.c0(-1664741271);
                        q.d(j0Var, i0Var.f9748a, iE, h0Var.f9743a, jVar, 0);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(-1664505826);
                        g0Var.r(false);
                    }
                    boolean zI = g0Var.i(h0Var);
                    Object objN = g0Var.N();
                    if (zI || objN == l1.i.f9868a) {
                        objN = new h00.a(h0Var, 12);
                        g0Var.n0(objN);
                    }
                    l1.q.e(obj3, (u00.k) objN, jVar);
                } else {
                    g0Var.V();
                }
                return g00.b0.a;
            case 1:
                return ((n0) this.C).a(new o0((i0) this.B, (w1) obj), ((y3.a) obj2).f16587a);
            case 2:
                v1.c cVar = (v1.c) this.B;
                g1 g1Var = (g1) this.C;
                l1.j jVar2 = (l1.j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    cVar.invoke(g1Var, jVar2, 0);
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
            case 3:
                v1.i iVar = (v1.i) this.B;
                o1.k kVar = (o1.k) this.C;
                int iIntValue3 = ((Integer) obj).intValue();
                if (obj2 instanceof l1.f) {
                    iVar.f15340f.b((l1.f) obj2);
                } else if (!(obj2 instanceof c2)) {
                    if (obj2 instanceof z1) {
                        l1.q.H(kVar, iIntValue3, obj2);
                        iVar.e((z1) obj2);
                    } else if (obj2 instanceof r1) {
                        l1.q.H(kVar, iIntValue3, obj2);
                        ((r1) obj2).d();
                    }
                }
                return g00.b0.a;
            case 4:
                ((Integer) obj2).getClass();
                kh.n.c((qr.a) this.B, (u00.a) this.C, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 5:
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.B;
                j0.r rVar = (j0.r) this.C;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                wVar.A += rVar.f7814b.a(fFloatValue - wVar.A);
                return g00.b0.a;
            case 6:
                ln.c cVar2 = (ln.c) this.B;
                mn.c cVar3 = (mn.c) this.C;
                l1.j jVar3 = (l1.j) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.g0 g0Var3 = (l1.g0) jVar3;
                if (g0Var3.S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    f50.k.b(cVar2, cVar3.a, jVar3, 0);
                } else {
                    g0Var3.V();
                }
                return g00.b0.a;
            case 7:
                ((Integer) obj2).getClass();
                mu.d.x((ju.j) this.B, (b2.r) this.C, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 8:
                ((Integer) obj2).getClass();
                mx.a.e((bx.e) this.B, (u00.a) this.C, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 9:
                ((Integer) obj2).getClass();
                mx.a.a((bx.c) this.B, (u00.a) this.C, (l1.j) obj, l1.q.K(9));
                return g00.b0.a;
            case 10:
                ((Integer) obj2).getClass();
                mx.a.f((u30.b) this.B, (u00.k) this.C, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 11:
                ((Integer) obj2).getClass();
                ol.a.a((ol.b) this.B, (b2.r) this.C, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 12:
                ((Integer) obj2).getClass();
                oo.o0.d((oo.z0) this.B, (u00.k) this.C, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 13:
                ((Integer) obj2).getClass();
                pn.a.c((qn.b) this.B, (dn.l) this.C, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 14:
                ((Integer) obj2).getClass();
                pp.h.a((String) this.B, (u00.a) this.C, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 15:
                pz.l lVar = (pz.l) this.B;
                p2 p2Var = (p2) this.C;
                l1.j jVar4 = (l1.j) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.g0 g0Var4 = (l1.g0) jVar4;
                if (g0Var4.S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    pz.j jVar5 = (pz.j) p2Var.getValue();
                    boolean zG = g0Var4.g(lVar);
                    Object objN2 = g0Var4.N();
                    if (zG || objN2 == l1.i.f9868a) {
                        gz.e1 e1Var = new gz.e1(1, lVar, pz.l.class, "action", "action(Lcom/mchutov/quranify/settings/presentation/screen/questionnaire/CancellationQuestionnaireAction;)V", 0, 14);
                        g0Var4.n0(e1Var);
                        objN2 = e1Var;
                    }
                    pz.n.a(jVar5, (a10.g) objN2, true, jVar4, 384, 0);
                } else {
                    g0Var4.V();
                }
                return g00.b0.a;
            case 16:
                ((Integer) obj2).getClass();
                ((q0.z) this.B).a((v1.c) this.C, (l1.j) obj, l1.q.K(7));
                return g00.b0.a;
            case 17:
                ((Integer) obj2).getClass();
                qo.z.e((lo.e) this.B, (b2.r) this.C, (l1.j) obj, l1.q.K(49));
                return g00.b0.a;
            case TYPE_SINT64_VALUE:
                ((Integer) obj2).getClass();
                qt.a.e((qt.j) this.B, (u00.k) this.C, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                lo.k kVar2 = (lo.k) this.B;
                u00.a aVar = (u00.a) this.C;
                l1.j jVar6 = (l1.j) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                l1.g0 g0Var5 = (l1.g0) jVar6;
                if (g0Var5.S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    b2.r rVarF = z.n.f(f2.h.c(h0.z1.q(h0.c.E(b2.o.A, 0.0f, 44, 1), 540), p0.f.a(32)), dl.a.L, i2.b0.f7111b);
                    z2.w0 w0VarD = h0.o.d(b2.b.A, false);
                    int iHashCode = Long.hashCode(g0Var5.T);
                    l1.m1 m1VarM = g0Var5.m();
                    b2.r rVarC = b2.a.c(rVarF, jVar6);
                    b3.i.f2042c.getClass();
                    b3.g gVar = b3.h.f2035b;
                    g0Var5.g0();
                    if (g0Var5.S) {
                        g0Var5.l(gVar);
                    } else {
                        g0Var5.q0();
                    }
                    l1.q.I(w0VarD, jVar6, b3.h.f2039f);
                    l1.q.I(m1VarM, jVar6, b3.h.f2038e);
                    l1.q.I(Integer.valueOf(iHashCode), jVar6, b3.h.f2040g);
                    l1.q.E(jVar6, b3.h.f2041h);
                    l1.q.I(rVarC, jVar6, b3.h.f2037d);
                    ro.f.a(kVar2, false, aVar, jVar6, 48);
                    g0Var5.r(true);
                } else {
                    g0Var5.V();
                }
                return g00.b0.a;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                ((Integer) obj2).getClass();
                rx.a.h((qx.o) this.B, (u00.k) this.C, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                ((Integer) obj2).getClass();
                y3.d((ep.e) this.B, (u00.a) this.C, (l1.j) obj, l1.q.K(7));
                return g00.b0.a;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                ((Integer) obj2).getClass();
                st.j.f((String) this.B, (v1.c) this.C, (l1.j) obj, l1.q.K(49));
                return g00.b0.a;
            case 23:
                tm.e eVar = (tm.e) this.B;
                v2.v vVar = (v2.v) this.C;
                kotlin.jvm.internal.m.e((v2.s) obj, "change");
                eVar.f.invoke(eVar, new y3.l(((v2.j0) vVar).Y), (h2.b) obj2);
                return g00.b0.a;
            case 24:
                ((Integer) obj2).getClass();
                bi.b.h((lo.j) this.B, (u00.a) this.C, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 25:
                uy.l lVar2 = (uy.l) this.B;
                p2 p2Var2 = (p2) this.C;
                l1.j jVar7 = (l1.j) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                l1.g0 g0Var6 = (l1.g0) jVar7;
                if (g0Var6.S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    uy.k kVar3 = (uy.k) p2Var2.getValue();
                    boolean zG2 = g0Var6.g(lVar2);
                    Object objN3 = g0Var6.N();
                    if (zG2 || objN3 == l1.i.f9868a) {
                        gz.e1 e1Var2 = new gz.e1(1, lVar2, uy.l.class, "action", "action(Lcom/mchutov/quranify/settings/presentation/screen/benefits/CancellationBenefitsAction;)V", 0, 21);
                        g0Var6.n0(e1Var2);
                        objN3 = e1Var2;
                    }
                    uy.m.a(kVar3, (a10.g) objN3, true, jVar7, 384, 0);
                } else {
                    g0Var6.V();
                }
                return g00.b0.a;
            case RuntimeVersion.MINOR:
                x0.e eVar2 = (x0.e) this.B;
                t0.g gVar2 = (t0.g) this.C;
                l1.j jVar8 = (l1.j) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                l1.g0 g0Var7 = (l1.g0) jVar8;
                if (g0Var7.S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zG3 = g0Var7.g(eVar2);
                    Object objN4 = g0Var7.N();
                    if (zG3 || objN4 == l1.i.f9868a) {
                        objN4 = l1.q.r(new pi.c(0, eVar2, x0.e.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 13));
                        g0Var7.n0(objN4);
                    }
                    v0.i.a(gVar2, (t0.c) ((p2) objN4).getValue(), jVar8, 0);
                } else {
                    g0Var7.V();
                }
                return g00.b0.a;
            case 27:
                ((Integer) obj2).getClass();
                v0.i.a((t0.g) this.B, (t0.c) this.C, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 28:
                ((Integer) obj2).getClass();
                ((v0.m) this.B).a((Drawable) this.C, (l1.j) obj, l1.q.K(49));
                return g00.b0.a;
            default:
                ((Integer) obj2).getClass();
                wy.q.b((wy.o) this.B, (u00.k) this.C, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
        }
    }
}

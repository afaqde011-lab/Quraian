package b1;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import bv.o1;
import com.google.protobuf.RuntimeVersion;
import d0.s2;
import d0.u2;
import e1.v0;
import g1.a7;
import g1.b3;
import g1.b8;
import g1.x5;
import g1.z7;
import gv.z1;
import h0.p1;
import java.util.Locale;
import oo.o0;
import oo.z0;
import q0.y0;

public final class n implements u00.n {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;

    public n(int i10, int i11, Object obj, Object obj2, Object obj3) {
        this.A = i11;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
    }

    public n(e0 e0Var, kotlin.jvm.internal.y yVar, kotlin.jvm.internal.y yVar2) {
        this.A = 0;
        this.B = yVar;
        this.D = e0Var;
        this.C = yVar2;
    }

    public n(Object obj, Object obj2, Object obj3, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.A;
        l1.c cVar = l1.i.f9868a;
        g00.b0 b0Var = g00.b0.a;
        Object obj3 = this.D;
        Object obj4 = this.C;
        Object obj5 = this.B;
        switch (i10) {
            case 0:
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) obj5;
                e0 e0Var = (e0) obj3;
                v2.s sVar = (v2.s) obj;
                long jF = h2.b.f(yVar.A, ((h2.b) obj2).f6544a);
                yVar.A = jF;
                e0Var.A(y0.A, h2.b.f(((kotlin.jvm.internal.y) obj4).A, jF));
                if (e0Var.u(e0Var.n())) {
                    sVar.a();
                    q2.a aVar = e0Var.f1950k;
                    if (aVar != null) {
                        ((q2.c) aVar).a(9);
                    }
                }
                return b0Var;
            case 1:
                ((Integer) obj2).getClass();
                cs.a.b((cs.m) obj5, (u00.a) obj4, (b2.r) obj3, (l1.j) obj, l1.q.K(1));
                return b0Var;
            case 2:
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) obj5;
                u2 u2Var = (u2) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jH = u2Var.h(u2Var.d(fFloatValue - wVar.A));
                u2 u2Var2 = ((s2) obj3).f4508a;
                wVar.A += u2Var.d(u2Var.g(u2Var2.c(u2Var2.f4522k, jH, 1)));
                return b0Var;
            case 3:
                ((Integer) obj2).getClass();
                kh.n.s((String) obj5, (String) obj4, (b6.m) obj3, (l1.j) obj, l1.q.K(1));
                return b0Var;
            case 4:
                ((Integer) obj2).getClass();
                ds.a.b((ds.m) obj5, (u00.k) obj4, (b2.r) obj3, (l1.j) obj, l1.q.K(9));
                return b0Var;
            case 5:
                ((Integer) obj2).getClass();
                eq.g.a((cq.i) obj5, (kk.c) obj4, (u00.k) obj3, (l1.j) obj, l1.q.K(1));
                return b0Var;
            case 6:
                ((Integer) obj2).getClass();
                z7.j(l1.q.K(1), (b2.r) obj4, (a7) obj3, (b8) obj5, (l1.j) obj);
                return b0Var;
            case 7:
                o1 o1Var = (o1) obj5;
                u00.k kVar = (u00.k) obj4;
                u00.a aVar2 = (u00.a) obj3;
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    gv.p.p(o1Var, kVar, aVar2, true, jVar, 3072, 0);
                } else {
                    g0Var.V();
                }
                return b0Var;
            case 8:
                ((Integer) obj2).getClass();
                gv.p.A((jk.a) obj5, (u00.k) obj4, (b2.r) obj3, (l1.j) obj, l1.q.K(1));
                return b0Var;
            case 9:
                o1 o1Var2 = (o1) obj5;
                u00.k kVar2 = (u00.k) obj4;
                kk.c cVar2 = (kk.c) obj3;
                l1.j jVar2 = (l1.j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z1.a(o1Var2, kVar2, cVar2, h0.c.G(b2.o.A, 0.0f, 0.0f, 0.0f, 16, 7), jVar2, 3072);
                } else {
                    g0Var2.V();
                }
                return b0Var;
            case 10:
                ((Integer) obj2).getClass();
                h1.f.b((androidx.lifecycle.w) obj5, (u00.k) obj4, (u00.a) obj3, (l1.j) obj, l1.q.K(1));
                return b0Var;
            case 11:
                ((Integer) obj2).getClass();
                p30.f.F((hx.x) obj5, (j0.v) obj4, (u00.k) obj3, (l1.j) obj, l1.q.K(1));
                return b0Var;
            case 12:
                hn.b bVar = (hn.b) obj5;
                Context context = (Context) obj4;
                in.c cVar3 = (in.c) obj3;
                l1.j jVar3 = (l1.j) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.g0 g0Var3 = (l1.g0) jVar3;
                if (g0Var3.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    t5.d dVar = sn.k.a;
                    g0Var3.d0(1333953144);
                    g0Var3.d0(-534706435);
                    Object objK = g0Var3.k(b6.g.f2170c);
                    if (objK == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences");
                    }
                    g0Var3.r(false);
                    Object objC = ((t5.b) objK).c(dVar);
                    g0Var3.r(false);
                    Long l = (Long) objC;
                    Long lValueOf = Long.valueOf(l != null ? l.longValue() : 0L);
                    boolean zI = g0Var3.i(context);
                    Object objN = g0Var3.N();
                    if (zI || objN == cVar) {
                        objN = new ev.p(context, (k00.c) null, 13);
                        g0Var3.n0(objN);
                    }
                    gn.a.f((hn.b) l1.q.B(bVar, lValueOf, (u00.n) objN, jVar3).getValue(), cVar3.b, jVar3, 0);
                } else {
                    g0Var3.V();
                }
                return b0Var;
            case 13:
                ((Integer) obj2).getClass();
                iw.a.b((dw.a) obj5, (u00.a) obj4, (b2.r) obj3, (l1.j) obj, l1.q.K(1));
                return b0Var;
            case 14:
                ((Integer) obj2).getClass();
                ix.o.c((bx.c) obj5, (p0.e) obj4, (u00.a) obj3, (l1.j) obj, l1.q.K(9));
                return b0Var;
            case 15:
                ((Integer) obj2).getClass();
                kv.a.a((String) obj5, (b2.r) obj4, (u00.o) obj3, (l1.j) obj, l1.q.K(433));
                return b0Var;
            case 16:
                ln.c cVar4 = (ln.c) obj5;
                Locale locale = (Locale) obj4;
                mn.c cVar5 = (mn.c) obj3;
                l1.j jVar4 = (l1.j) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.g0 g0Var4 = (l1.g0) jVar4;
                if (g0Var4.S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    t5.d dVar2 = sn.k.a;
                    g0Var4.d0(1333953144);
                    g0Var4.d0(-534706435);
                    Object objK2 = g0Var4.k(b6.g.f2170c);
                    if (objK2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences");
                    }
                    g0Var4.r(false);
                    Object objC2 = ((t5.b) objK2).c(dVar2);
                    g0Var4.r(false);
                    Long l10 = (Long) objC2;
                    Long lValueOf2 = Long.valueOf(l10 != null ? l10.longValue() : 0L);
                    boolean zG = g0Var4.g(locale);
                    Object objN2 = g0Var4.N();
                    if (zG || objN2 == cVar) {
                        objN2 = new ev.p(locale, (k00.c) null, 25);
                        g0Var4.n0(objN2);
                    }
                    f50.k.b((ln.c) l1.q.B(cVar4, lValueOf2, (u00.n) objN2, jVar4).getValue(), cVar5.a, jVar4, 0);
                } else {
                    g0Var4.V();
                }
                return b0Var;
            case 17:
                ((Integer) obj2).getClass();
                mu.d.h((ju.f) obj5, (jk.a) obj4, (b2.r) obj3, (l1.j) obj, l1.q.K(385));
                return b0Var;
            case TYPE_SINT64_VALUE:
                ((Integer) obj2).getClass();
                mu.d.i((zz.a) obj5, (ExoPlayer) obj4, (b2.r) obj3, (l1.j) obj, l1.q.K(385));
                return b0Var;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                ((Integer) obj2).getClass();
                mu.d.o((ju.h) obj5, (u00.k) obj4, (b2.r) obj3, (l1.j) obj, l1.q.K(1));
                return b0Var;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                ((Integer) obj2).getClass();
                mu.d.q((ju.d) obj5, (ju.l) obj4, (b2.r) obj3, (l1.j) obj, l1.q.K(1));
                return b0Var;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                ((Integer) obj2).getClass();
                mu.u.a((ju.f) obj5, (lu.z) obj4, (b2.r) obj3, (l1.j) obj, l1.q.K(385));
                return b0Var;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                ((Integer) obj2).getClass();
                ol.d.a((String) obj5, (b2.r) obj4, (ol.c) obj3, (l1.j) obj, l1.q.K(1));
                return b0Var;
            case 23:
                ((Integer) obj2).getClass();
                o0.s((z0) obj5, (u00.k) obj4, (b2.r) obj3, (l1.j) obj, l1.q.K(1));
                return b0Var;
            case 24:
                ((Integer) obj2).getClass();
                o0.n((z0) obj5, (u00.k) obj4, (jk.a) obj3, (l1.j) obj, l1.q.K(1));
                return b0Var;
            case 25:
                ((Integer) obj2).getClass();
                po.n.i((u30.b) obj5, (u00.k) obj4, (u00.k) obj3, (l1.j) obj, l1.q.K(1));
                return b0Var;
            case RuntimeVersion.MINOR:
                ((Integer) obj2).getClass();
                po.n.d((lo.i) obj5, (u00.a) obj4, (b2.r) obj3, (l1.j) obj, l1.q.K(1));
                return b0Var;
            case 27:
                ((Integer) obj2).getClass();
                po.n.f((lo.e) obj5, (u00.a) obj4, (b2.r) obj3, (l1.j) obj, l1.q.K(1));
                return b0Var;
            case 28:
                b3 b3Var = (b3) obj5;
                u00.k kVar3 = (u00.k) obj4;
                u00.a aVar3 = (u00.a) obj3;
                l1.j jVar5 = (l1.j) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.g0 g0Var5 = (l1.g0) jVar5;
                if (g0Var5.S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    p1 p1Var = g1.s.f5954a;
                    g1.r rVarA = g1.s.a(dl.a.i, dl.a.l, 0L, 0L, jVar5, 12);
                    boolean zG2 = g0Var5.g(b3Var) | g0Var5.g(kVar3) | g0Var5.g(aVar3);
                    Object objN3 = g0Var5.N();
                    if (zG2 || objN3 == cVar) {
                        objN3 = new d0.g(b3Var, kVar3, aVar3, 10);
                        g0Var5.n0(objN3);
                    }
                    x5.h((u00.a) objN3, null, false, null, rVarA, null, pp.c.a, jVar5, 805306368, 494);
                } else {
                    g0Var5.V();
                }
                return b0Var;
            default:
                ((Integer) obj2).getClass();
                q0.q.j((b2.r) obj5, (v0) obj4, (v1.c) obj3, (l1.j) obj, l1.q.K(385));
                return b0Var;
        }
    }
}

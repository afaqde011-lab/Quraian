package jk;

import a1.q1;
import android.app.LocaleManager;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.cast.t8;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.google.protobuf.RuntimeVersion;
import d6.r;
import g00.b0;
import g1.l0;
import g1.o3;
import g1.z6;
import h0.z1;
import i2.t;
import java.util.Map;
import jo.o;
import jz.y;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import l0.g1;
import l1.g0;
import l1.q;
import l60.q0;
import qd.s0;
import ri.t1;
import ta.c0;
import u00.n;
import x40.w;

public final class c implements n {
    public final int A;

    public c(int i10) {
        this.A = i10;
    }

    public c(int i10, int i11) {
        this.A = i11;
    }

    public final Object invoke(Object obj, Object obj2) throws t8 {
        k00.b bVar;
        switch (this.A) {
            case 0:
                k2.d dVar = (k2.d) obj;
                u00.k kVar = (u00.k) obj2;
                m.e(dVar, "<this>");
                m.e(kVar, "it");
                kVar.invoke(dVar);
                return b0.a;
            case 1:
                ((Integer) obj2).getClass();
                y3.e((l1.j) obj, q.K(1));
                return b0.a;
            case 2:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var = (g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z6.b(z3.U(jVar, 2131886943), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, jVar, 0, 0, 262142);
                } else {
                    g0Var.V();
                }
                return b0.a;
            case 3:
                ((Integer) obj2).getClass();
                y.b((l1.j) obj, q.K(1));
                return b0.a;
            case 4:
                ((Integer) obj2).intValue();
                return new k0.d(s0.H(1));
            case 5:
                k0.y yVar = (k0.y) obj2;
                return va.a.S(Integer.valueOf(yVar.f8546d.f7808b.h()), Integer.valueOf(yVar.f8546d.f7809c.h()));
            case 6:
                String str = (String) obj;
                k00.g gVar = (k00.g) obj2;
                m.e(str, "acc");
                m.e(gVar, "element");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            case 7:
                k00.i iVar = (k00.i) obj;
                k00.g gVar2 = (k00.g) obj2;
                m.e(iVar, "acc");
                m.e(gVar2, "element");
                k00.i iVarMinusKey = iVar.minusKey(gVar2.getKey());
                k00.i iVar2 = k00.j.A;
                if (iVarMinusKey == iVar2) {
                    return gVar2;
                }
                k00.d dVar2 = k00.d.A;
                k00.e eVar = iVarMinusKey.get(dVar2);
                if (eVar == null) {
                    bVar = new k00.b(gVar2, iVarMinusKey);
                } else {
                    k00.i iVarMinusKey2 = iVarMinusKey.minusKey(dVar2);
                    if (iVarMinusKey2 == iVar2) {
                        return new k00.b(eVar, gVar2);
                    }
                    bVar = new k00.b(eVar, new k00.b(gVar2, iVarMinusKey2));
                }
                return bVar;
            case 8:
                e60.a aVar = (e60.a) obj;
                m.e(aVar, "$this$single");
                m.e((a60.a) obj2, "it");
                kotlin.jvm.internal.b0 b0Var = a0.a;
                return new jq.e((xw.k) aVar.f(b0Var.b(xw.k.class), (a60.a) null, (b60.a) null), (xw.d) aVar.f(b0Var.b(xw.d.class), (a60.a) null, (b60.a) null), (xv.c) aVar.f(b0Var.b(xv.c.class), (a60.a) null, (b60.a) null), (jo.d) aVar.f(b0Var.b(jo.d.class), (a60.a) null, (b60.a) null), (o) aVar.f(b0Var.b(o.class), (a60.a) null, (b60.a) null), (au.a) aVar.f(b0Var.b(au.a.class), (a60.a) null, (b60.a) null));
            case 9:
                e60.a aVar2 = (e60.a) obj;
                m.e(aVar2, "$this$single");
                m.e((a60.a) obj2, "it");
                return new nq.b((aq.a) aVar2.f(a0.a.b(aq.a.class), (a60.a) null, (b60.a) null));
            case 10:
                e60.a aVar3 = (e60.a) obj;
                m.e(aVar3, "$this$single");
                m.e((a60.a) obj2, "it");
                return new lq.a(new l0((LocaleManager) aVar3.f(a0.a.b(LocaleManager.class), (a60.a) null, (b60.a) null), 16));
            case 11:
                e60.a aVar4 = (e60.a) obj;
                m.e(aVar4, "$this$single");
                m.e((a60.a) obj2, "it");
                kotlin.jvm.internal.b0 b0Var2 = a0.a;
                return new oq.b((lq.a) aVar4.f(b0Var2.b(lq.a.class), (a60.a) null, (b60.a) null), (pm.c) aVar4.f(b0Var2.b(pm.c.class), (a60.a) null, (b60.a) null));
            case 12:
                l1.j jVar2 = (l1.j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g0 g0Var2 = (g0) jVar2;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z6.b(z3.U(jVar2, 2131886943), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, jVar2, 0, 0, 262142);
                } else {
                    g0Var2.V();
                }
                return b0.a;
            case 13:
                l1.j jVar3 = (l1.j) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                g0 g0Var3 = (g0) jVar3;
                if (g0Var3.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    o3.a(y3.R(2131231375, jVar3, 0), null, z1.m(b2.o.A, 16), t.b(0.65f, dl.a.k), jVar3, 440, 0);
                } else {
                    g0Var3.V();
                }
                return b0.a;
            case 14:
                l1.j jVar4 = (l1.j) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                g0 g0Var4 = (g0) jVar4;
                if (g0Var4.S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    z6.b(z3.U(jVar4, 2131887198), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, jVar4, 0, 0, 262142);
                } else {
                    g0Var4.V();
                }
                return b0.a;
            case 15:
                l1.j jVar5 = (l1.j) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                g0 g0Var5 = (g0) jVar5;
                if (g0Var5.S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    o3.a(y3.R(2131231375, jVar5, 0), null, z1.m(b2.o.A, 16), t.b(0.6f, dl.a.k), jVar5, 440, 0);
                } else {
                    g0Var5.V();
                }
                return b0.a;
            case 16:
                l1.j jVar6 = (l1.j) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                g0 g0Var6 = (g0) jVar6;
                if (g0Var6.S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    z3.j(y3.R(2131231099, jVar6, 0), null, z1.m(b2.o.A, 16), t.b(0.5f, dl.a.k), jVar6, 440, 0);
                } else {
                    g0Var6.V();
                }
                return b0.a;
            case 17:
                Map mapB = ((g1) obj2).b();
                if (mapB.isEmpty()) {
                    return null;
                }
                return mapB;
            case TYPE_SINT64_VALUE:
                ((b3.l0) obj).H = true;
                return b0.a;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                ((l6.n) obj).getClass();
                g00.k[] kVarArr = {new g00.k("KEY", ((r) obj2).f4681a)};
                za.b0 b0Var3 = new za.b0();
                g00.k kVar2 = kVarArr[0];
                b0Var3.b(kVar2.B, (String) kVar2.A);
                return b0Var3.a();
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                e60.a aVar5 = (e60.a) obj;
                m.e(aVar5, "$this$single");
                m.e((a60.a) obj2, "it");
                return new jt.a(t1.i(aVar5), (bk.m) aVar5.f(a0.a.b(bk.m.class), (a60.a) null, (b60.a) null));
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                e60.a aVar6 = (e60.a) obj;
                m.e(aVar6, "$this$single");
                m.e((a60.a) obj2, "it");
                Context contextI = t1.i(aVar6);
                b60.b bVar2 = new b60.b("DEFAULT_OK_HTTP_CLIENT");
                kotlin.jvm.internal.b0 b0Var4 = a0.a;
                return new jt.d(contextI, (w) aVar6.f(b0Var4.b(w.class), (a60.a) null, bVar2), (SharedPreferences) aVar6.f(b0Var4.b(SharedPreferences.class), (a60.a) null, new b60.b("default_shared_preferences")), (bk.m) aVar6.f(b0Var4.b(bk.m.class), (a60.a) null, (b60.a) null), ot.e.E);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                e60.a aVar7 = (e60.a) obj;
                m.e(aVar7, "$this$single");
                m.e((a60.a) obj2, "it");
                Context contextI2 = t1.i(aVar7);
                b60.b bVar3 = new b60.b("DEFAULT_OK_HTTP_CLIENT");
                kotlin.jvm.internal.b0 b0Var5 = a0.a;
                return new jt.d(contextI2, (w) aVar7.f(b0Var5.b(w.class), (a60.a) null, bVar3), (SharedPreferences) aVar7.f(b0Var5.b(SharedPreferences.class), (a60.a) null, new b60.b("default_shared_preferences")), (bk.m) aVar7.f(b0Var5.b(bk.m.class), (a60.a) null, (b60.a) null), ot.e.F);
            case 23:
                m.e((e60.a) obj, "$this$factory");
                m.e((a60.a) obj2, "it");
                return new et.a();
            case 24:
                e60.a aVar8 = (e60.a) obj;
                m.e(aVar8, "$this$factory");
                m.e((a60.a) obj2, "it");
                return new et.b((xm.a) aVar8.f(a0.a.b(xm.a.class), (a60.a) null, (b60.a) null));
            case 25:
                e60.a aVar9 = (e60.a) obj;
                m.e(aVar9, "$this$factory");
                m.e((a60.a) obj2, "it");
                return new gt.a((bk.m) aVar9.f(a0.a.b(bk.m.class), (a60.a) null, (b60.a) null));
            case RuntimeVersion.MINOR:
                e60.a aVar10 = (e60.a) obj;
                m.e(aVar10, "$this$single");
                m.e((a60.a) obj2, "it");
                kotlin.jvm.internal.b0 b0Var6 = a0.a;
                return new ht.e((kt.a) aVar10.f(b0Var6.b(kt.a.class), (a60.a) null, (b60.a) null), (et.a) aVar10.f(b0Var6.b(et.a.class), (a60.a) null, (b60.a) null));
            case 27:
                e60.a aVar11 = (e60.a) obj;
                m.e(aVar11, "$this$single");
                m.e((a60.a) obj2, "it");
                kotlin.jvm.internal.b0 b0Var7 = a0.a;
                return new ht.k(ot.e.E, new q1((kt.b) aVar11.f(b0Var7.b(kt.b.class), (a60.a) null, (b60.a) null), null, 4), new h.e(14), (et.b) aVar11.f(b0Var7.b(et.b.class), (a60.a) null, (b60.a) null), (jt.d) aVar11.f(b0Var7.b(jt.d.class), (a60.a) null, (b60.a) null), (gt.a) aVar11.f(b0Var7.b(gt.a.class), (a60.a) null, (b60.a) null), (SharedPreferences) aVar11.f(b0Var7.b(SharedPreferences.class), (a60.a) null, new b60.b("default_shared_preferences")), (bk.m) aVar11.f(b0Var7.b(bk.m.class), (a60.a) null, (b60.a) null));
            case 28:
                e60.a aVar12 = (e60.a) obj;
                m.e(aVar12, "$this$single");
                m.e((a60.a) obj2, "it");
                Object objB = ((q0) aVar12.f(a0.a.b(q0.class), (a60.a) null, (b60.a) null)).b(kt.a.class);
                m.d(objB, "create(...)");
                return (kt.a) objB;
            default:
                e60.a aVar13 = (e60.a) obj;
                m.e(aVar13, "$this$single");
                m.e((a60.a) obj2, "it");
                kotlin.jvm.internal.b0 b0Var8 = a0.a;
                kt.b bVar4 = (kt.b) aVar13.f(b0Var8.b(kt.b.class), (a60.a) null, (b60.a) null);
                mt.a aVar14 = (mt.a) aVar13.f(b0Var8.b(mt.a.class), (a60.a) null, (b60.a) null);
                return new ht.k(ot.e.F, new d40.l(bVar4, aVar14, (k00.c) null, 2), new av.k(0, aVar14, mt.a.class, "languageCode", "languageCode()Ljava/lang/String;", 0, 20), (et.b) aVar13.f(b0Var8.b(et.b.class), (a60.a) null, (b60.a) null), (jt.d) aVar13.f(b0Var8.b(jt.d.class), (a60.a) null, c0.P()), (gt.a) aVar13.f(b0Var8.b(gt.a.class), (a60.a) null, (b60.a) null), (SharedPreferences) aVar13.f(b0Var8.b(SharedPreferences.class), (a60.a) null, new b60.b("default_shared_preferences")), (bk.m) aVar13.f(b0Var8.b(bk.m.class), (a60.a) null, (b60.a) null));
        }
    }
}

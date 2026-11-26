package a1;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.review.ReviewException;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.home.domain.exception.IntegrityTokenException;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

public final class c implements d40.j {
    public final int A;
    public final Object B;

    public c(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public java.lang.Object b(ru.a r8, k00.c r9) {
        throw new UnsupportedOperationException("Method not decompiled: a1.c.b(ru.a, k00.c):java.lang.Object");
    }

    public java.lang.Object c(boolean r7, k00.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: a1.c.c(boolean, k00.c):java.lang.Object");
    }

    public final Object emit(Object obj, k00.c cVar) throws NoWhenBranchMatchedException {
        xf.n nVarC;
        Object objJ;
        int i10 = 10;
        switch (this.A) {
            case 0:
                u0 u0Var = (u0) this.B;
                if (Build.VERSION.SDK_INT >= 34) {
                    u0Var.I().startStylusHandwriting((View) u0Var.B);
                }
                return g00.b0.a;
            case 1:
                ((l9.f0) this.B).t();
                return g00.b0.a;
            case 2:
                l9.f0 f0Var = (l9.f0) ((b0) this.B).f11g;
                f0Var.p().updateCursorAnchorInfo((View) f0Var.B, (CursorAnchorInfo) obj);
                return g00.b0.a;
            case 3:
                ((j2) this.B).f71m0.setValue(Boolean.FALSE);
                return g00.b0.a;
            case 4:
                List list = (List) obj;
                as.b1 b1Var = (as.b1) this.B;
                pm.b bVar = ((vm.a) b1Var).c;
                u30.b<PlayerItem> bVar2 = ((as.u0) bVar.d.getValue()).e;
                ArrayList arrayList = new ArrayList(h00.r.q0(bVar2, 10));
                for (PlayerItem playerItem : bVar2) {
                    arrayList.add(new g00.k(new Integer(playerItem.getReciterId()), new Long(playerItem.getSurahId())));
                }
                Set setR1 = h00.q.r1(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    yt.a aVar = (yt.a) obj2;
                    if (setR1.contains(new g00.k(new Integer(aVar.b), new Long(aVar.c)))) {
                        arrayList2.add(obj2);
                    }
                }
                b1Var.i(as.u0.a((as.u0) bVar.d.getValue(), (dw.a) null, (u30.b) null, (u30.b) null, (u30.b) null, 0, false, (String) null, false, (qr.r) null, false, false, (u30.b) null, false, (u30.b) null, g4.d0(arrayList2), false, false, (String) null, false, false, 2064383));
                return g00.b0.a;
            case 5:
                Object objM = av.i.m((av.i) this.B, cVar);
                return objM == l00.a.A ? objM : g00.b0.a;
            case 6:
                ((Boolean) obj).getClass();
                os.x xVar = ((bt.j2) this.B).t;
                xVar.E = true;
                a40.c0.y(xVar.p, (k00.i) null, (a40.a0) null, new os.a(2, (k00.c) null, xVar), 3);
                return g00.b0.a;
            case 7:
                ((c3.j2) this.B).C.i(((Number) obj).floatValue());
                return g00.b0.a;
            case 8:
                if (((androidx.lifecycle.p) obj).compareTo(androidx.lifecycle.p.C) <= 0) {
                    d00.w0 w0Var = (d00.w0) this.B;
                    d00.c cVar2 = w0Var.O;
                    kotlin.jvm.internal.m.e(cVar2, "<this>");
                    l2.b bVarA = cVar2.a();
                    if (bVarA != null) {
                        ((i2.y) b3.m.h(w0Var, c3.o1.f2733g)).a(bVarA);
                    }
                    cVar2.f.setValue(null);
                }
                return g00.b0.a;
            case 9:
                du.t0 t0Var = (du.t0) this.B;
                ah.h hVar = t0Var.i.f477a;
                String str = hVar.f484b;
                bh.f fVar = ah.h.f482c;
                fVar.g("requestInAppReview (%s)", str);
                bh.l lVar = hVar.f483a;
                if (lVar == null) {
                    Object[] objArr = new Object[0];
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", bh.f.i(fVar.A, "Play Store app is either not installed or not the official version", objArr));
                    }
                    Locale locale = Locale.getDefault();
                    HashMap map = ch.a.f3155a;
                    nVarC = Tasks.c(new ReviewException(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, map.containsKey(-1) ? ((String) map.get(-1)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) ch.a.f3156b.get(-1)) + ")" : RuntimeVersion.SUFFIX), null, null)));
                } else {
                    xf.g gVar = new xf.g();
                    lVar.a().post(new bh.i(lVar, gVar, gVar, new ah.f(hVar, gVar, gVar)));
                    nVarC = gVar.f16565a;
                }
                nVarC.b(new ab.r(t0Var, i10));
                return g00.b0.a;
            case 10:
                ((u00.k) ((l1.z0) this.B).getValue()).invoke((String) obj);
                return g00.b0.a;
            case 11:
                f0.h hVar2 = (f0.h) obj;
                z1.p pVar = (z1.p) this.B;
                if (hVar2 instanceof f0.f) {
                    pVar.add(hVar2);
                } else if (hVar2 instanceof f0.g) {
                    pVar.remove(((f0.g) hVar2).f5475a);
                } else if (hVar2 instanceof f0.d) {
                    pVar.add(hVar2);
                } else if (hVar2 instanceof f0.e) {
                    pVar.remove(((f0.e) hVar2).f5474a);
                } else if (hVar2 instanceof f0.k) {
                    pVar.add(hVar2);
                } else if (hVar2 instanceof f0.l) {
                    pVar.remove(((f0.l) hVar2).f5479a);
                } else if (hVar2 instanceof f0.j) {
                    pVar.remove(((f0.j) hVar2).f5477a);
                }
                return g00.b0.a;
            case 12:
                return c(((Boolean) obj).booleanValue(), cVar);
            case 13:
                g00.k kVar = (g00.k) obj;
                u30.b<bx.c> bVar3 = (u30.b) kVar.A;
                qr.o oVar = (qr.q) kVar.B;
                lu.e0 e0Var = (lu.e0) this.B;
                pm.b bVar4 = ((vm.a) e0Var).c;
                lu.z zVar = (lu.z) ((lu.a0) bVar4.d.getValue()).b.get("reciters");
                lu.z zVar2 = zVar == null ? new lu.z((u30.b) null, (u30.b) null, (u30.b) null, (u30.b) null, (ju.i) null, 4095) : zVar;
                boolean z10 = oVar instanceof qr.p;
                boolean z11 = oVar instanceof qr.o;
                qr.o oVar2 = z11 ? oVar : null;
                boolean z12 = (oVar2 != null ? oVar2.a : null) instanceof IntegrityTokenException;
                u30.b<ju.h> bVar5 = zVar2.d;
                int iP = h00.d0.P(h00.r.q0(bVar5, 10));
                if (iP < 16) {
                    iP = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
                for (ju.h hVar3 : bVar5) {
                    linkedHashMap.put(new Integer(hVar3.a), Boolean.valueOf(hVar3.d));
                }
                ArrayList arrayList3 = new ArrayList(h00.r.q0(bVar3, 10));
                for (bx.c cVar3 : bVar3) {
                    int i11 = cVar3.a;
                    String str2 = cVar3.b;
                    String str3 = cVar3.e;
                    u30.b bVar6 = bVar3;
                    Boolean bool = (Boolean) linkedHashMap.get(new Integer(i11));
                    arrayList3.add(new ju.h(i11, str2, str3, bool != null ? bool.booleanValue() : false));
                    bVar3 = bVar6;
                }
                u30.b bVar7 = bVar3;
                u30.b bVarD0 = g4.d0(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : bVarD0) {
                    if (((ju.h) obj3).d) {
                        arrayList4.add(obj3);
                    }
                }
                e0Var.m("reciters", lu.z.a(zVar2, z10, z11, z12, bVarD0, bVarD0, g4.d0(arrayList4), (u30.b) null, (zz.a) null, 0, (String) null, 4032));
                if ((oVar instanceof qr.n) && !bVar7.isEmpty()) {
                    Set set = ((lu.a0) bVar4.d.getValue()).e;
                    if (!set.contains("reciters")) {
                        e0Var.i(lu.a0.a((lu.a0) bVar4.d.getValue(), (u30.f) null, 0, false, h00.j0.r0(set, "reciters"), false, 47));
                    }
                }
                return g00.b0.a;
            case 14:
                ((Boolean) obj).booleanValue();
                ((no.d) this.B).c();
                return g00.b0.a;
            case 15:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                g00.b0 b0Var = g00.b0.a;
                return (zBooleanValue && (objJ = ((ns.j) this.B).j(cVar)) == l00.a.A) ? objJ : b0Var;
            case 16:
                nx.p0 p0Var = (nx.p0) this.B;
                p0Var.i(nx.i0.a((nx.i0) ((vm.a) p0Var).c.d.getValue(), (bx.c) null, (u30.b) null, (u30.b) null, (String) null, (u30.b) null, (u30.b) null, false, ze.d.E((List) obj), false, false, false, (String) null, false, false, 65279));
                return g00.b0.a;
            case 17:
                l1.g1 g1Var = (l1.g1) this.B;
                long j9 = ((lo.t) obj).a;
                h0.p1 p1Var = po.m.a;
                g1Var.i(j9);
                return g00.b0.a;
            case TYPE_SINT64_VALUE:
                return b((ru.a) obj, cVar);
            default:
                wj.f0 f0Var2 = (wj.f0) obj;
                wj.x0 x0Var = (wj.x0) this.B;
                kotlin.jvm.internal.m.e(f0Var2, "<set-?>");
                x0Var.f16223h = f0Var2;
                Object objA = wj.x0.a(x0Var, f0Var2.f16150a.f16180a, wj.u0.A, cVar);
                return objA == l00.a.A ? objA : g00.b0.a;
        }
    }
}

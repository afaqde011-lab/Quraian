package l6;

import a40.c0;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.textclassifier.TextClassification;
import b3.o0;
import c3.g1;
import c3.w2;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.z3;
import com.google.protobuf.RuntimeVersion;
import g1.b8;
import h00.d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlinx.serialization.json.internal.JsonException;
import l0.q0;
import l1.f1;
import l1.q1;
import l1.y0;
import l1.z0;
import lu.e0;
import q0.g2;
import q0.o1;
import ri.t1;
import ur.i0;

public final class c implements u00.a {
    public final int A;
    public final Object B;
    public final Object C;

    public c(Object obj, Object obj2, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    public c(g2 g2Var, m3.f fVar, w2 w2Var) {
        this.A = 14;
        this.B = fVar;
        this.C = w2Var;
    }

    public final Object invoke() throws JsonException, PendingIntent.CanceledException {
        int iNextIndex;
        m3.h hVar;
        m3.p pVar;
        String[] strArrNames;
        boolean z10;
        switch (this.A) {
            case 0:
                c0.y((a40.z) this.B, (k00.i) null, (a40.a0) null, new d((r) this.C, null, 0), 3);
                return g00.b0.a;
            case 1:
                String str = (String) this.B;
                e0 e0Var = (e0) this.C;
                if (kotlin.jvm.internal.m.a(str, "social_proof")) {
                    e0Var.k(lu.n.a);
                } else {
                    e0Var.k(lu.g.a);
                }
                return g00.b0.a;
            case 2:
                ((u00.k) this.B).invoke(Integer.valueOf(((qr.a) this.C).a));
                return g00.b0.a;
            case 3:
                ta.c0.M((a40.z) this.B, null, null, null, new d((g1) this.C, null, 2), 31);
                return g00.b0.a;
            case 4:
                l1.w wVar = (l1.w) this.B;
                m0.w wVar2 = (m0.w) this.C;
                m0.n nVar = (m0.n) wVar.getValue();
                return new m0.o(wVar2, nVar, new c50.h((z00.e) ((q0) wVar2.f10388d.F).getValue(), nVar));
            case 5:
                ((u00.k) this.B).invoke(new lu.m(((ju.f) this.C).a));
                return g00.b0.a;
            case 6:
                ((u00.k) this.B).invoke((bx.e) this.C);
                return g00.b0.a;
            case 7:
                u00.n nVar2 = (u00.n) this.B;
                b8 b8Var = (b8) this.C;
                nVar2.invoke(Integer.valueOf(b8Var.g()), Integer.valueOf(b8Var.c()));
                return g00.b0.a;
            case 8:
                p40.v vVar = (p40.v) this.B;
                String str2 = (String) this.C;
                p40.u uVar = (p40.u) vVar.c;
                if (uVar == null) {
                    Enum[] enumArr = (Enum[]) vVar.b;
                    uVar = new p40.u(str2, enumArr.length);
                    for (Enum r4 : enumArr) {
                        uVar.j(r4.name(), false);
                    }
                }
                return uVar;
            case 9:
                return t1.l((String) this.B, n40.i.f, new n40.e[0], new h00.a((p40.v) this.C, 25));
            case 10:
                h00.b bVar = (u30.b) this.B;
                l1.g1 g1Var = (l1.g1) this.C;
                ListIterator listIterator = bVar.listIterator(bVar.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                    } else if (((lo.v) listIterator.previous()).a <= g1Var.h()) {
                        iNextIndex = listIterator.nextIndex();
                    }
                }
                if (iNextIndex < 0) {
                    iNextIndex = 0;
                }
                return Integer.valueOf(iNextIndex);
            case 11:
                ((u00.k) this.B).invoke((ep.f) this.C);
                return g00.b0.a;
            case 12:
                r3.w wVar3 = (r3.w) this.B;
                z0 z0Var = (z0) this.C;
                if (!m3.q0.c(wVar3.f13100b, ((r3.w) z0Var.getValue()).f13100b) || !kotlin.jvm.internal.m.a(wVar3.f13101c, ((r3.w) z0Var.getValue()).f13101c)) {
                    z0Var.setValue(wVar3);
                }
                return g00.b0.a;
            case 13:
                g2 g2Var = (g2) this.B;
                m3.h hVar2 = (m3.h) this.C;
                if (g2Var == null) {
                    return hVar2;
                }
                z1.p pVar2 = g2Var.f12618c;
                if (pVar2.isEmpty()) {
                    hVar = g2Var.f12617b;
                } else {
                    o1 o1Var = new o1(g2Var.f12617b);
                    int size = pVar2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((u00.k) pVar2.get(i10)).invoke(o1Var);
                    }
                    hVar = o1Var.f12673b;
                }
                g2Var.f12617b = hVar;
                return hVar == null ? hVar2 : hVar;
            case 14:
                m3.f fVar = (m3.f) this.B;
                w2 w2Var = (w2) this.C;
                m3.o oVar = (m3.o) fVar.f10423a;
                if (oVar instanceof m3.n) {
                    m3.p pVar3 = ((m3.n) oVar).f10495c;
                    if (pVar3 != null) {
                        pVar3.l(oVar);
                    } else {
                        try {
                            w2Var.a(((m3.n) oVar).f10493a);
                            break;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } else if ((oVar instanceof m3.m) && (pVar = ((m3.m) oVar).f10482c) != null) {
                    pVar.l(oVar);
                }
                return g00.b0.a;
            case 15:
                ((u00.k) this.B).invoke(((ry.c) this.C).a);
                return g00.b0.a;
            case 16:
                return ((r30.j) this.B).a((String) this.C);
            case 17:
                n40.e eVar = (n40.e) this.B;
                q40.c cVar = (q40.c) this.C;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                q1 q1Var = cVar.a;
                r40.j.n(eVar, cVar);
                int iE = eVar.e();
                for (int i11 = 0; i11 < iE; i11++) {
                    List listG = eVar.g(i11);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listG) {
                        if (obj instanceof q40.t) {
                            arrayList.add(obj);
                        }
                    }
                    q40.t tVar = (q40.t) h00.q.f1(arrayList);
                    if (tVar != null && (strArrNames = tVar.names()) != null) {
                        for (String str3 : strArrNames) {
                            String str4 = kotlin.jvm.internal.m.a(eVar.getKind(), n40.h.c) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str3)) {
                                String str5 = "The suggested name '" + str3 + "' for " + str4 + ' ' + eVar.f(i11) + " is already one of the names for " + str4 + ' ' + eVar.f(((Number) d0.O(linkedHashMap, str3)).intValue()) + " in " + eVar;
                                kotlin.jvm.internal.m.e(str5, "message");
                                throw new JsonException(str5);
                            }
                            linkedHashMap.put(str3, Integer.valueOf(i11));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? h00.y.A : linkedHashMap;
            case TYPE_SINT64_VALUE:
                ((u00.k) this.B).invoke(Integer.valueOf(((lo.j) this.C).a));
                return g00.b0.a;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                u00.a aVar = (u00.a) this.B;
                f1 f1Var = (f1) ((y0) this.C);
                f1Var.i(f1Var.h() + 1);
                aVar.invoke();
                return g00.b0.a;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                ((u00.k) this.B).invoke(new i0(((qr.l) this.C).a));
                return g00.b0.a;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                rr.b bVar2 = (rr.b) this.B;
                Context context = (Context) this.C;
                String string = context.getString(2131886326);
                kotlin.jvm.internal.m.d(string, "getString(...)");
                String string2 = context.getString(2131887136);
                kotlin.jvm.internal.m.d(string2, "getString(...)");
                bVar2.getClass();
                String str6 = Build.MANUFACTURER;
                String strM = Build.MODEL;
                kotlin.jvm.internal.m.b(strM);
                kotlin.jvm.internal.m.b(str6);
                if (!r30.r.x0(strM, str6, false)) {
                    strM = x5.m(str6, " ", strM);
                }
                String str7 = Build.VERSION.RELEASE;
                int i12 = Build.VERSION.SDK_INT;
                StringBuilder sbS = a1.b.s("\n        ", string2, "\n        \n        \n        \n        -------------------\n        App Version: 2.4.1 (92)\n        Device: ", strM, "\n        Android version: ");
                sbS.append(str7);
                sbS.append("\n        API version: ");
                sbS.append(i12);
                sbS.append("\n        -------------------\n        ");
                Uri uri = Uri.parse("mailto:support+android@quranify.pro?body=" + r30.l.j0(sbS.toString()) + "&subject=" + string);
                try {
                    context.startActivity(new Intent("android.intent.action.SENDTO", uri));
                    break;
                } catch (ActivityNotFoundException unused2) {
                    context.startActivity(new Intent("android.intent.action.VIEW", uri));
                }
                return g00.b0.a;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                ((kotlin.jvm.internal.z) this.B).A = ((u00.a) this.C).invoke();
                return g00.b0.a;
            case 23:
                return new y3.j(f50.k.C(((x0.e) this.B).O0((z2.a0) ((u00.a) this.C).invoke())));
            case 24:
                ((t0.d) this.B).f14316d.invoke((t0.g) this.C);
                return g00.b0.a;
            case 25:
                Context context2 = (Context) this.B;
                TextClassification textClassification = (TextClassification) this.C;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                    } catch (PendingIntent.CanceledException e3) {
                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e3);
                    }
                    break;
                } else {
                    activity.send();
                }
                return g00.b0.a;
            case RuntimeVersion.MINOR:
                wy.o oVar2 = (wy.o) this.B;
                u30.f fVar2 = (u30.f) this.C;
                String str8 = oVar2.a;
                String str9 = oVar2.d;
                String str10 = oVar2.c;
                if (r30.k.L0(str8)) {
                    z10 = false;
                } else {
                    Collection collectionValues = fVar2.values();
                    if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                        Iterator it = collectionValues.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!((Boolean) it.next()).booleanValue()) {
                                }
                            } else if (z3.E(str10) && !r30.k.L0(str9) && kotlin.jvm.internal.m.a(str10, str9) && !oVar2.b() && !oVar2.e) {
                                z10 = true;
                            }
                            z10 = false;
                        }
                    } else if (z3.E(str10)) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                }
                return Boolean.valueOf(z10);
            case 27:
                ((c40.l) this.B).j(this.C);
                return g00.b0.a;
            case 28:
                ((u00.k) this.B).invoke(Integer.valueOf(((bx.c) this.C).a));
                return g00.b0.a;
            default:
                z.o oVar3 = (z.o) this.B;
                o0 o0Var = (o0) this.C;
                oVar3.W = oVar3.R.a(o0Var.A.b(), o0Var.getLayoutDirection(), o0Var);
                return g00.b0.a;
        }
    }
}

package q3;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.WindowInsetsAnimation;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import b3.l0;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.e4;
import com.google.android.gms.internal.play_billing.i4;
import com.google.android.gms.internal.play_billing.k4;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.l4;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.q1;
import com.google.android.gms.internal.play_billing.q3;
import com.google.android.gms.internal.play_billing.r3;
import com.google.android.gms.internal.play_billing.s3;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.u3;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.billing.BillingException;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.models.StoreProduct;
import gz.e1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import l1.i1;
import l1.k1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qd.n0;
import s7.z0;
import sd.p1;
import tf.h1;
import tf.i2;
import tf.n3;
import tf.w0;
import tf.y1;
import z2.j0;
import z2.q0;
import z2.s1;
import z2.t1;

public final class e0 implements n0, kh.q, v5.k, GetStoreProductsCallback, yj.b, xi.a, zd.b, dh.n, s1 {
    public final int A;
    public Object B;
    public Object C;

    public e0(int i10) {
        this.A = i10;
        switch (i10) {
            case 5:
                this.B = null;
                this.C = null;
                break;
            case 12:
                this.B = Choreographer.getInstance();
                this.C = Looper.myLooper();
                break;
            case RuntimeVersion.MINOR:
                e0 e0Var = zh.i.f17477a;
                this.B = new p1((p1) e0Var.B);
                this.C = Arrays.copyOf((long[]) e0Var.C, 10);
                break;
            default:
                this.B = new tf.y(12);
                this.C = new u.s(16);
                break;
        }
    }

    public e0(int i10, Object obj, Object obj2, boolean z10) {
        this.A = i10;
        this.B = obj2;
        this.C = obj;
    }

    public e0(int i10, boolean z10) {
        this.A = i10;
    }

    public e0(a10.d dVar) {
        this.A = 4;
        kotlin.jvm.internal.m.e(dVar, "baseClass");
        this.B = dVar;
        this.C = new ArrayList();
    }

    public e0(a40.k kVar, String str, vp.x xVar) {
        this.A = 15;
        this.B = kVar;
        this.C = str;
    }

    public e0(Context context, w3 w3Var) {
        this.A = 2;
        androidx.media3.common.q qVar = new androidx.media3.common.q(8);
        try {
            xd.p.b(context);
            qVar.C = xd.p.a().c(vd.a.f15608e).a("PLAY_BILLING_LIBRARY", new ud.c("proto"), new gj.e(29));
        } catch (Throwable unused) {
            qVar.B = true;
        }
        this.C = qVar;
        this.B = w3Var;
    }

    public e0(WindowInsetsAnimation.Bounds bounds) {
        this.A = 24;
        this.B = q4.b.d(bounds.getLowerBound());
        this.C = q4.b.d(bounds.getUpperBound());
    }

    public e0(c1.d dVar, c1.e eVar) {
        this.A = 22;
        this.B = eVar;
        this.C = l1.q.z(dVar);
    }

    public e0(ij.b bVar) {
        this.A = 6;
        this.C = Collections.synchronizedMap(new HashMap());
        this.B = bVar;
    }

    public e0(Object obj, Object obj2, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    public e0(y7.c cVar) {
        this.A = 18;
        this.C = cVar;
    }

    public e0(xi.a[] aVarArr) {
        this.A = 17;
        this.B = aVarArr;
        this.C = new tf.w(21);
    }

    public static long i(JSONObject jSONObject) throws JSONException {
        long j9 = jSONObject.getLong("$rowId");
        jSONObject.put("event_id", j9);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("library");
        if (jSONObjectOptJSONObject != null) {
            jSONObject.put("library", jSONObjectOptJSONObject.getString("name") + '/' + jSONObjectOptJSONObject.getString("version"));
        }
        Object objOpt = jSONObject.opt("timestamp");
        if (objOpt != null) {
            jSONObject.put("time", objOpt);
        }
        Object objOpt2 = jSONObject.opt("uuid");
        if (objOpt2 != null) {
            jSONObject.put("insert_id", objOpt2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("api_properties");
        if (jSONObjectOptJSONObject2 != null) {
            Object objOpt3 = jSONObjectOptJSONObject2.opt("androidADID");
            if (objOpt3 != null) {
                jSONObject.put("adid", objOpt3);
            }
            Object objOpt4 = jSONObjectOptJSONObject2.opt("android_app_set_id");
            if (objOpt4 != null) {
                jSONObject.put("android_app_set_id", objOpt4);
            }
            Object objOpt5 = jSONObjectOptJSONObject2.opt("productId");
            if (objOpt5 != null) {
                jSONObject.put("productId", objOpt5);
            }
            Object objOpt6 = jSONObjectOptJSONObject2.opt("quantity");
            if (objOpt6 != null) {
                jSONObject.put("quantity", objOpt6);
            }
            Object objOpt7 = jSONObjectOptJSONObject2.opt("price");
            if (objOpt7 != null) {
                jSONObject.put("price", objOpt7);
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("location");
            if (jSONObjectOptJSONObject3 != null) {
                Object objOpt8 = jSONObjectOptJSONObject3.opt("lat");
                if (objOpt8 != null) {
                    jSONObject.put("location_lat", objOpt8);
                }
                Object objOpt9 = jSONObjectOptJSONObject3.opt("lng");
                if (objOpt9 != null) {
                    jSONObject.put("location_lng", objOpt9);
                }
            }
        }
        Object objOpt10 = jSONObject.opt("$productId");
        if (objOpt10 != null) {
            jSONObject.put("productId", objOpt10);
        }
        Object objOpt11 = jSONObject.opt("$quantity");
        if (objOpt11 != null) {
            jSONObject.put("quantity", objOpt11);
        }
        Object objOpt12 = jSONObject.opt("$price");
        if (objOpt12 != null) {
            jSONObject.put("price", objOpt12);
        }
        Object objOpt13 = jSONObject.opt("$revenueType");
        if (objOpt13 != null) {
            jSONObject.put("revenueType", objOpt13);
        }
        return j9;
    }

    public void A(m3 m3Var, int i10, long j9, boolean z10) {
        w3 w3Var;
        try {
            v3 v3Var = (v3) ((w3) this.B).l();
            v3Var.c();
            w3.E((w3) v3Var.B, i10);
            this.B = (w3) v3Var.a();
            l3 l3Var = (l3) m3Var.l();
            a4 a4Var = (a4) m3Var.w().l();
            a4Var.c();
            c4.s((c4) a4Var.B, z10);
            l3Var.c();
            m3.r((m3) l3Var.B, (c4) a4Var.a());
            m3 m3Var2 = (m3) l3Var.a();
            if (j9 == 0) {
                w3Var = (w3) this.B;
            } else {
                v3 v3Var2 = (v3) ((w3) this.B).l();
                v3Var2.g(j9);
                w3Var = (w3) v3Var2.a();
            }
            G(m3Var2, w3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void B(r3 r3Var) {
        try {
            d4 d4VarT = e4.t();
            d4VarT.e((w3) this.B);
            d4VarT.c();
            e4.w((e4) d4VarT.B, r3Var);
            ((androidx.media3.common.q) this.C).t((e4) d4VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void C(qd.h hVar, long j9) {
        w3 w3Var;
        try {
            t3 t3VarR = u3.r();
            t3VarR.c();
            u3.w((u3) t3VarR.B, 4);
            s3 s3Var = s3.IN_APP_BILLING_RESULT_UPDATE_ACTION;
            t3VarR.c();
            u3.s((u3) t3VarR.B, s3Var);
            if (hVar != null) {
                p3 p3VarS = q3.s();
                p3VarS.f(hVar.f12892a);
                String str = hVar.f12894c;
                p3VarS.c();
                q3.u((q3) p3VarS.B, str);
                t3VarR.c();
                u3.t((u3) t3VarR.B, (q3) p3VarS.a());
            }
            d4 d4VarT = e4.t();
            if (j9 == 0) {
                w3Var = (w3) this.B;
            } else {
                v3 v3Var = (v3) ((w3) this.B).l();
                v3Var.g(j9);
                w3Var = (w3) v3Var.a();
            }
            d4VarT.e(w3Var);
            d4VarT.c();
            e4.x((e4) d4VarT.B, (u3) t3VarR.a());
            ((androidx.media3.common.q) this.C).t((e4) d4VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void D(i4 i4Var) {
        try {
            d4 d4VarT = e4.t();
            d4VarT.e((w3) this.B);
            t3 t3VarR = u3.r();
            t3VarR.c();
            u3.u((u3) t3VarR.B);
            t3VarR.c();
            u3.w((u3) t3VarR.B, 2);
            t3VarR.c();
            u3.v((u3) t3VarR.B, i4Var);
            d4VarT.c();
            e4.x((e4) d4VarT.B, (u3) t3VarR.a());
            ((androidx.media3.common.q) this.C).t((e4) d4VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void E(k4 k4Var) {
        try {
            androidx.media3.common.q qVar = (androidx.media3.common.q) this.C;
            d4 d4VarT = e4.t();
            d4VarT.e((w3) this.B);
            d4VarT.c();
            e4.r((e4) d4VarT.B, k4Var);
            qVar.t((e4) d4VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void F(l4 l4Var) {
        if (l4Var == null) {
            return;
        }
        try {
            d4 d4VarT = e4.t();
            d4VarT.e((w3) this.B);
            d4VarT.c();
            e4.s((e4) d4VarT.B, l4Var);
            ((androidx.media3.common.q) this.C).t((e4) d4VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void G(m3 m3Var, w3 w3Var) {
        if (m3Var == null) {
            return;
        }
        try {
            d4 d4VarT = e4.t();
            d4VarT.e(w3Var);
            d4VarT.c();
            e4.u((e4) d4VarT.B, m3Var);
            ((androidx.media3.common.q) this.C).t((e4) d4VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void H(o3 o3Var, w3 w3Var) {
        if (o3Var == null) {
            return;
        }
        try {
            d4 d4VarT = e4.t();
            d4VarT.e(w3Var);
            d4VarT.c();
            e4.v((e4) d4VarT.B, o3Var);
            ((androidx.media3.common.q) this.C).t((e4) d4VarT.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public Object a() {
        return (v5.t) this.B;
    }

    @Override
    public t1 apply() {
        q0 q0Var = (q0) this.B;
        j0 j0VarM = m();
        if (j0VarM != null) {
            q0Var.d(j0VarM, false);
        }
        return q0Var.f(this.C);
    }

    @Override
    public boolean b(ak.a aVar) {
        j0 j0VarM = m();
        k1 k1Var = j0VarM != null ? j0VarM.f17123f : null;
        if (k1Var == null || k1Var.c()) {
            return true;
        }
        z1.f fVarF = z1.q.f();
        u00.k kVarE = fVarF != null ? fVarF.e() : null;
        z1.f fVarK = z1.q.k(fVarF);
        try {
            boolean zE = k1Var.e(aVar);
            z1.q.n(fVarF, fVarK, kVarE);
            return zE;
        } catch (Throwable th2) {
            try {
                j0VarM.getClass();
                throw th2;
            } catch (Throwable th3) {
                z1.q.n(fVarF, fVarK, kVarE);
                throw th3;
            }
        }
    }

    @Override
    public boolean c(CharSequence charSequence, int i10, int i11, v5.r rVar) {
        if ((rVar.f15480c & 4) > 0) {
            return true;
        }
        if (((v5.t) this.B) == null) {
            this.B = new v5.t(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((tf.w) this.C).getClass();
        ((v5.t) this.B).setSpan(new v5.s(rVar), i10, i11, 33);
        return true;
    }

    @Override
    public void cancel() {
        j0 j0VarM = m();
        if ((j0VarM != null ? j0VarM.f17123f : null) != null) {
            q0.c((q0) this.B, this.C);
        }
    }

    public r3.w d(List list) {
        r3.g gVar = null;
        try {
            int size = list.size();
            int i10 = 0;
            r3.g gVar2 = null;
            while (i10 < size) {
                try {
                    r3.g gVar3 = (r3.g) list.get(i10);
                    try {
                        gVar3.a((com.google.android.material.datepicker.n) this.C);
                        i10++;
                        gVar2 = gVar3;
                    } catch (Exception e3) {
                        e = e3;
                        gVar = gVar3;
                        StringBuilder sb2 = new StringBuilder();
                        StringBuilder sb3 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb3.append(((q1) ((com.google.android.material.datepicker.n) this.C).F).B());
                        sb3.append(", composition=");
                        sb3.append(((com.google.android.material.datepicker.n) this.C).c());
                        sb3.append(", selection=");
                        com.google.android.material.datepicker.n nVar = (com.google.android.material.datepicker.n) this.C;
                        sb3.append((Object) m3.q0.i(m3.h0.b(nVar.B, nVar.C)));
                        sb3.append("):");
                        sb2.append(sb3.toString());
                        sb2.append('\n');
                        h00.q.Q0(list, sb2, "\n", (String) null, (String) null, new q0.a(gVar, this, 7), 60);
                        throw new RuntimeException(sb2.toString(), e);
                    }
                } catch (Exception e10) {
                    e = e10;
                    gVar = gVar2;
                }
            }
            com.google.android.material.datepicker.n nVar2 = (com.google.android.material.datepicker.n) this.C;
            nVar2.getClass();
            m3.h hVar = new m3.h(((q1) nVar2.F).toString());
            com.google.android.material.datepicker.n nVar3 = (com.google.android.material.datepicker.n) this.C;
            long jB = m3.h0.b(nVar3.B, nVar3.C);
            m3.q0 q0Var = m3.q0.h(((r3.w) this.B).f13100b) ? null : new m3.q0(jB);
            r3.w wVar = new r3.w(hVar, q0Var != null ? q0Var.f10520a : m3.h0.b(m3.q0.f(jB), m3.q0.g(jB)), ((com.google.android.material.datepicker.n) this.C).c());
            this.B = wVar;
            return wVar;
        } catch (Exception e11) {
            e = e11;
        }
    }

    @Override
    public Object e() {
        dh.m mVar = (dh.m) this.C;
        return new yg.b((yg.g) ((dh.m) this.B).e(), (yg.k) mVar.e());
    }

    @Override
    public StackTraceElement[] f(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        xi.a[] aVarArr = (xi.a[]) this.B;
        StackTraceElement[] stackTraceElementArrF = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            xi.a aVar = aVarArr[i10];
            if (stackTraceElementArrF.length <= 1024) {
                break;
            }
            stackTraceElementArrF = aVar.f(stackTraceElementArr);
        }
        return stackTraceElementArrF.length > 1024 ? ((tf.w) this.C).f(stackTraceElementArrF) : stackTraceElementArrF;
    }

    @Override
    public boolean g() {
        k1 k1Var;
        j0 j0VarM = m();
        if (j0VarM == null || (k1Var = j0VarM.f17123f) == null) {
            return true;
        }
        return k1Var.c();
    }

    public Object get() {
        switch (this.A) {
            case 16:
                Context context = (Context) ((nf.c) this.B).A;
                k00.i iVar = (k00.i) ((f00.a) this.C).get();
                kotlin.jvm.internal.m.e(context, "appContext");
                kotlin.jvm.internal.m.e(iVar, "blockingDispatcher");
                DataStore dataStoreB = wj.p.b(zj.h.A, new ReplaceFileCorruptionHandler(new r9.e(24)), a40.c0.c(iVar), new dm.b(context, 2));
                if (dataStoreB != null) {
                    return dataStoreB;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new yd.d((Context) ((a5.f) this.B).A, (p1) ((wb.o) this.C).get());
        }
    }

    public void h(ce.c cVar) throws s40.d {
        for (g00.k kVar : (ArrayList) this.C) {
            a10.d dVar = (a10.d) kVar.A;
            l40.a aVar = (l40.a) kVar.B;
            a10.d dVar2 = (a10.d) this.B;
            kotlin.jvm.internal.m.c(dVar, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder>");
            kotlin.jvm.internal.m.c(aVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            kotlin.jvm.internal.m.e(dVar2, "baseClass");
            kotlin.jvm.internal.m.e(dVar, "concreteClass");
            kotlin.jvm.internal.m.e(aVar, "concreteSerializer");
            String strA = aVar.getDescriptor().a();
            HashMap map = (HashMap) cVar.C;
            Object map2 = map.get(dVar2);
            if (map2 == null) {
                map2 = new HashMap();
                map.put(dVar2, map2);
            }
            Map map3 = (Map) map2;
            l40.a aVar2 = (l40.a) map3.get(dVar);
            HashMap map4 = (HashMap) cVar.E;
            Object map5 = map4.get(dVar2);
            if (map5 == null) {
                map5 = new HashMap();
                map4.put(dVar2, map5);
            }
            Map map6 = (Map) map5;
            if (aVar2 != null) {
                if (!aVar2.equals(aVar)) {
                    String str = "Serializer for " + dVar + " already registered in the scope of " + dVar2;
                    kotlin.jvm.internal.m.e(str, "msg");
                    throw new s40.d(str);
                }
            }
            l40.a aVar3 = (l40.a) map6.get(strA);
            if (aVar3 != null) {
                Object obj = map.get(dVar2);
                kotlin.jvm.internal.m.b(obj);
                for (Object obj2 : (Iterable) h00.q.D0(((Map) obj).entrySet()).f2777b) {
                    if (((Map.Entry) obj2).getValue() == aVar3) {
                        throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + dVar2 + "' have the same serial name '" + strA + "': '" + dVar + "' and '" + ((Map.Entry) obj2) + '\'');
                    }
                }
                obj2 = null;
                throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + dVar2 + "' have the same serial name '" + strA + "': '" + dVar + "' and '" + ((Map.Entry) obj2) + '\'');
            }
            map3.put(dVar, aVar);
            map6.put(strA, aVar);
        }
    }

    @Override
    public void h0(Throwable th2) {
        n3 n3Var = (n3) this.B;
        i2 i2Var = (i2) this.C;
        i2Var.V0();
        i2Var.J = false;
        h1 h1Var = (h1) i2Var.B;
        tf.g gVar = h1Var.D;
        tf.q0 q0Var = h1Var.F;
        int i10 = 2;
        if (gVar.f1(null, tf.b0.T0)) {
            String message = th2.getMessage();
            i2Var.O = false;
            if (message != null) {
                if ((th2 instanceof IllegalStateException) || message.contains("garbage collected") || th2.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                    if (message.contains("Background")) {
                        i2Var.O = true;
                    }
                    i10 = 1;
                } else if ((th2 instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                    i10 = 3;
                }
            }
        }
        int i11 = i10 - 1;
        if (i11 == 0) {
            h1.g(q0Var);
            q0Var.J.d("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", tf.q0.d1(h1Var.l().b1()), tf.q0.d1(th2.toString()));
            i2Var.K = 1;
            i2Var.t1().add(n3Var);
            return;
        }
        if (i11 != 1) {
            h1.g(q0Var);
            q0Var.G.d("registerTriggerAsync failed. Dropping URI. App ID, Throwable", tf.q0.d1(h1Var.l().b1()), th2);
            v();
            i2Var.K = 1;
            i2Var.u1();
            return;
        }
        i2Var.t1().add(n3Var);
        if (i2Var.K > ((Integer) tf.b0.f14599w0.a(null)).intValue()) {
            i2Var.K = 1;
            h1.g(q0Var);
            q0Var.J.d("registerTriggerAsync failed. May try later. App ID, throwable", tf.q0.d1(h1Var.l().b1()), tf.q0.d1(th2.toString()));
            return;
        }
        h1.g(q0Var);
        q0Var.J.e("registerTriggerAsync failed. App ID, delay in seconds, throwable", tf.q0.d1(h1Var.l().b1()), tf.q0.d1(String.valueOf(i2Var.K)), tf.q0.d1(th2.toString()));
        int i12 = i2Var.K;
        if (i2Var.L == null) {
            i2Var.L = new y1(i2Var, h1Var, 1);
        }
        i2Var.L.b(((long) i12) * 1000);
        int i13 = i2Var.K;
        i2Var.K = i13 + i13;
    }

    public java.lang.Object j(m00.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: q3.e0.j(m00.c):java.lang.Object");
    }

    public void k() {
        i1 i1Var = (i1) this.C;
        z1.f fVarF = z1.q.f();
        u00.k kVarE = fVarF != null ? fVarF.e() : null;
        z1.f fVarK = z1.q.k(fVarF);
        try {
            c1.d dVar = (c1.d) i1Var.getValue();
            z1.q.n(fVarF, fVarK, kVarE);
            if (dVar != null) {
                c1.e eVar = (c1.e) this.B;
                z1.p pVar = eVar.f2608b;
                z1.p pVar2 = eVar.f2609c;
                pVar2.clear();
                while (pVar2.size() + pVar.size() > eVar.f2607a - 1) {
                    if (pVar.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    pVar.remove(0);
                }
                pVar.add(dVar);
            }
            i1Var.setValue(null);
        } catch (Throwable th2) {
            z1.q.n(fVarF, fVarK, kVarE);
            throw th2;
        }
    }

    public vj.d l(sj.e eVar) throws FirebaseRemoteConfigClientException {
        String string;
        JSONArray jSONArray = eVar.f14260g;
        long j9 = eVar.f14259f;
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2));
                }
                String strOptString = jSONArray2.optString(0, RuntimeVersion.SUFFIX);
                sj.e eVarC = ((sj.c) this.B).c();
                String string3 = null;
                if (eVarC == null) {
                    string = null;
                } else {
                    try {
                        string = eVarC.f14255b.getString(strOptString);
                    } catch (JSONException unused) {
                        string = null;
                    }
                }
                if (string == null) {
                    sj.e eVarC2 = ((sj.c) this.C).c();
                    if (eVarC2 != null) {
                        try {
                            string3 = eVarC2.f14255b.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : RuntimeVersion.SUFFIX;
                }
                int i11 = vj.e.f15732a;
                vj.b bVar = new vj.b();
                if (string2 == null) {
                    throw new NullPointerException("Null rolloutId");
                }
                bVar.f15720a = string2;
                String string4 = jSONObject.getString("variantId");
                if (string4 == null) {
                    throw new NullPointerException("Null variantId");
                }
                bVar.f15721b = string4;
                if (strOptString == null) {
                    throw new NullPointerException("Null parameterKey");
                }
                bVar.f15722c = strOptString;
                bVar.f15723d = string;
                bVar.f15724e = j9;
                bVar.f15725f = (byte) (bVar.f15725f | 1);
                hashSet.add(bVar.a());
            } catch (JSONException e3) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", e3);
            }
        }
        return new vj.d(hashSet);
    }

    public j0 m() {
        q0 q0Var = (q0) this.B;
        l0 l0Var = (l0) q0Var.J.g(this.C);
        if (l0Var != null) {
            return (j0) q0Var.F.g(l0Var);
        }
        return null;
    }

    public Object n(JSONObject jSONObject, fd.d dVar, u00.k kVar, m00.c cVar) {
        yc.i iVar;
        long j9;
        if (cVar instanceof yc.i) {
            iVar = (yc.i) cVar;
            int i10 = iVar.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.E = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new yc.i(this, cVar);
            }
        } else {
            iVar = new yc.i(this, cVar);
        }
        Object obj = iVar.C;
        Object obj2 = l00.a.A;
        int i11 = iVar.E;
        try {
            if (i11 == 0) {
                ri.t1.O(obj);
                long jI = i(jSONObject);
                gd.a aVarV = bi.b.V(jSONObject);
                iVar.A = (kotlin.jvm.internal.j) kVar;
                iVar.B = jI;
                iVar.E = 1;
                if (dVar.g(aVarV, iVar) == obj2) {
                    return obj2;
                }
                j9 = jI;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j9 = iVar.B;
                kVar = (u00.k) iVar.A;
                ri.t1.O(obj);
            }
            kVar.invoke(new Long(j9));
        } catch (Exception e3) {
            dd.b.f4866c.a("event migration failed: " + e3.getMessage());
        }
        return g00.b0.a;
    }

    public Object o(m00.c cVar) {
        yc.j jVar;
        AbstractList abstractListA;
        e0 e0Var;
        Iterator it;
        if (cVar instanceof yc.j) {
            jVar = (yc.j) cVar;
            int i10 = jVar.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.E = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new yc.j(this, cVar);
            }
        } else {
            jVar = new yc.j(this, cVar);
        }
        Object obj = jVar.C;
        l00.a aVar = l00.a.A;
        int i11 = jVar.E;
        try {
            if (i11 == 0) {
                ri.t1.O(obj);
                yc.e eVar = (yc.e) this.C;
                synchronized (eVar) {
                    abstractListA = eVar.A("events");
                }
                e0Var = this;
                it = abstractListA.iterator();
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = jVar.B;
                e0 e0Var2 = jVar.A;
                ri.t1.O(obj);
                e0Var = e0Var2;
            }
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                fd.d dVarG = ((rc.c) e0Var.B).g();
                e1 e1Var = new e1(1, (yc.e) e0Var.C, yc.e.class, "removeEvent", "removeEvent(J)V", 0, 27);
                jVar.A = e0Var;
                jVar.B = it;
                jVar.E = 1;
                if (e0Var.n(jSONObject, dVarG, e1Var, jVar) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception e3) {
            dd.b.f4866c.a("events migration failed: " + e3.getMessage());
        }
        return g00.b0.a;
    }

    public void onError(PurchasesError purchasesError) {
        kotlin.jvm.internal.m.e(purchasesError, "error");
        ((a40.k) this.B).resumeWith(new g00.n(ri.t1.s(new BillingException(purchasesError))));
    }

    public void onReceived(List list) {
        Object next;
        a40.k kVar = (a40.k) this.B;
        kotlin.jvm.internal.m.e(list, "storeProducts");
        String str = (String) this.C;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!vp.x.r(((StoreProduct) next).getId(), str));
        StoreProduct storeProduct = (StoreProduct) next;
        if (storeProduct == null) {
            storeProduct = (StoreProduct) h00.q.N0(list);
        }
        if (storeProduct != null) {
            kVar.resumeWith(new g00.n(storeProduct));
        } else {
            kVar.resumeWith(new g00.n(ri.t1.s(new IllegalStateException(a1.b.o("Subscription product not found: ", str)))));
        }
    }

    @Override
    public void onSuccess(Object obj) {
        i2 i2Var = (i2) this.C;
        i2Var.V0();
        v();
        i2Var.J = false;
        i2Var.K = 1;
        tf.q0 q0Var = ((h1) i2Var.B).F;
        h1.g(q0Var);
        q0Var.N.c(((n3) this.B).A, "Successfully registered trigger URI");
        i2Var.u1();
    }

    public Object p(m00.c cVar) {
        yc.k kVar;
        AbstractList abstractListA;
        e0 e0Var;
        Iterator it;
        if (cVar instanceof yc.k) {
            kVar = (yc.k) cVar;
            int i10 = kVar.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.E = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new yc.k(this, cVar);
            }
        } else {
            kVar = new yc.k(this, cVar);
        }
        Object obj = kVar.C;
        l00.a aVar = l00.a.A;
        int i11 = kVar.E;
        try {
            if (i11 == 0) {
                ri.t1.O(obj);
                yc.e eVar = (yc.e) this.C;
                synchronized (eVar) {
                    abstractListA = eVar.A("identifys");
                }
                e0Var = this;
                it = abstractListA.iterator();
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = kVar.B;
                e0 e0Var2 = kVar.A;
                ri.t1.O(obj);
                e0Var = e0Var2;
            }
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                fd.d dVarG = ((rc.c) e0Var.B).g();
                e1 e1Var = new e1(1, (yc.e) e0Var.C, yc.e.class, "removeIdentify", "removeIdentify(J)V", 0, 28);
                kVar.A = e0Var;
                kVar.B = it;
                kVar.E = 1;
                if (e0Var.n(jSONObject, dVarG, e1Var, kVar) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception e3) {
            dd.b.f4866c.a("identifies migration failed: " + e3.getMessage());
        }
        return g00.b0.a;
    }

    public Object q(m00.c cVar) {
        yc.l lVar;
        h00.x xVarA;
        e0 e0Var;
        Iterator it;
        if (cVar instanceof yc.l) {
            lVar = (yc.l) cVar;
            int i10 = lVar.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.E = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new yc.l(this, cVar);
            }
        } else {
            lVar = new yc.l(this, cVar);
        }
        Object obj = lVar.C;
        l00.a aVar = l00.a.A;
        int i11 = lVar.E;
        try {
            if (i11 == 0) {
                ri.t1.O(obj);
                yc.e eVar = (yc.e) this.C;
                synchronized (eVar) {
                    xVarA = eVar.D < 4 ? h00.x.A : eVar.A("identify_interceptor");
                }
                e0Var = this;
                it = xVarA.iterator();
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = lVar.B;
                e0 e0Var2 = lVar.A;
                ri.t1.O(obj);
                e0Var = e0Var2;
            }
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                fd.d dVarD = ((rc.c) e0Var.B).d();
                e1 e1Var = new e1(1, (yc.e) e0Var.C, yc.e.class, "removeInterceptedIdentify", "removeInterceptedIdentify(J)V", 0, 29);
                lVar.A = e0Var;
                lVar.B = it;
                lVar.E = 1;
                if (e0Var.n(jSONObject, dVarD, e1Var, lVar) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception e3) {
            dd.b.f4866c.a("intercepted identifies migration failed: " + e3.getMessage());
        }
        return g00.b0.a;
    }

    public java.lang.Object r(m00.c r18) {
        throw new UnsupportedOperationException("Method not decompiled: q3.e0.r(m00.c):java.lang.Object");
    }

    public void s(c1.d dVar) {
        c1.d dVar2;
        c1.d dVar3;
        i1 i1Var = (i1) this.C;
        String str = dVar.f2601c;
        z1.f fVarF = z1.q.f();
        u00.k kVarE = fVarF != null ? fVarF.e() : null;
        z1.f fVarK = z1.q.k(fVarF);
        try {
            c1.d dVar4 = (c1.d) i1Var.getValue();
            z1.q.n(fVarF, fVarK, kVarE);
            if (dVar4 == null) {
                i1Var.setValue(dVar);
                return;
            }
            boolean z10 = dVar4.f2605g;
            String str2 = dVar4.f2600b;
            String str3 = dVar4.f2601c;
            int i10 = dVar4.f2599a;
            c1.b bVar = dVar4.f2606h;
            if (z10) {
                boolean z11 = dVar.f2605g;
                String str4 = dVar.f2600b;
                int i11 = dVar.f2599a;
                if (z11) {
                    long j9 = dVar.f2604f;
                    long j10 = dVar4.f2604f;
                    if (j9 < j10 || j9 - j10 >= 5000 || kotlin.jvm.internal.m.a(str3, "\n") || kotlin.jvm.internal.m.a(str3, "\r\n") || kotlin.jvm.internal.m.a(str, "\n") || kotlin.jvm.internal.m.a(str, "\r\n") || bVar != dVar.f2606h) {
                        dVar2 = null;
                    } else {
                        if (bVar == c1.b.A && str3.length() + i10 == i11) {
                            dVar3 = new c1.d(dVar4.f2599a, RuntimeVersion.SUFFIX, w.c.j(str3, str), dVar4.f2602d, dVar.f2603e, dVar4.f2604f, false, 64);
                        } else if (bVar != c1.b.B || dVar4.a() != dVar.a() || (dVar4.a() != c1.a.A && dVar4.a() != c1.a.B)) {
                            dVar2 = null;
                        } else if (i10 == str4.length() + i11) {
                            dVar3 = new c1.d(dVar.f2599a, w.c.j(str4, str2), RuntimeVersion.SUFFIX, dVar4.f2602d, dVar.f2603e, dVar4.f2604f, false, 64);
                        } else {
                            int i12 = dVar4.f2599a;
                            if (i12 == i11) {
                                dVar2 = new c1.d(i12, w.c.j(str2, str4), RuntimeVersion.SUFFIX, dVar4.f2602d, dVar.f2603e, dVar4.f2604f, false, 64);
                            } else {
                                dVar2 = null;
                            }
                        }
                        dVar2 = dVar3;
                    }
                } else {
                    dVar2 = null;
                }
            } else {
                dVar2 = null;
            }
            if (dVar2 != null) {
                i1Var.setValue(dVar2);
            } else {
                k();
                i1Var.setValue(dVar);
            }
        } catch (Throwable th2) {
            z1.q.n(fVarF, fVarK, kVarE);
            throw th2;
        }
    }

    public void t(a10.d dVar, l40.a aVar) {
        kotlin.jvm.internal.m.e(dVar, "subclass");
        kotlin.jvm.internal.m.e(aVar, "serializer");
        ((ArrayList) this.C).add(new g00.k(dVar, aVar));
    }

    public String toString() {
        switch (this.A) {
            case 24:
                return "Bounds{lower=" + ((q4.b) this.B) + " upper=" + ((q4.b) this.C) + "}";
            default:
                return super.toString();
        }
    }

    public a8.l0 u(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.B;
            if (i11 >= iArr.length) {
                e7.a.d("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new a8.p();
            }
            if (i10 == iArr[i11]) {
                return ((z0[]) this.C)[i11];
            }
            i11++;
        }
    }

    public void v() {
        h1 h1Var = (h1) ((i2) this.C).B;
        w0 w0Var = h1Var.E;
        h1.e(w0Var);
        SparseArray sparseArrayB1 = w0Var.b1();
        n3 n3Var = (n3) this.B;
        sparseArrayB1.put(n3Var.C, Long.valueOf(n3Var.B));
        w0 w0Var2 = h1Var.E;
        h1.e(w0Var2);
        int[] iArr = new int[sparseArrayB1.size()];
        long[] jArr = new long[sparseArrayB1.size()];
        for (int i10 = 0; i10 < sparseArrayB1.size(); i10++) {
            iArr[i10] = sparseArrayB1.keyAt(i10);
            jArr[i10] = ((Long) sparseArrayB1.valueAt(i10)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        w0Var2.O.G(bundle);
    }

    public void w(m3 m3Var) {
        try {
            G(m3Var, (w3) this.B);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void x(m3 m3Var, int i10) {
        try {
            v3 v3Var = (v3) ((w3) this.B).l();
            v3Var.c();
            w3.E((w3) v3Var.B, i10);
            this.B = (w3) v3Var.a();
            w(m3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void y(m3 m3Var, int i10, long j9) {
        try {
            v3 v3Var = (v3) ((w3) this.B).l();
            v3Var.c();
            w3.E((w3) v3Var.B, i10);
            w3 w3Var = (w3) v3Var.a();
            this.B = w3Var;
            if (j9 != 0) {
                v3 v3Var2 = (v3) w3Var.l();
                v3Var2.g(j9);
                w3Var = (w3) v3Var2.a();
            }
            G(m3Var, w3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void z(m3 m3Var, long j9, boolean z10) {
        w3 w3Var;
        try {
            l3 l3Var = (l3) m3Var.l();
            a4 a4Var = (a4) m3Var.w().l();
            a4Var.c();
            c4.s((c4) a4Var.B, z10);
            l3Var.c();
            m3.r((m3) l3Var.B, (c4) a4Var.a());
            m3 m3Var2 = (m3) l3Var.a();
            if (j9 == 0) {
                w3Var = (w3) this.B;
            } else {
                v3 v3Var = (v3) ((w3) this.B).l();
                v3Var.g(j9);
                w3Var = (w3) v3Var.a();
            }
            G(m3Var2, w3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingLogger", "Unable to log.", th2);
        }
    }
}

package ab;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.tooling.DiagnosticComposeException;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.glance.appwidget.protobuf.c1;
import androidx.glance.appwidget.protobuf.z0;
import androidx.lifecycle.a1;
import androidx.lifecycle.u0;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.protobuf.RuntimeVersion;
import e30.p0;
import e30.x0;
import g1.o3;
import g1.v5;
import g1.z6;
import h0.t1;
import h0.v1;
import h0.w1;
import h0.x1;
import h0.z1;
import i2.o0;
import j10.r0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import kotlin.KotlinNullPointerException;
import kotlin.NoWhenBranchMatchedException;
import l1.m1;
import l1.r1;
import m3.n0;
import m3.q0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q0.f2;
import qd.s0;
import z2.w0;

public abstract class a0 {
    public static long A(long j9, long j10, long j11) {
        if (j10 <= j11) {
            if (j9 < j10) {
                return j10;
            }
            return j9 > j11 ? j11 : j9;
        }
        StringBuilder sbN = w.c.n("Cannot coerce value to an empty range: maximum ", j11, " is less than minimum ");
        sbN.append(j10);
        sbN.append('.');
        throw new IllegalArgumentException(sbN.toString());
    }

    public static final void A0(a1 a1Var, Object obj) {
        kotlin.jvm.internal.m.e(a1Var, "<this>");
        kotlin.jvm.internal.m.e(obj, "effect");
        ta.c0.M(u0.i(a1Var), null, null, null, new rm.c(a1Var, obj, (k00.c) null, 0), 31);
    }

    public static long B(long j9, z00.g gVar) {
        long j10 = gVar.B;
        long j11 = gVar.A;
        if (!gVar.isEmpty()) {
            if (j9 < Long.valueOf(j11).longValue()) {
                return Long.valueOf(j11).longValue();
            }
            return j9 > Long.valueOf(j10).longValue() ? Long.valueOf(j10).longValue() : j9;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + gVar + '.');
    }

    public static void B0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z10 = onLongClickListener != null;
        boolean z11 = zHasOnClickListeners || z10;
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z10);
        checkableImageButton.setImportantForAccessibility(z11 ? 1 : 2);
    }

    public static Comparable C(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        if (comparable2.compareTo(comparable3) <= 0) {
            if (comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            return comparable.compareTo(comparable3) > 0 ? comparable3 : comparable;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + comparable3 + " is less than minimum " + comparable2 + '.');
    }

    public static boolean C0(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static Comparable D(Comparable comparable, z00.a aVar) {
        kotlin.jvm.internal.m.e(aVar, "range");
        float f3 = aVar.B;
        float f10 = aVar.A;
        if (aVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + aVar + '.');
        }
        if (!z00.a.b(comparable, Float.valueOf(f10)) || z00.a.b(Float.valueOf(f10), comparable)) {
            return (!z00.a.b(Float.valueOf(f3), comparable) || z00.a.b(comparable, Float.valueOf(f3))) ? comparable : Float.valueOf(f3);
        }
        return Float.valueOf(f10);
    }

    public static final float D0(float f3) {
        float f10 = 48;
        return ((y3.f) C(new y3.f(f10 - (dn.m.a - f3)), new y3.f(32), new y3.f(f10))).A;
    }

    public static Comparable E(Float f3, z00.b bVar) {
        kotlin.jvm.internal.m.e(bVar, "range");
        if (bVar instanceof z00.a) {
            return D(f3, (z00.a) bVar);
        }
        if (!bVar.isEmpty()) {
            if (f3.compareTo(bVar.a()) < 0) {
                return bVar.a();
            }
            return f3.compareTo(bVar.c()) > 0 ? bVar.c() : f3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + bVar + '.');
    }

    public static z00.c E0(int i10, z00.e eVar) {
        kotlin.jvm.internal.m.e(eVar, "<this>");
        boolean z10 = i10 > 0;
        Integer numValueOf = Integer.valueOf(i10);
        if (!z10) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i11 = ((z00.c) eVar).A;
        int i12 = ((z00.c) eVar).B;
        if (((z00.c) eVar).C <= 0) {
            i10 = -i10;
        }
        return new z00.c(i11, i12, i10);
    }

    public static final boolean F(e30.w wVar, e30.m0 m0Var, Set set) {
        boolean zF;
        if (kotlin.jvm.internal.m.a(wVar.m0(), m0Var)) {
            return true;
        }
        j10.i iVarG = wVar.m0().g();
        j10.i iVar = iVarG instanceof j10.i ? iVarG : null;
        List listP = iVar != null ? iVar.p() : null;
        Collection collectionS1 = h00.q.s1(wVar.e0());
        if (!(collectionS1 instanceof Collection) || !collectionS1.isEmpty()) {
            h00.b0 it = collectionS1.iterator();
            do {
                h00.b0 b0Var = it;
                if (b0Var.B.hasNext()) {
                    h00.a0 a0Var = (h00.a0) b0Var.next();
                    int i10 = a0Var.a;
                    p0 p0Var = (p0) a0Var.b;
                    r0 r0Var = listP != null ? (r0) h00.q.O0(i10, listP) : null;
                    if ((r0Var == null || set == null || !set.contains(r0Var)) && !p0Var.c()) {
                        e30.w wVarB = p0Var.b();
                        kotlin.jvm.internal.m.d(wVarB, "getType(...)");
                        zF = F(wVarB, m0Var, set);
                    } else {
                        zF = false;
                    }
                }
            } while (!zF);
            return true;
        }
        return false;
    }

    public static JSONArray F0(JSONArray jSONArray) throws JSONException {
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            if (obj.getClass().equals(String.class)) {
                String strSubstring = (String) obj;
                if (strSubstring.length() > 1024) {
                    strSubstring = strSubstring.substring(0, 1024);
                    kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                }
                jSONArray.put(i10, strSubstring);
            } else if (obj.getClass().equals(JSONObject.class)) {
                jSONArray.put(i10, G0((JSONObject) obj));
            } else if (obj.getClass().equals(JSONArray.class)) {
                JSONArray jSONArray2 = (JSONArray) obj;
                F0(jSONArray2);
                jSONArray.put(i10, jSONArray2);
            }
        }
        return jSONArray;
    }

    public static ImageView.ScaleType G(int i10) {
        if (i10 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i10 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i10 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i10 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i10 != 5) {
            return i10 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    public static JSONObject G0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (jSONObject.length() > 1024) {
            throw new IllegalArgumentException("Too many properties (more than 1024) in JSON");
        }
        Iterator<String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.m.d(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            kotlin.jvm.internal.m.c(next, "null cannot be cast to non-null type kotlin.String");
            String str = next;
            try {
                Object obj = jSONObject.get(str);
                if (obj.getClass().equals(String.class)) {
                    String strSubstring = (String) obj;
                    if (strSubstring.length() > 1024) {
                        strSubstring = strSubstring.substring(0, 1024);
                        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                    }
                    jSONObject.put(str, strSubstring);
                } else if (obj.getClass().equals(JSONObject.class)) {
                    jSONObject.put(str, G0((JSONObject) obj));
                } else if (obj.getClass().equals(JSONArray.class)) {
                    JSONArray jSONArray = (JSONArray) obj;
                    F0(jSONArray);
                    jSONObject.put(str, jSONArray);
                }
            } catch (JSONException unused) {
                throw new IllegalArgumentException("JSON parsing error. Too long (> 1024 chars) or invalid JSON");
            }
        }
        return jSONObject;
    }

    public static final p0 H(p0 p0Var, r0 r0Var) {
        if (r0Var == null || p0Var.a() == e30.a1.C) {
            return p0Var;
        }
        if (r0Var.F() != p0Var.a()) {
            r20.c cVar = new r20.c(p0Var);
            e30.h0.B.getClass();
            return new e30.f0(new r20.a(p0Var, cVar, false, e30.h0.C));
        }
        if (!p0Var.c()) {
            return new e30.f0(p0Var.b());
        }
        d30.b bVar = d30.l.e;
        kotlin.jvm.internal.m.d(bVar, "NO_LOCKS");
        return new e30.f0(new e30.y(bVar, new eo.p(p0Var, 17)));
    }

    public static final boolean H0(Throwable th2, u00.a aVar) {
        List listK0;
        Object objInvoke;
        kotlin.jvm.internal.m.e(th2, "<this>");
        Integer num = p00.a.a;
        DiagnosticComposeException diagnosticComposeException = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th2.getSuppressed();
            kotlin.jvm.internal.m.d(suppressed, "getSuppressed(...)");
            listK0 = h00.n.k0(suppressed);
        } else {
            Method method = o00.a.b;
            listK0 = (method == null || (objInvoke = method.invoke(th2, null)) == null) ? h00.x.A : h00.n.k0((Throwable[]) objInvoke);
        }
        int size = listK0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            if (((Throwable) listK0.get(i10)) instanceof DiagnosticComposeException) {
                return false;
            }
        }
        try {
            a2.a aVar2 = (a2.a) aVar.invoke();
            if (aVar2 != null) {
                List list = aVar2.f155a;
                if (aVar2.f156b) {
                    int size2 = list.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (((a2.c) list.get(i11)).f158b != null) {
                            z10 = true;
                            break;
                        }
                    }
                } else if (!list.isEmpty()) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                kotlin.jvm.internal.m.b(aVar2);
                diagnosticComposeException = new DiagnosticComposeException(aVar2);
            }
        } catch (Throwable th3) {
            diagnosticComposeException = th3;
        }
        if (diagnosticComposeException != null) {
            s0.V(th2, diagnosticComposeException);
        }
        return z10;
    }

    public static final e30.f0 I(e30.w wVar, e30.a1 a1Var, r0 r0Var) {
        kotlin.jvm.internal.m.e(wVar, "type");
        if ((r0Var != null ? r0Var.F() : null) == a1Var) {
            a1Var = e30.a1.C;
        }
        return new e30.f0(wVar, a1Var);
    }

    public static z00.e I0(int i10, int i11) {
        if (i11 > Integer.MIN_VALUE) {
            return new z00.e(i10, i11 - 1, 1);
        }
        z00.e eVar = z00.e.D;
        return z00.e.D;
    }

    public static e30.s0 J0(e30.s0 s0Var) {
        if (!(s0Var instanceof e30.t)) {
            return new e30.r0(s0Var, 1);
        }
        e30.t tVar = (e30.t) s0Var;
        r0[] r0VarArr = tVar.b;
        ArrayList<g00.k> arrayListY0 = h00.n.Y0(tVar.c, r0VarArr);
        ArrayList arrayList = new ArrayList(h00.r.q0(arrayListY0, 10));
        for (g00.k kVar : arrayListY0) {
            arrayList.add(H((p0) kVar.A, (r0) kVar.B));
        }
        return new e30.t(r0VarArr, (p0[]) arrayList.toArray(new p0[0]), true);
    }

    public static final y K(Context context, za.b bVar) {
        ca.r rVarX;
        kotlin.jvm.internal.m.e(context, "context");
        jb.b bVar2 = new jb.b(bVar.f17339c);
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.m.d(applicationContext, "getApplicationContext(...)");
        ca.z zVar = bVar2.f8258a;
        kotlin.jvm.internal.m.d(zVar, "getSerialTaskExecutor(...)");
        za.i iVar = bVar.f17340d;
        boolean z10 = context.getResources().getBoolean(2131034120);
        kotlin.jvm.internal.m.e(iVar, "clock");
        int i10 = 0;
        if (z10) {
            rVarX = new ca.r(applicationContext, WorkDatabase.class, null);
            rVarX.f3081i = true;
        } else {
            rVarX = bi.b.x(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            rVarX.f3080h = new r(applicationContext, i10);
        }
        rVarX.f3078f = zVar;
        rVarX.f3076d.add(new a(iVar));
        rVarX.a(c.f355h);
        rVarX.a(new h(applicationContext, 2, 3));
        rVarX.a(c.f356i);
        rVarX.a(c.f357j);
        rVarX.a(new h(applicationContext, 5, 6));
        rVarX.a(c.f358k);
        rVarX.a(c.l);
        rVarX.a(c.m);
        rVarX.a(new h(applicationContext));
        rVarX.a(new h(applicationContext, 10, 11));
        rVarX.a(c.f351d);
        rVarX.a(c.f352e);
        rVarX.a(c.f353f);
        rVarX.a(c.f354g);
        rVarX.a(new h(applicationContext, 21, 22));
        rVarX.f3086p = false;
        rVarX.f3087q = true;
        rVarX.f3088r = true;
        WorkDatabase workDatabase = (WorkDatabase) rVarX.b();
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.m.d(applicationContext2, "getApplicationContext(...)");
        fb.g gVar = new fb.g(applicationContext2, bVar2);
        g gVar2 = new g(context.getApplicationContext(), bVar, bVar2, workDatabase);
        return new y(context.getApplicationContext(), bVar, bVar2, workDatabase, (List) z.A.o(context, bVar, bVar2, workDatabase, gVar, gVar2), gVar2, gVar);
    }

    public static int L(byte[] bArr, int i10, androidx.glance.appwidget.protobuf.d dVar) throws InvalidProtocolBufferException {
        int iR = R(bArr, i10, dVar);
        int i11 = dVar.f881a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i11 > bArr.length - iR) {
            throw InvalidProtocolBufferException.g();
        }
        if (i11 == 0) {
            dVar.f883c = androidx.glance.appwidget.protobuf.i.B;
            return iR;
        }
        dVar.f883c = androidx.glance.appwidget.protobuf.i.c(iR, i11, bArr);
        return iR + i11;
    }

    public static int M(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static long N(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public static int O(z0 z0Var, int i10, byte[] bArr, int i11, int i12, androidx.glance.appwidget.protobuf.d0 d0Var, androidx.glance.appwidget.protobuf.d dVar) throws InvalidProtocolBufferException {
        androidx.glance.appwidget.protobuf.z zVarNewInstance = z0Var.newInstance();
        z0 z0Var2 = z0Var;
        byte[] bArr2 = bArr;
        int i13 = i12;
        androidx.glance.appwidget.protobuf.d dVar2 = dVar;
        int iP0 = p0(zVarNewInstance, z0Var2, bArr2, i11, i13, dVar2);
        z0Var2.makeImmutable(zVarNewInstance);
        dVar2.f883c = zVarNewInstance;
        d0Var.add(zVarNewInstance);
        while (iP0 < i13) {
            androidx.glance.appwidget.protobuf.d dVar3 = dVar2;
            int i14 = i13;
            int iR = R(bArr2, iP0, dVar3);
            if (i10 != dVar3.f881a) {
                break;
            }
            byte[] bArr3 = bArr2;
            z0 z0Var3 = z0Var2;
            androidx.glance.appwidget.protobuf.z zVarNewInstance2 = z0Var3.newInstance();
            iP0 = p0(zVarNewInstance2, z0Var3, bArr3, iR, i14, dVar3);
            z0Var2 = z0Var3;
            bArr2 = bArr3;
            i13 = i14;
            dVar2 = dVar3;
            z0Var2.makeImmutable(zVarNewInstance2);
            dVar2.f883c = zVarNewInstance2;
            d0Var.add(zVarNewInstance2);
        }
        return iP0;
    }

    public static int P(int i10, byte[] bArr, int i11, int i12, c1 c1Var, androidx.glance.appwidget.protobuf.d dVar) throws InvalidProtocolBufferException {
        if ((i10 >>> 3) == 0) {
            throw InvalidProtocolBufferException.a();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iT = T(bArr, i11, dVar);
            c1Var.d(i10, Long.valueOf(dVar.f882b));
            return iT;
        }
        if (i13 == 1) {
            c1Var.d(i10, Long.valueOf(N(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iR = R(bArr, i11, dVar);
            int i14 = dVar.f881a;
            if (i14 < 0) {
                throw InvalidProtocolBufferException.e();
            }
            if (i14 > bArr.length - iR) {
                throw InvalidProtocolBufferException.g();
            }
            if (i14 == 0) {
                c1Var.d(i10, androidx.glance.appwidget.protobuf.i.B);
            } else {
                c1Var.d(i10, androidx.glance.appwidget.protobuf.i.c(iR, i14, bArr));
            }
            return iR + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw InvalidProtocolBufferException.a();
            }
            c1Var.d(i10, Integer.valueOf(M(bArr, i11)));
            return i11 + 4;
        }
        c1 c1VarC = c1.c();
        int i15 = (i10 & (-8)) | 4;
        int i16 = dVar.f884d + 1;
        dVar.f884d = i16;
        if (i16 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i17 = 0;
        while (i11 < i12) {
            int iR2 = R(bArr, i11, dVar);
            i17 = dVar.f881a;
            if (i17 == i15) {
                i11 = iR2;
                break;
            }
            i11 = P(i17, bArr, iR2, i12, c1VarC, dVar);
        }
        dVar.f884d--;
        if (i11 > i12 || i17 != i15) {
            throw InvalidProtocolBufferException.f();
        }
        c1Var.d(i10, c1VarC);
        return i11;
    }

    public static int Q(int i10, byte[] bArr, int i11, androidx.glance.appwidget.protobuf.d dVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b7 = bArr[i11];
        if (b7 >= 0) {
            dVar.f881a = i12 | (b7 << 7);
            return i13;
        }
        int i14 = i12 | ((b7 & 127) << 7);
        int i15 = i11 + 2;
        byte b10 = bArr[i13];
        if (b10 >= 0) {
            dVar.f881a = i14 | (b10 << 14);
            return i15;
        }
        int i16 = i14 | ((b10 & 127) << 14);
        int i17 = i11 + 3;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            dVar.f881a = i16 | (b11 << 21);
            return i17;
        }
        int i18 = i16 | ((b11 & 127) << 21);
        int i19 = i11 + 4;
        byte b12 = bArr[i17];
        if (b12 >= 0) {
            dVar.f881a = i18 | (b12 << 28);
            return i19;
        }
        int i20 = i18 | ((b12 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                dVar.f881a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int R(byte[] bArr, int i10, androidx.glance.appwidget.protobuf.d dVar) {
        int i11 = i10 + 1;
        byte b7 = bArr[i10];
        if (b7 < 0) {
            return Q(b7, bArr, i11, dVar);
        }
        dVar.f881a = b7;
        return i11;
    }

    public static int S(int i10, byte[] bArr, int i11, int i12, androidx.glance.appwidget.protobuf.d0 d0Var, androidx.glance.appwidget.protobuf.d dVar) {
        androidx.glance.appwidget.protobuf.a0 a0Var = (androidx.glance.appwidget.protobuf.a0) d0Var;
        int iR = R(bArr, i11, dVar);
        a0Var.addInt(dVar.f881a);
        while (iR < i12) {
            int iR2 = R(bArr, iR, dVar);
            if (i10 != dVar.f881a) {
                break;
            }
            iR = R(bArr, iR2, dVar);
            a0Var.addInt(dVar.f881a);
        }
        return iR;
    }

    public static int T(byte[] bArr, int i10, androidx.glance.appwidget.protobuf.d dVar) {
        int i11 = i10 + 1;
        long j9 = bArr[i10];
        if (j9 >= 0) {
            dVar.f882b = j9;
            return i11;
        }
        int i12 = i10 + 2;
        byte b7 = bArr[i11];
        long j10 = (j9 & 127) | (((long) (b7 & 127)) << 7);
        int i13 = 7;
        while (b7 < 0) {
            int i14 = i12 + 1;
            byte b10 = bArr[i12];
            i13 += 7;
            j10 |= ((long) (b10 & 127)) << i13;
            b7 = b10;
            i12 = i14;
        }
        dVar.f882b = j10;
        return i12;
    }

    public static final p9.e U(p9.e eVar, List list, Set set, Set set2, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.c0(-1239021605);
        l1.z0 z0VarG = l1.q.G(list, g0Var);
        Object obj = eVar.f12468b;
        g0Var.Z(-993800456, obj);
        p9.e eVar2 = new p9.e(eVar, v1.d.d(-1349345695, new gz.z0(set2, obj, set, z0VarG, list, eVar), g0Var));
        g0Var.r(false);
        g0Var.r(false);
        return eVar2;
    }

    public static final void V(k50.z zVar, k50.o oVar) throws IOException {
        try {
            IOException iOException = null;
            for (k50.z zVar2 : oVar.h(zVar)) {
                try {
                    if (oVar.i(zVar2).f3066c) {
                        V(zVar2, oVar);
                    }
                    oVar.e(zVar2);
                } catch (IOException e3) {
                    if (iOException == null) {
                        iOException = e3;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static boolean W() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            bi.g.c();
            bi.g gVarC = bi.g.c();
            gVarC.a();
            Context context = gVarC.f2531a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), Cast.MAX_NAMESPACE_LENGTH)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static final e1.u X(e1.u uVar, f4 f4Var) {
        androidx.media3.common.k kVar = (androidx.media3.common.k) f4Var.D;
        if (uVar != null) {
            e1.t tVar = uVar.f5004a;
            long j9 = tVar.f4999c;
            e1.t tVar2 = uVar.f5005b;
            if (j9 != tVar2.f4999c) {
                boolean z10 = uVar.f5006c;
                if ((z10 ? tVar : tVar2).f4998b != 0) {
                    return uVar;
                }
                if (z10) {
                    tVar = tVar2;
                }
                if (((n0) kVar.f1301e).f10496a.f10483a.B.length() != tVar.f4998b) {
                    return uVar;
                }
            } else if (tVar.f4998b != tVar2.f4998b) {
                return uVar;
            }
        }
        String str = ((n0) kVar.f1301e).f10496a.f10483a.B;
        e1.u uVar2 = (e1.u) f4Var.C;
        boolean z11 = f4Var.B;
        if (uVar2 == null || str.length() == 0) {
            return uVar;
        }
        String str2 = ((n0) kVar.f1301e).f10496a.f10483a.B;
        int i10 = kVar.f1298b;
        int length = str2.length();
        if (i10 == 0) {
            int iT = q0.q.t(0, str2);
            return z11 ? e1.u.a(uVar, t(uVar.f5004a, kVar, iT), null, true, 2) : e1.u.a(uVar, null, t(uVar.f5005b, kVar, iT), false, 1);
        }
        if (i10 == length) {
            int iW = q0.q.w(length, str2);
            return z11 ? e1.u.a(uVar, t(uVar.f5004a, kVar, iW), null, false, 2) : e1.u.a(uVar, null, t(uVar.f5005b, kVar, iW), true, 1);
        }
        boolean z12 = uVar2.f5006c;
        int iW2 = z11 ^ z12 ? q0.q.w(i10, str2) : q0.q.t(i10, str2);
        return z11 ? e1.u.a(uVar, t(uVar.f5004a, kVar, iW2), null, z12, 2) : e1.u.a(uVar, null, t(uVar.f5005b, kVar, iW2), z12, 1);
    }

    public static final void Y(e30.w wVar, e30.a0 a0Var, LinkedHashSet linkedHashSet, Set set) {
        r0 r0VarG = wVar.m0().g();
        if (r0VarG instanceof r0) {
            if (!kotlin.jvm.internal.m.a(wVar.m0(), a0Var.m0())) {
                linkedHashSet.add(r0VarG);
                return;
            }
            for (e30.w wVar2 : r0VarG.getUpperBounds()) {
                kotlin.jvm.internal.m.b(wVar2);
                Y(wVar2, a0Var, linkedHashSet, set);
            }
            return;
        }
        j10.i iVarG = wVar.m0().g();
        j10.i iVar = iVarG instanceof j10.i ? iVarG : null;
        List listP = iVar != null ? iVar.p() : null;
        int i10 = 0;
        for (p0 p0Var : wVar.e0()) {
            int i11 = i10 + 1;
            r0 r0Var = listP != null ? (r0) h00.q.O0(i10, listP) : null;
            if ((r0Var == null || set == null || !set.contains(r0Var)) && !p0Var.c() && !h00.q.F0(linkedHashSet, p0Var.b().m0().g()) && !kotlin.jvm.internal.m.a(p0Var.b().m0(), a0Var.m0())) {
                e30.w wVarB = p0Var.b();
                kotlin.jvm.internal.m.d(wVarB, "getType(...)");
                Y(wVarB, a0Var, linkedHashSet, set);
            }
            i10 = i11;
        }
    }

    public static final float Z(float f3, float f10, float f11, int i10) {
        float f12 = i10;
        return ((y3.f) p30.f.j0(new y3.f(((f3 - 20) - (f11 * f12)) / f12), new y3.f(f10))).A;
    }

    public static final void a(lo.i iVar, long j9, b2.r rVar, float f3, int i10, int i11, float f10, l1.j jVar, int i12, int i13) throws NoWhenBranchMatchedException {
        int i14;
        b2.r rVar2;
        int i15;
        float f11;
        int i16;
        int i17;
        int i18;
        int i19;
        float f12;
        int i20;
        int i21;
        boolean z10;
        b2.r rVar3;
        float f13;
        int i22;
        int i23;
        float f14;
        r1 r1VarT;
        int i24;
        b2.o oVar;
        int i25;
        float f15;
        long jB;
        b3.g gVar;
        float f16;
        float f17;
        String strU;
        boolean zG;
        Object objN;
        boolean z11;
        Object objN2;
        int i26;
        lo.i iVar2 = iVar;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(21272800);
        if ((i12 & 6) == 0) {
            i14 = (g0Var.g(iVar2) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= g0Var.f(j9) ? 32 : 16;
        }
        int i27 = i13 & 4;
        if (i27 == 0) {
            if ((i12 & 384) == 0) {
                rVar2 = rVar;
                i14 |= g0Var.g(rVar2) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
            }
            i15 = i13 & 8;
            if (i15 != 0) {
                if ((i12 & 3072) == 0) {
                    f11 = f3;
                    if (g0Var.d(f11)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i14 |= i16;
                }
                if ((i12 & 24576) == 0) {
                    if ((i13 & 16) == 0) {
                        i17 = i10;
                        int i28 = g0Var.e(i17) ? 16384 : 8192;
                        i14 |= i28;
                    } else {
                        i17 = i10;
                    }
                    i14 |= i28;
                } else {
                    i17 = i10;
                }
                if ((196608 & i12) == 0) {
                    if ((i13 & 32) == 0) {
                        i18 = i11;
                        if (g0Var.e(i18)) {
                            i26 = 131072;
                        }
                        i14 |= i26;
                    } else {
                        i18 = i11;
                    }
                    i26 = Cast.MAX_MESSAGE_LENGTH;
                    i14 |= i26;
                } else {
                    i18 = i11;
                }
                i19 = i13 & 64;
                if (i19 != 0) {
                    if ((1572864 & i12) == 0) {
                        f12 = f10;
                        if (g0Var.d(f12)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i14 |= i20;
                    }
                    i21 = i14;
                    if ((599187 & i14) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (g0Var.S(i21 & 1, z10)) {
                        g0Var.X();
                        i24 = i12 & 1;
                        oVar = b2.o.A;
                        if (i24 != 0 || g0Var.A()) {
                            if (i27 != 0) {
                                rVar2 = oVar;
                            }
                            if (i15 != 0) {
                                f11 = 20;
                            }
                            if ((i13 & 16) != 0) {
                                i25 = 2131231123;
                                i21 &= -57345;
                            } else {
                                i25 = i17;
                            }
                            if ((i13 & 32) != 0) {
                                i23 = 2131231105;
                                i21 &= -458753;
                            } else {
                                i23 = i18;
                            }
                            if (i19 != 0) {
                                f15 = 3;
                            }
                            g0Var.s();
                            jB = i2.t.b(i2.t.d(j9) * 0.8f, j9);
                            b2.r rVarM = z1.m(rVar2, f11);
                            w0 w0VarD = h0.o.d(b2.b.E, false);
                            int iHashCode = Long.hashCode(g0Var.T);
                            m1 m1VarM = g0Var.m();
                            b2.r rVarC = b2.a.c(rVarM, g0Var);
                            b3.i.f2042c.getClass();
                            gVar = b3.h.f2035b;
                            g0Var.g0();
                            f16 = f15;
                            if (g0Var.S) {
                                g0Var.l(gVar);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(w0VarD, g0Var, b3.h.f2039f);
                            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
                            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
                            l1.q.E(g0Var, b3.h.f2041h);
                            l1.q.I(rVarC, g0Var, b3.h.f2037d);
                            iVar2 = iVar;
                            if (iVar2.equals(lo.h.a)) {
                                g0Var.c0(-2141256219);
                                o3.a(y3.R(i25, g0Var, (i21 >> 12) & 14), z3.U(g0Var, 2131886130), z1.m(oVar, f11), jB, g0Var, 8, 0);
                                g0Var.r(false);
                                f17 = f16;
                            } else if (iVar2 instanceof lo.g) {
                                g0Var.c0(-2140930998);
                                strU = z3.U(g0Var, 2131886125);
                                b2.r rVarM2 = z1.m(oVar, f11);
                                zG = g0Var.g(strU);
                                objN = g0Var.N();
                                l1.c cVar = l1.i.f9868a;
                                if (zG || objN == cVar) {
                                    objN = new hb.u(strU, 25);
                                    g0Var.n0(objN);
                                }
                                b2.r rVarC2 = j3.q.c(rVarM2, false, (u00.k) objN);
                                long jB2 = i2.t.b(i2.t.d(j9) * 0.25f, j9);
                                if ((i21 & 14) == 4) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                objN2 = g0Var.N();
                                if (z11 || objN2 == cVar) {
                                    objN2 = new f2(iVar2, 5);
                                    g0Var.n0(objN2);
                                }
                                v5.b((u00.a) objN2, rVarC2, jB, f16, jB2, 0, 0.0f, g0Var, (i21 >> 9) & 7168, 96);
                                f17 = f16;
                                g0Var = g0Var;
                                g0Var.r(false);
                            } else {
                                f17 = f16;
                                if (!iVar2.equals(lo.f.a)) {
                                    throw oi.k.r(g0Var, -1870189344, false);
                                }
                                g0Var.c0(-2140316826);
                                o3.a(y3.R(i23, g0Var, (i21 >> 15) & 14), z3.U(g0Var, 2131886131), z1.m(oVar, f11), jB, g0Var, 8, 0);
                                g0Var.r(false);
                            }
                            g0Var.r(true);
                            float f18 = f11;
                            f14 = f17;
                            rVar3 = rVar2;
                            i22 = i25;
                            f13 = f18;
                        } else {
                            g0Var.V();
                            if ((i13 & 16) != 0) {
                                i21 &= -57345;
                            }
                            if ((i13 & 32) != 0) {
                                i21 &= -458753;
                            }
                            i25 = i17;
                            i23 = i18;
                        }
                        f15 = f12;
                        g0Var.s();
                        jB = i2.t.b(i2.t.d(j9) * 0.8f, j9);
                        b2.r rVarM3 = z1.m(rVar2, f11);
                        w0 w0VarD2 = h0.o.d(b2.b.E, false);
                        int iHashCode2 = Long.hashCode(g0Var.T);
                        m1 m1VarM2 = g0Var.m();
                        b2.r rVarC3 = b2.a.c(rVarM3, g0Var);
                        b3.i.f2042c.getClass();
                        gVar = b3.h.f2035b;
                        g0Var.g0();
                        f16 = f15;
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(w0VarD2, g0Var, b3.h.f2039f);
                        l1.q.I(m1VarM2, g0Var, b3.h.f2038e);
                        l1.q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.f2040g);
                        l1.q.E(g0Var, b3.h.f2041h);
                        l1.q.I(rVarC3, g0Var, b3.h.f2037d);
                        iVar2 = iVar;
                        if (iVar2.equals(lo.h.a)) {
                            g0Var.c0(-2141256219);
                            o3.a(y3.R(i25, g0Var, (i21 >> 12) & 14), z3.U(g0Var, 2131886130), z1.m(oVar, f11), jB, g0Var, 8, 0);
                            g0Var.r(false);
                            f17 = f16;
                        } else if (iVar2 instanceof lo.g) {
                            g0Var.c0(-2140930998);
                            strU = z3.U(g0Var, 2131886125);
                            b2.r rVarM4 = z1.m(oVar, f11);
                            zG = g0Var.g(strU);
                            objN = g0Var.N();
                            l1.c cVar2 = l1.i.f9868a;
                            if (zG) {
                                objN = new hb.u(strU, 25);
                                g0Var.n0(objN);
                            } else {
                                objN = new hb.u(strU, 25);
                                g0Var.n0(objN);
                            }
                            b2.r rVarC4 = j3.q.c(rVarM4, false, (u00.k) objN);
                            long jB3 = i2.t.b(i2.t.d(j9) * 0.25f, j9);
                            if ((i21 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objN2 = g0Var.N();
                            if (z11) {
                                objN2 = new f2(iVar2, 5);
                                g0Var.n0(objN2);
                            } else {
                                objN2 = new f2(iVar2, 5);
                                g0Var.n0(objN2);
                            }
                            v5.b((u00.a) objN2, rVarC4, jB, f16, jB3, 0, 0.0f, g0Var, (i21 >> 9) & 7168, 96);
                            f17 = f16;
                            g0Var = g0Var;
                            g0Var.r(false);
                        } else {
                            f17 = f16;
                            if (!iVar2.equals(lo.f.a)) {
                                throw oi.k.r(g0Var, -1870189344, false);
                            }
                            g0Var.c0(-2140316826);
                            o3.a(y3.R(i23, g0Var, (i21 >> 15) & 14), z3.U(g0Var, 2131886131), z1.m(oVar, f11), jB, g0Var, 8, 0);
                            g0Var.r(false);
                        }
                        g0Var.r(true);
                        float f19 = f11;
                        f14 = f17;
                        rVar3 = rVar2;
                        i22 = i25;
                        f13 = f19;
                    } else {
                        g0Var.V();
                        rVar3 = rVar2;
                        f13 = f11;
                        i22 = i17;
                        i23 = i18;
                        f14 = f12;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new to.d(iVar2, j9, rVar3, f13, i22, i23, f14, i12, i13);
                    }
                }
                i14 |= 1572864;
                f12 = f10;
                i21 = i14;
                if ((599187 & i14) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g0Var.S(i21 & 1, z10)) {
                    g0Var.X();
                    i24 = i12 & 1;
                    oVar = b2.o.A;
                    if (i24 != 0) {
                        if (i27 != 0) {
                            rVar2 = oVar;
                        }
                        if (i15 != 0) {
                            f11 = 20;
                        }
                        if ((i13 & 16) != 0) {
                            i25 = 2131231123;
                            i21 &= -57345;
                        } else {
                            i25 = i17;
                        }
                        if ((i13 & 32) != 0) {
                            i23 = 2131231105;
                            i21 &= -458753;
                        } else {
                            i23 = i18;
                        }
                        if (i19 != 0) {
                            f15 = 3;
                        } else {
                            f15 = f12;
                        }
                    } else {
                        if (i27 != 0) {
                            rVar2 = oVar;
                        }
                        if (i15 != 0) {
                            f11 = 20;
                        }
                        if ((i13 & 16) != 0) {
                            i25 = 2131231123;
                            i21 &= -57345;
                        } else {
                            i25 = i17;
                        }
                        if ((i13 & 32) != 0) {
                            i23 = 2131231105;
                            i21 &= -458753;
                        } else {
                            i23 = i18;
                        }
                        if (i19 != 0) {
                            f15 = 3;
                        } else {
                            f15 = f12;
                        }
                    }
                    g0Var.s();
                    jB = i2.t.b(i2.t.d(j9) * 0.8f, j9);
                    b2.r rVarM5 = z1.m(rVar2, f11);
                    w0 w0VarD3 = h0.o.d(b2.b.E, false);
                    int iHashCode3 = Long.hashCode(g0Var.T);
                    m1 m1VarM3 = g0Var.m();
                    b2.r rVarC5 = b2.a.c(rVarM5, g0Var);
                    b3.i.f2042c.getClass();
                    gVar = b3.h.f2035b;
                    g0Var.g0();
                    f16 = f15;
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0VarD3, g0Var, b3.h.f2039f);
                    l1.q.I(m1VarM3, g0Var, b3.h.f2038e);
                    l1.q.I(Integer.valueOf(iHashCode3), g0Var, b3.h.f2040g);
                    l1.q.E(g0Var, b3.h.f2041h);
                    l1.q.I(rVarC5, g0Var, b3.h.f2037d);
                    iVar2 = iVar;
                    if (iVar2.equals(lo.h.a)) {
                        g0Var.c0(-2141256219);
                        o3.a(y3.R(i25, g0Var, (i21 >> 12) & 14), z3.U(g0Var, 2131886130), z1.m(oVar, f11), jB, g0Var, 8, 0);
                        g0Var.r(false);
                        f17 = f16;
                    } else if (iVar2 instanceof lo.g) {
                        g0Var.c0(-2140930998);
                        strU = z3.U(g0Var, 2131886125);
                        b2.r rVarM6 = z1.m(oVar, f11);
                        zG = g0Var.g(strU);
                        objN = g0Var.N();
                        l1.c cVar3 = l1.i.f9868a;
                        if (zG) {
                            objN = new hb.u(strU, 25);
                            g0Var.n0(objN);
                        } else {
                            objN = new hb.u(strU, 25);
                            g0Var.n0(objN);
                        }
                        b2.r rVarC6 = j3.q.c(rVarM6, false, (u00.k) objN);
                        long jB4 = i2.t.b(i2.t.d(j9) * 0.25f, j9);
                        if ((i21 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objN2 = g0Var.N();
                        if (z11) {
                            objN2 = new f2(iVar2, 5);
                            g0Var.n0(objN2);
                        } else {
                            objN2 = new f2(iVar2, 5);
                            g0Var.n0(objN2);
                        }
                        v5.b((u00.a) objN2, rVarC6, jB, f16, jB4, 0, 0.0f, g0Var, (i21 >> 9) & 7168, 96);
                        f17 = f16;
                        g0Var = g0Var;
                        g0Var.r(false);
                    } else {
                        f17 = f16;
                        if (!iVar2.equals(lo.f.a)) {
                            throw oi.k.r(g0Var, -1870189344, false);
                        }
                        g0Var.c0(-2140316826);
                        o3.a(y3.R(i23, g0Var, (i21 >> 15) & 14), z3.U(g0Var, 2131886131), z1.m(oVar, f11), jB, g0Var, 8, 0);
                        g0Var.r(false);
                    }
                    g0Var.r(true);
                    float f110 = f11;
                    f14 = f17;
                    rVar3 = rVar2;
                    i22 = i25;
                    f13 = f110;
                } else {
                    g0Var.V();
                    rVar3 = rVar2;
                    f13 = f11;
                    i22 = i17;
                    i23 = i18;
                    f14 = f12;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new to.d(iVar2, j9, rVar3, f13, i22, i23, f14, i12, i13);
                }
            }
            i14 |= 3072;
            f11 = f3;
            if ((i12 & 24576) == 0) {
                if ((i13 & 16) == 0) {
                    i17 = i10;
                    if (g0Var.e(i17)) {
                    }
                    i14 |= i28;
                } else {
                    i17 = i10;
                }
                i14 |= i28;
            } else {
                i17 = i10;
            }
            if ((196608 & i12) == 0) {
                if ((i13 & 32) == 0) {
                    i18 = i11;
                    if (g0Var.e(i18)) {
                        i26 = 131072;
                    }
                    i14 |= i26;
                } else {
                    i18 = i11;
                }
                i26 = Cast.MAX_MESSAGE_LENGTH;
                i14 |= i26;
            } else {
                i18 = i11;
            }
            i19 = i13 & 64;
            if (i19 != 0) {
                if ((1572864 & i12) == 0) {
                    f12 = f10;
                    if (g0Var.d(f12)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i14 |= i20;
                }
                i21 = i14;
                if ((599187 & i14) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g0Var.S(i21 & 1, z10)) {
                    g0Var.X();
                    i24 = i12 & 1;
                    oVar = b2.o.A;
                    if (i24 != 0) {
                        if (i27 != 0) {
                            rVar2 = oVar;
                        }
                        if (i15 != 0) {
                            f11 = 20;
                        }
                        if ((i13 & 16) != 0) {
                            i25 = 2131231123;
                            i21 &= -57345;
                        } else {
                            i25 = i17;
                        }
                        if ((i13 & 32) != 0) {
                            i23 = 2131231105;
                            i21 &= -458753;
                        } else {
                            i23 = i18;
                        }
                        if (i19 != 0) {
                            f15 = 3;
                        } else {
                            f15 = f12;
                        }
                    } else {
                        if (i27 != 0) {
                            rVar2 = oVar;
                        }
                        if (i15 != 0) {
                            f11 = 20;
                        }
                        if ((i13 & 16) != 0) {
                            i25 = 2131231123;
                            i21 &= -57345;
                        } else {
                            i25 = i17;
                        }
                        if ((i13 & 32) != 0) {
                            i23 = 2131231105;
                            i21 &= -458753;
                        } else {
                            i23 = i18;
                        }
                        if (i19 != 0) {
                            f15 = 3;
                        } else {
                            f15 = f12;
                        }
                    }
                    g0Var.s();
                    jB = i2.t.b(i2.t.d(j9) * 0.8f, j9);
                    b2.r rVarM7 = z1.m(rVar2, f11);
                    w0 w0VarD4 = h0.o.d(b2.b.E, false);
                    int iHashCode4 = Long.hashCode(g0Var.T);
                    m1 m1VarM4 = g0Var.m();
                    b2.r rVarC7 = b2.a.c(rVarM7, g0Var);
                    b3.i.f2042c.getClass();
                    gVar = b3.h.f2035b;
                    g0Var.g0();
                    f16 = f15;
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0VarD4, g0Var, b3.h.f2039f);
                    l1.q.I(m1VarM4, g0Var, b3.h.f2038e);
                    l1.q.I(Integer.valueOf(iHashCode4), g0Var, b3.h.f2040g);
                    l1.q.E(g0Var, b3.h.f2041h);
                    l1.q.I(rVarC7, g0Var, b3.h.f2037d);
                    iVar2 = iVar;
                    if (iVar2.equals(lo.h.a)) {
                        g0Var.c0(-2141256219);
                        o3.a(y3.R(i25, g0Var, (i21 >> 12) & 14), z3.U(g0Var, 2131886130), z1.m(oVar, f11), jB, g0Var, 8, 0);
                        g0Var.r(false);
                        f17 = f16;
                    } else if (iVar2 instanceof lo.g) {
                        g0Var.c0(-2140930998);
                        strU = z3.U(g0Var, 2131886125);
                        b2.r rVarM8 = z1.m(oVar, f11);
                        zG = g0Var.g(strU);
                        objN = g0Var.N();
                        l1.c cVar4 = l1.i.f9868a;
                        if (zG) {
                            objN = new hb.u(strU, 25);
                            g0Var.n0(objN);
                        } else {
                            objN = new hb.u(strU, 25);
                            g0Var.n0(objN);
                        }
                        b2.r rVarC8 = j3.q.c(rVarM8, false, (u00.k) objN);
                        long jB5 = i2.t.b(i2.t.d(j9) * 0.25f, j9);
                        if ((i21 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objN2 = g0Var.N();
                        if (z11) {
                            objN2 = new f2(iVar2, 5);
                            g0Var.n0(objN2);
                        } else {
                            objN2 = new f2(iVar2, 5);
                            g0Var.n0(objN2);
                        }
                        v5.b((u00.a) objN2, rVarC8, jB, f16, jB5, 0, 0.0f, g0Var, (i21 >> 9) & 7168, 96);
                        f17 = f16;
                        g0Var = g0Var;
                        g0Var.r(false);
                    } else {
                        f17 = f16;
                        if (!iVar2.equals(lo.f.a)) {
                            throw oi.k.r(g0Var, -1870189344, false);
                        }
                        g0Var.c0(-2140316826);
                        o3.a(y3.R(i23, g0Var, (i21 >> 15) & 14), z3.U(g0Var, 2131886131), z1.m(oVar, f11), jB, g0Var, 8, 0);
                        g0Var.r(false);
                    }
                    g0Var.r(true);
                    float f111 = f11;
                    f14 = f17;
                    rVar3 = rVar2;
                    i22 = i25;
                    f13 = f111;
                } else {
                    g0Var.V();
                    rVar3 = rVar2;
                    f13 = f11;
                    i22 = i17;
                    i23 = i18;
                    f14 = f12;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new to.d(iVar2, j9, rVar3, f13, i22, i23, f14, i12, i13);
                }
            }
            i14 |= 1572864;
            f12 = f10;
            i21 = i14;
            if ((599187 & i14) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var.S(i21 & 1, z10)) {
                g0Var.X();
                i24 = i12 & 1;
                oVar = b2.o.A;
                if (i24 != 0) {
                    if (i27 != 0) {
                        rVar2 = oVar;
                    }
                    if (i15 != 0) {
                        f11 = 20;
                    }
                    if ((i13 & 16) != 0) {
                        i25 = 2131231123;
                        i21 &= -57345;
                    } else {
                        i25 = i17;
                    }
                    if ((i13 & 32) != 0) {
                        i23 = 2131231105;
                        i21 &= -458753;
                    } else {
                        i23 = i18;
                    }
                    if (i19 != 0) {
                        f15 = 3;
                    } else {
                        f15 = f12;
                    }
                } else {
                    if (i27 != 0) {
                        rVar2 = oVar;
                    }
                    if (i15 != 0) {
                        f11 = 20;
                    }
                    if ((i13 & 16) != 0) {
                        i25 = 2131231123;
                        i21 &= -57345;
                    } else {
                        i25 = i17;
                    }
                    if ((i13 & 32) != 0) {
                        i23 = 2131231105;
                        i21 &= -458753;
                    } else {
                        i23 = i18;
                    }
                    if (i19 != 0) {
                        f15 = 3;
                    } else {
                        f15 = f12;
                    }
                }
                g0Var.s();
                jB = i2.t.b(i2.t.d(j9) * 0.8f, j9);
                b2.r rVarM9 = z1.m(rVar2, f11);
                w0 w0VarD5 = h0.o.d(b2.b.E, false);
                int iHashCode5 = Long.hashCode(g0Var.T);
                m1 m1VarM5 = g0Var.m();
                b2.r rVarC9 = b2.a.c(rVarM9, g0Var);
                b3.i.f2042c.getClass();
                gVar = b3.h.f2035b;
                g0Var.g0();
                f16 = f15;
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD5, g0Var, b3.h.f2039f);
                l1.q.I(m1VarM5, g0Var, b3.h.f2038e);
                l1.q.I(Integer.valueOf(iHashCode5), g0Var, b3.h.f2040g);
                l1.q.E(g0Var, b3.h.f2041h);
                l1.q.I(rVarC9, g0Var, b3.h.f2037d);
                iVar2 = iVar;
                if (iVar2.equals(lo.h.a)) {
                    g0Var.c0(-2141256219);
                    o3.a(y3.R(i25, g0Var, (i21 >> 12) & 14), z3.U(g0Var, 2131886130), z1.m(oVar, f11), jB, g0Var, 8, 0);
                    g0Var.r(false);
                    f17 = f16;
                } else if (iVar2 instanceof lo.g) {
                    g0Var.c0(-2140930998);
                    strU = z3.U(g0Var, 2131886125);
                    b2.r rVarM10 = z1.m(oVar, f11);
                    zG = g0Var.g(strU);
                    objN = g0Var.N();
                    l1.c cVar5 = l1.i.f9868a;
                    if (zG) {
                        objN = new hb.u(strU, 25);
                        g0Var.n0(objN);
                    } else {
                        objN = new hb.u(strU, 25);
                        g0Var.n0(objN);
                    }
                    b2.r rVarC10 = j3.q.c(rVarM10, false, (u00.k) objN);
                    long jB6 = i2.t.b(i2.t.d(j9) * 0.25f, j9);
                    if ((i21 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objN2 = g0Var.N();
                    if (z11) {
                        objN2 = new f2(iVar2, 5);
                        g0Var.n0(objN2);
                    } else {
                        objN2 = new f2(iVar2, 5);
                        g0Var.n0(objN2);
                    }
                    v5.b((u00.a) objN2, rVarC10, jB, f16, jB6, 0, 0.0f, g0Var, (i21 >> 9) & 7168, 96);
                    f17 = f16;
                    g0Var = g0Var;
                    g0Var.r(false);
                } else {
                    f17 = f16;
                    if (!iVar2.equals(lo.f.a)) {
                        throw oi.k.r(g0Var, -1870189344, false);
                    }
                    g0Var.c0(-2140316826);
                    o3.a(y3.R(i23, g0Var, (i21 >> 15) & 14), z3.U(g0Var, 2131886131), z1.m(oVar, f11), jB, g0Var, 8, 0);
                    g0Var.r(false);
                }
                g0Var.r(true);
                float f112 = f11;
                f14 = f17;
                rVar3 = rVar2;
                i22 = i25;
                f13 = f112;
            } else {
                g0Var.V();
                rVar3 = rVar2;
                f13 = f11;
                i22 = i17;
                i23 = i18;
                f14 = f12;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new to.d(iVar2, j9, rVar3, f13, i22, i23, f14, i12, i13);
            }
        }
        i14 |= 384;
        rVar2 = rVar;
        i15 = i13 & 8;
        if (i15 != 0) {
            if ((i12 & 3072) == 0) {
                f11 = f3;
                if (g0Var.d(f11)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i14 |= i16;
            }
            if ((i12 & 24576) == 0) {
                if ((i13 & 16) == 0) {
                    i17 = i10;
                    if (g0Var.e(i17)) {
                    }
                    i14 |= i28;
                } else {
                    i17 = i10;
                }
                i14 |= i28;
            } else {
                i17 = i10;
            }
            if ((196608 & i12) == 0) {
                if ((i13 & 32) == 0) {
                    i18 = i11;
                    if (g0Var.e(i18)) {
                        i26 = 131072;
                    }
                    i14 |= i26;
                } else {
                    i18 = i11;
                }
                i26 = Cast.MAX_MESSAGE_LENGTH;
                i14 |= i26;
            } else {
                i18 = i11;
            }
            i19 = i13 & 64;
            if (i19 != 0) {
                if ((1572864 & i12) == 0) {
                    f12 = f10;
                    if (g0Var.d(f12)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i14 |= i20;
                }
                i21 = i14;
                if ((599187 & i14) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g0Var.S(i21 & 1, z10)) {
                    g0Var.X();
                    i24 = i12 & 1;
                    oVar = b2.o.A;
                    if (i24 != 0) {
                        if (i27 != 0) {
                            rVar2 = oVar;
                        }
                        if (i15 != 0) {
                            f11 = 20;
                        }
                        if ((i13 & 16) != 0) {
                            i25 = 2131231123;
                            i21 &= -57345;
                        } else {
                            i25 = i17;
                        }
                        if ((i13 & 32) != 0) {
                            i23 = 2131231105;
                            i21 &= -458753;
                        } else {
                            i23 = i18;
                        }
                        if (i19 != 0) {
                            f15 = 3;
                        } else {
                            f15 = f12;
                        }
                    } else {
                        if (i27 != 0) {
                            rVar2 = oVar;
                        }
                        if (i15 != 0) {
                            f11 = 20;
                        }
                        if ((i13 & 16) != 0) {
                            i25 = 2131231123;
                            i21 &= -57345;
                        } else {
                            i25 = i17;
                        }
                        if ((i13 & 32) != 0) {
                            i23 = 2131231105;
                            i21 &= -458753;
                        } else {
                            i23 = i18;
                        }
                        if (i19 != 0) {
                            f15 = 3;
                        } else {
                            f15 = f12;
                        }
                    }
                    g0Var.s();
                    jB = i2.t.b(i2.t.d(j9) * 0.8f, j9);
                    b2.r rVarM11 = z1.m(rVar2, f11);
                    w0 w0VarD6 = h0.o.d(b2.b.E, false);
                    int iHashCode6 = Long.hashCode(g0Var.T);
                    m1 m1VarM6 = g0Var.m();
                    b2.r rVarC11 = b2.a.c(rVarM11, g0Var);
                    b3.i.f2042c.getClass();
                    gVar = b3.h.f2035b;
                    g0Var.g0();
                    f16 = f15;
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0VarD6, g0Var, b3.h.f2039f);
                    l1.q.I(m1VarM6, g0Var, b3.h.f2038e);
                    l1.q.I(Integer.valueOf(iHashCode6), g0Var, b3.h.f2040g);
                    l1.q.E(g0Var, b3.h.f2041h);
                    l1.q.I(rVarC11, g0Var, b3.h.f2037d);
                    iVar2 = iVar;
                    if (iVar2.equals(lo.h.a)) {
                        g0Var.c0(-2141256219);
                        o3.a(y3.R(i25, g0Var, (i21 >> 12) & 14), z3.U(g0Var, 2131886130), z1.m(oVar, f11), jB, g0Var, 8, 0);
                        g0Var.r(false);
                        f17 = f16;
                    } else if (iVar2 instanceof lo.g) {
                        g0Var.c0(-2140930998);
                        strU = z3.U(g0Var, 2131886125);
                        b2.r rVarM12 = z1.m(oVar, f11);
                        zG = g0Var.g(strU);
                        objN = g0Var.N();
                        l1.c cVar6 = l1.i.f9868a;
                        if (zG) {
                            objN = new hb.u(strU, 25);
                            g0Var.n0(objN);
                        } else {
                            objN = new hb.u(strU, 25);
                            g0Var.n0(objN);
                        }
                        b2.r rVarC12 = j3.q.c(rVarM12, false, (u00.k) objN);
                        long jB7 = i2.t.b(i2.t.d(j9) * 0.25f, j9);
                        if ((i21 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objN2 = g0Var.N();
                        if (z11) {
                            objN2 = new f2(iVar2, 5);
                            g0Var.n0(objN2);
                        } else {
                            objN2 = new f2(iVar2, 5);
                            g0Var.n0(objN2);
                        }
                        v5.b((u00.a) objN2, rVarC12, jB, f16, jB7, 0, 0.0f, g0Var, (i21 >> 9) & 7168, 96);
                        f17 = f16;
                        g0Var = g0Var;
                        g0Var.r(false);
                    } else {
                        f17 = f16;
                        if (!iVar2.equals(lo.f.a)) {
                            throw oi.k.r(g0Var, -1870189344, false);
                        }
                        g0Var.c0(-2140316826);
                        o3.a(y3.R(i23, g0Var, (i21 >> 15) & 14), z3.U(g0Var, 2131886131), z1.m(oVar, f11), jB, g0Var, 8, 0);
                        g0Var.r(false);
                    }
                    g0Var.r(true);
                    float f113 = f11;
                    f14 = f17;
                    rVar3 = rVar2;
                    i22 = i25;
                    f13 = f113;
                } else {
                    g0Var.V();
                    rVar3 = rVar2;
                    f13 = f11;
                    i22 = i17;
                    i23 = i18;
                    f14 = f12;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new to.d(iVar2, j9, rVar3, f13, i22, i23, f14, i12, i13);
                }
            }
            i14 |= 1572864;
            f12 = f10;
            i21 = i14;
            if ((599187 & i14) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var.S(i21 & 1, z10)) {
                g0Var.X();
                i24 = i12 & 1;
                oVar = b2.o.A;
                if (i24 != 0) {
                    if (i27 != 0) {
                        rVar2 = oVar;
                    }
                    if (i15 != 0) {
                        f11 = 20;
                    }
                    if ((i13 & 16) != 0) {
                        i25 = 2131231123;
                        i21 &= -57345;
                    } else {
                        i25 = i17;
                    }
                    if ((i13 & 32) != 0) {
                        i23 = 2131231105;
                        i21 &= -458753;
                    } else {
                        i23 = i18;
                    }
                    if (i19 != 0) {
                        f15 = 3;
                    } else {
                        f15 = f12;
                    }
                } else {
                    if (i27 != 0) {
                        rVar2 = oVar;
                    }
                    if (i15 != 0) {
                        f11 = 20;
                    }
                    if ((i13 & 16) != 0) {
                        i25 = 2131231123;
                        i21 &= -57345;
                    } else {
                        i25 = i17;
                    }
                    if ((i13 & 32) != 0) {
                        i23 = 2131231105;
                        i21 &= -458753;
                    } else {
                        i23 = i18;
                    }
                    if (i19 != 0) {
                        f15 = 3;
                    } else {
                        f15 = f12;
                    }
                }
                g0Var.s();
                jB = i2.t.b(i2.t.d(j9) * 0.8f, j9);
                b2.r rVarM13 = z1.m(rVar2, f11);
                w0 w0VarD7 = h0.o.d(b2.b.E, false);
                int iHashCode7 = Long.hashCode(g0Var.T);
                m1 m1VarM7 = g0Var.m();
                b2.r rVarC13 = b2.a.c(rVarM13, g0Var);
                b3.i.f2042c.getClass();
                gVar = b3.h.f2035b;
                g0Var.g0();
                f16 = f15;
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD7, g0Var, b3.h.f2039f);
                l1.q.I(m1VarM7, g0Var, b3.h.f2038e);
                l1.q.I(Integer.valueOf(iHashCode7), g0Var, b3.h.f2040g);
                l1.q.E(g0Var, b3.h.f2041h);
                l1.q.I(rVarC13, g0Var, b3.h.f2037d);
                iVar2 = iVar;
                if (iVar2.equals(lo.h.a)) {
                    g0Var.c0(-2141256219);
                    o3.a(y3.R(i25, g0Var, (i21 >> 12) & 14), z3.U(g0Var, 2131886130), z1.m(oVar, f11), jB, g0Var, 8, 0);
                    g0Var.r(false);
                    f17 = f16;
                } else if (iVar2 instanceof lo.g) {
                    g0Var.c0(-2140930998);
                    strU = z3.U(g0Var, 2131886125);
                    b2.r rVarM14 = z1.m(oVar, f11);
                    zG = g0Var.g(strU);
                    objN = g0Var.N();
                    l1.c cVar7 = l1.i.f9868a;
                    if (zG) {
                        objN = new hb.u(strU, 25);
                        g0Var.n0(objN);
                    } else {
                        objN = new hb.u(strU, 25);
                        g0Var.n0(objN);
                    }
                    b2.r rVarC14 = j3.q.c(rVarM14, false, (u00.k) objN);
                    long jB8 = i2.t.b(i2.t.d(j9) * 0.25f, j9);
                    if ((i21 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objN2 = g0Var.N();
                    if (z11) {
                        objN2 = new f2(iVar2, 5);
                        g0Var.n0(objN2);
                    } else {
                        objN2 = new f2(iVar2, 5);
                        g0Var.n0(objN2);
                    }
                    v5.b((u00.a) objN2, rVarC14, jB, f16, jB8, 0, 0.0f, g0Var, (i21 >> 9) & 7168, 96);
                    f17 = f16;
                    g0Var = g0Var;
                    g0Var.r(false);
                } else {
                    f17 = f16;
                    if (!iVar2.equals(lo.f.a)) {
                        throw oi.k.r(g0Var, -1870189344, false);
                    }
                    g0Var.c0(-2140316826);
                    o3.a(y3.R(i23, g0Var, (i21 >> 15) & 14), z3.U(g0Var, 2131886131), z1.m(oVar, f11), jB, g0Var, 8, 0);
                    g0Var.r(false);
                }
                g0Var.r(true);
                float f114 = f11;
                f14 = f17;
                rVar3 = rVar2;
                i22 = i25;
                f13 = f114;
            } else {
                g0Var.V();
                rVar3 = rVar2;
                f13 = f11;
                i22 = i17;
                i23 = i18;
                f14 = f12;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new to.d(iVar2, j9, rVar3, f13, i22, i23, f14, i12, i13);
            }
        }
        i14 |= 3072;
        f11 = f3;
        if ((i12 & 24576) == 0) {
            if ((i13 & 16) == 0) {
                i17 = i10;
                if (g0Var.e(i17)) {
                }
                i14 |= i28;
            } else {
                i17 = i10;
            }
            i14 |= i28;
        } else {
            i17 = i10;
        }
        if ((196608 & i12) == 0) {
            if ((i13 & 32) == 0) {
                i18 = i11;
                if (g0Var.e(i18)) {
                    i26 = 131072;
                }
                i14 |= i26;
            } else {
                i18 = i11;
            }
            i26 = Cast.MAX_MESSAGE_LENGTH;
            i14 |= i26;
        } else {
            i18 = i11;
        }
        i19 = i13 & 64;
        if (i19 != 0) {
            if ((1572864 & i12) == 0) {
                f12 = f10;
                if (g0Var.d(f12)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i14 |= i20;
            }
            i21 = i14;
            if ((599187 & i14) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var.S(i21 & 1, z10)) {
                g0Var.X();
                i24 = i12 & 1;
                oVar = b2.o.A;
                if (i24 != 0) {
                    if (i27 != 0) {
                        rVar2 = oVar;
                    }
                    if (i15 != 0) {
                        f11 = 20;
                    }
                    if ((i13 & 16) != 0) {
                        i25 = 2131231123;
                        i21 &= -57345;
                    } else {
                        i25 = i17;
                    }
                    if ((i13 & 32) != 0) {
                        i23 = 2131231105;
                        i21 &= -458753;
                    } else {
                        i23 = i18;
                    }
                    if (i19 != 0) {
                        f15 = 3;
                    } else {
                        f15 = f12;
                    }
                } else {
                    if (i27 != 0) {
                        rVar2 = oVar;
                    }
                    if (i15 != 0) {
                        f11 = 20;
                    }
                    if ((i13 & 16) != 0) {
                        i25 = 2131231123;
                        i21 &= -57345;
                    } else {
                        i25 = i17;
                    }
                    if ((i13 & 32) != 0) {
                        i23 = 2131231105;
                        i21 &= -458753;
                    } else {
                        i23 = i18;
                    }
                    if (i19 != 0) {
                        f15 = 3;
                    } else {
                        f15 = f12;
                    }
                }
                g0Var.s();
                jB = i2.t.b(i2.t.d(j9) * 0.8f, j9);
                b2.r rVarM15 = z1.m(rVar2, f11);
                w0 w0VarD8 = h0.o.d(b2.b.E, false);
                int iHashCode8 = Long.hashCode(g0Var.T);
                m1 m1VarM8 = g0Var.m();
                b2.r rVarC15 = b2.a.c(rVarM15, g0Var);
                b3.i.f2042c.getClass();
                gVar = b3.h.f2035b;
                g0Var.g0();
                f16 = f15;
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD8, g0Var, b3.h.f2039f);
                l1.q.I(m1VarM8, g0Var, b3.h.f2038e);
                l1.q.I(Integer.valueOf(iHashCode8), g0Var, b3.h.f2040g);
                l1.q.E(g0Var, b3.h.f2041h);
                l1.q.I(rVarC15, g0Var, b3.h.f2037d);
                iVar2 = iVar;
                if (iVar2.equals(lo.h.a)) {
                    g0Var.c0(-2141256219);
                    o3.a(y3.R(i25, g0Var, (i21 >> 12) & 14), z3.U(g0Var, 2131886130), z1.m(oVar, f11), jB, g0Var, 8, 0);
                    g0Var.r(false);
                    f17 = f16;
                } else if (iVar2 instanceof lo.g) {
                    g0Var.c0(-2140930998);
                    strU = z3.U(g0Var, 2131886125);
                    b2.r rVarM16 = z1.m(oVar, f11);
                    zG = g0Var.g(strU);
                    objN = g0Var.N();
                    l1.c cVar8 = l1.i.f9868a;
                    if (zG) {
                        objN = new hb.u(strU, 25);
                        g0Var.n0(objN);
                    } else {
                        objN = new hb.u(strU, 25);
                        g0Var.n0(objN);
                    }
                    b2.r rVarC16 = j3.q.c(rVarM16, false, (u00.k) objN);
                    long jB9 = i2.t.b(i2.t.d(j9) * 0.25f, j9);
                    if ((i21 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objN2 = g0Var.N();
                    if (z11) {
                        objN2 = new f2(iVar2, 5);
                        g0Var.n0(objN2);
                    } else {
                        objN2 = new f2(iVar2, 5);
                        g0Var.n0(objN2);
                    }
                    v5.b((u00.a) objN2, rVarC16, jB, f16, jB9, 0, 0.0f, g0Var, (i21 >> 9) & 7168, 96);
                    f17 = f16;
                    g0Var = g0Var;
                    g0Var.r(false);
                } else {
                    f17 = f16;
                    if (!iVar2.equals(lo.f.a)) {
                        throw oi.k.r(g0Var, -1870189344, false);
                    }
                    g0Var.c0(-2140316826);
                    o3.a(y3.R(i23, g0Var, (i21 >> 15) & 14), z3.U(g0Var, 2131886131), z1.m(oVar, f11), jB, g0Var, 8, 0);
                    g0Var.r(false);
                }
                g0Var.r(true);
                float f115 = f11;
                f14 = f17;
                rVar3 = rVar2;
                i22 = i25;
                f13 = f115;
            } else {
                g0Var.V();
                rVar3 = rVar2;
                f13 = f11;
                i22 = i17;
                i23 = i18;
                f14 = f12;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new to.d(iVar2, j9, rVar3, f13, i22, i23, f14, i12, i13);
            }
        }
        i14 |= 1572864;
        f12 = f10;
        i21 = i14;
        if ((599187 & i14) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (g0Var.S(i21 & 1, z10)) {
            g0Var.X();
            i24 = i12 & 1;
            oVar = b2.o.A;
            if (i24 != 0) {
                if (i27 != 0) {
                    rVar2 = oVar;
                }
                if (i15 != 0) {
                    f11 = 20;
                }
                if ((i13 & 16) != 0) {
                    i25 = 2131231123;
                    i21 &= -57345;
                } else {
                    i25 = i17;
                }
                if ((i13 & 32) != 0) {
                    i23 = 2131231105;
                    i21 &= -458753;
                } else {
                    i23 = i18;
                }
                if (i19 != 0) {
                    f15 = 3;
                } else {
                    f15 = f12;
                }
            } else {
                if (i27 != 0) {
                    rVar2 = oVar;
                }
                if (i15 != 0) {
                    f11 = 20;
                }
                if ((i13 & 16) != 0) {
                    i25 = 2131231123;
                    i21 &= -57345;
                } else {
                    i25 = i17;
                }
                if ((i13 & 32) != 0) {
                    i23 = 2131231105;
                    i21 &= -458753;
                } else {
                    i23 = i18;
                }
                if (i19 != 0) {
                    f15 = 3;
                } else {
                    f15 = f12;
                }
            }
            g0Var.s();
            jB = i2.t.b(i2.t.d(j9) * 0.8f, j9);
            b2.r rVarM17 = z1.m(rVar2, f11);
            w0 w0VarD9 = h0.o.d(b2.b.E, false);
            int iHashCode9 = Long.hashCode(g0Var.T);
            m1 m1VarM9 = g0Var.m();
            b2.r rVarC17 = b2.a.c(rVarM17, g0Var);
            b3.i.f2042c.getClass();
            gVar = b3.h.f2035b;
            g0Var.g0();
            f16 = f15;
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD9, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM9, g0Var, b3.h.f2038e);
            l1.q.I(Integer.valueOf(iHashCode9), g0Var, b3.h.f2040g);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC17, g0Var, b3.h.f2037d);
            iVar2 = iVar;
            if (iVar2.equals(lo.h.a)) {
                g0Var.c0(-2141256219);
                o3.a(y3.R(i25, g0Var, (i21 >> 12) & 14), z3.U(g0Var, 2131886130), z1.m(oVar, f11), jB, g0Var, 8, 0);
                g0Var.r(false);
                f17 = f16;
            } else if (iVar2 instanceof lo.g) {
                g0Var.c0(-2140930998);
                strU = z3.U(g0Var, 2131886125);
                b2.r rVarM18 = z1.m(oVar, f11);
                zG = g0Var.g(strU);
                objN = g0Var.N();
                l1.c cVar9 = l1.i.f9868a;
                if (zG) {
                    objN = new hb.u(strU, 25);
                    g0Var.n0(objN);
                } else {
                    objN = new hb.u(strU, 25);
                    g0Var.n0(objN);
                }
                b2.r rVarC18 = j3.q.c(rVarM18, false, (u00.k) objN);
                long jB10 = i2.t.b(i2.t.d(j9) * 0.25f, j9);
                if ((i21 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objN2 = g0Var.N();
                if (z11) {
                    objN2 = new f2(iVar2, 5);
                    g0Var.n0(objN2);
                } else {
                    objN2 = new f2(iVar2, 5);
                    g0Var.n0(objN2);
                }
                v5.b((u00.a) objN2, rVarC18, jB, f16, jB10, 0, 0.0f, g0Var, (i21 >> 9) & 7168, 96);
                f17 = f16;
                g0Var = g0Var;
                g0Var.r(false);
            } else {
                f17 = f16;
                if (!iVar2.equals(lo.f.a)) {
                    throw oi.k.r(g0Var, -1870189344, false);
                }
                g0Var.c0(-2140316826);
                o3.a(y3.R(i23, g0Var, (i21 >> 15) & 14), z3.U(g0Var, 2131886131), z1.m(oVar, f11), jB, g0Var, 8, 0);
                g0Var.r(false);
            }
            g0Var.r(true);
            float f116 = f11;
            f14 = f17;
            rVar3 = rVar2;
            i22 = i25;
            f13 = f116;
        } else {
            g0Var.V();
            rVar3 = rVar2;
            f13 = f11;
            i22 = i17;
            i23 = i18;
            f14 = f12;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new to.d(iVar2, j9, rVar3, f13, i22, i23, f14, i12, i13);
        }
    }

    public static final String a0(l1.j jVar, int i10) {
        if (i10 == 1) {
            l1.g0 g0Var = (l1.g0) jVar;
            g0Var.c0(-2053602709);
            String strU = z3.U(jVar, 2131887307);
            g0Var.r(false);
            return strU;
        }
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.c0(-2053539500);
        String str = String.format(Locale.ENGLISH, z3.U(jVar, 2131887301), Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
        g0Var2.r(false);
        return str;
    }

    public static final void b(b2.r rVar, ct.b bVar, l1.j jVar, int i10) {
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-781834365);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.g(bVar) ? 32 : 16;
        }
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            o0 o0Var = i2.b0.f7111b;
            b2.r rVarC = f2.h.c(rVar, o0Var);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarC, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC2, g0Var, b3.h.f2037d);
            if (bVar != null) {
                g0Var.c0(-188487840);
                int i12 = i11 & 112;
                boolean z10 = i12 == 32;
                Object objN = g0Var.N();
                l1.c cVar = l1.i.f9868a;
                if (z10 || objN == cVar) {
                    objN = new ct.c(bVar, 1);
                    g0Var.n0(objN);
                }
                l1.q.e(bVar, (u00.k) objN, g0Var);
                h0.a0 a0Var = z1.f6478c;
                boolean z11 = i12 == 32;
                Object objN2 = g0Var.N();
                if (z11 || objN2 == cVar) {
                    objN2 = new ct.c(bVar, 2);
                    g0Var.n0(objN2);
                }
                u00.k kVar = (u00.k) objN2;
                Object objN3 = g0Var.N();
                if (objN3 == cVar) {
                    objN3 = new bw.b(10);
                    g0Var.n0(objN3);
                }
                u00.k kVar2 = (u00.k) objN3;
                boolean z12 = i12 == 32;
                Object objN4 = g0Var.N();
                if (z12 || objN4 == cVar) {
                    objN4 = new ct.c(bVar, 3);
                    g0Var.n0(objN4);
                }
                b4.l.b(kVar, a0Var, kVar2, (u00.k) objN4, g0Var, 3120);
                g0Var.r(false);
            } else {
                g0Var.c0(-187079975);
                g0Var.r(false);
            }
            h0.o.a(z.n.f(z1.f6478c, i2.t.b(0.5f, dl.a.L), o0Var), g0Var, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.l(rVar, bVar, i10, 0);
        }
    }

    public static g20.p b0(w00.a aVar) throws NoWhenBranchMatchedException {
        if (aVar instanceof m20.e) {
            m20.e eVar = (m20.e) aVar;
            String str = eVar.b;
            String str2 = eVar.c;
            kotlin.jvm.internal.m.e(str, "name");
            kotlin.jvm.internal.m.e(str2, "desc");
            return new g20.p(str.concat(str2));
        }
        if (!(aVar instanceof m20.d)) {
            throw new NoWhenBranchMatchedException();
        }
        m20.d dVar = (m20.d) aVar;
        String str3 = dVar.b;
        String str4 = dVar.c;
        kotlin.jvm.internal.m.e(str3, "name");
        kotlin.jvm.internal.m.e(str4, "desc");
        return new g20.p(str3 + '#' + str4);
    }

    public static final void c(float f3, ys.b bVar, u00.k kVar, b2.r rVar, ys.c cVar, boolean z10, boolean z11, ct.b bVar2, l1.j jVar, int i10) throws NoWhenBranchMatchedException {
        ys.b bVar3 = bVar;
        kotlin.jvm.internal.m.e(kVar, "onPeriodSelected");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1172688394);
        int i11 = i10 | (g0Var.d(f3) ? 4 : 2) | (g0Var.g(bVar3) ? 32 : 16) | (g0Var.i(kVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var.g(rVar) ? 2048 : 1024) | (g0Var.e(cVar == null ? -1 : cVar.ordinal()) ? 16384 : 8192) | (g0Var.h(z10) ? 131072 : Cast.MAX_MESSAGE_LENGTH) | (g0Var.h(z11) ? 1048576 : 524288) | (g0Var.g(bVar2) ? 8388608 : 4194304);
        if (g0Var.S(i11 & 1, (4793491 & i11) != 4793490)) {
            g0Var.X();
            if ((i10 & 1) != 0 && !g0Var.A()) {
                g0Var.V();
            }
            g0Var.s();
            b2.r rVarD = z1.d(rVar, 1.0f);
            b2.i iVar = b2.b.A;
            w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f2039f;
            l1.q.I(w0VarD, g0Var, fVar);
            b3.f fVar2 = b3.h.f2038e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.f2040g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.f2041h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.f2037d;
            l1.q.I(rVarC, g0Var, fVar4);
            h0.s sVar = h0.s.f6456a;
            b(sVar.b(), bVar2, g0Var, (i11 >> 18) & 112);
            b2.o oVar = b2.o.A;
            b2.r rVarG = h0.c.G(z1.d(oVar, 1.0f), 0.0f, f3, 0.0f, 0.0f, 13);
            h0.v vVarA = h0.u.a(h0.i.f6408c, b2.b.M, g0Var, 0);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarG, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            b2.r rVarD2 = z1.d(oVar, 1.0f);
            w0 w0VarD2 = h0.o.d(iVar, false);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC3 = b2.a.c(rVarD2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD2, g0Var, fVar);
            l1.q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar4);
            i(cVar, kVar, g0Var, ((i11 >> 12) & 14) | ((i11 >> 3) & 112));
            if (z10 || z11) {
                g0Var.c0(-166560858);
                ct.h0.a(h0.c.G(sVar.a(oVar, b2.b.F), 0.0f, 0.0f, 24, 0.0f, 11), g0Var, 0, 0);
                g0Var.r(false);
            } else {
                g0Var.c0(-166326374);
                g0Var.r(false);
            }
            g0Var.r(true);
            float f10 = 24;
            j(h0.c.G(z1.d(oVar, 1.0f), 0.0f, 12, 0.0f, f10, 5), g0Var, bVar != null ? bVar.a : 0, 48);
            b2.r rVarD3 = z1.d(oVar, 1.0f);
            Float fValueOf = Float.valueOf(0.0f);
            long j9 = i2.t.f7166f;
            b2.r rVarG2 = h0.c.G(h0.c.E(z.n.e(rVarD3, sg.f.Q(new g00.k[]{new g00.k(fValueOf, new i2.t(j9)), new g00.k(Float.valueOf(0.7f), new i2.t(j9)), new g00.k(Float.valueOf(1.0f), new i2.t(dl.a.L))}), null, 6), f10, 0.0f, 2), 0.0f, 0.0f, 0.0f, 56, 7);
            w0 w0VarD3 = h0.o.d(iVar, false);
            int iHashCode4 = Long.hashCode(g0Var.T);
            m1 m1VarM4 = g0Var.m();
            b2.r rVarC4 = b2.a.c(rVarG2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD3, g0Var, fVar);
            l1.q.I(m1VarM4, g0Var, fVar2);
            a1.b.v(iHashCode4, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC4, g0Var, fVar4);
            bVar3 = bVar;
            h(bVar != null ? bVar3.b : 0, bVar3 != null ? bVar3.c : 0, bVar3 != null ? bVar3.d : 0, sVar.a(oVar, b2.b.E), g0Var, 0);
            x5.z(g0Var, true, true, true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.o(f3, bVar3, kVar, rVar, cVar, z10, z11, bVar2, i10);
        }
    }

    public static final g10.i c0(e30.w wVar) {
        kotlin.jvm.internal.m.e(wVar, "<this>");
        g10.i iVarD = wVar.m0().d();
        kotlin.jvm.internal.m.d(iVarD, "getBuiltIns(...)");
        return iVarD;
    }

    public static final long d(float f3, float f10) {
        return (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static int d0(Context context, int i10, int i11) {
        Integer numValueOf;
        TypedValue typedValueN = z3.N(context, i10);
        if (typedValueN != null) {
            int i12 = typedValueN.resourceId;
            numValueOf = Integer.valueOf(i12 != 0 ? context.getColor(i12) : typedValueN.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i11;
    }

    public static final void e(w1 w1Var, u00.a aVar, b2.r rVar, v1.c cVar, l1.j jVar, int i10) {
        int i11;
        b2.r rVar2;
        kotlin.jvm.internal.m.e(w1Var, "<this>");
        kotlin.jvm.internal.m.e(aVar, "onClick");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1676611861);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(w1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(aVar) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i12 |= g0Var.i(cVar) ? 2048 : 1024;
        }
        int i13 = i12;
        if (g0Var.S(i13 & 1, (i13 & 1171) != 1170)) {
            u00.a aVar2 = (u00.a) g0Var.k(sm.k0.a);
            j3.k kVar = new j3.k(4);
            b2.o oVar = b2.o.A;
            b2.r rVarA = w1Var.a(z1.c(androidx.compose.foundation.b.b(oVar, null, null, false, kVar, aVar, 12), 1.0f));
            boolean zG = g0Var.g(aVar2);
            Object objN = g0Var.N();
            if (zG || objN == l1.i.f9868a) {
                objN = new ca.q(14, aVar2);
                g0Var.n0(objN);
            }
            b2.r rVarP = i2.b0.p(rVarA, (u00.k) objN);
            h0.b bVar = h0.i.f6406a;
            int i14 = (i13 & 7168) | 432;
            h0.v vVarA = h0.u.a(new h0.f(2.0f, false, new du.w(11)), b2.b.N, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarP, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            cVar.invoke(h0.w.f6474a, g0Var, Integer.valueOf(((i14 >> 6) & 112) | 6));
            g0Var.r(true);
            rVar2 = oVar;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new sm.h0(w1Var, aVar, rVar2, cVar, i10, 0);
        }
    }

    public static int e0(View view, int i10) {
        Context context = view.getContext();
        TypedValue typedValueP = z3.P(i10, view.getContext(), view.getClass().getCanonicalName());
        int i11 = typedValueP.resourceId;
        return i11 != 0 ? context.getColor(i11) : typedValueP.data;
    }

    public static final void f(ArrayList arrayList, List list, Set set, Set set2, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-720826424);
        int i11 = (i10 & 6) == 0 ? (g0Var.i(arrayList) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(list) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.i(set) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var.i(set2) ? 2048 : 1024;
        }
        if (g0Var.S(i11 & 1, (i11 & 1171) != 1170)) {
            l1.z0 z0VarG = l1.q.G(arrayList, g0Var);
            l1.z0 z0VarG2 = l1.q.G(list, g0Var);
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = ((p9.e) arrayList.get(i12)).f12468b;
                set.add(obj);
                List listN1 = h00.q.n1(arrayList);
                boolean zG = g0Var.g(z0VarG) | g0Var.i(obj) | g0Var.i(set) | g0Var.i(set2) | g0Var.g(z0VarG2);
                Object objN = g0Var.N();
                if (zG || objN == l1.i.f9868a) {
                    a1.a aVar = new a1.a(obj, set, set2, z0VarG, z0VarG2, 4);
                    g0Var.n0(aVar);
                    objN = aVar;
                }
                l1.q.c(obj, listN1, (u00.k) objN, g0Var);
            }
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new g1.a(arrayList, list, set, set2, i10, 6);
        }
    }

    public static qc.a f0(String str) {
        qc.a aVar;
        kotlin.jvm.internal.m.e(str, "instanceName");
        synchronized (qc.a.f12827c) {
            try {
                LinkedHashMap linkedHashMap = qc.a.f12828d;
                Object aVar2 = linkedHashMap.get(str);
                if (aVar2 == null) {
                    aVar2 = new qc.a();
                    linkedHashMap.put(str, aVar2);
                }
                aVar = (qc.a) aVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public static final void g(o2.f fVar, long j9, String str, String str2, b2.r rVar, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(813177808);
        int i11 = i10 | (g0Var.g(fVar) ? 4 : 2) | (g0Var.f(j9) ? 32 : 16) | (g0Var.g(str) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var.g(str2) ? 2048 : 1024) | (g0Var.g(rVar) ? 16384 : 8192);
        if (g0Var.S(i11 & 1, (i11 & 9363) != 9362)) {
            b2.r rVarE = h0.c.E(z.n.f(f2.h.c(rVar, p0.f.a(20)), i2.t.b(0.06f, dl.a.i), i2.b0.f7111b), 0.0f, 12, 1);
            b2.g gVar = b2.b.N;
            h0.v vVarA = h0.u.a(h0.i.g(8), gVar, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarE, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar2 = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            b3.f fVar2 = b3.h.f2039f;
            l1.q.I(vVarA, g0Var, fVar2);
            b3.f fVar3 = b3.h.f2038e;
            l1.q.I(m1VarM, g0Var, fVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar4 = b3.h.f2040g;
            l1.q.I(numValueOf, g0Var, fVar4);
            b3.e eVar = b3.h.f2041h;
            l1.q.E(g0Var, eVar);
            b3.f fVar5 = b3.h.f2037d;
            l1.q.I(rVarC, g0Var, fVar5);
            b2.o oVar = b2.o.A;
            z3.k(fVar, null, z1.m(oVar, 16), j9, g0Var, ((i11 << 6) & 7168) | (i11 & 14) | 432);
            h0.v vVarA2 = h0.u.a(h0.i.g(2), gVar, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(oVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA2, g0Var, fVar2);
            l1.q.I(m1VarM2, g0Var, fVar3);
            a1.b.v(iHashCode2, g0Var, fVar4, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar5);
            k00.f.a(str, (b2.r) null, i2.t.b(0.5f, dl.a.k), kh.o.z(13), new y3.o(kh.o.z(13)), (q3.u) null, new x3.k(3), 1, 0.0f, (m3.r0) null, g0Var, ((i11 >> 6) & 14) | 12610560, 802);
            z6.b(str2, null, dl.a.n, kh.o.z(15), q3.u.L, null, 0L, null, new x3.k(3), kh.o.z(15), 2, false, 1, 0, null, null, g0Var, ((i11 >> 9) & 14) | 1597440, 25008, 238506);
            g0Var = g0Var;
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.n(fVar, j9, str, str2, rVar, i10, 0);
        }
    }

    public static final e30.w g0(r0 r0Var) {
        Object obj;
        kotlin.jvm.internal.m.e(r0Var, "<this>");
        List upperBounds = r0Var.getUpperBounds();
        kotlin.jvm.internal.m.d(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List upperBounds2 = r0Var.getUpperBounds();
        kotlin.jvm.internal.m.d(upperBounds2, "getUpperBounds(...)");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            j10.e eVarG = ((e30.w) next).m0().g();
            j10.e eVar = eVarG instanceof j10.e ? eVarG : null;
            if (eVar != null && eVar.getKind() != j10.f.B && eVar.getKind() != j10.f.E) {
                obj = next;
                break;
            }
        }
        e30.w wVar = (e30.w) obj;
        if (wVar != null) {
            return wVar;
        }
        List upperBounds3 = r0Var.getUpperBounds();
        kotlin.jvm.internal.m.d(upperBounds3, "getUpperBounds(...)");
        Object objL0 = h00.q.L0(upperBounds3);
        kotlin.jvm.internal.m.d(objL0, "first(...)");
        return (e30.w) objL0;
    }

    public static final void h(int i10, int i11, int i12, b2.r rVar, l1.j jVar, int i13) throws NoWhenBranchMatchedException {
        b2.r rVarD;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-817697671);
        int i14 = i13 | (g0Var.e(i10) ? 4 : 2) | (g0Var.e(i11) ? 32 : 16) | (g0Var.e(i12) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var.g(rVar) ? 2048 : 1024);
        if (g0Var.S(i14 & 1, (i14 & 1171) != 1170)) {
            int iOrdinal = ((gm.a) g0Var.k(dl.e.a)).ordinal();
            b2.o oVar = b2.o.A;
            if (iOrdinal == 0) {
                rVarD = z1.d(oVar, 1.0f);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                rVarD = z1.q(oVar, 450);
            }
            b2.r rVarV = rVar.V(rVarD);
            v1 v1VarA = t1.a(h0.i.g(8), b2.b.J, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarV, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            x1 x1Var = x1.f6475a;
            g(g4.h0(2131231132, g0Var, 6), dl.a.Q, z3.U(g0Var, 2131886582), a0(g0Var, i10), x1Var.a(oVar), g0Var, 0);
            b2.r rVarA = x1Var.a(oVar);
            o2.f fVarH0 = g4.h0(2131231194, g0Var, 6);
            long j9 = dl.a.k;
            g(fVarH0, i2.t.b(0.5f, j9), z3.U(g0Var, 2131886585), a0(g0Var, i11), rVarA, g0Var, 0);
            g(g4.h0(2131231189, g0Var, 6), i2.t.b(0.5f, j9), z3.U(g0Var, 2131886583), String.format(Locale.ENGLISH, z3.U(g0Var, 2131887311), Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1)), x1Var.a(oVar), g0Var, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.p(i10, i11, i12, rVar, i13);
        }
    }

    public static final boolean h0(r0 r0Var, e30.m0 m0Var, Set set) {
        kotlin.jvm.internal.m.e(r0Var, "typeParameter");
        List<e30.w> upperBounds = r0Var.getUpperBounds();
        kotlin.jvm.internal.m.d(upperBounds, "getUpperBounds(...)");
        if (upperBounds.isEmpty()) {
            return false;
        }
        for (e30.w wVar : upperBounds) {
            kotlin.jvm.internal.m.b(wVar);
            if (F(wVar, r0Var.n().m0(), set) && (m0Var == null || kotlin.jvm.internal.m.a(wVar.m0(), m0Var))) {
                return true;
            }
        }
        return false;
    }

    public static final void i(ys.c cVar, u00.k kVar, l1.j jVar, int i10) {
        int i11;
        ys.c cVar2;
        l1.z0 z0Var;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(164729868);
        if ((i10 & 6) == 0) {
            i11 = i10 | (g0Var.e(cVar.ordinal()) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(kVar) ? 32 : 16;
        }
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            Object objN = g0Var.N();
            l1.c cVar3 = l1.i.f9868a;
            if (objN == cVar3) {
                objN = l1.q.z(Boolean.FALSE);
                g0Var.n0(objN);
            }
            l1.z0 z0Var2 = (l1.z0) objN;
            b2.o oVar = b2.o.A;
            b2.r rVarD = z1.d(oVar, 1.0f);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f2039f;
            l1.q.I(w0VarD, g0Var, fVar);
            b3.f fVar2 = b3.h.f2038e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.f2040g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.f2041h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.f2037d;
            l1.q.I(rVarC, g0Var, fVar4);
            w0 w0VarD2 = h0.o.d(b2.b.A, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(oVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD2, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            b2.r rVarF = z.n.f(f2.h.c(oVar, p0.f.a(32)), i2.t.b(0.15f, dl.a.i), i2.b0.f7111b);
            Object objN2 = g0Var.N();
            if (objN2 == cVar3) {
                objN2 = new ct.k(z0Var2, 0);
                g0Var.n0(objN2);
            }
            b2.r rVarO = w50.c.o(rVarF, false, (j3.k) null, (u00.a) objN2, 7);
            float f3 = 12;
            b2.r rVarD2 = h0.c.D(rVarO, f3, 6);
            v1 v1VarA = t1.a(h0.i.g(4), b2.b.K, g0Var, 54);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC3 = b2.a.c(rVarD2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, fVar);
            l1.q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar4);
            z6.b(z3.U(g0Var, cVar.A), null, dl.a.n, kh.o.z(15), q3.u.K, null, 0L, null, null, kh.o.z(15), 0, false, 0, 0, null, null, g0Var, 1597440, 48, 260010);
            g0Var = g0Var;
            z3.j(y3.R(2131231074, g0Var, 0), null, z1.m(oVar, f3), i2.t.b(0.5f, dl.a.k), g0Var, 440, 0);
            g0Var.r(true);
            boolean zBooleanValue = ((Boolean) z0Var2.getValue()).booleanValue();
            long j9 = dl.a.K;
            p0.e eVarA = p0.f.a(16);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0)) << 32) | (((long) Float.floatToRawIntBits(10)) & 4294967295L);
            Object objN3 = g0Var.N();
            if (objN3 == cVar3) {
                z0Var = z0Var2;
                objN3 = new ct.k(z0Var, 1);
                g0Var.n0(objN3);
            } else {
                z0Var = z0Var2;
            }
            cVar2 = cVar;
            jl.c.b(zBooleanValue, (u00.a) objN3, j9, eVarA, (b2.r) null, jFloatToRawIntBits, true, (c4.c0) null, v1.d.d(1043546861, new az.j(2, cVar, z0Var, kVar), g0Var), g0Var, 102432816, 144);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            cVar2 = cVar;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.l(cVar2, kVar, i10, 1);
        }
    }

    public static final void j(b2.r rVar, l1.j jVar, int i10, int i11) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-643362801);
        int i12 = (g0Var.e(i10) ? 4 : 2) | i11;
        if (g0Var.S(i12 & 1, (i12 & 19) != 18)) {
            h0.v vVarA = h0.u.a(h0.i.g(4), b2.b.N, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVar, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            long jZ = kh.o.z(64);
            q3.u uVar = q3.u.M;
            long j9 = dl.a.n;
            va.a.a(i10, jZ, uVar, j9, null, g0Var, (i12 & 14) | 432);
            z6.b(z3.U(g0Var, 2131886584), null, j9, kh.o.z(40), uVar, null, 0L, null, null, kh.o.z(40), 0, false, 0, 0, null, null, g0Var, 1597440, 48, 260010);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new bs.h(i10, rVar, i11, 2);
        }
    }

    public static boolean j0(int i10) {
        return i10 != 0 && q4.a.d(i10) > 0.5d;
    }

    public static final e1.u k(f4 f4Var, e1.h hVar) {
        e1.i iVarI = f4Var.i();
        androidx.media3.common.k kVar = (androidx.media3.common.k) f4Var.D;
        boolean z10 = iVarI == e1.i.A;
        return new e1.u(m(kVar, z10, true, hVar), m(kVar, z10, false, hVar), z10);
    }

    public static int k0(float f3, int i10, int i11) {
        return q4.a.f(q4.a.h(i11, Math.round(Color.alpha(i11) * f3)), i10);
    }

    public static final e1.t l(final f4 f4Var, final androidx.media3.common.k kVar, e1.t tVar) throws NoWhenBranchMatchedException {
        e1.i iVar;
        int i10 = kVar.f1299c;
        int i11 = kVar.f1298b;
        boolean z10 = f4Var.B;
        final int i12 = z10 ? i11 : i10;
        n0 n0Var = (n0) kVar.f1301e;
        int i13 = kVar.f1300d;
        g00.i iVar2 = g00.i.C;
        final g00.h hVarI = rd.a.I(iVar2, new e1.w(kVar, i12, 0));
        final int i14 = z10 ? i10 : i11;
        g00.h hVarI2 = rd.a.I(iVar2, new u00.a() {
            public final Object invoke() {
                androidx.media3.common.k kVar2 = kVar;
                m3.n0 n0Var2 = (m3.n0) kVar2.f1301e;
                int iIntValue = ((Number) hVarI.getValue()).intValue();
                f4 f4Var2 = f4Var;
                boolean z11 = f4Var2.B;
                boolean z12 = f4Var2.i() == i.A;
                int i15 = i12;
                long jK = n0Var2.k(i15);
                m3.q qVar = n0Var2.f10497b;
                int i16 = m3.q0.f10519c;
                int iH = (int) (jK >> 32);
                int iD = qVar.d(iH);
                int i17 = qVar.f10515f;
                if (iD != iIntValue) {
                    iH = iIntValue >= i17 ? n0Var2.h(i17 - 1) : n0Var2.h(iIntValue);
                }
                int iC = (int) (jK & 4294967295L);
                if (qVar.d(iC) != iIntValue) {
                    iC = iIntValue >= i17 ? qVar.c(i17 - 1, false) : qVar.c(iIntValue, false);
                }
                int i18 = i14;
                if (iH == i18) {
                    return kVar2.a(iC);
                }
                if (iC == i18) {
                    return kVar2.a(iH);
                }
                if (!(z11 ^ z12) ? i15 >= iH : i15 > iC) {
                    iH = iC;
                }
                return kVar2.a(iH);
            }
        });
        if (1 != tVar.f4999c) {
            return (e1.t) hVarI2.getValue();
        }
        if (i12 == i13) {
            return tVar;
        }
        if (((Number) hVarI.getValue()).intValue() != n0Var.f10497b.d(i13)) {
            return (e1.t) hVarI2.getValue();
        }
        int i15 = tVar.f4998b;
        long jK = n0Var.k(i15);
        if (i13 != -1) {
            if (i12 != i13) {
                if (i11 < i10) {
                    iVar = e1.i.B;
                } else {
                    iVar = i11 > i10 ? e1.i.A : e1.i.C;
                }
                if (((z10 ? 1 : 0) ^ (iVar == e1.i.A ? 1 : 0)) == 0) {
                }
            }
            return kVar.a(i12);
        }
        int i16 = q0.f10519c;
        return (i15 == ((int) (jK >> 32)) || i15 == ((int) (jK & 4294967295L))) ? (e1.t) hVarI2.getValue() : kVar.a(i12);
    }

    public static void l0(Intent intent) {
        int iIntValue;
        int i10;
        String string;
        pj.b bVar;
        String string2;
        char c10;
        int i11;
        int i12;
        String string3;
        String str;
        String string4;
        String str2;
        String string5;
        String str3;
        String string6;
        String str4;
        String string7;
        String str5;
        long j9;
        long j10;
        pj.d dVar;
        String str6;
        String str7;
        String[] strArrSplit;
        String str8;
        if (C0(intent)) {
            m0("_nr", intent.getExtras());
        }
        int i13 = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : W()) {
            ud.f fVar = (ud.f) FirebaseMessaging.l.get();
            if (fVar == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            if (intent == null) {
                dVar = null;
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            iIntValue = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                            i10 = 0;
                        }
                    }
                    i10 = 0;
                    string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            bi.g gVarC = bi.g.c();
                            Object obj2 = jj.c.m;
                            string = (String) Tasks.await(((jj.c) gVarC.b(jj.d.class)).c());
                        } catch (InterruptedException | ExecutionException e3) {
                            throw new RuntimeException(e3);
                        }
                    }
                    String str9 = string;
                    bi.g gVarC2 = bi.g.c();
                    gVarC2.a();
                    String packageName = gVarC2.f2531a.getPackageName();
                    if (o9.q.P(extras)) {
                        bVar = pj.b.DISPLAY_NOTIFICATION;
                    } else {
                        bVar = pj.b.DATA_MESSAGE;
                    }
                    pj.b bVar2 = bVar;
                    string2 = extras.getString("google.delivered_priority");
                    if (string2 != null) {
                        if ("high".equals(string2)) {
                            c10 = 1;
                        } else if ("normal".equals(string2)) {
                            c10 = 2;
                        } else {
                            c10 = 0;
                        }
                    } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                        c10 = 2;
                    } else {
                        string2 = extras.getString("google.priority");
                        if ("high".equals(string2)) {
                            c10 = 1;
                        } else if ("normal".equals(string2)) {
                            c10 = 2;
                        } else {
                            c10 = 0;
                        }
                    }
                    if (c10 == 2) {
                        i12 = 5;
                    } else {
                        if (c10 == 1) {
                            i12 = 10;
                        } else {
                            i11 = 0;
                        }
                        string3 = extras.getString("google.message_id");
                        if (string3 == null) {
                            string3 = extras.getString("message_id");
                        }
                        if (string3 != null) {
                            str = string3;
                        } else {
                            str = RuntimeVersion.SUFFIX;
                        }
                        string4 = extras.getString("from");
                        if (string4 != null || !string4.startsWith("/topics/")) {
                            string4 = null;
                        }
                        if (string4 != null) {
                            str2 = string4;
                        } else {
                            str2 = RuntimeVersion.SUFFIX;
                        }
                        string5 = extras.getString("collapse_key");
                        if (string5 != null) {
                            str3 = string5;
                        } else {
                            str3 = RuntimeVersion.SUFFIX;
                        }
                        string6 = extras.getString("google.c.a.m_l");
                        if (string6 != null) {
                            str4 = string6;
                        } else {
                            str4 = RuntimeVersion.SUFFIX;
                        }
                        string7 = extras.getString("google.c.a.c_l");
                        if (string7 != null) {
                            str5 = string7;
                        } else {
                            str5 = RuntimeVersion.SUFFIX;
                        }
                        if (extras.containsKey("google.c.sender.id")) {
                            try {
                                j9 = Long.parseLong(extras.getString("google.c.sender.id"));
                            } catch (NumberFormatException e10) {
                                Log.w("FirebaseMessaging", "error parsing project number", e10);
                                bi.g gVarC3 = bi.g.c();
                                bi.i iVar = gVarC3.f2533c;
                                gVarC3.a();
                                str6 = iVar.f2545e;
                                if (str6 != null) {
                                    try {
                                        j9 = Long.parseLong(str6);
                                    } catch (NumberFormatException e11) {
                                        Log.w("FirebaseMessaging", "error parsing sender ID", e11);
                                        gVarC3.a();
                                        str7 = iVar.f2542b;
                                        if (str7.startsWith("1:")) {
                                            strArrSplit = str7.split(":");
                                            if (strArrSplit.length < 2) {
                                                j9 = 0;
                                            } else {
                                                str8 = strArrSplit[1];
                                                if (str8.isEmpty()) {
                                                    j9 = 0;
                                                } else {
                                                    try {
                                                        j9 = Long.parseLong(str8);
                                                    } catch (NumberFormatException e12) {
                                                        Log.w("FirebaseMessaging", "error parsing app ID", e12);
                                                        j9 = 0;
                                                    }
                                                }
                                            }
                                        } else {
                                            try {
                                                j9 = Long.parseLong(str7);
                                            } catch (NumberFormatException e13) {
                                                Log.w("FirebaseMessaging", "error parsing app ID", e13);
                                                j9 = 0;
                                            }
                                        }
                                    }
                                }
                                gVarC3.a();
                                str7 = iVar.f2542b;
                                if (str7.startsWith("1:")) {
                                    j9 = Long.parseLong(str7);
                                } else {
                                    strArrSplit = str7.split(":");
                                    if (strArrSplit.length < 2) {
                                        j9 = 0;
                                    } else {
                                        str8 = strArrSplit[1];
                                        if (str8.isEmpty()) {
                                            j9 = 0;
                                        } else {
                                            j9 = Long.parseLong(str8);
                                        }
                                    }
                                }
                            }
                        } else {
                            bi.g gVarC4 = bi.g.c();
                            bi.i iVar2 = gVarC4.f2533c;
                            gVarC4.a();
                            str6 = iVar2.f2545e;
                            if (str6 != null) {
                                j9 = Long.parseLong(str6);
                            }
                            gVarC4.a();
                            str7 = iVar2.f2542b;
                            if (str7.startsWith("1:")) {
                                j9 = Long.parseLong(str7);
                            } else {
                                strArrSplit = str7.split(":");
                                if (strArrSplit.length < 2) {
                                    j9 = 0;
                                } else {
                                    str8 = strArrSplit[1];
                                    if (str8.isEmpty()) {
                                        j9 = 0;
                                    } else {
                                        j9 = Long.parseLong(str8);
                                    }
                                }
                            }
                        }
                        if (j9 > 0) {
                            j10 = j9;
                        } else {
                            j10 = 0;
                        }
                        dVar = new pj.d(j10, str, str9, bVar2, packageName, str3, i11, i10, str2, str4, str5);
                    }
                    i11 = i12;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                        string3 = extras.getString("message_id");
                    }
                    if (string3 != null) {
                        str = string3;
                    } else {
                        str = RuntimeVersion.SUFFIX;
                    }
                    string4 = extras.getString("from");
                    if (string4 != null) {
                        string4 = null;
                    } else {
                        string4 = null;
                    }
                    if (string4 != null) {
                        str2 = string4;
                    } else {
                        str2 = RuntimeVersion.SUFFIX;
                    }
                    string5 = extras.getString("collapse_key");
                    if (string5 != null) {
                        str3 = string5;
                    } else {
                        str3 = RuntimeVersion.SUFFIX;
                    }
                    string6 = extras.getString("google.c.a.m_l");
                    if (string6 != null) {
                        str4 = string6;
                    } else {
                        str4 = RuntimeVersion.SUFFIX;
                    }
                    string7 = extras.getString("google.c.a.c_l");
                    if (string7 != null) {
                        str5 = string7;
                    } else {
                        str5 = RuntimeVersion.SUFFIX;
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                        j9 = Long.parseLong(extras.getString("google.c.sender.id"));
                    } else {
                        bi.g gVarC5 = bi.g.c();
                        bi.i iVar3 = gVarC5.f2533c;
                        gVarC5.a();
                        str6 = iVar3.f2545e;
                        if (str6 != null) {
                            j9 = Long.parseLong(str6);
                        }
                        gVarC5.a();
                        str7 = iVar3.f2542b;
                        if (str7.startsWith("1:")) {
                            j9 = Long.parseLong(str7);
                        } else {
                            strArrSplit = str7.split(":");
                            if (strArrSplit.length < 2) {
                                j9 = 0;
                            } else {
                                str8 = strArrSplit[1];
                                if (str8.isEmpty()) {
                                    j9 = 0;
                                } else {
                                    j9 = Long.parseLong(str8);
                                }
                            }
                        }
                    }
                    if (j9 > 0) {
                        j10 = j9;
                    } else {
                        j10 = 0;
                    }
                    dVar = new pj.d(j10, str, str9, bVar2, packageName, str3, i11, i10, str2, str4, str5);
                }
                i10 = iIntValue;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    bi.g gVarC6 = bi.g.c();
                    Object obj3 = jj.c.m;
                    string = (String) Tasks.await(((jj.c) gVarC6.b(jj.d.class)).c());
                }
                String str10 = string;
                bi.g gVarC7 = bi.g.c();
                gVarC7.a();
                String packageName2 = gVarC7.f2531a.getPackageName();
                if (o9.q.P(extras)) {
                    bVar = pj.b.DISPLAY_NOTIFICATION;
                } else {
                    bVar = pj.b.DATA_MESSAGE;
                }
                pj.b bVar3 = bVar;
                string2 = extras.getString("google.delivered_priority");
                if (string2 != null) {
                    if ("high".equals(string2)) {
                        c10 = 1;
                    } else if ("normal".equals(string2)) {
                        c10 = 2;
                    } else {
                        c10 = 0;
                    }
                } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                    c10 = 2;
                } else {
                    string2 = extras.getString("google.priority");
                    if ("high".equals(string2)) {
                        c10 = 1;
                    } else if ("normal".equals(string2)) {
                        c10 = 2;
                    } else {
                        c10 = 0;
                    }
                }
                if (c10 == 2) {
                    i12 = 5;
                } else {
                    if (c10 == 1) {
                        i12 = 10;
                    } else {
                        i11 = 0;
                    }
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                        string3 = extras.getString("message_id");
                    }
                    if (string3 != null) {
                        str = string3;
                    } else {
                        str = RuntimeVersion.SUFFIX;
                    }
                    string4 = extras.getString("from");
                    if (string4 != null) {
                        string4 = null;
                    } else {
                        string4 = null;
                    }
                    if (string4 != null) {
                        str2 = string4;
                    } else {
                        str2 = RuntimeVersion.SUFFIX;
                    }
                    string5 = extras.getString("collapse_key");
                    if (string5 != null) {
                        str3 = string5;
                    } else {
                        str3 = RuntimeVersion.SUFFIX;
                    }
                    string6 = extras.getString("google.c.a.m_l");
                    if (string6 != null) {
                        str4 = string6;
                    } else {
                        str4 = RuntimeVersion.SUFFIX;
                    }
                    string7 = extras.getString("google.c.a.c_l");
                    if (string7 != null) {
                        str5 = string7;
                    } else {
                        str5 = RuntimeVersion.SUFFIX;
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                        j9 = Long.parseLong(extras.getString("google.c.sender.id"));
                    } else {
                        bi.g gVarC8 = bi.g.c();
                        bi.i iVar4 = gVarC8.f2533c;
                        gVarC8.a();
                        str6 = iVar4.f2545e;
                        if (str6 != null) {
                            j9 = Long.parseLong(str6);
                        }
                        gVarC8.a();
                        str7 = iVar4.f2542b;
                        if (str7.startsWith("1:")) {
                            j9 = Long.parseLong(str7);
                        } else {
                            strArrSplit = str7.split(":");
                            if (strArrSplit.length < 2) {
                                j9 = 0;
                            } else {
                                str8 = strArrSplit[1];
                                if (str8.isEmpty()) {
                                    j9 = 0;
                                } else {
                                    j9 = Long.parseLong(str8);
                                }
                            }
                        }
                    }
                    if (j9 > 0) {
                        j10 = j9;
                    } else {
                        j10 = 0;
                    }
                    dVar = new pj.d(j10, str, str10, bVar3, packageName2, str3, i11, i10, str2, str4, str5);
                }
                i11 = i12;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                    string3 = extras.getString("message_id");
                }
                if (string3 != null) {
                    str = string3;
                } else {
                    str = RuntimeVersion.SUFFIX;
                }
                string4 = extras.getString("from");
                if (string4 != null) {
                    string4 = null;
                } else {
                    string4 = null;
                }
                if (string4 != null) {
                    str2 = string4;
                } else {
                    str2 = RuntimeVersion.SUFFIX;
                }
                string5 = extras.getString("collapse_key");
                if (string5 != null) {
                    str3 = string5;
                } else {
                    str3 = RuntimeVersion.SUFFIX;
                }
                string6 = extras.getString("google.c.a.m_l");
                if (string6 != null) {
                    str4 = string6;
                } else {
                    str4 = RuntimeVersion.SUFFIX;
                }
                string7 = extras.getString("google.c.a.c_l");
                if (string7 != null) {
                    str5 = string7;
                } else {
                    str5 = RuntimeVersion.SUFFIX;
                }
                if (extras.containsKey("google.c.sender.id")) {
                    j9 = Long.parseLong(extras.getString("google.c.sender.id"));
                } else {
                    bi.g gVarC9 = bi.g.c();
                    bi.i iVar5 = gVarC9.f2533c;
                    gVarC9.a();
                    str6 = iVar5.f2545e;
                    if (str6 != null) {
                        j9 = Long.parseLong(str6);
                    }
                    gVarC9.a();
                    str7 = iVar5.f2542b;
                    if (str7.startsWith("1:")) {
                        j9 = Long.parseLong(str7);
                    } else {
                        strArrSplit = str7.split(":");
                        if (strArrSplit.length < 2) {
                            j9 = 0;
                        } else {
                            str8 = strArrSplit[1];
                            if (str8.isEmpty()) {
                                j9 = 0;
                            } else {
                                j9 = Long.parseLong(str8);
                            }
                        }
                    }
                }
                if (j9 > 0) {
                    j10 = j9;
                } else {
                    j10 = 0;
                }
                dVar = new pj.d(j10, str, str10, bVar3, packageName2, str3, i11, i10, str2, str4, str5);
            }
            if (dVar == null) {
                return;
            }
            try {
                ((xd.o) fVar).a("FCM_CLIENT_EVENT_LOGGING", new ud.c("proto"), new oj.l(i13)).D(new ud.a(null, new pj.e(dVar), ud.d.A, new ud.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new uh.k(13));
            } catch (RuntimeException e14) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e14);
            }
        }
    }

    public static final e1.t m(androidx.media3.common.k kVar, boolean z10, boolean z11, e1.h hVar) {
        long j9;
        long jA = hVar.a(kVar, z11 ? kVar.f1298b : kVar.f1299c);
        if (z10 ^ z11) {
            int i10 = q0.f10519c;
            j9 = jA >> 32;
        } else {
            int i11 = q0.f10519c;
            j9 = 4294967295L & jA;
        }
        return kVar.a((int) j9);
    }

    public static void m0(String str, Bundle bundle) {
        try {
            bi.g.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e3) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e3);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e10);
                }
            }
            String str2 = o9.q.P(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            fi.b bVar = (fi.b) bi.g.c().b(fi.b.class);
            if (bVar != null) {
                ((fi.c) bVar).a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static void n(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final e30.z0 n0(e30.w wVar) {
        kotlin.jvm.internal.m.e(wVar, "<this>");
        e30.z0 z0VarG = x0.g(wVar, true);
        kotlin.jvm.internal.m.d(z0VarG, "makeNullable(...)");
        return z0VarG;
    }

    public static final boolean o(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        kotlin.jvm.internal.m.e(bArr, "a");
        kotlin.jvm.internal.m.e(bArr2, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static int o0(Object obj, z0 z0Var, byte[] bArr, int i10, int i11, int i12, androidx.glance.appwidget.protobuf.d dVar) throws InvalidProtocolBufferException {
        androidx.glance.appwidget.protobuf.q0 q0Var = (androidx.glance.appwidget.protobuf.q0) z0Var;
        int i13 = dVar.f884d + 1;
        dVar.f884d = i13;
        if (i13 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iA = q0Var.A(obj, bArr, i10, i11, i12, dVar);
        dVar.f884d--;
        dVar.f883c = obj;
        return iA;
    }

    public static final e30.f0 p(e30.w wVar) {
        kotlin.jvm.internal.m.e(wVar, "<this>");
        return new e30.f0(wVar);
    }

    public static int p0(Object obj, z0 z0Var, byte[] bArr, int i10, int i11, androidx.glance.appwidget.protobuf.d dVar) throws InvalidProtocolBufferException {
        int iQ = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iQ = Q(i12, bArr, iQ, dVar);
            i12 = dVar.f881a;
        }
        int i13 = iQ;
        if (i12 < 0 || i12 > i11 - i13) {
            throw InvalidProtocolBufferException.g();
        }
        int i14 = dVar.f884d + 1;
        dVar.f884d = i14;
        if (i14 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i15 = i13 + i12;
        z0Var.e(obj, bArr, i13, i15, dVar);
        dVar.f884d--;
        dVar.f883c = obj;
        return i15;
    }

    public static final Object q(kh.v vVar, m00.c cVar) throws Throwable {
        try {
            if (vVar.isDone()) {
                return d4.g.h(vVar);
            }
            a40.k kVar = new a40.k(1, s0.j0(cVar));
            vVar.a(new com.google.android.gms.internal.play_billing.r0(vVar, kVar, 5), d4.l.A);
            kVar.u(new b3.a(vVar, 12));
            Object objQ = kVar.q();
            l00.a aVar = l00.a.A;
            return objQ;
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause != null) {
                throw cause;
            }
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
            kotlin.jvm.internal.m.j(kotlinNullPointerException, kotlin.jvm.internal.m.class.getName());
            throw kotlinNullPointerException;
        }
    }

    public static final long q0(z00.g gVar) {
        x00.c cVar = x00.d.A;
        long j9 = gVar.A;
        if (gVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + gVar);
        }
        long j10 = gVar.B;
        if (j10 < Long.MAX_VALUE) {
            return x00.d.B.e(j9, j10 + 1);
        }
        if (j9 <= Long.MIN_VALUE) {
            return x00.d.B.d();
        }
        return x00.d.B.e(j9 - 1, j10) + 1;
    }

    public static jc.a r0(nc.d dVar, cc.a aVar) {
        return new jc.a(0, mc.p.a(dVar, aVar, 1.0f, mc.f.B, false));
    }

    public static long s(boolean z10, int i10, za.a aVar, long j9, long j10, int i11, boolean z11, long j11, long j12, long j13, long j14) {
        kotlin.jvm.internal.m.e(aVar, "backoffPolicy");
        if (j14 != Long.MAX_VALUE && z11) {
            if (i11 != 0) {
                long j15 = j10 + 900000;
                if (j14 < j15) {
                    return j15;
                }
            }
            return j14;
        }
        if (z10) {
            long jScalb = aVar == za.a.B ? j9 * ((long) i10) : (long) Math.scalb(j9, i10 - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j10 + jScalb;
        }
        if (z11) {
            long j16 = i11 == 0 ? j10 + j11 : j10 + j13;
            return (j12 == j13 || i11 != 0) ? j16 : (j13 - j12) + j16;
        }
        if (j10 == -1) {
            return Long.MAX_VALUE;
        }
        return j10 + j11;
    }

    public static jc.b s0(nc.c cVar, cc.a aVar, boolean z10) {
        return new jc.b(mc.p.a(cVar, aVar, z10 ? oc.e.c() : 1.0f, mc.f.C, false), 2);
    }

    public static final e1.t t(e1.t tVar, androidx.media3.common.k kVar, int i10) {
        return new e1.t(((n0) kVar.f1301e).a(i10), i10, tVar.f4999c);
    }

    public static jc.a t0(nc.d dVar, cc.a aVar, int i10) {
        com.google.android.gms.internal.cast.o oVar = new com.google.android.gms.internal.cast.o();
        oVar.A = i10;
        ArrayList arrayListA = mc.p.a(dVar, aVar, 1.0f, oVar, false);
        for (int i11 = 0; i11 < arrayListA.size(); i11++) {
            pc.a aVar2 = (pc.a) arrayListA.get(i11);
            kc.c cVar = (kc.c) aVar2.f12475b;
            kc.c cVar2 = (kc.c) aVar2.f12476c;
            if (cVar != null && cVar2 != null) {
                float[] fArr = cVar.f9586a;
                int length = fArr.length;
                float[] fArr2 = cVar2.f9586a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f3 = Float.NaN;
                    int i12 = 0;
                    for (int i13 = 0; i13 < length2; i13++) {
                        float f10 = fArr3[i13];
                        if (f10 != f3) {
                            fArr3[i12] = f10;
                            i12++;
                            f3 = fArr3[i13];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i12);
                    aVar2 = new pc.a(cVar.a(fArrCopyOfRange), cVar2.a(fArrCopyOfRange));
                }
            }
            arrayListA.set(i11, aVar2);
        }
        return new jc.a(1, arrayListA);
    }

    public static final void u(long j9, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j9 || j9 - j10 < j11) {
            StringBuilder sbN = w.c.n("size=", j9, " offset=");
            sbN.append(j10);
            sbN.append(" byteCount=");
            sbN.append(j11);
            throw new ArrayIndexOutOfBoundsException(sbN.toString());
        }
    }

    public static jc.a u0(nc.d dVar, cc.a aVar) {
        return new jc.a(2, mc.p.a(dVar, aVar, 1.0f, mc.f.D, false));
    }

    public static Comparable v(y3.f fVar, y3.f fVar2) {
        return fVar.compareTo(fVar2) < 0 ? fVar2 : fVar;
    }

    public static jc.a v0(nc.d dVar, cc.a aVar) {
        return new jc.a(3, mc.p.a(dVar, aVar, oc.e.c(), mc.f.F, true));
    }

    public static double w(double d3, double d5, double d10) {
        if (d5 <= d10) {
            if (d3 < d5) {
                return d5;
            }
            return d3 > d10 ? d10 : d3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d10 + " is less than minimum " + d5 + '.');
    }

    public static void w0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static float x(float f3, float f10, float f11) {
        if (f10 <= f11) {
            if (f3 < f10) {
                return f10;
            }
            return f3 > f11 ? f11 : f3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f11 + " is less than minimum " + f10 + '.');
    }

    public static final ArrayList x0(List list, List list2, l1.j jVar, int i10) {
        List list3;
        l1.j jVar2;
        ArrayList arrayList;
        l1.g0 g0Var = (l1.g0) jVar;
        Object objN = g0Var.N();
        l1.c cVar = l1.i.f9868a;
        if (objN == cVar) {
            objN = new LinkedHashSet();
            g0Var.n0(objN);
        }
        Set set = (Set) objN;
        Object objN2 = g0Var.N();
        if (objN2 == cVar) {
            objN2 = new LinkedHashSet();
            g0Var.n0(objN2);
        }
        Set set2 = (Set) objN2;
        g0Var.c0(110758886);
        if (list instanceof RandomAccess) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            int i11 = 0;
            while (i11 < size) {
                List list4 = list2;
                arrayList.add(U((p9.e) list.get(i11), list4, set, set2, jVar, i10 & 112));
                i11++;
                list2 = list4;
            }
            list3 = list2;
            jVar2 = jVar;
        } else {
            list3 = list2;
            jVar2 = jVar;
            arrayList = new ArrayList(h00.r.q0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(U((p9.e) it.next(), list3, set, set2, jVar2, i10 & 112));
            }
        }
        ArrayList arrayList2 = arrayList;
        g0Var.r(false);
        f(arrayList2, list3, set, set2, jVar2, i10 & 112);
        return arrayList2;
    }

    public static int y(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            return i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static final e30.w y0(e30.w wVar, k10.h hVar) {
        return (wVar.getAnnotations().isEmpty() && hVar.isEmpty()) ? wVar : wVar.y0().B0(e30.c.s(wVar.k0(), hVar));
    }

    public static int z(int i10, z00.e eVar) {
        int i11 = ((z00.c) eVar).B;
        int i12 = ((z00.c) eVar).A;
        if (!eVar.isEmpty()) {
            if (i10 < Integer.valueOf(i12).intValue()) {
                return Integer.valueOf(i12).intValue();
            }
            return i10 > Integer.valueOf(i11).intValue() ? Integer.valueOf(i11).intValue() : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + eVar + '.');
    }

    public static final e30.z0 z0(e30.w wVar) throws NoWhenBranchMatchedException {
        e30.z0 z0VarR;
        kotlin.jvm.internal.m.e(wVar, "<this>");
        e30.q qVarY0 = wVar.y0();
        if (qVarY0 instanceof e30.q) {
            e30.q qVar = qVarY0;
            e30.a0 a0VarR = qVar.B;
            if (!a0VarR.m0().getParameters().isEmpty() && a0VarR.m0().g() != null) {
                List parameters = a0VarR.m0().getParameters();
                kotlin.jvm.internal.m.d(parameters, "getParameters(...)");
                ArrayList arrayList = new ArrayList(h00.r.q0(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new e30.f0((r0) it.next()));
                }
                a0VarR = e30.c.r(a0VarR, arrayList, (e30.h0) null, 2);
            }
            e30.a0 a0VarR2 = qVar.C;
            if (!a0VarR2.m0().getParameters().isEmpty() && a0VarR2.m0().g() != null) {
                List parameters2 = a0VarR2.m0().getParameters();
                kotlin.jvm.internal.m.d(parameters2, "getParameters(...)");
                ArrayList arrayList2 = new ArrayList(h00.r.q0(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new e30.f0((r0) it2.next()));
                }
                a0VarR2 = e30.c.r(a0VarR2, arrayList2, (e30.h0) null, 2);
            }
            z0VarR = e30.c.f(a0VarR, a0VarR2);
        } else {
            if (!(qVarY0 instanceof e30.a0)) {
                throw new NoWhenBranchMatchedException();
            }
            z0VarR = (e30.a0) qVarY0;
            if (!z0VarR.m0().getParameters().isEmpty() && z0VarR.m0().g() != null) {
                List parameters3 = z0VarR.m0().getParameters();
                kotlin.jvm.internal.m.d(parameters3, "getParameters(...)");
                ArrayList arrayList3 = new ArrayList(h00.r.q0(parameters3, 10));
                Iterator it3 = parameters3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new e30.f0((r0) it3.next()));
                }
                z0VarR = e30.c.r(z0VarR, arrayList3, (e30.h0) null, 2);
            }
        }
        return e30.c.i(z0VarR, qVarY0);
    }

    public abstract String J();

    public void i0(ma.a aVar, Object obj) {
        kotlin.jvm.internal.m.e(aVar, "connection");
        if (obj == null) {
            return;
        }
        ma.c cVarK0 = aVar.k0(J());
        try {
            r(cVarK0, obj);
            cVarK0.d0();
            ca.v.s(cVarK0, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ca.v.s(cVarK0, th2);
                throw th3;
            }
        }
    }

    public abstract void r(ma.c cVar, Object obj);
}

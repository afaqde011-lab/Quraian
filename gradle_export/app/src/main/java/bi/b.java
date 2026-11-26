package bi;

import a1.e1;
import a40.l1;
import a40.z;
import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.os.Binder;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.f1;
import b1.l;
import b20.d0;
import c3.o0;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.z3;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import d0.g3;
import e1.a0;
import e30.w;
import g00.b0;
import g1.m6;
import g1.p2;
import g1.t4;
import g1.z6;
import h0.c1;
import h0.u;
import h0.v1;
import h0.z1;
import hb.p;
import i2.t;
import j10.n0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.logging.Logger;
import k50.c0;
import k50.h0;
import k50.k0;
import k50.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.v;
import l1.g0;
import l1.j;
import l1.m1;
import l1.r1;
import l1.z0;
import m3.r0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qd.s0;
import r30.k;
import ri.t1;
import sm.j0;
import v2.i0;
import v2.r;
import v2.s;
import wj.q;
import wj.x0;
import x20.n;
import y3.o;
import z2.w0;

public abstract class b {

    public static x0 f2522a;

    public static final long A(Context context, String str, float f3, long j9, long j10) {
        m.e(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f10 = f3 * displayMetrics.density;
        Paint paint = new Paint();
        float fC = o.c(j9);
        while (fC > o.c(j10)) {
            paint.setTextSize(displayMetrics.scaledDensity * fC);
            if (paint.measureText(str) <= f10) {
                break;
            }
            fC -= 0.5f;
        }
        return kh.o.F(fC, 4294967296L);
    }

    public static int B(byte b7, byte b10, byte b11, byte b12) {
        return (b7 << 24) | ((b10 & 255) << 16) | ((b11 & 255) << 8) | (b12 & 255);
    }

    public static final hb.i C(p pVar) {
        m.e(pVar, "<this>");
        return new hb.i(pVar.f7004a, pVar.f7021t);
    }

    public static final d0 D(j10.e eVar) {
        j10.e eVar2;
        m.e(eVar, "<this>");
        int i10 = u20.d.a;
        Iterator it = eVar.n().m0().l().iterator();
        while (true) {
            if (!it.hasNext()) {
                eVar2 = null;
                break;
            }
            w wVar = (w) it.next();
            if (!g10.i.y(wVar)) {
                j10.h hVarG = wVar.m0().g();
                int i11 = q20.d.a;
                if (q20.d.l(hVarG, j10.f.A) || q20.d.l(hVarG, j10.f.C)) {
                    m.c(hVarG, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    eVar2 = (j10.e) hVarG;
                    break;
                }
            }
        }
        if (eVar2 == null) {
            return null;
        }
        n nVarK = eVar2.K();
        d0 d0Var = nVarK instanceof d0 ? (d0) nVarK : null;
        return d0Var == null ? D(eVar2) : d0Var;
    }

    public static final ViewParent E(View view) {
        m.e(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(2131363127);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final String F(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("error")) {
            return RuntimeVersion.SUFFIX;
        }
        String string = jSONObject.getString("error");
        m.d(string, "getString(...)");
        return string;
    }

    public static void G(final Context context) {
        final boolean z10;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (c7.i.D(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            z10 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), Cast.MAX_NAMESPACE_LENGTH)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
        }
        final xf.g gVar = new xf.g();
        new Runnable() {
            @Override
            public final void run() {
                Context context2 = context;
                xf.g gVar2 = gVar;
                try {
                    if (!(Binder.getCallingUid() == context2.getApplicationInfo().uid)) {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                        return;
                    }
                    SharedPreferences.Editor editorEdit = c7.i.D(context2).edit();
                    editorEdit.putBoolean("proxy_notification_initialized", true);
                    editorEdit.apply();
                    NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                    if (z10) {
                        notificationManager.setNotificationDelegate("com.google.android.gms");
                    } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                        notificationManager.setNotificationDelegate(null);
                    }
                } finally {
                    gVar2.d(null);
                }
            }
        }.run();
    }

    public static final boolean H(AssertionError assertionError) {
        Logger logger = x.a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? k.A0(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    public static final Object I(i0 i0Var, e1.m mVar, c50.h hVar, v2.k kVar, m00.a aVar) {
        a0 a0Var;
        du.w wVar;
        i0 i0Var2;
        v vVar;
        ?? r10;
        int size;
        s sVar;
        ?? r11;
        int size2;
        s sVar2;
        du.w wVar2 = e1.v.f5009d;
        if (aVar instanceof a0) {
            a0Var = (a0) aVar;
            int i10 = a0Var.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                a0Var.E = i10 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(aVar);
            }
        } else {
            a0Var = new a0(aVar);
        }
        Object objF = a0Var.D;
        l00.a aVar2 = l00.a.A;
        int i11 = a0Var.E;
        int i12 = 0;
        try {
            try {
                if (i11 == 0) {
                    t1.O(objF);
                    s sVar3 = (s) kVar.f15387a.get(0);
                    if ((kVar.f15391e & 1) == 0) {
                        int i13 = hVar.B;
                        if (i13 != 1) {
                            wVar = i13 != 2 ? e1.v.f5012g : e1.v.f5011f;
                        } else {
                            wVar = wVar2;
                        }
                        if (mVar.e(sVar3.f15401c, wVar, i13)) {
                            v vVar2 = new v();
                            vVar2.A = !wVar.equals(wVar2);
                            long j9 = sVar3.f15399a;
                            l lVar = new l(mVar, wVar, vVar2, 7);
                            a0Var.A = i0Var;
                            a0Var.B = mVar;
                            a0Var.C = vVar2;
                            a0Var.E = 2;
                            objF = d0.i0.f(i0Var, j9, lVar, a0Var);
                            if (objF != aVar2) {
                                i0Var2 = i0Var;
                                vVar = vVar2;
                                if (((Boolean) objF).booleanValue()) {
                                    r11 = i0Var2.F.T.f15387a;
                                    size2 = r11.size();
                                    while (i12 < size2) {
                                        sVar2 = (s) r11.get(i12);
                                        if (r.c(sVar2)) {
                                            sVar2.a();
                                        }
                                        i12++;
                                    }
                                }
                                mVar.d();
                            }
                            return aVar2;
                        }
                    } else if (mVar.f(sVar3.f15401c)) {
                        sVar3.a();
                        long j10 = sVar3.f15399a;
                        e1 e1Var = new e1(mVar, 15);
                        a0Var.A = i0Var;
                        a0Var.B = mVar;
                        a0Var.E = 1;
                        objF = d0.i0.f(i0Var, j10, e1Var, a0Var);
                        if (objF == aVar2) {
                            return aVar2;
                        }
                        if (((Boolean) objF).booleanValue()) {
                            r10 = i0Var.F.T.f15387a;
                            size = r10.size();
                            while (i12 < size) {
                                sVar = (s) r10.get(i12);
                                if (r.c(sVar)) {
                                    sVar.a();
                                }
                                i12++;
                            }
                        }
                        mVar.d();
                    }
                } else if (i11 == 1) {
                    mVar = a0Var.B;
                    i0Var = a0Var.A;
                    t1.O(objF);
                    if (((Boolean) objF).booleanValue()) {
                        r10 = i0Var.F.T.f15387a;
                        size = r10.size();
                        while (i12 < size) {
                            sVar = (s) r10.get(i12);
                            if (r.c(sVar)) {
                                sVar.a();
                            }
                            i12++;
                        }
                    }
                    mVar.d();
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vVar = a0Var.C;
                    mVar = a0Var.B;
                    i0Var2 = a0Var.A;
                    t1.O(objF);
                    if (((Boolean) objF).booleanValue() && vVar.A) {
                        r11 = i0Var2.F.T.f15387a;
                        size2 = r11.size();
                        while (i12 < size2) {
                            sVar2 = (s) r11.get(i12);
                            if (r.c(sVar2)) {
                                sVar2.a();
                            }
                            i12++;
                        }
                    }
                    mVar.d();
                }
                return b0.a;
            } catch (Throwable th2) {
                mVar.d();
                throw th2;
            }
        } catch (Throwable th3) {
            mVar.d();
            throw th3;
        }
    }

    public static final void J() {
        try {
            if (f2522a == null) {
                x0 x0Var = (x0) ((wj.i) ((q) g.c().b(q.class))).f16178o.get();
                m.e(x0Var, "<set-?>");
                f2522a = x0Var;
            }
            x0 x0Var2 = f2522a;
            if (x0Var2 == null) {
                m.k("sharedSessionRepository");
                throw null;
            }
            if (x0Var2.f16224i) {
                if (x0Var2 != null) {
                    x0Var2.b();
                } else {
                    m.k("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static final JSONObject K(JSONObject jSONObject, String str) {
        m.e(jSONObject, "<this>");
        if (jSONObject.has(str)) {
            return jSONObject.getJSONObject(str);
        }
        return null;
    }

    public static final String L(JSONObject jSONObject, String str) {
        m.e(jSONObject, "<this>");
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static final a2.o M(String str) throws a2.l {
        String str2;
        boolean z10;
        int i10;
        int i11;
        a2.n nVar = new a2.n(str, 0);
        char c10 = '(';
        int i12 = 1;
        String strSubstring = null;
        if (nVar.c('C')) {
            nVar.f167b++;
            if (nVar.c('C')) {
                nVar.f167b++;
            }
            if (nVar.c('(')) {
                nVar.f167b++;
                String strE = nVar.e(")");
                nVar.b();
                nVar.f167b++;
                str2 = strE;
                z10 = true;
            } else {
                z10 = true;
                str2 = null;
            }
        } else {
            str2 = null;
            z10 = false;
        }
        ArrayList arrayList = h00.x.A;
        ArrayList arrayList2 = arrayList;
        while (nVar.f167b < str.length() - i12 && Character.isLetter(str.charAt(nVar.f167b)) && str.charAt(nVar.f167b + i12) == c10) {
            char cCharAt = str.charAt(nVar.f167b);
            if (cCharAt == 'N') {
                i10 = i12;
                nVar.f167b += 2;
                arrayList2 = new ArrayList();
                while (!nVar.a() && !nVar.c(')')) {
                    nVar.e(":,)");
                    if (nVar.c(':')) {
                        nVar.f167b++;
                        O(nVar.e(",)"));
                    }
                    arrayList2.add(new a2.k(arrayList2.size()));
                    if (nVar.c(',')) {
                        nVar.f167b++;
                    }
                }
                nVar.b();
                nVar.f167b++;
            } else if (cCharAt != 'P') {
                nVar.f167b += 2;
                int i13 = 0;
                while (true) {
                    if (i13 <= 0 && nVar.c(')')) {
                        nVar.b();
                        nVar.f167b += i12;
                        break;
                    }
                    if (nVar.a()) {
                        nVar.f("unexpected end");
                        throw null;
                    }
                    if (nVar.c(c10)) {
                        i13++;
                    } else if (nVar.c(')')) {
                        i13--;
                    }
                    nVar.f167b += i12;
                }
            } else {
                nVar.f167b += 2;
                arrayList2 = new ArrayList();
                int i14 = 0;
                while (!nVar.a() && !nVar.c(')')) {
                    if (nVar.c('!')) {
                        nVar.f167b += i12;
                        String strE2 = nVar.e("!,)");
                        if (strE2.length() == 0) {
                            i14 = i12;
                            i11 = i14;
                        } else {
                            int i15 = Integer.parseInt(strE2);
                            int i16 = 0;
                            while (i15 > 0) {
                                int size = arrayList2.size();
                                int i17 = i12;
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= size) {
                                        arrayList2.add(new a2.k(i16));
                                        i15--;
                                        break;
                                    }
                                    if (((a2.k) arrayList2.get(i18)).f165a == i16) {
                                        i16++;
                                        break;
                                    }
                                    i18++;
                                }
                                i12 = i17;
                            }
                            i11 = i12;
                        }
                    } else {
                        i11 = i12;
                        int iD = nVar.d("!:,)");
                        if (nVar.c(':')) {
                            nVar.f167b++;
                            O(nVar.e("!,)"));
                        }
                        if (i14 != 0) {
                            int i19 = 0;
                            while (i19 < iD) {
                                int size2 = arrayList2.size();
                                int i20 = 0;
                                while (true) {
                                    if (i20 >= size2) {
                                        arrayList2.add(new a2.k(i19));
                                        break;
                                    }
                                    if (((a2.k) arrayList2.get(i20)).f165a == i19) {
                                        i19++;
                                        break;
                                    }
                                    i20++;
                                }
                            }
                            i14 = 0;
                        }
                        arrayList2.add(new a2.k(iD));
                    }
                    if (nVar.c(',')) {
                        nVar.f167b++;
                    }
                    i12 = i11;
                }
                i10 = i12;
                nVar.b();
                nVar.f167b++;
            }
            i12 = i10;
            c10 = '(';
        }
        if (nVar.c(':')) {
            nVar.f167b++;
        } else {
            arrayList = new ArrayList();
            while (!nVar.a() && !nVar.c(':')) {
                if (nVar.c('*')) {
                    nVar.f167b++;
                }
                Integer numValueOf = !nVar.c('@') ? Integer.valueOf(nVar.d("@") + 1) : null;
                nVar.f167b++;
                nVar.d("L,:");
                if (nVar.c('L')) {
                    nVar.f167b++;
                    nVar.d(",:");
                }
                arrayList.add(new a2.i(numValueOf != null ? numValueOf.intValue() : -1));
                if (nVar.c(',')) {
                    nVar.f167b++;
                }
            }
            nVar.f167b++;
        }
        ArrayList arrayList3 = arrayList;
        String strE3 = nVar.e("#");
        String str3 = strE3.length() > 0 ? strE3 : null;
        if (nVar.c('#')) {
            int i21 = nVar.f167b + 1;
            nVar.f167b = i21;
            strSubstring = str.substring(i21, str.length());
            m.d(strSubstring, "substring(...)");
        }
        return new a2.o(z10, str2, str3, arrayList2, strSubstring, arrayList3);
    }

    public static final p9.h N(j jVar) {
        y1.d dVarG = y1.k.g(jVar);
        g0 g0Var = (g0) jVar;
        boolean zG = g0Var.g(dVarG);
        Object objN = g0Var.N();
        if (zG || objN == l1.i.f9868a) {
            objN = new p9.h(new h00.a(dVarG, 28), new v1.c(new a1.w(dVarG, 13), -1320822745, true));
            g0Var.n0(objN);
        }
        return (p9.h) objN;
    }

    public static final String O(String str) {
        int iJ0 = k.J0(str, "c#", 0, false, 2);
        return iJ0 < 0 ? str : k.T0(str, iJ0, 2 + iJ0, "androidx.compose.").toString();
    }

    public static int P(long j9) {
        if (j9 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j9 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j9;
    }

    public static final String Q(j10.e eVar, String str) {
        m.e(eVar, "classDescriptor");
        m.e(str, "jvmDescriptor");
        String str2 = i10.d.a;
        n20.b bVarG = i10.d.g(u20.d.g(eVar).a);
        String strE = bVarG != null ? v20.b.e(bVarG) : a.a.n(eVar, g20.f.d);
        m.e(strE, "internalName");
        return strE + '.' + str;
    }

    public static final k50.c R(Socket socket) throws IOException {
        Logger logger = x.a;
        h0 h0Var = new h0(socket);
        OutputStream outputStream = socket.getOutputStream();
        m.d(outputStream, "getOutputStream(...)");
        return new k50.c(h0Var, new k50.c(outputStream, h0Var, 1), 0);
    }

    public static final k50.d S(InputStream inputStream) {
        Logger logger = x.a;
        m.e(inputStream, "<this>");
        return new k50.d(inputStream, new k0());
    }

    public static final k50.d T(Socket socket) throws IOException {
        Logger logger = x.a;
        h0 h0Var = new h0(socket);
        InputStream inputStream = socket.getInputStream();
        m.d(inputStream, "getInputStream(...)");
        return new k50.d(h0Var, new k50.d(inputStream, h0Var));
    }

    public static int[] U(Collection collection) {
        if (collection instanceof jh.b) {
            jh.b bVar = (jh.b) collection;
            return Arrays.copyOfRange(bVar.A, bVar.B, bVar.C);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static final gd.a V(JSONObject jSONObject) {
        oj.q qVar;
        m.e(jSONObject, "<this>");
        gd.a aVar = new gd.a();
        String string = jSONObject.getString("event_type");
        m.d(string, "getString(...)");
        aVar.M = string;
        aVar.f6289a = L(jSONObject, "user_id");
        aVar.f6290b = L(jSONObject, "device_id");
        gd.d dVar = null;
        aVar.f6291c = jSONObject.has("time") ? Long.valueOf(jSONObject.getLong("time")) : null;
        JSONObject jSONObjectK = K(jSONObject, "event_properties");
        aVar.N = jSONObjectK != null ? h00.d0.b0(a10.h0.T(jSONObjectK)) : null;
        JSONObject jSONObjectK2 = K(jSONObject, "user_properties");
        aVar.O = jSONObjectK2 != null ? h00.d0.b0(a10.h0.T(jSONObjectK2)) : null;
        JSONObject jSONObjectK3 = K(jSONObject, "groups");
        aVar.P = jSONObjectK3 != null ? h00.d0.b0(a10.h0.T(jSONObjectK3)) : null;
        JSONObject jSONObjectK4 = K(jSONObject, "group_properties");
        aVar.Q = jSONObjectK4 != null ? h00.d0.b0(a10.h0.T(jSONObjectK4)) : null;
        aVar.f6297i = L(jSONObject, "app_version");
        aVar.f6299k = L(jSONObject, "platform");
        aVar.l = L(jSONObject, "os_name");
        aVar.m = L(jSONObject, "os_version");
        aVar.f6300n = L(jSONObject, "device_brand");
        aVar.f6301o = L(jSONObject, "device_manufacturer");
        aVar.f6302p = L(jSONObject, "device_model");
        aVar.f6303q = L(jSONObject, "carrier");
        aVar.f6304r = L(jSONObject, "country");
        aVar.f6305s = L(jSONObject, "region");
        aVar.f6306t = L(jSONObject, "city");
        aVar.f6307u = L(jSONObject, "dma");
        aVar.A = L(jSONObject, "language");
        aVar.G = jSONObject.has("price") ? Double.valueOf(jSONObject.getDouble("price")) : null;
        aVar.H = jSONObject.has("quantity") ? Integer.valueOf(jSONObject.getInt("quantity")) : null;
        aVar.F = jSONObject.has("revenue") ? Double.valueOf(jSONObject.getDouble("revenue")) : null;
        aVar.I = L(jSONObject, "productId");
        aVar.J = L(jSONObject, "revenueType");
        aVar.f6295g = jSONObject.has("location_lat") ? Double.valueOf(jSONObject.getDouble("location_lat")) : null;
        aVar.f6296h = jSONObject.has("location_lng") ? Double.valueOf(jSONObject.getDouble("location_lng")) : null;
        aVar.C = L(jSONObject, "ip");
        aVar.f6308v = L(jSONObject, "idfa");
        aVar.f6309w = L(jSONObject, "idfv");
        aVar.f6310x = L(jSONObject, "adid");
        aVar.f6312z = L(jSONObject, "android_id");
        aVar.f6311y = jSONObject.optString("android_app_set_id", null);
        aVar.f6292d = jSONObject.has("event_id") ? Long.valueOf(jSONObject.getLong("event_id")) : null;
        aVar.f6293e = jSONObject.has("session_id") ? Long.valueOf(jSONObject.getLong("session_id")) : null;
        aVar.f6294f = L(jSONObject, "insert_id");
        aVar.B = jSONObject.has("library") ? jSONObject.getString("library") : null;
        aVar.K = L(jSONObject, "partner_id");
        if (jSONObject.has("plan")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("plan");
            m.d(jSONObject2, "getJSONObject(...)");
            qVar = new oj.q(jSONObject2.optString("branch", null), jSONObject2.optString("source", null), jSONObject2.optString("version", null), jSONObject2.optString("versionId", null), 18);
        } else {
            qVar = null;
        }
        aVar.D = qVar;
        if (jSONObject.has("ingestion_metadata")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("ingestion_metadata");
            m.d(jSONObject3, "getJSONObject(...)");
            dVar = new gd.d(jSONObject3.optString("source_name", null), jSONObject3.optString("source_version", null), 0);
        }
        aVar.E = dVar;
        return aVar;
    }

    public static final ArrayList W(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        z00.d it = ab.a0.I0(0, jSONArray.length()).iterator();
        while (true) {
            z00.d dVar = it;
            if (!dVar.C) {
                return arrayList;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(dVar.nextInt());
            m.d(jSONObject, "getJSONObject(...)");
            arrayList.add(V(jSONObject));
        }
    }

    public static final int[] X(JSONArray jSONArray) {
        int length = jSONArray.length();
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = jSONArray.optInt(i10);
        }
        return iArr;
    }

    public static final ArrayList Y(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        z00.d it = ab.a0.I0(0, jSONArray.length()).iterator();
        while (true) {
            z00.d dVar = it;
            if (!dVar.C) {
                return arrayList;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(dVar.nextInt());
            m.d(jSONObject, "getJSONObject(...)");
            arrayList.add(jSONObject);
        }
    }

    public static final java.lang.Object Z(v2.i0 r11, q0.r1 r12, v2.k r13, m00.a r14) {
        throw new UnsupportedOperationException("Method not decompiled: bi.b.Z(v2.i0, q0.r1, v2.k, m00.a):java.lang.Object");
    }

    public static final void a(u30.b bVar, u00.k kVar, b2.r rVar, j jVar, int i10) {
        m.e(bVar, "downloads");
        m.e(kVar, "onDeleteStory");
        g0 g0Var = (g0) jVar;
        g0Var.e0(106522619);
        int i11 = (g0Var.g(bVar) ? 4 : 2) | i10 | (g0Var.i(kVar) ? 32 : 16) | (g0Var.g(rVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            b2.r rVarF = z.n.f(f2.h.c(z1.d(rVar, 1.0f), p0.f.a(24)), t.b(0.08f, dl.a.i), i2.b0.f7111b);
            h0.v vVarA = u.a(h0.i.f6408c, b2.b.M, g0Var, 0);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarF, g0Var);
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
            if (((h00.b) bVar).isEmpty()) {
                g0Var.c0(-1620882812);
                c(g0Var, 0);
                g0Var.r(false);
            } else {
                g0Var.c0(-1620827074);
                Iterator it = bVar.iterator();
                while (it.hasNext()) {
                    lo.j jVar2 = (lo.j) it.next();
                    boolean zG = ((i11 & 112) == 32) | g0Var.g(jVar2);
                    Object objN = g0Var.N();
                    if (zG || objN == l1.i.f9868a) {
                        objN = new l6.c(kVar, jVar2, 18);
                        g0Var.n0(objN);
                    }
                    h(jVar2, (u00.a) objN, g0Var, 0);
                }
                g0Var.r(false);
            }
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new hz.a(bVar, kVar, rVar, i10, 2);
        }
    }

    public static Integer a0(String str) {
        byte b7;
        Integer num;
        Long lValueOf;
        byte b10;
        str.getClass();
        if (str.isEmpty()) {
            lValueOf = 0;
            num = null;
        } else {
            int i10 = str.charAt(0) == '-' ? 1 : 0;
            if (i10 == str.length()) {
                lValueOf = 0;
                num = null;
            } else {
                int i11 = i10 + 1;
                char cCharAt = str.charAt(i10);
                if (cCharAt < 128) {
                    b7 = jh.c.f8284a[cCharAt];
                } else {
                    byte[] bArr = jh.c.f8284a;
                    b7 = -1;
                }
                if (b7 < 0 || b7 >= 10) {
                    num = null;
                    lValueOf = num;
                } else {
                    long j9 = -b7;
                    long j10 = 10;
                    long j11 = Long.MIN_VALUE / j10;
                    while (true) {
                        if (i11 < str.length()) {
                            int i12 = i11 + 1;
                            char cCharAt2 = str.charAt(i11);
                            if (cCharAt2 < 128) {
                                b10 = jh.c.f8284a[cCharAt2];
                            } else {
                                byte[] bArr2 = jh.c.f8284a;
                                b10 = -1;
                            }
                            if (b10 < 0 || b10 >= 10 || j9 < j11) {
                                num = null;
                            } else {
                                long j12 = j9 * j10;
                                num = null;
                                long j13 = b10;
                                if (j12 >= j13 - Long.MIN_VALUE) {
                                    j9 = j12 - j13;
                                    i11 = i12;
                                }
                            }
                        } else {
                            num = null;
                            if (i10 != 0) {
                                lValueOf = Long.valueOf(j9);
                            } else if (j9 != Long.MIN_VALUE) {
                                lValueOf = Long.valueOf(-j9);
                            }
                        }
                        lValueOf = num;
                    }
                }
            }
        }
        return (lValueOf == 0 || lValueOf.longValue() != ((long) lValueOf.intValue())) ? num : Integer.valueOf(lValueOf.intValue());
    }

    public static final void b(hp.b bVar, rp.o oVar, AuthAnalytics authAnalytics, j jVar, int i10) {
        hp.b bVar2;
        rp.o oVar2;
        AuthAnalytics authAnalytics2;
        rp.o oVar3;
        hp.b bVar3;
        AuthAnalytics authAnalytics3;
        rp.o oVar4;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1268854022);
        int i11 = i10 | 146;
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            g0Var.X();
            int i12 = i10 & 1;
            l1.c cVar = l1.i.f9868a;
            if (i12 == 0 || g0Var.A()) {
                e60.a aVarA = q50.c.a(g0Var);
                boolean zG = g0Var.g(null) | g0Var.g(aVarA);
                Object objN = g0Var.N();
                if (zG || objN == cVar) {
                    objN = oi.k.f(kotlin.jvm.internal.a0.a, hp.b.class, aVarA, null, g0Var);
                }
                hp.b bVar4 = (hp.b) objN;
                f1 f1VarA = u6.a.a(g0Var);
                if (f1VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                t6.b bVarZ = z(f1VarA);
                e60.a aVarA2 = q50.c.a(g0Var);
                kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
                oVar3 = (rp.o) c7.i.S(b0Var.b(rp.o.class), f1VarA.getViewModelStore(), null, bVarZ, aVarA2, null);
                e60.a aVarA3 = q50.c.a(g0Var);
                boolean zG2 = g0Var.g(null) | g0Var.g(aVarA3);
                Object objN2 = g0Var.N();
                if (zG2 || objN2 == cVar) {
                    objN2 = oi.k.f(b0Var, AuthAnalytics.class, aVarA3, null, g0Var);
                }
                bVar3 = bVar4;
                authAnalytics3 = (AuthAnalytics) objN2;
            } else {
                g0Var.V();
                bVar3 = bVar;
                oVar3 = oVar;
                authAnalytics3 = authAnalytics;
            }
            g0Var.s();
            e60.a aVarA4 = q50.c.a(g0Var);
            boolean zG3 = g0Var.g(null) | g0Var.g(aVarA4);
            Object objN3 = g0Var.N();
            if (zG3 || objN3 == cVar) {
                objN3 = oi.k.f(kotlin.jvm.internal.a0.a, xo.e.class, aVarA4, null, g0Var);
            }
            xo.e eVar = (xo.e) objN3;
            e60.a aVarA5 = q50.c.a(g0Var);
            boolean zG4 = g0Var.g(null) | g0Var.g(aVarA5);
            Object objN4 = g0Var.N();
            if (zG4 || objN4 == cVar) {
                objN4 = oi.k.f(kotlin.jvm.internal.a0.a, xo.a.class, aVarA5, null, g0Var);
            }
            xo.a aVar = (xo.a) objN4;
            Context context = (Context) g0Var.k(o0.f2722b);
            ol.b bVar5 = (ol.b) g0Var.k(ol.a.a);
            Object objN5 = g0Var.N();
            if (objN5 == cVar) {
                objN5 = l1.q.o(g0Var);
                g0Var.n0(objN5);
            }
            z zVar = (z) objN5;
            boolean z10 = g0Var.k(dl.e.a) == gm.a.B;
            z0 z0VarQ = k00.f.q(bVar3.b, g0Var, 0);
            m6 m6VarF = t4.f(true, null, g0Var, 6, 2);
            boolean zG5 = g0Var.g(oVar3) | g0Var.g(bVar5);
            Object objN6 = g0Var.N();
            if (zG5 || objN6 == cVar) {
                objN6 = new rm.c(oVar3, bVar5, (k00.c) null, 2);
                g0Var.n0(objN6);
            }
            l1.q.i(b0.a, g0Var, (u00.n) objN6);
            boolean zA = m.a((dp.e) z0VarQ.getValue(), dp.c.a);
            boolean zI = g0Var.i(authAnalytics3) | g0Var.i(bVar3) | g0Var.i(zVar) | g0Var.g(m6VarF) | g0Var.i(context) | g0Var.i(eVar) | g0Var.g(oVar3) | g0Var.g(bVar5) | g0Var.i(aVar);
            Object objN7 = g0Var.N();
            if (zI || objN7 == cVar) {
                oVar4 = oVar3;
                p2 p2Var = new p2(authAnalytics3, bVar3, zVar, m6VarF, context, eVar, oVar4, bVar5, aVar, 2);
                g0Var.n0(p2Var);
                objN7 = p2Var;
            } else {
                oVar4 = oVar3;
            }
            u00.k kVar = (u00.k) objN7;
            boolean zI2 = g0Var.i(authAnalytics3) | g0Var.i(bVar3);
            Object objN8 = g0Var.N();
            if (zI2 || objN8 == cVar) {
                objN8 = new rp.g(authAnalytics3, bVar3, 0);
                g0Var.n0(objN8);
            }
            ca.v.a(zA, kVar, (u00.a) objN8, m6VarF, g0Var, 0);
            if (m.a((dp.e) z0VarQ.getValue(), dp.a.a) || (((dp.e) z0VarQ.getValue()) instanceof dp.d)) {
                g0Var.c0(-418799811);
                if (z10) {
                    g0Var.c0(-418787628);
                    boolean zI3 = g0Var.i(authAnalytics3) | g0Var.i(bVar3);
                    Object objN9 = g0Var.N();
                    if (zI3 || objN9 == cVar) {
                        objN9 = new rp.g(authAnalytics3, bVar3, 1);
                        g0Var.n0(objN9);
                    }
                    u00.a aVar2 = (u00.a) objN9;
                    boolean zI4 = g0Var.i(bVar3);
                    Object objN10 = g0Var.N();
                    if (zI4 || objN10 == cVar) {
                        objN10 = new rp.h(bVar3, 0);
                        g0Var.n0(objN10);
                    }
                    u00.a aVar3 = (u00.a) objN10;
                    boolean zI5 = g0Var.i(bVar3);
                    Object objN11 = g0Var.N();
                    if (zI5 || objN11 == cVar) {
                        objN11 = new rp.h(bVar3, 1);
                        g0Var.n0(objN11);
                    }
                    tp.h.b(aVar2, aVar3, (u00.a) objN11, g0Var, 0);
                    g0Var.r(false);
                } else {
                    g0Var.c0(-418444427);
                    boolean zI6 = g0Var.i(authAnalytics3) | g0Var.i(bVar3);
                    Object objN12 = g0Var.N();
                    if (zI6 || objN12 == cVar) {
                        objN12 = new rp.g(authAnalytics3, bVar3, 2);
                        g0Var.n0(objN12);
                    }
                    u00.a aVar4 = (u00.a) objN12;
                    boolean zI7 = g0Var.i(bVar3);
                    Object objN13 = g0Var.N();
                    if (zI7 || objN13 == cVar) {
                        objN13 = new rp.h(bVar3, 2);
                        g0Var.n0(objN13);
                    }
                    u00.a aVar5 = (u00.a) objN13;
                    boolean zI8 = g0Var.i(bVar3);
                    Object objN14 = g0Var.N();
                    if (zI8 || objN14 == cVar) {
                        objN14 = new rp.h(bVar3, 3);
                        g0Var.n0(objN14);
                    }
                    tp.h.a(aVar4, aVar5, (u00.a) objN14, g0Var, 0);
                    g0Var.r(false);
                }
                g0Var.r(false);
            } else {
                g0Var.c0(-418112696);
                g0Var.r(false);
            }
            authAnalytics2 = authAnalytics3;
            bVar2 = bVar3;
            oVar2 = oVar4;
        } else {
            g0Var.V();
            bVar2 = bVar;
            oVar2 = oVar;
            authAnalytics2 = authAnalytics;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new qo.s(i10, 1, bVar2, oVar2, authAnalytics2);
        }
    }

    public static final void c(j jVar, int i10) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1520006628);
        if (g0Var.S(i10 & 1, i10 != 0)) {
            b2.r rVarD = h0.c.D(z1.d(b2.o.A, 1.0f), 16, 18);
            h0.v vVarA = u.a(h0.i.f6408c, b2.b.N, g0Var, 48);
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
            l1.q.I(vVarA, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            z6.b(z3.U(g0Var, 2131886915), null, t.b(0.7f, dl.a.k), kh.o.z(19), q3.u.C, null, 0L, null, null, kh.o.z(19), 0, false, 0, 0, null, null, g0Var, 1597440, 48, 260010);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new sw.a(i10, 6);
        }
    }

    public static String c0(int i10, String str) {
        return str + i10;
    }

    public static final void d(int i10, b2.r rVar, j jVar, u00.a aVar, boolean z10) {
        m.e(aVar, "onGetPremiumClick");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1159030323);
        int i11 = (g0Var.i(aVar) ? 4 : 2) | i10 | (g0Var.h(z10) ? 32 : 16) | (g0Var.g(rVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            b2.r rVarV = rVar.V(z1.f6478c);
            Object objN = g0Var.N();
            if (objN == l1.i.f9868a) {
                objN = new a2.f(24);
                g0Var.n0(objN);
            }
            b2.r rVarO = w50.c.o(rVarV, false, (j3.k) null, (u00.a) objN, 6);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarO, g0Var);
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
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            h0.s sVar = h0.s.f6456a;
            h0.o.a(z.n.f(sVar.b(), t.b(0.5f, dl.a.L), i2.b0.f7111b), g0Var, 0);
            g4.j(aVar, h0.c.G(h0.c.G(sVar.a(b2.o.A, b2.b.B), 0.0f, z10 ? 116 : 0, 0.0f, 0.0f, 13), 0.0f, 32, 0.0f, 0.0f, 13), g0Var, i11 & 14);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.q(aVar, z10, rVar, i10);
        }
    }

    public static void d0(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(x5.j(i11, "at index ", new StringBuilder(String.valueOf(i11).length() + 9)));
            }
        }
    }

    public static final void e(jk.a aVar, long j9, b2.r rVar, float f3, float f10, j jVar, int i10) {
        int i11;
        m.e(aVar, "backdrop");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1922363755);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.i(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.f(j9) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.g(rVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var.d(f3) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= g0Var.d(f10) ? 16384 : 8192;
        }
        if (g0Var.S(i11 & 1, (i11 & 9363) != 9362)) {
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (objN == cVar) {
                objN = new q50.b(24);
                g0Var.n0(objN);
            }
            u00.a aVar2 = (u00.a) objN;
            boolean z10 = ((i11 & 112) == 32) | ((57344 & i11) == 16384) | ((i11 & 7168) == 2048);
            Object objN2 = g0Var.N();
            if (z10 || objN2 == cVar) {
                objN2 = new sm.i0(f10, f3, j9);
                g0Var.n0(objN2);
            }
            h0.o.a(jk.d.c(rVar, aVar, aVar2, (u00.k) objN2), g0Var, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new j0(aVar, j9, rVar, f3, f10, i10);
        }
    }

    public static final void f(int i10, b2.r rVar, j jVar, boolean z10) {
        int i11;
        g0 g0Var = (g0) jVar;
        g0Var.e0(133364713);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.h(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.g(rVar) ? 32 : 16;
        }
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            b2.r rVarM = z1.m(rVar, 22);
            float f3 = (float) 1.5d;
            long jB = z10 ? dl.a.i : t.b(0.35f, dl.a.i);
            p0.e eVar = p0.f.f12243a;
            b2.r rVarG = z.n.g(rVarM, f3, jB, eVar);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarG, g0Var);
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
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            if (z10) {
                g0Var.c0(831155514);
                h0.o.a(z.n.f(z1.m(b2.o.A, 10), dl.a.i, eVar), g0Var, 0);
                g0Var.r(false);
            } else {
                g0Var.c0(831314079);
                g0Var.r(false);
            }
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new eu.j(z10, rVar, i10, 1);
        }
    }

    public static final h2.c g(long j9, long j10) {
        int i10 = (int) (j9 >> 32);
        int i11 = (int) (j9 & 4294967295L);
        return new h2.c(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i11));
    }

    public static final void h(lo.j jVar, u00.a aVar, j jVar2, int i10) {
        g0 g0Var;
        u00.a aVar2 = aVar;
        g0 g0Var2 = (g0) jVar2;
        g0Var2.e0(-196042331);
        int i11 = i10 | (g0Var2.g(jVar) ? 4 : 2) | (g0Var2.i(aVar2) ? 32 : 16);
        if (g0Var2.S(i11 & 1, (i11 & 19) != 18)) {
            b2.o oVar = b2.o.A;
            b2.r rVarC = h0.c.C(z1.d(oVar, 1.0f), 16);
            float f3 = 12;
            v1 v1VarA = h0.t1.a(h0.i.g(f3), b2.b.K, g0Var2, 54);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            b2.r rVarC2 = b2.a.c(rVarC, g0Var2);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            b3.f fVar = b3.h.f2039f;
            l1.q.I(v1VarA, g0Var2, fVar);
            b3.f fVar2 = b3.h.f2038e;
            l1.q.I(m1VarM, g0Var2, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.f2040g;
            l1.q.I(numValueOf, g0Var2, fVar3);
            b3.e eVar = b3.h.f2041h;
            l1.q.E(g0Var2, eVar);
            b3.f fVar4 = b3.h.f2037d;
            l1.q.I(rVarC2, g0Var2, fVar4);
            float f10 = 10;
            a10.h0.a(jVar.c, f2.h.c(z1.m(oVar, 44), p0.f.a(f10)), f10, false, (Integer) null, false, g0Var2, 384, 56);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, true);
            h0.v vVarA = u.a(h0.i.g(2), b2.b.M, g0Var2, 6);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            m1 m1VarM2 = g0Var2.m();
            b2.r rVarC3 = b2.a.c(c1Var, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(vVarA, g0Var2, fVar);
            l1.q.I(m1VarM2, g0Var2, fVar2);
            a1.b.v(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
            l1.q.I(rVarC3, g0Var2, fVar4);
            String str = jVar.b;
            long jZ = kh.o.z(16);
            long j9 = dl.a.i;
            z6.b(str, null, j9, jZ, q3.u.D, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, g0Var2, 1597440, 24960, 241578);
            int i12 = jVar.d;
            k00.f.a(x5.m(z3.L(2131755008, i12, new Object[]{Integer.valueOf(i12)}, g0Var2), " · ", f50.c.w(jVar.e)), (b2.r) null, t.b(0.7f, dl.a.k), kh.o.z(13), (o) null, (q3.u) null, (x3.k) null, 1, 0.7f, (r0) null, g0Var2, 113249280, 626);
            g0Var2.r(true);
            aVar2 = aVar;
            z6.b(z3.U(g0Var2, 2131886415), h0.c.D(w50.c.o(z.n.f(f2.h.c(oVar, p0.f.a(32)), t.b(0.15f, j9), i2.b0.f7111b), false, (j3.k) null, aVar, 7), f3, 9), j9, kh.o.z(14), q3.u.C, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, g0Var2, 1597440, 0, 262056);
            g0Var = g0Var2;
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new l0.g0(jVar, aVar2, i10, 24);
        }
    }

    public static final java.lang.Object i(v2.i0 r7, m00.a r8) {
        throw new UnsupportedOperationException("Method not decompiled: bi.b.i(v2.i0, m00.a):java.lang.Object");
    }

    public static final n20.c j(String str, n20.c cVar) {
        return cVar.a(n20.e.e(str));
    }

    public static final Object k(Activity activity, xo.a aVar, rp.i iVar, rp.g gVar, rp.j jVar, m00.c cVar) {
        rp.k kVar;
        if (cVar instanceof rp.k) {
            kVar = (rp.k) cVar;
            int i10 = kVar.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.E = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new rp.k(cVar);
            }
        } else {
            kVar = new rp.k(cVar);
        }
        Object objA = kVar.D;
        l00.a aVar2 = l00.a.A;
        int i11 = kVar.E;
        try {
            if (i11 == 0) {
                t1.O(objA);
                kVar.A = iVar;
                kVar.B = gVar;
                kVar.C = jVar;
                kVar.E = 1;
                objA = aVar.a(activity, kVar);
                if (objA == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rp.j jVar2 = kVar.C;
                gVar = kVar.B;
                iVar = kVar.A;
                t1.O(objA);
            }
            ep.a aVar3 = (ep.a) objA;
            if (aVar3 != null) {
                iVar.invoke(aVar3);
            } else {
                gVar.invoke();
            }
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable unused) {
            jVar.invoke();
        }
        return b0.a;
    }

    public static final Object l(Activity activity, xo.e eVar, rp.i iVar, rp.g gVar, rp.j jVar, m00.c cVar) {
        rp.l lVar;
        if (cVar instanceof rp.l) {
            lVar = (rp.l) cVar;
            int i10 = lVar.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.E = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new rp.l(cVar);
            }
        } else {
            lVar = new rp.l(cVar);
        }
        Object objC = lVar.D;
        l00.a aVar = l00.a.A;
        int i11 = lVar.E;
        try {
            if (i11 == 0) {
                t1.O(objC);
                lVar.A = iVar;
                lVar.B = gVar;
                lVar.C = jVar;
                lVar.E = 1;
                objC = eVar.c(activity, lVar);
                if (objC == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rp.j jVar2 = lVar.C;
                gVar = lVar.B;
                iVar = lVar.A;
                t1.O(objC);
            }
            ep.m mVar = (ep.m) objC;
            if (mVar != null) {
                iVar.invoke(mVar);
            } else {
                gVar.invoke();
            }
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable unused) {
            jVar.invoke();
        }
        return b0.a;
    }

    public static final java.lang.Object m(v2.i0 r11, q0.r1 r12, v2.k r13, int r14, m00.a r15) {
        throw new UnsupportedOperationException("Method not decompiled: bi.b.m(v2.i0, q0.r1, v2.k, int, m00.a):java.lang.Object");
    }

    public static List n(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new jh.b(iArr, 0, iArr.length);
    }

    public static final Object o(v2.v vVar, e1.m mVar, q0.r1 r1Var, k00.c cVar) {
        v2.j0 j0Var = (v2.j0) vVar;
        j0Var.getClass();
        Object objE = g3.e(vVar, new l1(new c50.h(b3.m.y(j0Var).f2054b0), mVar, r1Var, (k00.c) null), cVar);
        return objE == l00.a.A ? objE : b0.a;
    }

    public static final Object p(androidx.lifecycle.q qVar, m00.c cVar) throws Throwable {
        bc.a aVar;
        androidx.lifecycle.q qVar2;
        kotlin.jvm.internal.z zVar;
        Throwable th2;
        androidx.lifecycle.v vVar;
        androidx.lifecycle.v vVar2;
        if (cVar instanceof bc.a) {
            aVar = (bc.a) cVar;
            int i10 = aVar.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.D = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new bc.a(cVar);
            }
        } else {
            aVar = new bc.a(cVar);
        }
        Object obj = aVar.C;
        l00.a aVar2 = l00.a.A;
        int i11 = aVar.D;
        b0 b0Var = b0.a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = aVar.B;
            qVar2 = aVar.A;
            try {
                t1.O(obj);
                vVar2 = (androidx.lifecycle.v) zVar.A;
                if (vVar2 != null) {
                    qVar2.d(vVar2);
                }
                return b0Var;
            } catch (Throwable th3) {
                th2 = th3;
                vVar = (androidx.lifecycle.v) zVar.A;
                if (vVar != null) {
                    qVar2.d(vVar);
                }
                throw th2;
            }
        }
        t1.O(obj);
        if (qVar.b().compareTo(androidx.lifecycle.p.D) >= 0) {
            return b0Var;
        }
        kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
        try {
            aVar.A = qVar;
            aVar.B = zVar2;
            aVar.D = 1;
            a40.k kVar = new a40.k(1, s0.j0(aVar));
            kVar.r();
            bc.b bVar = new bc.b(kVar);
            zVar2.A = bVar;
            qVar.a(bVar);
            if (kVar.q() == aVar2) {
                return aVar2;
            }
            qVar2 = qVar;
            zVar = zVar2;
            vVar2 = (androidx.lifecycle.v) zVar.A;
            if (vVar2 != null) {
                qVar2.d(vVar2);
            }
            return b0Var;
        } catch (Throwable th4) {
            qVar2 = qVar;
            zVar = zVar2;
            th2 = th4;
            vVar = (androidx.lifecycle.v) zVar.A;
            if (vVar != null) {
                qVar2.d(vVar);
            }
            throw th2;
        }
    }

    public static final k50.b0 q(k50.g0 g0Var) {
        m.e(g0Var, "<this>");
        return new k50.b0(g0Var);
    }

    public static final c0 r(k50.i0 i0Var) {
        m.e(i0Var, "<this>");
        return new c0(i0Var);
    }

    public static int s(long j9) {
        int i10 = (int) j9;
        ta.c0.p(j9, "Out of range: %s", ((long) i10) == j9);
        return i10;
    }

    public static final Set t(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        m.d(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            JSONArray jSONArray = jSONObject.getJSONArray(itKeys.next());
            m.d(jSONArray, "getJSONArray(...)");
            for (int i10 : X(jSONArray)) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        return h00.q.r1(arrayList);
    }

    public static int u(int i10, int i11) {
        ta.c0.o(i11, 1073741823, "min (%s) must be less than or equal to max (%s)", i11 <= 1073741823);
        return Math.min(Math.max(i10, i11), 1073741823);
    }

    public static final boolean v(h2.c cVar, float f3, float f10) {
        float f11 = cVar.f6546a;
        if (f3 > cVar.f6548c || f11 > f3) {
            return false;
        }
        return f10 <= cVar.f6549d && cVar.f6547b <= f10;
    }

    public static final ArrayList w(ArrayList arrayList, List list, j10.u uVar) {
        m.e(list, "oldValueParameters");
        arrayList.size();
        list.size();
        ArrayList<g00.k> arrayListT1 = h00.q.t1(arrayList, list);
        ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayListT1, 10));
        for (g00.k kVar : arrayListT1) {
            w wVar = (w) kVar.A;
            m10.n nVar = (m10.r0) kVar.B;
            int i10 = ((m10.r0) nVar).G;
            k10.h annotations = ((f5.c) nVar).getAnnotations();
            n20.e name = ((m10.m) nVar).getName();
            m.d(name, "getName(...)");
            boolean zZ0 = nVar.Z0();
            boolean z10 = ((m10.r0) nVar).I;
            boolean z11 = ((m10.r0) nVar).J;
            w wVarF = ((m10.r0) nVar).K != null ? u20.d.j(uVar).d().f(wVar) : null;
            n0 n0VarO = nVar.o();
            m.d(n0VarO, "getSource(...)");
            arrayList2.add(new m10.r0(uVar, (m10.r0) null, i10, annotations, name, wVar, zZ0, z10, z11, wVarF, n0VarO));
        }
        return arrayList2;
    }

    public static final ca.r x(Context context, Class cls, String str) {
        if (k.L0(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (str.equals(":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new ca.r(context, cls, str);
    }

    public static byte[] y(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i10 = 0; i10 < 16; i10++) {
            byte b7 = (byte) ((bArr[i10] << 1) & 254);
            bArr2[i10] = b7;
            if (i10 < 15) {
                bArr2[i10] = (byte) (((byte) ((bArr[i10 + 1] >> 7) & 1)) | b7);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static final t6.b z(f1 f1Var) {
        return f1Var instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) f1Var).getDefaultViewModelCreationExtras() : t6.a.f14359b;
    }

    public abstract void b0(byte[] bArr, int i10, int i11);
}

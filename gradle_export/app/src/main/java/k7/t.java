package k7;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.common.b1;
import androidx.media3.common.l2;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.encoders.EncodingException;
import com.google.protobuf.RuntimeVersion;
import fh.d2;
import fh.q0;
import i7.e1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import k9.a2;
import k9.b3;
import k9.c1;
import k9.c4;
import k9.d4;
import k9.f4;
import k9.i2;
import k9.l3;
import k9.n3;
import k9.p3;
import k9.q3;
import k9.s1;
import k9.v3;
import k9.z1;
import k9.z3;
import o9.s0;
import o9.t0;
import s10.w0;
import sd.p1;
import sd.y1;

public final class t implements c1, i2, n3, l3, ii.e, ij.a, xf.a, xf.c, p7.o, xf.f, e1, v7.m, d4.i, e7.h {
    public final int A;
    public final Object B;

    public t(int i10, PendingIntent pendingIntent) {
        this.A = 3;
        this.B = pendingIntent;
    }

    public t(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public t(z3 z3Var) {
        this.A = 5;
        Bundle bundle = Bundle.EMPTY;
        this.B = z3Var;
    }

    public t(t0 t0Var, s0 s0Var) {
        this.A = 12;
        this.B = t0Var;
    }

    @Override
    public Object M(Task task) {
        int i10 = this.A;
        Object obj = this.B;
        switch (i10) {
            case 13:
                ((CountDownLatch) obj).countDown();
                return null;
            case TYPE_SINT64_VALUE:
                return (Task) ((oi.l) obj).call();
            default:
                ((Runnable) obj).run();
                return Tasks.d(null);
        }
    }

    @Override
    public int a(Object obj) {
        androidx.media3.common.t tVar = (androidx.media3.common.t) this.B;
        p7.k kVar = (p7.k) obj;
        String str = kVar.f12396b;
        return ((str.equals(tVar.f1594n) || str.equals(p7.p.a(tVar))) && kVar.c(tVar, false) && kVar.d(tVar)) ? 1 : 0;
    }

    @Override
    public void accept(Object obj) {
        int i10 = this.A;
        Object obj2 = this.B;
        switch (i10) {
            case 28:
                x8.g gVar = (x8.g) obj2;
                x8.a aVar = (x8.a) obj;
                x8.f fVar = new x8.f(tf.y.k(aVar.f16476a, aVar.f16478c), aVar.f16477b);
                gVar.f16482c.add(fVar);
                long j9 = gVar.f16489j;
                if (j9 == -9223372036854775807L || aVar.f16479d >= j9) {
                    gVar.f(fVar);
                }
                break;
            default:
                ((q0) obj2).c((x8.a) obj);
                break;
        }
    }

    @Override
    public d2 b(int i10, l2 l2Var, int[] iArr) {
        v7.j jVar = (v7.j) this.B;
        q0 q0VarM = fh.t0.m();
        for (int i11 = 0; i11 < l2Var.f1338a; i11++) {
            q0VarM.c(new v7.g(i10, l2Var, i11, jVar, iArr[i11]));
        }
        return q0VarM.g();
    }

    @Override
    public void c(z1 z1Var, int i10) {
        z3 z3Var = (z3) this.B;
        Bundle bundle = Bundle.EMPTY;
        z1Var.m(i10, z3Var);
    }

    @Override
    public Object d(s1 s1Var, a2 a2Var, int i10) {
        int i11 = this.A;
        Object obj = this.B;
        switch (i11) {
            case 6:
                return s1Var.u(a2Var, (k9.e1) obj);
            default:
                l3 l3Var = (l3) obj;
                kh.t tVar = kh.t.B;
                if (!s1Var.o()) {
                    l3Var.f(s1Var.f9430t, a2Var);
                    p3.m2(s1Var, a2Var, i10, new d4(0));
                }
                return kh.t.B;
        }
    }

    @Override
    public void e(int i10, Object obj) {
        ((tv.b) this.B).j(false);
    }

    @Override
    public void f(v3 v3Var, a2 a2Var) {
        ((e7.h) this.B).accept(v3Var);
    }

    @Override
    public void g(k9.t0 t0Var) {
        int i10 = this.A;
        Object obj = this.B;
        switch (i10) {
            case 1:
                k9.i iVar = (k9.i) obj;
                f4 f4Var = t0Var.f9442e;
                k9.u uVar = t0Var.f9438a;
                if (t0Var.E != null) {
                    e7.a.d("MCImplBase", "Cannot be notified about the connection result many times. Probably a bug or malicious app.");
                    uVar.release();
                } else {
                    k9.m mVar = iVar.f9355c;
                    fh.t0 t0Var2 = iVar.f9364n;
                    Bundle bundle = iVar.f9361i;
                    t0Var.E = mVar;
                    t0Var.f9453r = iVar.f9356d;
                    t0Var.f9458w = iVar.f9357e;
                    b1 b1Var = iVar.f9358f;
                    t0Var.f9459x = b1Var;
                    b1 b1Var2 = iVar.f9359g;
                    t0Var.f9460y = b1Var2;
                    b1 b1VarH = k9.t0.h(b1Var, b1Var2);
                    t0Var.f9461z = b1VarH;
                    fh.t0 t0Var3 = iVar.f9363k;
                    t0Var.f9454s = t0Var3;
                    fh.t0 t0Var4 = iVar.l;
                    t0Var.f9455t = t0Var4;
                    d2 d2VarC = k9.t0.C(t0Var4, t0Var3, t0Var.f9458w, b1VarH, bundle);
                    t0Var.f9456u = d2VarC;
                    t0Var.f9457v = k9.t0.B(d2VarC, t0Var.f9454s, bundle, t0Var.f9458w, t0Var.f9461z);
                    c50.h hVar = new c50.h(4, 7);
                    for (int i11 = 0; i11 < t0Var2.size(); i11++) {
                        k9.b bVar = (k9.b) t0Var2.get(i11);
                        z3 z3Var = bVar.f9222a;
                        if (z3Var != null && z3Var.f9578a == 0) {
                            hVar.z(z3Var.f9579b, bVar);
                        }
                    }
                    hVar.c(true);
                    t0Var.f9452q = iVar.f9362j;
                    MediaSession.Token tokenH = iVar.m;
                    if (tokenH == null) {
                        tokenH = f4Var.f9293a.h();
                    }
                    MediaSession.Token token = tokenH;
                    if (token != null) {
                        t0Var.F = new MediaController(t0Var.f9441d, token);
                    }
                    try {
                        iVar.f9355c.asBinder().linkToDeath(t0Var.f9444g, 0);
                        t0Var.f9449n = new f4(f4Var.f9293a.a(), iVar.f9353a, iVar.f9354b, f4Var.f9293a.j(), iVar.f9355c, iVar.f9360h, token);
                        t0Var.J = bundle;
                        uVar.a();
                    } catch (RemoteException unused) {
                        uVar.release();
                        return;
                    }
                }
                break;
            case 2:
                c4 c4Var = (c4) obj;
                if (t0Var.isConnected() && t0Var.f9448k.isEmpty()) {
                    c4 c4Var2 = t0Var.f9452q.f9497c;
                    if (c4Var2.f9255c < c4Var.f9255c && q3.a(c4Var, c4Var2)) {
                        t0Var.f9452q = t0Var.f9452q.j(c4Var);
                        break;
                    }
                }
                break;
            case 3:
                PendingIntent pendingIntent = (PendingIntent) obj;
                if (t0Var.isConnected() && !Objects.equals(t0Var.f9453r, pendingIntent)) {
                    t0Var.f9453r = pendingIntent;
                    k9.u uVar2 = t0Var.f9438a;
                    uVar2.getClass();
                    ta.c0.A(Looper.myLooper() == uVar2.f9523f.getLooper());
                    uVar2.f9522e.getClass();
                    break;
                }
                break;
            default:
                Bundle bundle2 = (Bundle) obj;
                k9.u uVar3 = t0Var.f9438a;
                if (t0Var.isConnected()) {
                    d2 d2Var = t0Var.f9456u;
                    d2 d2Var2 = t0Var.f9457v;
                    t0Var.J = bundle2;
                    d2 d2VarC2 = k9.t0.C(t0Var.f9455t, t0Var.f9454s, t0Var.f9458w, t0Var.f9461z, bundle2);
                    t0Var.f9456u = d2VarC2;
                    t0Var.f9457v = k9.t0.B(d2VarC2, t0Var.f9454s, t0Var.J, t0Var.f9458w, t0Var.f9461z);
                    boolean zEquals = t0Var.f9456u.equals(d2Var);
                    t0Var.f9457v.equals(d2Var2);
                    uVar3.getClass();
                    ta.c0.A(Looper.myLooper() == uVar3.f9523f.getLooper());
                    k9.s sVar = uVar3.f9522e;
                    sVar.getClass();
                    if (!zEquals) {
                        sVar.o();
                    }
                    break;
                }
                break;
        }
    }

    @Override
    public Object h(d4.h hVar) {
        a40.g0 g0Var = (a40.g0) this.B;
        g0Var.f0(new b2.v(hVar, g0Var, 14));
        return "Deferred.asListenableFuture";
    }

    public com.google.crypto.tink.shaded.protobuf.d i(p1 p1Var) throws IOException {
        vd.b bVar = (vd.b) this.B;
        URL url = (URL) p1Var.B;
        String strConcat = "TRuntime.".concat("CctTransportBackend");
        if (Log.isLoggable(strConcat, 4)) {
            Log.i(strConcat, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.f15618g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) p1Var.D;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    me.i iVar = bVar.f15612a;
                    wd.m mVar = (wd.m) p1Var.C;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    dj.d dVar = (dj.d) iVar.B;
                    dj.e eVar = new dj.e(bufferedWriter, dVar.f4905a, dVar.f4906b, dVar.f4907c, dVar.f4908d);
                    eVar.h(mVar);
                    eVar.j();
                    eVar.f4910b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strConcat2 = "TRuntime.".concat("CctTransportBackend");
                    if (Log.isLoggable(strConcat2, 4)) {
                        Log.i(strConcat2, String.format("Status Code: %d", numValueOf));
                    }
                    g4.y(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    g4.y(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new com.google.crypto.tink.shaded.protobuf.d(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new com.google.crypto.tink.shaded.protobuf.d(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            com.google.crypto.tink.shaded.protobuf.d dVar2 = new com.google.crypto.tink.shaded.protobuf.d(responseCode, null, wd.u.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f16064a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return dVar2;
                        } catch (Throwable th2) {
                            if (gZIPInputStream == null) {
                                throw th2;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (Throwable th4) {
                        if (inputStream == null) {
                            throw th4;
                        }
                        try {
                            inputStream.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                } catch (Throwable th6) {
                    try {
                        gZIPOutputStream.close();
                        throw th6;
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                        throw th6;
                    }
                }
            } catch (Throwable th8) {
                if (outputStream == null) {
                    throw th8;
                }
                try {
                    outputStream.close();
                    throw th8;
                } catch (Throwable th9) {
                    th8.addSuppressed(th9);
                    throw th8;
                }
            }
        } catch (EncodingException | IOException e3) {
            g4.E("CctTransportBackend", "Couldn't encode request, returning with 400", e3);
            return new com.google.crypto.tink.shaded.protobuf.d(MediaError.DetailedErrorCode.MANIFEST_UNKNOWN, null, 0L);
        } catch (ConnectException | UnknownHostException e10) {
            g4.E("CctTransportBackend", "Couldn't open connection, returning with 500", e10);
            return new com.google.crypto.tink.shaded.protobuf.d(MediaError.DetailedErrorCode.SEGMENT_UNKNOWN, null, 0L);
        }
    }

    @Override
    public void j(ij.b bVar) {
        int i10 = this.A;
        Object obj = this.B;
        switch (i10) {
            case 10:
                li.a aVar = (li.a) obj;
                aVar.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
                }
                aVar.f10294b.set((li.a) bVar.get());
                break;
            default:
                li.b bVar2 = (li.b) obj;
                p10.a aVar2 = ((rj.e) ((uj.a) bVar.get())).a().f13594j;
                ((Set) aVar2.D).add(bVar2);
                Task taskB = ((sj.c) aVar2.A).b();
                taskB.f((Executor) aVar2.C, new ce.a(aVar2, taskB, bVar2, 14));
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Registering RemoteConfig Rollouts subscriber", null);
                }
                break;
        }
    }

    @Override
    public Task k(Object obj) {
        return Tasks.d((sj.f) this.B);
    }

    @Override
    public Object m(y1 y1Var) {
        String str;
        oi.s sVar;
        String str2;
        pi.e eVar;
        int i10;
        Throwable th2;
        String strO;
        String str3;
        ki.c cVar;
        long jCurrentTimeMillis;
        String strI;
        String string;
        String str4;
        String str5;
        oi.a aVar;
        String str6;
        String strO2;
        String strD;
        hb.f fVar;
        wi.b bVar;
        o9.q qVar;
        String strP;
        bh.f fVar2;
        int iD;
        String string2;
        String[] strArr;
        ArrayList arrayList;
        int i11;
        StringBuilder sb2;
        Iterator it;
        String string3;
        String strH;
        a30.k kVar;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        wi.a aVarC;
        a2.o oVar;
        Task taskP;
        oi.s sVar2;
        Context context;
        boolean z10;
        String str7;
        pi.e eVar2;
        boolean zExists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        wi.a aVarC2;
        String str8;
        String string4;
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.B;
        int i12 = CrashlyticsRegistrar.f4346d;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        bi.g gVar = (bi.g) y1Var.a(bi.g.class);
        jj.d dVar = (jj.d) y1Var.a(jj.d.class);
        ii.n nVarF = y1Var.F(li.a.class);
        ii.n nVarF2 = y1Var.F(fi.b.class);
        ii.n nVarF3 = y1Var.F(uj.a.class);
        ExecutorService executorService = (ExecutorService) y1Var.g(crashlyticsRegistrar.f4347a);
        ExecutorService executorService2 = (ExecutorService) y1Var.g(crashlyticsRegistrar.f4348b);
        ExecutorService executorService3 = (ExecutorService) y1Var.g(crashlyticsRegistrar.f4349c);
        gVar.a();
        Context context2 = gVar.f2531a;
        String packageName = context2.getPackageName();
        Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.0.3 for " + packageName, null);
        pi.e eVar3 = new pi.e(executorService, executorService2);
        ui.b bVar2 = new ui.b(context2);
        a2.o oVar2 = new a2.o(gVar);
        oi.x xVar = new oi.x(context2, packageName, dVar, oVar2);
        li.a aVar2 = new li.a(nVarF);
        ki.b bVar3 = new ki.b(nVarF2);
        oi.j jVar = new oi.j(oVar2, bVar2);
        xj.c cVar2 = xj.c.f16578a;
        xj.d dVar2 = xj.d.A;
        xj.c cVar3 = xj.c.f16578a;
        xj.a aVarA = xj.c.a(dVar2);
        if (aVarA.f16577b != null) {
            Log.d("FirebaseSessions", "Subscriber " + dVar2 + " already registered.");
            str = null;
        } else {
            aVarA.f16577b = jVar;
            Log.d("FirebaseSessions", "Subscriber " + dVar2 + " registered.");
            str = null;
            aVarA.f16576a.i((Object) null);
        }
        oi.s sVar3 = new oi.s(gVar, xVar, aVar2, oVar2, new ki.a(bVar3), new ki.a(bVar3), bVar2, jVar, new hf.c(nVarF3, 17), eVar3);
        pi.e eVar4 = sVar3.f12045o;
        gVar.a();
        String str9 = gVar.f2533c.f2542b;
        int iD2 = oi.g.d(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iD2 == 0) {
            iD2 = oi.g.d(context2, "com.crashlytics.android.build_id", "string");
        }
        String string5 = iD2 != 0 ? context2.getResources().getString(iD2) : str;
        ArrayList<oi.d> arrayList2 = new ArrayList();
        int iD3 = oi.g.d(context2, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iD4 = oi.g.d(context2, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iD5 = oi.g.d(context2, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        try {
            if (iD3 == 0 || iD4 == 0 || iD5 == 0) {
                sVar = sVar3;
                str2 = str9;
                eVar = eVar4;
                String str10 = String.format("Could not find resources: %d %d %d", Integer.valueOf(iD3), Integer.valueOf(iD4), Integer.valueOf(iD5));
                i10 = 3;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    th2 = null;
                    Log.d("FirebaseCrashlytics", str10, null);
                }
                strO = a1.b.o("Mapping file ID is: ", string5);
                if (Log.isLoggable("FirebaseCrashlytics", i10)) {
                    Log.d("FirebaseCrashlytics", strO, th2);
                }
                for (oi.d dVar3 : arrayList2) {
                    String str11 = dVar3.f11993a;
                    String str12 = dVar3.f11994b;
                    String str13 = dVar3.f11995c;
                    StringBuilder sbS = a1.b.s("Build id for ", str11, " on ", str12, ": ");
                    sbS.append(str13);
                    string4 = sbS.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", string4, null);
                    }
                }
                h7.b bVar4 = new h7.b(context2, 17);
                String packageName2 = context2.getPackageName();
                String strD2 = xVar.d();
                PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(packageName2, 0);
                string = Long.toString(packageInfo.getLongVersionCode());
                str4 = packageInfo.versionName;
                if (str4 == null) {
                    str4 = "0.0";
                }
                str5 = str4;
                aVar = new oi.a(str2, string5, arrayList2, strD2, packageName2, string, str5, bVar4);
                str6 = str2;
                strO2 = a1.b.o("Installer package name is: ", strD2);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strO2, null);
                }
                new tf.x(12);
                strD = xVar.d();
                fVar = new hb.f();
                bVar = new wi.b(fVar, 0);
                qVar = new o9.q(bVar2);
                Locale locale = Locale.US;
                strP = a1.b.p("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str6, "/settings");
                fVar2 = new bh.f();
                if (strP != null) {
                    throw new IllegalArgumentException("url must not be null.");
                }
                fVar2.A = strP;
                String str14 = Build.MANUFACTURER;
                String str15 = oi.x.f12061h;
                String strM = x5.m(str14.replaceAll(str15, RuntimeVersion.SUFFIX), "/", Build.MODEL.replaceAll(str15, RuntimeVersion.SUFFIX));
                String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str15, RuntimeVersion.SUFFIX);
                String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str15, RuntimeVersion.SUFFIX);
                iD = oi.g.d(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (iD == 0) {
                    iD = oi.g.d(context2, "com.crashlytics.android.build_id", "string");
                }
                if (iD != 0) {
                    string2 = context2.getResources().getString(iD);
                } else {
                    string2 = null;
                }
                strArr = new String[]{string2, str6, str5, string};
                arrayList = new ArrayList();
                i11 = 0;
                while (true) {
                    if (i11 < 4) {
                        break;
                    }
                    str8 = strArr[i11];
                    String str16 = str6;
                    if (str8 != null) {
                        arrayList.add(str8.replace("-", RuntimeVersion.SUFFIX).toLowerCase(Locale.US));
                    }
                    i11++;
                    str6 = str16;
                }
                String str17 = str6;
                Collections.sort(arrayList);
                sb2 = new StringBuilder();
                it = arrayList.iterator();
                while (it.hasNext()) {
                    sb2.append((String) it.next());
                }
                string3 = sb2.toString();
                if (string3.length() > 0) {
                    strH = oi.g.h(string3);
                } else {
                    strH = null;
                }
                wi.d dVar4 = new wi.d(str17, strM, strReplaceAll, strReplaceAll2, xVar, strH, str5, string, oi.k.c(strD == null ? 1 : 4));
                kVar = new a30.k();
                AtomicReference atomicReference3 = new AtomicReference();
                kVar.h = atomicReference3;
                kVar.i = new AtomicReference(new xf.g());
                kVar.a = context2;
                kVar.b = dVar4;
                kVar.d = fVar;
                kVar.c = bVar;
                kVar.e = qVar;
                kVar.f = fVar2;
                kVar.g = oVar2;
                atomicReference3.set(tf.y.e(fVar));
                atomicReference = (AtomicReference) kVar.i;
                atomicReference2 = (AtomicReference) kVar.h;
                if (((Context) kVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", RuntimeVersion.SUFFIX).equals(((wi.d) kVar.b).f16099f) || (aVarC2 = kVar.c(1)) == null) {
                    aVarC = kVar.c(3);
                    if (aVarC != null) {
                        atomicReference2.set(aVarC);
                        ((xf.g) atomicReference.get()).d(aVarC);
                    }
                    oVar = (a2.o) kVar.g;
                    xf.n nVar = ((xf.g) oVar.F).f16565a;
                    synchronized (oVar.E) {
                        xf.n nVar2 = ((xf.g) oVar.B).f16565a;
                    }
                    taskP = pi.a.a(nVar, nVar2).p(eVar3.f12529a, new w0(12, kVar, eVar3, false));
                } else {
                    atomicReference2.set(aVarC2);
                    ((xf.g) atomicReference.get()).d(aVarC2);
                    taskP = Tasks.d(null);
                }
                int i13 = 11;
                taskP.d(executorService3, new b3(i13));
                sVar2 = sVar;
                ui.b bVar5 = sVar2.f12041i;
                context = sVar2.f12033a;
                if (context != null || (resources = context.getResources()) == null) {
                    z10 = true;
                } else {
                    int iD6 = oi.g.d(context, "com.crashlytics.RequireBuildId", "bool");
                    if (iD6 > 0) {
                        z10 = resources.getBoolean(iD6);
                    } else {
                        int iD7 = oi.g.d(context, "com.crashlytics.RequireBuildId", "string");
                        if (iD7 > 0) {
                            z10 = Boolean.parseBoolean(context.getString(iD7));
                        } else {
                            z10 = true;
                        }
                    }
                }
                str7 = aVar.f11980b;
                if (z10) {
                    str3 = "FirebaseCrashlytics";
                    if (TextUtils.isEmpty(str7)) {
                        Log.e(str3, ".");
                        Log.e(str3, ".     |  | ");
                        Log.e(str3, ".     |  |");
                        Log.e(str3, ".     |  |");
                        Log.e(str3, ".   \\ |  | /");
                        Log.e(str3, ".    \\    /");
                        Log.e(str3, ".     \\  /");
                        Log.e(str3, ".      \\/");
                        Log.e(str3, ".");
                        Log.e(str3, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                        Log.e(str3, ".");
                        Log.e(str3, ".      /\\");
                        Log.e(str3, ".     /  \\");
                        Log.e(str3, ".    /    \\");
                        Log.e(str3, ".   / |  | \\");
                        Log.e(str3, ".     |  |");
                        Log.e(str3, ".     |  |");
                        Log.e(str3, ".     |  |");
                        Log.e(str3, ".");
                        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                    }
                } else {
                    str3 = "FirebaseCrashlytics";
                    if (Log.isLoggable(str3, 2)) {
                        Log.v(str3, "Configured not to require a build ID.", null);
                    }
                }
                String str18 = new oi.e().f11998a;
                try {
                    boolean z11 = false;
                    sVar2.f12038f = new h1.l("crash_marker", bVar5, z11);
                    sVar2.f12037e = new h1.l("initialization_marker", bVar5, z11);
                    eVar2 = eVar;
                    ui.b bVar6 = new ui.b(str18, bVar5, eVar2);
                    qi.f fVar3 = new qi.f(bVar5);
                    q3.e0 e0Var = new q3.e0(new xi.a[]{new tf.x(21)});
                    hf.c cVar4 = sVar2.f12044n;
                    cVar4.getClass();
                    ((ii.n) cVar4.B).a(new t(new li.b(bVar6), i13));
                    sVar2.f12039g = new oi.n(sVar2.f12033a, sVar2.f12040h, sVar2.f12034b, sVar2.f12041i, sVar2.f12038f, aVar, bVar6, fVar3, ui.b.i(sVar2.f12033a, sVar2.f12040h, sVar2.f12041i, aVar, fVar3, bVar6, e0Var, kVar, sVar2.f12035c, sVar2.l, sVar2.f12045o), sVar2.m, sVar2.f12043k, sVar2.l, sVar2.f12045o);
                    h1.l lVar = sVar2.f12037e;
                    ui.b bVar7 = (ui.b) lVar.B;
                    String str19 = (String) lVar.A;
                    bVar7.getClass();
                    zExists = new File((File) bVar7.D, str19).exists();
                    try {
                        Boolean.TRUE.equals((Boolean) eVar2.f12529a.A.submit(new cc.b(sVar2, 1)).get(3L, TimeUnit.SECONDS));
                    } catch (Exception unused) {
                    }
                    oi.n nVar3 = sVar2.f12039g;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                    nVar3.f12021e.f12529a.a(new ji.a(nVar3, str18, 29));
                    oi.u uVar = new oi.u(new o10.b(nVar3, 3), kVar, defaultUncaughtExceptionHandler, nVar3.f12026j);
                    nVar3.f12028n = uVar;
                    Thread.setDefaultUncaughtExceptionHandler(uVar);
                    if (zExists || (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                        if (Log.isLoggable(str3, 3)) {
                            Log.d(str3, "Successfully configured exception handler.", null);
                        }
                        eVar2.f12529a.a(new oi.o(sVar2, kVar, 0));
                    } else {
                        if (Log.isLoggable(str3, 3)) {
                            Log.d(str3, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                        }
                        sVar2.b(kVar);
                    }
                } catch (Exception e3) {
                    Log.e(str3, "Crashlytics was not started due to an exception during initialization", e3);
                    sVar2.f12039g = null;
                }
                cVar = new ki.c(sVar2);
                jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                if (jCurrentTimeMillis > 16) {
                    strI = oi.k.i("Initializing Crashlytics blocked main for ", jCurrentTimeMillis, " ms");
                    if (Log.isLoggable(str3, 3)) {
                        Log.d(str3, strI, null);
                    }
                }
                return cVar;
            }
            String[] stringArray = context2.getResources().getStringArray(iD3);
            String[] stringArray2 = context2.getResources().getStringArray(iD4);
            String[] stringArray3 = context2.getResources().getStringArray(iD5);
            str2 = str9;
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                int i14 = 0;
                while (i14 < stringArray3.length) {
                    int i15 = i14;
                    arrayList2.add(new oi.d(stringArray[i15], stringArray2[i15], stringArray3[i15]));
                    i14 = i15 + 1;
                    eVar4 = eVar4;
                    sVar3 = sVar3;
                }
                sVar = sVar3;
                eVar = eVar4;
            } else {
                sVar = sVar3;
                eVar = eVar4;
                String str20 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str20, null);
                }
            }
            i10 = 3;
            String packageName3 = context2.getPackageName();
            String strD3 = xVar.d();
            PackageInfo packageInfo2 = context2.getPackageManager().getPackageInfo(packageName3, 0);
            string = Long.toString(packageInfo2.getLongVersionCode());
            str4 = packageInfo2.versionName;
            if (str4 == null) {
                str4 = "0.0";
            }
            str5 = str4;
            aVar = new oi.a(str2, string5, arrayList2, strD3, packageName3, string, str5, bVar4);
            str6 = str2;
            strO2 = a1.b.o("Installer package name is: ", strD3);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strO2, null);
            }
            new tf.x(12);
            strD = xVar.d();
            fVar = new hb.f();
            bVar = new wi.b(fVar, 0);
            qVar = new o9.q(bVar2);
            Locale locale2 = Locale.US;
            strP = a1.b.p("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str6, "/settings");
            fVar2 = new bh.f();
            if (strP != null) {
                throw new IllegalArgumentException("url must not be null.");
            }
            fVar2.A = strP;
            String str110 = Build.MANUFACTURER;
            String str111 = oi.x.f12061h;
            String strM2 = x5.m(str110.replaceAll(str111, RuntimeVersion.SUFFIX), "/", Build.MODEL.replaceAll(str111, RuntimeVersion.SUFFIX));
            String strReplaceAll3 = Build.VERSION.INCREMENTAL.replaceAll(str111, RuntimeVersion.SUFFIX);
            String strReplaceAll4 = Build.VERSION.RELEASE.replaceAll(str111, RuntimeVersion.SUFFIX);
            iD = oi.g.d(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (iD == 0) {
                iD = oi.g.d(context2, "com.crashlytics.android.build_id", "string");
            }
            if (iD != 0) {
                string2 = context2.getResources().getString(iD);
            } else {
                string2 = null;
            }
            strArr = new String[]{string2, str6, str5, string};
            arrayList = new ArrayList();
            i11 = 0;
            while (true) {
                if (i11 < 4) {
                    break;
                    break;
                }
                str8 = strArr[i11];
                String str112 = str6;
                if (str8 != null) {
                    arrayList.add(str8.replace("-", RuntimeVersion.SUFFIX).toLowerCase(Locale.US));
                }
                i11++;
                str6 = str112;
            }
            String str113 = str6;
            Collections.sort(arrayList);
            sb2 = new StringBuilder();
            it = arrayList.iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
            }
            string3 = sb2.toString();
            if (string3.length() > 0) {
                strH = oi.g.h(string3);
            } else {
                strH = null;
            }
            wi.d dVar5 = new wi.d(str113, strM2, strReplaceAll3, strReplaceAll4, xVar, strH, str5, string, oi.k.c(strD == null ? 1 : 4));
            kVar = new a30.k();
            AtomicReference atomicReference4 = new AtomicReference();
            kVar.h = atomicReference4;
            kVar.i = new AtomicReference(new xf.g());
            kVar.a = context2;
            kVar.b = dVar5;
            kVar.d = fVar;
            kVar.c = bVar;
            kVar.e = qVar;
            kVar.f = fVar2;
            kVar.g = oVar2;
            atomicReference4.set(tf.y.e(fVar));
            atomicReference = (AtomicReference) kVar.i;
            atomicReference2 = (AtomicReference) kVar.h;
            if (((Context) kVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", RuntimeVersion.SUFFIX).equals(((wi.d) kVar.b).f16099f)) {
                aVarC = kVar.c(3);
                if (aVarC != null) {
                    atomicReference2.set(aVarC);
                    ((xf.g) atomicReference.get()).d(aVarC);
                }
                oVar = (a2.o) kVar.g;
                xf.n nVar4 = ((xf.g) oVar.F).f16565a;
                synchronized (oVar.E) {
                    xf.n nVar5 = ((xf.g) oVar.B).f16565a;
                    taskP = pi.a.a(nVar4, nVar5).p(eVar3.f12529a, new w0(12, kVar, eVar3, false));
                }
            } else {
                aVarC = kVar.c(3);
                if (aVarC != null) {
                    atomicReference2.set(aVarC);
                    ((xf.g) atomicReference.get()).d(aVarC);
                }
                oVar = (a2.o) kVar.g;
                xf.n nVar6 = ((xf.g) oVar.F).f16565a;
                synchronized (oVar.E) {
                    xf.n nVar7 = ((xf.g) oVar.B).f16565a;
                    taskP = pi.a.a(nVar6, nVar7).p(eVar3.f12529a, new w0(12, kVar, eVar3, false));
                }
            }
            int i16 = 11;
            taskP.d(executorService3, new b3(i16));
            sVar2 = sVar;
            ui.b bVar8 = sVar2.f12041i;
            context = sVar2.f12033a;
            if (context != null) {
                z10 = true;
            } else {
                z10 = true;
            }
            str7 = aVar.f11980b;
            if (z10) {
                str3 = "FirebaseCrashlytics";
                if (Log.isLoggable(str3, 2)) {
                    Log.v(str3, "Configured not to require a build ID.", null);
                }
            } else {
                str3 = "FirebaseCrashlytics";
                if (TextUtils.isEmpty(str7)) {
                    Log.e(str3, ".");
                    Log.e(str3, ".     |  | ");
                    Log.e(str3, ".     |  |");
                    Log.e(str3, ".     |  |");
                    Log.e(str3, ".   \\ |  | /");
                    Log.e(str3, ".    \\    /");
                    Log.e(str3, ".     \\  /");
                    Log.e(str3, ".      \\/");
                    Log.e(str3, ".");
                    Log.e(str3, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                    Log.e(str3, ".");
                    Log.e(str3, ".      /\\");
                    Log.e(str3, ".     /  \\");
                    Log.e(str3, ".    /    \\");
                    Log.e(str3, ".   / |  | \\");
                    Log.e(str3, ".     |  |");
                    Log.e(str3, ".     |  |");
                    Log.e(str3, ".     |  |");
                    Log.e(str3, ".");
                    throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                }
            }
            String str114 = new oi.e().f11998a;
            boolean z12 = false;
            sVar2.f12038f = new h1.l("crash_marker", bVar8, z12);
            sVar2.f12037e = new h1.l("initialization_marker", bVar8, z12);
            eVar2 = eVar;
            ui.b bVar9 = new ui.b(str114, bVar8, eVar2);
            qi.f fVar4 = new qi.f(bVar8);
            q3.e0 e0Var2 = new q3.e0(new xi.a[]{new tf.x(21)});
            hf.c cVar5 = sVar2.f12044n;
            cVar5.getClass();
            ((ii.n) cVar5.B).a(new t(new li.b(bVar9), i16));
            sVar2.f12039g = new oi.n(sVar2.f12033a, sVar2.f12040h, sVar2.f12034b, sVar2.f12041i, sVar2.f12038f, aVar, bVar9, fVar4, ui.b.i(sVar2.f12033a, sVar2.f12040h, sVar2.f12041i, aVar, fVar4, bVar9, e0Var2, kVar, sVar2.f12035c, sVar2.l, sVar2.f12045o), sVar2.m, sVar2.f12043k, sVar2.l, sVar2.f12045o);
            h1.l lVar2 = sVar2.f12037e;
            ui.b bVar10 = (ui.b) lVar2.B;
            String str115 = (String) lVar2.A;
            bVar10.getClass();
            zExists = new File((File) bVar10.D, str115).exists();
            Boolean.TRUE.equals((Boolean) eVar2.f12529a.A.submit(new cc.b(sVar2, 1)).get(3L, TimeUnit.SECONDS));
            oi.n nVar8 = sVar2.f12039g;
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
            nVar8.f12021e.f12529a.a(new ji.a(nVar8, str114, 29));
            oi.u uVar2 = new oi.u(new o10.b(nVar8, 3), kVar, defaultUncaughtExceptionHandler2, nVar8.f12026j);
            nVar8.f12028n = uVar2;
            Thread.setDefaultUncaughtExceptionHandler(uVar2);
            if (zExists) {
                if (Log.isLoggable(str3, 3)) {
                    Log.d(str3, "Successfully configured exception handler.", null);
                }
                eVar2.f12529a.a(new oi.o(sVar2, kVar, 0));
            } else {
                if (Log.isLoggable(str3, 3)) {
                    Log.d(str3, "Successfully configured exception handler.", null);
                }
                eVar2.f12529a.a(new oi.o(sVar2, kVar, 0));
            }
            cVar = new ki.c(sVar2);
            jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
            if (jCurrentTimeMillis > 16) {
                strI = oi.k.i("Initializing Crashlytics blocked main for ", jCurrentTimeMillis, " ms");
                if (Log.isLoggable(str3, 3)) {
                    Log.d(str3, strI, null);
                }
            }
            return cVar;
        } catch (PackageManager.NameNotFoundException e10) {
            str3 = "FirebaseCrashlytics";
            Log.e(str3, "Error retrieving app package info.", e10);
            cVar = null;
        }
        th2 = null;
        strO = a1.b.o("Mapping file ID is: ", string5);
        if (Log.isLoggable("FirebaseCrashlytics", i10)) {
            Log.d("FirebaseCrashlytics", strO, th2);
        }
        while (r3.hasNext()) {
            String str116 = dVar3.f11993a;
            String str117 = dVar3.f11994b;
            String str118 = dVar3.f11995c;
            StringBuilder sbS2 = a1.b.s("Build id for ", str116, " on ", str117, ": ");
            sbS2.append(str118);
            string4 = sbS2.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", string4, null);
            }
        }
        h7.b bVar11 = new h7.b(context2, 17);
    }

    @Override
    public void onComplete(Task task) {
        int i10 = this.A;
        Object obj = this.B;
        switch (i10) {
            case 14:
                oj.z.b((Intent) obj);
                break;
            case 15:
                ((oj.b0) obj).f12087b.d(null);
                break;
            case 16:
                ((ScheduledFuture) obj).cancel(false);
                break;
            default:
                sl.a aVar = (sl.a) obj;
                kotlin.jvm.internal.m.e(task, "it");
                d40.p1 p1Var = aVar.b;
                rj.b bVar = aVar.a;
                Boolean boolValueOf = Boolean.valueOf(bVar.a("is_technical_work_mode"));
                p1Var.getClass();
                p1Var.k((Object) null, boolValueOf);
                d40.p1 p1Var2 = aVar.c;
                Boolean boolValueOf2 = Boolean.valueOf(bVar.a("is_force_update_hard"));
                p1Var2.getClass();
                p1Var2.k((Object) null, boolValueOf2);
                d40.p1 p1Var3 = aVar.d;
                String strB = bVar.b();
                p1Var3.getClass();
                p1Var3.k((Object) null, strB);
                break;
        }
    }
}

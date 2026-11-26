package jj;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsException;
import h1.l;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import ji.k;
import org.json.JSONException;
import org.json.JSONObject;
import xf.n;

public final class c implements d {
    public static final Object m = new Object();

    public final bi.g f8293a;

    public final lj.c f8294b;

    public final l f8295c;

    public final i f8296d;

    public final ii.l f8297e;

    public final g f8298f;

    public final Object f8299g;

    public final ExecutorService f8300h;

    public final k f8301i;

    public String f8302j;

    public final HashSet f8303k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public c(bi.g gVar, ij.b bVar, ExecutorService executorService, k kVar) {
        gVar.a();
        lj.c cVar = new lj.c(gVar.f2531a, bVar);
        l lVar = new l();
        lVar.B = gVar;
        if (gj.e.D == null) {
            gj.e.D = new gj.e(21);
        }
        gj.e eVar = gj.e.D;
        if (i.f8311d == null) {
            i.f8311d = new i(eVar);
        }
        i iVar = i.f8311d;
        ii.l lVar2 = new ii.l(new ii.d(gVar, 2));
        g gVar2 = new g();
        this.f8299g = new Object();
        this.f8303k = new HashSet();
        this.l = new ArrayList();
        this.f8293a = gVar;
        this.f8294b = cVar;
        this.f8295c = lVar;
        this.f8296d = iVar;
        this.f8297e = lVar2;
        this.f8298f = gVar2;
        this.f8300h = executorService;
        this.f8301i = kVar;
    }

    public final void a() {
        kj.b bVarW0;
        synchronized (m) {
            try {
                bi.g gVar = this.f8293a;
                gVar.a();
                h7.b bVarI = h7.b.i(gVar.f2531a);
                try {
                    bVarW0 = this.f8295c.W0();
                    int i10 = bVarW0.f9693b;
                    boolean z10 = true;
                    if (i10 != 2 && i10 != 1) {
                        z10 = false;
                    }
                    if (z10) {
                        String strF = f(bVarW0);
                        l lVar = this.f8295c;
                        kj.a aVarA = bVarW0.a();
                        aVarA.f9683a = strF;
                        aVarA.f9684b = 3;
                        bVarW0 = aVarA.a();
                        lVar.R0(bVarW0);
                    }
                    if (bVarI != null) {
                        bVarI.y();
                    }
                } catch (Throwable th2) {
                    if (bVarI != null) {
                        bVarI.y();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        i(bVarW0);
        this.f8301i.execute(new b(this, 2));
    }

    public final kj.b b(kj.b bVar) throws FirebaseInstallationsException {
        int i10;
        lj.b bVar2;
        lj.b bVarF;
        lj.c cVar = this.f8294b;
        bi.g gVar = this.f8293a;
        gVar.a();
        String str = gVar.f2533c.f2541a;
        String str2 = bVar.f9692a;
        bi.g gVar2 = this.f8293a;
        gVar2.a();
        String str3 = gVar2.f2533c.f2547g;
        String str4 = bVar.f9695d;
        lj.d dVar = cVar.f10310c;
        if (!dVar.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = lj.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i11 = 0;
        while (true) {
            if (i11 > 1) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = cVar.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    lj.c.h(httpURLConnectionC);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    dVar.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        bVarF = lj.c.f(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    lj.c.b(httpURLConnectionC, null, str, str3);
                    i10 = i11;
                    try {
                        if (responseCode == 401 || responseCode == 404) {
                            if (((byte) (0 | 1)) != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            bVar2 = new lj.b(null, 0L, 3);
                        } else {
                            if (responseCode == 429) {
                                throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                if (((byte) (0 | 1)) != 1) {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                                bVar2 = new lj.b(null, 0L, 2);
                            }
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i11 = i10 + 1;
                        }
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        bVarF = bVar2;
                        break;
                    } catch (IOException | AssertionError unused) {
                    }
                } catch (Throwable th2) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            } catch (IOException | AssertionError unused2) {
                i10 = i11;
            }
        }
        int iB = e4.f.b(bVarF.f10305c);
        if (iB != 0) {
            if (iB == 1) {
                kj.a aVarA = bVar.a();
                aVarA.f9689g = "BAD CONFIG";
                aVarA.f9684b = 5;
                return aVarA.a();
            }
            if (iB != 2) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.f8302j = null;
            }
            kj.a aVarA2 = bVar.a();
            aVarA2.f9684b = 2;
            return aVarA2.a();
        }
        String str5 = bVarF.f10303a;
        long j9 = bVarF.f10304b;
        i iVar = this.f8296d;
        iVar.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        iVar.f8312a.getClass();
        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
        kj.a aVarA3 = bVar.a();
        aVarA3.f9685c = str5;
        aVarA3.f9687e = j9;
        byte b7 = (byte) (aVarA3.f9690h | 1);
        aVarA3.f9688f = seconds;
        aVarA3.f9690h = (byte) (b7 | 2);
        return aVarA3.a();
    }

    public final n c() {
        String str;
        e();
        synchronized (this) {
            str = this.f8302j;
        }
        if (str != null) {
            return Tasks.d(str);
        }
        xf.g gVar = new xf.g();
        f fVar = new f(gVar);
        synchronized (this.f8299g) {
            this.l.add(fVar);
        }
        n nVar = gVar.f16565a;
        this.f8300h.execute(new b(this, 0));
        return nVar;
    }

    public final n d() {
        e();
        xf.g gVar = new xf.g();
        e eVar = new e(this.f8296d, gVar);
        synchronized (this.f8299g) {
            this.l.add(eVar);
        }
        n nVar = gVar.f16565a;
        this.f8300h.execute(new b(this, 1));
        return nVar;
    }

    public final void e() {
        bi.g gVar = this.f8293a;
        gVar.a();
        d0.f(gVar.f2533c.f2542b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        d0.f(gVar.f2533c.f2547g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        d0.f(gVar.f2533c.f2541a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f2533c.f2542b;
        Pattern pattern = i.f8310c;
        d0.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        d0.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", i.f8310c.matcher(gVar.f2533c.f2541a).matches());
    }

    public final String f(kj.b bVar) {
        kj.c cVar;
        String string;
        bi.g gVar = this.f8293a;
        gVar.a();
        if (!gVar.f2532b.equals("CHIME_ANDROID_SDK")) {
            bi.g gVar2 = this.f8293a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f2532b)) {
                if (bVar.f9693b == 1) {
                    cVar = (kj.c) this.f8297e.get();
                    synchronized (cVar.f9700a) {
                        try {
                            synchronized (cVar.f9700a) {
                                string = cVar.f9700a.getString("|S|id", null);
                            }
                            if (string != null) {
                                string = cVar.a();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f8298f.getClass();
                    return g.a();
                }
            }
        } else if (bVar.f9693b == 1) {
            cVar = (kj.c) this.f8297e.get();
            synchronized (cVar.f9700a) {
                synchronized (cVar.f9700a) {
                    string = cVar.f9700a.getString("|S|id", null);
                    if (string != null) {
                        string = cVar.a();
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f8298f.getClass();
                    return g.a();
                }
            }
        }
        this.f8298f.getClass();
        return g.a();
    }

    public final kj.b g(kj.b bVar) throws FirebaseInstallationsException {
        String str = bVar.f9692a;
        String string = null;
        if (str != null && str.length() == 11) {
            kj.c cVar = (kj.c) this.f8297e.get();
            synchronized (cVar.f9700a) {
                try {
                    String[] strArr = kj.c.f9699c;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 4) {
                            break;
                        }
                        String str2 = strArr[i10];
                        String string2 = cVar.f9700a.getString("|T|" + cVar.f9701b + "|" + str2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i10++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        lj.c cVar2 = this.f8294b;
        bi.g gVar = this.f8293a;
        gVar.a();
        String str3 = gVar.f2533c.f2541a;
        String str4 = bVar.f9692a;
        bi.g gVar2 = this.f8293a;
        gVar2.a();
        String str5 = gVar2.f2533c.f2547g;
        bi.g gVar3 = this.f8293a;
        gVar3.a();
        String str6 = gVar3.f2533c.f2542b;
        lj.d dVar = cVar2.f10310c;
        if (!dVar.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = lj.c.a("projects/" + str5 + "/installations");
        int i11 = 0;
        lj.a aVar = cVar2;
        while (i11 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = aVar.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    lj.c.g(httpURLConnectionC, str4, str6);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    dVar.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        lj.a aVarE = lj.c.e(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar = aVarE;
                    } else {
                        try {
                            lj.c.b(httpURLConnectionC, str6, str3, str5);
                            if (responseCode == 429) {
                                throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                lj.a aVar2 = new lj.a(null, null, null, null, 2);
                                httpURLConnectionC.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                aVar = aVar2;
                            } else {
                                httpURLConnectionC.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i11++;
                                aVar = aVar;
                            }
                        } catch (IOException | AssertionError unused2) {
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i11++;
                        aVar = aVar;
                    }
                    int iB = e4.f.b(aVar.f10302e);
                    if (iB != 0) {
                        if (iB != 1) {
                            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                        }
                        kj.a aVarA = bVar.a();
                        aVarA.f9689g = "BAD CONFIG";
                        aVarA.f9684b = 5;
                        return aVarA.a();
                    }
                    String str7 = aVar.f10299b;
                    String str8 = aVar.f10300c;
                    i iVar = this.f8296d;
                    iVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    iVar.f8312a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    lj.b bVar2 = aVar.f10301d;
                    String str9 = bVar2.f10303a;
                    long j9 = bVar2.f10304b;
                    kj.a aVarA2 = bVar.a();
                    aVarA2.f9683a = str7;
                    aVarA2.f9684b = 4;
                    aVarA2.f9685c = str9;
                    aVarA2.f9686d = str8;
                    aVarA2.f9687e = j9;
                    byte b7 = (byte) (aVarA2.f9690h | 1);
                    aVarA2.f9688f = seconds;
                    aVarA2.f9690h = (byte) (b7 | 2);
                    return aVarA2.a();
                } catch (IOException | AssertionError unused3) {
                }
            } catch (Throwable th3) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th3;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.f8299g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(kj.b bVar) {
        synchronized (this.f8299g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).a(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

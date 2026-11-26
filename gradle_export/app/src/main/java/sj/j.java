package sj;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.cast.Cast;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class j {

    public static final int[] f14281s = {2, 4, 8, 16, 32, 64, Cast.MAX_NAMESPACE_LENGTH, 256};

    public static final Pattern f14282t = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    public final LinkedHashSet f14283a;

    public int f14285c;

    public HttpURLConnection f14288f;

    public k7.e f14289g;

    public final ScheduledExecutorService f14290h;

    public final g f14291i;

    public final bi.g f14292j;

    public final jj.d f14293k;
    public final c l;
    public final Context m;

    public final l f14297q;

    public boolean f14284b = false;

    public final Random f14295o = new Random();

    public final ve.b f14296p = ve.b.f15619a;

    public final String f14294n = "firebase";

    public boolean f14286d = false;

    public boolean f14287e = false;

    public final Object f14298r = new Object();

    public j(bi.g gVar, jj.d dVar, g gVar2, c cVar, Context context, LinkedHashSet linkedHashSet, l lVar, ScheduledExecutorService scheduledExecutorService) {
        this.f14283a = linkedHashSet;
        this.f14290h = scheduledExecutorService;
        this.f14285c = Math.max(8 - lVar.c().f14299a, 1);
        this.f14292j = gVar;
        this.f14291i = gVar2;
        this.f14293k = dVar;
        this.l = cVar;
        this.m = context;
        this.f14297q = lVar;
    }

    public static boolean d(int i10) {
        return i10 == 408 || i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    public final synchronized boolean a() {
        return (this.f14283a.isEmpty() || this.f14284b || this.f14286d || this.f14287e) ? false : true;
    }

    public final void b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f14288f;
        if (httpURLConnection != null && !this.f14287e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e3) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e3);
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e10) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e10);
            }
        }
    }

    public final String c(String str) {
        bi.g gVar = this.f14292j;
        gVar.a();
        Matcher matcher = f14282t.matcher(gVar.f2533c.f2542b);
        return a1.b.q("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void e(long j9) {
        try {
            if (a()) {
                int i10 = this.f14285c;
                if (i10 > 0) {
                    this.f14285c = i10 - 1;
                    this.f14290h.schedule((Runnable) new a50.d(this, 19), j9, TimeUnit.MILLISECONDS);
                } else if (!this.f14287e) {
                    new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.");
                    g();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void g() {
        Iterator it = this.f14283a.iterator();
        while (it.hasNext()) {
            ((i) it.next()).a();
        }
    }

    public final synchronized void h() {
        this.f14296p.getClass();
        e(Math.max(0L, this.f14297q.c().f14300b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    public final void i(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        String strA;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        bi.g gVar = this.f14292j;
        gVar.a();
        bi.i iVar = gVar.f2533c;
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", iVar.f2541a);
        Context context = this.m;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            byte[] bArrD = ve.c.d(context, context.getPackageName());
            if (bArrD == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                strA = null;
            } else {
                strA = ve.c.a(bArrD);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + context.getPackageName());
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strA);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        HashMap map = new HashMap();
        gVar.a();
        Matcher matcher = f14282t.matcher(iVar.f2542b);
        map.put("project", matcher.matches() ? matcher.group(1) : null);
        map.put("namespace", this.f14294n);
        map.put("lastKnownVersionNumber", Long.toString(this.f14291i.f14272g.f14303a.getLong("last_template_version", 0L)));
        gVar.a();
        map.put("appId", iVar.f2542b);
        map.put("sdkVersion", "23.0.1");
        map.put("appInstanceId", str);
        byte[] bytes = new JSONObject(map).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final synchronized k7.e j(HttpURLConnection httpURLConnection) {
        return new k7.e(httpURLConnection, this.f14291i, this.l, this.f14283a, new i(this), this.f14290h, this.f14297q);
    }

    public final void k(Date date) {
        l lVar = this.f14297q;
        int i10 = lVar.c().f14299a + 1;
        long millis = TimeUnit.MINUTES.toMillis(f14281s[(i10 < 8 ? i10 : 8) - 1]);
        lVar.e(i10, new Date(date.getTime() + (millis / 2) + ((long) this.f14295o.nextInt((int) millis))));
    }
}

package k7;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.protobuf.RuntimeVersion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {

    public boolean f9023a;

    public final Object f9024b;

    public final Object f9025c;

    public final Object f9026d;

    public final Object f9027e;

    public final Object f9028f;

    public final Object f9029g;

    public Object f9030h;

    public Object f9031i;

    public Object f9032j;

    public e(Context context, t tVar, androidx.media3.common.d dVar, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.f9024b = applicationContext;
        this.f9025c = tVar;
        this.f9032j = dVar;
        this.f9031i = audioDeviceInfo;
        Handler handler = new Handler(e7.i0.r(), null);
        this.f9026d = handler;
        this.f9027e = new c(this);
        this.f9028f = new androidx.mediarouter.app.g(this, 6);
        b bVar = b.f8983c;
        String str = Build.MANUFACTURER;
        Uri uriFor = (str.equals("Amazon") || str.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f9029g = uriFor != null ? new d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public e(HttpURLConnection httpURLConnection, sj.g gVar, sj.c cVar, LinkedHashSet linkedHashSet, sj.i iVar, ScheduledExecutorService scheduledExecutorService, sj.l lVar) {
        this.f9025c = httpURLConnection;
        this.f9026d = gVar;
        this.f9027e = cVar;
        this.f9024b = linkedHashSet;
        this.f9028f = iVar;
        this.f9029g = scheduledExecutorService;
        this.f9030h = new Random();
        this.f9023a = false;
        this.f9032j = lVar;
        this.f9031i = ve.b.f15619a;
    }

    public void a(int i10, long j9) {
        if (i10 == 0) {
            new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.");
            e();
        } else {
            ((ScheduledExecutorService) this.f9029g).schedule(new sj.b(this, i10, j9), ((Random) this.f9030h).nextInt(4), TimeUnit.SECONDS);
        }
    }

    public void b(InputStream inputStream) throws IOException {
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strJ = RuntimeVersion.SUFFIX;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strJ = w.c.j(strJ, line);
            if (line.contains("}")) {
                int iIndexOf = strJ.indexOf(123);
                int iLastIndexOf = strJ.lastIndexOf(125);
                strJ = (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? RuntimeVersion.SUFFIX : strJ.substring(iIndexOf, iLastIndexOf + 1);
                if (strJ.isEmpty()) {
                    continue;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strJ);
                        if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                            sj.i iVar = (sj.i) this.f9028f;
                            new FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.");
                            iVar.a();
                            break;
                        }
                        synchronized (this) {
                            zIsEmpty = ((LinkedHashSet) this.f9024b).isEmpty();
                        }
                        if (zIsEmpty) {
                            break;
                        }
                        if (jSONObject.has("latestTemplateVersionNumber")) {
                            long j9 = ((sj.g) this.f9026d).f14272g.f14303a.getLong("last_template_version", 0L);
                            long j10 = jSONObject.getLong("latestTemplateVersionNumber");
                            if (j10 > j9) {
                                a(3, j10);
                            }
                        }
                        if (jSONObject.has("retryIntervalSeconds")) {
                            f(jSONObject.getInt("retryIntervalSeconds"));
                        }
                        strJ = RuntimeVersion.SUFFIX;
                    } catch (JSONException e3) {
                        new FirebaseRemoteConfigClientException("Unable to parse config update message.", e3.getCause());
                        e();
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e3);
                    }
                }
            }
        }
        bufferedReader.close();
    }

    public void c() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f9025c;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    b(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e3) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e3);
                }
            } catch (IOException e10) {
                if (!this.f9023a) {
                    Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e10);
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e11) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e11);
                }
            }
            throw th2;
        }
    }

    public void d(b bVar) {
        if (!this.f9023a || bVar.equals((b) this.f9030h)) {
            return;
        }
        this.f9030h = bVar;
        u uVar = (u) ((t) this.f9025c).B;
        uVar.f();
        b bVar2 = uVar.f9153g;
        if (bVar2 == null || bVar.equals(bVar2)) {
            return;
        }
        uVar.f9153g = bVar;
        e7.p pVar = uVar.f9151e;
        if (pVar != null) {
            pVar.f(-1, new j7.e(10));
        }
    }

    public synchronized void e() {
        Iterator it = ((LinkedHashSet) this.f9024b).iterator();
        while (it.hasNext()) {
            ((sj.i) it.next()).a();
        }
    }

    public synchronized void f(int i10) {
        ((ve.b) this.f9031i).getClass();
        Date date = new Date(new Date(System.currentTimeMillis()).getTime() + (((long) i10) * 1000));
        sj.l lVar = (sj.l) this.f9032j;
        synchronized (lVar.f14306d) {
            lVar.f14303a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}

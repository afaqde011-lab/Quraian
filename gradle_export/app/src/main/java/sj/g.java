package sj;

import android.text.format.DateUtils;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import s7.c0;
import xf.n;

public final class g {

    public static final long f14264i = TimeUnit.HOURS.toSeconds(12);

    public static final int[] f14265j = {2, 4, 8, 16, 32, 64, Cast.MAX_NAMESPACE_LENGTH, 256};

    public final jj.d f14266a;

    public final ij.b f14267b;

    public final Executor f14268c;

    public final Random f14269d;

    public final c f14270e;

    public final ConfigFetchHttpClient f14271f;

    public final l f14272g;

    public final Map f14273h;

    public g(jj.d dVar, ij.b bVar, Executor executor, Random random, c cVar, ConfigFetchHttpClient configFetchHttpClient, l lVar, HashMap map) {
        this.f14266a = dVar;
        this.f14267b = bVar;
        this.f14268c = executor;
        this.f14269d = random;
        this.f14270e = cVar;
        this.f14271f = configFetchHttpClient;
        this.f14272g = lVar;
        this.f14273h = map;
    }

    public final f a(String str, String str2, Date date, HashMap map) throws FirebaseRemoteConfigException {
        String str3;
        try {
            HttpURLConnection httpURLConnectionB = this.f14271f.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f14271f;
            HashMap mapD = d();
            String string = this.f14272g.f14303a.getString("last_fetch_etag", null);
            fi.b bVar = (fi.b) this.f14267b.get();
            f fVarFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapD, string, map, bVar != null ? (Long) ((j1) ((fi.c) bVar).f5698a.B).a(null, null, true).get("_fot") : null, date, this.f14272g.b());
            e eVar = fVarFetch.f14262b;
            if (eVar != null) {
                l lVar = this.f14272g;
                long j9 = eVar.f14259f;
                synchronized (lVar.f14304b) {
                    lVar.f14303a.edit().putLong("last_template_version", j9).apply();
                }
            }
            String str4 = fVarFetch.f14263c;
            if (str4 != null) {
                l lVar2 = this.f14272g;
                synchronized (lVar2.f14304b) {
                    lVar2.f14303a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.f14272g.d(0, l.f14302f);
            return fVarFetch;
        } catch (FirebaseRemoteConfigServerException e3) {
            int i10 = e3.A;
            l lVar3 = this.f14272g;
            if (i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504) {
                int i11 = lVar3.a().f14299a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f14265j;
                long millis = timeUnit.toMillis(iArr[Math.min(i11, iArr.length) - 1]);
                lVar3.d(i11, new Date(date.getTime() + (millis / 2) + ((long) this.f14269d.nextInt((int) millis))));
            }
            k kVarA = lVar3.a();
            int i12 = e3.A;
            if (kVarA.f14299a > 1 || i12 == 429) {
                kVarA.f14300b.getTime();
                throw new FirebaseRemoteConfigFetchThrottledException("Fetch was throttled.");
            }
            if (i12 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i12 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i12 == 429) {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i12 != 500) {
                    switch (i12) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new FirebaseRemoteConfigServerException(e3.A, "Fetch failed: ".concat(str3), e3);
        }
    }

    public final Task b(Task task, long j9, HashMap map) {
        g gVar;
        Task taskI;
        Date date = new Date(System.currentTimeMillis());
        boolean zO = task.o();
        l lVar = this.f14272g;
        if (zO) {
            Date date2 = new Date(lVar.f14303a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(l.f14301e) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j9) + date2.getTime()))) {
                return Tasks.d(new f(2, null, null));
            }
        }
        Date date3 = lVar.a().f14300b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.f14268c;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()));
            date4.getTime();
            taskI = Tasks.c(new FirebaseRemoteConfigFetchThrottledException(str));
            gVar = this;
        } else {
            jj.c cVar = (jj.c) this.f14266a;
            n nVarC = cVar.c();
            n nVarD = cVar.d();
            gVar = this;
            taskI = Tasks.f(nVarC, nVarD).i(executor, new com.revenuecat.purchases.google.usecase.e(gVar, nVarC, nVarD, date, map));
        }
        return taskI.i(executor, new c0(gVar, date, 3));
    }

    public final Task c(int i10) {
        HashMap map = new HashMap(this.f14273h);
        map.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i10);
        return this.f14270e.b().i(this.f14268c, new c0(this, map, 2));
    }

    public final HashMap d() {
        HashMap map = new HashMap();
        fi.b bVar = (fi.b) this.f14267b.get();
        if (bVar != null) {
            for (Map.Entry entry : ((j1) ((fi.c) bVar).f5698a.B).a(null, null, false).entrySet()) {
                map.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }
}

package sj;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

public final class b implements Runnable {
    public final int A;
    public final long B;
    public final k7.e C;

    public b(k7.e eVar, int i10, long j9) {
        this.C = eVar;
        this.A = i10;
        this.B = j9;
    }

    @Override
    public final void run() {
        final k7.e eVar = this.C;
        int i10 = this.A;
        final long j9 = this.B;
        synchronized (eVar) {
            final int i11 = i10 - 1;
            final Task taskC = ((g) eVar.f9026d).c(3 - i11);
            final Task taskB = ((c) eVar.f9027e).b();
            Tasks.f(taskC, taskB).i((ScheduledExecutorService) eVar.f9029g, new xf.a() {
                @Override
                public final Object M(Task task) throws JSONException {
                    Boolean boolValueOf;
                    k7.e eVar2 = eVar;
                    Task task2 = taskC;
                    Task task3 = taskB;
                    long j10 = j9;
                    int i12 = i11;
                    if (!task2.o()) {
                        return Tasks.c(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task2.j()));
                    }
                    if (!task3.o()) {
                        return Tasks.c(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task3.j()));
                    }
                    f fVar = (f) task2.k();
                    e eVarA = (e) task3.k();
                    e eVar3 = fVar.f14262b;
                    if (eVar3 != null) {
                        boolValueOf = Boolean.valueOf(eVar3.f14259f >= j10);
                    } else {
                        boolValueOf = Boolean.valueOf(fVar.f14261a == 1);
                    }
                    if (!boolValueOf.booleanValue()) {
                        Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                        eVar2.a(i12, j10);
                        return Tasks.d(null);
                    }
                    if (fVar.f14262b == null) {
                        Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                        return Tasks.d(null);
                    }
                    if (eVarA == null) {
                        eVarA = e.c().a();
                    }
                    e eVar4 = fVar.f14262b;
                    JSONObject jSONObject = eVarA.f14258e;
                    JSONObject jSONObject2 = eVar4.f14254a;
                    JSONObject jSONObject3 = eVar4.f14255b;
                    JSONObject jSONObject4 = eVar4.f14258e;
                    JSONObject jSONObject5 = e.a(new JSONObject(jSONObject2.toString())).f14255b;
                    HashMap mapB = eVarA.b();
                    HashMap mapB2 = eVar4.b();
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject6 = eVarA.f14255b;
                    Iterator<String> itKeys = jSONObject6.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!jSONObject3.has(next)) {
                            hashSet.add(next);
                        } else if (!jSONObject6.get(next).equals(jSONObject3.get(next))) {
                            hashSet.add(next);
                        } else if ((jSONObject.has(next) && !jSONObject4.has(next)) || (!jSONObject.has(next) && jSONObject4.has(next))) {
                            hashSet.add(next);
                        } else if (jSONObject.has(next) && jSONObject4.has(next) && !jSONObject.getJSONObject(next).toString().equals(jSONObject4.getJSONObject(next).toString())) {
                            hashSet.add(next);
                        } else if (mapB.containsKey(next) != mapB2.containsKey(next)) {
                            hashSet.add(next);
                        } else if (mapB.containsKey(next) && mapB2.containsKey(next) && !((Map) mapB.get(next)).equals(mapB2.get(next))) {
                            hashSet.add(next);
                        } else {
                            jSONObject5.remove(next);
                        }
                    }
                    Iterator<String> itKeys2 = jSONObject5.keys();
                    while (itKeys2.hasNext()) {
                        hashSet.add(itKeys2.next());
                    }
                    if (hashSet.isEmpty()) {
                        Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                        return Tasks.d(null);
                    }
                    synchronized (eVar2) {
                        Iterator it = ((LinkedHashSet) eVar2.f9024b).iterator();
                        while (it.hasNext()) {
                            ((i) it.next()).getClass();
                        }
                    }
                    return Tasks.d(null);
                }
            });
        }
    }
}

package rj;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.AbtException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import q3.e0;
import sj.m;
import xf.f;

public final class a implements f, xf.a {
    public final b A;

    public a(b bVar) {
        this.A = bVar;
    }

    @Override
    public Object M(Task task) {
        boolean z10;
        b bVar = this.A;
        if (task.o()) {
            sj.c cVar = bVar.f13587c;
            synchronized (cVar) {
                cVar.f14246c = Tasks.d(null);
            }
            m mVar = cVar.f14245b;
            synchronized (mVar) {
                mVar.f14308a.deleteFile(mVar.f14309b);
            }
            sj.e eVar = (sj.e) task.k();
            if (eVar != null) {
                JSONArray jSONArray = eVar.f14257d;
                ci.b bVar2 = bVar.f13585a;
                if (bVar2 != null) {
                    try {
                        bVar2.c(b.d(jSONArray));
                    } catch (AbtException e3) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e3);
                    } catch (JSONException e10) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e10);
                    }
                }
                p10.a aVar = bVar.f13594j;
                try {
                    vj.d dVarL = ((e0) aVar.B).l(eVar);
                    Iterator it = ((Set) aVar.D).iterator();
                    while (it.hasNext()) {
                        ((Executor) aVar.C).execute(new tj.a((li.b) it.next(), dVarL, 1));
                    }
                } catch (FirebaseRemoteConfigException e11) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e11);
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public Task k(Object obj) {
        b bVar = this.A;
        Task taskB = bVar.f13587c.b();
        Task taskB2 = bVar.f13588d.b();
        return Tasks.f(taskB, taskB2).i(bVar.f13586b, new ce.a(bVar, taskB, taskB2, 10));
    }
}

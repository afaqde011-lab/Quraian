package sl;

import a8.u;
import ab.i0;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import d40.o;
import d40.p1;
import g00.k;
import h00.d0;
import java.util.HashMap;
import java.util.Map;
import ji.i;
import k7.t;
import oj.l;
import org.json.JSONException;
import org.json.JSONObject;
import rj.b;
import sj.d;
import sj.e;
import sj.g;

public final class a {
    public final b a;
    public final p1 b;
    public final p1 c;
    public final p1 d;

    public a(b bVar) {
        i iVar = i.A;
        this.a = bVar;
        this.b = o.c(Boolean.valueOf(bVar.a("is_technical_work_mode")));
        this.c = o.c(Boolean.valueOf(bVar.a("is_force_update_hard")));
        this.d = o.c(bVar.b());
        u uVar = new u();
        int[] iArr = g.j;
        uVar.a = 0L;
        u uVar2 = new u();
        uVar2.a = uVar.a;
        Tasks.b(bVar.b, new i0(bVar, uVar2, 4));
        Boolean bool = Boolean.FALSE;
        Map mapR = d0.R(new k("is_technical_work_mode", bool), new k("is_force_update_hard", bool), new k("force_update_min_app_version", ""));
        HashMap map = new HashMap();
        for (Map.Entry entry : mapR.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                map.put((String) entry.getKey(), new String((byte[]) value));
            } else {
                map.put((String) entry.getKey(), value.toString());
            }
        }
        try {
            d dVarC = e.c();
            dVarC.a = new JSONObject(map);
            bVar.e.d(dVarC.a()).p(iVar, new l(3));
        } catch (JSONException e) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e);
            Tasks.d((Object) null);
        }
        b bVar2 = this.a;
        g gVar = bVar2.f;
        long j = gVar.g.a.getLong("minimum_fetch_interval_in_seconds", g.i);
        HashMap map2 = new HashMap(gVar.h);
        map2.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        gVar.e.b().i(gVar.c, new de.g(gVar, j, map2)).p(iVar, new l(4)).p(bVar2.b, new rj.a(bVar2)).b(new t(this, 22)).e(new l(15));
    }
}

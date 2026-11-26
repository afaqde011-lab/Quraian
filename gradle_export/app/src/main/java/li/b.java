package li;

import android.util.Log;
import b50.o;
import h00.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import me.i;
import oi.p;
import qi.n;
import vj.d;
import vj.e;

public final class b {

    public final ui.b f10295a;

    public b(ui.b bVar) {
        this.f10295a = bVar;
    }

    public final void a(d dVar) {
        ui.b bVar = this.f10295a;
        HashSet hashSet = dVar.f15731a;
        ArrayList arrayList = new ArrayList(r.q0(hashSet, 10));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            vj.c cVar = (vj.c) ((e) it.next());
            String str = cVar.f15726b;
            String str2 = cVar.f15728d;
            String strSubstring = cVar.f15729e;
            String str3 = cVar.f15727c;
            long j9 = cVar.f15730f;
            i iVar = n.f13029a;
            if (strSubstring.length() > 256) {
                strSubstring = strSubstring.substring(0, 256);
            }
            arrayList.add(new qi.b(str, str2, strSubstring, str3, j9));
        }
        synchronized (((o) bVar.G)) {
            try {
                if (((o) bVar.G).c(arrayList)) {
                    ((pi.e) bVar.D).f12530b.a(new p(bVar, ((o) bVar.G).a(), 6));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Updated Crashlytics Rollout State", null);
        }
    }
}

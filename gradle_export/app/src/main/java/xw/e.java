package xw;

import a40.c0;
import a40.m0;
import a40.u1;
import android.content.SharedPreferences;
import bk.m;
import com.mchutov.quranify.reciters.domain.model.ReciterCollectionEvent;
import d40.d1;
import d40.o;
import d40.p1;
import g00.b0;
import h00.q;
import h00.z;
import java.util.Set;
import ri.t1;
import u00.n;

public final class e {
    public final SharedPreferences a;
    public final m b;
    public final ww.a c;
    public final f40.c d = c0.c(rd.a.P(c0.e(), m0.a));
    public final p1 e;
    public final p1 f;
    public final p1 g;
    public final d1 h;
    public final p1 i;
    public u1 j;
    public int k;

    public e(SharedPreferences sharedPreferences, m mVar, ww.a aVar) {
        Object objS;
        ReciterCollectionEvent reciterCollectionEvent;
        this.a = sharedPreferences;
        this.b = mVar;
        this.c = aVar;
        String string = sharedPreferences.getString("cached_reciter_collection_event_v1", null);
        if (string == null) {
            reciterCollectionEvent = null;
        } else {
            try {
                objS = (ReciterCollectionEvent) mVar.d(ReciterCollectionEvent.class, string);
            } catch (Throwable th) {
                objS = t1.s(th);
            }
            reciterCollectionEvent = (ReciterCollectionEvent) (objS instanceof g00.m ? null : objS);
        }
        p1 p1VarC = o.c(reciterCollectionEvent);
        this.e = p1VarC;
        this.f = o.c(Long.valueOf(System.currentTimeMillis()));
        this.g = o.c(a((ReciterCollectionEvent) p1VarC.getValue()));
        this.h = o.b(1, 5, null);
        String string2 = this.a.getString("lastSeenPublishedReciterEventKey", "");
        this.i = o.c(string2 != null ? string2 : "");
        c();
    }

    public final Set a(ReciterCollectionEvent reciterCollectionEvent) {
        if (reciterCollectionEvent != null) {
            long jLongValue = ((Number) this.f.getValue()).longValue();
            boolean z = false;
            if (reciterCollectionEvent.getReleaseAtEpochMillis() != null) {
                Long releaseAtEpochMillis = reciterCollectionEvent.getReleaseAtEpochMillis();
                if (releaseAtEpochMillis != null && jLongValue >= releaseAtEpochMillis.longValue()) {
                    z = true;
                }
                z = !z;
            }
            if (z) {
                return q.r1(reciterCollectionEvent.getReciterIds());
            }
        }
        return z.A;
    }

    public final void b(long j) {
        Long lValueOf = Long.valueOf(j);
        p1 p1Var = this.f;
        p1Var.getClass();
        p1Var.k(null, lValueOf);
        d();
        this.h.f(b0.a);
        u1 u1Var = this.j;
        if (u1Var != null) {
            u1Var.i(null);
        }
        this.j = null;
        this.c.a();
    }

    public final void c() {
        Long releaseAtEpochMillis;
        u1 u1Var = this.j;
        if (u1Var != null) {
            u1Var.i(null);
        }
        this.j = null;
        ReciterCollectionEvent reciterCollectionEvent = (ReciterCollectionEvent) this.e.getValue();
        if (reciterCollectionEvent == null || (releaseAtEpochMillis = reciterCollectionEvent.getReleaseAtEpochMillis()) == null) {
            return;
        }
        long jLongValue = releaseAtEpochMillis.longValue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis >= jLongValue) {
            b(jCurrentTimeMillis);
            return;
        }
        int i = this.k + 1;
        this.k = i;
        this.j = ta.c0.M(this.d, (k00.i) null, (n) null, (u00.k) null, new a1.p1(i, this, (k00.c) null), 31);
    }

    public final void d() {
        Set setA = a((ReciterCollectionEvent) this.e.getValue());
        p1 p1Var = this.g;
        p1Var.getClass();
        p1Var.k(null, setA);
    }
}

package zj;

import a40.a0;
import a40.c0;
import android.util.Log;
import androidx.datastore.core.DataStore;
import bt.y0;
import g00.b0;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import ri.t1;
import wj.b1;

public final class m {

    public final b1 f17522a;

    public final DataStore f17523b;

    public final AtomicReference f17524c;

    public m(k00.i iVar, b1 b1Var, DataStore dataStore) {
        kotlin.jvm.internal.m.e(iVar, "backgroundDispatcher");
        kotlin.jvm.internal.m.e(b1Var, "timeProvider");
        kotlin.jvm.internal.m.e(dataStore, "sessionConfigsDataStore");
        this.f17522a = b1Var;
        this.f17523b = dataStore;
        this.f17524c = new AtomicReference();
        c0.y(c0.c(iVar), (k00.i) null, (a0) null, new k(this, null, 0), 3);
    }

    public final g a() {
        AtomicReference atomicReference = this.f17524c;
        if (atomicReference.get() == null) {
            atomicReference.compareAndSet(null, c0.C(k00.j.A, new k(this, null, 1)));
        }
        Object obj = atomicReference.get();
        kotlin.jvm.internal.m.d(obj, "get(...)");
        return (g) obj;
    }

    public final boolean b() {
        Long l = a().f17519e;
        Integer num = a().f17518d;
        return l == null || num == null || this.f17522a.a().f16116c - l.longValue() >= ((long) num.intValue());
    }

    public final Object c(g gVar, m00.c cVar) {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i10 = lVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.C = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object obj = lVar.A;
        l00.a aVar = l00.a.A;
        int i11 = lVar.C;
        try {
            if (i11 == 0) {
                t1.O(obj);
                DataStore dataStore = this.f17523b;
                y0 y0Var = new y0(gVar, (k00.c) null, 15);
                lVar.C = 1;
                if (dataStore.updateData(y0Var, lVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
            }
        } catch (IOException e3) {
            Log.w("FirebaseSessions", "Failed to update config values: " + e3);
        }
        return b0.a;
    }
}

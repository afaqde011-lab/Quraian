package wj;

import android.util.Log;
import androidx.datastore.core.DataStore;
import bt.y1;
import ri.t1;

public final class t0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final x0 C;

    public t0(x0 x0Var, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = x0Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new t0(this.C, cVar, 0);
            default:
                return new t0(this.C, cVar, 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return create(zVar, cVar).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i10 = this.B;
                if (i10 == 0) {
                    t1.O(obj);
                    x0 x0Var = this.C;
                    y1 y1Var = new y1(x0Var.f16220e.getData(), new d40.g0(x0Var, (k00.c) null, 5), 3);
                    a1.c cVar = new a1.c(x0Var, 19);
                    this.B = 1;
                    if (y1Var.collect(cVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            default:
                l00.a aVar2 = l00.a.A;
                int i11 = this.B;
                k00.c cVar2 = null;
                x0 x0Var2 = this.C;
                try {
                    if (i11 == 0) {
                        t1.O(obj);
                        DataStore dataStore = x0Var2.f16220e;
                        v0 v0Var = new v0(x0Var2, cVar2, 0);
                        this.B = 1;
                        if (dataStore.updateData(v0Var, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    break;
                } catch (Exception e3) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e3.getMessage());
                    f0 f0Var = x0Var2.f16223h;
                    if (f0Var == null) {
                        kotlin.jvm.internal.m.k("localSessionData");
                        throw null;
                    }
                    x0Var2.f16223h = f0.a(f0Var, null, x0Var2.f16219d.a(), null, 5);
                }
                return g00.b0.a;
        }
    }
}

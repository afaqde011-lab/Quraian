package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicBoolean;
import ri.t1;

public final class l0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public Object C;
    public final u00.n D;

    public l0(u00.n nVar, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.D = nVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                l0 l0Var = new l0(this.D, cVar, 0);
                l0Var.C = obj;
                return l0Var;
            default:
                l0 l0Var2 = new l0(this.D, cVar, 1);
                l0Var2.C = obj;
                return l0Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            default:
                return create((t5.b) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i10 = this.B;
                if (i10 == 0) {
                    t1.O(obj);
                    a40.z zVar = (a40.z) this.C;
                    this.B = 1;
                    if (this.D.invoke(zVar, this) == aVar) {
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
                if (i11 == 0) {
                    t1.O(obj);
                    t5.b bVar = (t5.b) this.C;
                    this.B = 1;
                    obj = this.D.invoke(bVar, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                t5.b bVar2 = (t5.b) obj;
                kotlin.jvm.internal.m.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
                ((AtomicBoolean) bVar2.f14355b.B).set(true);
                return bVar2;
        }
    }
}

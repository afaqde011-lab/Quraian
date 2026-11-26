package androidx.datastore.core;

import d40.j;
import g00.b0;
import k00.c;
import kotlin.Metadata;
import m00.e;
import m00.i;
import ri.t1;
import u00.n;

@e(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ld40/j;", "Lg00/b0;", "<anonymous>", "(Ld40/j;)V"}, k = 3, mv = {1, 8, 0})
public final class SingleProcessCoordinator$updateNotifications$1 extends i implements n {
    int label;

    public SingleProcessCoordinator$updateNotifications$1(c<? super SingleProcessCoordinator$updateNotifications$1> cVar) {
        super(2, cVar);
    }

    public final c<b0> create(Object obj, c<?> cVar) {
        return new SingleProcessCoordinator$updateNotifications$1(cVar);
    }

    public final Object invoke(j jVar, c<? super b0> cVar) {
        return create(jVar, cVar).invokeSuspend(b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t1.O(obj);
        return b0.a;
    }
}

package androidx.datastore.core;

import a40.z;
import g00.b0;
import k00.c;
import kotlin.Metadata;
import m00.e;
import m00.i;
import ri.t1;
import u00.n;

@e(c = "androidx.datastore.core.MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1", f = "MultiProcessCoordinator.android.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¨\u0006\u0002"}, d2 = {"T", "La40/z;", "androidx/datastore/core/MultiProcessCoordinator$withLazyCounter$2", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1 extends i implements n {
    int label;
    final MultiProcessCoordinator this$0;

    public MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1(MultiProcessCoordinator multiProcessCoordinator, c cVar) {
        super(2, cVar);
        this.this$0 = multiProcessCoordinator;
    }

    public final c<b0> create(Object obj, c<?> cVar) {
        return new MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1(this.this$0, cVar);
    }

    public final Object invoke(z zVar, c<? super Integer> cVar) {
        return create(zVar, cVar).invokeSuspend(b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t1.O(obj);
        return new Integer(this.this$0.getSharedCounter().incrementAndGetValue());
    }
}

package l00;

import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.m;
import m00.g;
import ri.t1;
import u00.n;

public final class b extends g {
    public int A;
    public final n B;
    public final k00.c C;

    public b(k00.c cVar, k00.c cVar2, n nVar) {
        super(cVar);
        this.B = nVar;
        this.C = cVar2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.A = 2;
            t1.O(obj);
            return obj;
        }
        this.A = 1;
        t1.O(obj);
        n nVar = this.B;
        m.c(nVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        d0.d(2, nVar);
        return nVar.invoke(this.C, this);
    }
}

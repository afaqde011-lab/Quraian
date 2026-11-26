package l00;

import k00.i;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.m;
import ri.t1;
import u00.n;

public final class c extends m00.c {
    public int A;
    public final n B;
    public final k00.c C;

    public c(k00.c cVar, i iVar, n nVar, k00.c cVar2) {
        super(cVar, iVar);
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

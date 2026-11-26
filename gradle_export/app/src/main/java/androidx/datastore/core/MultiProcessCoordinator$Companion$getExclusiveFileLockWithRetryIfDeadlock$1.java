package androidx.datastore.core;

import kotlin.Metadata;
import m00.c;
import m00.e;

@e(c = "androidx.datastore.core.MultiProcessCoordinator$Companion", f = "MultiProcessCoordinator.android.kt", l = {182}, m = "getExclusiveFileLockWithRetryIfDeadlock")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 extends c {
    long J$0;
    Object L$0;
    int label;
    Object result;
    final MultiProcessCoordinator.Companion this$0;

    public MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1(MultiProcessCoordinator.Companion companion, k00.c<? super MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1> cVar) {
        super(cVar);
        this.this$0 = companion;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getExclusiveFileLockWithRetryIfDeadlock(null, this);
    }
}

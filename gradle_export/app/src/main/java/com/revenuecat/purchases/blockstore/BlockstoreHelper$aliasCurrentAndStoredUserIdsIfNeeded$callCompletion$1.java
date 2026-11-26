package com.revenuecat.purchases.blockstore;

import a40.z;
import g00.b0;
import k00.c;
import kotlin.Metadata;
import m00.e;
import m00.i;
import ri.t1;
import u00.n;

@e(c = "com.revenuecat.purchases.blockstore.BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$callCompletion$1", f = "BlockstoreHelper.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La40/z;", "Lg00/b0;", "<anonymous>", "(La40/z;)V"}, k = 3, mv = {1, 8, 0})
public final class BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$callCompletion$1 extends i implements n {
    final u00.a $callback;
    int label;

    public BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$callCompletion$1(u00.a aVar, c<? super BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$callCompletion$1> cVar) {
        super(2, cVar);
        this.$callback = aVar;
    }

    @Override
    public final c<b0> create(Object obj, c<?> cVar) {
        return new BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$callCompletion$1(this.$callback, cVar);
    }

    @Override
    public final Object invoke(z zVar, c<? super b0> cVar) {
        return ((BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$callCompletion$1) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t1.O(obj);
        this.$callback.invoke();
        return b0.a;
    }
}

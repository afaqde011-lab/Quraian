package androidx.datastore.core;

import kotlin.Metadata;
import m00.c;
import m00.e;

@e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {348}, m = "writeData$datastore_core_release")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class DataStoreImpl$writeData$1 extends c {
    Object L$0;
    int label;
    Object result;
    final DataStoreImpl<T> this$0;

    public DataStoreImpl$writeData$1(DataStoreImpl<T> dataStoreImpl, k00.c<? super DataStoreImpl$writeData$1> cVar) {
        super(cVar);
        this.this$0 = dataStoreImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.writeData$datastore_core_release(null, false, (k00.c<? super Integer>) this);
    }
}

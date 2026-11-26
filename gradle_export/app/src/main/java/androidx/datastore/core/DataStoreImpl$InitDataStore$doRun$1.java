package androidx.datastore.core;

import kotlin.Metadata;
import m00.c;
import m00.e;

@e(c = "androidx.datastore.core.DataStoreImpl$InitDataStore", f = "DataStoreImpl.kt", l = {430, 434}, m = "doRun")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class DataStoreImpl$InitDataStore$doRun$1 extends c {
    Object L$0;
    int label;
    Object result;
    final DataStoreImpl<T>.InitDataStore this$0;

    public DataStoreImpl$InitDataStore$doRun$1(DataStoreImpl<T>.InitDataStore initDataStore, k00.c<? super DataStoreImpl$InitDataStore$doRun$1> cVar) {
        super(cVar);
        this.this$0 = initDataStore;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doRun(this);
    }
}

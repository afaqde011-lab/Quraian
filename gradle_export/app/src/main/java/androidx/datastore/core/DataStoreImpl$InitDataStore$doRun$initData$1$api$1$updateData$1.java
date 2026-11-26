package androidx.datastore.core;

import kotlin.Metadata;
import m00.c;
import m00.e;

@e(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", f = "DataStoreImpl.kt", l = {544, 447, 449}, m = "updateData")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    Object result;
    final DataStoreImpl$InitDataStore$doRun$initData$1$api$1 this$0;

    public DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1, k00.c cVar) {
        super(cVar);
        this.this$0 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateData(null, this);
    }
}

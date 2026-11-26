package androidx.datastore.core;

import g00.b0;
import k00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.x;
import m00.e;
import m00.i;
import u00.n;

@e(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", l = {352, 353}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/datastore/core/WriteScope;", "Lg00/b0;", "<anonymous>", "(Landroidx/datastore/core/WriteScope;)V"}, k = 3, mv = {1, 8, 0})
public final class DataStoreImpl$writeData$2 extends i implements n {
    final T $newData;
    final x $newVersion;
    final boolean $updateCache;
    private Object L$0;
    Object L$1;
    int label;
    final DataStoreImpl<T> this$0;

    public DataStoreImpl$writeData$2(x xVar, DataStoreImpl<T> dataStoreImpl, T t4, boolean z10, c<? super DataStoreImpl$writeData$2> cVar) {
        super(2, cVar);
        this.$newVersion = xVar;
        this.this$0 = dataStoreImpl;
        this.$newData = t4;
        this.$updateCache = z10;
    }

    public final c<b0> create(Object obj, c<?> cVar) {
        DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(this.$newVersion, this.this$0, this.$newData, this.$updateCache, cVar);
        dataStoreImpl$writeData$2.L$0 = obj;
        return dataStoreImpl$writeData$2;
    }

    public final Object invoke(WriteScope<T> writeScope, c<? super b0> cVar) {
        return create(writeScope, cVar).invokeSuspend(b0.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$writeData$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

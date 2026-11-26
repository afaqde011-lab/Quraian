package androidx.datastore.core;

import a40.z;
import g00.b0;
import k00.c;
import kotlin.Metadata;
import m00.e;
import m00.i;
import u00.n;

@e(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", l = {134, 135}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "La40/z;", "Lg00/b0;", "<anonymous>", "(La40/z;)V"}, k = 3, mv = {1, 8, 0})
public final class DataStoreImpl$incrementCollector$2$1 extends i implements n {
    int label;
    final DataStoreImpl<T> this$0;

    public DataStoreImpl$incrementCollector$2$1(DataStoreImpl<T> dataStoreImpl, c<? super DataStoreImpl$incrementCollector$2$1> cVar) {
        super(2, cVar);
        this.this$0 = dataStoreImpl;
    }

    public final c<b0> create(Object obj, c<?> cVar) {
        return new DataStoreImpl$incrementCollector$2$1(this.this$0, cVar);
    }

    public final Object invoke(z zVar, c<? super b0> cVar) {
        return create(zVar, cVar).invokeSuspend(b0.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$incrementCollector$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

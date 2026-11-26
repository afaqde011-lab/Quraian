package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.jvm.internal.n;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/datastore/core/StorageConnection;", "T", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class DataStoreImpl$storageConnectionDelegate$1 extends n implements u00.a {
    final DataStoreImpl<T> this$0;

    public DataStoreImpl$storageConnectionDelegate$1(DataStoreImpl<T> dataStoreImpl) {
        super(0);
        this.this$0 = dataStoreImpl;
    }

    public final StorageConnection<T> m1invoke() {
        return ((DataStoreImpl) this.this$0).storage.createConnection();
    }
}

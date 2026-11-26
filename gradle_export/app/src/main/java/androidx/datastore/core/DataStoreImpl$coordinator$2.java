package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.jvm.internal.n;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/datastore/core/InterProcessCoordinator;", "T", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class DataStoreImpl$coordinator$2 extends n implements u00.a {
    final DataStoreImpl<T> this$0;

    public DataStoreImpl$coordinator$2(DataStoreImpl<T> dataStoreImpl) {
        super(0);
        this.this$0 = dataStoreImpl;
    }

    public final InterProcessCoordinator m0invoke() {
        return this.this$0.getStorageConnection$datastore_core_release().getCoordinator();
    }
}

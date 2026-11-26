package androidx.datastore.core;

import com.google.protobuf.RuntimeVersion;
import g00.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", RuntimeVersion.SUFFIX, "it", "Lg00/b0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class DataStoreImpl$writeActor$1 extends n implements k {
    final DataStoreImpl<T> this$0;

    public DataStoreImpl$writeActor$1(DataStoreImpl<T> dataStoreImpl) {
        super(1);
        this.this$0 = dataStoreImpl;
    }

    public Object invoke(Object obj) {
        invoke((Throwable) obj);
        return b0.a;
    }

    public final void invoke(Throwable th2) {
        if (th2 != null) {
            ((DataStoreImpl) this.this$0).inMemoryCache.tryUpdate(new Final(th2));
        }
        if (((DataStoreImpl) this.this$0).storageConnectionDelegate.isInitialized()) {
            this.this$0.getStorageConnection$datastore_core_release().close();
        }
    }
}

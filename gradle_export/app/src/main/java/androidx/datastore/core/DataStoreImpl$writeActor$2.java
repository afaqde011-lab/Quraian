package androidx.datastore.core;

import a40.q;
import com.google.protobuf.RuntimeVersion;
import g00.b0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Landroidx/datastore/core/Message$Update;", "msg", RuntimeVersion.SUFFIX, "ex", "Lg00/b0;", "invoke", "(Landroidx/datastore/core/Message$Update;Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class DataStoreImpl$writeActor$2 extends n implements u00.n {
    public static final DataStoreImpl$writeActor$2 INSTANCE = new DataStoreImpl$writeActor$2();

    public DataStoreImpl$writeActor$2() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        invoke((Message.Update) obj, (Throwable) obj2);
        return b0.a;
    }

    public final void invoke(Message.Update<T> update, Throwable th2) {
        m.e(update, "msg");
        q ack = update.getAck();
        if (th2 == null) {
            th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        ack.h0(th2);
    }
}

package androidx.datastore.core.okio;

import com.google.protobuf.RuntimeVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import u00.a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"Landroidx/datastore/core/okio/Synchronizer;", RuntimeVersion.SUFFIX, "<init>", "()V", "T", "Lkotlin/Function0;", "block", "withLock", "(Lu00/a;)Ljava/lang/Object;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Synchronizer {
    public final <T> T withLock(a block) {
        T t4;
        m.e(block, "block");
        synchronized (this) {
            t4 = (T) block.invoke();
        }
        return t4;
    }
}

package a40;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class s {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(s.class, "_handled$volatile");
    private volatile int _handled$volatile;
    public final Throwable a;

    public s(Throwable th, boolean z) {
        this.a = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.a + ']';
    }
}

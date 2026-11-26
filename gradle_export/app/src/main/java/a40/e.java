package a40;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class e {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");
    public final f0[] a;
    private volatile int notCompletedCount$volatile;

    public e(f0[] f0VarArr) {
        this.a = f0VarArr;
        this.notCompletedCount$volatile = f0VarArr.length;
    }
}

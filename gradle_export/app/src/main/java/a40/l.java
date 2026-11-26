package a40;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class l extends s {
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(l.class, "_resumed$volatile");
    private volatile int _resumed$volatile;
}

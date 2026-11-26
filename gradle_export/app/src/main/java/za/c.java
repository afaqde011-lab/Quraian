package za;

import com.google.android.gms.internal.measurement.x5;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class c implements ThreadFactory {

    public final AtomicInteger f17351a = new AtomicInteger(0);

    public final boolean f17352b;

    public c(boolean z10) {
        this.f17352b = z10;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        kotlin.jvm.internal.m.e(runnable, "runnable");
        StringBuilder sbQ = x5.q(this.f17352b ? "WM.task-" : "androidx.work-");
        sbQ.append(this.f17351a.incrementAndGet());
        return new Thread(runnable, sbQ.toString());
    }
}

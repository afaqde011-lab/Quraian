package ji;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class b implements ThreadFactory {

    public static final ThreadFactory f8285e = Executors.defaultThreadFactory();

    public final AtomicLong f8286a = new AtomicLong();

    public final String f8287b;

    public final int f8288c;

    public final StrictMode.ThreadPolicy f8289d;

    public b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f8287b = str;
        this.f8288c = i10;
        this.f8289d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f8285e.newThread(new a(this, runnable, 0));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f8287b + " Thread #" + this.f8286a.getAndIncrement());
        return threadNewThread;
    }
}

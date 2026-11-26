package kh;

import com.google.android.gms.internal.cast.z3;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public final class t implements v {
    public static final t B = new t(null);
    public static final z3 C = new z3(3, t.class);
    public final Object A;

    public t(Object obj) {
        this.A = obj;
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e3) {
            C.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e3);
        }
    }

    @Override
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override
    public final Object get() {
        return this.A;
    }

    @Override
    public final Object get(long j9, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.A;
    }

    @Override
    public final boolean isCancelled() {
        return false;
    }

    @Override
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.A + "]]";
    }
}

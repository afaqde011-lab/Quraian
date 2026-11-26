package pi;

import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.m;

public final class e {

    public static final d f12528d = new d();

    public final b f12529a;

    public final b f12530b;

    public final b f12531c;

    public e(ExecutorService executorService, ExecutorService executorService2) {
        m.e(executorService, "backgroundExecutorService");
        m.e(executorService2, "blockingExecutorService");
        this.f12529a = new b(executorService);
        this.f12530b = new b(executorService);
        Tasks.d(null);
        this.f12531c = new b(executorService2);
    }

    public static final void a() {
        if (((Boolean) new c(0, f12528d, d.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 0).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static final void b() {
        if (((Boolean) new c(0, f12528d, d.class, "isBlockingThread", "isBlockingThread()Z", 0, 1).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }
}

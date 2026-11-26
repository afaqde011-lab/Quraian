package sj;

import ab.i0;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s7.c0;
import xf.n;

public final class c {

    public static final HashMap f14242d = new HashMap();

    public static final f5.d f14243e = new f5.d(0);

    public final Executor f14244a;

    public final m f14245b;

    public n f14246c = null;

    public c(Executor executor, m mVar) {
        this.f14244a = executor;
        this.f14245b = mVar;
    }

    public static Object a(Task task) throws ExecutionException, TimeoutException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        o10.b bVar = new o10.b(16);
        Executor executor = f14243e;
        task.f(executor, bVar);
        task.d(executor, bVar);
        task.a(executor, bVar);
        if (!((CountDownLatch) bVar.B).await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.o()) {
            return task.k();
        }
        throw new ExecutionException(task.j());
    }

    public final synchronized Task b() {
        try {
            n nVar = this.f14246c;
            if (nVar == null || (nVar.n() && !this.f14246c.o())) {
                this.f14246c = Tasks.b(this.f14244a, new cc.b(this.f14245b, 3));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f14246c;
    }

    public final e c() {
        synchronized (this) {
            try {
                n nVar = this.f14246c;
                if (nVar != null && nVar.o()) {
                    return (e) this.f14246c.k();
                }
                try {
                    Task taskB = b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    return (e) a(taskB);
                } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e3);
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Task d(e eVar) {
        i0 i0Var = new i0(this, eVar, 5);
        Executor executor = this.f14244a;
        return Tasks.b(executor, i0Var).p(executor, new c0(this, eVar, 1));
    }
}

package cc;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

public final class m extends FutureTask {
    public final int A;
    public final Object B;

    public m(Object obj, Callable callable, int i10) {
        super(callable);
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final void done() {
        switch (this.A) {
            case 0:
                n nVar = (n) this.B;
                if (isCancelled()) {
                    return;
                }
                try {
                    nVar.c((l) get());
                    return;
                } catch (InterruptedException | ExecutionException e3) {
                    nVar.c(new l(e3));
                    return;
                }
            default:
                y6.a aVar = (y6.a) this.B;
                AtomicBoolean atomicBoolean = aVar.E;
                try {
                    Object obj = get();
                    if (atomicBoolean.get()) {
                        return;
                    }
                    aVar.a(obj);
                    return;
                } catch (InterruptedException e10) {
                    Log.w("AsyncTask", e10);
                    return;
                } catch (CancellationException unused) {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    aVar.a(null);
                    return;
                } catch (ExecutionException e11) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
                } catch (Throwable th2) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", th2);
                }
        }
    }
}

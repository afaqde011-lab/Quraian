package cc;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.i0;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class n {

    public static final ExecutorService f3137e = Executors.newCachedThreadPool();

    public final LinkedHashSet f3138a = new LinkedHashSet(1);

    public final LinkedHashSet f3139b = new LinkedHashSet(1);

    public final Handler f3140c = new Handler(Looper.getMainLooper());

    public volatile l f3141d = null;

    public n(Callable callable) {
        f3137e.execute(new m(this, callable, 0));
    }

    public final synchronized void a(k kVar) {
        Throwable th2;
        try {
            l lVar = this.f3141d;
            if (lVar != null && (th2 = lVar.f3136b) != null) {
                kVar.onResult(th2);
            }
            this.f3139b.add(kVar);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void b(k kVar) {
        Object obj;
        try {
            l lVar = this.f3141d;
            if (lVar != null && (obj = lVar.f3135a) != null) {
                kVar.onResult(obj);
            }
            this.f3138a.add(kVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c(l lVar) {
        if (this.f3141d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f3141d = lVar;
        this.f3140c.post(new i0(this, 5));
    }
}

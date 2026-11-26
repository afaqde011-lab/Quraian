package androidx.lifecycle;

import android.os.Handler;
import android.os.Looper;

public class f0 extends e0 {
    @Override
    public void h(Object obj) {
        e0.a("setValue");
        this.f994g++;
        this.f992e = obj;
        c(null);
    }

    public final void i(Object obj) {
        boolean z10;
        synchronized (this.f988a) {
            z10 = this.f993f == e0.f987k;
            this.f993f = obj;
        }
        if (z10) {
            q.a aVarG0 = q.a.g0();
            Runnable runnable = this.f997j;
            q.c cVar = aVarG0.f12555a;
            if (cVar.f12560c == null) {
                synchronized (cVar.f12558a) {
                    try {
                        if (cVar.f12560c == null) {
                            cVar.f12560c = Handler.createAsync(Looper.getMainLooper());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            cVar.f12560c.post(runnable);
        }
    }
}

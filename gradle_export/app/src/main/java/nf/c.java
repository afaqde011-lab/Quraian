package nf;

import android.os.Handler;
import android.os.Looper;

public final class c implements yj.b {
    public static c B;
    public final Object A;

    public c() {
        this.A = new Object();
        new Handler(Looper.getMainLooper(), new oe.l(this, 1));
    }

    public c(Object obj) {
        this.A = obj;
    }

    public static c a(Object obj) {
        if (obj != null) {
            return new c(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public Object b() {
        if (b.B == null) {
            b.B = new a();
        }
        synchronized (b.A) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    public Object get() {
        return this.A;
    }
}

package y6;

import android.os.Looper;
import cc.m;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.cast.a3;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import me.d;

public final class a implements Runnable {
    public static final ThreadPoolExecutor H;
    public static a3 I;
    public final ef.b A;
    public final m B;
    public volatile int C = 1;
    public final AtomicBoolean D = new AtomicBoolean();
    public final AtomicBoolean E = new AtomicBoolean();
    public final CountDownLatch F;
    public final d G;

    static {
        q.b bVar = new q.b(1);
        H = new ThreadPoolExecutor(5, Cast.MAX_NAMESPACE_LENGTH, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), bVar);
    }

    public a(d dVar) {
        this.G = dVar;
        ef.b bVar = new ef.b(this, 4);
        this.A = bVar;
        this.B = new m(this, bVar, 1);
        this.F = new CountDownLatch(1);
    }

    public final void a(Object obj) {
        a3 a3Var;
        synchronized (a.class) {
            try {
                if (I == null) {
                    I = new a3(Looper.getMainLooper(), 7, false);
                }
                a3Var = I;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        a3Var.obtainMessage(1, new b(this, obj)).sendToTarget();
    }

    @Override
    public final void run() {
        this.G.b();
    }
}

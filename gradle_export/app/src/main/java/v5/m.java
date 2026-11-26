package v5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import e7.f0;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k0.v;
import tf.x;

public final class m implements f {
    public final Context A;
    public final v4.c B;
    public final x C;
    public final Object D = new Object();
    public Handler E;
    public ThreadPoolExecutor F;
    public ThreadPoolExecutor G;
    public w00.a H;

    public m(Context context, v4.c cVar) {
        rd.a.i(context, "Context cannot be null");
        this.A = context.getApplicationContext();
        this.B = cVar;
        this.C = n.f15474d;
    }

    @Override
    public final void a(w00.a aVar) {
        synchronized (this.D) {
            this.H = aVar;
        }
        synchronized (this.D) {
            try {
                if (this.H == null) {
                    return;
                }
                if (this.F == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new f0("emojiCompat", 1));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.G = threadPoolExecutor;
                    this.F = threadPoolExecutor;
                }
                this.F.execute(new m9.f(this, 16));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.D) {
            try {
                this.H = null;
                Handler handler = this.E;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.E = null;
                ThreadPoolExecutor threadPoolExecutor = this.G;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.F = null;
                this.G = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final v4.g c() {
        try {
            x xVar = this.C;
            Context context = this.A;
            v4.c cVar = this.B;
            xVar.getClass();
            v vVarA = v4.b.a(context, List.of(cVar));
            int i10 = vVarA.f8540a;
            if (i10 != 0) {
                throw new RuntimeException(g4.c.i("fetchFonts failed (", i10, ")"));
            }
            v4.g[] gVarArr = (v4.g[]) vVarA.f8541b.get(0);
            if (gVarArr == null || gVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return gVarArr[0];
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException("provider not found", e3);
        }
    }
}

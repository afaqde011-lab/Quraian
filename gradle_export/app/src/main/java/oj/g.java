package oj;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class g extends Service {
    public final ExecutorService A;
    public a0 B;
    public final Object C;
    public int D;
    public int E;

    public g() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new qd.c0("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.A = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.C = new Object();
        this.E = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            z.b(intent);
        }
        synchronized (this.C) {
            try {
                int i10 = this.E - 1;
                this.E = i10;
                if (i10 == 0) {
                    stopSelfResult(this.D);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.B == null) {
                this.B = new a0(new o10.b(this, 5));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.B;
    }

    @Override
    public final void onDestroy() {
        this.A.shutdown();
        super.onDestroy();
    }

    @Override
    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.C) {
            this.D = i11;
            this.E++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) q.F().E).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        xf.g gVar = new xf.g();
        this.A.execute(new ab.e(this, intent2, gVar, 23));
        xf.n nVar = gVar.f16565a;
        if (nVar.n()) {
            a(intent);
            return 2;
        }
        nVar.c(new f5.d(0), new ak.a(this, intent, 25));
        return 3;
    }
}

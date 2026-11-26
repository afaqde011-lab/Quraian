package me;

import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.q;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import qd.s0;

public final class d {

    public x6.b f10881a;

    public boolean f10882b;

    public boolean f10883c;

    public boolean f10884d;

    public boolean f10885e;

    public final Executor f10886f;

    public volatile y6.a f10887g;

    public volatile y6.a f10888h;

    public final Semaphore f10889i;

    public final Set f10890j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        ThreadPoolExecutor threadPoolExecutor = y6.a.H;
        this.f10882b = false;
        this.f10883c = false;
        this.f10884d = true;
        this.f10885e = false;
        signInHubActivity.getApplicationContext();
        this.f10886f = threadPoolExecutor;
        this.f10889i = new Semaphore(0);
        this.f10890j = set;
    }

    public final void a() {
        if (this.f10887g != null) {
            if (!this.f10882b) {
                this.f10885e = true;
            }
            if (this.f10888h != null) {
                this.f10887g.getClass();
                this.f10887g = null;
                return;
            }
            this.f10887g.getClass();
            y6.a aVar = this.f10887g;
            aVar.D.set(true);
            if (aVar.B.cancel(false)) {
                this.f10888h = this.f10887g;
            }
            this.f10887g = null;
        }
    }

    public final void b() {
        if (this.f10888h != null || this.f10887g == null) {
            return;
        }
        this.f10887g.getClass();
        y6.a aVar = this.f10887g;
        Executor executor = this.f10886f;
        if (aVar.C == 1) {
            aVar.C = 2;
            aVar.A.getClass();
            executor.execute(aVar.B);
        } else {
            int iB = e4.f.b(aVar.C);
            if (iB == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (iB == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("We should never reach this state");
        }
    }

    public final void c() {
        Iterator it = this.f10890j.iterator();
        if (it.hasNext()) {
            ((q) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        try {
            this.f10889i.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e3) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e3);
            Thread.currentThread().interrupt();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        s0.X(this, sb2);
        sb2.append(" id=");
        sb2.append(0);
        sb2.append("}");
        return sb2.toString();
    }
}

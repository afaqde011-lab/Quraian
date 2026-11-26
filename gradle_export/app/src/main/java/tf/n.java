package tf;

import android.os.Handler;

public abstract class n {

    public static volatile com.google.android.gms.internal.cast.a3 f14669d;

    public final p1 f14670a;

    public final com.google.android.gms.internal.play_billing.r0 f14671b;

    public volatile long f14672c;

    public n(p1 p1Var) {
        com.google.android.gms.common.internal.d0.h(p1Var);
        this.f14670a = p1Var;
        this.f14671b = new com.google.android.gms.internal.play_billing.r0(13, this, p1Var, false);
    }

    public abstract void a();

    public final void b(long j9) {
        c();
        if (j9 >= 0) {
            p1 p1Var = this.f14670a;
            ((ve.b) p1Var.k0()).getClass();
            this.f14672c = System.currentTimeMillis();
            if (d().postDelayed(this.f14671b, j9)) {
                return;
            }
            p1Var.t().G.c(Long.valueOf(j9), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.f14672c = 0L;
        d().removeCallbacks(this.f14671b);
    }

    public final Handler d() {
        com.google.android.gms.internal.cast.a3 a3Var;
        if (f14669d != null) {
            return f14669d;
        }
        synchronized (n.class) {
            try {
                if (f14669d == null) {
                    f14669d = new com.google.android.gms.internal.cast.a3(this.f14670a.e0().getMainLooper(), 1);
                }
                a3Var = f14669d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a3Var;
    }
}

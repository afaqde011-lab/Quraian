package c3;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

public final class u0 extends a40.v {
    public static final g00.p M = rd.a.J(n0.G);
    public static final s0 N = new s0(0);
    public final Choreographer C;
    public final Handler D;
    public boolean I;
    public boolean J;
    public final w0 L;
    public final Object E = new Object();
    public final h00.m F = new h00.m();
    public ArrayList G = new ArrayList();
    public ArrayList H = new ArrayList();
    public final t0 K = new t0(this);

    public u0(Choreographer choreographer, Handler handler) {
        this.C = choreographer;
        this.D = handler;
        this.L = new w0(choreographer, this);
    }

    public static final void r0(u0 u0Var) {
        Runnable runnable;
        boolean z10;
        do {
            synchronized (u0Var.E) {
                h00.m mVar = u0Var.F;
                runnable = (Runnable) (mVar.isEmpty() ? null : mVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (u0Var.E) {
                    h00.m mVar2 = u0Var.F;
                    runnable = (Runnable) (mVar2.isEmpty() ? null : mVar2.removeFirst());
                }
            }
            synchronized (u0Var.E) {
                if (u0Var.F.isEmpty()) {
                    z10 = false;
                    u0Var.I = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    public final void n0(k00.i iVar, Runnable runnable) {
        synchronized (this.E) {
            this.F.addLast(runnable);
            if (!this.I) {
                this.I = true;
                this.D.post(this.K);
                if (!this.J) {
                    this.J = true;
                    this.C.postFrameCallback(this.K);
                }
            }
        }
    }
}

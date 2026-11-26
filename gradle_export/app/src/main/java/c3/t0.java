package c3;

import android.view.Choreographer;
import java.util.ArrayList;

public final class t0 implements Choreographer.FrameCallback, Runnable {
    public final u0 A;

    public t0(u0 u0Var) {
        this.A = u0Var;
    }

    @Override
    public final void doFrame(long j9) {
        this.A.D.removeCallbacks(this);
        u0.r0(this.A);
        u0 u0Var = this.A;
        synchronized (u0Var.E) {
            if (u0Var.J) {
                u0Var.J = false;
                ArrayList arrayList = u0Var.G;
                u0Var.G = u0Var.H;
                u0Var.H = arrayList;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Choreographer.FrameCallback) arrayList.get(i10)).doFrame(j9);
                }
                arrayList.clear();
            }
        }
    }

    @Override
    public final void run() {
        u0.r0(this.A);
        u0 u0Var = this.A;
        synchronized (u0Var.E) {
            if (u0Var.G.isEmpty()) {
                u0Var.C.removeFrameCallback(this);
                u0Var.J = false;
            }
        }
    }
}

package l0;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

public final class a implements k1, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long H;
    public final View A;
    public boolean C;
    public boolean F;
    public long G;
    public final PriorityQueue B = new PriorityQueue(11, new b3.c0(3));
    public final Choreographer D = Choreographer.getInstance();
    public final k.l0 E = new k.l0();

    public a(View view) {
        float refreshRate;
        this.A = view;
        if (H == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            H = (long) (1000000000 / refreshRate);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.F = true;
        }
    }

    @Override
    public void a(j1 j1Var) {
        this.B.add(new n1(1, j1Var));
        if (this.C) {
            return;
        }
        this.C = true;
        this.A.post(this);
    }

    public final boolean b() {
        k.l0 l0Var = this.E;
        long jA = l0Var.a();
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", jA);
        boolean z10 = true;
        if (jA > 0) {
            PriorityQueue priorityQueue = this.B;
            Object objPeek = priorityQueue.peek();
            kotlin.jvm.internal.m.b(objPeek);
            if (!((n1) objPeek).f9779b.c(l0Var)) {
                priorityQueue.poll();
                z10 = false;
            }
            l0Var.f8422a = false;
        }
        return z10;
    }

    @Override
    public final void doFrame(long j9) {
        if (this.F) {
            this.G = j9;
            this.A.post(this);
        }
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.F = true;
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.F = false;
        this.A.removeCallbacks(this);
        this.D.removeFrameCallback(this);
    }

    @Override
    public final void run() {
        PriorityQueue priorityQueue = this.B;
        if (!priorityQueue.isEmpty() && this.C && this.F) {
            View view = this.A;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z10 = System.nanoTime() > (((long) 2) * H) + nanos;
                k.l0 l0Var = this.E;
                l0Var.f8422a = z10;
                l0Var.f8423b = Math.max(this.G, nanos) + H;
                boolean zB = false;
                while (!priorityQueue.isEmpty() && !zB) {
                    if (l0Var.f8422a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zB = b();
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    } else {
                        zB = b();
                    }
                }
                if (zB) {
                    this.D.postFrameCallback(this);
                } else {
                    this.C = false;
                }
                Trace.setCounter("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.C = false;
    }
}

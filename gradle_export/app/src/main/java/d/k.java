package d;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.i0;

public final class k implements j, ViewTreeObserver.OnDrawListener, Runnable {
    public final long A = SystemClock.uptimeMillis() + ((long) 10000);
    public Runnable B;
    public boolean C;
    public final n D;

    public k(n nVar) {
        this.D = nVar;
    }

    public final void a(View view) {
        if (this.C) {
            return;
        }
        this.C = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override
    public final void execute(Runnable runnable) {
        kotlin.jvm.internal.m.e(runnable, "runnable");
        this.B = runnable;
        View decorView = this.D.getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "getDecorView(...)");
        if (!this.C) {
            decorView.postOnAnimation(new i0(this, 10));
        } else if (kotlin.jvm.internal.m.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override
    public final void onDraw() {
        boolean z10;
        Runnable runnable = this.B;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.A) {
                this.C = false;
                this.D.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.B = null;
        x fullyDrawnReporter = this.D.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f4394a) {
            z10 = fullyDrawnReporter.f4395b;
        }
        if (z10) {
            this.C = false;
            this.D.getWindow().getDecorView().post(this);
        }
    }

    @Override
    public final void run() {
        this.D.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

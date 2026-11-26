package p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

public final class l1 implements Runnable {
    public final int A;
    public final m1 B;

    public l1(m1 m1Var, int i10) {
        this.A = i10;
        this.B = m1Var;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                ViewParent parent = this.B.D.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                m1 m1Var = this.B;
                m1Var.a();
                View view = m1Var.D;
                if (view.isEnabled() && !view.isLongClickable() && m1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    m1Var.G = true;
                    break;
                }
                break;
        }
    }
}

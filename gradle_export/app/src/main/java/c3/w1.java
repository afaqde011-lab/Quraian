package c3;

import android.view.GestureDetector;
import android.view.MotionEvent;

public final class w1 implements GestureDetector.OnGestureListener {
    public final x1 A;

    public w1(x1 x1Var) {
        this.A = x1Var;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f10) {
        x1 x1Var = this.A;
        u uVar = (u) x1Var.f2771d;
        if (!x1Var.f2769b) {
            int i10 = x1Var.f2770c;
            if (i10 == 1) {
                if (Math.abs(f3) > Math.abs(f10)) {
                    ((g2.n) uVar.B.getFocusOwner()).h(f3 > 0.0f ? 1 : 2, false);
                    return true;
                }
            } else if (i10 == 2 && Math.abs(f10) > Math.abs(f3)) {
                ((g2.n) uVar.B.getFocusOwner()).h(f10 > 0.0f ? 1 : 2, false);
            }
        }
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f10) {
        return true;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }
}

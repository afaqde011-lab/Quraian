package k;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

public final class z extends ContentFrameLayout {
    public final b0 I;

    public z(b0 b0Var, n.d dVar) {
        super(dVar, null);
        this.I = b0Var;
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.I.t(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x2 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (x2 < -5 || y10 < -5 || x2 > getWidth() + 5 || y10 > getHeight() + 5) {
                b0 b0Var = this.I;
                b0Var.r(b0Var.z(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void setBackgroundResource(int i10) {
        setBackgroundDrawable(p30.f.f0(getContext(), i10));
    }
}

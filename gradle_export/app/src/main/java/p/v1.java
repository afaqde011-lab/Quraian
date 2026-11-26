package p;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

public final class v1 implements View.OnTouchListener {
    public final w1 A;

    public v1(w1 w1Var) {
        this.A = w1Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        w1 w1Var = this.A;
        s1 s1Var = w1Var.R;
        Handler handler = w1Var.V;
        y yVar = w1Var.Z;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (action == 0 && yVar != null && yVar.isShowing() && x2 >= 0 && x2 < yVar.getWidth() && y10 >= 0 && y10 < yVar.getHeight()) {
            handler.postDelayed(s1Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(s1Var);
        return false;
    }
}

package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import nf.c;
import tf.x;
import ug.b;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    public final x f4199h;

    public BaseTransientBottomBar$Behavior() {
        x xVar = new x(13);
        this.f4103e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f4104f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f4102d = 0;
        this.f4199h = xVar;
    }

    @Override
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f4199h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (c.B == null) {
                    c.B = new c();
                }
                synchronized (c.B.A) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (c.B == null) {
                c.B = new c();
            }
            synchronized (c.B.A) {
            }
        }
        return super.j(coordinatorLayout, view, motionEvent);
    }

    @Override
    public final boolean v(View view) {
        this.f4199h.getClass();
        return view instanceof b;
    }
}

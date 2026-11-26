package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cg.d;
import l4.a;
import me.i;
import p5.c;
import z4.j0;

public class SwipeDismissBehavior<V extends View> extends a {

    public c f4099a;

    public boolean f4100b;

    public boolean f4101c;

    public int f4102d = 2;

    public float f4103e = 0.0f;

    public float f4104f = 0.5f;

    public final d f4105g = new d(this);

    @Override
    public boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zO = this.f4100b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zO = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f4100b = zO;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f4100b = false;
        }
        if (zO) {
            if (this.f4099a == null) {
                this.f4099a = new c(coordinatorLayout.getContext(), coordinatorLayout, this.f4105g);
            }
            if (!this.f4101c && this.f4099a.p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            j0.e(view, 1048576);
            j0.d(view, 0);
            if (v(view)) {
                j0.f(view, a5.c.l, new i(this, 15));
            }
        }
        return false;
    }

    @Override
    public final boolean u(View view, MotionEvent motionEvent) {
        if (this.f4099a == null) {
            return false;
        }
        if (this.f4101c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f4099a.j(motionEvent);
        return true;
    }

    public boolean v(View view) {
        return true;
    }
}

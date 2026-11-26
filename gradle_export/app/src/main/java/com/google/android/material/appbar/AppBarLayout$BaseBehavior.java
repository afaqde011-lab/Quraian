package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import bg.a;

public class AppBarLayout$BaseBehavior<T> extends a {

    public boolean f4068b;

    public int f4070d;

    public VelocityTracker f4072f;

    public int f4069c = -1;

    public int f4071e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }

    @Override
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int iFindPointerIndex;
        if (this.f4071e < 0) {
            this.f4071e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f4068b) {
            int i10 = this.f4069c;
            if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) != -1) {
                int y10 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y10 - this.f4070d) > this.f4071e) {
                    this.f4070d = y10;
                    return true;
                }
                if (motionEvent.getActionMasked() != 0) {
                    this.f4069c = -1;
                    motionEvent.getX();
                    motionEvent.getY();
                    throw new ClassCastException();
                }
                velocityTracker = this.f4072f;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else {
            if (motionEvent.getActionMasked() != 0) {
                this.f4069c = -1;
                motionEvent.getX();
                motionEvent.getY();
                throw new ClassCastException();
            }
            velocityTracker = this.f4072f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    @Override
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i10) {
        throw new ClassCastException();
    }

    @Override
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        throw new ClassCastException();
    }

    @Override
    public final void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        throw new ClassCastException();
    }

    @Override
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        throw new ClassCastException();
    }

    @Override
    public final void q(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override
    public final Parcelable r(View view) {
        throw new ClassCastException();
    }

    @Override
    public final boolean s(View view, int i10, int i11) {
        throw new ClassCastException();
    }

    @Override
    public final void t(View view, View view2, int i10) {
        throw new ClassCastException();
    }

    @Override
    public final boolean u(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int i10 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                        this.f4069c = motionEvent.getPointerId(i10);
                        this.f4070d = (int) (motionEvent.getY(i10) + 0.5f);
                    }
                }
                velocityTracker = this.f4072f;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (this.f4068b) {
                    return true;
                }
            } else {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f4069c);
                if (iFindPointerIndex != -1) {
                    this.f4070d = (int) motionEvent.getY(iFindPointerIndex);
                    view.getClass();
                    throw new ClassCastException();
                }
            }
            return false;
        }
        VelocityTracker velocityTracker2 = this.f4072f;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
            this.f4072f.computeCurrentVelocity(1000);
            this.f4072f.getYVelocity(this.f4069c);
            view.getClass();
            throw new ClassCastException();
        }
        this.f4068b = false;
        this.f4069c = -1;
        VelocityTracker velocityTracker3 = this.f4072f;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f4072f = null;
        }
        velocityTracker = this.f4072f;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (this.f4068b) {
            return false;
        }
        return true;
    }
}

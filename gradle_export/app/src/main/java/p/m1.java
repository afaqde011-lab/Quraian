package p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public abstract class m1 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float A;
    public final int B;
    public final int C;
    public final View D;
    public l1 E;
    public l1 F;
    public boolean G;
    public int H;
    public final int[] I = new int[2];

    public m1(View view) {
        this.D = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.A = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.B = tapTimeout;
        this.C = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        l1 l1Var = this.F;
        View view = this.D;
        if (l1Var != null) {
            view.removeCallbacks(l1Var);
        }
        l1 l1Var2 = this.E;
        if (l1Var2 != null) {
            view.removeCallbacks(l1Var2);
        }
    }

    public abstract o.b0 b();

    public abstract boolean c();

    public boolean d() {
        o.b0 b0VarB = b();
        if (b0VarB == null || !b0VarB.a()) {
            return true;
        }
        b0VarB.dismiss();
        return true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        j1 j1VarH;
        boolean z11 = this.G;
        View view2 = this.D;
        if (z11) {
            o.b0 b0VarB = b();
            if (b0VarB != null && b0VarB.a() && (j1VarH = b0VarB.h()) != null && j1VarH.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.I;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                j1VarH.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = j1VarH.b(motionEventObtainNoHistory, this.H);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z12 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z12) {
                    z10 = true;
                } else if (d()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else if (d()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.H = motionEvent.getPointerId(0);
                    if (this.E == null) {
                        this.E = new l1(this, 0);
                    }
                    view2.postDelayed(this.E, this.B);
                    if (this.F == null) {
                        this.F = new l1(this, 1);
                    }
                    view2.postDelayed(this.F, this.C);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.H);
                    if (iFindPointerIndex >= 0) {
                        float x2 = motionEvent.getX(iFindPointerIndex);
                        float y10 = motionEvent.getY(iFindPointerIndex);
                        float f3 = this.A;
                        float f10 = -f3;
                        if (x2 < f10 || y10 < f10 || x2 >= (view2.getRight() - view2.getLeft()) + f3 || y10 >= (view2.getBottom() - view2.getTop()) + f3) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (c()) {
                                z10 = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z10 = false;
            } else {
                z10 = false;
            }
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.G = z10;
        return z10 || z11;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.G = false;
        this.H = -1;
        l1 l1Var = this.E;
        if (l1Var != null) {
            this.D.removeCallbacks(l1Var);
        }
    }
}

package cg;

import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.internal.play_billing.r0;
import com.google.android.material.behavior.SwipeDismissBehavior;

public final class d extends ze.d {

    public int f3152c;

    public int f3153d = -1;

    public final SwipeDismissBehavior f3154e;

    public d(SwipeDismissBehavior swipeDismissBehavior) {
        this.f3154e = swipeDismissBehavior;
    }

    @Override
    public final int B(View view) {
        return view.getWidth();
    }

    @Override
    public final void I(View view, int i10) {
        this.f3153d = i10;
        this.f3152c = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f3154e;
            swipeDismissBehavior.f4101c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f4101c = false;
        }
    }

    @Override
    public final void J(int i10) {
    }

    @Override
    public final void K(View view, int i10, int i11) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f3154e;
        float f3 = width * swipeDismissBehavior.f4103e;
        float width2 = view.getWidth() * swipeDismissBehavior.f4104f;
        float fAbs = Math.abs(i10 - this.f3152c);
        if (fAbs <= f3) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f3) / (width2 - f3))), 1.0f));
        }
    }

    @Override
    public final void L(View view, float f3, float f10) {
        int i10;
        int left;
        int i11;
        this.f3153d = -1;
        int width = view.getWidth();
        boolean z10 = false;
        SwipeDismissBehavior swipeDismissBehavior = this.f3154e;
        if (f3 != 0.0f) {
            boolean z11 = view.getLayoutDirection() == 1;
            int i12 = swipeDismissBehavior.f4102d;
            if (i12 != 2 && (i12 != 0 ? i12 != 1 || (!z11 ? f3 < 0.0f : f3 > 0.0f) : !z11 ? f3 > 0.0f : f3 < 0.0f)) {
                i10 = this.f3152c;
            } else {
                if (f3 >= 0.0f) {
                    left = view.getLeft();
                    i11 = this.f3152c;
                    if (left < i11) {
                        i10 = this.f3152c - width;
                    } else {
                        i10 = i11 + width;
                    }
                } else {
                    i10 = this.f3152c - width;
                }
                z10 = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.f3152c) >= Math.round(view.getWidth() * 0.5f)) {
                if (f3 >= 0.0f) {
                    left = view.getLeft();
                    i11 = this.f3152c;
                    if (left < i11) {
                        i10 = this.f3152c - width;
                    } else {
                        i10 = i11 + width;
                    }
                } else {
                    i10 = this.f3152c - width;
                }
                z10 = true;
            } else {
                i10 = this.f3152c;
            }
        }
        if (swipeDismissBehavior.f4099a.o(i10, view.getTop())) {
            view.postOnAnimation(new r0(swipeDismissBehavior, view, z10));
        }
    }

    @Override
    public final boolean T(View view, int i10) {
        int i11 = this.f3153d;
        return (i11 == -1 || i11 == i10) && this.f3154e.v(view);
    }

    @Override
    public final int k(View view, int i10) {
        int width;
        int width2;
        int width3;
        boolean z10 = view.getLayoutDirection() == 1;
        int i11 = this.f3154e.f4102d;
        if (i11 == 0) {
            if (z10) {
                width = this.f3152c - view.getWidth();
                width2 = this.f3152c;
            } else {
                width = this.f3152c;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i11 != 1) {
            width = this.f3152c - view.getWidth();
            width2 = this.f3152c + view.getWidth();
        } else if (z10) {
            width = this.f3152c;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f3152c - view.getWidth();
            width2 = this.f3152c;
        }
        return Math.min(Math.max(width, i10), width2);
    }

    @Override
    public final int l(View view, int i10) {
        return view.getTop();
    }
}

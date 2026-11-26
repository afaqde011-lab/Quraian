package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import p.a;
import p.g2;

public class ActionBarContainer extends FrameLayout {
    public boolean A;
    public View B;
    public View C;
    public Drawable D;
    public Drawable E;
    public Drawable F;
    public final boolean G;
    public boolean H;
    public final int I;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new a(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f7716a);
        boolean z10 = false;
        this.D = typedArrayObtainStyledAttributes.getDrawable(0);
        this.E = typedArrayObtainStyledAttributes.getDrawable(2);
        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == 2131363026) {
            this.G = true;
            this.F = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.G ? !(this.D != null || this.E != null) : this.F == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.D;
        if (drawable != null && drawable.isStateful()) {
            this.D.setState(getDrawableState());
        }
        Drawable drawable2 = this.E;
        if (drawable2 != null && drawable2.isStateful()) {
            this.E.setState(getDrawableState());
        }
        Drawable drawable3 = this.F;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.F.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.D;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.E;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.F;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.B = findViewById(2131361844);
        this.C = findViewById(2131361852);
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A || super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (this.G) {
            Drawable drawable = this.F;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = false;
            }
        } else {
            if (this.D == null) {
                z11 = false;
            } else if (this.B.getVisibility() == 0) {
                this.D.setBounds(this.B.getLeft(), this.B.getTop(), this.B.getRight(), this.B.getBottom());
            } else {
                View view = this.C;
                if (view == null || view.getVisibility() != 0) {
                    this.D.setBounds(0, 0, 0, 0);
                } else {
                    this.D.setBounds(this.C.getLeft(), this.C.getTop(), this.C.getRight(), this.C.getBottom());
                }
            }
            this.H = false;
        }
        if (z11) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.B == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.I) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.B == null) {
            return;
        }
        View.MeasureSpec.getMode(i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.D;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.D);
        }
        this.D = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.B;
            if (view != null) {
                this.D.setBounds(view.getLeft(), this.B.getTop(), this.B.getRight(), this.B.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.G ? !(this.D != null || this.E != null) : this.F == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.F;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.F);
        }
        this.F = drawable;
        boolean z10 = this.G;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.F) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.D != null || this.E != null) : this.F == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.E;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.E);
        }
        this.E = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.H && this.E != null) {
                throw null;
            }
        }
        boolean z10 = false;
        if (!this.G ? !(this.D != null || this.E != null) : this.F == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(g2 g2Var) {
    }

    public void setTransitioning(boolean z10) {
        this.A = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.D;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.E;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.F;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.D;
        boolean z10 = this.G;
        if (drawable == drawable2 && !z10) {
            return true;
        }
        if (drawable == this.E && this.H) {
            return true;
        }
        return (drawable == this.F && z10) || super.verifyDrawable(drawable);
    }
}

package ng;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import p.o1;

public abstract class d extends o1 {
    public Drawable P;
    public final Rect Q;
    public final Rect R;
    public int S;
    public final boolean T;
    public boolean U;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.Q = new Rect();
        this.R = new Rect();
        this.S = 119;
        this.T = true;
        this.U = false;
        j.a(context, attributeSet, 0, 0);
        int[] iArr = zf.a.f17434h;
        j.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.S = typedArrayObtainStyledAttributes.getInt(1, this.S);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.T = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.P;
        if (drawable != null) {
            if (this.U) {
                this.U = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z10 = this.T;
                Rect rect = this.Q;
                if (z10) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i10 = this.S;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.R;
                Gravity.apply(i10, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override
    public final void drawableHotspotChanged(float f3, float f10) {
        super.drawableHotspotChanged(f3, f10);
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.setHotspot(f3, f10);
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.P;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.P.setState(getDrawableState());
    }

    @Override
    public Drawable getForeground() {
        return this.P;
    }

    @Override
    public int getForegroundGravity() {
        return this.S;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.U = z10 | this.U;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.U = true;
    }

    @Override
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.P;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.P);
            }
            this.P = drawable;
            this.U = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.S == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override
    public void setForegroundGravity(int i10) {
        if (this.S != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.S = i10;
            if (i10 == 119 && this.P != null) {
                this.P.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.P;
    }
}

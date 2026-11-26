package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import m9.a;
import m9.b;
import m9.e0;

public final class AspectRatioFrameLayout extends FrameLayout {
    public static final int D = 0;
    public final b A;
    public float B;
    public int C;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, e0.f10654a, 0, 0);
            try {
                this.C = typedArrayObtainStyledAttributes.getInt(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.A = new b(this);
    }

    public int getResizeMode() {
        return this.C;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f3;
        float f10;
        super.onMeasure(i10, i11);
        if (this.B <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f11 = measuredWidth;
        float f12 = measuredHeight;
        float f13 = (this.B / (f11 / f12)) - 1.0f;
        float fAbs = Math.abs(f13);
        b bVar = this.A;
        if (fAbs <= 0.01f) {
            if (bVar.B) {
                return;
            }
            bVar.B = true;
            ((AspectRatioFrameLayout) bVar.C).post(bVar);
            return;
        }
        int i12 = this.C;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f3 = this.B;
                } else if (i12 == 4) {
                    if (f13 > 0.0f) {
                        f3 = this.B;
                    } else {
                        f10 = this.B;
                    }
                }
                measuredWidth = (int) (f12 * f3);
            } else {
                f10 = this.B;
            }
            measuredHeight = (int) (f11 / f10);
        } else if (f13 > 0.0f) {
            f10 = this.B;
            measuredHeight = (int) (f11 / f10);
        } else {
            f3 = this.B;
            measuredWidth = (int) (f12 * f3);
        }
        if (!bVar.B) {
            bVar.B = true;
            ((AspectRatioFrameLayout) bVar.C).post(bVar);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f3) {
        if (this.B != f3) {
            this.B = f3;
            requestLayout();
        }
    }

    public void setAspectRatioListener(a aVar) {
    }

    public void setResizeMode(int i10) {
        if (this.C != i10) {
            this.C = i10;
            requestLayout();
        }
    }
}

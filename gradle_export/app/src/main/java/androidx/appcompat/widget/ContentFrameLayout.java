package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import k.b0;
import k.s;
import o.l;
import p.b1;
import p.c1;
import p.f;
import p.j;
import p.s2;
import z4.n0;

public class ContentFrameLayout extends FrameLayout {
    public TypedValue A;
    public TypedValue B;
    public TypedValue C;
    public TypedValue D;
    public TypedValue E;
    public TypedValue F;
    public final Rect G;
    public b1 H;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.G = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.E == null) {
            this.E = new TypedValue();
        }
        return this.E;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.F == null) {
            this.F = new TypedValue();
        }
        return this.F;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.C == null) {
            this.C = new TypedValue();
        }
        return this.C;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.D == null) {
            this.D = new TypedValue();
        }
        return this.D;
    }

    public TypedValue getMinWidthMajor() {
        if (this.A == null) {
            this.A = new TypedValue();
        }
        return this.A;
    }

    public TypedValue getMinWidthMinor() {
        if (this.B == null) {
            this.B = new TypedValue();
        }
        return this.B;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b1 b1Var = this.H;
        if (b1Var != null) {
            b1Var.getClass();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        j jVar;
        super.onDetachedFromWindow();
        b1 b1Var = this.H;
        if (b1Var != null) {
            b0 b0Var = ((s) b1Var).A;
            c1 c1Var = b0Var.P;
            if (c1Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) c1Var;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((s2) actionBarOverlayLayout.E).f12208a.A;
                if (actionMenuView != null && (jVar = actionMenuView.T) != null) {
                    jVar.h();
                    f fVar = jVar.T;
                    if (fVar != null && fVar.b()) {
                        fVar.f11464i.dismiss();
                    }
                }
            }
            if (b0Var.U != null) {
                b0Var.J.getDecorView().removeCallbacks(b0Var.V);
                if (b0Var.U.isShowing()) {
                    try {
                        b0Var.U.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                b0Var.U = null;
            }
            n0 n0Var = b0Var.W;
            if (n0Var != null) {
                n0Var.b();
            }
            l lVar = b0Var.z(0).f8333h;
            if (lVar != null) {
                lVar.c(true);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        boolean z10;
        int iMakeMeasureSpec2;
        int i12;
        int i13;
        float fraction;
        int i14;
        int i15;
        float fraction2;
        int i16;
        int i17;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z11 = true;
        boolean z12 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        Rect rect = this.G;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i10;
            z10 = false;
        } else {
            TypedValue typedValue = z12 ? this.D : this.C;
            if (typedValue == null || (i16 = typedValue.type) == 0) {
                iMakeMeasureSpec = i10;
                z10 = false;
            } else {
                if (i16 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i16 == 6) {
                        int i18 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i18, i18);
                    } else {
                        i17 = 0;
                    }
                    if (i17 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.left + rect.right), View.MeasureSpec.getSize(i10)), 1073741824);
                        z10 = true;
                    } else {
                        iMakeMeasureSpec = i10;
                        z10 = false;
                    }
                }
                i17 = (int) fraction3;
                if (i17 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.left + rect.right), View.MeasureSpec.getSize(i10)), 1073741824);
                    z10 = true;
                } else {
                    iMakeMeasureSpec = i10;
                    z10 = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i11;
        } else {
            TypedValue typedValue2 = z12 ? this.E : this.F;
            if (typedValue2 == null || (i14 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i11;
            } else {
                if (i14 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i14 == 6) {
                        int i19 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i19, i19);
                    } else {
                        i15 = 0;
                    }
                    if (i15 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i11;
                    }
                }
                i15 = (int) fraction2;
                if (i15 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i11;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z10 || mode != Integer.MIN_VALUE) {
            z11 = false;
        } else {
            TypedValue typedValue3 = z12 ? this.B : this.A;
            if (typedValue3 == null || (i12 = typedValue3.type) == 0) {
                z11 = false;
            } else {
                if (i12 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i12 == 6) {
                        int i20 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i20, i20);
                    } else {
                        i13 = 0;
                    }
                    if (i13 > 0) {
                        i13 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i13) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                    } else {
                        z11 = false;
                    }
                }
                i13 = (int) fraction;
                if (i13 > 0) {
                    i13 -= rect.left + rect.right;
                }
                if (measuredWidth < i13) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                } else {
                    z11 = false;
                }
            }
        }
        if (z11) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(b1 b1Var) {
        this.H = b1Var;
    }
}

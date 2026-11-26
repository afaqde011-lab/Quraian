package ug;

import ab.a0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.measurement.g4;
import eg.d;
import ng.j;
import sg.i;
import sg.m;

public abstract class b extends FrameLayout {
    public static final d I = new d(1);
    public final m A;
    public int B;
    public final float C;
    public final float D;
    public final int E;
    public final int F;
    public ColorStateList G;
    public PorterDuff.Mode H;

    public b(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(xg.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, zf.a.A);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.B = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.A = m.b(context2, attributeSet, 0, 0).a();
        }
        this.C = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(g4.J(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(j.f(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.D = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(I);
        setFocusable(true);
        if (getBackground() == null) {
            int iK0 = a0.k0(getBackgroundOverlayColorAlpha(), a0.e0(this, 2130968937), a0.e0(this, 2130968914));
            m mVar = this.A;
            if (mVar != null) {
                int i10 = c.f15255a;
                i iVar = new i(mVar);
                iVar.m(ColorStateList.valueOf(iK0));
                drawable = iVar;
            } else {
                Resources resources = getResources();
                int i11 = c.f15255a;
                float dimension = resources.getDimension(2131166262);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iK0);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.G;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            setBackground(drawable);
        }
    }

    private void setBaseTransientBottomBar(c cVar) {
    }

    public float getActionTextColorAlpha() {
        return this.D;
    }

    public int getAnimationMode() {
        return this.B;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.C;
    }

    public int getMaxInlineActionWidth() {
        return this.F;
    }

    public int getMaxWidth() {
        return this.E;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = this.E;
        if (i12 <= 0 || getMeasuredWidth() <= i12) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
    }

    public void setAnimationMode(int i10) {
        this.B = i10;
    }

    @Override
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.G != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.G);
            drawable.setTintMode(this.H);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.G = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.H);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.H = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : I);
        super.setOnClickListener(onClickListener);
    }
}

package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

public final class n0 extends Spinner {
    public static final int[] I = {R.attr.spinnerMode};
    public final b3.i2 A;
    public final Context B;
    public final e0 C;
    public SpinnerAdapter D;
    public final boolean E;
    public final m0 F;
    public int G;
    public final Rect H;

    public n0(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, 2130969817);
        this.H = new Rect();
        i2.a(this, getContext());
        int[] iArr = j.a.f7734u;
        k9.x0 x0VarK = k9.x0.K(context, attributeSet, iArr, 2130969817);
        TypedArray typedArray = (TypedArray) x0VarK.C;
        this.A = new b3.i2(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.B = new n.d(context, resourceId);
        } else {
            this.B = context;
        }
        int i10 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I, 2130969817, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i10 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e3) {
                    e = e3;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i10 != 0) {
                        g0 g0Var = new g0(this);
                        this.F = g0Var;
                        g0Var.C = typedArray.getString(2);
                    } else if (i10 == 1) {
                        k0 k0Var = new k0(this, this.B, attributeSet);
                        k9.x0 x0VarK2 = k9.x0.K(this.B, attributeSet, iArr, 2130969817);
                        this.G = ((TypedArray) x0VarK2.C).getLayoutDimension(3, -2);
                        k0Var.j(x0VarK2.v(1));
                        k0Var.f12176a0 = typedArray.getString(2);
                        x0VarK2.O();
                        this.F = k0Var;
                        this.C = new e0(this, this, k0Var);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(2131559724);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    x0VarK.O();
                    this.E = true;
                    spinnerAdapter = this.D;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.D = null;
                    }
                    this.A.n(attributeSet, 2130969817);
                }
            } catch (Throwable th2) {
                th = th2;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e10) {
            e = e10;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th3) {
            th = th3;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i10 != 0) {
            g0 g0Var2 = new g0(this);
            this.F = g0Var2;
            g0Var2.C = typedArray.getString(2);
        } else if (i10 == 1) {
            k0 k0Var2 = new k0(this, this.B, attributeSet);
            k9.x0 x0VarK3 = k9.x0.K(this.B, attributeSet, iArr, 2130969817);
            this.G = ((TypedArray) x0VarK3.C).getLayoutDimension(3, -2);
            k0Var2.j(x0VarK3.v(1));
            k0Var2.f12176a0 = typedArray.getString(2);
            x0VarK3.O();
            this.F = k0Var2;
            this.C = new e0(this, this, k0Var2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(2131559724);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        x0VarK.O();
        this.E = true;
        spinnerAdapter = this.D;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.D = null;
        }
        this.A.n(attributeSet, 2130969817);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.H;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        b3.i2 i2Var = this.A;
        if (i2Var != null) {
            i2Var.b();
        }
    }

    @Override
    public int getDropDownHorizontalOffset() {
        m0 m0Var = this.F;
        return m0Var != null ? m0Var.b() : super.getDropDownHorizontalOffset();
    }

    @Override
    public int getDropDownVerticalOffset() {
        m0 m0Var = this.F;
        return m0Var != null ? m0Var.n() : super.getDropDownVerticalOffset();
    }

    @Override
    public int getDropDownWidth() {
        return this.F != null ? this.G : super.getDropDownWidth();
    }

    public final m0 getInternalPopup() {
        return this.F;
    }

    @Override
    public Drawable getPopupBackground() {
        m0 m0Var = this.F;
        return m0Var != null ? m0Var.f() : super.getPopupBackground();
    }

    @Override
    public Context getPopupContext() {
        return this.B;
    }

    @Override
    public CharSequence getPrompt() {
        m0 m0Var = this.F;
        return m0Var != null ? m0Var.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        b3.i2 i2Var = this.A;
        if (i2Var != null) {
            return i2Var.j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        b3.i2 i2Var = this.A;
        if (i2Var != null) {
            return i2Var.k();
        }
        return null;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m0 m0Var = this.F;
        if (m0Var == null || !m0Var.a()) {
            return;
        }
        m0Var.dismiss();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.F == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        l0 l0Var = (l0) parcelable;
        super.onRestoreInstanceState(l0Var.getSuperState());
        if (!l0Var.A || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new o.d(this, 2));
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        l0 l0Var = new l0(super.onSaveInstanceState());
        m0 m0Var = this.F;
        l0Var.A = m0Var != null && m0Var.a();
        return l0Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var = this.C;
        if (e0Var == null || !e0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public final boolean performClick() {
        m0 m0Var = this.F;
        if (m0Var == null) {
            return super.performClick();
        }
        if (m0Var.a()) {
            return true;
        }
        m0Var.m(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.E) {
            this.D = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        m0 m0Var = this.F;
        if (m0Var != null) {
            Context context = this.B;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            h0 h0Var = new h0();
            h0Var.A = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                h0Var.B = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                f0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            m0Var.o(h0Var);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        b3.i2 i2Var = this.A;
        if (i2Var != null) {
            i2Var.p();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        b3.i2 i2Var = this.A;
        if (i2Var != null) {
            i2Var.q(i10);
        }
    }

    @Override
    public void setDropDownHorizontalOffset(int i10) {
        m0 m0Var = this.F;
        if (m0Var == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            m0Var.l(i10);
            m0Var.d(i10);
        }
    }

    @Override
    public void setDropDownVerticalOffset(int i10) {
        m0 m0Var = this.F;
        if (m0Var != null) {
            m0Var.k(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override
    public void setDropDownWidth(int i10) {
        if (this.F != null) {
            this.G = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override
    public void setPopupBackgroundDrawable(Drawable drawable) {
        m0 m0Var = this.F;
        if (m0Var != null) {
            m0Var.j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(p30.f.f0(getPopupContext(), i10));
    }

    @Override
    public void setPrompt(CharSequence charSequence) {
        m0 m0Var = this.F;
        if (m0Var != null) {
            m0Var.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        b3.i2 i2Var = this.A;
        if (i2Var != null) {
            i2Var.x(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        b3.i2 i2Var = this.A;
        if (i2Var != null) {
            i2Var.y(mode);
        }
    }
}

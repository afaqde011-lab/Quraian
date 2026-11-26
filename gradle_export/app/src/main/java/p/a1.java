package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

public final class a1 extends ToggleButton {
    public final b3.i2 A;
    public final s0 B;
    public u C;

    public a1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        i2.a(this, getContext());
        b3.i2 i2Var = new b3.i2(this);
        this.A = i2Var;
        i2Var.n(attributeSet, R.attr.buttonStyleToggle);
        s0 s0Var = new s0(this);
        this.B = s0Var;
        s0Var.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private u getEmojiTextViewHelper() {
        if (this.C == null) {
            this.C = new u(this);
        }
        return this.C;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        b3.i2 i2Var = this.A;
        if (i2Var != null) {
            i2Var.b();
        }
        s0 s0Var = this.B;
        if (s0Var != null) {
            s0Var.b();
        }
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.B.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.B.e();
    }

    @Override
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
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
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        s0 s0Var = this.B;
        if (s0Var != null) {
            s0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        s0 s0Var = this.B;
        if (s0Var != null) {
            s0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((a.a) getEmojiTextViewHelper().f12223b.A).A(inputFilterArr));
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

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        s0 s0Var = this.B;
        s0Var.h(colorStateList);
        s0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        s0 s0Var = this.B;
        s0Var.i(mode);
        s0Var.b();
    }
}

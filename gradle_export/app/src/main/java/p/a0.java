package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;

public class a0 extends RadioButton implements e5.i {
    public final l1.q1 A;
    public final b3.i2 B;
    public final s0 C;
    public u D;

    public a0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969704);
        j2.a(context);
        i2.a(this, getContext());
        l1.q1 q1Var = new l1.q1(this, 2);
        this.A = q1Var;
        q1Var.d(attributeSet, 2130969704);
        b3.i2 i2Var = new b3.i2(this);
        this.B = i2Var;
        i2Var.n(attributeSet, 2130969704);
        s0 s0Var = new s0(this);
        this.C = s0Var;
        s0Var.f(attributeSet, 2130969704);
        getEmojiTextViewHelper().a(attributeSet, 2130969704);
    }

    private u getEmojiTextViewHelper() {
        if (this.D == null) {
            this.D = new u(this);
        }
        return this.D;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        b3.i2 i2Var = this.B;
        if (i2Var != null) {
            i2Var.b();
        }
        s0 s0Var = this.C;
        if (s0Var != null) {
            s0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        b3.i2 i2Var = this.B;
        if (i2Var != null) {
            return i2Var.j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        b3.i2 i2Var = this.B;
        if (i2Var != null) {
            return i2Var.k();
        }
        return null;
    }

    @Override
    public ColorStateList getSupportButtonTintList() {
        l1.q1 q1Var = this.A;
        if (q1Var != null) {
            return (ColorStateList) q1Var.f9914f;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        l1.q1 q1Var = this.A;
        if (q1Var != null) {
            return (PorterDuff.Mode) q1Var.f9915g;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.C.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.C.e();
    }

    @Override
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        b3.i2 i2Var = this.B;
        if (i2Var != null) {
            i2Var.p();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        b3.i2 i2Var = this.B;
        if (i2Var != null) {
            i2Var.q(i10);
        }
    }

    @Override
    public void setButtonDrawable(int i10) {
        setButtonDrawable(p30.f.f0(getContext(), i10));
    }

    @Override
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        l1.q1 q1Var = this.A;
        if (q1Var != null) {
            if (q1Var.f9912d) {
                q1Var.f9912d = false;
            } else {
                q1Var.f9912d = true;
                q1Var.a();
            }
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        s0 s0Var = this.C;
        if (s0Var != null) {
            s0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        s0 s0Var = this.C;
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
        b3.i2 i2Var = this.B;
        if (i2Var != null) {
            i2Var.x(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        b3.i2 i2Var = this.B;
        if (i2Var != null) {
            i2Var.y(mode);
        }
    }

    @Override
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        l1.q1 q1Var = this.A;
        if (q1Var != null) {
            q1Var.f9914f = colorStateList;
            q1Var.f9910b = true;
            q1Var.a();
        }
    }

    @Override
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        l1.q1 q1Var = this.A;
        if (q1Var != null) {
            q1Var.f9915g = mode;
            q1Var.f9911c = true;
            q1Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        s0 s0Var = this.C;
        s0Var.h(colorStateList);
        s0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        s0 s0Var = this.C;
        s0Var.i(mode);
        s0Var.b();
    }
}

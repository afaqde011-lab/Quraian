package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import java.util.WeakHashMap;

public final class q extends CheckedTextView {
    public final l1.q1 A;
    public final b3.i2 B;
    public final s0 C;
    public u D;

    public q(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, 2130968828);
        j2.a(context);
        i2.a(this, getContext());
        s0 s0Var = new s0(this);
        this.C = s0Var;
        s0Var.f(attributeSet, 2130968828);
        s0Var.b();
        b3.i2 i2Var = new b3.i2(this);
        this.B = i2Var;
        i2Var.n(attributeSet, 2130968828);
        this.A = new l1.q1(this, 1);
        Context context2 = getContext();
        int[] iArr = j.a.l;
        k9.x0 x0VarK = k9.x0.K(context2, attributeSet, iArr, 2130968828);
        TypedArray typedArray = (TypedArray) x0VarK.C;
        Context context3 = getContext();
        TypedArray typedArray2 = (TypedArray) x0VarK.C;
        WeakHashMap weakHashMap = z4.j0.f17198a;
        z4.h0.b(this, context3, iArr, attributeSet, typedArray2, 2130968828, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(p30.f.f0(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(p30.f.f0(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(p30.f.f0(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(x0VarK.t(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(e1.a(typedArray.getInt(3, -1), null));
            }
            x0VarK.O();
            getEmojiTextViewHelper().a(attributeSet, 2130968828);
        } catch (Throwable th2) {
            x0VarK.O();
            throw th2;
        }
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
        s0 s0Var = this.C;
        if (s0Var != null) {
            s0Var.b();
        }
        b3.i2 i2Var = this.B;
        if (i2Var != null) {
            i2Var.b();
        }
        l1.q1 q1Var = this.A;
        if (q1Var != null) {
            q1Var.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
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

    public ColorStateList getSupportCheckMarkTintList() {
        l1.q1 q1Var = this.A;
        if (q1Var != null) {
            return (ColorStateList) q1Var.f9914f;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        f50.k.w(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
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
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(p30.f.f0(getContext(), i10));
    }

    @Override
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        l1.q1 q1Var = this.A;
        if (q1Var != null) {
            if (q1Var.f9912d) {
                q1Var.f9912d = false;
            } else {
                q1Var.f9912d = true;
                q1Var.b();
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

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        l1.q1 q1Var = this.A;
        if (q1Var != null) {
            q1Var.f9914f = colorStateList;
            q1Var.f9910b = true;
            q1Var.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        l1.q1 q1Var = this.A;
        if (q1Var != null) {
            q1Var.f9915g = mode;
            q1Var.f9911c = true;
            q1Var.b();
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

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        s0 s0Var = this.C;
        if (s0Var != null) {
            s0Var.g(context, i10);
        }
    }
}

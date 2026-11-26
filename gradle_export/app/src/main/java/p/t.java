package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

public class t extends EditText {
    public final b3.i2 A;
    public final s0 B;
    public final z C;
    public s D;

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969085);
        j2.a(context);
        i2.a(this, getContext());
        b3.i2 i2Var = new b3.i2(this);
        this.A = i2Var;
        i2Var.n(attributeSet, 2130969085);
        s0 s0Var = new s0(this);
        this.B = s0Var;
        s0Var.f(attributeSet, 2130969085);
        s0Var.b();
        z zVar = new z(this);
        this.C = zVar;
        zVar.e(attributeSet, 2130969085);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerD = zVar.d(keyListener);
        if (keyListenerD == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerD);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private s getSuperCaller() {
        if (this.D == null) {
            this.D = new s(this);
        }
        return this.D;
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

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
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
    public Editable getText() {
        return super.getText();
    }

    @Override
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.B.getClass();
        f50.k.w(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.C.f(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
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

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.C.g(z10);
    }

    @Override
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.C.d(keyListener));
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

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        s0 s0Var = this.B;
        if (s0Var != null) {
            s0Var.g(context, i10);
        }
    }

    @Override
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }
}

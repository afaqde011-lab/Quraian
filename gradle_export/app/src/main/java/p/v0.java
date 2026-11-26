package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class v0 extends TextView {
    public final b3.i2 A;
    public final s0 B;
    public u C;
    public boolean D;
    public z E;
    public Future F;

    public v0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public v0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j2.a(context);
        this.D = false;
        this.E = null;
        i2.a(this, getContext());
        b3.i2 i2Var = new b3.i2(this);
        this.A = i2Var;
        i2Var.n(attributeSet, i10);
        s0 s0Var = new s0(this);
        this.B = s0Var;
        s0Var.f(attributeSet, i10);
        s0Var.b();
        getEmojiTextViewHelper().a(attributeSet, i10);
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

    @Override
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    @Override
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public t0 getSuperCaller() {
        if (this.E == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.E = new u0(this);
            } else {
                this.E = new z(this);
            }
        }
        return this.E;
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
    public CharSequence getText() {
        Future future = this.F;
        if (future != null) {
            try {
                this.F = null;
                if (future.get() == null) {
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public x4.c getTextMetricsParamsCompat() {
        return new x4.c(getTextMetricsParams());
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.B.getClass();
        f50.k.w(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        s0 s0Var = this.B;
        if (s0Var != null) {
            s0Var.getClass();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        Future future = this.F;
        if (future != null) {
            try {
                this.F = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
    }

    @Override
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        super.setAutoSizeTextTypeWithDefaults(i10);
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? p30.f.f0(context, i10) : null, i11 != 0 ? p30.f.f0(context, i11) : null, i12 != 0 ? p30.f.f0(context, i12) : null, i13 != 0 ? p30.f.f0(context, i13) : null);
        s0 s0Var = this.B;
        if (s0Var != null) {
            s0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        s0 s0Var = this.B;
        if (s0Var != null) {
            s0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? p30.f.f0(context, i10) : null, i11 != 0 ? p30.f.f0(context, i11) : null, i12 != 0 ? p30.f.f0(context, i12) : null, i13 != 0 ? p30.f.f0(context, i13) : null);
        s0 s0Var = this.B;
        if (s0Var != null) {
            s0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
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
        getEmojiTextViewHelper().c(z10);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((a.a) getEmojiTextViewHelper().f12223b.A).A(inputFilterArr));
    }

    @Override
    public void setFirstBaselineToTopHeight(int i10) {
        getSuperCaller().b(i10);
    }

    @Override
    public void setLastBaselineToBottomHeight(int i10) {
        getSuperCaller().a(i10);
    }

    @Override
    public void setLineHeight(int i10) {
        qd.s0.q0(this, i10);
    }

    @Override
    public final void setLineHeight(int i10, float f3) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            getSuperCaller().c(i10, f3);
        } else if (i11 >= 34) {
            a5.b.m(this, i10, f3);
        } else {
            qd.s0.q0(this, Math.round(TypedValue.applyDimension(i10, f3, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(x4.d dVar) {
        throw null;
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
    public void setTextAppearance(Context context, int i10) {
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

    public void setTextFuture(Future<x4.d> future) {
        this.F = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(x4.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f16445b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i10 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i10 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i10 = 7;
            }
        }
        setTextDirection(i10);
        getPaint().set(cVar.f16444a);
        setBreakStrategy(cVar.f16446c);
        setHyphenationFrequency(cVar.f16447d);
    }

    @Override
    public final void setTypeface(Typeface typeface, int i10) {
        Typeface typefaceCreate;
        if (this.D) {
            return;
        }
        if (typeface == null || i10 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            q4.e eVar = q4.d.f12761a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i10);
        }
        this.D = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.D = false;
        }
    }
}

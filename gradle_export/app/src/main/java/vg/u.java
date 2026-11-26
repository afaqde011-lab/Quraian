package vg;

import ab.a0;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import k9.x0;
import p.v0;

public final class u extends LinearLayout {
    public final TextInputLayout A;
    public final v0 B;
    public CharSequence C;
    public final CheckableImageButton D;
    public ColorStateList E;
    public PorterDuff.Mode F;
    public int G;
    public ImageView.ScaleType H;
    public View.OnLongClickListener I;
    public boolean J;

    public u(TextInputLayout textInputLayout, x0 x0Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.A = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(2131558743, (ViewGroup) this, false);
        this.D = checkableImageButton;
        v0 v0Var = new v0(getContext(), null);
        this.B = v0Var;
        if (g4.Q(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.I;
        checkableImageButton.setOnClickListener(null);
        a0.B0(checkableImageButton, onLongClickListener);
        this.I = null;
        checkableImageButton.setOnLongClickListener(null);
        a0.B0(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) x0Var.C;
        if (typedArray.hasValue(70)) {
            this.E = g4.K(getContext(), x0Var, 70);
        }
        if (typedArray.hasValue(71)) {
            this.F = ng.j.f(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            b(x0Var.v(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(2131166215));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.G) {
            this.G = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeG = a0.G(typedArray.getInt(69, -1));
            this.H = scaleTypeG;
            checkableImageButton.setScaleType(scaleTypeG);
        }
        v0Var.setVisibility(8);
        v0Var.setId(2131363090);
        v0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        v0Var.setAccessibilityLiveRegion(1);
        v0Var.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            v0Var.setTextColor(x0Var.t(62));
        }
        CharSequence text2 = typedArray.getText(60);
        this.C = TextUtils.isEmpty(text2) ? null : text2;
        v0Var.setText(text2);
        e();
        addView(checkableImageButton);
        addView(v0Var);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.D;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.B.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.D;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.E;
            PorterDuff.Mode mode = this.F;
            TextInputLayout textInputLayout = this.A;
            a0.n(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            a0.w0(textInputLayout, checkableImageButton, this.E);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.I;
        checkableImageButton.setOnClickListener(null);
        a0.B0(checkableImageButton, onLongClickListener);
        this.I = null;
        checkableImageButton.setOnLongClickListener(null);
        a0.B0(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z10) {
        CheckableImageButton checkableImageButton = this.D;
        if ((checkableImageButton.getVisibility() == 0) != z10) {
            checkableImageButton.setVisibility(z10 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        EditText editText = this.A.E;
        if (editText == null) {
            return;
        }
        this.B.setPaddingRelative(this.D.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(2131166065), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i10 = (this.C == null || this.J) ? 8 : 0;
        setVisibility((this.D.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.B.setVisibility(i10);
        this.A.s();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        d();
    }
}

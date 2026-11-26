package com.google.android.material.textfield;

import ab.a0;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException;
import com.google.protobuf.RuntimeVersion;
import g4.c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import k7.t;
import k9.x0;
import ng.b;
import ng.j;
import p.e1;
import p.r;
import p.v0;
import qd.s0;
import sg.f;
import sg.g;
import sg.i;
import sg.l;
import sg.m;
import ta.h;
import uh.k;
import vg.n;
import vg.p;
import vg.q;
import vg.s;
import vg.u;
import vg.v;
import vg.w;
import vg.x;
import vg.y;
import xg.a;
import z4.j0;
import ze.d;

public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    public static final int[][] f4200d1 = {new int[]{R.attr.state_pressed}, new int[0]};
    public final FrameLayout A;
    public final Rect A0;
    public final u B;
    public final RectF B0;
    public final n C;
    public Typeface C0;
    public final int D;
    public ColorDrawable D0;
    public EditText E;
    public int E0;
    public CharSequence F;
    public final LinkedHashSet F0;
    public int G;
    public ColorDrawable G0;
    public int H;
    public int H0;
    public int I;
    public Drawable I0;
    public int J;
    public ColorStateList J0;
    public final q K;
    public ColorStateList K0;
    public boolean L;
    public int L0;
    public int M;
    public int M0;
    public boolean N;
    public int N0;
    public x O;
    public ColorStateList O0;
    public v0 P;
    public int P0;
    public int Q;
    public int Q0;
    public int R;
    public int R0;
    public CharSequence S;
    public int S0;
    public boolean T;
    public int T0;
    public v0 U;
    public int U0;
    public ColorStateList V;
    public boolean V0;
    public int W;
    public final b W0;
    public boolean X0;
    public boolean Y0;
    public ValueAnimator Z0;

    public h f4201a0;

    public boolean f4202a1;

    public h f4203b0;

    public boolean f4204b1;

    public ColorStateList f4205c0;

    public boolean f4206c1;

    public ColorStateList f4207d0;

    public ColorStateList f4208e0;

    public ColorStateList f4209f0;

    public boolean f4210g0;

    public CharSequence f4211h0;

    public boolean f4212i0;

    public i f4213j0;

    public i f4214k0;

    public StateListDrawable f4215l0;

    public boolean f4216m0;

    public i f4217n0;

    public i f4218o0;

    public m f4219p0;

    public boolean f4220q0;

    public final int f4221r0;

    public int f4222s0;

    public int f4223t0;

    public int f4224u0;

    public int f4225v0;

    public int f4226w0;

    public int f4227x0;

    public int f4228y0;

    public final Rect f4229z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 2130969991, 2131952635), attributeSet, 2130969991);
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = new q(this);
        this.O = new k(3);
        this.f4229z0 = new Rect();
        this.A0 = new Rect();
        this.B0 = new RectF();
        this.F0 = new LinkedHashSet();
        b bVar = new b(this);
        this.W0 = bVar;
        this.f4206c1 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.A = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = ag.a.f465a;
        bVar.R = linearInterpolator;
        bVar.j(false);
        bVar.Q = linearInterpolator;
        bVar.j(false);
        if (bVar.f11268g != 8388659) {
            bVar.f11268g = 8388659;
            bVar.j(false);
        }
        j.a(context2, attributeSet, 2130969991, 2131952635);
        int[] iArr = zf.a.D;
        j.b(context2, attributeSet, iArr, 2130969991, 2131952635, 22, 20, 40, 45, 50);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130969991, 2131952635);
        x0 x0Var = new x0(context2, typedArrayObtainStyledAttributes);
        u uVar = new u(this, x0Var);
        this.B = uVar;
        this.f4210g0 = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.Y0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.X0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f4219p0 = m.b(context2, attributeSet, 2130969991, 2131952635).a();
        this.f4221r0 = context2.getResources().getDimensionPixelOffset(2131166275);
        this.f4223t0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.D = getResources().getDimensionPixelSize(2131165896);
        this.f4225v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(2131166276));
        this.f4226w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(2131166277));
        this.f4224u0 = this.f4225v0;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        l lVarF = this.f4219p0.f();
        if (dimension >= 0.0f) {
            lVarF.f14174e = new sg.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            lVarF.f14175f = new sg.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            lVarF.f14176g = new sg.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            lVarF.f14177h = new sg.a(dimension4);
        }
        this.f4219p0 = lVarF.a();
        ColorStateList colorStateListK = g4.K(context2, x0Var, 7);
        if (colorStateListK != null) {
            int defaultColor = colorStateListK.getDefaultColor();
            this.P0 = defaultColor;
            this.f4228y0 = defaultColor;
            if (colorStateListK.isStateful()) {
                this.Q0 = colorStateListK.getColorForState(new int[]{-16842910}, -1);
                this.R0 = colorStateListK.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.S0 = colorStateListK.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.R0 = this.P0;
                ColorStateList colorStateListB = n4.b.b(context2, 2131100642);
                this.Q0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.S0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f4228y0 = 0;
            this.P0 = 0;
            this.Q0 = 0;
            this.R0 = 0;
            this.S0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListT = x0Var.t(1);
            this.K0 = colorStateListT;
            this.J0 = colorStateListT;
        }
        ColorStateList colorStateListK2 = g4.K(context2, x0Var, 14);
        this.N0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.L0 = context2.getColor(2131100669);
        this.T0 = context2.getColor(2131100670);
        this.M0 = context2.getColor(2131100673);
        if (colorStateListK2 != null) {
            setBoxStrokeColorStateList(colorStateListK2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(g4.K(context2, x0Var, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(50, 0));
        }
        this.f4208e0 = x0Var.t(24);
        this.f4209f0 = x0Var.t(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i10 = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(57);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.R = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.Q = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i10);
        setCounterOverflowTextAppearance(this.Q);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.R);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(x0Var.t(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(x0Var.t(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(51)) {
            setHintTextColor(x0Var.t(51));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(x0Var.t(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(x0Var.t(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(x0Var.t(59));
        }
        n nVar = new n(this, x0Var);
        this.C = nVar;
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(typedArrayObtainStyledAttributes.getInt(49, 1));
        x0Var.O();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(uVar);
        frameLayout.addView(nVar);
        addView(frameLayout);
        setEnabled(z13);
        setHelperTextEnabled(z11);
        setErrorEnabled(z10);
        setCounterEnabled(z12);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.E;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.f4213j0;
        }
        int iE0 = a0.e0(this.E, 2130968895);
        int i10 = this.f4222s0;
        int[][] iArr = f4200d1;
        if (i10 != 2) {
            if (i10 != 1) {
                return null;
            }
            i iVar = this.f4213j0;
            int i11 = this.f4228y0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{a0.k0(0.1f, iE0, i11), i11}), iVar, iVar);
        }
        Context context = getContext();
        i iVar2 = this.f4213j0;
        TypedValue typedValueP = z3.P(2130968937, context, "TextInputLayout");
        int i12 = typedValueP.resourceId;
        int color = i12 != 0 ? context.getColor(i12) : typedValueP.data;
        i iVar3 = new i(iVar2.B.f14150a);
        int iK0 = a0.k0(0.1f, iE0, color);
        iVar3.m(new ColorStateList(iArr, new int[]{iK0, 0}));
        iVar3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iK0, color});
        i iVar4 = new i(iVar2.B.f14150a);
        iVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, iVar3, iVar4), iVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f4215l0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f4215l0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f4215l0.addState(new int[0], h(false));
        }
        return this.f4215l0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f4214k0 == null) {
            this.f4214k0 = h(true);
        }
        return this.f4214k0;
    }

    public static void m(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z10);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.E != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.E = editText;
        int i10 = this.G;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.I);
        }
        int i11 = this.H;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.J);
        }
        this.f4216m0 = false;
        k();
        setTextInputAccessibilityDelegate(new w(this));
        Typeface typeface = this.E.getTypeface();
        b bVar = this.W0;
        bVar.n(typeface);
        float textSize = this.E.getTextSize();
        if (bVar.f11270h != textSize) {
            bVar.f11270h = textSize;
            bVar.j(false);
        }
        float letterSpacing = this.E.getLetterSpacing();
        if (bVar.X != letterSpacing) {
            bVar.X = letterSpacing;
            bVar.j(false);
        }
        int gravity = this.E.getGravity();
        int i12 = (gravity & (-113)) | 48;
        if (bVar.f11268g != i12) {
            bVar.f11268g = i12;
            bVar.j(false);
        }
        if (bVar.f11266f != gravity) {
            bVar.f11266f = gravity;
            bVar.j(false);
        }
        this.U0 = editText.getMinimumHeight();
        this.E.addTextChangedListener(new v(this, editText));
        if (this.J0 == null) {
            this.J0 = this.E.getHintTextColors();
        }
        if (this.f4210g0) {
            if (TextUtils.isEmpty(this.f4211h0)) {
                CharSequence hint = this.E.getHint();
                this.F = hint;
                setHint(hint);
                this.E.setHint((CharSequence) null);
            }
            this.f4212i0 = true;
        }
        r();
        if (this.P != null) {
            p(this.E.getText());
        }
        t();
        this.K.b();
        this.B.bringToFront();
        n nVar = this.C;
        nVar.bringToFront();
        Iterator it = this.F0.iterator();
        while (it.hasNext()) {
            ((vg.m) it.next()).a(this);
        }
        nVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f4211h0)) {
            return;
        }
        this.f4211h0 = charSequence;
        b bVar = this.W0;
        if (charSequence == null || !TextUtils.equals(bVar.B, charSequence)) {
            bVar.B = charSequence;
            bVar.C = null;
            bVar.j(false);
        }
        if (this.V0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.T == z10) {
            return;
        }
        if (z10) {
            v0 v0Var = this.U;
            if (v0Var != null) {
                this.A.addView(v0Var);
                this.U.setVisibility(0);
            }
        } else {
            v0 v0Var2 = this.U;
            if (v0Var2 != null) {
                v0Var2.setVisibility(8);
            }
            this.U = null;
        }
        this.T = z10;
    }

    public final void a() {
        if (this.E == null || this.f4222s0 != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.E;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.W0.f() + this.D), this.E.getPaddingEnd(), getResources().getDimensionPixelSize(2131166056));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.E;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(2131166059), this.E.getPaddingEnd(), getResources().getDimensionPixelSize(2131166058));
        } else if (g4.Q(getContext())) {
            EditText editText3 = this.E;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(2131166057), this.E.getPaddingEnd(), getResources().getDimensionPixelSize(2131166056));
        }
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.A;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f3) {
        b bVar = this.W0;
        if (bVar.f11258b == f3) {
            return;
        }
        if (this.Z0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.Z0 = valueAnimator;
            valueAnimator.setInterpolator(d.Q(getContext(), 2130969594, ag.a.f466b));
            this.Z0.setDuration(d.P(getContext(), 2130969584, 167));
            this.Z0.addUpdateListener(new ba.k(this, 3));
        }
        this.Z0.setFloatValues(bVar.f11258b, f3);
        this.Z0.start();
    }

    public final void c() {
        int i10;
        int i11;
        i iVar = this.f4213j0;
        if (iVar == null) {
            return;
        }
        m mVar = iVar.B.f14150a;
        m mVar2 = this.f4219p0;
        if (mVar != mVar2) {
            iVar.setShapeAppearanceModel(mVar2);
        }
        if (this.f4222s0 == 2 && (i10 = this.f4224u0) > -1 && (i11 = this.f4227x0) != 0) {
            i iVar2 = this.f4213j0;
            iVar2.B.f14160k = i10;
            iVar2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i11);
            g gVar = iVar2.B;
            if (gVar.f14154e != colorStateListValueOf) {
                gVar.f14154e = colorStateListValueOf;
                iVar2.onStateChange(iVar2.getState());
            }
        }
        int iF = this.f4228y0;
        if (this.f4222s0 == 1) {
            iF = q4.a.f(this.f4228y0, a0.d0(getContext(), 2130968937, 0));
        }
        this.f4228y0 = iF;
        this.f4213j0.m(ColorStateList.valueOf(iF));
        i iVar3 = this.f4217n0;
        if (iVar3 != null && this.f4218o0 != null) {
            if (this.f4224u0 > -1 && this.f4227x0 != 0) {
                iVar3.m(this.E.isFocused() ? ColorStateList.valueOf(this.L0) : ColorStateList.valueOf(this.f4227x0));
                this.f4218o0.m(ColorStateList.valueOf(this.f4227x0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.E == null) {
            throw new IllegalStateException();
        }
        boolean z10 = getLayoutDirection() == 1;
        int i10 = rect.bottom;
        Rect rect2 = this.A0;
        rect2.bottom = i10;
        int i11 = this.f4222s0;
        if (i11 == 1) {
            rect2.left = i(rect.left, z10);
            rect2.top = rect.top + this.f4223t0;
            rect2.right = j(rect.right, z10);
            return rect2;
        }
        if (i11 != 2) {
            rect2.left = i(rect.left, z10);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z10);
            return rect2;
        }
        rect2.left = this.E.getPaddingLeft() + rect.left;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.E.getPaddingRight();
        return rect2;
    }

    @Override
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.E;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.F != null) {
            boolean z10 = this.f4212i0;
            this.f4212i0 = false;
            CharSequence hint = editText.getHint();
            this.E.setHint(this.F);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.E.setHint(hint);
                this.f4212i0 = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        FrameLayout frameLayout = this.A;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i11 = 0; i11 < frameLayout.getChildCount(); i11++) {
            View childAt = frameLayout.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.E) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f4204b1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f4204b1 = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        i iVar;
        super.draw(canvas);
        boolean z10 = this.f4210g0;
        b bVar = this.W0;
        if (z10) {
            TextPaint textPaint = bVar.O;
            RectF rectF = bVar.f11264e;
            int iSave = canvas.save();
            if (bVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(bVar.G);
                float f3 = bVar.f11281q;
                float f10 = bVar.f11282r;
                float f11 = bVar.F;
                if (f11 != 1.0f) {
                    canvas.scale(f11, f11, f3, f10);
                }
                if ((bVar.f11265e0 > 1 || bVar.f11267f0 > 1) && !bVar.D && bVar.o()) {
                    float lineStart = bVar.f11281q - bVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas.translate(lineStart, f10);
                    float f12 = alpha;
                    textPaint.setAlpha((int) (bVar.f11261c0 * f12));
                    float f13 = bVar.H;
                    float f14 = bVar.I;
                    float f15 = bVar.J;
                    int i10 = bVar.K;
                    textPaint.setShadowLayer(f13, f14, f15, q4.a.h(i10, (Color.alpha(i10) * textPaint.getAlpha()) / 255));
                    bVar.Z.draw(canvas);
                    textPaint.setAlpha((int) (bVar.f11259b0 * f12));
                    float f16 = bVar.H;
                    float f17 = bVar.I;
                    float f18 = bVar.J;
                    int i11 = bVar.K;
                    textPaint.setShadowLayer(f16, f17, f18, q4.a.h(i11, (Color.alpha(i11) * textPaint.getAlpha()) / 255));
                    int lineBaseline = bVar.Z.getLineBaseline(0);
                    CharSequence charSequence = bVar.f11263d0;
                    float f19 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f19, textPaint);
                    textPaint.setShadowLayer(bVar.H, bVar.I, bVar.J, bVar.K);
                    String strTrim = bVar.f11263d0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(bVar.Z.getLineEnd(0), str.length()), 0.0f, f19, (Paint) textPaint);
                    canvas = canvas;
                } else {
                    canvas.translate(f3, f10);
                    bVar.Z.draw(canvas);
                }
                canvas.restoreToCount(iSave);
            }
        }
        if (this.f4218o0 == null || (iVar = this.f4217n0) == null) {
            return;
        }
        iVar.draw(canvas);
        if (this.E.isFocused()) {
            Rect bounds = this.f4218o0.getBounds();
            Rect bounds2 = this.f4217n0.getBounds();
            float f20 = bVar.f11258b;
            int iCenterX = bounds2.centerX();
            bounds.left = ag.a.c(f20, iCenterX, bounds2.left);
            bounds.right = ag.a.c(f20, iCenterX, bounds2.right);
            this.f4218o0.draw(canvas);
        }
    }

    @Override
    public final void drawableStateChanged() {
        boolean z10;
        ColorStateList colorStateList;
        if (this.f4202a1) {
            return;
        }
        this.f4202a1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        b bVar = this.W0;
        if (bVar != null) {
            bVar.M = drawableState;
            ColorStateList colorStateList2 = bVar.f11276k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = bVar.f11274j) == null || !colorStateList.isStateful())) {
                z10 = false;
            } else {
                bVar.j(false);
                z10 = true;
            }
        } else {
            z10 = false;
        }
        if (this.E != null) {
            w(isLaidOut() && isEnabled(), false);
        }
        t();
        z();
        if (z10) {
            invalidate();
        }
        this.f4202a1 = false;
    }

    public final int e() {
        if (this.f4210g0) {
            int i10 = this.f4222s0;
            b bVar = this.W0;
            if (i10 == 0) {
                return (int) bVar.f();
            }
            if (i10 == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (bVar.f() / 2.0f);
                }
                float f3 = bVar.f();
                TextPaint textPaint = bVar.P;
                textPaint.setTextSize(bVar.f11272i);
                textPaint.setTypeface(bVar.f11283s);
                textPaint.setLetterSpacing(bVar.W);
                return Math.max(0, (int) (f3 - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final h f() {
        h hVar = new h();
        hVar.C = d.P(getContext(), 2130969586, 87);
        hVar.D = d.Q(getContext(), 2130969596, ag.a.f465a);
        return hVar;
    }

    public final boolean g() {
        return this.f4210g0 && !TextUtils.isEmpty(this.f4211h0) && (this.f4213j0 instanceof vg.g);
    }

    @Override
    public int getBaseline() {
        EditText editText = this.E;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public i getBoxBackground() {
        int i10 = this.f4222s0;
        if (i10 == 1 || i10 == 2) {
            return this.f4213j0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f4228y0;
    }

    public int getBoxBackgroundMode() {
        return this.f4222s0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f4223t0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.B0;
        return layoutDirection == 1 ? this.f4219p0.f14188h.a(rectF) : this.f4219p0.f14187g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.B0;
        return layoutDirection == 1 ? this.f4219p0.f14187g.a(rectF) : this.f4219p0.f14188h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.B0;
        return layoutDirection == 1 ? this.f4219p0.f14185e.a(rectF) : this.f4219p0.f14186f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.B0;
        return layoutDirection == 1 ? this.f4219p0.f14186f.a(rectF) : this.f4219p0.f14185e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.N0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.O0;
    }

    public int getBoxStrokeWidth() {
        return this.f4225v0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f4226w0;
    }

    public int getCounterMaxLength() {
        return this.M;
    }

    public CharSequence getCounterOverflowDescription() {
        v0 v0Var;
        if (this.L && this.N && (v0Var = this.P) != null) {
            return v0Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f4207d0;
    }

    public ColorStateList getCounterTextColor() {
        return this.f4205c0;
    }

    public ColorStateList getCursorColor() {
        return this.f4208e0;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f4209f0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.J0;
    }

    public EditText getEditText() {
        return this.E;
    }

    public CharSequence getEndIconContentDescription() {
        return this.C.G.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.C.G.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.C.M;
    }

    public int getEndIconMode() {
        return this.C.I;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.C.N;
    }

    public CheckableImageButton getEndIconView() {
        return this.C.G;
    }

    public CharSequence getError() {
        q qVar = this.K;
        if (qVar.f15685q) {
            return qVar.f15684p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.K.f15688t;
    }

    public CharSequence getErrorContentDescription() {
        return this.K.f15687s;
    }

    public int getErrorCurrentTextColors() {
        v0 v0Var = this.K.f15686r;
        if (v0Var != null) {
            return v0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.C.C.getDrawable();
    }

    public CharSequence getHelperText() {
        q qVar = this.K;
        if (qVar.f15692x) {
            return qVar.f15691w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        v0 v0Var = this.K.f15693y;
        if (v0Var != null) {
            return v0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f4210g0) {
            return this.f4211h0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.W0.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.W0;
        return bVar.g(bVar.f11276k);
    }

    public int getHintMaxLines() {
        return this.W0.f11265e0;
    }

    public ColorStateList getHintTextColor() {
        return this.K0;
    }

    public x getLengthCounter() {
        return this.O;
    }

    public int getMaxEms() {
        return this.H;
    }

    public int getMaxWidth() {
        return this.J;
    }

    public int getMinEms() {
        return this.G;
    }

    public int getMinWidth() {
        return this.I;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.C.G.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.C.G.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.T) {
            return this.S;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.W;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.V;
    }

    public CharSequence getPrefixText() {
        return this.B.C;
    }

    public ColorStateList getPrefixTextColor() {
        return this.B.B.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.B.B;
    }

    public m getShapeAppearanceModel() {
        return this.f4219p0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.B.D.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.B.D.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.B.G;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.B.H;
    }

    public CharSequence getSuffixText() {
        return this.C.P;
    }

    public ColorStateList getSuffixTextColor() {
        return this.C.Q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.C.Q;
    }

    public Typeface getTypeface() {
        return this.C0;
    }

    public final i h(boolean z10) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(2131166249);
        float f3 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.E;
        float popupElevation = editText instanceof s ? ((s) editText).getPopupElevation() : getResources().getDimensionPixelOffset(2131165714);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(2131166186);
        sg.k kVar = new sg.k();
        sg.k kVar2 = new sg.k();
        sg.k kVar3 = new sg.k();
        sg.k kVar4 = new sg.k();
        f fVar = new f();
        f fVar2 = new f();
        f fVar3 = new f();
        f fVar4 = new f();
        sg.a aVar = new sg.a(f3);
        sg.a aVar2 = new sg.a(f3);
        sg.a aVar3 = new sg.a(dimensionPixelOffset);
        sg.a aVar4 = new sg.a(dimensionPixelOffset);
        m mVar = new m();
        mVar.f14181a = kVar;
        mVar.f14182b = kVar2;
        mVar.f14183c = kVar3;
        mVar.f14184d = kVar4;
        mVar.f14185e = aVar;
        mVar.f14186f = aVar2;
        mVar.f14187g = aVar4;
        mVar.f14188h = aVar3;
        mVar.f14189i = fVar;
        mVar.f14190j = fVar2;
        mVar.f14191k = fVar3;
        mVar.l = fVar4;
        EditText editText2 = this.E;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof s ? ((s) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            sg.h[] hVarArr = i.f14166c0;
            TypedValue typedValueP = z3.P(2130968937, context, i.class.getSimpleName());
            int i10 = typedValueP.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i10 != 0 ? context.getColor(i10) : typedValueP.data);
        }
        i iVar = new i();
        iVar.j(context);
        iVar.m(dropDownBackgroundTintList);
        iVar.l(popupElevation);
        iVar.setShapeAppearanceModel(mVar);
        g gVar = iVar.B;
        if (gVar.f14157h == null) {
            gVar.f14157h = new Rect();
        }
        iVar.B.f14157h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        iVar.invalidateSelf();
        return iVar;
    }

    public final int i(int i10, boolean z10) {
        int compoundPaddingLeft;
        if (z10 || getPrefixText() == null) {
            compoundPaddingLeft = (!z10 || getSuffixText() == null) ? this.E.getCompoundPaddingLeft() : this.C.c();
        } else {
            compoundPaddingLeft = this.B.a();
        }
        return compoundPaddingLeft + i10;
    }

    public final int j(int i10, boolean z10) {
        int compoundPaddingRight;
        if (z10 || getSuffixText() == null) {
            compoundPaddingRight = (!z10 || getPrefixText() == null) ? this.E.getCompoundPaddingRight() : this.B.a();
        } else {
            compoundPaddingRight = this.C.c();
        }
        return i10 - compoundPaddingRight;
    }

    public final void k() {
        int i10 = this.f4222s0;
        if (i10 == 0) {
            this.f4213j0 = null;
            this.f4217n0 = null;
            this.f4218o0 = null;
        } else if (i10 == 1) {
            this.f4213j0 = new i(this.f4219p0);
            this.f4217n0 = new i();
            this.f4218o0 = new i();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(c.g(this.f4222s0, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
            }
            if (!this.f4210g0 || (this.f4213j0 instanceof vg.g)) {
                this.f4213j0 = new i(this.f4219p0);
            } else {
                m mVar = this.f4219p0;
                int i11 = vg.g.f15650e0;
                if (mVar == null) {
                    mVar = new m();
                }
                vg.f fVar = new vg.f(mVar, new RectF());
                vg.g gVar = new vg.g(fVar);
                gVar.f15651d0 = fVar;
                this.f4213j0 = gVar;
            }
            this.f4217n0 = null;
            this.f4218o0 = null;
        }
        u();
        z();
        if (this.f4222s0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f4223t0 = getResources().getDimensionPixelSize(2131166061);
            } else if (g4.Q(getContext())) {
                this.f4223t0 = getResources().getDimensionPixelSize(2131166060);
            }
        }
        a();
        if (this.f4222s0 != 0) {
            v();
        }
        EditText editText = this.E;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i12 = this.f4222s0;
                if (i12 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i12 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void l() {
        float f3;
        float f10;
        float f11;
        RectF rectF;
        float f12;
        float lineWidth;
        int i10;
        float f13;
        int i11;
        if (g()) {
            int width = this.E.getWidth();
            int gravity = this.E.getGravity();
            b bVar = this.W0;
            boolean zC = bVar.c(bVar.B);
            bVar.D = zC;
            Rect rect = bVar.f11262d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zC) {
                        i11 = rect.left;
                        f11 = i11;
                    } else {
                        f3 = rect.right;
                        f10 = bVar.f11257a0;
                    }
                } else if (zC) {
                    f3 = rect.right;
                    f10 = bVar.f11257a0;
                } else {
                    i11 = rect.left;
                    f11 = i11;
                }
                float fMax = Math.max(f11, rect.left);
                rectF = this.B0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f12 = (width / 2.0f) + (bVar.f11257a0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (bVar.D) {
                        f13 = bVar.f11257a0;
                        f12 = f13 + fMax;
                    } else {
                        i10 = rect.right;
                        f12 = i10;
                    }
                } else if (bVar.D) {
                    i10 = rect.right;
                    f12 = i10;
                } else {
                    f13 = bVar.f11257a0;
                    f12 = f13 + fMax;
                }
                rectF.right = Math.min(f12, rect.right);
                rectF.bottom = bVar.f() + rect.top;
                if (bVar.Z != null && !bVar.o()) {
                    StaticLayout staticLayout = bVar.Z;
                    lineWidth = (bVar.f11272i / bVar.f11270h) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (bVar.D) {
                        rectF.left = rectF.right - lineWidth;
                    } else {
                        rectF.right = rectF.left + lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f14 = rectF.left;
                float f15 = this.f4221r0;
                rectF.left = f14 - f15;
                rectF.right += f15;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f4224u0);
                rectF.top = 0.0f;
                vg.g gVar = (vg.g) this.f4213j0;
                gVar.getClass();
                gVar.s(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f3 = width / 2.0f;
            f10 = bVar.f11257a0 / 2.0f;
            f11 = f3 - f10;
            float fMax2 = Math.max(f11, rect.left);
            rectF = this.B0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f12 = (width / 2.0f) + (bVar.f11257a0 / 2.0f);
            } else {
                f12 = (width / 2.0f) + (bVar.f11257a0 / 2.0f);
            }
            rectF.right = Math.min(f12, rect.right);
            rectF.bottom = bVar.f() + rect.top;
            if (bVar.Z != null) {
                StaticLayout staticLayout2 = bVar.Z;
                lineWidth = (bVar.f11272i / bVar.f11270h) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (bVar.D) {
                    rectF.left = rectF.right - lineWidth;
                } else {
                    rectF.right = rectF.left + lineWidth;
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void n(v0 v0Var, int i10) {
        try {
            v0Var.setTextAppearance(i10);
            if (v0Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        v0Var.setTextAppearance(2131952146);
        v0Var.setTextColor(getContext().getColor(2131099761));
    }

    public final boolean o() {
        q qVar = this.K;
        return (qVar.f15683o != 1 || qVar.f15686r == null || TextUtils.isEmpty(qVar.f15684p)) ? false : true;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.W0.i(configuration);
    }

    @Override
    public final void onGlobalLayout() {
        int iMax;
        n nVar = this.C;
        nVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z10 = false;
        this.f4206c1 = false;
        if (this.E != null && this.E.getMeasuredHeight() < (iMax = Math.max(nVar.getMeasuredHeight(), this.B.getMeasuredHeight()))) {
            this.E.setMinimumHeight(iMax);
            z10 = true;
        }
        boolean zS = s();
        if (z10 || zS) {
            this.E.post(new m9.f(this, 19));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float fDescent;
        int i14;
        int compoundPaddingTop;
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.E;
        if (editText != null) {
            Rect rect = this.f4229z0;
            ng.c.a(this, editText, rect);
            i iVar = this.f4217n0;
            if (iVar != null) {
                int i15 = rect.bottom;
                iVar.setBounds(rect.left, i15 - this.f4225v0, rect.right, i15);
            }
            i iVar2 = this.f4218o0;
            if (iVar2 != null) {
                int i16 = rect.bottom;
                iVar2.setBounds(rect.left, i16 - this.f4226w0, rect.right, i16);
            }
            if (this.f4210g0) {
                float textSize = this.E.getTextSize();
                b bVar = this.W0;
                float f3 = bVar.f11270h;
                TextPaint textPaint = bVar.P;
                if (f3 != textSize) {
                    bVar.f11270h = textSize;
                    bVar.j(false);
                }
                int gravity = this.E.getGravity();
                int i17 = (gravity & (-113)) | 48;
                if (bVar.f11268g != i17) {
                    bVar.f11268g = i17;
                    bVar.j(false);
                }
                if (bVar.f11266f != gravity) {
                    bVar.f11266f = gravity;
                    bVar.j(false);
                }
                Rect rectD = d(rect);
                int i18 = rectD.left;
                int i19 = rectD.top;
                int i20 = rectD.right;
                int i21 = rectD.bottom;
                Rect rect2 = bVar.f11262d;
                if (rect2.left != i18 || rect2.top != i19 || rect2.right != i20 || rect2.bottom != i21) {
                    rect2.set(i18, i19, i20, i21);
                    bVar.N = true;
                }
                if (this.E == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(bVar.f11270h);
                    textPaint.setTypeface(bVar.f11286v);
                    textPaint.setLetterSpacing(bVar.X);
                    fDescent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(bVar.f11270h);
                    textPaint.setTypeface(bVar.f11286v);
                    textPaint.setLetterSpacing(bVar.X);
                    fDescent = bVar.l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.E.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.A0;
                rect3.left = compoundPaddingLeft;
                if (this.f4222s0 != 1 || this.E.getMinLines() > 1) {
                    if (this.f4222s0 != 0 || getHintMaxLines() == 1) {
                        i14 = 0;
                    } else {
                        textPaint.setTextSize(bVar.f11270h);
                        textPaint.setTypeface(bVar.f11286v);
                        textPaint.setLetterSpacing(bVar.X);
                        i14 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.E.getCompoundPaddingTop() + rect.top) - i14;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.E.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f4222s0 != 1 || this.E.getMinLines() > 1) ? rect.bottom - this.E.getCompoundPaddingBottom() : (int) (rect3.top + fDescent);
                rect3.bottom = compoundPaddingBottom;
                int i22 = rect3.left;
                int i23 = rect3.top;
                int i24 = rect3.right;
                Rect rect4 = bVar.f11260c;
                if (rect4.left != i22 || rect4.top != i23 || rect4.right != i24 || rect4.bottom != compoundPaddingBottom || true != bVar.f11277k0) {
                    rect4.set(i22, i23, i24, compoundPaddingBottom);
                    bVar.N = true;
                    bVar.f11277k0 = true;
                }
                bVar.j(false);
                if (!g() || this.V0) {
                    return;
                }
                l();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f3;
        EditText editText;
        super.onMeasure(i10, i11);
        boolean z10 = this.f4206c1;
        n nVar = this.C;
        if (!z10) {
            nVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f4206c1 = true;
        }
        if (this.U != null && (editText = this.E) != null) {
            this.U.setGravity(editText.getGravity());
            this.U.setPadding(this.E.getCompoundPaddingLeft(), this.E.getCompoundPaddingTop(), this.E.getCompoundPaddingRight(), this.E.getCompoundPaddingBottom());
        }
        nVar.m();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.E.getMeasuredWidth() - this.E.getCompoundPaddingLeft()) - this.E.getCompoundPaddingRight();
        b bVar = this.W0;
        TextPaint textPaint = bVar.P;
        textPaint.setTextSize(bVar.f11272i);
        textPaint.setTypeface(bVar.f11283s);
        textPaint.setLetterSpacing(bVar.W);
        float f10 = measuredWidth;
        bVar.f11273i0 = bVar.e(bVar.f11267f0, textPaint, bVar.B, (bVar.f11272i / bVar.f11270h) * f10, bVar.D).getHeight();
        textPaint.setTextSize(bVar.f11270h);
        textPaint.setTypeface(bVar.f11286v);
        textPaint.setLetterSpacing(bVar.X);
        bVar.f11275j0 = bVar.e(bVar.f11265e0, textPaint, bVar.B, f10, bVar.D).getHeight();
        EditText editText2 = this.E;
        Rect rect = this.f4229z0;
        ng.c.a(this, editText2, rect);
        Rect rectD = d(rect);
        int i12 = rectD.left;
        int i13 = rectD.top;
        int i14 = rectD.right;
        int i15 = rectD.bottom;
        Rect rect2 = bVar.f11262d;
        if (rect2.left != i12 || rect2.top != i13 || rect2.right != i14 || rect2.bottom != i15) {
            rect2.set(i12, i13, i14, i15);
            bVar.N = true;
        }
        v();
        a();
        if (this.E == null) {
            return;
        }
        int i16 = bVar.f11275j0;
        if (i16 != -1) {
            f3 = i16;
        } else {
            TextPaint textPaint2 = bVar.P;
            textPaint2.setTextSize(bVar.f11270h);
            textPaint2.setTypeface(bVar.f11286v);
            textPaint2.setLetterSpacing(bVar.X);
            f3 = -textPaint2.ascent();
        }
        float height = 0.0f;
        if (this.S != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.U.getPaint());
            textPaint3.setTextSize(this.U.getTextSize());
            textPaint3.setTypeface(this.U.getTypeface());
            textPaint3.setLetterSpacing(this.U.getLetterSpacing());
            try {
                ng.f fVar = new ng.f(this.S, textPaint3, measuredWidth);
                fVar.f11303k = getLayoutDirection() == 1;
                fVar.f11302j = true;
                float lineSpacingExtra = this.U.getLineSpacingExtra();
                float lineSpacingMultiplier = this.U.getLineSpacingMultiplier();
                fVar.f11299g = lineSpacingExtra;
                fVar.f11300h = lineSpacingMultiplier;
                fVar.m = new t(this, 26);
                height = fVar.a().getHeight() + (this.f4222s0 == 1 ? bVar.f() + this.f4223t0 + this.D : 0.0f);
            } catch (StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException e3) {
                Log.e("TextInputLayout", e3.getCause().getMessage(), e3);
            }
        }
        float fMax = Math.max(f3, height);
        if (this.E.getMeasuredHeight() < fMax) {
            this.E.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        super.onRestoreInstanceState(yVar.A);
        setError(yVar.C);
        if (yVar.D) {
            post(new a50.d(this, 27));
        }
        requestLayout();
    }

    @Override
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 1;
        if (z10 != this.f4220q0) {
            sg.d dVar = this.f4219p0.f14185e;
            RectF rectF = this.B0;
            float fA = dVar.a(rectF);
            float fA2 = this.f4219p0.f14186f.a(rectF);
            float fA3 = this.f4219p0.f14188h.a(rectF);
            float fA4 = this.f4219p0.f14187g.a(rectF);
            m mVar = this.f4219p0;
            s0 s0Var = mVar.f14181a;
            s0 s0Var2 = mVar.f14182b;
            s0 s0Var3 = mVar.f14184d;
            s0 s0Var4 = mVar.f14183c;
            f fVar = new f();
            f fVar2 = new f();
            f fVar3 = new f();
            f fVar4 = new f();
            sg.a aVar = new sg.a(fA2);
            sg.a aVar2 = new sg.a(fA);
            sg.a aVar3 = new sg.a(fA4);
            sg.a aVar4 = new sg.a(fA3);
            m mVar2 = new m();
            mVar2.f14181a = s0Var2;
            mVar2.f14182b = s0Var;
            mVar2.f14183c = s0Var3;
            mVar2.f14184d = s0Var4;
            mVar2.f14185e = aVar;
            mVar2.f14186f = aVar2;
            mVar2.f14187g = aVar4;
            mVar2.f14188h = aVar3;
            mVar2.f14189i = fVar;
            mVar2.f14190j = fVar2;
            mVar2.f14191k = fVar3;
            mVar2.l = fVar4;
            this.f4220q0 = z10;
            setShapeAppearanceModel(mVar2);
        }
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        y yVar = new y(super.onSaveInstanceState());
        if (o()) {
            yVar.C = getError();
        }
        n nVar = this.C;
        yVar.D = nVar.I != 0 && nVar.G.D;
        return yVar;
    }

    public final void p(Editable editable) {
        ((k) this.O).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z10 = this.N;
        int i10 = this.M;
        if (i10 == -1) {
            this.P.setText(String.valueOf(length));
            this.P.setContentDescription(null);
            this.N = false;
        } else {
            this.N = length > i10;
            Context context = getContext();
            this.P.setContentDescription(context.getString(this.N ? 2131886330 : 2131886329, Integer.valueOf(length), Integer.valueOf(this.M)));
            if (z10 != this.N) {
                q();
            }
            String str = x4.b.f16439b;
            x4.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? x4.b.f16442e : x4.b.f16441d;
            v0 v0Var = this.P;
            String string = getContext().getString(2131886331, Integer.valueOf(length), Integer.valueOf(this.M));
            bVar.getClass();
            androidx.media3.common.q qVar = x4.f.f16449a;
            v0Var.setText(string != null ? bVar.c(string).toString() : null);
        }
        if (this.E == null || z10 == this.N) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        v0 v0Var = this.P;
        if (v0Var != null) {
            n(v0Var, this.N ? this.Q : this.R);
            if (!this.N && (colorStateList2 = this.f4205c0) != null) {
                this.P.setTextColor(colorStateList2);
            }
            if (!this.N || (colorStateList = this.f4207d0) == null) {
                return;
            }
            this.P.setTextColor(colorStateList);
        }
    }

    public final void r() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.f4208e0;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueN = z3.N(context, 2130968894);
            if (typedValueN != null) {
                int i10 = typedValueN.resourceId;
                if (i10 != 0) {
                    colorStateListValueOf = n4.b.b(context, i10);
                } else {
                    int i11 = typedValueN.data;
                    if (i11 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i11);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.E;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.E.getTextCursorDrawable().mutate();
        if ((o() || (this.P != null && this.N)) && (colorStateList = this.f4209f0) != null) {
            colorStateListValueOf = colorStateList;
        }
        drawableMutate.setTintList(colorStateListValueOf);
    }

    public final boolean s() {
        boolean z10;
        if (this.E == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z11 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            u uVar = this.B;
            if (uVar.getMeasuredWidth() > 0) {
                int measuredWidth = uVar.getMeasuredWidth() - this.E.getPaddingLeft();
                if (this.D0 == null || this.E0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.D0 = colorDrawable;
                    this.E0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.E.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.D0;
                if (drawable != colorDrawable2) {
                    this.E.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (this.D0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.E.getCompoundDrawablesRelative();
                this.E.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.D0 = null;
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (this.D0 != null) {
            Drawable[] compoundDrawablesRelative3 = this.E.getCompoundDrawablesRelative();
            this.E.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.D0 = null;
            z10 = true;
        } else {
            z10 = false;
        }
        n nVar = this.C;
        if ((nVar.e() || ((nVar.I != 0 && nVar.d()) || nVar.P != null)) && nVar.getMeasuredWidth() > 0) {
            int measuredWidth2 = nVar.Q.getMeasuredWidth() - this.E.getPaddingRight();
            if (nVar.e()) {
                checkableImageButton = nVar.C;
            } else if (nVar.I != 0 && nVar.d()) {
                checkableImageButton = nVar.G;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.E.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.G0;
            if (colorDrawable3 != null && this.H0 != measuredWidth2) {
                this.H0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.E.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.G0, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.G0 = colorDrawable4;
                this.H0 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.G0;
            if (drawable2 != colorDrawable5) {
                this.I0 = drawable2;
                this.E.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.G0 != null) {
            Drawable[] compoundDrawablesRelative5 = this.E.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.G0) {
                this.E.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.I0, compoundDrawablesRelative5[3]);
            } else {
                z11 = z10;
            }
            this.G0 = null;
            return z11;
        }
        return z10;
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f4228y0 != i10) {
            this.f4228y0 = i10;
            this.P0 = i10;
            this.R0 = i10;
            this.S0 = i10;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(getContext().getColor(i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.P0 = defaultColor;
        this.f4228y0 = defaultColor;
        this.Q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.R0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.S0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f4222s0) {
            return;
        }
        this.f4222s0 = i10;
        if (this.E != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f4223t0 = i10;
    }

    public void setBoxCornerFamily(int i10) {
        l lVarF = this.f4219p0.f();
        sg.d dVar = this.f4219p0.f14185e;
        lVarF.f14170a = rd.a.n(i10);
        lVarF.f14174e = dVar;
        sg.d dVar2 = this.f4219p0.f14186f;
        lVarF.f14171b = rd.a.n(i10);
        lVarF.f14175f = dVar2;
        sg.d dVar3 = this.f4219p0.f14188h;
        lVarF.f14173d = rd.a.n(i10);
        lVarF.f14177h = dVar3;
        sg.d dVar4 = this.f4219p0.f14187g;
        lVarF.f14172c = rd.a.n(i10);
        lVarF.f14176g = dVar4;
        this.f4219p0 = lVarF.a();
        c();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.N0 != i10) {
            this.N0 = i10;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.L0 = colorStateList.getDefaultColor();
            this.T0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.M0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.N0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.N0 != colorStateList.getDefaultColor()) {
            this.N0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.O0 != colorStateList) {
            this.O0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f4225v0 = i10;
        z();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f4226w0 = i10;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.L != z10) {
            q qVar = this.K;
            if (z10) {
                v0 v0Var = new v0(getContext(), null);
                this.P = v0Var;
                v0Var.setId(2131363086);
                Typeface typeface = this.C0;
                if (typeface != null) {
                    this.P.setTypeface(typeface);
                }
                this.P.setMaxLines(1);
                qVar.a(this.P, 2);
                ((ViewGroup.MarginLayoutParams) this.P.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(2131166278));
                q();
                if (this.P != null) {
                    EditText editText = this.E;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                qVar.g(this.P, 2);
                this.P = null;
            }
            this.L = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.M != i10) {
            if (i10 > 0) {
                this.M = i10;
            } else {
                this.M = -1;
            }
            if (!this.L || this.P == null) {
                return;
            }
            EditText editText = this.E;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.Q != i10) {
            this.Q = i10;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f4207d0 != colorStateList) {
            this.f4207d0 = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.R != i10) {
            this.R = i10;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f4205c0 != colorStateList) {
            this.f4205c0 = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f4208e0 != colorStateList) {
            this.f4208e0 = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f4209f0 != colorStateList) {
            this.f4209f0 = colorStateList;
            if (o() || (this.P != null && this.N)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.J0 = colorStateList;
        this.K0 = colorStateList;
        if (this.E != null) {
            w(false, false);
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        m(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.C.G.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.C.G.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        n nVar = this.C;
        CharSequence text = i10 != 0 ? nVar.getResources().getText(i10) : null;
        CheckableImageButton checkableImageButton = nVar.G;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.C.G;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i10) {
        n nVar = this.C;
        Drawable drawableF0 = i10 != 0 ? p30.f.f0(nVar.getContext(), i10) : null;
        TextInputLayout textInputLayout = nVar.A;
        CheckableImageButton checkableImageButton = nVar.G;
        checkableImageButton.setImageDrawable(drawableF0);
        if (drawableF0 != null) {
            a0.n(textInputLayout, checkableImageButton, nVar.K, nVar.L);
            a0.w0(textInputLayout, checkableImageButton, nVar.K);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        n nVar = this.C;
        TextInputLayout textInputLayout = nVar.A;
        CheckableImageButton checkableImageButton = nVar.G;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            a0.n(textInputLayout, checkableImageButton, nVar.K, nVar.L);
            a0.w0(textInputLayout, checkableImageButton, nVar.K);
        }
    }

    public void setEndIconMinSize(int i10) {
        n nVar = this.C;
        if (i10 < 0) {
            nVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != nVar.M) {
            nVar.M = i10;
            CheckableImageButton checkableImageButton = nVar.G;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
            CheckableImageButton checkableImageButton2 = nVar.C;
            checkableImageButton2.setMinimumWidth(i10);
            checkableImageButton2.setMinimumHeight(i10);
        }
    }

    public void setEndIconMode(int i10) {
        this.C.g(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        n nVar = this.C;
        CheckableImageButton checkableImageButton = nVar.G;
        View.OnLongClickListener onLongClickListener = nVar.O;
        checkableImageButton.setOnClickListener(onClickListener);
        a0.B0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        n nVar = this.C;
        nVar.O = onLongClickListener;
        CheckableImageButton checkableImageButton = nVar.G;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a0.B0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        n nVar = this.C;
        nVar.N = scaleType;
        nVar.G.setScaleType(scaleType);
        nVar.C.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        n nVar = this.C;
        if (nVar.K != colorStateList) {
            nVar.K = colorStateList;
            a0.n(nVar.A, nVar.G, colorStateList, nVar.L);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        n nVar = this.C;
        if (nVar.L != mode) {
            nVar.L = mode;
            a0.n(nVar.A, nVar.G, nVar.K, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        this.C.h(z10);
    }

    public void setError(CharSequence charSequence) {
        q qVar = this.K;
        if (!qVar.f15685q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            qVar.f();
            return;
        }
        qVar.c();
        qVar.f15684p = charSequence;
        qVar.f15686r.setText(charSequence);
        int i10 = qVar.f15682n;
        if (i10 != 1) {
            qVar.f15683o = 1;
        }
        qVar.i(i10, qVar.f15683o, qVar.h(qVar.f15686r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        q qVar = this.K;
        qVar.f15688t = i10;
        v0 v0Var = qVar.f15686r;
        if (v0Var != null) {
            v0Var.setAccessibilityLiveRegion(i10);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        q qVar = this.K;
        qVar.f15687s = charSequence;
        v0 v0Var = qVar.f15686r;
        if (v0Var != null) {
            v0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        q qVar = this.K;
        TextInputLayout textInputLayout = qVar.f15678h;
        if (qVar.f15685q == z10) {
            return;
        }
        qVar.c();
        if (z10) {
            v0 v0Var = new v0(qVar.f15677g, null);
            qVar.f15686r = v0Var;
            v0Var.setId(2131363087);
            qVar.f15686r.setTextAlignment(5);
            Typeface typeface = qVar.B;
            if (typeface != null) {
                qVar.f15686r.setTypeface(typeface);
            }
            int i10 = qVar.f15689u;
            qVar.f15689u = i10;
            v0 v0Var2 = qVar.f15686r;
            if (v0Var2 != null) {
                qVar.f15678h.n(v0Var2, i10);
            }
            ColorStateList colorStateList = qVar.f15690v;
            qVar.f15690v = colorStateList;
            v0 v0Var3 = qVar.f15686r;
            if (v0Var3 != null && colorStateList != null) {
                v0Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = qVar.f15687s;
            qVar.f15687s = charSequence;
            v0 v0Var4 = qVar.f15686r;
            if (v0Var4 != null) {
                v0Var4.setContentDescription(charSequence);
            }
            int i11 = qVar.f15688t;
            qVar.f15688t = i11;
            v0 v0Var5 = qVar.f15686r;
            if (v0Var5 != null) {
                v0Var5.setAccessibilityLiveRegion(i11);
            }
            qVar.f15686r.setVisibility(4);
            qVar.a(qVar.f15686r, 0);
        } else {
            qVar.f();
            qVar.g(qVar.f15686r, 0);
            qVar.f15686r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        qVar.f15685q = z10;
    }

    public void setErrorIconDrawable(int i10) {
        n nVar = this.C;
        nVar.i(i10 != 0 ? p30.f.f0(nVar.getContext(), i10) : null);
        a0.w0(nVar.A, nVar.C, nVar.D);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.C.i(drawable);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        n nVar = this.C;
        CheckableImageButton checkableImageButton = nVar.C;
        View.OnLongClickListener onLongClickListener = nVar.F;
        checkableImageButton.setOnClickListener(onClickListener);
        a0.B0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        n nVar = this.C;
        nVar.F = onLongClickListener;
        CheckableImageButton checkableImageButton = nVar.C;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a0.B0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        n nVar = this.C;
        if (nVar.D != colorStateList) {
            nVar.D = colorStateList;
            a0.n(nVar.A, nVar.C, colorStateList, nVar.E);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        n nVar = this.C;
        if (nVar.E != mode) {
            nVar.E = mode;
            a0.n(nVar.A, nVar.C, nVar.D, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        q qVar = this.K;
        qVar.f15689u = i10;
        v0 v0Var = qVar.f15686r;
        if (v0Var != null) {
            qVar.f15678h.n(v0Var, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        q qVar = this.K;
        qVar.f15690v = colorStateList;
        v0 v0Var = qVar.f15686r;
        if (v0Var == null || colorStateList == null) {
            return;
        }
        v0Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.X0 != z10) {
            this.X0 = z10;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        q qVar = this.K;
        if (zIsEmpty) {
            if (qVar.f15692x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!qVar.f15692x) {
            setHelperTextEnabled(true);
        }
        qVar.c();
        qVar.f15691w = charSequence;
        qVar.f15693y.setText(charSequence);
        int i10 = qVar.f15682n;
        if (i10 != 2) {
            qVar.f15683o = 2;
        }
        qVar.i(i10, qVar.f15683o, qVar.h(qVar.f15693y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        q qVar = this.K;
        qVar.A = colorStateList;
        v0 v0Var = qVar.f15693y;
        if (v0Var == null || colorStateList == null) {
            return;
        }
        v0Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        q qVar = this.K;
        TextInputLayout textInputLayout = qVar.f15678h;
        if (qVar.f15692x == z10) {
            return;
        }
        qVar.c();
        if (z10) {
            v0 v0Var = new v0(qVar.f15677g, null);
            qVar.f15693y = v0Var;
            v0Var.setId(2131363088);
            qVar.f15693y.setTextAlignment(5);
            Typeface typeface = qVar.B;
            if (typeface != null) {
                qVar.f15693y.setTypeface(typeface);
            }
            qVar.f15693y.setVisibility(4);
            qVar.f15693y.setAccessibilityLiveRegion(1);
            int i10 = qVar.f15694z;
            qVar.f15694z = i10;
            v0 v0Var2 = qVar.f15693y;
            if (v0Var2 != null) {
                v0Var2.setTextAppearance(i10);
            }
            ColorStateList colorStateList = qVar.A;
            qVar.A = colorStateList;
            v0 v0Var3 = qVar.f15693y;
            if (v0Var3 != null && colorStateList != null) {
                v0Var3.setTextColor(colorStateList);
            }
            qVar.a(qVar.f15693y, 1);
            qVar.f15693y.setAccessibilityDelegate(new p(qVar));
        } else {
            qVar.c();
            int i11 = qVar.f15682n;
            if (i11 == 2) {
                qVar.f15683o = 0;
            }
            qVar.i(i11, qVar.f15683o, qVar.h(qVar.f15693y, RuntimeVersion.SUFFIX));
            qVar.g(qVar.f15693y, 1);
            qVar.f15693y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        qVar.f15692x = z10;
    }

    public void setHelperTextTextAppearance(int i10) {
        q qVar = this.K;
        qVar.f15694z = i10;
        v0 v0Var = qVar.f15693y;
        if (v0Var != null) {
            v0Var.setTextAppearance(i10);
        }
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f4210g0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.Y0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f4210g0) {
            this.f4210g0 = z10;
            if (z10) {
                CharSequence hint = this.E.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f4211h0)) {
                        setHint(hint);
                    }
                    this.E.setHint((CharSequence) null);
                }
                this.f4212i0 = true;
            } else {
                this.f4212i0 = false;
                if (!TextUtils.isEmpty(this.f4211h0) && TextUtils.isEmpty(this.E.getHint())) {
                    this.E.setHint(this.f4211h0);
                }
                setHintInternal(null);
            }
            if (this.E != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i10) {
        b bVar = this.W0;
        if (i10 != bVar.f11267f0) {
            bVar.f11267f0 = i10;
            bVar.j(false);
        }
        if (i10 != bVar.f11265e0) {
            bVar.f11265e0 = i10;
            bVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i10) {
        b bVar = this.W0;
        TextInputLayout textInputLayout = bVar.f11256a;
        qg.d dVar = new qg.d(textInputLayout.getContext(), i10);
        ColorStateList colorStateList = dVar.f13001k;
        if (colorStateList != null) {
            bVar.f11276k = colorStateList;
        }
        float f3 = dVar.l;
        if (f3 != 0.0f) {
            bVar.f11272i = f3;
        }
        ColorStateList colorStateList2 = dVar.f12991a;
        if (colorStateList2 != null) {
            bVar.V = colorStateList2;
        }
        bVar.T = dVar.f12996f;
        bVar.U = dVar.f12997g;
        bVar.S = dVar.f12998h;
        bVar.W = dVar.f13000j;
        qg.a aVar = bVar.f11290z;
        if (aVar != null) {
            aVar.f12984d = true;
        }
        hf.c cVar = new hf.c(bVar, 25);
        dVar.a();
        bVar.f11290z = new qg.a(cVar, dVar.f13004p);
        dVar.b(textInputLayout.getContext(), bVar.f11290z);
        bVar.j(false);
        this.K0 = bVar.f11276k;
        if (this.E != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.K0 != colorStateList) {
            if (this.J0 == null) {
                b bVar = this.W0;
                if (bVar.f11276k != colorStateList) {
                    bVar.f11276k = colorStateList;
                    bVar.j(false);
                }
            }
            this.K0 = colorStateList;
            if (this.E != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(x xVar) {
        this.O = xVar;
    }

    public void setMaxEms(int i10) {
        this.H = i10;
        EditText editText = this.E;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.J = i10;
        EditText editText = this.E;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.G = i10;
        EditText editText = this.E;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.I = i10;
        EditText editText = this.E;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        n nVar = this.C;
        nVar.G.setContentDescription(i10 != 0 ? nVar.getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.C.G.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        n nVar = this.C;
        nVar.G.setImageDrawable(i10 != 0 ? p30.f.f0(nVar.getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.C.G.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        n nVar = this.C;
        if (z10 && nVar.I != 1) {
            nVar.g(1);
        } else if (z10) {
            nVar.getClass();
        } else {
            nVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        n nVar = this.C;
        nVar.K = colorStateList;
        a0.n(nVar.A, nVar.G, colorStateList, nVar.L);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        n nVar = this.C;
        nVar.L = mode;
        a0.n(nVar.A, nVar.G, nVar.K, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.U == null) {
            v0 v0Var = new v0(getContext(), null);
            this.U = v0Var;
            v0Var.setId(2131363089);
            this.U.setImportantForAccessibility(1);
            this.U.setAccessibilityLiveRegion(1);
            h hVarF = f();
            this.f4201a0 = hVarF;
            hVarF.B = 67L;
            this.f4203b0 = f();
            setPlaceholderTextAppearance(this.W);
            setPlaceholderTextColor(this.V);
            j0.g(this.U, new com.google.android.material.datepicker.g(4));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.T) {
                setPlaceholderTextEnabled(true);
            }
            this.S = charSequence;
        }
        EditText editText = this.E;
        x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.W = i10;
        v0 v0Var = this.U;
        if (v0Var != null) {
            v0Var.setTextAppearance(i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            v0 v0Var = this.U;
            if (v0Var == null || colorStateList == null) {
                return;
            }
            v0Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        u uVar = this.B;
        uVar.getClass();
        uVar.C = TextUtils.isEmpty(charSequence) ? null : charSequence;
        uVar.B.setText(charSequence);
        uVar.e();
    }

    public void setPrefixTextAppearance(int i10) {
        this.B.B.setTextAppearance(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.B.B.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(m mVar) {
        i iVar = this.f4213j0;
        if (iVar == null || iVar.B.f14150a == mVar) {
            return;
        }
        this.f4219p0 = mVar;
        c();
    }

    public void setStartIconCheckable(boolean z10) {
        this.B.D.setCheckable(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.B.D;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? p30.f.f0(getContext(), i10) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.B.b(drawable);
    }

    public void setStartIconMinSize(int i10) {
        u uVar = this.B;
        if (i10 < 0) {
            uVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != uVar.G) {
            uVar.G = i10;
            CheckableImageButton checkableImageButton = uVar.D;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        u uVar = this.B;
        CheckableImageButton checkableImageButton = uVar.D;
        View.OnLongClickListener onLongClickListener = uVar.I;
        checkableImageButton.setOnClickListener(onClickListener);
        a0.B0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        u uVar = this.B;
        uVar.I = onLongClickListener;
        CheckableImageButton checkableImageButton = uVar.D;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a0.B0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        u uVar = this.B;
        uVar.H = scaleType;
        uVar.D.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        u uVar = this.B;
        if (uVar.E != colorStateList) {
            uVar.E = colorStateList;
            a0.n(uVar.A, uVar.D, colorStateList, uVar.F);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        u uVar = this.B;
        if (uVar.F != mode) {
            uVar.F = mode;
            a0.n(uVar.A, uVar.D, uVar.E, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.B.c(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        n nVar = this.C;
        nVar.getClass();
        nVar.P = TextUtils.isEmpty(charSequence) ? null : charSequence;
        nVar.Q.setText(charSequence);
        nVar.n();
    }

    public void setSuffixTextAppearance(int i10) {
        this.C.Q.setTextAppearance(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.C.Q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(w wVar) {
        EditText editText = this.E;
        if (editText != null) {
            j0.g(editText, wVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.C0) {
            this.C0 = typeface;
            this.W0.n(typeface);
            q qVar = this.K;
            if (typeface != qVar.B) {
                qVar.B = typeface;
                v0 v0Var = qVar.f15686r;
                if (v0Var != null) {
                    v0Var.setTypeface(typeface);
                }
                v0 v0Var2 = qVar.f15693y;
                if (v0Var2 != null) {
                    v0Var2.setTypeface(typeface);
                }
            }
            v0 v0Var3 = this.P;
            if (v0Var3 != null) {
                v0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        v0 v0Var;
        EditText editText = this.E;
        if (editText == null || this.f4222s0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int i10 = e1.f12154a;
        Drawable drawableMutate = background.mutate();
        if (o()) {
            drawableMutate.setColorFilter(r.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.N && (v0Var = this.P) != null) {
            drawableMutate.setColorFilter(r.c(v0Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.E.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.E;
        if (editText == null || this.f4213j0 == null) {
            return;
        }
        if ((this.f4216m0 || editText.getBackground() == null) && this.f4222s0 != 0) {
            this.E.setBackground(getEditTextBoxBackground());
            this.f4216m0 = true;
        }
    }

    public final void v() {
        if (this.f4222s0 != 1) {
            FrameLayout frameLayout = this.A;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        v0 v0Var;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.E;
        boolean z12 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.E;
        boolean z13 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.J0;
        b bVar = this.W0;
        if (colorStateList2 != null) {
            bVar.k(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.J0;
            bVar.k(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.T0) : this.T0));
        } else if (o()) {
            v0 v0Var2 = this.K.f15686r;
            bVar.k(v0Var2 != null ? v0Var2.getTextColors() : null);
        } else if (this.N && (v0Var = this.P) != null) {
            bVar.k(v0Var.getTextColors());
        } else if (z13 && (colorStateList = this.K0) != null && bVar.f11276k != colorStateList) {
            bVar.f11276k = colorStateList;
            bVar.j(false);
        }
        n nVar = this.C;
        u uVar = this.B;
        if (z12 || !this.X0 || (isEnabled() && z13)) {
            if (z11 || this.V0) {
                ValueAnimator valueAnimator = this.Z0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.Z0.cancel();
                }
                if (z10 && this.Y0) {
                    b(1.0f);
                } else {
                    bVar.m(1.0f);
                }
                this.V0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.E;
                x(editText3 != null ? editText3.getText() : null);
                uVar.J = false;
                uVar.e();
                nVar.R = false;
                nVar.n();
                return;
            }
            return;
        }
        if (z11 || !this.V0) {
            ValueAnimator valueAnimator2 = this.Z0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.Z0.cancel();
            }
            if (z10 && this.Y0) {
                b(0.0f);
            } else {
                bVar.m(0.0f);
            }
            if (g() && !((vg.g) this.f4213j0).f15651d0.f15649r.isEmpty() && g()) {
                ((vg.g) this.f4213j0).s(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.V0 = true;
            v0 v0Var3 = this.U;
            if (v0Var3 != null && this.T) {
                v0Var3.setText((CharSequence) null);
                ta.x.a(this.A, this.f4203b0);
                this.U.setVisibility(4);
            }
            uVar.J = true;
            uVar.e();
            nVar.R = true;
            nVar.n();
        }
    }

    public final void x(Editable editable) {
        ((k) this.O).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.A;
        if (length != 0 || this.V0) {
            v0 v0Var = this.U;
            if (v0Var == null || !this.T) {
                return;
            }
            v0Var.setText((CharSequence) null);
            ta.x.a(frameLayout, this.f4203b0);
            this.U.setVisibility(4);
            return;
        }
        if (this.U == null || !this.T || TextUtils.isEmpty(this.S)) {
            return;
        }
        this.U.setText(this.S);
        ta.x.a(frameLayout, this.f4201a0);
        this.U.setVisibility(0);
        this.U.bringToFront();
    }

    public final void y(boolean z10, boolean z11) {
        int defaultColor = this.O0.getDefaultColor();
        int colorForState = this.O0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.O0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.f4227x0 = colorForState2;
        } else if (z11) {
            this.f4227x0 = colorForState;
        } else {
            this.f4227x0 = defaultColor;
        }
    }

    public final void z() {
        v0 v0Var;
        EditText editText;
        EditText editText2;
        if (this.f4213j0 == null || this.f4222s0 == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.E) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.E) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.f4227x0 = this.T0;
        } else if (o()) {
            if (this.O0 != null) {
                y(z11, z10);
            } else {
                this.f4227x0 = getErrorCurrentTextColors();
            }
        } else if (!this.N || (v0Var = this.P) == null) {
            if (z11) {
                this.f4227x0 = this.N0;
            } else if (z10) {
                this.f4227x0 = this.M0;
            } else {
                this.f4227x0 = this.L0;
            }
        } else if (this.O0 != null) {
            y(z11, z10);
        } else {
            this.f4227x0 = v0Var.getCurrentTextColor();
        }
        r();
        n nVar = this.C;
        TextInputLayout textInputLayout = nVar.A;
        CheckableImageButton checkableImageButton = nVar.G;
        TextInputLayout textInputLayout2 = nVar.A;
        nVar.l();
        a0.w0(textInputLayout2, nVar.C, nVar.D);
        a0.w0(textInputLayout2, checkableImageButton, nVar.K);
        if (nVar.b() instanceof vg.k) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                a0.n(textInputLayout, checkableImageButton, nVar.K, nVar.L);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        u uVar = this.B;
        a0.w0(uVar.A, uVar.D, uVar.E);
        if (this.f4222s0 == 2) {
            int i10 = this.f4224u0;
            if (z11 && isEnabled()) {
                this.f4224u0 = this.f4226w0;
            } else {
                this.f4224u0 = this.f4225v0;
            }
            if (this.f4224u0 != i10 && g() && !this.V0) {
                if (g()) {
                    ((vg.g) this.f4213j0).s(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.f4222s0 == 1) {
            if (!isEnabled()) {
                this.f4228y0 = this.Q0;
            } else if (z10 && !z11) {
                this.f4228y0 = this.S0;
            } else if (z11) {
                this.f4228y0 = this.R0;
            } else {
                this.f4228y0 = this.P0;
            }
        }
        c();
    }
}

package com.google.android.material.button;

import ab.r;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.lifecycle.i0;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;
import fg.a;
import fg.b;
import fg.c;
import fg.f;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ng.j;
import p.o;
import sg.a0;
import sg.i;
import sg.l;
import sg.m;
import sg.v;
import sg.y;
import sg.z;
import u5.e;

public class MaterialButton extends o implements Checkable, v {

    public static final int[] f4137i0 = {R.attr.state_checkable};

    public static final int[] f4138j0 = {R.attr.state_checked};

    public static final a f4139k0 = new a();
    public final f D;
    public final LinkedHashSet E;
    public b F;
    public PorterDuff.Mode G;
    public ColorStateList H;
    public Drawable I;
    public String J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public float S;
    public int T;
    public int U;
    public LinearLayout.LayoutParams V;
    public boolean W;

    public int f4140a0;

    public boolean f4141b0;

    public int f4142c0;

    public a0 f4143d0;

    public int f4144e0;

    public float f4145f0;

    public float f4146g0;

    public e f4147h0;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(xg.a.b(context, attributeSet, 2130969481, 2131952858, new int[]{2130969517}), attributeSet, 2130969481);
        this.E = new LinkedHashSet();
        this.O = false;
        this.P = false;
        this.R = -1;
        this.S = -1.0f;
        this.T = -1;
        this.U = -1;
        this.f4142c0 = -1;
        Context context2 = getContext();
        TypedArray typedArrayE = j.e(context2, attributeSet, zf.a.f17436j, 2130969481, 2131952858, new int[0]);
        this.N = typedArrayE.getDimensionPixelSize(13, 0);
        int i10 = typedArrayE.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.G = j.f(i10, mode);
        this.H = g4.J(getContext(), typedArrayE, 15);
        this.I = g4.L(getContext(), typedArrayE, 11);
        this.Q = typedArrayE.getInteger(12, 1);
        this.K = typedArrayE.getDimensionPixelSize(14, 0);
        y yVarB = y.b(context2, typedArrayE, 19);
        m mVarC = yVarB != null ? yVarB.c() : m.b(context2, attributeSet, 2130969481, 2131952858).a();
        boolean z10 = typedArrayE.getBoolean(17, false);
        f fVar = new f(this, mVarC);
        this.D = fVar;
        fVar.f5646f = typedArrayE.getDimensionPixelOffset(2, 0);
        fVar.f5647g = typedArrayE.getDimensionPixelOffset(3, 0);
        fVar.f5648h = typedArrayE.getDimensionPixelOffset(4, 0);
        fVar.f5649i = typedArrayE.getDimensionPixelOffset(5, 0);
        if (typedArrayE.hasValue(9)) {
            int dimensionPixelSize = typedArrayE.getDimensionPixelSize(9, -1);
            fVar.f5650j = dimensionPixelSize;
            float f3 = dimensionPixelSize;
            l lVarF = fVar.f5642b.f();
            lVarF.f14174e = new sg.a(f3);
            lVarF.f14175f = new sg.a(f3);
            lVarF.f14176g = new sg.a(f3);
            lVarF.f14177h = new sg.a(f3);
            fVar.f5642b = lVarF.a();
            fVar.f5643c = null;
            fVar.d();
            fVar.f5657s = true;
        }
        fVar.f5651k = typedArrayE.getDimensionPixelSize(22, 0);
        fVar.l = j.f(typedArrayE.getInt(8, -1), mode);
        fVar.m = g4.J(getContext(), typedArrayE, 7);
        fVar.f5652n = g4.J(getContext(), typedArrayE, 21);
        fVar.f5653o = g4.J(getContext(), typedArrayE, 18);
        fVar.f5658t = typedArrayE.getBoolean(6, false);
        fVar.f5661w = typedArrayE.getDimensionPixelSize(10, 0);
        fVar.f5659u = typedArrayE.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayE.hasValue(0)) {
            fVar.f5656r = true;
            setSupportBackgroundTintList(fVar.m);
            setSupportBackgroundTintMode(fVar.l);
        } else {
            fVar.c();
        }
        setPaddingRelative(paddingStart + fVar.f5646f, paddingTop + fVar.f5648h, paddingEnd + fVar.f5647g, paddingBottom + fVar.f5649i);
        setCheckedInternal(typedArrayE.getBoolean(1, false));
        if (yVarB != null) {
            fVar.f5644d = d();
            if (fVar.f5643c != null) {
                fVar.d();
            }
            fVar.f5643c = yVarB;
            fVar.d();
        }
        setOpticalCenterEnabled(z10);
        typedArrayE.recycle();
        setCompoundDrawablePadding(this.N);
        h(this.I != null);
    }

    public static void a(MaterialButton materialButton) {
        materialButton.f4140a0 = materialButton.getOpticalCenterShift();
        materialButton.j();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    public float getDisplayedWidthIncrease() {
        return this.f4145f0;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        i iVarA;
        if (this.W && this.f4141b0 && (iVarA = this.D.a(false)) != null) {
            return (int) (iVarA.g() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z10) {
        f fVar = this.D;
        if (fVar == null || !fVar.f5658t || this.O == z10) {
            return;
        }
        this.O = z10;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z11 = this.O;
            if (!materialButtonToggleGroup.L) {
                materialButtonToggleGroup.f(getId(), z11);
            }
        }
        if (this.P) {
            return;
        }
        this.P = true;
        Iterator it = this.E.iterator();
        if (it.hasNext()) {
            throw a1.b.j(it);
        }
        this.P = false;
    }

    public void setDisplayedWidthIncrease(float f3) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.f4145f0 != f3) {
            this.f4145f0 = f3;
            j();
            invalidate();
            if (getParent() instanceof fg.e) {
                fg.e eVar = (fg.e) getParent();
                int i10 = (int) this.f4145f0;
                int iIndexOfChild = eVar.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                int i11 = iIndexOfChild - 1;
                while (true) {
                    materialButton = null;
                    if (i11 < 0) {
                        materialButton2 = null;
                        break;
                    } else {
                        if (eVar.c(i11)) {
                            materialButton2 = (MaterialButton) eVar.getChildAt(i11);
                            break;
                        }
                        i11--;
                    }
                }
                int childCount = eVar.getChildCount();
                while (true) {
                    iIndexOfChild++;
                    if (iIndexOfChild >= childCount) {
                        break;
                    } else if (eVar.c(iIndexOfChild)) {
                        materialButton = (MaterialButton) eVar.getChildAt(iIndexOfChild);
                        break;
                    }
                }
                if (materialButton2 == null && materialButton == null) {
                    return;
                }
                if (materialButton2 == null) {
                    materialButton.setDisplayedWidthDecrease(i10);
                }
                if (materialButton == null) {
                    materialButton2.setDisplayedWidthDecrease(i10);
                }
                if (materialButton2 == null || materialButton == null) {
                    return;
                }
                materialButton2.setDisplayedWidthDecrease(i10 / 2);
                materialButton.setDisplayedWidthDecrease((i10 + 1) / 2);
            }
        }
    }

    public final u5.f d() {
        Context context = getContext();
        TypedValue typedValueN = z3.N(context, 2130969616);
        int[] iArr = zf.a.f17443s;
        TypedArray typedArrayObtainStyledAttributes = typedValueN == null ? context.obtainStyledAttributes(null, iArr, 0, 2131952015) : context.obtainStyledAttributes(typedValueN.resourceId, iArr);
        u5.f fVar = new u5.f();
        try {
            float f3 = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f3 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f10 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f10 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            fVar.b(f3);
            fVar.a(f10);
            typedArrayObtainStyledAttributes.recycle();
            return fVar;
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final boolean e() {
        f fVar = this.D;
        return (fVar == null || fVar.f5656r) ? false : true;
    }

    public final void f(boolean z10) {
        int i10;
        if (this.f4143d0 == null) {
            return;
        }
        if (this.f4147h0 == null) {
            e eVar = new e(this, f4139k0);
            this.f4147h0 = eVar;
            eVar.m = d();
        }
        if (this.f4141b0) {
            int i11 = this.f4144e0;
            a0 a0Var = this.f4143d0;
            int[] drawableState = getDrawableState();
            int[][] iArr = a0Var.f14145c;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i10 = -1;
                if (i13 >= a0Var.f14143a) {
                    i13 = -1;
                    break;
                } else if (StateSet.stateSetMatches(iArr[i13], drawableState)) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 < 0) {
                int[] iArr2 = StateSet.WILD_CARD;
                int[][] iArr3 = a0Var.f14145c;
                for (int i14 = 0; i14 < a0Var.f14143a; i14++) {
                    if (StateSet.stateSetMatches(iArr3[i14], iArr2)) {
                        i10 = i14;
                        break;
                    }
                }
                i13 = i10;
            }
            z zVar = (z) (i13 < 0 ? a0Var.f14144b : a0Var.f14146d[i13]).B;
            int width = getWidth();
            float f3 = zVar.f14235b;
            int i15 = zVar.f14234a;
            if (i15 != 1) {
                if (i15 == 2) {
                }
                this.f4147h0.a(Math.min(i11, i12));
                if (z10) {
                    this.f4147h0.d();
                }
            }
            f3 *= width;
            i12 = (int) f3;
            this.f4147h0.a(Math.min(i11, i12));
            if (z10) {
                this.f4147h0.d();
            }
        }
    }

    public final void g() {
        int i10 = this.Q;
        if (i10 == 1 || i10 == 2) {
            setCompoundDrawablesRelative(this.I, null, null, null);
            return;
        }
        if (i10 == 3 || i10 == 4) {
            setCompoundDrawablesRelative(null, null, this.I, null);
        } else if (i10 == 16 || i10 == 32) {
            setCompoundDrawablesRelative(null, this.I, null, null);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.J)) {
            return this.J;
        }
        f fVar = this.D;
        return ((fVar == null || !fVar.f5658t) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.f4142c0;
    }

    @Override
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.D.f5650j;
        }
        return 0;
    }

    public u5.f getCornerSpringForce() {
        return this.D.f5644d;
    }

    public Drawable getIcon() {
        return this.I;
    }

    public int getIconGravity() {
        return this.Q;
    }

    public int getIconPadding() {
        return this.N;
    }

    public int getIconSize() {
        return this.K;
    }

    public ColorStateList getIconTint() {
        return this.H;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.G;
    }

    public int getInsetBottom() {
        return this.D.f5649i;
    }

    public int getInsetTop() {
        return this.D.f5648h;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.D.f5653o;
        }
        return null;
    }

    public m getShapeAppearanceModel() {
        if (e()) {
            return this.D.f5642b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public y getStateListShapeAppearanceModel() {
        if (e()) {
            return this.D.f5643c;
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.D.f5652n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.D.f5651k;
        }
        return 0;
    }

    @Override
    public ColorStateList getSupportBackgroundTintList() {
        return e() ? this.D.m : super.getSupportBackgroundTintList();
    }

    @Override
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return e() ? this.D.l : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z10) {
        Drawable drawable = this.I;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.I = drawableMutate;
            drawableMutate.setTintList(this.H);
            PorterDuff.Mode mode = this.G;
            if (mode != null) {
                this.I.setTintMode(mode);
            }
            int intrinsicWidth = this.K;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.I.getIntrinsicWidth();
            }
            int intrinsicHeight = this.K;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.I.getIntrinsicHeight();
            }
            Drawable drawable2 = this.I;
            int i10 = this.L;
            int i11 = this.M;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.I.setVisible(true, z10);
        }
        if (z10) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i12 = this.Q;
        if (((i12 == 1 || i12 == 2) && drawable3 != this.I) || (((i12 == 3 || i12 == 4) && drawable5 != this.I) || ((i12 == 16 || i12 == 32) && drawable4 != this.I))) {
            g();
        }
    }

    public final void i(int i10, int i11) {
        if (this.I == null || getLayout() == null) {
            return;
        }
        int i12 = this.Q;
        if (i12 != 1 && i12 != 2 && i12 != 3 && i12 != 4) {
            if (i12 == 16 || i12 == 32) {
                this.L = 0;
                if (i12 == 16) {
                    this.M = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.K;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.I.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.N) - getPaddingBottom()) / 2);
                if (this.M != iMax) {
                    this.M = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.M = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i13 = this.Q;
        if (i13 == 1 || i13 == 3 || ((i13 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i13 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.L = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.K;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.I.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.N) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.Q == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.L != textLayoutWidth) {
            this.L = textLayoutWidth;
            h(false);
        }
    }

    @Override
    public final boolean isChecked() {
        return this.O;
    }

    public final void j() {
        int i10 = (int) (this.f4145f0 - this.f4146g0);
        int i11 = (i10 / 2) + this.f4140a0;
        getLayoutParams().width = (int) (this.S + i10);
        setPaddingRelative(this.T + i11, getPaddingTop(), (this.U + i10) - i11, getPaddingBottom());
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            rd.a.e0(this, this.D.a(false));
        }
    }

    @Override
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        f fVar = this.D;
        if (fVar != null && fVar.f5658t) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f4137i0);
        }
        if (this.O) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f4138j0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.O);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        f fVar = this.D;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.f5658t);
        accessibilityNodeInfo.setChecked(this.O);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        i(getMeasuredWidth(), getMeasuredHeight());
        int i15 = getResources().getConfiguration().orientation;
        if (this.R != i15) {
            this.R = i15;
            this.S = -1.0f;
        }
        if (this.S == -1.0f) {
            this.S = getMeasuredWidth();
            if (this.V == null && (getParent() instanceof fg.e) && ((fg.e) getParent()).getButtonSizeChange() != null) {
                this.V = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.V);
                layoutParams.width = (int) this.S;
                setLayoutParams(layoutParams);
            }
        }
        boolean z11 = false;
        if (this.f4142c0 == -1) {
            if (this.I == null) {
                i14 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.K;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.I.getIntrinsicWidth();
                }
                i14 = iconPadding + intrinsicWidth;
            }
            this.f4142c0 = (getMeasuredWidth() - getTextLayoutWidth()) - i14;
        }
        if (this.T == -1) {
            this.T = getPaddingStart();
        }
        if (this.U == -1) {
            this.U = getPaddingEnd();
        }
        if ((getParent() instanceof fg.e) && ((fg.e) getParent()).getOrientation() == 0) {
            z11 = true;
        }
        this.f4141b0 = z11;
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.A);
        setChecked(cVar.C);
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.C = this.O;
        return cVar;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override
    public final boolean performClick() {
        if (isEnabled() && this.D.f5659u) {
            toggle();
        }
        return super.performClick();
    }

    @Override
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.I != null) {
            if (this.I.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.J = str;
    }

    @Override
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (!e()) {
            super.setBackgroundColor(i10);
            return;
        }
        f fVar = this.D;
        if (fVar.a(false) != null) {
            fVar.a(false).setTint(i10);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        if (!e()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        f fVar = this.D;
        fVar.f5656r = true;
        MaterialButton materialButton = fVar.f5641a;
        materialButton.setSupportBackgroundTintList(fVar.m);
        materialButton.setSupportBackgroundTintMode(fVar.l);
        super.setBackgroundDrawable(drawable);
    }

    @Override
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? p30.f.f0(getContext(), i10) : null);
    }

    @Override
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (e()) {
            this.D.f5658t = z10;
        }
    }

    @Override
    public void setChecked(boolean z10) {
        setCheckedInternal(z10);
    }

    public void setCornerRadius(int i10) {
        if (e()) {
            f fVar = this.D;
            if (fVar.f5657s && fVar.f5650j == i10) {
                return;
            }
            fVar.f5650j = i10;
            fVar.f5657s = true;
            float f3 = i10;
            l lVarF = fVar.f5642b.f();
            lVarF.f14174e = new sg.a(f3);
            lVarF.f14175f = new sg.a(f3);
            lVarF.f14176g = new sg.a(f3);
            lVarF.f14177h = new sg.a(f3);
            fVar.f5642b = lVarF.a();
            fVar.f5643c = null;
            fVar.d();
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCornerSpringForce(u5.f fVar) {
        f fVar2 = this.D;
        fVar2.f5644d = fVar;
        if (fVar2.f5643c != null) {
            fVar2.d();
        }
    }

    public void setDisplayedWidthDecrease(int i10) {
        this.f4146g0 = Math.min(i10, this.f4142c0);
        j();
        invalidate();
    }

    @Override
    public void setElevation(float f3) {
        super.setElevation(f3);
        if (e()) {
            this.D.a(false).l(f3);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.I != drawable) {
            this.I = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.Q != i10) {
            this.Q = i10;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.N != i10) {
            this.N = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? p30.f.f0(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.K != i10) {
            this.K = i10;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.G != mode) {
            this.G = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(n4.b.b(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        f fVar = this.D;
        fVar.b(fVar.f5648h, i10);
    }

    public void setInsetTop(int i10) {
        f fVar = this.D;
        fVar.b(i10, fVar.f5649i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.F = bVar;
    }

    public void setOpticalCenterEnabled(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            f fVar = this.D;
            if (z10) {
                r rVar = new r(this, 13);
                fVar.f5645e = rVar;
                i iVarA = fVar.a(false);
                if (iVarA != null) {
                    iVarA.f14168b0 = rVar;
                }
            } else {
                fVar.f5645e = null;
                i iVarA2 = fVar.a(false);
                if (iVarA2 != null) {
                    iVarA2.f14168b0 = null;
                }
            }
            post(new i0(this, 17));
        }
    }

    @Override
    public void setPressed(boolean z10) {
        b bVar = this.F;
        if (bVar != null) {
            ((MaterialButtonToggleGroup) ((qj.c) bVar).B).invalidate();
        }
        super.setPressed(z10);
        f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            f fVar = this.D;
            MaterialButton materialButton = fVar.f5641a;
            if (fVar.f5653o != colorStateList) {
                fVar.f5653o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable = (RippleDrawable) materialButton.getBackground();
                    if (colorStateList == null) {
                        colorStateList = ColorStateList.valueOf(0);
                    }
                    rippleDrawable.setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (e()) {
            setRippleColor(n4.b.b(getContext(), i10));
        }
    }

    @Override
    public void setShapeAppearanceModel(m mVar) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        f fVar = this.D;
        fVar.f5642b = mVar;
        fVar.f5643c = null;
        fVar.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (e()) {
            f fVar = this.D;
            fVar.f5655q = z10;
            fVar.e();
        }
    }

    public void setSizeChange(a0 a0Var) {
        if (this.f4143d0 != a0Var) {
            this.f4143d0 = a0Var;
            f(true);
        }
    }

    public void setStateListShapeAppearanceModel(y yVar) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        f fVar = this.D;
        if (fVar.f5644d == null && yVar.d()) {
            fVar.f5644d = d();
            if (fVar.f5643c != null) {
                fVar.d();
            }
        }
        fVar.f5643c = yVar;
        fVar.d();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            f fVar = this.D;
            if (fVar.f5652n != colorStateList) {
                fVar.f5652n = colorStateList;
                fVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (e()) {
            setStrokeColor(n4.b.b(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (e()) {
            f fVar = this.D;
            if (fVar.f5651k != i10) {
                fVar.f5651k = i10;
                fVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!e()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        f fVar = this.D;
        if (fVar.m != colorStateList) {
            fVar.m = colorStateList;
            if (fVar.a(false) != null) {
                fVar.a(false).setTintList(fVar.m);
            }
        }
    }

    @Override
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!e()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        f fVar = this.D;
        if (fVar.l != mode) {
            fVar.l = mode;
            if (fVar.a(false) == null || fVar.l == null) {
                return;
            }
            fVar.a(false).setTintMode(fVar.l);
        }
    }

    @Override
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.D.f5659u = z10;
    }

    @Override
    public void setWidth(int i10) {
        this.S = -1.0f;
        super.setWidth(i10);
    }

    public void setWidthChangeMax(int i10) {
        if (this.f4144e0 != i10) {
            this.f4144e0 = i10;
            f(true);
        }
    }

    @Override
    public final void toggle() {
        setChecked(!this.O);
    }
}

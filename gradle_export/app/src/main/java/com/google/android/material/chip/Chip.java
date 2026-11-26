package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.media3.common.q;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.common.api.k;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;
import com.google.protobuf.RuntimeVersion;
import ig.b;
import ig.c;
import ig.d;
import ig.e;
import ig.f;
import java.lang.ref.WeakReference;
import java.util.Locale;
import ng.h;
import ng.j;
import p.p;
import sg.m;
import sg.v;
import xg.a;
import z4.j0;

public class Chip extends p implements e, v, Checkable {
    public static final Rect W = new Rect();

    public static final int[] f4151a0 = {R.attr.state_selected};

    public static final int[] f4152b0 = {R.attr.state_checkable};
    public f E;
    public InsetDrawable F;
    public RippleDrawable G;
    public View.OnClickListener H;
    public CompoundButton.OnCheckedChangeListener I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public CharSequence Q;
    public final d R;
    public boolean S;
    public final Rect T;
    public final RectF U;
    public final b V;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(a.a(context, attributeSet, 2130968847, 2131952872), attributeSet, 2130968847);
        this.T = new Rect();
        this.U = new RectF();
        this.V = new b(this, 0);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        f fVar = new f(context2, attributeSet);
        Context context3 = fVar.K0;
        int[] iArr = zf.a.f17429c;
        TypedArray typedArrayE = j.e(context3, attributeSet, iArr, 2130968847, 2131952872, new int[0]);
        fVar.f7650k1 = typedArrayE.hasValue(37);
        Context context4 = fVar.K0;
        ColorStateList colorStateListJ = g4.J(context4, typedArrayE, 24);
        if (fVar.f7635d0 != colorStateListJ) {
            fVar.f7635d0 = colorStateListJ;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList colorStateListJ2 = g4.J(context4, typedArrayE, 11);
        if (fVar.f7637e0 != colorStateListJ2) {
            fVar.f7637e0 = colorStateListJ2;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = typedArrayE.getDimension(19, 0.0f);
        if (fVar.f7639f0 != dimension) {
            fVar.f7639f0 = dimension;
            fVar.invalidateSelf();
            fVar.z();
        }
        if (typedArrayE.hasValue(12)) {
            fVar.F(typedArrayE.getDimension(12, 0.0f));
        }
        fVar.K(g4.J(context4, typedArrayE, 22));
        fVar.L(typedArrayE.getDimension(23, 0.0f));
        fVar.V(g4.J(context4, typedArrayE, 36));
        CharSequence text = typedArrayE.getText(5);
        text = text == null ? RuntimeVersion.SUFFIX : text;
        if (!TextUtils.equals(fVar.f7649k0, text)) {
            fVar.f7649k0 = text;
            fVar.Q0.f11307d = true;
            fVar.invalidateSelf();
            fVar.z();
        }
        qg.d dVar = (!typedArrayE.hasValue(0) || (resourceId3 = typedArrayE.getResourceId(0, 0)) == 0) ? null : new qg.d(context4, resourceId3);
        dVar.l = typedArrayE.getDimension(1, dVar.l);
        fVar.W(dVar);
        int i10 = typedArrayE.getInt(3, 0);
        if (i10 == 1) {
            fVar.f7644h1 = TextUtils.TruncateAt.START;
        } else if (i10 == 2) {
            fVar.f7644h1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i10 == 3) {
            fVar.f7644h1 = TextUtils.TruncateAt.END;
        }
        fVar.J(typedArrayE.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.J(typedArrayE.getBoolean(15, false));
        }
        fVar.G(g4.L(context4, typedArrayE, 14));
        if (typedArrayE.hasValue(17)) {
            fVar.I(g4.J(context4, typedArrayE, 17));
        }
        fVar.H(typedArrayE.getDimension(16, -1.0f));
        fVar.S(typedArrayE.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.S(typedArrayE.getBoolean(26, false));
        }
        fVar.M(g4.L(context4, typedArrayE, 25));
        fVar.R(g4.J(context4, typedArrayE, 30));
        fVar.O(typedArrayE.getDimension(28, 0.0f));
        fVar.B(typedArrayE.getBoolean(6, false));
        fVar.E(typedArrayE.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.E(typedArrayE.getBoolean(8, false));
        }
        fVar.C(g4.L(context4, typedArrayE, 7));
        if (typedArrayE.hasValue(9)) {
            fVar.D(g4.J(context4, typedArrayE, 9));
        }
        fVar.A0 = (!typedArrayE.hasValue(39) || (resourceId2 = typedArrayE.getResourceId(39, 0)) == 0) ? null : ag.b.a(context4, resourceId2);
        fVar.B0 = (!typedArrayE.hasValue(33) || (resourceId = typedArrayE.getResourceId(33, 0)) == 0) ? null : ag.b.a(context4, resourceId);
        float dimension2 = typedArrayE.getDimension(21, 0.0f);
        if (fVar.C0 != dimension2) {
            fVar.C0 = dimension2;
            fVar.invalidateSelf();
            fVar.z();
        }
        fVar.U(typedArrayE.getDimension(35, 0.0f));
        fVar.T(typedArrayE.getDimension(34, 0.0f));
        float dimension3 = typedArrayE.getDimension(41, 0.0f);
        if (fVar.F0 != dimension3) {
            fVar.F0 = dimension3;
            fVar.invalidateSelf();
            fVar.z();
        }
        float dimension4 = typedArrayE.getDimension(40, 0.0f);
        if (fVar.G0 != dimension4) {
            fVar.G0 = dimension4;
            fVar.invalidateSelf();
            fVar.z();
        }
        fVar.P(typedArrayE.getDimension(29, 0.0f));
        fVar.N(typedArrayE.getDimension(27, 0.0f));
        float dimension5 = typedArrayE.getDimension(13, 0.0f);
        if (fVar.J0 != dimension5) {
            fVar.J0 = dimension5;
            fVar.invalidateSelf();
            fVar.z();
        }
        fVar.f7648j1 = typedArrayE.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayE.recycle();
        j.a(context2, attributeSet, 2130968847, 2131952872);
        j.b(context2, attributeSet, iArr, 2130968847, 2131952872, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130968847, 2131952872);
        this.N = typedArrayObtainStyledAttributes.getBoolean(32, false);
        TypedValue typedValueN = z3.N(context2, 2130969564);
        this.P = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (int) ((typedValueN == null || typedValueN.type != 5) ? context2.getResources().getDimension(2131166215) : typedValueN.getDimension(context2.getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(fVar);
        fVar.l(getElevation());
        j.a(context2, attributeSet, 2130968847, 2131952872);
        j.b(context2, attributeSet, iArr, 2130968847, 2131952872, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, 2130968847, 2131952872);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.R = new d(this, this);
        d();
        if (!zHasValue) {
            setOutlineProvider(new c(this));
        }
        setChecked(this.J);
        setText(fVar.f7649k0);
        setEllipsize(fVar.f7644h1);
        g();
        if (!this.E.f7646i1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.N) {
            setMinHeight(this.P);
        }
        this.O = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f7626a.I;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.U;
        rectF.setEmpty();
        if (c() && this.H != null) {
            f fVar = this.E;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.Z()) {
                float f3 = fVar.J0 + fVar.I0 + fVar.f7660u0 + fVar.H0 + fVar.G0;
                if (fVar.getLayoutDirection() == 0) {
                    float f10 = bounds.right;
                    rectF.right = f10;
                    rectF.left = f10 - f3;
                } else {
                    float f11 = bounds.left;
                    rectF.left = f11;
                    rectF.right = f11 + f3;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i10 = (int) closeIconTouchBounds.left;
        int i11 = (int) closeIconTouchBounds.top;
        int i12 = (int) closeIconTouchBounds.right;
        int i13 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.T;
        rect.set(i10, i11, i12, i13);
        return rect;
    }

    private qg.d getTextAppearance() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.Q0.f11309f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.L != z10) {
            this.L = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            refreshDrawableState();
        }
    }

    public final void b(int i10) {
        this.P = i10;
        if (!this.N) {
            InsetDrawable insetDrawable = this.F;
            if (insetDrawable == null) {
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.F = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i10 - ((int) this.E.f7639f0));
        int iMax2 = Math.max(0, i10 - this.E.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.F;
            if (insetDrawable2 == null) {
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.F = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.F != null) {
            Rect rect = new Rect();
            this.F.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                e();
                return;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        this.F = new InsetDrawable((Drawable) this.E, i11, i12, i11, i12);
        e();
    }

    public final boolean c() {
        f fVar = this.E;
        if (fVar == null) {
            return false;
        }
        Drawable drawable = fVar.f7657r0;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    public final void d() {
        f fVar;
        if (!c() || (fVar = this.E) == null || !fVar.f7656q0 || this.H == null) {
            j0.g(this, null);
            this.S = false;
        } else {
            j0.g(this, this.R);
            this.S = true;
        }
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i10;
        if (!this.S) {
            return super.dispatchHoverEvent(motionEvent);
        }
        d dVar = this.R;
        AccessibilityManager accessibilityManager = dVar.H;
        int i11 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x2 = motionEvent.getX();
                float y10 = motionEvent.getY();
                Chip chip = dVar.Q;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x2, y10)) {
                    i11 = 1;
                }
                int i12 = dVar.M;
                if (i12 != i11) {
                    dVar.M = i11;
                    dVar.r(i11, Cast.MAX_NAMESPACE_LENGTH);
                    dVar.r(i12, 256);
                    return true;
                }
            } else if (action == 10 && (i10 = dVar.M) != Integer.MIN_VALUE) {
                if (i10 != Integer.MIN_VALUE) {
                    dVar.M = Integer.MIN_VALUE;
                    dVar.r(Integer.MIN_VALUE, Cast.MAX_NAMESPACE_LENGTH);
                    dVar.r(i10, 256);
                    return true;
                }
            } else if (super.dispatchHoverEvent(motionEvent)) {
                return false;
            }
        } else if (super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i10;
        Chip chip;
        View.OnClickListener onClickListener;
        if (!this.S) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.R;
        dVar.getClass();
        boolean zM = false;
        int i11 = 0;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i12 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case k.REMOTE_EXCEPTION:
                        case k.CONNECTION_SUSPENDED_DURING_CALL:
                        case k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        case k.RECONNECTION_TIMED_OUT:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i12 = 33;
                                } else if (keyCode == 21) {
                                    i12 = 17;
                                } else if (keyCode != 22) {
                                    i12 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z10 = false;
                                while (i11 < repeatCount && dVar.m(i12, null)) {
                                    i11++;
                                    z10 = true;
                                }
                                zM = z10;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i10 = dVar.L;
                                if (i10 != Integer.MIN_VALUE) {
                                    chip = dVar.Q;
                                    if (i10 == 0) {
                                        chip.performClick();
                                    } else if (i10 == 1) {
                                        chip.playSoundEffect(0);
                                        onClickListener = chip.H;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                        }
                                        if (chip.S) {
                                            chip.R.r(1, 1);
                                        }
                                    }
                                }
                                zM = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i10 = dVar.L;
                    if (i10 != Integer.MIN_VALUE) {
                        chip = dVar.Q;
                        if (i10 == 0) {
                            chip.performClick();
                        } else if (i10 == 1) {
                            chip.playSoundEffect(0);
                            onClickListener = chip.H;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.S) {
                                chip.R.r(1, 1);
                            }
                        }
                    }
                    zM = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM = dVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM = dVar.m(1, null);
            }
        }
        if (!zM || dVar.L == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.E;
        boolean zQ = false;
        int i10 = 0;
        zQ = false;
        if (fVar != null && f.y(fVar.f7657r0)) {
            f fVar2 = this.E;
            ?? IsEnabled = isEnabled();
            int i11 = IsEnabled;
            if (this.M) {
                i11 = IsEnabled + 1;
            }
            int i12 = i11;
            if (this.L) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (this.K) {
                i13 = i12 + 1;
            }
            int i14 = i13;
            if (isChecked()) {
                i14 = i13 + 1;
            }
            int[] iArr = new int[i14];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i10 = 1;
            }
            if (this.M) {
                iArr[i10] = 16842908;
                i10++;
            }
            if (this.L) {
                iArr[i10] = 16843623;
                i10++;
            }
            if (this.K) {
                iArr[i10] = 16842919;
                i10++;
            }
            if (isChecked()) {
                iArr[i10] = 16842913;
            }
            zQ = fVar2.Q(iArr);
        }
        if (zQ) {
            invalidate();
        }
    }

    public final void e() {
        ColorStateList colorStateListValueOf = this.E.f7647j0;
        if (colorStateListValueOf == null) {
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        this.G = new RippleDrawable(colorStateListValueOf, getBackgroundDrawable(), null);
        this.E.getClass();
        setBackground(this.G);
        f();
    }

    public final void f() {
        f fVar;
        if (TextUtils.isEmpty(getText()) || (fVar = this.E) == null) {
            return;
        }
        int iV = (int) (fVar.v() + fVar.J0 + fVar.G0);
        f fVar2 = this.E;
        int iU = (int) (fVar2.u() + fVar2.C0 + fVar2.F0);
        if (this.F != null) {
            Rect rect = new Rect();
            this.F.getPadding(rect);
            iU += rect.left;
            iV += rect.right;
        }
        setPaddingRelative(iU, getPaddingTop(), iV, getPaddingBottom());
    }

    public final void g() {
        TextPaint paint = getPaint();
        f fVar = this.E;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        qg.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.V);
        }
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.Q)) {
            return this.Q;
        }
        f fVar = this.E;
        if (fVar == null || !fVar.f7662w0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.F;
        return insetDrawable == null ? this.E : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.f7664y0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.f7665z0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.f7637e0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.E;
        if (fVar != null) {
            return Math.max(0.0f, fVar.w());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.E;
    }

    public float getChipEndPadding() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.J0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.E;
        if (fVar == null || (drawable = fVar.f7652m0) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.f7654o0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.f7653n0;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.f7639f0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.C0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.f7643h0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.f7645i0;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.E;
        if (fVar == null || (drawable = fVar.f7657r0) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.f7661v0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.I0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.f7660u0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.H0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.f7659t0;
        }
        return null;
    }

    @Override
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.f7644h1;
        }
        return null;
    }

    @Override
    public final void getFocusedRect(Rect rect) {
        if (this.S) {
            d dVar = this.R;
            if (dVar.L == 1 || dVar.K == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public ag.b getHideMotionSpec() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.B0;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.E0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.D0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.f7647j0;
        }
        return null;
    }

    public m getShapeAppearanceModel() {
        return this.E.B.f14150a;
    }

    public ag.b getShowMotionSpec() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.A0;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.G0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.E;
        if (fVar != null) {
            return fVar.F0;
        }
        return 0.0f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rd.a.e0(this, this.E);
    }

    @Override
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f4151a0);
        }
        f fVar = this.E;
        if (fVar != null && fVar.f7662w0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f4152b0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.S) {
            d dVar = this.R;
            int i11 = dVar.L;
            if (i11 != Integer.MIN_VALUE) {
                dVar.j(i11);
            }
            if (z10) {
                dVar.m(i10, rect);
            }
        }
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        f fVar = this.E;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.f7662w0);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.O != i10) {
            this.O = i10;
            f();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.K) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z10 = true;
                }
                z10 = false;
            } else {
                if (this.K) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.H;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.S) {
                        this.R.r(1, 1);
                    }
                    z10 = true;
                }
                setCloseIconPressed(false);
            }
            z10 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.Q = charSequence;
    }

    @Override
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.G) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.G) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.B(z10);
        }
    }

    public void setCheckableResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.B(fVar.K0.getResources().getBoolean(i10));
        }
    }

    @Override
    public void setChecked(boolean z10) {
        f fVar = this.E;
        if (fVar == null) {
            this.J = z10;
        } else if (fVar.f7662w0) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.C(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.C(p30.f.f0(fVar.K0, i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.D(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.D(n4.b.b(fVar.K0, i10));
        }
    }

    public void setCheckedIconVisible(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.E(fVar.K0.getResources().getBoolean(i10));
        }
    }

    public void setCheckedIconVisible(boolean z10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.E(z10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.E;
        if (fVar == null || fVar.f7637e0 == colorStateList) {
            return;
        }
        fVar.f7637e0 = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    public void setChipBackgroundColorResource(int i10) {
        ColorStateList colorStateListB;
        f fVar = this.E;
        if (fVar == null || fVar.f7637e0 == (colorStateListB = n4.b.b(fVar.K0, i10))) {
            return;
        }
        fVar.f7637e0 = colorStateListB;
        fVar.onStateChange(fVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f3) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.F(f3);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.F(fVar.K0.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.E;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.f7642g1 = new WeakReference(null);
            }
            this.E = fVar;
            fVar.f7646i1 = false;
            fVar.f7642g1 = new WeakReference(this);
            b(this.P);
        }
    }

    public void setChipEndPadding(float f3) {
        f fVar = this.E;
        if (fVar == null || fVar.J0 == f3) {
            return;
        }
        fVar.J0 = f3;
        fVar.invalidateSelf();
        fVar.z();
    }

    public void setChipEndPaddingResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            float dimension = fVar.K0.getResources().getDimension(i10);
            if (fVar.J0 != dimension) {
                fVar.J0 = dimension;
                fVar.invalidateSelf();
                fVar.z();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.G(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.G(p30.f.f0(fVar.K0, i10));
        }
    }

    public void setChipIconSize(float f3) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.H(f3);
        }
    }

    public void setChipIconSizeResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.H(fVar.K0.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.I(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.I(n4.b.b(fVar.K0, i10));
        }
    }

    public void setChipIconVisible(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.J(fVar.K0.getResources().getBoolean(i10));
        }
    }

    public void setChipIconVisible(boolean z10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.J(z10);
        }
    }

    public void setChipMinHeight(float f3) {
        f fVar = this.E;
        if (fVar == null || fVar.f7639f0 == f3) {
            return;
        }
        fVar.f7639f0 = f3;
        fVar.invalidateSelf();
        fVar.z();
    }

    public void setChipMinHeightResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            float dimension = fVar.K0.getResources().getDimension(i10);
            if (fVar.f7639f0 != dimension) {
                fVar.f7639f0 = dimension;
                fVar.invalidateSelf();
                fVar.z();
            }
        }
    }

    public void setChipStartPadding(float f3) {
        f fVar = this.E;
        if (fVar == null || fVar.C0 == f3) {
            return;
        }
        fVar.C0 = f3;
        fVar.invalidateSelf();
        fVar.z();
    }

    public void setChipStartPaddingResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            float dimension = fVar.K0.getResources().getDimension(i10);
            if (fVar.C0 != dimension) {
                fVar.C0 = dimension;
                fVar.invalidateSelf();
                fVar.z();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.K(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.K(n4.b.b(fVar.K0, i10));
        }
    }

    public void setChipStrokeWidth(float f3) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.L(f3);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.L(fVar.K0.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.M(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f fVar = this.E;
        if (fVar == null || fVar.f7661v0 == charSequence) {
            return;
        }
        String str = x4.b.f16439b;
        x4.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? x4.b.f16442e : x4.b.f16441d;
        bVar.getClass();
        q qVar = x4.f.f16449a;
        fVar.f7661v0 = bVar.c(charSequence);
        fVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f3) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.N(f3);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.N(fVar.K0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.M(p30.f.f0(fVar.K0, i10));
        }
        d();
    }

    public void setCloseIconSize(float f3) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.O(f3);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.O(fVar.K0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f3) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.P(f3);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.P(fVar.K0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.R(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.R(n4.b.b(fVar.K0, i10));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    public void setCloseIconVisible(boolean z10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.S(z10);
        }
        d();
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override
    public void setElevation(float f3) {
        super.setElevation(f3);
        f fVar = this.E;
        if (fVar != null) {
            fVar.l(f3);
        }
    }

    @Override
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.E == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        f fVar = this.E;
        if (fVar != null) {
            fVar.f7644h1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.N = z10;
        b(this.P);
    }

    @Override
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(ag.b bVar) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.B0 = bVar;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.B0 = ag.b.a(fVar.K0, i10);
        }
    }

    public void setIconEndPadding(float f3) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.T(f3);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.T(fVar.K0.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f3) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.U(f3);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.U(fVar.K0.getResources().getDimension(i10));
        }
    }

    public void setInternalOnCheckedChangeListener(ng.e eVar) {
    }

    @Override
    public void setLayoutDirection(int i10) {
        if (this.E == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        f fVar = this.E;
        if (fVar != null) {
            fVar.f7648j1 = i10;
        }
    }

    @Override
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.I = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.H = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.V(colorStateList);
        }
        this.E.getClass();
        e();
    }

    public void setRippleColorResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.V(n4.b.b(fVar.K0, i10));
            this.E.getClass();
            e();
        }
    }

    @Override
    public void setShapeAppearanceModel(m mVar) {
        this.E.setShapeAppearanceModel(mVar);
    }

    public void setShowMotionSpec(ag.b bVar) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.A0 = bVar;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.A0 = ag.b.a(fVar.K0, i10);
        }
    }

    @Override
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        f fVar = this.E;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = RuntimeVersion.SUFFIX;
        }
        super.setText(fVar.f7646i1 ? null : charSequence, bufferType);
        f fVar2 = this.E;
        if (fVar2 == null || TextUtils.equals(fVar2.f7649k0, charSequence)) {
            return;
        }
        fVar2.f7649k0 = charSequence;
        fVar2.Q0.f11307d = true;
        fVar2.invalidateSelf();
        fVar2.z();
    }

    @Override
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        f fVar = this.E;
        if (fVar != null) {
            fVar.W(new qg.d(fVar.K0, i10));
        }
        g();
    }

    @Override
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        f fVar = this.E;
        if (fVar != null) {
            fVar.W(new qg.d(fVar.K0, i10));
        }
        g();
    }

    public void setTextAppearance(qg.d dVar) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.W(dVar);
        }
        g();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f3) {
        f fVar = this.E;
        if (fVar == null || fVar.G0 == f3) {
            return;
        }
        fVar.G0 = f3;
        fVar.invalidateSelf();
        fVar.z();
    }

    public void setTextEndPaddingResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            float dimension = fVar.K0.getResources().getDimension(i10);
            if (fVar.G0 != dimension) {
                fVar.G0 = dimension;
                fVar.invalidateSelf();
                fVar.z();
            }
        }
    }

    @Override
    public final void setTextSize(int i10, float f3) {
        super.setTextSize(i10, f3);
        f fVar = this.E;
        if (fVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i10, f3, getResources().getDisplayMetrics());
            h hVar = fVar.Q0;
            qg.d dVar = hVar.f11309f;
            if (dVar != null) {
                dVar.l = fApplyDimension;
                hVar.f11304a.setTextSize(fApplyDimension);
                fVar.z();
                fVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f3) {
        f fVar = this.E;
        if (fVar == null || fVar.F0 == f3) {
            return;
        }
        fVar.F0 = f3;
        fVar.invalidateSelf();
        fVar.z();
    }

    public void setTextStartPaddingResource(int i10) {
        f fVar = this.E;
        if (fVar != null) {
            float dimension = fVar.K0.getResources().getDimension(i10);
            if (fVar.F0 != dimension) {
                fVar.F0 = dimension;
                fVar.invalidateSelf();
                fVar.z();
            }
        }
    }
}

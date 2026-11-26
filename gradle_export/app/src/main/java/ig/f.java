package ig;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import com.google.protobuf.RuntimeVersion;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import ng.g;
import ng.h;
import sg.i;
import sg.l;

public final class f extends i implements Drawable.Callback, g {

    public static final int[] f7630l1 = {R.attr.state_enabled};

    public static final ShapeDrawable f7631m1 = new ShapeDrawable(new OvalShape());
    public ag.b A0;
    public ag.b B0;
    public float C0;
    public float D0;
    public float E0;
    public float F0;
    public float G0;
    public float H0;
    public float I0;
    public float J0;
    public final Context K0;
    public final Paint L0;
    public final Paint.FontMetrics M0;
    public final RectF N0;
    public final PointF O0;
    public final Path P0;
    public final h Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public int W0;
    public boolean X0;
    public int Y0;
    public int Z0;

    public ColorFilter f7632a1;

    public PorterDuffColorFilter f7633b1;

    public ColorStateList f7634c1;

    public ColorStateList f7635d0;

    public PorterDuff.Mode f7636d1;

    public ColorStateList f7637e0;

    public int[] f7638e1;

    public float f7639f0;

    public ColorStateList f7640f1;

    public float f7641g0;

    public WeakReference f7642g1;

    public ColorStateList f7643h0;

    public TextUtils.TruncateAt f7644h1;

    public float f7645i0;

    public boolean f7646i1;

    public ColorStateList f7647j0;

    public int f7648j1;

    public CharSequence f7649k0;

    public boolean f7650k1;

    public boolean f7651l0;

    public Drawable f7652m0;

    public ColorStateList f7653n0;

    public float f7654o0;

    public boolean f7655p0;

    public boolean f7656q0;

    public Drawable f7657r0;

    public RippleDrawable f7658s0;

    public ColorStateList f7659t0;

    public float f7660u0;

    public SpannableStringBuilder f7661v0;

    public boolean f7662w0;

    public boolean f7663x0;

    public Drawable f7664y0;

    public ColorStateList f7665z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968847, 2131952872);
        this.f7641g0 = -1.0f;
        this.L0 = new Paint(1);
        this.M0 = new Paint.FontMetrics();
        this.N0 = new RectF();
        this.O0 = new PointF();
        this.P0 = new Path();
        this.Z0 = 255;
        this.f7636d1 = PorterDuff.Mode.SRC_IN;
        this.f7642g1 = new WeakReference(null);
        j(context);
        this.K0 = context;
        h hVar = new h(this);
        this.Q0 = hVar;
        this.f7649k0 = RuntimeVersion.SUFFIX;
        hVar.f11304a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f7630l1;
        setState(iArr);
        Q(iArr);
        this.f7646i1 = true;
        f7631m1.setTint(-1);
    }

    public static void a0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean x(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean y(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final boolean A(int[] iArr, int[] iArr2) {
        int colorForState;
        boolean z10;
        boolean z11;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f7635d0;
        int iC = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.R0) : 0);
        boolean state = true;
        if (this.R0 != iC) {
            this.R0 = iC;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f7637e0;
        int iC2 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.S0) : 0);
        if (this.S0 != iC2) {
            this.S0 = iC2;
            zOnStateChange = true;
        }
        int iF = q4.a.f(iC2, iC);
        if ((this.T0 != iF) | (this.B.f14153d == null)) {
            this.T0 = iF;
            m(ColorStateList.valueOf(iF));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f7643h0;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.U0) : 0;
        if (this.U0 != colorForState2) {
            this.U0 = colorForState2;
            zOnStateChange = true;
        }
        if (this.f7640f1 != null) {
            boolean z12 = false;
            boolean z13 = false;
            for (int i10 : iArr) {
                if (i10 == 16842910) {
                    z12 = true;
                } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                    z13 = true;
                }
            }
            if (z12 && z13) {
                colorForState = this.f7640f1.getColorForState(iArr, this.V0);
            } else {
                colorForState = 0;
            }
        } else {
            colorForState = 0;
        }
        if (this.V0 != colorForState) {
            this.V0 = colorForState;
        }
        qg.d dVar = this.Q0.f11309f;
        int colorForState3 = (dVar == null || (colorStateList = dVar.f13001k) == null) ? 0 : colorStateList.getColorForState(iArr, this.W0);
        if (this.W0 != colorForState3) {
            this.W0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z10 = false;
            break;
        }
        int length = state2.length;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                if (state2[i11] == 16842912) {
                    if (this.f7662w0) {
                        z10 = true;
                        break;
                    }
                } else {
                    i11++;
                }
            }
            z10 = false;
            break;
        }
        if (this.X0 == z10 || this.f7664y0 == null) {
            z11 = false;
        } else {
            float fU = u();
            this.X0 = z10;
            if (fU != u()) {
                zOnStateChange = true;
                z11 = true;
            } else {
                z11 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f7634c1;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.Y0) : 0;
        if (this.Y0 != colorForState4) {
            this.Y0 = colorForState4;
            ColorStateList colorStateList6 = this.f7634c1;
            PorterDuff.Mode mode = this.f7636d1;
            this.f7633b1 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (y(this.f7652m0)) {
            state |= this.f7652m0.setState(iArr);
        }
        if (y(this.f7664y0)) {
            state |= this.f7664y0.setState(iArr);
        }
        if (y(this.f7657r0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f7657r0.setState(iArr3);
        }
        if (y(this.f7658s0)) {
            state |= this.f7658s0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z11) {
            z();
        }
        return state;
    }

    public final void B(boolean z10) {
        if (this.f7662w0 != z10) {
            this.f7662w0 = z10;
            float fU = u();
            if (!z10 && this.X0) {
                this.X0 = false;
            }
            float fU2 = u();
            invalidateSelf();
            if (fU != fU2) {
                z();
            }
        }
    }

    public final void C(Drawable drawable) {
        if (this.f7664y0 != drawable) {
            float fU = u();
            this.f7664y0 = drawable;
            float fU2 = u();
            a0(this.f7664y0);
            s(this.f7664y0);
            invalidateSelf();
            if (fU != fU2) {
                z();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f7665z0 != colorStateList) {
            this.f7665z0 = colorStateList;
            if (this.f7663x0 && (drawable = this.f7664y0) != null && this.f7662w0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z10) {
        if (this.f7663x0 != z10) {
            boolean zX = X();
            this.f7663x0 = z10;
            boolean zX2 = X();
            if (zX != zX2) {
                if (zX2) {
                    s(this.f7664y0);
                } else {
                    a0(this.f7664y0);
                }
                invalidateSelf();
                z();
            }
        }
    }

    public final void F(float f3) {
        if (this.f7641g0 != f3) {
            this.f7641g0 = f3;
            l lVarF = this.B.f14150a.f();
            lVarF.f14174e = new sg.a(f3);
            lVarF.f14175f = new sg.a(f3);
            lVarF.f14176g = new sg.a(f3);
            lVarF.f14177h = new sg.a(f3);
            setShapeAppearanceModel(lVarF.a());
        }
    }

    public final void G(Drawable drawable) {
        Drawable drawable2 = this.f7652m0;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fU = u();
            this.f7652m0 = drawable != null ? drawable.mutate() : null;
            float fU2 = u();
            a0(drawable2);
            if (Y()) {
                s(this.f7652m0);
            }
            invalidateSelf();
            if (fU != fU2) {
                z();
            }
        }
    }

    public final void H(float f3) {
        if (this.f7654o0 != f3) {
            float fU = u();
            this.f7654o0 = f3;
            float fU2 = u();
            invalidateSelf();
            if (fU != fU2) {
                z();
            }
        }
    }

    public final void I(ColorStateList colorStateList) {
        this.f7655p0 = true;
        if (this.f7653n0 != colorStateList) {
            this.f7653n0 = colorStateList;
            if (Y()) {
                this.f7652m0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void J(boolean z10) {
        if (this.f7651l0 != z10) {
            boolean zY = Y();
            this.f7651l0 = z10;
            boolean zY2 = Y();
            if (zY != zY2) {
                if (zY2) {
                    s(this.f7652m0);
                } else {
                    a0(this.f7652m0);
                }
                invalidateSelf();
                z();
            }
        }
    }

    public final void K(ColorStateList colorStateList) {
        if (this.f7643h0 != colorStateList) {
            this.f7643h0 = colorStateList;
            if (this.f7650k1) {
                sg.g gVar = this.B;
                if (gVar.f14154e != colorStateList) {
                    gVar.f14154e = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void L(float f3) {
        if (this.f7645i0 != f3) {
            this.f7645i0 = f3;
            this.L0.setStrokeWidth(f3);
            if (this.f7650k1) {
                this.B.f14160k = f3;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void M(Drawable drawable) {
        Drawable drawable2 = this.f7657r0;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fV = v();
            this.f7657r0 = drawable != null ? drawable.mutate() : null;
            ColorStateList colorStateListValueOf = this.f7647j0;
            if (colorStateListValueOf == null) {
                colorStateListValueOf = ColorStateList.valueOf(0);
            }
            this.f7658s0 = new RippleDrawable(colorStateListValueOf, this.f7657r0, f7631m1);
            float fV2 = v();
            a0(drawable2);
            if (Z()) {
                s(this.f7657r0);
            }
            invalidateSelf();
            if (fV != fV2) {
                z();
            }
        }
    }

    public final void N(float f3) {
        if (this.I0 != f3) {
            this.I0 = f3;
            invalidateSelf();
            if (Z()) {
                z();
            }
        }
    }

    public final void O(float f3) {
        if (this.f7660u0 != f3) {
            this.f7660u0 = f3;
            invalidateSelf();
            if (Z()) {
                z();
            }
        }
    }

    public final void P(float f3) {
        if (this.H0 != f3) {
            this.H0 = f3;
            invalidateSelf();
            if (Z()) {
                z();
            }
        }
    }

    public final boolean Q(int[] iArr) {
        if (Arrays.equals(this.f7638e1, iArr)) {
            return false;
        }
        this.f7638e1 = iArr;
        if (Z()) {
            return A(getState(), iArr);
        }
        return false;
    }

    public final void R(ColorStateList colorStateList) {
        if (this.f7659t0 != colorStateList) {
            this.f7659t0 = colorStateList;
            if (Z()) {
                this.f7657r0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void S(boolean z10) {
        if (this.f7656q0 != z10) {
            boolean Z = Z();
            this.f7656q0 = z10;
            boolean Z2 = Z();
            if (Z != Z2) {
                if (Z2) {
                    s(this.f7657r0);
                } else {
                    a0(this.f7657r0);
                }
                invalidateSelf();
                z();
            }
        }
    }

    public final void T(float f3) {
        if (this.E0 != f3) {
            float fU = u();
            this.E0 = f3;
            float fU2 = u();
            invalidateSelf();
            if (fU != fU2) {
                z();
            }
        }
    }

    public final void U(float f3) {
        if (this.D0 != f3) {
            float fU = u();
            this.D0 = f3;
            float fU2 = u();
            invalidateSelf();
            if (fU != fU2) {
                z();
            }
        }
    }

    public final void V(ColorStateList colorStateList) {
        if (this.f7647j0 != colorStateList) {
            this.f7647j0 = colorStateList;
            this.f7640f1 = null;
            onStateChange(getState());
        }
    }

    public final void W(qg.d dVar) {
        h hVar = this.Q0;
        b bVar = hVar.f11305b;
        TextPaint textPaint = hVar.f11304a;
        if (hVar.f11309f != dVar) {
            hVar.f11309f = dVar;
            if (dVar != null) {
                Context context = this.K0;
                dVar.e(context, textPaint, bVar);
                g gVar = (g) hVar.f11308e.get();
                if (gVar != null) {
                    textPaint.drawableState = gVar.getState();
                }
                dVar.d(context, textPaint, bVar);
                hVar.f11307d = true;
            }
            g gVar2 = (g) hVar.f11308e.get();
            if (gVar2 != null) {
                f fVar = (f) gVar2;
                fVar.z();
                fVar.invalidateSelf();
                fVar.onStateChange(gVar2.getState());
            }
        }
    }

    public final boolean X() {
        return this.f7663x0 && this.f7664y0 != null && this.X0;
    }

    public final boolean Y() {
        return this.f7651l0 && this.f7652m0 != null;
    }

    public final boolean Z() {
        return this.f7656q0 && this.f7657r0 != null;
    }

    @Override
    public final void draw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: ig.f.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getAlpha() {
        return this.Z0;
    }

    @Override
    public final ColorFilter getColorFilter() {
        return this.f7632a1;
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) this.f7639f0;
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(v() + this.Q0.a(this.f7649k0.toString()) + u() + this.C0 + this.F0 + this.G0 + this.J0), this.f7648j1);
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f7650k1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f7639f0, this.f7641g0);
        } else {
            outline.setRoundRect(bounds, this.f7641g0);
            outline2 = outline;
        }
        outline2.setAlpha(this.Z0 / 255.0f);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (x(this.f7635d0) || x(this.f7637e0) || x(this.f7643h0)) {
            return true;
        }
        qg.d dVar = this.Q0.f11309f;
        if (dVar == null || (colorStateList = dVar.f13001k) == null || !colorStateList.isStateful()) {
            return (this.f7663x0 && this.f7664y0 != null && this.f7662w0) || y(this.f7652m0) || y(this.f7664y0) || x(this.f7634c1);
        }
        return true;
    }

    @Override
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (Y()) {
            zOnLayoutDirectionChanged |= this.f7652m0.setLayoutDirection(i10);
        }
        if (X()) {
            zOnLayoutDirectionChanged |= this.f7664y0.setLayoutDirection(i10);
        }
        if (Z()) {
            zOnLayoutDirectionChanged |= this.f7657r0.setLayoutDirection(i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override
    public final boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (Y()) {
            zOnLevelChange |= this.f7652m0.setLevel(i10);
        }
        if (X()) {
            zOnLevelChange |= this.f7664y0.setLevel(i10);
        }
        if (Z()) {
            zOnLevelChange |= this.f7657r0.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        if (this.f7650k1) {
            super.onStateChange(iArr);
        }
        return A(iArr, this.f7638e1);
    }

    public final void s(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f7657r0) {
            if (drawable.isStateful()) {
                drawable.setState(this.f7638e1);
            }
            drawable.setTintList(this.f7659t0);
            return;
        }
        Drawable drawable2 = this.f7652m0;
        if (drawable == drawable2 && this.f7655p0) {
            drawable2.setTintList(this.f7653n0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j9) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j9);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.Z0 != i10) {
            this.Z0 = i10;
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f7632a1 != colorFilter) {
            this.f7632a1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f7634c1 != colorStateList) {
            this.f7634c1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f7636d1 != mode) {
            this.f7636d1 = mode;
            ColorStateList colorStateList = this.f7634c1;
            this.f7633b1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (Y()) {
            visible |= this.f7652m0.setVisible(z10, z11);
        }
        if (X()) {
            visible |= this.f7664y0.setVisible(z10, z11);
        }
        if (Z()) {
            visible |= this.f7657r0.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Y() || X()) {
            float f3 = this.C0 + this.D0;
            Drawable drawable = this.X0 ? this.f7664y0 : this.f7652m0;
            float intrinsicWidth = this.f7654o0;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f10 = rect.left + f3;
                rectF.left = f10;
                rectF.right = f10 + intrinsicWidth;
            } else {
                float f11 = rect.right - f3;
                rectF.right = f11;
                rectF.left = f11 - intrinsicWidth;
            }
            Drawable drawable2 = this.X0 ? this.f7664y0 : this.f7652m0;
            float fCeil = this.f7654o0;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.K0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float u() {
        if (!Y() && !X()) {
            return 0.0f;
        }
        float f3 = this.D0;
        Drawable drawable = this.X0 ? this.f7664y0 : this.f7652m0;
        float intrinsicWidth = this.f7654o0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f3 + this.E0;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        if (Z()) {
            return this.H0 + this.f7660u0 + this.I0;
        }
        return 0.0f;
    }

    public final float w() {
        if (!this.f7650k1) {
            return this.f7641g0;
        }
        float[] fArr = this.Z;
        return fArr != null ? fArr[3] : this.B.f14150a.f14185e.a(f());
    }

    public final void z() {
        e eVar = (e) this.f7642g1.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.P);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }
}

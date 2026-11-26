package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.WeakHashMap;

public final class d0 extends z {

    public final c0 f12140e;

    public Drawable f12141f;

    public ColorStateList f12142g;

    public PorterDuff.Mode f12143h;

    public boolean f12144i;

    public boolean f12145j;

    public d0(c0 c0Var) {
        super(c0Var);
        this.f12142g = null;
        this.f12143h = null;
        this.f12144i = false;
        this.f12145j = false;
        this.f12140e = c0Var;
    }

    @Override
    public final void e(AttributeSet attributeSet, int i10) {
        super.e(attributeSet, 2130969748);
        c0 c0Var = this.f12140e;
        Context context = c0Var.getContext();
        int[] iArr = j.a.f7722g;
        k9.x0 x0VarK = k9.x0.K(context, attributeSet, iArr, 2130969748);
        TypedArray typedArray = (TypedArray) x0VarK.C;
        Context context2 = c0Var.getContext();
        TypedArray typedArray2 = (TypedArray) x0VarK.C;
        WeakHashMap weakHashMap = z4.j0.f17198a;
        z4.h0.b(c0Var, context2, iArr, attributeSet, typedArray2, 2130969748, 0);
        Drawable drawableW = x0VarK.w(0);
        if (drawableW != null) {
            c0Var.setThumb(drawableW);
        }
        Drawable drawableV = x0VarK.v(1);
        Drawable drawable = this.f12141f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f12141f = drawableV;
        if (drawableV != null) {
            drawableV.setCallback(c0Var);
            drawableV.setLayoutDirection(c0Var.getLayoutDirection());
            if (drawableV.isStateful()) {
                drawableV.setState(c0Var.getDrawableState());
            }
            i();
        }
        c0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.f12143h = e1.a(typedArray.getInt(3, -1), this.f12143h);
            this.f12145j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f12142g = x0VarK.t(2);
            this.f12144i = true;
        }
        x0VarK.O();
        i();
    }

    public final void i() {
        Drawable drawable = this.f12141f;
        if (drawable != null) {
            if (this.f12144i || this.f12145j) {
                Drawable drawableMutate = drawable.mutate();
                this.f12141f = drawableMutate;
                if (this.f12144i) {
                    drawableMutate.setTintList(this.f12142g);
                }
                if (this.f12145j) {
                    this.f12141f.setTintMode(this.f12143h);
                }
                if (this.f12141f.isStateful()) {
                    this.f12141f.setState(this.f12140e.getDrawableState());
                }
            }
        }
    }

    public final void j(Canvas canvas) {
        if (this.f12141f != null) {
            c0 c0Var = this.f12140e;
            int max = c0Var.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f12141f.getIntrinsicWidth();
                int intrinsicHeight = this.f12141f.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f12141f.setBounds(-i10, -i11, i10, i11);
                float width = ((c0Var.getWidth() - c0Var.getPaddingLeft()) - c0Var.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(c0Var.getPaddingLeft(), c0Var.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f12141f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}

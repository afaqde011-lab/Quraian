package pb;

import a10.h0;
import ab.a0;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import g4.c;
import java.util.ArrayList;
import xb.f;

public final class a extends Drawable implements Drawable.Callback, Animatable {
    public final f A;
    public final int B;
    public final boolean C;
    public final ArrayList D = new ArrayList();
    public final int E;
    public final int F;
    public long G;
    public int H;
    public int I;
    public Drawable J;
    public final Drawable K;

    public a(Drawable drawable, f fVar, int i10, boolean z10) {
        this.A = fVar;
        this.B = i10;
        this.C = z10;
        this.E = a(null, drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null);
        this.F = a(null, drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null);
        this.H = 255;
        this.J = null;
        Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
        this.K = drawableMutate;
        if (i10 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
        Drawable drawable2 = this.J;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        if (drawableMutate == null) {
            return;
        }
        drawableMutate.setCallback(this);
    }

    public final int a(Integer num, Integer num2) {
        if (num != null && num.intValue() == -1) {
            return -1;
        }
        if (num2 != null && num2.intValue() == -1) {
            return -1;
        }
        return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
    }

    public final void b() {
        this.I = 2;
        this.J = null;
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ColorStateList colorStateList = ((hg.a) arrayList.get(i10)).f7058b.O;
            if (colorStateList != null) {
                setTintList(colorStateList);
            }
        }
    }

    public final void c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dO = h0.o(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.A);
        double d3 = 2;
        int iE = w00.a.E((((double) iWidth) - (((double) intrinsicWidth) * dO)) / d3);
        int iE2 = w00.a.E((((double) iHeight) - (dO * ((double) intrinsicHeight))) / d3);
        drawable.setBounds(rect.left + iE, rect.top + iE2, rect.right - iE, rect.bottom - iE2);
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable;
        int i10 = this.I;
        if (i10 == 0) {
            Drawable drawable2 = this.J;
            if (drawable2 != null) {
                drawable2.setAlpha(this.H);
                int iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
            return;
        }
        Drawable drawable3 = this.K;
        if (i10 == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.H);
                int iSave2 = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave2);
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.G) / ((double) this.B);
        double dW = a0.w(dUptimeMillis, 0.0d, 1.0d);
        int i11 = this.H;
        int i12 = (int) (dW * ((double) i11));
        if (this.C) {
            i11 -= i12;
        }
        boolean z10 = dUptimeMillis >= 1.0d;
        if (!z10 && (drawable = this.J) != null) {
            drawable.setAlpha(i11);
            int iSave3 = canvas.save();
            try {
                drawable.draw(canvas);
                canvas.restoreToCount(iSave3);
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave3);
                throw th2;
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i12);
            int iSave4 = canvas.save();
            try {
                drawable3.draw(canvas);
                canvas.restoreToCount(iSave4);
            } catch (Throwable th3) {
                canvas.restoreToCount(iSave4);
                throw th3;
            }
        }
        if (z10) {
            b();
        } else {
            invalidateSelf();
        }
    }

    @Override
    public final int getAlpha() {
        return this.H;
    }

    @Override
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i10 = this.I;
        if (i10 == 0) {
            Drawable drawable = this.J;
            if (drawable != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable2 = this.K;
        if (i10 != 1) {
            if (i10 == 2 && drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (drawable2 != null && (colorFilter = drawable2.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable3 = this.J;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.F;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.E;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.J;
        int i10 = this.I;
        if (i10 == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.K;
        if (i10 == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isRunning() {
        return this.I == 1;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.J;
        if (drawable != null) {
            c(drawable, rect);
        }
        Drawable drawable2 = this.K;
        if (drawable2 != null) {
            c(drawable2, rect);
        }
    }

    @Override
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.J;
        boolean level = drawable != null ? drawable.setLevel(i10) : false;
        Drawable drawable2 = this.K;
        return level || (drawable2 != null ? drawable2.setLevel(i10) : false);
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.J;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.K;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j9) {
        scheduleSelf(runnable, j9);
    }

    @Override
    public final void setAlpha(int i10) {
        if (i10 < 0 || i10 >= 256) {
            throw new IllegalArgumentException(c.f(i10, "Invalid alpha: ").toString());
        }
        this.H = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.J;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.K;
        if (drawable2 == null) {
            return;
        }
        drawable2.setColorFilter(colorFilter);
    }

    @Override
    public final void setTint(int i10) {
        Drawable drawable = this.J;
        if (drawable != null) {
            drawable.setTint(i10);
        }
        Drawable drawable2 = this.K;
        if (drawable2 != null) {
            drawable2.setTint(i10);
        }
    }

    @Override
    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.J;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.K;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.J;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.K;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.J;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.K;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override
    public final void start() {
        Object obj = this.J;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.K;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.I != 0) {
            return;
        }
        this.I = 1;
        this.G = SystemClock.uptimeMillis();
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((hg.a) arrayList.get(i10)).a(this);
        }
        invalidateSelf();
    }

    @Override
    public final void stop() {
        Object obj = this.J;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.K;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.I != 2) {
            b();
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}

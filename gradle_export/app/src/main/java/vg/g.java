package vg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public final class g extends sg.i {

    public static final int f15650e0 = 0;

    public f f15651d0;

    @Override
    public final void e(Canvas canvas) {
        if (this.f15651d0.f15649r.isEmpty()) {
            super.e(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f15651d0.f15649r);
        super.e(canvas);
        canvas.restore();
    }

    @Override
    public final Drawable mutate() {
        this.f15651d0 = new f(this.f15651d0);
        return this;
    }

    public final void s(float f3, float f10, float f11, float f12) {
        RectF rectF = this.f15651d0.f15649r;
        if (f3 == rectF.left && f10 == rectF.top && f11 == rectF.right && f12 == rectF.bottom) {
            return;
        }
        rectF.set(f3, f10, f11, f12);
        invalidateSelf();
    }
}

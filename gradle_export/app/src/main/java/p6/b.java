package p6;

import android.view.animation.Interpolator;
import w.c;

public abstract class b implements Interpolator {

    public final float[] f12372a;

    public final float f12373b;

    public b(float[] fArr) {
        this.f12372a = fArr;
        this.f12373b = 1.0f / (fArr.length - 1);
    }

    @Override
    public final float getInterpolation(float f3) {
        if (f3 >= 1.0f) {
            return 1.0f;
        }
        if (f3 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f12372a;
        int iMin = Math.min((int) ((fArr.length - 1) * f3), fArr.length - 2);
        float f10 = this.f12373b;
        float f11 = (f3 - (iMin * f10)) / f10;
        float f12 = fArr[iMin];
        return c.b(fArr[iMin + 1], f12, f11, f12);
    }
}

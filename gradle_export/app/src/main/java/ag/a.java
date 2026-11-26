package ag;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public abstract class a {

    public static final LinearInterpolator f465a = new LinearInterpolator();

    public static final p6.a f466b = new p6.a(1);

    public static final p6.a f467c = new p6.a(0);

    public static final p6.a f468d = new p6.a(p6.a.f12371e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f3, float f10, float f11) {
        return w.c.b(f10, f3, f11, f3);
    }

    public static float b(float f3, float f10, float f11, float f12, float f13) {
        if (f13 <= f11) {
            return f3;
        }
        return f13 >= f12 ? f10 : a(f3, f10, (f13 - f11) / (f12 - f11));
    }

    public static int c(float f3, int i10, int i11) {
        return Math.round(f3 * (i11 - i10)) + i10;
    }
}

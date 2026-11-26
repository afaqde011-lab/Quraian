package oc;

import android.graphics.PointF;

public abstract class d {

    public static final PointF f11921a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f3, float f10, float f11) {
        return Math.max(f10, Math.min(f11, f3));
    }

    public static int c(float f3, float f10) {
        int i10 = (int) f3;
        int i11 = (int) f10;
        int i12 = i10 / i11;
        int i13 = i10 % i11;
        if (!((i10 ^ i11) >= 0) && i13 != 0) {
            i12--;
        }
        return i10 - (i11 * i12);
    }

    public static float d(float f3, float f10, float f11) {
        return w.c.b(f10, f3, f11, f3);
    }
}

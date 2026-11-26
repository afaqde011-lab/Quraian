package ic;

import android.graphics.PointF;

public final class a {

    public final PointF f7583a;

    public final PointF f7584b;

    public final PointF f7585c;

    public a() {
        this.f7583a = new PointF();
        this.f7584b = new PointF();
        this.f7585c = new PointF();
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f7583a = pointF;
        this.f7584b = pointF2;
        this.f7585c = pointF3;
    }

    public final String toString() {
        PointF pointF = this.f7585c;
        Float fValueOf = Float.valueOf(pointF.x);
        Float fValueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f7583a;
        Float fValueOf3 = Float.valueOf(pointF2.x);
        Float fValueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f7584b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }
}

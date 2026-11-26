package fc;

import android.graphics.Path;
import android.graphics.PointF;
import c3.s0;

public final class j extends pc.a {

    public Path f5613q;

    public final pc.a f5614r;

    public j(cc.a aVar, pc.a aVar2) {
        super(aVar, (PointF) aVar2.f12475b, (PointF) aVar2.f12476c, aVar2.f12477d, aVar2.f12478e, aVar2.f12479f, aVar2.f12480g, aVar2.f12481h);
        this.f5614r = aVar2;
        d();
    }

    public final void d() {
        Object obj;
        Object obj2 = this.f12476c;
        Object obj3 = this.f12475b;
        boolean z10 = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.f12476c) == null || z10) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        pc.a aVar = this.f5614r;
        PointF pointF3 = aVar.f12486o;
        PointF pointF4 = aVar.f12487p;
        s0 s0Var = oc.e.f11922a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f3 = pointF3.x + pointF.x;
            float f10 = pointF.y + pointF3.y;
            float f11 = pointF2.x;
            float f12 = f11 + pointF4.x;
            float f13 = pointF2.y;
            path.cubicTo(f3, f10, f12, f13 + pointF4.y, f11, f13);
        }
        this.f5613q = path;
    }
}

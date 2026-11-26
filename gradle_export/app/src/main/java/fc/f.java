package fc;

import android.graphics.PointF;
import java.util.List;

public final class f extends i {

    public final int f5603h;

    public f(int i10, List list) {
        super(list);
        this.f5603h = i10;
    }

    public static float j(pc.a aVar, float f3) {
        Object obj = aVar.f12475b;
        if (obj == null || aVar.f12476c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (aVar.f12482i == -3987645.8f) {
            aVar.f12482i = ((Float) obj).floatValue();
        }
        float f10 = aVar.f12482i;
        if (aVar.f12483j == -3987645.8f) {
            aVar.f12483j = ((Float) aVar.f12476c).floatValue();
        }
        return oc.d.d(f10, aVar.f12483j, f3);
    }

    @Override
    public final Object f(pc.a aVar, float f3) {
        Object obj;
        switch (this.f5603h) {
            case 0:
                return Integer.valueOf(k(aVar, f3));
            case 1:
                return Float.valueOf(j(aVar, f3));
            case 2:
                return Integer.valueOf(k(aVar, f3));
            default:
                return (f3 != 1.0f || (obj = aVar.f12476c) == null) ? (ic.b) aVar.f12475b : (ic.b) obj;
        }
    }

    public float i() {
        return j(b(), c());
    }

    public int k(pc.a aVar, float f3) {
        switch (this.f5603h) {
            case 0:
                if (aVar.f12475b == null || aVar.f12476c == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                return w50.c.D(oc.d.b(f3, 0.0f, 1.0f), ((Integer) aVar.f12475b).intValue(), ((Integer) aVar.f12476c).intValue());
            default:
                Object obj = aVar.f12475b;
                if (obj == null || aVar.f12476c == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                if (aVar.f12484k == 784923401) {
                    aVar.f12484k = ((Integer) obj).intValue();
                }
                int i10 = aVar.f12484k;
                if (aVar.l == 784923401) {
                    aVar.l = ((Integer) aVar.f12476c).intValue();
                }
                int i11 = aVar.l;
                PointF pointF = oc.d.f11921a;
                return (int) ((f3 * (i11 - i10)) + i10);
        }
    }
}

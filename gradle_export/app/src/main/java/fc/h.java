package fc;

import android.graphics.PointF;
import java.util.List;

public final class h extends i {

    public final int f5611h;

    public final Object f5612i;

    public h(int i10, List list) {
        super(list);
        this.f5611h = i10;
        switch (i10) {
            case 1:
                super(list);
                this.f5612i = new PointF();
                break;
            case 2:
                super(list);
                this.f5612i = new pc.b(1.0f, 1.0f);
                break;
            default:
                kc.c cVar = (kc.c) ((pc.a) list.get(0)).f12475b;
                int length = cVar != null ? cVar.f9587b.length : 0;
                this.f5612i = new kc.c(new float[length], new int[length]);
                break;
        }
    }

    @Override
    public final Object f(pc.a aVar, float f3) {
        Object obj;
        switch (this.f5611h) {
            case 0:
                kc.c cVar = (kc.c) this.f5612i;
                kc.c cVar2 = (kc.c) aVar.f12475b;
                kc.c cVar3 = (kc.c) aVar.f12476c;
                cVar.getClass();
                int[] iArr = cVar2.f9587b;
                int length = iArr.length;
                int[] iArr2 = cVar3.f9587b;
                if (length != iArr2.length) {
                    StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                    sb2.append(iArr.length);
                    sb2.append(" vs ");
                    throw new IllegalArgumentException(g4.c.g(iArr2.length, ")", sb2));
                }
                for (int i10 = 0; i10 < iArr.length; i10++) {
                    cVar.f9586a[i10] = oc.d.d(cVar2.f9586a[i10], cVar3.f9586a[i10], f3);
                    cVar.f9587b[i10] = w50.c.D(f3, iArr[i10], iArr2[i10]);
                }
                return cVar;
            case 1:
                return i(aVar, f3, f3);
            default:
                pc.b bVar = (pc.b) this.f5612i;
                Object obj2 = aVar.f12475b;
                if (obj2 == null || (obj = aVar.f12476c) == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                pc.b bVar2 = (pc.b) obj2;
                pc.b bVar3 = (pc.b) obj;
                float fD = oc.d.d(bVar2.f12488a, bVar3.f12488a, f3);
                float fD2 = oc.d.d(bVar2.f12489b, bVar3.f12489b, f3);
                bVar.f12488a = fD;
                bVar.f12489b = fD2;
                return bVar;
        }
    }

    @Override
    public Object g(pc.a aVar, float f3, float f10, float f11) {
        switch (this.f5611h) {
            case 1:
                return i(aVar, f10, f11);
            default:
                return super.g(aVar, f3, f10, f11);
        }
    }

    public PointF i(pc.a aVar, float f3, float f10) {
        Object obj;
        PointF pointF = (PointF) this.f5612i;
        Object obj2 = aVar.f12475b;
        if (obj2 == null || (obj = aVar.f12476c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        float f11 = pointF2.x;
        float fB = w.c.b(pointF3.x, f11, f3, f11);
        float f12 = pointF2.y;
        pointF.set(fB, w.c.b(pointF3.y, f12, f10, f12));
        return pointF;
    }
}

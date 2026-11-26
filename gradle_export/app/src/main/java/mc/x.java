package mc;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

public final class x implements d0 {
    public static final x A = new x();
    public static final h7.b B = h7.b.t("c", "v", "i", "o");

    @Override
    public final Object e(nc.c cVar, float f3) {
        if (cVar.O() == 1) {
            cVar.a();
        }
        cVar.i();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zA = false;
        while (cVar.x()) {
            int iZ = cVar.Z(B);
            if (iZ == 0) {
                zA = cVar.A();
            } else if (iZ == 1) {
                arrayListC = n.c(cVar, f3);
            } else if (iZ == 2) {
                arrayListC2 = n.c(cVar, f3);
            } else if (iZ != 3) {
                cVar.b0();
                cVar.f0();
            } else {
                arrayListC3 = n.c(cVar, f3);
            }
        }
        cVar.r();
        if (cVar.O() == 2) {
            cVar.l();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListC.isEmpty()) {
            return new kc.k(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 1; i10 < size; i10++) {
            PointF pointF2 = (PointF) arrayListC.get(i10);
            int i11 = i10 - 1;
            arrayList.add(new ic.a(oc.d.a((PointF) arrayListC.get(i11), (PointF) arrayListC3.get(i11)), oc.d.a(pointF2, (PointF) arrayListC2.get(i10)), pointF2));
        }
        if (zA) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i12 = size - 1;
            arrayList.add(new ic.a(oc.d.a((PointF) arrayListC.get(i12), (PointF) arrayListC3.get(i12)), oc.d.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new kc.k(pointF, zA, arrayList);
    }
}

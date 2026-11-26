package fc;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

public final class l extends e {

    public final kc.k f5619h;

    public final Path f5620i;

    public ArrayList f5621j;

    public l(List list) {
        super(list);
        this.f5619h = new kc.k();
        this.f5620i = new Path();
    }

    @Override
    public final Object f(pc.a aVar, float f3) {
        int i10;
        float f10;
        kc.k kVar = (kc.k) aVar.f12475b;
        kc.k kVar2 = (kc.k) aVar.f12476c;
        kc.k kVar3 = this.f5619h;
        ArrayList arrayList = kVar3.f9627a;
        if (kVar3.f9628b == null) {
            kVar3.f9628b = new PointF();
        }
        boolean z10 = kVar.f9629c;
        ArrayList arrayList2 = kVar.f9627a;
        boolean z11 = true;
        kVar3.f9629c = z10 || kVar2.f9629c;
        int size = arrayList2.size();
        ArrayList arrayList3 = kVar2.f9627a;
        if (size != arrayList3.size()) {
            oc.b.a("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int iMin = Math.min(arrayList2.size(), arrayList3.size());
        if (arrayList.size() < iMin) {
            for (int size2 = arrayList.size(); size2 < iMin; size2++) {
                arrayList.add(new ic.a());
            }
        } else if (arrayList.size() > iMin) {
            for (int size3 = arrayList.size() - 1; size3 >= iMin; size3--) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF pointF = kVar.f9628b;
        PointF pointF2 = kVar2.f9628b;
        kVar3.a(oc.d.d(pointF.x, pointF2.x, f3), oc.d.d(pointF.y, pointF2.y, f3));
        int size4 = arrayList.size() - 1;
        while (size4 >= 0) {
            ic.a aVar2 = (ic.a) arrayList2.get(size4);
            ic.a aVar3 = (ic.a) arrayList3.get(size4);
            PointF pointF3 = aVar2.f7583a;
            PointF pointF4 = aVar2.f7584b;
            PointF pointF5 = aVar2.f7585c;
            PointF pointF6 = aVar3.f7583a;
            PointF pointF7 = aVar3.f7584b;
            PointF pointF8 = aVar3.f7585c;
            ((ic.a) arrayList.get(size4)).f7583a.set(oc.d.d(pointF3.x, pointF6.x, f3), oc.d.d(pointF3.y, pointF6.y, f3));
            ((ic.a) arrayList.get(size4)).f7584b.set(oc.d.d(pointF4.x, pointF7.x, f3), oc.d.d(pointF4.y, pointF7.y, f3));
            ((ic.a) arrayList.get(size4)).f7585c.set(oc.d.d(pointF5.x, pointF8.x, f3), oc.d.d(pointF5.y, pointF8.y, f3));
            size4--;
            z11 = z11;
        }
        boolean z12 = z11;
        ArrayList arrayList4 = this.f5621j;
        if (arrayList4 != null) {
            int size5 = arrayList4.size() - 1;
            while (true) {
                ArrayList arrayList5 = kVar3.f9627a;
                if (size5 < 0) {
                    break;
                }
                ec.n nVar = (ec.n) this.f5621j.get(size5);
                nVar.getClass();
                if (arrayList5.size() > 2) {
                    float fFloatValue = ((Float) nVar.f5339b.e()).floatValue();
                    if (fFloatValue != 0.0f) {
                        boolean z13 = kVar3.f9629c;
                        int size6 = arrayList5.size() - 1;
                        int i11 = 0;
                        while (size6 >= 0) {
                            ic.a aVar4 = (ic.a) arrayList5.get(size6);
                            ic.a aVar5 = (ic.a) arrayList5.get(ec.n.f(size6 - 1, arrayList5.size()));
                            PointF pointF9 = (size6 != 0 || z13) ? aVar5.f7585c : kVar3.f9628b;
                            i11 = (((size6 != 0 || z13) ? aVar5.f7584b : pointF9).equals(pointF9) && aVar4.f7583a.equals(pointF9) && !((kVar3.f9629c || size6 != 0 || size6 != arrayList5.size() + (-1)) ? false : z12)) ? i11 + 2 : i11 + 1;
                            size6--;
                        }
                        kc.k kVar4 = nVar.f5340c;
                        if (kVar4 == null || kVar4.f9627a.size() != i11) {
                            ArrayList arrayList6 = new ArrayList(i11);
                            for (int i12 = 0; i12 < i11; i12++) {
                                arrayList6.add(new ic.a());
                            }
                            i10 = 0;
                            nVar.f5340c = new kc.k(new PointF(0.0f, 0.0f), false, arrayList6);
                        } else {
                            i10 = 0;
                        }
                        kc.k kVar5 = nVar.f5340c;
                        kVar5.f9629c = z13;
                        PointF pointF10 = kVar3.f9628b;
                        kVar5.a(pointF10.x, pointF10.y);
                        ArrayList arrayList7 = kVar5.f9627a;
                        boolean z14 = kVar3.f9629c;
                        int i13 = i10;
                        int i14 = i13;
                        while (i13 < arrayList5.size()) {
                            ic.a aVar6 = (ic.a) arrayList5.get(i13);
                            ic.a aVar7 = (ic.a) arrayList5.get(ec.n.f(i13 - 1, arrayList5.size()));
                            ic.a aVar8 = (ic.a) arrayList5.get(ec.n.f(i13 - 2, arrayList5.size()));
                            PointF pointF11 = (i13 != 0 || z14) ? aVar7.f7585c : kVar3.f9628b;
                            PointF pointF12 = (i13 != 0 || z14) ? aVar7.f7584b : pointF11;
                            PointF pointF13 = aVar6.f7583a;
                            PointF pointF14 = aVar8.f7585c;
                            int i15 = size5;
                            PointF pointF15 = aVar6.f7585c;
                            ArrayList arrayList8 = arrayList5;
                            boolean z15 = (!kVar3.f9629c && i13 == 0 && i13 == arrayList8.size() + (-1)) ? z12 : false;
                            if (pointF12.equals(pointF11) && pointF13.equals(pointF11) && !z15) {
                                float f11 = pointF11.x;
                                float f12 = f11 - pointF14.x;
                                float f13 = pointF11.y;
                                float f14 = f13 - pointF14.y;
                                float f15 = pointF15.x - f11;
                                float f16 = pointF15.y - f13;
                                f10 = fFloatValue;
                                float fHypot = (float) Math.hypot(f12, f14);
                                float fHypot2 = (float) Math.hypot(f15, f16);
                                float fMin = Math.min(f10 / fHypot, 0.5f);
                                float fMin2 = Math.min(f10 / fHypot2, 0.5f);
                                float f17 = pointF11.x;
                                float fB = w.c.b(pointF14.x, f17, fMin, f17);
                                float f18 = pointF11.y;
                                float fB2 = w.c.b(pointF14.y, f18, fMin, f18);
                                float fB3 = w.c.b(pointF15.x, f17, fMin2, f17);
                                float fB4 = w.c.b(pointF15.y, f18, fMin2, f18);
                                float f19 = fB - ((fB - f17) * 0.5519f);
                                float f20 = fB2 - ((fB2 - f18) * 0.5519f);
                                float f21 = fB3 - ((fB3 - f17) * 0.5519f);
                                float f22 = fB4 - ((fB4 - f18) * 0.5519f);
                                ic.a aVar9 = (ic.a) arrayList7.get(ec.n.f(i14 - 1, arrayList7.size()));
                                ic.a aVar10 = (ic.a) arrayList7.get(i14);
                                aVar9.f7584b.set(fB, fB2);
                                aVar9.f7585c.set(fB, fB2);
                                if (i13 == 0) {
                                    kVar5.a(fB, fB2);
                                }
                                aVar10.f7583a.set(f19, f20);
                                ic.a aVar11 = (ic.a) arrayList7.get(i14 + 1);
                                aVar10.f7584b.set(f21, f22);
                                aVar10.f7585c.set(fB3, fB4);
                                aVar11.f7583a.set(fB3, fB4);
                                i14 += 2;
                            } else {
                                f10 = fFloatValue;
                                ic.a aVar12 = (ic.a) arrayList7.get(ec.n.f(i14 - 1, arrayList7.size()));
                                ic.a aVar13 = (ic.a) arrayList7.get(i14);
                                PointF pointF16 = aVar7.f7584b;
                                aVar12.f7584b.set(pointF16.x, pointF16.y);
                                PointF pointF17 = aVar7.f7585c;
                                aVar12.f7585c.set(pointF17.x, pointF17.y);
                                PointF pointF18 = aVar6.f7583a;
                                aVar13.f7583a.set(pointF18.x, pointF18.y);
                                i14++;
                            }
                            i13++;
                            size5 = i15;
                            arrayList5 = arrayList8;
                            kVar3 = kVar3;
                            fFloatValue = f10;
                            z14 = z14;
                        }
                        kVar3 = kVar5;
                    }
                }
                size5--;
            }
        }
        Path path = this.f5620i;
        path.reset();
        PointF pointF19 = kVar3.f9628b;
        ArrayList arrayList9 = kVar3.f9627a;
        path.moveTo(pointF19.x, pointF19.y);
        PointF pointF20 = oc.d.f11921a;
        pointF20.set(pointF19.x, pointF19.y);
        for (int i16 = 0; i16 < arrayList9.size(); i16++) {
            ic.a aVar14 = (ic.a) arrayList9.get(i16);
            PointF pointF21 = aVar14.f7583a;
            PointF pointF22 = aVar14.f7584b;
            PointF pointF23 = aVar14.f7585c;
            if (pointF21.equals(pointF20) && pointF22.equals(pointF23)) {
                path.lineTo(pointF23.x, pointF23.y);
            } else {
                path.cubicTo(pointF21.x, pointF21.y, pointF22.x, pointF22.y, pointF23.x, pointF23.y);
            }
            pointF20.set(pointF23.x, pointF23.y);
        }
        if (kVar3.f9629c) {
            path.close();
        }
        return path;
    }
}

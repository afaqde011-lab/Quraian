package j3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public abstract class b0 {

    public static final Comparator[] f7928a;

    public static final m f7929b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i10 = 0;
        while (i10 < 2) {
            comparatorArr[i10] = new ay.b(new ay.b(i10 == 0 ? i.C : i.B), 4);
            i10++;
        }
        f7928a = comparatorArr;
        f7929b = m.V;
    }

    public static final void a(s sVar, ArrayList arrayList, b3.a aVar, b3.a aVar2, u.w wVar) {
        o oVar = sVar.f7968d;
        Object objG = oVar.A.g(w.f7989n);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) aVar2.invoke(sVar)).booleanValue()) && ((Boolean) aVar.invoke(sVar)).booleanValue()) {
            arrayList.add(sVar);
        }
        if (zBooleanValue) {
            wVar.i(sVar.f7970f, b(sVar, aVar, aVar2, s.j(7, sVar)));
            return;
        }
        List listJ = s.j(7, sVar);
        int size = listJ.size();
        for (int i10 = 0; i10 < size; i10++) {
            a((s) listJ.get(i10), arrayList, aVar, aVar2, wVar);
        }
    }

    public static final ArrayList b(s sVar, b3.a aVar, b3.a aVar2, List list) {
        u.w wVar = u.m.f14876a;
        u.w wVar2 = new u.w();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a((s) list.get(i10), arrayList, aVar, aVar2, wVar2);
        }
        char c10 = sVar.f7967c.f2053a0 == y3.m.B ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int iM = va.a.M(arrayList);
        if (iM >= 0) {
            int i11 = 0;
            while (true) {
                s sVar2 = (s) arrayList.get(i11);
                if (i11 == 0) {
                    arrayList2.add(new g00.k(sVar2.h(), va.a.W(sVar2)));
                    break;
                }
                float f3 = sVar2.h().f6547b;
                float f10 = sVar2.h().f6549d;
                boolean z10 = f3 >= f10;
                int iM2 = va.a.M(arrayList2);
                if (iM2 >= 0) {
                    int i12 = 0;
                    while (true) {
                        h2.c cVar = (h2.c) ((g00.k) arrayList2.get(i12)).A;
                        float f11 = cVar.f6547b;
                        float f12 = cVar.f6549d;
                        boolean z11 = f11 >= f12;
                        if (!z10 && !z11 && Math.max(f3, f11) < Math.min(f10, f12)) {
                            arrayList2.set(i12, new g00.k(new h2.c(Math.max(cVar.f6546a, 0.0f), Math.max(cVar.f6547b, f3), Math.min(cVar.f6548c, Float.POSITIVE_INFINITY), Math.min(f12, f10)), ((g00.k) arrayList2.get(i12)).B));
                            ((List) ((g00.k) arrayList2.get(i12)).B).add(sVar2);
                            break;
                        }
                        if (i12 != iM2) {
                            i12++;
                        }
                    }
                }
                arrayList2.add(new g00.k(sVar2.h(), va.a.W(sVar2)));
                break;
                if (i11 == iM) {
                    break;
                }
                i11++;
            }
        }
        h00.u.t0(arrayList2, i.D);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = f7928a[c10 ^ 1];
        int size2 = arrayList2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            g00.k kVar = (g00.k) arrayList2.get(i13);
            h00.u.t0((List) kVar.B, comparator);
            arrayList3.addAll((Collection) kVar.B);
        }
        h00.u.t0(arrayList3, new fg.d(f7929b, 2));
        int size3 = 0;
        while (size3 <= va.a.M(arrayList3)) {
            List list2 = (List) wVar2.b(((s) arrayList3.get(size3)).f7970f);
            if (list2 != null) {
                if (((Boolean) aVar2.invoke(arrayList3.get(size3))).booleanValue()) {
                    size3++;
                } else {
                    arrayList3.remove(size3);
                }
                arrayList3.addAll(size3, list2);
                size3 += list2.size();
            } else {
                size3++;
            }
        }
        return arrayList3;
    }
}

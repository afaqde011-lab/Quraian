package ko;

import a10.h0;
import h00.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e extends h0 {
    public static lo.i X(f fVar) {
        Object obj;
        Integer num = fVar.c;
        List list = fVar.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            ho.f fVar2 = (ho.f) obj2;
            if (fVar2.a == fVar.a) {
                if (num != null) {
                    Integer num2 = fVar2.b;
                    int iIntValue = num.intValue();
                    if (num2 != null && num2.intValue() == iIntValue) {
                    }
                }
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                float f = ((ho.f) next).c;
                do {
                    Object next2 = it.next();
                    float f2 = ((ho.f) next2).c;
                    if (Float.compare(f, f2) < 0) {
                        next = next2;
                        f = f2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        ho.f fVar3 = (ho.f) obj;
        if (fVar3 != null) {
            return new lo.g(fVar3.c);
        }
        List list2 = fVar.b;
        ArrayList<ho.g> arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            ho.g gVar = (ho.g) obj3;
            if (num == null || gVar.a == num.intValue()) {
                arrayList2.add(obj3);
            }
        }
        if (!arrayList2.isEmpty()) {
            if (!arrayList2.isEmpty()) {
                for (ho.g gVar2 : arrayList2) {
                    List list3 = fVar.d;
                    List list4 = gVar2.n;
                    ArrayList arrayList3 = new ArrayList(r.q0(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((ho.m) it2.next()).a);
                    }
                    boolean zIsEmpty = arrayList3.isEmpty();
                    List<String> listR = arrayList3;
                    if (zIsEmpty) {
                        listR = va.a.R(gVar2.c);
                    }
                    if (!listR.isEmpty()) {
                        for (String str : listR) {
                            if (list3 == null || !list3.isEmpty()) {
                                Iterator it3 = list3.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        ho.d dVar = (ho.d) it3.next();
                                        if (dVar.a != gVar2.a || !kotlin.jvm.internal.m.a(dVar.b, str)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return lo.f.a;
        }
        return lo.h.a;
    }
}

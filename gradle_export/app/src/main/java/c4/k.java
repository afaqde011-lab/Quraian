package c4;

import java.util.ArrayList;
import java.util.List;
import q0.h2;
import z2.l1;
import z2.v0;
import z2.w0;
import z2.x0;
import z2.y0;

public final class k implements w0 {

    public final int f2835a;

    public final Object f2836b;

    public final Object f2837c;

    public k(Object obj, Object obj2, int i10) {
        this.f2835a = i10;
        this.f2836b = obj;
        this.f2837c = obj2;
    }

    @Override
    public final x0 j(y0 y0Var, List list, long j9) {
        ArrayList arrayList;
        g00.k kVar;
        switch (this.f2835a) {
            case 0:
                ((z) this.f2836b).setParentLayoutDirection((y3.m) this.f2837c);
                return y0Var.o0(0, 0, h00.y.A, b.D);
            default:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = list.get(i10);
                    if (!(((v0) obj).U() instanceof h2)) {
                        arrayList2.add(obj);
                    }
                }
                List list2 = (List) ((u00.a) this.f2837c).invoke();
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    int size2 = list2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        h2.c cVar = (h2.c) list2.get(i11);
                        if (cVar != null) {
                            float f3 = cVar.f6547b;
                            float f10 = cVar.f6546a;
                            l1 l1VarO = ((v0) arrayList2.get(i11)).O(y3.b.b(0, (int) Math.floor(cVar.f6548c - f10), 0, (int) Math.floor(cVar.f6549d - f3), 5));
                            int iRound = Math.round(f10);
                            kVar = new g00.k(l1VarO, new y3.j((((long) Math.round(f3)) & 4294967295L) | (((long) iRound) << 32)));
                        } else {
                            kVar = null;
                        }
                        ArrayList arrayList4 = arrayList3;
                        if (kVar != null) {
                            arrayList4.add(kVar);
                        }
                        i11++;
                        arrayList3 = arrayList4;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList5 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    Object obj2 = list.get(i12);
                    if (((v0) obj2).U() instanceof h2) {
                        arrayList5.add(obj2);
                    }
                }
                return y0Var.o0(y3.a.h(j9), y3.a.g(j9), h00.y.A, new mu.q(arrayList, q0.q.q(arrayList5, (u00.a) this.f2836b), 10));
        }
    }
}

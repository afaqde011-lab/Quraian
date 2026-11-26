package hw;

import g00.b0;
import g00.k;
import h00.d0;
import h00.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ri.t1;
import u00.o;

public final class h extends m00.i implements o {
    public final int A;
    public List B;
    public List C;

    public h(int i, k00.c cVar, int i2) {
        super(i, cVar);
        this.A = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        List list2 = (List) obj2;
        k00.c cVar = (k00.c) obj3;
        switch (this.A) {
            case 0:
                h hVar = new h(3, cVar, 0);
                hVar.B = list;
                hVar.C = list2;
                return hVar.invokeSuspend(b0.a);
            case 1:
                h hVar2 = new h(3, cVar, 1);
                hVar2.B = list;
                hVar2.C = list2;
                return hVar2.invokeSuspend(b0.a);
            default:
                h hVar3 = new h(3, cVar, 2);
                hVar3.B = list;
                hVar3.C = list2;
                return hVar3.invokeSuspend(b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                List list = this.B;
                List list2 = this.C;
                l00.a aVar = l00.a.A;
                t1.O(obj);
                return Boolean.valueOf(list.isEmpty() && list2.isEmpty());
            case 1:
                List list3 = this.B;
                List list4 = this.C;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                int iP = d0.P(r.q0(list3, 10));
                if (iP < 16) {
                    iP = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
                for (Object obj2 : list3) {
                    linkedHashMap.put(new Integer(((bx.c) obj2).a), obj2);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    bx.c cVar = (bx.c) linkedHashMap.get(new Integer(((Number) it.next()).intValue()));
                    if (cVar != null) {
                        arrayList.add(cVar);
                    }
                }
                return new k(list3, arrayList);
            default:
                List list5 = this.B;
                List list6 = this.C;
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                return new k(list5, list6);
        }
    }
}

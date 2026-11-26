package hx;

import com.google.android.gms.internal.measurement.g4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import nx.i0;
import ri.t1;

public final class d0 extends m00.i implements u00.p {
    public final int A;
    public List B;
    public Object C;
    public Object D;

    public d0(int i, k00.c cVar, int i2) {
        super(i, cVar);
        this.A = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        List list = (List) obj;
        switch (this.A) {
            case 0:
                d0 d0Var = new d0(4, (k00.c) obj4, 0);
                d0Var.B = list;
                d0Var.C = (List) obj2;
                d0Var.D = (List) obj3;
                return d0Var.invokeSuspend(g00.b0.a);
            case 1:
                d0 d0Var2 = new d0(4, (k00.c) obj4, 1);
                d0Var2.B = list;
                d0Var2.C = (i0) obj2;
                d0Var2.D = (i0) obj3;
                return d0Var2.invokeSuspend(g00.b0.a);
            case 2:
                d0 d0Var3 = new d0(4, (k00.c) obj4, 2);
                d0Var3.B = list;
                d0Var3.C = (List) obj2;
                d0Var3.D = (bx.c) obj3;
                return d0Var3.invokeSuspend(g00.b0.a);
            default:
                d0 d0Var4 = new d0(4, (k00.c) obj4, 3);
                d0Var4.B = list;
                d0Var4.C = (List) obj2;
                d0Var4.D = (mr.a) obj3;
                return d0Var4.invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        switch (this.A) {
            case 0:
                List list = this.B;
                List list2 = (List) this.C;
                List<bx.d> list3 = (List) this.D;
                l00.a aVar = l00.a.A;
                t1.O(obj);
                int iP = h00.d0.P(h00.r.q0(list, 10));
                if (iP < 16) {
                    iP = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
                for (Object obj2 : list) {
                    linkedHashMap.put(new Integer(((bx.c) obj2).a), obj2);
                }
                ArrayList arrayList2 = new ArrayList(h00.r.q0(list3, 10));
                for (bx.d dVar : list3) {
                    kotlin.jvm.internal.m.e(dVar, "<this>");
                    String str = dVar.c;
                    if (str.equalsIgnoreCase("my-favourites")) {
                        arrayList = new ArrayList();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Number) it.next()).intValue();
                            bx.c cVar = (bx.c) linkedHashMap.get(new Integer(iIntValue));
                            fx.b bVar = cVar != null ? new fx.b(iIntValue, null, cVar) : null;
                            if (bVar != null) {
                                arrayList.add(bVar);
                            }
                        }
                    } else {
                        u30.b<bx.a> bVar2 = dVar.b;
                        ArrayList arrayList3 = new ArrayList();
                        for (bx.a aVar2 : bVar2) {
                            bx.c cVar2 = (bx.c) linkedHashMap.get(new Integer(aVar2.a));
                            fx.b bVar3 = cVar2 != null ? new fx.b(aVar2.a, aVar2.b, cVar2) : null;
                            if (bVar3 != null) {
                                arrayList3.add(bVar3);
                            }
                        }
                        arrayList = arrayList3;
                    }
                    arrayList2.add(new fx.a(dVar.a, g4.d0(arrayList), str, dVar.d));
                }
                return arrayList2;
            case 1:
                List list4 = this.B;
                i0 i0Var = (i0) this.C;
                i0 i0Var2 = (i0) this.D;
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                return i0.a(i0Var2, i0Var.b, i0Var.c, null, null, ze.d.E(list4), null, false, null, false, false, false, null, false, false, 65497);
            case 2:
                List list5 = this.B;
                List list6 = (List) this.C;
                bx.c cVar3 = (bx.c) this.D;
                l00.a aVar4 = l00.a.A;
                t1.O(obj);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list5) {
                    zq.a aVar5 = (zq.a) obj3;
                    if (cVar3 != null && aVar5.b == cVar3.a) {
                        arrayList4.add(obj3);
                    }
                }
                ArrayList arrayList5 = new ArrayList(h00.r.q0(arrayList4, 10));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(new Long(((zq.a) it2.next()).a));
                }
                return new qr.d(g4.d0(list5), ze.d.E(list6), g4.d0(arrayList5));
            default:
                List list7 = this.B;
                List list8 = (List) this.C;
                mr.a aVar6 = (mr.a) this.D;
                l00.a aVar7 = l00.a.A;
                t1.O(obj);
                return new g00.q(list7, list8, aVar6);
        }
    }
}

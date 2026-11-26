package bt;

import com.mchutov.quranify.player.domain.model.PlayerItem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class b1 extends m00.i implements u00.r {
    public final int A;
    public Object B;
    public Object C;
    public Object D;
    public Object E;
    public Object F;

    public b1(int i, k00.c cVar) {
        super(6, cVar);
        this.A = i;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        List<ev.w> listY0;
        ArrayList arrayList;
        ?? hashSet;
        switch (this.A) {
            case 0:
                ys.b bVar = (ys.b) this.B;
                ys.f fVar = (ys.f) this.C;
                u30.b bVar2 = (u30.b) this.D;
                ys.m mVar = (ys.m) this.E;
                ys.a aVar = (ys.a) this.F;
                l00.a aVar2 = l00.a.A;
                ri.t1.O(obj);
                return new x(bVar, fVar, bVar2, mVar, aVar);
            case 1:
                dv.a aVar3 = (dv.a) this.B;
                dv.d dVar = (dv.d) this.C;
                dv.c cVar = (dv.c) this.D;
                dv.f fVar2 = (dv.f) this.E;
                dv.b bVar3 = (dv.b) this.F;
                l00.a aVar4 = l00.a.A;
                ri.t1.O(obj);
                return new dv.e(aVar3, dVar, cVar, fVar2, bVar3);
            default:
                List reciters = (List) this.B;
                String query = (String) this.C;
                ev.u uVar = (ev.u) this.D;
                bx.c cVar2 = (bx.c) this.E;
                PlayerItem playerItem = (PlayerItem) this.F;
                l00.a aVar5 = l00.a.A;
                ri.t1.O(obj);
                uVar.getClass();
                HashSet hashSet2 = uVar.b;
                kotlin.jvm.internal.m.e(reciters, "reciters");
                boolean z = uVar.a;
                if (z) {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : reciters) {
                        if (hashSet2.contains(Integer.valueOf(((ev.w) obj2).a.a))) {
                            arrayList2.add(obj2);
                        } else {
                            arrayList3.add(obj2);
                        }
                    }
                    listY0 = h00.q.Y0(arrayList3, arrayList2);
                } else {
                    listY0 = reciters;
                }
                kotlin.jvm.internal.m.e(query, "query");
                ArrayList arrayListD = ay.e.d(query);
                if (arrayListD.isEmpty()) {
                    arrayList = new ArrayList(h00.r.q0(listY0, 10));
                    Iterator it = listY0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ev.w) it.next()).a);
                    }
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    for (ev.w wVar : listY0) {
                        bx.c cVar3 = wVar.a;
                        r30.j jVar = ay.e.a;
                        if (!ay.e.b(arrayListD, wVar.b)) {
                            cVar3 = null;
                        }
                        if (cVar3 != null) {
                            arrayList4.add(cVar3);
                        }
                    }
                    arrayList = arrayList4;
                }
                if (z) {
                    hashSet = new HashSet();
                    Iterator it2 = reciters.iterator();
                    while (it2.hasNext()) {
                        int i = ((ev.w) it2.next()).a.a;
                        Integer numValueOf = Integer.valueOf(i);
                        if (hashSet2.contains(Integer.valueOf(i))) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            hashSet.add(numValueOf);
                        }
                    }
                } else {
                    hashSet = h00.z.A;
                }
                return new ev.v(reciters, arrayList, hashSet, cVar2 != null ? cVar2.a : 0, playerItem);
        }
    }

    @Override
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        switch (this.A) {
            case 0:
                b1 b1Var = new b1(0, (k00.c) obj6);
                b1Var.B = (ys.b) obj;
                b1Var.C = (ys.f) obj2;
                b1Var.D = (u30.b) obj3;
                b1Var.E = (ys.m) obj4;
                b1Var.F = (ys.a) obj5;
                return b1Var.invokeSuspend(g00.b0.a);
            case 1:
                b1 b1Var2 = new b1(1, (k00.c) obj6);
                b1Var2.B = (dv.a) obj;
                b1Var2.C = (dv.d) obj2;
                b1Var2.D = (dv.c) obj3;
                b1Var2.E = (dv.f) obj4;
                b1Var2.F = (dv.b) obj5;
                return b1Var2.invokeSuspend(g00.b0.a);
            default:
                b1 b1Var3 = new b1(2, (k00.c) obj6);
                b1Var3.B = (List) obj;
                b1Var3.C = (String) obj2;
                b1Var3.D = (ev.u) obj3;
                b1Var3.E = (bx.c) obj4;
                b1Var3.F = (PlayerItem) obj5;
                return b1Var3.invokeSuspend(g00.b0.a);
        }
    }
}

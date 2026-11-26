package vn;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import ri.t1;

public final class d extends m00.i implements u00.o {
    public List A;
    public List B;
    public final f C;
    public final String D;
    public final String E;

    public d(String str, String str2, k00.c cVar, f fVar) {
        super(3, cVar);
        this.C = fVar;
        this.D = str;
        this.E = str2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d dVar = new d(this.D, this.E, (k00.c) obj3, this.C);
        dVar.A = (List) obj;
        dVar.B = (List) obj2;
        return dVar.invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        bo.c cVar;
        long j;
        long j2;
        boolean z;
        List<ho.a> list = this.A;
        List list2 = this.B;
        l00.a aVar = l00.a.A;
        t1.O(obj);
        int iP = h00.d0.P(h00.r.q0(list2, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
        for (Object obj2 : list2) {
            bo.c cVar2 = (bo.c) obj2;
            linkedHashMap.put(new g00.k(new Integer(cVar2.a), cVar2.b), obj2);
        }
        ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
        for (ho.a aVar2 : list) {
            List<ho.g> list3 = aVar2.g;
            ArrayList arrayList2 = new ArrayList(h00.r.q0(list3, 10));
            for (ho.g gVarA : list3) {
                String str = this.E;
                if (str == null || (cVar = (bo.c) linkedHashMap.get(new g00.k(Integer.valueOf(gVarA.a), str))) == null) {
                    Integer numValueOf = Integer.valueOf(gVarA.a);
                    String str2 = gVarA.c;
                    if (r30.k.L0(str2)) {
                        str2 = this.D;
                    }
                    cVar = (bo.c) linkedHashMap.get(new g00.k(numValueOf, str2));
                    if (cVar != null) {
                        j = cVar.c;
                        j2 = gVarA.f;
                        if (j2 > 0 && j > j2) {
                            j = j2;
                        }
                        long j3 = j;
                        if (!cVar.d || gVarA.l) {
                            z = true;
                        } else {
                            z = false;
                        }
                        gVarA = ho.g.a(gVarA, 0, null, null, 0L, null, j3, z, 0, 13311);
                    }
                } else {
                    j = cVar.c;
                    j2 = gVarA.f;
                    if (j2 > 0) {
                        j = j2;
                    }
                    long j4 = j;
                    if (cVar.d) {
                        z = true;
                    } else {
                        z = true;
                    }
                    gVarA = ho.g.a(gVarA, 0, null, null, 0L, null, j4, z, 0, 13311);
                }
                arrayList2.add(gVarA);
            }
            arrayList.add(ho.a.a(aVar2, arrayList2));
        }
        return arrayList;
    }
}

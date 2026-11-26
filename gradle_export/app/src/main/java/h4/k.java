package h4;

import java.util.ArrayList;

public final class k {

    public n f6589a;

    public ArrayList f6590b;

    public static long a(e eVar, long j9) {
        n nVar = eVar.f6579d;
        ArrayList arrayList = eVar.f6586k;
        if (nVar instanceof i) {
            return j9;
        }
        int size = arrayList.size();
        long jMin = j9;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof e) {
                e eVar2 = (e) dVar;
                if (eVar2.f6579d != nVar) {
                    jMin = Math.min(jMin, a(eVar2, ((long) eVar2.f6581f) + j9));
                }
            }
        }
        e eVar3 = nVar.f6606i;
        e eVar4 = nVar.f6605h;
        if (eVar != eVar3) {
            return jMin;
        }
        long j10 = j9 - nVar.j();
        return Math.min(Math.min(jMin, a(eVar4, j10)), j10 - ((long) eVar4.f6581f));
    }

    public static long b(e eVar, long j9) {
        n nVar = eVar.f6579d;
        ArrayList arrayList = eVar.f6586k;
        if (nVar instanceof i) {
            return j9;
        }
        int size = arrayList.size();
        long jMax = j9;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof e) {
                e eVar2 = (e) dVar;
                if (eVar2.f6579d != nVar) {
                    jMax = Math.max(jMax, b(eVar2, ((long) eVar2.f6581f) + j9));
                }
            }
        }
        e eVar3 = nVar.f6605h;
        e eVar4 = nVar.f6606i;
        if (eVar != eVar3) {
            return jMax;
        }
        long j10 = nVar.j() + j9;
        return Math.max(Math.max(jMax, b(eVar4, j10)), j10 - ((long) eVar4.f6581f));
    }
}

package et;

import a10.h0;
import ft.e;
import h00.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a extends h0 {
    public final List X(List list) {
        ot.a aVar;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (eVar != null) {
                    Integer ayah = eVar.getAyah();
                    int iIntValue = ayah != null ? ayah.intValue() : 0;
                    Long startTime = eVar.getStartTime();
                    long jLongValue = startTime != null ? startTime.longValue() : 0L;
                    Long endTime = eVar.getEndTime();
                    aVar = new ot.a(iIntValue, jLongValue, endTime != null ? endTime.longValue() : 0L);
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    arrayList2.add(aVar);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? x.A : arrayList;
    }
}

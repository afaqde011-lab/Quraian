package uw;

import a10.h0;
import com.google.android.gms.internal.measurement.g4;
import h00.x;
import java.util.ArrayList;
import java.util.List;

public final class f extends h0 {
    public static List X(vw.b bVar) {
        List<vw.b.a> collections;
        ?? arrayList;
        List<vw.b.C0025b> reciters;
        Integer num;
        Integer num2;
        x xVar = x.A;
        ArrayList arrayList2 = null;
        if (bVar != null && (collections = bVar.getCollections()) != null) {
            ArrayList arrayList3 = new ArrayList();
            for (vw.b.a aVar : collections) {
                int iIntValue = (aVar == null || (num2 = aVar.getCom.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.ID_KEY java.lang.String()) == null) ? 0 : num2.intValue();
                String slug = aVar != null ? aVar.getSlug() : null;
                if (slug == null) {
                    slug = "";
                }
                String title = aVar != null ? aVar.getTitle() : null;
                String str = title != null ? title : "";
                if (aVar == null || (reciters = aVar.getReciters()) == null) {
                    arrayList = 0;
                } else {
                    arrayList = new ArrayList();
                    for (vw.b.C0025b c0025b : reciters) {
                        bx.a aVar2 = (c0025b == null || (num = c0025b.getCom.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.ID_KEY java.lang.String()) == null) ? null : new bx.a(num.intValue(), c0025b.getRequestsCount());
                        if (aVar2 != null) {
                            arrayList.add(aVar2);
                        }
                    }
                }
                if (arrayList == 0) {
                    arrayList = xVar;
                }
                arrayList3.add(new bx.d(iIntValue, g4.d0((Iterable) arrayList), slug, str));
            }
            arrayList2 = arrayList3;
        }
        return arrayList2 == null ? xVar : arrayList2;
    }
}

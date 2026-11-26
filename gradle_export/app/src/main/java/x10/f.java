package x10;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class f {
    public static final Object a;
    public static final LinkedHashMap b;
    public static final Set c;
    public static final Set d;

    static {
        n20.d dVar = g10.o.j;
        g00.k kVar = new g00.k(dVar.a(n20.e.e(DiagnosticsEntry.NAME_KEY)).i(), g10.p.d);
        g00.k kVar2 = new g00.k(dVar.a(n20.e.e("ordinal")).i(), n20.e.e("ordinal"));
        g00.k kVar3 = new g00.k(bi.b.j("size", g10.o.C), n20.e.e("size"));
        n20.c cVar = g10.o.G;
        Map mapR = h00.d0.R(kVar, kVar2, kVar3, new g00.k(bi.b.j("size", cVar), n20.e.e("size")), new g00.k(g10.o.e.a(n20.e.e("length")).i(), n20.e.e("length")), new g00.k(bi.b.j("keys", cVar), n20.e.e("keySet")), new g00.k(bi.b.j("values", cVar), n20.e.e("values")), new g00.k(bi.b.j("entries", cVar), n20.e.e("entrySet")), new g00.k(bi.b.j("size", g10.o.a0), n20.e.e("length")), new g00.k(bi.b.j("size", g10.o.b0), n20.e.e("length")), new g00.k(bi.b.j("size", g10.o.c0), n20.e.e("length")));
        a = mapR;
        Set<Map.Entry> setEntrySet = mapR.entrySet();
        ArrayList<g00.k> arrayList = new ArrayList(h00.r.q0(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new g00.k(((n20.c) entry.getKey()).a.g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (g00.k kVar4 : arrayList) {
            n20.e eVar = (n20.e) kVar4.B;
            Object arrayList2 = linkedHashMap.get(eVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(eVar, arrayList2);
            }
            ((List) arrayList2).add((n20.e) kVar4.A);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(h00.d0.P(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), h00.q.G0((Iterable) entry2.getValue()));
        }
        b = linkedHashMap2;
        ?? r0 = a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r0.entrySet()) {
            String str = i10.d.a;
            n20.b bVarG = i10.d.g(((n20.c) entry3.getKey()).b().a);
            kotlin.jvm.internal.m.b(bVarG);
            linkedHashSet.add(bVarG.a().a((n20.e) entry3.getValue()));
        }
        Set setKeySet = a.keySet();
        c = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(h00.r.q0(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((n20.c) it.next()).a.g());
        }
        d = h00.q.r1(arrayList3);
    }
}

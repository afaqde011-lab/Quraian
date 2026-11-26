package f20;

import h00.d0;
import java.util.LinkedHashMap;
import java.util.Map;

public final class r {
    public final LinkedHashMap a;

    public r(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final r a() {
        LinkedHashMap linkedHashMap = this.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d0.P(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            e eVar = (e) entry.getValue();
            linkedHashMap2.put(key, new e(eVar.a, eVar.b, eVar.c, true));
        }
        return new r(linkedHashMap2);
    }
}

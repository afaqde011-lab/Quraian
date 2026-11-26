package p9;

import java.util.LinkedHashMap;
import java.util.Map;
import u00.k;

public final class d {

    public final LinkedHashMap f12465a = new LinkedHashMap();

    public final LinkedHashMap f12466b = new LinkedHashMap();

    public final void a(a10.d dVar, k kVar, Map map, v1.c cVar) {
        LinkedHashMap linkedHashMap = this.f12465a;
        if (!linkedHashMap.containsKey(dVar)) {
            linkedHashMap.put(dVar, new c(dVar, kVar, map, cVar));
            return;
        }
        throw new IllegalArgumentException(("An `entry` with the same `clazz` has already been added: " + dVar.n() + '.').toString());
    }
}

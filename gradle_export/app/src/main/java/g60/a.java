package g60;

import a10.d;
import java.util.concurrent.ConcurrentHashMap;
import k00.f;
import kotlin.jvm.internal.m;

public abstract class a {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final String a(d dVar) {
        m.e(dVar, "<this>");
        ConcurrentHashMap concurrentHashMap = a;
        String str = (String) concurrentHashMap.get(dVar);
        if (str != null) {
            return str;
        }
        String name = f.D(dVar).getName();
        concurrentHashMap.put(dVar, name);
        return name;
    }
}

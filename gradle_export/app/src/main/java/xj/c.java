package xj;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m;

public final class c {

    public static final c f16578a = new c();

    public static final Map f16579b = Collections.synchronizedMap(new LinkedHashMap());

    public static a a(d dVar) {
        Map map = f16579b;
        m.d(map, "dependencies");
        Object obj = map.get(dVar);
        if (obj != null) {
            return (a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + dVar + ". Dependencies should be added at class load time.");
    }

    public final java.lang.Object b(m00.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: xj.c.b(m00.c):java.lang.Object");
    }
}

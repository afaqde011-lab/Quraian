package r40;

import ri.t1;

public abstract class c {
    public static final int a;

    static {
        Object objS;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.m.d(property, "getProperty(...)");
            objS = r30.r.y0(property);
        } catch (Throwable th) {
            objS = t1.s(th);
        }
        if (objS instanceof g00.m) {
            objS = null;
        }
        Integer num = (Integer) objS;
        a = num != null ? num.intValue() : 2097152;
    }
}

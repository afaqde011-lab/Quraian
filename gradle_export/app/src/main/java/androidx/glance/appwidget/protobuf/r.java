package androidx.glance.appwidget.protobuf;

import java.util.Collections;
import java.util.Map;

public final class r {

    public static volatile r f950a;

    public static final r f951b;

    static {
        r rVar = new r();
        Map map = Collections.EMPTY_MAP;
        f951b = rVar;
    }

    public static r a() {
        r rVar;
        w0 w0Var = w0.f961c;
        r rVar2 = f950a;
        if (rVar2 != null) {
            return rVar2;
        }
        synchronized (r.class) {
            try {
                rVar = f950a;
                if (rVar == null) {
                    Class cls = q.f936a;
                    r rVar3 = null;
                    if (cls != null) {
                        try {
                            rVar3 = (r) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    rVar = rVar3 != null ? rVar3 : f951b;
                    f950a = rVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVar;
    }
}

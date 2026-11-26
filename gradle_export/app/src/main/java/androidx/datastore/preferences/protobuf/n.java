package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

public final class n {

    public static volatile n f663a;

    public static final n f664b;

    static {
        n nVar = new n();
        Map map = Collections.EMPTY_MAP;
        f664b = nVar;
    }

    public static n a() {
        n nVar;
        r0 r0Var = r0.f672c;
        n nVar2 = f663a;
        if (nVar2 != null) {
            return nVar2;
        }
        synchronized (n.class) {
            try {
                nVar = f663a;
                if (nVar == null) {
                    Class cls = m.f659a;
                    n nVar3 = null;
                    if (cls != null) {
                        try {
                            nVar3 = (n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    nVar = nVar3 != null ? nVar3 : f664b;
                    f663a = nVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }
}

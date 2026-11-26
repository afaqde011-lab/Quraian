package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
import java.util.Map;

public final class p {

    public static volatile p f4306a;

    public static final p f4307b;

    static {
        p pVar = new p();
        Map map = Collections.EMPTY_MAP;
        f4307b = pVar;
    }

    public static p a() {
        p pVar;
        p pVar2 = f4306a;
        if (pVar2 != null) {
            return pVar2;
        }
        synchronized (p.class) {
            try {
                pVar = f4306a;
                if (pVar == null) {
                    Class cls = o.f4305a;
                    p pVar3 = null;
                    if (cls != null) {
                        try {
                            pVar3 = (p) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    pVar = pVar3 != null ? pVar3 : f4307b;
                    f4306a = pVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVar;
    }
}

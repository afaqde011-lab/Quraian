package kotlin.jvm.internal;

import d10.y1;
import java.util.Collections;

public abstract class a0 {
    public static final b0 a;

    static {
        b0 b0Var = null;
        try {
            b0Var = (b0) y1.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (b0Var == null) {
            b0Var = new b0();
        }
        a = b0Var;
    }

    public static a10.x a(Class cls, a10.z zVar) {
        b0 b0Var = a;
        return b0Var.l(b0Var.b(cls), Collections.singletonList(zVar), false);
    }
}

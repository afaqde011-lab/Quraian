package d10;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public abstract class d2 {
    public static final a10.x a;
    public static final a10.x b;
    public static final a10.x c;
    public static final a10.x d;

    static {
        kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
        a10.d dVarB = b0Var.b(Object.class);
        List list = Collections.EMPTY_LIST;
        a = b0Var.l(dVarB, list, false);
        b = b0Var.l(b0Var.b(Object.class), list, true);
        c = b0Var.l(b0Var.b(Cloneable.class), list, false);
        d = b0Var.l(b0Var.b(Serializable.class), list, false);
    }
}

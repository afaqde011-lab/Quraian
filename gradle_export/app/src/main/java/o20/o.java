package o20;

import java.io.Serializable;
import java.util.Collections;

public abstract class o extends b implements Serializable {
    public static n e(b bVar, b bVar2, int i, l0 l0Var, Class cls) {
        return new n(bVar, Collections.EMPTY_LIST, bVar2, new m(i, l0Var, true), cls);
    }

    public static n f(b bVar, Object obj, b bVar2, int i, l0 l0Var, Class cls) {
        return new n(bVar, obj, bVar2, new m(i, l0Var, false), cls);
    }
}

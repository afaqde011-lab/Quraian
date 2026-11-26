package z2;

import java.util.Map;

public interface y0 extends w {
    x0 J(int i10, int i11, Map map, u00.k kVar, u00.k kVar2);

    default x0 o0(int i10, int i11, Map map, u00.k kVar) {
        return J(i10, i11, map, null, kVar);
    }
}

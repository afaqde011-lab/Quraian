package mb;

import l1.g0;

public final class n extends kotlin.jvm.internal.n implements u00.o {
    public static final n A = new n(3);

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x xVar = (x) obj;
        l1.j jVar = (l1.j) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= ((g0) jVar).g(xVar) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18) {
            g0 g0Var = (g0) jVar;
            if (g0Var.C()) {
                g0Var.V();
            } else {
                l.f(xVar, null, null, null, null, 0.0f, false, jVar, iIntValue & 14);
            }
        } else {
            l.f(xVar, null, null, null, null, 0.0f, false, jVar, iIntValue & 14);
        }
        return g00.b0.a;
    }
}

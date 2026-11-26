package c3;

public final class i1 extends kotlin.jvm.internal.n implements u00.n {
    public static final i1 A = new i1(2);

    public final Object invoke(Object obj, Object obj2) {
        l1.j jVar = (l1.j) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.g0 g0Var = (l1.g0) jVar;
        if (!g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
            g0Var.V();
        }
        return g00.b0.a;
    }
}

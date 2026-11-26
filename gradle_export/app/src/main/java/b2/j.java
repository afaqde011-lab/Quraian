package b2;

public final class j extends kotlin.jvm.internal.n implements u00.n {
    public static final j A = new j(2);

    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        p pVar = (p) obj2;
        if (str.length() == 0) {
            return pVar.toString();
        }
        return str + ", " + pVar;
    }
}

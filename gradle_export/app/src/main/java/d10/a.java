package d10;

public abstract class a {
    public static final int a = 0;

    static {
        Object objS;
        try {
            objS = Class.forName("java.lang.ClassValue");
        } catch (Throwable th) {
            objS = ri.t1.s(th);
        }
        if (!(objS instanceof g00.m)) {
            objS = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (objS instanceof g00.m) {
            objS = obj;
        }
    }
}

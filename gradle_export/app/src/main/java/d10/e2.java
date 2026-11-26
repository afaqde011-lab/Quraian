package d10;

public abstract class e2 {
    public static final boolean a;
    public static final boolean b;

    static {
        Object objS;
        Object objS2;
        try {
            objS = System.getProperty("kotlin.reflect.jvm.useK1Implementation");
        } catch (Throwable th) {
            objS = ri.t1.s(th);
        }
        if (objS instanceof g00.m) {
            objS = null;
        }
        String str = (String) objS;
        boolean z = false;
        a = str != null && Boolean.parseBoolean(str);
        try {
            objS2 = System.getProperty("kotlin.reflect.jvm.loadMetadataDirectly");
        } catch (Throwable th2) {
            objS2 = ri.t1.s(th2);
        }
        String str2 = (String) (objS2 instanceof g00.m ? null : objS2);
        if (str2 != null && Boolean.parseBoolean(str2)) {
            z = true;
        }
        b = z;
    }
}

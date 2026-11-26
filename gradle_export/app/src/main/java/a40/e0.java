package a40;

public abstract class e0 {
    public static final h0 a;

    static {
        String property;
        h0 h0Var;
        int i = f40.s.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            h40.e eVar = m0.a;
            b40.c cVar = f40.m.a;
            b40.c cVar2 = cVar.F;
            h0Var = cVar;
            if (cVar == null) {
                h0Var = d0.J;
            }
        } else {
            h0Var = d0.J;
        }
        a = h0Var;
    }
}

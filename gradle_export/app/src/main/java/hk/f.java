package hk;

import java.sql.Date;
import java.sql.Timestamp;

public abstract class f {

    public static final boolean f7076a;

    public static final a.C0000a f7077b;

    public static final b.a f7078c;

    public static final c f7079d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f7076a = z10;
        if (!z10) {
            f7077b = null;
            f7078c = null;
            f7079d = null;
        } else {
            new e(0, Date.class);
            new e(1, Timestamp.class);
            f7077b = a.f7069b;
            f7078c = b.f7071b;
            f7079d = d.f7073b;
        }
    }
}

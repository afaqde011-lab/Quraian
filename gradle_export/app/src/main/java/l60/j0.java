package l60;

public abstract class j0 {
    public static final com.google.android.gms.common.api.internal.b0 a;
    public static final a b;
    public static final a c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        int i = 6;
        if (property.equals("RoboVM")) {
            a = null;
            b = new a(7);
            c = new a(i);
        } else if (property.equals("Dalvik")) {
            a = new com.google.android.gms.common.api.internal.b0();
            b = new k0(0);
            c = new c(i);
        } else {
            a = null;
            b = new k0(1);
            c = new c(i);
        }
    }
}

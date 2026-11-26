package androidx.datastore.preferences.protobuf;

public abstract class c {

    public static final Class f594a;

    public static final boolean f595b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f594a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f595b = cls2 != null;
    }

    public static boolean a() {
        return (f594a == null || f595b) ? false : true;
    }
}

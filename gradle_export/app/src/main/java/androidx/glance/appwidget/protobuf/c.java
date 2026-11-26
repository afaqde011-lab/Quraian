package androidx.glance.appwidget.protobuf;

public abstract class c {

    public static final Class f873a;

    public static final boolean f874b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f873a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f874b = cls2 != null;
    }

    public static boolean a() {
        return (f873a == null || f874b) ? false : true;
    }
}

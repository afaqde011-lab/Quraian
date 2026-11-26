package com.google.crypto.tink.shaded.protobuf;

public abstract class c {

    public static final Class f4250a;

    public static final boolean f4251b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f4250a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f4251b = cls2 != null;
    }

    public static boolean a() {
        return (f4250a == null || f4251b) ? false : true;
    }
}

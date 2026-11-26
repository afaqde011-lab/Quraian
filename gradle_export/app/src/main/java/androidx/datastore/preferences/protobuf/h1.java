package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class h1 {

    public static final Unsafe f613a;

    public static final Class f614b;

    public static final g1 f615c;

    public static final boolean f616d;

    public static final boolean f617e;

    public static final long f618f;

    public static final boolean f619g;

    static {
        Unsafe unsafeI = i();
        f613a = unsafeI;
        f614b = c.f594a;
        boolean zH = h(Long.TYPE);
        boolean zH2 = h(Integer.TYPE);
        g1 f1Var = null;
        if (unsafeI != null) {
            if (!c.a()) {
                f1Var = new f1(unsafeI);
            } else if (zH) {
                f1Var = new e1(unsafeI, 1);
            } else if (zH2) {
                f1Var = new e1(unsafeI, 0);
            }
        }
        f615c = f1Var;
        f616d = f1Var == null ? false : f1Var.r();
        f617e = f1Var == null ? false : f1Var.q();
        f618f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field fieldG = g();
        if (fieldG != null && f1Var != null) {
            f1Var.i(fieldG);
        }
        f619g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th2) {
        Logger.getLogger(h1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static boolean b(Object obj, long j9) {
        return ((byte) ((f615c.f(obj, (-4) & j9) >>> ((int) (((~j9) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(Object obj, long j9) {
        return ((byte) ((f615c.f(obj, (-4) & j9) >>> ((int) ((j9 & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f613a.allocateInstance(cls);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static int e(Class cls) {
        if (f617e) {
            return f615c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f617e) {
            f615c.b(cls);
        }
    }

    public static Field g() {
        Field declaredField;
        Field declaredField2;
        if (c.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean h(Class cls) {
        if (!c.a()) {
            return false;
        }
        try {
            Class cls2 = f614b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new d1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j9, byte b7) {
        f615c.k(bArr, f618f + j9, b7);
    }

    public static void k(Object obj, long j9, byte b7) {
        long j10 = (-4) & j9;
        int iF = f615c.f(obj, j10);
        int i10 = ((~((int) j9)) & 3) << 3;
        m(obj, j10, ((255 & b7) << i10) | (iF & (~(255 << i10))));
    }

    public static void l(Object obj, long j9, byte b7) {
        long j10 = (-4) & j9;
        int i10 = (((int) j9) & 3) << 3;
        m(obj, j10, ((255 & b7) << i10) | (f615c.f(obj, j10) & (~(255 << i10))));
    }

    public static void m(Object obj, long j9, int i10) {
        f615c.n(obj, j9, i10);
    }

    public static void n(Object obj, long j9, long j10) {
        f615c.o(obj, j9, j10);
    }

    public static void o(Object obj, long j9, Object obj2) {
        f615c.p(obj, j9, obj2);
    }
}

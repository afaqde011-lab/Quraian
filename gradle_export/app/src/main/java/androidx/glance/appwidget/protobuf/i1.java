package androidx.glance.appwidget.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class i1 {

    public static final Unsafe f892a;

    public static final Class f893b;

    public static final h1 f894c;

    public static final boolean f895d;

    public static final boolean f896e;

    public static final long f897f;

    public static final boolean f898g;

    static {
        Unsafe unsafeJ = j();
        f892a = unsafeJ;
        f893b = c.f873a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        h1 g1Var = null;
        if (unsafeJ != null) {
            if (!c.a()) {
                g1Var = new g1(unsafeJ);
            } else if (zF) {
                g1Var = new f1(unsafeJ, 1);
            } else if (zF2) {
                g1Var = new f1(unsafeJ, 0);
            }
        }
        f894c = g1Var;
        f895d = g1Var == null ? false : g1Var.s();
        f896e = g1Var == null ? false : g1Var.r();
        f897f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field fieldE = e();
        if (fieldE != null && g1Var != null) {
            g1Var.j(fieldE);
        }
        f898g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th2) {
        Logger.getLogger(i1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static Object b(Class cls) {
        try {
            return f892a.allocateInstance(cls);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static int c(Class cls) {
        if (f896e) {
            return f894c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f896e) {
            f894c.b(cls);
        }
    }

    public static Field e() {
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

    public static boolean f(Class cls) {
        if (!c.a()) {
            return false;
        }
        try {
            Class cls2 = f893b;
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

    public static byte g(byte[] bArr, long j9) {
        return f894c.d(bArr, f897f + j9);
    }

    public static byte h(Object obj, long j9) {
        return (byte) ((f894c.g(obj, (-4) & j9) >>> ((int) (((~j9) & 3) << 3))) & 255);
    }

    public static byte i(Object obj, long j9) {
        return (byte) ((f894c.g(obj, (-4) & j9) >>> ((int) ((j9 & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new e1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte[] bArr, long j9, byte b7) {
        f894c.l(bArr, f897f + j9, b7);
    }

    public static void l(Object obj, long j9, byte b7) {
        long j10 = (-4) & j9;
        int iG = f894c.g(obj, j10);
        int i10 = ((~((int) j9)) & 3) << 3;
        n(obj, j10, ((255 & b7) << i10) | (iG & (~(255 << i10))));
    }

    public static void m(Object obj, long j9, byte b7) {
        long j10 = (-4) & j9;
        int i10 = (((int) j9) & 3) << 3;
        n(obj, j10, ((255 & b7) << i10) | (f894c.g(obj, j10) & (~(255 << i10))));
    }

    public static void n(Object obj, long j9, int i10) {
        f894c.o(obj, j9, i10);
    }

    public static void o(Object obj, long j9, long j10) {
        f894c.p(obj, j9, j10);
    }

    public static void p(Object obj, long j9, Object obj2) {
        f894c.q(obj, j9, obj2);
    }
}

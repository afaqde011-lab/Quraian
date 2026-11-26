package kh;

import com.google.android.gms.internal.measurement.g4;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

public final class j extends g4 {

    public static final Unsafe f9672i;

    public static final long f9673j;

    public static final long f9674k;
    public static final long l;
    public static final long m;

    public static final long f9675n;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new i());
        }
        try {
            f9674k = unsafe.objectFieldOffset(l.class.getDeclaredField("C"));
            f9673j = unsafe.objectFieldOffset(l.class.getDeclaredField("B"));
            l = unsafe.objectFieldOffset(l.class.getDeclaredField("A"));
            m = unsafe.objectFieldOffset(k.class.getDeclaredField("a"));
            f9675n = unsafe.objectFieldOffset(k.class.getDeclaredField("b"));
            f9672i = unsafe;
        } catch (NoSuchFieldException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public final c H(l lVar) {
        c cVar;
        c cVar2 = c.f9665d;
        do {
            cVar = lVar.B;
            if (cVar2 == cVar) {
                break;
            }
        } while (!s(lVar, cVar, cVar2));
        return cVar;
    }

    @Override
    public final k I(l lVar) {
        k kVar;
        k kVar2 = k.f9676c;
        do {
            kVar = lVar.C;
            if (kVar2 == kVar) {
                break;
            }
        } while (!u(lVar, kVar, kVar2));
        return kVar;
    }

    @Override
    public final void Y(k kVar, k kVar2) {
        f9672i.putObject(kVar, f9675n, kVar2);
    }

    @Override
    public final void Z(k kVar, Thread thread) {
        f9672i.putObject(kVar, m, thread);
    }

    @Override
    public final boolean s(l lVar, c cVar, c cVar2) {
        return f9672i.compareAndSwapObject(lVar, f9673j, cVar, cVar2);
    }

    @Override
    public final boolean t(l lVar, Object obj, Object obj2) {
        return f9672i.compareAndSwapObject(lVar, l, obj, obj2);
    }

    @Override
    public final boolean u(l lVar, k kVar, k kVar2) {
        return f9672i.compareAndSwapObject(lVar, f9674k, kVar, kVar2);
    }
}

package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class g1 {

    public final Unsafe f605a;

    public g1(Unsafe unsafe) {
        this.f605a = unsafe;
    }

    public final int a(Class cls) {
        return this.f605a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f605a.arrayIndexScale(cls);
    }

    public abstract boolean c(Object obj, long j9);

    public abstract double d(Object obj, long j9);

    public abstract float e(Object obj, long j9);

    public final int f(Object obj, long j9) {
        return this.f605a.getInt(obj, j9);
    }

    public final long g(Object obj, long j9) {
        return this.f605a.getLong(obj, j9);
    }

    public final Object h(Object obj, long j9) {
        return this.f605a.getObject(obj, j9);
    }

    public final long i(Field field) {
        return this.f605a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j9, boolean z10);

    public abstract void k(Object obj, long j9, byte b7);

    public abstract void l(Object obj, long j9, double d3);

    public abstract void m(Object obj, long j9, float f3);

    public final void n(Object obj, long j9, int i10) {
        this.f605a.putInt(obj, j9, i10);
    }

    public final void o(Object obj, long j9, long j10) {
        this.f605a.putLong(obj, j9, j10);
    }

    public final void p(Object obj, long j9, Object obj2) {
        this.f605a.putObject(obj, j9, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f605a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th2) {
            h1.a(th2);
            return false;
        }
    }

    public abstract boolean r();
}

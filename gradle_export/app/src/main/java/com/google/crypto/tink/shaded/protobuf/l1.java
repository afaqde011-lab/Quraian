package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class l1 {

    public final Unsafe f4288a;

    public l1(Unsafe unsafe) {
        this.f4288a = unsafe;
    }

    public final int a(Class cls) {
        return this.f4288a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f4288a.arrayIndexScale(cls);
    }

    public abstract boolean c(Object obj, long j9);

    public abstract byte d(Object obj, long j9);

    public abstract double e(Object obj, long j9);

    public abstract float f(Object obj, long j9);

    public final int g(Object obj, long j9) {
        return this.f4288a.getInt(obj, j9);
    }

    public final long h(Object obj, long j9) {
        return this.f4288a.getLong(obj, j9);
    }

    public final Object i(Object obj, long j9) {
        return this.f4288a.getObject(obj, j9);
    }

    public final long j(Field field) {
        return this.f4288a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j9, boolean z10);

    public abstract void l(Object obj, long j9, byte b7);

    public abstract void m(Object obj, long j9, double d3);

    public abstract void n(Object obj, long j9, float f3);

    public final void o(Object obj, long j9, int i10) {
        this.f4288a.putInt(obj, j9, i10);
    }

    public final void p(Object obj, long j9, long j10) {
        this.f4288a.putLong(obj, j9, j10);
    }

    public final void q(Object obj, long j9, Object obj2) {
        this.f4288a.putObject(obj, j9, obj2);
    }

    public boolean r() {
        Unsafe unsafe = this.f4288a;
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
            m1.a(th2);
            return false;
        }
    }

    public abstract boolean s();
}

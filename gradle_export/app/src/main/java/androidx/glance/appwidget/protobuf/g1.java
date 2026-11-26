package androidx.glance.appwidget.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public final class g1 extends h1 {
    @Override
    public final boolean c(Object obj, long j9) {
        return this.f891a.getBoolean(obj, j9);
    }

    @Override
    public final byte d(Object obj, long j9) {
        return this.f891a.getByte(obj, j9);
    }

    @Override
    public final double e(Object obj, long j9) {
        return this.f891a.getDouble(obj, j9);
    }

    @Override
    public final float f(Object obj, long j9) {
        return this.f891a.getFloat(obj, j9);
    }

    @Override
    public final void k(Object obj, long j9, boolean z10) {
        this.f891a.putBoolean(obj, j9, z10);
    }

    @Override
    public final void l(Object obj, long j9, byte b7) {
        this.f891a.putByte(obj, j9, b7);
    }

    @Override
    public final void m(Object obj, long j9, double d3) {
        this.f891a.putDouble(obj, j9, d3);
    }

    @Override
    public final void n(Object obj, long j9, float f3) {
        this.f891a.putFloat(obj, j9, f3);
    }

    @Override
    public final boolean r() {
        if (!super.r()) {
            return false;
        }
        try {
            Class<?> cls = this.f891a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            i1.a(th2);
            return false;
        }
    }

    @Override
    public final boolean s() {
        Unsafe unsafe = this.f891a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (i1.e() != null) {
                    try {
                        Class<?> cls3 = this.f891a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th2) {
                        i1.a(th2);
                        return false;
                    }
                }
            } catch (Throwable th3) {
                i1.a(th3);
            }
        }
        return false;
    }
}

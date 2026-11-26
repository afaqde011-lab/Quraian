package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public final class f1 extends g1 {
    @Override
    public final boolean c(Object obj, long j9) {
        return this.f605a.getBoolean(obj, j9);
    }

    @Override
    public final double d(Object obj, long j9) {
        return this.f605a.getDouble(obj, j9);
    }

    @Override
    public final float e(Object obj, long j9) {
        return this.f605a.getFloat(obj, j9);
    }

    @Override
    public final void j(Object obj, long j9, boolean z10) {
        this.f605a.putBoolean(obj, j9, z10);
    }

    @Override
    public final void k(Object obj, long j9, byte b7) {
        this.f605a.putByte(obj, j9, b7);
    }

    @Override
    public final void l(Object obj, long j9, double d3) {
        this.f605a.putDouble(obj, j9, d3);
    }

    @Override
    public final void m(Object obj, long j9, float f3) {
        this.f605a.putFloat(obj, j9, f3);
    }

    @Override
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> cls = this.f605a.getClass();
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
            h1.a(th2);
            return false;
        }
    }

    @Override
    public final boolean r() {
        Unsafe unsafe = this.f605a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (h1.g() != null) {
                    try {
                        Class<?> cls3 = this.f605a.getClass();
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
                        h1.a(th2);
                        return false;
                    }
                }
            } catch (Throwable th3) {
                h1.a(th3);
            }
        }
        return false;
    }
}

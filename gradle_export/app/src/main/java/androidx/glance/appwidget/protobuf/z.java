package androidx.glance.appwidget.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class z extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, z> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected c1 unknownFields;

    public z() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c1.f875f;
    }

    public static z e(Class cls) {
        z zVar = defaultInstanceMap.get(cls);
        if (zVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = (z) ((z) i1.b(cls)).d(6);
        if (zVar2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, zVar2);
        return zVar2;
    }

    public static Object f(Method method, z zVar, Object... objArr) {
        try {
            return method.invoke(zVar, objArr);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e3);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean g(z zVar, boolean z10) {
        byte bByteValue = ((Byte) zVar.d(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        w0 w0Var = w0.f961c;
        w0Var.getClass();
        boolean zIsInitialized = w0Var.a(zVar.getClass()).isInitialized(zVar);
        if (z10) {
            zVar.d(2);
        }
        return zIsInitialized;
    }

    public static void k(Class cls, z zVar) {
        zVar.i();
        defaultInstanceMap.put(cls, zVar);
    }

    @Override
    public final int b(z0 z0Var) {
        int iA;
        int iA2;
        if (h()) {
            if (z0Var == null) {
                w0 w0Var = w0.f961c;
                w0Var.getClass();
                iA2 = w0Var.a(getClass()).a(this);
            } else {
                iA2 = z0Var.a(this);
            }
            if (iA2 >= 0) {
                return iA2;
            }
            throw new IllegalStateException(g4.c.f(iA2, "serialized size must be non-negative, was "));
        }
        int i10 = this.memoizedSerializedSize;
        if ((i10 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i10 & Integer.MAX_VALUE;
        }
        if (z0Var == null) {
            w0 w0Var2 = w0.f961c;
            w0Var2.getClass();
            iA = w0Var2.a(getClass()).a(this);
        } else {
            iA = z0Var.a(this);
        }
        l(iA);
        return iA;
    }

    public final x c() {
        return (x) d(5);
    }

    public abstract Object d(int i10);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w0 w0Var = w0.f961c;
        w0Var.getClass();
        return w0Var.a(getClass()).f(this, (z) obj);
    }

    public final boolean h() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final int hashCode() {
        if (h()) {
            w0 w0Var = w0.f961c;
            w0Var.getClass();
            return w0Var.a(getClass()).c(this);
        }
        if (this.memoizedHashCode == 0) {
            w0 w0Var2 = w0.f961c;
            w0Var2.getClass();
            this.memoizedHashCode = w0Var2.a(getClass()).c(this);
        }
        return this.memoizedHashCode;
    }

    public final void i() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final z j() {
        return (z) d(4);
    }

    public final void l(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(g4.c.f(i10, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final void m(o oVar) {
        w0 w0Var = w0.f961c;
        w0Var.getClass();
        z0 z0VarA = w0Var.a(getClass());
        k0 k0Var = oVar.f934b;
        if (k0Var == null) {
            k0Var = new k0(oVar);
        }
        z0VarA.d(this, k0Var);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = p0.f935a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        p0.c(this, sb2, 0);
        return sb2.toString();
    }
}

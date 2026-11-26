package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class v extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, v> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected b1 unknownFields;

    public v() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = b1.f588f;
    }

    public static v d(Class cls) {
        v vVar = defaultInstanceMap.get(cls);
        if (vVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                vVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = (v) ((v) h1.d(cls)).c(6);
        if (vVar2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, vVar2);
        return vVar2;
    }

    public static Object e(Method method, v vVar, Object... objArr) {
        try {
            return method.invoke(vVar, objArr);
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

    public static final boolean f(v vVar, boolean z10) {
        byte bByteValue = ((Byte) vVar.c(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        r0 r0Var = r0.f672c;
        r0Var.getClass();
        boolean zIsInitialized = r0Var.a(vVar.getClass()).isInitialized(vVar);
        if (z10) {
            vVar.c(2);
        }
        return zIsInitialized;
    }

    public static void j(Class cls, v vVar) {
        vVar.h();
        defaultInstanceMap.put(cls, vVar);
    }

    @Override
    public final int a(u0 u0Var) {
        int iB;
        int iB2;
        if (g()) {
            if (u0Var == null) {
                r0 r0Var = r0.f672c;
                r0Var.getClass();
                iB2 = r0Var.a(getClass()).b(this);
            } else {
                iB2 = u0Var.b(this);
            }
            if (iB2 >= 0) {
                return iB2;
            }
            throw new IllegalStateException(g4.c.f(iB2, "serialized size must be non-negative, was "));
        }
        int i10 = this.memoizedSerializedSize;
        if ((i10 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i10 & Integer.MAX_VALUE;
        }
        if (u0Var == null) {
            r0 r0Var2 = r0.f672c;
            r0Var2.getClass();
            iB = r0Var2.a(getClass()).b(this);
        } else {
            iB = u0Var.b(this);
        }
        k(iB);
        return iB;
    }

    @Override
    public final void b(l lVar) {
        r0 r0Var = r0.f672c;
        r0Var.getClass();
        u0 u0VarA = r0Var.a(getClass());
        d0 d0Var = lVar.f641b;
        if (d0Var == null) {
            d0Var = new d0(lVar);
        }
        u0VarA.a(this, d0Var);
    }

    public abstract Object c(int i10);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        r0 r0Var = r0.f672c;
        r0Var.getClass();
        return r0Var.a(getClass()).d(this, (v) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            r0 r0Var = r0.f672c;
            r0Var.getClass();
            return r0Var.a(getClass()).c(this);
        }
        if (this.memoizedHashCode == 0) {
            r0 r0Var2 = r0.f672c;
            r0Var2.getClass();
            this.memoizedHashCode = r0Var2.a(getClass()).c(this);
        }
        return this.memoizedHashCode;
    }

    public final v i() {
        return (v) c(4);
    }

    public final void k(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(g4.c.f(i10, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = k0.f637a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        k0.c(this, sb2, 0);
        return sb2.toString();
    }
}

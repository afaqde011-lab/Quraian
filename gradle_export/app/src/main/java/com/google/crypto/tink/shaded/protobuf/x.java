package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class x extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, x> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected d1 unknownFields;

    public x() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = d1.f4255f;
    }

    public static void f(x xVar) throws InvalidProtocolBufferException {
        if (!l(xVar, true)) {
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        }
    }

    public static x i(Class cls) {
        x xVar = defaultInstanceMap.get(cls);
        if (xVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                xVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (xVar != null) {
            return xVar;
        }
        x defaultInstanceForType = ((x) m1.b(cls)).getDefaultInstanceForType();
        if (defaultInstanceForType == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, defaultInstanceForType);
        return defaultInstanceForType;
    }

    public static Object k(Method method, x xVar, Object... objArr) {
        try {
            return method.invoke(xVar, objArr);
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

    public static final boolean l(x xVar, boolean z10) {
        byte bByteValue = ((Byte) xVar.h(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        x0 x0Var = x0.f4333c;
        x0Var.getClass();
        boolean zIsInitialized = x0Var.a(xVar.getClass()).isInitialized(xVar);
        if (z10) {
            xVar.h(2);
        }
        return zIsInitialized;
    }

    public static x q(x xVar, i iVar, p pVar) throws InvalidProtocolBufferException {
        h hVar = (h) iVar;
        j jVarJ = androidx.datastore.preferences.protobuf.j.j(hVar.D, hVar.i(), hVar.size(), true);
        x xVarR = r(xVar, jVarJ, pVar);
        jVarJ.b(0);
        f(xVarR);
        return xVarR;
    }

    public static x r(x xVar, androidx.datastore.preferences.protobuf.j jVar, p pVar) throws InvalidProtocolBufferException {
        x xVarP = xVar.p();
        try {
            x0 x0Var = x0.f4333c;
            x0Var.getClass();
            a1 a1VarA = x0Var.a(xVarP.getClass());
            l lVar = (l) jVar.f632b;
            if (lVar == null) {
                lVar = new l(jVar);
            }
            a1VarA.e(xVarP, lVar, pVar);
            a1VarA.makeImmutable(xVarP);
            return xVarP;
        } catch (InvalidProtocolBufferException e3) {
            if (e3.A) {
                throw new InvalidProtocolBufferException(e3.getMessage(), e3);
            }
            throw e3;
        } catch (UninitializedMessageException e10) {
            throw new InvalidProtocolBufferException(e10.getMessage());
        } catch (IOException e11) {
            if (e11.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e11.getCause());
            }
            throw new InvalidProtocolBufferException(e11.getMessage(), e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw e12;
        }
    }

    public static void s(Class cls, x xVar) {
        xVar.n();
        defaultInstanceMap.put(cls, xVar);
    }

    @Override
    public final int a(a1 a1Var) {
        int iC;
        int iC2;
        if (m()) {
            if (a1Var == null) {
                x0 x0Var = x0.f4333c;
                x0Var.getClass();
                iC2 = x0Var.a(getClass()).c(this);
            } else {
                iC2 = a1Var.c(this);
            }
            if (iC2 >= 0) {
                return iC2;
            }
            throw new IllegalStateException(g4.c.f(iC2, "serialized size must be non-negative, was "));
        }
        int i10 = this.memoizedSerializedSize;
        if ((i10 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i10 & Integer.MAX_VALUE;
        }
        if (a1Var == null) {
            x0 x0Var2 = x0.f4333c;
            x0Var2.getClass();
            iC = x0Var2.a(getClass()).c(this);
        } else {
            iC = a1Var.c(this);
        }
        t(iC);
        return iC;
    }

    @Override
    public final void e(m mVar) {
        x0 x0Var = x0.f4333c;
        x0Var.getClass();
        a1 a1VarA = x0Var.a(getClass());
        k0 k0Var = mVar.f4291b;
        if (k0Var == null) {
            k0Var = new k0(mVar);
        }
        a1VarA.f(this, k0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        x0 x0Var = x0.f4333c;
        x0Var.getClass();
        return x0Var.a(getClass()).a(this, (x) obj);
    }

    public final v g() {
        return (v) h(5);
    }

    public abstract Object h(int i10);

    public final int hashCode() {
        if (m()) {
            x0 x0Var = x0.f4333c;
            x0Var.getClass();
            return x0Var.a(getClass()).b(this);
        }
        if (this.memoizedHashCode == 0) {
            x0 x0Var2 = x0.f4333c;
            x0Var2.getClass();
            this.memoizedHashCode = x0Var2.a(getClass()).b(this);
        }
        return this.memoizedHashCode;
    }

    @Override
    public final x getDefaultInstanceForType() {
        return (x) h(6);
    }

    public final boolean m() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void n() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override
    public final v c() {
        return (v) h(5);
    }

    public final x p() {
        return (x) h(4);
    }

    public final void t(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(g4.c.f(i10, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = q0.f4309a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        q0.c(this, sb2, 0);
        return sb2.toString();
    }

    public final v u() {
        v vVar = (v) h(5);
        if (!vVar.A.equals(this)) {
            vVar.d();
            v.e(vVar.B, this);
        }
        return vVar;
    }
}

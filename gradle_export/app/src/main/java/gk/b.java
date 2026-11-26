package gk;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k00.f;

public final class b extends f {

    public final Method f6357a = Class.class.getMethod("isRecord", null);

    public final Method f6358b = Class.class.getMethod("getRecordComponents", null);

    public final Method f6359c;

    public final Method f6360d;

    public b() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f6359c = cls.getMethod("getName", null);
        this.f6360d = cls.getMethod("getType", null);
    }

    public final Constructor B(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f6358b.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                clsArr[i10] = (Class) this.f6360d.invoke(objArr[i10], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e3) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e3);
        }
    }

    public final String[] K(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f6358b.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                strArr[i10] = (String) this.f6359c.invoke(objArr[i10], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e3) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e3);
        }
    }

    public final boolean L(Class cls) {
        try {
            return ((Boolean) this.f6357a.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e3) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e3);
        }
    }

    public final Method y(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e3) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e3);
        }
    }
}

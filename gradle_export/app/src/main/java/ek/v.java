package ek;

import com.google.gson.JsonParseException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

public final class v extends s {

    public static final HashMap f5458e;

    public final Constructor f5459b;

    public final Object[] f5460c;

    public final HashMap f5461d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f5458e = map;
    }

    public v(Class cls, u uVar) {
        super(uVar);
        this.f5461d = new HashMap();
        k00.f fVar = gk.c.f6361a;
        Constructor constructorB = fVar.B(cls);
        this.f5459b = constructorB;
        gk.c.f(constructorB);
        String[] strArrK = fVar.K(cls);
        for (int i10 = 0; i10 < strArrK.length; i10++) {
            this.f5461d.put(strArrK[i10], Integer.valueOf(i10));
        }
        Class<?>[] parameterTypes = this.f5459b.getParameterTypes();
        this.f5460c = new Object[parameterTypes.length];
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            this.f5460c[i11] = f5458e.get(parameterTypes[i11]);
        }
    }

    @Override
    public final Object d() {
        return (Object[]) this.f5460c.clone();
    }

    @Override
    public final Object e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f5459b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e3) {
            k00.f fVar = gk.c.f6361a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e3);
        } catch (IllegalArgumentException | InstantiationException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + gk.c.b(constructor) + "' with args " + Arrays.toString(objArr), e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + gk.c.b(constructor) + "' with args " + Arrays.toString(objArr), e11.getCause());
        }
    }

    @Override
    public final void f(Object obj, ik.a aVar, r rVar) {
        Object[] objArr = (Object[]) obj;
        String str = rVar.f5447c;
        Integer num = (Integer) this.f5461d.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + gk.c.b(this.f5459b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objB = rVar.f5450f.b(aVar);
        if (objB != null || !rVar.f5451g) {
            objArr[iIntValue] = objB;
        } else {
            StringBuilder sbN = g4.c.n("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbN.append(aVar.F(false));
            throw new JsonParseException(sbN.toString());
        }
    }
}

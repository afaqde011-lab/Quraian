package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public abstract class y0 {

    public static final List f1029a = va.a.S(Application.class, r0.class);

    public static final List f1030b = va.a.R(r0.class);

    public static final Constructor a(Class cls, List list) {
        kotlin.jvm.internal.m.e(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        kotlin.jvm.internal.m.d(constructors, "getConstructors(...)");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.m.d(parameterTypes, "getParameterTypes(...)");
            List listV0 = h00.n.V0(parameterTypes);
            if (list.equals(listV0)) {
                return constructor;
            }
            if (list.size() == listV0.size() && listV0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final a1 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (a1) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Failed to access " + cls, e3);
        } catch (InstantiationException e10) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e11.getCause());
        }
    }
}

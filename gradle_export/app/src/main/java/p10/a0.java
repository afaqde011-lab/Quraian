package p10;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public final class a0 extends w {
    public final Object a;

    public a0(Object recordComponent) {
        kotlin.jvm.internal.m.e(recordComponent, "recordComponent");
        this.a = recordComponent;
    }

    @Override
    public final Member b() throws IllegalAccessException, InvocationTargetException {
        Object recordComponent = this.a;
        kotlin.jvm.internal.m.e(recordComponent, "recordComponent");
        h7.b bVar = p30.f.a;
        Method method = null;
        if (bVar == null) {
            Class<?> cls = recordComponent.getClass();
            try {
                bVar = new h7.b(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                bVar = new h7.b((Object) null, (Object) null);
            }
            p30.f.a = bVar;
        }
        Method method2 = (Method) bVar.B;
        if (method2 != null) {
            Object objInvoke = method2.invoke(recordComponent, null);
            kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final e20.d f() throws IllegalAccessException, InvocationTargetException {
        Object recordComponent = this.a;
        kotlin.jvm.internal.m.e(recordComponent, "recordComponent");
        h7.b bVar = p30.f.a;
        Class cls = null;
        if (bVar == null) {
            Class<?> cls2 = recordComponent.getClass();
            try {
                bVar = new h7.b(cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                bVar = new h7.b((Object) null, (Object) null);
            }
            p30.f.a = bVar;
        }
        Method method = (Method) bVar.A;
        if (method != null) {
            Object objInvoke = method.invoke(recordComponent, null);
            kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new q(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}

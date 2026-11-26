package p10;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public final class e extends s {
    public final Annotation a;

    public e(Annotation annotation) {
        kotlin.jvm.internal.m.e(annotation, "annotation");
        this.a = annotation;
    }

    public final ArrayList b() throws IllegalAccessException, InvocationTargetException {
        e20.a pVar;
        Annotation annotation = this.a;
        Method[] declaredMethods = k00.f.D(k00.f.z(annotation)).getDeclaredMethods();
        kotlin.jvm.internal.m.d(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, null);
            kotlin.jvm.internal.m.d(objInvoke, "invoke(...)");
            n20.e eVarE = n20.e.e(method.getName());
            Class<?> cls = objInvoke.getClass();
            List list = d.a;
            if (Enum.class.isAssignableFrom(cls)) {
                pVar = new t(eVarE, (Enum) objInvoke);
            } else if (objInvoke instanceof Annotation) {
                pVar = new g(eVarE, (Annotation) objInvoke);
            } else if (objInvoke instanceof Object[]) {
                pVar = new h(eVarE, (Object[]) objInvoke);
            } else {
                pVar = objInvoke instanceof Class ? new p(eVarE, (Class) objInvoke) : new v(eVarE, objInvoke);
            }
            arrayList.add(pVar);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.a == ((e) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    public final String toString() {
        return e.class.getName() + ": " + this.a;
    }
}

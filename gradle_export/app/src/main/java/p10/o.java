package p10;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import qd.s0;

public final class o extends s implements e20.b, e20.e {
    public final Class a;

    public o(Class klass) {
        kotlin.jvm.internal.m.e(klass, "klass");
        this.a = klass;
    }

    @Override
    public final e a(n20.c fqName) {
        Annotation[] declaredAnnotations;
        kotlin.jvm.internal.m.e(fqName, "fqName");
        Class cls = this.a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return rd.a.B(declaredAnnotations, fqName);
    }

    public final List b() {
        Field[] declaredFields = this.a.getDeclaredFields();
        kotlin.jvm.internal.m.d(declaredFields, "getDeclaredFields(...)");
        return q30.l.u0(q30.l.r0(new q30.f(h00.n.l0(declaredFields), false, l.A), m.A));
    }

    public final n20.c c() {
        return d.a(this.a).a();
    }

    public final List d() {
        Method[] declaredMethods = this.a.getDeclaredMethods();
        kotlin.jvm.internal.m.d(declaredMethods, "getDeclaredMethods(...)");
        return q30.l.u0(q30.l.r0(new q30.f(h00.n.l0(declaredMethods), true, new a20.d(this, 24)), n.A));
    }

    public final n20.e e() {
        Class cls = this.a;
        return cls.isAnonymousClass() ? n20.e.e(r30.k.c1(cls.getName())) : n20.e.e(cls.getSimpleName());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return kotlin.jvm.internal.m.a(this.a, ((o) obj).a);
        }
        return false;
    }

    public final ArrayList f() {
        Class clazz = this.a;
        kotlin.jvm.internal.m.e(clazz, "clazz");
        a aVar = s0.a;
        Object[] objArr = null;
        if (aVar == null) {
            try {
                aVar = new a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            } catch (NoSuchMethodException unused) {
                aVar = new a(objArr, objArr, objArr, objArr);
            }
            s0.a = aVar;
        }
        Method method = (Method) aVar.D;
        objArr = method != null ? (Object[]) method.invoke(clazz, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new a0(obj));
        }
        return arrayList;
    }

    public final boolean g() throws IllegalAccessException, InvocationTargetException {
        Class clazz = this.a;
        kotlin.jvm.internal.m.e(clazz, "clazz");
        a aVar = s0.a;
        Boolean bool = null;
        if (aVar == null) {
            try {
                aVar = new a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            } catch (NoSuchMethodException unused) {
                aVar = new a(bool, bool, bool, bool);
            }
            s0.a = aVar;
        }
        Method method = (Method) aVar.C;
        if (method != null) {
            Object objInvoke = method.invoke(clazz, null);
            kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? h00.x.A : rd.a.E(declaredAnnotations);
    }

    @Override
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        kotlin.jvm.internal.m.d(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new c0(typeVariable));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return o.class.getName() + ": " + this.a;
    }
}

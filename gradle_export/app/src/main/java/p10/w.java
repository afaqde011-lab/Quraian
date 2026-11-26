package p10;

import j10.c1;
import j10.f1;
import j10.z0;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;

public abstract class w extends s implements e20.b, e20.c {
    @Override
    public final e a(n20.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        Member memberB = b();
        kotlin.jvm.internal.m.c(memberB, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return rd.a.B(declaredAnnotations, fqName);
        }
        return null;
    }

    public abstract Member b();

    public final n20.e c() {
        String name = b().getName();
        return name != null ? n20.e.e(name) : n20.g.a;
    }

    public final ArrayList d(Type[] typeArr, Annotation[][] annotationArr, boolean z) throws IllegalAccessException, InvocationTargetException {
        Method method;
        ArrayList arrayList;
        b0 iVar;
        b0 zVar;
        String str;
        boolean z2;
        h1.l lVar;
        ArrayList arrayList2 = new ArrayList(typeArr.length);
        b bVar = b.a;
        Member member = b();
        kotlin.jvm.internal.m.e(member, "member");
        h1.l lVar2 = b.b;
        if (lVar2 == null) {
            synchronized (bVar) {
                lVar2 = b.b;
                if (lVar2 == null) {
                    Class<?> cls = member.getClass();
                    try {
                        lVar = new h1.l(cls.getMethod("getParameters", null), d.d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null), false);
                    } catch (NoSuchMethodException unused) {
                        lVar = new h1.l((Object) null, (Object) null, false);
                    }
                    b.b = lVar;
                    lVar2 = lVar;
                }
            }
        }
        Method method2 = (Method) lVar2.A;
        if (method2 == null || (method = (Method) lVar2.B) == null) {
            arrayList = null;
        } else {
            Object objInvoke = method2.invoke(member, null);
            kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) objInvoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                Object objInvoke2 = method.invoke(obj, null);
                kotlin.jvm.internal.m.c(objInvoke2, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((String) objInvoke2);
            }
        }
        int size = arrayList != null ? arrayList.size() - typeArr.length : 0;
        int length = typeArr.length;
        for (int i = 0; i < length; i++) {
            Type type = typeArr[i];
            kotlin.jvm.internal.m.e(type, "type");
            boolean z3 = type instanceof Class;
            if (z3) {
                Class cls2 = (Class) type;
                if (cls2.isPrimitive()) {
                    zVar = new z(cls2);
                } else {
                    if (!(type instanceof GenericArrayType) || (z3 && ((Class) type).isArray())) {
                        iVar = new i(type);
                    } else {
                        iVar = type instanceof WildcardType ? new e0((WildcardType) type) : new q(type);
                    }
                    zVar = iVar;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    iVar = new i(type);
                } else {
                    iVar = new i(type);
                }
                zVar = iVar;
            }
            if (arrayList != null) {
                str = (String) h00.q.O0(i + size, arrayList);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i + '+' + size + " (name=" + c() + " type=" + zVar + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (z) {
                z2 = true;
                if (i != typeArr.length - 1) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            arrayList2.add(new d0(zVar, annotationArr[i], str, z2));
        }
        return arrayList2;
    }

    public final f1 e() {
        int modifiers = b().getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return c1.c;
        }
        if (Modifier.isPrivate(modifiers)) {
            return z0.c;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? n10.c.c : n10.b.c;
        }
        return n10.a.c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w) && kotlin.jvm.internal.m.a(b(), ((w) obj).b());
    }

    @Override
    public final Collection getAnnotations() {
        Member memberB = b();
        kotlin.jvm.internal.m.c(memberB, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        return declaredAnnotations != null ? rd.a.E(declaredAnnotations) : h00.x.A;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}

package kotlin.jvm.internal;

import d10.q0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class e implements a10.d, d {
    public static final Map B;
    public final Class A;

    static {
        List listS = va.a.S(new Class[]{u00.a.class, u00.k.class, u00.n.class, u00.o.class, u00.p.class, u00.q.class, u00.r.class, u00.s.class, u00.t.class, u00.u.class, u00.b.class, u00.c.class, q0.class, u00.d.class, u00.e.class, u00.f.class, u00.g.class, u00.h.class, u00.i.class, u00.j.class, u00.l.class, u00.m.class, q0.class});
        ArrayList arrayList = new ArrayList(h00.r.q0(listS, 10));
        int i = 0;
        for (Object obj : listS) {
            int i2 = i + 1;
            if (i < 0) {
                va.a.k0();
                throw null;
            }
            arrayList.add(new g00.k((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        B = h00.d0.Y(arrayList);
    }

    public e(Class jClass) {
        m.e(jClass, "jClass");
        this.A = jClass;
    }

    @Override
    public final boolean equals(Object obj) {
        return (obj instanceof e) && k00.f.G(this).equals(k00.f.G((a10.d) obj));
    }

    @Override
    public final List getTypeParameters() {
        throw new a40.b0();
    }

    @Override
    public final int hashCode() {
        return k00.f.G(this).hashCode();
    }

    @Override
    public final Collection i() {
        throw new a40.b0();
    }

    @Override
    public final boolean j() {
        throw new a40.b0();
    }

    @Override
    public final boolean k() {
        throw new a40.b0();
    }

    @Override
    public final List l() {
        throw new a40.b0();
    }

    @Override
    public final String m() {
        String strE;
        Class jClass = this.A;
        m.e(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        if (!jClass.isArray()) {
            String strE2 = d0.e(jClass.getName());
            return strE2 == null ? jClass.getCanonicalName() : strE2;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (strE = d0.e(componentType.getName())) != null) {
            strConcat = strE.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override
    public final String n() {
        String strG;
        Class jClass = this.A;
        m.e(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            if (!jClass.isArray()) {
                String strG2 = d0.g(jClass.getName());
                return strG2 == null ? jClass.getSimpleName() : strG2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (strG = d0.g(componentType.getName())) != null) {
                strConcat = strG.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return r30.k.a1(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return r30.k.Z0('$', simpleName, simpleName);
        }
        return r30.k.a1(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final String toString() {
        return this.A.toString() + " (Kotlin reflection is not available)";
    }

    @Override
    public final boolean u(Object obj) {
        Class jClass = this.A;
        m.e(jClass, "jClass");
        Map map = B;
        m.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return d0.f(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = k00.f.G(k00.f.I(jClass));
        }
        return jClass.isInstance(obj);
    }

    @Override
    public final Class v() {
        return this.A;
    }
}

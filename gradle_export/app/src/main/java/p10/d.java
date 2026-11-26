package p10;

import d10.q0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class d {
    public static final List a;
    public static final Map b;
    public static final Map c;
    public static final Map d;

    static {
        kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
        int i = 0;
        List<a10.d> listS = va.a.S(new a10.d[]{b0Var.b(Boolean.TYPE), b0Var.b(Byte.TYPE), b0Var.b(Character.TYPE), b0Var.b(Double.TYPE), b0Var.b(Float.TYPE), b0Var.b(Integer.TYPE), b0Var.b(Long.TYPE), b0Var.b(Short.TYPE)});
        a = listS;
        ArrayList arrayList = new ArrayList(h00.r.q0(listS, 10));
        for (a10.d dVar : listS) {
            arrayList.add(new g00.k(k00.f.G(dVar), k00.f.H(dVar)));
        }
        b = h00.d0.Y(arrayList);
        List<a10.d> list = a;
        ArrayList arrayList2 = new ArrayList(h00.r.q0(list, 10));
        for (a10.d dVar2 : list) {
            arrayList2.add(new g00.k(k00.f.H(dVar2), k00.f.G(dVar2)));
        }
        c = h00.d0.Y(arrayList2);
        List listS2 = va.a.S(new Class[]{u00.a.class, u00.k.class, u00.n.class, u00.o.class, u00.p.class, u00.q.class, u00.r.class, u00.s.class, u00.t.class, u00.u.class, u00.b.class, u00.c.class, q0.class, u00.d.class, u00.e.class, u00.f.class, u00.g.class, u00.h.class, u00.i.class, u00.j.class, u00.l.class, u00.m.class, q0.class});
        ArrayList arrayList3 = new ArrayList(h00.r.q0(listS2, 10));
        for (Object obj : listS2) {
            int i2 = i + 1;
            if (i < 0) {
                va.a.k0();
                throw null;
            }
            arrayList3.add(new g00.k((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        d = h00.d0.Y(arrayList3);
    }

    public static final n20.b a(Class cls) {
        kotlin.jvm.internal.m.e(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            n20.c cVar = new n20.c(cls.getName());
            return new n20.b(cVar.b(), kh.o.R(cVar.a.g()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return a(declaringClass).d(n20.e.e(cls.getSimpleName()));
        }
        n20.c cVar2 = new n20.c(cls.getName());
        return new n20.b(cVar2.b(), cVar2.a.g());
    }

    public static final String b(Class cls) {
        kotlin.jvm.internal.m.e(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return r30.r.u0(cls.getName(), '.', '/');
            }
            return "L" + r30.r.u0(cls.getName(), '.', '/') + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final List c(Type type) {
        kotlin.jvm.internal.m.e(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return h00.x.A;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return q30.l.u0(new q30.g(q30.l.n0(type, c.B), c.C, q30.o.A));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        kotlin.jvm.internal.m.d(actualTypeArguments, "getActualTypeArguments(...)");
        return h00.n.V0(actualTypeArguments);
    }

    public static final ClassLoader d(Class cls) {
        kotlin.jvm.internal.m.e(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        kotlin.jvm.internal.m.d(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }
}

package d10;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public abstract class l1 implements kotlin.jvm.internal.d {
    public static final r30.j A = new r30.j("<v#(\\d+)>");

    public static Method E(Class cls, String str, Class[] clsArr, Class cls2, boolean z) {
        Class clsF;
        Method methodE;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodH = H(cls, str, clsArr, cls2);
        if (methodH != null) {
            return methodH;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodE = E(superclass, str, clsArr, cls2, z)) != null) {
            return methodE;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        kotlin.jvm.internal.m.d(interfaces, "getInterfaces(...)");
        for (Class<?> cls3 : interfaces) {
            kotlin.jvm.internal.m.b(cls3);
            Method methodE2 = E(cls3, str, clsArr, cls2, z);
            if (methodE2 != null) {
                return methodE2;
            }
            if (z && (clsF = f50.k.F(p10.d.d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method methodH2 = H(clsF, str, clsArr, cls2);
                if (methodH2 != null) {
                    return methodH2;
                }
            }
        }
        return null;
    }

    public static Method H(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (kotlin.jvm.internal.m.a(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            kotlin.jvm.internal.m.d(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (kotlin.jvm.internal.m.a(method.getName(), str) && kotlin.jvm.internal.m.a(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static void w(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        boolean zA = kotlin.jvm.internal.m.a(h00.q.U0(arrayList2), kotlin.jvm.internal.f.class);
        List listSubList = arrayList2;
        if (zA) {
            listSubList = arrayList2.subList(0, arrayList2.size() - 1);
        }
        arrayList.addAll(listSubList);
        int size = (listSubList.size() + 31) / 32;
        for (int i = 0; i < size; i++) {
            Class TYPE = Integer.TYPE;
            kotlin.jvm.internal.m.d(TYPE, "TYPE");
            arrayList.add(TYPE);
        }
        arrayList.add(z ? kotlin.jvm.internal.f.class : Object.class);
    }

    public abstract Collection A(n20.e eVar);

    public abstract j10.l0 B(int i);

    public Class C() {
        Class clsV = v();
        List list = p10.d.a;
        kotlin.jvm.internal.m.e(clsV, "<this>");
        Class cls = (Class) p10.d.c.get(clsV);
        return cls == null ? v() : cls;
    }

    public abstract Collection D(n20.e eVar);

    public final l9.f0 F(String str, boolean z) {
        int iI0;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = str.charAt(i2);
            if (r30.k.B0("VZCBSIFJD", cCharAt)) {
                iI0 = i2 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new a40.b0("Unknown type prefix in the method signature: ".concat(str));
                }
                iI0 = r30.k.I0(str, ';', i, 4) + 1;
            }
            arrayList.add(G(i, str, iI0));
            i = iI0;
        }
        return new l9.f0(arrayList, z ? G(i + 1, str, str.length()) : null, 17);
    }

    public final Class G(int i, String str, int i2) throws ClassNotFoundException {
        char cCharAt = str.charAt(i);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            ClassLoader classLoaderD = p10.d.d(v());
            String strSubstring = str.substring(i + 1, i2 - 1);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            Class<?> clsLoadClass = classLoaderD.loadClass(r30.r.u0(strSubstring, '/', '.'));
            kotlin.jvm.internal.m.d(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class TYPE = Void.TYPE;
            kotlin.jvm.internal.m.d(TYPE, "TYPE");
            return TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            return i2.c(G(i + 1, str, i2));
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new a40.b0("Unknown type prefix in the method signature: ".concat(str));
        }
    }

    public final Method x(String name, String desc, boolean z) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(desc, "desc");
        if (name.equals("<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(v());
        }
        l9.f0 f0VarF = F(desc, true);
        w(arrayList, (ArrayList) f0VarF.B, false);
        Class clsC = C();
        String strConcat = name.concat("$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class cls = (Class) f0VarF.C;
        kotlin.jvm.internal.m.b(cls);
        return E(clsC, strConcat, clsArr, cls, z);
    }

    public final Method y(String name, String desc) {
        Method methodE;
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(desc, "desc");
        if (name.equals("<init>")) {
            return null;
        }
        l9.f0 f0VarF = F(desc, true);
        Class[] clsArr = (Class[]) ((ArrayList) f0VarF.B).toArray(new Class[0]);
        Class cls = (Class) f0VarF.C;
        kotlin.jvm.internal.m.b(cls);
        Method methodE2 = E(C(), name, clsArr, cls, false);
        if (methodE2 != null) {
            return methodE2;
        }
        if (!C().isInterface() || (methodE = E(Object.class, name, clsArr, cls, false)) == null) {
            return null;
        }
        return methodE;
    }

    public abstract Collection z();
}

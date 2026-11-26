package e10;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class d implements InvocationHandler {
    public final Class a;
    public final Map b;
    public final g00.p c;
    public final g00.p d;
    public final List e;

    public d(Class cls, Map map, g00.p pVar, g00.p pVar2, List list) {
        this.a = cls;
        this.b = map;
        this.c = pVar;
        this.d = pVar2;
        this.e = list;
    }

    @Override
    public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        boolean zA;
        boolean z;
        String name = method.getName();
        Class cls = this.a;
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) this.d.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) this.c.getValue();
            }
        }
        boolean zA2 = kotlin.jvm.internal.m.a(name, "equals");
        Map map = this.b;
        boolean z2 = false;
        if (!zA2 || objArr == null || objArr.length != 1) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
            StringBuilder sb = new StringBuilder("Method is not supported: ");
            sb.append(method);
            sb.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb.append(h00.n.V0(objArr));
            sb.append(')');
            throw new a40.b0(sb.toString());
        }
        Object objR0 = h00.n.R0(objArr);
        Annotation annotation = objR0 instanceof Annotation ? (Annotation) objR0 : null;
        if (kotlin.jvm.internal.m.a(annotation != null ? k00.f.D(k00.f.z(annotation)) : null, cls)) {
            List list = this.e;
            if (list != null && list.isEmpty()) {
                z = true;
                break;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                Method method2 = (Method) it.next();
                Object obj2 = map.get(method2.getName());
                Object objInvoke = method2.invoke(objR0, null);
                if (obj2 instanceof boolean[]) {
                    kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                    zA = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                } else if (obj2 instanceof char[]) {
                    kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type kotlin.CharArray");
                    zA = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                } else if (obj2 instanceof byte[]) {
                    kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                    zA = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                } else if (obj2 instanceof short[]) {
                    kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type kotlin.ShortArray");
                    zA = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                } else if (obj2 instanceof int[]) {
                    kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                    zA = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                } else if (obj2 instanceof float[]) {
                    kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type kotlin.FloatArray");
                    zA = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                } else if (obj2 instanceof long[]) {
                    kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type kotlin.LongArray");
                    zA = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                } else if (obj2 instanceof double[]) {
                    kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                    zA = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                } else if (obj2 instanceof Object[]) {
                    kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                    zA = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                } else {
                    zA = kotlin.jvm.internal.m.a(obj2, objInvoke);
                }
                if (!zA) {
                    z = false;
                    break;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }
}

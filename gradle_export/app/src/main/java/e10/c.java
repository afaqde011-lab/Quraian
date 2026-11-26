package e10;

import h00.d0;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c implements g {
    public final Class a;
    public final ArrayList b;
    public final a c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    public c(Class cls, ArrayList arrayList, a aVar) {
        b bVar = b.B;
        ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        this(cls, arrayList, aVar, bVar, arrayList2);
    }

    public c(Class jClass, ArrayList arrayList, a aVar, b bVar, List methods) {
        kotlin.jvm.internal.m.e(jClass, "jClass");
        kotlin.jvm.internal.m.e(methods, "methods");
        this.a = jClass;
        this.b = arrayList;
        this.c = aVar;
        this.d = methods;
        ArrayList arrayList2 = new ArrayList(h00.r.q0(methods, 10));
        Iterator it = methods.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.e = arrayList2;
        List list = this.d;
        ArrayList arrayList3 = new ArrayList(h00.r.q0(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            kotlin.jvm.internal.m.b(returnType);
            List list2 = p10.d.a;
            Class<?> cls = (Class) p10.d.c.get(returnType);
            if (cls != null) {
                returnType = cls;
            }
            arrayList3.add(returnType);
        }
        this.f = arrayList3;
        List list3 = this.d;
        ArrayList arrayList4 = new ArrayList(h00.r.q0(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.g = arrayList4;
        if (this.c == a.B && bVar == b.A && !h00.q.V0(this.b, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override
    public final List a() {
        return this.e;
    }

    @Override
    public final Member b() {
        return null;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final Object call(Object[] args) {
        String strM;
        kotlin.jvm.internal.m.e(args, "args");
        if (k00.f.A(this) != args.length) {
            StringBuilder sb = new StringBuilder("Callable expects ");
            sb.append(k00.f.A(this));
            sb.append(" arguments, but ");
            throw new IllegalArgumentException(g4.c.g(args.length, " were provided.", sb));
        }
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.b;
            if (i >= length) {
                return f50.k.k(this.a, d0.Y(h00.q.t1(arrayList2, arrayList)), this.d);
            }
            Object array = args[i];
            int i3 = i2 + 1;
            ArrayList arrayList3 = this.f;
            if (array == null && this.c == a.A) {
                array = this.g.get(i2);
            } else {
                Class cls = (Class) arrayList3.get(i2);
                if (array instanceof Class) {
                    array = null;
                } else {
                    if (array instanceof a10.d) {
                        array = k00.f.D((a10.d) array);
                    } else if (array instanceof Object[]) {
                        Object[] objArr = (Object[]) array;
                        if (objArr instanceof Class[]) {
                            array = null;
                        } else if (objArr instanceof a10.d[]) {
                            a10.d[] dVarArr = (a10.d[]) array;
                            ArrayList arrayList4 = new ArrayList(dVarArr.length);
                            for (a10.d dVar : dVarArr) {
                                arrayList4.add(k00.f.D(dVar));
                            }
                            array = arrayList4.toArray(new Class[0]);
                        } else {
                            array = objArr;
                        }
                    }
                    if (!cls.isInstance(array)) {
                        array = null;
                    }
                }
            }
            if (array == null) {
                String str = (String) arrayList2.get(i2);
                Class cls2 = (Class) arrayList3.get(i2);
                a10.d dVarB = kotlin.jvm.internal.m.a(cls2, Class.class) ? kotlin.jvm.internal.a0.a.b(a10.d.class) : (cls2.isArray() && kotlin.jvm.internal.m.a(cls2.getComponentType(), Class.class)) ? kotlin.jvm.internal.a0.a.b(a10.d[].class) : k00.f.I(cls2);
                if (kotlin.jvm.internal.m.a(dVarB.m(), kotlin.jvm.internal.a0.a.b(Object[].class).m())) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(dVarB.m());
                    sb2.append('<');
                    Class<?> componentType = k00.f.D(dVarB).getComponentType();
                    kotlin.jvm.internal.m.d(componentType, "getComponentType(...)");
                    sb2.append(k00.f.I(componentType).m());
                    sb2.append('>');
                    strM = sb2.toString();
                } else {
                    strM = dVarB.m();
                }
                throw new IllegalArgumentException("Argument #" + i2 + ' ' + str + " is not of the required type " + strM);
            }
            arrayList.add(array);
            i++;
            i2 = i3;
        }
    }

    @Override
    public final Type getReturnType() {
        return this.a;
    }
}

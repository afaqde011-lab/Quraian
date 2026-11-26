package e10;

import d10.i2;
import d10.l1;
import j10.j0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class b0 implements g {
    public final Method a;
    public final Method b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;

    public b0(j10.u uVar, l1 container, String constructorDesc, List list) {
        ?? R;
        kotlin.jvm.internal.m.e(container, "container");
        kotlin.jvm.internal.m.e(constructorDesc, "constructorDesc");
        Method methodY = container.y("constructor-impl", constructorDesc);
        kotlin.jvm.internal.m.b(methodY);
        this.a = methodY;
        Method methodY2 = container.y("box-impl", r30.k.S0(constructorDesc, "V") + p10.d.b(container.v()));
        kotlin.jvm.internal.m.b(methodY2);
        this.b = methodY2;
        ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
        Iterator it = list.iterator();
        while (true) {
            List listR = null;
            if (!it.hasNext()) {
                break;
            }
            e30.w type = ((j0) it.next()).getType();
            kotlin.jvm.internal.m.d(type, "getType(...)");
            e30.a0 a0VarB = e30.c.b(type);
            ArrayList arrayListM = kh.n.M(a0VarB);
            if (arrayListM == null) {
                Class clsI0 = kh.n.i0(a0VarB);
                if (clsI0 != null) {
                    listR = va.a.R(kh.n.L(clsI0, uVar));
                }
            } else {
                listR = arrayListM;
            }
            arrayList.add(listR);
        }
        this.c = arrayList;
        ArrayList arrayList2 = new ArrayList(h00.r.q0(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                va.a.k0();
                throw null;
            }
            j10.h hVarG = ((j0) obj).getType().m0().g();
            kotlin.jvm.internal.m.c(hVarG, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            j10.e eVar = (j10.e) hVarG;
            List list2 = (List) this.c.get(i);
            if (list2 != null) {
                R = new ArrayList(h00.r.q0(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    R.add(((Method) it2.next()).getReturnType());
                }
            } else {
                Class clsI = i2.i(eVar);
                kotlin.jvm.internal.m.b(clsI);
                R = va.a.R(clsI);
            }
            arrayList2.add(R);
            i = i2;
        }
        this.d = arrayList2;
        this.e = h00.r.r0(arrayList2);
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
    public final Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
        ?? R;
        kotlin.jvm.internal.m.e(args, "args");
        ArrayList other = this.c;
        kotlin.jvm.internal.m.e(other, "other");
        int length = args.length;
        ArrayList<g00.k> arrayList = new ArrayList(Math.min(h00.r.q0(other, 10), length));
        int i = 0;
        for (Object obj : other) {
            if (i >= length) {
                break;
            }
            arrayList.add(new g00.k(args[i], obj));
            i++;
        }
        ArrayList arrayList2 = new ArrayList();
        for (g00.k kVar : arrayList) {
            Object obj2 = kVar.A;
            List list = (List) kVar.B;
            if (list != null) {
                R = new ArrayList(h00.r.q0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    R.add(((Method) it.next()).invoke(obj2, null));
                }
            } else {
                R = va.a.R(obj2);
            }
            h00.v.u0(R, arrayList2);
        }
        Object[] array = arrayList2.toArray(new Object[0]);
        this.a.invoke(null, Arrays.copyOf(array, array.length));
        return this.b.invoke(null, Arrays.copyOf(array, array.length));
    }

    @Override
    public final Type getReturnType() {
        Class<?> returnType = this.b.getReturnType();
        kotlin.jvm.internal.m.d(returnType, "getReturnType(...)");
        return returnType;
    }
}

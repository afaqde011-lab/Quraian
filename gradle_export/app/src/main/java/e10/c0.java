package e10;

import d10.i2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m10.r0;

public final class c0 implements g {
    public final boolean a;
    public final g b;
    public final Member c;
    public final a1.i d;
    public final z00.e[] e;
    public final boolean f;

    public c0(g gVar, j10.c descriptor, boolean z) {
        Class clsI0;
        Method declaredMethod;
        boolean z2;
        a1.i iVar;
        List listM;
        List list;
        e30.a0 a0VarH;
        ArrayList arrayList;
        Iterator it;
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        this.a = z;
        boolean z3 = false;
        if (gVar instanceof t) {
            m10.u uVarX = descriptor.X();
            uVarX = uVarX == null ? descriptor.T() : uVarX;
            e30.w type = uVarX != null ? uVarX.getType() : null;
            if (type != null && q20.f.g(type)) {
                if (z) {
                    List listO = descriptor.O();
                    kotlin.jvm.internal.m.d(listO, "getValueParameters(...)");
                    if (!listO.isEmpty()) {
                        Iterator it2 = listO.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((r0) it2.next()).Z0()) {
                                    ArrayList arrayListM = kh.n.M(e30.c.b(type));
                                    kotlin.jvm.internal.m.b(arrayListM);
                                    arrayList = new ArrayList(h00.r.q0(arrayListM, 10));
                                    it = arrayListM.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Method) it.next()).invoke(((t) gVar).h, null));
                                    }
                                    gVar = new u((Method) ((q) gVar).a, arrayList.toArray(new Object[0]));
                                }
                            }
                        }
                    }
                } else {
                    ArrayList arrayListM2 = kh.n.M(e30.c.b(type));
                    kotlin.jvm.internal.m.b(arrayListM2);
                    arrayList = new ArrayList(h00.r.q0(arrayListM2, 10));
                    it = arrayListM2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Method) it.next()).invoke(((t) gVar).h, null));
                    }
                    gVar = new u((Method) ((q) gVar).a, arrayList.toArray(new Object[0]));
                }
            }
        }
        this.b = gVar;
        this.c = gVar.b();
        e30.w returnType = descriptor.getReturnType();
        kotlin.jvm.internal.m.b(returnType);
        boolean z4 = descriptor instanceof j10.u;
        if ((z4 && ((j10.u) descriptor).isSuspend() && (a0VarH = q20.f.h(returnType)) != null && g10.i.G(a0VarH)) || (clsI0 = kh.n.i0(returnType)) == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = clsI0.getDeclaredMethod("box-impl", kh.n.L(clsI0, descriptor).getReturnType());
                kotlin.jvm.internal.m.b(declaredMethod);
            } catch (NoSuchMethodException unused) {
                throw new a40.b0("No box method found in inline class: " + clsI0 + " (calling " + descriptor + ')');
            }
        }
        if (q20.f.a(descriptor)) {
            iVar = new a1.i(z00.e.D, new List[0], declaredMethod);
        } else {
            int i = -1;
            if ((!(gVar instanceof t) || ((t) gVar).g) && !(gVar instanceof u)) {
                if (descriptor instanceof j10.j) {
                    if (!(gVar instanceof f)) {
                        i = 0;
                    }
                } else if (descriptor.T() == null || (gVar instanceof f)) {
                    i = 0;
                } else {
                    j10.k kVarL = descriptor.l();
                    kotlin.jvm.internal.m.d(kVarL, "getContainingDeclaration(...)");
                    if (q20.f.e(kVarL)) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                }
            }
            int i2 = gVar instanceof u ? -((u) gVar).g.length : i;
            Member memberB = gVar.b();
            ArrayList arrayList2 = new ArrayList();
            m10.u uVarX2 = descriptor.X();
            e30.w type2 = uVarX2 != null ? uVarX2.getType() : null;
            if (type2 != null) {
                arrayList2.add(type2);
            } else if (descriptor instanceof j10.j) {
                j10.e eVarX = ((j10.j) descriptor).x();
                kotlin.jvm.internal.m.d(eVarX, "getConstructedClass(...)");
                if (eVarX.k()) {
                    j10.k kVarL2 = eVarX.l();
                    kotlin.jvm.internal.m.c(kVarL2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    arrayList2.add(((j10.e) kVarL2).n());
                }
            } else {
                j10.k kVarL3 = descriptor.l();
                kotlin.jvm.internal.m.d(kVarL3, "getContainingDeclaration(...)");
                if (kVarL3 instanceof j10.e) {
                    j10.e eVar = (j10.e) kVarL3;
                    if (q20.f.e(eVar)) {
                        if (memberB == null) {
                            z2 = false;
                        } else {
                            Class<?> declaringClass = memberB.getDeclaringClass();
                            if (declaringClass == null ? false : !k00.f.I(declaringClass).j()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        if (z2) {
                            e30.a0 a0VarN = eVar.n();
                            kotlin.jvm.internal.m.d(a0VarN, "getDefaultType(...)");
                            arrayList2.add(ab.a0.n0(a0VarN));
                        } else {
                            arrayList2.add(eVar.n());
                        }
                    }
                }
            }
            List listO2 = descriptor.O();
            kotlin.jvm.internal.m.d(listO2, "getValueParameters(...)");
            Iterator it3 = listO2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((r0) it3.next()).getType());
            }
            Iterator it4 = arrayList2.iterator();
            int size = 0;
            while (it4.hasNext()) {
                ArrayList arrayListM3 = kh.n.M(e30.c.b((e30.w) it4.next()));
                size += arrayListM3 != null ? arrayListM3.size() : 1;
            }
            int i3 = size + i2 + (this.a ? ((size + 31) / 32) + 1 : 0) + ((z4 && ((j10.u) descriptor).isSuspend()) ? 1 : 0);
            boolean z5 = this.a;
            if (k00.f.A(this) != i3) {
                throw new a40.b0("Inconsistent number of parameters in the descriptor and Java reflection object: " + k00.f.A(this) + " != " + i3 + "\nCalling: " + descriptor + "\nParameter types: " + this.b.a() + ")\nDefault: " + z5);
            }
            z00.e eVarI0 = ab.a0.I0(Math.max(i, 0), arrayList2.size() + i);
            List[] listArr = new List[i3];
            int i4 = 0;
            while (i4 < i3) {
                if (i4 <= eVarI0.B && eVarI0.A <= i4) {
                    e30.a0 a0VarB = e30.c.b((e30.w) arrayList2.get(i4 - i));
                    listM = kh.n.M(a0VarB);
                    if (listM == null) {
                        Class clsI1 = kh.n.i0(a0VarB);
                        if (clsI1 != null) {
                            listM = va.a.R(kh.n.L(clsI1, descriptor));
                        } else {
                            listM = null;
                        }
                    }
                } else {
                    listM = null;
                }
                listArr[i4] = listM;
                i4++;
            }
            iVar = new a1.i(eVarI0, listArr, declaredMethod);
        }
        this.d = iVar;
        i00.b bVarS = va.a.s();
        g gVar2 = this.b;
        int length = gVar2 instanceof u ? ((u) gVar2).g.length : gVar2 instanceof t ? 1 : 0;
        if (length > 0) {
            bVarS.add(ab.a0.I0(0, length));
        }
        List[] listArr2 = (List[]) iVar.C;
        int length2 = listArr2.length;
        int i5 = 0;
        while (i5 < length2) {
            List list2 = listArr2[i5];
            int size2 = (list2 != null ? list2.size() : 1) + length;
            bVarS.add(ab.a0.I0(length, size2));
            i5++;
            length = size2;
        }
        this.e = (z00.e[]) va.a.k(bVarS).toArray(new z00.e[0]);
        Iterable iterable = (z00.e) this.d.B;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it5 = iterable.iterator();
            do {
                z00.d dVar = (z00.d) it5;
                if (dVar.C) {
                    list = ((List[]) this.d.C)[dVar.nextInt()];
                }
            } while (!(list != null && list.size() > 1));
            z3 = true;
        }
        this.f = z3;
    }

    @Override
    public final List a() {
        return this.b.a();
    }

    @Override
    public final Member b() {
        return this.c;
    }

    @Override
    public final boolean c() {
        return this.b instanceof r;
    }

    @Override
    public final Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Object objD;
        Object objD2;
        kotlin.jvm.internal.m.e(args, "args");
        a1.i iVar = this.d;
        z00.e eVar = (z00.e) iVar.B;
        List[] listArr = (List[]) iVar.C;
        Method method = (Method) iVar.D;
        boolean zIsEmpty = eVar.isEmpty();
        int i = eVar.B;
        int i2 = eVar.A;
        if (!zIsEmpty) {
            if (this.f) {
                i00.b bVar = new i00.b(args.length);
                for (int i3 = 0; i3 < i2; i3++) {
                    bVar.add(args[i3]);
                }
                if (i2 <= i) {
                    while (true) {
                        List<Method> list = listArr[i2];
                        Object obj = args[i2];
                        if (list != null) {
                            for (Method method2 : list) {
                                if (obj != null) {
                                    objD2 = method2.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method2.getReturnType();
                                    kotlin.jvm.internal.m.d(returnType, "getReturnType(...)");
                                    objD2 = i2.d(returnType);
                                }
                                bVar.add(objD2);
                            }
                        } else {
                            bVar.add(obj);
                        }
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                int i4 = i + 1;
                int length = args.length - 1;
                if (i4 <= length) {
                    while (true) {
                        bVar.add(args[i4]);
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                }
                args = va.a.k(bVar).toArray(new Object[0]);
            } else {
                int length2 = args.length;
                Object[] objArr = new Object[length2];
                for (int i5 = 0; i5 < length2; i5++) {
                    if (i5 > i || i2 > i5) {
                        objD = args[i5];
                    } else {
                        List list2 = listArr[i5];
                        Method method3 = list2 != null ? (Method) h00.q.d1(list2) : null;
                        objD = args[i5];
                        if (method3 != null) {
                            if (objD != null) {
                                objD = method3.invoke(objD, null);
                            } else {
                                Class<?> returnType2 = method3.getReturnType();
                                kotlin.jvm.internal.m.d(returnType2, "getReturnType(...)");
                                objD = i2.d(returnType2);
                            }
                        }
                    }
                    objArr[i5] = objD;
                }
                args = objArr;
            }
        }
        Object objCall = this.b.call(args);
        return (objCall == l00.a.A || method == null || (objInvoke = method.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    public final z00.e d(int i) {
        z00.e[] eVarArr = this.e;
        if (i >= 0 && i < eVarArr.length) {
            return eVarArr[i];
        }
        if (eVarArr.length == 0) {
            return new z00.e(i, i, 1);
        }
        int length = ((z00.e) h00.n.N0(eVarArr)).B + 1 + (i - eVarArr.length);
        return new z00.e(length, length, 1);
    }

    @Override
    public final Type getReturnType() {
        return this.b.getReturnType();
    }
}

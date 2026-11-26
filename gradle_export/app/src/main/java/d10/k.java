package d10;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

public final class k implements u00.a {
    public final int A;
    public final l B;

    public k(l lVar, int i) {
        this.A = i;
        this.B = lVar;
    }

    @Override
    public final Object invoke() {
        e10.w wVarA;
        GenericDeclaration declaredConstructor;
        e10.w wVarA2;
        j10.k kVarL;
        Member memberB;
        q30.e eVar;
        Object next;
        List listO;
        Iterator it;
        j10.u uVar;
        int i = this.A;
        Object objY = null;
        l lVar = this.B;
        switch (i) {
            case 0:
                n20.b bVar = c2.a;
                j10.u uVarW = lVar.w();
                l1 l1Var = lVar.H;
                p30.f fVarC = c2.c(uVarW);
                if (fVarC instanceof u0) {
                    if (lVar.y()) {
                        Class clsV = l1Var.v();
                        List parameters = lVar.getParameters();
                        ArrayList arrayList = new ArrayList(h00.r.q0(parameters, 10));
                        Iterator it2 = parameters.iterator();
                        while (it2.hasNext()) {
                            String name = ((w) ((w1) it2.next())).getName();
                            kotlin.jvm.internal.m.b(name);
                            arrayList.add(name);
                        }
                        e10.a aVar = e10.a.B;
                        e10.b bVar2 = e10.b.A;
                        return new e10.c(clsV, arrayList, aVar);
                    }
                    String desc = ((u0) fVarC).b.c;
                    l1Var.getClass();
                    kotlin.jvm.internal.m.e(desc, "desc");
                    Class clsV2 = l1Var.v();
                    try {
                        Class[] clsArr = (Class[]) ((ArrayList) l1Var.F(desc, false).B).toArray(new Class[0]);
                        objY = clsV2.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                        break;
                    } catch (NoSuchMethodException unused) {
                    }
                } else if (fVarC instanceof v0) {
                    j10.u uVarW2 = lVar.w();
                    j10.k kVarL2 = uVarW2.l();
                    kotlin.jvm.internal.m.d(kVarL2, "getContainingDeclaration(...)");
                    if (q20.f.c(kVarL2) && (uVarW2 instanceof j10.j) && ((j10.j) uVarW2).w()) {
                        j10.u uVarW3 = lVar.w();
                        String str = ((v0) fVarC).b.c;
                        List listO2 = lVar.w().O();
                        kotlin.jvm.internal.m.d(listO2, "getValueParameters(...)");
                        return new e10.b0(uVarW3, l1Var, str, listO2);
                    }
                    m20.e eVar2 = ((v0) fVarC).b;
                    objY = l1Var.y(eVar2.b, eVar2.c);
                } else if (fVarC instanceof t0) {
                    objY = ((t0) fVarC).b;
                    kotlin.jvm.internal.m.c(objY, "null cannot be cast to non-null type java.lang.reflect.Member");
                } else {
                    if (!(fVarC instanceof s0)) {
                        if (!(fVarC instanceof r0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        List list = ((r0) fVarC).b;
                        Class clsV3 = l1Var.v();
                        ArrayList arrayList2 = new ArrayList(h00.r.q0(list, 10));
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((Method) it3.next()).getName());
                        }
                        return new e10.c(clsV3, arrayList2, e10.a.B, e10.b.A, list);
                    }
                    objY = ((s0) fVarC).b;
                    kotlin.jvm.internal.m.c(objY, "null cannot be cast to non-null type java.lang.reflect.Member");
                }
                if (objY instanceof Constructor) {
                    wVarA = lVar.z((Constructor) objY, lVar.w(), false);
                } else {
                    if (!(objY instanceof Method)) {
                        throw new a40.b0("Could not compute caller for function: " + lVar.w() + " (member = " + objY + ')');
                    }
                    Method method = (Method) objY;
                    if (!Modifier.isStatic(method.getModifiers())) {
                        wVarA = ri.t1.D(lVar) ? new e10.r(method, kh.n.z(lVar.J, lVar.w())) : new e10.v(method);
                    } else if (lVar.w().getAnnotations().f(i2.a) != null) {
                        wVarA = ri.t1.D(lVar) ? new e10.s(method, false, 4) : new e10.v(4, 1, method, true);
                    } else {
                        wVarA = lVar.A(method, false);
                    }
                }
                return kh.n.B(wVarA, lVar.w(), false);
            default:
                n20.b bVar3 = c2.a;
                j10.u uVarW4 = lVar.w();
                l1 l1Var2 = lVar.H;
                p30.f fVarC2 = c2.c(uVarW4);
                if (!(fVarC2 instanceof v0)) {
                    if (fVarC2 instanceof u0) {
                        if (lVar.y()) {
                            Class clsV4 = l1Var2.v();
                            List parameters2 = lVar.getParameters();
                            ArrayList arrayList3 = new ArrayList(h00.r.q0(parameters2, 10));
                            Iterator it4 = parameters2.iterator();
                            while (it4.hasNext()) {
                                String name2 = ((w) ((w1) it4.next())).getName();
                                kotlin.jvm.internal.m.b(name2);
                                arrayList3.add(name2);
                            }
                            e10.a aVar2 = e10.a.A;
                            e10.b bVar4 = e10.b.A;
                            return new e10.c(clsV4, arrayList3, aVar2);
                        }
                        String desc2 = ((u0) fVarC2).b.c;
                        l1Var2.getClass();
                        kotlin.jvm.internal.m.e(desc2, "desc");
                        Class clsV5 = l1Var2.v();
                        ArrayList arrayList4 = new ArrayList();
                        l1.w(arrayList4, (ArrayList) l1Var2.F(desc2, false).B, true);
                        try {
                            Class[] clsArr2 = (Class[]) arrayList4.toArray(new Class[0]);
                            declaredConstructor = clsV5.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                        } catch (NoSuchMethodException unused2) {
                            declaredConstructor = null;
                        }
                    } else if (fVarC2 instanceof r0) {
                        List list2 = ((r0) fVarC2).b;
                        Class clsV6 = l1Var2.v();
                        ArrayList arrayList5 = new ArrayList(h00.r.q0(list2, 10));
                        Iterator it5 = list2.iterator();
                        while (it5.hasNext()) {
                            arrayList5.add(((Method) it5.next()).getName());
                        }
                        return new e10.c(clsV6, arrayList5, e10.a.A, e10.b.A, list2);
                    }
                    declaredConstructor = null;
                    break;
                } else {
                    j10.u uVarW5 = lVar.w();
                    j10.k kVarL3 = uVarW5.l();
                    kotlin.jvm.internal.m.d(kVarL3, "getContainingDeclaration(...)");
                    if (q20.f.c(kVarL3) && (uVarW5 instanceof j10.j) && ((j10.j) uVarW5).w()) {
                        throw new a40.b0(lVar.w().l() + " cannot have default arguments");
                    }
                    j10.u uVarW6 = lVar.w();
                    List listO3 = uVarW6.O();
                    kotlin.jvm.internal.m.d(listO3, "getValueParameters(...)");
                    if (listO3.isEmpty()) {
                        kVarL = uVarW6.l();
                        kotlin.jvm.internal.m.d(kVarL, "getContainingDeclaration(...)");
                        if (q20.f.e(kVarL)) {
                            memberB = lVar.a().b();
                            kotlin.jvm.internal.m.b(memberB);
                            if (Modifier.isStatic(memberB.getModifiers())) {
                                eVar = new q30.e(u20.d.l(uVarW6));
                                while (true) {
                                    if (eVar.hasNext()) {
                                        next = eVar.next();
                                        listO = ((j10.c) next).O();
                                        kotlin.jvm.internal.m.d(listO, "getValueParameters(...)");
                                        if (listO.isEmpty()) {
                                            it = listO.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    continue;
                                                } else if (((m10.r0) it.next()).Z0()) {
                                                }
                                            }
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                if (next instanceof j10.u) {
                                }
                            }
                        }
                    } else {
                        Iterator it6 = listO3.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                kVarL = uVarW6.l();
                                kotlin.jvm.internal.m.d(kVarL, "getContainingDeclaration(...)");
                                if (q20.f.e(kVarL)) {
                                    memberB = lVar.a().b();
                                    kotlin.jvm.internal.m.b(memberB);
                                    if (Modifier.isStatic(memberB.getModifiers())) {
                                        eVar = new q30.e(u20.d.l(uVarW6));
                                        while (true) {
                                            if (eVar.hasNext()) {
                                                next = eVar.next();
                                                listO = ((j10.c) next).O();
                                                kotlin.jvm.internal.m.d(listO, "getValueParameters(...)");
                                                if (listO.isEmpty()) {
                                                    it = listO.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            continue;
                                                        } else if (((m10.r0) it.next()).Z0()) {
                                                        }
                                                    }
                                                }
                                            } else {
                                                next = null;
                                            }
                                        }
                                        uVar = next instanceof j10.u ? (j10.u) next : null;
                                    }
                                }
                            } else if (((m10.r0) it6.next()).Z0()) {
                            }
                        }
                    }
                    if (uVar != null) {
                        m20.e eVar3 = ((v0) c2.c(uVar)).b;
                        declaredConstructor = l1Var2.x(eVar3.b, eVar3.c, true);
                    } else {
                        m20.e eVar4 = ((v0) fVarC2).b;
                        String str2 = eVar4.b;
                        String str3 = eVar4.c;
                        Member memberB2 = lVar.a().b();
                        kotlin.jvm.internal.m.b(memberB2);
                        declaredConstructor = l1Var2.x(str2, str3, !Modifier.isStatic(memberB2.getModifiers()));
                    }
                }
                if (declaredConstructor instanceof Constructor) {
                    wVarA2 = lVar.z((Constructor) declaredConstructor, lVar.w(), true);
                } else if (!(declaredConstructor instanceof Method)) {
                    wVarA2 = null;
                } else if (lVar.w().getAnnotations().f(i2.a) != null) {
                    j10.k kVarL4 = lVar.w().l();
                    kotlin.jvm.internal.m.c(kVarL4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    if (((j10.e) kVarL4).s()) {
                        wVarA2 = lVar.A((Method) declaredConstructor, lVar.a().c());
                    } else {
                        Method method2 = (Method) declaredConstructor;
                        wVarA2 = ri.t1.D(lVar) ? new e10.s(method2, false, 4) : new e10.v(4, 1, method2, true);
                    }
                } else {
                    wVarA2 = lVar.A((Method) declaredConstructor, lVar.a().c());
                }
                if (wVarA2 != null) {
                    return kh.n.B(wVarA2, lVar.w(), true);
                }
                return null;
        }
    }
}

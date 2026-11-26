package q20;

import c30.u;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import e30.a0;
import e30.a1;
import e30.f0;
import e30.h0;
import e30.m0;
import e30.w;
import h00.q;
import j10.l0;
import j10.n0;
import j10.o;
import j10.p;
import j10.q0;
import j10.y;
import j10.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import m10.i0;
import m10.j0;
import m10.k0;
import m10.r0;
import x20.n;

public abstract class k {
    public static final eh.l a = new eh.l("ResolutionAnchorProvider", 3);
    public static final eh.l b = new eh.l("StdlibClassFinder", 3);

    public static void a(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static final void c(j10.e eVar, LinkedHashSet linkedHashSet, n nVar, boolean z) {
        for (j10.k kVar : k00.f.C(nVar, x20.f.o, 2)) {
            if (kVar instanceof j10.e) {
                j10.e eVarY0 = (j10.e) kVar;
                if (eVarY0.E()) {
                    n20.e name = eVarY0.getName();
                    kotlin.jvm.internal.m.d(name, "getName(...)");
                    j10.h hVarG = nVar.g(name, r10.c.D);
                    eVarY0 = hVarG instanceof j10.e ? (j10.e) hVarG : hVarG instanceof q0 ? ((u) ((q0) hVarG)).Y0() : null;
                }
                if (eVarY0 != null) {
                    int i = d.a;
                    Iterator it = eVarY0.f().l().iterator();
                    while (it.hasNext()) {
                        if (d.n((w) it.next(), eVar.a())) {
                            linkedHashSet.add(eVarY0);
                            break;
                        }
                    }
                    if (z) {
                        n nVarI0 = eVarY0.i0();
                        kotlin.jvm.internal.m.d(nVarI0, "getUnsubstitutedInnerClassesScope(...)");
                        c(eVar, linkedHashSet, nVarI0, z);
                    }
                }
            }
        }
    }

    public static m10.u e(j10.b bVar, w wVar, n20.e eVar, k10.h hVar, int i) {
        if (bVar == null) {
            a(32);
            throw null;
        }
        if (hVar == null) {
            a(33);
            throw null;
        }
        if (wVar == null) {
            return null;
        }
        y20.a aVar = new y20.a(bVar, wVar, eVar);
        r30.j jVar = n20.f.a;
        return new m10.u(bVar, aVar, hVar, n20.e.e(n20.f.b + '_' + i));
    }

    public static j0 f(l0 l0Var, k10.h hVar) {
        return l(l0Var, hVar, true, l0Var.o());
    }

    public static k0 g(l0 l0Var, k10.h hVar) {
        n0 n0VarO = l0Var.o();
        if (n0VarO != null) {
            return m(l0Var, hVar, k10.g.a, true, l0Var.getVisibility(), n0VarO);
        }
        a(6);
        throw null;
    }

    public static i0 h(m10.b bVar) {
        if (bVar == null) {
            a(26);
            throw null;
        }
        z zVarC = d.c(bVar);
        kotlin.jvm.internal.m.e(zVarC, "<this>");
        j10.e eVarD = j10.w.d(zVarC, n20.h.A);
        if (eVarD == null) {
            return null;
        }
        y yVar = y.B;
        o oVar = p.e;
        i0 i0VarZ0 = i0.Z0(bVar, yVar, oVar, false, g10.p.b, 4, bVar.o());
        j0 j0Var = new j0(i0VarZ0, k10.g.a, yVar, oVar, false, false, false, 4, null, bVar.o());
        i0VarZ0.c1(j0Var, null, null, null);
        h0.B.getClass();
        h0 attributes = h0.C;
        m0 constructor = eVarD.f();
        List arguments = Collections.singletonList(new f0(bVar.n()));
        kotlin.jvm.internal.m.e(attributes, "attributes");
        kotlin.jvm.internal.m.e(constructor, "constructor");
        kotlin.jvm.internal.m.e(arguments, "arguments");
        a0 a0VarU = e30.c.u(attributes, constructor, arguments, false);
        List list = Collections.EMPTY_LIST;
        i0VarZ0.f1(a0VarU, list, null, null, list);
        j0Var.b1(i0VarZ0.getReturnType());
        return i0VarZ0;
    }

    public static m10.l0 i(m10.b bVar) {
        if (bVar == null) {
            a(24);
            throw null;
        }
        m10.l0 l0VarJ1 = m10.l0.j1(bVar, g10.p.c, 4, bVar.o());
        r0 r0Var = new r0(l0VarJ1, null, 0, k10.g.a, n20.e.e("value"), u20.d.e(bVar).v(), false, false, false, null, bVar.o());
        List list = Collections.EMPTY_LIST;
        return l0VarJ1.d1(null, null, list, list, Collections.singletonList(r0Var), bVar.n(), y.B, p.e);
    }

    public static m10.l0 j(m10.b bVar) {
        if (bVar == null) {
            a(22);
            throw null;
        }
        m10.l0 l0VarJ1 = m10.l0.j1(bVar, g10.p.a, 4, bVar.o());
        List list = Collections.EMPTY_LIST;
        g10.i iVarE = u20.d.e(bVar);
        a1 a1Var = a1.C;
        return l0VarJ1.d1(null, null, list, list, list, iVarE.h(bVar.n()), y.B, p.e);
    }

    public static m10.u k(j10.b bVar, w wVar, k10.h hVar) {
        if (wVar == null) {
            return null;
        }
        return new m10.u(bVar, new y20.b(bVar, wVar), hVar);
    }

    public static j0 l(l0 l0Var, k10.h hVar, boolean z, n0 n0Var) {
        if (hVar == null) {
            a(18);
            throw null;
        }
        if (n0Var != null) {
            return new j0(l0Var, hVar, l0Var.g(), l0Var.getVisibility(), z, false, false, 1, null, n0Var);
        }
        a(19);
        throw null;
    }

    public static k0 m(l0 l0Var, k10.h hVar, k10.h hVar2, boolean z, o oVar, n0 n0Var) {
        if (hVar == null) {
            a(8);
            throw null;
        }
        if (hVar2 == null) {
            a(9);
            throw null;
        }
        if (oVar == null) {
            a(10);
            throw null;
        }
        if (n0Var == null) {
            a(11);
            throw null;
        }
        k0 k0Var = new k0(l0Var, hVar, l0Var.g(), oVar, z, false, false, 1, null, n0Var);
        k0Var.N = k0.a1(k0Var, l0Var.getType(), hVar2);
        return k0Var;
    }

    public static boolean n(j10.u uVar) {
        if (uVar.getKind() != 4) {
            return false;
        }
        j10.k kVarL = uVar.l();
        int i = d.a;
        return d.l(kVarL, j10.f.C);
    }

    public static final Collection o(Collection collection, u00.k kVar) {
        kotlin.jvm.internal.m.e(collection, "<this>");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        int i = n30.i.C;
        n30.i iVarE = n30.l.e();
        while (!linkedList.isEmpty()) {
            Object objL0 = q.L0(linkedList);
            int i2 = n30.i.C;
            n30.i iVarE2 = n30.l.e();
            ArrayList arrayListG = j.g(objL0, linkedList, kVar, new a20.d(iVarE2, 27));
            if (arrayListG.size() == 1 && iVarE2.isEmpty()) {
                Object objC1 = q.c1(arrayListG);
                kotlin.jvm.internal.m.d(objC1, "single(...)");
                iVarE.add(objC1);
            } else {
                Object objS = j.s(arrayListG, kVar);
                j10.b bVar = (j10.b) kVar.invoke(objS);
                for (Object obj : arrayListG) {
                    kotlin.jvm.internal.m.b(obj);
                    if (!j.k(bVar, (j10.b) kVar.invoke(obj))) {
                        iVarE2.add(obj);
                    }
                }
                if (!iVarE2.isEmpty()) {
                    iVarE.addAll(iVarE2);
                }
                iVarE.add(objS);
            }
        }
        return iVarE;
    }

    public abstract void b(j10.c cVar);

    public abstract void d(j10.c cVar, j10.c cVar2);

    public void p(j10.c member, Collection collection) {
        kotlin.jvm.internal.m.e(member, "member");
        member.h0(collection);
    }
}

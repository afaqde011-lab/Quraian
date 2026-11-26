package b20;

import com.google.android.gms.internal.measurement.b5;
import e30.v0;
import e30.x0;
import j10.l0;
import j10.o0;
import j10.u0;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import m10.i0;

public final class x implements u00.k {
    public final int A;
    public final a0 B;

    public x(a0 a0Var, int i) {
        this.A = i;
        this.B = a0Var;
    }

    @Override
    public final Object invoke(Object obj) {
        e20.d iVar;
        e20.d zVar;
        int i = this.A;
        a0 a0Var = this.B;
        switch (i) {
            case 0:
                n20.e name = (n20.e) obj;
                kotlin.jvm.internal.m.e(name, "name");
                a0 a0Var2 = a0Var.c;
                if (a0Var2 != null) {
                    return (Collection) a0Var2.f.invoke(name);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((c) a0Var.e.invoke()).e(name).iterator();
                while (it.hasNext()) {
                    z10.e eVarT = a0Var.t((p10.x) it.next());
                    if (a0Var.r(eVarT)) {
                        ((a20.b) a0Var.b.B).g.getClass();
                        arrayList.add(eVarT);
                    }
                }
                a0Var.j(arrayList, name);
                return arrayList;
            case 1:
                n20.e name2 = (n20.e) obj;
                kotlin.jvm.internal.m.e(name2, "name");
                a0 a0Var3 = a0Var.c;
                if (a0Var3 != null) {
                    return (l0) a0Var3.g.invoke(name2);
                }
                p10.u uVarD = ((c) a0Var.e.invoke()).d(name2);
                if (uVarD != null) {
                    Field field = uVarD.a;
                    if (!field.isEnumConstant()) {
                        kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
                        boolean z = !Modifier.isFinal(((Field) uVarD.b()).getModifiers());
                        oj.q c = a0Var.b;
                        a20.e eVarF = ca.v.F(c, uVarD);
                        a20.b bVar = (a20.b) c.B;
                        j10.k kVarQ = a0Var.q();
                        o0 o0Var = j10.y.A;
                        int i2 = 0;
                        z10.f fVarG1 = z10.f.g1(kVarQ, eVarF, b5.O(uVarD.e()), z, uVarD.c(), bVar.j.b(uVarD), Modifier.isFinal(((Field) uVarD.b()).getModifiers()) && Modifier.isStatic(((Field) uVarD.b()).getModifiers()));
                        zVar2.A = fVarG1;
                        fVarG1.c1(null, null, null, null);
                        a1.i iVar2 = (a1.i) c.E;
                        Type genericType = field.getGenericType();
                        kotlin.jvm.internal.m.d(genericType, "getGenericType(...)");
                        boolean z2 = genericType instanceof Class;
                        if (z2) {
                            Class cls = (Class) genericType;
                            if (cls.isPrimitive()) {
                                zVar = new p10.z(cls);
                            } else {
                                if (!(genericType instanceof GenericArrayType) || (z2 && ((Class) genericType).isArray())) {
                                    iVar = new p10.i(genericType);
                                } else {
                                    iVar = genericType instanceof WildcardType ? new p10.e0((WildcardType) genericType) : new p10.q(genericType);
                                }
                                zVar = iVar;
                            }
                        } else {
                            if (genericType instanceof GenericArrayType) {
                                iVar = new p10.i(genericType);
                            } else {
                                iVar = new p10.i(genericType);
                            }
                            zVar = iVar;
                        }
                        e30.w wVarG = iVar2.G(zVar, p30.f.t0(v0.B, false, null, 7));
                        if ((g10.i.G(wVarG) || g10.i.H(wVarG)) && Modifier.isFinal(((Field) uVarD.b()).getModifiers())) {
                            Modifier.isStatic(((Field) uVarD.b()).getModifiers());
                        }
                        i0 i0Var = (i0) zVar2.A;
                        m10.u uVarP = a0Var.p();
                        h00.x xVar = h00.x.A;
                        i0Var.f1(wVarG, xVar, uVarP, null, xVar);
                        j10.k kVarQ2 = a0Var.q();
                        if ((kVarQ2 instanceof j10.e ? (j10.e) kVarQ2 : null) != null) {
                            v20.e eVar = bVar.x;
                            i0 propertyDescriptor = (i0) zVar2.A;
                            ((v20.a) eVar).getClass();
                            kotlin.jvm.internal.m.e(propertyDescriptor, "propertyDescriptor");
                            kotlin.jvm.internal.m.e(c, "c");
                            zVar2.A = propertyDescriptor;
                        }
                        Object obj2 = zVar2.A;
                        u0 u0Var = (u0) obj2;
                        e30.w type = ((i0) obj2).getType();
                        if (u0Var == null) {
                            q20.d.a(65);
                            throw null;
                        }
                        if (type == null) {
                            q20.d.a(66);
                            throw null;
                        }
                        int i3 = q20.d.a;
                        if (!u0Var.W() && !e30.c.k(type)) {
                            if (x0.b(type)) {
                                ((i0) zVar2.A).d1(null, new w(a0Var, uVarD, zVar2, i2));
                            } else {
                                g10.i iVarE = u20.d.e(u0Var);
                                if (g10.i.G(type)) {
                                    ((i0) zVar2.A).d1(null, new w(a0Var, uVarD, zVar2, i2));
                                } else {
                                    f30.l lVar = f30.d.a;
                                    if (lVar.a(iVarE.v(), type) || lVar.a(iVarE.k("Number").n(), type) || lVar.a(iVarE.e(), type) || g10.t.a(type)) {
                                        ((i0) zVar2.A).d1(null, new w(a0Var, uVarD, zVar2, i2));
                                    }
                                }
                            }
                        }
                        y10.h hVar = bVar.g;
                        l0 l0Var = (l0) zVar2.A;
                        hVar.getClass();
                        if (l0Var != null) {
                            return (l0) zVar2.A;
                        }
                        Object[] objArr = new Object[3];
                        switch (6) {
                            case 1:
                                objArr[0] = "member";
                                break;
                            case 2:
                            case 4:
                            case 6:
                            case 8:
                                objArr[0] = "descriptor";
                                break;
                            case 3:
                                objArr[0] = "element";
                                break;
                            case 5:
                                objArr[0] = "field";
                                break;
                            case 7:
                                objArr[0] = "javaClass";
                                break;
                            default:
                                objArr[0] = "fqName";
                                break;
                        }
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
                        switch (6) {
                            case 1:
                            case 2:
                                objArr[2] = "recordMethod";
                                break;
                            case 3:
                            case 4:
                                objArr[2] = "recordConstructor";
                                break;
                            case 5:
                            case 6:
                                objArr[2] = "recordField";
                                break;
                            case 7:
                            case 8:
                                objArr[2] = "recordClass";
                                break;
                            default:
                                objArr[2] = "getClassResolvedFromSource";
                                break;
                        }
                        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                    }
                }
                return null;
            case 2:
                n20.e name3 = (n20.e) obj;
                kotlin.jvm.internal.m.e(name3, "name");
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) a0Var.f.invoke(name3));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : linkedHashSet) {
                    String strU = c7.i.u((m10.l0) obj3, 2);
                    Object arrayList2 = linkedHashMap.get(strU);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(strU, arrayList2);
                    }
                    ((List) arrayList2).add(obj3);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        Collection collectionO = q20.k.o(list, l.C);
                        linkedHashSet.removeAll(list);
                        linkedHashSet.addAll(collectionO);
                    }
                }
                a0Var.m(linkedHashSet, name3);
                oj.q qVar = a0Var.b;
                return h00.q.n1(((a20.b) qVar.B).r.e(qVar, linkedHashSet));
            default:
                n20.e name4 = (n20.e) obj;
                kotlin.jvm.internal.m.e(name4, "name");
                ArrayList arrayList3 = new ArrayList();
                n30.l.a(arrayList3, a0Var.g.invoke(name4));
                a0Var.n(arrayList3, name4);
                j10.k kVarQ3 = a0Var.q();
                int i4 = q20.d.a;
                if (q20.d.l(kVarQ3, j10.f.E)) {
                    return h00.q.n1(arrayList3);
                }
                oj.q qVar2 = a0Var.b;
                return h00.q.n1(((a20.b) qVar2.B).r.e(qVar2, arrayList3));
        }
    }
}

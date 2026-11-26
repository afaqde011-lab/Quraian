package a20;

import a1.u0;
import android.graphics.Bitmap;
import b20.f0;
import b20.n;
import c40.t;
import c7.i;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import e30.a0;
import e30.g0;
import e30.p0;
import e30.v;
import e30.x0;
import e30.z0;
import e7.l0;
import g20.p;
import gz.m1;
import h00.j0;
import h00.r;
import h30.l;
import i2.h0;
import i20.a1;
import i20.h1;
import j10.e0;
import j10.n0;
import j10.o0;
import j10.r0;
import j10.w;
import j10.z;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k20.j;
import kotlin.jvm.internal.m;
import oj.q;
import p10.b0;
import p10.c0;
import p10.d0;
import p10.o;
import p10.s;
import p10.x;
import u00.k;

public final class d implements k {
    public final int A;
    public final Object B;

    public d(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override
    public final Object invoke(Object obj) throws InvocationTargetException {
        Object next;
        e0 e0Var;
        a30.k kVarA;
        e0 e0Var2;
        boolean z;
        boolean z2;
        boolean zIsEmpty;
        n20.c cVarC;
        p0 p0VarA;
        l lVarK;
        boolean zEquals;
        boolean z3 = false;
        v vVar = null;
        int i = 1;
        switch (this.A) {
            case 0:
                e eVar = (e) this.B;
                p10.e annotation = (p10.e) obj;
                m.e(annotation, "annotation");
                n20.e eVar2 = y10.c.a;
                return y10.c.b(eVar.A, annotation, eVar.C);
            case 1:
                g gVar = (g) this.B;
                c0 typeParameter = (c0) obj;
                m.e(typeParameter, "typeParameter");
                LinkedHashMap linkedHashMap = (LinkedHashMap) gVar.E;
                j10.l lVar = (j10.l) gVar.D;
                Integer num = (Integer) linkedHashMap.get(typeParameter);
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                q qVar = (q) gVar.C;
                m.e(qVar, "<this>");
                return new f0(i.x(new q((b) qVar.B, gVar, (g00.h) qVar.D), lVar.getAnnotations()), typeParameter, gVar.B + iIntValue, lVar);
            case 2:
                i10.q qVar2 = (i10.q) this.B;
                n20.c fqName = (n20.c) obj;
                m.e(fqName, "fqName");
                b30.c cVarC2 = qVar2.c(fqName);
                if (cVarC2 == null) {
                    return null;
                }
                a30.i iVar = qVar2.c;
                if (iVar != null) {
                    cVarC2.Z0(iVar);
                    return cVarC2;
                }
                m.k("components");
                throw null;
            case 3:
                a30.g gVar2 = (a30.g) this.B;
                a30.f key = (a30.f) obj;
                m.e(key, "key");
                n20.b bVar = key.a;
                a30.i iVar2 = gVar2.a;
                Iterator it = iVar2.k.iterator();
                while (it.hasNext()) {
                    j10.e eVarC = ((l10.c) it.next()).c(bVar);
                    if (eVarC != null) {
                        return eVarC;
                    }
                }
                if (a30.g.c.contains(bVar)) {
                    return null;
                }
                a30.d dVarB = key.b;
                if (dVarB == null && (dVarB = iVar2.d.b(bVar)) == null) {
                    return null;
                }
                k20.g gVar3 = dVarB.a;
                i20.k kVar = dVarB.b;
                k20.a aVar = dVarB.c;
                n0 n0Var = dVarB.d;
                n20.b bVarE = bVar.e();
                if (bVarE != null) {
                    j10.e eVarA = gVar2.a(bVarE, null);
                    c30.i iVar3 = eVarA instanceof c30.i ? (c30.i) eVarA : null;
                    if (iVar3 == null) {
                        return null;
                    }
                    if (!iVar3.e0().m().contains(bVar.f())) {
                        return null;
                    }
                    kVarA = iVar3.L;
                } else {
                    Iterator it2 = w.i(iVar2.f, bVar.a).iterator();
                    do {
                        if (it2.hasNext()) {
                            next = it2.next();
                            e0Var2 = (e0) next;
                            if (e0Var2 instanceof b30.c) {
                            }
                        } else {
                            next = null;
                        }
                        e0Var = (e0) next;
                        if (e0Var == null) {
                            return null;
                        }
                        a1 a1Var = kVar.a0;
                        m.d(a1Var, "getTypeTable(...)");
                        h9.f fVar = new h9.f(a1Var);
                        j jVar = j.b;
                        h1 h1Var = kVar.c0;
                        m.d(h1Var, "getVersionRequirementTable(...)");
                        kVarA = iVar2.a(e0Var, gVar3, fVar, ta.c0.D(h1Var), aVar, null);
                    } while (!((c30.q) ((b30.c) e0Var2).N()).m().contains(bVar.f()));
                    e0Var = (e0) next;
                    if (e0Var == null) {
                        return null;
                    }
                    a1 a1Var2 = kVar.a0;
                    m.d(a1Var2, "getTypeTable(...)");
                    h9.f fVar2 = new h9.f(a1Var2);
                    j jVar2 = j.b;
                    h1 h1Var2 = kVar.c0;
                    m.d(h1Var2, "getVersionRequirementTable(...)");
                    kVarA = iVar2.a(e0Var, gVar3, fVar2, ta.c0.D(h1Var2), aVar, null);
                }
                return new c30.i(kVarA, kVar, gVar3, aVar, n0Var);
            case 4:
                b20.a aVar2 = (b20.a) this.B;
                x m = (x) obj;
                m.e(m, "m");
                if (((Boolean) aVar2.b.invoke(m)).booleanValue()) {
                    Class<?> declaringClass = ((Method) m.b()).getDeclaringClass();
                    m.d(declaringClass, "getDeclaringClass(...)");
                    if (declaringClass.isInterface()) {
                        String strB = m.c().b();
                        int iHashCode = strB.hashCode();
                        if (iHashCode != -1776922004) {
                            if (iHashCode != -1295482945) {
                                if (iHashCode == 147696667 && strB.equals("hashCode")) {
                                    zIsEmpty = ((ArrayList) m.g()).isEmpty();
                                }
                            } else if (strB.equals("equals")) {
                                d0 d0Var = (d0) h00.q.f1(m.g());
                                b0 b0Var = d0Var != null ? d0Var.a : null;
                                p10.q qVar3 = b0Var instanceof p10.q ? (p10.q) b0Var : null;
                                if (qVar3 != null) {
                                    s sVar = qVar3.b;
                                    if ((sVar instanceof o) && (cVarC = ((o) sVar).c()) != null && m.a(cVarC.a.a, "java.lang.Object")) {
                                        zIsEmpty = true;
                                    }
                                }
                            }
                            zIsEmpty = false;
                        } else if (strB.equals("toString")) {
                            zIsEmpty = ((ArrayList) m.g()).isEmpty();
                        } else {
                            zIsEmpty = false;
                        }
                        if (zIsEmpty) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                b20.i iVar4 = (b20.i) this.B;
                m.e((f30.f) obj, "it");
                return new n(iVar4.J, iVar4, iVar4.H, iVar4.I != null, iVar4.Q);
            case 6:
                n20.e eVar3 = (n20.e) this.B;
                x20.n it3 = (x20.n) obj;
                m.e(it3, "it");
                return it3.e(eVar3, r10.c.E);
            case 7:
                a40.k kVar2 = (a40.k) this.B;
                g00.b0 b0Var2 = g00.b0.a;
                kVar2.resumeWith(b0Var2);
                return b0Var2;
            case 8:
                ((c40.s) ((t) this.B)).j(null);
                return g00.b0.a;
            case 9:
                k2.d record = (k2.d) obj;
                m.e(record, "$this$record");
                k2.d.m(record, new i2.d((Bitmap) this.B), 0L, 0.0f, (i2.m) null, 62);
                return g00.b0.a;
            case 10:
                k2.d record2 = (k2.d) obj;
                m.e(record2, "$this$record");
                rd.a.x(record2, (l2.b) this.B);
                return g00.b0.a;
            case 11:
                e30.f fVar3 = (e30.f) this.B;
                e30.e supertypes = (e30.e) obj;
                m.e(supertypes, "supertypes");
                o0 o0VarC = fVar3.c();
                Collection superTypes = supertypes.a;
                o0VarC.getClass();
                m.e(superTypes, "superTypes");
                if (superTypes.isEmpty()) {
                    e30.w wVarB = fVar3.b();
                    List listR = wVarB != null ? va.a.R(wVarB) : null;
                    if (listR == null) {
                        listR = h00.x.A;
                    }
                    superTypes = listR;
                }
                List listN1 = superTypes instanceof List ? (List) superTypes : null;
                if (listN1 == null) {
                    listN1 = h00.q.n1(superTypes);
                }
                List listH = fVar3.h(listN1);
                m.e(listH, "<set-?>");
                supertypes.b = listH;
                return g00.b0.a;
            case 12:
                v vVar2 = (v) this.B;
                f30.f kotlinTypeRefiner = (f30.f) obj;
                m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
                LinkedHashSet linkedHashSet = vVar2.B;
                ArrayList arrayList = new ArrayList(r.q0(linkedHashSet, 10));
                Iterator it4 = linkedHashSet.iterator();
                boolean z4 = false;
                while (it4.hasNext()) {
                    arrayList.add(((e30.w) it4.next()).A0(kotlinTypeRefiner));
                    z4 = true;
                }
                if (z4) {
                    e30.w wVar = vVar2.A;
                    e30.w wVarW0 = wVar != null ? wVar.A0(kotlinTypeRefiner) : null;
                    arrayList.isEmpty();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                    linkedHashSet2.hashCode();
                    v vVar3 = new v(linkedHashSet2);
                    vVar3.A = wVarW0;
                    vVar = vVar3;
                }
                if (vVar != null) {
                    vVar2 = vVar;
                }
                return vVar2.a();
            case 13:
                u0 u0Var = (u0) this.B;
                e30.o0 o0Var = (e30.o0) obj;
                r0 r0Var = o0Var.a;
                c20.a aVar3 = o0Var.b;
                Set set = aVar3.e;
                if (set != null && set.contains(r0Var.a())) {
                    return u0Var.F(aVar3);
                }
                a0 a0VarN = r0Var.n();
                m.d(a0VarN, "getDefaultType(...)");
                LinkedHashSet<r0> linkedHashSet3 = new LinkedHashSet();
                ab.a0.Y(a0VarN, a0VarN, linkedHashSet3, set);
                int iP = h00.d0.P(r.q0(linkedHashSet3, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iP >= 16 ? iP : 16);
                for (r0 r0Var2 : linkedHashSet3) {
                    if (set == null || !set.contains(r0Var2)) {
                        Set set2 = aVar3.e;
                        p0VarA = c20.e.a(r0Var2, aVar3, u0Var, u0Var.G(r0Var2, c20.a.a(aVar3, null, false, set2 != null ? j0.r0(set2, r0Var) : w50.c.g0(r0Var), null, 47)));
                    } else {
                        p0VarA = x0.k(r0Var2, aVar3);
                    }
                    linkedHashMap2.put(r0Var2.f(), p0VarA);
                }
                e30.u0 u0Var2 = new e30.u0(new g0(linkedHashMap2, i));
                List upperBounds = r0Var.getUpperBounds();
                m.d(upperBounds, "getUpperBounds(...)");
                i00.i iVarU = u0Var.U(u0Var2, upperBounds, aVar3);
                if (iVarU.A.isEmpty()) {
                    return u0Var.F(aVar3);
                }
                if (iVarU.A.I == 1) {
                    return (e30.w) h00.q.c1(iVarU);
                }
                throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
            case 14:
                l0 l0Var = (l0) this.B;
                f30.m mVar = f30.m.A;
                f20.b it5 = (f20.b) obj;
                m.e(it5, "it");
                x10.s sVar2 = it5.b;
                h30.g receiver = it5.a;
                if (l0Var.b && receiver != null) {
                    m.e(receiver, "$receiver");
                    if (!(receiver instanceof e30.w)) {
                        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb.append(receiver);
                        sb.append(", ");
                        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb).toString());
                    }
                    if (receiver instanceof c20.i) {
                        return null;
                    }
                }
                if (receiver == null || (lVarK = mVar.K(receiver)) == null) {
                    return null;
                }
                List listS = f30.g.s(lVarK);
                List listQ = f30.g.q(receiver);
                Iterator it6 = listS.iterator();
                Iterator it7 = listQ.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(r.q0(listS, 10), r.q0(listQ, 10)));
                while (it6.hasNext() && it7.hasNext()) {
                    h30.m mVar2 = (h30.m) it6.next();
                    z0 z0VarU = f30.g.u(mVar, (h30.k) it7.next());
                    arrayList2.add(z0VarU == null ? new f20.b(null, sVar2, mVar2) : new f20.b(z0VarU, x10.b.b(((b) ((q) l0Var.d).B).q, sVar2, z0VarU.getAnnotations()), mVar2));
                }
                return arrayList2;
            case 15:
                m10.r0 r0Var3 = (m10.r0) this.B;
                j10.c it8 = (j10.c) obj;
                m.e(it8, "it");
                e30.w type = ((m10.r0) it8.O().get(r0Var3.G)).getType();
                m.d(type, "getType(...)");
                return type;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                th.o oVar = (th.o) this.B;
                o10.c kotlinClass = (o10.c) obj;
                m.e(kotlinClass, "kotlinClass");
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                u0 u0Var3 = new u0(oVar, map, map2);
                Class klass = kotlinClass.a;
                String str = "toString(...)";
                String str2 = "getParameterTypes(...)";
                String str3 = "(";
                m.e(klass, "klass");
                Method[] declaredMethods = klass.getDeclaredMethods();
                m.d(declaredMethods, "getDeclaredMethods(...)");
                int length = declaredMethods.length;
                int i2 = 0;
                while (i2 < length) {
                    Method method = declaredMethods[i2];
                    n20.e eVarE = n20.e.e(method.getName());
                    StringBuilder sb2 = new StringBuilder("(");
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    m.d(parameterTypes, "getParameterTypes(...)");
                    Class cls = klass;
                    int i3 = 0;
                    for (int length2 = parameterTypes.length; i3 < length2; length2 = length2) {
                        Class<?> cls2 = parameterTypes[i3];
                        m.b(cls2);
                        sb2.append(p10.d.b(cls2));
                        i3++;
                    }
                    sb2.append(")");
                    Class<?> returnType = method.getReturnType();
                    m.d(returnType, "getReturnType(...)");
                    sb2.append(p10.d.b(returnType));
                    String string = sb2.toString();
                    m.d(string, "toString(...)");
                    q qVarX = u0Var3.X(eVarE, string);
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    m.d(declaredAnnotations, "getDeclaredAnnotations(...)");
                    int length3 = declaredAnnotations.length;
                    int i4 = 0;
                    while (i4 < length3) {
                        Annotation[] annotationArr = declaredAnnotations;
                        Annotation annotation2 = annotationArr[i4];
                        m.b(annotation2);
                        f50.c.R(qVarX, annotation2);
                        i4++;
                        declaredAnnotations = annotationArr;
                    }
                    Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                    m.d(parameterAnnotations, "getParameterAnnotations(...)");
                    Annotation[][] annotationArr2 = parameterAnnotations;
                    int length4 = annotationArr2.length;
                    int i5 = 0;
                    while (i5 < length4) {
                        Annotation[] annotationArr3 = annotationArr2[i5];
                        m.b(annotationArr3);
                        Annotation[][] annotationArr4 = annotationArr2;
                        int length5 = annotationArr3.length;
                        Method[] methodArr = declaredMethods;
                        int i6 = 0;
                        while (i6 < length5) {
                            int i7 = length5;
                            Annotation annotation3 = annotationArr3[i6];
                            int i8 = i6;
                            Class clsD = k00.f.D(k00.f.z(annotation3));
                            int i9 = length;
                            int i11 = i2;
                            ui.b bVarW = qVarX.W(i5, p10.d.a(clsD), new o10.a(annotation3));
                            if (bVarW != null) {
                                f50.c.S(bVarW, annotation3, clsD);
                            }
                            i6 = i8 + 1;
                            length5 = i7;
                            length = i9;
                            i2 = i11;
                        }
                        i5++;
                        annotationArr2 = annotationArr4;
                        declaredMethods = methodArr;
                    }
                    qVarX.a();
                    i2++;
                    klass = cls;
                }
                Class cls3 = klass;
                Constructor<?>[] declaredConstructors = cls3.getDeclaredConstructors();
                m.d(declaredConstructors, "getDeclaredConstructors(...)");
                int length6 = declaredConstructors.length;
                int i12 = 0;
                while (i12 < length6) {
                    Constructor<?> constructor = declaredConstructors[i12];
                    n20.e eVar4 = n20.g.e;
                    m.b(constructor);
                    StringBuilder sb3 = new StringBuilder(str3);
                    Class<?>[] parameterTypes2 = constructor.getParameterTypes();
                    m.d(parameterTypes2, str2);
                    Constructor<?>[] constructorArr = declaredConstructors;
                    for (Class<?> cls4 : parameterTypes2) {
                        m.b(cls4);
                        sb3.append(p10.d.b(cls4));
                    }
                    sb3.append(")V");
                    String string2 = sb3.toString();
                    m.d(string2, str);
                    q qVarX2 = u0Var3.X(eVar4, string2);
                    Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
                    m.d(declaredAnnotations2, "getDeclaredAnnotations(...)");
                    for (Annotation annotation4 : declaredAnnotations2) {
                        m.b(annotation4);
                        f50.c.R(qVarX2, annotation4);
                    }
                    Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
                    m.b(parameterAnnotations2);
                    if (parameterAnnotations2.length != 0) {
                        int length7 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                        int length8 = parameterAnnotations2.length;
                        int i13 = 0;
                        while (i13 < length8) {
                            Annotation[] annotationArr5 = parameterAnnotations2[i13];
                            m.b(annotationArr5);
                            String str4 = str;
                            int length9 = annotationArr5.length;
                            int i14 = length6;
                            int i15 = 0;
                            while (i15 < length9) {
                                int i16 = length9;
                                Annotation annotation5 = annotationArr5[i15];
                                int i17 = i15;
                                Class clsD2 = k00.f.D(k00.f.z(annotation5));
                                String str5 = str2;
                                String str6 = str3;
                                int i18 = i12;
                                ui.b bVarW2 = qVarX2.W(i13 + length7, p10.d.a(clsD2), new o10.a(annotation5));
                                if (bVarW2 != null) {
                                    f50.c.S(bVarW2, annotation5, clsD2);
                                }
                                i15 = i17 + 1;
                                length9 = i16;
                                str2 = str5;
                                str3 = str6;
                                i12 = i18;
                            }
                            i13++;
                            str = str4;
                            length6 = i14;
                        }
                    }
                    String str7 = str;
                    int i19 = length6;
                    String str8 = str2;
                    String str9 = str3;
                    int i21 = i12;
                    qVarX2.a();
                    i12 = i21 + 1;
                    declaredConstructors = constructorArr;
                    str = str7;
                    length6 = i19;
                    str2 = str8;
                    str3 = str9;
                }
                Field[] declaredFields = cls3.getDeclaredFields();
                m.d(declaredFields, "getDeclaredFields(...)");
                int length10 = declaredFields.length;
                int i22 = 0;
                while (i22 < length10) {
                    Field field = declaredFields[i22];
                    n20.e eVarE2 = n20.e.e(field.getName());
                    Class<?> type2 = field.getType();
                    m.d(type2, "getType(...)");
                    String desc = p10.d.b(type2);
                    m.e(desc, "desc");
                    String strB2 = eVarE2.b();
                    m.d(strB2, "asString(...)");
                    p pVar = new p(strB2 + '#' + desc);
                    ArrayList arrayList3 = new ArrayList();
                    Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
                    m.d(declaredAnnotations3, "getDeclaredAnnotations(...)");
                    int length11 = declaredAnnotations3.length;
                    int i23 = 0;
                    while (i23 < length11) {
                        Annotation annotation6 = declaredAnnotations3[i23];
                        m.b(annotation6);
                        Class clsD3 = k00.f.D(k00.f.z(annotation6));
                        Field[] fieldArr = declaredFields;
                        int i24 = length10;
                        ui.b bVarF = ((th.o) u0Var3.B).F(p10.d.a(clsD3), new o10.a(annotation6), arrayList3);
                        if (bVarF != null) {
                            f50.c.S(bVarF, annotation6, clsD3);
                        }
                        i23++;
                        declaredFields = fieldArr;
                        length10 = i24;
                    }
                    Field[] fieldArr2 = declaredFields;
                    int i25 = length10;
                    if (!arrayList3.isEmpty()) {
                        ((HashMap) u0Var3.C).put(pVar, arrayList3);
                    }
                    i22++;
                    declaredFields = fieldArr2;
                    length10 = i25;
                }
                return new g20.c(map, map2, map3);
            case 17:
                String it9 = (String) obj;
                m.e(it9, "it");
                ((m1) this.B).l(new gz.g0(it9));
                return g00.b0.a;
            case 18:
                i10.o oVar2 = (i10.o) this.B;
                g00.k kVar3 = (g00.k) obj;
                m.e(kVar3, "<destruct>");
                String str10 = (String) kVar3.A;
                String str11 = (String) kVar3.B;
                List listR2 = va.a.R(k10.e.a(oVar2.a.E, a1.b.q("'", str10, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str11, "()' stdlib extension instead"), str11 + "()", "HIDDEN"));
                return listR2.isEmpty() ? k10.g.a : new k10.i(0, listR2);
            case 19:
                ((l1.d) this.B).cancel();
                return g00.b0.a;
            case 20:
                l6.f fVar4 = (l6.f) this.B;
                synchronized (fVar4.D) {
                    fVar4.E = 5;
                    fVar4.G = null;
                }
                return g00.b0.a;
            case 21:
                m10.a aVar4 = (m10.a) this.B;
                ((f30.f) obj).getClass();
                return (a0) aVar4.B.B.invoke();
            case 22:
                m10.f fVar5 = (m10.f) this.B;
                z0 z0Var = (z0) obj;
                m.b(z0Var);
                if (!e30.c.k(z0Var)) {
                    j10.h hVarG = z0Var.m0().g();
                    if ((hVarG instanceof r0) && !m.a(((r0) hVarG).l(), fVar5)) {
                        z3 = true;
                    }
                }
                return Boolean.valueOf(z3);
            case 23:
                m10.a0 a0Var = (m10.a0) this.B;
                n20.c fqName2 = (n20.c) obj;
                m.e(fqName2, "fqName");
                m10.f0 f0Var = a0Var.G;
                d30.l storageManager = a0Var.D;
                ((m10.e0) f0Var).getClass();
                m.e(storageManager, "storageManager");
                return new m10.w(a0Var, fqName2, storageManager);
            case 24:
                o oVar3 = (o) this.B;
                Method method2 = (Method) obj;
                if (!method2.isSynthetic()) {
                    if (oVar3.a.isEnum()) {
                        String name = method2.getName();
                        if (m.a(name, "values")) {
                            Class<?>[] parameterTypes3 = method2.getParameterTypes();
                            m.d(parameterTypes3, "getParameterTypes(...)");
                            if (parameterTypes3.length == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (m.a(name, "valueOf")) {
                            zEquals = Arrays.equals(method2.getParameterTypes(), new Class[]{String.class});
                        } else {
                            zEquals = false;
                        }
                        if (!zEquals) {
                            z3 = true;
                        }
                    } else {
                        z3 = true;
                    }
                }
                return Boolean.valueOf(z3);
            case 25:
                k2.d drawBehind = (k2.d) obj;
                m.e(drawBehind, "$this$drawBehind");
                x.b bVar2 = (x.b) this.B;
                if (((Number) bVar2.d()).floatValue() > 0.0f) {
                    float fA0 = drawBehind.A0(16);
                    long jB = i2.t.b(((Number) bVar2.d()).floatValue() * 0.1f, i2.t.c);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(-fA0)) & 4294967295L);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.b() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.b() & 4294967295L)) + fA0;
                    float f = 12;
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(drawBehind.A0(f) + fIntBitsToFloat2)) & 4294967295L);
                    float fA1 = drawBehind.A0(f);
                    k2.d.a1(drawBehind, jB, jFloatToRawIntBits, jFloatToRawIntBits2, (4294967295L & ((long) Float.floatToRawIntBits(fA1))) | (((long) Float.floatToRawIntBits(fA1)) << 32), (k2.e) null, 240);
                }
                return g00.b0.a;
            case 26:
                float[] fArr = ((h0) obj).a;
                z2.a0 a0Var2 = (z2.a0) this.B;
                if (a0Var2.A()) {
                    z2.d0.i(a0Var2).f(a0Var2, fArr);
                }
                return g00.b0.a;
            case 27:
                n30.i iVar5 = (n30.i) this.B;
                m.b(obj);
                iVar5.add(obj);
                return g00.b0.a;
            case 28:
                g10.k kVar4 = (g10.k) this.B;
                z it10 = (z) obj;
                m.e(it10, "it");
                return it10.d().r(kVar4);
            default:
                e30.w wVar2 = (e30.w) this.B;
                m.e((z) obj, "it");
                return wVar2;
        }
    }
}

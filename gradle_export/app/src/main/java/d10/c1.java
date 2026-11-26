package d10;

import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException;

public final class c1 implements u00.a {
    public final int A;
    public final j1 B;
    public final e1 C;

    public c1(e1 e1Var, j1 j1Var, int i) {
        this.A = i;
        this.C = e1Var;
        this.B = j1Var;
    }

    public c1(j1 j1Var, e1 e1Var, int i) {
        this.A = i;
        this.B = j1Var;
        this.C = e1Var;
    }

    @Override
    public final Object invoke() throws IllegalAccessException, NoSuchFieldException, InvocationTargetException {
        Object bVar;
        String string;
        String str;
        Class[] clsArr;
        ArrayList arrayList;
        Field declaredField;
        a10.d dVarI;
        a10.a0 a0Var;
        ?? r1;
        e1 e1Var;
        int i = 2;
        int i2 = 1;
        int i3 = 0;
        ArrayList arrayList2 = null;
        switch (this.A) {
            case 0:
                j1 j1Var = this.B;
                e1 e1Var2 = this.C;
                if (!e2.b) {
                    j10.e eVarB = e1Var2.b();
                    if (!(eVarB instanceof h10.c)) {
                        c30.i iVar = eVarB instanceof c30.i ? (c30.i) eVarB : null;
                        if (iVar != null) {
                            return p30.f.u0(iVar.E, (k20.g) iVar.L.b, false, 6);
                        }
                        return null;
                    }
                    h10.c cVar = (h10.c) eVarB;
                    h10.k kVar = cVar.G;
                    if (!(kVar instanceof h10.g)) {
                        throw new a40.b0("Unsupported function type kind: " + kVar + " (" + eVarB + ')');
                    }
                    int i4 = cVar.H;
                    s10.n0 n0Var = new s10.n0();
                    ArrayList arrayList3 = n0Var.C;
                    String str2 = "kotlin/Function" + i4;
                    kotlin.jvm.internal.m.e(str2, "<set-?>");
                    n0Var.B = str2;
                    s10.q qVar = s10.q.INTERFACE;
                    a10.w[] wVarArr = s10.p.a;
                    kotlin.jvm.internal.m.e(qVar, "<set-?>");
                    p10.a aVar = s10.p.d;
                    a10.w[] wVarArr2 = s10.p.a;
                    aVar.A(n0Var, wVarArr2[9], qVar);
                    s10.l1 l1Var = s10.l1.ABSTRACT;
                    kotlin.jvm.internal.m.e(l1Var, "<set-?>");
                    s10.p.b.A(n0Var, wVarArr2[7], l1Var);
                    s10.m1 m1Var = s10.m1.PUBLIC;
                    kotlin.jvm.internal.m.e(m1Var, "<set-?>");
                    s10.p.c.A(n0Var, wVarArr2[8], m1Var);
                    if (1 <= i4) {
                        int i5 = 1;
                        while (true) {
                            arrayList3.add(new s10.d1(g4.c.f(i5, "P"), i5, s10.g1.B));
                            if (i5 != i4) {
                                i5++;
                            }
                        }
                    }
                    int i6 = i4 + 1;
                    arrayList3.add(new s10.d1("R", i6, s10.g1.C));
                    ArrayList arrayList4 = n0Var.D;
                    s10.b1 b1Var = new s10.b1(0);
                    b1Var.b = new s10.o0("kotlin/Function");
                    ArrayList arrayList5 = b1Var.c;
                    s10.g1 g1Var = s10.g1.A;
                    s10.b1 b1Var2 = new s10.b1(0);
                    b1Var2.b = new s10.q0(i6);
                    arrayList5.add(new s10.e1(g1Var, b1Var2));
                    arrayList4.add(b1Var);
                    return n0Var;
                }
                Metadata metadata = (Metadata) j1Var.B.getAnnotation(Metadata.class);
                if (metadata == null) {
                    return null;
                }
                if (metadata.mv().length == 0) {
                    throw new IllegalArgumentException("Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.");
                }
                k20.f fVar = new k20.f(metadata.mv(), (metadata.xi() & 8) != 0);
                boolean z = fVar.f;
                boolean zA = fVar.a(1, 1, 0);
                if (!zA) {
                    if (zA) {
                        StringBuilder sb = new StringBuilder("while maximum supported version is ");
                        sb.append(z ? k20.f.g : k20.f.h);
                        sb.append(". To support newer versions, update the kotlin-metadata-jvm library.");
                        string = sb.toString();
                    } else {
                        string = "while minimum supported version is 1.1.0 (Kotlin 1.0).";
                    }
                    throw new IllegalArgumentException("Provided Metadata instance has version " + fVar + ", " + string);
                }
                try {
                    int iK = metadata.k();
                    if (iK == 1) {
                        bVar = new v10.b(metadata);
                    } else if (iK == 2) {
                        k00.f.P(metadata);
                        new v10.a(metadata.mv());
                        metadata.xi();
                        bVar = new v10.c();
                    } else if (iK == 3) {
                        bVar = new v10.c(metadata);
                    } else if (iK == 4) {
                        List listK0 = h00.n.k0(metadata.d1());
                        new v10.a(metadata.mv());
                        metadata.xi();
                        v10.d dVar = new v10.d();
                        dVar.b = listK0;
                        bVar = dVar;
                    } else if (iK != 5) {
                        v10.c cVar2 = new v10.c();
                        new v10.a(metadata.mv());
                        metadata.xi();
                        bVar = cVar2;
                    } else {
                        k00.f.P(metadata);
                        String facadeClassName = metadata.xs();
                        new v10.a(metadata.mv());
                        metadata.xi();
                        kotlin.jvm.internal.m.e(facadeClassName, "facadeClassName");
                        bVar = new v10.c();
                    }
                    v10.b bVar2 = bVar instanceof v10.b ? (v10.b) bVar : null;
                    if (bVar2 != null) {
                        return bVar2.b;
                    }
                    return null;
                } catch (Throwable th) {
                    if ((th instanceof IllegalArgumentException) || (th instanceof VirtualMachineError) || (th instanceof ThreadDeath)) {
                        throw th;
                    }
                    throw new InconsistentKotlinMetadataException("Exception occurred when reading Kotlin metadata", th);
                }
            case 1:
                j1 j1Var2 = this.B;
                e1 e1Var3 = this.C;
                h00.y yVar = h00.y.A;
                Class cls = j1Var2.B;
                if (kotlin.jvm.internal.m.a(cls, Object.class)) {
                    return h00.x.A;
                }
                if (e2.a) {
                    Collection<e30.w> collectionL = e1Var3.b().f().l();
                    kotlin.jvm.internal.m.d(collectionL, "getSupertypes(...)");
                    ArrayList arrayList6 = new ArrayList(collectionL.size());
                    j1 j1Var3 = e1Var3.q;
                    for (e30.w wVar : collectionL) {
                        kotlin.jvm.internal.m.b(wVar);
                        arrayList6.add(new p30.i(wVar, new a20.a(wVar, j1Var3, 14)));
                    }
                    j10.e eVarB2 = e1Var3.b();
                    n20.e eVar = g10.i.e;
                    if (!g10.i.b(eVarB2, g10.o.a) && !g10.i.b(eVarB2, g10.o.b)) {
                        if (arrayList6.isEmpty()) {
                            arrayList6.add(d2.a);
                        } else {
                            Iterator it = arrayList6.iterator();
                            while (it.hasNext()) {
                                a10.e eVarS = ((a10.x) it.next()).s();
                                j1 j1Var4 = eVarS instanceof j1 ? (j1) eVarS : null;
                                if (j1Var4 == null || (j1Var4.L() != s10.q.INTERFACE && j1Var4.L() != s10.q.ANNOTATION_CLASS)) {
                                }
                            }
                            arrayList6.add(d2.a);
                        }
                    }
                    return n30.l.d(arrayList6);
                }
                ArrayList arrayList7 = new ArrayList();
                s10.n0 n0VarC = e1Var3.c();
                ArrayList<s10.b1> arrayList8 = n0VarC != null ? n0VarC.D : null;
                if (arrayList8 != null) {
                    for (s10.b1 b1Var3 : arrayList8) {
                        z3 z3VarA = b1Var3.a();
                        s10.o0 o0Var = z3VarA instanceof s10.o0 ? (s10.o0) z3VarA : null;
                        if (o0Var == null || (str = o0Var.d) == null) {
                            throw new a40.b0("Supertype of " + j1Var2 + " not a class: " + b1Var3.a());
                        }
                        n20.b bVarH0 = kh.n.h0(str);
                        Class clsG = i2.g(p10.d.d(cls), bVarH0, 0);
                        if (clsG == null) {
                            throw new a40.b0("Unsupported superclass of " + j1Var2 + ": " + bVarH0);
                        }
                        arrayList7.add(kh.n.l0(b1Var3, p10.d.d(cls), e1Var3.d(), new av.s(j1Var2, clsG, bVarH0, 2)));
                    }
                    if (cls.isArray()) {
                        arrayList7.add(d2.c);
                    }
                    if (Serializable.class.isAssignableFrom(cls)) {
                        a10.x xVar = d2.d;
                        if (!arrayList7.contains(xVar)) {
                            x1 x1Var = e1Var3.f;
                            a10.w wVar2 = e1.r[3];
                            String str3 = (String) x1Var.invoke();
                            if (str3 != null && r30.r.x0(str3, "kotlin.", false)) {
                                arrayList7.add(xVar);
                            }
                        }
                    }
                } else {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    if (genericSuperclass != null) {
                        if (genericSuperclass.equals(Object.class)) {
                            genericSuperclass = null;
                        }
                        if (genericSuperclass != null) {
                            arrayList7.add(k00.f.S(genericSuperclass, yVar, f2.A, false, 4));
                        }
                    }
                    Type[] genericInterfaces = cls.getGenericInterfaces();
                    kotlin.jvm.internal.m.d(genericInterfaces, "getGenericInterfaces(...)");
                    for (Type type : genericInterfaces) {
                        kotlin.jvm.internal.m.b(type);
                        arrayList7.add(k00.f.S(type, yVar, f2.A, false, 4));
                    }
                }
                if (arrayList7.isEmpty()) {
                    arrayList7.add(d2.a);
                } else {
                    Iterator it2 = arrayList7.iterator();
                    while (it2.hasNext()) {
                        a10.e eVarS2 = ((a10.x) it2.next()).s();
                        j1 j1Var5 = eVarS2 instanceof j1 ? (j1) eVarS2 : null;
                        if (j1Var5 == null || (j1Var5.L() != s10.q.INTERFACE && j1Var5.L() != s10.q.ANNOTATION_CLASS)) {
                        }
                    }
                    arrayList7.add(d2.a);
                }
                return n30.l.d(arrayList7);
            case 2:
                j1 j1Var6 = this.B;
                e1 e1Var4 = this.C;
                h00.x xVar2 = h00.x.A;
                Class cls2 = j1Var6.B;
                ClassLoader classLoaderD = p10.d.d(cls2);
                s10.n0 n0VarC2 = e1Var4.c();
                if (n0VarC2 != null) {
                    ArrayList arrayList9 = n0VarC2.L;
                    ArrayList arrayList10 = new ArrayList();
                    Iterator it3 = arrayList9.iterator();
                    while (it3.hasNext()) {
                        a10.d dVarQ = kh.n.Q(classLoaderD, (String) it3.next());
                        if (dVarQ != null) {
                            arrayList10.add(dVarQ);
                        }
                    }
                    return arrayList10;
                }
                if (!kotlin.jvm.internal.m.a(qd.s0.l0(cls2), Boolean.TRUE)) {
                    return xVar2;
                }
                Method method = (Method) qd.s0.i0().B;
                if (method == null) {
                    clsArr = null;
                } else {
                    Object objInvoke = method.invoke(cls2, null);
                    kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
                    clsArr = (Class[]) objInvoke;
                }
                if (clsArr != null) {
                    arrayList2 = new ArrayList(clsArr.length);
                    int length = clsArr.length;
                    while (i3 < length) {
                        arrayList2.add(k00.f.I(clsArr[i3]));
                        i3++;
                    }
                }
                return arrayList2 == null ? xVar2 : arrayList2;
            case 3:
                e1 e1Var5 = this.C;
                Class cls3 = this.B.B;
                s10.n0 n0VarC3 = e1Var5.c();
                if (n0VarC3 != null) {
                    String str4 = n0VarC3.B;
                    if (str4 == null) {
                        kotlin.jvm.internal.m.k(DiagnosticsEntry.NAME_KEY);
                        throw null;
                    }
                    n20.b bVarH1 = kh.n.h0(str4);
                    ClassLoader classLoaderD2 = p10.d.d(cls3);
                    ArrayList arrayList11 = n0VarC3.I;
                    arrayList = new ArrayList();
                    Iterator it4 = arrayList11.iterator();
                    while (it4.hasNext()) {
                        Class clsG2 = i2.g(classLoaderD2, bVarH1.d(n20.e.e((String) it4.next())), 0);
                        a10.d dVarI2 = clsG2 != null ? k00.f.I(clsG2) : null;
                        if (dVarI2 != null) {
                            arrayList.add(dVarI2);
                        }
                    }
                } else {
                    Class<?>[] declaredClasses = cls3.getDeclaredClasses();
                    kotlin.jvm.internal.m.d(declaredClasses, "getDeclaredClasses(...)");
                    arrayList = new ArrayList();
                    int length2 = declaredClasses.length;
                    while (i3 < length2) {
                        Class<?> cls4 = declaredClasses[i3];
                        kotlin.jvm.internal.m.b(cls4);
                        arrayList.add(k00.f.I(cls4));
                        i3++;
                    }
                }
                return arrayList;
            case 4:
                e1 e1Var6 = this.C;
                Class cls5 = this.B.B;
                s10.n0 n0VarC4 = e1Var6.c();
                if (n0VarC4 == null) {
                    return null;
                }
                if (s10.p.a(n0VarC4) != s10.q.OBJECT && s10.p.a(n0VarC4) != s10.q.COMPANION_OBJECT) {
                    return null;
                }
                if (s10.p.a(n0VarC4) == s10.q.COMPANION_OBJECT) {
                    LinkedHashSet linkedHashSet = g10.d.a;
                    String str5 = n0VarC4.B;
                    if (str5 == null) {
                        kotlin.jvm.internal.m.k(DiagnosticsEntry.NAME_KEY);
                        throw null;
                    }
                    if (h00.q.F0(linkedHashSet, kh.n.h0(str5).e())) {
                        declaredField = cls5.getDeclaredField("INSTANCE");
                    } else {
                        Class<?> enclosingClass = cls5.getEnclosingClass();
                        String str6 = n0VarC4.B;
                        if (str6 == null) {
                            kotlin.jvm.internal.m.k(DiagnosticsEntry.NAME_KEY);
                            throw null;
                        }
                        if (r30.r.x0(str6, ".", false)) {
                            throw new IllegalArgumentException("Local class is not supported: ".concat(str6).toString());
                        }
                        String strB1 = r30.k.b1('/', str6, str6);
                        declaredField = enclosingClass.getDeclaredField(r30.k.b1('.', strB1, strB1));
                    }
                } else {
                    declaredField = cls5.getDeclaredField("INSTANCE");
                }
                Object obj = declaredField.get(null);
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                return obj;
            case 5:
                e1 e1Var7 = this.C;
                j1 j1Var7 = this.B;
                if (e2.a) {
                    List<j10.r0> listP = e1Var7.b().p();
                    kotlin.jvm.internal.m.d(listP, "getDeclaredTypeParameters(...)");
                    ArrayList arrayList12 = new ArrayList(h00.r.q0(listP, 10));
                    for (j10.r0 r0Var : listP) {
                        kotlin.jvm.internal.m.b(r0Var);
                        arrayList12.add(new r1(j1Var7, r0Var));
                    }
                    return arrayList12;
                }
                if (e1Var7.c() != null) {
                    return e1Var7.d().a;
                }
                TypeVariable[] typeParameters = j1Var7.B.getTypeParameters();
                kotlin.jvm.internal.m.d(typeParameters, "getTypeParameters(...)");
                int iP = h00.d0.P(typeParameters.length);
                LinkedHashMap linkedHashMap = new LinkedHashMap(iP >= 16 ? iP : 16);
                for (TypeVariable typeVariable : typeParameters) {
                    j1 j1VarJ = k00.f.J(typeVariable);
                    String name = typeVariable.getName();
                    kotlin.jvm.internal.m.d(name, "getName(...)");
                    linkedHashMap.put(typeVariable, new r1(j1VarJ, name, a10.a0.A));
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    TypeVariable typeVariable2 = (TypeVariable) entry.getKey();
                    r1 r1Var = (r1) entry.getValue();
                    Type[] bounds = typeVariable2.getBounds();
                    kotlin.jvm.internal.m.d(bounds, "getBounds(...)");
                    ArrayList arrayList13 = new ArrayList(bounds.length);
                    for (Type type2 : bounds) {
                        kotlin.jvm.internal.m.b(type2);
                        arrayList13.add(k00.f.S(type2, linkedHashMap, null, false, 6));
                    }
                    r1Var.getClass();
                    r1Var.F = arrayList13;
                }
                return h00.q.n1(linkedHashMap.values());
            default:
                e1 e1Var8 = this.C;
                j1 j1Var8 = this.B;
                if (e1Var8.c() == null) {
                    return g2.d;
                }
                g2 g2Var = g2.d;
                s10.n0 n0VarC5 = e1Var8.c();
                kotlin.jvm.internal.m.b(n0VarC5);
                ArrayList<s10.d1> kmTypeParameters = n0VarC5.C;
                Class<?> enclosingClass2 = j1Var8.B.getEnclosingClass();
                if (enclosingClass2 != null) {
                    s10.n0 n0VarC6 = e1Var8.c();
                    kotlin.jvm.internal.m.b(n0VarC6);
                    if (!s10.p.e.j(s10.p.a[10], n0VarC6)) {
                        enclosingClass2 = null;
                    }
                    if (enclosingClass2 != null) {
                        dVarI = k00.f.I(enclosingClass2);
                    } else {
                        dVarI = null;
                    }
                } else {
                    dVarI = null;
                }
                j1 j1Var9 = dVarI instanceof j1 ? (j1) dVarI : null;
                g2 g2VarD = (j1Var9 == null || (r1 = j1Var9.C) == 0 || (e1Var = (e1) r1.getValue()) == null) ? null : e1Var.d();
                ClassLoader classLoaderD3 = p10.d.d(j1Var8.B);
                kotlin.jvm.internal.m.e(kmTypeParameters, "kmTypeParameters");
                ArrayList<r1> arrayList14 = new ArrayList(h00.r.q0(kmTypeParameters, 10));
                for (s10.d1 d1Var : kmTypeParameters) {
                    String str7 = d1Var.b;
                    int iOrdinal = d1Var.d.ordinal();
                    if (iOrdinal == 0) {
                        a0Var = a10.a0.A;
                    } else if (iOrdinal == i2) {
                        a0Var = a10.a0.B;
                    } else {
                        if (iOrdinal != i) {
                            throw new NoWhenBranchMatchedException();
                        }
                        a0Var = a10.a0.C;
                    }
                    s10.p.j.j(s10.p.a[49], d1Var);
                    arrayList14.add(new r1(j1Var8, str7, a0Var));
                    i = 2;
                    i2 = 1;
                }
                h00.p pVarS1 = h00.q.s1(kmTypeParameters);
                int iP2 = h00.d0.P(h00.r.q0(pVarS1, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iP2 >= 16 ? iP2 : 16);
                Iterator it5 = pVarS1.iterator();
                while (true) {
                    h00.b0 b0Var = (h00.b0) it5;
                    if (!b0Var.B.hasNext()) {
                        g2 g2Var2 = new g2(arrayList14, linkedHashMap2, g2VarD);
                        for (r1 r1Var2 : arrayList14) {
                            int i7 = i3 + 1;
                            ArrayList arrayList15 = ((s10.d1) kmTypeParameters.get(i3)).e;
                            ?? arrayList16 = new ArrayList(h00.r.q0(arrayList15, 10));
                            Iterator it6 = arrayList15.iterator();
                            while (it6.hasNext()) {
                                arrayList16.add(kh.n.l0((s10.b1) it6.next(), classLoaderD3, g2Var2, (u00.a) null));
                            }
                            if (arrayList16.isEmpty()) {
                                arrayList16 = va.a.R(d2.b);
                            }
                            r1Var2.getClass();
                            r1Var2.F = arrayList16;
                            i3 = i7;
                        }
                        return g2Var2;
                    }
                    h00.a0 a0Var2 = (h00.a0) b0Var.next();
                    linkedHashMap2.put(Integer.valueOf(((s10.d1) a0Var2.b).c), arrayList14.get(a0Var2.a));
                }
                break;
        }
    }
}

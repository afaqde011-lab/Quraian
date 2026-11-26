package d10;

import com.revenuecat.purchases.common.HTTPClient;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

public abstract class i2 {
    public static final n20.c a = new n20.c("kotlin.jvm.JvmStatic");
    public static final String b;

    static {
        StringBuilder sb = new StringBuilder();
        h10.j jVar = h10.j.c;
        sb.append(jVar.a.a.a);
        sb.append('.');
        sb.append(jVar.b);
        b = sb.toString();
    }

    public static final u1 a(a10.c cVar) {
        if (cVar instanceof u1) {
            return (u1) cVar;
        }
        if (!(cVar instanceof kotlin.jvm.internal.c)) {
            return null;
        }
        a10.c cVarCompute = ((kotlin.jvm.internal.c) cVar).compute();
        if (cVarCompute instanceof u1) {
            return (u1) cVarCompute;
        }
        return null;
    }

    public static final List b(k10.a aVar) {
        Annotation annotationH;
        kotlin.jvm.internal.m.e(aVar, "<this>");
        k10.h<k10.b> annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (k10.b bVar : annotations) {
            j10.n0 n0VarO = bVar.o();
            if (n0VarO instanceof o10.a) {
                annotationH = ((o10.a) n0VarO).A;
            } else if (n0VarO instanceof o10.g) {
                p10.s sVar = ((o10.g) n0VarO).A;
                p10.e eVar = sVar instanceof p10.e ? (p10.e) sVar : null;
                annotationH = eVar != null ? eVar.a : null;
            } else {
                annotationH = h(bVar);
            }
            if (annotationH != null) {
                arrayList.add(annotationH);
            }
        }
        return k(arrayList);
    }

    public static final Class c(Class cls) {
        kotlin.jvm.internal.m.e(cls, "<this>");
        return Array.newInstance((Class<?>) cls, 0).getClass();
    }

    public static final Object d(Type type) {
        kotlin.jvm.internal.m.e(type, "type");
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!cls.isPrimitive()) {
            return null;
        }
        if (cls.equals(Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (cls.equals(Character.TYPE)) {
            return (char) 0;
        }
        if (cls.equals(Byte.TYPE)) {
            return (byte) 0;
        }
        if (cls.equals(Short.TYPE)) {
            return (short) 0;
        }
        if (cls.equals(Integer.TYPE)) {
            return 0;
        }
        if (cls.equals(Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (cls.equals(Long.TYPE)) {
            return 0L;
        }
        if (cls.equals(Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (cls.equals(Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final j10.b e(Class moduleAnchor, o20.l proto, k20.g nameResolver, h9.f fVar, k20.a metadataVersion, u00.n nVar) {
        List list;
        kotlin.jvm.internal.m.e(moduleAnchor, "moduleAnchor");
        kotlin.jvm.internal.m.e(proto, "proto");
        kotlin.jvm.internal.m.e(nameResolver, "nameResolver");
        kotlin.jvm.internal.m.e(metadataVersion, "metadataVersion");
        o10.f fVarA = t1.a(moduleAnchor);
        if (proto instanceof i20.b0) {
            list = ((i20.b0) proto).I;
        } else {
            if (!(proto instanceof i20.j0)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            list = ((i20.j0) proto).I;
        }
        List list2 = list;
        a30.i iVar = fVarA.a;
        j10.z zVar = iVar.b;
        k20.j jVar = k20.j.b;
        kotlin.jvm.internal.m.b(list2);
        return (j10.b) nVar.invoke(new a30.u(new a30.k(iVar, nameResolver, zVar, fVar, jVar, metadataVersion, null, null, list2)), proto);
    }

    public static final boolean f(p30.i iVar) {
        a10.e eVarS = iVar.s();
        j1 j1Var = eVarS instanceof j1 ? (j1) eVarS : null;
        if (j1Var == null || !j1Var.j()) {
            return false;
        }
        s10.n0 n0VarN = j1Var.N();
        return (n0VarN != null ? n0VarN.M : null) == null;
    }

    public static final Class g(ClassLoader classLoader, n20.b kotlinClassId, int i) {
        kotlin.jvm.internal.m.e(kotlinClassId, "kotlinClassId");
        n20.d dVar = kotlinClassId.a().a;
        String str = dVar.a;
        Integer numY0 = r30.r.y0(r30.k.a1(str, b, str));
        if (numY0 != null) {
            int iIntValue = numY0.intValue();
            h10.g gVar = h10.g.c;
            return g(classLoader, new n20.b(gVar.a, gVar.a(iIntValue + 1)), i);
        }
        String str2 = i10.d.a;
        n20.b bVarG = i10.d.g(dVar);
        if (bVarG == null) {
            bVarG = kotlinClassId;
        }
        if (!bVarG.equals(kotlinClassId)) {
            classLoader = p10.d.d(g00.b0.class);
        }
        String str3 = bVarG.a.a.a;
        String str4 = bVarG.b.a.a;
        if (kotlin.jvm.internal.m.a(str3, "kotlin")) {
            switch (str4.hashCode()) {
                case -901856463:
                    if (str4.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str4.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str4.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str4.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str4.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str4.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str4.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str4.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str4.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (str3.length() > 0) {
            sb.append(str3.concat("."));
        }
        sb.append(r30.r.u0(str4, '.', '$'));
        if (i > 0) {
            sb.append(";");
        }
        return f50.k.F(classLoader, sb.toString());
    }

    public static final Annotation h(k10.b bVar) {
        j10.e eVarD = u20.d.d(bVar);
        Class clsI = eVarD != null ? i(eVarD) : null;
        if (clsI == null) {
            clsI = null;
        }
        if (clsI == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = bVar.b().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            n20.e eVar = (n20.e) entry.getKey();
            s20.g gVar = (s20.g) entry.getValue();
            ClassLoader classLoader = clsI.getClassLoader();
            kotlin.jvm.internal.m.d(classLoader, "getClassLoader(...)");
            Object objJ = j(gVar, classLoader);
            g00.k kVar = objJ != null ? new g00.k(eVar.b(), objJ) : null;
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        return (Annotation) f50.k.l(clsI, h00.d0.Y(arrayList));
    }

    public static final Class i(j10.e eVar) {
        kotlin.jvm.internal.m.e(eVar, "<this>");
        j10.n0 n0VarO = eVar.o();
        kotlin.jvm.internal.m.d(n0VarO, "getSource(...)");
        if (n0VarO instanceof g20.o) {
            return ((g20.o) n0VarO).A.a;
        }
        if (n0VarO instanceof o10.g) {
            p10.s sVar = ((o10.g) n0VarO).A;
            kotlin.jvm.internal.m.c(sVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((p10.o) sVar).a;
        }
        n20.b bVarF = u20.d.f(eVar);
        if (bVarF == null) {
            return null;
        }
        return g(p10.d.d(eVar.getClass()), bVarF, 0);
    }

    public static final Object j(s20.g gVar, ClassLoader classLoader) {
        e30.w wVar;
        Class clsG;
        if (gVar instanceof s20.a) {
            return h((k10.b) ((s20.a) gVar).a);
        }
        int i = 0;
        if (gVar instanceof s20.b) {
            s20.b bVar = (s20.b) gVar;
            s20.y yVar = bVar instanceof s20.y ? (s20.y) bVar : null;
            if (yVar != null && (wVar = yVar.c) != null) {
                Object obj = bVar.a;
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(h00.r.q0(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(j((s20.g) it.next(), classLoader));
                }
                n20.e eVar = g10.i.e;
                j10.h hVarG = wVar.m0().g();
                g10.k kVarS = hVarG == null ? null : g10.i.s(hVarG);
                switch (kVarS == null ? -1 : h2.a[kVarS.ordinal()]) {
                    case HTTPClient.NO_STATUS_CODE:
                        if (!g10.i.z(wVar)) {
                            throw new IllegalStateException(("Not an array type: " + wVar).toString());
                        }
                        e30.w wVarB = ((e30.p0) h00.q.d1(wVar.e0())).b();
                        kotlin.jvm.internal.m.d(wVarB, "getType(...)");
                        j10.h hVarG2 = wVarB.m0().g();
                        j10.e eVar2 = hVarG2 instanceof j10.e ? (j10.e) hVarG2 : null;
                        if (eVar2 == null) {
                            throw new IllegalStateException(("Not a class type: " + wVarB).toString());
                        }
                        if (g10.i.H(wVarB)) {
                            int size = ((List) obj).size();
                            String[] strArr = new String[size];
                            while (i < size) {
                                Object obj2 = arrayList.get(i);
                                kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.String");
                                strArr[i] = obj2;
                                i++;
                            }
                            return strArr;
                        }
                        if (g10.i.b(eVar2, g10.o.Q)) {
                            int size2 = ((List) obj).size();
                            Class[] clsArr = new Class[size2];
                            while (i < size2) {
                                Object obj3 = arrayList.get(i);
                                kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                                clsArr[i] = obj3;
                                i++;
                            }
                            return clsArr;
                        }
                        n20.b bVarF = u20.d.f(eVar2);
                        if (bVarF != null && (clsG = g(classLoader, bVarF, 0)) != null) {
                            Object objNewInstance = Array.newInstance((Class<?>) clsG, ((List) obj).size());
                            kotlin.jvm.internal.m.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                            Object[] objArr = (Object[]) objNewInstance;
                            int size3 = arrayList.size();
                            while (i < size3) {
                                objArr[i] = arrayList.get(i);
                                i++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        int size4 = ((List) obj).size();
                        boolean[] zArr = new boolean[size4];
                        while (i < size4) {
                            Object obj4 = arrayList.get(i);
                            kotlin.jvm.internal.m.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            zArr[i] = ((Boolean) obj4).booleanValue();
                            i++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) obj).size();
                        char[] cArr = new char[size5];
                        while (i < size5) {
                            Object obj5 = arrayList.get(i);
                            kotlin.jvm.internal.m.c(obj5, "null cannot be cast to non-null type kotlin.Char");
                            cArr[i] = ((Character) obj5).charValue();
                            i++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) obj).size();
                        byte[] bArr = new byte[size6];
                        while (i < size6) {
                            Object obj6 = arrayList.get(i);
                            kotlin.jvm.internal.m.c(obj6, "null cannot be cast to non-null type kotlin.Byte");
                            bArr[i] = ((Byte) obj6).byteValue();
                            i++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) obj).size();
                        short[] sArr = new short[size7];
                        while (i < size7) {
                            Object obj7 = arrayList.get(i);
                            kotlin.jvm.internal.m.c(obj7, "null cannot be cast to non-null type kotlin.Short");
                            sArr[i] = ((Short) obj7).shortValue();
                            i++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) obj).size();
                        int[] iArr = new int[size8];
                        while (i < size8) {
                            Object obj8 = arrayList.get(i);
                            kotlin.jvm.internal.m.c(obj8, "null cannot be cast to non-null type kotlin.Int");
                            iArr[i] = ((Integer) obj8).intValue();
                            i++;
                        }
                        return iArr;
                    case 6:
                        int size9 = ((List) obj).size();
                        float[] fArr = new float[size9];
                        while (i < size9) {
                            Object obj9 = arrayList.get(i);
                            kotlin.jvm.internal.m.c(obj9, "null cannot be cast to non-null type kotlin.Float");
                            fArr[i] = ((Float) obj9).floatValue();
                            i++;
                        }
                        return fArr;
                    case 7:
                        int size10 = ((List) obj).size();
                        long[] jArr = new long[size10];
                        while (i < size10) {
                            Object obj10 = arrayList.get(i);
                            kotlin.jvm.internal.m.c(obj10, "null cannot be cast to non-null type kotlin.Long");
                            jArr[i] = ((Long) obj10).longValue();
                            i++;
                        }
                        return jArr;
                    case 8:
                        int size11 = ((List) obj).size();
                        double[] dArr = new double[size11];
                        while (i < size11) {
                            Object obj11 = arrayList.get(i);
                            kotlin.jvm.internal.m.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            dArr[i] = ((Double) obj11).doubleValue();
                            i++;
                        }
                        return dArr;
                }
            }
        } else if (gVar instanceof s20.i) {
            g00.k kVar = (g00.k) ((s20.i) gVar).a;
            n20.b bVar2 = (n20.b) kVar.A;
            n20.e eVar3 = (n20.e) kVar.B;
            Class clsG2 = g(classLoader, bVar2, 0);
            if (clsG2 != null) {
                return Enum.valueOf(clsG2, eVar3.b());
            }
        } else {
            if (!(gVar instanceof s20.t)) {
                if ((gVar instanceof s20.j) || (gVar instanceof s20.v)) {
                    return null;
                }
                return gVar.b();
            }
            s20.s sVar = (s20.s) ((s20.t) gVar).a;
            if (sVar instanceof s20.r) {
                s20.f fVar = ((s20.r) sVar).a;
                return g(classLoader, fVar.a, fVar.b);
            }
            if (!(sVar instanceof s20.q)) {
                throw new NoWhenBranchMatchedException();
            }
            j10.h hVarG3 = ((s20.q) sVar).a.m0().g();
            j10.e eVar4 = hVarG3 instanceof j10.e ? (j10.e) hVarG3 : null;
            if (eVar4 != null) {
                return i(eVar4);
            }
        }
        return null;
    }

    public static final List k(ArrayList arrayList) throws IllegalAccessException, InvocationTargetException {
        List listR;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (k00.f.D(k00.f.z((Annotation) it.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Annotation annotation = (Annotation) it2.next();
                        Class clsD = k00.f.D(k00.f.z(annotation));
                        if (!clsD.getSimpleName().equals("Container") || clsD.getAnnotation(kotlin.jvm.internal.c0.class) == null) {
                            listR = va.a.R(annotation);
                        } else {
                            Object objInvoke = clsD.getDeclaredMethod("value", null).invoke(annotation, null);
                            kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                            listR = h00.n.k0((Annotation[]) objInvoke);
                        }
                        h00.v.u0(listR, arrayList2);
                    }
                    return arrayList2;
                }
            }
        }
        return arrayList;
    }
}

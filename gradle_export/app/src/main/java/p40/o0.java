package p40;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;

public abstract class o0 {
    public static final n40.e[] a = new n40.e[0];
    public static final l40.a[] b = new l40.a[0];

    public static final a0 a(String str, l40.a aVar) {
        return new a0(str, new b0(aVar));
    }

    public static final Set b(n40.e eVar) {
        kotlin.jvm.internal.m.e(eVar, "<this>");
        if (eVar instanceof j) {
            return ((j) eVar).b();
        }
        HashSet hashSet = new HashSet(eVar.e());
        int iE = eVar.e();
        for (int i = 0; i < iE; i++) {
            hashSet.add(eVar.f(i));
        }
        return hashSet;
    }

    public static final n40.e[] c(List list) {
        n40.e[] eVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (eVarArr = (n40.e[]) list.toArray(new n40.e[0])) == null) ? a : eVarArr;
    }

    public static final v d(String str, Enum[] values, String[] strArr, Annotation[][] annotationArr) {
        kotlin.jvm.internal.m.e(values, "values");
        u uVar = new u(str, values.length);
        int length = values.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Enum r5 = values[i];
            int i3 = i2 + 1;
            String strName = (String) h00.n.I0(i2, strArr);
            if (strName == null) {
                strName = r5.name();
            }
            uVar.j(strName, false);
            Annotation[] annotationArr2 = (Annotation[]) h00.n.I0(i2, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    kotlin.jvm.internal.m.e(annotation, "annotation");
                    int i4 = uVar.d;
                    List[] listArr = uVar.f;
                    List arrayList = listArr[i4];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                        listArr[uVar.d] = arrayList;
                    }
                    arrayList.add(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        v vVar = new v(str, values);
        vVar.c = uVar;
        return vVar;
    }

    public static final v e(String str, Enum[] values) {
        kotlin.jvm.internal.m.e(values, "values");
        return new v(str, values);
    }

    public static final int f(n40.e eVar, n40.e[] typeParams) {
        kotlin.jvm.internal.m.e(typeParams, "typeParams");
        int iHashCode = (eVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
        int iE = eVar.e();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iE > 0)) {
                break;
            }
            int i2 = iE - 1;
            int i3 = i * 31;
            String strA = eVar.h(eVar.e() - iE).a();
            if (strA != null) {
                iHashCode2 = strA.hashCode();
            }
            i = i3 + iHashCode2;
            iE = i2;
        }
        int iE2 = eVar.e();
        int iHashCode3 = 1;
        while (true) {
            if (!(iE2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iE2 - 1;
            int i5 = iHashCode3 * 31;
            va.a kind = eVar.h(eVar.e() - iE2).getKind();
            iHashCode3 = i5 + (kind != null ? kind.hashCode() : 0);
            iE2 = i4;
        }
    }

    public static final void g(int i, int i2, n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(descriptor.f(i4));
            }
            i3 >>>= 1;
        }
        String serialName = descriptor.a();
        kotlin.jvm.internal.m.e(serialName, "serialName");
        throw new MissingFieldException(arrayList, arrayList.size() == 1 ? oi.k.m(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", serialName, "', but it was missing") : "Fields " + arrayList + " are required for type with serial name '" + serialName + "', but they were missing", null);
    }

    public static final void h(a10.d baseClass, String str) {
        String string;
        kotlin.jvm.internal.m.e(baseClass, "baseClass");
        String str2 = "in the polymorphic scope of '" + baseClass.n() + '\'';
        if (str == null) {
            string = oi.k.g('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbS = a1.b.s("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            a1.b.z(sbS, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbS.append(baseClass.n());
            sbS.append("' has to be sealed and '@Serializable'.");
            string = sbS.toString();
        }
        throw new SerializationException(string);
    }
}

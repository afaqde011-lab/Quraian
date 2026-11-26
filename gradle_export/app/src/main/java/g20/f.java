package g20;

import e30.a0;
import e30.w;
import i20.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;

public final class f implements a30.o {
    public static final f b = new f();
    public static final f c = new f();
    public static final f d = new f();

    public static String[] a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static k c(String representation) {
        v20.c cVar;
        kotlin.jvm.internal.m.e(representation, "representation");
        char cCharAt = representation.charAt(0);
        v20.c[] cVarArrValues = v20.c.values();
        int length = cVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i];
            if (cVar.c().charAt(0) == cCharAt) {
                break;
            }
            i++;
        }
        if (cVar != null) {
            return new j(cVar);
        }
        if (cCharAt == 'V') {
            return new j(null);
        }
        if (cCharAt == '[') {
            String strSubstring = representation.substring(1);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            return new h(c(strSubstring));
        }
        if (cCharAt == 'L') {
            r30.k.D0(representation, ';');
        }
        String strSubstring2 = representation.substring(1, representation.length() - 1);
        kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
        return new i(strSubstring2);
    }

    public static i d(String internalName) {
        kotlin.jvm.internal.m.e(internalName, "internalName");
        return new i(internalName);
    }

    public static LinkedHashSet e(String internalName, String... signatures) {
        kotlin.jvm.internal.m.e(internalName, "internalName");
        kotlin.jvm.internal.m.e(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet f(String str, String... signatures) {
        kotlin.jvm.internal.m.e(signatures, "signatures");
        return e("java/lang/".concat(str), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public static LinkedHashSet g(String str, String... strArr) {
        return e("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static String h(k type) {
        String strC;
        kotlin.jvm.internal.m.e(type, "type");
        if (type instanceof h) {
            return "[" + h(((h) type).i);
        }
        if (type instanceof j) {
            v20.c cVar = ((j) type).i;
            return (cVar == null || (strC = cVar.c()) == null) ? "V" : strC;
        }
        if (type instanceof i) {
            return g4.c.k(new StringBuilder("L"), ((i) type).i, ';');
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override
    public w b(u0 proto, String flexibleId, a0 lowerBound, a0 upperBound) {
        kotlin.jvm.internal.m.e(proto, "proto");
        kotlin.jvm.internal.m.e(flexibleId, "flexibleId");
        kotlin.jvm.internal.m.e(lowerBound, "lowerBound");
        kotlin.jvm.internal.m.e(upperBound, "upperBound");
        if (flexibleId.equals("kotlin.jvm.PlatformType")) {
            return proto.j(l20.j.f) ? new c20.i(lowerBound, upperBound) : e30.c.f(lowerBound, upperBound);
        }
        return g30.l.c(g30.k.M, flexibleId, lowerBound.toString(), upperBound.toString());
    }
}

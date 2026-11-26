package h10;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import r30.r;

public final class m {
    public static final m c = new m(va.a.S(new k[]{g.c, j.c, h.c, i.c}));
    public final List a;
    public final LinkedHashMap b;

    public m(List list) {
        this.a = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            n20.c cVar = ((k) obj).a;
            Object arrayList = linkedHashMap.get(cVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(cVar, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.b = linkedHashMap;
    }

    public final l a(String className, n20.c packageFqName) {
        Integer numValueOf;
        kotlin.jvm.internal.m.e(packageFqName, "packageFqName");
        kotlin.jvm.internal.m.e(className, "className");
        List<k> list = (List) this.b.get(packageFqName);
        if (list != null) {
            for (k kVar : list) {
                int i = 0;
                if (r.x0(className, kVar.b, false)) {
                    String strSubstring = className.substring(kVar.b.length());
                    kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        numValueOf = null;
                        break;
                    }
                    int length = strSubstring.length();
                    int i2 = 0;
                    while (true) {
                        if (i >= length) {
                            numValueOf = Integer.valueOf(i2);
                            break;
                        }
                        int iCharAt = strSubstring.charAt(i) - '0';
                        if (iCharAt < 0 || iCharAt >= 10) {
                            numValueOf = null;
                            break;
                        }
                        i2 = (i2 * 10) + iCharAt;
                        i++;
                    }
                    if (numValueOf != null) {
                        return new l(kVar, numValueOf.intValue());
                    }
                }
            }
        }
        return null;
    }
}

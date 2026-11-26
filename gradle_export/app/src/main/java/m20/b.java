package m20;

import ca.v;
import com.google.android.gms.internal.measurement.x5;
import h00.q;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.m;
import oi.k;
import r30.r;

public abstract class b {
    public static final String a = q.R0(va.a.S(new Character[]{'k', 'o', 't', 'l', 'i', 'n'}), "", null, null, null, 62);
    public static final LinkedHashMap b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listS = va.a.S(new String[]{"Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D"});
        int iY = v.y(0, listS.size() - 1, 2);
        if (iY >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = a;
                sb.append(str);
                sb.append('/');
                sb.append((String) listS.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listS.get(i2));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(x5.n(sb2, (String) listS.get(i), "Array"), "[" + ((String) listS.get(i2)));
                if (i == iY) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        linkedHashMap.put(a + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : va.a.S(new String[]{"String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum"})) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : va.a.S(new String[]{"Iterator", "Collection", "List", "Set", "Map", "ListIterator"})) {
            a(linkedHashMap, a1.b.o("collections/", str3), "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            String strF = g4.c.f(i3, "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = a;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i3);
            a(linkedHashMap, strF, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : va.a.S(new String[]{"Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum"})) {
            a(linkedHashMap, w.c.j(str5, ".Companion"), k.m(new StringBuilder(), a, "/jvm/internal/", str5, "CompanionObject"));
        }
        b = linkedHashMap;
    }

    public static final void a(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(a + '/' + str, "L" + str2 + ';');
    }

    public static final String b(String classId) {
        m.e(classId, "classId");
        String str = (String) b.get(classId);
        if (str != null) {
            return str;
        }
        return "L" + r.u0(classId, '.', '$') + ';';
    }
}

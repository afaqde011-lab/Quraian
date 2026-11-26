package r30;

import c3.y2;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;
import hb.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class l extends g4 {
    public static String i0(String str, String str2) {
        kotlin.jvm.internal.m.e(str, "<this>");
        return q30.l.p0(q30.l.r0(new y2(str, 8), new u(str2, 23)), "\n");
    }

    public static String j0(String str) throws IOException {
        int length;
        Comparable comparable;
        kotlin.jvm.internal.m.e(str, "<this>");
        List listU0 = q30.l.u0(new y2(str, 8));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listU0) {
            if (!k.L0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!z3.J(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listU0.size();
        int iM = va.a.M(listU0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listU0) {
            int i = length + 1;
            if (length < 0) {
                va.a.k0();
                throw null;
            }
            String str3 = (String) obj2;
            String strC0 = ((length == 0 || length == iM) && k.L0(str3)) ? null : k.C0(iIntValue, str3);
            if (strC0 != null) {
                arrayList3.add(strC0);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        h00.q.Q0(arrayList3, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    public static String k0(String str) throws IOException {
        kotlin.jvm.internal.m.e(str, "<this>");
        if (k.L0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listU0 = q30.l.u0(new y2(str, 8));
        int length = str.length();
        listU0.size();
        int iM = va.a.M(listU0);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listU0) {
            int i2 = i + 1;
            String strSubstring = null;
            if (i < 0) {
                va.a.k0();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != iM) || !k.L0(str2)) {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!z3.J(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && r.w0(i3, str2, "|", false)) {
                    strSubstring = str2.substring("|".length() + i3);
                    kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        h00.q.Q0(arrayList, sb, "\n", null, null, null, 124);
        return sb.toString();
    }
}

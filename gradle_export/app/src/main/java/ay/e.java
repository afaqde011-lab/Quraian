package ay;

import h00.q;
import h00.r;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import kotlin.jvm.internal.m;
import r30.j;
import r30.k;

public abstract class e {
    public static final j a = new j("[-/'\"`´ʼ''\"·•.,;:!?()\\[\\]{}\\\\|\\s]+");
    public static final j b = new j("\\p{M}+");
    public static final j c = new j("\\s+");

    public static boolean a(String normalizedHaystack, ArrayList arrayList) {
        m.e(normalizedHaystack, "normalizedHaystack");
        if (normalizedHaystack.length() != 0) {
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    String str = (String) q.L0(arrayList);
                    if (!k.A0(normalizedHaystack, str, false)) {
                        if (str.length() >= 5) {
                            int length = str.length();
                            int i = 0;
                            for (int i2 = 0; i2 < length; i2++) {
                                int iI0 = k.I0(normalizedHaystack, str.charAt(i2), i, 4);
                                if (iI0 != -1) {
                                    i = iI0 + 1;
                                }
                            }
                        }
                    }
                } else {
                    Iterator it = arrayList.iterator();
                    int length2 = 0;
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        int iJ0 = k.J0(normalizedHaystack, str2, length2, false, 4);
                        if (iJ0 != -1) {
                            length2 = iJ0 + str2.length();
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b(ArrayList arrayList, List normalizedFields) {
        m.e(normalizedFields, "normalizedFields");
        if (arrayList.isEmpty()) {
            return true;
        }
        if (normalizedFields.isEmpty()) {
            return false;
        }
        Iterator it = normalizedFields.iterator();
        while (it.hasNext()) {
            if (a((String) it.next(), arrayList)) {
                return true;
            }
        }
        return false;
    }

    public static String c(String value) {
        m.e(value, "value");
        String string = k.j1(value).toString();
        if (string.length() == 0) {
            return "";
        }
        String strNormalize = Normalizer.normalize(string, Normalizer.Form.NFD);
        m.d(strNormalize, "normalize(...)");
        String lowerCase = b.c(strNormalize, "").toLowerCase(Locale.ROOT);
        m.d(lowerCase, "toLowerCase(...)");
        return a.c(lowerCase, "");
    }

    public static ArrayList d(String query) {
        List listR;
        m.e(query, "query");
        String input = k.j1(query).toString();
        j jVar = c;
        jVar.getClass();
        m.e(input, "input");
        int iEnd = 0;
        k.U0(0);
        Matcher matcher = jVar.A.matcher(input);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            do {
                arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(input.subSequence(iEnd, input.length()).toString());
            listR = arrayList;
        } else {
            listR = va.a.R(input.toString());
        }
        ArrayList arrayList2 = new ArrayList(r.q0(listR, 10));
        Iterator it = listR.iterator();
        while (it.hasNext()) {
            arrayList2.add(c((String) it.next()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((String) obj).length() > 0) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }
}

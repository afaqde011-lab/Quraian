package mq;

import bx.c;
import com.google.android.gms.internal.measurement.x5;
import h00.n;
import h00.q;
import h00.r;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.IntConsumer;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.v;

public abstract class b {
    public static final Set a = n.X0(new Character[]{'\'', 8217, '`'});
    public static final Set b = n.X0(new Character[]{'\t', '\n', 11, '\f', '\r', ' ', 160, 5760, 8192, 8193, 8194, 8195, 8196, 8197, 8198, 8199, 8200, 8201, 8202, 8232, 8233, 8239, 8287, 12288, 65279});
    public static final Set c = n.X0(new Byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 9, (byte) 10, (byte) 11});

    public static ArrayList a(String str, List list) {
        ArrayList arrayListY0 = q.Y0(list, va.a.R(str));
        ArrayList arrayList = new ArrayList(r.q0(arrayListY0, 10));
        Iterator it = arrayListY0.iterator();
        while (it.hasNext()) {
            arrayList.add(b((String) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static String b(String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zContains = b.contains(Character.valueOf(str.charAt(!z ? i : length)));
            if (z) {
                if (!zContains) {
                    break;
                }
                length--;
            } else if (zContains) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static String c(c reciter) {
        Object next;
        String str = "reciter";
        m.e(reciter, "reciter");
        String name = reciter.b;
        List nameOtherLanguages = reciter.j;
        String str2 = reciter.h;
        m.e(name, "name");
        m.e(nameOtherLanguages, "nameOtherLanguages");
        ArrayList arrayListA = a(name, nameOtherLanguages);
        Iterator it = arrayListA.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String str3 = (String) next;
            for (int i = 0; i < str3.length(); i++) {
                char cCharAt = str3.charAt(i);
                if (' ' <= cCharAt && cCharAt < 127) {
                }
            }
            break loop0;
        }
        String str4 = (String) next;
        if (str4 == null) {
            String str5 = (String) q.N0(arrayListA);
            if (str5 != null) {
                str = str5;
            }
        } else {
            str = str4;
        }
        return d(e(str, str2));
    }

    public static String d(String value) {
        m.e(value, "value");
        String strNormalize = Normalizer.normalize(value, Normalizer.Form.NFKD);
        m.d(strNormalize, "normalize(...)");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strNormalize.length(); i++) {
            char cCharAt = strNormalize.charAt(i);
            if (768 > cCharAt || cCharAt >= 880) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        Locale ENGLISH = Locale.ENGLISH;
        m.d(ENGLISH, "ENGLISH");
        String lowerCase = string.toLowerCase(ENGLISH);
        m.d(lowerCase, "toLowerCase(...)");
        StringBuilder sb2 = new StringBuilder();
        for (int i2 = 0; i2 < lowerCase.length(); i2++) {
            char cCharAt2 = lowerCase.charAt(i2);
            if (!a.contains(Character.valueOf(cCharAt2))) {
                sb2.append(cCharAt2);
            }
        }
        String string2 = sb2.toString();
        final StringBuilder sb3 = new StringBuilder(string2.length());
        final v vVar = new v();
        string2.codePoints().forEach(new IntConsumer() {
            @Override
            public final void accept(int i3) {
                boolean zContains = b.c.contains(Byte.valueOf((byte) Character.getType(i3)));
                v vVar2 = vVar;
                if (!zContains) {
                    vVar2.A = true;
                    return;
                }
                boolean z = vVar2.A;
                StringBuilder sb4 = sb3;
                if (z && sb4.length() > 0) {
                    sb4.append('-');
                }
                vVar2.A = false;
                sb4.appendCodePoint(i3);
            }
        });
        String string3 = sb3.toString();
        m.d(string3, "toString(...)");
        return string3;
    }

    public static String e(String str, String str2) {
        String lowerCase;
        String strB;
        if (str2 == null || (strB = b(str2)) == null) {
            lowerCase = null;
        } else {
            Locale ENGLISH = Locale.ENGLISH;
            m.d(ENGLISH, "ENGLISH");
            lowerCase = strB.toLowerCase(ENGLISH);
            m.d(lowerCase, "toLowerCase(...)");
        }
        if (lowerCase == null) {
            lowerCase = "";
        }
        return lowerCase.length() == 0 ? str : x5.m(str, "-", lowerCase);
    }
}

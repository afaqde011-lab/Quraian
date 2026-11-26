package lq;

import a1.b;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import g1.l0;
import gz.e1;
import h00.n;
import h00.q;
import h00.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.m;
import r30.k;

public final class a {
    public static final Set b = n.X0(new Character[]{'-', '.', '_', '~'});
    public final l0 a;

    public a(l0 l0Var) {
        this.a = l0Var;
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder();
        byte[] bytes = str.getBytes(r30.a.a);
        m.d(bytes, "getBytes(...)");
        for (byte b2 : bytes) {
            char c = (char) b2;
            if (b2 < 0 || !(Character.isLetterOrDigit(c) || b.contains(Character.valueOf(c)))) {
                sb.append('%');
                sb.append(String.format("%02X", Arrays.copyOf(new Object[]{Integer.valueOf(b2 & 255)}, 1)));
            } else {
                sb.append(c);
            }
        }
        String string = sb.toString();
        m.d(string, "toString(...)");
        return string;
    }

    public final String b(String... strArr) {
        Set set = zl.a.a;
        String lowerCase = ((String) this.a.invoke()).toLowerCase(Locale.ROOT);
        m.d(lowerCase, "toLowerCase(...)");
        String strD1 = k.d1(k.d1(lowerCase, '-'), '_');
        if (strD1.equals("in")) {
            strD1 = DiagnosticsEntry.ID_KEY;
        }
        if (!zl.a.a.contains(strD1)) {
            strD1 = "en";
        }
        List listR = va.a.R(strD1);
        ArrayList arrayList = new ArrayList(listR.size() + strArr.length);
        arrayList.addAll(listR);
        v.v0(arrayList, strArr);
        return b.o("https://quranify.pro/", q.R0(arrayList, "/", null, null, new e1(1, this, a.class, "encode", "encode(Ljava/lang/String;)Ljava/lang/String;", 0, 6), 30));
    }
}

package tc;

import java.util.Locale;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

public final class d extends n implements k {
    public static final d A = new d(1);

    public final Object invoke(Object obj) {
        String str = (String) obj;
        m.e(str, "it");
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String strValueOf = String.valueOf(str.charAt(0));
        m.c(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        m.d(upperCase, "toUpperCase(...)");
        sb2.append((Object) upperCase);
        String strSubstring = str.substring(1);
        m.d(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        return sb2.toString();
    }
}

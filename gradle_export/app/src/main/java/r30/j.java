package r30;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class j implements Serializable {
    public final Pattern A;

    public j(String str) {
        Pattern patternCompile = Pattern.compile(str);
        kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
        this.A = patternCompile;
    }

    public final h a(CharSequence input) {
        kotlin.jvm.internal.m.e(input, "input");
        Matcher matcher = this.A.matcher(input);
        kotlin.jvm.internal.m.d(matcher, "matcher(...)");
        if (matcher.find(0)) {
            return new h(matcher, input);
        }
        return null;
    }

    public final boolean b(String input) {
        kotlin.jvm.internal.m.e(input, "input");
        return this.A.matcher(input).matches();
    }

    public final String c(String input, String str) {
        kotlin.jvm.internal.m.e(input, "input");
        String strReplaceAll = this.A.matcher(input).replaceAll(str);
        kotlin.jvm.internal.m.d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String d(String input, u00.k kVar) {
        kotlin.jvm.internal.m.e(input, "input");
        h hVarA = a(input);
        if (hVarA == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        do {
            sb.append((CharSequence) input, i, hVarA.b().A);
            sb.append((CharSequence) kVar.invoke(hVarA));
            i = hVarA.b().B + 1;
            hVarA = hVarA.c();
            if (i >= length) {
                break;
            }
        } while (hVarA != null);
        if (i < length) {
            sb.append((CharSequence) input, i, length);
        }
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public final String toString() {
        String string = this.A.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}

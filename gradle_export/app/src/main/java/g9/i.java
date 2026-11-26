package g9;

import androidx.media3.common.ParserException;
import e7.i0;
import e7.u;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

public abstract class i {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long b(String str) {
        String str2 = i0.f5136a;
        String[] strArrSplit = str.split("\\.", 2);
        long j9 = 0;
        for (String str3 : strArrSplit[0].split(":", -1)) {
            j9 = (j9 * 60) + Long.parseLong(str3);
        }
        long j10 = j9 * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(strTrim));
            }
            j10 += Long.parseLong(strTrim);
        }
        return j10 * 1000;
    }

    public static void c(u uVar) {
        int i10 = uVar.f5183b;
        Charset charset = StandardCharsets.UTF_8;
        String strN = uVar.n(charset);
        if (strN == null || !strN.startsWith("WEBVTT")) {
            uVar.N(i10);
            throw ParserException.a(null, "Expected WEBVTT. Got " + uVar.n(charset));
        }
    }
}

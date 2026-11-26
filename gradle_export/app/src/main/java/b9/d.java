package b9;

import android.graphics.PointF;
import e7.i0;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class d {

    public static final Pattern f2216a = Pattern.compile("\\{([^}]*)\\}");

    public static final Pattern f2217b;

    public static final Pattern f2218c;

    public static final Pattern f2219d;

    static {
        String str = i0.f5136a;
        Locale locale = Locale.US;
        f2217b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f2218c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f2219d = Pattern.compile("\\\\an(\\d+)");
    }

    public static PointF a(String str) {
        String strGroup;
        String strGroup2;
        Matcher matcher = f2217b.matcher(str);
        Matcher matcher2 = f2218c.matcher(str);
        boolean zFind = matcher.find();
        boolean zFind2 = matcher2.find();
        if (zFind) {
            if (zFind2) {
                e7.a.h("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
            }
            strGroup = matcher.group(1);
            strGroup2 = matcher.group(2);
        } else {
            if (!zFind2) {
                return null;
            }
            strGroup = matcher2.group(1);
            strGroup2 = matcher2.group(2);
        }
        strGroup.getClass();
        float f3 = Float.parseFloat(strGroup.trim());
        strGroup2.getClass();
        return new PointF(f3, Float.parseFloat(strGroup2.trim()));
    }
}

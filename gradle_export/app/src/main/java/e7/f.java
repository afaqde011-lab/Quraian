package e7;

import android.graphics.Color;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class f {

    public static final Pattern f5128a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    public static final Pattern f5129b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    public static final Pattern f5130c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    public static final HashMap f5131d;

    static {
        HashMap map = new HashMap();
        f5131d = map;
        x5.t(-984833, map, "aliceblue", -332841, "antiquewhite");
        x5.y(map, "aqua", -16711681, -8388652, "aquamarine");
        x5.t(-983041, map, "azure", -657956, "beige");
        x5.t(-6972, map, "bisque", -16777216, "black");
        x5.t(-5171, map, "blanchedalmond", -16776961, "blue");
        x5.t(-7722014, map, "blueviolet", -5952982, "brown");
        x5.t(-2180985, map, "burlywood", -10510688, "cadetblue");
        x5.t(-8388864, map, "chartreuse", -2987746, "chocolate");
        x5.t(-32944, map, "coral", -10185235, "cornflowerblue");
        x5.t(-1828, map, "cornsilk", -2354116, "crimson");
        x5.y(map, "cyan", -16711681, -16777077, "darkblue");
        x5.t(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        x5.y(map, "darkgray", -5658199, -16751616, "darkgreen");
        x5.y(map, "darkgrey", -5658199, -4343957, "darkkhaki");
        x5.t(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        x5.t(-29696, map, "darkorange", -6737204, "darkorchid");
        x5.t(-7667712, map, "darkred", -1468806, "darksalmon");
        x5.t(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        x5.y(map, "darkturquoise", -16724271, -7077677, "darkviolet");
        x5.t(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        x5.y(map, "dodgerblue", -14774017, -5103070, "firebrick");
        x5.t(-1296, map, "floralwhite", -14513374, "forestgreen");
        x5.y(map, "fuchsia", -65281, -2302756, "gainsboro");
        x5.t(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        x5.t(-16744448, map, "green", -5374161, "greenyellow");
        x5.y(map, "grey", -8355712, -983056, "honeydew");
        x5.t(-38476, map, "hotpink", -3318692, "indianred");
        x5.t(-11861886, map, "indigo", -16, "ivory");
        x5.t(-989556, map, "khaki", -1644806, "lavender");
        x5.t(-3851, map, "lavenderblush", -8586240, "lawngreen");
        x5.t(-1331, map, "lemonchiffon", -5383962, "lightblue");
        x5.t(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        x5.t(-18751, map, "lightpink", -24454, "lightsalmon");
        x5.t(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        x5.y(map, "lightsteelblue", -5192482, -32, "lightyellow");
        x5.t(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        x5.t(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        x5.t(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        x5.t(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        x5.t(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        x5.t(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        x5.t(-15132304, map, "midnightblue", -655366, "mintcream");
        x5.t(-6943, map, "mistyrose", -6987, "moccasin");
        x5.t(-8531, map, "navajowhite", -16777088, "navy");
        x5.t(-133658, map, "oldlace", -8355840, "olive");
        x5.t(-9728477, map, "olivedrab", -23296, "orange");
        x5.t(-47872, map, "orangered", -2461482, "orchid");
        x5.t(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        x5.t(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        x5.t(-4139, map, "papayawhip", -9543, "peachpuff");
        x5.t(-3308225, map, "peru", -16181, "pink");
        x5.t(-2252579, map, "plum", -5185306, "powderblue");
        x5.t(-8388480, map, "purple", -10079335, "rebeccapurple");
        x5.t(-65536, map, "red", -4419697, "rosybrown");
        x5.t(-12490271, map, "royalblue", -7650029, "saddlebrown");
        x5.t(-360334, map, "salmon", -744352, "sandybrown");
        x5.t(-13726889, map, "seagreen", -2578, "seashell");
        x5.t(-6270419, map, "sienna", -4144960, "silver");
        x5.t(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        x5.y(map, "snow", -1286, -16711809, "springgreen");
        x5.t(-12156236, map, "steelblue", -2968436, "tan");
        x5.t(-16744320, map, "teal", -2572328, "thistle");
        x5.t(-40121, map, "tomato", 0, "transparent");
        x5.t(-12525360, map, "turquoise", -1146130, "violet");
        x5.t(-663885, map, "wheat", -1, "white");
        x5.t(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z10) {
        int i10;
        ta.c0.s(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", RuntimeVersion.SUFFIX);
        if (strReplace.charAt(0) == '#') {
            int i11 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i11;
            }
            if (strReplace.length() == 9) {
                return ((i11 & 255) << 24) | (i11 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z10 ? f5130c : f5129b).matcher(strReplace);
            if (matcher.matches()) {
                if (z10) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i10 = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i10 = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i12 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i13 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i10, i12, i13, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f5128a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i14 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i15 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i14, i15, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f5131d.get(w00.a.I(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}

package d9;

import a10.h0;
import android.text.Layout;
import android.text.TextUtils;
import androidx.media3.common.w0;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import e7.h;
import e7.i0;
import fh.e1;
import fh.g1;
import fh.k2;
import fh.m2;
import fh.q2;
import fh.w;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import ta.c0;
import x8.j;
import x8.k;

public final class e implements k {
    public static final Pattern B = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern C = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern D = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern E = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern F = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern G = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern H = Pattern.compile("^(\\d+) (\\d+)$");
    public static final d I = new d(30.0f, 1, 1);
    public final XmlPullParserFactory A;

    public e() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.A = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e3) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e3);
        }
    }

    public static g a(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    public static boolean b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = H.matcher(attributeValue);
        if (!matcher.matches()) {
            e7.a.m("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z10 = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i10 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i11 = Integer.parseInt(strGroup2);
            if (i10 == 0 || i11 == 0) {
                z10 = false;
            }
            c0.o(i10, i11, "Invalid cell resolution %s %s", z10);
            return i11;
        } catch (NumberFormatException unused) {
            e7.a.m("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, g gVar) throws SubtitleDecoderException {
        Matcher matcher;
        String str2 = i0.f5136a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = D;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(g4.c.g(strArrSplit.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            e7.a.m("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(a1.b.p("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                gVar.f4830j = 3;
                break;
            case "em":
                gVar.f4830j = 2;
                break;
            case "px":
                gVar.f4830j = 1;
                break;
            default:
                throw new SubtitleDecoderException(a1.b.p("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        gVar.f4831k = Float.parseFloat(strGroup2);
    }

    public static d e(XmlPullParser xmlPullParser) {
        float f3;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = i0.f5136a;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            c0.r("frameRateMultiplier doesn't have 2 parts", strArrSplit.length == 2);
            f3 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f3 = 1.0f;
        }
        d dVar = I;
        int i11 = dVar.f4809b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = dVar.f4810c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new d(i10 * f3, i11, i12);
    }

    public static void f(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, androidx.media3.common.w0 r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: d9.e.f(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, androidx.media3.common.w0, java.util.HashMap, java.util.HashMap):void");
    }

    public static c g(XmlPullParser xmlPullParser, c cVar, HashMap map, d dVar) throws SubtitleDecoderException {
        long j9;
        String[] strArrSplit;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        g gVarH = h(xmlPullParser, null);
        String strSubstring = null;
        String str = RuntimeVersion.SUFFIX;
        long jI = -9223372036854775807L;
        long jI2 = -9223372036854775807L;
        long jI3 = -9223372036854775807L;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    jI3 = i(attributeValue, dVar);
                    break;
                case "end":
                    jI2 = i(attributeValue, dVar);
                    break;
                case "begin":
                    jI = i(attributeValue, dVar);
                    break;
                case "style":
                    String strTrim = attributeValue.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        String str2 = i0.f5136a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    if (strArrSplit.length > 0) {
                        strArr = strArrSplit;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (cVar != null) {
            long j10 = cVar.f4800d;
            if (j10 != -9223372036854775807L) {
                if (jI != -9223372036854775807L) {
                    jI += j10;
                }
                if (jI2 != -9223372036854775807L) {
                    jI2 += j10;
                }
            }
        }
        if (jI2 != -9223372036854775807L) {
            j9 = jI2;
        } else {
            if (jI3 != -9223372036854775807L) {
                jI2 = jI + jI3;
            } else if (cVar != null) {
                long j11 = cVar.f4801e;
                if (j11 != -9223372036854775807L) {
                    j9 = j11;
                }
            }
            j9 = jI2;
        }
        return new c(xmlPullParser.getName(), null, jI, j9, gVarH, strArr, str, strSubstring, cVar);
    }

    public static g h(XmlPullParser xmlPullParser, g gVar) {
        byte b7;
        int i10;
        m2 m2VarP;
        m2 m2VarP2;
        m2 m2VarP3;
        String str;
        int iHashCode;
        String str2;
        int iHashCode2;
        int i11;
        b bVar;
        String str3;
        int iHashCode3;
        int attributeCount = xmlPullParser.getAttributeCount();
        g gVarA = gVar;
        for (int i12 = 0; i12 < attributeCount; i12++) {
            String attributeValue = xmlPullParser.getAttributeValue(i12);
            String attributeName = xmlPullParser.getAttributeName(i12);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    b7 = 0;
                    break;
                case "extent":
                    b7 = 1;
                    break;
                case "fontFamily":
                    b7 = 2;
                    break;
                case "textAlign":
                    b7 = 3;
                    break;
                case "origin":
                    b7 = 4;
                    break;
                case "textDecoration":
                    b7 = 5;
                    break;
                case "fontWeight":
                    b7 = 6;
                    break;
                case "id":
                    b7 = 7;
                    break;
                case "ruby":
                    b7 = 8;
                    break;
                case "color":
                    b7 = 9;
                    break;
                case "shear":
                    b7 = 10;
                    break;
                case "textCombine":
                    b7 = 11;
                    break;
                case "fontSize":
                    b7 = 12;
                    break;
                case "textEmphasis":
                    b7 = 13;
                    break;
                case "rubyPosition":
                    b7 = 14;
                    break;
                case "backgroundColor":
                    b7 = 15;
                    break;
                case "multiRowAlign":
                    b7 = 16;
                    break;
                default:
                    b7 = -1;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (b7) {
                case 0:
                    gVarA = a(gVarA);
                    gVarA.f4829i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    gVarA = a(gVarA);
                    gVarA.f4839u = attributeValue;
                    break;
                case 2:
                    gVarA = a(gVarA);
                    gVarA.f4821a = attributeValue;
                    break;
                case 3:
                    gVarA = a(gVarA);
                    String strI = w00.a.I(attributeValue);
                    strI.getClass();
                    switch (strI) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    gVarA.f4833o = alignment;
                    break;
                case 4:
                    gVarA = a(gVarA);
                    gVarA.f4838t = attributeValue;
                    break;
                case 5:
                    String strI2 = w00.a.I(attributeValue);
                    strI2.getClass();
                    switch (strI2) {
                        case "nounderline":
                            gVarA = a(gVarA);
                            gVarA.f4827g = 0;
                            break;
                        case "underline":
                            gVarA = a(gVarA);
                            gVarA.f4827g = 1;
                            break;
                        case "nolinethrough":
                            gVarA = a(gVarA);
                            gVarA.f4826f = 0;
                            break;
                        case "linethrough":
                            gVarA = a(gVarA);
                            gVarA.f4826f = 1;
                            break;
                    }
                    break;
                case 6:
                    gVarA = a(gVarA);
                    gVarA.f4828h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        gVarA = a(gVarA);
                        gVarA.l = attributeValue;
                    }
                    break;
                case 8:
                    String strI3 = w00.a.I(attributeValue);
                    strI3.getClass();
                    switch (strI3) {
                        case "baseContainer":
                        case "base":
                            gVarA = a(gVarA);
                            gVarA.m = 2;
                            break;
                        case "container":
                            gVarA = a(gVarA);
                            gVarA.m = 1;
                            break;
                        case "delimiter":
                            gVarA = a(gVarA);
                            gVarA.m = 4;
                            break;
                        case "textContainer":
                        case "text":
                            gVarA = a(gVarA);
                            gVarA.m = 3;
                            break;
                    }
                    break;
                case 9:
                    gVarA = a(gVarA);
                    try {
                        gVarA.f4822b = e7.f.a(attributeValue, false);
                        gVarA.f4823c = true;
                    } catch (IllegalArgumentException unused) {
                        x5.x("Failed parsing color value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 10:
                    g gVarA2 = a(gVarA);
                    Matcher matcher = E.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                        } catch (NumberFormatException e3) {
                            e7.a.n("TtmlParser", "Failed to parse shear: " + attributeValue, e3);
                        }
                    } else {
                        x5.x("Invalid value for shear: ", attributeValue, "TtmlParser");
                    }
                    gVarA2.f4837s = fMin;
                    gVarA = gVarA2;
                    break;
                case 11:
                    String strI4 = w00.a.I(attributeValue);
                    strI4.getClass();
                    if (strI4.equals("all")) {
                        gVarA = a(gVarA);
                        gVarA.f4835q = 1;
                    } else if (strI4.equals("none")) {
                        gVarA = a(gVarA);
                        gVarA.f4835q = 0;
                    }
                    break;
                case 12:
                    try {
                        gVarA = a(gVarA);
                        d(attributeValue, gVarA);
                    } catch (SubtitleDecoderException unused2) {
                        x5.x("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 13:
                    gVarA = a(gVarA);
                    Pattern pattern = b.f4789d;
                    if (attributeValue == null) {
                        bVar = null;
                    } else {
                        String strI5 = w00.a.I(attributeValue.trim());
                        if (strI5.isEmpty()) {
                            bVar = null;
                        } else {
                            String[] strArrSplit = TextUtils.split(strI5, b.f4789d);
                            int length = strArrSplit.length;
                            e1 e1VarM = length != 0 ? length != 1 ? e1.m(strArrSplit.length, (Object[]) strArrSplit.clone()) : new q2(strArrSplit[0]) : k2.J;
                            String str4 = (String) w.m(w.p(b.f4793h, e1VarM), "outside");
                            int iHashCode4 = str4.hashCode();
                            if (iHashCode4 != -1392885889) {
                                if (iHashCode4 != -1106037339) {
                                    if (iHashCode4 == 92734940 && str4.equals("after")) {
                                        i10 = 2;
                                    }
                                } else if (str4.equals("outside")) {
                                    i10 = -2;
                                }
                                m2VarP = w.p(b.f4790e, e1VarM);
                                if (m2VarP.isEmpty()) {
                                    m2VarP2 = w.p(b.f4792g, e1VarM);
                                    m2VarP3 = w.p(b.f4791f, e1VarM);
                                    if (m2VarP2.isEmpty() || !m2VarP3.isEmpty()) {
                                        str = (String) w.m(m2VarP2, "filled");
                                        iHashCode = str.hashCode();
                                        if (iHashCode != -1274499742) {
                                            int i13 = (iHashCode != 3417674 && str.equals("open")) ? 2 : 1;
                                            str2 = (String) w.m(m2VarP3, "circle");
                                            iHashCode2 = str2.hashCode();
                                            if (iHashCode2 != -1360216880) {
                                                if (iHashCode2 != -905816648) {
                                                    if (iHashCode2 == 99657 && str2.equals("dot")) {
                                                        i11 = 2;
                                                    }
                                                } else if (str2.equals("sesame")) {
                                                    i11 = 3;
                                                }
                                                bVar = new b(i11, i13, i10);
                                            } else {
                                                str2.equals("circle");
                                            }
                                            i11 = 1;
                                            bVar = new b(i11, i13, i10);
                                        } else {
                                            str.equals("filled");
                                        }
                                        str2 = (String) w.m(m2VarP3, "circle");
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i11 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i11 = 3;
                                            }
                                            bVar = new b(i11, i13, i10);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i11 = 1;
                                        bVar = new b(i11, i13, i10);
                                    } else {
                                        bVar = new b(-1, 0, i10);
                                    }
                                } else {
                                    str3 = (String) new g1(m2VarP).next();
                                    iHashCode3 = str3.hashCode();
                                    if (iHashCode3 != 3005871) {
                                        int i14 = (iHashCode3 != 3387192 && str3.equals("none")) ? 0 : -1;
                                        bVar = new b(i14, 0, i10);
                                    } else {
                                        str3.equals("auto");
                                    }
                                    bVar = new b(i14, 0, i10);
                                }
                            } else {
                                str4.equals("before");
                            }
                            i10 = 1;
                            m2VarP = w.p(b.f4790e, e1VarM);
                            if (m2VarP.isEmpty()) {
                                str3 = (String) new g1(m2VarP).next();
                                iHashCode3 = str3.hashCode();
                                if (iHashCode3 != 3005871) {
                                    if (iHashCode3 != 3387192) {
                                    }
                                    bVar = new b(i14, 0, i10);
                                } else {
                                    str3.equals("auto");
                                }
                                bVar = new b(i14, 0, i10);
                            } else {
                                m2VarP2 = w.p(b.f4792g, e1VarM);
                                m2VarP3 = w.p(b.f4791f, e1VarM);
                                if (m2VarP2.isEmpty()) {
                                    str = (String) w.m(m2VarP2, "filled");
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        str2 = (String) w.m(m2VarP3, "circle");
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i11 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i11 = 3;
                                            }
                                            bVar = new b(i11, i13, i10);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i11 = 1;
                                        bVar = new b(i11, i13, i10);
                                    } else {
                                        str.equals("filled");
                                    }
                                    str2 = (String) w.m(m2VarP3, "circle");
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i11 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i11 = 3;
                                        }
                                        bVar = new b(i11, i13, i10);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i11 = 1;
                                    bVar = new b(i11, i13, i10);
                                } else {
                                    str = (String) w.m(m2VarP2, "filled");
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        str2 = (String) w.m(m2VarP3, "circle");
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i11 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i11 = 3;
                                            }
                                            bVar = new b(i11, i13, i10);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i11 = 1;
                                        bVar = new b(i11, i13, i10);
                                    } else {
                                        str.equals("filled");
                                    }
                                    str2 = (String) w.m(m2VarP3, "circle");
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i11 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i11 = 3;
                                        }
                                        bVar = new b(i11, i13, i10);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i11 = 1;
                                    bVar = new b(i11, i13, i10);
                                }
                            }
                        }
                    }
                    gVarA.f4836r = bVar;
                    break;
                case 14:
                    String strI6 = w00.a.I(attributeValue);
                    strI6.getClass();
                    if (strI6.equals("before")) {
                        gVarA = a(gVarA);
                        gVarA.f4832n = 1;
                    } else if (strI6.equals("after")) {
                        gVarA = a(gVarA);
                        gVarA.f4832n = 2;
                    }
                    break;
                case 15:
                    gVarA = a(gVarA);
                    try {
                        gVarA.f4824d = e7.f.a(attributeValue, false);
                        gVarA.f4825e = true;
                    } catch (IllegalArgumentException unused3) {
                        x5.x("Failed parsing background value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 16:
                    gVarA = a(gVarA);
                    String strI7 = w00.a.I(attributeValue);
                    strI7.getClass();
                    switch (strI7) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    gVarA.f4834p = alignment;
                    break;
            }
        }
        return gVarA;
    }

    public static long i(String str, d dVar) throws SubtitleDecoderException {
        double d3;
        double d5;
        Matcher matcher = B.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            double d10 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            double d11 = d10 + (Long.parseLong(strGroup2) * 60);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d12 = d11 + Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d13 = d12 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
            String strGroup5 = matcher.group(5);
            double d14 = d13 + (strGroup5 != null ? Long.parseLong(strGroup5) / dVar.f4808a : 0.0d);
            String strGroup6 = matcher.group(6);
            return (long) ((d14 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) dVar.f4809b)) / ((double) dVar.f4808a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = C.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException(a1.b.o("Malformed time expression: ", str));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d15 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        switch (strGroup8) {
            case "f":
                d3 = dVar.f4808a;
                d15 /= d3;
                return (long) (d15 * 1000000.0d);
            case "h":
                d5 = 3600.0d;
                break;
            case "m":
                d5 = 60.0d;
                break;
            case "t":
                d3 = dVar.f4810c;
                d15 /= d3;
                return (long) (d15 * 1000000.0d);
            case "ms":
                d3 = 1000.0d;
                d15 /= d3;
                return (long) (d15 * 1000000.0d);
            default:
                return (long) (d15 * 1000000.0d);
        }
        d15 *= d5;
        return (long) (d15 * 1000000.0d);
    }

    public static w0 j(XmlPullParser xmlPullParser) {
        String strG = e7.a.g(xmlPullParser, "extent");
        if (strG == null) {
            return null;
        }
        Matcher matcher = G.matcher(strG);
        if (!matcher.matches()) {
            e7.a.m("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strG));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i10 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new w0(i10, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            e7.a.m("TtmlParser", "Ignoring malformed tts extent: ".concat(strG));
            return null;
        }
    }

    @Override
    public final void D(byte[] bArr, int i10, int i11, j jVar, h hVar) {
        h0.O(m(i10, i11, bArr), jVar, hVar);
    }

    @Override
    public final x8.d m(int i10, int i11, byte[] bArr) {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.A.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put(RuntimeVersion.SUFFIX, new f(RuntimeVersion.SUFFIX, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            w0 w0VarJ = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            d dVarE = I;
            int i12 = 0;
            int iC = 15;
            ce.c cVar = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                c cVar2 = (c) arrayDeque.peek();
                if (i12 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            dVarE = e(xmlPullParserNewPullParser);
                            iC = c(xmlPullParserNewPullParser);
                            w0VarJ = j(xmlPullParserNewPullParser);
                        }
                        d dVar = dVarE;
                        w0 w0Var = w0VarJ;
                        int i13 = iC;
                        if (b(name)) {
                            if ("head".equals(name)) {
                                f(xmlPullParserNewPullParser, map, i13, w0Var, map2, map3);
                            } else {
                                try {
                                    c cVarG = g(xmlPullParserNewPullParser, cVar2, map2, dVar);
                                    arrayDeque.push(cVarG);
                                    if (cVar2 != null) {
                                        if (cVar2.m == null) {
                                            cVar2.m = new ArrayList();
                                        }
                                        cVar2.m.add(cVarG);
                                    }
                                } catch (SubtitleDecoderException e3) {
                                    e7.a.n("TtmlParser", "Suppressing parser error", e3);
                                    i12++;
                                }
                            }
                            iC = i13;
                            w0VarJ = w0Var;
                            dVarE = dVar;
                        } else {
                            e7.a.h("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i12++;
                        iC = i13;
                        w0VarJ = w0Var;
                        dVarE = dVar;
                    } else if (eventType == 4) {
                        cVar2.getClass();
                        c cVarA = c.a(xmlPullParserNewPullParser.getText());
                        if (cVar2.m == null) {
                            cVar2.m = new ArrayList();
                        }
                        cVar2.m.add(cVarA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            c cVar3 = (c) arrayDeque.peek();
                            cVar3.getClass();
                            cVar = new ce.c(cVar3, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i12++;
                } else if (eventType == 3) {
                    i12--;
                }
                xmlPullParserNewPullParser.next();
            }
            cVar.getClass();
            return cVar;
        } catch (IOException e10) {
            throw new IllegalStateException("Unexpected error when reading input.", e10);
        } catch (XmlPullParserException e11) {
            throw new IllegalStateException("Unable to decode source", e11);
        }
    }

    @Override
    public final int p() {
        return 1;
    }
}

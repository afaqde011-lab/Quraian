package m7;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.media3.common.ParserException;
import com.google.android.gms.cast.Cast;
import com.google.protobuf.RuntimeVersion;
import e7.i0;
import fh.w;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k9.x0;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class e extends DefaultHandler implements w7.n {
    public static final Pattern B = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern C = Pattern.compile("CC([1-4])=.*");
    public static final Pattern D = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] E = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    public static final int[] F = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory A;

    public e() {
        try {
            this.A = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e3) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e3);
        }
    }

    public static long a(ArrayList arrayList, long j9, long j10, int i10, long j11) {
        int i11;
        if (i10 >= 0) {
            i11 = i10 + 1;
        } else {
            String str = i0.f5136a;
            i11 = (int) ((((j11 - j9) + j10) - 1) / j10);
        }
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(new q(j9, j10));
            j9 += j10;
        }
        return j9;
    }

    public static void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i10++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i10--;
                }
            }
        }
    }

    public static int c(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        int i10 = 5;
        byte b7 = 4;
        int i11 = 0;
        int i12 = -1;
        switch (attributeValue) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
                iBitCount = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
                if (iBitCount > 0 && iBitCount < 33) {
                    i12 = iBitCount;
                    break;
                }
                break;
            case "tag:dolby.com,2015:dash:audio_channel_configuration:2015":
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue3 != null && attributeValue3.length() == 6) {
                    int i13 = Integer.parseInt(attributeValue3, 16);
                    if ((8388608 & i13) == 0) {
                        iBitCount = 0;
                        while (true) {
                            int[] iArr = E;
                            if (i11 < iArr.length) {
                                iBitCount += ((i13 >> i11) & 1) * iArr[i11];
                                i11++;
                            } else if (iBitCount != 0) {
                                i12 = iBitCount;
                            }
                        }
                    } else {
                        String[] strArrT = i0.T(str);
                        if (strArrT.length != 0) {
                            List listC = c50.h.x('.').C(w00.a.I(strArrT[0].trim()));
                            if (listC.size() == 4 && ((String) listC.get(0)).equals("ac-4")) {
                                String str2 = (String) listC.get(3);
                                str2.getClass();
                                if (str2.equals("03")) {
                                    i12 = 18;
                                } else if (str2.equals("04")) {
                                    i12 = 21;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue4 != null) {
                    i12 = Integer.parseInt(attributeValue4);
                    break;
                }
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                String attributeValue5 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue5 != null) {
                    String strI = w00.a.I(attributeValue5);
                    strI.getClass();
                    switch (strI.hashCode()) {
                        case 1596796:
                            b7 = !strI.equals("4000") ? (byte) -1 : (byte) 0;
                            break;
                        case 2937391:
                            b7 = !strI.equals("a000") ? (byte) -1 : (byte) 1;
                            break;
                        case 3094034:
                            b7 = !strI.equals("f800") ? (byte) -1 : (byte) 2;
                            break;
                        case 3094035:
                            b7 = !strI.equals("f801") ? (byte) -1 : (byte) 3;
                            break;
                        case 3133436:
                            if (!strI.equals("fa01")) {
                                b7 = -1;
                            }
                            break;
                        default:
                            b7 = -1;
                            break;
                    }
                    switch (b7) {
                        case 0:
                            i10 = 1;
                            break;
                        case 1:
                            i10 = 2;
                            break;
                        case 2:
                            break;
                        case 3:
                            i10 = 6;
                            break;
                        case 4:
                            i10 = 8;
                            break;
                        default:
                            i10 = -1;
                            break;
                    }
                } else {
                    i10 = -1;
                }
                i12 = i10;
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                String attributeValue6 = xmlPullParser.getAttributeValue(null, "value");
                int i14 = attributeValue6 == null ? -1 : Integer.parseInt(attributeValue6);
                if (i14 >= 0) {
                    int[] iArr2 = F;
                    if (i14 < iArr2.length) {
                        i12 = iArr2[i14];
                    }
                    break;
                }
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                String attributeValue7 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue7 != null && (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue7, 16))) != 0) {
                    i12 = iBitCount;
                    break;
                }
                break;
        }
        do {
            xmlPullParser.next();
        } while (!e7.a.i(xmlPullParser, "AudioChannelConfiguration"));
        return i12;
    }

    public static long d(XmlPullParser xmlPullParser, long j9) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j9;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList e(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z10) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : z10 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i11 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = RuntimeVersion.SUFFIX;
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!e7.a.i(xmlPullParser, "BaseURL"));
        if (text != null && e7.d.f(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return w.r(new b(i10, i11, text, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            b bVar = (b) arrayList.get(i12);
            String strI = e7.d.i(bVar.f10576a, text);
            String str = attributeValue3 == null ? strI : attributeValue3;
            if (z10) {
                i10 = bVar.f10578c;
                i11 = bVar.f10579d;
                str = bVar.f10577b;
            }
            arrayList2.add(new b(i10, i11, strI, str));
        }
        return arrayList2;
    }

    public static Pair f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        UUID uuid2;
        ?? text;
        ?? A;
        UUID uuid3;
        String attributeValue2;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue3 != null) {
            String strI = w00.a.I(attributeValue3);
            strI.getClass();
            switch (strI) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid = androidx.media3.common.h.f1216c;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    A = uuid2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = androidx.media3.common.h.f1218e;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    A = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = androidx.media3.common.h.f1217d;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    A = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= attributeCount) {
                            attributeValue2 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i10);
                            int iIndexOf = attributeName.indexOf(58);
                            if (iIndexOf != -1) {
                                attributeName = attributeName.substring(iIndexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                attributeValue2 = xmlPullParser.getAttributeValue(i10);
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(attributeValue2) && !"00000000-0000-0000-0000-000000000000".equals(attributeValue2)) {
                        String[] strArrSplit = attributeValue2.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                            uuidArr[i11] = UUID.fromString(strArrSplit[i11]);
                        }
                        uuid = androidx.media3.common.h.f1215b;
                        text = 0;
                        A = u8.p.a(uuid, uuidArr, null);
                        break;
                    } else {
                        e7.a.m("MpdParser", "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        uuid = null;
                        uuid2 = uuid;
                        text = uuid2;
                        A = uuid2;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    uuid = null;
                    uuid2 = uuid;
                    text = uuid2;
                    A = uuid2;
                    break;
            }
        } else {
            attributeValue = null;
            uuid = null;
            uuid2 = uuid;
            text = uuid2;
            A = uuid2;
        }
        do {
            xmlPullParser.next();
            if ((e7.a.j(xmlPullParser, "clearkey:Laurl") || e7.a.j(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                A = A;
                text = xmlPullParser.getText();
            } else if (e7.a.j(xmlPullParser, "ms:laurl")) {
                A = A;
                text = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (A == 0 && xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                int iIndexOf2 = name.indexOf(58);
                if (iIndexOf2 != -1) {
                    name = name.substring(iIndexOf2 + 1);
                }
                if (name.equals("pssh") && xmlPullParser.next() == 4) {
                    byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                    c50.h hVarI = u8.p.i(bArrDecode);
                    UUID uuid4 = hVarI == null ? null : (UUID) hVarI.C;
                    if (uuid4 == null) {
                        e7.a.m("MpdParser", "Skipping malformed cenc:pssh data");
                        uuid = uuid4;
                        A = 0;
                        text = text;
                    } else {
                        UUID uuid5 = uuid4;
                        A = bArrDecode;
                        uuid = uuid5;
                        text = text;
                    }
                } else if (A == 0) {
                    uuid3 = androidx.media3.common.h.f1218e;
                    if (!uuid3.equals(uuid)) {
                        b(xmlPullParser);
                        A = A;
                        text = text;
                    } else {
                        b(xmlPullParser);
                        A = A;
                        text = text;
                    }
                } else {
                    b(xmlPullParser);
                    A = A;
                    text = text;
                }
            } else if (A == 0) {
                uuid3 = androidx.media3.common.h.f1218e;
                if (!uuid3.equals(uuid) && e7.a.j(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    A = u8.p.a(uuid3, null, Base64.decode(xmlPullParser.getText(), 0));
                    text = text;
                } else {
                    b(xmlPullParser);
                    A = A;
                    text = text;
                }
            } else {
                b(xmlPullParser);
                A = A;
                text = text;
            }
        } while (!e7.a.i(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new androidx.media3.common.n(uuid, text, "video/mp4", A) : null);
    }

    public static int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static f h(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = RuntimeVersion.SUFFIX;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!e7.a.i(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j9) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j9;
        }
        Matcher matcher = i0.f5140e.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d3 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d5 = d3 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d10 = d5 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d11 = d10 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d12 = d11 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j10 = (long) ((d12 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j10 : j10;
    }

    public static float j(XmlPullParser xmlPullParser, float f3) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = B.matcher(attributeValue);
            if (matcher.matches()) {
                int i10 = Integer.parseInt(matcher.group(1));
                String strGroup = matcher.group(2);
                return !TextUtils.isEmpty(strGroup) ? i10 / Integer.parseInt(strGroup) : i10;
            }
        }
        return f3;
    }

    public static m7.c k(org.xmlpull.v1.XmlPullParser r163, android.net.Uri r164) {
        throw new UnsupportedOperationException("Method not decompiled: m7.e.k(org.xmlpull.v1.XmlPullParser, android.net.Uri):m7.c");
    }

    public static j l(XmlPullParser xmlPullParser, String str, String str2) {
        long j9;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j10 = -1;
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j9 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j10 = (Long.parseLong(strArrSplit[1]) - j9) + 1;
            }
        } else {
            j9 = 0;
        }
        return new j(j9, j10, attributeValue);
    }

    public static int m(String str) {
        if (str != null) {
            switch (str) {
                case "subtitle":
                case "forced_subtitle":
                case "forced-subtitle":
                    return Cast.MAX_NAMESPACE_LENGTH;
                case "description":
                    return 512;
                case "enhanced-audio-intelligibility":
                    return 2048;
                case "alternate":
                    return 2;
                case "dub":
                    return 16;
                case "main":
                    return 1;
                case "sign":
                    return 256;
                case "caption":
                    return 64;
                case "commentary":
                    return 8;
                case "emergency":
                    return 32;
                case "supplementary":
                    return 4;
            }
        }
        return 0;
    }

    public static int n(ArrayList arrayList) {
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (w00.a.r("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i11)).f10599a)) {
                i10 = 16384;
            }
        }
        return i10;
    }

    public static r o(XmlPullParser xmlPullParser, r rVar) throws XmlPullParserException, IOException {
        long j9 = rVar != null ? rVar.f10633b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j9 = Long.parseLong(attributeValue);
        }
        long j10 = j9;
        long j11 = rVar != null ? rVar.f10634c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j11 = Long.parseLong(attributeValue2);
        }
        long j12 = j11;
        long j13 = rVar != null ? rVar.f10630d : 0L;
        long j14 = rVar != null ? rVar.f10631e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] strArrSplit = attributeValue3.split("-");
            j13 = Long.parseLong(strArrSplit[0]);
            j14 = (Long.parseLong(strArrSplit[1]) - j13) + 1;
        }
        long j15 = j14;
        long j16 = j13;
        j jVarL = rVar != null ? rVar.f10632a : null;
        while (true) {
            xmlPullParser.next();
            if (e7.a.j(xmlPullParser, "Initialization")) {
                jVarL = l(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            j jVar = jVarL;
            if (e7.a.i(xmlPullParser, "SegmentBase")) {
                return new r(jVar, j10, j12, j16, j15);
            }
            jVarL = jVar;
        }
    }

    public static o q(XmlPullParser xmlPullParser, o oVar, long j9, long j10, long j11, long j12, long j13) throws XmlPullParserException, IOException {
        long j14 = oVar != null ? oVar.f10633b : 1L;
        List arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j14 = Long.parseLong(attributeValue);
        }
        long j15 = j14;
        long j16 = oVar != null ? oVar.f10634c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j16 = Long.parseLong(attributeValue2);
        }
        long j17 = j16;
        long j18 = oVar != null ? oVar.f10620e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j18 = Long.parseLong(attributeValue3);
        }
        long j19 = j18;
        long j20 = oVar != null ? oVar.f10619d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j20 = Long.parseLong(attributeValue4);
        }
        long j21 = j20;
        long j22 = j12 == -9223372036854775807L ? j11 : j12;
        long j23 = j22 == Long.MAX_VALUE ? -9223372036854775807L : j22;
        j jVarL = null;
        List listS = null;
        do {
            xmlPullParser.next();
            if (e7.a.j(xmlPullParser, "Initialization")) {
                jVarL = l(xmlPullParser, "sourceURL", "range");
            } else if (e7.a.j(xmlPullParser, "SegmentTimeline")) {
                listS = s(xmlPullParser, j15, j10);
            } else if (e7.a.j(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(l(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!e7.a.i(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVarL == null) {
                jVarL = oVar.f10632a;
            }
            if (listS == null) {
                listS = oVar.f10621f;
            }
            if (arrayList == null) {
                arrayList = oVar.f10625j;
            }
        }
        return new o(jVarL, j15, j17, j21, j19, listS, j23, arrayList, i0.H(j13), i0.H(j9));
    }

    public static p r(XmlPullParser xmlPullParser, p pVar, List list, long j9, long j10, long j11, long j12, long j13) throws XmlPullParserException, IOException {
        long j14;
        long j15 = pVar != null ? pVar.f10633b : 1L;
        j jVarL = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j15 = Long.parseLong(attributeValue);
        }
        long j16 = j15;
        long j17 = pVar != null ? pVar.f10634c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j17 = Long.parseLong(attributeValue2);
        }
        long j18 = j17;
        long j19 = pVar != null ? pVar.f10620e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j19 = Long.parseLong(attributeValue3);
        }
        long j20 = j19;
        long j21 = pVar != null ? pVar.f10619d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j21 = Long.parseLong(attributeValue4);
        }
        long j22 = j21;
        int i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                j14 = -1;
                break;
            }
            f fVar = (f) list.get(i10);
            if (w00.a.r("http://dashif.org/guidelines/last-segment-number", fVar.f10599a)) {
                j14 = Long.parseLong(fVar.f10600b);
                break;
            }
            i10++;
        }
        long j23 = j14;
        long j24 = j12 == -9223372036854775807L ? j11 : j12;
        long j25 = j24 == Long.MAX_VALUE ? -9223372036854775807L : j24;
        x0 x0VarT = t(xmlPullParser, "media", pVar != null ? pVar.f10627k : null);
        x0 x0VarT2 = t(xmlPullParser, "initialization", pVar != null ? pVar.f10626j : null);
        List listS = null;
        do {
            xmlPullParser.next();
            if (e7.a.j(xmlPullParser, "Initialization")) {
                jVarL = l(xmlPullParser, "sourceURL", "range");
            } else if (e7.a.j(xmlPullParser, "SegmentTimeline")) {
                listS = s(xmlPullParser, j16, j10);
            } else {
                b(xmlPullParser);
            }
        } while (!e7.a.i(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVarL == null) {
                jVarL = pVar.f10632a;
            }
            if (listS == null) {
                listS = pVar.f10621f;
            }
        }
        return new p(jVarL, j16, j18, j22, j23, j20, listS, j25, x0VarT2, x0VarT, i0.H(j13), i0.H(j9));
    }

    public static ArrayList s(XmlPullParser xmlPullParser, long j9, long j10) throws XmlPullParserException, IOException {
        long j11;
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        long j12 = -9223372036854775807L;
        boolean z10 = false;
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (e7.a.j(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long j13 = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z10) {
                    int i11 = i10;
                    j11 = j13;
                    jA = a(arrayList, jA, j12, i11, j11);
                } else {
                    j11 = j13;
                }
                if (j11 != -9223372036854775807L) {
                    jA = j11;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j12 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i10 = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z10 = true;
            } else {
                b(xmlPullParser);
            }
        } while (!e7.a.i(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            String str = i0.f5136a;
            a(arrayList, jA, j12, i10, i0.Q(j10, j9, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    public static x0 t(XmlPullParser xmlPullParser, String str, x0 x0Var) {
        String strSubstring;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return x0Var;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add(RuntimeVersion.SUFFIX);
        int length = 0;
        while (length < attributeValue.length()) {
            int iIndexOf = attributeValue.indexOf("$", length);
            if (iIndexOf == -1) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(length));
                length = attributeValue.length();
            } else if (iIndexOf != length) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(length, iIndexOf));
                length = iIndexOf;
            } else if (attributeValue.startsWith("$$", length)) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                length += 2;
            } else {
                arrayList3.add(RuntimeVersion.SUFFIX);
                int i10 = length + 1;
                int iIndexOf2 = attributeValue.indexOf("$", i10);
                String strSubstring2 = attributeValue.substring(i10, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    arrayList2.add(1);
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "Number":
                            arrayList2.add(2);
                            break;
                        case "Time":
                            arrayList2.add(4);
                            break;
                        case "Bandwidth":
                            arrayList2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    arrayList3.set(arrayList2.size() - 1, strSubstring);
                }
                arrayList.add(RuntimeVersion.SUFFIX);
                length = iIndexOf2 + 1;
            }
        }
        return new x0(arrayList, arrayList2, arrayList3, 7);
    }

    @Override
    public final Object p(Uri uri, g7.h hVar) throws ParserException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.A.newPullParser();
            xmlPullParserNewPullParser.setInput(hVar, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return k(xmlPullParserNewPullParser, uri);
            }
            throw ParserException.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e3) {
            throw ParserException.b(null, e3);
        }
    }
}

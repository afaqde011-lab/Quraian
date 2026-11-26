package sd;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import com.caverock.androidsvg.SVGParseException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class h2 {

    public p1 f13989a;

    public u0 f13990b;

    public boolean f13991c;

    public int f13992d;

    public boolean f13993e;

    public f2 f13994f;

    public StringBuilder f13995g;

    public boolean f13996h;

    public StringBuilder f13997i;

    public static void D(q0 q0Var, String str, String str2) {
        Boolean bool;
        int i10;
        String strQ;
        c0 c0VarS;
        String strSubstring;
        c0 c0VarS2;
        int i11;
        int i12;
        c0 c0VarN;
        c0[] c0VarArr;
        int i13;
        int i14;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int iOrdinal = e2.a(str).ordinal();
        int i15 = 5;
        if (iOrdinal == 1) {
            p10.a aVar = null;
            if (!"auto".equals(str2) && str2.startsWith("rect(")) {
                com.google.android.gms.internal.play_billing.q1 q1Var = new com.google.android.gms.internal.play_billing.q1(str2.substring(5));
                q1Var.c0();
                c0 c0VarU = u(q1Var);
                q1Var.b0();
                c0 c0VarU2 = u(q1Var);
                q1Var.b0();
                c0 c0VarU3 = u(q1Var);
                q1Var.b0();
                c0 c0VarU4 = u(q1Var);
                q1Var.c0();
                if (q1Var.u(')') || q1Var.y()) {
                    aVar = new p10.a();
                    aVar.A = c0VarU;
                    aVar.B = c0VarU2;
                    aVar.C = c0VarU3;
                    aVar.D = c0VarU4;
                }
            }
            p10.a aVar2 = aVar;
            q0Var.P = aVar2;
            if (aVar2 != null) {
                q0Var.A |= 1048576;
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            q0Var.X = r(str2);
            q0Var.A |= 268435456;
            return;
        }
        if (iOrdinal == 4) {
            q0Var.f14058k0 = "nonzero".equals(str2) ? 1 : "evenodd".equals(str2) ? 2 : 0;
            q0Var.A |= 536870912;
        }
        try {
            if (iOrdinal == 5) {
                q0Var.K = n(str2);
                q0Var.A |= MediaStatus.COMMAND_EDIT_TRACKS;
                return;
            }
            if (iOrdinal == 8) {
                int i16 = str2.equals("ltr") ? 1 : !str2.equals("rtl") ? 0 : 2;
                q0Var.f14056i0 = i16;
                if (i16 != 0) {
                    q0Var.A |= 68719476736L;
                    return;
                }
                return;
            }
            if (iOrdinal == 35) {
                q0Var.Y = r(str2);
                q0Var.A |= 1073741824;
                return;
            }
            if (iOrdinal == 40) {
                q0Var.J = v(str2);
                q0Var.A |= MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
                return;
            }
            if (iOrdinal == 42) {
                switch (str2) {
                    case "hidden":
                    case "scroll":
                        bool = Boolean.FALSE;
                        break;
                    case "auto":
                    case "visible":
                        bool = Boolean.TRUE;
                        break;
                    default:
                        bool = null;
                        break;
                }
                q0Var.O = bool;
                if (bool != null) {
                    q0Var.A |= 524288;
                    return;
                }
                return;
            }
            if (iOrdinal == 78) {
                int i17 = str2.equals("none") ? 1 : !str2.equals("non-scaling-stroke") ? 0 : 2;
                q0Var.f14059l0 = i17;
                if (i17 != 0) {
                    q0Var.A |= 34359738368L;
                    return;
                }
                return;
            }
            u uVar = u.A;
            if (iOrdinal == 58) {
                if (str2.equals("currentColor")) {
                    q0Var.Z = uVar;
                } else {
                    try {
                        q0Var.Z = n(str2);
                    } catch (SVGParseException e3) {
                        Log.w("SVGParser", e3.getMessage());
                        return;
                    }
                }
                q0Var.A |= 2147483648L;
                return;
            }
            if (iOrdinal == 59) {
                q0Var.f14048a0 = v(str2);
                q0Var.A |= 4294967296L;
                return;
            }
            if (iOrdinal == 74) {
                switch (str2) {
                    case "middle":
                        i10 = 2;
                        break;
                    case "end":
                        i10 = 3;
                        break;
                    case "start":
                        i10 = 1;
                        break;
                    default:
                        i10 = 0;
                        break;
                }
                q0Var.f14057j0 = i10;
                if (i10 != 0) {
                    q0Var.A |= MediaStatus.COMMAND_STREAM_TRANSFER;
                    return;
                }
                return;
            }
            if (iOrdinal == 75) {
                switch (str2) {
                    case "line-through":
                        i15 = 4;
                        break;
                    case "underline":
                        i15 = 2;
                        break;
                    case "none":
                        i15 = 1;
                        break;
                    case "blink":
                        break;
                    case "overline":
                        i15 = 3;
                        break;
                    default:
                        i15 = 0;
                        break;
                }
                q0Var.f14055h0 = i15;
                if (i15 != 0) {
                    q0Var.A |= MediaStatus.COMMAND_UNFOLLOW;
                    return;
                }
                return;
            }
            switch (iOrdinal) {
                case 14:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                            q0Var.T = Boolean.valueOf(!str2.equals("none"));
                            q0Var.A |= 16777216;
                            break;
                        }
                    }
                    break;
                case 15:
                    z0 z0VarW = w(str2);
                    q0Var.B = z0VarW;
                    if (z0VarW != null) {
                        q0Var.A |= 1;
                    }
                    break;
                case 16:
                    int i18 = "nonzero".equals(str2) ? 1 : "evenodd".equals(str2) ? 2 : 0;
                    q0Var.f14051d0 = i18;
                    if (i18 != 0) {
                        q0Var.A |= 2;
                    }
                    break;
                case 17:
                    Float fV = v(str2);
                    q0Var.C = fV;
                    if (fV != null) {
                        q0Var.A |= 4;
                    }
                    break;
                case TYPE_SINT64_VALUE:
                    if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str2 + '|')) {
                        com.google.android.gms.internal.play_billing.q1 q1Var2 = new com.google.android.gms.internal.play_billing.q1(str2);
                        Integer num = null;
                        String str3 = null;
                        int i19 = 0;
                        while (true) {
                            strQ = q1Var2.Q('/', false);
                            q1Var2.c0();
                            if (strQ == null) {
                                break;
                            } else if (num == null || i19 == 0) {
                                if (!strQ.equals("normal") && (num != null || (num = (Integer) c2.f13963a.get(strQ)) == null)) {
                                    if (i19 == 0) {
                                        switch (strQ) {
                                            case "oblique":
                                                i19 = 3;
                                                break;
                                            case "italic":
                                                i19 = 2;
                                                break;
                                            case "normal":
                                                i19 = 1;
                                                break;
                                            default:
                                                i19 = 0;
                                                break;
                                        }
                                        if (i19 != 0) {
                                            continue;
                                        }
                                    }
                                    if (str3 == null && strQ.equals("small-caps")) {
                                        str3 = strQ;
                                    }
                                }
                            }
                        }
                        try {
                            c0VarS = (c0) b2.f13961a.get(strQ);
                            if (c0VarS == null) {
                                c0VarS = s(strQ);
                            }
                        } catch (SVGParseException unused) {
                            c0VarS = null;
                        }
                        if (q1Var2.u('/')) {
                            q1Var2.c0();
                            String strP = q1Var2.P();
                            if (strP != null) {
                                s(strP);
                            }
                            q1Var2.c0();
                        }
                        if (q1Var2.y()) {
                            strSubstring = null;
                        } else {
                            int i20 = q1Var2.f4030b;
                            q1Var2.f4030b = q1Var2.f4031c;
                            strSubstring = ((String) q1Var2.f4032d).substring(i20);
                        }
                        q0Var.L = q(strSubstring);
                        q0Var.M = c0VarS;
                        q0Var.N = Integer.valueOf(num == null ? MediaError.DetailedErrorCode.MANIFEST_UNKNOWN : num.intValue());
                        if (i19 == 0) {
                            i19 = 1;
                        }
                        q0Var.f14054g0 = i19;
                        q0Var.A |= 122880;
                        break;
                    }
                    break;
                case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                    ArrayList arrayListQ = q(str2);
                    q0Var.L = arrayListQ;
                    if (arrayListQ != null) {
                        q0Var.A |= MediaStatus.COMMAND_PLAYBACK_RATE;
                    }
                    break;
                case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                    try {
                        c0 c0Var = (c0) b2.f13961a.get(str2);
                        c0VarS2 = c0Var == null ? s(str2) : c0Var;
                    } catch (SVGParseException unused2) {
                        c0VarS2 = null;
                    }
                    q0Var.M = c0VarS2;
                    if (c0VarS2 != null) {
                        q0Var.A |= MediaStatus.COMMAND_LIKE;
                    }
                    break;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                    Integer num2 = (Integer) c2.f13963a.get(str2);
                    q0Var.N = num2;
                    if (num2 != null) {
                        q0Var.A |= MediaStatus.COMMAND_DISLIKE;
                    }
                    break;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                    switch (str2) {
                        case "oblique":
                            i11 = 3;
                            break;
                        case "italic":
                            i11 = 2;
                            break;
                        case "normal":
                            i11 = 1;
                            break;
                        default:
                            i11 = 0;
                            break;
                    }
                    q0Var.f14054g0 = i11;
                    if (i11 != 0) {
                        q0Var.A |= MediaStatus.COMMAND_FOLLOW;
                    }
                    break;
                default:
                    switch (iOrdinal) {
                        case 27:
                            switch (str2) {
                                case "optimizeQuality":
                                    i12 = 2;
                                    break;
                                case "auto":
                                    i12 = 1;
                                    break;
                                case "optimizeSpeed":
                                    i12 = 3;
                                    break;
                                default:
                                    i12 = 0;
                                    break;
                            }
                            q0Var.f14060m0 = i12;
                            if (i12 != 0) {
                                q0Var.A |= 137438953472L;
                            }
                            break;
                        case 28:
                            String strR = r(str2);
                            q0Var.Q = strR;
                            q0Var.R = strR;
                            q0Var.S = strR;
                            q0Var.A |= 14680064;
                            break;
                        case 29:
                            q0Var.Q = r(str2);
                            q0Var.A |= 2097152;
                            break;
                        case 30:
                            q0Var.R = r(str2);
                            q0Var.A |= 4194304;
                            break;
                        case 31:
                            q0Var.S = r(str2);
                            q0Var.A |= 8388608;
                            break;
                        default:
                            switch (iOrdinal) {
                                case 62:
                                    if (str2.equals("currentColor")) {
                                        q0Var.V = uVar;
                                    } else {
                                        try {
                                            q0Var.V = n(str2);
                                        } catch (SVGParseException e10) {
                                            Log.w("SVGParser", e10.getMessage());
                                            return;
                                        }
                                    }
                                    q0Var.A |= 67108864;
                                    break;
                                case 63:
                                    q0Var.W = v(str2);
                                    q0Var.A |= 134217728;
                                    break;
                                case 64:
                                    z0 z0VarW2 = w(str2);
                                    q0Var.D = z0VarW2;
                                    if (z0VarW2 != null) {
                                        q0Var.A |= 8;
                                    }
                                    break;
                                case 65:
                                    if (!"none".equals(str2)) {
                                        com.google.android.gms.internal.play_billing.q1 q1Var3 = new com.google.android.gms.internal.play_billing.q1(str2);
                                        q1Var3.c0();
                                        if (q1Var3.y() || (c0VarN = q1Var3.N()) == null || c0VarN.f()) {
                                            c0VarArr = null;
                                        } else {
                                            float f3 = c0VarN.A;
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(c0VarN);
                                            while (true) {
                                                if (!q1Var3.y()) {
                                                    q1Var3.b0();
                                                    c0 c0VarN2 = q1Var3.N();
                                                    if (c0VarN2 != null && !c0VarN2.f()) {
                                                        arrayList.add(c0VarN2);
                                                        f3 += c0VarN2.A;
                                                    }
                                                } else if (f3 != 0.0f) {
                                                    c0VarArr = (c0[]) arrayList.toArray(new c0[arrayList.size()]);
                                                }
                                                c0VarArr = null;
                                            }
                                        }
                                        q0Var.H = c0VarArr;
                                        if (c0VarArr != null) {
                                            q0Var.A |= 512;
                                        }
                                    } else {
                                        q0Var.H = null;
                                        q0Var.A |= 512;
                                    }
                                    break;
                                case 66:
                                    q0Var.I = s(str2);
                                    q0Var.A |= MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
                                    break;
                                case 67:
                                    if ("butt".equals(str2)) {
                                        i13 = 1;
                                    } else if ("round".equals(str2)) {
                                        i13 = 2;
                                    } else {
                                        i13 = "square".equals(str2) ? 3 : 0;
                                    }
                                    q0Var.f14052e0 = i13;
                                    if (i13 != 0) {
                                        q0Var.A |= 64;
                                    }
                                    break;
                                case 68:
                                    if ("miter".equals(str2)) {
                                        i14 = 1;
                                    } else if ("round".equals(str2)) {
                                        i14 = 2;
                                    } else {
                                        i14 = "bevel".equals(str2) ? 3 : 0;
                                    }
                                    q0Var.f14053f0 = i14;
                                    if (i14 != 0) {
                                        q0Var.A |= 128;
                                    }
                                    break;
                                case 69:
                                    q0Var.G = Float.valueOf(p(str2));
                                    q0Var.A |= 256;
                                    break;
                                case 70:
                                    Float fV2 = v(str2);
                                    q0Var.E = fV2;
                                    if (fV2 != null) {
                                        q0Var.A |= 16;
                                    }
                                    break;
                                case 71:
                                    q0Var.F = s(str2);
                                    q0Var.A |= 32;
                                    break;
                                default:
                                    switch (iOrdinal) {
                                        case 88:
                                            if (str2.equals("currentColor")) {
                                                q0Var.f14049b0 = uVar;
                                            } else {
                                                try {
                                                    q0Var.f14049b0 = n(str2);
                                                } catch (SVGParseException e11) {
                                                    Log.w("SVGParser", e11.getMessage());
                                                    return;
                                                }
                                            }
                                            q0Var.A |= 8589934592L;
                                            break;
                                        case 89:
                                            q0Var.f14050c0 = v(str2);
                                            q0Var.A |= 17179869184L;
                                            break;
                                        case 90:
                                            if (str2.indexOf(124) < 0) {
                                                if ("|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                                                    q0Var.U = Boolean.valueOf(str2.equals("visible"));
                                                    q0Var.A |= 33554432;
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } catch (SVGParseException unused3) {
        }
    }

    public static int b(float f3) {
        if (f3 < 0.0f) {
            return 0;
        }
        if (f3 > 255.0f) {
            return 255;
        }
        return Math.round(f3);
    }

    public static int d(float f3, float f10, float f11) {
        float f12 = 0.0f;
        float f13 = f3 % 360.0f;
        if (f3 < 0.0f) {
            f13 += 360.0f;
        }
        float f14 = f13 / 60.0f;
        float f15 = f10 / 100.0f;
        float f16 = f11 / 100.0f;
        if (f15 < 0.0f) {
            f15 = 0.0f;
        } else if (f15 > 1.0f) {
            f15 = 1.0f;
        }
        if (f16 >= 0.0f) {
            f12 = f16 > 1.0f ? 1.0f : f16;
        }
        float f17 = f12 <= 0.5f ? (f15 + 1.0f) * f12 : (f12 + f15) - (f15 * f12);
        float f18 = (f12 * 2.0f) - f17;
        return b(e(f18, f17, f14 - 2.0f) * 256.0f) | (b(e(f18, f17, f14 + 2.0f) * 256.0f) << 16) | (b(e(f18, f17, f14) * 256.0f) << 8);
    }

    public static float e(float f3, float f10, float f11) {
        if (f11 < 0.0f) {
            f11 += 6.0f;
        }
        if (f11 >= 6.0f) {
            f11 -= 6.0f;
        }
        if (f11 < 1.0f) {
            return w.c.b(f10, f3, f11, f3);
        }
        if (f11 < 3.0f) {
            return f10;
        }
        return f11 < 4.0f ? w.c.b(4.0f, f11, f10 - f3, f3) : f3;
    }

    public static void f(s0 s0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int iD = oi.k.d(attributes, i10);
            if (iD != 73) {
                switch (iD) {
                    case 52:
                        com.google.android.gms.internal.play_billing.q1 q1Var = new com.google.android.gms.internal.play_billing.q1(strTrim);
                        HashSet hashSet = new HashSet();
                        while (!q1Var.y()) {
                            String strP = q1Var.P();
                            if (strP.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(strP.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            q1Var.c0();
                        }
                        s0Var.e(hashSet);
                        break;
                    case 53:
                        s0Var.h(strTrim);
                        break;
                    case 54:
                        com.google.android.gms.internal.play_billing.q1 q1Var2 = new com.google.android.gms.internal.play_billing.q1(strTrim);
                        HashSet hashSet2 = new HashSet();
                        while (!q1Var2.y()) {
                            hashSet2.add(q1Var2.P());
                            q1Var2.c0();
                        }
                        s0Var.i(hashSet2);
                        break;
                    case 55:
                        ArrayList arrayListQ = q(strTrim);
                        s0Var.g(arrayListQ != null ? new HashSet(arrayListQ) : new HashSet(0));
                        break;
                }
            } else {
                com.google.android.gms.internal.play_billing.q1 q1Var3 = new com.google.android.gms.internal.play_billing.q1(strTrim);
                HashSet hashSet3 = new HashSet();
                while (!q1Var3.y()) {
                    String strP2 = q1Var3.P();
                    int iIndexOf = strP2.indexOf(45);
                    if (iIndexOf != -1) {
                        strP2 = strP2.substring(0, iIndexOf);
                    }
                    hashSet3.add(new Locale(strP2, RuntimeVersion.SUFFIX, RuntimeVersion.SUFFIX).getLanguage());
                    q1Var3.c0();
                }
                s0Var.j(hashSet3);
            }
        }
    }

    public static void g(w0 w0Var, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String qName = attributes.getQName(i10);
            if (qName.equals("id") || qName.equals("xml:id")) {
                w0Var.f14103c = attributes.getValue(i10).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i10).trim();
                if ("default".equals(strTrim)) {
                    w0Var.f14104d = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new SVGParseException(a1.b.o("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    w0Var.f14104d = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    public static void h(x xVar, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int iD = oi.k.d(attributes, i10);
            if (iD == 23) {
                xVar.f14118j = z(strTrim);
            } else if (iD != 24) {
                if (iD != 26) {
                    if (iD != 60) {
                        continue;
                    } else {
                        try {
                            xVar.f14119k = oi.k.A(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new SVGParseException(a1.b.p("Invalid spreadMethod attribute. \"", strTrim, "\" is not a valid value."));
                        }
                    }
                } else if (RuntimeVersion.SUFFIX.equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                    xVar.l = strTrim;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                xVar.f14117i = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new SVGParseException("Invalid value for attribute gradientUnits");
                }
                xVar.f14117i = Boolean.TRUE;
            }
        }
    }

    public static void i(l0 l0Var, Attributes attributes, String str) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (e2.a(attributes.getLocalName(i10)) == e2.B) {
                com.google.android.gms.internal.play_billing.q1 q1Var = new com.google.android.gms.internal.play_billing.q1(attributes.getValue(i10));
                ArrayList arrayList = new ArrayList();
                q1Var.c0();
                while (!q1Var.y()) {
                    float fM = q1Var.M();
                    if (Float.isNaN(fM)) {
                        throw new SVGParseException(a1.b.p("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    q1Var.b0();
                    float fM2 = q1Var.M();
                    if (Float.isNaN(fM2)) {
                        throw new SVGParseException(a1.b.p("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    q1Var.b0();
                    arrayList.add(Float.valueOf(fM));
                    arrayList.add(Float.valueOf(fM2));
                }
                l0Var.f14017o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    l0Var.f14017o[i11] = ((Float) it.next()).floatValue();
                    i11++;
                }
            }
        }
    }

    public static void j(w0 w0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (strTrim.length() != 0) {
                int iD = oi.k.d(attributes, i10);
                if (iD == 0) {
                    c cVar = new c(strTrim);
                    ArrayList arrayList = null;
                    while (!cVar.y()) {
                        String strP = cVar.P();
                        if (strP != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(strP);
                            cVar.c0();
                        }
                    }
                    w0Var.f14107g = arrayList;
                } else if (iD != 72) {
                    if (w0Var.f14105e == null) {
                        w0Var.f14105e = new q0();
                    }
                    D(w0Var.f14105e, attributes.getLocalName(i10), attributes.getValue(i10).trim());
                } else {
                    com.google.android.gms.internal.play_billing.q1 q1Var = new com.google.android.gms.internal.play_billing.q1(strTrim.replaceAll("/\\*.*?\\*/", RuntimeVersion.SUFFIX));
                    while (true) {
                        String strQ = q1Var.Q(':', false);
                        q1Var.c0();
                        if (!q1Var.u(':')) {
                            break;
                        }
                        q1Var.c0();
                        String strQ2 = q1Var.Q(';', true);
                        if (strQ2 == null) {
                            break;
                        }
                        q1Var.c0();
                        if (q1Var.y() || q1Var.u(';')) {
                            if (w0Var.f14106f == null) {
                                w0Var.f14106f = new q0();
                            }
                            D(w0Var.f14106f, strQ, strQ2);
                            q1Var.c0();
                        }
                    }
                }
            }
        }
    }

    public static void k(l1 l1Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int iD = oi.k.d(attributes, i10);
            if (iD == 9) {
                l1Var.f14020p = t(strTrim);
            } else if (iD == 10) {
                l1Var.f14021q = t(strTrim);
            } else if (iD == 82) {
                l1Var.f14018n = t(strTrim);
            } else if (iD == 83) {
                l1Var.f14019o = t(strTrim);
            }
        }
    }

    public static void l(a0 a0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (e2.a(attributes.getLocalName(i10)) == e2.C) {
                a0Var.k(z(attributes.getValue(i10)));
            }
        }
    }

    public static void m(c1 c1Var, Attributes attributes) throws SVGParseException {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int iD = oi.k.d(attributes, i10);
            if (iD == 48) {
                x(c1Var, strTrim);
            } else if (iD != 80) {
                continue;
            } else {
                com.google.android.gms.internal.play_billing.q1 q1Var = new com.google.android.gms.internal.play_billing.q1(strTrim);
                q1Var.c0();
                float fM = q1Var.M();
                q1Var.b0();
                float fM2 = q1Var.M();
                q1Var.b0();
                float fM3 = q1Var.M();
                q1Var.b0();
                float fM4 = q1Var.M();
                if (Float.isNaN(fM) || Float.isNaN(fM2) || Float.isNaN(fM3) || Float.isNaN(fM4)) {
                    throw new SVGParseException("Invalid viewBox definition - should have four numbers");
                }
                if (fM3 < 0.0f) {
                    throw new SVGParseException("Invalid viewBox. width cannot be negative");
                }
                if (fM4 < 0.0f) {
                    throw new SVGParseException("Invalid viewBox. height cannot be negative");
                }
                c1Var.f13962o = new h2.a(fM, fM2, fM3, fM4);
            }
        }
    }

    public static t n(String str) throws SVGParseException {
        long j9;
        int i10;
        if (str.charAt(0) == '#') {
            int length = str.length();
            i9.d dVar = null;
            if (1 < length) {
                long j10 = 0;
                int i11 = 1;
                while (true) {
                    if (i11 < length) {
                        char cCharAt = str.charAt(i11);
                        if (cCharAt < '0' || cCharAt > '9') {
                            if (cCharAt >= 'A' && cCharAt <= 'F') {
                                j9 = j10 * 16;
                                i10 = cCharAt - 'A';
                            } else if (cCharAt >= 'a' && cCharAt <= 'f') {
                                j9 = j10 * 16;
                                i10 = cCharAt - 'a';
                            }
                            j10 = j9 + ((long) i10) + 10;
                        } else {
                            j10 = (j10 * 16) + ((long) (cCharAt - '0'));
                        }
                        if (j10 <= 4294967295L) {
                            i11++;
                        }
                    }
                    if (i11 != 1) {
                        dVar = new i9.d(j10, i11);
                    }
                }
            }
            if (dVar == null) {
                throw new SVGParseException("Bad hex colour value: ".concat(str));
            }
            long j11 = dVar.f7553b;
            int i12 = dVar.f7552a;
            if (i12 == 4) {
                int i13 = (int) j11;
                int i14 = i13 & 3840;
                int i15 = i13 & 240;
                int i16 = i13 & 15;
                return new t(i16 | (i14 << 8) | (-16777216) | (i14 << 12) | (i15 << 8) | (i15 << 4) | (i16 << 4));
            }
            if (i12 != 5) {
                if (i12 == 7) {
                    return new t(((int) j11) | (-16777216));
                }
                if (i12 != 9) {
                    throw new SVGParseException("Bad hex colour value: ".concat(str));
                }
                int i17 = (int) j11;
                return new t((i17 >>> 8) | (i17 << 24));
            }
            int i18 = (int) j11;
            int i19 = 61440 & i18;
            int i20 = i18 & 3840;
            int i21 = i18 & 240;
            int i22 = i18 & 15;
            return new t((i22 << 24) | (i22 << 28) | (i19 << 8) | (i19 << 4) | (i20 << 4) | i20 | i21 | (i21 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (zStartsWith || lowerCase.startsWith("rgb(")) {
            com.google.android.gms.internal.play_billing.q1 q1Var = new com.google.android.gms.internal.play_billing.q1(str.substring(zStartsWith ? 5 : 4));
            q1Var.c0();
            float fM = q1Var.M();
            if (!Float.isNaN(fM) && q1Var.u('%')) {
                fM = (fM * 256.0f) / 100.0f;
            }
            float fK = q1Var.k(fM);
            if (!Float.isNaN(fK) && q1Var.u('%')) {
                fK = (fK * 256.0f) / 100.0f;
            }
            float fK2 = q1Var.k(fK);
            if (!Float.isNaN(fK2) && q1Var.u('%')) {
                fK2 = (fK2 * 256.0f) / 100.0f;
            }
            if (!zStartsWith) {
                q1Var.c0();
                if (Float.isNaN(fK2) || !q1Var.u(')')) {
                    throw new SVGParseException("Bad rgb() colour value: ".concat(str));
                }
                return new t((b(fM) << 16) | (-16777216) | (b(fK) << 8) | b(fK2));
            }
            float fK3 = q1Var.k(fK2);
            q1Var.c0();
            if (Float.isNaN(fK3) || !q1Var.u(')')) {
                throw new SVGParseException("Bad rgba() colour value: ".concat(str));
            }
            return new t((b(fK3 * 256.0f) << 24) | (b(fM) << 16) | (b(fK) << 8) | b(fK2));
        }
        boolean zStartsWith2 = lowerCase.startsWith("hsla(");
        if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) a2.f13947a.get(lowerCase);
            if (num != null) {
                return new t(num.intValue());
            }
            throw new SVGParseException("Invalid colour keyword: ".concat(lowerCase));
        }
        com.google.android.gms.internal.play_billing.q1 q1Var2 = new com.google.android.gms.internal.play_billing.q1(str.substring(zStartsWith2 ? 5 : 4));
        q1Var2.c0();
        float fM2 = q1Var2.M();
        float fK4 = q1Var2.k(fM2);
        if (!Float.isNaN(fK4)) {
            q1Var2.u('%');
        }
        float fK5 = q1Var2.k(fK4);
        if (!Float.isNaN(fK5)) {
            q1Var2.u('%');
        }
        if (!zStartsWith2) {
            q1Var2.c0();
            if (Float.isNaN(fK5) || !q1Var2.u(')')) {
                throw new SVGParseException("Bad hsl() colour value: ".concat(str));
            }
            return new t(d(fM2, fK4, fK5) | (-16777216));
        }
        float fK6 = q1Var2.k(fK5);
        q1Var2.c0();
        if (Float.isNaN(fK6) || !q1Var2.u(')')) {
            throw new SVGParseException("Bad hsla() colour value: ".concat(str));
        }
        return new t((b(fK6 * 256.0f) << 24) | d(fM2, fK4, fK5));
    }

    public static float o(int i10, String str) throws SVGParseException {
        float fA = new o().a(0, str, i10);
        if (Float.isNaN(fA)) {
            throw new SVGParseException(a1.b.o("Invalid float value: ", str));
        }
        return fA;
    }

    public static float p(String str) throws SVGParseException {
        int length = str.length();
        if (length != 0) {
            return o(length, str);
        }
        throw new SVGParseException("Invalid float value (empty string)");
    }

    public static ArrayList q(String str) {
        com.google.android.gms.internal.play_billing.q1 q1Var = new com.google.android.gms.internal.play_billing.q1(str);
        ArrayList arrayList = null;
        do {
            String strO = q1Var.O();
            if (strO == null) {
                strO = q1Var.Q(',', true);
            }
            if (strO == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strO);
            q1Var.b0();
        } while (!q1Var.y());
        return arrayList;
    }

    public static String r(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static c0 s(String str) throws SVGParseException {
        int iB;
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length value (empty string)");
        }
        int length = str.length();
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            iB = 9;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                iB = oi.k.B(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new SVGParseException("Invalid length unit specifier: ".concat(str));
            }
        } else {
            iB = 1;
        }
        try {
            return new c0(o(length, str), iB);
        } catch (NumberFormatException e3) {
            throw new SVGParseException("Invalid length value: ".concat(str), e3);
        }
    }

    public static ArrayList t(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        com.google.android.gms.internal.play_billing.q1 q1Var = new com.google.android.gms.internal.play_billing.q1(str);
        q1Var.c0();
        while (!q1Var.y()) {
            float fM = q1Var.M();
            if (Float.isNaN(fM)) {
                StringBuilder sb2 = new StringBuilder("Invalid length list value: ");
                String str2 = (String) q1Var.f4032d;
                int i10 = q1Var.f4030b;
                while (!q1Var.y() && !com.google.android.gms.internal.play_billing.q1.I(str2.charAt(q1Var.f4030b))) {
                    q1Var.f4030b++;
                }
                String strSubstring = str2.substring(i10, q1Var.f4030b);
                q1Var.f4030b = i10;
                sb2.append(strSubstring);
                throw new SVGParseException(sb2.toString());
            }
            int iR = q1Var.R();
            if (iR == 0) {
                iR = 1;
            }
            arrayList.add(new c0(fM, iR));
            q1Var.b0();
        }
        return arrayList;
    }

    public static c0 u(com.google.android.gms.internal.play_billing.q1 q1Var) {
        return q1Var.v("auto") ? new c0(0.0f) : q1Var.N();
    }

    public static Float v(String str) {
        try {
            float fP = p(str);
            float f3 = 0.0f;
            if (fP < 0.0f) {
                fP = f3;
            } else {
                f3 = 1.0f;
                if (fP > 1.0f) {
                    fP = f3;
                }
            }
            return Float.valueOf(fP);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public static z0 w(String str) {
        boolean zStartsWith = str.startsWith("url(");
        z0 z0VarN = t.C;
        u uVar = u.A;
        z0 z0Var = null;
        if (!zStartsWith) {
            if (str.equals("none")) {
                return z0VarN;
            }
            if (str.equals("currentColor")) {
                return uVar;
            }
            try {
                return n(str);
            } catch (SVGParseException unused) {
                return null;
            }
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new h0(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        if (strTrim2.length() > 0) {
            if (!strTrim2.equals("none")) {
                if (strTrim2.equals("currentColor")) {
                    z0VarN = uVar;
                } else {
                    try {
                        z0VarN = n(strTrim2);
                    } catch (SVGParseException unused2) {
                        z0VarN = null;
                    }
                }
            }
            z0Var = z0VarN;
        }
        return new h0(strTrim, z0Var);
    }

    public static void x(a1 a1Var, String str) throws SVGParseException {
        int i10;
        com.google.android.gms.internal.play_billing.q1 q1Var = new com.google.android.gms.internal.play_billing.q1(str);
        q1Var.c0();
        String strP = q1Var.P();
        if ("defer".equals(strP)) {
            q1Var.c0();
            strP = q1Var.P();
        }
        p pVar = (p) z1.f14139a.get(strP);
        q1Var.c0();
        if (q1Var.y()) {
            i10 = 0;
        } else {
            String strP2 = q1Var.P();
            strP2.getClass();
            if (strP2.equals("meet")) {
                i10 = 1;
            } else {
                if (!strP2.equals("slice")) {
                    throw new SVGParseException("Invalid preserveAspectRatio definition: ".concat(str));
                }
                i10 = 2;
            }
        }
        a1Var.f13946n = new q(pVar, i10);
    }

    public static HashMap y(com.google.android.gms.internal.play_billing.q1 q1Var) {
        HashMap map = new HashMap();
        q1Var.c0();
        String strQ = q1Var.Q('=', false);
        while (strQ != null) {
            q1Var.u('=');
            map.put(strQ, q1Var.O());
            q1Var.c0();
            strQ = q1Var.Q('=', false);
        }
        return map;
    }

    public static Matrix z(String str) throws SVGParseException {
        Matrix matrix = new Matrix();
        com.google.android.gms.internal.play_billing.q1 q1Var = new com.google.android.gms.internal.play_billing.q1(str);
        q1Var.c0();
        while (!q1Var.y()) {
            String str2 = (String) q1Var.f4032d;
            String strSubstring = null;
            if (!q1Var.y()) {
                int i10 = q1Var.f4030b;
                int iCharAt = str2.charAt(i10);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = q1Var.h();
                    }
                }
                int i11 = q1Var.f4030b;
                while (com.google.android.gms.internal.play_billing.q1.I(iCharAt)) {
                    iCharAt = q1Var.h();
                }
                if (iCharAt == 40) {
                    q1Var.f4030b++;
                    strSubstring = str2.substring(i10, i11);
                } else {
                    q1Var.f4030b = i10;
                }
            }
            if (strSubstring == null) {
                throw new SVGParseException("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (strSubstring) {
                case "matrix":
                    q1Var.c0();
                    float fM = q1Var.M();
                    q1Var.b0();
                    float fM2 = q1Var.M();
                    q1Var.b0();
                    float fM3 = q1Var.M();
                    q1Var.b0();
                    float fM4 = q1Var.M();
                    q1Var.b0();
                    float fM5 = q1Var.M();
                    q1Var.b0();
                    float fM6 = q1Var.M();
                    q1Var.c0();
                    if (Float.isNaN(fM6) || !q1Var.u(')')) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fM, fM3, fM5, fM2, fM4, fM6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    q1Var.c0();
                    float fM7 = q1Var.M();
                    float fW = q1Var.W();
                    float fW2 = q1Var.W();
                    q1Var.c0();
                    if (Float.isNaN(fM7) || !q1Var.u(')')) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(fW)) {
                        matrix.preRotate(fM7);
                    } else {
                        if (Float.isNaN(fW2)) {
                            throw new SVGParseException("Invalid transform list: ".concat(str));
                        }
                        matrix.preRotate(fM7, fW, fW2);
                    }
                    break;
                    break;
                case "scale":
                    q1Var.c0();
                    float fM8 = q1Var.M();
                    float fW3 = q1Var.W();
                    q1Var.c0();
                    if (Float.isNaN(fM8) || !q1Var.u(')')) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fW3)) {
                        matrix.preScale(fM8, fW3);
                    } else {
                        matrix.preScale(fM8, fM8);
                    }
                    break;
                    break;
                case "skewX":
                    q1Var.c0();
                    float fM9 = q1Var.M();
                    q1Var.c0();
                    if (Float.isNaN(fM9) || !q1Var.u(')')) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fM9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    q1Var.c0();
                    float fM10 = q1Var.M();
                    q1Var.c0();
                    if (Float.isNaN(fM10) || !q1Var.u(')')) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fM10)));
                    break;
                    break;
                case "translate":
                    q1Var.c0();
                    float fM11 = q1Var.M();
                    float fW4 = q1Var.W();
                    q1Var.c0();
                    if (Float.isNaN(fM11) || !q1Var.u(')')) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fW4)) {
                        matrix.preTranslate(fM11, fW4);
                    } else {
                        matrix.preTranslate(fM11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new SVGParseException(a1.b.p("Invalid transform list fn: ", strSubstring, ")"));
            }
            if (q1Var.y()) {
                return matrix;
            }
            q1Var.b0();
        }
        return matrix;
    }

    public final void A(InputStream inputStream) throws SVGParseException {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            d2 d2Var = new d2(this);
            xMLReader.setContentHandler(d2Var);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", d2Var);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e3) {
            throw new SVGParseException("Stream error", e3);
        } catch (ParserConfigurationException e10) {
            throw new SVGParseException("XML parser problem", e10);
        } catch (SAXException e11) {
            throw new SVGParseException("SVG parse error", e11);
        }
    }

    public final void B(InputStream inputStream) throws SVGParseException {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                g2 g2Var = new g2();
                g2Var.f13987a = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        E();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        com.google.android.gms.internal.play_billing.q1 q1Var = new com.google.android.gms.internal.play_billing.q1(xmlPullParserNewPullParser.getText());
                        String strP = q1Var.P();
                        y(q1Var);
                        strP.equals("xml-stylesheet");
                    } else if (eventType == 10) {
                        if (((r0) this.f13989a.B) == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                A(inputStream);
                                return;
                            } catch (IOException unused) {
                                Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        F(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, g2Var);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        c(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        H(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        G(xmlPullParserNewPullParser.getText());
                    }
                }
            } catch (XmlPullParserException e3) {
                throw new SVGParseException("XML parser problem", e3);
            }
        } catch (IOException e10) {
            throw new SVGParseException("Stream error", e10);
        }
    }

    public final void C(Attributes attributes) throws SVGParseException {
        int iIntValue;
        char c10;
        float fM;
        float f3;
        float f10;
        float f11;
        float f12;
        int i10;
        char cCharAt;
        Attributes attributes2 = attributes;
        u0 u0Var = this.f13990b;
        if (u0Var == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        i0 i0Var = new i0();
        i0Var.f14129a = this.f13989a;
        i0Var.f14130b = u0Var;
        g(i0Var, attributes2);
        j(i0Var, attributes2);
        l(i0Var, attributes2);
        f(i0Var, attributes2);
        int i11 = 0;
        int i12 = 0;
        while (i12 < attributes2.getLength()) {
            String strTrim = attributes2.getValue(i12).trim();
            int iD = oi.k.d(attributes2, i12);
            float f13 = 0.0f;
            if (iD == 13) {
                com.google.android.gms.internal.play_billing.q1 q1Var = new com.google.android.gms.internal.play_billing.q1(strTrim);
                com.google.android.gms.internal.play_billing.q1 q1Var2 = new com.google.android.gms.internal.play_billing.q1(5, (byte) 0);
                q1Var2.f4030b = i11;
                q1Var2.f4031c = i11;
                q1Var2.f4033e = new byte[8];
                q1Var2.f4032d = new float[16];
                if (!q1Var.y() && ((iIntValue = q1Var.L().intValue()) == 77 || iIntValue == 109)) {
                    float f14 = 0.0f;
                    float f15 = 0.0f;
                    float f16 = 0.0f;
                    float f17 = 0.0f;
                    float f18 = 0.0f;
                    float f19 = 0.0f;
                    while (true) {
                        q1Var.c0();
                        float f20 = f13;
                        switch (iIntValue) {
                            case 65:
                            case 97:
                                c10 = 'm';
                                float fM2 = q1Var.M();
                                float fK = q1Var.k(fM2);
                                float f21 = f16;
                                float fK2 = q1Var.k(fK);
                                Boolean boolJ = q1Var.j(Float.valueOf(fK2));
                                Boolean boolJ2 = q1Var.j(boolJ);
                                if (boolJ2 == null) {
                                    fM = Float.NaN;
                                } else {
                                    q1Var.b0();
                                    fM = q1Var.M();
                                }
                                i12 = i12;
                                float f22 = fM;
                                float fK3 = q1Var.k(f22);
                                if (!Float.isNaN(fK3) && fM2 >= f20 && fK >= f20) {
                                    if (iIntValue == 97) {
                                        f3 = f22 + f14;
                                        fK3 += f21;
                                    } else {
                                        f3 = f22;
                                    }
                                    boolean zBooleanValue = boolJ.booleanValue();
                                    boolean zBooleanValue2 = boolJ2.booleanValue();
                                    float f23 = f3;
                                    q1Var2.d(fM2, fK, fK2, zBooleanValue, zBooleanValue2, f23, fK3);
                                    f14 = f23;
                                    f15 = f14;
                                    f16 = fK3;
                                    f17 = f16;
                                    q1Var.b0();
                                    if (q1Var.y()) {
                                        i10 = q1Var.f4030b;
                                        if (i10 != q1Var.f4031c && (((cCharAt = ((String) q1Var.f4032d).charAt(i10)) >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                                            iIntValue = q1Var.L().intValue();
                                        }
                                        f13 = f20;
                                        i12 = i12;
                                    }
                                } else {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                }
                                break;
                            case 67:
                            case 99:
                                float fM3 = q1Var.M();
                                float fK4 = q1Var.k(fM3);
                                float fK5 = q1Var.k(fK4);
                                float fK6 = q1Var.k(fK5);
                                float fK7 = q1Var.k(fK6);
                                float fK8 = q1Var.k(fK7);
                                if (!Float.isNaN(fK8)) {
                                    if (iIntValue == 99) {
                                        fK7 += f14;
                                        fK8 += f16;
                                        fM3 += f14;
                                        fK4 += f16;
                                        fK5 += f14;
                                        fK6 += f16;
                                    }
                                    float f24 = fM3;
                                    f10 = fK5;
                                    f11 = fK8;
                                    c10 = 'm';
                                    f17 = fK6;
                                    float f25 = fK4;
                                    f12 = fK7;
                                    q1Var2.c(f24, f25, f10, f17, f12, f11);
                                    f15 = f10;
                                    f14 = f12;
                                    f16 = f11;
                                    i12 = i12;
                                    q1Var.b0();
                                    if (q1Var.y()) {
                                        i10 = q1Var.f4030b;
                                        if (i10 != q1Var.f4031c) {
                                            iIntValue = q1Var.L().intValue();
                                        }
                                        f13 = f20;
                                        i12 = i12;
                                    }
                                } else {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    i12 = i12;
                                }
                                break;
                            case 72:
                            case MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED:
                                float fM4 = q1Var.M();
                                if (!Float.isNaN(fM4)) {
                                    if (iIntValue == 104) {
                                        fM4 += f14;
                                    }
                                    f14 = fM4;
                                    q1Var2.e(f14, f16);
                                    c10 = 'm';
                                    f15 = f14;
                                    q1Var.b0();
                                    if (q1Var.y()) {
                                        i10 = q1Var.f4030b;
                                        if (i10 != q1Var.f4031c) {
                                            iIntValue = q1Var.L().intValue();
                                        }
                                        f13 = f20;
                                        i12 = i12;
                                    }
                                } else {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    i12 = i12;
                                }
                                break;
                            case 76:
                            case 108:
                                float fM5 = q1Var.M();
                                float fK9 = q1Var.k(fM5);
                                if (!Float.isNaN(fK9)) {
                                    if (iIntValue == 108) {
                                        fM5 += f14;
                                        fK9 += f16;
                                    }
                                    f14 = fM5;
                                    f16 = fK9;
                                    q1Var2.e(f14, f16);
                                    c10 = 'm';
                                    f17 = f16;
                                    f15 = f14;
                                    q1Var.b0();
                                    if (q1Var.y()) {
                                        i10 = q1Var.f4030b;
                                        if (i10 != q1Var.f4031c) {
                                            iIntValue = q1Var.L().intValue();
                                        }
                                        f13 = f20;
                                        i12 = i12;
                                    }
                                } else {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    i12 = i12;
                                }
                                break;
                            case 77:
                            case 109:
                                float fM6 = q1Var.M();
                                float fK10 = q1Var.k(fM6);
                                if (!Float.isNaN(fK10)) {
                                    if (iIntValue == 109 && q1Var2.f4030b != 0) {
                                        fM6 += f14;
                                        fK10 += f16;
                                    }
                                    f14 = fM6;
                                    f16 = fK10;
                                    q1Var2.b(f14, f16);
                                    i12 = i12;
                                    f18 = f14;
                                    c10 = 'm';
                                    f17 = f16;
                                    f19 = f17;
                                    iIntValue = iIntValue != 109 ? 76 : 108;
                                    f15 = f18;
                                    q1Var.b0();
                                    if (q1Var.y()) {
                                        i10 = q1Var.f4030b;
                                        if (i10 != q1Var.f4031c) {
                                            iIntValue = q1Var.L().intValue();
                                        }
                                        f13 = f20;
                                        i12 = i12;
                                    }
                                } else {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    i12 = i12;
                                }
                                break;
                            case 81:
                            case 113:
                                float fM7 = q1Var.M();
                                float fK11 = q1Var.k(fM7);
                                float fK12 = q1Var.k(fK11);
                                float fK13 = q1Var.k(fK12);
                                if (!Float.isNaN(fK13)) {
                                    if (iIntValue == 113) {
                                        fK12 += f14;
                                        fK13 += f16;
                                        fM7 += f14;
                                        fK11 += f16;
                                    }
                                    f14 = fK12;
                                    f16 = fK13;
                                    q1Var2.a(fM7, fK11, f14, f16);
                                    i12 = i12;
                                    c10 = 'm';
                                    f15 = fM7;
                                    f17 = fK11;
                                    q1Var.b0();
                                    if (q1Var.y()) {
                                        i10 = q1Var.f4030b;
                                        if (i10 != q1Var.f4031c) {
                                            iIntValue = q1Var.L().intValue();
                                        }
                                        f13 = f20;
                                        i12 = i12;
                                    }
                                } else {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    i12 = i12;
                                }
                                break;
                            case 83:
                            case 115:
                                float f26 = (f14 * 2.0f) - f15;
                                float f27 = (2.0f * f16) - f17;
                                float fM8 = q1Var.M();
                                float fK14 = q1Var.k(fM8);
                                float fK15 = q1Var.k(fK14);
                                float fK16 = q1Var.k(fK15);
                                if (!Float.isNaN(fK16)) {
                                    if (iIntValue == 115) {
                                        fK15 += f14;
                                        fK16 += f16;
                                        fM8 += f14;
                                        fK14 += f16;
                                    }
                                    f10 = fM8;
                                    f17 = fK14;
                                    f11 = fK16;
                                    c10 = 'm';
                                    f12 = fK15;
                                    q1Var2.c(f26, f27, f10, f17, f12, f11);
                                    f15 = f10;
                                    f14 = f12;
                                    f16 = f11;
                                    i12 = i12;
                                    q1Var.b0();
                                    if (q1Var.y()) {
                                        i10 = q1Var.f4030b;
                                        if (i10 != q1Var.f4031c) {
                                            iIntValue = q1Var.L().intValue();
                                        }
                                        f13 = f20;
                                        i12 = i12;
                                    }
                                } else {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    i12 = i12;
                                }
                                break;
                            case 84:
                            case 116:
                                f15 = (f14 * 2.0f) - f15;
                                f17 = (2.0f * f16) - f17;
                                float fM9 = q1Var.M();
                                float fK17 = q1Var.k(fM9);
                                if (!Float.isNaN(fK17)) {
                                    if (iIntValue == 116) {
                                        fM9 += f14;
                                        fK17 += f16;
                                    }
                                    f14 = fM9;
                                    f16 = fK17;
                                    q1Var2.a(f15, f17, f14, f16);
                                    i12 = i12;
                                    c10 = 'm';
                                    q1Var.b0();
                                    if (q1Var.y()) {
                                        i10 = q1Var.f4030b;
                                        if (i10 != q1Var.f4031c) {
                                            iIntValue = q1Var.L().intValue();
                                        }
                                        f13 = f20;
                                        i12 = i12;
                                    }
                                } else {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    i12 = i12;
                                }
                                break;
                            case 86:
                            case 118:
                                float fM10 = q1Var.M();
                                if (!Float.isNaN(fM10)) {
                                    if (iIntValue == 118) {
                                        fM10 += f16;
                                    }
                                    f16 = fM10;
                                    q1Var2.e(f14, f16);
                                    f17 = f16;
                                    c10 = 'm';
                                    q1Var.b0();
                                    if (q1Var.y()) {
                                        i10 = q1Var.f4030b;
                                        if (i10 != q1Var.f4031c) {
                                            iIntValue = q1Var.L().intValue();
                                        }
                                        f13 = f20;
                                        i12 = i12;
                                    }
                                } else {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                    i12 = i12;
                                }
                                break;
                            case 90:
                            case 122:
                                q1Var2.close();
                                f14 = f18;
                                f15 = f14;
                                f16 = f19;
                                f17 = f16;
                                c10 = 'm';
                                q1Var.b0();
                                if (q1Var.y()) {
                                    i10 = q1Var.f4030b;
                                    if (i10 != q1Var.f4031c) {
                                        iIntValue = q1Var.L().intValue();
                                    }
                                    f13 = f20;
                                    i12 = i12;
                                }
                                break;
                            default:
                                i12 = i12;
                                break;
                        }
                    }
                } else {
                    i12 = i12;
                }
                i0Var.f13999o = q1Var2;
            } else {
                if (iD == 43 && p(strTrim) < 0.0f) {
                    throw new SVGParseException("Invalid <path> element. pathLength cannot be negative");
                }
                i12 = i12;
            }
            i12++;
            attributes2 = attributes;
            i11 = 0;
        }
        this.f13990b.m(i0Var);
    }

    public final void E() {
        p1 p1Var = new p1(0, false);
        p1Var.B = null;
        p1Var.C = new db.g(8, (byte) 0);
        p1Var.D = new HashMap();
        this.f13989a = p1Var;
    }

    public final void F(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
        boolean z10;
        if (this.f13991c) {
            this.f13992d++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || RuntimeVersion.SUFFIX.equals(str)) {
            f2 f2Var = (f2) f2.E.get(str2.length() > 0 ? str2 : str3);
            if (f2Var == null) {
                f2Var = f2.D;
            }
            switch (f2Var.ordinal()) {
                case 0:
                    r0 r0Var = new r0();
                    r0Var.f14129a = this.f13989a;
                    r0Var.f14130b = this.f13990b;
                    g(r0Var, attributes);
                    j(r0Var, attributes);
                    f(r0Var, attributes);
                    m(r0Var, attributes);
                    for (int i10 = 0; i10 < attributes.getLength(); i10++) {
                        String strTrim = attributes.getValue(i10).trim();
                        int iD = oi.k.d(attributes, i10);
                        if (iD == 25) {
                            c0 c0VarS = s(strTrim);
                            r0Var.f14075s = c0VarS;
                            if (c0VarS.f()) {
                                throw new SVGParseException("Invalid <svg> element. height cannot be negative");
                            }
                        } else if (iD != 79) {
                            switch (iD) {
                                case 81:
                                    c0 c0VarS2 = s(strTrim);
                                    r0Var.f14074r = c0VarS2;
                                    if (c0VarS2.f()) {
                                        throw new SVGParseException("Invalid <svg> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    r0Var.f14072p = s(strTrim);
                                    break;
                                case 83:
                                    r0Var.f14073q = s(strTrim);
                                    break;
                            }
                        } else {
                            continue;
                        }
                    }
                    u0 u0Var = this.f13990b;
                    if (u0Var == null) {
                        this.f13989a.B = r0Var;
                    } else {
                        u0Var.m(r0Var);
                    }
                    this.f13990b = r0Var;
                    return;
                case 1:
                case 7:
                    if (this.f13990b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    z zVar = new z();
                    zVar.f14129a = this.f13989a;
                    zVar.f14130b = this.f13990b;
                    g(zVar, attributes);
                    j(zVar, attributes);
                    l(zVar, attributes);
                    f(zVar, attributes);
                    this.f13990b.m(zVar);
                    this.f13990b = zVar;
                    return;
                case 2:
                    u0 u0Var2 = this.f13990b;
                    if (u0Var2 == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    r rVar = new r();
                    rVar.f14129a = this.f13989a;
                    rVar.f14130b = u0Var2;
                    g(rVar, attributes);
                    j(rVar, attributes);
                    l(rVar, attributes);
                    f(rVar, attributes);
                    for (int i11 = 0; i11 < attributes.getLength(); i11++) {
                        String strTrim2 = attributes.getValue(i11).trim();
                        int iD2 = oi.k.d(attributes, i11);
                        if (iD2 == 6) {
                            rVar.f14069o = s(strTrim2);
                        } else if (iD2 == 7) {
                            rVar.f14070p = s(strTrim2);
                        } else if (iD2 != 49) {
                            continue;
                        } else {
                            c0 c0VarS3 = s(strTrim2);
                            rVar.f14071q = c0VarS3;
                            if (c0VarS3.f()) {
                                throw new SVGParseException("Invalid <circle> element. r cannot be negative");
                            }
                        }
                    }
                    this.f13990b.m(rVar);
                    return;
                case 3:
                    if (this.f13990b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    s sVar = new s();
                    sVar.f14129a = this.f13989a;
                    sVar.f14130b = this.f13990b;
                    g(sVar, attributes);
                    j(sVar, attributes);
                    l(sVar, attributes);
                    f(sVar, attributes);
                    for (int i12 = 0; i12 < attributes.getLength(); i12++) {
                        String strTrim3 = attributes.getValue(i12).trim();
                        if (oi.k.d(attributes, i12) == 3) {
                            if ("objectBoundingBox".equals(strTrim3)) {
                                sVar.f14081o = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim3)) {
                                    throw new SVGParseException("Invalid value for attribute clipPathUnits");
                                }
                                sVar.f14081o = Boolean.TRUE;
                            }
                        }
                    }
                    this.f13990b.m(sVar);
                    this.f13990b = sVar;
                    return;
                case 4:
                    if (this.f13990b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    v vVar = new v();
                    vVar.f14129a = this.f13989a;
                    vVar.f14130b = this.f13990b;
                    g(vVar, attributes);
                    j(vVar, attributes);
                    l(vVar, attributes);
                    this.f13990b.m(vVar);
                    this.f13990b = vVar;
                    return;
                case 5:
                case RuntimeVersion.MINOR:
                    this.f13993e = true;
                    this.f13994f = f2Var;
                    return;
                case 6:
                    u0 u0Var3 = this.f13990b;
                    if (u0Var3 == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    w wVar = new w();
                    wVar.f14129a = this.f13989a;
                    wVar.f14130b = u0Var3;
                    g(wVar, attributes);
                    j(wVar, attributes);
                    l(wVar, attributes);
                    f(wVar, attributes);
                    for (int i13 = 0; i13 < attributes.getLength(); i13++) {
                        String strTrim4 = attributes.getValue(i13).trim();
                        int iD3 = oi.k.d(attributes, i13);
                        if (iD3 == 6) {
                            wVar.f14099o = s(strTrim4);
                        } else if (iD3 == 7) {
                            wVar.f14100p = s(strTrim4);
                        } else if (iD3 == 56) {
                            c0 c0VarS4 = s(strTrim4);
                            wVar.f14101q = c0VarS4;
                            if (c0VarS4.f()) {
                                throw new SVGParseException("Invalid <ellipse> element. rx cannot be negative");
                            }
                        } else if (iD3 != 57) {
                            continue;
                        } else {
                            c0 c0VarS5 = s(strTrim4);
                            wVar.f14102r = c0VarS5;
                            if (c0VarS5.f()) {
                                throw new SVGParseException("Invalid <ellipse> element. ry cannot be negative");
                            }
                        }
                    }
                    this.f13990b.m(wVar);
                    return;
                case 8:
                    if (this.f13990b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    b0 b0Var = new b0();
                    b0Var.f14129a = this.f13989a;
                    b0Var.f14130b = this.f13990b;
                    g(b0Var, attributes);
                    j(b0Var, attributes);
                    l(b0Var, attributes);
                    f(b0Var, attributes);
                    for (int i14 = 0; i14 < attributes.getLength(); i14++) {
                        String strTrim5 = attributes.getValue(i14).trim();
                        int iD4 = oi.k.d(attributes, i14);
                        if (iD4 == 25) {
                            c0 c0VarS6 = s(strTrim5);
                            b0Var.f13955s = c0VarS6;
                            if (c0VarS6.f()) {
                                throw new SVGParseException("Invalid <use> element. height cannot be negative");
                            }
                        } else if (iD4 != 26) {
                            if (iD4 != 48) {
                                switch (iD4) {
                                    case 81:
                                        c0 c0VarS7 = s(strTrim5);
                                        b0Var.f13954r = c0VarS7;
                                        if (c0VarS7.f()) {
                                            throw new SVGParseException("Invalid <use> element. width cannot be negative");
                                        }
                                        break;
                                        break;
                                    case 82:
                                        b0Var.f13952p = s(strTrim5);
                                        break;
                                    case 83:
                                        b0Var.f13953q = s(strTrim5);
                                        break;
                                }
                            } else {
                                x(b0Var, strTrim5);
                            }
                        } else if (RuntimeVersion.SUFFIX.equals(attributes.getURI(i14)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i14))) {
                            b0Var.f13951o = strTrim5;
                        }
                    }
                    this.f13990b.m(b0Var);
                    this.f13990b = b0Var;
                    return;
                case 9:
                    u0 u0Var4 = this.f13990b;
                    if (u0Var4 == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    d0 d0Var = new d0();
                    d0Var.f14129a = this.f13989a;
                    d0Var.f14130b = u0Var4;
                    g(d0Var, attributes);
                    j(d0Var, attributes);
                    l(d0Var, attributes);
                    f(d0Var, attributes);
                    for (int i15 = 0; i15 < attributes.getLength(); i15++) {
                        String strTrim6 = attributes.getValue(i15).trim();
                        switch (oi.k.d(attributes, i15)) {
                            case 84:
                                d0Var.f13964o = s(strTrim6);
                                break;
                            case 85:
                                d0Var.f13965p = s(strTrim6);
                                break;
                            case 86:
                                d0Var.f13966q = s(strTrim6);
                                break;
                            case 87:
                                d0Var.f13967r = s(strTrim6);
                                break;
                        }
                    }
                    this.f13990b.m(d0Var);
                    return;
                case 10:
                    if (this.f13990b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    x0 x0Var = new x0();
                    x0Var.f14129a = this.f13989a;
                    x0Var.f14130b = this.f13990b;
                    g(x0Var, attributes);
                    j(x0Var, attributes);
                    h(x0Var, attributes);
                    for (int i16 = 0; i16 < attributes.getLength(); i16++) {
                        String strTrim7 = attributes.getValue(i16).trim();
                        switch (oi.k.d(attributes, i16)) {
                            case 84:
                                x0Var.m = s(strTrim7);
                                break;
                            case 85:
                                x0Var.f14120n = s(strTrim7);
                                break;
                            case 86:
                                x0Var.f14121o = s(strTrim7);
                                break;
                            case 87:
                                x0Var.f14122p = s(strTrim7);
                                break;
                        }
                    }
                    this.f13990b.m(x0Var);
                    this.f13990b = x0Var;
                    return;
                case 11:
                    if (this.f13990b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    e0 e0Var = new e0();
                    e0Var.f14129a = this.f13989a;
                    e0Var.f14130b = this.f13990b;
                    g(e0Var, attributes);
                    j(e0Var, attributes);
                    f(e0Var, attributes);
                    m(e0Var, attributes);
                    for (int i17 = 0; i17 < attributes.getLength(); i17++) {
                        String strTrim8 = attributes.getValue(i17).trim();
                        int iD5 = oi.k.d(attributes, i17);
                        if (iD5 != 41) {
                            if (iD5 == 50) {
                                e0Var.f13969q = s(strTrim8);
                            } else if (iD5 != 51) {
                                switch (iD5) {
                                    case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                                        c0 c0VarS8 = s(strTrim8);
                                        e0Var.f13972t = c0VarS8;
                                        if (c0VarS8.f()) {
                                            throw new SVGParseException("Invalid <marker> element. markerHeight cannot be negative");
                                        }
                                        continue;
                                        break;
                                    case 33:
                                        if (!"strokeWidth".equals(strTrim8)) {
                                            if (!"userSpaceOnUse".equals(strTrim8)) {
                                                throw new SVGParseException("Invalid value for attribute markerUnits");
                                            }
                                            e0Var.f13968p = true;
                                        } else {
                                            e0Var.f13968p = false;
                                            continue;
                                        }
                                        break;
                                    case 34:
                                        c0 c0VarS9 = s(strTrim8);
                                        e0Var.f13971s = c0VarS9;
                                        if (c0VarS9.f()) {
                                            throw new SVGParseException("Invalid <marker> element. markerWidth cannot be negative");
                                        }
                                        break;
                                }
                            } else {
                                e0Var.f13970r = s(strTrim8);
                            }
                        } else if ("auto".equals(strTrim8)) {
                            e0Var.f13973u = Float.valueOf(Float.NaN);
                        } else {
                            e0Var.f13973u = Float.valueOf(p(strTrim8));
                        }
                    }
                    this.f13990b.m(e0Var);
                    this.f13990b = e0Var;
                    return;
                case 12:
                    if (this.f13990b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    f0 f0Var = new f0();
                    f0Var.f14129a = this.f13989a;
                    f0Var.f14130b = this.f13990b;
                    g(f0Var, attributes);
                    j(f0Var, attributes);
                    f(f0Var, attributes);
                    for (int i18 = 0; i18 < attributes.getLength(); i18++) {
                        String strTrim9 = attributes.getValue(i18).trim();
                        int iD6 = oi.k.d(attributes, i18);
                        if (iD6 == 25) {
                            c0 c0VarS10 = s(strTrim9);
                            f0Var.f13982q = c0VarS10;
                            if (c0VarS10.f()) {
                                throw new SVGParseException("Invalid <mask> element. height cannot be negative");
                            }
                        } else if (iD6 != 36) {
                            if (iD6 != 37) {
                                switch (iD6) {
                                    case 81:
                                        c0 c0VarS11 = s(strTrim9);
                                        f0Var.f13981p = c0VarS11;
                                        if (c0VarS11.f()) {
                                            throw new SVGParseException("Invalid <mask> element. width cannot be negative");
                                        }
                                        break;
                                        break;
                                    case 82:
                                        s(strTrim9);
                                        break;
                                    case 83:
                                        s(strTrim9);
                                        break;
                                }
                            } else if ("objectBoundingBox".equals(strTrim9)) {
                                f0Var.f13979n = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim9)) {
                                    throw new SVGParseException("Invalid value for attribute maskUnits");
                                }
                                f0Var.f13979n = Boolean.TRUE;
                            }
                        } else if ("objectBoundingBox".equals(strTrim9)) {
                            f0Var.f13980o = Boolean.FALSE;
                        } else {
                            if (!"userSpaceOnUse".equals(strTrim9)) {
                                throw new SVGParseException("Invalid value for attribute maskContentUnits");
                            }
                            f0Var.f13980o = Boolean.TRUE;
                        }
                    }
                    this.f13990b.m(f0Var);
                    this.f13990b = f0Var;
                    return;
                case 13:
                    C(attributes);
                    return;
                case 14:
                    if (this.f13990b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    k0 k0Var = new k0();
                    k0Var.f14129a = this.f13989a;
                    k0Var.f14130b = this.f13990b;
                    g(k0Var, attributes);
                    j(k0Var, attributes);
                    f(k0Var, attributes);
                    m(k0Var, attributes);
                    for (int i19 = 0; i19 < attributes.getLength(); i19++) {
                        String strTrim10 = attributes.getValue(i19).trim();
                        int iD7 = oi.k.d(attributes, i19);
                        if (iD7 == 25) {
                            c0 c0VarS12 = s(strTrim10);
                            k0Var.f14009v = c0VarS12;
                            if (c0VarS12.f()) {
                                throw new SVGParseException("Invalid <pattern> element. height cannot be negative");
                            }
                        } else if (iD7 != 26) {
                            switch (iD7) {
                                case 44:
                                    if (!"objectBoundingBox".equals(strTrim10)) {
                                        if (!"userSpaceOnUse".equals(strTrim10)) {
                                            throw new SVGParseException("Invalid value for attribute patternContentUnits");
                                        }
                                        k0Var.f14004q = Boolean.TRUE;
                                    } else {
                                        k0Var.f14004q = Boolean.FALSE;
                                    }
                                    break;
                                case 45:
                                    k0Var.f14005r = z(strTrim10);
                                    break;
                                case 46:
                                    if (!"objectBoundingBox".equals(strTrim10)) {
                                        if (!"userSpaceOnUse".equals(strTrim10)) {
                                            throw new SVGParseException("Invalid value for attribute patternUnits");
                                        }
                                        k0Var.f14003p = Boolean.TRUE;
                                    } else {
                                        k0Var.f14003p = Boolean.FALSE;
                                    }
                                    break;
                                default:
                                    switch (iD7) {
                                        case 81:
                                            c0 c0VarS13 = s(strTrim10);
                                            k0Var.f14008u = c0VarS13;
                                            if (c0VarS13.f()) {
                                                throw new SVGParseException("Invalid <pattern> element. width cannot be negative");
                                            }
                                            break;
                                            break;
                                        case 82:
                                            k0Var.f14006s = s(strTrim10);
                                            break;
                                        case 83:
                                            k0Var.f14007t = s(strTrim10);
                                            break;
                                    }
                                    break;
                            }
                        } else if (RuntimeVersion.SUFFIX.equals(attributes.getURI(i19)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i19))) {
                            k0Var.f14010w = strTrim10;
                        }
                    }
                    this.f13990b.m(k0Var);
                    this.f13990b = k0Var;
                    return;
                case 15:
                    u0 u0Var5 = this.f13990b;
                    if (u0Var5 == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    m0 m0Var = new m0();
                    m0Var.f14129a = this.f13989a;
                    m0Var.f14130b = u0Var5;
                    g(m0Var, attributes);
                    j(m0Var, attributes);
                    l(m0Var, attributes);
                    f(m0Var, attributes);
                    i(m0Var, attributes, "polygon");
                    this.f13990b.m(m0Var);
                    return;
                case 16:
                    u0 u0Var6 = this.f13990b;
                    if (u0Var6 == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    l0 l0Var = new l0();
                    l0Var.f14129a = this.f13989a;
                    l0Var.f14130b = u0Var6;
                    g(l0Var, attributes);
                    j(l0Var, attributes);
                    l(l0Var, attributes);
                    f(l0Var, attributes);
                    i(l0Var, attributes, "polyline");
                    this.f13990b.m(l0Var);
                    return;
                case 17:
                    if (this.f13990b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    b1 b1Var = new b1();
                    b1Var.f14129a = this.f13989a;
                    b1Var.f14130b = this.f13990b;
                    g(b1Var, attributes);
                    j(b1Var, attributes);
                    h(b1Var, attributes);
                    for (int i20 = 0; i20 < attributes.getLength(); i20++) {
                        String strTrim11 = attributes.getValue(i20).trim();
                        int iD8 = oi.k.d(attributes, i20);
                        if (iD8 == 6) {
                            b1Var.m = s(strTrim11);
                        } else if (iD8 == 7) {
                            b1Var.f13957n = s(strTrim11);
                        } else if (iD8 == 11) {
                            b1Var.f13959p = s(strTrim11);
                        } else if (iD8 == 12) {
                            b1Var.f13960q = s(strTrim11);
                        } else if (iD8 != 49) {
                            continue;
                        } else {
                            c0 c0VarS14 = s(strTrim11);
                            b1Var.f13958o = c0VarS14;
                            if (c0VarS14.f()) {
                                throw new SVGParseException("Invalid <radialGradient> element. r cannot be negative");
                            }
                        }
                    }
                    this.f13990b.m(b1Var);
                    this.f13990b = b1Var;
                    return;
                case TYPE_SINT64_VALUE:
                    u0 u0Var7 = this.f13990b;
                    if (u0Var7 == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    n0 n0Var = new n0();
                    n0Var.f14129a = this.f13989a;
                    n0Var.f14130b = u0Var7;
                    g(n0Var, attributes);
                    j(n0Var, attributes);
                    l(n0Var, attributes);
                    f(n0Var, attributes);
                    for (int i21 = 0; i21 < attributes.getLength(); i21++) {
                        String strTrim12 = attributes.getValue(i21).trim();
                        int iD9 = oi.k.d(attributes, i21);
                        if (iD9 == 25) {
                            c0 c0VarS15 = s(strTrim12);
                            n0Var.f14032r = c0VarS15;
                            if (c0VarS15.f()) {
                                throw new SVGParseException("Invalid <rect> element. height cannot be negative");
                            }
                        } else if (iD9 == 56) {
                            c0 c0VarS16 = s(strTrim12);
                            n0Var.f14033s = c0VarS16;
                            if (c0VarS16.f()) {
                                throw new SVGParseException("Invalid <rect> element. rx cannot be negative");
                            }
                        } else if (iD9 != 57) {
                            switch (iD9) {
                                case 81:
                                    c0 c0VarS17 = s(strTrim12);
                                    n0Var.f14031q = c0VarS17;
                                    if (c0VarS17.f()) {
                                        throw new SVGParseException("Invalid <rect> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    n0Var.f14029o = s(strTrim12);
                                    break;
                                case 83:
                                    n0Var.f14030p = s(strTrim12);
                                    break;
                            }
                        } else {
                            c0 c0VarS18 = s(strTrim12);
                            n0Var.f14034t = c0VarS18;
                            if (c0VarS18.f()) {
                                throw new SVGParseException("Invalid <rect> element. ry cannot be negative");
                            }
                        }
                    }
                    this.f13990b.m(n0Var);
                    return;
                case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                    u0 u0Var8 = this.f13990b;
                    if (u0Var8 == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    o0 o0Var = new o0();
                    o0Var.f14129a = this.f13989a;
                    o0Var.f14130b = u0Var8;
                    g(o0Var, attributes);
                    j(o0Var, attributes);
                    this.f13990b.m(o0Var);
                    this.f13990b = o0Var;
                    return;
                case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                    u0 u0Var9 = this.f13990b;
                    if (u0Var9 == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    if (!(u0Var9 instanceof x)) {
                        throw new SVGParseException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                    }
                    p0 p0Var = new p0();
                    p0Var.f14129a = this.f13989a;
                    p0Var.f14130b = u0Var9;
                    g(p0Var, attributes);
                    j(p0Var, attributes);
                    for (int i22 = 0; i22 < attributes.getLength(); i22++) {
                        String strTrim13 = attributes.getValue(i22).trim();
                        if (oi.k.d(attributes, i22) == 39) {
                            if (strTrim13.length() == 0) {
                                throw new SVGParseException("Invalid offset value in <stop> (empty string)");
                            }
                            int length = strTrim13.length();
                            if (strTrim13.charAt(strTrim13.length() - 1) == '%') {
                                length--;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            try {
                                float fO = o(length, strTrim13);
                                float f3 = 100.0f;
                                if (z10) {
                                    fO /= 100.0f;
                                }
                                if (fO < 0.0f) {
                                    f3 = 0.0f;
                                } else if (fO <= 100.0f) {
                                    f3 = fO;
                                }
                                p0Var.f14043h = Float.valueOf(f3);
                            } catch (NumberFormatException e3) {
                                throw new SVGParseException("Invalid offset value in <stop>: ".concat(strTrim13), e3);
                            }
                        }
                    }
                    this.f13990b.m(p0Var);
                    this.f13990b = p0Var;
                    return;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                    if (this.f13990b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    String str4 = "all";
                    boolean zEquals = true;
                    for (int i23 = 0; i23 < attributes.getLength(); i23++) {
                        String strTrim14 = attributes.getValue(i23).trim();
                        int iD10 = oi.k.d(attributes, i23);
                        if (iD10 == 38) {
                            str4 = strTrim14;
                        } else if (iD10 == 77) {
                            zEquals = strTrim14.equals("text/css");
                        }
                    }
                    if (zEquals) {
                        c cVar = new c(str4);
                        cVar.c0();
                        for (d dVar : c7.g.f(cVar)) {
                            if (dVar == d.A || dVar == d.B) {
                                this.f13996h = true;
                                return;
                            }
                        }
                    }
                    this.f13991c = true;
                    this.f13992d = 1;
                    return;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                    if (this.f13990b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    d1 d1Var = new d1();
                    d1Var.f14129a = this.f13989a;
                    d1Var.f14130b = this.f13990b;
                    g(d1Var, attributes);
                    j(d1Var, attributes);
                    l(d1Var, attributes);
                    f(d1Var, attributes);
                    this.f13990b.m(d1Var);
                    this.f13990b = d1Var;
                    return;
                case 23:
                    if (this.f13990b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    e1 e1Var = new e1();
                    e1Var.f14129a = this.f13989a;
                    e1Var.f14130b = this.f13990b;
                    g(e1Var, attributes);
                    j(e1Var, attributes);
                    f(e1Var, attributes);
                    m(e1Var, attributes);
                    this.f13990b.m(e1Var);
                    this.f13990b = e1Var;
                    return;
                case 24:
                    if (this.f13990b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    h1 h1Var = new h1();
                    h1Var.f14129a = this.f13989a;
                    h1Var.f14130b = this.f13990b;
                    g(h1Var, attributes);
                    j(h1Var, attributes);
                    l(h1Var, attributes);
                    f(h1Var, attributes);
                    k(h1Var, attributes);
                    this.f13990b.m(h1Var);
                    this.f13990b = h1Var;
                    return;
                case 25:
                    if (this.f13990b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    k1 k1Var = new k1();
                    k1Var.f14129a = this.f13989a;
                    k1Var.f14130b = this.f13990b;
                    g(k1Var, attributes);
                    j(k1Var, attributes);
                    f(k1Var, attributes);
                    for (int i24 = 0; i24 < attributes.getLength(); i24++) {
                        String strTrim15 = attributes.getValue(i24).trim();
                        int iD11 = oi.k.d(attributes, i24);
                        if (iD11 != 26) {
                            if (iD11 == 61) {
                                k1Var.f14012o = s(strTrim15);
                            }
                        } else if (RuntimeVersion.SUFFIX.equals(attributes.getURI(i24)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i24))) {
                            k1Var.f14011n = strTrim15;
                        }
                    }
                    this.f13990b.m(k1Var);
                    this.f13990b = k1Var;
                    u0 u0Var10 = k1Var.f14130b;
                    if (u0Var10 instanceof h1) {
                        k1Var.f14013p = (h1) u0Var10;
                        return;
                    } else {
                        k1Var.f14013p = ((i1) u0Var10).d();
                        return;
                    }
                case 27:
                    u0 u0Var11 = this.f13990b;
                    if (u0Var11 == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    if (!(u0Var11 instanceof j1)) {
                        throw new SVGParseException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                    }
                    f1 f1Var = new f1();
                    f1Var.f14129a = this.f13989a;
                    f1Var.f14130b = this.f13990b;
                    g(f1Var, attributes);
                    j(f1Var, attributes);
                    f(f1Var, attributes);
                    for (int i25 = 0; i25 < attributes.getLength(); i25++) {
                        String strTrim16 = attributes.getValue(i25).trim();
                        if (oi.k.d(attributes, i25) == 26 && (RuntimeVersion.SUFFIX.equals(attributes.getURI(i25)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i25)))) {
                            f1Var.f13983n = strTrim16;
                        }
                    }
                    this.f13990b.m(f1Var);
                    u0 u0Var12 = f1Var.f14130b;
                    if (u0Var12 instanceof h1) {
                        f1Var.f13984o = (h1) u0Var12;
                        return;
                    } else {
                        f1Var.f13984o = ((i1) u0Var12).d();
                        return;
                    }
                case 28:
                    u0 u0Var13 = this.f13990b;
                    if (u0Var13 == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    if (!(u0Var13 instanceof j1)) {
                        throw new SVGParseException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                    }
                    g1 g1Var = new g1();
                    g1Var.f14129a = this.f13989a;
                    g1Var.f14130b = this.f13990b;
                    g(g1Var, attributes);
                    j(g1Var, attributes);
                    f(g1Var, attributes);
                    k(g1Var, attributes);
                    this.f13990b.m(g1Var);
                    this.f13990b = g1Var;
                    u0 u0Var14 = g1Var.f14130b;
                    if (u0Var14 instanceof h1) {
                        g1Var.f13986r = (h1) u0Var14;
                        return;
                    } else {
                        g1Var.f13986r = ((i1) u0Var14).d();
                        return;
                    }
                case 29:
                    if (this.f13990b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    n1 n1Var = new n1();
                    n1Var.f14129a = this.f13989a;
                    n1Var.f14130b = this.f13990b;
                    g(n1Var, attributes);
                    j(n1Var, attributes);
                    l(n1Var, attributes);
                    f(n1Var, attributes);
                    for (int i26 = 0; i26 < attributes.getLength(); i26++) {
                        String strTrim17 = attributes.getValue(i26).trim();
                        int iD12 = oi.k.d(attributes, i26);
                        if (iD12 == 25) {
                            c0 c0VarS19 = s(strTrim17);
                            n1Var.f14039s = c0VarS19;
                            if (c0VarS19.f()) {
                                throw new SVGParseException("Invalid <use> element. height cannot be negative");
                            }
                        } else if (iD12 != 26) {
                            switch (iD12) {
                                case 81:
                                    c0 c0VarS20 = s(strTrim17);
                                    n1Var.f14038r = c0VarS20;
                                    if (c0VarS20.f()) {
                                        throw new SVGParseException("Invalid <use> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    n1Var.f14036p = s(strTrim17);
                                    break;
                                case 83:
                                    n1Var.f14037q = s(strTrim17);
                                    break;
                            }
                        } else if (RuntimeVersion.SUFFIX.equals(attributes.getURI(i26)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i26))) {
                            n1Var.f14035o = strTrim17;
                        }
                    }
                    this.f13990b.m(n1Var);
                    this.f13990b = n1Var;
                    return;
                case 30:
                    if (this.f13990b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    o1 o1Var = new o1();
                    o1Var.f14129a = this.f13989a;
                    o1Var.f14130b = this.f13990b;
                    g(o1Var, attributes);
                    f(o1Var, attributes);
                    m(o1Var, attributes);
                    this.f13990b.m(o1Var);
                    this.f13990b = o1Var;
                    return;
                default:
                    this.f13991c = true;
                    this.f13992d = 1;
                    return;
            }
        }
    }

    public final void G(String str) {
        if (this.f13991c) {
            return;
        }
        if (this.f13993e) {
            if (this.f13995g == null) {
                this.f13995g = new StringBuilder(str.length());
            }
            this.f13995g.append(str);
        } else if (this.f13996h) {
            if (this.f13997i == null) {
                this.f13997i = new StringBuilder(str.length());
            }
            this.f13997i.append(str);
        } else if (this.f13990b instanceof j1) {
            a(str);
        }
    }

    public final void H(char[] cArr, int i10, int i11) {
        if (this.f13991c) {
            return;
        }
        if (this.f13993e) {
            if (this.f13995g == null) {
                this.f13995g = new StringBuilder(i11);
            }
            this.f13995g.append(cArr, i10, i11);
        } else if (this.f13996h) {
            if (this.f13997i == null) {
                this.f13997i = new StringBuilder(i11);
            }
            this.f13997i.append(cArr, i10, i11);
        } else if (this.f13990b instanceof j1) {
            a(new String(cArr, i10, i11));
        }
    }

    public final void a(String str) {
        t0 t0Var = (t0) this.f13990b;
        int size = t0Var.f14085i.size();
        y0 y0Var = size == 0 ? null : (y0) t0Var.f14085i.get(size - 1);
        if (y0Var instanceof m1) {
            m1 m1Var = (m1) y0Var;
            m1Var.f14024c = x5.n(new StringBuilder(), m1Var.f14024c, str);
        } else {
            u0 u0Var = this.f13990b;
            m1 m1Var2 = new m1();
            m1Var2.f14024c = str;
            u0Var.m(m1Var2);
        }
    }

    public final void c(String str, String str2, String str3) {
        if (this.f13991c) {
            int i10 = this.f13992d - 1;
            this.f13992d = i10;
            if (i10 == 0) {
                this.f13991c = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || RuntimeVersion.SUFFIX.equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            f2 f2Var = (f2) f2.E.get(str2);
            if (f2Var == null) {
                f2Var = f2.D;
            }
            switch (f2Var.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case 17:
                case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                    this.f13990b = ((y0) this.f13990b).f14130b;
                    break;
                case 5:
                case RuntimeVersion.MINOR:
                    this.f13993e = false;
                    if (this.f13995g != null) {
                        f2 f2Var2 = this.f13994f;
                        if (f2Var2 == f2.C || f2Var2 == f2.A) {
                            this.f13989a.getClass();
                        }
                        this.f13995g.setLength(0);
                    }
                    break;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                    StringBuilder sb2 = this.f13997i;
                    if (sb2 != null) {
                        this.f13996h = false;
                        String string = sb2.toString();
                        c7.g gVar = new c7.g(1);
                        p1 p1Var = this.f13989a;
                        c cVar = new c(string);
                        cVar.c0();
                        ((db.g) p1Var.C).d(gVar.h(cVar));
                        this.f13997i.setLength(0);
                    }
                    break;
            }
        }
    }
}

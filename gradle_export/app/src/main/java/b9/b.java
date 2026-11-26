package b9;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.protobuf.RuntimeVersion;
import e7.h;
import e7.i0;
import e7.u;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ta.c0;
import x8.j;
import x8.k;

public final class b implements k {
    public static final Pattern G = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean A;
    public final a B;
    public LinkedHashMap D;
    public float E = -3.4028235E38f;
    public float F = -3.4028235E38f;
    public final u C = new u();

    public b(List list) {
        if (list == null || list.isEmpty()) {
            this.A = false;
            this.B = null;
            return;
        }
        this.A = true;
        byte[] bArr = (byte[]) list.get(0);
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArr, charset);
        c0.s(str.startsWith("Format:"));
        a aVarA = a.a(str);
        aVarA.getClass();
        this.B = aVarA;
        b(new u((byte[]) list.get(1)), charset);
    }

    public static int a(long j9, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j9) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j9) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i10, Long.valueOf(j9));
        arrayList2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i10 - 1)));
        return i10;
    }

    public static long c(String str) {
        Matcher matcher = G.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = i0.f5136a;
        return (Long.parseLong(matcher.group(4)) * NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    @Override
    public final void D(byte[] bArr, int i10, int i11, j jVar, h hVar) {
        Charset charset;
        u uVar;
        long j9;
        int i12;
        int i13;
        float f3;
        int i14;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i15;
        int i16;
        int i17;
        float f10;
        float f11;
        float f12;
        int i18;
        int i19;
        float f13;
        int i20;
        int i21;
        float f14;
        int i22;
        int iA;
        int i23;
        b bVar = this;
        long j10 = jVar.f16492a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        u uVar2 = bVar.C;
        uVar2.L(i10 + i11, bArr);
        uVar2.N(i10);
        Charset charsetJ = uVar2.J();
        if (charsetJ == null) {
            charsetJ = StandardCharsets.UTF_8;
        }
        boolean z10 = bVar.A;
        if (!z10) {
            bVar.b(uVar2, charsetJ);
        }
        a aVarA = z10 ? bVar.B : null;
        while (true) {
            String strN = uVar2.n(charsetJ);
            if (strN == null) {
                long j11 = j10;
                ArrayList arrayList3 = (j11 == -9223372036854775807L || !jVar.f16493b) ? null : new ArrayList();
                for (int i24 = 0; i24 < arrayList.size(); i24++) {
                    List list = (List) arrayList.get(i24);
                    if (!list.isEmpty() || i24 == 0) {
                        if (i24 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i24)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i24 + 1)).longValue();
                        x8.a aVar = new x8.a(jLongValue, jLongValue2 - jLongValue, list);
                        if (j11 == -9223372036854775807L || jLongValue2 >= j11) {
                            hVar.accept(aVar);
                        } else if (arrayList3 != null) {
                            arrayList3.add(aVar);
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        hVar.accept((x8.a) it.next());
                    }
                    return;
                }
                return;
            }
            if (strN.startsWith("Format:")) {
                aVarA = a.a(strN);
            } else {
                if (strN.startsWith("Dialogue:")) {
                    if (aVarA == null) {
                        e7.a.m("SsaParser", "Skipping dialogue line before complete format: ".concat(strN));
                    } else {
                        int i25 = aVarA.f2204f;
                        c0.s(strN.startsWith("Dialogue:"));
                        String strSubstring = strN.substring(9);
                        int i26 = aVarA.f2199a;
                        String[] strArrSplit = strSubstring.split(",", i25);
                        if (strArrSplit.length != i25) {
                            e7.a.m("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strN));
                        } else {
                            if (i26 != -1) {
                                try {
                                    i12 = Integer.parseInt(strArrSplit[i26].trim());
                                } catch (RuntimeException unused) {
                                    e7.a.m("SsaParser", "Fail to parse layer: " + strArrSplit[i26]);
                                    i12 = 0;
                                }
                            } else {
                                i12 = 0;
                            }
                            long jC = c(strArrSplit[aVarA.f2200b]);
                            charset = charsetJ;
                            if (jC == -9223372036854775807L) {
                                e7.a.m("SsaParser", "Skipping invalid timing: ".concat(strN));
                                j9 = j10;
                                uVar = uVar2;
                            } else {
                                j9 = j10;
                                long jC2 = c(strArrSplit[aVarA.f2201c]);
                                if (jC2 == -9223372036854775807L || jC2 <= jC) {
                                    uVar = uVar2;
                                    e7.a.m("SsaParser", "Skipping invalid timing: ".concat(strN));
                                } else {
                                    LinkedHashMap linkedHashMap = bVar.D;
                                    e eVar = (linkedHashMap == null || (i23 = aVarA.f2202d) == -1) ? null : (e) linkedHashMap.get(strArrSplit[i23].trim());
                                    String str = strArrSplit[aVarA.f2203e];
                                    Matcher matcher = d.f2216a.matcher(str);
                                    PointF pointF = null;
                                    int i27 = -1;
                                    while (matcher.find()) {
                                        u uVar3 = uVar2;
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        try {
                                            PointF pointFA = d.a(strGroup);
                                            if (pointFA != null) {
                                                pointF = pointFA;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        try {
                                            Matcher matcher2 = d.f2219d.matcher(strGroup);
                                            if (matcher2.find()) {
                                                String strGroup2 = matcher2.group(1);
                                                strGroup2.getClass();
                                                iA = e.a(strGroup2);
                                            } else {
                                                iA = -1;
                                            }
                                            if (iA != -1) {
                                                i27 = iA;
                                            }
                                        } catch (RuntimeException unused3) {
                                        }
                                        uVar2 = uVar3;
                                    }
                                    uVar = uVar2;
                                    String strReplace = d.f2216a.matcher(str).replaceAll(RuntimeVersion.SUFFIX).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f15 = bVar.E;
                                    float f16 = bVar.F;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    if (eVar != null) {
                                        boolean z11 = eVar.f2226g;
                                        Integer num = eVar.f2223d;
                                        Integer num2 = eVar.f2222c;
                                        if (num2 != null) {
                                            i18 = 33;
                                            i19 = 0;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            i18 = 33;
                                            i19 = 0;
                                        }
                                        if (eVar.f2229j == 3 && num != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i19, spannableString.length(), i18);
                                        }
                                        float f17 = eVar.f2224e;
                                        if (f17 == -3.4028235E38f || f16 == -3.4028235E38f) {
                                            f13 = -3.4028235E38f;
                                            i20 = Integer.MIN_VALUE;
                                        } else {
                                            f13 = f17 / f16;
                                            i20 = 1;
                                        }
                                        boolean z12 = eVar.f2225f;
                                        if (z12 && z11) {
                                            i21 = i20;
                                            f14 = f13;
                                            i22 = 33;
                                            i13 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i21 = i20;
                                            f14 = f13;
                                            i22 = 33;
                                            i13 = 0;
                                            if (z12) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z11 != 0) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (eVar.f2227h) {
                                            spannableString.setSpan(new UnderlineSpan(), i13, spannableString.length(), i22);
                                        }
                                        if (eVar.f2228i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i13, spannableString.length(), i22);
                                        }
                                        i14 = i21;
                                        f3 = f14;
                                    } else {
                                        f15 = f15;
                                        f16 = f16;
                                        i13 = 0;
                                        f3 = -3.4028235E38f;
                                        i14 = Integer.MIN_VALUE;
                                    }
                                    if (i27 == -1) {
                                        i27 = eVar != null ? eVar.f2221b : -1;
                                    }
                                    switch (i27) {
                                        case 0:
                                        default:
                                            a1.b.y("Unknown alignment: ", i27, "SsaParser");
                                        case -1:
                                            alignment2 = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            alignment2 = alignment;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            alignment2 = alignment;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            alignment2 = alignment;
                                            break;
                                    }
                                    int i28 = Integer.MIN_VALUE;
                                    switch (i27) {
                                        case 0:
                                        default:
                                            a1.b.y("Unknown alignment: ", i27, "SsaParser");
                                        case -1:
                                            i15 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i15 = i13;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i15 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i15 = 2;
                                            break;
                                    }
                                    switch (i27) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            a1.b.y("Unknown alignment: ", i27, "SsaParser");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i28 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i28 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i28 = i13;
                                            break;
                                    }
                                    if (pointF == null || f16 == -3.4028235E38f || f15 == -3.4028235E38f) {
                                        float f18 = 0.95f;
                                        if (i15 != 0) {
                                            i16 = 1;
                                            if (i15 != 1) {
                                                i17 = 2;
                                                f10 = i15 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i17 = 2;
                                                f10 = 0.5f;
                                            }
                                        } else {
                                            i16 = 1;
                                            i17 = 2;
                                            f10 = 0.05f;
                                        }
                                        if (i28 == 0) {
                                            f18 = 0.05f;
                                        } else if (i28 == i16) {
                                            f18 = 0.5f;
                                        } else if (i28 != i17) {
                                            f18 = -3.4028235E38f;
                                        }
                                        f11 = f18;
                                        f12 = f10;
                                    } else {
                                        f12 = pointF.x / f15;
                                        f11 = pointF.y / f16;
                                    }
                                    d7.b bVar2 = new d7.b(spannableString, alignment2, null, null, f11, i13, i28, f12, i15, i14, f3, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, i12);
                                    int iA2 = a(jC2, arrayList2, arrayList);
                                    for (int iA3 = a(jC, arrayList2, arrayList); iA3 < iA2; iA3++) {
                                        ((List) arrayList.get(iA3)).add(bVar2);
                                    }
                                }
                            }
                        }
                    }
                    charset = charsetJ;
                    j9 = j10;
                    uVar = uVar2;
                } else {
                    charset = charsetJ;
                    j9 = j10;
                    uVar = uVar2;
                }
                bVar = this;
                charsetJ = charset;
                j10 = j9;
                aVarA = aVarA;
                uVar2 = uVar;
            }
        }
    }

    public final void b(u uVar, Charset charset) {
        int i10;
        e eVar;
        while (true) {
            String strN = uVar.n(charset);
            if (strN == null) {
                return;
            }
            int i11 = 0;
            int i12 = 91;
            if ("[Script Info]".equalsIgnoreCase(strN)) {
                while (true) {
                    String strN2 = uVar.n(charset);
                    if (strN2 == null) {
                        break;
                    }
                    if (uVar.a() != 0) {
                        int iH = uVar.h(charset);
                        if ((iH != 0 ? bi.b.s(iH >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] strArrSplit = strN2.split(":");
                    if (strArrSplit.length == 2) {
                        String strI = w00.a.I(strArrSplit[0].trim());
                        strI.getClass();
                        if (strI.equals("playresx")) {
                            this.E = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strI.equals("playresy")) {
                            try {
                                this.F = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strN)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                c cVar = null;
                while (true) {
                    String strN3 = uVar.n(charset);
                    if (strN3 != null) {
                        if (uVar.a() != 0) {
                            int iH2 = uVar.h(charset);
                            if ((iH2 != 0 ? bi.b.s(iH2 >>> 8) : 1114112) == i12) {
                            }
                        }
                        int i13 = -1;
                        if (strN3.startsWith("Format:")) {
                            String[] strArrSplit2 = TextUtils.split(strN3.substring(7), ",");
                            int i14 = -1;
                            int i15 = -1;
                            int i16 = -1;
                            int i17 = -1;
                            int i18 = -1;
                            int i19 = -1;
                            int i20 = -1;
                            int i21 = -1;
                            int i22 = -1;
                            int i23 = -1;
                            for (int i24 = i11; i24 < strArrSplit2.length; i24++) {
                                String strI2 = w00.a.I(strArrSplit2[i24].trim());
                                strI2.getClass();
                                switch (strI2.hashCode()) {
                                    case -1178781136:
                                        i10 = strI2.equals("italic") ? i11 : -1;
                                        break;
                                    case -1026963764:
                                        i10 = strI2.equals("underline") ? 1 : -1;
                                        break;
                                    case -192095652:
                                        i10 = strI2.equals("strikeout") ? 2 : -1;
                                        break;
                                    case -70925746:
                                        i10 = strI2.equals("primarycolour") ? 3 : -1;
                                        break;
                                    case 3029637:
                                        i10 = strI2.equals("bold") ? 4 : -1;
                                        break;
                                    case 3373707:
                                        i10 = strI2.equals("name") ? 5 : -1;
                                        break;
                                    case 366554320:
                                        i10 = strI2.equals("fontsize") ? 6 : -1;
                                        break;
                                    case 767321349:
                                        i10 = strI2.equals("borderstyle") ? 7 : -1;
                                        break;
                                    case 1767875043:
                                        i10 = strI2.equals("alignment") ? 8 : -1;
                                        break;
                                    case 1988365454:
                                        i10 = strI2.equals("outlinecolour") ? 9 : -1;
                                        break;
                                    default:
                                        i10 = -1;
                                        break;
                                }
                                switch (i10) {
                                    case 0:
                                        i20 = i24;
                                        break;
                                    case 1:
                                        i21 = i24;
                                        break;
                                    case 2:
                                        i22 = i24;
                                        break;
                                    case 3:
                                        i16 = i24;
                                        break;
                                    case 4:
                                        i19 = i24;
                                        break;
                                    case 5:
                                        i14 = i24;
                                        break;
                                    case 6:
                                        i18 = i24;
                                        break;
                                    case 7:
                                        i23 = i24;
                                        break;
                                    case 8:
                                        i15 = i24;
                                        break;
                                    case 9:
                                        i17 = i24;
                                        break;
                                }
                            }
                            cVar = i14 != -1 ? new c(i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, strArrSplit2.length) : null;
                        } else {
                            if (strN3.startsWith("Style:")) {
                                if (cVar == null) {
                                    e7.a.m("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strN3));
                                } else {
                                    c0.s(strN3.startsWith("Style:"));
                                    String[] strArrSplit3 = TextUtils.split(strN3.substring(6), ",");
                                    int length = strArrSplit3.length;
                                    int i25 = cVar.f2215k;
                                    if (length != i25) {
                                        int length2 = strArrSplit3.length;
                                        String str = i0.f5136a;
                                        Locale locale = Locale.US;
                                        StringBuilder sbP = oi.k.p(i25, length2, "Skipping malformed 'Style:' line (expected ", " values, found ", "): '");
                                        sbP.append(strN3);
                                        sbP.append("'");
                                        e7.a.m("SsaStyle", sbP.toString());
                                    } else {
                                        try {
                                            String strTrim = strArrSplit3[cVar.f2205a].trim();
                                            int i26 = cVar.f2206b;
                                            int iA = i26 != -1 ? e.a(strArrSplit3[i26].trim()) : -1;
                                            int i27 = cVar.f2207c;
                                            Integer numC = i27 != -1 ? e.c(strArrSplit3[i27].trim()) : null;
                                            int i28 = cVar.f2208d;
                                            Integer numC2 = i28 != -1 ? e.c(strArrSplit3[i28].trim()) : null;
                                            int i29 = cVar.f2209e;
                                            float f3 = -3.4028235E38f;
                                            if (i29 != -1) {
                                                String strTrim2 = strArrSplit3[i29].trim();
                                                try {
                                                    f3 = Float.parseFloat(strTrim2);
                                                } catch (NumberFormatException e3) {
                                                    e7.a.n("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e3);
                                                }
                                            }
                                            float f10 = f3;
                                            int i30 = cVar.f2210f;
                                            boolean z10 = i30 != -1 && e.b(strArrSplit3[i30].trim());
                                            int i31 = cVar.f2211g;
                                            boolean z11 = i31 != -1 && e.b(strArrSplit3[i31].trim());
                                            int i32 = cVar.f2212h;
                                            boolean z12 = i32 != -1 && e.b(strArrSplit3[i32].trim());
                                            int i33 = cVar.f2213i;
                                            boolean z13 = i33 != -1 && e.b(strArrSplit3[i33].trim());
                                            int i34 = cVar.f2214j;
                                            if (i34 != -1) {
                                                String strTrim3 = strArrSplit3[i34].trim();
                                                try {
                                                    int i35 = Integer.parseInt(strTrim3.trim());
                                                    if (i35 == 1 || i35 == 3) {
                                                        i13 = i35;
                                                    } else {
                                                        e7.a.m("SsaStyle", "Ignoring unknown BorderStyle: " + strTrim3);
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                }
                                            }
                                            eVar = new e(strTrim, iA, numC, numC2, f10, z10, z11, z12, z13, i13);
                                        } catch (RuntimeException e10) {
                                            e7.a.n("SsaStyle", "Skipping malformed 'Style:' line: '" + strN3 + "'", e10);
                                            eVar = null;
                                        }
                                        if (eVar != null) {
                                            linkedHashMap.put(eVar.f2220a, eVar);
                                        }
                                    }
                                    eVar = null;
                                    if (eVar != null) {
                                        linkedHashMap.put(eVar.f2220a, eVar);
                                    }
                                }
                            }
                            i11 = 0;
                            i12 = 91;
                        }
                    }
                }
                this.D = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strN)) {
                e7.a.h("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strN)) {
                return;
            }
        }
    }

    @Override
    public final int p() {
        return 1;
    }
}

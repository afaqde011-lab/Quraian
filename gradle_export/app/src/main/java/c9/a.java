package c9;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.protobuf.RuntimeVersion;
import d7.b;
import e7.h;
import e7.u;
import fh.t0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import x8.j;
import x8.k;

public final class a implements k {
    public static final Pattern D = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern E = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder A = new StringBuilder();
    public final ArrayList B = new ArrayList();
    public final u C = new u();

    public static b a(Spanned spanned, String str) {
        int i10;
        int i11;
        float f3;
        if (str == null) {
            return new b(spanned, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                break;
            case -685620679:
                str.equals("{\\an2}");
                i10 = 1;
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                break;
            case -685620617:
                if (!str.equals("{\\an4}")) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                i10 = 1;
                break;
            case -685620555:
                if (!str.equals("{\\an6}")) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                i10 = 1;
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                break;
            default:
                i10 = 1;
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                break;
            case -685620679:
                if (!str.equals("{\\an2}")) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                break;
            case -685620617:
                str.equals("{\\an4}");
                i11 = 1;
                break;
            case -685620586:
                str.equals("{\\an5}");
                i11 = 1;
                break;
            case -685620555:
                str.equals("{\\an6}");
                i11 = 1;
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                break;
            case -685620493:
                if (!str.equals("{\\an8}")) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                break;
            default:
                i11 = 1;
                break;
        }
        float f10 = 0.08f;
        if (i10 == 0) {
            f3 = 0.08f;
        } else if (i10 == 1) {
            f3 = 0.5f;
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            f3 = 0.92f;
        }
        if (i11 != 0) {
            if (i11 == 1) {
                f10 = 0.5f;
            } else {
                if (i11 != 2) {
                    throw new IllegalArgumentException();
                }
                f10 = 0.92f;
            }
        }
        return new b(spanned, null, null, null, f10, 0, i11, f3, i10, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
    }

    public static long b(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j9 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i10 + 2);
        strGroup2.getClass();
        long j10 = (Long.parseLong(strGroup2) * 60000) + j9;
        String strGroup3 = matcher.group(i10 + 3);
        strGroup3.getClass();
        long j11 = (Long.parseLong(strGroup3) * 1000) + j10;
        String strGroup4 = matcher.group(i10 + 4);
        if (strGroup4 != null) {
            j11 += Long.parseLong(strGroup4);
        }
        return j11 * 1000;
    }

    @Override
    public final void D(byte[] bArr, int i10, int i11, j jVar, h hVar) {
        String str;
        a aVar = this;
        long j9 = jVar.f16492a;
        u uVar = aVar.C;
        uVar.L(i10 + i11, bArr);
        uVar.N(i10);
        Charset charsetJ = uVar.J();
        if (charsetJ == null) {
            charsetJ = StandardCharsets.UTF_8;
        }
        long j10 = -9223372036854775807L;
        ArrayList arrayList = (j9 == -9223372036854775807L || !jVar.f16493b) ? null : new ArrayList();
        while (true) {
            String strN = uVar.n(charsetJ);
            if (strN == null) {
                break;
            }
            if (!strN.isEmpty()) {
                try {
                    Integer.parseInt(strN);
                    String strN2 = uVar.n(charsetJ);
                    if (strN2 == null) {
                        e7.a.m("SubripParser", "Unexpected end");
                        break;
                    }
                    Matcher matcher = D.matcher(strN2);
                    if (matcher.matches()) {
                        long jB = b(matcher, 1);
                        long jB2 = b(matcher, 6);
                        StringBuilder sb2 = aVar.A;
                        long j11 = j10;
                        sb2.setLength(0);
                        ArrayList arrayList2 = aVar.B;
                        arrayList2.clear();
                        for (String strN3 = uVar.n(charsetJ); !TextUtils.isEmpty(strN3); strN3 = uVar.n(charsetJ)) {
                            if (sb2.length() > 0) {
                                sb2.append("<br>");
                            }
                            String strTrim = strN3.trim();
                            StringBuilder sb3 = new StringBuilder(strTrim);
                            Matcher matcher2 = E.matcher(strTrim);
                            int i12 = 0;
                            while (matcher2.find()) {
                                Matcher matcher3 = matcher2;
                                String strGroup = matcher3.group();
                                arrayList2.add(strGroup);
                                int iStart = matcher3.start() - i12;
                                int length = strGroup.length();
                                sb3.replace(iStart, iStart + length, RuntimeVersion.SUFFIX);
                                i12 += length;
                                matcher2 = matcher3;
                                j9 = j9;
                            }
                            sb2.append(sb3.toString());
                        }
                        long j12 = j9;
                        Spanned spannedFromHtml = Html.fromHtml(sb2.toString());
                        int i13 = 0;
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                str = null;
                                break;
                            }
                            str = (String) arrayList2.get(i13);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        if (j12 == j11 || jB2 >= j12) {
                            hVar.accept(new x8.a(jB, jB2 - jB, t0.s(a(spannedFromHtml, str))));
                        } else if (arrayList != null) {
                            arrayList.add(new x8.a(jB, jB2 - jB, t0.s(a(spannedFromHtml, str))));
                        }
                        aVar = this;
                        j10 = j11;
                        j9 = j12;
                    } else {
                        e7.a.m("SubripParser", "Skipping invalid timing: ".concat(strN2));
                        aVar = this;
                    }
                } catch (NumberFormatException unused) {
                    e7.a.m("SubripParser", "Skipping invalid index: ".concat(strN));
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hVar.accept((x8.a) it.next());
            }
        }
    }

    @Override
    public final int p() {
        return 1;
    }
}

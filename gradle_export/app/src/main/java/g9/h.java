package g9;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.protobuf.RuntimeVersion;
import e7.i0;
import e7.u;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ta.c0;

public abstract class h {

    public static final Pattern f6282a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");

    public static final Pattern f6283b = Pattern.compile("(\\S+?):(\\S+)");

    public static final Map f6284c;

    public static final Map f6285d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f6284c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f6285d = Collections.unmodifiableMap(map2);
    }

    public static void a(String str, e eVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i10;
        int i11;
        int i12;
        int i13 = eVar.f6268b;
        int length = spannableStringBuilder.length();
        String str2 = eVar.f6267a;
        str2.getClass();
        int i14 = -1;
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i13, length, 33);
                break;
            case "c":
                for (String str3 : eVar.f6270d) {
                    Map map = f6284c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i13, length, 33);
                    } else {
                        Map map2 = f6285d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i13, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i13, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i13, length, 33);
                break;
            case "v":
                spannableStringBuilder.setSpan(new d7.i(eVar.f6269c), i13, length, 33);
                break;
            case "ruby":
                int iC = c(list2, str, eVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, d.f6264c);
                int i15 = eVar.f6268b;
                int i16 = 0;
                int length2 = 0;
                while (i16 < arrayList.size()) {
                    if ("rt".equals(((d) arrayList.get(i16)).f6265a.f6267a)) {
                        d dVar = (d) arrayList.get(i16);
                        int iC2 = c(list2, str, dVar.f6265a);
                        if (iC2 == i14) {
                            iC2 = iC != i14 ? iC : 1;
                        }
                        int i17 = dVar.f6265a.f6268b - length2;
                        int i18 = dVar.f6266b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i17, i18);
                        spannableStringBuilder.delete(i17, i18);
                        spannableStringBuilder.setSpan(new d7.g(charSequenceSubSequence.toString(), iC2), i15, i17, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i15 = i17;
                    }
                    i16++;
                    i14 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListB = b(list2, str, eVar);
        for (int i19 = 0; i19 < arrayListB.size(); i19++) {
            b bVar = ((f) arrayListB.get(i19)).B;
            int i20 = bVar.l;
            if (i20 == -1 && bVar.m == -1) {
                i10 = -1;
            } else {
                i10 = (bVar.m == 1 ? (char) 2 : (char) 0) | (i20 == 1 ? (char) 1 : (char) 0);
            }
            if (i10 != -1) {
                int i21 = bVar.l;
                if (i21 == -1 && bVar.m == -1) {
                    i12 = -1;
                    i11 = 1;
                } else {
                    i11 = 1;
                    i12 = (i21 == 1 ? 1 : 0) | (bVar.m == 1 ? 2 : 0);
                }
                c7.i.l(spannableStringBuilder, new StyleSpan(i12), i13, length);
            } else {
                i11 = 1;
            }
            if (bVar.f6255j == i11) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i13, length, 33);
            }
            if (bVar.f6256k == i11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i13, length, 33);
            }
            if (bVar.f6252g) {
                if (!bVar.f6252g) {
                    throw new IllegalStateException("Font color not defined");
                }
                c7.i.l(spannableStringBuilder, new ForegroundColorSpan(bVar.f6251f), i13, length);
            }
            if (bVar.f6254i) {
                if (!bVar.f6254i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                c7.i.l(spannableStringBuilder, new BackgroundColorSpan(bVar.f6253h), i13, length);
            }
            if (bVar.f6250e != null) {
                c7.i.l(spannableStringBuilder, new TypefaceSpan(bVar.f6250e), i13, length);
            }
            int i22 = bVar.f6257n;
            if (i22 == 1) {
                c7.i.l(spannableStringBuilder, new AbsoluteSizeSpan((int) bVar.f6258o, true), i13, length);
            } else if (i22 == 2) {
                c7.i.l(spannableStringBuilder, new RelativeSizeSpan(bVar.f6258o), i13, length);
            } else if (i22 == 3) {
                c7.i.l(spannableStringBuilder, new RelativeSizeSpan(bVar.f6258o / 100.0f), i13, length);
            }
            if (bVar.f6260q) {
                spannableStringBuilder.setSpan(new d7.e(), i13, length, 33);
            }
        }
    }

    public static ArrayList b(List list, String str, e eVar) {
        ?? size;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            b bVar = (b) list.get(i10);
            String str2 = eVar.f6267a;
            Set set = eVar.f6270d;
            String str3 = eVar.f6269c;
            if (bVar.f6246a.isEmpty() && bVar.f6247b.isEmpty() && bVar.f6248c.isEmpty() && bVar.f6249d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int iA = b.a(b.a(b.a(0, 1073741824, bVar.f6246a, str), 2, bVar.f6247b, str2), 4, bVar.f6249d, str3);
                size = (iA == -1 || !set.containsAll(bVar.f6248c)) ? 0 : iA + (bVar.f6248c.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new f(size, bVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, e eVar) {
        ArrayList arrayListB = b(list, str, eVar);
        for (int i10 = 0; i10 < arrayListB.size(); i10++) {
            int i11 = ((f) arrayListB.get(i10)).B.f6259p;
            if (i11 != -1) {
                return i11;
            }
        }
        return -1;
    }

    public static c d(String str, Matcher matcher, u uVar, ArrayList arrayList) {
        g gVar = new g();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            gVar.f6271a = i.b(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            gVar.f6272b = i.b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, gVar);
            StringBuilder sb2 = new StringBuilder();
            uVar.getClass();
            String strN = uVar.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strN)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strN.trim());
                strN = uVar.n(StandardCharsets.UTF_8);
            }
            gVar.f6273c = f(str, sb2.toString(), arrayList);
            return new c(gVar.a().a(), gVar.f6271a, gVar.f6272b);
        } catch (IllegalArgumentException unused) {
            e7.a.m("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static void e(String str, g gVar) {
        int i10;
        int i11;
        int i12;
        Matcher matcher = f6283b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    g(strGroup2, gVar);
                } else {
                    if ("align".equals(strGroup)) {
                        switch (strGroup2) {
                            case "center":
                            case "middle":
                                i10 = 2;
                                break;
                            case "end":
                                i10 = 3;
                                break;
                            case "left":
                                i10 = 4;
                                break;
                            case "right":
                                i10 = 5;
                                break;
                            case "start":
                                i10 = 1;
                                break;
                            default:
                                e7.a.m("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i10 = 2;
                                break;
                        }
                        gVar.f6274d = i10;
                    } else if ("position".equals(strGroup)) {
                        int iIndexOf = strGroup2.indexOf(44);
                        if (iIndexOf != -1) {
                            String strSubstring = strGroup2.substring(iIndexOf + 1);
                            strSubstring.getClass();
                            switch (strSubstring) {
                                case "line-left":
                                case "start":
                                    i11 = 0;
                                    break;
                                case "center":
                                case "middle":
                                    i11 = 1;
                                    break;
                                case "line-right":
                                case "end":
                                    i11 = 2;
                                    break;
                                default:
                                    e7.a.m("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                    i11 = Integer.MIN_VALUE;
                                    break;
                            }
                            gVar.f6279i = i11;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        gVar.f6278h = i.a(strGroup2);
                    } else if ("size".equals(strGroup)) {
                        gVar.f6280j = i.a(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i12 = 2;
                        } else if (strGroup2.equals("rl")) {
                            i12 = 1;
                        } else {
                            e7.a.m("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i12 = Integer.MIN_VALUE;
                        }
                        gVar.f6281k = i12;
                    } else {
                        e7.a.m("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                    }
                }
            } catch (NumberFormatException unused) {
                e7.a.m("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static SpannedString f(String str, String str2, List list) {
        char c10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            int length = str2.length();
            String strTrim = RuntimeVersion.SUFFIX;
            if (i10 >= length) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (e) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new e(RuntimeVersion.SUFFIX, 0, RuntimeVersion.SUFFIX, Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i10);
            if (cCharAt == '&') {
                i10++;
                int iIndexOf = str2.indexOf(59, i10);
                int iIndexOf2 = str2.indexOf(32, i10);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i10, iIndexOf);
                    strSubstring.getClass();
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            e7.a.m("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i10++;
            } else {
                int length2 = i10 + 1;
                if (length2 < str2.length()) {
                    boolean z10 = str2.charAt(length2) == '/';
                    int iIndexOf3 = str2.indexOf(62, length2);
                    length2 = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i11 = length2 - 2;
                    boolean z11 = str2.charAt(i11) == '/';
                    int i12 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i11 = length2 - 1;
                    }
                    String strSubstring2 = str2.substring(i12, i11);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        c0.s(!strTrim2.isEmpty());
                        String str3 = i0.f5136a;
                        String str4 = strTrim2.split("[ \\.]", 2)[0];
                        str4.getClass();
                        switch (str4) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                if (!z10) {
                                    if (!z11) {
                                        int length3 = spannableStringBuilder.length();
                                        String strTrim3 = strSubstring2.trim();
                                        c0.s(!strTrim3.isEmpty());
                                        int iIndexOf4 = strTrim3.indexOf(" ");
                                        if (iIndexOf4 == -1) {
                                            c10 = 0;
                                        } else {
                                            strTrim = strTrim3.substring(iIndexOf4).trim();
                                            c10 = 0;
                                            strTrim3 = strTrim3.substring(0, iIndexOf4);
                                        }
                                        String[] strArrSplit = strTrim3.split("\\.", -1);
                                        String str5 = strArrSplit[c10];
                                        HashSet hashSet = new HashSet();
                                        for (int i13 = 1; i13 < strArrSplit.length; i13++) {
                                            hashSet.add(strArrSplit[i13]);
                                        }
                                        arrayDeque.push(new e(str5, length3, strTrim, hashSet));
                                    }
                                    break;
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        e eVar = (e) arrayDeque.pop();
                                        a(str, eVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new d(eVar, spannableStringBuilder.length()));
                                        }
                                        if (eVar.f6267a.equals(str4)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                }
                i10 = length2;
            }
        }
    }

    public static void g(String str, g gVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            int i10 = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i10 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i10 = 0;
                    break;
                default:
                    e7.a.m("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            gVar.f6277g = i10;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            gVar.f6275e = i.a(str);
            gVar.f6276f = 0;
        } else {
            gVar.f6275e = Integer.parseInt(str);
            gVar.f6276f = 1;
        }
    }
}

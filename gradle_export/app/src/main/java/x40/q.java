package x40;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class q {
    public static final char[] k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final List g;
    public final String h;
    public final String i;
    public final boolean j;

    public q(String scheme, String str, String str2, String host, int i, ArrayList arrayList, ArrayList arrayList2, String str3, String str4) {
        kotlin.jvm.internal.m.e(scheme, "scheme");
        kotlin.jvm.internal.m.e(host, "host");
        this.a = scheme;
        this.b = str;
        this.c = str2;
        this.d = host;
        this.e = i;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str3;
        this.i = str4;
        this.j = scheme.equals("https");
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        String strSubstring = str.substring(r30.k.I0(str, ':', length, 4) + 1, r30.k.I0(str, '@', 0, 6));
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iI0 = r30.k.I0(str, '/', length, 4);
        String strSubstring = str.substring(iI0, y40.b.f(iI0, str.length(), str, "?#"));
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iI0 = r30.k.I0(str, '/', length, 4);
        int iF = y40.b.f(iI0, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iI0 < iF) {
            int i = iI0 + 1;
            int iG = y40.b.g(str, '/', i, iF);
            String strSubstring = str.substring(i, iG);
            kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iI0 = iG;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int iI0 = r30.k.I0(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iI0, y40.b.g(str, '#', iI0, str.length()));
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        String strSubstring = str.substring(length, y40.b.f(length, str.length(), str, ":@"));
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q) && kotlin.jvm.internal.m.a(((q) obj).i, this.i);
    }

    public final sg.x f(String link) {
        kotlin.jvm.internal.m.e(link, "link");
        try {
            sg.x xVar = new sg.x(1);
            xVar.e(this, link);
            return xVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String g() {
        sg.x xVarF = f("/...");
        kotlin.jvm.internal.m.b(xVarF);
        xVarF.d = m.b(0, "", 0, 251, " \"':;<=>@[]^`{}|/\\?#");
        xVarF.e = m.b(0, "", 0, 251, " \"':;<=>@[]^`{}|/\\?#");
        return xVarF.b().i;
    }

    public final URI h() {
        String strSubstring;
        String strReplaceAll;
        sg.x xVar = new sg.x(1);
        ArrayList arrayList = (ArrayList) xVar.g;
        String scheme = this.a;
        xVar.c = scheme;
        xVar.d = e();
        xVar.e = a();
        xVar.f = this.d;
        kotlin.jvm.internal.m.e(scheme, "scheme");
        int i = scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1;
        int i2 = this.e;
        xVar.b = i2 != i ? i2 : -1;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        xVar.h = strD != null ? m.f(m.b(0, strD, 0, 211, " \"'<>#")) : null;
        if (this.h == null) {
            strSubstring = null;
        } else {
            String str = this.i;
            strSubstring = str.substring(r30.k.I0(str, '#', 0, 6) + 1);
            kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        xVar.i = strSubstring;
        String str2 = (String) xVar.f;
        if (str2 != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str2).replaceAll("");
            kotlin.jvm.internal.m.d(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        xVar.f = strReplaceAll;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, m.b(0, (String) arrayList.get(i3), 0, 227, "[]"));
        }
        ArrayList arrayList2 = (ArrayList) xVar.h;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str3 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str3 != null ? m.b(0, str3, 0, 195, "\\^`{|}") : null);
            }
        }
        String str4 = (String) xVar.i;
        xVar.i = str4 != null ? m.b(0, str4, 0, 163, " \"#<>\\^`{|}") : null;
        String string = xVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                kotlin.jvm.internal.m.d(patternCompile2, "compile(...)");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                kotlin.jvm.internal.m.d(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                kotlin.jvm.internal.m.d(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String toString() {
        return this.i;
    }
}

package sg;

import android.util.StateSet;
import com.google.protobuf.RuntimeVersion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import ri.t1;

public final class x {

    public final int f14217a;

    public int f14218b;

    public Object f14219c;

    public Serializable f14220d;

    public Serializable f14221e;

    public Object f14222f;

    public Object f14223g;

    public Object f14224h;

    public Object f14225i;

    public x(int i10) {
        this.f14217a = i10;
        switch (i10) {
            case 1:
                this.f14220d = RuntimeVersion.SUFFIX;
                this.f14221e = RuntimeVersion.SUFFIX;
                this.f14218b = -1;
                ArrayList arrayList = new ArrayList();
                this.f14223g = arrayList;
                arrayList.add(RuntimeVersion.SUFFIX);
                break;
        }
    }

    public x(m mVar) {
        this.f14217a = 0;
        d();
        a(StateSet.WILD_CARD, mVar);
    }

    public void a(int[] iArr, m mVar) {
        int i10 = this.f14218b;
        if (i10 == 0 || iArr.length == 0) {
            this.f14219c = mVar;
        }
        int[][] iArr2 = (int[][]) this.f14220d;
        if (i10 >= iArr2.length) {
            int i11 = i10 + 10;
            ?? r4 = new int[i11][];
            System.arraycopy(iArr2, 0, r4, 0, i10);
            this.f14220d = r4;
            ?? r7 = new m[i11];
            System.arraycopy((m[]) this.f14221e, 0, r7, 0, i10);
            this.f14221e = r7;
        }
        int[][] iArr3 = (int[][]) this.f14220d;
        int i12 = this.f14218b;
        iArr3[i12] = iArr;
        ((m[]) this.f14221e)[i12] = mVar;
        this.f14218b = i12 + 1;
    }

    public x40.q b() {
        ArrayList arrayList;
        String str = (String) this.f14219c;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strE = x40.m.e(0, 0, 7, (String) this.f14220d);
        String strE2 = x40.m.e(0, 0, 7, (String) this.f14221e);
        String str2 = (String) this.f14222f;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iC = c();
        ArrayList arrayList2 = (ArrayList) this.f14223g;
        ArrayList arrayList3 = new ArrayList(h00.r.q0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(x40.m.e(0, 0, 7, (String) it.next()));
        }
        ArrayList<String> arrayList4 = (ArrayList) this.f14224h;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(h00.r.q0(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList5.add(str3 != null ? x40.m.e(0, 0, 3, str3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.f14225i;
        return new x40.q(str, strE, strE2, str2, iC, arrayList3, arrayList, str4 != null ? x40.m.e(0, 0, 7, str4) : null, toString());
    }

    public int c() {
        int i10 = this.f14218b;
        if (i10 != -1) {
            return i10;
        }
        String str = (String) this.f14219c;
        kotlin.jvm.internal.m.b(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public void d() {
        this.f14219c = new m();
        this.f14220d = new int[10][];
        this.f14221e = new m[10];
    }

    public void e(x40.q qVar, String str) {
        int i10;
        int iF;
        int i11;
        char cCharAt;
        ArrayList arrayList = (ArrayList) this.f14223g;
        kotlin.jvm.internal.m.e(str, "input");
        byte[] bArr = y40.b.a;
        int iM = y40.b.m(0, str, str.length());
        int iN = y40.b.n(iM, str, str.length());
        if (iN - iM < 2) {
            i10 = -1;
            break;
        }
        char cCharAt2 = str.charAt(iM);
        if ((kotlin.jvm.internal.m.f(cCharAt2, 97) < 0 || kotlin.jvm.internal.m.f(cCharAt2, 122) > 0) && (kotlin.jvm.internal.m.f(cCharAt2, 65) < 0 || kotlin.jvm.internal.m.f(cCharAt2, 90) > 0)) {
            i10 = -1;
            break;
        }
        i10 = iM + 1;
        while (true) {
            if (i10 < iN) {
                char cCharAt3 = str.charAt(i10);
                if (('a' > cCharAt3 || cCharAt3 >= '{') && (('A' > cCharAt3 || cCharAt3 >= '[') && !(('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                    if (cCharAt3 != ':') {
                        break;
                    } else {
                        break;
                    }
                }
                i10++;
            }
            i10 = -1;
            break;
        }
        if (i10 == -1) {
            if (qVar == null) {
                throw new IllegalArgumentException(a1.b.o("Expected URL scheme 'http' or 'https' but no scheme was found for ", str.length() > 6 ? r30.k.h1(6, str).concat("...") : str));
            }
            this.f14219c = qVar.a;
        } else if (r30.r.w0(iM, str, "https:", true)) {
            this.f14219c = "https";
            iM += 6;
        } else {
            if (!r30.r.w0(iM, str, "http:", true)) {
                StringBuilder sb2 = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                String strSubstring = str.substring(0, i10);
                kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(strSubstring);
                sb2.append('\'');
                throw new IllegalArgumentException(sb2.toString());
            }
            this.f14219c = "http";
            iM += 5;
        }
        int i12 = 0;
        for (int i13 = iM; i13 < iN && ((cCharAt = str.charAt(i13)) == '\\' || cCharAt == '/'); i13++) {
            i12++;
        }
        char c10 = '#';
        if (i12 >= 2 || qVar == null || !kotlin.jvm.internal.m.a(qVar.a, (String) this.f14219c)) {
            int i14 = iM + i12;
            boolean z10 = false;
            boolean z11 = false;
            while (true) {
                iF = y40.b.f(i14, iN, str, "@/\\?#");
                byte bCharAt = iF != iN ? str.charAt(iF) : (byte) -1;
                if (bCharAt == -1 || bCharAt == c10 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (z10) {
                        this.f14221e = ((String) this.f14221e) + "%40" + x40.m.b(i14, str, iF, 240, " \"':;<=>@[]^`{}|/\\?#");
                        z10 = z10;
                    } else {
                        boolean z12 = z10;
                        int iG = y40.b.g(str, ':', i14, iF);
                        String strB = x40.m.b(i14, str, iG, 240, " \"':;<=>@[]^`{}|/\\?#");
                        if (z11) {
                            strB = w.c.l(new StringBuilder(), (String) this.f14220d, "%40", strB);
                        }
                        this.f14220d = strB;
                        if (iG != iF) {
                            this.f14221e = x40.m.b(iG + 1, str, iF, 240, " \"':;<=>@[]^`{}|/\\?#");
                            z10 = true;
                        } else {
                            z10 = z12;
                        }
                        z11 = true;
                    }
                    i14 = iF + 1;
                    c10 = '#';
                }
            }
            int i15 = i14;
            while (true) {
                if (i15 >= iF) {
                    i15 = iF;
                    break;
                }
                char cCharAt4 = str.charAt(i15);
                if (cCharAt4 != '[') {
                    if (cCharAt4 == ':') {
                        break;
                    }
                } else {
                    do {
                        i15++;
                        if (i15 >= iF) {
                            break;
                        }
                    } while (str.charAt(i15) != ']');
                }
                i15++;
            }
            int i16 = i15 + 1;
            if (i16 < iF) {
                this.f14222f = t1.P(x40.m.e(i14, i15, 4, str));
                try {
                    i11 = Integer.parseInt(x40.m.b(i16, str, iF, 248, RuntimeVersion.SUFFIX));
                    if (1 > i11 || i11 >= 65536) {
                        i11 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.f14218b = i11;
                if (i11 == -1) {
                    StringBuilder sb3 = new StringBuilder("Invalid URL port: \"");
                    String strSubstring2 = str.substring(i16, iF);
                    kotlin.jvm.internal.m.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb3.append(strSubstring2);
                    sb3.append('\"');
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
            } else {
                this.f14222f = t1.P(x40.m.e(i14, i15, 4, str));
                String str2 = (String) this.f14219c;
                kotlin.jvm.internal.m.b(str2);
                this.f14218b = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
            }
            if (((String) this.f14222f) == null) {
                StringBuilder sb4 = new StringBuilder("Invalid URL host: \"");
                String strSubstring3 = str.substring(i14, i15);
                kotlin.jvm.internal.m.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                sb4.append(strSubstring3);
                sb4.append('\"');
                throw new IllegalArgumentException(sb4.toString().toString());
            }
            iM = iF;
        } else {
            this.f14220d = qVar.e();
            this.f14221e = qVar.a();
            this.f14222f = qVar.d;
            this.f14218b = qVar.e;
            arrayList.clear();
            arrayList.addAll(qVar.c());
            if (iM == iN || str.charAt(iM) == '#') {
                String strD = qVar.d();
                this.f14224h = strD != null ? x40.m.f(x40.m.b(0, strD, 0, 211, " \"'<>#")) : null;
            }
        }
        int iF2 = y40.b.f(iM, iN, str, "?#");
        if (iM != iF2) {
            char cCharAt5 = str.charAt(iM);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add(RuntimeVersion.SUFFIX);
                iM++;
            } else {
                arrayList.set(arrayList.size() - 1, RuntimeVersion.SUFFIX);
            }
            while (iM < iF2) {
                int iF3 = y40.b.f(iM, iF2, str, "/\\");
                boolean z13 = iF3 < iF2;
                String strB2 = x40.m.b(iM, str, iF3, 240, " \"<>^`{}|/\\?#");
                if (!strB2.equals(".") && !strB2.equalsIgnoreCase("%2e")) {
                    if (!strB2.equals("..") && !strB2.equalsIgnoreCase("%2e.") && !strB2.equalsIgnoreCase(".%2e") && !strB2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) g4.c.d(1, arrayList)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strB2);
                        } else {
                            arrayList.add(strB2);
                        }
                        if (z13) {
                            arrayList.add(RuntimeVersion.SUFFIX);
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add(RuntimeVersion.SUFFIX);
                    } else {
                        arrayList.set(arrayList.size() - 1, RuntimeVersion.SUFFIX);
                    }
                }
                iM = z13 ? iF3 + 1 : iF3;
            }
        }
        if (iF2 < iN && str.charAt(iF2) == '?') {
            int iG2 = y40.b.g(str, '#', iF2, iN);
            this.f14224h = x40.m.f(x40.m.b(iF2 + 1, str, iG2, 208, " \"'<>#"));
            iF2 = iG2;
        }
        if (iF2 >= iN || str.charAt(iF2) != '#') {
            return;
        }
        this.f14225i = x40.m.b(iF2 + 1, str, iN, 176, RuntimeVersion.SUFFIX);
    }

    public String toString() {
        switch (this.f14217a) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                String str = (String) this.f14219c;
                if (str != null) {
                    sb2.append(str);
                    sb2.append("://");
                } else {
                    sb2.append("//");
                }
                if (((String) this.f14220d).length() > 0 || ((String) this.f14221e).length() > 0) {
                    sb2.append((String) this.f14220d);
                    if (((String) this.f14221e).length() > 0) {
                        sb2.append(':');
                        sb2.append((String) this.f14221e);
                    }
                    sb2.append('@');
                }
                String str2 = (String) this.f14222f;
                if (str2 != null) {
                    if (r30.k.B0(str2, ':')) {
                        sb2.append('[');
                        sb2.append((String) this.f14222f);
                        sb2.append(']');
                    } else {
                        sb2.append((String) this.f14222f);
                    }
                }
                int i10 = -1;
                if (this.f14218b != -1 || ((String) this.f14219c) != null) {
                    int iC = c();
                    String str3 = (String) this.f14219c;
                    if (str3 == null) {
                        sb2.append(':');
                        sb2.append(iC);
                    } else {
                        if (str3.equals("http")) {
                            i10 = 80;
                        } else if (str3.equals("https")) {
                            i10 = 443;
                        }
                        if (iC != i10) {
                            sb2.append(':');
                            sb2.append(iC);
                        }
                    }
                }
                ArrayList arrayList = (ArrayList) this.f14223g;
                kotlin.jvm.internal.m.e(arrayList, "<this>");
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    sb2.append('/');
                    sb2.append((String) arrayList.get(i11));
                }
                if (((ArrayList) this.f14224h) != null) {
                    sb2.append('?');
                    ArrayList arrayList2 = (ArrayList) this.f14224h;
                    kotlin.jvm.internal.m.b(arrayList2);
                    x40.m.g(sb2, arrayList2);
                }
                if (((String) this.f14225i) != null) {
                    sb2.append('#');
                    sb2.append((String) this.f14225i);
                }
                String string = sb2.toString();
                kotlin.jvm.internal.m.d(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }
}

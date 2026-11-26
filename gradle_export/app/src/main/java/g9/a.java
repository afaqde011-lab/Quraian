package g9;

import com.google.protobuf.RuntimeVersion;
import e7.u;
import java.util.regex.Pattern;

public final class a {

    public static final Pattern f6242c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    public static final Pattern f6243d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    public final u f6244a = new u();

    public final StringBuilder f6245b = new StringBuilder();

    public static String a(u uVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int i10 = uVar.f5183b;
        int i11 = uVar.f5184c;
        while (i10 < i11 && !z10) {
            char c10 = (char) uVar.f5182a[i10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                i10++;
                sb2.append(c10);
            }
        }
        uVar.O(i10 - uVar.f5183b);
        return sb2.toString();
    }

    public static String b(u uVar, StringBuilder sb2) {
        c(uVar);
        if (uVar.a() == 0) {
            return null;
        }
        String strA = a(uVar, sb2);
        if (!strA.isEmpty()) {
            return strA;
        }
        return RuntimeVersion.SUFFIX + ((char) uVar.A());
    }

    public static void c(u uVar) {
        while (true) {
            for (boolean z10 = true; uVar.a() > 0 && z10; z10 = false) {
                int i10 = uVar.f5183b;
                byte[] bArr = uVar.f5182a;
                byte b7 = bArr[i10];
                char c10 = (char) b7;
                if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                    uVar.O(1);
                } else {
                    int i11 = uVar.f5184c;
                    int i12 = i10 + 2;
                    if (i12 <= i11) {
                        int i13 = i10 + 1;
                        if (b7 == 47 && bArr[i13] == 42) {
                            while (true) {
                                int i14 = i12 + 1;
                                if (i14 >= i11) {
                                    break;
                                }
                                if (((char) bArr[i12]) == '*' && ((char) bArr[i14]) == '/') {
                                    i12 += 2;
                                    i11 = i12;
                                } else {
                                    i12 = i14;
                                }
                            }
                            uVar.O(i11 - uVar.f5183b);
                        }
                    }
                }
            }
            return;
        }
    }
}

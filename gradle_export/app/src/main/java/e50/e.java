package e50;

import com.google.android.gms.internal.measurement.x5;

public abstract class e {
    public static final k50.l a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;

    static {
        k50.l lVar = k50.l.D;
        a = sg.f.I("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            kotlin.jvm.internal.m.d(binaryString, "toBinaryString(it)");
            strArr[i] = r30.r.u0(y40.b.h("%8s", binaryString), ' ', '0');
        }
        d = strArr;
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = x5.n(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = c;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = x5.n(sb, strArr3[i4], "|PADDED");
        }
        int length = c.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = c;
            if (strArr4[i7] == null) {
                strArr4[i7] = d[i7];
            }
        }
    }

    public static String a(boolean z, int i, int i2, int i3, int i4) {
        String strV0;
        String str;
        String[] strArr = b;
        String strH = i3 < strArr.length ? strArr[i3] : y40.b.h("0x%02x", Integer.valueOf(i3));
        if (i4 == 0) {
            strV0 = "";
        } else {
            String[] strArr2 = d;
            if (i3 == 2 || i3 == 3) {
                strV0 = strArr2[i4];
            } else if (i3 == 4 || i3 == 6) {
                strV0 = i4 == 1 ? "ACK" : strArr2[i4];
            } else if (i3 == 7 || i3 == 8) {
                strV0 = strArr2[i4];
            } else {
                String[] strArr3 = c;
                if (i4 < strArr3.length) {
                    str = strArr3[i4];
                    kotlin.jvm.internal.m.b(str);
                } else {
                    str = strArr2[i4];
                }
                if (i3 != 5 || (i4 & 4) == 0) {
                    strV0 = (i3 != 0 || (i4 & 32) == 0) ? str : r30.r.v0(str, "PRIORITY", "COMPRESSED");
                } else {
                    strV0 = r30.r.v0(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return y40.b.h("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strH, strV0);
    }
}

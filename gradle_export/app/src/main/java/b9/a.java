package b9;

import android.text.TextUtils;
import ta.c0;

public final class a {

    public final int f2199a;

    public final int f2200b;

    public final int f2201c;

    public final int f2202d;

    public final int f2203e;

    public final int f2204f;

    public a(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f2199a = i10;
        this.f2200b = i11;
        this.f2201c = i12;
        this.f2202d = i13;
        this.f2203e = i14;
        this.f2204f = i15;
    }

    public static a a(String str) {
        c0.s(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < strArrSplit.length; i15++) {
            String strI = w00.a.I(strArrSplit[i15].trim());
            strI.getClass();
            switch (strI) {
                case "end":
                    i12 = i15;
                    break;
                case "text":
                    i14 = i15;
                    break;
                case "layer":
                    i10 = i15;
                    break;
                case "start":
                    i11 = i15;
                    break;
                case "style":
                    i13 = i15;
                    break;
            }
        }
        if (i11 == -1 || i12 == -1 || i14 == -1) {
            return null;
        }
        return new a(i10, i11, i12, i13, i14, strArrSplit.length);
    }
}

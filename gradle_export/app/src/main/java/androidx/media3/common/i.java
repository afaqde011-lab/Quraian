package androidx.media3.common;

import com.google.android.gms.internal.measurement.x5;
import java.util.Arrays;

public final class i {

    public static final i f1238h = new i(1, 2, 3, -1, -1, null);

    public static final String f1239i;

    public static final String f1240j;

    public static final String f1241k;
    public static final String l;
    public static final String m;

    public static final String f1242n;

    public final int f1243a;

    public final int f1244b;

    public final int f1245c;

    public final byte[] f1246d;

    public final int f1247e;

    public final int f1248f;

    public int f1249g;

    static {
        String str = e7.i0.f5136a;
        f1239i = Integer.toString(0, 36);
        f1240j = Integer.toString(1, 36);
        f1241k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        f1242n = Integer.toString(5, 36);
    }

    public i(int i10, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f1243a = i10;
        this.f1244b = i11;
        this.f1245c = i12;
        this.f1246d = bArr;
        this.f1247e = i13;
        this.f1248f = i14;
    }

    public static String a(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 != 1) {
            return i10 != 2 ? g4.c.f(i10, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    public static String b(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 != 1) {
            return i10 != 2 ? g4.c.f(i10, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    public static String c(int i10) {
        if (i10 == -1) {
            return "Unset color transfer";
        }
        if (i10 == 10) {
            return "Gamma 2.2";
        }
        if (i10 == 1) {
            return "Linear";
        }
        if (i10 == 2) {
            return "sRGB";
        }
        if (i10 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i10 != 6) {
            return i10 != 7 ? g4.c.f(i10, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    public static boolean e(i iVar) {
        if (iVar == null) {
            return true;
        }
        int i10 = iVar.f1243a;
        if (i10 != -1 && i10 != 1 && i10 != 2) {
            return false;
        }
        int i11 = iVar.f1244b;
        if (i11 != -1 && i11 != 2) {
            return false;
        }
        int i12 = iVar.f1245c;
        if ((i12 != -1 && i12 != 3) || iVar.f1246d != null) {
            return false;
        }
        int i13 = iVar.f1248f;
        if (i13 != -1 && i13 != 8) {
            return false;
        }
        int i14 = iVar.f1247e;
        return i14 == -1 || i14 == 8;
    }

    public static int f(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.f1243a == -1 || this.f1244b == -1 || this.f1245c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f1243a == iVar.f1243a && this.f1244b == iVar.f1244b && this.f1245c == iVar.f1245c && Arrays.equals(this.f1246d, iVar.f1246d) && this.f1247e == iVar.f1247e && this.f1248f == iVar.f1248f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f1249g == 0) {
            this.f1249g = ((((Arrays.hashCode(this.f1246d) + ((((((527 + this.f1243a) * 31) + this.f1244b) * 31) + this.f1245c) * 31)) * 31) + this.f1247e) * 31) + this.f1248f;
        }
        return this.f1249g;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(b(this.f1243a));
        sb2.append(", ");
        sb2.append(a(this.f1244b));
        sb2.append(", ");
        sb2.append(c(this.f1245c));
        sb2.append(", ");
        sb2.append(this.f1246d != null);
        sb2.append(", ");
        String str2 = "NA";
        int i10 = this.f1247e;
        if (i10 != -1) {
            str = i10 + "bit Luma";
        } else {
            str = "NA";
        }
        sb2.append(str);
        sb2.append(", ");
        int i11 = this.f1248f;
        if (i11 != -1) {
            str2 = i11 + "bit Chroma";
        }
        return x5.n(sb2, str2, ")");
    }
}

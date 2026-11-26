package androidx.media3.common;

import android.net.Uri;
import java.util.Arrays;

public final class a {
    public static final String m;

    public static final String f1039n;

    public static final String f1040o;

    public static final String f1041p;

    public static final String f1042q;

    public static final String f1043r;

    public static final String f1044s;

    public static final String f1045t;

    public static final String f1046u;

    public static final String f1047v;

    public static final String f1048w;

    public static final String f1049x;

    public final long f1050a;

    public final int f1051b;

    public final int f1052c;

    public final Uri[] f1053d;

    public final q0[] f1054e;

    public final int[] f1055f;

    public final long[] f1056g;

    public final String[] f1057h;

    public final b[] f1058i;

    public final long f1059j;

    public final boolean f1060k;
    public final boolean l;

    static {
        String str = e7.i0.f5136a;
        m = Integer.toString(0, 36);
        f1039n = Integer.toString(1, 36);
        f1040o = Integer.toString(2, 36);
        f1041p = Integer.toString(3, 36);
        f1042q = Integer.toString(4, 36);
        f1043r = Integer.toString(5, 36);
        f1044s = Integer.toString(6, 36);
        f1045t = Integer.toString(7, 36);
        f1046u = Integer.toString(8, 36);
        f1047v = Integer.toString(9, 36);
        f1048w = Integer.toString(10, 36);
        f1049x = Integer.toString(11, 36);
    }

    public a(long j9, int i10, int i11, int[] iArr, q0[] q0VarArr, long[] jArr, long j10, boolean z10, String[] strArr, b[] bVarArr, boolean z11) {
        Uri uri;
        int i12 = 0;
        ta.c0.s(iArr.length == q0VarArr.length);
        ta.c0.s(iArr.length == bVarArr.length);
        this.f1050a = j9;
        this.f1051b = i10;
        this.f1052c = i11;
        this.f1055f = iArr;
        this.f1054e = q0VarArr;
        this.f1056g = jArr;
        this.f1059j = j10;
        this.f1060k = z10;
        this.f1053d = new Uri[q0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f1053d;
            if (i12 >= uriArr.length) {
                this.f1057h = strArr;
                this.f1058i = bVarArr;
                this.l = z11;
                return;
            }
            q0 q0Var = q0VarArr[i12];
            if (q0Var == null) {
                uri = null;
            } else {
                l0 l0Var = q0Var.f1414b;
                l0Var.getClass();
                uri = l0Var.f1328a;
            }
            uriArr[i12] = uri;
            i12++;
        }
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f1055f;
            if (i12 >= iArr.length || this.f1060k || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f1050a == aVar.f1050a && this.f1051b == aVar.f1051b && this.f1052c == aVar.f1052c && Arrays.equals(this.f1054e, aVar.f1054e) && Arrays.equals(this.f1055f, aVar.f1055f) && Arrays.equals(this.f1056g, aVar.f1056g) && this.f1059j == aVar.f1059j && this.f1060k == aVar.f1060k && Arrays.equals(this.f1057h, aVar.f1057h) && Arrays.equals(this.f1058i, aVar.f1058i) && this.l == aVar.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((this.f1051b * 31) + this.f1052c) * 31;
        long j9 = this.f1050a;
        int iHashCode = (Arrays.hashCode(this.f1056g) + ((Arrays.hashCode(this.f1055f) + ((Arrays.hashCode(this.f1054e) + ((i10 + ((int) (j9 ^ (j9 >>> 32)))) * 31)) * 31)) * 31)) * 31;
        long j10 = this.f1059j;
        return ((Arrays.hashCode(this.f1058i) + ((((((iHashCode + ((int) ((j10 >>> 32) ^ j10))) * 31) + (this.f1060k ? 1 : 0)) * 31) + Arrays.hashCode(this.f1057h)) * 31)) * 31) + (this.l ? 1 : 0);
    }
}

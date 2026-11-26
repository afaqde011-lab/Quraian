package androidx.media3.common;

import java.util.Arrays;

public final class r2 {

    public static final String f1482f;

    public static final String f1483g;

    public static final String f1484h;

    public static final String f1485i;

    public final int f1486a;

    public final l2 f1487b;

    public final boolean f1488c;

    public final int[] f1489d;

    public final boolean[] f1490e;

    static {
        String str = e7.i0.f5136a;
        f1482f = Integer.toString(0, 36);
        f1483g = Integer.toString(1, 36);
        f1484h = Integer.toString(3, 36);
        f1485i = Integer.toString(4, 36);
    }

    public r2(l2 l2Var, boolean z10, int[] iArr, boolean[] zArr) {
        int i10 = l2Var.f1338a;
        this.f1486a = i10;
        boolean z11 = false;
        ta.c0.s(i10 == iArr.length && i10 == zArr.length);
        this.f1487b = l2Var;
        if (z10 && i10 > 1) {
            z11 = true;
        }
        this.f1488c = z11;
        this.f1489d = (int[]) iArr.clone();
        this.f1490e = (boolean[]) zArr.clone();
    }

    public final boolean a(int i10) {
        return this.f1489d[i10] == 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r2.class == obj.getClass()) {
            r2 r2Var = (r2) obj;
            if (this.f1488c == r2Var.f1488c && this.f1487b.equals(r2Var.f1487b) && Arrays.equals(this.f1489d, r2Var.f1489d) && Arrays.equals(this.f1490e, r2Var.f1490e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1490e) + ((Arrays.hashCode(this.f1489d) + (((this.f1487b.hashCode() * 31) + (this.f1488c ? 1 : 0)) * 31)) * 31);
    }
}

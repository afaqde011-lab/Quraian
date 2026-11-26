package androidx.media3.common;

public final class w2 {

    public static final w2 f1669d = new w2(0, 0);

    public static final String f1670e;

    public static final String f1671f;

    public static final String f1672g;

    public final int f1673a;

    public final int f1674b;

    public final float f1675c;

    static {
        String str = e7.i0.f5136a;
        f1670e = Integer.toString(0, 36);
        f1671f = Integer.toString(1, 36);
        f1672g = Integer.toString(3, 36);
    }

    public w2(float f3, int i10, int i11) {
        this.f1673a = i10;
        this.f1674b = i11;
        this.f1675c = f3;
    }

    public w2(int i10, int i11) {
        this(1.0f, i10, i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w2) {
            w2 w2Var = (w2) obj;
            if (this.f1673a == w2Var.f1673a && this.f1674b == w2Var.f1674b && this.f1675c == w2Var.f1675c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f1675c) + ((((217 + this.f1673a) * 31) + this.f1674b) * 31);
    }
}

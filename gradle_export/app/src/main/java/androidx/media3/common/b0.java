package androidx.media3.common;

import java.util.Objects;

public final class b0 {

    public static final String f1097c;

    public static final String f1098d;

    public final String f1099a;

    public final String f1100b;

    static {
        String str = e7.i0.f5136a;
        f1097c = Integer.toString(0, 36);
        f1098d = Integer.toString(1, 36);
    }

    public b0(String str, String str2) {
        this.f1099a = e7.i0.I(str);
        this.f1100b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class == obj.getClass()) {
            b0 b0Var = (b0) obj;
            if (Objects.equals(this.f1099a, b0Var.f1099a) && Objects.equals(this.f1100b, b0Var.f1100b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f1100b.hashCode() * 31;
        String str = this.f1099a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}

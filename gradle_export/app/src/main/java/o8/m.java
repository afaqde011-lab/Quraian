package o8;

import java.util.Arrays;

public final class m extends j {

    public final int f11717b;

    public final int f11718c;

    public final int f11719d;

    public final int[] f11720e;

    public final int[] f11721f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f11717b = i10;
        this.f11718c = i11;
        this.f11719d = i12;
        this.f11720e = iArr;
        this.f11721f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f11717b == mVar.f11717b && this.f11718c == mVar.f11718c && this.f11719d == mVar.f11719d && Arrays.equals(this.f11720e, mVar.f11720e) && Arrays.equals(this.f11721f, mVar.f11721f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11721f) + ((Arrays.hashCode(this.f11720e) + ((((((527 + this.f11717b) * 31) + this.f11718c) * 31) + this.f11719d) * 31)) * 31);
    }
}

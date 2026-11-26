package a8;

import java.util.Arrays;

public final class k0 {

    public final int f288a;

    public final byte[] f289b;

    public final int f290c;

    public final int f291d;

    public k0(int i10, byte[] bArr, int i11, int i12) {
        this.f288a = i10;
        this.f289b = bArr;
        this.f290c = i11;
        this.f291d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            if (this.f288a == k0Var.f288a && this.f290c == k0Var.f290c && this.f291d == k0Var.f291d && Arrays.equals(this.f289b, k0Var.f289b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f289b) + (this.f288a * 31)) * 31) + this.f290c) * 31) + this.f291d;
    }
}

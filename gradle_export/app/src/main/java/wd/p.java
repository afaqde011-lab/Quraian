package wd;

import java.util.Arrays;

public final class p extends b0 {

    public final byte[] f16045a;

    public final byte[] f16046b;

    public p(byte[] bArr, byte[] bArr2) {
        this.f16045a = bArr;
        this.f16046b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            boolean z10 = b0Var instanceof p;
            p pVar = (p) b0Var;
            if (Arrays.equals(this.f16045a, z10 ? pVar.f16045a : pVar.f16045a)) {
                p pVar2 = (p) b0Var;
                if (Arrays.equals(this.f16046b, z10 ? pVar2.f16046b : pVar2.f16046b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16046b) ^ ((Arrays.hashCode(this.f16045a) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f16045a) + ", encryptedBlob=" + Arrays.toString(this.f16046b) + "}";
    }
}

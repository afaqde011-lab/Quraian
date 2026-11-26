package ri;

import java.util.Arrays;

public final class h0 extends r1 {

    public final String f13351a;

    public final byte[] f13352b;

    public h0(String str, byte[] bArr) {
        this.f13351a = str;
        this.f13352b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r1 r1Var = (r1) obj;
            h0 h0Var = (h0) r1Var;
            if (this.f13351a.equals(h0Var.f13351a)) {
                if (Arrays.equals(this.f13352b, r1Var instanceof h0 ? ((h0) r1Var).f13352b : h0Var.f13352b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f13352b) ^ ((this.f13351a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "File{filename=" + this.f13351a + ", contents=" + Arrays.toString(this.f13352b) + "}";
    }
}

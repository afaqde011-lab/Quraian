package o8;

import java.util.Arrays;
import java.util.Objects;

public final class n extends j {

    public final String f11722b;

    public final byte[] f11723c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f11722b = str;
        this.f11723c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f11722b, nVar.f11722b) && Arrays.equals(this.f11723c, nVar.f11723c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11722b;
        return Arrays.hashCode(this.f11723c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override
    public final String toString() {
        return this.f11712a + ": owner=" + this.f11722b;
    }
}

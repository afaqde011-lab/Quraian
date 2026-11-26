package o8;

import java.util.Arrays;
import java.util.Objects;

public final class f extends j {

    public final String f11703b;

    public final String f11704c;

    public final String f11705d;

    public final byte[] f11706e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f11703b = str;
        this.f11704c = str2;
        this.f11705d = str3;
        this.f11706e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f11703b, fVar.f11703b) && Objects.equals(this.f11704c, fVar.f11704c) && Objects.equals(this.f11705d, fVar.f11705d) && Arrays.equals(this.f11706e, fVar.f11706e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11703b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11704c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11705d;
        return Arrays.hashCode(this.f11706e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override
    public final String toString() {
        return this.f11712a + ": mimeType=" + this.f11703b + ", filename=" + this.f11704c + ", description=" + this.f11705d;
    }
}

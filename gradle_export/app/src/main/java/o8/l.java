package o8;

import java.util.Objects;

public final class l extends j {

    public final String f11714b;

    public final String f11715c;

    public final String f11716d;

    public l(String str, String str2, String str3) {
        super("----");
        this.f11714b = str;
        this.f11715c = str2;
        this.f11716d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (Objects.equals(this.f11715c, lVar.f11715c) && Objects.equals(this.f11714b, lVar.f11714b) && Objects.equals(this.f11716d, lVar.f11716d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11714b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11715c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11716d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override
    public final String toString() {
        return this.f11712a + ": domain=" + this.f11714b + ", description=" + this.f11715c;
    }
}

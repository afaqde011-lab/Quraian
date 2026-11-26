package o8;

import java.util.Objects;

public final class e extends j {

    public final String f11700b;

    public final String f11701c;

    public final String f11702d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f11700b = str;
        this.f11701c = str2;
        this.f11702d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f11701c, eVar.f11701c) && Objects.equals(this.f11700b, eVar.f11700b) && Objects.equals(this.f11702d, eVar.f11702d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11700b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11701c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11702d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override
    public final String toString() {
        return this.f11712a + ": language=" + this.f11700b + ", description=" + this.f11701c + ", text=" + this.f11702d;
    }
}

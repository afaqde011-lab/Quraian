package m7;

import java.util.Objects;

public final class f {

    public final String f10599a;

    public final String f10600b;

    public final String f10601c;

    public f(String str, String str2, String str3) {
        this.f10599a = str;
        this.f10600b = str2;
        this.f10601c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f10599a, fVar.f10599a) && Objects.equals(this.f10600b, fVar.f10600b) && Objects.equals(this.f10601c, fVar.f10601c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f10599a.hashCode() * 31;
        String str = this.f10600b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10601c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}

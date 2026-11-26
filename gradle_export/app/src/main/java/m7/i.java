package m7;

import java.util.Objects;

public final class i {

    public final String f10610a;

    public final String f10611b;

    public final String f10612c;

    public final String f10613d;

    public final String f10614e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f10610a = str;
        this.f10611b = str2;
        this.f10612c = str3;
        this.f10613d = str4;
        this.f10614e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Objects.equals(this.f10610a, iVar.f10610a) && Objects.equals(this.f10611b, iVar.f10611b) && Objects.equals(this.f10612c, iVar.f10612c) && Objects.equals(this.f10613d, iVar.f10613d) && Objects.equals(this.f10614e, iVar.f10614e);
    }

    public final int hashCode() {
        String str = this.f10610a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10611b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10612c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f10613d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f10614e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}

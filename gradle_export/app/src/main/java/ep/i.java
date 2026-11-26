package ep;

public final class i {
    public final String a;
    public final String b;
    public final Integer c;
    public final Integer d;

    public i(String str, String str2, Integer num, Integer num2) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.m.a(this.a, iVar.a) && kotlin.jvm.internal.m.a(this.b, iVar.b) && kotlin.jvm.internal.m.a(this.c, iVar.c) && kotlin.jvm.internal.m.a(this.d, iVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = a1.b.s("CheckEmail(next=", this.a, ", signupToken=", this.b, ", signupExpiresIn=");
        sbS.append(this.c);
        sbS.append(", resendIn=");
        sbS.append(this.d);
        sbS.append(")");
        return sbS.toString();
    }
}

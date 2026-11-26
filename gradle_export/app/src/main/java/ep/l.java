package ep;

import com.google.android.gms.internal.measurement.x5;

public final class l {
    public final String a;
    public final String b;
    public final Integer c;
    public final Integer d;

    public l(String str, String str2, Integer num, Integer num2) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.m.a(this.a, lVar.a) && kotlin.jvm.internal.m.a(this.b, lVar.b) && kotlin.jvm.internal.m.a(this.c, lVar.c) && kotlin.jvm.internal.m.a(this.d, lVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iE = x5.e((str == null ? 0 : str.hashCode()) * 31, this.b, 31);
        Integer num = this.c;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = a1.b.s("ForgotPassword(resetToken=", this.a, ", stage=", this.b, ", resetExpiresIn=");
        sbS.append(this.c);
        sbS.append(", resendIn=");
        sbS.append(this.d);
        sbS.append(")");
        return sbS.toString();
    }
}

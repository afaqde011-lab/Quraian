package ep;

import com.google.android.gms.internal.measurement.x5;
import java.time.LocalDate;

public final class r {
    public final String a;
    public final String b;
    public final String c;
    public final f d;
    public final LocalDate e;
    public final boolean f;

    public r(String email, String password, String name, f fVar, LocalDate localDate, boolean z) {
        kotlin.jvm.internal.m.e(email, "email");
        kotlin.jvm.internal.m.e(password, "password");
        kotlin.jvm.internal.m.e(name, "name");
        this.a = email;
        this.b = password;
        this.c = name;
        this.d = fVar;
        this.e = localDate;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.m.a(this.a, rVar.a) && kotlin.jvm.internal.m.a(this.b, rVar.b) && kotlin.jvm.internal.m.a(this.c, rVar.c) && this.d == rVar.d && kotlin.jvm.internal.m.a(this.e, rVar.e) && this.f == rVar.f;
    }

    public final int hashCode() {
        int iE = x5.e(x5.e(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        f fVar = this.d;
        int iHashCode = (iE + (fVar == null ? 0 : fVar.hashCode())) * 31;
        LocalDate localDate = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (localDate != null ? localDate.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbS = a1.b.s("UserAuthData(email=", this.a, ", password=", this.b, ", name=");
        sbS.append(this.c);
        sbS.append(", sex=");
        sbS.append(this.d);
        sbS.append(", birthDate=");
        sbS.append(this.e);
        sbS.append(", marketingEnabled=");
        sbS.append(this.f);
        sbS.append(")");
        return sbS.toString();
    }
}

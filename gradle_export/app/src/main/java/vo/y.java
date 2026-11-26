package vo;

import com.google.android.gms.internal.measurement.x5;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u000e"}, d2 = {"Lvo/y;", "", "", "a", "Ljava/lang/String;", "getUsername", "()Ljava/lang/String;", "username", "b", "getSex", "sex", "c", "getBirthDate", "birthDate", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y {

    @ck.b("username")
    private final String username;

    @ck.b("sex")
    private final String sex;

    @ck.b("birth_date")
    private final String birthDate;

    public y(String username, String str, String str2) {
        kotlin.jvm.internal.m.e(username, "username");
        this.username = username;
        this.sex = str;
        this.birthDate = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.m.a(this.username, yVar.username) && kotlin.jvm.internal.m.a(this.sex, yVar.sex) && kotlin.jvm.internal.m.a(this.birthDate, yVar.birthDate);
    }

    public final int hashCode() {
        return this.birthDate.hashCode() + x5.e(this.username.hashCode() * 31, this.sex, 31);
    }

    public final String toString() {
        String str = this.username;
        String str2 = this.sex;
        return x5.n(a1.b.s("UpdateProfileRequestApiModel(username=", str, ", sex=", str2, ", birthDate="), this.birthDate, ")");
    }
}

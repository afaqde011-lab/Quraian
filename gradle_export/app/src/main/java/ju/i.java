package ju;

import com.google.android.gms.internal.measurement.x5;

public final class i {
    public final String a;
    public final String b;
    public final u30.b c;

    public i(String str, String str2, u30.b reviews) {
        kotlin.jvm.internal.m.e(reviews, "reviews");
        this.a = str;
        this.b = str2;
        this.c = reviews;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.m.a(this.a, iVar.a) && kotlin.jvm.internal.m.a(this.b, iVar.b) && kotlin.jvm.internal.m.a(this.c, iVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x5.e(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sbS = a1.b.s("OnboardingSocialProofUi(usersCountLabel=", this.a, ", ratingLabel=", this.b, ", reviews=");
        sbS.append(this.c);
        sbS.append(")");
        return sbS.toString();
    }
}

package cf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.x5;
import java.util.Arrays;
import ri.t1;

public final class u extends re.a {
    public static final Parcelable.Creator<u> CREATOR = new ah.c(28);
    public final String A;
    public final String B;
    public final String C;

    public u(String str, String str2, String str3) {
        com.google.android.gms.common.internal.d0.h(str);
        this.A = str;
        com.google.android.gms.common.internal.d0.h(str2);
        this.B = str2;
        this.C = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return com.google.android.gms.common.internal.d0.k(this.A, uVar.A) && com.google.android.gms.common.internal.d0.k(this.B, uVar.B) && com.google.android.gms.common.internal.d0.k(this.C, uVar.C);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A, this.B, this.C});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.A);
        sb2.append("', \n name='");
        sb2.append(this.B);
        sb2.append("', \n icon='");
        return x5.n(sb2, this.C, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.b0(parcel, 2, this.A);
        t1.b0(parcel, 3, this.B);
        t1.b0(parcel, 4, this.C);
        t1.h0(iG0, parcel);
    }
}

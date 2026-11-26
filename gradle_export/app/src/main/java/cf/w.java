package cf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.x5;
import java.util.Arrays;
import nf.u0;
import ri.t1;

public final class w extends re.a {
    public static final Parcelable.Creator<w> CREATOR = new k0(0);
    public final u0 A;
    public final String B;
    public final String C;
    public final String D;

    public w(String str, String str2, String str3, byte[] bArr) {
        com.google.android.gms.common.internal.d0.h(bArr);
        this.A = u0.l(bArr.length, bArr);
        com.google.android.gms.common.internal.d0.h(str);
        this.B = str;
        this.C = str2;
        com.google.android.gms.common.internal.d0.h(str3);
        this.D = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return com.google.android.gms.common.internal.d0.k(this.A, wVar.A) && com.google.android.gms.common.internal.d0.k(this.B, wVar.B) && com.google.android.gms.common.internal.d0.k(this.C, wVar.C) && com.google.android.gms.common.internal.d0.k(this.D, wVar.D);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A, this.B, this.C, this.D});
    }

    public final String toString() {
        StringBuilder sbN = g4.c.n("PublicKeyCredentialUserEntity{\n id=", ve.c.c(this.A.m()), ", \n name='");
        sbN.append(this.B);
        sbN.append("', \n icon='");
        sbN.append(this.C);
        sbN.append("', \n displayName='");
        return x5.n(sbN, this.D, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.U(parcel, 2, this.A.m());
        t1.b0(parcel, 3, this.B);
        t1.b0(parcel, 4, this.C);
        t1.b0(parcel, 5, this.D);
        t1.h0(iG0, parcel);
    }
}

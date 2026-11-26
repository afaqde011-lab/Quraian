package cf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import nf.u0;
import ri.t1;

public final class m0 extends re.a {
    public static final Parcelable.Creator<m0> CREATOR = new k0(13);
    public final u0 A;
    public final u0 B;

    public m0(u0 u0Var, u0 u0Var2) {
        this.A = u0Var;
        this.B = u0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return com.google.android.gms.common.internal.d0.k(this.A, m0Var.A) && com.google.android.gms.common.internal.d0.k(this.B, m0Var.B);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A, this.B});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        u0 u0Var = this.A;
        t1.U(parcel, 1, u0Var == null ? null : u0Var.m());
        u0 u0Var2 = this.B;
        t1.U(parcel, 2, u0Var2 != null ? u0Var2.m() : null);
        t1.h0(iG0, parcel);
    }
}

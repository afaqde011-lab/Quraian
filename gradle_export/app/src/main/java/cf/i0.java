package cf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import nf.u0;
import ri.t1;

public final class i0 extends re.a {
    public static final Parcelable.Creator<i0> CREATOR = new ah.c(22);
    public final u0 A;
    public final u0 B;
    public final u0 C;
    public final int D;

    public i0(u0 u0Var, u0 u0Var2, u0 u0Var3, int i10) {
        this.A = u0Var;
        this.B = u0Var2;
        this.C = u0Var3;
        this.D = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return com.google.android.gms.common.internal.d0.k(this.A, i0Var.A) && com.google.android.gms.common.internal.d0.k(this.B, i0Var.B) && com.google.android.gms.common.internal.d0.k(this.C, i0Var.C) && this.D == i0Var.D;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A, this.B, this.C, Integer.valueOf(this.D)});
    }

    public final String toString() {
        u0 u0Var = this.A;
        String strC = ve.c.c(u0Var == null ? null : u0Var.m());
        u0 u0Var2 = this.B;
        String strC2 = ve.c.c(u0Var2 == null ? null : u0Var2.m());
        u0 u0Var3 = this.C;
        String strC3 = ve.c.c(u0Var3 != null ? u0Var3.m() : null);
        StringBuilder sbS = a1.b.s("HmacSecretExtension{coseKeyAgreement=", strC, ", saltEnc=", strC2, ", saltAuth=");
        sbS.append(strC3);
        sbS.append(", getPinUvAuthProtocol=");
        return g4.c.g(this.D, "}", sbS);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        u0 u0Var = this.A;
        t1.U(parcel, 1, u0Var == null ? null : u0Var.m());
        u0 u0Var2 = this.B;
        t1.U(parcel, 2, u0Var2 == null ? null : u0Var2.m());
        u0 u0Var3 = this.C;
        t1.U(parcel, 3, u0Var3 != null ? u0Var3.m() : null);
        t1.f0(parcel, 4, 4);
        parcel.writeInt(this.D);
        t1.h0(iG0, parcel);
    }
}

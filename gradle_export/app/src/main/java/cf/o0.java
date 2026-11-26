package cf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import nf.u0;
import ri.t1;

public final class o0 extends re.a {
    public static final Parcelable.Creator<o0> CREATOR = new k0(20);
    public final long A;
    public final u0 B;
    public final u0 C;
    public final u0 D;

    public o0(long j9, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        com.google.android.gms.common.internal.d0.h(bArr);
        u0 u0VarL = u0.l(bArr.length, bArr);
        com.google.android.gms.common.internal.d0.h(bArr2);
        u0 u0VarL2 = u0.l(bArr2.length, bArr2);
        com.google.android.gms.common.internal.d0.h(bArr3);
        u0 u0VarL3 = u0.l(bArr3.length, bArr3);
        this.A = j9;
        this.B = u0VarL;
        this.C = u0VarL2;
        this.D = u0VarL3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.A == o0Var.A && com.google.android.gms.common.internal.d0.k(this.B, o0Var.B) && com.google.android.gms.common.internal.d0.k(this.C, o0Var.C) && com.google.android.gms.common.internal.d0.k(this.D, o0Var.D);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A), this.B, this.C, this.D});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.f0(parcel, 1, 8);
        parcel.writeLong(this.A);
        t1.U(parcel, 2, this.B.m());
        t1.U(parcel, 3, this.C.m());
        t1.U(parcel, 4, this.D.m());
        t1.h0(iG0, parcel);
    }
}

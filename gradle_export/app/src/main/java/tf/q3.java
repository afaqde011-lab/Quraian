package tf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class q3 extends re.a {
    public static final Parcelable.Creator<q3> CREATOR = new le.b(22);
    public final long A;
    public byte[] B;
    public final String C;
    public final Bundle D;
    public final int E;
    public final long F;
    public String G;

    public q3(long j9, byte[] bArr, String str, Bundle bundle, int i10, long j10, String str2) {
        this.A = j9;
        this.B = bArr;
        this.C = str;
        this.D = bundle;
        this.E = i10;
        this.F = j10;
        this.G = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = ri.t1.g0(20293, parcel);
        ri.t1.f0(parcel, 1, 8);
        parcel.writeLong(this.A);
        ri.t1.U(parcel, 2, this.B);
        ri.t1.b0(parcel, 3, this.C);
        ri.t1.T(parcel, 4, this.D);
        ri.t1.f0(parcel, 5, 4);
        parcel.writeInt(this.E);
        ri.t1.f0(parcel, 6, 8);
        parcel.writeLong(this.F);
        ri.t1.b0(parcel, 7, this.G);
        ri.t1.h0(iG0, parcel);
    }
}

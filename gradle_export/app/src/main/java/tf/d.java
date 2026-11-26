package tf;

import android.os.Parcel;
import android.os.Parcelable;

public final class d extends re.a {
    public static final Parcelable.Creator<d> CREATOR = new le.b(16);
    public final long A;
    public final int B;
    public final long C;

    public d(int i10, long j9, long j10) {
        this.A = j9;
        this.B = i10;
        this.C = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = ri.t1.g0(20293, parcel);
        ri.t1.f0(parcel, 1, 8);
        parcel.writeLong(this.A);
        ri.t1.f0(parcel, 2, 4);
        parcel.writeInt(this.B);
        ri.t1.f0(parcel, 3, 8);
        parcel.writeLong(this.C);
        ri.t1.h0(iG0, parcel);
    }
}

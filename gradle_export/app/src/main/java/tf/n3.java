package tf;

import android.os.Parcel;
import android.os.Parcelable;

public final class n3 extends re.a {
    public static final Parcelable.Creator<n3> CREATOR = new le.b(21);
    public final String A;
    public final long B;
    public final int C;

    public n3(String str, long j9, int i10) {
        this.A = str;
        this.B = j9;
        this.C = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = ri.t1.g0(20293, parcel);
        ri.t1.b0(parcel, 1, this.A);
        ri.t1.f0(parcel, 2, 8);
        parcel.writeLong(this.B);
        ri.t1.f0(parcel, 3, 4);
        parcel.writeInt(this.C);
        ri.t1.h0(iG0, parcel);
    }
}

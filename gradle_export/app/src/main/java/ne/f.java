package ne;

import android.os.Parcel;
import android.os.Parcelable;
import ri.t1;

public final class f extends re.a {
    public static final Parcelable.Creator<f> CREATOR = new le.b(9);
    public final byte[] A;
    public final boolean B;
    public final String C;

    public f(String str, boolean z10, byte[] bArr) {
        this.A = bArr;
        this.B = z10;
        this.C = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.U(parcel, 1, this.A);
        t1.f0(parcel, 2, 4);
        parcel.writeInt(this.B ? 1 : 0);
        t1.b0(parcel, 3, this.C);
        t1.h0(iG0, parcel);
    }
}

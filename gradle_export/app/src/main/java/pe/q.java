package pe;

import android.os.Parcel;
import android.os.Parcelable;
import ca.v;
import com.google.android.gms.internal.measurement.y3;
import ri.t1;

public final class q extends re.a {
    public static final Parcelable.Creator<q> CREATOR = new le.b(14);
    public final boolean A;
    public final String B;
    public final int C;
    public final int D;
    public final long E;

    public q(boolean z10, String str, int i10, int i11, long j9) {
        this.A = z10;
        this.B = str;
        this.C = y3.Z(i10) - 1;
        this.D = v.J(i11) - 1;
        this.E = j9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.f0(parcel, 1, 4);
        parcel.writeInt(this.A ? 1 : 0);
        t1.b0(parcel, 2, this.B);
        t1.f0(parcel, 3, 4);
        parcel.writeInt(this.C);
        t1.f0(parcel, 4, 4);
        parcel.writeInt(this.D);
        t1.f0(parcel, 5, 8);
        parcel.writeLong(this.E);
        t1.h0(iG0, parcel);
    }
}

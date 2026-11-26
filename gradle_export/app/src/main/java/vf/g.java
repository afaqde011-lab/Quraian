package vf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w;
import ri.t1;

public final class g extends re.a {
    public static final Parcelable.Creator<g> CREATOR = new f(1);
    public final int A;
    public final w B;

    public g(int i10, w wVar) {
        this.A = i10;
        this.B = wVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.f0(parcel, 1, 4);
        parcel.writeInt(this.A);
        t1.a0(parcel, 2, this.B, i10);
        t1.h0(iG0, parcel);
    }
}

package oj;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ri.t1;

public final class p extends re.a {
    public static final Parcelable.Creator<p> CREATOR = new le.b(10);
    public final Bundle A;
    public u.e B;

    public p(Bundle bundle) {
        this.A = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.T(parcel, 2, this.A);
        t1.h0(iG0, parcel);
    }
}

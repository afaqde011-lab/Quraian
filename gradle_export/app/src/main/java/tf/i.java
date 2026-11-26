package tf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class i extends re.a {
    public static final Parcelable.Creator<i> CREATOR = new le.b(18);
    public final Bundle A;

    public i(Bundle bundle) {
        this.A = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = ri.t1.g0(20293, parcel);
        ri.t1.T(parcel, 1, this.A);
        ri.t1.h0(iG0, parcel);
    }
}

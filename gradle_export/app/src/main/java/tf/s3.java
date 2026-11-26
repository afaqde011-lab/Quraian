package tf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class s3 extends re.a {
    public static final Parcelable.Creator<s3> CREATOR = new le.b(24);
    public final List A;

    public s3(ArrayList arrayList) {
        this.A = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = ri.t1.g0(20293, parcel);
        ri.t1.e0(parcel, 1, this.A);
        ri.t1.h0(iG0, parcel);
    }
}

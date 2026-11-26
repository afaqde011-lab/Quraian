package cf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import ri.t1;

public final class p0 extends re.a {
    public static final Parcelable.Creator<p0> CREATOR = new k0(21);
    public final List A;

    public p0(ArrayList arrayList) {
        com.google.android.gms.common.internal.d0.h(arrayList);
        this.A = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        List list = ((p0) obj).A;
        List list2 = this.A;
        return list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.A)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.e0(parcel, 1, this.A);
        t1.h0(iG0, parcel);
    }
}

package cf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import ri.t1;

public final class g0 extends re.a {
    public static final Parcelable.Creator<g0> CREATOR = new ah.c(19);
    public final boolean A;

    public g0(boolean z10) {
        this.A = Boolean.valueOf(z10).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g0) && this.A == ((g0) obj).A;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.f0(parcel, 1, 4);
        parcel.writeInt(this.A ? 1 : 0);
        t1.h0(iG0, parcel);
    }
}

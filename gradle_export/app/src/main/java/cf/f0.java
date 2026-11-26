package cf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import ri.t1;

public final class f0 extends re.a {
    public static final Parcelable.Creator<f0> CREATOR = new ah.c(18);
    public final long A;

    public f0(long j9) {
        this.A = Long.valueOf(j9).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f0) && this.A == ((f0) obj).A;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.f0(parcel, 1, 8);
        parcel.writeLong(this.A);
        t1.h0(iG0, parcel);
    }
}

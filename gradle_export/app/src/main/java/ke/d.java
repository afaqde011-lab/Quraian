package ke;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.k0;
import java.util.Arrays;
import ri.t1;

public final class d extends re.a {
    public static final Parcelable.Creator<d> CREATOR = new k0(17);
    public final boolean A;

    public d(boolean z10) {
        this.A = z10;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && this.A == ((d) obj).A;
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

package ne;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import ri.t1;

public final class d extends re.a {
    public static final Parcelable.Creator<d> CREATOR = new le.b(5);
    public final byte[] A;
    public final String B;

    public d(String str, byte[] bArr) {
        this.A = bArr;
        this.B = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Arrays.equals(this.A, ((d) obj).A);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.A))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.U(parcel, 1, this.A);
        t1.b0(parcel, 2, this.B);
        t1.h0(iG0, parcel);
    }
}

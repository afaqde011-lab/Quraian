package cf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.x5;
import java.util.Arrays;
import ri.t1;

public final class o extends re.a {
    public static final Parcelable.Creator<o> CREATOR = new k0(24);
    public final String A;

    public o(String str) {
        com.google.android.gms.common.internal.d0.h(str);
        this.A = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.A.equals(((o) obj).A);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A});
    }

    public final String toString() {
        return x5.n(new StringBuilder("FidoAppIdExtension{appid='"), this.A, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.b0(parcel, 2, this.A);
        t1.h0(iG0, parcel);
    }
}

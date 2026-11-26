package cf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import ri.t1;

public final class h0 extends re.a {
    public static final Parcelable.Creator<h0> CREATOR = new ah.c(21);
    public final String A;

    public h0(String str) {
        com.google.android.gms.common.internal.d0.h(str);
        this.A = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h0) {
            return this.A.equals(((h0) obj).A);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.b0(parcel, 1, this.A);
        t1.h0(iG0, parcel);
    }
}

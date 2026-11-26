package ke;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.common.internal.k0;
import java.util.Arrays;
import ri.t1;

public final class b extends re.a {
    public static final Parcelable.Creator<b> CREATOR = new k0(15);
    public final boolean A;
    public final String B;

    public b(String str, boolean z10) {
        if (z10) {
            d0.h(str);
        }
        this.A = z10;
        this.B = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.A == bVar.A && d0.k(this.B, bVar.B);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A), this.B});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.f0(parcel, 1, 4);
        parcel.writeInt(this.A ? 1 : 0);
        t1.b0(parcel, 2, this.B);
        t1.h0(iG0, parcel);
    }
}

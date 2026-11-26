package ke;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.common.internal.k0;
import java.util.Arrays;
import ri.t1;

public final class h extends re.a {
    public static final Parcelable.Creator<h> CREATOR = new k0(18);
    public final k A;
    public final String B;
    public final int C;

    public h(k kVar, String str, int i10) {
        d0.h(kVar);
        this.A = kVar;
        this.B = str;
        this.C = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return d0.k(this.A, hVar.A) && d0.k(this.B, hVar.B) && this.C == hVar.C;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A, this.B});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.a0(parcel, 1, this.A, i10);
        t1.b0(parcel, 2, this.B);
        t1.f0(parcel, 3, 4);
        parcel.writeInt(this.C);
        t1.h0(iG0, parcel);
    }
}

package ke;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.common.internal.k0;
import java.util.Arrays;
import java.util.Objects;
import ri.t1;

public final class c extends re.a {
    public static final Parcelable.Creator<c> CREATOR = new k0(16);
    public final boolean A;
    public final byte[] B;
    public final String C;

    public c(String str, boolean z10, byte[] bArr) {
        if (z10) {
            d0.h(bArr);
            d0.h(str);
        }
        this.A = z10;
        this.B = bArr;
        this.C = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.A == cVar.A && Arrays.equals(this.B, cVar.B) && Objects.equals(this.C, cVar.C);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.B) + (Objects.hash(Boolean.valueOf(this.A), this.C) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.f0(parcel, 1, 4);
        parcel.writeInt(this.A ? 1 : 0);
        t1.U(parcel, 2, this.B);
        t1.b0(parcel, 3, this.C);
        t1.h0(iG0, parcel);
    }
}

package cf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import ri.t1;

public final class e0 extends re.a {
    public static final Parcelable.Creator<e0> CREATOR = new k0(9);
    public final int A;
    public final short B;
    public final short C;

    public e0(int i10, short s6, short s10) {
        this.A = i10;
        this.B = s6;
        this.C = s10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.A == e0Var.A && this.B == e0Var.B && this.C == e0Var.C;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A), Short.valueOf(this.B), Short.valueOf(this.C)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.f0(parcel, 1, 4);
        parcel.writeInt(this.A);
        t1.f0(parcel, 2, 4);
        parcel.writeInt(this.B);
        t1.f0(parcel, 3, 4);
        parcel.writeInt(this.C);
        t1.h0(iG0, parcel);
    }
}

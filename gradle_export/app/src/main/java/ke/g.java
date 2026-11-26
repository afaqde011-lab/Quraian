package ke;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.common.internal.k0;
import java.util.Arrays;
import ri.t1;

public final class g extends re.a {
    public static final Parcelable.Creator<g> CREATOR = new k0(13);
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final boolean E;
    public final int F;

    public g(String str, String str2, String str3, String str4, boolean z10, int i10) {
        d0.h(str);
        this.A = str;
        this.B = str2;
        this.C = str3;
        this.D = str4;
        this.E = z10;
        this.F = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return d0.k(this.A, gVar.A) && d0.k(this.D, gVar.D) && d0.k(this.B, gVar.B) && d0.k(Boolean.valueOf(this.E), Boolean.valueOf(gVar.E)) && this.F == gVar.F;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A, this.B, this.D, Boolean.valueOf(this.E), Integer.valueOf(this.F)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.b0(parcel, 1, this.A);
        t1.b0(parcel, 2, this.B);
        t1.b0(parcel, 3, this.C);
        t1.b0(parcel, 4, this.D);
        t1.f0(parcel, 5, 4);
        parcel.writeInt(this.E ? 1 : 0);
        t1.f0(parcel, 6, 4);
        parcel.writeInt(this.F);
        t1.h0(iG0, parcel);
    }
}

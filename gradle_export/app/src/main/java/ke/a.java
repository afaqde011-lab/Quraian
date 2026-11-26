package ke;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.common.internal.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import ri.t1;

public final class a extends re.a {
    public static final Parcelable.Creator<a> CREATOR = new k0(14);
    public final boolean A;
    public final String B;
    public final String C;
    public final boolean D;
    public final String E;
    public final ArrayList F;
    public final boolean G;

    public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
        boolean z13 = true;
        if (z11 && z12) {
            z13 = false;
        }
        d0.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z13);
        this.A = z10;
        if (z10) {
            d0.i(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.B = str;
        this.C = str2;
        this.D = z11;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.F = arrayList2;
        this.E = str3;
        this.G = z12;
    }

    public static bd.f a() {
        bd.f fVar = new bd.f();
        fVar.A = false;
        fVar.C = null;
        fVar.D = null;
        fVar.B = true;
        return fVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.A == aVar.A && d0.k(this.B, aVar.B) && d0.k(this.C, aVar.C) && this.D == aVar.D && d0.k(this.E, aVar.E) && d0.k(this.F, aVar.F) && this.G == aVar.G;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A), this.B, this.C, Boolean.valueOf(this.D), this.E, this.F, Boolean.valueOf(this.G)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.f0(parcel, 1, 4);
        parcel.writeInt(this.A ? 1 : 0);
        t1.b0(parcel, 2, this.B);
        t1.b0(parcel, 3, this.C);
        t1.f0(parcel, 4, 4);
        parcel.writeInt(this.D ? 1 : 0);
        t1.b0(parcel, 5, this.E);
        t1.c0(parcel, 6, this.F);
        t1.f0(parcel, 7, 4);
        parcel.writeInt(this.G ? 1 : 0);
        t1.h0(iG0, parcel);
    }
}

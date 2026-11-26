package ke;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.common.internal.k0;
import java.util.Arrays;
import ri.t1;

public final class k extends re.a {
    public static final Parcelable.Creator<k> CREATOR = new k0(21);
    public final String A;
    public final String B;

    public k(String str, String str2) {
        d0.i(str, "Account identifier cannot be null");
        String strTrim = str.trim();
        d0.f(strTrim, "Account identifier cannot be empty");
        this.A = strTrim;
        d0.e(str2);
        this.B = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return d0.k(this.A, kVar.A) && d0.k(this.B, kVar.B);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A, this.B});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.b0(parcel, 1, this.A);
        t1.b0(parcel, 2, this.B);
        t1.h0(iG0, parcel);
    }
}

package cf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException;
import java.util.Arrays;
import ri.t1;

public final class a0 extends re.a {
    public static final Parcelable.Creator<a0> CREATOR = new k0(4);
    public final z A;
    public final String B;

    static {
        new a0("supported", null);
        new a0("not-supported", null);
    }

    public a0(String str, String str2) {
        com.google.android.gms.common.internal.d0.h(str);
        try {
            this.A = z.a(str);
            this.B = str2;
        } catch (TokenBinding$UnsupportedTokenBindingStatusException e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return nf.b.h(this.A, a0Var.A) && nf.b.h(this.B, a0Var.B);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A, this.B});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.b0(parcel, 2, this.A.A);
        t1.b0(parcel, 3, this.B);
        t1.h0(iG0, parcel);
    }
}

package cf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzbc;

public enum c0 implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<c0> CREATOR = new k0(7);
    public final String A;

    c0(String str) {
        this.A = str;
    }

    public static c0 a(String str) throws zzbc {
        for (c0 c0Var : values()) {
            if (str.equals(c0Var.A)) {
                return c0Var;
            }
        }
        throw new zzbc(a1.b.p("User verification requirement ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.A;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.A);
    }
}

package cf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement$UnsupportedResidentKeyRequirementException;

public enum y implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<y> CREATOR = new k0(1);
    public final String A;

    y(String str) {
        this.A = str;
    }

    public static y a(String str) {
        for (y yVar : values()) {
            if (str.equals(yVar.A)) {
                return yVar;
            }
        }
        throw new ResidentKeyRequirement$UnsupportedResidentKeyRequirementException(a1.b.p("Resident key requirement ", str, " not supported"));
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

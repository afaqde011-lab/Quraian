package cf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException;

public enum c implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");

    public static final Parcelable.Creator<c> CREATOR = new k0(5);
    public final String A;

    c(String str) {
        this.A = str;
    }

    public static c a(String str) throws AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException {
        for (c cVar : values()) {
            if (str.equals(cVar.A)) {
                return cVar;
            }
        }
        throw new AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException(a1.b.p("Attestation conveyance preference ", str, " not supported"));
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

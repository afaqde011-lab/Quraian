package cf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException;

public enum z implements Parcelable {
    PRESENT("present"),
    SUPPORTED("supported"),
    NOT_SUPPORTED("not-supported");

    public static final Parcelable.Creator<z> CREATOR = new k0(3);
    public final String A;

    z(String str) {
        this.A = str;
    }

    public static z a(String str) throws TokenBinding$UnsupportedTokenBindingStatusException {
        for (z zVar : values()) {
            if (str.equals(zVar.A)) {
                return zVar;
            }
        }
        throw new TokenBinding$UnsupportedTokenBindingStatusException(a1.b.p("TokenBindingStatus ", str, " not supported"));
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

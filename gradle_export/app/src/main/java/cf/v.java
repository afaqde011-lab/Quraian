package cf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;

public final class v implements Parcelable {
    public static final v[] A = {new v("PUBLIC_KEY", 0)};
    public static final Parcelable.Creator<v> CREATOR = new ah.c(29);

    v EF5;

    public static v a(String str) throws PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException {
        for (v vVar : values()) {
            vVar.getClass();
            if (str.equals("public-key")) {
                return vVar;
            }
        }
        throw new PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException(a1.b.p("PublicKeyCredentialType ", str, " not supported"));
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) A.clone();
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return "public-key";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString("public-key");
    }
}

package cf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment$UnsupportedAttachmentException;

public enum b implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<b> CREATOR = new ah.c(16);
    public final String A;

    b(String str) {
        this.A = str;
    }

    public static b a(String str) {
        for (b bVar : values()) {
            if (str.equals(bVar.A)) {
                return bVar;
            }
        }
        throw new Attachment$UnsupportedAttachmentException(a1.b.p("Attachment ", str, " not supported"));
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

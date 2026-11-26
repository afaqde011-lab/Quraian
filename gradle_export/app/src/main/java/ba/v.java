package ba;

import android.os.Parcel;
import android.os.Parcelable;

public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new ah.c(12);
    public int A;
    public int B;
    public boolean C;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C ? 1 : 0);
    }
}

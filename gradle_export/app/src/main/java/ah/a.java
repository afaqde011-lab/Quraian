package ah;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new c(0);

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        b bVar = (b) this;
        parcel.writeParcelable(bVar.A, 0);
        parcel.writeInt(bVar.B ? 1 : 0);
    }
}

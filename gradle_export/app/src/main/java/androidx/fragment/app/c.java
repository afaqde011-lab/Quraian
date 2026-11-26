package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new ah.c(6);
    public final ArrayList A;
    public final ArrayList B;

    public c(Parcel parcel) {
        this.A = parcel.createStringArrayList();
        this.B = parcel.createTypedArrayList(b.CREATOR);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.A);
        parcel.writeTypedList(this.B);
    }
}

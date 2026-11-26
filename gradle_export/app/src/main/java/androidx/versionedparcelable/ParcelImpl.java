package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import le.b;
import va.c;
import va.d;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new b(28);
    public final d A;

    public ParcelImpl(Parcel parcel) {
        this.A = new c(parcel).h();
    }

    public ParcelImpl(d dVar) {
        this.A = dVar;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        new c(parcel).l(this.A);
    }
}

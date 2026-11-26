package o5;

import android.os.Parcel;
import android.os.Parcelable;
import z1.o;

public abstract class b implements Parcelable {
    public static final a B = new a();
    public static final Parcelable.Creator<b> CREATOR = new o(7);
    public final Parcelable A;

    public b() {
        this.A = null;
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.A = parcelable == null ? B : parcelable;
    }

    public b(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.A = parcelable == B ? null : parcelable;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.A, i10);
    }
}

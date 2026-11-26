package l0;

import android.os.Parcel;
import android.os.Parcelable;

public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new h();
    public final int A;

    public i(int i10) {
        this.A = i10;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.A == ((i) obj).A;
    }

    public final int hashCode() {
        return Integer.hashCode(this.A);
    }

    public final String toString() {
        return oi.k.l(new StringBuilder("DefaultLazyKey(index="), this.A, ')');
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A);
    }
}

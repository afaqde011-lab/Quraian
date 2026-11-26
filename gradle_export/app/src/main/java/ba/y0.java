package ba;

import android.os.Parcel;
import android.os.Parcelable;

public final class y0 extends o5.b {
    public static final Parcelable.Creator<y0> CREATOR = new z1.o(2);
    public Parcelable C;

    public y0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.C = parcel.readParcelable(classLoader == null ? p0.class.getClassLoader() : classLoader);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.C, 0);
    }
}

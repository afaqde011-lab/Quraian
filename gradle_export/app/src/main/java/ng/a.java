package ng;

import android.os.Parcel;
import android.os.Parcelable;
import z1.o;

public final class a extends o5.b {
    public static final Parcelable.Creator<a> CREATOR = new o(6);
    public boolean C;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.C = parcel.readInt() == 1;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.C ? 1 : 0);
    }
}

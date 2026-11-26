package fg;

import android.os.Parcel;
import android.os.Parcelable;
import z1.o;

public final class c extends o5.b {
    public static final Parcelable.Creator<c> CREATOR = new o(4);
    public boolean C;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            c.class.getClassLoader();
        }
        this.C = parcel.readInt() == 1;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.C ? 1 : 0);
    }
}

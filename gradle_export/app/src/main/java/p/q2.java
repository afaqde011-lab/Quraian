package p;

import android.os.Parcel;
import android.os.Parcelable;

public final class q2 extends o5.b {
    public static final Parcelable.Creator<q2> CREATOR = new z1.o(8);
    public int C;
    public boolean D;

    public q2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.C = parcel.readInt();
        this.D = parcel.readInt() != 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D ? 1 : 0);
    }
}

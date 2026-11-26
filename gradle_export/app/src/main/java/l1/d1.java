package l1;

import android.os.Parcel;
import android.os.Parcelable;

public final class d1 implements Parcelable.Creator {

    public final int f9831a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f9831a) {
            case 0:
                return new e1(parcel.readFloat());
            case 1:
                return new f1(parcel.readInt());
            default:
                return new g1(parcel.readLong());
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f9831a) {
            case 0:
                return new e1[i10];
            case 1:
                return new f1[i10];
            default:
                return new g1[i10];
        }
    }
}

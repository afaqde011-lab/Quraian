package l0;

import android.os.Parcel;
import android.os.Parcelable;

public final class h implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        return new i(parcel.readInt());
    }

    @Override
    public final Object[] newArray(int i10) {
        return new i[i10];
    }
}

package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;

public final class m implements Parcelable.Creator {

    public final int f1343a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1343a) {
            case 0:
                return new o(parcel);
            case 1:
                return new n(parcel);
            default:
                return new e2(parcel);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f1343a) {
            case 0:
                return new o[i10];
            case 1:
                return new n[i10];
            default:
                return new e2[i10];
        }
    }
}

package oe;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class c implements Parcelable.Creator {

    public final int f11948a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f11948a) {
            case 0:
                int iJ0 = rd.a.j0(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iJ0) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        rd.a.h0(i10, parcel);
                    } else {
                        intent = (Intent) rd.a.s(parcel, i10, Intent.CREATOR);
                    }
                }
                rd.a.A(iJ0, parcel);
                return new a(intent);
            default:
                return new g(parcel.readStrongBinder());
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f11948a) {
            case 0:
                return new a[i10];
            default:
                return new g[i10];
        }
    }
}

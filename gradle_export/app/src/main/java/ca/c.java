package ca;

import android.os.IBinder;
import android.os.Parcel;

public final class c implements d {

    public IBinder f3035e;

    @Override
    public final void H(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(d.f3036c);
            parcelObtain.writeStringArray(strArr);
            this.f3035e.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f3035e;
    }
}

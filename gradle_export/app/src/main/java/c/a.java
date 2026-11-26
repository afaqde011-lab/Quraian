package c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class a implements b {

    public IBinder f2571e;

    @Override
    public final IBinder asBinder() {
        return this.f2571e;
    }

    @Override
    public final void c2(int i10, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(b.f2572b);
            parcelObtain.writeInt(i10);
            parcelObtain.writeTypedObject(bundle, 0);
            this.f2571e.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}

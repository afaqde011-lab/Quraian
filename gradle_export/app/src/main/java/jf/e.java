package jf;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class e implements IInterface {

    public final IBinder f8280e;

    public final String f8281f;

    public e(IBinder iBinder, String str) {
        this.f8280e = iBinder;
        this.f8281f = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f8280e;
    }

    public final Parcel d() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f8281f);
        return parcelObtain;
    }

    public final void f(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f8280e.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}

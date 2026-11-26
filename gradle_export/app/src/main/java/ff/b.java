package ff;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class b implements d, IInterface {

    public final IBinder f5639e;

    public b(IBinder iBinder) {
        this.f5639e = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f5639e;
    }

    public final Parcel d(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f5639e.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e3) {
                parcelObtain.recycle();
                throw e3;
            }
        } catch (Throwable th2) {
            parcel.recycle();
            throw th2;
        }
    }
}

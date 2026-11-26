package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class c extends Binder implements b {

    public static final int f2573f = 0;

    public final d f2574e;

    public c(d dVar) {
        this.f2574e = dVar;
        attachInterface(this, b.f2572b);
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    @Override
    public final void c2(int i10, Bundle bundle) {
        this.f2574e.a(i10, bundle);
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String str = b.f2572b;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        c2(parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
        return true;
    }
}

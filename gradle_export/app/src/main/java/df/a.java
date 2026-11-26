package df;

import android.os.IBinder;
import android.os.IInterface;

public final class a implements c, IInterface {

    public final IBinder f4874e;

    public a(IBinder iBinder) {
        this.f4874e = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f4874e;
    }
}

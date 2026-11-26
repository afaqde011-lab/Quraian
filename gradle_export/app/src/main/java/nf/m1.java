package nf;

import android.os.IBinder;
import android.os.IInterface;

public final class m1 implements IInterface {

    public final IBinder f11246e;

    public final String f11247f;

    public m1(IBinder iBinder, String str) {
        this.f11246e = iBinder;
        this.f11247f = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f11246e;
    }
}

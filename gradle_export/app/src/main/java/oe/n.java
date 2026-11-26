package oe;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;

public final class n {

    public final int f11950a;

    public final xf.g f11951b = new xf.g();

    public final int f11952c;

    public final Bundle f11953d;

    public final int f11954e;

    public n(int i10, int i11, Bundle bundle, int i12) {
        this.f11954e = i12;
        this.f11950a = i10;
        this.f11952c = i11;
        this.f11953d = bundle;
    }

    public final boolean a() {
        switch (this.f11954e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + zztVar.toString());
        }
        this.f11951b.a(zztVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f11951b.b(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f11952c + " id=" + this.f11950a + " oneWay=" + a() + "}";
    }
}

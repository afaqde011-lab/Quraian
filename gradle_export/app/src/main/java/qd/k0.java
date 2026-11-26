package qd;

import android.os.Parcel;
import com.google.android.gms.internal.play_billing.q4;

public final class k0 extends bh.a {

    public final q4 f12901f;

    public k0(q4 q4Var) {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback", 1);
        this.f12901f = q4Var;
    }

    @Override
    public final boolean f(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        int i11 = parcel.readInt();
        bh.a.g2(parcel);
        this.f12901f.a(Integer.valueOf(i11));
        return true;
    }
}

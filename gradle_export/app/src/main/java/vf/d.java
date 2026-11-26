package vf;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.n0;
import com.google.android.gms.internal.measurement.x;

public final class d extends x {
    public final void p2(g gVar, n0 n0Var) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f3912g);
        int i10 = kf.b.f9656a;
        parcelObtain.writeInt(1);
        gVar.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(n0Var.asBinder());
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            this.f3911f.transact(12, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }
}

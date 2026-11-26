package androidx.media3.common;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public final class g extends Binder {

    public static final int f1210f = IBinder.getSuggestedMaxIpcSizeBytes();

    public final fh.t0 f1211e;

    public g(List list) {
        this.f1211e = fh.t0.o(list);
    }

    public static fh.t0 a(IBinder iBinder) {
        int i10;
        if (iBinder instanceof g) {
            return ((g) iBinder).f1211e;
        }
        fh.q0 q0VarM = fh.t0.m();
        int i11 = 0;
        int i12 = 1;
        while (i12 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i11);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i10 = parcelObtain2.readInt();
                        if (i10 == 1) {
                            Bundle bundle = parcelObtain2.readBundle();
                            bundle.getClass();
                            q0VarM.c(bundle);
                            i11++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i12 = i10;
                } catch (RemoteException e3) {
                    throw new RuntimeException(e3);
                }
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        }
        return q0VarM.g();
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        if (parcel2 == null) {
            return false;
        }
        fh.t0 t0Var = this.f1211e;
        int size = t0Var.size();
        int i12 = parcel.readInt();
        while (i12 < size && parcel2.dataSize() < f1210f) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) t0Var.get(i12));
            i12++;
        }
        parcel2.writeInt(i12 < size ? 2 : 0);
        return true;
    }
}

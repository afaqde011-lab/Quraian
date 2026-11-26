package tf;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class v2 extends com.google.android.gms.internal.measurement.y implements g0 {

    public final AtomicReference f14747e;

    public v2(c3 c3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f14747e = atomicReference;
    }

    @Override
    public final void F1(List list) {
        AtomicReference atomicReference = this.f14747e;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }

    @Override
    public final boolean d(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(n3.CREATOR);
        com.google.android.gms.internal.measurement.z.d(parcel);
        F1(arrayListCreateTypedArrayList);
        return true;
    }
}

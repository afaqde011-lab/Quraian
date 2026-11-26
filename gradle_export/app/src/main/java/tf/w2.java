package tf;

import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

public final class w2 extends com.google.android.gms.internal.measurement.y implements i0 {

    public final AtomicReference f14756e;

    public final c3 f14757f;

    public w2(c3 c3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f14756e = atomicReference;
        this.f14757f = c3Var;
    }

    @Override
    public final boolean d(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 2) {
            return false;
        }
        s3 s3Var = (s3) com.google.android.gms.internal.measurement.z.a(parcel, s3.CREATOR);
        com.google.android.gms.internal.measurement.z.d(parcel);
        h0(s3Var);
        return true;
    }

    @Override
    public final void h0(s3 s3Var) {
        AtomicReference atomicReference = this.f14756e;
        synchronized (atomicReference) {
            q0 q0Var = ((h1) this.f14757f.B).F;
            h1.g(q0Var);
            q0Var.O.c(Integer.valueOf(s3Var.A.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(s3Var);
            atomicReference.notifyAll();
        }
    }
}

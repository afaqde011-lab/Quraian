package k9;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class v2 extends Binder implements o {

    public final WeakReference f9536e;

    public final Handler f9537f;

    public final Set f9538g;

    public v2(h1 h1Var) {
        attachInterface(this, "androidx.media3.session.IMediaSessionService");
        this.f9536e = new WeakReference(h1Var);
        this.f9537f = new Handler(h1Var.getApplicationContext().getMainLooper());
        this.f9538g = Collections.synchronizedSet(new HashSet());
    }

    public static o d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSessionService");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof o)) {
            return (o) iInterfaceQueryLocalInterface;
        }
        n nVar = new n();
        nVar.f9377e = iBinder;
        return nVar;
    }

    @Override
    public final void E(k kVar, Bundle bundle) {
        if (kVar == null || bundle == null) {
            com.google.android.gms.internal.measurement.z3.v(kVar);
            return;
        }
        try {
            g gVarA = g.a(bundle);
            String str = gVarA.f9301c;
            h1 h1Var = (h1) this.f9536e.get();
            if (h1Var == null) {
                com.google.android.gms.internal.measurement.z3.v(kVar);
                return;
            }
            int callingPid = Binder.getCallingPid();
            int callingUid = Binder.getCallingUid();
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = gVarA.f9302d;
            }
            if (com.google.android.gms.internal.measurement.z3.q(callingUid, h1Var, str) == 0) {
                l9.g0 g0Var = new l9.g0(str, callingPid, callingUid);
                boolean zB = l9.h.a(h1Var.getApplicationContext()).b(g0Var);
                this.f9538g.add(kVar);
                try {
                    this.f9537f.post(new t1(1, this, kVar, g0Var, gVarA, zB));
                    return;
                } finally {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            }
            e7.a.m("MSessionService", "Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
            com.google.android.gms.internal.measurement.z3.v(kVar);
        } catch (RuntimeException e3) {
            e7.a.n("MSessionService", "Ignoring malformed Bundle for ConnectionRequest", e3);
            com.google.android.gms.internal.measurement.z3.v(kVar);
        }
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSessionService");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSessionService");
            return true;
        }
        if (i10 != 3001) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        E(d1.d(parcel.readStrongBinder()), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }
}

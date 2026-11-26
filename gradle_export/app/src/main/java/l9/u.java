package l9;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;
import k9.y0;

public final class u extends Binder implements b {

    public static final int f10181f = 0;

    public final WeakReference f10182e;

    public u(y0 y0Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f10182e = new WeakReference(y0Var);
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    @Override
    public final void e(int i10) {
        y0 y0Var = (y0) this.f10182e.get();
        if (y0Var != null) {
            y0Var.c(9, Integer.valueOf(i10));
        }
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 3) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            z1(parcel.readInt() != 0 ? j0.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
        if (i10 == 9) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            e(parcel.readInt());
            return true;
        }
        if (i10 == 1598968902) {
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        WeakReference weakReference = this.f10182e;
        switch (i10) {
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                boolean z10 = parcel.readInt() != 0;
                y0 y0Var = (y0) weakReference.get();
                if (y0Var != null) {
                    y0Var.c(11, Boolean.valueOf(z10));
                }
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                u1(parcel.readInt());
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                y0 y0Var2 = (y0) weakReference.get();
                if (y0Var2 != null) {
                    y0Var2.c(13, null);
                    return true;
                }
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    @Override
    public final void u1(int i10) {
        y0 y0Var = (y0) this.f10182e.get();
        if (y0Var != null) {
            y0Var.c(12, Integer.valueOf(i10));
        }
    }

    @Override
    public final void z1(j0 j0Var) {
        y0 y0Var = (y0) this.f10182e.get();
        if (y0Var != null) {
            y0Var.c(2, j0Var);
        }
    }
}

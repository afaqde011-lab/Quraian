package l9;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;

public final class b0 extends Binder implements d {

    public static final int f10123f = 0;

    public final WeakReference f10124e;

    public b0(c0 c0Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f10124e = new WeakReference(c0Var);
    }

    @Override
    public final void P(b bVar) {
        c0 c0Var = (c0) this.f10124e.get();
        if (c0Var == null || bVar == null) {
            return;
        }
        c0Var.f10131f.unregister(bVar);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (c0Var.f10129d) {
        }
    }

    @Override
    public final void a2(b bVar) {
        c0 c0Var = (c0) this.f10124e.get();
        if (c0Var == null || bVar == null) {
            return;
        }
        c0Var.f10131f.register(bVar, new g0("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (c0Var.f10129d) {
        }
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    @Override
    public final j0 getPlaybackState() {
        long j9;
        c0 c0Var = (c0) this.f10124e.get();
        if (c0Var == null) {
            return null;
        }
        j0 j0Var = c0Var.f10132g;
        y yVar = c0Var.f10134i;
        if (j0Var != null) {
            float f3 = j0Var.D;
            long j10 = j0Var.H;
            int i10 = j0Var.A;
            long j11 = j0Var.B;
            long jA = -1;
            if (j11 != -1 && ((i10 == 3 || i10 == 4 || i10 == 5) && j10 > 0)) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j12 = ((long) (f3 * (jElapsedRealtime - j10))) + j11;
                if (yVar != null && yVar.A.containsKey("android.media.metadata.DURATION")) {
                    jA = yVar.a("android.media.metadata.DURATION");
                }
                if (jA < 0 || j12 <= jA) {
                    j9 = j12 < 0 ? 0L : j12;
                } else {
                    j9 = jA;
                }
                ArrayList arrayList = new ArrayList();
                long j13 = j0Var.C;
                long j14 = j0Var.E;
                int i11 = j0Var.F;
                CharSequence charSequence = j0Var.G;
                AbstractCollection abstractCollection = j0Var.I;
                if (abstractCollection != null) {
                    arrayList.addAll(abstractCollection);
                }
                return new j0(j0Var.A, j9, j13, j0Var.D, j14, i11, charSequence, jElapsedRealtime, arrayList, j0Var.J, j0Var.K);
            }
        }
        return j0Var;
    }

    @Override
    public final int getRepeatMode() {
        c0 c0Var = (c0) this.f10124e.get();
        if (c0Var != null) {
            return c0Var.f10135j;
        }
        return -1;
    }

    @Override
    public final int h() {
        c0 c0Var = (c0) this.f10124e.get();
        if (c0Var != null) {
            return c0Var.f10136k;
        }
        return -1;
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        Bundle bundle;
        b bVar = null;
        bundle = null;
        Bundle bundle2 = null;
        b bVar2 = null;
        if (i10 == 3) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) {
                    a aVar = new a();
                    aVar.f10121e = strongBinder;
                    bVar = aVar;
                } else {
                    bVar = (b) iInterfaceQueryLocalInterface;
                }
            }
            a2(bVar);
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 4) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof b)) {
                    a aVar2 = new a();
                    aVar2.f10121e = strongBinder2;
                    bVar2 = aVar2;
                } else {
                    bVar2 = (b) iInterfaceQueryLocalInterface2;
                }
            }
            P(bVar2);
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 28) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            j0 playbackState = getPlaybackState();
            parcel2.getClass();
            parcel2.writeNoException();
            if (playbackState == null) {
                parcel2.writeInt(0);
                return true;
            }
            parcel2.writeInt(1);
            playbackState.writeToParcel(parcel2, 1);
            return true;
        }
        if (i10 == 37) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            int repeatMode = getRepeatMode();
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(repeatMode);
            return true;
        }
        if (i10 == 45) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            i();
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(0);
            return true;
        }
        if (i10 == 47) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            int iH = h();
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(iH);
            return true;
        }
        if (i10 != 50) {
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        c0 c0Var = (c0) this.f10124e.get();
        if (c0Var != null && (bundle = c0Var.f10130e) != null) {
            bundle2 = new Bundle(bundle);
        }
        parcel2.getClass();
        parcel2.writeNoException();
        if (bundle2 == null) {
            parcel2.writeInt(0);
            return true;
        }
        parcel2.writeInt(1);
        bundle2.writeToParcel(parcel2, 1);
        return true;
    }
}

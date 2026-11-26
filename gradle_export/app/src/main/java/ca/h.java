package ca;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

public final class h extends Binder implements e {

    public final MultiInstanceInvalidationService f3045e;

    public h(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f3045e = multiInstanceInvalidationService;
        attachInterface(this, e.f3037d);
    }

    @Override
    public final void C1(String[] strArr, int i10) {
        kotlin.jvm.internal.m.e(strArr, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f3045e;
        synchronized (multiInstanceInvalidationService.C) {
            try {
                String str = (String) multiInstanceInvalidationService.B.get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.C.beginBroadcast();
                for (int i11 = 0; i11 < iBeginBroadcast; i11++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.C.getBroadcastCookie(i11);
                        kotlin.jvm.internal.m.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.B.get(num);
                        if (i10 != iIntValue && str.equals(str2)) {
                            try {
                                ((d) multiInstanceInvalidationService.C.getBroadcastItem(i11)).H(strArr);
                            } catch (RemoteException e3) {
                                Log.w("ROOM", "Error invoking a remote callback", e3);
                            }
                        }
                    } catch (Throwable th2) {
                        multiInstanceInvalidationService.C.finishBroadcast();
                        throw th2;
                    }
                }
                multiInstanceInvalidationService.C.finishBroadcast();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String str = e.f3037d;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        d dVar = null;
        d dVar2 = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                C1(parcel.createStringArray(), parcel.readInt());
                return true;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(d.f3036c);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) {
                    c cVar = new c();
                    cVar.f3035e = strongBinder;
                    dVar2 = cVar;
                } else {
                    dVar2 = (d) iInterfaceQueryLocalInterface;
                }
            }
            int i12 = parcel.readInt();
            kotlin.jvm.internal.m.e(dVar2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f3045e;
            synchronized (multiInstanceInvalidationService.C) {
                multiInstanceInvalidationService.C.unregister(dVar2);
            }
            parcel2.writeNoException();
            return true;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(d.f3036c);
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof d)) {
                c cVar2 = new c();
                cVar2.f3035e = strongBinder2;
                dVar = cVar2;
            } else {
                dVar = (d) iInterfaceQueryLocalInterface2;
            }
        }
        String string = parcel.readString();
        kotlin.jvm.internal.m.e(dVar, "callback");
        int i13 = 0;
        if (string != null) {
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f3045e;
            synchronized (multiInstanceInvalidationService2.C) {
                try {
                    int i14 = multiInstanceInvalidationService2.A + 1;
                    multiInstanceInvalidationService2.A = i14;
                    if (multiInstanceInvalidationService2.C.register(dVar, Integer.valueOf(i14))) {
                        multiInstanceInvalidationService2.B.put(Integer.valueOf(i14), string);
                        i13 = i14;
                    } else {
                        multiInstanceInvalidationService2.A--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        parcel2.writeNoException();
        parcel2.writeInt(i13);
        return true;
    }
}

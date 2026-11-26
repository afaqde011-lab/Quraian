package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {
    public WeakReference A;

    @Override
    public final void onReceiveResult(int i10, Bundle bundle) {
        d dVar;
        h hVar = (h) this.A.get();
        if (hVar == null || bundle == null) {
            return;
        }
        synchronized (hVar.f497b) {
            MediaSessionCompat$Token mediaSessionCompat$Token = hVar.f500e;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            int i11 = o.f503f;
            if (binder == null) {
                dVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) {
                    c cVar = new c();
                    cVar.f489e = binder;
                    dVar = cVar;
                } else {
                    dVar = (d) iInterfaceQueryLocalInterface;
                }
            }
            synchronized (mediaSessionCompat$Token.A) {
                mediaSessionCompat$Token.C = dVar;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token2 = hVar.f500e;
            va.d dVarO = va.a.O(bundle);
            synchronized (mediaSessionCompat$Token2.A) {
                mediaSessionCompat$Token2.D = dVarO;
            }
            hVar.a();
        }
    }
}

package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.RemoteException;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

public final class h {

    public final MediaController f496a;

    public final Object f497b = new Object();

    public final ArrayList f498c = new ArrayList();

    public final HashMap f499d = new HashMap();

    public final MediaSessionCompat$Token f500e;

    public h(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f500e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.B);
        this.f496a = mediaController;
        if (mediaSessionCompat$Token.a() == null) {
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(null);
            mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.A = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
        }
    }

    public final void a() {
        MediaSessionCompat$Token mediaSessionCompat$Token = this.f500e;
        if (mediaSessionCompat$Token.a() == null) {
            return;
        }
        ArrayList<androidx.mediarouter.app.s> arrayList = this.f498c;
        for (androidx.mediarouter.app.s sVar : arrayList) {
            g gVar = new g(sVar);
            this.f499d.put(sVar, gVar);
            sVar.f1805c = gVar;
            try {
                mediaSessionCompat$Token.a().s(gVar);
                sVar.e(13, null, null);
            } catch (RemoteException e3) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e3);
            }
        }
        arrayList.clear();
    }

    public final void b(androidx.mediarouter.app.s sVar) {
        this.f496a.unregisterCallback(sVar.f1803a);
        synchronized (this.f497b) {
            if (this.f500e.a() != null) {
                try {
                    g gVar = (g) this.f499d.remove(sVar);
                    if (gVar != null) {
                        sVar.f1805c = null;
                        this.f500e.a().e0(gVar);
                    }
                } catch (RemoteException e3) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e3);
                }
            } else {
                this.f498c.remove(sVar);
            }
        }
    }
}

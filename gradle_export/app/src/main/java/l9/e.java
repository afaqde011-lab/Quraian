package l9;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import k9.f2;
import k9.v0;
import k9.x0;
import k9.z0;

public final class e extends MediaBrowser.ConnectionCallback {

    public final x0 f10137a;

    public e(x0 x0Var) {
        this.f10137a = x0Var;
    }

    @Override
    public final void onConnected() {
        d dVar;
        x0 x0Var = this.f10137a;
        f fVar = (f) x0Var.C;
        int i10 = 0;
        if (fVar != null) {
            f2 f2Var = fVar.f10141d;
            MediaBrowser mediaBrowser = fVar.f10139b;
            try {
                Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        Bundle bundle = fVar.f10140c;
                        h7.b bVar = new h7.b();
                        bVar.A = new Messenger(binder);
                        bVar.B = bundle;
                        fVar.f10143f = bVar;
                        Messenger messenger = new Messenger(f2Var);
                        fVar.f10144g = messenger;
                        f2Var.getClass();
                        f2Var.f9290c = new WeakReference(messenger);
                        try {
                            Context context = fVar.f10138a;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("data_package_name", context.getPackageName());
                            bundle2.putInt("data_calling_pid", Process.myPid());
                            bundle2.putBundle("data_root_hints", (Bundle) bVar.B);
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 6;
                            messageObtain.arg1 = 1;
                            messageObtain.setData(bundle2);
                            messageObtain.replyTo = messenger;
                            ((Messenger) bVar.A).send(messageObtain);
                        } catch (RemoteException unused) {
                            e7.a.h("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    IBinder binder2 = extras.getBinder("extra_session_binder");
                    int i11 = b0.f10123f;
                    if (binder2 == null) {
                        dVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) {
                            c cVar = new c();
                            cVar.f10125e = binder2;
                            dVar = cVar;
                        } else {
                            dVar = (d) iInterfaceQueryLocalInterface;
                        }
                    }
                    if (dVar != null) {
                        fVar.f10145h = new e0(mediaBrowser.getSessionToken(), dVar);
                    }
                }
            } catch (IllegalStateException e3) {
                e7.a.e("MediaBrowserCompat", "Unexpected IllegalStateException", e3);
            }
        }
        z0 z0Var = (z0) x0Var.D;
        h hVar = z0Var.f9566j;
        if (hVar != null) {
            f fVar2 = (f) hVar.f10149a;
            if (fVar2.f10145h == null) {
                fVar2.f10145h = new e0(fVar2.f10139b.getSessionToken(), null);
            }
            e0 e0Var = fVar2.f10145h;
            k9.u uVar = z0Var.f9558b;
            uVar.b(new ji.a(z0Var, e0Var, 10));
            uVar.f9523f.postDelayed(new v0(z0Var, i10), 500L);
        }
    }

    @Override
    public final void onConnectionFailed() {
        x0 x0Var = this.f10137a;
        f fVar = (f) x0Var.C;
        if (fVar != null) {
            fVar.getClass();
        }
        ((z0) x0Var.D).f9558b.release();
    }

    @Override
    public final void onConnectionSuspended() {
        x0 x0Var = this.f10137a;
        f fVar = (f) x0Var.C;
        if (fVar != null) {
            fVar.f10143f = null;
            fVar.f10144g = null;
            fVar.f10145h = null;
            f2 f2Var = fVar.f10141d;
            f2Var.getClass();
            f2Var.f9290c = new WeakReference(null);
        }
        ((z0) x0Var.D).f9558b.release();
    }
}

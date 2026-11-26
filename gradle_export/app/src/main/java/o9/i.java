package o9;

import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

public final class i extends r {

    public final String f11814a;

    public final h f11815b;

    public i(String str, h hVar) {
        this.f11814a = str;
        this.f11815b = hVar;
    }

    @Override
    public final void f(int i10) {
        h hVar;
        String str = this.f11814a;
        if (str == null || (hVar = this.f11815b) == null) {
            return;
        }
        Messenger messenger = hVar.f11807h;
        MediaRouter2.RoutingController routingController = hVar.f11806g;
        if (routingController == null || routingController.isReleased() || messenger == null) {
            return;
        }
        int andIncrement = hVar.l.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 7;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i10);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = hVar.f11808i;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e3) {
            Log.e("MR2Provider", "Could not send control request to service.", e3);
        }
    }

    @Override
    public final void i(int i10) {
        h hVar;
        String str = this.f11814a;
        if (str == null || (hVar = this.f11815b) == null) {
            return;
        }
        Messenger messenger = hVar.f11807h;
        MediaRouter2.RoutingController routingController = hVar.f11806g;
        if (routingController == null || routingController.isReleased() || messenger == null) {
            return;
        }
        int andIncrement = hVar.l.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 8;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i10);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = hVar.f11808i;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e3) {
            Log.e("MR2Provider", "Could not send control request to service.", e3);
        }
    }
}

package o9;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class h extends p {

    public final String f11805f;

    public final MediaRouter2.RoutingController f11806g;

    public final Messenger f11807h;

    public final Messenger f11808i;

    public final Handler f11810k;

    public m f11812o;

    public final l f11813p;

    public final SparseArray f11809j = new SparseArray();
    public final AtomicInteger l = new AtomicInteger(1);
    public final m9.f m = new m9.f(this, 6);

    public int f11811n = -1;

    public h(l lVar, MediaRouter2.RoutingController routingController, String str) {
        this.f11813p = lVar;
        this.f11806g = routingController;
        this.f11805f = str;
        int i10 = l.T;
        Bundle controlHints = routingController.getControlHints();
        Messenger messenger = controlHints == null ? null : (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
        this.f11807h = messenger;
        this.f11808i = messenger != null ? new Messenger(new androidx.mediarouter.app.d(this)) : null;
        this.f11810k = new Handler(Looper.getMainLooper());
    }

    @Override
    public final void d() {
        this.f11806g.release();
    }

    @Override
    public final void f(int i10) {
        MediaRouter2.RoutingController routingController = this.f11806g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i10);
        this.f11811n = i10;
        Handler handler = this.f11810k;
        m9.f fVar = this.m;
        handler.removeCallbacks(fVar);
        handler.postDelayed(fVar, 1000L);
    }

    @Override
    public final void i(int i10) {
        MediaRouter2.RoutingController routingController = this.f11806g;
        if (routingController == null) {
            return;
        }
        int volume = this.f11811n;
        if (volume < 0) {
            volume = routingController.getVolume();
        }
        int iMax = Math.max(0, Math.min(volume + i10, routingController.getVolumeMax()));
        this.f11811n = iMax;
        routingController.setVolume(iMax);
        Handler handler = this.f11810k;
        m9.f fVar = this.m;
        handler.removeCallbacks(fVar);
        handler.postDelayed(fVar, 1000L);
    }

    @Override
    public final void m(String str) {
        if (str == null || str.isEmpty()) {
            Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
            return;
        }
        MediaRoute2Info mediaRoute2InfoH = this.f11813p.h(str);
        if (mediaRoute2InfoH == null) {
            Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
        } else {
            this.f11806g.selectRoute(mediaRoute2InfoH);
        }
    }

    @Override
    public final void n(String str) {
        if (str == null || str.isEmpty()) {
            Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
            return;
        }
        MediaRoute2Info mediaRoute2InfoH = this.f11813p.h(str);
        if (mediaRoute2InfoH == null) {
            Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
        } else {
            this.f11806g.deselectRoute(mediaRoute2InfoH);
        }
    }

    @Override
    public final void o(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
            return;
        }
        String str = (String) arrayList.get(0);
        l lVar = this.f11813p;
        MediaRoute2Info mediaRoute2InfoH = lVar.h(str);
        if (mediaRoute2InfoH != null) {
            lVar.I.transferTo(mediaRoute2InfoH);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
    }
}

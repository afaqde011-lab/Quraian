package o9;

import android.media.MediaRouter2;

public final class g extends MediaRouter2.ControllerCallback {

    public final l f11803a;

    public g(l lVar) {
        this.f11803a = lVar;
    }

    @Override
    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.f11803a.j(routingController);
    }
}

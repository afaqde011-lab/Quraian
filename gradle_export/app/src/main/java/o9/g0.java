package o9;

import android.media.MediaRouter;

public final class g0 extends MediaRouter.VolumeCallback {

    public final h0 f11804a;

    public g0(h0 h0Var) {
        this.f11804a = h0Var;
    }

    @Override
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.f11804a.getClass();
        k0 k0VarM = h0.m(routeInfo);
        if (k0VarM != null) {
            k0VarM.f11823a.j(i10);
        }
    }

    @Override
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.f11804a.getClass();
        k0 k0VarM = h0.m(routeInfo);
        if (k0VarM != null) {
            k0VarM.f11823a.k(i10);
        }
    }
}

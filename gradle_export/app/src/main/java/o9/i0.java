package o9;

import android.media.MediaRouter;

public final class i0 extends r {

    public final MediaRouter.RouteInfo f11816a;

    public i0(MediaRouter.RouteInfo routeInfo) {
        this.f11816a = routeInfo;
    }

    @Override
    public final void f(int i10) {
        this.f11816a.requestSetVolume(i10);
    }

    @Override
    public final void i(int i10) {
        this.f11816a.requestUpdateVolume(i10);
    }
}

package o9;

import android.media.MediaRouter2;
import java.util.List;

public final class j extends MediaRouter2.RouteCallback {

    public final int f11817a;

    public final l f11818b;

    public j(l lVar, int i10) {
        this.f11817a = i10;
        this.f11818b = lVar;
    }

    @Override
    public void onRoutesAdded(List list) {
        switch (this.f11817a) {
            case 0:
                this.f11818b.i();
                break;
            default:
                super.onRoutesAdded(list);
                break;
        }
    }

    @Override
    public void onRoutesChanged(List list) {
        switch (this.f11817a) {
            case 0:
                this.f11818b.i();
                break;
            default:
                super.onRoutesChanged(list);
                break;
        }
    }

    @Override
    public void onRoutesRemoved(List list) {
        switch (this.f11817a) {
            case 0:
                this.f11818b.i();
                break;
            default:
                super.onRoutesRemoved(list);
                break;
        }
    }

    @Override
    public void onRoutesUpdated(List list) {
        switch (this.f11817a) {
            case 1:
                this.f11818b.i();
                break;
            default:
                super.onRoutesUpdated(list);
                break;
        }
    }
}

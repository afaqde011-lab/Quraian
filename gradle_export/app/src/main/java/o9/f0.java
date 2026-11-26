package o9;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class f0 extends MediaRouter.Callback {

    public final h0 f11802a;

    public f0(h0 h0Var) {
        this.f11802a = h0Var;
    }

    @Override
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        h0 h0Var = this.f11802a;
        if (h0Var.h(routeInfo)) {
            h0Var.r();
        }
    }

    @Override
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i10;
        h0 h0Var = this.f11802a;
        h0Var.getClass();
        if (h0.m(routeInfo) != null || (i10 = h0Var.i(routeInfo)) < 0) {
            return;
        }
        j0 j0Var = (j0) h0Var.Q.get(i10);
        oj.q qVar = new oj.q(j0Var.f11820b, h0Var.l(j0Var.f11819a));
        h0Var.n(j0Var, qVar);
        j0Var.f11821c = qVar.v();
        h0Var.r();
    }

    @Override
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i10) {
        this.f11802a.getClass();
    }

    @Override
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        h0 h0Var = this.f11802a;
        int i10 = h0Var.i(routeInfo);
        if (i10 >= 0) {
            j0 j0Var = (j0) h0Var.Q.get(i10);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != j0Var.f11821c.f11825a.getInt("presentationDisplayId", -1)) {
                m mVar = j0Var.f11821c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (mVar == null) {
                    throw new IllegalArgumentException("descriptor must not be null");
                }
                Bundle bundle = new Bundle(mVar.f11825a);
                ArrayList arrayListC = mVar.c();
                ArrayList arrayListB = mVar.b();
                HashSet hashSetA = mVar.a();
                bundle.putInt("presentationDisplayId", displayId);
                bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListB));
                bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListC));
                bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetA));
                j0Var.f11821c = new m(bundle);
                h0Var.r();
            }
        }
    }

    @Override
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i10;
        h0 h0Var = this.f11802a;
        h0Var.getClass();
        if (h0.m(routeInfo) != null || (i10 = h0Var.i(routeInfo)) < 0) {
            return;
        }
        h0Var.Q.remove(i10);
        h0Var.r();
    }

    @Override
    public final void onRouteSelected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
        b0 b0Var;
        h0 h0Var = this.f11802a;
        if (routeInfo != h0Var.J.getSelectedRoute(8388611)) {
            return;
        }
        k0 k0VarM = h0.m(routeInfo);
        if (k0VarM != null) {
            k0VarM.f11823a.l(false);
            return;
        }
        int i11 = h0Var.i(routeInfo);
        if (i11 >= 0) {
            j0 j0Var = (j0) h0Var.Q.get(i11);
            f fVar = h0Var.I;
            String str = j0Var.f11820b;
            fVar.f11778a.removeMessages(262);
            a0 a0VarD = fVar.d(fVar.f11795t);
            if (a0VarD != null) {
                Iterator it = a0VarD.f11730b.iterator();
                do {
                    if (!it.hasNext()) {
                        b0Var = null;
                        break;
                    }
                    b0Var = (b0) it.next();
                } while (!b0Var.f11738b.equals(str));
                if (b0Var != null) {
                    b0Var.l(false);
                }
            }
        }
    }

    @Override
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.f11802a.getClass();
    }

    @Override
    public final void onRouteUnselected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
        this.f11802a.getClass();
    }

    @Override
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i10;
        h0 h0Var = this.f11802a;
        h0Var.getClass();
        if (h0.m(routeInfo) != null || (i10 = h0Var.i(routeInfo)) < 0) {
            return;
        }
        j0 j0Var = (j0) h0Var.Q.get(i10);
        int volume = routeInfo.getVolume();
        if (volume != j0Var.f11821c.f11825a.getInt("volume")) {
            m mVar = j0Var.f11821c;
            new ArrayList();
            new ArrayList();
            new HashSet();
            if (mVar == null) {
                throw new IllegalArgumentException("descriptor must not be null");
            }
            Bundle bundle = new Bundle(mVar.f11825a);
            ArrayList arrayListC = mVar.c();
            ArrayList arrayListB = mVar.b();
            HashSet hashSetA = mVar.a();
            bundle.putInt("volume", volume);
            bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListB));
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListC));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetA));
            j0Var.f11821c = new m(bundle);
            h0Var.r();
        }
    }
}

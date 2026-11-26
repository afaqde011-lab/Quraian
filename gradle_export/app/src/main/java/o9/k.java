package o9;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import java.util.List;

public final class k extends MediaRouter2.TransferCallback {

    public final l f11822a;

    public k(l lVar) {
        this.f11822a = lVar;
    }

    @Override
    public final void onStop(MediaRouter2.RoutingController routingController) {
        l lVar = this.f11822a;
        lVar.S = null;
        r rVar = (r) lVar.K.remove(routingController);
        if (rVar == null) {
            Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
            return;
        }
        f fVar = (f) lVar.J.B;
        if (rVar != fVar.f11782e) {
            int i10 = f.G;
            return;
        }
        b0 b0VarC = fVar.c();
        if (fVar.h() != b0VarC) {
            fVar.m(b0VarC, 2, true);
        }
    }

    @Override
    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        l lVar = this.f11822a;
        hf.c cVar = lVar.J;
        b0 b0Var = null;
        lVar.S = null;
        ArrayMap arrayMap = lVar.K;
        arrayMap.remove(routingController);
        if (routingController2 == lVar.I.getSystemController()) {
            f fVar = (f) cVar.B;
            b0 b0VarC = fVar.c();
            if (fVar.h() != b0VarC) {
                fVar.m(b0VarC, 3, true);
                return;
            }
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
            return;
        }
        String id2 = selectedRoutes.get(0).getId();
        arrayMap.put(routingController2, new h(lVar, routingController2, id2));
        f fVar2 = (f) cVar.B;
        for (b0 b0Var2 : fVar2.f11787j) {
            if (b0Var2.c() == fVar2.f11794s && TextUtils.equals(id2, b0Var2.f11738b)) {
                b0Var = b0Var2;
                break;
            }
        }
        if (b0Var == null) {
            Log.w("AxMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id2);
        } else {
            fVar2.m(b0Var, 3, true);
        }
        lVar.j(routingController2);
    }

    @Override
    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        this.f11822a.S = null;
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}

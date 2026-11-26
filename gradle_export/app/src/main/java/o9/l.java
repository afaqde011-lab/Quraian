package o9;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class l extends t {
    public static final int T = 0;
    public final MediaRouter2 I;
    public final hf.c J;
    public final ArrayMap K;
    public final MediaRouter2.RouteCallback L;
    public final k M;
    public final g N;
    public final androidx.media3.cast.s O;
    public boolean P;
    public ArrayList Q;
    public final ArrayMap R;
    public String S;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public l(Context context, hf.c cVar) {
        super(context, null);
        this.K = new ArrayMap();
        this.M = new k(this);
        this.N = new g(this);
        this.Q = new ArrayList();
        this.R = new ArrayMap();
        this.I = MediaRouter2.getInstance(context);
        this.J = cVar;
        this.O = new androidx.media3.cast.s(new Handler(Looper.getMainLooper()));
        if (Build.VERSION.SDK_INT >= 34) {
            this.L = new j(this, 1);
        } else {
            this.L = new j(this, 0);
        }
    }

    @Override
    public final p a(String str, s sVar) {
        Iterator it = this.K.entrySet().iterator();
        while (it.hasNext()) {
            h hVar = (h) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, hVar.f11805f)) {
                return hVar;
            }
        }
        return null;
    }

    @Override
    public final r b(String str) {
        return new i((String) this.R.get(str), null);
    }

    @Override
    public final r c(String str, String str2) {
        String str3 = (String) this.R.get(str);
        for (h hVar : this.K.values()) {
            m mVar = hVar.f11812o;
            if (TextUtils.equals(str2, mVar != null ? mVar.d() : hVar.f11806g.getId())) {
                return new i(str3, hVar);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new i(str3, null);
    }

    @Override
    public final void e(n nVar) {
        ArrayList<String> arrayList;
        u uVar;
        RouteDiscoveryPreference routeDiscoveryPreferenceBuild;
        int i10 = c0.f11757c == null ? 0 : c0.c().C;
        g gVar = this.N;
        k kVar = this.M;
        MediaRouter2.RouteCallback routeCallback = this.L;
        MediaRouter2 mediaRouter2 = this.I;
        if (i10 <= 0) {
            mediaRouter2.unregisterRouteCallback(routeCallback);
            mediaRouter2.unregisterTransferCallback(kVar);
            mediaRouter2.unregisterControllerCallback(gVar);
            return;
        }
        e0 e0Var = c0.c().f11797v;
        boolean z10 = e0Var == null ? false : e0Var.f11775c;
        if (nVar == null) {
            nVar = new n(u.f11876c, false);
        }
        nVar.a();
        ArrayList<String> arrayListC = nVar.f11827b.c();
        if (!z10) {
            arrayListC.remove("android.media.intent.category.LIVE_AUDIO");
        } else if (!arrayListC.contains("android.media.intent.category.LIVE_AUDIO")) {
            arrayListC.add("android.media.intent.category.LIVE_AUDIO");
        }
        if (arrayListC.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = null;
            for (String str : arrayListC) {
                if (str == null) {
                    throw new IllegalArgumentException("category must not be null");
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        if (arrayList == null) {
            uVar = u.f11876c;
        } else {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", arrayList);
            uVar = new u(bundle, arrayList);
        }
        boolean zB = nVar.b();
        if (uVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("selector", uVar.f11877a);
        bundle2.putBoolean("activeScan", zB);
        uVar.a();
        if (uVar.f11878b.contains(null)) {
            routeDiscoveryPreferenceBuild = new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
        } else {
            boolean z11 = bundle2.getBoolean("activeScan");
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : uVar.c()) {
                str2.getClass();
                switch (str2) {
                    case "android.media.intent.category.REMOTE_PLAYBACK":
                        str2 = "android.media.route.feature.REMOTE_PLAYBACK";
                        break;
                    case "android.media.intent.category.LIVE_AUDIO":
                        str2 = "android.media.route.feature.LIVE_AUDIO";
                        break;
                    case "android.media.intent.category.LIVE_VIDEO":
                        str2 = "android.media.route.feature.LIVE_VIDEO";
                        break;
                    case "android.media.intent.category.REMOTE_AUDIO_PLAYBACK":
                        str2 = "android.media.route.feature.REMOTE_AUDIO_PLAYBACK";
                        break;
                    case "android.media.intent.category.REMOTE_VIDEO_PLAYBACK":
                        str2 = "android.media.route.feature.REMOTE_VIDEO_PLAYBACK";
                        break;
                }
                arrayList2.add(str2);
            }
            routeDiscoveryPreferenceBuild = new RouteDiscoveryPreference.Builder(arrayList2, z11).build();
        }
        androidx.media3.cast.s sVar = this.O;
        mediaRouter2.registerRouteCallback(sVar, routeCallback, routeDiscoveryPreferenceBuild);
        mediaRouter2.registerTransferCallback(sVar, kVar);
        mediaRouter2.registerControllerCallback(sVar, gVar);
    }

    public final MediaRoute2Info h(String str) {
        if (str == null) {
            return null;
        }
        for (MediaRoute2Info mediaRoute2Info : this.Q) {
            if (TextUtils.equals(mediaRoute2Info.getId(), str)) {
                return mediaRoute2Info;
            }
        }
        return null;
    }

    public final void i() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        for (MediaRoute2Info mediaRoute2Info : this.I.getRoutes()) {
            if (mediaRoute2Info != null && !arraySet.contains(mediaRoute2Info) && !mediaRoute2Info.isSystemRoute()) {
                if (this.P) {
                    if (!mediaRoute2Info.getId().startsWith(this.A.getPackageName() + "/")) {
                    }
                }
                arraySet.add(mediaRoute2Info);
                arrayList.add(mediaRoute2Info);
            }
        }
        if (arrayList.equals(this.Q)) {
            return;
        }
        this.Q = arrayList;
        ArrayMap arrayMap = this.R;
        arrayMap.clear();
        for (MediaRoute2Info mediaRoute2Info2 : this.Q) {
            Bundle extras = mediaRoute2Info2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + mediaRoute2Info2);
            } else {
                arrayMap.put(mediaRoute2Info2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList<m> arrayList2 = new ArrayList();
        Iterator it = this.Q.iterator();
        while (it.hasNext()) {
            m mVarM0 = va.a.m0((MediaRoute2Info) it.next());
            if (mVarM0 != null) {
                arrayList2.add(mVarM0);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (!arrayList2.isEmpty()) {
            for (m mVar : arrayList2) {
                if (mVar == null) {
                    throw new IllegalArgumentException("route must not be null");
                }
                if (arrayList3.contains(mVar)) {
                    throw new IllegalArgumentException("route descriptor already added");
                }
                arrayList3.add(mVar);
            }
        }
        f(new b20.z(arrayList3, true));
    }

    public final void j(MediaRouter2.RoutingController routingController) {
        oj.q qVar;
        h hVar = (h) this.K.get(routingController);
        if (hVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
            return;
        }
        ArrayList arrayListN = va.a.N(selectedRoutes);
        m mVarM0 = va.a.m0(selectedRoutes.get(0));
        Bundle controlHints = routingController.getControlHints();
        String string = this.A.getString(2131886831);
        m mVar = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    mVar = new m(bundle);
                }
            } catch (Exception e3) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e3);
            }
        }
        if (mVar == null) {
            qVar = new oj.q(routingController.getId(), string);
            Bundle bundle2 = (Bundle) qVar.B;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
        } else {
            qVar = new oj.q(mVar);
        }
        Bundle bundle3 = (Bundle) qVar.B;
        bundle3.putInt("volume", routingController.getVolume());
        bundle3.putInt("volumeMax", routingController.getVolumeMax());
        bundle3.putInt("volumeHandling", routingController.getVolumeHandling());
        ((ArrayList) qVar.D).clear();
        qVar.o(mVarM0.b());
        ((ArrayList) qVar.C).clear();
        qVar.r(arrayListN);
        m mVarV = qVar.v();
        ArrayList arrayListN2 = va.a.N(routingController.getSelectableRoutes());
        ArrayList arrayListN3 = va.a.N(routingController.getDeselectableRoutes());
        b20.z zVar = this.G;
        if (zVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<m> list = zVar.b;
        if (!list.isEmpty()) {
            for (m mVar2 : list) {
                String strD = mVar2.d();
                arrayList.add(new o(mVar2, arrayListN.contains(strD) ? 3 : 1, arrayListN3.contains(strD), arrayListN2.contains(strD), true));
            }
        }
        hVar.f11812o = mVarV;
        hVar.l(mVarV, arrayList);
    }
}

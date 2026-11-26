package o9;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import com.google.android.gms.cast.CredentialsData;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public final class h0 extends l0 {
    public static final ArrayList S;
    public static final ArrayList T;
    public final f I;
    public final MediaRouter J;
    public final f0 K;
    public final g0 L;
    public final MediaRouter.RouteCategory M;
    public int N;
    public boolean O;
    public boolean P;
    public final ArrayList Q;
    public final ArrayList R;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        S = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        T = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public h0(Context context, f fVar) {
        super(context, new q(new ComponentName(CredentialsData.CREDENTIALS_TYPE_ANDROID, l0.class.getName()), 0));
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.I = fVar;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.J = mediaRouter;
        this.K = new f0(this);
        this.L = new g0(this);
        this.M = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(2131886839), false);
        s();
    }

    public static k0 m(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof k0) {
            return (k0) tag;
        }
        return null;
    }

    public static void t(k0 k0Var) {
        MediaRouter.UserRouteInfo userRouteInfo = k0Var.f11824b;
        b0 b0Var = k0Var.f11823a;
        userRouteInfo.setName(b0Var.f11740d);
        userRouteInfo.setPlaybackType(b0Var.l);
        userRouteInfo.setPlaybackStream(b0Var.m);
        userRouteInfo.setVolume(b0Var.f11750p);
        userRouteInfo.setVolumeMax(b0Var.f11751q);
        userRouteInfo.setVolumeHandling((!b0Var.e() || c0.g()) ? b0Var.f11749o : 0);
        userRouteInfo.setDescription(b0Var.f11741e);
    }

    @Override
    public final r b(String str) {
        int iJ = j(str);
        if (iJ >= 0) {
            return new i0(((j0) this.Q.get(iJ)).f11819a);
        }
        return null;
    }

    @Override
    public final void e(n nVar) {
        boolean zB;
        int i10 = 0;
        if (nVar != null) {
            nVar.a();
            ArrayList arrayListC = nVar.f11827b.c();
            int size = arrayListC.size();
            int i11 = 0;
            while (i10 < size) {
                String str = (String) arrayListC.get(i10);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i11 |= 1;
                } else {
                    i11 = str.equals("android.media.intent.category.LIVE_VIDEO") ? i11 | 2 : i11 | 8388608;
                }
                i10++;
            }
            zB = nVar.b();
            i10 = i11;
        } else {
            zB = false;
        }
        if (this.N == i10 && this.O == zB) {
            return;
        }
        this.N = i10;
        this.O = zB;
        s();
    }

    public final boolean h(MediaRouter.RouteInfo routeInfo) {
        String str;
        if (m(routeInfo) != null || i(routeInfo) >= 0) {
            return false;
        }
        String str2 = this.J.getDefaultRoute() == routeInfo ? "DEFAULT_ROUTE" : String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(l(routeInfo).hashCode()));
        if (j(str2) >= 0) {
            int i10 = 2;
            while (true) {
                Locale locale = Locale.US;
                str = str2 + "_" + i10;
                if (j(str) < 0) {
                    break;
                }
                i10++;
            }
            str2 = str;
        }
        j0 j0Var = new j0(routeInfo, str2);
        oj.q qVar = new oj.q(str2, l(routeInfo));
        n(j0Var, qVar);
        j0Var.f11821c = qVar.v();
        this.Q.add(j0Var);
        return true;
    }

    public final int i(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((j0) arrayList.get(i10)).f11819a == routeInfo) {
                return i10;
            }
        }
        return -1;
    }

    public final int j(String str) {
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((j0) arrayList.get(i10)).f11820b.equals(str)) {
                return i10;
            }
        }
        return -1;
    }

    public final int k(b0 b0Var) {
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((k0) arrayList.get(i10)).f11823a == b0Var) {
                return i10;
            }
        }
        return -1;
    }

    public final String l(MediaRouter.RouteInfo routeInfo) {
        int i10;
        Context context = this.A;
        CharSequence name = routeInfo.getName(context);
        if (!TextUtils.isEmpty(name)) {
            return name.toString();
        }
        if ((routeInfo.getSupportedTypes() & 8388608) != 0) {
            return RuntimeVersion.SUFFIX;
        }
        int deviceType = routeInfo.getDeviceType();
        if (deviceType == 1) {
            i10 = 2131886836;
        } else if (deviceType != 2) {
            i10 = deviceType != 3 ? 2131886837 : 2131886834;
        } else {
            i10 = 2131886835;
        }
        return context.getString(i10);
    }

    public final void n(j0 j0Var, oj.q qVar) {
        Bundle bundle = (Bundle) qVar.B;
        MediaRouter.RouteInfo routeInfo = j0Var.f11819a;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            qVar.o(S);
        }
        if ((supportedTypes & 2) != 0) {
            qVar.o(T);
        }
        bundle.putInt("playbackType", routeInfo.getPlaybackType());
        bundle.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle.putInt("volume", routeInfo.getVolume());
        bundle.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle.putInt("volumeHandling", routeInfo.getVolumeHandling());
        bundle.putBoolean("isSystemRoute", (supportedTypes & 8388608) == 0);
        if (!routeInfo.isEnabled()) {
            bundle.putBoolean("enabled", false);
        }
        if (routeInfo.isConnecting()) {
            bundle.putInt("connectionState", 1);
        }
        Display presentationDisplay = routeInfo.getPresentationDisplay();
        if (presentationDisplay != null) {
            bundle.putInt("presentationDisplayId", presentationDisplay.getDisplayId());
        }
        CharSequence description = routeInfo.getDescription();
        if (description != null) {
            bundle.putString("status", description.toString());
        }
        ((Bundle) qVar.B).putInt("deviceType", j0Var.f11819a.getDeviceType());
    }

    public final void o(b0 b0Var) {
        t tVarC = b0Var.c();
        MediaRouter mediaRouter = this.J;
        if (tVarC == this) {
            int i10 = i(mediaRouter.getSelectedRoute(8388611));
            if (i10 < 0 || !((j0) this.Q.get(i10)).f11820b.equals(b0Var.f11738b)) {
                return;
            }
            b0Var.l(false);
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfoCreateUserRoute = mediaRouter.createUserRoute(this.M);
        k0 k0Var = new k0(b0Var, userRouteInfoCreateUserRoute);
        userRouteInfoCreateUserRoute.setTag(k0Var);
        userRouteInfoCreateUserRoute.setVolumeCallback(this.L);
        t(k0Var);
        this.R.add(k0Var);
        mediaRouter.addUserRoute(userRouteInfoCreateUserRoute);
    }

    public final void p(b0 b0Var) {
        int iK;
        if (b0Var.c() == this || (iK = k(b0Var)) < 0) {
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfo = ((k0) this.R.remove(iK)).f11824b;
        userRouteInfo.setTag(null);
        userRouteInfo.setVolumeCallback(null);
        try {
            this.J.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException e3) {
            Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e3);
        }
    }

    public final void q(b0 b0Var) {
        if (b0Var.g()) {
            t tVarC = b0Var.c();
            MediaRouter mediaRouter = this.J;
            if (tVarC != this) {
                int iK = k(b0Var);
                if (iK >= 0) {
                    mediaRouter.selectRoute(8388611, ((k0) this.R.get(iK)).f11824b);
                    return;
                }
                return;
            }
            int iJ = j(b0Var.f11738b);
            if (iJ >= 0) {
                mediaRouter.selectRoute(8388611, ((j0) this.Q.get(iJ)).f11819a);
            }
        }
    }

    public final void r() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.Q;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = ((j0) arrayList2.get(i10)).f11821c;
            if (mVar == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            if (arrayList.contains(mVar)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            arrayList.add(mVar);
        }
        f(new b20.z(arrayList, false));
    }

    public final void s() {
        boolean z10 = this.P;
        f0 f0Var = this.K;
        MediaRouter mediaRouter = this.J;
        if (z10) {
            mediaRouter.removeCallback(f0Var);
        }
        this.P = true;
        mediaRouter.addCallback(this.N, f0Var, (this.O ? 1 : 0) | 2);
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean zH = false;
        for (int i10 = 0; i10 < routeCount; i10++) {
            arrayList.add(mediaRouter.getRouteAt(i10));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zH |= h((MediaRouter.RouteInfo) it.next());
        }
        if (zH) {
            r();
        }
    }
}

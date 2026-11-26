package o9;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public final class b extends Handler {

    public final ArrayList f11734a = new ArrayList();

    public final ArrayList f11735b = new ArrayList();

    public final f f11736c;

    public b(f fVar) {
        this.f11736c = fVar;
    }

    public static void a(w wVar, int i10, Object obj, int i11) {
        b0 b0Var;
        b0 b0Var2;
        c0 c0Var = wVar.f11883a;
        v vVar = wVar.f11884b;
        int i12 = 65280 & i10;
        if (i12 != 256) {
            if (i12 != 512) {
                if (i12 == 768 && i10 == 769) {
                    vVar.onRouterParamsChanged(c0Var, (e0) obj);
                    return;
                }
                return;
            }
            a0 a0Var = (a0) obj;
            switch (i10) {
                case 513:
                    vVar.onProviderAdded(c0Var, a0Var);
                    return;
                case 514:
                    vVar.onProviderRemoved(c0Var, a0Var);
                    return;
                case 515:
                    vVar.onProviderChanged(c0Var, a0Var);
                    return;
                default:
                    return;
            }
        }
        if (i10 == 264 || i10 == 262) {
            e eVar = (e) obj;
            b0 b0Var3 = eVar.f11771b;
            b0Var = eVar.f11770a;
            b0Var2 = b0Var3;
        } else {
            if (i10 == 265 || i10 == 266) {
                throw a1.b.i(obj);
            }
            b0Var2 = (b0) obj;
            b0Var = null;
        }
        if (b0Var2 != null) {
            boolean zD = true;
            if ((wVar.f11886d & 2) == 0 && !b0Var2.h(wVar.f11885c)) {
                e0 e0Var = c0.c().f11797v;
                zD = ((e0Var == null ? false : e0Var.f11775c) && b0Var2.d() && i10 == 262 && i11 == 3 && b0Var != null) ? true ^ b0Var.d() : false;
            }
            if (zD) {
                switch (i10) {
                    case 257:
                        vVar.onRouteAdded(c0Var, b0Var2);
                        return;
                    case 258:
                        vVar.onRouteRemoved(c0Var, b0Var2);
                        return;
                    case 259:
                        vVar.onRouteChanged(c0Var, b0Var2);
                        return;
                    case 260:
                        vVar.onRouteVolumeChanged(c0Var, b0Var2);
                        return;
                    case 261:
                        vVar.onRoutePresentationDisplayChanged(c0Var, b0Var2);
                        return;
                    case 262:
                        vVar.onRouteSelected(c0Var, b0Var2, i11, b0Var2);
                        return;
                    case 263:
                        vVar.onRouteUnselected(c0Var, b0Var2, i11);
                        return;
                    case 264:
                        vVar.onRouteSelected(c0Var, b0Var2, i11, b0Var);
                        return;
                    case 265:
                        vVar.onRouteConnected(c0Var, b0Var, b0Var2);
                        return;
                    case 266:
                        vVar.onRouteDisconnected(c0Var, b0Var, b0Var2, i11);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public final void b(int i10, Object obj) {
        obtainMessage(i10, obj).sendToTarget();
    }

    @Override
    public final void handleMessage(Message message) {
        int iK;
        ArrayList arrayList = this.f11734a;
        f fVar = this.f11736c;
        ArrayList arrayList2 = fVar.f11786i;
        h0 h0Var = fVar.f11795t;
        int i10 = message.what;
        Object obj = message.obj;
        int i11 = message.arg1;
        if (i10 == 259 && fVar.h().f11739c.equals(((b0) obj).f11739c)) {
            fVar.r(true);
        }
        ArrayList arrayList3 = this.f11735b;
        if (i10 == 262) {
            e eVar = (e) obj;
            b0 b0Var = eVar.f11771b;
            if (eVar.f11772c) {
                h0Var.q(b0Var);
            }
            if (fVar.f11798w != null && b0Var.d()) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    h0Var.p((b0) it.next());
                }
                arrayList3.clear();
            }
        } else if (i10 != 264) {
            switch (i10) {
                case 257:
                    h0Var.o((b0) obj);
                    break;
                case 258:
                    h0Var.p((b0) obj);
                    break;
                case 259:
                    b0 b0Var2 = (b0) obj;
                    h0Var.getClass();
                    if (b0Var2.c() != h0Var && (iK = h0Var.k(b0Var2)) >= 0) {
                        h0.t((k0) h0Var.R.get(iK));
                    }
                    break;
            }
        } else {
            e eVar2 = (e) obj;
            b0 b0Var3 = eVar2.f11771b;
            arrayList3.add(b0Var3);
            h0Var.o(b0Var3);
            if (eVar2.f11772c) {
                h0Var.q(b0Var3);
            }
        }
        try {
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        a((w) it2.next(), i10, obj, i11);
                    }
                    return;
                } else {
                    c0 c0Var = (c0) ((WeakReference) arrayList2.get(size)).get();
                    if (c0Var == null) {
                        arrayList2.remove(size);
                    } else {
                        arrayList.addAll(c0Var.f11759b);
                    }
                }
            }
        } finally {
            arrayList.clear();
        }
    }
}

package l9;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcelable;
import android.service.media.MediaBrowserService;
import androidx.media3.common.q0;
import fh.e1;
import fh.t0;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import k9.a2;
import k9.k1;
import k9.m1;
import k9.q3;
import k9.s1;
import k9.y1;
import k9.z3;

public final class o extends MediaBrowserService {
    public final p A;
    public final p B;

    public o(p pVar, Context context) {
        this.B = pVar;
        this.A = pVar;
        attachBaseContext(context);
    }

    @Override
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i10, Bundle bundle) {
        Bundle bundle2;
        g0 g0Var;
        h1.l lVar;
        h1.l lVar2;
        h1.l lVar3;
        a2 a2VarB;
        k9.q qVar;
        Bundle bundle3;
        f0.h(bundle);
        p pVar = this.A;
        m1 m1Var = (m1) pVar.f10174d;
        Bundle bundle4 = bundle == null ? null : new Bundle(bundle);
        int i11 = -1;
        if (bundle4 == null || bundle4.getInt("extra_client_version", 0) == 0) {
            bundle2 = null;
        } else {
            bundle4.remove("extra_client_version");
            pVar.f10173c = new Messenger(m1Var.G);
            Bundle bundle5 = new Bundle();
            bundle5.putInt("extra_service_version", 2);
            bundle5.putBinder("extra_messenger", ((Messenger) pVar.f10173c).getBinder());
            e0 e0Var = m1Var.H;
            if (e0Var != null) {
                d dVarA = e0Var.a();
                bundle5.putBinder("extra_session_binder", dVarA == null ? null : dVarA.asBinder());
            } else {
                ((ArrayList) pVar.f10171a).add(bundle5);
            }
            i11 = bundle4.getInt("extra_calling_pid", -1);
            bundle4.remove("extra_calling_pid");
            bundle2 = bundle5;
        }
        l lVar4 = new l(m1Var, str, i11, i10, null);
        m1Var.F = lVar4;
        s1 s1Var = m1Var.M;
        oj.q qVar2 = m1Var.K;
        p pVar2 = m1Var.A;
        pVar2.getClass();
        m1 m1Var2 = pVar2.f10176f;
        l lVar5 = m1Var2.F;
        if (lVar5 == null) {
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
        if (lVar5 == m1Var2.C) {
            o oVar = (o) pVar2.f10172b;
            oVar.getClass();
            g0Var = new g0(oVar.getCurrentBrowserInfo());
        } else {
            g0Var = lVar5.f10163d;
        }
        Bundle bundle6 = bundle4 != null ? bundle4 : Bundle.EMPTY;
        boolean zB = m1Var.I.b(g0Var);
        k1 k1Var = new k1(m1Var, g0Var);
        e1 e1Var = k9.p.f9381a;
        Math.max(0, bundle6.getInt("androidx.media.utils.MediaBrowserCompat.extras.CUSTOM_BROWSER_ACTION_LIMIT", 0));
        g0 g0Var2 = g0Var;
        a2 a2Var = new a2(g0Var2, 0, 0, zB, k1Var, bundle6);
        AtomicReference atomicReference = new AtomicReference();
        e7.g gVar = new e7.g();
        e7.i0.M(m1Var.J.l, new ab.k(m1Var, atomicReference, a2Var, gVar, 10));
        try {
            gVar.a();
            y1 y1Var = (y1) atomicReference.get();
            y1Var.getClass();
            qVar2.q(g0Var2, a2Var, y1Var.f9553a, y1Var.f9554b);
            lVar = q3.f9407a;
        } catch (InterruptedException e3) {
            e7.a.e("MSSLegacyStub", "Couldn't get a result from onConnect", e3);
            lVar = null;
        }
        if (lVar == null || (a2VarB = m1Var.b()) == null || !qVar2.P(a2VarB, 50000)) {
            lVar2 = null;
        } else {
            k9.e1 e1VarH = k9.p.h(s1Var.f9418f, bundle4);
            AtomicReference atomicReference2 = new AtomicReference();
            e7.g gVar2 = new e7.g();
            e7.i0.M(s1Var.l, new com.revenuecat.purchases.d(m1Var, atomicReference2, a2VarB, e1VarH, gVar2, 3));
            try {
                gVar2.a();
                qVar = (k9.q) ((kh.v) atomicReference2.get()).get();
                ta.c0.w(qVar, "LibraryResult must not be null");
            } catch (InterruptedException | CancellationException | ExecutionException e10) {
                e7.a.e("MLSLegacyStub", "Couldn't get a result from onGetLibraryRoot", e10);
                qVar = null;
            }
            if (qVar != null) {
                Object obj = qVar.f9396c;
                if (qVar.f9394a == 0 && obj != null) {
                    k9.e1 e1Var2 = qVar.f9398e;
                    if (e1Var2 != null) {
                        Bundle bundle7 = e1Var2.f9276a;
                        bundle3 = new Bundle(bundle7);
                        if (bundle7.containsKey("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY")) {
                            boolean z10 = bundle7.getBoolean("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY", false);
                            bundle3.remove("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY");
                            bundle3.putInt("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS", z10 ? 1 : 3);
                        }
                        bundle3.putBoolean("android.service.media.extra.RECENT", e1Var2.f9277b);
                        bundle3.putBoolean("android.service.media.extra.OFFLINE", e1Var2.f9278c);
                        bundle3.putBoolean("android.service.media.extra.SUGGESTED", e1Var2.f9279d);
                    } else {
                        bundle3 = new Bundle();
                    }
                    bundle3.putBoolean("android.media.browse.SEARCH_SUPPORTED", qVar2.P(a2VarB, 50005));
                    t0 t0Var = s1Var.f9428r;
                    if (!t0Var.isEmpty()) {
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (int i12 = 0; i12 < t0Var.size(); i12++) {
                            k9.b bVar = (k9.b) t0Var.get(i12);
                            z3 z3Var = bVar.f9222a;
                            if (z3Var != null && z3Var.f9578a == 0) {
                                Bundle bundle8 = new Bundle();
                                z3 z3Var2 = bVar.f9222a;
                                Bundle bundle9 = bVar.f9228g;
                                if (z3Var2 != null) {
                                    bundle8.putString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_ID", z3Var2.f9579b);
                                }
                                bundle8.putString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_LABEL", bVar.f9227f.toString());
                                Uri uri = bVar.f9226e;
                                if (uri != null) {
                                    bundle8.putString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_ICON_URI", uri.toString());
                                }
                                if (!bundle9.isEmpty()) {
                                    bundle8.putBundle("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_EXTRAS", bundle9);
                                }
                                arrayList.add(bundle8);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            bundle3.putParcelableArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ROOT_LIST", arrayList);
                        }
                    }
                    lVar2 = new h1.l(((q0) obj).f1413a, bundle3);
                } else if (qVar != null || qVar.f9394a == 0) {
                    lVar2 = q3.f9407a;
                } else {
                    lVar2 = null;
                }
            } else {
                if (qVar != null) {
                }
                lVar2 = q3.f9407a;
            }
        }
        m1Var.F = null;
        if (lVar2 == null) {
            lVar3 = null;
        } else {
            if (((Messenger) pVar.f10173c) != null) {
                m1Var.D.add(lVar4);
            }
            Bundle bundle10 = (Bundle) lVar2.B;
            if (bundle2 == null) {
                bundle2 = bundle10;
            } else if (bundle10 != null) {
                bundle2.putAll(bundle10);
            }
            lVar3 = new h1.l((String) lVar2.A, bundle2);
        }
        if (lVar3 == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot((String) lVar3.A, (Bundle) lVar3.B);
    }

    @Override
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        m mVar = new m(str, new h(result), 0);
        m1 m1Var = (m1) this.A.f10174d;
        m1Var.F = m1Var.C;
        m1Var.d(str, mVar, null);
        m1Var.F = null;
    }

    @Override
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        f0.h(bundle);
        p pVar = this.B;
        m1 m1Var = pVar.f10175e;
        l lVar = m1Var.C;
        m mVar = new m(pVar, str, new h(result), bundle);
        m1Var.F = lVar;
        m1Var.d(str, mVar, bundle);
        m1Var.F = null;
        m1Var.F = null;
    }

    @Override
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        m mVar = new m(str, new h(result), 1);
        m1 m1Var = (m1) this.A.f10174d;
        m1Var.F = m1Var.C;
        m1Var.e(str, mVar);
        m1Var.F = null;
    }
}

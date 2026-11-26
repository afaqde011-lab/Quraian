package a1;

import android.net.ConnectivityManager;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.datastore.core.DataStore;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.home.presentation.screen.playlist.PlaylistLauncher;
import com.mchutov.quranify.soundeffect.presentation.screen.picker.SoundEffectPickerAction;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

public final class z implements u00.a {
    public final int A;
    public final Object B;

    public z(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public final Object invoke() {
        DataStore dataStore;
        h00.m mVar;
        int i10 = this.A;
        Object obj = this.B;
        switch (i10) {
            case 0:
                return ((b0) obj).a();
            case 1:
                Object systemService = ((View) ((u0) obj).B).getContext().getSystemService("input_method");
                kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 2:
                return new BaseInputConnection(((b1) obj).f16a, false);
            case 3:
                ab.q qVar = (ab.q) obj;
                qVar.getClass();
                ib.c.a(qVar);
                return g00.b0.a;
            case 4:
                return androidx.lifecycle.u0.h((androidx.lifecycle.f1) obj);
            case 5:
                return kh.n.T((PlaylistLauncher) obj);
            case 6:
                Object systemService2 = ((au.a) obj).a.getSystemService("connectivity");
                kotlin.jvm.internal.m.c(systemService2, "null cannot be cast to non-null type android.net.ConnectivityManager");
                return (ConnectivityManager) systemService2;
            case 7:
                ((av.i) obj).n().o(new bv.q0());
                return g00.b0.a;
            case 8:
                androidx.fragment.app.j0 j0VarRequireParentFragment = ((av.l) obj).requireParentFragment();
                kotlin.jvm.internal.m.d(j0VarRequireParentFragment, "requireParentFragment(...)");
                return j0VarRequireParentFragment;
            case 9:
                ((ev.c0) ((av.p) obj).D.getValue()).j(ev.c.a);
                return g00.b0.a;
            case 10:
                ((c00.x) ((av.q) obj).D.getValue()).k(SoundEffectPickerAction.OnCloseScreen.INSTANCE);
                return g00.b0.a;
            case 11:
                ((az.r) obj).j(az.b.a);
                return g00.b0.a;
            case 12:
                b1.h hVar = (b1.h) obj;
                return (hVar.T || ((b1.p) hVar.R.f1955r.getValue()) == b1.p.B) ? new h2.b(kh.n.y(hVar.Q, hVar.R, hVar.S, ((y3.l) hVar.U.getValue()).f16596a)) : new h2.b(9205357640488583168L);
            case 13:
                return ((Callable) obj).call();
            case 14:
                ((Runnable) obj).run();
                return g00.b0.a;
            case 15:
                return new d.c0((d.e0) obj);
            case 16:
                d00.w0 w0Var = (d00.w0) obj;
                d00.x0 x0Var = w0Var.P;
                d00.c cVar = w0Var.O;
                d00.u0 u0Var = (d00.u0) x0Var.b.getValue();
                z2.a0 a0Var = w0Var.Q;
                if (a0Var != null) {
                    cVar.c(d00.h0.e(a0Var, u0Var));
                }
                if (cVar.e.isEmpty()) {
                    a40.u1 u1Var = w0Var.R;
                    if (u1Var != null) {
                        u1Var.i((CancellationException) null);
                    }
                    w0Var.R = null;
                } else {
                    a40.u1 u1Var2 = w0Var.R;
                    if (u1Var2 == null || !u1Var2.a()) {
                        w0Var.R = w0Var.B1();
                    }
                }
                return g00.b0.a;
            case 17:
                d1.i iVar = (d1.i) obj;
                iVar.f4583c0 = null;
                b3.m.o(iVar);
                b3.m.n(iVar);
                b3.m.m(iVar);
                return Boolean.TRUE;
            case TYPE_SINT64_VALUE:
                d1.m mVar2 = (d1.m) obj;
                mVar2.Z = null;
                b3.m.o(mVar2);
                b3.m.n(mVar2);
                b3.m.m(mVar2);
                return Boolean.TRUE;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                ((d6.r) obj).f4690j.getValue();
                return g00.b0.a;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                d6.a1 a1Var = (d6.a1) obj;
                synchronized (d6.a1.f4614d) {
                    try {
                        dataStore = d6.a1.f4616f;
                        if (dataStore == null) {
                            File fileO = k00.f.O(a1Var.f4618a, "GlanceAppWidgetManager");
                            if (!fileO.exists()) {
                                fileO = null;
                            }
                            if (fileO != null) {
                                fileO.delete();
                            }
                            dataStore = (DataStore) d6.a1.f4615e.b(d6.t0.f4699a[0], a1Var.f4618a);
                            d6.a1.f4616f = dataStore;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return dataStore;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                ((o1) obj).invoke();
                return g00.b0.a;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                return (cu.e) h00.q.U0(((cu.a) obj).a);
            case 23:
                ((dz.s) obj).j(dz.b.a);
                return g00.b0.a;
            case 24:
                e60.a aVar = (e60.a) obj;
                aVar.e.a.E0("|- (-) Scope - id:'" + aVar.b + '\'');
                Iterator it = aVar.h.iterator();
                if (it.hasNext()) {
                    throw b.j(it);
                }
                aVar.h.clear();
                aVar.j = true;
                aVar.g = null;
                ThreadLocal threadLocal = aVar.i;
                if (threadLocal != null && (mVar = (h00.m) threadLocal.get()) != null) {
                    mVar.clear();
                }
                aVar.i = null;
                aVar.e.c.a(aVar);
                return g00.b0.a;
            case 25:
                return ((u0) obj).g(":memory:");
            case RuntimeVersion.MINOR:
                ea.t tVar = (ea.t) obj;
                return tVar.A.g(tVar.B);
            case 27:
                long jLongValue = ((Number) ((er.j) obj).e.getValue()).longValue();
                byte b7 = (byte) (((byte) 2) | 1);
                if (b7 == 3) {
                    return new yg.l(jLongValue);
                }
                StringBuilder sb2 = new StringBuilder();
                if ((b7 & 1) == 0) {
                    sb2.append(" cloudProjectNumber");
                }
                if ((b7 & 2) == 0) {
                    sb2.append(" webViewRequestMode");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            case 28:
                ez.t tVar2 = (ez.t) obj;
                return Boolean.valueOf((r30.k.L0(tVar2.a) || tVar2.b != null || tVar2.e == null || tVar2.f == null || tVar2.g) ? false : true);
            default:
                b3.m.m((f1.a) obj);
                return g00.b0.a;
        }
    }
}

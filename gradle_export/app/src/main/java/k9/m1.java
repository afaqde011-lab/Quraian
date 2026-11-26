package k9;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class m1 extends Service {
    public l9.p A;
    public final l9.h B = new l9.h(this);
    public final l9.l C = new l9.l(this, "android.media.session.MediaController", -1, -1, null);
    public final ArrayList D = new ArrayList();
    public final u.e E = new u.e(0);
    public l9.l F;
    public final androidx.mediarouter.app.d G;
    public l9.e0 H;
    public final l9.h I;
    public final s1 J;
    public final oj.q K;
    public final hf.c L;
    public final s1 M;

    public m1(s1 s1Var) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        androidx.mediarouter.app.d dVar = new androidx.mediarouter.app.d(looperMyLooper);
        dVar.f1727b = this;
        this.G = dVar;
        this.I = l9.h.a(s1Var.f9418f);
        this.J = s1Var;
        this.K = new oj.q(s1Var);
        this.M = s1Var;
        this.L = new hf.c(this, 13);
    }

    public static kh.b0 a(m1 m1Var, q qVar) {
        Object obj;
        ta.c0.w(qVar, "LibraryResult must not be null");
        kh.b0 b0Var = new kh.b0();
        if (qVar.f9394a != 0 || (obj = qVar.f9396c) == null) {
            b0Var.l(null);
            return b0Var;
        }
        fh.t0 t0Var = (fh.t0) obj;
        if (t0Var.isEmpty()) {
            b0Var.l(new ArrayList());
            return b0Var;
        }
        ArrayList arrayList = new ArrayList();
        ji.a aVar = new ji.a(b0Var, arrayList, 13);
        kh.p pVar = kh.p.A;
        b0Var.a(aVar, pVar);
        ab.k kVar = new ab.k(m1Var, new AtomicInteger(0), t0Var, arrayList, b0Var);
        for (int i10 = 0; i10 < t0Var.size(); i10++) {
            byte[] bArr = ((androidx.media3.common.q0) t0Var.get(i10)).f1416d.f1637k;
            if (bArr == null) {
                arrayList.add(null);
                kVar.run();
            } else {
                kh.v vVarO0 = m1Var.M.m.o0(bArr);
                arrayList.add(vVarO0);
                vVarO0.a(kVar, pVar);
            }
        }
        return b0Var;
    }

    public final a2 b() {
        l9.g0 g0Var;
        l9.p pVar = this.A;
        pVar.getClass();
        m1 m1Var = pVar.f10176f;
        l9.l lVar = m1Var.F;
        if (lVar == null) {
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
        if (lVar == m1Var.C) {
            l9.o oVar = (l9.o) pVar.f10172b;
            oVar.getClass();
            g0Var = new l9.g0(oVar.getCurrentBrowserInfo());
        } else {
            g0Var = lVar.f10163d;
        }
        return this.K.E(g0Var);
    }

    public final void c(l9.e0 e0Var) {
        attachBaseContext(this.J.f9418f);
        onCreate();
        if (e0Var == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.H != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.H = e0Var;
        l9.p pVar = this.A;
        pVar.getClass();
        ((m1) pVar.f10174d).G.b(new com.google.android.gms.internal.play_billing.r0(8, pVar, e0Var, false));
    }

    public final void d(String str, l9.q qVar, Bundle bundle) {
        a2 a2VarB = b();
        if (a2VarB == null) {
            qVar.f(null);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            qVar.a();
            e7.i0.M(this.M.l, new com.revenuecat.purchases.d(this, a2VarB, qVar, bundle, str, 5));
        } else {
            e7.a.m("MLSLegacyStub", "onLoadChildren(): Ignoring empty parentId from " + a2VarB);
            qVar.f(null);
        }
    }

    @Override
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final void e(String str, l9.q qVar) {
        a2 a2VarB = b();
        if (a2VarB == null) {
            qVar.f(null);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            qVar.a();
            e7.i0.M(this.M.l, new ab.k(this, a2VarB, qVar, str, 5));
        } else {
            e7.a.m("MLSLegacyStub", "Ignoring empty itemId from " + a2VarB);
            qVar.f(null);
        }
    }

    public final void f(String str) {
        a2 a2VarB = b();
        if (a2VarB == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            e7.i0.M(this.M.l, new ab.e(this, a2VarB, str, 13));
            return;
        }
        e7.a.m("MLSLegacyStub", "onUnsubscribe(): Ignoring empty id from " + a2VarB);
    }

    public final void g(String str, l9.l lVar, Bundle bundle, Bundle bundle2) {
        l9.i iVar = new l9.i(this, str, lVar, str, bundle, bundle2);
        this.F = lVar;
        if (bundle == null) {
            d(str, iVar, null);
        } else {
            d(str, iVar, bundle);
        }
        this.F = null;
        if (!iVar.b()) {
            throw new IllegalStateException(w.c.l(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), lVar.f10160a, " id=", str));
        }
    }

    @Override
    public final IBinder onBind(Intent intent) {
        l9.p pVar = this.A;
        pVar.getClass();
        l9.o oVar = (l9.o) pVar.f10172b;
        oVar.getClass();
        return oVar.onBind(intent);
    }

    @Override
    public final void onCreate() {
        super.onCreate();
        l9.p pVar = new l9.p(this);
        this.A = pVar;
        l9.o oVar = new l9.o(pVar, this);
        pVar.f10172b = oVar;
        oVar.onCreate();
    }

    @Override
    public final void onDestroy() {
        this.G.f1727b = null;
    }
}

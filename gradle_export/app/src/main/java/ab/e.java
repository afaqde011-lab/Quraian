package ab;

import a40.f1;
import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.ActionMode;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.window.SurfaceSyncGroup;
import androidx.fragment.app.g2;
import androidx.fragment.app.u1;
import androidx.fragment.app.z1;
import androidx.media3.common.h2;
import com.google.android.gms.internal.measurement.b5;
import com.revenuecat.purchases.PurchasesOrchestrator;
import com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher;
import com.revenuecat.purchases.interfaces.Callback;
import fh.d2;
import fh.s2;
import fh.t0;
import i7.q0;
import i7.y0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import k9.a2;
import k9.a4;
import k9.b2;
import k9.b3;
import k9.d4;
import k9.f2;
import k9.j2;
import k9.m1;
import k9.q3;
import k9.s1;
import k9.t2;
import k9.v3;
import k9.w1;
import k9.z3;
import kotlin.NoWhenBranchMatchedException;
import l60.o0;
import org.json.JSONObject;

public final class e implements Runnable {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;

    public e(Object obj, Object obj2, Object obj3, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
    }

    public e(w1 w1Var, k9.u uVar, String str, Bundle bundle) {
        this.A = 15;
        this.B = uVar;
        this.C = str;
        this.D = bundle;
    }

    private final void a() {
        AudioTrack audioTrack = (AudioTrack) this.B;
        Handler handler = (Handler) this.C;
        e7.p pVar = (e7.p) this.D;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new androidx.lifecycle.i0(pVar, 24));
            }
            synchronized (k7.s.f9131p) {
                try {
                    int i10 = k7.s.f9133r - 1;
                    k7.s.f9133r = i10;
                    if (i10 == 0) {
                        ScheduledExecutorService scheduledExecutorService = k7.s.f9132q;
                        scheduledExecutorService.getClass();
                        scheduledExecutorService.shutdown();
                        k7.s.f9132q = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new androidx.lifecycle.i0(pVar, 24));
            }
            synchronized (k7.s.f9131p) {
                try {
                    int i11 = k7.s.f9133r - 1;
                    k7.s.f9133r = i11;
                    if (i11 == 0) {
                        ScheduledExecutorService scheduledExecutorService2 = k7.s.f9132q;
                        scheduledExecutorService2.getClass();
                        scheduledExecutorService2.shutdown();
                        k7.s.f9132q = null;
                    }
                    throw th3;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    private final void b() {
        JSONObject jSONObjectOptJSONObject;
        rj.c cVar = (rj.c) this.B;
        String str = (String) this.C;
        sj.e eVar = (sj.e) this.D;
        q3.e0 e0Var = cVar.f13595a;
        fi.b bVar = (fi.b) ((ij.b) e0Var.B).get();
        if (bVar == null) {
            return;
        }
        JSONObject jSONObject = eVar.f14258e;
        if (jSONObject.length() < 1) {
            return;
        }
        JSONObject jSONObject2 = eVar.f14255b;
        if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) != null) {
            String strOptString = jSONObjectOptJSONObject.optString("choiceId");
            if (strOptString.isEmpty()) {
                return;
            }
            synchronized (((Map) e0Var.C)) {
                try {
                    if (strOptString.equals(((Map) e0Var.C).get(str))) {
                        return;
                    }
                    ((Map) e0Var.C).put(str, strOptString);
                    Bundle bundle = new Bundle();
                    bundle.putString("arm_key", str);
                    bundle.putString("arm_value", jSONObject2.optString(str));
                    bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                    bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                    bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                    fi.c cVar2 = (fi.c) bVar;
                    cVar2.a("fp", "personalization_assignment", bundle);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_fpid", strOptString);
                    cVar2.a("fp", "_fpc", bundle2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override
    public final void run() throws NoWhenBranchMatchedException {
        Object[] objArr;
        z3 z3Var;
        kh.v vVarX;
        k00.c cVar = null;
        boolean zBooleanValue = true;
        char c10 = 1;
        int i10 = 0;
        switch (this.A) {
            case 0:
                g gVar = (g) this.B;
                d4.k kVar = (d4.k) this.C;
                l0 l0Var = (l0) this.D;
                gVar.getClass();
                try {
                    zBooleanValue = ((Boolean) kVar.B.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (gVar.f378k) {
                    try {
                        hb.i iVarC = bi.b.C(l0Var.f386a);
                        String str = iVarC.f6976a;
                        if (gVar.c(str) == l0Var) {
                            gVar.b(str);
                        }
                        za.v.d().a(g.l, g.class.getSimpleName() + " " + str + " executed; reschedule = " + zBooleanValue);
                        Iterator it = gVar.f377j.iterator();
                        while (it.hasNext()) {
                            ((b) it.next()).d(iVarC, zBooleanValue);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 1:
                l9.f0 f0Var = (l9.f0) this.B;
                m mVar = (m) this.C;
                g gVar2 = (g) f0Var.B;
                gVar2.getClass();
                hb.i iVar = mVar.f397a;
                String str2 = iVar.f6976a;
                ArrayList arrayList = new ArrayList();
                hb.p pVar = (hb.p) gVar2.f372e.o(new a1.z(new d(gVar2, arrayList, str2, i10), 13));
                if (pVar == null) {
                    za.v.d().g(g.l, "Didn't find WorkSpec for id " + iVar);
                    gVar2.f371d.f8261d.execute(new f(gVar2, iVar, i10));
                    return;
                }
                synchronized (gVar2.f378k) {
                    try {
                        synchronized (gVar2.f378k) {
                            objArr = gVar2.c(str2) != null;
                            break;
                        }
                        if (objArr == true) {
                            Set set = (Set) gVar2.f375h.get(str2);
                            if (((m) set.iterator().next()).f397a.f6977b == iVar.f6977b) {
                                set.add(mVar);
                                za.v.d().a(g.l, "Work " + iVar + " is already enqueued for processing");
                            } else {
                                gVar2.f371d.f8261d.execute(new f(gVar2, iVar, i10));
                            }
                            return;
                        }
                        if (pVar.f7021t != iVar.f6977b) {
                            gVar2.f371d.f8261d.execute(new f(gVar2, iVar, i10));
                            return;
                        }
                        l0 l0Var2 = new l0(new ui.b(gVar2.f369b, gVar2.f370c, gVar2.f371d, gVar2, gVar2.f372e, pVar, arrayList));
                        a40.v vVar = l0Var2.f389d.f8259b;
                        f1 f1VarD = a40.c0.d();
                        vVar.getClass();
                        d4.k kVarB = kh.o.B(rd.a.P(vVar, f1VarD), new j0(l0Var2, cVar, c10 == true ? 1 : 0));
                        kVarB.B.a(new e(gVar2, kVarB, l0Var2, i10), gVar2.f371d.f8261d);
                        gVar2.f374g.put(str2, l0Var2);
                        HashSet hashSet = new HashSet();
                        hashSet.add(mVar);
                        gVar2.f375h.put(str2, hashSet);
                        za.v.d().a(g.l, g.class.getSimpleName() + ": processing " + iVar);
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            case 2:
                ViewGroup viewGroup = (ViewGroup) this.B;
                View view = (View) this.C;
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) this.D;
                kotlin.jvm.internal.m.e(viewGroup, "$container");
                kotlin.jvm.internal.m.e(eVar, "this$0");
                viewGroup.endViewTransition(view);
                eVar.f698c.f774a.c(eVar);
                return;
            case 3:
                g2 g2Var = (g2) this.B;
                g2 g2Var2 = (g2) this.C;
                androidx.fragment.app.p pVar2 = (androidx.fragment.app.p) this.D;
                androidx.fragment.app.j0 j0Var = g2Var.f735c;
                androidx.fragment.app.j0 j0Var2 = g2Var2.f735c;
                boolean z10 = pVar2.f798o;
                z1 z1Var = u1.f846a;
                kotlin.jvm.internal.m.e(j0Var, "inFragment");
                kotlin.jvm.internal.m.e(j0Var2, "outFragment");
                if (z10) {
                    j0Var2.getEnterTransitionCallback();
                    return;
                } else {
                    j0Var.getEnterTransitionCallback();
                    return;
                }
            case 4:
                PurchasesOrchestrator.Companion.canMakePayments.2.1.b((qd.a) this.B, (AtomicBoolean) this.C, (Callback) this.D);
                return;
            case 5:
                GoogleDeviceIdentifiersFetcher.a((GoogleDeviceIdentifiersFetcher) this.B, (Application) this.C, (u00.k) this.D);
                return;
            case 6:
                kh.v vVar2 = (kh.v) this.B;
                kh.b0 b0Var = (kh.b0) this.C;
                try {
                    try {
                        b0Var.n(((kh.m) this.D).apply(b5.u(vVar2)));
                        return;
                    } catch (Throwable th4) {
                        b0Var.m(th4);
                        return;
                    }
                } catch (Error | RuntimeException e3) {
                    b0Var.m(e3);
                    return;
                } catch (CancellationException unused2) {
                    b0Var.cancel(false);
                    return;
                } catch (ExecutionException e10) {
                    Throwable th5 = e10;
                    Throwable cause = th5.getCause();
                    if (cause != null) {
                        th5 = cause;
                    }
                    b0Var.m(th5);
                    return;
                }
            case 7:
                kh.b0 b0Var2 = (kh.b0) this.B;
                ji.a aVar = (ji.a) this.C;
                d4 d4Var = (d4) this.D;
                try {
                    if (b0Var2.A instanceof kh.a) {
                        return;
                    }
                    aVar.run();
                    b0Var2.l(d4Var);
                    return;
                } catch (Throwable th6) {
                    b0Var2.m(th6);
                    return;
                }
            case 8:
                q0 q0Var = (q0) this.B;
                fh.q0 q0Var2 = (fh.q0) this.C;
                s7.a0 a0Var = (s7.a0) this.D;
                j7.f fVar = q0Var.f7450c;
                d2 d2VarG = q0Var2.g();
                th.o oVar = fVar.D;
                androidx.media3.common.f1 f1Var = fVar.G;
                f1Var.getClass();
                oVar.getClass();
                oVar.C = t0.o(d2VarG);
                if (!d2VarG.isEmpty()) {
                    oVar.F = (s7.a0) d2VarG.get(0);
                    a0Var.getClass();
                    oVar.G = a0Var;
                }
                if (((s7.a0) oVar.E) == null) {
                    oVar.E = th.o.y(f1Var, (t0) oVar.C, (s7.a0) oVar.F, (h2) oVar.B);
                }
                oVar.Q(f1Var.getCurrentTimeline());
                return;
            case 9:
                y0 y0Var = (y0) this.B;
                Pair pair = (Pair) this.C;
                ((j7.f) y0Var.B.f7231i).O(((Integer) pair.first).intValue(), (s7.a0) pair.second, (gj.e) this.D);
                return;
            case 10:
                y0 y0Var2 = (y0) this.B;
                Pair pair2 = (Pair) this.C;
                ((j7.f) y0Var2.B.f7231i).z(((Integer) pair2.first).intValue(), (s7.a0) pair2.second, (Exception) this.D);
                return;
            case 11:
                a();
                return;
            case 12:
                kh.v vVar3 = (kh.v) this.B;
                kh.b0 b0Var3 = (kh.b0) this.C;
                androidx.media3.common.q0 q0Var3 = (androidx.media3.common.q0) this.D;
                try {
                    cVar = (Bitmap) b5.u(vVar3);
                } catch (CancellationException | ExecutionException e11) {
                    e7.a.c("MLSLegacyStub", "failed to get bitmap", e11);
                }
                b0Var3.l(k9.p.a(q0Var3, cVar));
                return;
            case 13:
                m1 m1Var = (m1) this.B;
                a2 a2Var = (a2) this.C;
                String str3 = (String) this.D;
                if (m1Var.K.P(a2Var, 50002)) {
                    m1Var.M.D(a2Var, str3);
                    return;
                }
                return;
            case 14:
                s1 s1Var = (s1) this.B;
                a2 a2Var2 = (a2) this.C;
                String str4 = (String) this.D;
                s1Var.getClass();
                k9.z1 z1Var2 = a2Var2.f9209d;
                z1Var2.getClass();
                s1Var.G.remove(str4, a2Var2);
                s1Var.H.remove(z1Var2, str4);
                return;
            case 15:
                k9.u uVar = (k9.u) this.B;
                String str5 = (String) this.C;
                Bundle bundle = (Bundle) this.D;
                uVar.c();
                k9.t tVar = uVar.f9521d;
                s2 it2 = (!tVar.isConnected() ? a4.f9211b : tVar.a()).f9213a.iterator();
                while (it2.hasNext()) {
                    k00.c cVar2 = (z3) it2.next();
                    if (cVar2.f9578a == 0 && cVar2.f9579b.equals(str5)) {
                        cVar = cVar2;
                        if (cVar == null || k9.b.n(str5)) {
                            z3Var = new z3(str5, bundle);
                            Bundle bundle2 = Bundle.EMPTY;
                            uVar.c();
                            if (tVar.isConnected()) {
                                vVarX = tVar.c(z3Var);
                            } else {
                                vVarX = b5.x(new d4(-100));
                            }
                            vVarX.a(new kh.r(vVarX, new eh.l(str5, 4), i10), kh.p.A);
                            return;
                        }
                        return;
                    }
                }
                if (cVar == null) {
                }
                z3Var = new z3(str5, bundle);
                Bundle bundle3 = Bundle.EMPTY;
                uVar.c();
                if (tVar.isConnected()) {
                    vVarX = tVar.c(z3Var);
                } else {
                    vVarX = b5.x(new d4(-100));
                }
                vVarX.a(new kh.r(vVarX, new eh.l(str5, 4), i10), kh.p.A);
                return;
            case 16:
                f2 f2Var = (f2) this.B;
                a2 a2Var3 = (a2) this.C;
                KeyEvent keyEvent = (KeyEvent) this.D;
                s1 s1Var2 = (s1) f2Var.f9290c;
                if (s1Var2.n(a2Var3)) {
                    s1Var2.c(keyEvent, false, false);
                } else {
                    t2 t2Var = s1Var2.f9420h;
                    l9.g0 g0Var = a2Var3.f9206a;
                    g0Var.getClass();
                    t2Var.getClass();
                    t2Var.H(1, new j2(t2Var, 8), g0Var, true);
                }
                f2Var.f9289b = null;
                return;
            case 17:
                s1 s1Var3 = (s1) this.B;
                b3 b3Var = (b3) this.C;
                b2 b2Var = (b2) this.D;
                if (s1Var3.o()) {
                    return;
                }
                v3 v3Var = s1Var3.f9430t;
                b3Var.getClass();
                q3.f(v3Var, b2Var);
                return;
            case TYPE_SINT64_VALUE:
                h1.l lVar = (h1.l) this.B;
                l60.g gVar3 = (l60.g) this.C;
                o0 o0Var = (o0) this.D;
                l60.n nVar = (l60.n) lVar.B;
                if (nVar.B.i()) {
                    gVar3.w0(nVar, new IOException("Canceled"));
                    return;
                } else {
                    gVar3.l(nVar, o0Var);
                    return;
                }
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                ((l60.g) this.C).w0((l60.n) ((h1.l) this.B).B, (Throwable) this.D);
                return;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                hf.c cVar3 = (hf.c) this.B;
                SurfaceView surfaceView = (SurfaceView) this.C;
                m9.f fVar2 = (m9.f) this.D;
                cVar3.getClass();
                AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
                if (rootSurfaceControl == null) {
                    return;
                }
                SurfaceSyncGroup surfaceSyncGroupM = f5.j.m();
                cVar3.B = surfaceSyncGroupM;
                ta.c0.A(surfaceSyncGroupM.add(rootSurfaceControl, new c3.l(2)));
                fVar2.run();
                rootSurfaceControl.applyTransactionOnDraw(new SurfaceControl.Transaction());
                return;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                n7.h hVar = (n7.h) this.B;
                this.C.z(hVar.f11168a, hVar.f11169b, (Exception) this.D);
                return;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                n7.h hVar2 = (n7.h) this.B;
                this.C.O(hVar2.f11168a, hVar2.f11169b, (gj.e) this.D);
                return;
            case 23:
                oj.g gVar4 = (oj.g) this.B;
                Intent intent = (Intent) this.C;
                xf.g gVar5 = (xf.g) this.D;
                try {
                    gVar4.b(intent);
                    return;
                } finally {
                    gVar5.b(null);
                }
            case 24:
                b();
                return;
            case 25:
                v0.f fVar3 = (v0.f) this.B;
                v0.d dVar = (v0.d) this.C;
                v0.e eVar2 = (v0.e) this.D;
                ActionMode actionModeStartActionMode = fVar3.f15315a.startActionMode(new v0.j(dVar), 1);
                kotlin.jvm.internal.m.a(fVar3.f15322h, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    eVar2.close();
                    return;
                }
                return;
            default:
                dh.o oVar2 = (dh.o) this.B;
                w00.a aVar2 = (w00.a) this.C;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.D;
                try {
                    v5.n nVarR = va.a.r(oVar2.A);
                    if (nVarR == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    v5.m mVar2 = (v5.m) ((v5.f) nVarR.f2462b);
                    synchronized (mVar2.D) {
                        mVar2.F = threadPoolExecutor;
                        break;
                    }
                    ((v5.f) nVarR.f2462b).a(new v5.i(aVar2, threadPoolExecutor));
                    return;
                } catch (Throwable th7) {
                    aVar2.C(th7);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }
}

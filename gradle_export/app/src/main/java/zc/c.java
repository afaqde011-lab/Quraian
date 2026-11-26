package zc;

import a1.u0;
import a40.a0;
import a40.c0;
import a40.m0;
import a40.z;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.o0;
import androidx.fragment.app.p0;
import androidx.fragment.app.w0;
import av.o;
import com.google.android.gms.internal.measurement.y3;
import g00.b0;
import g00.k;
import g00.p;
import h00.d0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.m;
import rc.e;
import rc.f;
import rc.g;
import rc.j;
import rc.l;
import rc.q;
import rc.r;
import rc.s;
import rc.t;
import rc.u;

public final class c implements Application.ActivityLifecycleCallbacks, hd.c {
    public final bd.c A;
    public final hd.b B;
    public PackageInfo C;
    public rc.c D;
    public f E;
    public q F;
    public final LinkedHashSet G;
    public final LinkedHashSet H;
    public boolean I;

    public c(bd.c cVar) {
        m.e(cVar, "activityLifecycleObserver");
        this.A = cVar;
        this.B = hd.b.D;
        this.G = new LinkedHashSet();
        this.H = new LinkedHashSet();
    }

    @Override
    public final void a(rc.c cVar) {
        float f3;
        cd.b bVarF;
        f fVar;
        PackageInfo packageInfo;
        z zVar = cVar.f13153c;
        this.D = cVar;
        g gVar = cVar.f13151a;
        Set set = gVar.f13189t;
        u uVar = gVar.f13187r;
        m.e(set, "autocapture");
        m.e(uVar, "interactionsOptions");
        i00.b bVarS = va.a.s();
        if (set.contains(e.G)) {
            bVarS.add(s.f13221b);
        }
        boolean zContains = set.contains(e.H);
        r rVar = r.f13220b;
        t tVar = t.f13222b;
        if (zContains) {
            bVarS.add(tVar);
            bVarS.add(rVar);
        }
        this.E = new f(set.contains(e.C), set.contains(e.D), set.contains(e.F), set.contains(e.E), va.a.k(bVarS));
        Context context = gVar.f13173b;
        m.c(context, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) context;
        f fVar2 = this.E;
        k00.c cVar2 = null;
        if (fVar2 == null) {
            m.k("autocaptureState");
            throw null;
        }
        boolean zContains2 = fVar2.f13171e.contains(tVar);
        int i10 = 2;
        if (zContains2) {
            f3 = application.getResources().getDisplayMetrics().density;
            bVarF = cVar.f();
            fVar = this.E;
            if (fVar != null) {
                m.k("autocaptureState");
                throw null;
            }
            q qVar = new q(cVar, bVarF, f3, fVar);
            this.F = qVar;
            qVar.f13218e = c0.y(zVar, cVar.f13154d, (a0) null, new l6.d(qVar, cVar2, 13), 2);
            bVarF.b("FrustrationInteractionsDetector started - UI change collection is now active");
        } else {
            f fVar3 = this.E;
            if (fVar3 == null) {
                m.k("autocaptureState");
                throw null;
            }
            if (fVar3.f13171e.contains(rVar)) {
                f3 = application.getResources().getDisplayMetrics().density;
                bVarF = cVar.f();
                fVar = this.E;
                if (fVar != null) {
                    m.k("autocaptureState");
                    throw null;
                }
                q qVar2 = new q(cVar, bVarF, f3, fVar);
                this.F = qVar2;
                qVar2.f13218e = c0.y(zVar, cVar.f13154d, (a0) null, new l6.d(qVar2, cVar2, 13), 2);
                bVarF.b("FrustrationInteractionsDetector started - UI change collection is now active");
            }
        }
        f fVar4 = this.E;
        if (fVar4 == null) {
            m.k("autocaptureState");
            throw null;
        }
        if (fVar4.f13168b) {
            try {
                packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
                m.b(packageInfo);
            } catch (PackageManager.NameNotFoundException unused) {
                cVar.f().a("Cannot find package with application.packageName: " + application.getPackageName());
                packageInfo = new PackageInfo();
            }
            this.C = packageInfo;
            rc.c cVar3 = this.D;
            if (cVar3 == null) {
                m.k("androidAmplitude");
                throw null;
            }
            u0 u0Var = new u0(cVar3);
            PackageInfo packageInfo2 = this.C;
            if (packageInfo2 == null) {
                m.k("packageInfo");
                throw null;
            }
            String str = packageInfo2.versionName;
            if (str == null) {
                str = "Unknown";
            }
            String str2 = str;
            String string = Long.valueOf(packageInfo2.getLongVersionCode()).toString();
            fd.d dVarG = cVar3.g();
            String strE = dVarG.e(fd.c.APP_VERSION);
            String strE2 = dVarG.e(fd.c.APP_BUILD);
            if (strE2 == null) {
                rc.c.i(cVar3, "[Amplitude] Application Installed", d0.R(new k[]{new k("[Amplitude] Version", str2), new k("[Amplitude] Build", string)}), 4);
            } else if (!m.a(string, strE2)) {
                rc.c.i(cVar3, "[Amplitude] Application Updated", d0.R(new k[]{new k("[Amplitude] Previous Version", strE), new k("[Amplitude] Previous Build", strE2), new k("[Amplitude] Version", str2), new k("[Amplitude] Build", string)}), 4);
            }
            c0.y(cVar3.f13153c, cVar3.f13156f, (a0) null, new a1.g(u0Var, dVarG, str2, string, null, 8), 2);
        }
        h40.e eVar = m0.a;
        c0.y(zVar, f40.m.a, (a0) null, new z.b(this, cVar2, i10), 2);
    }

    @Override
    public final hd.b getType() {
        return this.B;
    }

    @Override
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m.e(activity, "activity");
        this.G.add(Integer.valueOf(activity.hashCode()));
        f fVar = this.E;
        if (fVar == null) {
            m.k("autocaptureState");
            throw null;
        }
        if (fVar.f13169c) {
            rc.c cVar = this.D;
            if (cVar == null) {
                m.k("androidAmplitude");
                throw null;
            }
            if (((Boolean) ((p) new u0(cVar).C).getValue()).booleanValue()) {
                WeakHashMap weakHashMap = vc.b.f15605a;
                o oVar = new o(2, cVar, rc.c.class, "track", "track(Ljava/lang/String;Ljava/util/Map;Lcom/amplitude/core/events/EventOptions;)Lcom/amplitude/core/Amplitude;", 8, 3);
                cd.b bVarF = cVar.f();
                m.e(bVarF, "logger");
                o0 o0Var = activity instanceof o0 ? (o0) activity : null;
                if (o0Var == null) {
                    bVarF.b("Activity is not a FragmentActivity");
                    return;
                }
                vc.a aVar = new vc.a(oVar, bVarF);
                p0 p0Var = o0Var.getSupportFragmentManager().f761o;
                p0Var.getClass();
                ((CopyOnWriteArrayList) p0Var.f803b).add(new w0(aVar, true));
                WeakHashMap weakHashMap2 = vc.b.f15605a;
                Object arrayList = weakHashMap2.get(o0Var);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    weakHashMap2.put(o0Var, arrayList);
                }
                ((List) arrayList).add(aVar);
            }
        }
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        m.e(activity, "activity");
        this.G.remove(Integer.valueOf(activity.hashCode()));
        f fVar = this.E;
        if (fVar == null) {
            m.k("autocaptureState");
            throw null;
        }
        if (fVar.f13169c) {
            rc.c cVar = this.D;
            if (cVar == null) {
                m.k("androidAmplitude");
                throw null;
            }
            if (((Boolean) ((p) new u0(cVar).C).getValue()).booleanValue()) {
                WeakHashMap weakHashMap = vc.b.f15605a;
                cd.b bVarF = cVar.f();
                m.e(bVarF, "logger");
                o0 o0Var = activity instanceof o0 ? (o0) activity : null;
                if (o0Var == null) {
                    bVarF.b("Activity is not a FragmentActivity");
                    return;
                }
                List<vc.a> list = (List) vc.b.f15605a.remove(o0Var);
                if (list != null) {
                    for (vc.a aVar : list) {
                        p0 p0Var = o0Var.getSupportFragmentManager().f761o;
                        p0Var.getClass();
                        m.e(aVar, "cb");
                        synchronized (((CopyOnWriteArrayList) p0Var.f803b)) {
                            int size = ((CopyOnWriteArrayList) p0Var.f803b).size();
                            for (int i10 = 0; i10 < size; i10++) {
                                if (((w0) ((CopyOnWriteArrayList) p0Var.f803b).get(i10)).f850a == aVar) {
                                    ((CopyOnWriteArrayList) p0Var.f803b).remove(i10);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        m.e(activity, "activity");
        f fVar = this.E;
        if (fVar == null) {
            m.k("autocaptureState");
            throw null;
        }
        if (fVar.f13171e.isEmpty()) {
            return;
        }
        rc.c cVar = this.D;
        if (cVar == null) {
            m.k("androidAmplitude");
            throw null;
        }
        new u0(cVar);
        Window window = activity.getWindow();
        if (window == null) {
            cVar.f().a("Failed to stop user interaction event tracking: Activity window is null");
            return;
        }
        Window.Callback callback = window.getCallback();
        wc.b bVar = callback instanceof wc.b ? (wc.b) callback : null;
        if (bVar != null) {
            Window.Callback callback2 = bVar.A;
            window.setCallback(callback2 instanceof wc.d ? null : callback2);
        }
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        Window.Callback bVar;
        m.e(activity, "activity");
        f fVar = this.E;
        b0 b0Var = null;
        if (fVar == null) {
            m.k("autocaptureState");
            throw null;
        }
        if (fVar.f13171e.isEmpty()) {
            return;
        }
        rc.c cVar = this.D;
        if (cVar == null) {
            m.k("androidAmplitude");
            throw null;
        }
        new u0(cVar);
        q qVar = this.F;
        f fVar2 = this.E;
        if (fVar2 == null) {
            m.k("autocaptureState");
            throw null;
        }
        Window window = activity.getWindow();
        if (window != null) {
            Window.Callback callback = window.getCallback();
            if (callback == null) {
                callback = new wc.d();
            }
            if (qVar != null) {
                bVar = new wc.c(callback, activity, new o(2, cVar, rc.c.class, "track", "track(Ljava/lang/String;Ljava/util/Map;Lcom/amplitude/core/events/EventOptions;)Lcom/amplitude/core/Amplitude;", 8, 4), (List) ((u00.k) xc.e.f16516a.getValue()).invoke(cVar.f()), cVar.f(), fVar2, qVar);
            } else {
                bVar = new wc.b(callback, activity, new o(2, cVar, rc.c.class, "track", "track(Ljava/lang/String;Ljava/util/Map;Lcom/amplitude/core/events/EventOptions;)Lcom/amplitude/core/Amplitude;", 8, 5), (List) ((u00.k) xc.e.f16516a.getValue()).invoke(cVar.f()), cVar.f(), fVar2);
            }
            window.setCallback(bVar);
            b0Var = b0.a;
        }
        if (b0Var == null) {
            cVar.f().a("Failed to track user interaction event: Activity window is null");
        }
    }

    @Override
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m.e(activity, "activity");
        m.e(bundle, "bundle");
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        m.e(activity, "activity");
        if (!this.G.contains(Integer.valueOf(activity.hashCode()))) {
            onActivityCreated(activity, activity.getIntent().getExtras());
        }
        LinkedHashSet linkedHashSet = this.H;
        if (linkedHashSet.isEmpty()) {
            rc.c cVar = this.D;
            if (cVar == null) {
                m.k("androidAmplitude");
                throw null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            rc.a0 a0Var = cVar.f13157g;
            m.c(a0Var, "null cannot be cast to non-null type com.amplitude.android.Timeline");
            a0Var.C.j(new j(jCurrentTimeMillis));
        }
        linkedHashSet.add(Integer.valueOf(activity.hashCode()));
        f fVar = this.E;
        if (fVar == null) {
            m.k("autocaptureState");
            throw null;
        }
        if (fVar.f13168b && linkedHashSet.size() == 1) {
            rc.c cVar2 = this.D;
            if (cVar2 == null) {
                m.k("androidAmplitude");
                throw null;
            }
            new u0(cVar2);
            PackageInfo packageInfo = this.C;
            if (packageInfo == null) {
                m.k("packageInfo");
                throw null;
            }
            rc.c.i(cVar2, "[Amplitude] Application Opened", d0.R(new k[]{new k("[Amplitude] From Background", Boolean.valueOf(this.I)), new k("[Amplitude] Version", packageInfo.versionName), new k("[Amplitude] Build", Long.valueOf(packageInfo.getLongVersionCode()).toString())}), 4);
            this.I = false;
        }
        f fVar2 = this.E;
        if (fVar2 == null) {
            m.k("autocaptureState");
            throw null;
        }
        if (fVar2.f13170d) {
            rc.c cVar3 = this.D;
            if (cVar3 == null) {
                m.k("androidAmplitude");
                throw null;
            }
            new u0(cVar3);
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri referrer = activity.getReferrer();
                String string = referrer != null ? referrer.toString() : null;
                Uri data = intent.getData();
                if (data != null) {
                    String string2 = data.toString();
                    m.d(string2, "toString(...)");
                    rc.c.i(cVar3, "[Amplitude] Deep Link Opened", d0.R(new k[]{new k("[Amplitude] Link URL", string2), new k("[Amplitude] Link Referrer", string)}), 4);
                }
            }
        }
        f fVar3 = this.E;
        if (fVar3 == null) {
            m.k("autocaptureState");
            throw null;
        }
        if (fVar3.f13169c) {
            rc.c cVar4 = this.D;
            if (cVar4 == null) {
                m.k("androidAmplitude");
                throw null;
            }
            u0 u0Var = new u0(cVar4);
            try {
                rc.c.i(cVar4, "[Amplitude] Screen Viewed", d0.Q(new k("[Amplitude] Screen Name", y3.I(activity))), 4);
            } catch (Exception e3) {
                ((rc.c) u0Var.B).f().a("Failed to track screen viewed event: " + e3);
            }
        }
    }

    @Override
    public final void onActivityStopped(Activity activity) {
        m.e(activity, "activity");
        Integer numValueOf = Integer.valueOf(activity.hashCode());
        LinkedHashSet linkedHashSet = this.H;
        linkedHashSet.remove(numValueOf);
        f fVar = this.E;
        k00.c cVar = null;
        if (fVar == null) {
            m.k("autocaptureState");
            throw null;
        }
        if (fVar.f13168b && linkedHashSet.isEmpty()) {
            rc.c cVar2 = this.D;
            if (cVar2 == null) {
                m.k("androidAmplitude");
                throw null;
            }
            new u0(cVar2);
            rc.c.i(cVar2, "[Amplitude] Application Backgrounded", null, 6);
            this.I = true;
        }
        if (linkedHashSet.isEmpty()) {
            rc.c cVar3 = this.D;
            if (cVar3 == null) {
                m.k("androidAmplitude");
                throw null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            rc.a0 a0Var = cVar3.f13157g;
            m.c(a0Var, "null cannot be cast to non-null type com.amplitude.android.Timeline");
            a0Var.C.j(new l(jCurrentTimeMillis));
            if (cVar3.f13151a.f13182k) {
                c0.y(cVar3.f13153c, cVar3.f13154d, (a0) null, new a1.a0(cVar3, cVar, 18), 2);
            }
        }
    }
}

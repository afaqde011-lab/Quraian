package a50;

import a40.k;
import android.animation.ValueAnimator;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.e0;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import ba.l;
import c3.x1;
import c3.z;
import com.google.android.gms.common.api.internal.n0;
import com.google.android.gms.internal.play_billing.r0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import i7.m1;
import java.io.IOException;
import java.util.Date;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import k.k0;
import k00.f;
import o9.t0;
import p.j1;
import qd.d0;
import qd.h;
import qd.o0;
import qd.u0;
import s7.c0;
import sj.j;
import tf.a0;
import tf.a1;
import tf.a3;
import tf.b0;
import tf.b3;
import tf.c3;
import tf.e1;
import tf.e3;
import tf.e4;
import tf.h1;
import tf.h3;
import tf.i2;
import tf.i3;
import tf.j3;
import tf.m;
import tf.o3;
import tf.q0;
import tf.w0;
import tf.x2;
import tf.y0;
import tf.y1;
import tf.y3;
import tf.z3;
import xf.g;
import z4.j0;

public final class d implements Runnable {
    public final int A;
    public final Object B;

    public d(n0 n0Var) {
        this.A = 8;
        Objects.requireNonNull(n0Var);
        this.B = n0Var;
    }

    public d(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    public d(u0 u0Var, boolean z) {
        this.A = 20;
        this.B = u0Var;
    }

    public d(qj.c cVar) {
        this.A = 7;
        Objects.requireNonNull(cVar);
        this.B = cVar;
    }

    public d(y3 y3Var, z3 z3Var) {
        this.A = 24;
        this.B = y3Var;
    }

    @Override
    public final void run() {
        a aVarC;
        long jNanoTime;
        Object obj;
        int actionMasked;
        boolean zA;
        switch (this.A) {
            case 0:
                break;
            case 1:
                synchronized (((e0) this.B).a) {
                    obj = ((e0) this.B).f;
                    ((e0) this.B).f = e0.k;
                    break;
                }
                ((e0) this.B).h(obj);
                return;
            case 2:
                b40.e.a((k) this.B);
                return;
            case 3:
                l lVar = (l) this.B;
                ValueAnimator valueAnimator = lVar.z;
                int i = lVar.A;
                if (i == 1) {
                    valueAnimator.cancel();
                } else if (i != 2) {
                    return;
                }
                lVar.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 4:
                ((StaggeredGridLayoutManager) this.B).D0();
                return;
            case 5:
                z zVar = (z) this.B;
                zVar.removeCallbacks(this);
                MotionEvent motionEvent = zVar.V0;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                int i2 = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i2 = 2;
                }
                z zVar2 = (z) this.B;
                zVar2.I(motionEvent, i2, zVar2.W0, false);
                return;
            case 6:
                ((com.google.android.gms.common.api.internal.z) this.B).a();
                return;
            case 7:
                com.google.android.gms.common.api.internal.z zVar3 = (com.google.android.gms.common.api.internal.z) ((qj.c) this.B).B;
                zVar3.f.disconnect(zVar3.f.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 8:
                ((n0) this.B).k.g(new pe.b(4, (PendingIntent) null, (String) null));
                return;
            case 9:
                e5.c cVar = (e5.c) this.B;
                j1 j1Var = cVar.C;
                e5.a aVar = cVar.A;
                if (cVar.O) {
                    if (cVar.M) {
                        cVar.M = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.e = jCurrentAnimationTimeMillis;
                        aVar.g = -1L;
                        aVar.f = jCurrentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.g + ((long) aVar.i)) || !cVar.e()) {
                        cVar.O = false;
                        return;
                    }
                    if (cVar.N) {
                        cVar.N = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        j1Var.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - aVar.f;
                    aVar.f = jCurrentAnimationTimeMillis2;
                    cVar.Q.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.d));
                    WeakHashMap weakHashMap = j0.a;
                    j1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 10:
                x1 x1Var = (x1) this.B;
                x1Var.b = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) x1Var.e;
                p5.c cVar2 = bottomSheetBehavior.O;
                if (cVar2 != null && cVar2.f()) {
                    x1Var.b(x1Var.c);
                    return;
                } else {
                    if (bottomSheetBehavior.N == 2) {
                        bottomSheetBehavior.L(x1Var.c);
                        return;
                    }
                    return;
                }
            case 11:
                k0 k0Var = (k0) this.B;
                Window.Callback callback = k0Var.b;
                o.l lVarT = k0Var.t();
                o.l lVar2 = lVarT instanceof o.l ? lVarT : null;
                if (lVar2 != null) {
                    lVar2.w();
                }
                try {
                    lVarT.clear();
                    if (!callback.onCreatePanelMenu(0, lVarT) || !callback.onPreparePanel(0, null, lVarT)) {
                        lVarT.clear();
                    }
                    if (lVar2 != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (lVar2 != null) {
                        lVar2.v();
                    }
                }
                break;
            case 12:
                ((t0) this.B).a();
                return;
            case 13:
                if (((g) this.B).c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 14:
                j1 j1Var2 = (j1) this.B;
                j1Var2.L = null;
                j1Var2.drawableStateChanged();
                return;
            case 15:
                View view = (SearchView.SearchAutoComplete) this.B;
                if (((SearchView.SearchAutoComplete) view).F) {
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                    ((SearchView.SearchAutoComplete) view).F = false;
                    return;
                }
                return;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                ((Toolbar) this.B).u();
                return;
            case 17:
                ((p5.c) this.B).n(0);
                return;
            case 18:
                d0 d0Var = (d0) this.B;
                qd.b bVar = d0Var.D;
                bVar.I(0);
                h hVar = o0.k;
                bVar.H(24, hVar);
                d0Var.d(hVar);
                return;
            case 19:
                j jVar = (j) this.B;
                synchronized (jVar) {
                    zA = jVar.a();
                    if (zA) {
                        synchronized (jVar) {
                            jVar.b = true;
                        }
                    }
                }
                if (zA) {
                    sj.k kVarC = jVar.q.c();
                    jVar.p.getClass();
                    if (new Date(System.currentTimeMillis()).before(kVarC.b)) {
                        jVar.h();
                        return;
                    }
                    jj.c cVar3 = jVar.k;
                    Task taskD = cVar3.d();
                    Task taskC = cVar3.c();
                    Task taskI = Tasks.f(new Task[]{taskD, taskC}).i(jVar.h, new ce.a(jVar, taskD, taskC, 12));
                    Tasks.f(new Task[]{taskI}).h(jVar.h, new c0(jVar, taskI, 4));
                    return;
                }
                return;
            case 20:
                ((y3) ((u0) this.B).d).K();
                return;
            case 21:
                c3 c3Var = ((b3) this.B).C;
                c3Var.g1(new ComponentName(((h1) ((f5.c) c3Var).B).A, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case 22:
                c3 c3Var2 = ((b3) ((r0) this.B).C).C;
                e1 e1Var = ((h1) ((f5.c) c3Var2).B).G;
                h1.g(e1Var);
                e1Var.e1(new a3(c3Var2, 0));
                return;
            case 23:
                h3 h3Var = (h3) this.B;
                j3 j3Var = (j3) h3Var.C.C;
                j3Var.V0();
                h1 h1Var = (h1) ((f5.c) j3Var).B;
                q0 q0Var = h1Var.F;
                Context context = h1Var.A;
                h1.g(q0Var);
                q0Var.N.b("Application going to the background");
                w0 w0Var = h1Var.E;
                h1.e(w0Var);
                w0Var.T.b(true);
                j3Var.V0();
                j3Var.E = true;
                tf.g gVar = h1Var.D;
                if (!gVar.j1()) {
                    long j2 = h3Var.B;
                    s7.w0 w0Var2 = j3Var.G;
                    w0Var2.h(j2, false, false);
                    ((i3) w0Var2.C).c();
                }
                long j3 = h3Var.A;
                h1.g(q0Var);
                q0Var.M.c(Long.valueOf(j3), "Application backgrounded at: timestamp_millis");
                i2 i2Var = h1Var.M;
                h1.f(i2Var);
                i2Var.V0();
                h1 h1Var2 = (h1) ((f5.c) i2Var).B;
                i2Var.W0();
                c3 c3VarJ = h1Var2.j();
                c3VarJ.V0();
                c3VarJ.W0();
                if (c3VarJ.c1()) {
                    e4 e4Var = ((h1) ((f5.c) c3VarJ).B).I;
                    h1.e(e4Var);
                    if (e4Var.B1() >= 242600) {
                        c3 c3VarJ2 = h1Var2.j();
                        c3VarJ2.V0();
                        c3VarJ2.W0();
                        c3VarJ2.j1(new x2(c3VarJ2, c3VarJ2.l1(true), 1));
                    }
                } else {
                    c3 c3VarJ3 = h1Var2.j();
                    c3VarJ3.V0();
                    c3VarJ3.W0();
                    c3VarJ3.j1(new x2(c3VarJ3, c3VarJ3.l1(true), 1));
                }
                if (gVar.f1((String) null, b0.N0)) {
                    e4 e4Var2 = h1Var.I;
                    h1.e(e4Var2);
                    long jC1 = e4Var2.v1(context.getPackageName(), gVar.D) ? 1000L : gVar.c1(context.getPackageName(), b0.E);
                    h1.g(q0Var);
                    q0Var.O.c(Long.valueOf(jC1), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    h1.d(h1Var.U);
                    h1Var.U.Z0(jC1);
                    return;
                }
                return;
            case 24:
                y3 y3Var = (y3) this.B;
                y3Var.C().V0();
                y3Var.K = new y0(y3Var);
                m mVar = new m(y3Var);
                mVar.X0();
                y3Var.C = mVar;
                a1 a1Var = y3Var.A;
                tf.g gVarB0 = y3Var.b0();
                com.google.android.gms.common.internal.d0.h(a1Var);
                gVarB0.E = a1Var;
                e3 e3Var = new e3(y3Var);
                e3Var.X0();
                y3Var.I = e3Var;
                tf.c cVar4 = new tf.c(y3Var);
                cVar4.X0();
                y3Var.F = cVar4;
                tf.t0 t0Var = new tf.t0(y3Var, 1);
                t0Var.X0();
                y3Var.H = t0Var;
                o3 o3Var = new o3(y3Var);
                o3Var.X0();
                y3Var.E = o3Var;
                y3Var.D = new u0(y3Var);
                if (y3Var.R != y3Var.S) {
                    y3Var.t().G.d("Not all upload components initialized", Integer.valueOf(y3Var.R), Integer.valueOf(y3Var.S));
                }
                y3Var.M.set(true);
                y3Var.t().O.b("UploadController is now fully initialized");
                y3Var.C().V0();
                m mVar2 = y3Var.C;
                y3.R(mVar2);
                mVar2.f1();
                m mVar3 = y3Var.C;
                y3.R(mVar3);
                mVar3.V0();
                mVar3.W0();
                if (mVar3.C1()) {
                    a0 a0Var = b0.v0;
                    if (((Long) a0Var.a((Object) null)).longValue() != 0) {
                        SQLiteDatabase sQLiteDatabaseK1 = mVar3.K1();
                        h1 h1Var3 = (h1) ((f5.c) mVar3).B;
                        h1Var3.K.getClass();
                        int iDelete = sQLiteDatabaseK1.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(a0Var.a((Object) null))});
                        if (iDelete > 0) {
                            q0 q0Var2 = h1Var3.F;
                            h1.g(q0Var2);
                            q0Var2.O.c(Integer.valueOf(iDelete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (y3Var.I.I.e() == 0) {
                    m1 m1Var = y3Var.I.I;
                    y3Var.k0().getClass();
                    m1Var.f(System.currentTimeMillis());
                }
                y3Var.K();
                return;
            case 25:
                h1 h1Var4 = (h1) ((androidx.mediarouter.app.g) this.B).b;
                h1.d(h1Var4.U);
                h1Var4.U.Z0(((Long) b0.D.a((Object) null)).longValue());
                return;
            case 26:
                h1 h1Var5 = (h1) this.B;
                e4 e4Var3 = h1Var5.I;
                i2 i2Var2 = h1Var5.M;
                h1.e(e4Var3);
                e4Var3.V0();
                if (e4Var3.q1() != 1) {
                    q0 q0Var3 = h1Var5.F;
                    h1.g(q0Var3);
                    q0Var3.J.b("registerTrigger called but app not eligible");
                    return;
                }
                h1.f(i2Var2);
                i2Var2.V0();
                y1 y1Var = i2Var2.M;
                if (y1Var != null) {
                    y1Var.c();
                }
                h1.f(i2Var2);
                new Thread((Runnable) new tf.x1(i2Var2, 3)).start();
                return;
            case 27:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.B).C.G;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            default:
                ((w7.k) this.B).d();
                return;
        }
        while (true) {
            e eVar = (e) this.B;
            synchronized (eVar) {
                aVarC = eVar.c();
            }
            if (aVarC == null) {
                return;
            }
            c cVar5 = aVarC.c;
            kotlin.jvm.internal.m.b(cVar5);
            e eVar2 = (e) this.B;
            boolean zIsLoggable = e.i.isLoggable(Level.FINE);
            if (zIsLoggable) {
                jNanoTime = System.nanoTime();
                f.m(aVarC, cVar5, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                e.a(eVar2, aVarC);
                if (zIsLoggable) {
                    f.m(aVarC, cVar5, "finished run in ".concat(f.x(System.nanoTime() - jNanoTime)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) eVar2.a.B).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (zIsLoggable) {
                        f.m(aVarC, cVar5, "failed a run in ".concat(f.x(System.nanoTime() - jNanoTime)));
                    }
                    throw th2;
                }
            }
        }
    }
}

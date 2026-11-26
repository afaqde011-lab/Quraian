package com.mchutov.p000quranify.main.presentation.screen.main;

import a8.o0;
import am.c;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.i1;
import androidx.fragment.app.p0;
import androidx.fragment.app.w0;
import androidx.lifecycle.u0;
import com.google.android.gms.internal.measurement.y3;
import com.mchutov.Quranify.R;
import d.h0;
import d.q;
import d.r;
import d.s;
import d.v;
import d40.l1;
import du.a0;
import du.t0;
import du.w;
import du.y;
import du.z;
import e.e;
import f5.j;
import g00.i;
import i2.b0;
import i2.t;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import k.k;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import no.g;
import qd.b;
import rd.a;
import sd.p1;
import sn.h;
import sn.l;
import ta.c0;
import tf.x;
import ze.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/mchutov/quranify/main/presentation/screen/main/MainActivity;", "Lk/k;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MainActivity extends k {
    public static final int R = 0;
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final Object K;
    public final Object L;
    public boolean M;
    public boolean N;
    public boolean O;
    public b P;
    public final Object Q;

    public MainActivity() {
        i iVar = i.A;
        this.A = a.I(iVar, new a0(this, 3));
        this.B = a.I(iVar, new a0(this, 4));
        this.C = a.I(iVar, new a0(this, 5));
        this.D = a.I(iVar, new a0(this, 6));
        this.E = a.I(iVar, new a0(this, 7));
        this.F = a.I(iVar, new a0(this, 8));
        this.G = a.I(iVar, new a0(this, 9));
        this.H = a.I(iVar, new a0(this, 10));
        this.I = a.I(iVar, new a0(this, 11));
        this.J = a.I(iVar, new a0(this, 0));
        this.K = a.I(iVar, new a0(this, 1));
        this.L = a.I(iVar, new a0(this, 2));
        this.Q = a.I(i.C, new a0(this, 12));
    }

    public static void h(MainActivity mainActivity) {
        Configuration configuration = mainActivity.getResources().getConfiguration();
        m.d(configuration, "getConfiguration(...)");
        mainActivity.g(configuration);
    }

    public final void g(Configuration configuration) {
        boolean z11 = this.N || this.O;
        if (isFinishing()) {
            return;
        }
        if (configuration.smallestScreenWidthDp > 600 || z11) {
            setRequestedOrientation(-1);
            return;
        }
        if (configuration.orientation == 2) {
            setRequestedOrientation(-1);
        }
        setRequestedOrientation(1);
    }

    public final void i(Intent intent) {
        Uri data;
        String string;
        if (intent == null || (data = intent.getData()) == null || (string = data.toString()) == null) {
            return;
        }
        intent.setData(null);
        c cVar = (c) this.L.getValue();
        cVar.getClass();
        if (d.M(string) == null) {
            return;
        }
        ul.a aVar = cVar.f639a;
        aVar.getClass();
        aVar.f20898b = string;
        SharedPreferences.Editor editorEdit = aVar.f20897a.edit();
        editorEdit.putString("pending_deep_link_url", string);
        editorEdit.apply();
        cVar.b();
    }

    public final void j() {
        b bVar;
        b bVar2 = this.P;
        if (bVar2 == null || !bVar2.N() || (bVar = this.P) == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        bVar.h(this, new qd.i(hashSet), new w(0));
    }

    @Override
    public final void onConfigurationChanged(Configuration newConfig) {
        m.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        g(newConfig);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        int i11;
        int i12;
        new x(this);
        Resources.Theme theme = getTheme();
        m.d(theme, "getTheme(...)");
        TypedValue typedValue = new TypedValue();
        int i13 = 1;
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i12 = typedValue.resourceId) != 0) {
            setTheme(i12);
        }
        ((t0) this.Q.getValue()).l(du.a.f6250a);
        k00.c cVar = null;
        c0.M(u0.g(this), null, null, null, new y(this, cVar, 4), 31);
        int i14 = 2;
        c0.M(u0.g(this), null, null, null, new y(this, cVar, i14), 31);
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        c0.M(u0.g(this), null, null, null, new y(this, cVar, 0), 31);
        c0.M(u0.g(this), null, null, null, new y(this, cVar, 3), 31);
        c0.M(u0.g(this), null, null, null, new y(this, cVar, i13), 31);
        c0.M(u0.g(this), null, null, null, new y(this, cVar, 5), 31);
        super.onCreate(bundle);
        this.N = getSupportFragmentManager().D("BackgroundBottomSheetComposeFragment") != null;
        this.O = getSupportFragmentManager().D("AudioStoryPlayerBottomSheetFragment") != null;
        h(this);
        i1 supportFragmentManager = getSupportFragmentManager();
        z zVar = new z(this);
        p0 p0Var = supportFragmentManager.f924o;
        p0Var.getClass();
        ((CopyOnWriteArrayList) p0Var.f966b).add(new w0(zVar, false));
        long j9 = t.f9998f;
        int iC = b0.C(j9);
        int i15 = 11;
        h0 h0Var = new h0(iC, iC, new bw.b(i15));
        int iC2 = b0.C(j9);
        h0 h0Var2 = new h0(iC2, iC2, new bw.b(i15));
        v vVar = r.f5468a;
        View decorView = getWindow().getDecorView();
        m.d(decorView, "getDecorView(...)");
        v wVar = r.f5468a;
        if (wVar == null) {
            wVar = Build.VERSION.SDK_INT >= 35 ? new d.w() : new v();
            r.f5468a = wVar;
        }
        v vVar2 = wVar;
        com.revenuecat.purchases.d dVar = new com.revenuecat.purchases.d(vVar2, h0Var, h0Var2, this, decorView, 1);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i16 = 0;
        while (true) {
            i11 = 8;
            if (i16 >= viewGroup.getChildCount()) {
                q qVar = new q(dVar, viewGroup.getContext());
                qVar.setTag(vVar2);
                qVar.setVisibility(8);
                qVar.setWillNotDraw(true);
                viewGroup.addView(qVar);
                break;
            }
            int i17 = i16 + 1;
            View childAt = viewGroup.getChildAt(i16);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof s) {
                break;
            } else {
                i16 = i17;
            }
        }
        dVar.run();
        Window window = getWindow();
        m.d(window, "getWindow(...)");
        vVar2.b(window);
        v1.c cVar2 = new v1.c(new du.v(this, objArr2 == true ? 1 : 0), -1538928816, true);
        ViewGroup.LayoutParams layoutParams = e.f6377a;
        View childAt2 = ((ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        ComposeView composeView = childAt2 instanceof ComposeView ? (ComposeView) childAt2 : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(cVar2);
        } else {
            ComposeView composeView2 = new ComposeView(this, null, 6);
            composeView2.setParentCompositionContext(null);
            composeView2.setContent(cVar2);
            View decorView2 = getWindow().getDecorView();
            if (u0.e(decorView2) == null) {
                u0.k(decorView2, this);
            }
            if (u0.f(decorView2) == null) {
                u0.l(decorView2, this);
            }
            if (y3.E(decorView2) == null) {
                y3.X(decorView2, this);
            }
            setContentView(composeView2, e.f6377a);
        }
        ki.b bVar = new ki.b(this);
        bVar.f13157a = new o0(objArr == true ? 1 : 0);
        bVar.f13159c = new w(i13);
        b bVarA = bVar.a();
        this.P = bVarA;
        bVarA.i(new qj.c(this, 18));
        nn.k kVar = (nn.k) this.D.getValue();
        SharedPreferences sharedPreferences = kVar.f15413d;
        if (sharedPreferences.getBoolean("WIDGET_WAS_PLAYING_KEY", false)) {
            oi.k.v(sharedPreferences, "WIDGET_WAS_PLAYING_KEY", false);
            kVar.f15412c.a(l.A);
        }
        ((sn.e) this.E.getValue()).a();
        ((sn.c) this.F.getValue()).a(l.C);
        sn.i iVar = (sn.i) this.G.getValue();
        Application application = iVar.f19619a;
        if (Build.VERSION.SDK_INT >= 35) {
            long j11 = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).lastUpdateTime;
            if (iVar.f19620b.getLong("WIDGET_PREVIEWS_PUBLISHED_INSTALL_KEY", 0L) != j11) {
                c0.M(iVar.f19621c, null, new l1(i14, cVar, i11), null, new h(iVar, j11, null), 27);
            }
        }
        if (bundle == null) {
            i(getIntent());
        }
    }

    @Override
    public final void onNewIntent(Intent intent) {
        m.e(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        i(intent);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.N = getSupportFragmentManager().D("BackgroundBottomSheetComposeFragment") != null;
        this.O = getSupportFragmentManager().D("AudioStoryPlayerBottomSheetFragment") != null;
        h(this);
        uu.w wVar = (uu.w) ((uu.a) this.B.getValue());
        k00.c cVar = null;
        c0.M(wVar.f21112q, wVar.f21111p, null, null, new uu.h(wVar, cVar, 6), 30);
        xo.a aVar = (xo.a) this.H.getValue();
        p1 p1Var = aVar.f23104a;
        if (p1Var != null) {
            aVar.f23104a = null;
            if (((a40.k) p1Var.D).w()) {
                ((a40.k) p1Var.D).resumeWith(null);
            }
        }
        j();
        c0.M(u0.g(this), null, null, null, new y(this, cVar, 6), 31);
    }

    @Override
    public final void onStart() {
        super.onStart();
        g gVar = (g) this.J.getValue();
        gVar.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 35 && gVar.f15433b == null) {
            WindowManager windowManager = getWindowManager();
            gVar.f15434c = getLifecycle();
            int iAddScreenRecordingCallback = windowManager.addScreenRecordingCallback(getMainExecutor(), gVar.f15435d);
            d40.p1 p1Var = gVar.f15432a;
            Boolean boolValueOf = Boolean.valueOf(iAddScreenRecordingCallback == 1);
            p1Var.getClass();
            p1Var.k(null, boolValueOf);
            gVar.f15433b = windowManager;
        }
        final mv.b bVar = (mv.b) this.K.getValue();
        bVar.getClass();
        if (i11 < 34 || bVar.f14854b != null) {
            return;
        }
        ?? r4 = new Activity.ScreenCaptureCallback() {
            @Override
            public final void onScreenCaptured() {
                bVar.f14853a.f(g00.b0.f7770a);
            }
        };
        registerScreenCaptureCallback(getMainExecutor(), r4);
        bVar.f14855c = r4;
        bVar.f14854b = this;
    }

    @Override
    public final void onStop() {
        MainActivity mainActivity;
        ((is.y) this.C.getValue()).e();
        g gVar = (g) this.J.getValue();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 35) {
            gVar.getClass();
        } else {
            WindowManager windowManager = gVar.f15433b;
            if (windowManager != null) {
                windowManager.removeScreenRecordingCallback(gVar.f15435d);
            }
            gVar.f15433b = null;
            gVar.f15434c = null;
        }
        mv.b bVar = (mv.b) this.K.getValue();
        if (i11 < 34) {
            bVar.getClass();
        } else {
            mv.a aVar = bVar.f14855c;
            Activity.ScreenCaptureCallback screenCaptureCallbackB = j.z(aVar) ? j.b(aVar) : null;
            if (screenCaptureCallbackB != null && (mainActivity = bVar.f14854b) != null) {
                mainActivity.unregisterScreenCaptureCallback(screenCaptureCallbackB);
            }
            bVar.f14855c = null;
            bVar.f14854b = null;
        }
        super.onStop();
    }
}

package com.mchutov.quranify.main.presentation.screen.main;

import a8.o0;
import am.c;
import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
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
import u00.n;
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
        boolean z = this.N || this.O;
        if (isFinishing()) {
            return;
        }
        if (configuration.smallestScreenWidthDp > 600 || z) {
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
        ul.a aVar = cVar.a;
        aVar.getClass();
        aVar.b = string;
        SharedPreferences.Editor editorEdit = aVar.a.edit();
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

    public final void onConfigurationChanged(Configuration newConfig) {
        m.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        g(newConfig);
    }

    public final void onCreate(Bundle bundle) {
        int i;
        new x(this);
        Resources.Theme theme = getTheme();
        m.d(theme, "getTheme(...)");
        TypedValue typedValue = new TypedValue();
        int i2 = 1;
        if (theme.resolveAttribute(2130969688, typedValue, true) && (i = typedValue.resourceId) != 0) {
            setTheme(i);
        }
        ((t0) this.Q.getValue()).l(du.a.a);
        k00.c cVar = null;
        c0.M(u0.g(this), (k00.i) null, (n) null, (u00.k) null, new y(this, cVar, 4), 31);
        c0.M(u0.g(this), (k00.i) null, (n) null, (u00.k) null, new y(this, cVar, 2), 31);
        int i3 = 0;
        c0.M(u0.g(this), (k00.i) null, (n) null, (u00.k) null, new y(this, cVar, i3), 31);
        c0.M(u0.g(this), (k00.i) null, (n) null, (u00.k) null, new y(this, cVar, 3), 31);
        c0.M(u0.g(this), (k00.i) null, (n) null, (u00.k) null, new y(this, cVar, i2), 31);
        c0.M(u0.g(this), (k00.i) null, (n) null, (u00.k) null, new y(this, cVar, 5), 31);
        super/*androidx.fragment.app.o0*/.onCreate(bundle);
        this.N = getSupportFragmentManager().D("BackgroundBottomSheetComposeFragment") != null;
        this.O = getSupportFragmentManager().D("AudioStoryPlayerBottomSheetFragment") != null;
        h(this);
        i1 supportFragmentManager = getSupportFragmentManager();
        z zVar = new z(this);
        p0 p0Var = supportFragmentManager.o;
        p0Var.getClass();
        ((CopyOnWriteArrayList) p0Var.b).add(new w0(zVar, false));
        long j = t.f;
        int iC = b0.C(j);
        int i4 = 11;
        h0 h0Var = new h0(iC, iC, new bw.b(i4));
        int iC2 = b0.C(j);
        h0 h0Var2 = new h0(iC2, iC2, new bw.b(i4));
        v vVar = r.a;
        View decorView = getWindow().getDecorView();
        m.d(decorView, "getDecorView(...)");
        d.w wVar = r.a;
        if (wVar == null) {
            wVar = Build.VERSION.SDK_INT >= 35 ? new d.w() : new v();
            r.a = wVar;
        }
        d.w wVar2 = wVar;
        com.revenuecat.purchases.d dVar = new com.revenuecat.purchases.d(wVar2, h0Var, h0Var2, this, decorView, 1);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i5 = 0;
        while (true) {
            if (i5 >= viewGroup.getChildCount()) {
                q qVar = new q(dVar, viewGroup.getContext());
                qVar.setTag(wVar2);
                qVar.setVisibility(8);
                qVar.setWillNotDraw(true);
                viewGroup.addView(qVar);
                break;
            }
            int i6 = i5 + 1;
            View childAt = viewGroup.getChildAt(i5);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof s) {
                break;
            } else {
                i5 = i6;
            }
        }
        dVar.run();
        Window window = getWindow();
        m.d(window, "getWindow(...)");
        wVar2.b(window);
        v1.c cVar2 = new v1.c(new du.v(this, i3), -1538928816, true);
        ViewGroup.LayoutParams layoutParams = e.a;
        ComposeView childAt2 = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt2 instanceof ComposeView ? childAt2 : null;
        if (composeView != null) {
            composeView.setParentCompositionContext((l1.n) null);
            composeView.setContent(cVar2);
        } else {
            ComposeView composeView2 = new ComposeView(this, (AttributeSet) null, 6);
            composeView2.setParentCompositionContext((l1.n) null);
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
            setContentView(composeView2, e.a);
        }
        ki.b bVar = new ki.b(this);
        bVar.a = new o0(false);
        bVar.c = new w(1);
        b bVarA = bVar.a();
        this.P = bVarA;
        bVarA.i(new qj.c(this, 18));
        nn.k kVar = (nn.k) this.D.getValue();
        SharedPreferences sharedPreferences = kVar.d;
        if (sharedPreferences.getBoolean("WIDGET_WAS_PLAYING_KEY", false)) {
            oi.k.v(sharedPreferences, "WIDGET_WAS_PLAYING_KEY", false);
            kVar.c.a(l.A);
        }
        ((sn.e) this.E.getValue()).a();
        ((sn.c) this.F.getValue()).a(l.C);
        sn.i iVar = (sn.i) this.G.getValue();
        Application application = iVar.a;
        if (Build.VERSION.SDK_INT >= 35) {
            long j2 = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).lastUpdateTime;
            if (iVar.b.getLong("WIDGET_PREVIEWS_PUBLISHED_INSTALL_KEY", 0L) != j2) {
                c0.M(iVar.c, (k00.i) null, new l1(2, null, 8), (u00.k) null, new h(iVar, j2, null), 27);
            }
        }
        if (bundle == null) {
            i(getIntent());
        }
    }

    public final void onNewIntent(Intent intent) {
        m.e(intent, "intent");
        super/*d.n*/.onNewIntent(intent);
        setIntent(intent);
        i(intent);
    }

    public final void onResume() {
        super/*androidx.fragment.app.o0*/.onResume();
        this.N = getSupportFragmentManager().D("BackgroundBottomSheetComposeFragment") != null;
        this.O = getSupportFragmentManager().D("AudioStoryPlayerBottomSheetFragment") != null;
        h(this);
        uu.w wVar = (uu.w) ((uu.a) this.B.getValue());
        k00.c cVar = null;
        c0.M(wVar.q, wVar.p, (n) null, (u00.k) null, new uu.h(wVar, cVar, 6), 30);
        xo.a aVar = (xo.a) this.H.getValue();
        p1 p1Var = aVar.a;
        if (p1Var != null) {
            aVar.a = null;
            if (((a40.k) p1Var.D).w()) {
                ((a40.k) p1Var.D).resumeWith(null);
            }
        }
        j();
        c0.M(u0.g(this), (k00.i) null, (n) null, (u00.k) null, new y(this, cVar, 6), 31);
    }

    public final void onStart() {
        super.onStart();
        g gVar = (g) this.J.getValue();
        gVar.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && gVar.b == null) {
            WindowManager windowManager = getWindowManager();
            gVar.c = getLifecycle();
            int iA = cb.b.a(windowManager, getMainExecutor(), gVar.d);
            d40.p1 p1Var = gVar.a;
            Boolean boolValueOf = Boolean.valueOf(iA == 1);
            p1Var.getClass();
            p1Var.k(null, boolValueOf);
            gVar.b = windowManager;
        }
        final mv.b bVar = (mv.b) this.K.getValue();
        bVar.getClass();
        if (i < 34 || bVar.b != null) {
            return;
        }
        ?? r1 = new Activity.ScreenCaptureCallback() {
            @Override
            public final void onScreenCaptured() {
                bVar.a.f(g00.b0.a);
            }
        };
        j.x(this, getMainExecutor(), (mv.a) r1);
        bVar.c = r1;
        bVar.b = this;
    }

    public final void onStop() {
        k kVar;
        ((is.y) this.C.getValue()).e();
        g gVar = (g) this.J.getValue();
        int i = Build.VERSION.SDK_INT;
        if (i < 35) {
            gVar.getClass();
        } else {
            WindowManager windowManager = gVar.b;
            if (windowManager != null) {
                cb.b.j(windowManager, gVar.d);
            }
            gVar.b = null;
            gVar.c = null;
        }
        mv.b bVar = (mv.b) this.K.getValue();
        if (i < 34) {
            bVar.getClass();
        } else {
            mv.a aVar = bVar.c;
            Activity.ScreenCaptureCallback screenCaptureCallbackB = j.z(aVar) ? j.b(aVar) : null;
            if (screenCaptureCallbackB != null && (kVar = bVar.b) != null) {
                j.o(kVar, screenCaptureCallbackB);
            }
            bVar.c = null;
            bVar.b = null;
        }
        super.onStop();
    }
}

package k;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import com.google.android.gms.cast.Cast;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p.a1;
import p.c1;
import p.s2;
import p.u2;
import u.s0;

public final class b0 extends p implements o.j, LayoutInflater.Factory2 {
    public static final s0 F0 = new s0(0);
    public static final int[] G0 = {R.attr.windowBackground};
    public static final boolean H0 = !"robolectric".equals(Build.FINGERPRINT);
    public Rect A0;
    public Rect B0;
    public g0 C0;
    public OnBackInvokedDispatcher D0;
    public OnBackInvokedCallback E0;
    public final Object H;
    public final Context I;
    public Window J;
    public x K;
    public final Object L;
    public a M;
    public n.i N;
    public CharSequence O;
    public c1 P;
    public r Q;
    public s R;
    public n.b S;
    public ActionBarContextView T;
    public PopupWindow U;
    public q V;
    public boolean X;
    public ViewGroup Y;
    public TextView Z;

    public View f8340a0;

    public boolean f8341b0;

    public boolean f8342c0;

    public boolean f8343d0;

    public boolean f8344e0;

    public boolean f8345f0;

    public boolean f8346g0;

    public boolean f8347h0;

    public boolean f8348i0;

    public a0[] f8349j0;

    public a0 f8350k0;

    public boolean f8351l0;

    public boolean f8352m0;

    public boolean f8353n0;

    public boolean f8354o0;

    public Configuration f8355p0;

    public final int f8356q0;

    public int f8357r0;

    public int f8358s0;

    public boolean f8359t0;

    public y f8360u0;

    public y f8361v0;

    public boolean f8362w0;

    public int f8363x0;

    public boolean f8365z0;
    public z4.n0 W = null;

    public final q f8364y0 = new q(this, 0);

    public b0(Context context, Window window, l lVar, Object obj) {
        k kVar = null;
        this.f8356q0 = -100;
        this.I = context;
        this.L = lVar;
        this.H = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof k)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    kVar = (k) context;
                    break;
                }
            }
            if (kVar != null) {
                this.f8356q0 = ((b0) kVar.getDelegate()).f8356q0;
            }
        }
        if (this.f8356q0 == -100) {
            String name = this.H.getClass().getName();
            s0 s0Var = F0;
            Integer num = (Integer) s0Var.get(name);
            if (num != null) {
                this.f8356q0 = num.intValue();
                s0Var.remove(this.H.getClass().getName());
            }
        }
        if (window != null) {
            o(window);
        }
        p.r.d();
    }

    public static Configuration s(Context context, int i10, Configuration configuration, boolean z10) {
        int i11;
        if (i10 == 1) {
            i11 = 16;
        } else if (i10 != 2) {
            i11 = z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i11 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    public final void A() {
        v();
        if (this.f8343d0 && this.M == null) {
            Object obj = this.H;
            if (obj instanceof Activity) {
                this.M = new o0((Activity) obj, this.f8344e0);
            } else if (obj instanceof Dialog) {
                this.M = new o0((Dialog) obj);
            }
            a aVar = this.M;
            if (aVar != null) {
                aVar.l(this.f8365z0);
            }
        }
    }

    public final void B(int i10) {
        this.f8363x0 = (1 << i10) | this.f8363x0;
        if (this.f8362w0) {
            return;
        }
        View decorView = this.J.getDecorView();
        WeakHashMap weakHashMap = z4.j0.f17198a;
        decorView.postOnAnimation(this.f8364y0);
        this.f8362w0 = true;
    }

    public final int C(Context context, int i10) {
        if (i10 != -100) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1 && i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f8361v0 == null) {
                            this.f8361v0 = new y(this, context);
                        }
                        return this.f8361v0.h();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return y(context).h();
                }
            }
            return i10;
        }
        return -1;
    }

    public final boolean D() {
        boolean z10 = this.f8351l0;
        this.f8351l0 = false;
        a0 a0VarZ = z(0);
        if (!a0VarZ.m) {
            n.b bVar = this.S;
            if (bVar != null) {
                bVar.a();
                return true;
            }
            A();
            a aVar = this.M;
            if (aVar == null || !aVar.b()) {
                return false;
            }
        } else if (!z10) {
            r(a0VarZ, true);
            return true;
        }
        return true;
    }

    public final void E(k.a0 r18, android.view.KeyEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: k.b0.E(k.a0, android.view.KeyEvent):void");
    }

    public final boolean F(a0 a0Var, int i10, KeyEvent keyEvent) {
        o.l lVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((a0Var.f8336k || G(a0Var, keyEvent)) && (lVar = a0Var.f8333h) != null) {
            return lVar.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    public final boolean G(a0 a0Var, KeyEvent keyEvent) {
        o.l lVar;
        c1 c1Var;
        c1 c1Var2;
        Resources.Theme themeNewTheme;
        c1 c1Var3;
        c1 c1Var4;
        if (!this.f8354o0) {
            boolean z10 = a0Var.f8336k;
            int i10 = a0Var.f8326a;
            if (z10) {
                return true;
            }
            a0 a0Var2 = this.f8350k0;
            if (a0Var2 != null && a0Var2 != a0Var) {
                r(a0Var2, false);
            }
            Window.Callback callback = this.J.getCallback();
            if (callback != null) {
                a0Var.f8332g = callback.onCreatePanelView(i10);
            }
            boolean z11 = i10 == 0 || i10 == 108;
            if (z11 && (c1Var4 = this.P) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) c1Var4;
                actionBarOverlayLayout.k();
                ((s2) actionBarOverlayLayout.E).l = true;
            }
            if (a0Var.f8332g == null && (!z11 || !(this.M instanceof k0))) {
                o.l lVar2 = a0Var.f8333h;
                if (lVar2 == null || a0Var.f8338o) {
                    if (lVar2 == null) {
                        Context context = this.I;
                        if ((i10 == 0 || i10 == 108) && this.P != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(2130968588, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(2130968589, typedValue, true);
                            } else {
                                theme.resolveAttribute(2130968589, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                n.d dVar = new n.d(context, 0);
                                dVar.getTheme().setTo(themeNewTheme);
                                context = dVar;
                            }
                        }
                        o.l lVar3 = new o.l(context);
                        lVar3.f11406e = this;
                        o.l lVar4 = a0Var.f8333h;
                        if (lVar3 != lVar4) {
                            if (lVar4 != null) {
                                lVar4.r(a0Var.f8334i);
                            }
                            a0Var.f8333h = lVar3;
                            o.h hVar = a0Var.f8334i;
                            if (hVar != null) {
                                lVar3.b(hVar, lVar3.f11402a);
                            }
                        }
                        if (a0Var.f8333h != null) {
                            if (z11 && (c1Var2 = this.P) != null) {
                                if (this.Q == null) {
                                    this.Q = new r(this);
                                }
                                ((ActionBarOverlayLayout) c1Var2).l(a0Var.f8333h, this.Q);
                            }
                            a0Var.f8333h.w();
                            if (callback.onCreatePanelMenu(i10, a0Var.f8333h)) {
                                a0Var.f8338o = false;
                            } else {
                                lVar = a0Var.f8333h;
                                if (lVar != null) {
                                    if (lVar != null) {
                                        lVar.r(a0Var.f8334i);
                                    }
                                    a0Var.f8333h = null;
                                }
                                if (z11 && (c1Var = this.P) != null) {
                                    ((ActionBarOverlayLayout) c1Var).l(null, this.Q);
                                }
                            }
                        }
                    } else {
                        if (z11) {
                            if (this.Q == null) {
                                this.Q = new r(this);
                            }
                            ((ActionBarOverlayLayout) c1Var2).l(a0Var.f8333h, this.Q);
                        }
                        a0Var.f8333h.w();
                        if (callback.onCreatePanelMenu(i10, a0Var.f8333h)) {
                            lVar = a0Var.f8333h;
                            if (lVar != null) {
                                if (lVar != null) {
                                    lVar.r(a0Var.f8334i);
                                }
                                a0Var.f8333h = null;
                            }
                            if (z11) {
                                ((ActionBarOverlayLayout) c1Var).l(null, this.Q);
                            }
                        } else {
                            a0Var.f8338o = false;
                        }
                    }
                }
                a0Var.f8333h.w();
                Bundle bundle = a0Var.f8339p;
                if (bundle != null) {
                    a0Var.f8333h.s(bundle);
                    a0Var.f8339p = null;
                }
                if (!callback.onPreparePanel(0, a0Var.f8332g, a0Var.f8333h)) {
                    if (z11 && (c1Var3 = this.P) != null) {
                        ((ActionBarOverlayLayout) c1Var3).l(null, this.Q);
                    }
                    a0Var.f8333h.v();
                    return false;
                }
                a0Var.f8333h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                a0Var.f8333h.v();
            }
            a0Var.f8336k = true;
            a0Var.l = false;
            this.f8350k0 = a0Var;
            return true;
        }
        return false;
    }

    public final void H() {
        if (this.X) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void I() {
        OnBackInvokedCallback onBackInvokedCallback;
        boolean z10 = false;
        if (this.D0 != null && (z(0).m || this.S != null)) {
            z10 = true;
        }
        if (z10 && this.E0 == null) {
            this.E0 = w.b(this.D0, this);
        } else {
            if (z10 || (onBackInvokedCallback = this.E0) == null) {
                return;
            }
            w.c(this.D0, onBackInvokedCallback);
            this.E0 = null;
        }
    }

    @Override
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.I);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof b0) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override
    public final void b() {
        if (this.M != null) {
            A();
            if (this.M.f()) {
                return;
            }
            B(0);
        }
    }

    @Override
    public final void d() {
        String strE;
        this.f8352m0 = true;
        m(false);
        x();
        Object obj = this.H;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strE = n4.b.e(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e3) {
                    throw new IllegalArgumentException(e3);
                }
            } catch (IllegalArgumentException unused) {
                strE = null;
            }
            if (strE != null) {
                a aVar = this.M;
                if (aVar == null) {
                    this.f8365z0 = true;
                } else {
                    aVar.l(true);
                }
            }
            synchronized (p.F) {
                p.f(this);
                p.E.add(new WeakReference(this));
            }
        }
        this.f8355p0 = new Configuration(this.I.getResources().getConfiguration());
        this.f8353n0 = true;
    }

    @Override
    public final void e() {
        if (this.H instanceof Activity) {
            synchronized (p.F) {
                p.f(this);
            }
        }
        if (this.f8362w0) {
            this.J.getDecorView().removeCallbacks(this.f8364y0);
        }
        this.f8354o0 = true;
        if (this.f8356q0 != -100) {
            Object obj = this.H;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                F0.put(this.H.getClass().getName(), Integer.valueOf(this.f8356q0));
            } else {
                F0.remove(this.H.getClass().getName());
            }
        } else {
            F0.remove(this.H.getClass().getName());
        }
        a aVar = this.M;
        if (aVar != null) {
            aVar.h();
        }
        y yVar = this.f8360u0;
        if (yVar != null) {
            yVar.c();
        }
        y yVar2 = this.f8361v0;
        if (yVar2 != null) {
            yVar2.c();
        }
    }

    @Override
    public final boolean g(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.f8347h0 && i10 == 108) {
            return false;
        }
        if (this.f8343d0 && i10 == 1) {
            this.f8343d0 = false;
        }
        if (i10 == 1) {
            H();
            this.f8347h0 = true;
            return true;
        }
        if (i10 == 2) {
            H();
            this.f8341b0 = true;
            return true;
        }
        if (i10 == 5) {
            H();
            this.f8342c0 = true;
            return true;
        }
        if (i10 == 10) {
            H();
            this.f8345f0 = true;
            return true;
        }
        if (i10 == 108) {
            H();
            this.f8343d0 = true;
            return true;
        }
        if (i10 != 109) {
            return this.J.requestFeature(i10);
        }
        H();
        this.f8344e0 = true;
        return true;
    }

    @Override
    public final void h(int i10) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.Y.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.I).inflate(i10, viewGroup);
        this.K.a(this.J.getCallback());
    }

    @Override
    public final void i(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.Y.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.K.a(this.J.getCallback());
    }

    @Override
    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.Y.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.K.a(this.J.getCallback());
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.O = charSequence;
        c1 c1Var = this.P;
        if (c1Var != null) {
            c1Var.setWindowTitle(charSequence);
            return;
        }
        a aVar = this.M;
        if (aVar != null) {
            aVar.r(charSequence);
            return;
        }
        TextView textView = this.Z;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override
    public final n.b l(n.a aVar) {
        n.b bVarOnWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        n.b bVar = this.S;
        if (bVar != null) {
            bVar.a();
        }
        h1.l lVar = new h1.l(this, aVar);
        A();
        a aVar2 = this.M;
        ?? r4 = this.L;
        if (aVar2 != null) {
            n.b bVarS = aVar2.s(lVar);
            this.S = bVarS;
            if (bVarS != null) {
                r4.onSupportActionModeStarted(bVarS);
            }
        }
        if (this.S == null) {
            z4.n0 n0Var = this.W;
            if (n0Var != null) {
                n0Var.b();
            }
            n.b bVar2 = this.S;
            if (bVar2 != null) {
                bVar2.a();
            }
            if (this.f8354o0) {
                bVarOnWindowStartingSupportActionMode = null;
            } else {
                try {
                    bVarOnWindowStartingSupportActionMode = r4.onWindowStartingSupportActionMode(lVar);
                } catch (AbstractMethodError unused) {
                    bVarOnWindowStartingSupportActionMode = null;
                }
            }
            if (bVarOnWindowStartingSupportActionMode != null) {
                this.S = bVarOnWindowStartingSupportActionMode;
            } else {
                int i10 = 1;
                if (this.T == null) {
                    boolean z10 = this.f8346g0;
                    Context context = this.I;
                    if (z10) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(2130968588, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            n.d dVar = new n.d(context, 0);
                            dVar.getTheme().setTo(themeNewTheme);
                            context = dVar;
                        }
                        this.T = new ActionBarContextView(context, null);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, 2130968603);
                        this.U = popupWindow;
                        popupWindow.setWindowLayoutType(2);
                        this.U.setContentView(this.T);
                        this.U.setWidth(-1);
                        context.getTheme().resolveAttribute(2130968582, typedValue, true);
                        this.T.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.U.setHeight(-2);
                        this.V = new q(this, i10);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.Y.findViewById(2131361858);
                        if (viewStubCompat != null) {
                            A();
                            a aVar3 = this.M;
                            Context contextE = aVar3 != null ? aVar3.e() : null;
                            if (contextE != null) {
                                context = contextE;
                            }
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                            this.T = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (this.T != null) {
                    z4.n0 n0Var2 = this.W;
                    if (n0Var2 != null) {
                        n0Var2.b();
                    }
                    this.T.e();
                    Context context2 = this.T.getContext();
                    ActionBarContextView actionBarContextView = this.T;
                    n.e eVar = new n.e();
                    eVar.C = context2;
                    eVar.D = actionBarContextView;
                    eVar.E = lVar;
                    o.l lVar2 = new o.l(actionBarContextView.getContext());
                    lVar2.l = 1;
                    eVar.H = lVar2;
                    lVar2.f11406e = eVar;
                    if (((n.a) lVar.A).g(eVar, lVar2)) {
                        eVar.g();
                        this.T.c(eVar);
                        this.S = eVar;
                        if (this.X && (viewGroup = this.Y) != null && viewGroup.isLaidOut()) {
                            this.T.setAlpha(0.0f);
                            z4.n0 n0VarB = z4.j0.b(this.T);
                            n0VarB.a(1.0f);
                            this.W = n0VarB;
                            n0VarB.d(new t(this, i10));
                        } else {
                            this.T.setAlpha(1.0f);
                            this.T.setVisibility(0);
                            if (this.T.getParent() instanceof View) {
                                View view = (View) this.T.getParent();
                                WeakHashMap weakHashMap = z4.j0.f17198a;
                                view.requestApplyInsets();
                            }
                        }
                        if (this.U != null) {
                            this.J.getDecorView().post(this.V);
                        }
                    } else {
                        this.S = null;
                    }
                }
            }
            n.b bVar3 = this.S;
            if (bVar3 != null) {
                r4.onSupportActionModeStarted(bVar3);
            }
            I();
            this.S = this.S;
        }
        I();
        return this.S;
    }

    public final boolean m(boolean z10) {
        int i10;
        boolean z11;
        if (this.f8354o0) {
            return false;
        }
        int i11 = this.f8356q0;
        if (i11 == -100) {
            i11 = p.B;
        }
        Context context = this.I;
        int iC = C(context, i11);
        Configuration configurationS = s(context, iC, null, false);
        boolean z12 = this.f8359t0;
        boolean z13 = true;
        Object obj = this.H;
        if (z12 || !(obj instanceof Activity)) {
            this.f8359t0 = true;
            i10 = this.f8358s0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i10 = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), 269221888);
                    if (activityInfo != null) {
                        this.f8358s0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e3);
                    this.f8358s0 = 0;
                }
                this.f8359t0 = true;
                i10 = this.f8358s0;
            }
        }
        Configuration configuration = this.f8355p0;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i12 = configuration.uiMode & 48;
        int i13 = configurationS.uiMode & 48;
        v.b(configuration);
        int i14 = i12 != i13 ? 512 : 0;
        if (((~i10) & i14) != 0 && z10 && this.f8352m0 && ((H0 || this.f8353n0) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (activity.isChild()) {
                z11 = false;
            } else {
                activity.recreate();
                z11 = true;
            }
        } else {
            z11 = false;
        }
        if (z11 || i14 == 0) {
            z13 = z11;
        } else {
            boolean z14 = (i14 & i10) == i14;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = i13 | (resources.getConfiguration().uiMode & (-49));
            resources.updateConfiguration(configuration2, null);
            int i15 = this.f8357r0;
            if (i15 != 0) {
                context.setTheme(i15);
                context.getTheme().applyStyle(this.f8357r0, true);
            }
            if (z14 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof androidx.lifecycle.w) {
                    if (((androidx.lifecycle.w) activity2).getLifecycle().b().compareTo(androidx.lifecycle.p.C) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f8353n0 && !this.f8354o0) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z13 && (obj instanceof k) && (i14 & 512) != 0) {
            ((k) obj).onNightModeChanged(iC);
        }
        if (i11 == 0) {
            y(context).r();
        } else {
            y yVar = this.f8360u0;
            if (yVar != null) {
                yVar.c();
            }
        }
        if (i11 == 3) {
            if (this.f8361v0 == null) {
                this.f8361v0 = new y(this, context);
            }
            this.f8361v0.r();
        } else {
            y yVar2 = this.f8361v0;
            if (yVar2 != null) {
                yVar2.c();
            }
        }
        return z13;
    }

    @Override
    public final boolean n(o.l lVar, MenuItem menuItem) {
        a0 a0Var;
        Window.Callback callback = this.J.getCallback();
        if (callback != null && !this.f8354o0) {
            o.l lVarK = lVar.k();
            a0[] a0VarArr = this.f8349j0;
            int length = a0VarArr != null ? a0VarArr.length : 0;
            for (int i10 = 0; i10 < length; i10++) {
                a0Var = a0VarArr[i10];
                if (a0Var != null && a0Var.f8333h == lVarK) {
                    if (a0Var != null) {
                        return callback.onMenuItemSelected(a0Var.f8326a, menuItem);
                    }
                }
            }
            a0Var = null;
            if (a0Var != null) {
                return callback.onMenuItemSelected(a0Var.f8326a, menuItem);
            }
        }
        return false;
    }

    public final void o(Window window) {
        Drawable drawableD;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.J != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof x) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        x xVar = new x(this, callback);
        this.K = xVar;
        window.setCallback(xVar);
        Context context = this.I;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, G0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableD = null;
        } else {
            p.r rVarA = p.r.a();
            synchronized (rVarA) {
                drawableD = rVarA.f12195a.d(context, resourceId, true);
            }
        }
        if (drawableD != null) {
            window.setBackgroundDrawable(drawableD);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.J = window;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.D0;
        if (onBackInvokedDispatcher == null) {
            Object obj = this.H;
            if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.E0) != null) {
                w.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.E0 = null;
            }
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity.getWindow() != null) {
                    this.D0 = w.a(activity);
                } else {
                    this.D0 = null;
                }
            } else {
                this.D0 = null;
            }
            I();
        }
    }

    @Override
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View b0Var;
        View view2 = null;
        if (this.C0 == null) {
            int[] iArr = j.a.f7725j;
            Context context2 = this.I;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.C0 = new g0();
            } else {
                try {
                    this.C0 = (g0) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.C0 = new g0();
                }
            }
        }
        g0 g0Var = this.C0;
        int i10 = u2.f12226a;
        g0Var.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, j.a.f7737x, 0, 0);
        byte b7 = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context dVar = (resourceId == 0 || ((context instanceof n.d) && ((n.d) context).f10948a == resourceId)) ? context : new n.d(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b7 = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b7 = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b7 = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b7 = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b7 = -1;
                }
                break;
            case -658531749:
                b7 = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b7 = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b7 = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b7 = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b7 = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b7 = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b7 = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b7 = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b7 = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b7 = -1;
                break;
        }
        switch (b7) {
            case 0:
                b0Var = new p.b0(dVar, attributeSet);
                break;
            case 1:
                b0Var = new p.q(dVar, attributeSet);
                break;
            case 2:
                b0Var = new p.x(dVar, attributeSet);
                break;
            case 3:
                b0Var = g0Var.e(dVar, attributeSet);
                break;
            case 4:
                b0Var = new p.v(dVar, attributeSet, 2130969276);
                break;
            case 5:
                b0Var = new p.c0(dVar, attributeSet);
                break;
            case 6:
                b0Var = new p.n0(dVar, attributeSet);
                break;
            case 7:
                b0Var = g0Var.d(dVar, attributeSet);
                break;
            case 8:
                b0Var = new a1(dVar, attributeSet);
                break;
            case 9:
                b0Var = new p.w(dVar, attributeSet, 0);
                break;
            case 10:
                b0Var = g0Var.a(dVar, attributeSet);
                break;
            case 11:
                b0Var = g0Var.c(dVar, attributeSet);
                break;
            case 12:
                b0Var = new p.t(dVar, attributeSet);
                break;
            case 13:
                b0Var = g0Var.b(dVar, attributeSet);
                break;
            default:
                b0Var = null;
                break;
        }
        if (b0Var == null && context != dVar) {
            Object[] objArr = g0Var.f8409a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = dVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i11 = 0;
                    while (true) {
                        String[] strArr = g0.f8407d;
                        if (i11 < 3) {
                            View viewF = g0Var.f(dVar, str, strArr[i11]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i11++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewF2 = g0Var.f(dVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th3) {
                objArr[0] = null;
                objArr[1] = null;
                throw th3;
            }
            b0Var = view2;
        }
        if (b0Var != null) {
            Context context3 = b0Var.getContext();
            if ((context3 instanceof ContextWrapper) && b0Var.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, g0.f8406c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    b0Var.setOnClickListener(new f0(b0Var, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
        }
        return b0Var;
    }

    @Override
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public final void p(int i10, a0 a0Var, o.l lVar) {
        if (lVar == null) {
            if (a0Var == null && i10 >= 0) {
                a0[] a0VarArr = this.f8349j0;
                if (i10 < a0VarArr.length) {
                    a0Var = a0VarArr[i10];
                }
            }
            if (a0Var != null) {
                lVar = a0Var.f8333h;
            }
        }
        if ((a0Var == null || a0Var.m) && !this.f8354o0) {
            x xVar = this.K;
            Window.Callback callback = this.J.getCallback();
            xVar.getClass();
            try {
                xVar.E = true;
                callback.onPanelClosed(i10, lVar);
            } finally {
                xVar.E = false;
            }
        }
    }

    public final void q(o.l lVar) {
        p.j jVar;
        if (this.f8348i0) {
            return;
        }
        this.f8348i0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.P;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((s2) actionBarOverlayLayout.E).f12208a.A;
        if (actionMenuView != null && (jVar = actionMenuView.T) != null) {
            jVar.h();
            p.f fVar = jVar.T;
            if (fVar != null && fVar.b()) {
                fVar.f11464i.dismiss();
            }
        }
        Window.Callback callback = this.J.getCallback();
        if (callback != null && !this.f8354o0) {
            callback.onPanelClosed(108, lVar);
        }
        this.f8348i0 = false;
    }

    public final void r(a0 a0Var, boolean z10) {
        z zVar;
        c1 c1Var;
        if (z10 && a0Var.f8326a == 0 && (c1Var = this.P) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) c1Var;
            actionBarOverlayLayout.k();
            if (((s2) actionBarOverlayLayout.E).f12208a.o()) {
                q(a0Var.f8333h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.I.getSystemService("window");
        if (windowManager != null && a0Var.m && (zVar = a0Var.f8330e) != null) {
            windowManager.removeView(zVar);
            if (z10) {
                p(a0Var.f8326a, a0Var, null);
            }
        }
        a0Var.f8336k = false;
        a0Var.l = false;
        a0Var.m = false;
        a0Var.f8331f = null;
        a0Var.f8337n = true;
        if (this.f8350k0 == a0Var) {
            this.f8350k0 = null;
        }
        if (a0Var.f8326a == 0) {
            I();
        }
    }

    public final boolean t(KeyEvent keyEvent) {
        int keyCode;
        a0 a0VarZ;
        c1 c1Var;
        Context context;
        boolean z10;
        boolean zU;
        boolean zG;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        p.j jVar;
        a0 a0VarZ2;
        Object obj = this.H;
        if (((obj instanceof z4.j) || (obj instanceof d0)) && this.J.getDecorView() != null) {
            WeakHashMap weakHashMap = z4.j0.f17198a;
        }
        if (keyEvent.getKeyCode() == 82) {
            x xVar = this.K;
            Window.Callback callback = this.J.getCallback();
            xVar.getClass();
            try {
                xVar.D = true;
                boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                xVar.D = false;
                if (!zDispatchKeyEvent) {
                    keyCode = keyEvent.getKeyCode();
                    if (keyEvent.getAction() == 0) {
                        if (keyCode != 4) {
                            this.f8351l0 = (keyEvent.getFlags() & Cast.MAX_NAMESPACE_LENGTH) != 0;
                            return false;
                        }
                        if (keyCode == 82) {
                            if (keyEvent.getRepeatCount() == 0) {
                                a0VarZ2 = z(0);
                                if (!a0VarZ2.m) {
                                    G(a0VarZ2, keyEvent);
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    if (keyCode != 4) {
                        if (keyCode == 82) {
                            if (this.S == null) {
                                a0VarZ = z(0);
                                c1Var = this.P;
                                context = this.I;
                                if (c1Var != null) {
                                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) c1Var;
                                    actionBarOverlayLayout.k();
                                    toolbar = ((s2) actionBarOverlayLayout.E).f12208a;
                                    if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.A) == null || !actionMenuView.S || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                        z10 = a0VarZ.m;
                                        if (!z10 || a0VarZ.l) {
                                            r(a0VarZ, true);
                                            zU = z10;
                                        } else {
                                            if (a0VarZ.f8336k) {
                                                if (a0VarZ.f8338o) {
                                                    a0VarZ.f8336k = false;
                                                    zG = G(a0VarZ, keyEvent);
                                                } else {
                                                    zG = true;
                                                }
                                                if (zG) {
                                                    E(a0VarZ, keyEvent);
                                                    zU = true;
                                                }
                                            }
                                            zU = false;
                                        }
                                    } else {
                                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.P;
                                        actionBarOverlayLayout2.k();
                                        if (((s2) actionBarOverlayLayout2.E).f12208a.o()) {
                                            ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.P;
                                            actionBarOverlayLayout3.k();
                                            ActionMenuView actionMenuView2 = ((s2) actionBarOverlayLayout3.E).f12208a.A;
                                            if (actionMenuView2 != null && (jVar = actionMenuView2.T) != null && jVar.h()) {
                                                zU = true;
                                            }
                                        } else if (!this.f8354o0 && G(a0VarZ, keyEvent)) {
                                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.P;
                                            actionBarOverlayLayout4.k();
                                            zU = ((s2) actionBarOverlayLayout4.E).f12208a.u();
                                        }
                                        zU = false;
                                    }
                                } else {
                                    z10 = a0VarZ.m;
                                    if (z10) {
                                    }
                                    r(a0VarZ, true);
                                    zU = z10;
                                }
                                if (zU) {
                                    audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                    if (audioManager != null) {
                                        audioManager.playSoundEffect(0);
                                        return true;
                                    }
                                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    if (D()) {
                        return false;
                    }
                }
            } catch (Throwable th2) {
                xVar.D = false;
                throw th2;
            }
        } else {
            keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode != 4) {
                    this.f8351l0 = (keyEvent.getFlags() & Cast.MAX_NAMESPACE_LENGTH) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        a0VarZ2 = z(0);
                        if (!a0VarZ2.m) {
                            G(a0VarZ2, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.S == null) {
                        a0VarZ = z(0);
                        c1Var = this.P;
                        context = this.I;
                        if (c1Var != null) {
                            ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) c1Var;
                            actionBarOverlayLayout5.k();
                            toolbar = ((s2) actionBarOverlayLayout5.E).f12208a;
                            if (toolbar.getVisibility() == 0) {
                                z10 = a0VarZ.m;
                                if (z10) {
                                }
                                r(a0VarZ, true);
                                zU = z10;
                            } else {
                                z10 = a0VarZ.m;
                                if (z10) {
                                }
                                r(a0VarZ, true);
                                zU = z10;
                            }
                        } else {
                            z10 = a0VarZ.m;
                            if (z10) {
                            }
                            r(a0VarZ, true);
                            zU = z10;
                        }
                        if (zU) {
                            audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                            if (audioManager != null) {
                                audioManager.playSoundEffect(0);
                                return true;
                            }
                            Log.w("AppCompatDelegate", "Couldn't get audio manager");
                            return true;
                        }
                    }
                }
                return false;
            }
            if (D()) {
                return false;
            }
        }
        return true;
    }

    public final void u(int i10) {
        a0 a0VarZ = z(i10);
        if (a0VarZ.f8333h != null) {
            Bundle bundle = new Bundle();
            a0VarZ.f8333h.t(bundle);
            if (bundle.size() > 0) {
                a0VarZ.f8339p = bundle;
            }
            a0VarZ.f8333h.w();
            a0VarZ.f8333h.clear();
        }
        a0VarZ.f8338o = true;
        a0VarZ.f8337n = true;
        if ((i10 == 108 || i10 == 0) && this.P != null) {
            a0 a0VarZ2 = z(0);
            a0VarZ2.f8336k = false;
            G(a0VarZ2, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        if (this.X) {
            return;
        }
        Context context = this.I;
        int[] iArr = j.a.f7725j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            g(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            g(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            g(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            g(10);
        }
        this.f8346g0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        x();
        this.J.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f8347h0) {
            viewGroup = this.f8345f0 ? (ViewGroup) layoutInflaterFrom.inflate(2131558422, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(2131558421, (ViewGroup) null);
        } else if (this.f8346g0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(2131558412, (ViewGroup) null);
            this.f8344e0 = false;
            this.f8343d0 = false;
        } else if (this.f8343d0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130968588, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new n.d(context, typedValue.resourceId) : context).inflate(2131558423, (ViewGroup) null);
            c1 c1Var = (c1) viewGroup.findViewById(2131362086);
            this.P = c1Var;
            c1Var.setWindowCallback(this.J.getCallback());
            if (this.f8344e0) {
                ((ActionBarOverlayLayout) this.P).j(109);
            }
            if (this.f8341b0) {
                ((ActionBarOverlayLayout) this.P).j(2);
            }
            if (this.f8342c0) {
                ((ActionBarOverlayLayout) this.P).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb2 = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb2.append(this.f8343d0);
            sb2.append(", windowActionBarOverlay: ");
            sb2.append(this.f8344e0);
            sb2.append(", android:windowIsFloating: ");
            sb2.append(this.f8346g0);
            sb2.append(", windowActionModeOverlay: ");
            sb2.append(this.f8345f0);
            sb2.append(", windowNoTitle: ");
            throw new IllegalArgumentException(g4.c.l(sb2, this.f8347h0, " }"));
        }
        r rVar = new r(this);
        WeakHashMap weakHashMap = z4.j0.f17198a;
        z4.d0.b(viewGroup, rVar);
        if (this.P == null) {
            this.Z = (TextView) viewGroup.findViewById(2131363094);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e10) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(2131361845);
        ViewGroup viewGroup2 = (ViewGroup) this.J.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.J.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new s(this));
        this.Y = viewGroup;
        Object obj = this.H;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.O;
        if (!TextUtils.isEmpty(title)) {
            c1 c1Var2 = this.P;
            if (c1Var2 != null) {
                c1Var2.setWindowTitle(title);
            } else {
                a aVar = this.M;
                if (aVar != null) {
                    aVar.r(title);
                } else {
                    TextView textView = this.Z;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.Y.findViewById(R.id.content);
        View decorView = this.J.getDecorView();
        contentFrameLayout2.G.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.X = true;
        a0 a0VarZ = z(0);
        if (this.f8354o0 || a0VarZ.f8333h != null) {
            return;
        }
        B(108);
    }

    @Override
    public final void w(o.l r6) {
        throw new UnsupportedOperationException("Method not decompiled: k.b0.w(o.l):void");
    }

    public final void x() {
        if (this.J == null) {
            Object obj = this.H;
            if (obj instanceof Activity) {
                o(((Activity) obj).getWindow());
            }
        }
        if (this.J == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final c3.b y(Context context) {
        if (this.f8360u0 == null) {
            if (a1.i.E == null) {
                Context applicationContext = context.getApplicationContext();
                a1.i.E = new a1.i(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f8360u0 = new y(this, a1.i.E);
        }
        return this.f8360u0;
    }

    public final a0 z(int i10) {
        a0[] a0VarArr = this.f8349j0;
        if (a0VarArr == null || a0VarArr.length <= i10) {
            a0[] a0VarArr2 = new a0[i10 + 1];
            if (a0VarArr != null) {
                System.arraycopy(a0VarArr, 0, a0VarArr2, 0, a0VarArr.length);
            }
            this.f8349j0 = a0VarArr2;
            a0VarArr = a0VarArr2;
        }
        a0 a0Var = a0VarArr[i10];
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0();
        a0Var2.f8326a = i10;
        a0Var2.f8337n = false;
        a0VarArr[i10] = a0Var2;
        return a0Var2;
    }
}

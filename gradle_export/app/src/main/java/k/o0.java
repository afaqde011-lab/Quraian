package k;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p.d1;
import p.n2;
import p.s2;

public final class o0 extends a implements p.c {

    public static final AccelerateInterpolator f8426y = new AccelerateInterpolator();

    public static final DecelerateInterpolator f8427z = new DecelerateInterpolator();

    public Context f8428a;

    public Context f8429b;

    public ActionBarOverlayLayout f8430c;

    public ActionBarContainer f8431d;

    public d1 f8432e;

    public ActionBarContextView f8433f;

    public final View f8434g;

    public boolean f8435h;

    public n0 f8436i;

    public n0 f8437j;

    public h1.l f8438k;
    public boolean l;
    public final ArrayList m;

    public int f8439n;

    public boolean f8440o;

    public boolean f8441p;

    public boolean f8442q;

    public boolean f8443r;

    public n.k f8444s;

    public boolean f8445t;

    public boolean f8446u;

    public final m0 f8447v;

    public final m0 f8448w;

    public final hf.c f8449x;

    public o0(Activity activity, boolean z10) {
        new ArrayList();
        this.m = new ArrayList();
        this.f8439n = 0;
        this.f8440o = true;
        this.f8443r = true;
        this.f8447v = new m0(this, 0);
        this.f8448w = new m0(this, 1);
        this.f8449x = new hf.c(this, 10);
        View decorView = activity.getWindow().getDecorView();
        u(decorView);
        if (z10) {
            return;
        }
        this.f8434g = decorView.findViewById(R.id.content);
    }

    public o0(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.f8439n = 0;
        this.f8440o = true;
        this.f8443r = true;
        this.f8447v = new m0(this, 0);
        this.f8448w = new m0(this, 1);
        this.f8449x = new hf.c(this, 10);
        u(dialog.getWindow().getDecorView());
    }

    @Override
    public final boolean b() {
        n2 n2Var;
        d1 d1Var = this.f8432e;
        if (d1Var == null || (n2Var = ((s2) d1Var).f12208a.f552p0) == null || n2Var.B == null) {
            return false;
        }
        n2 n2Var2 = ((s2) d1Var).f12208a.f552p0;
        o.n nVar = n2Var2 == null ? null : n2Var2.B;
        if (nVar == null) {
            return true;
        }
        nVar.collapseActionView();
        return true;
    }

    @Override
    public final void c(boolean z10) {
        if (z10 == this.l) {
            return;
        }
        this.l = z10;
        ArrayList arrayList = this.m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override
    public final int d() {
        return ((s2) this.f8432e).f12209b;
    }

    @Override
    public final Context e() {
        if (this.f8429b == null) {
            TypedValue typedValue = new TypedValue();
            this.f8428a.getTheme().resolveAttribute(2130968589, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f8429b = new ContextThemeWrapper(this.f8428a, i10);
            } else {
                this.f8429b = this.f8428a;
            }
        }
        return this.f8429b;
    }

    @Override
    public final void g() {
        v(this.f8428a.getResources().getBoolean(2131034112));
    }

    @Override
    public final boolean i(int i10, KeyEvent keyEvent) {
        o.l lVar;
        n0 n0Var = this.f8436i;
        if (n0Var == null || (lVar = n0Var.D) == null) {
            return false;
        }
        lVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return lVar.performShortcut(i10, keyEvent, 0);
    }

    @Override
    public final void l(boolean z10) {
        if (this.f8435h) {
            return;
        }
        m(z10);
    }

    @Override
    public final void m(boolean z10) {
        int i10 = z10 ? 4 : 0;
        s2 s2Var = (s2) this.f8432e;
        int i11 = s2Var.f12209b;
        this.f8435h = true;
        s2Var.a((i10 & 4) | (i11 & (-5)));
    }

    @Override
    public final void n(int i10) {
        s2 s2Var = (s2) this.f8432e;
        Toolbar toolbar = s2Var.f12208a;
        Drawable drawableF0 = i10 != 0 ? p30.f.f0(toolbar.getContext(), i10) : null;
        s2Var.f12213f = drawableF0;
        if ((s2Var.f12209b & 4) == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawableF0 == null) {
            drawableF0 = s2Var.f12220o;
        }
        toolbar.setNavigationIcon(drawableF0);
    }

    @Override
    public final void o(boolean z10) {
        n.k kVar;
        this.f8445t = z10;
        if (z10 || (kVar = this.f8444s) == null) {
            return;
        }
        kVar.a();
    }

    @Override
    public final void p(String str) {
        ((s2) this.f8432e).b(str);
    }

    @Override
    public final void q(String str) {
        s2 s2Var = (s2) this.f8432e;
        s2Var.f12214g = true;
        Toolbar toolbar = s2Var.f12208a;
        s2Var.f12215h = str;
        if ((s2Var.f12209b & 8) != 0) {
            toolbar.setTitle(str);
            if (s2Var.f12214g) {
                z4.j0.h(toolbar.getRootView(), str);
            }
        }
    }

    @Override
    public final void r(CharSequence charSequence) {
        s2 s2Var = (s2) this.f8432e;
        if (s2Var.f12214g) {
            return;
        }
        Toolbar toolbar = s2Var.f12208a;
        s2Var.f12215h = charSequence;
        if ((s2Var.f12209b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (s2Var.f12214g) {
                z4.j0.h(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override
    public final n.b s(h1.l lVar) {
        n0 n0Var = this.f8436i;
        if (n0Var != null) {
            n0Var.a();
        }
        this.f8430c.setHideOnContentScrollEnabled(false);
        this.f8433f.e();
        n0 n0Var2 = new n0(this, this.f8433f.getContext(), lVar);
        o.l lVar2 = n0Var2.D;
        lVar2.w();
        try {
            boolean zG = ((n.a) n0Var2.E.A).g(n0Var2, lVar2);
            lVar2.v();
            if (!zG) {
                return null;
            }
            this.f8436i = n0Var2;
            n0Var2.g();
            this.f8433f.c(n0Var2);
            t(true);
            return n0Var2;
        } catch (Throwable th2) {
            lVar2.v();
            throw th2;
        }
    }

    public final void t(boolean z10) {
        z4.n0 n0VarI;
        z4.n0 n0VarI2;
        if (z10) {
            if (!this.f8442q) {
                this.f8442q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f8430c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                w(false);
            }
        } else if (this.f8442q) {
            this.f8442q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f8430c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            w(false);
        }
        if (!this.f8431d.isLaidOut()) {
            if (z10) {
                ((s2) this.f8432e).f12208a.setVisibility(4);
                this.f8433f.setVisibility(0);
                return;
            } else {
                ((s2) this.f8432e).f12208a.setVisibility(0);
                this.f8433f.setVisibility(8);
                return;
            }
        }
        if (z10) {
            s2 s2Var = (s2) this.f8432e;
            n0VarI = z4.j0.b(s2Var.f12208a);
            n0VarI.a(0.0f);
            n0VarI.c(100L);
            n0VarI.d(new n.j(s2Var, 4));
            n0VarI2 = this.f8433f.i(0, 200L);
        } else {
            s2 s2Var2 = (s2) this.f8432e;
            z4.n0 n0VarB = z4.j0.b(s2Var2.f12208a);
            n0VarB.a(1.0f);
            n0VarB.c(200L);
            n0VarB.d(new n.j(s2Var2, 0));
            n0VarI = this.f8433f.i(8, 100L);
            n0VarI2 = n0VarB;
        }
        n.k kVar = new n.k();
        ArrayList arrayList = kVar.f10991a;
        arrayList.add(n0VarI);
        View view = (View) n0VarI.f17211a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) n0VarI2.f17211a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(n0VarI2);
        kVar.b();
    }

    public final void u(View view) {
        d1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131362086);
        this.f8430c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(2131361844);
        if (callbackFindViewById instanceof d1) {
            wrapper = (d1) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f8432e = wrapper;
        this.f8433f = (ActionBarContextView) view.findViewById(2131361852);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131361846);
        this.f8431d = actionBarContainer;
        d1 d1Var = this.f8432e;
        if (d1Var == null || this.f8433f == null || actionBarContainer == null) {
            throw new IllegalStateException(o0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((s2) d1Var).f12208a.getContext();
        this.f8428a = context;
        if ((((s2) this.f8432e).f12209b & 4) != 0) {
            this.f8435h = true;
        }
        int i10 = context.getApplicationInfo().targetSdkVersion;
        this.f8432e.getClass();
        v(context.getResources().getBoolean(2131034112));
        TypedArray typedArrayObtainStyledAttributes = this.f8428a.obtainStyledAttributes(null, j.a.f7716a, 2130968584, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f8430c;
            if (!actionBarOverlayLayout2.G) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f8446u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f8431d;
            WeakHashMap weakHashMap = z4.j0.f17198a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void v(boolean z10) {
        if (z10) {
            this.f8431d.setTabContainer(null);
            ((s2) this.f8432e).getClass();
        } else {
            ((s2) this.f8432e).getClass();
            this.f8431d.setTabContainer(null);
        }
        this.f8432e.getClass();
        ((s2) this.f8432e).f12208a.setCollapsible(false);
        this.f8430c.setHasNonEmbeddedTabs(false);
    }

    public final void w(boolean z10) {
        boolean z11 = this.f8441p;
        boolean z12 = this.f8442q;
        final hf.c cVar = this.f8449x;
        View view = this.f8434g;
        if (!z12 && z11) {
            if (this.f8443r) {
                this.f8443r = false;
                n.k kVar = this.f8444s;
                if (kVar != null) {
                    kVar.a();
                }
                int i10 = this.f8439n;
                m0 m0Var = this.f8447v;
                if (i10 != 0 || (!this.f8445t && !z10)) {
                    m0Var.c();
                    return;
                }
                this.f8431d.setAlpha(1.0f);
                this.f8431d.setTransitioning(true);
                n.k kVar2 = new n.k();
                float f3 = -this.f8431d.getHeight();
                if (z10) {
                    int[] iArr = {0, 0};
                    this.f8431d.getLocationInWindow(iArr);
                    f3 -= iArr[1];
                }
                z4.n0 n0VarB = z4.j0.b(this.f8431d);
                n0VarB.e(f3);
                final View view2 = (View) n0VarB.f17211a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((k.o0) cVar.B).f8431d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z13 = kVar2.f10995e;
                ArrayList arrayList = kVar2.f10991a;
                if (!z13) {
                    arrayList.add(n0VarB);
                }
                if (this.f8440o && view != null) {
                    z4.n0 n0VarB2 = z4.j0.b(view);
                    n0VarB2.e(f3);
                    if (!kVar2.f10995e) {
                        arrayList.add(n0VarB2);
                    }
                }
                boolean z14 = kVar2.f10995e;
                if (!z14) {
                    kVar2.f10993c = f8426y;
                }
                if (!z14) {
                    kVar2.f10992b = 250L;
                }
                if (!z14) {
                    kVar2.f10994d = m0Var;
                }
                this.f8444s = kVar2;
                kVar2.b();
                return;
            }
            return;
        }
        if (this.f8443r) {
            return;
        }
        this.f8443r = true;
        n.k kVar3 = this.f8444s;
        if (kVar3 != null) {
            kVar3.a();
        }
        this.f8431d.setVisibility(0);
        int i11 = this.f8439n;
        m0 m0Var2 = this.f8448w;
        if (i11 == 0 && (this.f8445t || z10)) {
            this.f8431d.setTranslationY(0.0f);
            float f10 = -this.f8431d.getHeight();
            if (z10) {
                int[] iArr2 = {0, 0};
                this.f8431d.getLocationInWindow(iArr2);
                f10 -= iArr2[1];
            }
            this.f8431d.setTranslationY(f10);
            n.k kVar4 = new n.k();
            z4.n0 n0VarB3 = z4.j0.b(this.f8431d);
            n0VarB3.e(0.0f);
            final View view3 = (View) n0VarB3.f17211a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((k.o0) cVar.B).f8431d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z15 = kVar4.f10995e;
            ArrayList arrayList2 = kVar4.f10991a;
            if (!z15) {
                arrayList2.add(n0VarB3);
            }
            if (this.f8440o && view != null) {
                view.setTranslationY(f10);
                z4.n0 n0VarB4 = z4.j0.b(view);
                n0VarB4.e(0.0f);
                if (!kVar4.f10995e) {
                    arrayList2.add(n0VarB4);
                }
            }
            boolean z16 = kVar4.f10995e;
            if (!z16) {
                kVar4.f10993c = f8427z;
            }
            if (!z16) {
                kVar4.f10992b = 250L;
            }
            if (!z16) {
                kVar4.f10994d = m0Var2;
            }
            this.f8444s = kVar4;
            kVar4.b();
        } else {
            this.f8431d.setAlpha(1.0f);
            this.f8431d.setTranslationY(0.0f);
            if (this.f8440o && view != null) {
                view.setTranslationY(0.0f);
            }
            m0Var2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f8430c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = z4.j0.f17198a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }
}

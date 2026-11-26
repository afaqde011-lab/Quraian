package h0;

import android.graphics.Path;
import android.view.View;
import com.google.android.gms.cast.Cast;
import java.util.WeakHashMap;

public final class m2 {

    public static final WeakHashMap f6423w = new WeakHashMap();

    public final a f6424a;

    public final a f6425b;

    public final a f6426c;

    public final a f6427d;

    public final a f6428e;

    public final a f6429f;

    public final a f6430g;

    public final a f6431h;

    public final a f6432i;

    public final i2 f6433j;

    public final l1.i1 f6434k;
    public final d2 l;
    public final i2 m;

    public final i2 f6435n;

    public final i2 f6436o;

    public final i2 f6437p;

    public final i2 f6438q;

    public final i2 f6439r;

    public final i2 f6440s;

    public final boolean f6441t;

    public int f6442u;

    public final q0 f6443v;

    public m2(View view) {
        a aVarB = b.b(4, "captionBar");
        this.f6424a = aVarB;
        a aVarB2 = b.b(Cast.MAX_NAMESPACE_LENGTH, "displayCutout");
        this.f6425b = aVarB2;
        a aVarB3 = b.b(8, "ime");
        this.f6426c = aVarB3;
        a aVarB4 = b.b(32, "mandatorySystemGestures");
        this.f6427d = aVarB4;
        a aVarB5 = b.b(2, "navigationBars");
        this.f6428e = aVarB5;
        a aVarB6 = b.b(1, "statusBars");
        this.f6429f = aVarB6;
        a aVarB7 = b.b(519, "systemBars");
        this.f6430g = aVarB7;
        a aVarB8 = b.b(16, "systemGestures");
        this.f6431h = aVarB8;
        a aVarB9 = b.b(64, "tappableElement");
        this.f6432i = aVarB9;
        i2 i2Var = new i2(new u0(0, 0, 0, 0), "waterfall");
        this.f6433j = i2Var;
        this.f6434k = l1.q.z(null);
        d2 d2Var = new d2(new d2(aVarB7, aVarB3), aVarB2);
        this.l = d2Var;
        new d2(d2Var, new d2(new d2(new d2(aVarB9, aVarB4), aVarB8), i2Var));
        this.m = b.d(4, "captionBarIgnoringVisibility");
        this.f6435n = b.d(2, "navigationBarsIgnoringVisibility");
        this.f6436o = b.d(1, "statusBarsIgnoringVisibility");
        this.f6437p = b.d(519, "systemBarsIgnoringVisibility");
        this.f6438q = b.d(64, "tappableElementIgnoringVisibility");
        this.f6439r = new i2(new u0(0, 0, 0, 0), "imeAnimationTarget");
        this.f6440s = new i2(new u0(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(2131362065) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f6441t = bool != null ? bool.booleanValue() : false;
        this.f6443v = new q0(this);
        WeakHashMap weakHashMap = z4.j0.f17198a;
        z4.j1 j1VarA = z4.e0.a(view);
        if (j1VarA != null) {
            z4.g1 g1Var = j1VarA.f17202a;
            aVarB.f(g1Var.u(4));
            aVarB2.f(g1Var.u(Cast.MAX_NAMESPACE_LENGTH));
            aVarB3.f(g1Var.u(8));
            aVarB4.f(g1Var.u(32));
            aVarB5.f(g1Var.u(2));
            aVarB6.f(g1Var.u(1));
            aVarB7.f(g1Var.u(519));
            aVarB8.f(g1Var.u(16));
            aVarB9.f(g1Var.u(64));
        }
    }

    public static void b(m2 m2Var, z4.j1 j1Var) {
        Path cutoutPath;
        boolean z10 = false;
        m2Var.f6424a.g(j1Var, 0);
        m2Var.f6426c.g(j1Var, 0);
        m2Var.f6425b.g(j1Var, 0);
        m2Var.f6428e.g(j1Var, 0);
        m2Var.f6429f.g(j1Var, 0);
        m2Var.f6430g.g(j1Var, 0);
        m2Var.f6431h.g(j1Var, 0);
        m2Var.f6432i.g(j1Var, 0);
        m2Var.f6427d.g(j1Var, 0);
        m2Var.m.f(c.I(j1Var.f17202a.j(4)));
        m2Var.f6435n.f(c.I(j1Var.f17202a.j(2)));
        m2Var.f6436o.f(c.I(j1Var.f17202a.j(1)));
        m2Var.f6437p.f(c.I(j1Var.f17202a.j(519)));
        m2Var.f6438q.f(c.I(j1Var.f17202a.j(64)));
        z4.f fVarH = j1Var.f17202a.h();
        m2Var.f6433j.f(c.I(fVarH != null ? q4.b.d(fVarH.f17190a.getWaterfallInsets()) : q4.b.f12754e));
        m2Var.f6434k.setValue((fVarH == null || (cutoutPath = fVarH.f17190a.getCutoutPath()) == null) ? null : new i2.g(cutoutPath));
        synchronized (z1.l.f17038c) {
            u.j0 j0Var = z1.l.f17045j.f17005h;
            if (j0Var != null && j0Var.h()) {
                z10 = true;
            }
        }
        if (z10) {
            z1.l.a();
        }
    }

    public final void a(View view) {
        if (this.f6442u == 0) {
            WeakHashMap weakHashMap = z4.j0.f17198a;
            q0 q0Var = this.f6443v;
            z4.d0.b(view, q0Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(q0Var);
            z4.j0.i(view, q0Var);
        }
        this.f6442u++;
    }
}

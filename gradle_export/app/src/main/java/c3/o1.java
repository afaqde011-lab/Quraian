package c3;

import androidx.compose.ui.node.Owner;
import com.google.android.gms.cast.Cast;

public abstract class o1 {

    public static final l1.q2 f2727a = new l1.q2(n0.H);

    public static final l1.q2 f2728b = new l1.q2(n0.I);

    public static final l1.q2 f2729c = new l1.q2(n0.K);

    public static final l1.q2 f2730d = new l1.q2(n0.J);

    public static final l1.q2 f2731e = new l1.q2(n0.M);

    public static final l1.q2 f2732f = new l1.q2(n0.L);

    public static final l1.q2 f2733g = new l1.q2(n0.S);

    public static final l1.q2 f2734h = new l1.q2(n0.O);

    public static final l1.q2 f2735i = new l1.q2(n0.P);

    public static final l1.q2 f2736j = new l1.q2(n0.R);

    public static final l1.q2 f2737k = new l1.q2(n0.Q);
    public static final l1.q2 l = new l1.q2(n0.T);
    public static final l1.q2 m = new l1.q2(n0.U);

    public static final l1.q2 f2738n = new l1.q2(n0.V);

    public static final l1.q2 f2739o = new l1.q2(n0.X);

    public static final l1.q2 f2740p;

    public static final l1.q2 f2741q;

    public static final l1.q2 f2742r;

    public static final l1.q2 f2743s;

    public static final l1.q2 f2744t;

    public static final l1.q2 f2745u;

    public static final l1.q2 f2746v;

    public static final l1.t f2747w;

    public static final l1.q2 f2748x;

    static {
        rd.a.J(new h.e(10));
        f2740p = new l1.q2(n0.f2695a0);
        f2741q = new l1.q2(n0.Z);
        f2742r = new l1.q2(n0.f2696b0);
        f2743s = new l1.q2(n0.f2697c0);
        f2744t = new l1.q2(n0.f2698d0);
        f2745u = new l1.q2(n0.f2699e0);
        f2746v = new l1.q2(n0.W);
        f2747w = new l1.t(n0.Y);
        f2748x = new l1.q2(n0.N);
    }

    public static final void a(Owner owner, w2 w2Var, u00.n nVar, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1925803616);
        int i11 = (g0Var.g(owner) ? 4 : 2) | i10 | (g0Var.g(w2Var) ? 32 : 16) | (g0Var.i(nVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            z zVar = (z) owner;
            l1.q1 q1VarA = f2727a.a(zVar.getAccessibilityManager());
            l1.q1 q1VarA2 = f2728b.a(zVar.getAutofill());
            l1.q1 q1VarA3 = f2730d.a(zVar.getAutofillManager());
            l1.q1 q1VarA4 = f2729c.a(zVar.getAutofillTree());
            l1.q1 q1VarA5 = f2731e.a(zVar.getClipboardManager());
            l1.q1 q1VarA6 = f2732f.a(zVar.getClipboard());
            l1.q1 q1VarA7 = f2734h.a(zVar.getDensity());
            l1.q1 q1VarA8 = f2735i.a(zVar.getFocusOwner());
            l1.q1 q1VarA9 = f2736j.a(zVar.getFontLoader());
            q1VarA9.f9912d = false;
            l1.q1 q1VarA10 = f2737k.a(zVar.getFontFamilyResolver());
            q1VarA10.f9912d = false;
            l1.q.b(new l1.q1[]{q1VarA, q1VarA2, q1VarA3, q1VarA4, q1VarA5, q1VarA6, q1VarA7, q1VarA8, q1VarA9, q1VarA10, l.a(zVar.getHapticFeedBack()), m.a(zVar.getInputModeManager()), f2738n.a(zVar.getLayoutDirection()), f2740p.a(zVar.getTextInputService()), f2741q.a(zVar.getSoftwareKeyboardController()), f2742r.a(zVar.getTextToolbar()), f2743s.a(w2Var), f2744t.a(zVar.getViewConfiguration()), f2745u.a(zVar.getWindowInfo()), f2746v.a(zVar.getPointerIconService()), f2733g.a(zVar.getGraphicsContext()), w1.b.f15830a.a(zVar.getRetainedValuesStore()), f2739o.a(zVar.getLocaleList())}, nVar, g0Var, ((i11 >> 3) & 112) | 8);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new b4.m(owner, w2Var, nVar, i10);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}

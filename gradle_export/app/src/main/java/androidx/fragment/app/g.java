package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

public final class g extends AnimatorListenerAdapter {

    public final ViewGroup f709a;

    public final View f710b;

    public final boolean f711c;

    public final g2 f712d;

    public final h f713e;

    public g(ViewGroup viewGroup, View view, boolean z10, g2 g2Var, h hVar) {
        this.f709a = viewGroup;
        this.f710b = view;
        this.f711c = z10;
        this.f712d = g2Var;
        this.f713e = hVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        kotlin.jvm.internal.m.e(animator, "anim");
        ViewGroup viewGroup = this.f709a;
        View view = this.f710b;
        viewGroup.endViewTransition(view);
        boolean z10 = this.f711c;
        g2 g2Var = this.f712d;
        if (z10 || g2Var.f733a == 3) {
            int i10 = g2Var.f733a;
            kotlin.jvm.internal.m.d(view, "viewToAnimate");
            a1.b.a(i10, view, viewGroup);
        }
        h hVar = this.f713e;
        hVar.f744c.f774a.c(hVar);
        if (i1.K(2)) {
            Log.v("FragmentManager", "Animator from operation " + g2Var + " has ended.");
        }
    }
}

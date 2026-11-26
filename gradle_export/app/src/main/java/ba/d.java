package ba;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class d extends AnimatorListenerAdapter {

    public final f1 f2256a;

    public final int f2257b;

    public final View f2258c;

    public final int f2259d;

    public final ViewPropertyAnimator f2260e;

    public final h f2261f;

    public d(h hVar, f1 f1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2261f = hVar;
        this.f2256a = f1Var;
        this.f2257b = i10;
        this.f2258c = view;
        this.f2259d = i11;
        this.f2260e = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        int i10 = this.f2257b;
        View view = this.f2258c;
        if (i10 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f2259d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f2260e.setListener(null);
        h hVar = this.f2261f;
        f1 f1Var = this.f2256a;
        hVar.c(f1Var);
        hVar.f2305p.remove(f1Var);
        hVar.i();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        this.f2261f.getClass();
    }
}

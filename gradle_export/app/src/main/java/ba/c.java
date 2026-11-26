package ba;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class c extends AnimatorListenerAdapter {

    public final int f2250a = 1;

    public final f1 f2251b;

    public final View f2252c;

    public final ViewPropertyAnimator f2253d;

    public final h f2254e;

    public c(h hVar, f1 f1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2254e = hVar;
        this.f2251b = f1Var;
        this.f2252c = view;
        this.f2253d = viewPropertyAnimator;
    }

    public c(h hVar, f1 f1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2254e = hVar;
        this.f2251b = f1Var;
        this.f2253d = viewPropertyAnimator;
        this.f2252c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f2250a) {
            case 1:
                this.f2252c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2250a) {
            case 0:
                this.f2253d.setListener(null);
                this.f2252c.setAlpha(1.0f);
                h hVar = this.f2254e;
                f1 f1Var = this.f2251b;
                hVar.c(f1Var);
                hVar.f2306q.remove(f1Var);
                hVar.i();
                break;
            default:
                this.f2253d.setListener(null);
                h hVar2 = this.f2254e;
                f1 f1Var2 = this.f2251b;
                hVar2.c(f1Var2);
                hVar2.f2304o.remove(f1Var2);
                hVar2.i();
                break;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f2250a) {
            case 0:
                this.f2254e.getClass();
                break;
            default:
                this.f2254e.getClass();
                break;
        }
    }
}

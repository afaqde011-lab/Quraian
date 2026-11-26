package ba;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class e extends AnimatorListenerAdapter {

    public final int f2263a;

    public final f f2264b;

    public final ViewPropertyAnimator f2265c;

    public final View f2266d;

    public final h f2267e;

    public e(h hVar, f fVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f2263a = i10;
        this.f2267e = hVar;
        this.f2264b = fVar;
        this.f2265c = viewPropertyAnimator;
        this.f2266d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2263a) {
            case 0:
                this.f2265c.setListener(null);
                View view = this.f2266d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                f fVar = this.f2264b;
                f1 f1Var = fVar.f2268a;
                h hVar = this.f2267e;
                hVar.c(f1Var);
                hVar.f2307r.remove(fVar.f2268a);
                hVar.i();
                break;
            default:
                this.f2265c.setListener(null);
                View view2 = this.f2266d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                f fVar2 = this.f2264b;
                f1 f1Var2 = fVar2.f2269b;
                h hVar2 = this.f2267e;
                hVar2.c(f1Var2);
                hVar2.f2307r.remove(fVar2.f2269b);
                hVar2.i();
                break;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f2263a) {
            case 0:
                f1 f1Var = this.f2264b.f2268a;
                this.f2267e.getClass();
                break;
            default:
                f1 f1Var2 = this.f2264b.f2269b;
                this.f2267e.getClass();
                break;
        }
    }
}

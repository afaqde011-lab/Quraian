package ta;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class g extends AnimatorListenerAdapter implements r {

    public final View f14458a;

    public boolean f14459b = false;

    public g(View view) {
        this.f14458a = view;
    }

    @Override
    public final void a() {
        float transitionAlpha;
        View view = this.f14458a;
        if (view.getVisibility() == 0) {
            b bVar = b0.f14429a;
            transitionAlpha = view.getTransitionAlpha();
        } else {
            transitionAlpha = 0.0f;
        }
        view.setTag(2131363113, Float.valueOf(transitionAlpha));
    }

    @Override
    public final void b(t tVar) {
    }

    @Override
    public final void c(t tVar) {
    }

    @Override
    public final void d(t tVar) {
    }

    @Override
    public final void e() {
        this.f14458a.setTag(2131363113, null);
    }

    @Override
    public final void f(t tVar) {
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        b bVar = b0.f14429a;
        this.f14458a.setTransitionAlpha(1.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z10) {
        boolean z11 = this.f14459b;
        View view = this.f14458a;
        if (z11) {
            view.setLayerType(0, null);
        }
        if (z10) {
            return;
        }
        b bVar = b0.f14429a;
        view.setTransitionAlpha(1.0f);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        View view = this.f14458a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f14459b = true;
            view.setLayerType(2, null);
        }
    }
}

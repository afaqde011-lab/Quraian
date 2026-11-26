package androidx.fragment.app;

import android.transition.Transition;

public final class y1 implements Transition.TransitionListener {

    public final Runnable f861a;

    public y1(Runnable runnable) {
        this.f861a = runnable;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        this.f861a.run();
    }

    @Override
    public final void onTransitionPause(Transition transition) {
    }

    @Override
    public final void onTransitionResume(Transition transition) {
    }

    @Override
    public final void onTransitionStart(Transition transition) {
    }
}

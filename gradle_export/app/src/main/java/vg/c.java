package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class c extends AnimatorListenerAdapter {

    public final int f15639a;

    public final d f15640b;

    public c(d dVar, int i10) {
        this.f15639a = i10;
        this.f15640b = dVar;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f15639a) {
            case 1:
                this.f15640b.f15667b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f15639a) {
            case 0:
                this.f15640b.f15667b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}

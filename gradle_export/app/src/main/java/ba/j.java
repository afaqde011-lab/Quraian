package ba;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class j extends AnimatorListenerAdapter {

    public boolean f2311a = false;

    public final l f2312b;

    public j(l lVar) {
        this.f2312b = lVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f2311a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (this.f2311a) {
            this.f2311a = false;
            return;
        }
        l lVar = this.f2312b;
        if (((Float) lVar.f2346z.getAnimatedValue()).floatValue() == 0.0f) {
            lVar.A = 0;
            lVar.f(0);
        } else {
            lVar.A = 2;
            lVar.f2339s.invalidate();
        }
    }
}

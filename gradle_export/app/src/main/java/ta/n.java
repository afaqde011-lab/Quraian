package ta;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import z4.o0;

public final class n extends AnimatorListenerAdapter {

    public final int f14470a = 0;

    public final Object f14471b;

    public final Object f14472c;

    public n(t tVar, u.e eVar) {
        this.f14472c = tVar;
        this.f14471b = eVar;
    }

    public n(o0 o0Var, View view) {
        this.f14471b = o0Var;
        this.f14472c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f14470a) {
            case 1:
                ((o0) this.f14471b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14470a) {
            case 0:
                ((u.e) this.f14471b).remove(animator);
                ((t) this.f14472c).N.remove(animator);
                break;
            default:
                ((o0) this.f14471b).c();
                break;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f14470a) {
            case 0:
                ((t) this.f14472c).N.add(animator);
                break;
            default:
                ((o0) this.f14471b).b();
                break;
        }
    }
}

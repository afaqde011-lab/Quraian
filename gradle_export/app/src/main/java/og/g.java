package og;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class g extends AnimatorListenerAdapter {

    public final boolean f11967a;

    public final int f11968b;

    public final h f11969c;

    public g(h hVar, boolean z10, int i10) {
        this.f11969c = hVar;
        this.f11967a = z10;
        this.f11968b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h hVar = this.f11969c;
        hVar.f11957b.setTranslationX(0.0f);
        hVar.a(0.0f, this.f11968b, this.f11967a);
    }
}

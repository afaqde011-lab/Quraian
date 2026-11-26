package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

public final class d implements Animation.AnimationListener {

    public final g2 f693a;

    public final ViewGroup f694b;

    public final View f695c;

    public final e f696d;

    public d(g2 g2Var, ViewGroup viewGroup, View view, e eVar) {
        this.f693a = g2Var;
        this.f694b = viewGroup;
        this.f695c = view;
        this.f696d = eVar;
    }

    @Override
    public final void onAnimationEnd(Animation animation) {
        kotlin.jvm.internal.m.e(animation, "animation");
        ViewGroup viewGroup = this.f694b;
        viewGroup.post(new ab.e(viewGroup, this.f695c, this.f696d, 2));
        if (i1.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f693a + " has ended.");
        }
    }

    @Override
    public final void onAnimationRepeat(Animation animation) {
        kotlin.jvm.internal.m.e(animation, "animation");
    }

    @Override
    public final void onAnimationStart(Animation animation) {
        kotlin.jvm.internal.m.e(animation, "animation");
        if (i1.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f693a + " has reached onAnimationStart.");
        }
    }
}

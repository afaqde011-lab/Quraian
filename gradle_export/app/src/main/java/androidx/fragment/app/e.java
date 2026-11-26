package androidx.fragment.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

public final class e extends f2 {

    public final f f698c;

    public e(f fVar) {
        this.f698c = fVar;
    }

    @Override
    public final void b(ViewGroup viewGroup) {
        kotlin.jvm.internal.m.e(viewGroup, "container");
        f fVar = this.f698c;
        g2 g2Var = fVar.f774a;
        View view = g2Var.f735c.mView;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        fVar.f774a.c(this);
        if (i1.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + g2Var + " has been cancelled.");
        }
    }

    @Override
    public final void c(ViewGroup viewGroup) {
        kotlin.jvm.internal.m.e(viewGroup, "container");
        f fVar = this.f698c;
        g2 g2Var = fVar.f774a;
        if (fVar.a()) {
            g2Var.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = g2Var.f735c.mView;
        kotlin.jvm.internal.m.d(context, "context");
        p0 p0VarB = fVar.b(context);
        if (p0VarB == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Animation animation = (Animation) p0VarB.f802a;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (g2Var.f733a != 1) {
            view.startAnimation(animation);
            g2Var.c(this);
            return;
        }
        viewGroup.startViewTransition(view);
        q0 q0Var = new q0(animation, viewGroup, view);
        q0Var.setAnimationListener(new d(g2Var, viewGroup, view, this));
        view.startAnimation(q0Var);
        if (i1.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + g2Var + " has started.");
        }
    }
}

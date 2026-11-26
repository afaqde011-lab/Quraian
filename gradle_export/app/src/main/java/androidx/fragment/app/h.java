package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

public final class h extends f2 {

    public final f f744c;

    public AnimatorSet f745d;

    public h(f fVar) {
        this.f744c = fVar;
    }

    @Override
    public final void b(ViewGroup viewGroup) {
        kotlin.jvm.internal.m.e(viewGroup, "container");
        AnimatorSet animatorSet = this.f745d;
        f fVar = this.f744c;
        if (animatorSet == null) {
            fVar.f774a.c(this);
            return;
        }
        g2 g2Var = fVar.f774a;
        if (g2Var.f739g) {
            j.f773a.a(animatorSet);
        } else {
            animatorSet.end();
        }
        if (i1.K(2)) {
            StringBuilder sb2 = new StringBuilder("Animator from operation ");
            sb2.append(g2Var);
            sb2.append(" has been canceled");
            sb2.append(g2Var.f739g ? " with seeking." : ".");
            sb2.append(' ');
            Log.v("FragmentManager", sb2.toString());
        }
    }

    @Override
    public final void c(ViewGroup viewGroup) {
        kotlin.jvm.internal.m.e(viewGroup, "container");
        g2 g2Var = this.f744c.f774a;
        AnimatorSet animatorSet = this.f745d;
        if (animatorSet == null) {
            g2Var.c(this);
            return;
        }
        animatorSet.start();
        if (i1.K(2)) {
            Log.v("FragmentManager", "Animator from operation " + g2Var + " has started.");
        }
    }

    @Override
    public final void d(d.b bVar, ViewGroup viewGroup) {
        kotlin.jvm.internal.m.e(viewGroup, "container");
        g2 g2Var = this.f744c.f774a;
        AnimatorSet animatorSet = this.f745d;
        if (animatorSet == null) {
            g2Var.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !g2Var.f735c.mTransitioning) {
            return;
        }
        if (i1.K(2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + g2Var);
        }
        long jA = i.f748a.a(animatorSet);
        long j9 = (long) (bVar.f4377c * jA);
        if (j9 == 0) {
            j9 = 1;
        }
        if (j9 == jA) {
            j9 = jA - 1;
        }
        if (i1.K(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j9 + " for Animator " + animatorSet + " on operation " + g2Var);
        }
        j.f773a.b(animatorSet, j9);
    }

    @Override
    public final void e(ViewGroup viewGroup) {
        h hVar;
        kotlin.jvm.internal.m.e(viewGroup, "container");
        f fVar = this.f744c;
        if (fVar.a()) {
            return;
        }
        Context context = viewGroup.getContext();
        kotlin.jvm.internal.m.d(context, "context");
        p0 p0VarB = fVar.b(context);
        this.f745d = p0VarB != null ? (AnimatorSet) p0VarB.f803b : null;
        g2 g2Var = fVar.f774a;
        j0 j0Var = g2Var.f735c;
        boolean z10 = g2Var.f733a == 3;
        View view = j0Var.mView;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.f745d;
        if (animatorSet != null) {
            hVar = this;
            animatorSet.addListener(new g(viewGroup, view, z10, g2Var, hVar));
        } else {
            hVar = this;
        }
        AnimatorSet animatorSet2 = hVar.f745d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}

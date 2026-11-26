package androidx.fragment.app;

import android.transition.Transition;

public final class q extends k {

    public final Object f804b;

    public final boolean f805c;

    public final Object f806d;

    public q(g2 g2Var, boolean z10, boolean z11) {
        super(g2Var);
        j0 j0Var = g2Var.f735c;
        this.f804b = g2Var.f733a == 2 ? z10 ? j0Var.getReenterTransition() : j0Var.getEnterTransition() : z10 ? j0Var.getReturnTransition() : j0Var.getExitTransition();
        this.f805c = g2Var.f733a == 2 ? z10 ? j0Var.getAllowReturnTransitionOverlap() : j0Var.getAllowEnterTransitionOverlap() : true;
        this.f806d = z11 ? z10 ? j0Var.getSharedElementReturnTransition() : j0Var.getSharedElementEnterTransition() : null;
    }

    public final b2 b() {
        Object obj = this.f804b;
        b2 b2VarC = c(obj);
        Object obj2 = this.f806d;
        b2 b2VarC2 = c(obj2);
        if (b2VarC == null || b2VarC2 == null || b2VarC == b2VarC2) {
            return b2VarC == null ? b2VarC2 : b2VarC;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f774a.f735c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }

    public final b2 c(Object obj) {
        if (obj == null) {
            return null;
        }
        z1 z1Var = u1.f846a;
        if (obj instanceof Transition) {
            return z1Var;
        }
        b2 b2Var = u1.f847b;
        if (b2Var != null && b2Var.g(obj)) {
            return b2Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f774a.f735c + " is not a valid framework Transition or AndroidX Transition");
    }
}

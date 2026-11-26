package androidx.fragment.app;

import android.view.View;

public abstract class k {

    public final g2 f774a;

    public k(g2 g2Var) {
        kotlin.jvm.internal.m.e(g2Var, "operation");
        this.f774a = g2Var;
    }

    public final boolean a() {
        int i10;
        g2 g2Var = this.f774a;
        View view = g2Var.f735c.mView;
        if (view != null) {
            i10 = 4;
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i10 = 2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(g4.c.f(visibility, "Unknown visibility "));
                    }
                    i10 = 3;
                }
            }
        } else {
            i10 = 0;
        }
        int i11 = g2Var.f733a;
        if (i10 != i11) {
            return (i10 == 2 || i11 == 2) ? false : true;
        }
        return true;
    }
}

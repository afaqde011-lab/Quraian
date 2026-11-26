package androidx.fragment.app;

import android.view.View;

public final class c0 extends r0 {
    public final j0 A;

    public c0(j0 j0Var) {
        this.A = j0Var;
    }

    @Override
    public final View b(int i10) {
        j0 j0Var = this.A;
        View view = j0Var.mView;
        if (view != null) {
            return view.findViewById(i10);
        }
        throw new IllegalStateException("Fragment " + j0Var + " does not have a view");
    }

    @Override
    public final boolean c() {
        return this.A.mView != null;
    }
}

package androidx.fragment.app;

import android.os.Bundle;

public final class b0 extends h0 {

    public final j0 f690a;

    public b0(j0 j0Var) {
        this.f690a = j0Var;
    }

    @Override
    public final void a() {
        j0 j0Var = this.f690a;
        j0Var.mSavedStateRegistryController.f7565a.a();
        androidx.lifecycle.u0.d(j0Var);
        Bundle bundle = j0Var.mSavedFragmentState;
        j0Var.mSavedStateRegistryController.a(bundle != null ? bundle.getBundle("registryState") : null);
    }
}

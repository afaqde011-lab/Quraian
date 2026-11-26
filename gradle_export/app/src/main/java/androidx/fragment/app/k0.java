package androidx.fragment.app;

import android.os.Bundle;

public final class k0 implements ia.d {

    public final int f775a;

    public final Object f776b;

    public k0(Object obj, int i10) {
        this.f775a = i10;
        this.f776b = obj;
    }

    @Override
    public final Bundle a() {
        int i10 = this.f775a;
        Object obj = this.f776b;
        switch (i10) {
            case 0:
                o0 o0Var = (o0) obj;
                o0Var.markFragmentsCreated();
                o0Var.mFragmentLifecycleRegistry.g(androidx.lifecycle.o.ON_STOP);
                return new Bundle();
            default:
                return ((i1) obj).X();
        }
    }
}

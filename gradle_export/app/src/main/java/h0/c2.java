package h0;

import android.view.View;
import java.util.WeakHashMap;

public final class c2 extends s0 {
    public u00.k R;
    public m2 S;

    @Override
    public final void t1() {
        View viewA = b3.m.A(this);
        WeakHashMap weakHashMap = m2.f6423w;
        m2 m2VarF = b.f(viewA);
        m2VarF.a(viewA);
        l2 l2Var = (l2) this.R.invoke(m2VarF);
        if (!kotlin.jvm.internal.m.a(l2Var, this.Q)) {
            this.Q = l2Var;
            C1();
        }
        this.S = m2VarF;
        super.t1();
    }

    @Override
    public final void u1() {
        View viewA = b3.m.A(this);
        m2 m2Var = this.S;
        if (m2Var != null) {
            int i10 = m2Var.f6442u - 1;
            m2Var.f6442u = i10;
            if (i10 == 0) {
                WeakHashMap weakHashMap = z4.j0.f17198a;
                z4.d0.b(viewA, null);
                viewA.setWindowInsetsAnimationCallback(null);
                viewA.removeOnAttachStateChangeListener(m2Var.f6443v);
            }
        }
        super.u1();
    }
}

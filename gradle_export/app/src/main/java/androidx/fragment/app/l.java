package androidx.fragment.app;

import android.util.Log;

public final class l implements Runnable {
    public final int A;
    public final g2 B;
    public final p C;

    public l(g2 g2Var, p pVar, int i10) {
        this.A = i10;
        this.B = g2Var;
        this.C = pVar;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                g2 g2Var = this.B;
                kotlin.jvm.internal.m.e(g2Var, "$operation");
                p pVar = this.C;
                kotlin.jvm.internal.m.e(pVar, "this$0");
                if (i1.K(2)) {
                    Log.v("FragmentManager", "Transition for operation " + g2Var + " has completed");
                }
                g2Var.c(pVar);
                break;
            default:
                g2 g2Var2 = this.B;
                kotlin.jvm.internal.m.e(g2Var2, "$operation");
                p pVar2 = this.C;
                kotlin.jvm.internal.m.e(pVar2, "this$0");
                if (i1.K(2)) {
                    Log.v("FragmentManager", "Transition for operation " + g2Var2 + " has completed");
                }
                g2Var2.c(pVar2);
                break;
        }
    }
}

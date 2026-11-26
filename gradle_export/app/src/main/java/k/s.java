package k;

import android.view.Window;
import p.b1;

public final class s implements b1, o.w {
    public final b0 A;

    public s(b0 b0Var) {
        this.A = b0Var;
    }

    @Override
    public void c(o.l lVar, boolean z10) {
        a0 a0Var;
        o.l lVarK = lVar.k();
        int i10 = 0;
        boolean z11 = lVarK != lVar;
        if (z11) {
            lVar = lVarK;
        }
        b0 b0Var = this.A;
        a0[] a0VarArr = b0Var.f8349j0;
        int length = a0VarArr != null ? a0VarArr.length : 0;
        while (true) {
            if (i10 < length) {
                a0Var = a0VarArr[i10];
                if (a0Var != null && a0Var.f8333h == lVar) {
                    break;
                } else {
                    i10++;
                }
            } else {
                a0Var = null;
                break;
            }
        }
        if (a0Var != null) {
            if (!z11) {
                b0Var.r(a0Var, z10);
            } else {
                b0Var.p(a0Var.f8326a, a0Var, lVarK);
                b0Var.r(a0Var, true);
            }
        }
    }

    @Override
    public boolean x(o.l lVar) {
        Window.Callback callback;
        if (lVar != lVar.k()) {
            return true;
        }
        b0 b0Var = this.A;
        if (!b0Var.f8343d0 || (callback = b0Var.J.getCallback()) == null || b0Var.f8354o0) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }
}

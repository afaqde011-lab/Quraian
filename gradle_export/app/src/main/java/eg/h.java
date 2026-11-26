package eg;

import android.view.View;
import android.view.WindowInsetsAnimation;
import java.util.Iterator;
import java.util.List;
import q3.e0;
import z4.j1;
import z4.q0;

public final class h extends f7.e {
    public final View C;
    public int D;
    public int E;
    public final int[] F;

    public h(View view) {
        super(0, 3);
        this.F = new int[2];
        this.C = view;
    }

    @Override
    public final void m(q0 q0Var) {
        this.C.setTranslationY(0.0f);
    }

    @Override
    public final void n(q0 q0Var) {
        View view = this.C;
        int[] iArr = this.F;
        view.getLocationOnScreen(iArr);
        this.D = iArr[1];
    }

    @Override
    public final j1 o(j1 j1Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q0 q0Var = (q0) it.next();
            if ((((WindowInsetsAnimation) q0Var.f17221a.B).getTypeMask() & 8) != 0) {
                this.C.setTranslationY(ag.a.c(((WindowInsetsAnimation) q0Var.f17221a.B).getInterpolatedFraction(), this.E, 0));
                break;
            }
        }
        return j1Var;
    }

    @Override
    public final e0 p(q0 q0Var, e0 e0Var) {
        View view = this.C;
        int[] iArr = this.F;
        view.getLocationOnScreen(iArr);
        int i10 = this.D - iArr[1];
        this.E = i10;
        view.setTranslationY(i10);
        return e0Var;
    }
}

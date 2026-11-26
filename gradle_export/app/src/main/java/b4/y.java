package b4;

import android.view.View;

public final class y extends b2.q implements g2.s {
    @Override
    public final void q0(g2.p pVar) {
        View viewC = l.c(this);
        pVar.e(this.A.N && l.c(this).hasFocusable());
        View viewFindFocus = viewC.findFocus();
        if (viewFindFocus != null) {
            pVar.c(g2.h.a(viewFindFocus, viewC));
        }
    }
}

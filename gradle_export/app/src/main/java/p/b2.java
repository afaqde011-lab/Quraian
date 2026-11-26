package p;

import android.content.Context;
import android.view.MenuItem;

public final class b2 extends w1 implements x1 {

    public gi.c f12139a0;

    @Override
    public final void c(o.l lVar, MenuItem menuItem) {
        gi.c cVar = this.f12139a0;
        if (cVar != null) {
            cVar.c(lVar, menuItem);
        }
    }

    @Override
    public final void g(o.l lVar, o.n nVar) {
        gi.c cVar = this.f12139a0;
        if (cVar != null) {
            cVar.g(lVar, nVar);
        }
    }

    @Override
    public final j1 p(Context context, boolean z10) {
        a2 a2Var = new a2(context, z10);
        a2Var.setHoverListener(this);
        return a2Var;
    }
}

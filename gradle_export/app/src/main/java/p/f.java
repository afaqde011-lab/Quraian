package p;

import android.content.Context;
import android.view.View;

public final class f extends o.v {
    public final int l = 0;
    public final j m;

    public f(j jVar, Context context, o.d0 d0Var, View view) {
        super(context, d0Var, view, false, 2130968611, 0);
        this.m = jVar;
        if ((d0Var.A.f11445x & 32) != 32) {
            View view2 = jVar.I;
            this.f11460e = view2 == null ? (View) jVar.H : view2;
        }
        o9.q qVar = jVar.W;
        this.f11463h = qVar;
        o.t tVar = this.f11464i;
        if (tVar != null) {
            tVar.i(qVar);
        }
    }

    public f(j jVar, Context context, o.l lVar, View view) {
        super(context, lVar, view, true, 2130968611, 0);
        this.m = jVar;
        this.f11461f = 8388613;
        o9.q qVar = jVar.W;
        this.f11463h = qVar;
        o.t tVar = this.f11464i;
        if (tVar != null) {
            tVar.i(qVar);
        }
    }

    @Override
    public final void c() {
        switch (this.l) {
            case 0:
                j jVar = this.m;
                jVar.T = null;
                jVar.getClass();
                super.c();
                break;
            default:
                j jVar2 = this.m;
                o.l lVar = jVar2.C;
                if (lVar != null) {
                    lVar.c(true);
                }
                jVar2.S = null;
                super.c();
                break;
        }
    }
}

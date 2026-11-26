package vg;

import android.view.View;

public final class a implements View.OnFocusChangeListener {
    public final int A;
    public final o B;

    public a(o oVar, int i10) {
        this.A = i10;
        this.B = oVar;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        int i10 = this.A;
        o oVar = this.B;
        switch (i10) {
            case 0:
                d dVar = (d) oVar;
                dVar.s(dVar.t());
                break;
            default:
                k kVar = (k) oVar;
                kVar.l = z10;
                kVar.p();
                if (!z10) {
                    kVar.s(false);
                    kVar.m = false;
                }
                break;
        }
    }
}

package p;

import androidx.appcompat.widget.Toolbar;

public final class l2 implements Runnable {
    public final int A;
    public final Toolbar B;

    public l2(Toolbar toolbar, int i10) {
        this.A = i10;
        this.B = toolbar;
    }

    @Override
    public final void run() {
        int i10 = this.A;
        Toolbar toolbar = this.B;
        switch (i10) {
            case 0:
                n2 n2Var = toolbar.f552p0;
                o.n nVar = n2Var == null ? null : n2Var.B;
                if (nVar != null) {
                    nVar.collapseActionView();
                }
                break;
            default:
                toolbar.m();
                break;
        }
    }
}

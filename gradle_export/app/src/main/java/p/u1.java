package p;

import android.widget.AbsListView;

public final class u1 implements AbsListView.OnScrollListener {

    public final w1 f12225a;

    public u1(w1 w1Var) {
        this.f12225a = w1Var;
    }

    @Override
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }

    @Override
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        w1 w1Var = this.f12225a;
        s1 s1Var = w1Var.R;
        y yVar = w1Var.Z;
        if (i10 != 1 || yVar.getInputMethodMode() == 2 || yVar.getContentView() == null) {
            return;
        }
        w1Var.V.removeCallbacks(s1Var);
        s1Var.run();
    }
}

package p;

import android.database.DataSetObserver;

public final class t1 extends DataSetObserver {

    public final w1 f12221a;

    public t1(w1 w1Var) {
        this.f12221a = w1Var;
    }

    @Override
    public final void onChanged() {
        w1 w1Var = this.f12221a;
        if (w1Var.Z.isShowing()) {
            w1Var.show();
        }
    }

    @Override
    public final void onInvalidated() {
        this.f12221a.dismiss();
    }
}

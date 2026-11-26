package p;

import android.view.View;
import android.widget.AdapterView;

public final class p1 implements AdapterView.OnItemSelectedListener {
    public final w1 A;

    public p1(w1 w1Var) {
        this.A = w1Var;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j9) {
        j1 j1Var;
        if (i10 == -1 || (j1Var = this.A.C) == null) {
            return;
        }
        j1Var.setListSelectionHidden(false);
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}

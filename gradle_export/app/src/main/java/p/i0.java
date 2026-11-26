package p;

import android.view.View;
import android.widget.AdapterView;

public final class i0 implements AdapterView.OnItemClickListener {
    public final int A;
    public final Object B;

    public i0(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j9) {
        Object item;
        switch (this.A) {
            case 0:
                k0 k0Var = (k0) this.B;
                n0 n0Var = k0Var.f12180e0;
                n0Var.setSelection(i10);
                if (n0Var.getOnItemClickListener() != null) {
                    n0Var.performItemClick(view, i10, k0Var.f12177b0.getItemId(i10));
                }
                k0Var.dismiss();
                break;
            default:
                vg.s sVar = (vg.s) this.B;
                w1 w1Var = sVar.E;
                if (i10 < 0) {
                    item = !w1Var.Z.isShowing() ? null : w1Var.C.getSelectedItem();
                } else {
                    item = sVar.getAdapter().getItem(i10);
                }
                sVar.setText(sVar.convertSelectionToString(item), false);
                AdapterView.OnItemClickListener onItemClickListener = sVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i10 < 0) {
                        view = !w1Var.Z.isShowing() ? null : w1Var.C.getSelectedView();
                        i10 = !w1Var.Z.isShowing() ? -1 : w1Var.C.getSelectedItemPosition();
                        j9 = !w1Var.Z.isShowing() ? Long.MIN_VALUE : w1Var.C.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(w1Var.C, view, i10, j9);
                }
                w1Var.dismiss();
                break;
        }
    }
}

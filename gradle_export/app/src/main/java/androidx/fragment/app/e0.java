package androidx.fragment.app;

import android.util.Log;
import android.view.View;

public final class e0 implements s.a, androidx.lifecycle.g0 {
    public final int A;
    public final Object B;

    public e0(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public Object apply(Object obj) {
        switch (this.A) {
            case 0:
                j0 j0Var = (j0) this.B;
                Object obj2 = j0Var.mHost;
                return obj2 instanceof h.j ? ((h.j) obj2).getActivityResultRegistry() : j0Var.requireActivity().getActivityResultRegistry();
            default:
                return (h.i) this.B;
        }
    }

    @Override
    public void b(Object obj) {
        androidx.lifecycle.w wVar = (androidx.lifecycle.w) obj;
        x xVar = (x) this.B;
        if (wVar == null || !xVar.mShowsDialog) {
            return;
        }
        View viewRequireView = xVar.requireView();
        if (viewRequireView.getParent() != null) {
            throw new IllegalStateException("DialogFragment can not be attached to a container view");
        }
        if (xVar.mDialog != null) {
            if (i1.K(3)) {
                Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + xVar.mDialog);
            }
            xVar.mDialog.setContentView(viewRequireView);
        }
    }
}

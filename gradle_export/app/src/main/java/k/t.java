package k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.gms.internal.measurement.g4;
import java.util.WeakHashMap;

public final class t extends g4 {

    public final int f8450i;

    public final Object f8451j;

    public t(Object obj, int i10) {
        this.f8450i = i10;
        this.f8451j = obj;
    }

    @Override
    public void b() {
        int i10 = this.f8450i;
        Object obj = this.f8451j;
        switch (i10) {
            case 0:
                ((q) obj).B.T.setVisibility(0);
                break;
            case 1:
                b0 b0Var = (b0) obj;
                b0Var.T.setVisibility(0);
                if (b0Var.T.getParent() instanceof View) {
                    View view = (View) b0Var.T.getParent();
                    WeakHashMap weakHashMap = z4.j0.f17198a;
                    view.requestApplyInsets();
                }
                break;
        }
    }

    @Override
    public final void c() {
        int i10 = this.f8450i;
        Object obj = this.f8451j;
        switch (i10) {
            case 0:
                b0 b0Var = ((q) obj).B;
                b0Var.T.setAlpha(1.0f);
                b0Var.W.d(null);
                b0Var.W = null;
                break;
            case 1:
                b0 b0Var2 = (b0) obj;
                b0Var2.T.setAlpha(1.0f);
                b0Var2.W.d(null);
                b0Var2.W = null;
                break;
            default:
                b0 b0Var3 = (b0) ((h1.l) obj).B;
                b0Var3.T.setVisibility(8);
                PopupWindow popupWindow = b0Var3.U;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (b0Var3.T.getParent() instanceof View) {
                    View view = (View) b0Var3.T.getParent();
                    WeakHashMap weakHashMap = z4.j0.f17198a;
                    view.requestApplyInsets();
                }
                b0Var3.T.e();
                b0Var3.W.d(null);
                b0Var3.W = null;
                ViewGroup viewGroup = b0Var3.Y;
                WeakHashMap weakHashMap2 = z4.j0.f17198a;
                viewGroup.requestApplyInsets();
                break;
        }
    }
}

package p;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

public final class j0 implements PopupWindow.OnDismissListener {
    public final o.d A;
    public final k0 B;

    public j0(k0 k0Var, o.d dVar) {
        this.B = k0Var;
        this.A = dVar;
    }

    @Override
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.B.f12180e0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.A);
        }
    }
}

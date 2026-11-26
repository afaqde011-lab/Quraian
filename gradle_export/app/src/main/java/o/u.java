package o;

import android.widget.PopupWindow;

public final class u implements PopupWindow.OnDismissListener {
    public final v A;

    public u(v vVar) {
        this.A = vVar;
    }

    @Override
    public final void onDismiss() {
        this.A.c();
    }
}

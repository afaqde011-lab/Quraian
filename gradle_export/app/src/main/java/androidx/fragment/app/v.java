package androidx.fragment.app;

import android.content.DialogInterface;

public final class v implements DialogInterface.OnDismissListener {
    public final x A;

    public v(x xVar) {
        this.A = xVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        x xVar = this.A;
        if (xVar.mDialog != null) {
            xVar.onDismiss(xVar.mDialog);
        }
    }
}

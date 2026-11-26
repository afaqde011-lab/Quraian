package androidx.fragment.app;

import android.content.DialogInterface;

public final class u implements DialogInterface.OnCancelListener {
    public final x A;

    public u(x xVar) {
        this.A = xVar;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        x xVar = this.A;
        if (xVar.mDialog != null) {
            xVar.onCancel(xVar.mDialog);
        }
    }
}

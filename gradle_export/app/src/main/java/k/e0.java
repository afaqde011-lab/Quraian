package k;

import android.app.Dialog;
import android.os.Bundle;

public class e0 extends androidx.fragment.app.x {
    @Override
    public Dialog onCreateDialog(Bundle bundle) {
        return new d0(getContext(), getTheme());
    }

    @Override
    public final void setupDialog(Dialog dialog, int i10) {
        if (!(dialog instanceof d0)) {
            super.setupDialog(dialog, i10);
            return;
        }
        d0 d0Var = (d0) dialog;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        d0Var.c().g(1);
    }
}

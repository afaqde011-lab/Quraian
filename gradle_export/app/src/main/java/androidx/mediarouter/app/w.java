package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;

public class w extends androidx.fragment.app.x {
    public final boolean A = false;
    public k.d0 B;
    public o9.u C;

    public w() {
        setCancelable(true);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k.d0 d0Var = this.B;
        if (d0Var != null) {
            if (this.A) {
                ((q0) d0Var).i();
            } else {
                ((v) d0Var).q();
            }
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.A) {
            q0 q0Var = new q0(getContext());
            this.B = q0Var;
            q0Var.h(this.C);
        } else {
            this.B = new v(getContext(), 0);
        }
        return this.B;
    }

    @Override
    public final void onStop() {
        super.onStop();
        k.d0 d0Var = this.B;
        if (d0Var == null || this.A) {
            return;
        }
        ((v) d0Var).h(false);
    }
}

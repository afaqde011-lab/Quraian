package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.b5;

public class i extends androidx.fragment.app.x {
    public final boolean A = false;
    public k.d0 B;
    public o9.u C;

    public i() {
        setCancelable(true);
    }

    public final void j() {
        if (this.C == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.C = o9.u.b(arguments.getBundle("selector"));
            }
            if (this.C == null) {
                this.C = o9.u.f11876c;
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k.d0 d0Var = this.B;
        if (d0Var == null) {
            return;
        }
        if (!this.A) {
            h hVar = (h) d0Var;
            hVar.getWindow().setLayout(b5.t(hVar.getContext()), -2);
        } else {
            d0 d0Var2 = (d0) d0Var;
            Context context = d0Var2.I;
            d0Var2.getWindow().setLayout(!context.getResources().getBoolean(2131034118) ? -1 : b5.t(context), context.getResources().getBoolean(2131034118) ? -2 : -1);
        }
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.A) {
            d0 d0Var = new d0(getContext());
            this.B = d0Var;
            j();
            d0Var.f(this.C);
        } else {
            h hVar = new h(getContext(), 0);
            this.B = hVar;
            j();
            hVar.g(this.C);
        }
        return this.B;
    }
}

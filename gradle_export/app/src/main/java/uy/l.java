package uy;

import ab.a0;
import com.google.android.gms.internal.measurement.g4;
import com.mchutov.quranify.settings.presentation.screen.benefits.CancellationBenefitsEffect$CloseScreen;
import h00.n;
import kotlin.NoWhenBranchMatchedException;

public final class l extends vm.a {
    public l() {
        super(new k(g4.d0(n.V0(new ry.b[]{new ry.b(2131886256, 2131886250, 2131886251, "offline_recitations"), new ry.b(2131886255, 2131886247, 2131886248, "carplay"), new ry.b(2131886256, 2131886252, 2131886253, "background_sounds")})), false));
    }

    public final void j(g action) {
        kotlin.jvm.internal.m.e(action, "action");
        boolean zEquals = action.equals(b.a);
        pm.b bVar = this.c;
        if (zEquals || action.equals(f.a) || action.equals(e.a)) {
            i(k.a((k) bVar.d.getValue(), false));
            a0.A0(this, CancellationBenefitsEffect$CloseScreen.INSTANCE);
        } else {
            if (action.equals(a.a)) {
                i(k.a((k) bVar.d.getValue(), true));
                return;
            }
            if (action.equals(d.a)) {
                i(k.a((k) bVar.d.getValue(), false));
            } else {
                if (!action.equals(c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                i(k.a((k) bVar.d.getValue(), false));
                a0.A0(this, h.a);
            }
        }
    }
}

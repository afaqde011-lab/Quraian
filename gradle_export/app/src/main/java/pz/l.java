package pz;

import ab.a0;
import androidx.lifecycle.u0;
import bt.y0;
import com.google.android.gms.internal.measurement.g4;
import com.mchutov.quranify.settings.presentation.screen.questionnaire.CancellationQuestionnaireEffect$CloseScreen;
import d40.p1;
import h00.q;
import h00.z;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import ta.c0;

public final class l extends vm.a {
    public final ly.f d;
    public final nm.b e;

    public l(ly.f fVar, nm.b bVar) {
        super(new j(false, g4.d0(h00.n.V0(new ry.c[]{new ry.c("cancel_budget", 2131886262), new ry.c("cancel_not_using_enough", 2131886265), new ry.c("cancel_premium_not_needed", 2131886264), new ry.c("cancel_recitations_not_found", 2131886263), new ry.c("cancel_technical_problems", 2131886269), new ry.c("cancel_prefer_another_app", 2131886267), new ry.c("cancel_other", 2131886268)})), (125 & 4) != 0 ? y30.c.D : null, "", false, (125 & 32) == 0, false));
        this.d = fVar;
        this.e = bVar;
    }

    public final void j(f action) {
        String str;
        int length;
        int length2;
        kotlin.jvm.internal.m.e(action, "action");
        if (action.equals(a.a)) {
            a0.A0(this, CancellationQuestionnaireEffect$CloseScreen.INSTANCE);
            return;
        }
        boolean z = action instanceof e;
        pm.b bVar = this.c;
        if (z) {
            String str2 = ((e) action).a;
            if (r30.k.L0(str2)) {
                return;
            }
            p1 p1Var = bVar.d;
            Set setG0 = ((j) p1Var.getValue()).c.contains(str2) ? z.A : w50.c.g0(str2);
            boolean zIsEmpty = setG0.isEmpty();
            boolean z2 = !zIsEmpty;
            String str3 = !zIsEmpty ? ((j) p1Var.getValue()).d : "";
            i(j.a((j) p1Var.getValue(), false, g4.f0(setG0), str3, z2, !setG0.isEmpty() && 10 <= (length2 = r30.k.j1(str3).toString().length()) && length2 < 201, false, 67));
            return;
        }
        if (action instanceof d) {
            String strH1 = r30.k.h1(200, ((d) action).a);
            i(j.a((j) bVar.d.getValue(), false, null, strH1, false, !((j) bVar.d.getValue()).c.isEmpty() && 10 <= (length = r30.k.j1(strH1).toString().length()) && length < 201, false, 87));
            return;
        }
        if (!(action instanceof b)) {
            if (!(action instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((j) bVar.d.getValue()).g) {
                i(j.a((j) bVar.d.getValue(), false, null, null, false, false, false, 63));
                a0.A0(this, g.a);
                return;
            }
            return;
        }
        j jVar = (j) bVar.d.getValue();
        if (!jVar.f || jVar.a || (str = (String) q.e1(jVar.c)) == null) {
            return;
        }
        String strH2 = r30.k.h1(200, r30.k.j1(jVar.d).toString());
        if (strH2.length() < 10) {
            return;
        }
        i(j.a(jVar, true, null, null, false, false, false, 126));
        c0.M(u0.i(this), (k00.i) null, new y0(this, null, 8), (u00.k) null, new k(this, str, strH2, null, 0), 27);
    }
}

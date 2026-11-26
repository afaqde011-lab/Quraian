package az;

import a1.e2;
import ab.a0;
import androidx.lifecycle.u0;
import com.google.android.gms.internal.measurement.g4;
import com.mchutov.quranify.settings.presentation.screen.deletequestionnaire.DeleteAccountQuestionnaireEffect$CloseScreen;
import d40.p1;
import h00.z;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import ta.c0;
import wo.b0;

public final class r extends vm.a {
    public final b0 d;
    public final pm.c e;

    public r(b0 b0Var, pm.c cVar) {
        super(new q(g4.d0(h00.n.V0(new ry.c[]{new ry.c("delete_no_longer_use", 2131886410), new ry.c("delete_switching_app", 2131886412), new ry.c("delete_privacy", 2131886411), new ry.c("delete_technical_problems", 2131886269), new ry.c("delete_another_account", 2131886409), new ry.c("delete_other", 2131886268)})), (62 & 2) != 0 ? y30.c.D : null, "", false, (62 & 16) == 0, false));
        this.d = b0Var;
        this.e = cVar;
    }

    public final void j(f action) {
        String str;
        int length;
        int length2;
        kotlin.jvm.internal.m.e(action, "action");
        if (action.equals(b.a)) {
            a0.A0(this, DeleteAccountQuestionnaireEffect$CloseScreen.INSTANCE);
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
            Set setG0 = ((q) p1Var.getValue()).b.contains(str2) ? z.A : w50.c.g0(str2);
            boolean zIsEmpty = setG0.isEmpty();
            boolean z2 = !zIsEmpty;
            String str3 = !zIsEmpty ? ((q) p1Var.getValue()).c : "";
            i(q.a((q) p1Var.getValue(), g4.f0(setG0), str3, z2, !setG0.isEmpty() && 10 <= (length2 = r30.k.j1(str3).toString().length()) && length2 < 201, false, 33));
            return;
        }
        if (action instanceof d) {
            String strH1 = r30.k.h1(200, ((d) action).a);
            i(q.a((q) bVar.d.getValue(), null, strH1, false, !((q) bVar.d.getValue()).b.isEmpty() && 10 <= (length = r30.k.j1(strH1).toString().length()) && length < 201, false, 43));
            return;
        }
        if (!action.equals(c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        q qVar = (q) bVar.d.getValue();
        if (!qVar.e || qVar.f || (str = (String) h00.q.e1(qVar.b)) == null) {
            return;
        }
        String strH2 = r30.k.h1(200, r30.k.j1(qVar.c).toString());
        if (strH2.length() < 10) {
            return;
        }
        i(q.a(qVar, null, null, false, false, true, 31));
        c0.M(u0.i(this), (k00.i) null, new a1.c0(this, (k00.c) null, 6), (u00.k) null, new e2(this, str, strH2, (k00.c) null, 3), 27);
    }
}

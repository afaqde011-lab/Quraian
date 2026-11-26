package xy;

import ab.a0;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.lifecycle.u0;
import com.google.android.gms.internal.measurement.x5;
import com.mchutov.quranify.auth.data.source.local.AuthLocalDataSource;
import com.mchutov.quranify.settings.presentation.screen.debug.DebugControlsEffect$CloseScreen;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Purchases;
import d40.p1;
import is.y;
import kotlin.NoWhenBranchMatchedException;
import r30.r;
import vp.x;
import wo.c0;

public final class o extends vm.a {
    public final y d;
    public final tx.a e;
    public final x f;

    public o(y yVar, im.a aVar, pq.a aVar2, tx.a aVar3, x xVar, c0 c0Var, or.b bVar) {
        String str;
        super(new n("", "", "", lm.a.A, "", false, false, false, "", null, null));
        this.d = yVar;
        this.e = aVar3;
        this.f = xVar;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        kotlin.jvm.internal.m.b(str3);
        kotlin.jvm.internal.m.b(str2);
        String strM = r.x0(str3, str2, false) ? str3 : x5.m(str2, " ", str3);
        AuthLocalDataSource authLocalDataSource = c0Var.a;
        ep.g session = authLocalDataSource.getSession();
        if (authLocalDataSource.isAuthorized()) {
            String str4 = session != null ? session.e.a : null;
            if (str4 == null) {
                str = "";
            } else {
                str = str4;
            }
        } else {
            str = "";
        }
        n nVar = (n) this.c.d.getValue();
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.m.d(RELEASE, "RELEASE");
        kotlin.jvm.internal.m.b(strM);
        lm.b bVar2 = aVar.a;
        bVar2.getClass();
        String str5 = bVar2.a;
        boolean zL = x.l((CustomerInfo) xVar.b.getValue());
        String str6 = (String) xVar.h.getValue();
        i(n.a(nVar, strM, str5, false, zL, str, str6 == null ? Purchases.INSTANCE.getSharedInstance().getStorefrontCountryCode() : str6, 32));
    }

    public final void j(j action) {
        kotlin.jvm.internal.m.e(action, "action");
        if (action.equals(b.a)) {
            a0.A0(this, DebugControlsEffect$CloseScreen.INSTANCE);
            return;
        }
        boolean zEquals = action.equals(c.a);
        pm.b bVar = this.c;
        if (zEquals) {
            i(n.a((n) bVar.d.getValue(), null, null, true, false, null, null, 2015));
            return;
        }
        if (action.equals(e.a)) {
            i(n.a((n) bVar.d.getValue(), null, null, false, false, null, null, 2015));
            return;
        }
        if (action.equals(d.a)) {
            i(n.a((n) bVar.d.getValue(), null, null, false, false, null, null, 2015));
            ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new l6.d(this, (k00.c) null, 23), 31);
            return;
        }
        boolean zEquals2 = action.equals(i.a);
        tx.a aVar = this.e;
        if (zEquals2) {
            SharedPreferences.Editor editorEdit = aVar.a.edit();
            editorEdit.remove("surah_count_key");
            editorEdit.remove("on_questioner_shown_date");
            editorEdit.remove("questioner_value");
            editorEdit.remove("questioner_interval_unit");
            editorEdit.remove("is_questioner_answered");
            editorEdit.apply();
            p1 p1Var = aVar.b;
            Boolean bool = Boolean.FALSE;
            p1Var.getClass();
            p1Var.k(null, bool);
            return;
        }
        if (action.equals(f.a)) {
            SharedPreferences sharedPreferences = aVar.a;
            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
            editorEdit2.remove("on_questioner_shown_date");
            editorEdit2.remove("questioner_value");
            editorEdit2.remove("questioner_interval_unit");
            editorEdit2.apply();
            sharedPreferences.getBoolean("is_questioner_answered", false);
            return;
        }
        if (action.equals(h.a)) {
            this.f.getClass();
            i(n.a((n) bVar.d.getValue(), null, null, false, false, null, null, 1983));
        } else {
            if (!action.equals(g.a)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((n) bVar.d.getValue()).i;
            if (str.length() > 0) {
                a0.A0(this, new k(str));
            }
        }
    }
}

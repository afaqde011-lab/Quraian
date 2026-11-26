package zy;

import a40.u1;
import ab.a0;
import androidx.lifecycle.u0;
import com.mchutov.core.domain.exception.AuthException;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import com.mchutov.quranify.settings.presentation.screen.deletecode.DeleteAccountCodeLauncher;
import d40.p1;
import ev.x;
import kotlin.NoWhenBranchMatchedException;
import wo.b0;
import wo.c0;

public final class p extends vm.a {
    public final b0 d;
    public final pm.c e;
    public final AuthAnalytics f;
    public final nm.b g;
    public u1 h;
    public u1 i;
    public boolean j;
    public boolean k;
    public boolean l;

    public p(DeleteAccountCodeLauncher launcher, b0 b0Var, c0 c0Var, pm.c cVar, AuthAnalytics authAnalytics, nm.b bVar) {
        kotlin.jvm.internal.m.e(launcher, "launcher");
        String reason = launcher.getReason();
        String reasonSpecification = launcher.getReasonSpecification();
        ep.g session = c0Var.a.getSession();
        String str = session != null ? session.e.b : null;
        String str2 = str == null ? "" : str;
        int resendIn = launcher.getResendIn();
        Integer numValueOf = resendIn <= 0 ? null : Integer.valueOf(resendIn);
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 30;
        int resendIn2 = launcher.getResendIn();
        Integer numValueOf2 = resendIn2 > 0 ? Integer.valueOf(resendIn2) : null;
        super(new l(reason, reasonSpecification, "", str2, iIntValue, numValueOf2 != null ? numValueOf2.intValue() : 30, false, false, false, false, null));
        this.d = b0Var;
        this.e = cVar;
        this.f = authAnalytics;
        this.g = bVar;
        m();
    }

    public static final String j(p pVar, Throwable th) {
        pm.c cVar = pVar.e;
        if (!(th instanceof AuthException)) {
            return cVar.a(2131887217, new Object[0]);
        }
        AuthException authException = (AuthException) th;
        String str = authException.A;
        if (str != null) {
            switch (str.hashCode()) {
                case -664629797:
                    if (str.equals("otp_resend_cooldown")) {
                        return cVar.a(2131886201, new Object[0]);
                    }
                    break;
                case -312202594:
                    if (str.equals("otp_locked")) {
                        return cVar.a(2131886200, new Object[0]);
                    }
                    break;
                case 532737251:
                    if (str.equals("otp_invalid")) {
                        return cVar.a(2131886199, new Object[0]);
                    }
                    break;
                case 899078987:
                    if (str.equals("otp_resend_limit")) {
                        return cVar.a(2131886203, new Object[0]);
                    }
                    break;
            }
        }
        String str2 = authException.B;
        return str2 == null ? cVar.a(2131887217, new Object[0]) : str2;
    }

    public final void k(e action) {
        kotlin.jvm.internal.m.e(action, "action");
        if (action.equals(a.a)) {
            a0.A0(this, g.a);
            return;
        }
        boolean z = action instanceof b;
        k00.c cVar = null;
        pm.b bVar = this.c;
        if (!z) {
            if (!action.equals(d.a)) {
                if (!action.equals(c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                l();
                return;
            }
            p1 p1Var = bVar.d;
            if (!((l) p1Var.getValue()).g || ((l) p1Var.getValue()).h || this.j) {
                return;
            }
            this.j = true;
            i(l.a((l) p1Var.getValue(), null, 0, 0, false, true, false, false, null, 895));
            ta.c0.M(u0.i(this), (k00.i) null, new m(this, cVar, 1), new n(this, cVar, 2), new o(this, cVar, 0), 19);
            return;
        }
        String str = ((b) action).a;
        p1 p1Var2 = bVar.d;
        if (((l) p1Var2.getValue()).j) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String strH1 = r30.k.h1(6, sb.toString());
        i(l.a((l) p1Var2.getValue(), strH1, 0, 0, false, false, false, false, null, 1019));
        if (strH1.length() != 6 || ((l) p1Var2.getValue()).h || ((l) p1Var2.getValue()).i || ((l) p1Var2.getValue()).j) {
            return;
        }
        l lVar = (l) p1Var2.getValue();
        int i2 = 0;
        ta.c0.M(u0.i(this), (k00.i) null, new m(this, cVar, i2), new n(this, cVar, i2), new pz.k(this, lVar, strH1, (k00.c) null), 19);
    }

    public final void l() {
        if (this.k || !((l) this.c.d.getValue()).j) {
            return;
        }
        this.k = true;
        u1 u1Var = this.i;
        if (u1Var != null) {
            u1Var.i(null);
        }
        if (!this.l) {
            this.l = true;
            this.g.b(sy.a.a, "ACCOUNT_DELETED_NAVIGATION_KEY");
        }
        a0.A0(this, f.a);
    }

    public final void m() {
        u1 u1Var = this.h;
        k00.c cVar = null;
        if (u1Var != null) {
            u1Var.i(null);
        }
        this.h = ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new x(this, cVar, 5), 31);
    }
}

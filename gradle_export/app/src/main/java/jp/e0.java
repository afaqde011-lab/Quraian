package jp;

import a40.u1;
import android.os.SystemClock;
import androidx.lifecycle.u0;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.core.domain.exception.AuthException;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import com.revenuecat.purchases.common.HTTPClient;
import d40.p1;
import d6.d1;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;

public final class e0 extends vm.a implements t50.a {
    public final pm.c d;
    public final wo.b0 e;
    public final AuthAnalytics f;
    public final e60.a g;
    public final kp.b h;
    public u1 i;
    public u1 j;
    public boolean k;
    public boolean l;
    public long m;
    public final LinkedHashSet n;

    public e0(pm.c cVar, wo.b0 b0Var, hp.b bVar, AuthAnalytics authAnalytics) {
        super(new x(null, null, null, null, null, null, 1073741823));
        this.d = cVar;
        this.e = b0Var;
        this.f = authAnalytics;
        s50.a aVarC = t50.a.c();
        String name = e0.class.getName();
        kotlin.jvm.internal.b0 b0Var2 = kotlin.jvm.internal.a0.a;
        e60.a aVarC2 = aVarC.c(name, new b60.c(b0Var2.b(e0.class)));
        this.g = aVarC2;
        k00.c cVar2 = null;
        this.h = (kp.b) aVarC2.f(b0Var2.b(kp.b.class), null, null);
        this.n = new LinkedHashSet();
        Object value = bVar.b.A.getValue();
        dp.d dVar = value instanceof dp.d ? (dp.d) value : null;
        if (dVar != null) {
            v30.a aVarC3 = v30.g.B.c(h00.n.k0(new kp.a[]{kp.a.E}));
            String str = dVar.d;
            i(new x(aVarC3, str, r(str), dVar.a, dVar.b, dVar.c, 131071997));
        }
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new a0(this, cVar2, 2), 31);
    }

    public static final void j(e0 e0Var) {
        u1 u1Var = e0Var.j;
        k00.c cVar = null;
        if (u1Var != null) {
            u1Var.i(null);
        }
        e0Var.j = ta.c0.M(u0.i(e0Var), (k00.i) null, (u00.n) null, (u00.k) null, new a0(e0Var, cVar, 6), 31);
    }

    public static final void k(e0 e0Var) {
        u1 u1Var = e0Var.i;
        k00.c cVar = null;
        if (u1Var != null) {
            u1Var.i(null);
        }
        e0Var.i = ta.c0.M(u0.i(e0Var), (k00.i) null, (u00.n) null, (u00.k) null, new ev.x(e0Var, cVar, 3), 31);
    }

    public final void g() {
        e60.a aVar = this.g;
        aVar.getClass();
        a1.z zVar = new a1.z(aVar, 24);
        synchronized (aVar) {
            zVar.invoke();
        }
    }

    public final void l(t action) {
        kotlin.jvm.internal.m.e(action, "action");
        if (action instanceof j) {
            q(((j) action).a);
            return;
        }
        if (action instanceof h) {
            q("");
            return;
        }
        boolean z = action instanceof i;
        kp.b bVar = this.h;
        k00.c cVar = null;
        pm.b bVar2 = this.c;
        if (z) {
            if (this.l) {
                return;
            }
            if (h00.q.O0(bVar.a(), ((x) bVar2.d.getValue()).b) == kp.a.A) {
                p1 p1Var = bVar2.d;
                if (((x) p1Var.getValue()).d != null || r30.k.L0(((x) p1Var.getValue()).c) || ((x) p1Var.getValue()).a) {
                    return;
                }
                this.l = true;
                ta.c0.M(u0.i(this), (k00.i) null, new c0(this, cVar, 1), new z(this, null, 2), new a0(this, cVar, 3), 19);
                return;
            }
            return;
        }
        if (action instanceof o) {
            i(x.b((x) bVar2.d.getValue(), false, null, null, null, null, ((o) action).a, null, null, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, null, 0, null, null, false, 1073741727));
            return;
        }
        if (action instanceof p) {
            String str = ((x) bVar2.d.getValue()).f;
            if (r30.k.L0(str) || ((x) bVar2.d.getValue()).a) {
                return;
            }
            ta.c0.M(u0.i(this), (k00.i) null, new c0(this, cVar, 3), new z(this, null, 4), new d0(this, str, cVar, 0), 19);
            return;
        }
        if (action instanceof k) {
            if (((x) bVar2.d.getValue()).a) {
                return;
            }
            ta.c0.M(u0.i(this), (k00.i) null, new c0(this, cVar, 2), new z(this, null, 3), new a0(this, cVar, 4), 19);
            return;
        }
        if (action instanceof c) {
            String str2 = ((c) action).a;
            p1 p1Var2 = bVar2.d;
            if (((x) p1Var2.getValue()).p) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int length = str2.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str2.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            String strH1 = r30.k.h1(6, sb.toString());
            i(x.b((x) p1Var2.getValue(), false, null, null, null, null, null, null, strH1, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, null, 0, null, null, false, 1073676159));
            if (strH1.length() != 6 || ((x) p1Var2.getValue()).a || ((x) p1Var2.getValue()).o || ((x) p1Var2.getValue()).p) {
                return;
            }
            ta.c0.M(u0.i(this), (k00.i) null, new c0(this, cVar, 6), new z(this, null, 7), new d0(this, strH1, cVar, 1), 19);
            return;
        }
        if (action instanceof q) {
            p1 p1Var3 = bVar2.d;
            if (!((x) p1Var3.getValue()).n || ((x) p1Var3.getValue()).a || this.k) {
                return;
            }
            this.k = true;
            i(x.b((x) p1Var3.getValue(), true, null, null, null, null, null, null, null, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, null, 0, null, null, false, 1073676286));
            ta.c0.M(u0.i(this), (k00.i) null, new c0(this, cVar, 4), new z(this, null, 5), new a0(this, cVar, 5), 19);
            return;
        }
        if (action instanceof d) {
            if (((x) bVar2.d.getValue()).p) {
                m();
                return;
            }
            return;
        }
        if (action instanceof n) {
            i(x.b((x) bVar2.d.getValue(), false, null, null, null, null, null, null, null, null, null, false, 0, 0, false, false, false, null, ((n) action).a, null, null, null, null, null, 0, null, null, false, 1073086463));
            return;
        }
        if (action instanceof m) {
            i(x.b((x) bVar2.d.getValue(), false, null, null, null, null, null, null, null, null, null, false, 0, 0, false, false, false, null, null, ((m) action).a, null, null, null, null, 0, null, null, false, 1072955391));
            return;
        }
        if (action instanceof f) {
            x xVar = (x) bVar2.d.getValue();
            Map mapC = xVar.c();
            String str3 = xVar.s;
            String str4 = xVar.r;
            Collection collectionG = ((h00.g) mapC).g();
            if (!collectionG.isEmpty()) {
                Iterator it = collectionG.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                        return;
                    }
                }
            }
            if (z3.E(str4) || r30.k.L0(str3) || !str4.equals(str3) || xVar.a) {
                return;
            }
            p(kp.a.E);
            return;
        }
        if (action instanceof r) {
            x xVar2 = (x) bVar2.d.getValue();
            Map mapC2 = xVar2.c();
            String str5 = xVar2.s;
            String str6 = xVar2.r;
            Collection collectionG2 = ((h00.g) mapC2).g();
            if (!collectionG2.isEmpty()) {
                Iterator it2 = collectionG2.iterator();
                while (it2.hasNext()) {
                    if (!((Boolean) it2.next()).booleanValue()) {
                        return;
                    }
                }
            }
            if (z3.E(str6) || r30.k.L0(str5) || !str6.equals(str5) || xVar2.a) {
                return;
            }
            ta.c0.M(u0.i(this), (k00.i) null, new c0(this, cVar, 5), new z(this, null, 6), new g6.a(this, xVar2, (k00.c) null, 12), 19);
            return;
        }
        if (action instanceof l) {
            String str7 = ((l) action).a;
            i(x.b((x) bVar2.d.getValue(), false, null, null, null, null, null, null, null, null, null, false, 0, 0, false, false, false, null, null, null, null, str7, r(str7), null, 0, null, null, false, 1066401791));
            return;
        }
        if (action instanceof s) {
            i(x.b((x) bVar2.d.getValue(), false, null, null, null, null, null, null, null, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, null, 0, ((s) action).a, null, false, 1052770303));
            return;
        }
        if (action instanceof b) {
            i(x.b((x) bVar2.d.getValue(), false, null, null, null, null, null, null, null, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, null, 0, null, ((b) action).a, false, 1035993087));
            return;
        }
        if (action instanceof g) {
            i(x.b((x) bVar2.d.getValue(), false, null, null, null, null, null, null, null, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, null, 0, null, null, ((g) action).a, 1006632959));
            return;
        }
        if (action instanceof e) {
            x xVar3 = (x) bVar2.d.getValue();
            ep.f fVar = xVar3.y;
            LocalDate localDate = xVar3.z;
            if (r30.k.L0(xVar3.u) || xVar3.v != null || fVar == null || localDate == null || xVar3.a) {
                return;
            }
            ta.c0.M(u0.i(this), (k00.i) null, new c0(this, cVar, 0), new z(this, null, 1), new d1(this, xVar3, fVar, localDate, (k00.c) null), 19);
            return;
        }
        if (!(action instanceof a)) {
            throw new NoWhenBranchMatchedException();
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        p1 p1Var4 = bVar2.d;
        if (((x) p1Var4.getValue()).a || jElapsedRealtime < this.m) {
            return;
        }
        this.m = jElapsedRealtime + 350;
        u30.b bVar3 = ((x) p1Var4.getValue()).b;
        kp.a aVar = (kp.a) h00.q.O0(bVar.a(), bVar3);
        int i2 = aVar == null ? -1 : y.a[aVar.ordinal()];
        u uVar = u.a;
        switch (i2) {
            case HTTPClient.NO_STATUS_CODE:
            case 1:
                ab.a0.A0(this, uVar);
                return;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 2:
                i(((x) p1Var4.getValue()).a(aVar));
                bVar.b(bVar3.indexOf(kp.a.A));
                return;
            case 3:
                u1 u1Var = this.j;
                if (u1Var != null) {
                    u1Var.i(null);
                }
                this.j = null;
                u1 u1Var2 = this.i;
                if (u1Var2 != null) {
                    u1Var2.i(null);
                }
                this.i = null;
                kp.a aVar2 = ((x) p1Var4.getValue()).k ? kp.a.B : kp.a.A;
                i(((x) p1Var4.getValue()).a(aVar));
                bVar.b(bVar3.indexOf(aVar2));
                return;
            case 4:
                i(x.b((x) p1Var4.getValue(), false, null, null, null, null, null, null, null, null, null, false, 0, 0, false, false, false, null, "", "", null, null, null, null, 0, null, null, false, 1072824319));
                p(kp.a.C);
                return;
            case 5:
                if (((x) p1Var4.getValue()).B != null) {
                    ab.a0.A0(this, uVar);
                    return;
                } else {
                    i(((x) p1Var4.getValue()).a(aVar));
                    bVar.b(bVar3.indexOf(kp.a.D));
                    return;
                }
            case 6:
                u1 u1Var3 = this.i;
                if (u1Var3 != null) {
                    u1Var3.i(null);
                }
                this.i = null;
                i(((x) p1Var4.getValue()).a(aVar));
                bVar.b(bVar3.indexOf(kp.a.B));
                return;
        }
    }

    public final void m() {
        u1 u1Var = this.j;
        if (u1Var != null) {
            u1Var.i(null);
        }
        this.j = null;
        pm.b bVar = this.c;
        if (h00.q.O0(this.h.a(), ((x) bVar.d.getValue()).b) != kp.a.C) {
            return;
        }
        p(((x) bVar.d.getValue()).k ? kp.a.F : kp.a.D);
    }

    public final void n(Throwable th) {
        k00.c cVar = null;
        if (th != null) {
            o(th);
        } else {
            o(new AuthException(null, "otp_invalid", this.d.a(2131886199, new Object[0])));
        }
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, new z(this, null, 0), new a0(this, cVar, 0), 23);
    }

    public final void o(Throwable th) {
        boolean z = ((x) this.c.d.getValue()).k;
        AuthAnalytics authAnalytics = this.f;
        if (z) {
            authAnalytics.passwordResetFailed(th);
        } else {
            authAnalytics.signUpFailed("email", th);
        }
    }

    public final void p(kp.a aVar) {
        int iIndexOf = ((x) this.c.d.getValue()).b.indexOf(aVar);
        if (iIndexOf >= 0) {
            this.h.b(iIndexOf);
        }
    }

    public final void q(String str) {
        String str2;
        String strA;
        if (!r30.k.L0(str)) {
            Pattern patternCompile = Pattern.compile("^[A-Za-z0-9](?:[A-Za-z0-9._%+\\-]{0,62}[A-Za-z0-9])?@(?:[A-Za-z0-9](?:[A-Za-z0-9\\-]{0,61}[A-Za-z0-9])?\\.)+[A-Za-z]{2,}$");
            kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
            str2 = str;
            if (!patternCompile.matcher(str2).matches()) {
                strA = this.d.a(2131886165, new Object[0]);
            }
            i(x.b((x) this.c.d.getValue(), false, null, str2, strA, null, null, null, null, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, null, 0, null, null, false, 1073741795));
        }
        str2 = str;
        strA = null;
        i(x.b((x) this.c.d.getValue(), false, null, str2, strA, null, null, null, null, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, null, 0, null, null, false, 1073741795));
    }

    public final String r(String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        pm.c cVar = this.d;
        if (length < 2) {
            return cVar.a(2131886192, new Object[0]);
        }
        if (str.length() > 30) {
            return cVar.a(2131886191, new Object[0]);
        }
        if (r30.k.Y0(str, ' ') || r30.k.D0(str, ' ')) {
            return cVar.a(2131886194, new Object[0]);
        }
        Pattern patternCompile = Pattern.compile("^[A-Za-z!.,_'-]+$");
        kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
        if (patternCompile.matcher(str).matches()) {
            return null;
        }
        return cVar.a(2131886193, new Object[0]);
    }
}

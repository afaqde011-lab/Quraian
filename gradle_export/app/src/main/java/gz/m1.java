package gz;

import android.app.LocaleManager;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalyticsSource;
import com.mchutov.quranify.auth.presentation.screen.root.AuthRootLauncher;
import com.mchutov.quranify.settings.presentation.analytics.SettingsAnalytics;
import com.mchutov.quranify.settings.presentation.analytics.SettingsEvent;
import com.mchutov.quranify.settings.presentation.screen.main.SettingsEffect$OpenChangePasswordScreen;
import com.mchutov.quranify.settings.presentation.screen.main.SettingsEffect$OpenDebugControlsScreen;
import com.mchutov.quranify.settings.presentation.screen.main.SettingsEffect$OpenDevicesScreen;
import com.mchutov.quranify.settings.presentation.screen.main.SettingsEffect$OpenDownloadManagerScreen;
import com.mchutov.quranify.settings.presentation.screen.main.SettingsEffect$OpenEditDetailsScreen;
import com.mchutov.quranify.settings.presentation.screen.main.SettingsEffect$OpenManageSubscriptionScreen;
import com.mchutov.quranify.settings.presentation.screen.main.SettingsEffect$OpenNotificationScreen;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.EntitlementInfo;
import d40.p1;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import ri.t1;

public final class m1 extends vm.a {
    public final pm.c d;
    public final LocaleManager e;
    public final SettingsAnalytics f;
    public final aq.a g;
    public final vp.x h;
    public final ly.d i;
    public final hr.b j;
    public final a00.a k;
    public final b00.c l;
    public final er.a m;
    public final wo.b0 n;
    public final wo.c0 o;
    public final bp.g p;
    public final hp.b q;
    public final AuthAnalytics r;

    public m1(pm.c cVar, LocaleManager localeManager, SettingsAnalytics settingsAnalytics, aq.a aVar, vp.x xVar, ly.d dVar, hr.b bVar, a00.a aVar2, b00.c cVar2, er.a aVar3, wo.b0 b0Var, wo.c0 c0Var, bp.g gVar, hp.b bVar2, AuthAnalytics authAnalytics) {
        super(new g1("Quranify", "2.4.1", false, null, false, false, false, false, zz.b.HD, false, false, false, false, false, false, null, false, false, false, false, false, false, false, "", "", false, false, ""));
        this.d = cVar;
        this.e = localeManager;
        this.f = settingsAnalytics;
        this.g = aVar;
        this.h = xVar;
        this.i = dVar;
        this.j = bVar;
        this.k = aVar2;
        this.l = cVar2;
        this.m = aVar3;
        this.n = b0Var;
        this.o = c0Var;
        this.p = gVar;
        this.q = bVar2;
        this.r = authAnalytics;
        settingsAnalytics.logEvent(SettingsEvent.SettingsOpened.INSTANCE);
        k00.c cVar3 = null;
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new j1(this, cVar3, 1), 31);
        r();
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new j1(this, cVar3, 0), 31);
        i(g1.a((g1) this.c.d.getValue(), false, null, false, false, false, false, ((uz.f) aVar2).h(), false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 268435199));
    }

    public static final void j(m1 m1Var, ep.p pVar, String str) {
        m1Var.n();
        if (pVar instanceof ep.n) {
            m1Var.r.signInCompleted(str);
            ab.a0.A0(m1Var, new s0(m1Var.d.a(2131886222, new Object[0])));
        } else {
            if (!(pVar instanceof ep.o)) {
                throw new NoWhenBranchMatchedException();
            }
            ep.o oVar = (ep.o) pVar;
            m1Var.q.b(oVar.a, oVar.b, oVar.d, AuthAnalyticsSource.SETTINGS, oVar.c);
        }
    }

    public static final void k(m1 m1Var) {
        m1Var.i(g1.a((g1) m1Var.c.d.getValue(), false, null, false, false, false, false, null, false, false, true, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 268433407));
    }

    public final void l(m0 action) {
        EntitlementInfo entitlementInfoS;
        kotlin.jvm.internal.m.e(action, "action");
        boolean z = action instanceof g0;
        aq.a aVar = this.g;
        int i = 1;
        pm.b bVar = this.c;
        if (z) {
            String str = ((g0) action).a;
            int iHashCode = str.hashCode();
            SettingsAnalytics settingsAnalytics = this.f;
            switch (iHashCode) {
                case -2147332318:
                    if (str.equals("debug_controls")) {
                        ab.a0.A0(this, SettingsEffect$OpenDebugControlsScreen.INSTANCE);
                        return;
                    }
                    return;
                case -1816720896:
                    if (str.equals("term_of_service")) {
                        ab.a0.A0(this, new p0("https://play.google.com/intl/en-US_us/about/play-terms/index.html"));
                        return;
                    }
                    return;
                case -1803127050:
                    if (str.equals("download_manager")) {
                        ab.a0.A0(this, SettingsEffect$OpenDownloadManagerScreen.INSTANCE);
                        return;
                    }
                    return;
                case -1617047237:
                    if (str.equals("video_quality")) {
                        i(g1.a((g1) bVar.d.getValue(), false, null, false, false, false, true, ((uz.f) this.k).h(), false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 268435071));
                        return;
                    }
                    return;
                case -1613589672:
                    if (str.equals("language")) {
                        settingsAnalytics.logEvent(SettingsEvent.LanguageSettingsClicked.INSTANCE);
                        ab.a0.A0(this, o0.a);
                        return;
                    }
                    return;
                case -1480249367:
                    if (str.equals("community")) {
                        ab.a0.A0(this, new p0(q() ? "https://t.me/quranify_app" : "https://chat.whatsapp.com/CUXzHu484Br5dH0bTYCu3k"));
                        return;
                    }
                    return;
                case -934889060:
                    if (str.equals("redeem")) {
                        i(g1.a((g1) bVar.d.getValue(), false, null, false, false, false, false, null, false, true, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 268432383));
                        return;
                    }
                    return;
                case -391572154:
                    if (str.equals("request_feature")) {
                        settingsAnalytics.logEvent(SettingsEvent.FeatureRequestClicked.INSTANCE);
                        p(str);
                        return;
                    }
                    return;
                case -241938834:
                    if (str.equals("get_premium")) {
                        ((bq.a) aVar).f(true, zp.b.SETTINGS);
                        return;
                    }
                    return;
                case 139877149:
                    if (str.equals("contact_us")) {
                        p(str);
                        return;
                    }
                    return;
                case 307986138:
                    if (str.equals("premium_status")) {
                        ab.a0.A0(this, SettingsEffect$OpenManageSubscriptionScreen.INSTANCE);
                        return;
                    }
                    return;
                case 473168453:
                    if (str.equals("collaboration")) {
                        i(g1.a((g1) bVar.d.getValue(), false, null, false, false, false, false, null, false, false, false, true, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 268431359));
                        return;
                    }
                    return;
                case 595233003:
                    if (str.equals("notification")) {
                        ab.a0.A0(this, SettingsEffect$OpenNotificationScreen.INSTANCE);
                        return;
                    }
                    return;
                case 765906412:
                    if (str.equals("follow_us")) {
                        i(g1.a((g1) bVar.d.getValue(), false, null, true, false, false, false, null, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 268435439));
                        return;
                    }
                    return;
                case 926873033:
                    if (str.equals("privacy_policy")) {
                        ab.a0.A0(this, new p0("https://www.freeprivacypolicy.com/live/f4411ff9-69da-46b1-a5f8-bd695c67ceb1"));
                        return;
                    }
                    return;
                case 983464541:
                    if (str.equals("rate_us")) {
                        ab.a0.A0(this, new p0("https://play.google.com/store/apps/details?id=com.mchutov.Quranify"));
                        return;
                    }
                    return;
                case 1348096994:
                    if (str.equals("referral_program")) {
                        s();
                        return;
                    }
                    return;
                case 1931692265:
                    if (str.equals("report_bug")) {
                        settingsAnalytics.logEvent(SettingsEvent.BugReportClicked.INSTANCE);
                        p(str);
                        return;
                    }
                    return;
                case 1934197157:
                    if (str.equals("what_new")) {
                        i(g1.a((g1) bVar.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, true, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 268427263));
                        return;
                    }
                    return;
                case 1978911625:
                    if (str.equals("free_membership")) {
                        s();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        if (action instanceof q) {
            i(g1.a((g1) bVar.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 268435439));
            return;
        }
        if (action instanceof r) {
            i(g1.a((g1) bVar.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 268435391));
            return;
        }
        if (action instanceof z) {
            ((bq.a) aVar).f(true, zp.b.SETTINGS);
            return;
        }
        boolean z2 = action instanceof b;
        AuthAnalytics authAnalytics = this.r;
        if (z2) {
            authAnalytics.authorizationTapped(AuthAnalyticsSource.SETTINGS);
            i(g1.a((g1) bVar.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, true, null, false, false, false, false, false, false, false, null, null, false, false, null, 268419071));
            return;
        }
        if (action instanceof a0) {
            i(g1.a((g1) bVar.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, null, true, false, false, false, false, false, false, null, null, false, false, null, 268369919));
            return;
        }
        if (action instanceof i) {
            m();
            ab.a0.A0(this, SettingsEffect$OpenDevicesScreen.INSTANCE);
            return;
        }
        if (action instanceof k) {
            authAnalytics.authorizationDismissed(AuthAnalyticsSource.SETTINGS);
            n();
            return;
        }
        if (action instanceof c) {
            i(g1.a((g1) bVar.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, true, null, false, false, false, false, false, false, false, null, null, false, false, null, 268386303));
            return;
        }
        if (action instanceof g) {
            n();
            return;
        }
        if (action instanceof j) {
            m();
            return;
        }
        if (action instanceof h0) {
            i(g1.a((g1) bVar.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, null, false, false, false, true, false, false, false, null, null, false, false, null, 267845631));
            return;
        }
        if (action instanceof t) {
            if (((g1) bVar.d.getValue()).u) {
                return;
            }
            i(g1.a((g1) bVar.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 267911167));
            return;
        }
        int i2 = 0;
        int i3 = 2;
        String str2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        if (action instanceof h) {
            if (((g1) bVar.d.getValue()).u) {
                return;
            }
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, new l1(this, null, 0), new j1(this, objArr9 == true ? 1 : 0, i3), 23);
            return;
        }
        if (action instanceof v) {
            m();
            i(g1.a((g1) bVar.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, null, false, true, false, false, false, false, false, null, null, false, false, null, 268304383));
            ab.a0.A0(this, SettingsEffect$OpenEditDetailsScreen.INSTANCE);
            return;
        }
        if (action instanceof p) {
            i(g1.a((g1) bVar.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 268304383));
            r();
            return;
        }
        if (action instanceof f) {
            m();
            i(g1.a((g1) bVar.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, null, false, false, true, false, false, false, false, null, null, false, false, null, 268173311));
            ab.a0.A0(this, SettingsEffect$OpenChangePasswordScreen.INSTANCE);
            return;
        }
        if (action instanceof n) {
            i(g1.a((g1) bVar.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 268173311));
            r();
            return;
        }
        if (action instanceof f0) {
            r();
            return;
        }
        int i4 = 3;
        if (action instanceof e0) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, new l1(this, null, 2), new j1(this, objArr8 == true ? 1 : 0, i4), 23);
            return;
        }
        if (action instanceof d) {
            ep.e eVar = ((d) action).a;
            authAnalytics.authProviderSelected(eVar);
            int iOrdinal = eVar.ordinal();
            if (iOrdinal == 0) {
                n();
                ab.a0.A0(this, t0.a);
                return;
            } else if (iOrdinal == 1) {
                n();
                ab.a0.A0(this, u0.a);
                return;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i(g1.a((g1) bVar.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, new AuthRootLauncher(eVar), false, false, false, false, false, false, false, null, null, false, false, null, 268386303));
                return;
            }
        }
        if (action instanceof w) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, new c1(this, objArr7 == true ? 1 : 0, i4), (u00.k) null, new ev.p(this, ((w) action).a, objArr6 == true ? 1 : 0, 7), 27);
            return;
        }
        if (action instanceof a) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, new c1(this, objArr5 == true ? 1 : 0, i3), (u00.k) null, new ev.p(this, ((a) action).a, objArr4 == true ? 1 : 0, 6), 27);
            return;
        }
        if (action instanceof x) {
            ab.a0.A0(this, new p0("https://www.instagram.com/quranifycom/"));
            return;
        }
        if (action instanceof k0) {
            ab.a0.A0(this, new p0("https://x.com/quranifyapp"));
            return;
        }
        if (action instanceof j0) {
            ab.a0.A0(this, new p0("https://www.tiktok.com/@quranify.app"));
            return;
        }
        if (action instanceof d0) {
            ab.a0.A0(this, new p0("https://www.reddit.com/r/Quranify/"));
            return;
        }
        if (action instanceof s) {
            o();
            return;
        }
        if (action instanceof b0) {
            if (((g1) bVar.d.getValue()).l) {
                i(g1.a((g1) bVar.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 268433407));
                return;
            }
            return;
        }
        if (action instanceof i0) {
            String string = r30.k.j1(((i0) action).a).toString();
            if (string.length() == 0) {
                return;
            }
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, new i1(this, null, 1), new l1(this, null, 1), new h1(this, string, objArr3 == true ? 1 : 0, i), 19);
            return;
        }
        if (action instanceof u) {
            i(g1.a((g1) bVar.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 268435327));
            return;
        }
        if (action instanceof l0) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new g6.a(this, ((l0) action).a, (k00.c) null, 3), 31);
            return;
        }
        if (action instanceof c0) {
            c0 c0Var = (c0) action;
            String str3 = c0Var.a;
            if (c0Var.b) {
                ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, new ev.p(this, str3, objArr2 == true ? 1 : 0, 5), (u00.k) null, new h1(this, str3, objArr == true ? 1 : 0, i2), 27);
                return;
            }
            return;
        }
        if (action instanceof o) {
            i(g1.a((g1) bVar.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 268431359));
            return;
        }
        if (action instanceof m) {
            er.a aVar2 = this.m;
            aVar2.getClass();
            Set set = sr.a.a;
            sr.a.a(aVar2.a);
            i(g1.a((g1) bVar.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 268427263));
            return;
        }
        if (action instanceof e) {
            if (q()) {
                ab.a0.A0(this, r0.a);
                return;
            } else {
                pm.c cVar = this.d;
                ab.a0.A0(this, new q0(cVar.a(2131886326, new Object[0]), cVar.a(2131887136, new Object[0])));
                return;
            }
        }
        if (!(action instanceof y)) {
            if (!(action instanceof l)) {
                throw new NoWhenBranchMatchedException();
            }
            i(g1.a((g1) bVar.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 201326591));
            return;
        }
        if (!(((y) action).a instanceof sy.a) || (entitlementInfoS = vp.x.s((CustomerInfo) this.h.c.A.getValue())) == null) {
            return;
        }
        if (!entitlementInfoS.getIsActive() || !entitlementInfoS.getWillRenew()) {
            entitlementInfoS = null;
        }
        if (entitlementInfoS != null) {
            g1 g1Var = (g1) bVar.d.getValue();
            Date expirationDate = entitlementInfoS.getExpirationDate();
            if (expirationDate != null) {
                str2 = expirationDate.toInstant().atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.getDefault()));
                kotlin.jvm.internal.m.d(str2, "format(...)");
            }
            if (str2 == null) {
                str2 = "";
            }
            i(g1.a(g1Var, false, null, false, false, false, false, null, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, true, str2, 67108863));
        }
    }

    public final void m() {
        i(g1.a((g1) this.c.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 268369919));
    }

    public final void n() {
        i(g1.a((g1) this.c.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 268386303));
        r();
    }

    public final void o() {
        i(g1.a((g1) this.c.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 268431871));
    }

    public final void p(String str) {
        int i;
        String str2;
        boolean zQ = q();
        int iHashCode = str.hashCode();
        if (iHashCode != -391572154) {
            if (iHashCode != 139877149) {
                if (iHashCode != 1931692265 || !str.equals("report_bug")) {
                    return;
                } else {
                    i = 2131887189;
                }
            } else if (!str.equals("contact_us")) {
                return;
            } else {
                i = 2131886365;
            }
        } else if (!str.equals("request_feature")) {
            return;
        } else {
            i = 2131887190;
        }
        int iHashCode2 = str.hashCode();
        if (iHashCode2 != -391572154) {
            if (iHashCode2 != 139877149) {
                if (iHashCode2 != 1931692265 || !str.equals("report_bug")) {
                    return;
                } else {
                    str2 = "Quranify Report Bug (Android)";
                }
            } else if (!str.equals("contact_us")) {
                return;
            } else {
                str2 = "Quranify Support (Android)";
            }
        } else if (!str.equals("request_feature")) {
            return;
        } else {
            str2 = "Quranify Request Feature (Android)";
        }
        if (zQ) {
            ab.a0.A0(this, r0.a);
        } else {
            ab.a0.A0(this, new q0(str2, this.d.a(i, new Object[0])));
        }
    }

    public final boolean q() {
        LocaleManager localeManager = this.e;
        Locale locale = !localeManager.getApplicationLocales().isEmpty() ? localeManager.getApplicationLocales().get(0) : null;
        String country = locale != null ? locale.getCountry() : null;
        if (country == null) {
            country = "";
        }
        if (country.length() == 0) {
            country = Locale.getDefault().getCountry();
        }
        Set set = n1.a;
        kotlin.jvm.internal.m.b(country);
        String upperCase = country.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
        return set.contains(upperCase);
    }

    public final void r() {
        String str;
        boolean z;
        String strA;
        String str2;
        Object objS;
        wo.c0 c0Var = this.o;
        ep.g session = c0Var.a.getSession();
        ep.h hVar = session != null ? session.e : null;
        boolean z2 = session != null && c0Var.a.isAuthorized();
        pm.b bVar = this.c;
        p1 p1Var = bVar.d;
        p1 p1Var2 = bVar.d;
        boolean z3 = ((g1) p1Var.getValue()).v && !z2;
        g1 g1Var = (g1) p1Var2.getValue();
        boolean z4 = z3 ? false : ((g1) p1Var2.getValue()).q;
        boolean z5 = z3 ? false : ((g1) p1Var2.getValue()).r;
        boolean z6 = z3 ? false : ((g1) p1Var2.getValue()).s;
        boolean z7 = z3 ? false : ((g1) p1Var2.getValue()).t;
        String strR0 = "";
        if (!z2 || hVar == null) {
            str = "";
        } else {
            String str3 = hVar.d;
            if (r30.k.L0(str3)) {
                str3 = hVar.b;
            }
            str = str3;
        }
        if (z2 && hVar != null) {
            String lowerCase = hVar.e.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            int iHashCode = lowerCase.hashCode();
            pm.c cVar = this.d;
            if (iHashCode != -1278174388) {
                if (iHashCode != 3343885) {
                    if (iHashCode == 106069776 && lowerCase.equals("other")) {
                        strA = cVar.a(2131886220, new Object[0]);
                        str2 = strA;
                    } else {
                        str2 = "";
                    }
                } else if (lowerCase.equals("male")) {
                    strA = cVar.a(2131886219, new Object[0]);
                    str2 = strA;
                } else {
                    str2 = "";
                }
            } else if (lowerCase.equals("female")) {
                strA = cVar.a(2131886218, new Object[0]);
                str2 = strA;
            } else {
                str2 = "";
            }
            String str4 = hVar.b;
            String str5 = hVar.f;
            String str6 = strR0;
            if (!r30.k.L0(str5)) {
                try {
                    objS = String.valueOf(Period.between(LocalDate.parse(str5, DateTimeFormatter.ofPattern("yyyy-MM-dd")), LocalDate.now()).getYears());
                } catch (Throwable th) {
                    objS = t1.s(th);
                }
                Object obj = strR0;
                if (!(objS instanceof g00.m)) {
                    obj = objS;
                }
                str6 = (String) obj;
            }
            List listS = va.a.S(new String[]{str4, str2, str6});
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listS) {
                if (!r30.k.L0((String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            strR0 = h00.q.R0(arrayList, " · ", null, null, null, 62);
        }
        String str7 = strR0;
        if (z2) {
            List list = hVar != null ? hVar.g : null;
            if (list == null) {
                list = h00.x.A;
            }
            if (list.isEmpty()) {
                z = false;
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (r30.r.q0((String) it.next(), "email")) {
                        z = true;
                    }
                }
                z = false;
            }
        } else {
            z = false;
        }
        i(g1.a(g1Var, false, null, false, q(), false, false, null, false, false, false, false, false, false, null, z4, z5, z6, z7, false, z2, false, str, str7, z, false, null, 206634975));
    }

    public final void s() {
        i(g1.a((g1) this.c.d.getValue(), false, null, false, false, true, false, null, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 268435391));
    }
}

package du;

import a1.r1;
import android.app.LocaleManager;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.ConnectivityManager;
import android.os.LocaleList;
import android.view.WindowManager;
import androidx.lifecycle.u0;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalyticsSource;
import com.mchutov.quranify.main.presentation.analytics.PaywallAnalytics;
import com.mchutov.quranify.main.presentation.screen.main.MainEffect$OpenAppUpdateScreen;
import com.mchutov.quranify.player.presentation.analytics.AudioPlayerAnalytics;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import d0.i2;
import d40.p1;
import gz.n1;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import ri.t1;

public final class t0 extends vm.a {
    public final uu.a d;
    public final b00.c e;
    public final gu.a f;
    public final tx.a g;
    public final a00.a h;
    public final ah.e i;
    public final pm.c j;
    public final LocaleManager k;
    public final tk.d l;
    public final AudioPlayerAnalytics m;
    public final au.a n;
    public final sl.a o;
    public final aq.a p;
    public final vp.x q;
    public final wo.b0 r;
    public final wo.c0 s;
    public final hp.b t;
    public final AuthAnalytics u;
    public final PaywallAnalytics v;
    public final xw.e w;
    public final os.x x;
    public boolean y;

    public t0(uu.a aVar, b00.c cVar, gu.a aVar2, tx.a aVar3, a00.a aVar4, cm.b bVar, ah.e eVar, pm.c cVar2, LocaleManager localeManager, tk.d dVar, AudioPlayerAnalytics audioPlayerAnalytics, au.a aVar5, sl.a aVar6, aq.a aVar7, vp.x xVar, wo.b0 b0Var, wo.c0 c0Var, hp.b bVar2, AuthAnalytics authAnalytics, PaywallAnalytics paywallAnalytics, xw.e eVar2, os.x xVar2) {
        boolean z;
        Object objS;
        boolean z2;
        ep.g session;
        Object objS2;
        boolean z3 = aVar2.a.getBoolean("onboarding_finished_key", false);
        bu.d dVar2 = bu.d.A;
        super(new n0(z3, false, "", true, true, false, false, false, false, false, false, false, null, false, new bu.b(dVar2, null, null, null, null, 126), new bu.b(bu.d.B, null, null, null, null, 126), new bu.b(dVar2, null, null, null, null, 126)));
        this.d = aVar;
        this.e = cVar;
        this.f = aVar2;
        this.g = aVar3;
        this.h = aVar4;
        this.i = eVar;
        this.j = cVar2;
        this.k = localeManager;
        this.l = dVar;
        this.m = audioPlayerAnalytics;
        this.n = aVar5;
        this.o = aVar6;
        this.p = aVar7;
        this.q = xVar;
        this.r = b0Var;
        this.s = c0Var;
        this.t = bVar2;
        this.u = authAnalytics;
        this.v = paywallAnalytics;
        this.w = eVar2;
        this.x = xVar2;
        uu.w wVar = (uu.w) aVar;
        wVar.v.set(false);
        uu.w.m(wVar, !((Boolean) wVar.G.getValue()).booleanValue(), 2);
        WindowManager windowManager = (WindowManager) bVar.a.getSystemService(WindowManager.class);
        if (windowManager == null) {
            z = false;
        } else {
            Rect bounds = windowManager.getMaximumWindowMetrics().getBounds();
            kotlin.jvm.internal.m.d(bounds, "getBounds(...)");
            if (((long) bounds.width()) * ((long) bounds.height()) > 2073600) {
                z = true;
            } else {
                z = false;
            }
        }
        try {
            objS = new MediaCodecList(0).getCodecInfos();
        } catch (Throwable th) {
            objS = t1.s(th);
        }
        k00.c cVar3 = null;
        MediaCodecInfo[] mediaCodecInfoArr = (MediaCodecInfo[]) (objS instanceof g00.m ? null : objS);
        if (mediaCodecInfoArr != null) {
            int length = mediaCodecInfoArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    MediaCodecInfo mediaCodecInfo = mediaCodecInfoArr[i];
                    if (!mediaCodecInfo.isEncoder() && mediaCodecInfo.isHardwareAccelerated()) {
                        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                        kotlin.jvm.internal.m.d(supportedTypes, "getSupportedTypes(...)");
                        int length2 = supportedTypes.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length2) {
                                String str = supportedTypes[i2];
                                if (cm.c.a.contains(str)) {
                                    try {
                                        objS2 = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
                                    } catch (Throwable th2) {
                                        objS2 = t1.s(th2);
                                    }
                                    MediaCodecInfo.VideoCapabilities videoCapabilities = (MediaCodecInfo.VideoCapabilities) (objS2 instanceof g00.m ? null : objS2);
                                    if (videoCapabilities != null && (cm.b.a(videoCapabilities, 3840, 2160) || cm.b.a(videoCapabilities, 2160, 3840))) {
                                        z2 = true;
                                    }
                                }
                                i2++;
                            } else {
                                continue;
                            }
                        }
                    }
                    i++;
                } else {
                    z2 = false;
                }
            }
        } else {
            z2 = false;
        }
        boolean z4 = z && z2;
        a00.a aVar8 = this.h;
        zz.b bVar3 = z4 ? zz.b.FULL : zz.b.HD;
        uz.f fVar = (uz.f) aVar8;
        fVar.getClass();
        SharedPreferences sharedPreferences = fVar.a;
        String string = sharedPreferences.getString("KEY_SELECTED_CATALOG_QUALITY", null);
        if (string == null || string.length() == 0) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("KEY_SELECTED_CATALOG_QUALITY", bVar3.A);
            editorEdit.apply();
        }
        au.a aVar9 = this.n;
        ((ConnectivityManager) aVar9.b.getValue()).registerDefaultNetworkCallback(aVar9);
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new o0(this, cVar3, 3), 31);
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new o0(this, cVar3, 5), 31);
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new o0(this, cVar3, 6), 31);
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new o0(this, cVar3, 1), 31);
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new o0(this, cVar3, 4), 31);
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new o0(this, cVar3, 7), 31);
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new o0(this, cVar3, 8), 31);
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new o0(this, cVar3, 2), 31);
        LocaleManager localeManager2 = this.k;
        if (localeManager2.getApplicationLocales().isEmpty() && r30.r.q0(Locale.getDefault().getLanguage(), "kk")) {
            localeManager2.setApplicationLocales(LocaleList.forLanguageTags("ru"));
        }
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new o0(this, cVar3, 11), 31);
        if (this.s.a.isAuthorized() && (session = this.s.a.getSession()) != null) {
            this.u.setUserProperties(session.e);
        }
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new i2(this, (k00.c) null, 11), 31);
        boolean zBooleanValue = ((Boolean) this.o.b.getValue()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) this.o.c.getValue()).booleanValue();
        Object value = this.o.d.getValue();
        kotlin.jvm.internal.m.d(value, "<get-value>(...)");
        p((String) value, zBooleanValue, zBooleanValue2);
    }

    public static final Integer j(t0 t0Var, Package r6) {
        StoreProduct product;
        SubscriptionOptions subscriptionOptions;
        SubscriptionOption subscriptionOption;
        List<PricingPhase> pricingPhases;
        Object next;
        Period billingPeriod;
        t0Var.getClass();
        if (r6 == null || (product = r6.getProduct()) == null || (subscriptionOptions = product.getSubscriptionOptions()) == null || (subscriptionOption = (SubscriptionOption) h00.q.N0(subscriptionOptions)) == null || (pricingPhases = subscriptionOption.getPricingPhases()) == null) {
            return null;
        }
        Iterator<T> it = pricingPhases.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((PricingPhase) next).getPrice().getAmountMicros() != 0);
        PricingPhase pricingPhase = (PricingPhase) next;
        if (pricingPhase == null || (billingPeriod = pricingPhase.getBillingPeriod()) == null) {
            return null;
        }
        return Integer.valueOf((int) billingPeriod.getValueInDays());
    }

    public static final String k(t0 t0Var, String str, double d) {
        LocaleManager localeManager = t0Var.k;
        Locale locale = !localeManager.getApplicationLocales().isEmpty() ? localeManager.getApplicationLocales().get(0) : Locale.getDefault();
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(Currency.getInstance(str));
        if (kotlin.jvm.internal.m.a(locale.getLanguage(), "ar") && (currencyInstance instanceof DecimalFormat)) {
            DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            decimalFormatSymbols.setZeroDigit('0');
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        }
        String str2 = currencyInstance.format(d);
        kotlin.jvm.internal.m.d(str2, "format(...)");
        return str2;
    }

    public static ArrayList n(String str) {
        List<String> listW0 = r30.k.W0(str, new String[]{".", "-", "_"}, 6);
        ArrayList arrayList = new ArrayList(h00.r.q0(listW0, 10));
        for (String str2 : listW0) {
            StringBuilder sb = new StringBuilder();
            int length = str2.length();
            int iIntValue = 0;
            for (int i = 0; i < length; i++) {
                char cCharAt = str2.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            Integer numY0 = r30.r.y0(sb.toString());
            if (numY0 != null) {
                iIntValue = numY0.intValue();
            }
            arrayList.add(Integer.valueOf(iIntValue));
        }
        return arrayList;
    }

    public final void g() {
        au.a aVar = this.n;
        ((ConnectivityManager) aVar.b.getValue()).registerDefaultNetworkCallback(aVar);
    }

    public final void l(u action) {
        String language;
        os.x xVar = this.x;
        e0 e0Var = e0.a;
        pm.c cVar = this.j;
        LocaleManager localeManager = this.k;
        tx.a aVar = this.g;
        pm.b bVar = this.c;
        kotlin.jvm.internal.m.e(action, "action");
        if (action instanceof a) {
            Locale locale = !localeManager.getApplicationLocales().isEmpty() ? localeManager.getApplicationLocales().get(0) : Locale.getDefault();
            if (locale == null || (language = locale.getLanguage()) == null) {
                language = "en";
            }
            String str = language;
            p1 p1Var = bVar.d;
            i(n0.a((n0) p1Var.getValue(), false, str, false, false, false, false, false, false, false, false, null, false, null, null, null, 131067));
            if (str.equals(((n0) p1Var.getValue()).c)) {
                return;
            }
            if (((n0) p1Var.getValue()).d) {
                i(n0.a((n0) p1Var.getValue(), false, null, false, false, false, false, false, false, false, false, null, false, null, null, null, 131063));
                return;
            } else {
                ((uu.w) this.d).h();
                return;
            }
        }
        if (action instanceof e) {
            ab.a0.A0(this, MainEffect$OpenAppUpdateScreen.INSTANCE);
            return;
        }
        if (action instanceof r) {
            this.y = true;
            i(n0.a((n0) bVar.d.getValue(), false, null, false, false, false, false, false, false, false, false, null, false, null, null, null, 130943));
            ab.a0.A0(this, MainEffect$OpenAppUpdateScreen.INSTANCE);
            return;
        }
        if (action instanceof s) {
            this.y = true;
            i(n0.a((n0) bVar.d.getValue(), false, null, false, false, false, false, false, false, false, false, null, false, null, null, null, 130943));
            return;
        }
        if (action instanceof t) {
            String country = (!localeManager.getApplicationLocales().isEmpty() ? localeManager.getApplicationLocales().get(0) : Locale.getDefault()).getCountry();
            kotlin.jvm.internal.m.d(country, "getCountry(...)");
            String upperCase = country.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
            boolean zContains = n1.a.contains(upperCase);
            String strA = cVar.a(2131886365, new Object[0]);
            if (zContains) {
                ab.a0.A0(this, e0Var);
                return;
            } else {
                ab.a0.A0(this, new d0(strA));
                return;
            }
        }
        if (action instanceof m) {
            ((bq.a) this.p).f(false, zp.b.GENERAL);
            return;
        }
        if (action instanceof n) {
            i(n0.a((n0) bVar.d.getValue(), false, null, false, false, false, false, false, false, false, false, null, false, null, null, ((n) action).a, 65535));
            return;
        }
        if (action instanceof p) {
            ab.a0.A0(this, new b0(((n0) bVar.d.getValue()).q));
            return;
        }
        k00.c cVar2 = null;
        if (action instanceof o) {
            if (((n0) bVar.d.getValue()).j) {
                return;
            }
            i(n0.a((n0) bVar.d.getValue(), false, null, false, false, false, false, false, true, false, false, null, false, null, null, null, 130559));
            ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, new r1(this, (k00.c) null, 4), new o0(this, cVar2, 10), 23);
            return;
        }
        if (action instanceof q) {
            ((bq.a) this.p).f(false, zp.b.GENERAL);
            if (this.s.a.isAuthorized()) {
                ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new o0(this, cVar2, 9), 31);
                return;
            } else {
                o();
                return;
            }
        }
        if (action instanceof l) {
            this.u.authorizationTapped(AuthAnalyticsSource.PREMIUM);
            m();
            hp.b bVar2 = this.t;
            bVar2.c = AuthAnalyticsSource.PREMIUM;
            p1 p1Var2 = bVar2.a;
            dp.c cVar3 = dp.c.a;
            p1Var2.getClass();
            p1Var2.k(null, cVar3);
            return;
        }
        if (action instanceof c) {
            m();
            return;
        }
        if (action instanceof d) {
            p1 p1Var3 = aVar.b;
            Boolean bool = Boolean.FALSE;
            p1Var3.getClass();
            p1Var3.k(null, bool);
            return;
        }
        if (action instanceof j) {
            p1 p1Var4 = aVar.b;
            Boolean bool2 = Boolean.FALSE;
            p1Var4.getClass();
            p1Var4.k(null, bool2);
            oi.k.v(aVar.a, "is_questioner_answered", true);
            aVar.c(1L, "day");
            String country2 = (!localeManager.getApplicationLocales().isEmpty() ? localeManager.getApplicationLocales().get(0) : Locale.getDefault()).getCountry();
            kotlin.jvm.internal.m.d(country2, "getCountry(...)");
            String upperCase2 = country2.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.m.d(upperCase2, "toUpperCase(...)");
            if (n1.a.contains(upperCase2)) {
                ab.a0.A0(this, e0Var);
                return;
            } else {
                ab.a0.A0(this, new d0(cVar.a(2131887136, new Object[0])));
                return;
            }
        }
        if (action instanceof k) {
            p1 p1Var5 = aVar.b;
            Boolean bool3 = Boolean.FALSE;
            p1Var5.getClass();
            p1Var5.k(null, bool3);
            oi.k.v(aVar.a, "is_questioner_answered", true);
            aVar.c(6L, "month");
            aVar.d.f(g00.b0.a);
            return;
        }
        if (action instanceof f) {
            p1 p1Var6 = aVar.b;
            Boolean bool4 = Boolean.FALSE;
            p1Var6.getClass();
            p1Var6.k(null, bool4);
            oi.k.v(aVar.a, "is_questioner_answered", true);
            aVar.c(1L, "day");
            return;
        }
        if (action instanceof i) {
            Object obj = ((i) action).a;
            if (obj instanceof ep.k) {
                i(n0.a((n0) bVar.d.getValue(), false, null, false, false, false, false, false, false, false, false, (ep.k) obj, false, null, null, null, 126975));
                return;
            }
            return;
        }
        if (action instanceof b) {
            i(n0.a((n0) bVar.d.getValue(), false, null, false, false, false, false, false, false, false, false, null, false, null, null, null, 126975));
            return;
        }
        if (action instanceof h) {
            xVar.u = ss.l.A;
            p1 p1Var7 = xVar.v;
            Boolean bool5 = Boolean.FALSE;
            p1Var7.getClass();
            p1Var7.k(null, bool5);
            xVar.u();
            return;
        }
        if (!(action instanceof g)) {
            throw new NoWhenBranchMatchedException();
        }
        xVar.u = ss.l.B;
        p1 p1Var8 = xVar.v;
        Boolean bool6 = Boolean.FALSE;
        p1Var8.getClass();
        p1Var8.k(null, bool6);
        xVar.u();
    }

    public final void m() {
        this.s.c("2.4.1");
        i(n0.a((n0) this.c.d.getValue(), false, null, false, false, false, false, false, false, false, false, null, false, null, null, null, 129023));
    }

    public final void o() {
        this.s.c("2.4.1");
        i(n0.a((n0) this.c.d.getValue(), false, null, false, false, false, false, false, false, false, true, null, false, null, null, null, 127743));
    }

    public final void p(String str, boolean z, boolean z2) {
        Object next;
        boolean z3;
        if (r30.k.L0(str)) {
            z3 = false;
        } else {
            ArrayList arrayListN = n(str);
            ArrayList arrayListN2 = n("2.4.1");
            z00.e eVarI0 = ab.a0.I0(0, Math.max(arrayListN.size(), arrayListN2.size()));
            ArrayList arrayList = new ArrayList(h00.r.q0(eVarI0, 10));
            Iterator it = eVarI0.iterator();
            while (true) {
                z00.d dVar = (z00.d) it;
                if (!dVar.C) {
                    break;
                }
                int iNextInt = dVar.nextInt();
                arrayList.add(Integer.valueOf(kotlin.jvm.internal.m.f(((Number) ((iNextInt < 0 || iNextInt >= arrayListN.size()) ? 0 : arrayListN.get(iNextInt))).intValue(), ((Number) ((iNextInt < 0 || iNextInt >= arrayListN2.size()) ? 0 : arrayListN2.get(iNextInt))).intValue())));
            }
            Iterator it2 = arrayList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((Number) next).intValue() == 0);
            Integer num = (Integer) next;
            if (num == null || num.intValue() <= 0) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        boolean z4 = !z && z3 && z2;
        boolean z5 = (z || !z3 || z2) ? false : true;
        if (!z5) {
            this.y = false;
        }
        i(n0.a((n0) this.c.d.getValue(), false, null, false, z, z4, z5 && !this.y, false, false, false, false, null, false, null, null, null, 130847));
    }
}

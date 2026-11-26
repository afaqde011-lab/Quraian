package jz;

import android.app.LocaleManager;
import android.net.Uri;
import android.os.Build;
import androidx.lifecycle.a1;
import androidx.lifecycle.u0;
import bv.h2;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalyticsSource;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import d40.p1;
import gz.n1;
import java.text.NumberFormat;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

public final class d0 extends a1 implements pm.d {
    public final vp.x d;
    public final wo.b0 e;
    public final wo.c0 f;
    public final hp.b g;
    public final AuthAnalytics h;
    public final LocaleManager i;
    public final pm.c j;
    public final aq.a k;
    public final pm.b c = new pm.b(new z(false, false, false, false, false, null, null, null, null, null, null, null, false, null, null, null, false, false, false, 2097151));
    public String l = "";

    public d0(vp.x xVar, wo.b0 b0Var, wo.c0 c0Var, hp.b bVar, AuthAnalytics authAnalytics, LocaleManager localeManager, pm.c cVar, aq.a aVar) {
        this.d = xVar;
        this.e = b0Var;
        this.f = c0Var;
        this.g = bVar;
        this.h = authAnalytics;
        this.i = localeManager;
        this.j = cVar;
        this.k = aVar;
        k00.c cVar2 = null;
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new b0(this, cVar2, 1), 31);
        o(false);
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new b0(this, cVar2, 0), 31);
    }

    public static boolean j(EntitlementInfo entitlementInfo) {
        Store store = entitlementInfo != null ? entitlementInfo.getStore() : null;
        int i = store == null ? -1 : a0.a[store.ordinal()];
        return i == 1 || i == 2 || i == 6 || i == 7;
    }

    public static String l(String str, List list) {
        Object next;
        if (r30.k.L0(str)) {
            return "";
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((ep.b) next).c.equalsIgnoreCase(str));
        ep.b bVar = (ep.b) next;
        String str2 = bVar != null ? bVar.g : null;
        return str2 == null ? "" : str2;
    }

    public static String n(Store store) {
        int i = a0.a[store.ordinal()];
        if (i == 1 || i == 2) {
            return "Android";
        }
        if (i == 3 || i == 4) {
            return "iPhone";
        }
        return i != 5 ? "" : "Web";
    }

    @Override
    public final Object a(Object obj, k00.c cVar) {
        return this.c.a(obj, cVar);
    }

    public final void h(k action) {
        EntitlementInfo entitlementInfoS;
        ?? r4;
        EntitlementInfo entitlementInfoS2;
        kotlin.jvm.internal.m.e(action, "action");
        if (action instanceof d) {
            ab.a0.A0(this, new r() {
                public static final int $stable = 0;

                public boolean equals(Object other) {
                    return this == other || (other instanceof ManageSubscriptionEffect$CloseScreen);
                }

                @Override
                public long getDebounce() {
                    return 300L;
                }

                public int hashCode() {
                    return -1704848442;
                }

                public String toString() {
                    return "CloseScreen";
                }
            });
            return;
        }
        ?? string = 0;
        if (action instanceof b) {
            this.h.authorizationTapped(AuthAnalyticsSource.PREMIUM);
            hp.b bVar = this.g;
            bVar.c = AuthAnalyticsSource.PREMIUM;
            p1 p1Var = bVar.a;
            p1Var.getClass();
            p1Var.k(null, dp.c.a);
            return;
        }
        boolean z = action instanceof c;
        pm.b bVar2 = this.c;
        if (z) {
            this.f.a.setPremiumDevicesBannerDismissed(true);
            q(z.a((z) bVar2.d.getValue(), null, null, null, false, false, 2097150));
            return;
        }
        if (action instanceof j) {
            boolean z2 = ((j) action).a;
            q(z.a((z) bVar2.d.getValue(), null, null, null, false, false, 1572863));
            if (z2) {
                ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new b0(this, string, 2), 31);
                return;
            }
            return;
        }
        if (action instanceof f) {
            LocaleManager localeManager = this.i;
            Locale locale = !localeManager.getApplicationLocales().isEmpty() ? localeManager.getApplicationLocales().get(0) : null;
            String country = locale != null ? locale.getCountry() : null;
            r4 = country != null ? country : "";
            int length = r4.length();
            ?? country2 = r4;
            if (length == 0) {
                country2 = Locale.getDefault().getCountry();
            }
            Set set = n1.a;
            kotlin.jvm.internal.m.b(country2);
            String upperCase = country2.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
            if (set.contains(upperCase)) {
                ab.a0.A0(this, o.a);
                return;
            } else {
                ab.a0.A0(this, new n(this.j.a(2131886728, new Object[0])));
                return;
            }
        }
        boolean z3 = action instanceof e;
        vp.x xVar = this.d;
        if (z3) {
            CustomerInfo customerInfo = (CustomerInfo) xVar.c.A.getValue();
            if (customerInfo == null || (entitlementInfoS2 = vp.x.s(customerInfo)) == null || !j(entitlementInfoS2)) {
                return;
            }
            ab.a0.A0(this, l.a);
            return;
        }
        if (!(action instanceof h)) {
            if (action instanceof i) {
                o(true);
                return;
            } else {
                if (!(action instanceof g)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((g) action).a instanceof sy.i) {
                    ab.a0.A0(this, new p());
                    o(false);
                    return;
                }
                return;
            }
        }
        if (((z) bVar2.d.getValue()).d) {
            ((bq.a) this.k).f(true, zp.b.SETTINGS);
            return;
        }
        CustomerInfo customerInfo2 = (CustomerInfo) xVar.c.A.getValue();
        if (customerInfo2 == null || (entitlementInfoS = vp.x.s(customerInfo2)) == null || !j(entitlementInfoS)) {
            return;
        }
        Uri managementURL = customerInfo2.getManagementURL();
        string = managementURL != null ? managementURL.toString() : 0;
        r4 = string != 0 ? string : "";
        boolean zL0 = r30.k.L0(r4);
        ?? r5 = r4;
        if (zL0) {
            r5 = String.format("https://play.google.com/store/account/subscriptions?sku=%s&package=%s", Arrays.copyOf(new Object[]{entitlementInfoS.getProductIdentifier(), "com.mchutov.Quranify"}, 2));
        }
        ab.a0.A0(this, new m(r5));
    }

    public final Locale i() {
        LocaleManager localeManager = this.i;
        if (localeManager.getApplicationLocales().isEmpty()) {
            Locale locale = Locale.getDefault();
            kotlin.jvm.internal.m.b(locale);
            return locale;
        }
        Locale locale2 = localeManager.getApplicationLocales().get(0);
        if (locale2 == null) {
            locale2 = Locale.getDefault();
        }
        kotlin.jvm.internal.m.b(locale2);
        return locale2;
    }

    public final String k(String str, String str2) {
        if (str == null) {
            str = "";
        }
        String string = r30.k.j1(str).toString();
        String string2 = str2 != null ? r30.k.j1(str2).toString() : null;
        String str3 = string2 != null ? string2 : "";
        if (str3.length() == 2) {
            String displayCountry = new Locale.Builder().setRegion(str3).build().getDisplayCountry(i());
            if (!r30.k.L0(displayCountry)) {
                str3 = displayCountry;
            }
        }
        List listS = va.a.S(new String[]{string, str3});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listS) {
            if (!r30.k.L0((String) obj)) {
                arrayList.add(obj);
            }
        }
        return h00.q.R0(arrayList, ", ", null, null, null, 62);
    }

    public final z m(CustomerInfo customerInfo, Offerings offerings, boolean z) {
        List arrayList;
        Package r13;
        Package annual;
        List<Package> availablePackages;
        Object next;
        String id;
        EntitlementInfo entitlementInfo;
        e0 e0Var;
        String str;
        String str2;
        pm.c cVar;
        String str3;
        boolean z2;
        String strA;
        boolean z3;
        String formatted;
        String str4;
        Package monthly;
        StoreProduct product;
        Price price;
        boolean z4;
        String str5;
        String strA2;
        String str6;
        boolean z5;
        boolean z6;
        boolean z7;
        String formatted2;
        double amountMicros;
        String currencyCode;
        StoreProduct product2;
        Price price2;
        Date expirationDate;
        StoreProduct product3;
        Iterator it;
        Object next2;
        Iterator it2;
        Object next3;
        Object next4;
        Map<String, Offering> all;
        Collection<Offering> collectionValues;
        xp.a aVarC = vp.x.C(customerInfo, this.d.k());
        EntitlementInfo entitlementInfoS = vp.x.s(customerInfo);
        if (entitlementInfoS == null || r30.k.L0(entitlementInfoS.getProductIdentifier())) {
            entitlementInfoS = null;
        }
        EntitlementInfo entitlementInfo2 = (entitlementInfoS == null || !entitlementInfoS.getIsActive()) ? null : entitlementInfoS;
        boolean z8 = aVarC == xp.a.C;
        if (!z8) {
            entitlementInfoS = entitlementInfo2;
        }
        if (offerings == null || (all = offerings.getAll()) == null || (collectionValues = all.values()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            Iterator<T> it3 = collectionValues.iterator();
            while (it3.hasNext()) {
                h00.v.u0(((Offering) it3.next()).getAvailablePackages(), arrayList);
            }
        }
        if (arrayList == null) {
            arrayList = h00.x.A;
        }
        if (entitlementInfoS != null) {
            String productIdentifier = entitlementInfoS.getProductIdentifier();
            String productPlanIdentifier = entitlementInfoS.getProductPlanIdentifier();
            if (productPlanIdentifier == null || r30.k.L0(productPlanIdentifier)) {
                it = arrayList.iterator();
                do {
                    if (it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (!kotlin.jvm.internal.m.a(((Package) next2).getProduct().getId(), productIdentifier));
                r13 = (Package) next2;
                if (r13 == null) {
                    it2 = arrayList.iterator();
                    do {
                        if (it2.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it2.next();
                    } while (!r30.r.x0(((Package) next3).getProduct().getId(), productIdentifier + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, false));
                    r13 = (Package) next3;
                }
            } else {
                Iterator it4 = arrayList.iterator();
                do {
                    if (!it4.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it4.next();
                } while (!kotlin.jvm.internal.m.a(((Package) next4).getProduct().getId(), productIdentifier + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + productPlanIdentifier));
                r13 = (Package) next4;
                if (r13 == null) {
                    it = arrayList.iterator();
                    do {
                        if (it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                    } while (!kotlin.jvm.internal.m.a(((Package) next2).getProduct().getId(), productIdentifier));
                    r13 = (Package) next2;
                    if (r13 == null) {
                        it2 = arrayList.iterator();
                        do {
                            if (it2.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it2.next();
                        } while (!r30.r.x0(((Package) next3).getProduct().getId(), productIdentifier + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, false));
                        r13 = (Package) next3;
                    }
                }
            }
        } else {
            r13 = null;
        }
        Offering current = offerings != null ? offerings.getCurrent() : null;
        if (current == null || (annual = current.getAnnual()) == null) {
            if (current == null || (availablePackages = current.getAvailablePackages()) == null) {
                annual = null;
            } else {
                Iterator<T> it5 = availablePackages.iterator();
                do {
                    if (!it5.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it5.next();
                } while (((Package) next).getPackageType() != PackageType.ANNUAL);
                annual = (Package) next;
            }
        }
        String productIdentifier2 = entitlementInfoS != null ? entitlementInfoS.getProductIdentifier() : null;
        if (productIdentifier2 == null) {
            productIdentifier2 = "";
        }
        boolean z9 = (r13 != null ? r13.getPackageType() : null) == PackageType.MONTHLY || (r13 == null && r30.k.A0(productIdentifier2, "month", true));
        String productIdentifier3 = entitlementInfoS != null ? entitlementInfoS.getProductIdentifier() : null;
        if (productIdentifier3 == null) {
            productIdentifier3 = "";
        }
        boolean z11 = (r13 != null ? r13.getPackageType() : null) == PackageType.ANNUAL || (r13 == null && (r30.k.A0(productIdentifier3, "annual", true) || r30.k.A0(productIdentifier3, "year", true)));
        if (!z9 || entitlementInfo2 == null) {
            id = "";
        } else {
            id = (annual == null || (product3 = annual.getProduct()) == null) ? null : product3.getId();
            if (id == null) {
                id = "";
            }
        }
        this.l = id;
        boolean z12 = aVarC == xp.a.B;
        boolean zJ = j(entitlementInfo2);
        z zVar = (z) this.c.d.getValue();
        if (z) {
            entitlementInfo = entitlementInfoS;
            String str7 = zVar.j;
            if (r30.k.L0(str7)) {
                str7 = null;
            }
            if (str7 != null) {
                String strL = zVar.k;
                if (r30.k.L0(strL)) {
                    strL = l(str7, zVar.l);
                }
                e0Var = new e0(str7, strL);
            } else {
                e0Var = entitlementInfo == null ? new e0((String) null, 3) : new e0(n(entitlementInfo.getStore()), 2);
            }
        } else {
            String MODEL = Build.MODEL;
            entitlementInfo = entitlementInfoS;
            kotlin.jvm.internal.m.d(MODEL, "MODEL");
            String string = r30.k.j1(MODEL).toString();
            if (r30.k.L0(string)) {
                string = n(Store.PLAY_STORE);
            }
            e0Var = new e0(string, 2);
        }
        boolean z13 = (z || this.f.a.isPremiumDevicesBannerDismissed()) ? false : true;
        boolean z14 = aVarC == xp.a.A || z12;
        if (entitlementInfo2 != null) {
            str = "";
            boolean z15 = entitlementInfo2.getWillRenew();
            if (entitlementInfo != null || (expirationDate = entitlementInfo.getExpirationDate()) == null) {
                str2 = null;
            } else {
                str2 = expirationDate.toInstant().atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("dd.MM.yy", i()));
                kotlin.jvm.internal.m.d(str2, "format(...)");
            }
            if (str2 == null) {
                str2 = str;
            }
            cVar = this.j;
            if (z9 != 0) {
                str3 = str2;
                z2 = zJ;
                strA = cVar.a(2131887032, new Object[0]);
            } else {
                str3 = str2;
                if (z11) {
                    strA = cVar.a(2131887031, new Object[0]);
                    z2 = zJ;
                } else {
                    z2 = zJ;
                    strA = str;
                }
            }
            String str8 = zVar.j;
            String str9 = zVar.k;
            List list = zVar.l;
            if (z9 || r30.k.L0(this.l) || z12) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (r13 != 0 || (product2 = r13.getProduct()) == null || (price2 = product2.getPrice()) == null || (formatted = price2.getFormatted()) == null) {
                if (current != 0 || (monthly = current.getMonthly()) == null || (product = monthly.getProduct()) == null || (price = product.getPrice()) == null) {
                    formatted = null;
                } else {
                    formatted = price.getFormatted();
                }
                if (formatted == null) {
                    str4 = str;
                } else {
                    str4 = formatted;
                }
            } else {
                str4 = formatted;
            }
            if (annual != null) {
                z4 = z2;
                amountMicros = (annual.getProduct().getPrice().getAmountMicros() / 1000000.0d) / 12.0d;
                currencyCode = annual.getProduct().getPrice().getCurrencyCode();
                if (r30.k.L0(currencyCode)) {
                    str5 = str;
                } else {
                    NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(i());
                    currencyInstance.setCurrency(Currency.getInstance(currencyCode));
                    str5 = currencyInstance.format(amountMicros);
                    kotlin.jvm.internal.m.d(str5, "format(...)");
                }
            } else {
                z4 = z2;
                str5 = null;
            }
            if (str5 == null) {
                str5 = str;
            }
            if (annual != null) {
                formatted2 = annual.getProduct().getPrice().getFormatted();
                if (r30.k.L0(formatted2)) {
                    strA2 = str;
                } else {
                    strA2 = cVar.a(2131886716, formatted2);
                }
            } else {
                strA2 = null;
            }
            if (strA2 == null) {
                str6 = str;
            } else {
                str6 = strA2;
            }
            if (z4 || z12) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z8 || (z12 && z4)) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (entitlementInfo2 != null || z4) {
                z7 = false;
            } else {
                z7 = true;
            }
            return new z(z13, z14, z12, z8, z15, str3, strA, e0Var.a, e0Var.b, str8, str9, list, z3, str4, str5, str6, z5, z6, z7, 1572864);
        }
        str = r10;
        if (entitlementInfo != null) {
            str2 = null;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = str;
        }
        cVar = this.j;
        if (z9 != 0) {
            str3 = str2;
            z2 = zJ;
            strA = cVar.a(2131887032, new Object[0]);
        } else {
            str3 = str2;
            if (z11) {
                strA = cVar.a(2131887031, new Object[0]);
                z2 = zJ;
            } else {
                z2 = zJ;
                strA = str;
            }
        }
        String str10 = zVar.j;
        String str11 = zVar.k;
        List list2 = zVar.l;
        if (z9) {
            z3 = false;
        } else {
            z3 = false;
        }
        if (r13 != 0) {
            if (current != 0) {
                formatted = null;
            } else {
                formatted = null;
            }
            if (formatted == null) {
                str4 = str;
            } else {
                str4 = formatted;
            }
        } else {
            if (current != 0) {
                formatted = null;
            } else {
                formatted = null;
            }
            if (formatted == null) {
                str4 = str;
            } else {
                str4 = formatted;
            }
        }
        if (annual != null) {
            z4 = z2;
            amountMicros = (annual.getProduct().getPrice().getAmountMicros() / 1000000.0d) / 12.0d;
            currencyCode = annual.getProduct().getPrice().getCurrencyCode();
            if (r30.k.L0(currencyCode)) {
                str5 = str;
            } else {
                NumberFormat currencyInstance2 = NumberFormat.getCurrencyInstance(i());
                currencyInstance2.setCurrency(Currency.getInstance(currencyCode));
                str5 = currencyInstance2.format(amountMicros);
                kotlin.jvm.internal.m.d(str5, "format(...)");
            }
        } else {
            z4 = z2;
            str5 = null;
        }
        if (str5 == null) {
            str5 = str;
        }
        if (annual != null) {
            formatted2 = annual.getProduct().getPrice().getFormatted();
            if (r30.k.L0(formatted2)) {
                strA2 = str;
            } else {
                strA2 = cVar.a(2131886716, formatted2);
            }
        } else {
            strA2 = null;
        }
        if (strA2 == null) {
            str6 = str;
        } else {
            str6 = strA2;
        }
        if (z4) {
            z5 = false;
        } else {
            z5 = false;
        }
        if (z8) {
            z6 = true;
        } else {
            z6 = true;
        }
        if (entitlementInfo2 != null) {
            z7 = false;
        } else {
            z7 = false;
        }
        return new z(z13, z14, z12, z8, z15, str3, strA, e0Var.a, e0Var.b, str10, str11, list2, z3, str4, str5, str6, z5, z6, z7, 1572864);
    }

    public final void o(boolean z) {
        if (z && ((z) this.c.d.getValue()).u) {
            return;
        }
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, new c0(z, this, null), new h2(z, this, (k00.c) null), 23);
    }

    public final void p() {
        vp.x xVar = this.d;
        z zVarM = m((CustomerInfo) xVar.c.A.getValue(), (Offerings) xVar.e.A.getValue(), this.f.a.isAuthorized());
        pm.b bVar = this.c;
        q(z.a(zVarM, null, null, null, ((z) bVar.d.getValue()).t, ((z) bVar.d.getValue()).u, 524287));
    }

    public final void q(Object obj) {
        pm.b bVar = this.c;
        bVar.getClass();
        p1 p1Var = bVar.d;
        while (!p1Var.i(p1Var.getValue(), obj)) {
        }
    }
}

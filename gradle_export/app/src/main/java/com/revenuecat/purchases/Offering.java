package com.revenuecat.purchases;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import g00.h;
import h00.r;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001TB]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B;\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u0010\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b&\u0010%R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00102\u0012\u0004\b5\u00101\u001a\u0004\b3\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u00108R\u001d\u0010=\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001d\u0010@\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b?\u0010<R\u001d\u0010C\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bA\u0010:\u001a\u0004\bB\u0010<R\u001d\u0010F\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bD\u0010:\u001a\u0004\bE\u0010<R\u001d\u0010I\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010:\u001a\u0004\bH\u0010<R\u001d\u0010L\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010:\u001a\u0004\bK\u0010<R\u001d\u0010O\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u0010:\u001a\u0004\bN\u0010<R\u0017\u0010Q\u001a\u00020P8G¢\u0006\f\u0012\u0004\bS\u00101\u001a\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Lcom/revenuecat/purchases/Offering;", "", "", "identifier", "serverDescription", "", "metadata", "", "Lcom/revenuecat/purchases/Package;", "availablePackages", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "paywall", "Lcom/revenuecat/purchases/Offering$PaywallComponents;", "paywallComponents", "Ljava/net/URL;", "webCheckoutURL", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lcom/revenuecat/purchases/paywalls/PaywallData;Lcom/revenuecat/purchases/Offering$PaywallComponents;Ljava/net/URL;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "Lcom/revenuecat/purchases/PackageType;", "packageType", "findPackage", "(Lcom/revenuecat/purchases/PackageType;)Lcom/revenuecat/purchases/Package;", "s", "get", "(Ljava/lang/String;)Lcom/revenuecat/purchases/Package;", "getPackage", SubscriberAttributeKt.JSON_NAME_KEY, "default", "getMetadataString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "copy", "(Lcom/revenuecat/purchases/PresentedOfferingContext;)Lcom/revenuecat/purchases/Offering;", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "getServerDescription", "Ljava/util/Map;", "getMetadata", "()Ljava/util/Map;", "Ljava/util/List;", "getAvailablePackages", "()Ljava/util/List;", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "getPaywall", "()Lcom/revenuecat/purchases/paywalls/PaywallData;", "getPaywall$annotations", "()V", "Lcom/revenuecat/purchases/Offering$PaywallComponents;", "getPaywallComponents", "()Lcom/revenuecat/purchases/Offering$PaywallComponents;", "getPaywallComponents$annotations", "Ljava/net/URL;", "getWebCheckoutURL", "()Ljava/net/URL;", "lifetime$delegate", "Lg00/h;", "getLifetime", "()Lcom/revenuecat/purchases/Package;", "lifetime", "annual$delegate", "getAnnual", "annual", "sixMonth$delegate", "getSixMonth", "sixMonth", "threeMonth$delegate", "getThreeMonth", "threeMonth", "twoMonth$delegate", "getTwoMonth", "twoMonth", "monthly$delegate", "getMonthly", "monthly", "weekly$delegate", "getWeekly", "weekly", "", "hasPaywall", "()Z", "hasPaywall$annotations", "PaywallComponents", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Offering {

    private final h annual;
    private final List<Package> availablePackages;
    private final String identifier;

    private final h lifetime;
    private final Map<String, Object> metadata;

    private final h monthly;
    private final PaywallData paywall;
    private final PaywallComponents paywallComponents;
    private final String serverDescription;

    private final h sixMonth;

    private final h threeMonth;

    private final h twoMonth;
    private final URL webCheckoutURL;

    private final h weekly;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/Offering$PaywallComponents;", "", "uiConfig", "Lcom/revenuecat/purchases/UiConfig;", "data", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "(Lcom/revenuecat/purchases/UiConfig;Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;)V", "getData", "()Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "getUiConfig", "()Lcom/revenuecat/purchases/UiConfig;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PaywallComponents {
        private final PaywallComponentsData data;
        private final UiConfig uiConfig;

        public PaywallComponents(UiConfig uiConfig, PaywallComponentsData data) {
            m.e(uiConfig, "uiConfig");
            m.e(data, "data");
            this.uiConfig = uiConfig;
            this.data = data;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaywallComponents)) {
                return false;
            }
            PaywallComponents paywallComponents = (PaywallComponents) obj;
            return m.a(this.uiConfig, paywallComponents.uiConfig) && m.a(this.data, paywallComponents.data);
        }

        public final PaywallComponentsData getData() {
            return this.data;
        }

        public final UiConfig getUiConfig() {
            return this.uiConfig;
        }

        public int hashCode() {
            return this.data.hashCode() + (this.uiConfig.hashCode() * 31);
        }

        public String toString() {
            return "PaywallComponents(uiConfig=" + this.uiConfig + ", data=" + this.data + ')';
        }
    }

    public Offering(String identifier, String serverDescription, Map<String, ? extends Object> metadata, List<Package> availablePackages) {
        this(identifier, serverDescription, metadata, availablePackages, null, null, null);
        m.e(identifier, "identifier");
        m.e(serverDescription, "serverDescription");
        m.e(metadata, "metadata");
        m.e(availablePackages, "availablePackages");
    }

    public Offering(String identifier, String serverDescription, Map<String, ? extends Object> metadata, List<Package> availablePackages, PaywallData paywallData, PaywallComponents paywallComponents, URL url) {
        m.e(identifier, "identifier");
        m.e(serverDescription, "serverDescription");
        m.e(metadata, "metadata");
        m.e(availablePackages, "availablePackages");
        this.identifier = identifier;
        this.serverDescription = serverDescription;
        this.metadata = metadata;
        this.availablePackages = availablePackages;
        this.paywall = paywallData;
        this.paywallComponents = paywallComponents;
        this.webCheckoutURL = url;
        this.lifetime = rd.a.J(new Offering$lifetime$2(this));
        this.annual = rd.a.J(new Offering$annual$2(this));
        this.sixMonth = rd.a.J(new Offering$sixMonth$2(this));
        this.threeMonth = rd.a.J(new Offering$threeMonth$2(this));
        this.twoMonth = rd.a.J(new Offering$twoMonth$2(this));
        this.monthly = rd.a.J(new Offering$monthly$2(this));
        this.weekly = rd.a.J(new Offering$weekly$2(this));
    }

    public Offering(String str, String str2, Map map, List list, PaywallData paywallData, PaywallComponents paywallComponents, URL url, int i, f fVar) {
        this(str, str2, map, list, (i & 16) != 0 ? null : paywallData, (i & 32) != 0 ? null : paywallComponents, (i & 64) != 0 ? null : url);
    }

    public final Package findPackage(PackageType packageType) {
        Object next;
        Iterator<T> it = this.availablePackages.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (m.a(((Package) next).getIdentifier(), packageType.getIdentifier())) {
                return (Package) next;
            }
        }
        next = null;
        return (Package) next;
    }

    public static void getPaywall$annotations() {
    }

    public static void getPaywallComponents$annotations() {
    }

    public static void hasPaywall$annotations() {
    }

    public final Offering copy(PresentedOfferingContext presentedOfferingContext) {
        m.e(presentedOfferingContext, "presentedOfferingContext");
        String str = this.identifier;
        String str2 = this.serverDescription;
        Map<String, Object> map = this.metadata;
        List<Package> list = this.availablePackages;
        ArrayList arrayList = new ArrayList(r.q0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Package) it.next()).copy$purchases_defaultsBc8Release(presentedOfferingContext));
        }
        return new Offering(str, str2, map, arrayList, this.paywall, this.paywallComponents, this.webCheckoutURL);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offering)) {
            return false;
        }
        Offering offering = (Offering) obj;
        return m.a(this.identifier, offering.identifier) && m.a(this.serverDescription, offering.serverDescription) && m.a(this.metadata, offering.metadata) && m.a(this.availablePackages, offering.availablePackages) && m.a(this.paywall, offering.paywall) && m.a(this.paywallComponents, offering.paywallComponents) && m.a(this.webCheckoutURL, offering.webCheckoutURL);
    }

    public final Package get(String s) {
        m.e(s, "s");
        return getPackage(s);
    }

    public final Package getAnnual() {
        return (Package) this.annual.getValue();
    }

    public final List<Package> getAvailablePackages() {
        return this.availablePackages;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Package getLifetime() {
        return (Package) this.lifetime.getValue();
    }

    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public final String getMetadataString(String key, String str) {
        m.e(key, "key");
        m.e(str, "default");
        Object obj = this.metadata.get(key);
        String str2 = obj instanceof String ? (String) obj : null;
        return str2 == null ? str : str2;
    }

    public final Package getMonthly() {
        return (Package) this.monthly.getValue();
    }

    public final Package getPackage(String identifier) throws NoSuchElementException {
        m.e(identifier, "identifier");
        for (Package r0 : this.availablePackages) {
            if (m.a(r0.getIdentifier(), identifier)) {
                return r0;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final PaywallData getPaywall() {
        return this.paywall;
    }

    public final PaywallComponents getPaywallComponents() {
        return this.paywallComponents;
    }

    public final String getServerDescription() {
        return this.serverDescription;
    }

    public final Package getSixMonth() {
        return (Package) this.sixMonth.getValue();
    }

    public final Package getThreeMonth() {
        return (Package) this.threeMonth.getValue();
    }

    public final Package getTwoMonth() {
        return (Package) this.twoMonth.getValue();
    }

    public final URL getWebCheckoutURL() {
        return this.webCheckoutURL;
    }

    public final Package getWeekly() {
        return (Package) this.weekly.getValue();
    }

    public final boolean hasPaywall() {
        return (this.paywall == null && this.paywallComponents == null) ? false : true;
    }

    public int hashCode() {
        int iA = g4.c.a((this.metadata.hashCode() + x5.e(this.identifier.hashCode() * 31, this.serverDescription, 31)) * 31, 31, this.availablePackages);
        PaywallData paywallData = this.paywall;
        int iHashCode = (iA + (paywallData == null ? 0 : paywallData.hashCode())) * 31;
        PaywallComponents paywallComponents = this.paywallComponents;
        int iHashCode2 = (iHashCode + (paywallComponents == null ? 0 : paywallComponents.hashCode())) * 31;
        URL url = this.webCheckoutURL;
        return iHashCode2 + (url != null ? url.hashCode() : 0);
    }

    public String toString() {
        return "Offering(identifier=" + this.identifier + ", serverDescription=" + this.serverDescription + ", metadata=" + this.metadata + ", availablePackages=" + this.availablePackages + ", paywall=" + this.paywall + ", paywallComponents=" + this.paywallComponents + ", webCheckoutURL=" + this.webCheckoutURL + ')';
    }
}

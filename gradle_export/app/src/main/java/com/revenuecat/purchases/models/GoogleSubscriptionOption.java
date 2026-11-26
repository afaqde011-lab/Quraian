package com.revenuecat.purchases.models;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import g00.c;
import h00.q;
import h00.x;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import qd.p;
import r30.k;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001Bg\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012BW\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0014B\u001b\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0000\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028VX\u0097\u0004¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0019R\u001a\u00102\u001a\u00020.8VX\u0096\u0004¢\u0006\f\u0012\u0004\b1\u0010,\u001a\u0004\b/\u00100R\u0016\u00105\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0019¨\u00068"}, d2 = {"Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "", "productId", "basePlanId", "offerId", "", "Lcom/revenuecat/purchases/models/PricingPhase;", "pricingPhases", "tags", "Lqd/p;", "productDetails", "offerToken", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "installmentsInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lqd/p;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;)V", "presentedOfferingId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lqd/p;Ljava/lang/String;Ljava/lang/String;)V", "subscriptionOption", "(Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "Ljava/lang/String;", "getProductId", "()Ljava/lang/String;", "getBasePlanId", "getOfferId", "Ljava/util/List;", "getPricingPhases", "()Ljava/util/List;", "getTags", "Lqd/p;", "getProductDetails", "()Lqd/p;", "getOfferToken", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "getInstallmentsInfo", "()Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "getPresentedOfferingIdentifier", "getPresentedOfferingIdentifier$annotations", "()V", "presentedOfferingIdentifier", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData$annotations", "purchasingData", "getPrimaryPricingPhase", "()Lcom/revenuecat/purchases/models/PricingPhase;", "primaryPricingPhase", "getId", DiagnosticsEntry.ID_KEY, "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GoogleSubscriptionOption implements SubscriptionOption {
    private final String basePlanId;
    private final GoogleInstallmentsInfo installmentsInfo;
    private final String offerId;
    private final String offerToken;
    private final PresentedOfferingContext presentedOfferingContext;
    private final List<PricingPhase> pricingPhases;
    private final p productDetails;
    private final String productId;
    private final List<String> tags;

    public GoogleSubscriptionOption(GoogleSubscriptionOption subscriptionOption, PresentedOfferingContext presentedOfferingContext) {
        this(subscriptionOption.productId, subscriptionOption.basePlanId, subscriptionOption.offerId, subscriptionOption.getPricingPhases(), subscriptionOption.getTags(), subscriptionOption.productDetails, subscriptionOption.offerToken, presentedOfferingContext, subscriptionOption.getInstallmentsInfo());
        m.e(subscriptionOption, "subscriptionOption");
    }

    public GoogleSubscriptionOption(String productId, String basePlanId, String str, List<PricingPhase> pricingPhases, List<String> tags, p productDetails, String offerToken) {
        this(productId, basePlanId, str, pricingPhases, tags, productDetails, offerToken, null, null, 384, null);
        m.e(productId, "productId");
        m.e(basePlanId, "basePlanId");
        m.e(pricingPhases, "pricingPhases");
        m.e(tags, "tags");
        m.e(productDetails, "productDetails");
        m.e(offerToken, "offerToken");
    }

    public GoogleSubscriptionOption(String productId, String basePlanId, String str, List<PricingPhase> pricingPhases, List<String> tags, p productDetails, String offerToken, PresentedOfferingContext presentedOfferingContext) {
        this(productId, basePlanId, str, pricingPhases, tags, productDetails, offerToken, presentedOfferingContext, null, 256, null);
        m.e(productId, "productId");
        m.e(basePlanId, "basePlanId");
        m.e(pricingPhases, "pricingPhases");
        m.e(tags, "tags");
        m.e(productDetails, "productDetails");
        m.e(offerToken, "offerToken");
    }

    public GoogleSubscriptionOption(String productId, String basePlanId, String str, List<PricingPhase> pricingPhases, List<String> tags, p productDetails, String offerToken, PresentedOfferingContext presentedOfferingContext, GoogleInstallmentsInfo googleInstallmentsInfo) {
        m.e(productId, "productId");
        m.e(basePlanId, "basePlanId");
        m.e(pricingPhases, "pricingPhases");
        m.e(tags, "tags");
        m.e(productDetails, "productDetails");
        m.e(offerToken, "offerToken");
        this.productId = productId;
        this.basePlanId = basePlanId;
        this.offerId = str;
        this.pricingPhases = pricingPhases;
        this.tags = tags;
        this.productDetails = productDetails;
        this.offerToken = offerToken;
        this.presentedOfferingContext = presentedOfferingContext;
        this.installmentsInfo = googleInstallmentsInfo;
    }

    public GoogleSubscriptionOption(String str, String str2, String str3, List list, List list2, p pVar, String str4, PresentedOfferingContext presentedOfferingContext, GoogleInstallmentsInfo googleInstallmentsInfo, int i, f fVar) {
        this(str, str2, str3, list, list2, pVar, str4, (i & 128) != 0 ? null : presentedOfferingContext, (i & 256) != 0 ? null : googleInstallmentsInfo);
    }

    @c
    public GoogleSubscriptionOption(String productId, String basePlanId, String str, List<PricingPhase> pricingPhases, List<String> tags, p productDetails, String offerToken, String presentedOfferingId) {
        this(productId, basePlanId, str, pricingPhases, tags, productDetails, offerToken, new PresentedOfferingContext(presentedOfferingId), null, 256, null);
        m.e(productId, "productId");
        m.e(basePlanId, "basePlanId");
        m.e(pricingPhases, "pricingPhases");
        m.e(tags, "tags");
        m.e(productDetails, "productDetails");
        m.e(offerToken, "offerToken");
        m.e(presentedOfferingId, "presentedOfferingId");
    }

    @c
    public static void getPresentedOfferingIdentifier$annotations() {
    }

    private final PricingPhase getPrimaryPricingPhase() {
        Object next;
        Iterator<T> it = getPricingPhases().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((PricingPhase) next).getRecurrenceMode() != RecurrenceMode.INFINITE_RECURRING);
        PricingPhase pricingPhase = (PricingPhase) next;
        return pricingPhase == null ? (PricingPhase) q.U0(getPricingPhases()) : pricingPhase;
    }

    public static void getPurchasingData$annotations() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleSubscriptionOption)) {
            return false;
        }
        GoogleSubscriptionOption googleSubscriptionOption = (GoogleSubscriptionOption) obj;
        return m.a(this.productId, googleSubscriptionOption.productId) && m.a(this.basePlanId, googleSubscriptionOption.basePlanId) && m.a(this.offerId, googleSubscriptionOption.offerId) && m.a(this.pricingPhases, googleSubscriptionOption.pricingPhases) && m.a(this.tags, googleSubscriptionOption.tags) && m.a(this.productDetails, googleSubscriptionOption.productDetails) && m.a(this.offerToken, googleSubscriptionOption.offerToken) && m.a(this.presentedOfferingContext, googleSubscriptionOption.presentedOfferingContext) && m.a(this.installmentsInfo, googleSubscriptionOption.installmentsInfo);
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @Override
    public String getId() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.basePlanId);
        String str2 = this.offerId;
        if (str2 == null || k.L0(str2)) {
            str = "";
        } else {
            str = Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + this.offerId;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override
    public GoogleInstallmentsInfo getInstallmentsInfo() {
        return this.installmentsInfo;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    @Override
    public PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    @Override
    public String getPresentedOfferingIdentifier() {
        PresentedOfferingContext presentedOfferingContext = getPresentedOfferingContext();
        if (presentedOfferingContext != null) {
            return presentedOfferingContext.getOfferingIdentifier();
        }
        return null;
    }

    @Override
    public List<PricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    public final p getProductDetails() {
        return this.productDetails;
    }

    public final String getProductId() {
        return this.productId;
    }

    @Override
    public PurchasingData getPurchasingData() {
        String str = this.productId;
        String id = getId();
        p pVar = this.productDetails;
        String str2 = this.offerToken;
        PricingPhase primaryPricingPhase = getPrimaryPricingPhase();
        return new GooglePurchasingData.Subscription(str, id, pVar, str2, primaryPricingPhase != null ? primaryPricingPhase.getBillingPeriod() : null, x.A);
    }

    @Override
    public List<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int iE = x5.e(this.productId.hashCode() * 31, this.basePlanId, 31);
        String str = this.offerId;
        int iE2 = x5.e(x5.e(g4.c.a(g4.c.a((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.pricingPhases), 31, this.tags), this.productDetails.a, 31), this.offerToken, 31);
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        int iHashCode = (iE2 + (presentedOfferingContext == null ? 0 : presentedOfferingContext.hashCode())) * 31;
        GoogleInstallmentsInfo googleInstallmentsInfo = this.installmentsInfo;
        return iHashCode + (googleInstallmentsInfo != null ? googleInstallmentsInfo.hashCode() : 0);
    }

    public String toString() {
        return "GoogleSubscriptionOption(productId=" + this.productId + ", basePlanId=" + this.basePlanId + ", offerId=" + this.offerId + ", pricingPhases=" + this.pricingPhases + ", tags=" + this.tags + ", productDetails=" + this.productDetails + ", offerToken=" + this.offerToken + ", presentedOfferingContext=" + this.presentedOfferingContext + ", installmentsInfo=" + this.installmentsInfo + ')';
    }
}

package com.revenuecat.purchases.models;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import h00.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001BK\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/models/TestSubscriptionOption;", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "pricingPhases", "", "Lcom/revenuecat/purchases/models/PricingPhase;", "basePlanId", "", "tags", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "installmentsInfo", "Lcom/revenuecat/purchases/models/InstallmentsInfo;", "purchasingData", "Lcom/revenuecat/purchases/models/PurchasingData;", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/PresentedOfferingContext;Lcom/revenuecat/purchases/models/InstallmentsInfo;Lcom/revenuecat/purchases/models/PurchasingData;)V", "getBasePlanId", "()Ljava/lang/String;", DiagnosticsEntry.ID_KEY, "getId", "getInstallmentsInfo", "()Lcom/revenuecat/purchases/models/InstallmentsInfo;", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingIdentifier", "getPresentedOfferingIdentifier", "getPricingPhases", "()Ljava/util/List;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", "getTags", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TestSubscriptionOption implements SubscriptionOption {
    private final String basePlanId;
    private final InstallmentsInfo installmentsInfo;
    private final PresentedOfferingContext presentedOfferingContext;
    private final List<PricingPhase> pricingPhases;
    private final PurchasingData purchasingData;
    private final List<String> tags;

    public TestSubscriptionOption(List<PricingPhase> pricingPhases, String basePlanId, List<String> tags, PresentedOfferingContext presentedOfferingContext, InstallmentsInfo installmentsInfo, PurchasingData purchasingData) {
        m.e(pricingPhases, "pricingPhases");
        m.e(basePlanId, "basePlanId");
        m.e(tags, "tags");
        m.e(presentedOfferingContext, "presentedOfferingContext");
        m.e(purchasingData, "purchasingData");
        this.pricingPhases = pricingPhases;
        this.basePlanId = basePlanId;
        this.tags = tags;
        this.presentedOfferingContext = presentedOfferingContext;
        this.installmentsInfo = installmentsInfo;
        this.purchasingData = purchasingData;
    }

    public TestSubscriptionOption(List list, String str, List list2, PresentedOfferingContext presentedOfferingContext, InstallmentsInfo installmentsInfo, PurchasingData purchasingData, int i, f fVar) {
        this(list, (i & 2) != 0 ? "testBasePlanId" : str, (i & 4) != 0 ? x.A : list2, (i & 8) != 0 ? new PresentedOfferingContext("offering") : presentedOfferingContext, (i & 16) != 0 ? null : installmentsInfo, purchasingData);
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @Override
    public String getId() {
        return getPricingPhases().size() == 1 ? this.basePlanId : x5.n(new StringBuilder(), this.basePlanId, ":testOfferId");
    }

    @Override
    public InstallmentsInfo getInstallmentsInfo() {
        return this.installmentsInfo;
    }

    @Override
    public PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    @Override
    public String getPresentedOfferingIdentifier() {
        return getPresentedOfferingContext().getOfferingIdentifier();
    }

    @Override
    public List<PricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    @Override
    public PurchasingData getPurchasingData() {
        return this.purchasingData;
    }

    @Override
    public List<String> getTags() {
        return this.tags;
    }
}

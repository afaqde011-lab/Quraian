package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import g00.b0;
import h00.r;
import h00.v;
import h00.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0018\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00190\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!¨\u0006\""}, d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProductsFetcher;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/common/DateProvider;)V", "Lcom/revenuecat/purchases/models/StoreTransaction;", "transaction", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "productEntitlementMapping", "", "Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProduct;", "createPurchasedProducts", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;)Ljava/util/List;", "purchaseAssociatedToProduct", "Ljava/util/Date;", "getExpirationDate", "(Lcom/revenuecat/purchases/models/StoreTransaction;)Ljava/util/Date;", "", "appUserID", "Lkotlin/Function1;", "Lg00/b0;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "queryActiveProducts", "(Ljava/lang/String;Lu00/k;Lu00/k;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/common/DateProvider;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PurchasedProductsFetcher {
    private final BillingAbstract billing;
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.SUBS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "activePurchasesByHashedToken", "Lg00/b0;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements k {
        final k $onSuccess;
        final ProductEntitlementMapping $productEntitlementMapping;
        final PurchasedProductsFetcher this$0;

        public AnonymousClass1(k kVar, PurchasedProductsFetcher purchasedProductsFetcher, ProductEntitlementMapping productEntitlementMapping) {
            super(1);
            this.$onSuccess = kVar;
            this.this$0 = purchasedProductsFetcher;
            this.$productEntitlementMapping = productEntitlementMapping;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((Map<String, StoreTransaction>) obj);
            return b0.a;
        }

        public final void invoke(Map<String, StoreTransaction> activePurchasesByHashedToken) {
            m.e(activePurchasesByHashedToken, "activePurchasesByHashedToken");
            Collection<StoreTransaction> collectionValues = activePurchasesByHashedToken.values();
            PurchasedProductsFetcher purchasedProductsFetcher = this.this$0;
            ProductEntitlementMapping productEntitlementMapping = this.$productEntitlementMapping;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                v.u0(purchasedProductsFetcher.createPurchasedProducts((StoreTransaction) it.next(), productEntitlementMapping), arrayList);
            }
            this.$onSuccess.invoke(arrayList);
        }
    }

    public PurchasedProductsFetcher(DeviceCache deviceCache, BillingAbstract billing, DateProvider dateProvider) {
        m.e(deviceCache, "deviceCache");
        m.e(billing, "billing");
        m.e(dateProvider, "dateProvider");
        this.deviceCache = deviceCache;
        this.billing = billing;
        this.dateProvider = dateProvider;
    }

    public PurchasedProductsFetcher(DeviceCache deviceCache, BillingAbstract billingAbstract, DateProvider dateProvider, int i, f fVar) {
        this(deviceCache, billingAbstract, (i & 4) != 0 ? new DefaultDateProvider() : dateProvider);
    }

    public final List<PurchasedProduct> createPurchasedProducts(StoreTransaction transaction, ProductEntitlementMapping productEntitlementMapping) {
        List<String> entitlements;
        Date expirationDate = getExpirationDate(transaction);
        List<String> productIds = transaction.getProductIds();
        ArrayList arrayList = new ArrayList(r.q0(productIds, 10));
        for (String str : productIds) {
            ProductEntitlementMapping.Mapping mapping = productEntitlementMapping.getMappings().get(str);
            String basePlanId = mapping != null ? mapping.getBasePlanId() : null;
            if (mapping == null || (entitlements = mapping.getEntitlements()) == null) {
                entitlements = x.A;
            }
            List<String> list = entitlements;
            String str2 = basePlanId;
            StoreTransaction storeTransaction = transaction;
            arrayList.add(new PurchasedProduct(str, str2, storeTransaction, list, expirationDate));
            transaction = storeTransaction;
        }
        return arrayList;
    }

    private final Date getExpirationDate(StoreTransaction purchaseAssociatedToProduct) {
        if (WhenMappings.$EnumSwitchMapping$0[purchaseAssociatedToProduct.getType().ordinal()] != 1) {
            return null;
        }
        return new Date(TimeUnit.DAYS.toMillis(1L) + this.dateProvider.getNow().getTime());
    }

    public final void queryActiveProducts(String appUserID, k onSuccess, k onError) {
        m.e(appUserID, "appUserID");
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        ProductEntitlementMapping productEntitlementMapping$purchases_defaultsBc8Release = this.deviceCache.getProductEntitlementMapping$purchases_defaultsBc8Release();
        if (productEntitlementMapping$purchases_defaultsBc8Release == null) {
            onError.invoke(new PurchasesError(PurchasesErrorCode.CustomerInfoError, OfflineEntitlementsStrings.PRODUCT_ENTITLEMENT_MAPPING_REQUIRED));
        } else {
            this.billing.queryPurchases(appUserID, new AnonymousClass1(onSuccess, this, productEntitlementMapping$purchases_defaultsBc8Release), onError);
        }
    }
}

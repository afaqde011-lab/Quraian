package com.revenuecat.purchases.common;

import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PresentedOfferingContextSerializer;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.ReplacementModeSerializer;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.PeriodSerializer;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.PricingPhaseSerializer;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import h00.r;
import h00.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import p40.b1;
import p40.c;
import p40.g0;
import p40.k0;
import p40.o0;
import p40.q;
import p40.x0;
import ta.c0;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0081\b\u0018\u0000 b2\u00020\u0001:\u0002cbB»\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00130\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001aBË\u0001\b\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u001c\u0010\u0014\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0013\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u0019\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0012\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\"J\u0012\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b/\u00100J$\u00101\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00130\u0002HÆ\u0003¢\u0006\u0004\b1\u0010\"J\u0010\u00102\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b4\u0010*J\u0012\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b5\u0010*JÆ\u0001\u00106\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00130\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b8\u0010*J\u0010\u00109\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010<\u001a\u00020\u00152\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b<\u0010=J(\u0010F\u001a\u00020C2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AHÁ\u0001¢\u0006\u0004\bD\u0010ER\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010G\u001a\u0004\bH\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010I\u001a\u0004\bJ\u0010$R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010K\u0012\u0004\bM\u0010N\u001a\u0004\bL\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010O\u001a\u0004\bP\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010Q\u001a\u0004\bR\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010Q\u001a\u0004\bS\u0010*R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010T\u0012\u0004\bV\u0010N\u001a\u0004\bU\u0010-R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bW\u0010\"R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010X\u0012\u0004\bZ\u0010N\u001a\u0004\bY\u00100R+\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00130\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010G\u001a\u0004\b[\u0010\"R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\\\u001a\u0004\b]\u00103R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010Q\u001a\u0004\b^\u0010*R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010Q\u001a\u0004\b_\u0010*R\u001f\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u0012\n\u0004\b\u001d\u0010Q\u0012\u0004\ba\u0010N\u001a\u0004\b`\u0010*¨\u0006d"}, d2 = {"Lcom/revenuecat/purchases/common/ReceiptInfo;", "", "", "", "productIDs", "", "purchaseTime", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "", "price", "formattedPrice", "currency", "Lcom/revenuecat/purchases/models/Period;", "period", "Lcom/revenuecat/purchases/models/PricingPhase;", "pricingPhases", "Lcom/revenuecat/purchases/ReplacementMode;", "replacementMode", "", "platformProductIds", "", "sdkOriginated", "storeUserID", "marketplace", "<init>", "(Ljava/util/List;Ljava/lang/Long;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Ljava/util/List;Lcom/revenuecat/purchases/ReplacementMode;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V", "", "seen1", "duration", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/Long;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Ljava/util/List;Lcom/revenuecat/purchases/ReplacementMode;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp40/x0;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Long;", "component3", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "component4", "()Ljava/lang/Double;", "component5", "()Ljava/lang/String;", "component6", "component7", "()Lcom/revenuecat/purchases/models/Period;", "component8", "component9", "()Lcom/revenuecat/purchases/ReplacementMode;", "component10", "component11", "()Z", "component12", "component13", "copy", "(Ljava/util/List;Ljava/lang/Long;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Ljava/util/List;Lcom/revenuecat/purchases/ReplacementMode;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/common/ReceiptInfo;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/ReceiptInfo;Lo40/b;Ln40/e;)V", "write$Self", "Ljava/util/List;", "getProductIDs", "Ljava/lang/Long;", "getPurchaseTime", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "getPresentedOfferingContext$annotations", "()V", "Ljava/lang/Double;", "getPrice", "Ljava/lang/String;", "getFormattedPrice", "getCurrency", "Lcom/revenuecat/purchases/models/Period;", "getPeriod", "getPeriod$annotations", "getPricingPhases", "Lcom/revenuecat/purchases/ReplacementMode;", "getReplacementMode", "getReplacementMode$annotations", "getPlatformProductIds", "Z", "getSdkOriginated", "getStoreUserID", "getMarketplace", "getDuration", "getDuration$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ReceiptInfo {
    private static final a[] $childSerializers;

    public static final Companion INSTANCE = new Companion(null);
    private final String currency;
    private final String duration;
    private final String formattedPrice;
    private final String marketplace;
    private final Period period;
    private final List<Map<String, String>> platformProductIds;
    private final PresentedOfferingContext presentedOfferingContext;
    private final Double price;
    private final List<PricingPhase> pricingPhases;
    private final List<String> productIDs;
    private final Long purchaseTime;
    private final ReplacementMode replacementMode;
    private final boolean sdkOriginated;
    private final String storeUserID;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/common/ReceiptInfo$Companion;", "", "<init>", "()V", "Lcom/revenuecat/purchases/models/StoreTransaction;", "storeTransaction", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "", "", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "subscriptionOptionsForProductIDs", "", "sdkOriginated", "Lcom/revenuecat/purchases/common/ReceiptInfo;", "from", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/models/StoreProduct;Ljava/util/Map;Z)Lcom/revenuecat/purchases/common/ReceiptInfo;", "Ll40/a;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public static ReceiptInfo from$default(Companion companion, StoreTransaction storeTransaction, StoreProduct storeProduct, Map map, boolean z, int i, Object obj) {
            if ((i & 8) != 0) {
                z = false;
            }
            return companion.from(storeTransaction, storeProduct, map, z);
        }

        public final ReceiptInfo from(StoreTransaction storeTransaction, StoreProduct storeProduct, Map<String, ? extends SubscriptionOption> subscriptionOptionsForProductIDs, boolean sdkOriginated) {
            SubscriptionOption subscriptionOption;
            PlatformProductId platformProductId;
            Price price;
            Price price2;
            Price price3;
            SubscriptionOption subscriptionOption2;
            PlatformProductId platformProductId2;
            Map<String, String> asMap;
            SubscriptionOptions subscriptionOptions;
            SubscriptionOption next;
            m.e(storeTransaction, "storeTransaction");
            if (storeProduct == null || (subscriptionOptions = storeProduct.getSubscriptionOptions()) == null) {
                subscriptionOption = null;
            } else {
                Iterator<SubscriptionOption> it = subscriptionOptions.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!m.a(next.getId(), storeTransaction.getSubscriptionOptionId()));
                subscriptionOption = next;
            }
            if (subscriptionOption == null || (platformProductId = ReceiptInfoKt.platformProductId(subscriptionOption)) == null) {
                platformProductId = storeProduct != null ? ReceiptInfoKt.platformProductId(storeProduct) : null;
            }
            List<String> productIds = storeTransaction.getProductIds();
            ArrayList arrayList = new ArrayList(r.q0(productIds, 10));
            for (String str : productIds) {
                arrayList.add(m.a(str, platformProductId != null ? platformProductId.getProductId() : null) ? platformProductId.getAsMap() : (subscriptionOptionsForProductIDs == null || (subscriptionOption2 = subscriptionOptionsForProductIDs.get(str)) == null || (platformProductId2 = ReceiptInfoKt.platformProductId(subscriptionOption2)) == null || (asMap = platformProductId2.getAsMap()) == null) ? new PlatformProductId(str).getAsMap() : asMap);
            }
            return new ReceiptInfo(storeTransaction.getProductIds(), Long.valueOf(storeTransaction.getPurchaseTime()), storeTransaction.getPresentedOfferingContext(), (storeProduct == null || (price3 = storeProduct.getPrice()) == null) ? null : Double.valueOf(price3.getAmountMicros() / 1000000.0d), (storeProduct == null || (price2 = storeProduct.getPrice()) == null) ? null : price2.getFormatted(), (storeProduct == null || (price = storeProduct.getPrice()) == null) ? null : price.getCurrencyCode(), storeProduct != null ? storeProduct.getPeriod() : null, subscriptionOption != null ? subscriptionOption.getPricingPhases() : null, storeTransaction.getReplacementMode(), arrayList, sdkOriginated, storeTransaction.getStoreUserID(), storeTransaction.getMarketplace());
        }

        public final a serializer() {
            return ReceiptInfo$$serializer.INSTANCE;
        }
    }

    static {
        b1 b1Var = b1.a;
        $childSerializers = new a[]{new c(b1Var), null, null, null, null, null, null, new c(PricingPhaseSerializer.INSTANCE), null, new c(new g0(b1Var, c0.G(b1Var))), null, null, null, null};
    }

    @g00.c
    public ReceiptInfo(int i, List list, Long l, PresentedOfferingContext presentedOfferingContext, Double d, String str, String str2, Period period, List list2, ReplacementMode replacementMode, List list3, boolean z, String str3, String str4, String str5, x0 x0Var) {
        String iso8601;
        String str6 = null;
        if (1 != (i & 1)) {
            o0.g(i, 1, ReceiptInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.productIDs = list;
        if ((i & 2) == 0) {
            this.purchaseTime = null;
        } else {
            this.purchaseTime = l;
        }
        if ((i & 4) == 0) {
            this.presentedOfferingContext = null;
        } else {
            this.presentedOfferingContext = presentedOfferingContext;
        }
        if ((i & 8) == 0) {
            this.price = null;
        } else {
            this.price = d;
        }
        if ((i & 16) == 0) {
            this.formattedPrice = null;
        } else {
            this.formattedPrice = str;
        }
        if ((i & 32) == 0) {
            this.currency = null;
        } else {
            this.currency = str2;
        }
        if ((i & 64) == 0) {
            this.period = null;
        } else {
            this.period = period;
        }
        if ((i & 128) == 0) {
            this.pricingPhases = null;
        } else {
            this.pricingPhases = list2;
        }
        if ((i & 256) == 0) {
            this.replacementMode = null;
        } else {
            this.replacementMode = replacementMode;
        }
        if ((i & 512) == 0) {
            this.platformProductIds = x.A;
        } else {
            this.platformProductIds = list3;
        }
        if ((i & 1024) == 0) {
            this.sdkOriginated = false;
        } else {
            this.sdkOriginated = z;
        }
        if ((i & 2048) == 0) {
            this.storeUserID = null;
        } else {
            this.storeUserID = str3;
        }
        if ((i & 4096) == 0) {
            this.marketplace = null;
        } else {
            this.marketplace = str4;
        }
        if ((i & 8192) != 0) {
            this.duration = str5;
            return;
        }
        Period period2 = this.period;
        if (period2 != null && (iso8601 = period2.getIso8601()) != null && iso8601.length() != 0) {
            str6 = iso8601;
        }
        this.duration = str6;
    }

    public ReceiptInfo(List<String> productIDs, Long l, PresentedOfferingContext presentedOfferingContext, Double d, String str, String str2, Period period, List<PricingPhase> list, ReplacementMode replacementMode, List<? extends Map<String, String>> platformProductIds, boolean z, String str3, String str4) {
        String iso8601;
        m.e(productIDs, "productIDs");
        m.e(platformProductIds, "platformProductIds");
        this.productIDs = productIDs;
        this.purchaseTime = l;
        this.presentedOfferingContext = presentedOfferingContext;
        this.price = d;
        this.formattedPrice = str;
        this.currency = str2;
        this.period = period;
        this.pricingPhases = list;
        this.replacementMode = replacementMode;
        this.platformProductIds = platformProductIds;
        this.sdkOriginated = z;
        this.storeUserID = str3;
        this.marketplace = str4;
        String str5 = null;
        if (period != null && (iso8601 = period.getIso8601()) != null && iso8601.length() != 0) {
            str5 = iso8601;
        }
        this.duration = str5;
    }

    public ReceiptInfo(List list, Long l, PresentedOfferingContext presentedOfferingContext, Double d, String str, String str2, Period period, List list2, ReplacementMode replacementMode, List list3, boolean z, String str3, String str4, int i, f fVar) {
        this(list, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : presentedOfferingContext, (i & 8) != 0 ? null : d, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : period, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : replacementMode, (i & 512) != 0 ? x.A : list3, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? null : str4);
    }

    public static ReceiptInfo copy$default(ReceiptInfo receiptInfo, List list, Long l, PresentedOfferingContext presentedOfferingContext, Double d, String str, String str2, Period period, List list2, ReplacementMode replacementMode, List list3, boolean z, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = receiptInfo.productIDs;
        }
        return receiptInfo.copy(list, (i & 2) != 0 ? receiptInfo.purchaseTime : l, (i & 4) != 0 ? receiptInfo.presentedOfferingContext : presentedOfferingContext, (i & 8) != 0 ? receiptInfo.price : d, (i & 16) != 0 ? receiptInfo.formattedPrice : str, (i & 32) != 0 ? receiptInfo.currency : str2, (i & 64) != 0 ? receiptInfo.period : period, (i & 128) != 0 ? receiptInfo.pricingPhases : list2, (i & 256) != 0 ? receiptInfo.replacementMode : replacementMode, (i & 512) != 0 ? receiptInfo.platformProductIds : list3, (i & 1024) != 0 ? receiptInfo.sdkOriginated : z, (i & 2048) != 0 ? receiptInfo.storeUserID : str3, (i & 4096) != 0 ? receiptInfo.marketplace : str4);
    }

    public static void getDuration$annotations() {
    }

    public static void getPeriod$annotations() {
    }

    public static void getPresentedOfferingContext$annotations() {
    }

    public static void getReplacementMode$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(ReceiptInfo self, b output, e serialDesc) {
        String iso8601;
        a[] aVarArr = $childSerializers;
        output.C(serialDesc, 0, aVarArr[0], self.productIDs);
        if (output.k(serialDesc) || self.purchaseTime != null) {
            output.x(serialDesc, 1, k0.a, self.purchaseTime);
        }
        if (output.k(serialDesc) || self.presentedOfferingContext != null) {
            output.x(serialDesc, 2, PresentedOfferingContextSerializer.INSTANCE, self.presentedOfferingContext);
        }
        if (output.k(serialDesc) || self.price != null) {
            output.x(serialDesc, 3, q.a, self.price);
        }
        if (output.k(serialDesc) || self.formattedPrice != null) {
            output.x(serialDesc, 4, b1.a, self.formattedPrice);
        }
        if (output.k(serialDesc) || self.currency != null) {
            output.x(serialDesc, 5, b1.a, self.currency);
        }
        if (output.k(serialDesc) || self.period != null) {
            output.x(serialDesc, 6, PeriodSerializer.INSTANCE, self.period);
        }
        if (output.k(serialDesc) || self.pricingPhases != null) {
            output.x(serialDesc, 7, aVarArr[7], self.pricingPhases);
        }
        if (output.k(serialDesc) || self.replacementMode != null) {
            output.x(serialDesc, 8, ReplacementModeSerializer.INSTANCE, self.replacementMode);
        }
        if (output.k(serialDesc) || !m.a(self.platformProductIds, x.A)) {
            output.C(serialDesc, 9, aVarArr[9], self.platformProductIds);
        }
        if (output.k(serialDesc) || self.sdkOriginated) {
            output.u(serialDesc, 10, self.sdkOriginated);
        }
        if (output.k(serialDesc) || self.storeUserID != null) {
            output.x(serialDesc, 11, b1.a, self.storeUserID);
        }
        if (output.k(serialDesc) || self.marketplace != null) {
            output.x(serialDesc, 12, b1.a, self.marketplace);
        }
        if (!output.k(serialDesc)) {
            String str = self.duration;
            Period period = self.period;
            String str2 = null;
            if (period != null && (iso8601 = period.getIso8601()) != null && iso8601.length() != 0) {
                str2 = iso8601;
            }
            if (m.a(str, str2)) {
                return;
            }
        }
        output.x(serialDesc, 13, b1.a, self.duration);
    }

    public final List<String> component1() {
        return this.productIDs;
    }

    public final List<Map<String, String>> component10() {
        return this.platformProductIds;
    }

    public final boolean getSdkOriginated() {
        return this.sdkOriginated;
    }

    public final String getStoreUserID() {
        return this.storeUserID;
    }

    public final String getMarketplace() {
        return this.marketplace;
    }

    public final Long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final Double getPrice() {
        return this.price;
    }

    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Period getPeriod() {
        return this.period;
    }

    public final List<PricingPhase> component8() {
        return this.pricingPhases;
    }

    public final ReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public final ReceiptInfo copy(List<String> productIDs, Long purchaseTime, PresentedOfferingContext presentedOfferingContext, Double price, String formattedPrice, String currency, Period period, List<PricingPhase> pricingPhases, ReplacementMode replacementMode, List<? extends Map<String, String>> platformProductIds, boolean sdkOriginated, String storeUserID, String marketplace) {
        m.e(productIDs, "productIDs");
        m.e(platformProductIds, "platformProductIds");
        return new ReceiptInfo(productIDs, purchaseTime, presentedOfferingContext, price, formattedPrice, currency, period, pricingPhases, replacementMode, platformProductIds, sdkOriginated, storeUserID, marketplace);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReceiptInfo)) {
            return false;
        }
        ReceiptInfo receiptInfo = (ReceiptInfo) other;
        return m.a(this.productIDs, receiptInfo.productIDs) && m.a(this.purchaseTime, receiptInfo.purchaseTime) && m.a(this.presentedOfferingContext, receiptInfo.presentedOfferingContext) && m.a(this.price, receiptInfo.price) && m.a(this.formattedPrice, receiptInfo.formattedPrice) && m.a(this.currency, receiptInfo.currency) && m.a(this.period, receiptInfo.period) && m.a(this.pricingPhases, receiptInfo.pricingPhases) && m.a(this.replacementMode, receiptInfo.replacementMode) && m.a(this.platformProductIds, receiptInfo.platformProductIds) && this.sdkOriginated == receiptInfo.sdkOriginated && m.a(this.storeUserID, receiptInfo.storeUserID) && m.a(this.marketplace, receiptInfo.marketplace);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    public final String getMarketplace() {
        return this.marketplace;
    }

    public final Period getPeriod() {
        return this.period;
    }

    public final List<Map<String, String>> getPlatformProductIds() {
        return this.platformProductIds;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final Double getPrice() {
        return this.price;
    }

    public final List<PricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    public final List<String> getProductIDs() {
        return this.productIDs;
    }

    public final Long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final ReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public final boolean getSdkOriginated() {
        return this.sdkOriginated;
    }

    public final String getStoreUserID() {
        return this.storeUserID;
    }

    public int hashCode() {
        int iHashCode = this.productIDs.hashCode() * 31;
        Long l = this.purchaseTime;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        int iHashCode3 = (iHashCode2 + (presentedOfferingContext == null ? 0 : presentedOfferingContext.hashCode())) * 31;
        Double d = this.price;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.formattedPrice;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Period period = this.period;
        int iHashCode7 = (iHashCode6 + (period == null ? 0 : period.hashCode())) * 31;
        List<PricingPhase> list = this.pricingPhases;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        ReplacementMode replacementMode = this.replacementMode;
        int iE = w.c.e(g4.c.a((iHashCode8 + (replacementMode == null ? 0 : replacementMode.hashCode())) * 31, 31, this.platformProductIds), 31, this.sdkOriginated);
        String str3 = this.storeUserID;
        int iHashCode9 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.marketplace;
        return iHashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ReceiptInfo(productIDs=");
        sb.append(this.productIDs);
        sb.append(", purchaseTime=");
        sb.append(this.purchaseTime);
        sb.append(", presentedOfferingContext=");
        sb.append(this.presentedOfferingContext);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", formattedPrice=");
        sb.append(this.formattedPrice);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", period=");
        sb.append(this.period);
        sb.append(", pricingPhases=");
        sb.append(this.pricingPhases);
        sb.append(", replacementMode=");
        sb.append(this.replacementMode);
        sb.append(", platformProductIds=");
        sb.append(this.platformProductIds);
        sb.append(", sdkOriginated=");
        sb.append(this.sdkOriginated);
        sb.append(", storeUserID=");
        sb.append(this.storeUserID);
        sb.append(", marketplace=");
        return g4.c.k(sb, this.marketplace, ')');
    }
}

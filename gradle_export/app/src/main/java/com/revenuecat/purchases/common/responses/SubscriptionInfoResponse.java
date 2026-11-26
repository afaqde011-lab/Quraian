package com.revenuecat.purchases.common.responses;

import com.revenuecat.purchases.OwnershipType;
import com.revenuecat.purchases.PeriodType;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.StoreSerializer;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer;
import g00.c;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import p40.b1;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\b\u0081\b\u0018\u0000 s2\u00020\u0001:\u0003tsuBÁ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001a\u0010\u001bBå\u0001\b\u0011\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001a\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\"J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\"J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\"J\u0010\u0010,\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\"J\u0012\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\"J\u0012\u00104\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b4\u00102J\u0012\u00105\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b7\u00102J\u0012\u00108\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b8\u00102JÒ\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b;\u00102J\u0010\u0010<\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010?\u001a\u00020\b2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b?\u0010@J(\u0010I\u001a\u00020F2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DHÁ\u0001¢\u0006\u0004\bG\u0010HR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010J\u0012\u0004\bL\u0010M\u001a\u0004\bK\u0010\"R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010J\u0012\u0004\bO\u0010M\u001a\u0004\bN\u0010\"R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010J\u0012\u0004\bQ\u0010M\u001a\u0004\bP\u0010\"R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010R\u0012\u0004\bT\u0010M\u001a\u0004\bS\u0010&R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010U\u0012\u0004\bV\u0010M\u001a\u0004\b\t\u0010(R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010J\u0012\u0004\bX\u0010M\u001a\u0004\bW\u0010\"R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010J\u0012\u0004\bZ\u0010M\u001a\u0004\bY\u0010\"R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010J\u0012\u0004\b\\\u0010M\u001a\u0004\b[\u0010\"R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010]\u0012\u0004\b_\u0010M\u001a\u0004\b^\u0010-R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010`\u0012\u0004\bb\u0010M\u001a\u0004\ba\u0010/R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010J\u0012\u0004\bd\u0010M\u001a\u0004\bc\u0010\"R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010e\u0012\u0004\bg\u0010M\u001a\u0004\bf\u00102R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010J\u0012\u0004\bi\u0010M\u001a\u0004\bh\u0010\"R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010e\u0012\u0004\bk\u0010M\u001a\u0004\bj\u00102R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010l\u0012\u0004\bn\u0010M\u001a\u0004\bm\u00106R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010e\u0012\u0004\bp\u0010M\u001a\u0004\bo\u00102R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010e\u0012\u0004\br\u0010M\u001a\u0004\bq\u00102¨\u0006v"}, d2 = {"Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse;", "", "Ljava/util/Date;", "purchaseDate", "originalPurchaseDate", "expiresDate", "Lcom/revenuecat/purchases/Store;", ProductResponseJsonKeys.STORE, "", "isSandbox", "unsubscribeDetectedAt", "billingIssuesDetectedAt", "gracePeriodExpiresDate", "Lcom/revenuecat/purchases/OwnershipType;", "ownershipType", "Lcom/revenuecat/purchases/PeriodType;", "periodType", "refundedAt", "", "storeTransactionId", "autoResumeDate", "displayName", "Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse$PriceResponse;", "price", "productPlanIdentifier", "managementURL", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/Store;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/OwnershipType;Lcom/revenuecat/purchases/PeriodType;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse$PriceResponse;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/Store;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/OwnershipType;Lcom/revenuecat/purchases/PeriodType;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse$PriceResponse;Ljava/lang/String;Ljava/lang/String;Lp40/x0;)V", "component1", "()Ljava/util/Date;", "component2", "component3", "component4", "()Lcom/revenuecat/purchases/Store;", "component5", "()Z", "component6", "component7", "component8", "component9", "()Lcom/revenuecat/purchases/OwnershipType;", "component10", "()Lcom/revenuecat/purchases/PeriodType;", "component11", "component12", "()Ljava/lang/String;", "component13", "component14", "component15", "()Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse$PriceResponse;", "component16", "component17", "copy", "(Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/Store;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/OwnershipType;Lcom/revenuecat/purchases/PeriodType;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse$PriceResponse;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse;Lo40/b;Ln40/e;)V", "write$Self", "Ljava/util/Date;", "getPurchaseDate", "getPurchaseDate$annotations", "()V", "getOriginalPurchaseDate", "getOriginalPurchaseDate$annotations", "getExpiresDate", "getExpiresDate$annotations", "Lcom/revenuecat/purchases/Store;", "getStore", "getStore$annotations", "Z", "isSandbox$annotations", "getUnsubscribeDetectedAt", "getUnsubscribeDetectedAt$annotations", "getBillingIssuesDetectedAt", "getBillingIssuesDetectedAt$annotations", "getGracePeriodExpiresDate", "getGracePeriodExpiresDate$annotations", "Lcom/revenuecat/purchases/OwnershipType;", "getOwnershipType", "getOwnershipType$annotations", "Lcom/revenuecat/purchases/PeriodType;", "getPeriodType", "getPeriodType$annotations", "getRefundedAt", "getRefundedAt$annotations", "Ljava/lang/String;", "getStoreTransactionId", "getStoreTransactionId$annotations", "getAutoResumeDate", "getAutoResumeDate$annotations", "getDisplayName", "getDisplayName$annotations", "Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse$PriceResponse;", "getPrice", "getPrice$annotations", "getProductPlanIdentifier", "getProductPlanIdentifier$annotations", "getManagementURL", "getManagementURL$annotations", "Companion", "$serializer", "PriceResponse", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SubscriptionInfoResponse {
    private final Date autoResumeDate;
    private final Date billingIssuesDetectedAt;
    private final String displayName;
    private final Date expiresDate;
    private final Date gracePeriodExpiresDate;
    private final boolean isSandbox;
    private final String managementURL;
    private final Date originalPurchaseDate;
    private final OwnershipType ownershipType;
    private final PeriodType periodType;
    private final PriceResponse price;
    private final String productPlanIdentifier;
    private final Date purchaseDate;
    private final Date refundedAt;
    private final Store store;
    private final String storeTransactionId;
    private final Date unsubscribeDetectedAt;

    public static final Companion INSTANCE = new Companion(null);
    private static final a[] $childSerializers = {null, null, null, null, null, null, null, null, OwnershipType.INSTANCE.serializer(), PeriodType.INSTANCE.serializer(), null, null, null, null, null, null, null};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return SubscriptionInfoResponse$$serializer.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 /2\u00020\u0001:\u00020/B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010\u001e¨\u00061"}, d2 = {"Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse$PriceResponse;", "", "", "amount", "", "currencyCode", "<init>", "(DLjava/lang/String;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(IDLjava/lang/String;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse$PriceResponse;Lo40/b;Ln40/e;)V", "write$Self", "Ljava/util/Locale;", "locale", "Lcom/revenuecat/purchases/models/Price;", "toPrice", "(Ljava/util/Locale;)Lcom/revenuecat/purchases/models/Price;", "component1", "()D", "component2", "()Ljava/lang/String;", "copy", "(DLjava/lang/String;)Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse$PriceResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getAmount", "getAmount$annotations", "()V", "Ljava/lang/String;", "getCurrencyCode", "getCurrencyCode$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PriceResponse {

        public static final Companion INSTANCE = new Companion(null);
        private final double amount;
        private final String currencyCode;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse$PriceResponse$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse$PriceResponse;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return SubscriptionInfoResponse$PriceResponse$$serializer.INSTANCE;
            }
        }

        public PriceResponse(double d, String currencyCode) {
            m.e(currencyCode, "currencyCode");
            this.amount = d;
            this.currencyCode = currencyCode;
        }

        @c
        public PriceResponse(int i, double d, String str, x0 x0Var) {
            if (3 != (i & 3)) {
                o0.g(i, 3, SubscriptionInfoResponse$PriceResponse$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.amount = d;
            this.currencyCode = str;
        }

        public static PriceResponse copy$default(PriceResponse priceResponse, double d, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                d = priceResponse.amount;
            }
            if ((i & 2) != 0) {
                str = priceResponse.currencyCode;
            }
            return priceResponse.copy(d, str);
        }

        public static void getAmount$annotations() {
        }

        public static void getCurrencyCode$annotations() {
        }

        public static final void write$Self$purchases_defaultsBc8Release(PriceResponse self, b output, e serialDesc) {
            output.B(serialDesc, 0, self.amount);
            output.i(serialDesc, 1, self.currencyCode);
        }

        public final double getAmount() {
            return this.amount;
        }

        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        public final PriceResponse copy(double amount, String currencyCode) {
            m.e(currencyCode, "currencyCode");
            return new PriceResponse(amount, currencyCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceResponse)) {
                return false;
            }
            PriceResponse priceResponse = (PriceResponse) other;
            return Double.compare(this.amount, priceResponse.amount) == 0 && m.a(this.currencyCode, priceResponse.currencyCode);
        }

        public final double getAmount() {
            return this.amount;
        }

        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        public int hashCode() {
            return this.currencyCode.hashCode() + (Double.hashCode(this.amount) * 31);
        }

        public final Price toPrice(Locale locale) {
            m.e(locale, "locale");
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
            currencyInstance.setCurrency(Currency.getInstance(this.currencyCode));
            String formatted = currencyInstance.format(this.amount);
            m.d(formatted, "formatted");
            return new Price(formatted, (long) (this.amount * 1000000.0d), this.currencyCode);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PriceResponse(amount=");
            sb.append(this.amount);
            sb.append(", currencyCode=");
            return g4.c.k(sb, this.currencyCode, ')');
        }
    }

    @c
    public SubscriptionInfoResponse(int i, Date date, Date date2, Date date3, Store store, boolean z, Date date4, Date date5, Date date6, OwnershipType ownershipType, PeriodType periodType, Date date7, String str, Date date8, String str2, PriceResponse priceResponse, String str3, String str4, x0 x0Var) {
        if (537 != (i & 537)) {
            o0.g(i, 537, SubscriptionInfoResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.purchaseDate = date;
        if ((i & 2) == 0) {
            this.originalPurchaseDate = null;
        } else {
            this.originalPurchaseDate = date2;
        }
        if ((i & 4) == 0) {
            this.expiresDate = null;
        } else {
            this.expiresDate = date3;
        }
        this.store = store;
        this.isSandbox = z;
        if ((i & 32) == 0) {
            this.unsubscribeDetectedAt = null;
        } else {
            this.unsubscribeDetectedAt = date4;
        }
        if ((i & 64) == 0) {
            this.billingIssuesDetectedAt = null;
        } else {
            this.billingIssuesDetectedAt = date5;
        }
        if ((i & 128) == 0) {
            this.gracePeriodExpiresDate = null;
        } else {
            this.gracePeriodExpiresDate = date6;
        }
        if ((i & 256) == 0) {
            this.ownershipType = OwnershipType.UNKNOWN;
        } else {
            this.ownershipType = ownershipType;
        }
        this.periodType = periodType;
        if ((i & 1024) == 0) {
            this.refundedAt = null;
        } else {
            this.refundedAt = date7;
        }
        if ((i & 2048) == 0) {
            this.storeTransactionId = null;
        } else {
            this.storeTransactionId = str;
        }
        if ((i & 4096) == 0) {
            this.autoResumeDate = null;
        } else {
            this.autoResumeDate = date8;
        }
        if ((i & 8192) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str2;
        }
        if ((i & 16384) == 0) {
            this.price = null;
        } else {
            this.price = priceResponse;
        }
        if ((32768 & i) == 0) {
            this.productPlanIdentifier = null;
        } else {
            this.productPlanIdentifier = str3;
        }
        if ((i & 65536) == 0) {
            this.managementURL = null;
        } else {
            this.managementURL = str4;
        }
    }

    public SubscriptionInfoResponse(Date purchaseDate, Date date, Date date2, Store store, boolean z, Date date3, Date date4, Date date5, OwnershipType ownershipType, PeriodType periodType, Date date6, String str, Date date7, String str2, PriceResponse priceResponse, String str3, String str4) {
        m.e(purchaseDate, "purchaseDate");
        m.e(store, "store");
        m.e(ownershipType, "ownershipType");
        m.e(periodType, "periodType");
        this.purchaseDate = purchaseDate;
        this.originalPurchaseDate = date;
        this.expiresDate = date2;
        this.store = store;
        this.isSandbox = z;
        this.unsubscribeDetectedAt = date3;
        this.billingIssuesDetectedAt = date4;
        this.gracePeriodExpiresDate = date5;
        this.ownershipType = ownershipType;
        this.periodType = periodType;
        this.refundedAt = date6;
        this.storeTransactionId = str;
        this.autoResumeDate = date7;
        this.displayName = str2;
        this.price = priceResponse;
        this.productPlanIdentifier = str3;
        this.managementURL = str4;
    }

    public SubscriptionInfoResponse(Date date, Date date2, Date date3, Store store, boolean z, Date date4, Date date5, Date date6, OwnershipType ownershipType, PeriodType periodType, Date date7, String str, Date date8, String str2, PriceResponse priceResponse, String str3, String str4, int i, f fVar) {
        this(date, (i & 2) != 0 ? null : date2, (i & 4) != 0 ? null : date3, store, z, (i & 32) != 0 ? null : date4, (i & 64) != 0 ? null : date5, (i & 128) != 0 ? null : date6, (i & 256) != 0 ? OwnershipType.UNKNOWN : ownershipType, periodType, (i & 1024) != 0 ? null : date7, (i & 2048) != 0 ? null : str, (i & 4096) != 0 ? null : date8, (i & 8192) != 0 ? null : str2, (i & 16384) != 0 ? null : priceResponse, (32768 & i) != 0 ? null : str3, (i & 65536) != 0 ? null : str4);
    }

    public static SubscriptionInfoResponse copy$default(SubscriptionInfoResponse subscriptionInfoResponse, Date date, Date date2, Date date3, Store store, boolean z, Date date4, Date date5, Date date6, OwnershipType ownershipType, PeriodType periodType, Date date7, String str, Date date8, String str2, PriceResponse priceResponse, String str3, String str4, int i, Object obj) {
        String str5;
        String str6;
        Date date9 = (i & 1) != 0 ? subscriptionInfoResponse.purchaseDate : date;
        Date date10 = (i & 2) != 0 ? subscriptionInfoResponse.originalPurchaseDate : date2;
        Date date11 = (i & 4) != 0 ? subscriptionInfoResponse.expiresDate : date3;
        Store store2 = (i & 8) != 0 ? subscriptionInfoResponse.store : store;
        boolean z2 = (i & 16) != 0 ? subscriptionInfoResponse.isSandbox : z;
        Date date12 = (i & 32) != 0 ? subscriptionInfoResponse.unsubscribeDetectedAt : date4;
        Date date13 = (i & 64) != 0 ? subscriptionInfoResponse.billingIssuesDetectedAt : date5;
        Date date14 = (i & 128) != 0 ? subscriptionInfoResponse.gracePeriodExpiresDate : date6;
        OwnershipType ownershipType2 = (i & 256) != 0 ? subscriptionInfoResponse.ownershipType : ownershipType;
        PeriodType periodType2 = (i & 512) != 0 ? subscriptionInfoResponse.periodType : periodType;
        Date date15 = (i & 1024) != 0 ? subscriptionInfoResponse.refundedAt : date7;
        String str7 = (i & 2048) != 0 ? subscriptionInfoResponse.storeTransactionId : str;
        Date date16 = (i & 4096) != 0 ? subscriptionInfoResponse.autoResumeDate : date8;
        String str8 = (i & 8192) != 0 ? subscriptionInfoResponse.displayName : str2;
        Date date17 = date9;
        PriceResponse priceResponse2 = (i & 16384) != 0 ? subscriptionInfoResponse.price : priceResponse;
        String str9 = (i & 32768) != 0 ? subscriptionInfoResponse.productPlanIdentifier : str3;
        if ((i & 65536) != 0) {
            str6 = str9;
            str5 = subscriptionInfoResponse.managementURL;
        } else {
            str5 = str4;
            str6 = str9;
        }
        return subscriptionInfoResponse.copy(date17, date10, date11, store2, z2, date12, date13, date14, ownershipType2, periodType2, date15, str7, date16, str8, priceResponse2, str6, str5);
    }

    public static void getAutoResumeDate$annotations() {
    }

    public static void getBillingIssuesDetectedAt$annotations() {
    }

    public static void getDisplayName$annotations() {
    }

    public static void getExpiresDate$annotations() {
    }

    public static void getGracePeriodExpiresDate$annotations() {
    }

    public static void getManagementURL$annotations() {
    }

    public static void getOriginalPurchaseDate$annotations() {
    }

    public static void getOwnershipType$annotations() {
    }

    public static void getPeriodType$annotations() {
    }

    public static void getPrice$annotations() {
    }

    public static void getProductPlanIdentifier$annotations() {
    }

    public static void getPurchaseDate$annotations() {
    }

    public static void getRefundedAt$annotations() {
    }

    public static void getStore$annotations() {
    }

    public static void getStoreTransactionId$annotations() {
    }

    public static void getUnsubscribeDetectedAt$annotations() {
    }

    public static void isSandbox$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(SubscriptionInfoResponse self, b output, e serialDesc) {
        a[] aVarArr = $childSerializers;
        ISO8601DateSerializer iSO8601DateSerializer = ISO8601DateSerializer.INSTANCE;
        output.C(serialDesc, 0, iSO8601DateSerializer, self.purchaseDate);
        if (output.k(serialDesc) || self.originalPurchaseDate != null) {
            output.x(serialDesc, 1, iSO8601DateSerializer, self.originalPurchaseDate);
        }
        if (output.k(serialDesc) || self.expiresDate != null) {
            output.x(serialDesc, 2, iSO8601DateSerializer, self.expiresDate);
        }
        output.C(serialDesc, 3, StoreSerializer.INSTANCE, self.store);
        output.u(serialDesc, 4, self.isSandbox);
        if (output.k(serialDesc) || self.unsubscribeDetectedAt != null) {
            output.x(serialDesc, 5, iSO8601DateSerializer, self.unsubscribeDetectedAt);
        }
        if (output.k(serialDesc) || self.billingIssuesDetectedAt != null) {
            output.x(serialDesc, 6, iSO8601DateSerializer, self.billingIssuesDetectedAt);
        }
        if (output.k(serialDesc) || self.gracePeriodExpiresDate != null) {
            output.x(serialDesc, 7, iSO8601DateSerializer, self.gracePeriodExpiresDate);
        }
        if (output.k(serialDesc) || self.ownershipType != OwnershipType.UNKNOWN) {
            output.C(serialDesc, 8, aVarArr[8], self.ownershipType);
        }
        output.C(serialDesc, 9, aVarArr[9], self.periodType);
        if (output.k(serialDesc) || self.refundedAt != null) {
            output.x(serialDesc, 10, iSO8601DateSerializer, self.refundedAt);
        }
        if (output.k(serialDesc) || self.storeTransactionId != null) {
            output.x(serialDesc, 11, b1.a, self.storeTransactionId);
        }
        if (output.k(serialDesc) || self.autoResumeDate != null) {
            output.x(serialDesc, 12, iSO8601DateSerializer, self.autoResumeDate);
        }
        if (output.k(serialDesc) || self.displayName != null) {
            output.x(serialDesc, 13, b1.a, self.displayName);
        }
        if (output.k(serialDesc) || self.price != null) {
            output.x(serialDesc, 14, SubscriptionInfoResponse$PriceResponse$$serializer.INSTANCE, self.price);
        }
        if (output.k(serialDesc) || self.productPlanIdentifier != null) {
            output.x(serialDesc, 15, b1.a, self.productPlanIdentifier);
        }
        if (!output.k(serialDesc) && self.managementURL == null) {
            return;
        }
        output.x(serialDesc, 16, b1.a, self.managementURL);
    }

    public final Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public final PeriodType getPeriodType() {
        return this.periodType;
    }

    public final Date getRefundedAt() {
        return this.refundedAt;
    }

    public final String getStoreTransactionId() {
        return this.storeTransactionId;
    }

    public final Date getAutoResumeDate() {
        return this.autoResumeDate;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final PriceResponse getPrice() {
        return this.price;
    }

    public final String getProductPlanIdentifier() {
        return this.productPlanIdentifier;
    }

    public final String getManagementURL() {
        return this.managementURL;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final Date getExpiresDate() {
        return this.expiresDate;
    }

    public final Store getStore() {
        return this.store;
    }

    public final boolean getIsSandbox() {
        return this.isSandbox;
    }

    public final Date getUnsubscribeDetectedAt() {
        return this.unsubscribeDetectedAt;
    }

    public final Date getBillingIssuesDetectedAt() {
        return this.billingIssuesDetectedAt;
    }

    public final Date getGracePeriodExpiresDate() {
        return this.gracePeriodExpiresDate;
    }

    public final OwnershipType getOwnershipType() {
        return this.ownershipType;
    }

    public final SubscriptionInfoResponse copy(Date purchaseDate, Date originalPurchaseDate, Date expiresDate, Store store, boolean isSandbox, Date unsubscribeDetectedAt, Date billingIssuesDetectedAt, Date gracePeriodExpiresDate, OwnershipType ownershipType, PeriodType periodType, Date refundedAt, String storeTransactionId, Date autoResumeDate, String displayName, PriceResponse price, String productPlanIdentifier, String managementURL) {
        m.e(purchaseDate, "purchaseDate");
        m.e(store, "store");
        m.e(ownershipType, "ownershipType");
        m.e(periodType, "periodType");
        return new SubscriptionInfoResponse(purchaseDate, originalPurchaseDate, expiresDate, store, isSandbox, unsubscribeDetectedAt, billingIssuesDetectedAt, gracePeriodExpiresDate, ownershipType, periodType, refundedAt, storeTransactionId, autoResumeDate, displayName, price, productPlanIdentifier, managementURL);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionInfoResponse)) {
            return false;
        }
        SubscriptionInfoResponse subscriptionInfoResponse = (SubscriptionInfoResponse) other;
        return m.a(this.purchaseDate, subscriptionInfoResponse.purchaseDate) && m.a(this.originalPurchaseDate, subscriptionInfoResponse.originalPurchaseDate) && m.a(this.expiresDate, subscriptionInfoResponse.expiresDate) && this.store == subscriptionInfoResponse.store && this.isSandbox == subscriptionInfoResponse.isSandbox && m.a(this.unsubscribeDetectedAt, subscriptionInfoResponse.unsubscribeDetectedAt) && m.a(this.billingIssuesDetectedAt, subscriptionInfoResponse.billingIssuesDetectedAt) && m.a(this.gracePeriodExpiresDate, subscriptionInfoResponse.gracePeriodExpiresDate) && this.ownershipType == subscriptionInfoResponse.ownershipType && this.periodType == subscriptionInfoResponse.periodType && m.a(this.refundedAt, subscriptionInfoResponse.refundedAt) && m.a(this.storeTransactionId, subscriptionInfoResponse.storeTransactionId) && m.a(this.autoResumeDate, subscriptionInfoResponse.autoResumeDate) && m.a(this.displayName, subscriptionInfoResponse.displayName) && m.a(this.price, subscriptionInfoResponse.price) && m.a(this.productPlanIdentifier, subscriptionInfoResponse.productPlanIdentifier) && m.a(this.managementURL, subscriptionInfoResponse.managementURL);
    }

    public final Date getAutoResumeDate() {
        return this.autoResumeDate;
    }

    public final Date getBillingIssuesDetectedAt() {
        return this.billingIssuesDetectedAt;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Date getExpiresDate() {
        return this.expiresDate;
    }

    public final Date getGracePeriodExpiresDate() {
        return this.gracePeriodExpiresDate;
    }

    public final String getManagementURL() {
        return this.managementURL;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final OwnershipType getOwnershipType() {
        return this.ownershipType;
    }

    public final PeriodType getPeriodType() {
        return this.periodType;
    }

    public final PriceResponse getPrice() {
        return this.price;
    }

    public final String getProductPlanIdentifier() {
        return this.productPlanIdentifier;
    }

    public final Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public final Date getRefundedAt() {
        return this.refundedAt;
    }

    public final Store getStore() {
        return this.store;
    }

    public final String getStoreTransactionId() {
        return this.storeTransactionId;
    }

    public final Date getUnsubscribeDetectedAt() {
        return this.unsubscribeDetectedAt;
    }

    public int hashCode() {
        int iHashCode = this.purchaseDate.hashCode() * 31;
        Date date = this.originalPurchaseDate;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expiresDate;
        int iE = w.c.e((this.store.hashCode() + ((iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31)) * 31, 31, this.isSandbox);
        Date date3 = this.unsubscribeDetectedAt;
        int iHashCode3 = (iE + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.billingIssuesDetectedAt;
        int iHashCode4 = (iHashCode3 + (date4 == null ? 0 : date4.hashCode())) * 31;
        Date date5 = this.gracePeriodExpiresDate;
        int iHashCode5 = (this.periodType.hashCode() + ((this.ownershipType.hashCode() + ((iHashCode4 + (date5 == null ? 0 : date5.hashCode())) * 31)) * 31)) * 31;
        Date date6 = this.refundedAt;
        int iHashCode6 = (iHashCode5 + (date6 == null ? 0 : date6.hashCode())) * 31;
        String str = this.storeTransactionId;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Date date7 = this.autoResumeDate;
        int iHashCode8 = (iHashCode7 + (date7 == null ? 0 : date7.hashCode())) * 31;
        String str2 = this.displayName;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PriceResponse priceResponse = this.price;
        int iHashCode10 = (iHashCode9 + (priceResponse == null ? 0 : priceResponse.hashCode())) * 31;
        String str3 = this.productPlanIdentifier;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.managementURL;
        return iHashCode11 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isSandbox() {
        return this.isSandbox;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionInfoResponse(purchaseDate=");
        sb.append(this.purchaseDate);
        sb.append(", originalPurchaseDate=");
        sb.append(this.originalPurchaseDate);
        sb.append(", expiresDate=");
        sb.append(this.expiresDate);
        sb.append(", store=");
        sb.append(this.store);
        sb.append(", isSandbox=");
        sb.append(this.isSandbox);
        sb.append(", unsubscribeDetectedAt=");
        sb.append(this.unsubscribeDetectedAt);
        sb.append(", billingIssuesDetectedAt=");
        sb.append(this.billingIssuesDetectedAt);
        sb.append(", gracePeriodExpiresDate=");
        sb.append(this.gracePeriodExpiresDate);
        sb.append(", ownershipType=");
        sb.append(this.ownershipType);
        sb.append(", periodType=");
        sb.append(this.periodType);
        sb.append(", refundedAt=");
        sb.append(this.refundedAt);
        sb.append(", storeTransactionId=");
        sb.append(this.storeTransactionId);
        sb.append(", autoResumeDate=");
        sb.append(this.autoResumeDate);
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", productPlanIdentifier=");
        sb.append(this.productPlanIdentifier);
        sb.append(", managementURL=");
        return g4.c.k(sb, this.managementURL, ')');
    }
}

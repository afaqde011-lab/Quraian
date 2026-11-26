package com.revenuecat.purchases;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.caching.LocalTransactionMetadata;
import com.revenuecat.purchases.common.caching.LocalTransactionMetadataStore;
import com.revenuecat.purchases.common.networking.PostReceiptProductInfo;
import com.revenuecat.purchases.common.networking.PostReceiptResponse;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData;
import com.revenuecat.purchases.subscriberattributes.BackendHelpersKt;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.utils.Result;
import g00.b0;
import h00.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import u00.k;
import u00.o;

@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001:\u0001jBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015Jg\u0010\"\u001a\u00020\u001f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0018\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a0\u00192\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u0002¢\u0006\u0004\b\"\u0010#Jy\u00104\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001f0\u001e2$\u0010 \u001a \u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u000201\u0012\u0006\u0012\u0004\u0018\u000102\u0012\u0004\u0012\u00020\u001f00j\u0002`3H\u0002¢\u0006\u0004\b4\u00105J+\u00107\u001a\u000206*\u00020\u00122\u0006\u0010&\u001a\u00020$2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b7\u00108J\u008b\u0001\u0010>\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\b\u0010:\u001a\u0004\u0018\u0001092\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020'2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001f0\u001e2$\u0010 \u001a \u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u000201\u0012\u0006\u0012\u0004\u0018\u000102\u0012\u0004\u0012\u00020\u001f00j\u0002`3H\u0002¢\u0006\u0004\b>\u0010?JA\u0010B\u001a\u00020\u001f2\u0006\u0010@\u001a\u0002012\u0006\u0010%\u001a\u00020$2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0AH\u0002¢\u0006\u0004\bB\u0010CJ?\u0010D\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020$2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\bD\u0010EJi\u0010G\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020$2\u0006\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010,\u001a\u00020+2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f0\u001e2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010'¢\u0006\u0004\bG\u0010HJ\u009f\u0001\u0010T\u001a\u00020\u001f2\u0006\u0010J\u001a\u00020I2\b\u0010L\u001a\u0004\u0018\u00010K2\u0014\u0010O\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020N\u0018\u00010M2\u0006\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010P\u001a\u00020'2\"\b\u0002\u0010!\u001a\u001c\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f\u0018\u00010Qj\u0004\u0018\u0001`R2\"\b\u0002\u0010 \u001a\u001c\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f\u0018\u00010Qj\u0004\u0018\u0001`S¢\u0006\u0004\bT\u0010UJa\u0010Z\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020$2\u0006\u0010V\u001a\u00020'2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020$0W2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001f0A2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f0\u001e2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\bZ\u0010[R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\\R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010]R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010^R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010_R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010`R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010aR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010bR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010cR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010dR\u0014\u0010g\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010<\u001a\u00020;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010i¨\u0006k"}, d2 = {"Lcom/revenuecat/purchases/PostReceiptHelper;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "customerInfoUpdateHandler", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "subscriberAttributesManager", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "paywallPresentedCache", "Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadataStore;", "localTransactionMetadataStore", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadataStore;)V", "", "Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;", "transactionMetadataToSync", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/revenuecat/purchases/PurchasesError;", "results", "Lkotlin/Function1;", "Lg00/b0;", "onError", "onSuccess", "callTransactionMetadataCompletionFromResults", "(Ljava/util/List;Ljava/util/concurrent/ConcurrentLinkedQueue;Lu00/k;Lu00/k;)V", "", "appUserID", "purchaseToken", "", "isRestore", "Lcom/revenuecat/purchases/common/ReceiptInfo;", "receiptInfo", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "Lcom/revenuecat/purchases/models/PurchaseState;", "purchaseState", "Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "Lkotlin/Function3;", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/common/PostReceiptDataErrorCallback;", "postReceiptAndSubscriberAttributes", "(Ljava/lang/String;Ljava/lang/String;ZLcom/revenuecat/purchases/common/ReceiptInfo;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lcom/revenuecat/purchases/models/PurchaseState;Lu00/k;Lu00/o;)V", "Lcom/revenuecat/purchases/PostReceiptHelper$CachedDataToPost;", "getOrPutDataToPost", "(Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadataStore;Ljava/lang/String;Lcom/revenuecat/purchases/common/ReceiptInfo;Lcom/revenuecat/purchases/PostReceiptInitiationSource;)Lcom/revenuecat/purchases/PostReceiptHelper$CachedDataToPost;", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "paywallData", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "purchasesAreCompletedBy", "hasCachedTransactionMetadata", "performPostReceipt", "(Ljava/lang/String;Ljava/lang/String;ZLcom/revenuecat/purchases/common/ReceiptInfo;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;Lcom/revenuecat/purchases/PurchasesAreCompletedBy;ZLu00/k;Lu00/o;)V", "errorHandlingBehavior", "Lkotlin/Function0;", "useOfflineEntitlementsCustomerInfoIfNeeded", "(Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Ljava/lang/String;Lu00/k;Lu00/a;)V", "calculateOfflineCustomerInfo", "(Ljava/lang/String;Lu00/k;Lu00/k;)V", "isAutoRenewing", "postTokenWithoutConsuming", "(Ljava/lang/String;Lcom/revenuecat/purchases/common/ReceiptInfo;ZLjava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lu00/k;Lu00/k;Ljava/lang/Boolean;)V", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchase", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "subscriptionOptionForProductIDs", "sdkOriginated", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/SuccessfulPurchaseCallback;", "Lcom/revenuecat/purchases/ErrorPurchaseCallback;", "postTransactionAndConsumeIfNeeded", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/models/StoreProduct;Ljava/util/Map;ZLjava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;ZLu00/n;Lu00/n;)V", "allowSharingPlayStoreAccount", "", "pendingTransactionsTokens", "onNoTransactionsToSync", "postRemainingCachedTransactionMetadata", "(Ljava/lang/String;ZLjava/util/Set;Lu00/a;Lu00/k;Lu00/k;)V", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadataStore;", "getFinishTransactions", "()Z", "finishTransactions", "getPurchasesAreCompletedBy", "()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "CachedDataToPost", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PostReceiptHelper {
    private final AppConfig appConfig;
    private final Backend backend;
    private final BillingAbstract billing;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DeviceCache deviceCache;
    private final LocalTransactionMetadataStore localTransactionMetadataStore;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PaywallPresentedCache paywallPresentedCache;
    private final SubscriberAttributesManager subscriberAttributesManager;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/PostReceiptHelper$CachedDataToPost;", "", "localTransactionMetadata", "Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;", "paywallEvent", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "didCacheData", "", "(Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;Z)V", "getDidCacheData", "()Z", "getLocalTransactionMetadata", "()Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;", "getPaywallEvent", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CachedDataToPost {
        private final boolean didCacheData;
        private final LocalTransactionMetadata localTransactionMetadata;
        private final PaywallEvent paywallEvent;

        public CachedDataToPost(LocalTransactionMetadata localTransactionMetadata, PaywallEvent paywallEvent, boolean z) {
            this.localTransactionMetadata = localTransactionMetadata;
            this.paywallEvent = paywallEvent;
            this.didCacheData = z;
        }

        public static CachedDataToPost copy$default(CachedDataToPost cachedDataToPost, LocalTransactionMetadata localTransactionMetadata, PaywallEvent paywallEvent, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                localTransactionMetadata = cachedDataToPost.localTransactionMetadata;
            }
            if ((i & 2) != 0) {
                paywallEvent = cachedDataToPost.paywallEvent;
            }
            if ((i & 4) != 0) {
                z = cachedDataToPost.didCacheData;
            }
            return cachedDataToPost.copy(localTransactionMetadata, paywallEvent, z);
        }

        public final LocalTransactionMetadata getLocalTransactionMetadata() {
            return this.localTransactionMetadata;
        }

        public final PaywallEvent getPaywallEvent() {
            return this.paywallEvent;
        }

        public final boolean getDidCacheData() {
            return this.didCacheData;
        }

        public final CachedDataToPost copy(LocalTransactionMetadata localTransactionMetadata, PaywallEvent paywallEvent, boolean didCacheData) {
            return new CachedDataToPost(localTransactionMetadata, paywallEvent, didCacheData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CachedDataToPost)) {
                return false;
            }
            CachedDataToPost cachedDataToPost = (CachedDataToPost) other;
            return m.a(this.localTransactionMetadata, cachedDataToPost.localTransactionMetadata) && m.a(this.paywallEvent, cachedDataToPost.paywallEvent) && this.didCacheData == cachedDataToPost.didCacheData;
        }

        public final boolean getDidCacheData() {
            return this.didCacheData;
        }

        public final LocalTransactionMetadata getLocalTransactionMetadata() {
            return this.localTransactionMetadata;
        }

        public final PaywallEvent getPaywallEvent() {
            return this.paywallEvent;
        }

        public int hashCode() {
            LocalTransactionMetadata localTransactionMetadata = this.localTransactionMetadata;
            int iHashCode = (localTransactionMetadata == null ? 0 : localTransactionMetadata.hashCode()) * 31;
            PaywallEvent paywallEvent = this.paywallEvent;
            return Boolean.hashCode(this.didCacheData) + ((iHashCode + (paywallEvent != null ? paywallEvent.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CachedDataToPost(localTransactionMetadata=");
            sb.append(this.localTransactionMetadata);
            sb.append(", paywallEvent=");
            sb.append(this.paywallEvent);
            sb.append(", didCacheData=");
            return x5.o(sb, this.didCacheData, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements k {
        final k $onSuccess;

        public AnonymousClass1(k kVar) {
            super(1);
            this.$onSuccess = kVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return b0.a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            m.e(customerInfo, "customerInfo");
            PostReceiptHelper.this.customerInfoUpdateHandler.notifyListeners(customerInfo);
            this.$onSuccess.invoke(customerInfo);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends n implements k {
        final k $onError;

        public AnonymousClass2(k kVar) {
            super(1);
            this.$onError = kVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return b0.a;
        }

        public final void invoke(PurchasesError error) {
            m.e(error, "error");
            this.$onError.invoke(error);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "unsyncedSubscriberAttributesByKey", "Lg00/b0;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00441 extends n implements k {
        final String $appUserID;
        final boolean $hasCachedTransactionMetadata;
        final PostReceiptInitiationSource $initiationSource;
        final boolean $isRestore;
        final o $onError;
        final k $onSuccess;
        final PaywallPostReceiptData $paywallData;
        final String $purchaseToken;
        final PurchasesAreCompletedBy $purchasesAreCompletedBy;
        final ReceiptInfo $receiptInfo;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "postReceiptResponse", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C00031 extends n implements k {
            final String $appUserID;
            final boolean $hasCachedTransactionMetadata;
            final k $onSuccess;
            final String $purchaseToken;
            final Map<String, SubscriberAttribute> $unsyncedSubscriberAttributesByKey;
            final PostReceiptHelper this$0;

            public C00031(boolean z, PostReceiptHelper postReceiptHelper, String str, String str2, Map<String, SubscriberAttribute> map, k kVar) {
                super(1);
                this.$hasCachedTransactionMetadata = z;
                this.this$0 = postReceiptHelper;
                this.$purchaseToken = str;
                this.$appUserID = str2;
                this.$unsyncedSubscriberAttributesByKey = map;
                this.$onSuccess = kVar;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((PostReceiptResponse) obj);
                return b0.a;
            }

            public final void invoke(PostReceiptResponse postReceiptResponse) {
                m.e(postReceiptResponse, "postReceiptResponse");
                if (this.$hasCachedTransactionMetadata) {
                    this.this$0.localTransactionMetadataStore.clearLocalTransactionMetadata(w50.c.g0(this.$purchaseToken));
                }
                this.this$0.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
                this.this$0.subscriberAttributesManager.markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, BackendHelpersKt.getAttributeErrors(postReceiptResponse.getBody()));
                this.this$0.customerInfoUpdateHandler.cacheAndNotifyListeners(postReceiptResponse.getCustomerInfo());
                this.$onSuccess.invoke(postReceiptResponse);
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "errorHandlingBehavior", "Lorg/json/JSONObject;", "responseBody", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass2 extends n implements o {
            final String $appUserID;
            final boolean $hasCachedTransactionMetadata;
            final o $onError;
            final String $purchaseToken;
            final Map<String, SubscriberAttribute> $unsyncedSubscriberAttributesByKey;
            final PostReceiptHelper this$0;

            public AnonymousClass2(boolean z, PostReceiptHelper postReceiptHelper, String str, String str2, Map<String, SubscriberAttribute> map, o oVar) {
                super(3);
                this.$hasCachedTransactionMetadata = z;
                this.this$0 = postReceiptHelper;
                this.$purchaseToken = str;
                this.$appUserID = str2;
                this.$unsyncedSubscriberAttributesByKey = map;
                this.$onError = oVar;
            }

            @Override
            public Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((PurchasesError) obj, (PostReceiptErrorHandlingBehavior) obj2, (JSONObject) obj3);
                return b0.a;
            }

            public final void invoke(PurchasesError error, PostReceiptErrorHandlingBehavior errorHandlingBehavior, JSONObject jSONObject) {
                m.e(error, "error");
                m.e(errorHandlingBehavior, "errorHandlingBehavior");
                if (errorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED) {
                    if (this.$hasCachedTransactionMetadata) {
                        this.this$0.localTransactionMetadataStore.clearLocalTransactionMetadata(w50.c.g0(this.$purchaseToken));
                    }
                    this.this$0.subscriberAttributesManager.markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, BackendHelpersKt.getAttributeErrors(jSONObject));
                }
                this.$onError.invoke(error, errorHandlingBehavior, jSONObject);
            }
        }

        public C00441(String str, String str2, boolean z, ReceiptInfo receiptInfo, PostReceiptInitiationSource postReceiptInitiationSource, PaywallPostReceiptData paywallPostReceiptData, PurchasesAreCompletedBy purchasesAreCompletedBy, boolean z2, k kVar, o oVar) {
            super(1);
            this.$purchaseToken = str;
            this.$appUserID = str2;
            this.$isRestore = z;
            this.$receiptInfo = receiptInfo;
            this.$initiationSource = postReceiptInitiationSource;
            this.$paywallData = paywallPostReceiptData;
            this.$purchasesAreCompletedBy = purchasesAreCompletedBy;
            this.$hasCachedTransactionMetadata = z2;
            this.$onSuccess = kVar;
            this.$onError = oVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((Map<String, SubscriberAttribute>) obj);
            return b0.a;
        }

        public final void invoke(Map<String, SubscriberAttribute> unsyncedSubscriberAttributesByKey) {
            m.e(unsyncedSubscriberAttributesByKey, "unsyncedSubscriberAttributesByKey");
            PostReceiptHelper.this.backend.postReceiptData(this.$purchaseToken, this.$appUserID, this.$isRestore, PostReceiptHelper.this.getFinishTransactions(), BackendHelpersKt.toBackendMap(unsyncedSubscriberAttributesByKey), this.$receiptInfo, this.$initiationSource, this.$paywallData, this.$purchasesAreCompletedBy, new C00031(this.$hasCachedTransactionMetadata, PostReceiptHelper.this, this.$purchaseToken, this.$appUserID, unsyncedSubscriberAttributesByKey, this.$onSuccess), new AnonymousClass2(this.$hasCachedTransactionMetadata, PostReceiptHelper.this, this.$purchaseToken, this.$appUserID, unsyncedSubscriberAttributesByKey, this.$onError));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "postReceiptResponse", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00451 extends n implements k {
        final Boolean $isAutoRenewing;
        final k $onSuccess;
        final String $purchaseToken;

        public C00451(String str, Boolean bool, k kVar) {
            super(1);
            this.$purchaseToken = str;
            this.$isAutoRenewing = bool;
            this.$onSuccess = kVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PostReceiptResponse) obj);
            return b0.a;
        }

        public final void invoke(PostReceiptResponse postReceiptResponse) {
            m.e(postReceiptResponse, "postReceiptResponse");
            PostReceiptHelper.this.deviceCache.addSuccessfullyPostedToken(this.$purchaseToken, this.$isAutoRenewing);
            this.$onSuccess.invoke(postReceiptResponse.getCustomerInfo());
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "errorHandlingBehavior", "Lorg/json/JSONObject;", "<anonymous parameter 2>", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00462 extends n implements o {
        final String $appUserID;
        final Boolean $isAutoRenewing;
        final k $onError;
        final k $onSuccess;
        final String $purchaseToken;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass1 extends n implements k {
            final k $onSuccess;

            public AnonymousClass1(k kVar) {
                super(1);
                this.$onSuccess = kVar;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return b0.a;
            }

            public final void invoke(CustomerInfo it) {
                m.e(it, "it");
                this.$onSuccess.invoke(it);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C00042 extends n implements u00.a {
            final PurchasesError $backendError;
            final k $onError;

            public C00042(k kVar, PurchasesError purchasesError) {
                super(0);
                this.$onError = kVar;
                this.$backendError = purchasesError;
            }

            @Override
            public Object invoke() {
                m34invoke();
                return b0.a;
            }

            public final void m34invoke() {
                this.$onError.invoke(this.$backendError);
            }
        }

        public C00462(String str, Boolean bool, String str2, k kVar, k kVar2) {
            super(3);
            this.$purchaseToken = str;
            this.$isAutoRenewing = bool;
            this.$appUserID = str2;
            this.$onSuccess = kVar;
            this.$onError = kVar2;
        }

        @Override
        public Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((PurchasesError) obj, (PostReceiptErrorHandlingBehavior) obj2, (JSONObject) obj3);
            return b0.a;
        }

        public final void invoke(PurchasesError backendError, PostReceiptErrorHandlingBehavior errorHandlingBehavior, JSONObject jSONObject) {
            m.e(backendError, "backendError");
            m.e(errorHandlingBehavior, "errorHandlingBehavior");
            if (errorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED) {
                PostReceiptHelper.this.deviceCache.addSuccessfullyPostedToken(this.$purchaseToken, this.$isAutoRenewing);
            }
            PostReceiptHelper.this.useOfflineEntitlementsCustomerInfoIfNeeded(errorHandlingBehavior, this.$appUserID, new AnonymousClass1(this.$onSuccess), new C00042(this.$onError, backendError));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "postReceiptResponse", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00471 extends n implements k {
        final PostReceiptInitiationSource $initiationSource;
        final u00.n $onSuccess;
        final StoreTransaction $purchase;

        public C00471(StoreTransaction storeTransaction, PostReceiptInitiationSource postReceiptInitiationSource, u00.n nVar) {
            super(1);
            this.$purchase = storeTransaction;
            this.$initiationSource = postReceiptInitiationSource;
            this.$onSuccess = nVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PostReceiptResponse) obj);
            return b0.a;
        }

        public final void invoke(PostReceiptResponse postReceiptResponse) {
            boolean zBooleanValue;
            PostReceiptProductInfo postReceiptProductInfo;
            Boolean shouldConsume;
            m.e(postReceiptResponse, "postReceiptResponse");
            Map<String, PostReceiptProductInfo> productInfoByProductId = postReceiptResponse.getProductInfoByProductId();
            if (productInfoByProductId != null) {
                StoreTransaction storeTransaction = this.$purchase;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, PostReceiptProductInfo> entry : productInfoByProductId.entrySet()) {
                    if (storeTransaction.getProductIds().contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Collection collectionValues = linkedHashMap.values();
                if (collectionValues == null || (postReceiptProductInfo = (PostReceiptProductInfo) q.M0(collectionValues)) == null || (shouldConsume = postReceiptProductInfo.getShouldConsume()) == null) {
                    zBooleanValue = false;
                } else {
                    zBooleanValue = shouldConsume.booleanValue();
                }
            } else {
                zBooleanValue = false;
            }
            PostReceiptHelper.this.billing.consumeAndSave(PostReceiptHelper.this.getFinishTransactions(), this.$purchase, zBooleanValue, this.$initiationSource);
            u00.n nVar = this.$onSuccess;
            if (nVar != null) {
                nVar.invoke(this.$purchase, postReceiptResponse.getCustomerInfo());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "errorHandlingBehavior", "Lorg/json/JSONObject;", "<anonymous parameter 2>", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00482 extends n implements o {
        final String $appUserID;
        final PostReceiptInitiationSource $initiationSource;
        final u00.n $onError;
        final u00.n $onSuccess;
        final StoreTransaction $purchase;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass1 extends n implements k {
            final u00.n $onSuccess;
            final StoreTransaction $purchase;

            public AnonymousClass1(u00.n nVar, StoreTransaction storeTransaction) {
                super(1);
                this.$onSuccess = nVar;
                this.$purchase = storeTransaction;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return b0.a;
            }

            public final void invoke(CustomerInfo customerInfo) {
                m.e(customerInfo, "customerInfo");
                u00.n nVar = this.$onSuccess;
                if (nVar != null) {
                    nVar.invoke(this.$purchase, customerInfo);
                }
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C00052 extends n implements u00.a {
            final PurchasesError $backendError;
            final u00.n $onError;
            final StoreTransaction $purchase;

            public C00052(u00.n nVar, StoreTransaction storeTransaction, PurchasesError purchasesError) {
                super(0);
                this.$onError = nVar;
                this.$purchase = storeTransaction;
                this.$backendError = purchasesError;
            }

            @Override
            public Object invoke() {
                m35invoke();
                return b0.a;
            }

            public final void m35invoke() {
                u00.n nVar = this.$onError;
                if (nVar != null) {
                    nVar.invoke(this.$purchase, this.$backendError);
                }
            }
        }

        public C00482(StoreTransaction storeTransaction, PostReceiptInitiationSource postReceiptInitiationSource, String str, u00.n nVar, u00.n nVar2) {
            super(3);
            this.$purchase = storeTransaction;
            this.$initiationSource = postReceiptInitiationSource;
            this.$appUserID = str;
            this.$onSuccess = nVar;
            this.$onError = nVar2;
        }

        @Override
        public Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((PurchasesError) obj, (PostReceiptErrorHandlingBehavior) obj2, (JSONObject) obj3);
            return b0.a;
        }

        public final void invoke(PurchasesError backendError, PostReceiptErrorHandlingBehavior errorHandlingBehavior, JSONObject jSONObject) {
            m.e(backendError, "backendError");
            m.e(errorHandlingBehavior, "errorHandlingBehavior");
            if (errorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED) {
                PostReceiptHelper.this.billing.consumeAndSave(PostReceiptHelper.this.getFinishTransactions(), this.$purchase, false, this.$initiationSource);
            }
            PostReceiptHelper.this.useOfflineEntitlementsCustomerInfoIfNeeded(errorHandlingBehavior, this.$appUserID, new AnonymousClass1(this.$onSuccess, this.$purchase), new C00052(this.$onError, this.$purchase, backendError));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00491 extends n implements k {
        final u00.a $onError;

        public C00491(u00.a aVar) {
            super(1);
            this.$onError = aVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return b0.a;
        }

        public final void invoke(PurchasesError it) {
            m.e(it, "it");
            this.$onError.invoke();
        }
    }

    public PostReceiptHelper(AppConfig appConfig, Backend backend, BillingAbstract billing, CustomerInfoUpdateHandler customerInfoUpdateHandler, DeviceCache deviceCache, SubscriberAttributesManager subscriberAttributesManager, OfflineEntitlementsManager offlineEntitlementsManager, PaywallPresentedCache paywallPresentedCache, LocalTransactionMetadataStore localTransactionMetadataStore) {
        m.e(appConfig, "appConfig");
        m.e(backend, "backend");
        m.e(billing, "billing");
        m.e(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        m.e(deviceCache, "deviceCache");
        m.e(subscriberAttributesManager, "subscriberAttributesManager");
        m.e(offlineEntitlementsManager, "offlineEntitlementsManager");
        m.e(paywallPresentedCache, "paywallPresentedCache");
        m.e(localTransactionMetadataStore, "localTransactionMetadataStore");
        this.appConfig = appConfig;
        this.backend = backend;
        this.billing = billing;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.deviceCache = deviceCache;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.paywallPresentedCache = paywallPresentedCache;
        this.localTransactionMetadataStore = localTransactionMetadataStore;
    }

    private final void calculateOfflineCustomerInfo(String appUserID, k onSuccess, k onError) {
        this.offlineEntitlementsManager.calculateAndCacheOfflineCustomerInfo(appUserID, new AnonymousClass1(onSuccess), new AnonymousClass2(onError));
    }

    public final void callTransactionMetadataCompletionFromResults(List<LocalTransactionMetadata> transactionMetadataToSync, ConcurrentLinkedQueue<Result<CustomerInfo, PurchasesError>> results, k onError, k onSuccess) {
        if (transactionMetadataToSync.size() == results.size()) {
            int i = 0;
            for (Object obj : results) {
                int i2 = i + 1;
                if (i < 0) {
                    va.a.k0();
                    throw null;
                }
                Result result = (Result) obj;
                if (result instanceof Result.Error) {
                    if (onError != null) {
                        onError.invoke(((Result.Error) result).getValue());
                        return;
                    }
                    return;
                } else {
                    if (i == results.size() - 1 && onSuccess != null) {
                        m.c(result, "null cannot be cast to non-null type com.revenuecat.purchases.utils.Result.Success<com.revenuecat.purchases.CustomerInfo>");
                        onSuccess.invoke(((Result.Success) result).getValue());
                    }
                    i = i2;
                }
            }
        }
    }

    public static void callTransactionMetadataCompletionFromResults$default(PostReceiptHelper postReceiptHelper, List list, ConcurrentLinkedQueue concurrentLinkedQueue, k kVar, k kVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            kVar = null;
        }
        if ((i & 8) != 0) {
            kVar2 = null;
        }
        postReceiptHelper.callTransactionMetadataCompletionFromResults(list, concurrentLinkedQueue, kVar, kVar2);
    }

    public final boolean getFinishTransactions() {
        return this.appConfig.getFinishTransactions();
    }

    private final synchronized CachedDataToPost getOrPutDataToPost(LocalTransactionMetadataStore localTransactionMetadataStore, String str, ReceiptInfo receiptInfo, PostReceiptInitiationSource postReceiptInitiationSource) {
        LocalTransactionMetadata localTransactionMetadata;
        boolean z;
        PaywallEvent andRemovePurchaseInitiatedEventIfNeeded;
        PaywallEvent.Data data;
        try {
            localTransactionMetadata = localTransactionMetadataStore.getLocalTransactionMetadata(str);
            z = localTransactionMetadata == null && postReceiptInitiationSource == PostReceiptInitiationSource.PURCHASE;
            andRemovePurchaseInitiatedEventIfNeeded = localTransactionMetadata == null ? this.paywallPresentedCache.getAndRemovePurchaseInitiatedEventIfNeeded(receiptInfo.getProductIDs(), receiptInfo.getPurchaseTime()) : null;
            if (z) {
                PresentedOfferingContext presentedOfferingContext = (andRemovePurchaseInitiatedEventIfNeeded == null || (data = andRemovePurchaseInitiatedEventIfNeeded.getData()) == null) ? null : data.getPresentedOfferingContext();
                localTransactionMetadataStore.cacheLocalTransactionMetadata(str, new LocalTransactionMetadata(str, (receiptInfo.getPresentedOfferingContext() != null || presentedOfferingContext == null) ? receiptInfo : ReceiptInfo.copy$default(receiptInfo, null, null, presentedOfferingContext, null, null, null, null, null, null, null, false, null, null, 8187, null), andRemovePurchaseInitiatedEventIfNeeded != null ? andRemovePurchaseInitiatedEventIfNeeded.toPaywallPostReceiptData$purchases_defaultsBc8Release() : null, getPurchasesAreCompletedBy()));
            }
        } catch (Throwable th) {
            throw th;
        }
        return new CachedDataToPost(localTransactionMetadata, andRemovePurchaseInitiatedEventIfNeeded, z);
    }

    private final PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.appConfig.getPurchasesAreCompletedBy();
    }

    private final void performPostReceipt(String appUserID, String purchaseToken, boolean isRestore, ReceiptInfo receiptInfo, PostReceiptInitiationSource initiationSource, PaywallPostReceiptData paywallData, PurchasesAreCompletedBy purchasesAreCompletedBy, boolean hasCachedTransactionMetadata, k onSuccess, o onError) {
        this.subscriberAttributesManager.getUnsyncedSubscriberAttributes(appUserID, new C00441(purchaseToken, appUserID, isRestore, receiptInfo, initiationSource, paywallData, purchasesAreCompletedBy, hasCachedTransactionMetadata, onSuccess, onError));
    }

    private final void postReceiptAndSubscriberAttributes(String appUserID, String purchaseToken, boolean isRestore, ReceiptInfo receiptInfo, PostReceiptInitiationSource initiationSource, PurchaseState purchaseState, k onSuccess, o onError) {
        PaywallPostReceiptData paywallPostReceiptData;
        ReceiptInfo receiptInfo2;
        PurchasesAreCompletedBy purchasesAreCompletedBy;
        CachedDataToPost orPutDataToPost = getOrPutDataToPost(this.localTransactionMetadataStore, purchaseToken, receiptInfo, initiationSource);
        LocalTransactionMetadata localTransactionMetadata = orPutDataToPost.getLocalTransactionMetadata();
        PaywallEvent paywallEvent = orPutDataToPost.getPaywallEvent();
        boolean didCacheData = orPutDataToPost.getDidCacheData();
        String str = null;
        Object[] objArr = 0;
        if (localTransactionMetadata != null && (paywallPostReceiptData$purchases_defaultsBc8Release = localTransactionMetadata.getPaywallPostReceiptData()) != null) {
            paywallPostReceiptData = paywallPostReceiptData$purchases_defaultsBc8Release;
        } else if (paywallEvent != null) {
            PaywallPostReceiptData paywallPostReceiptData$purchases_defaultsBc8Release = paywallEvent.toPaywallPostReceiptData$purchases_defaultsBc8Release();
            paywallPostReceiptData = paywallPostReceiptData$purchases_defaultsBc8Release;
        } else {
            paywallPostReceiptData = null;
        }
        if (localTransactionMetadata == null || (receiptInfo2 = localTransactionMetadata.getReceiptInfo()) == null) {
            receiptInfo2 = receiptInfo;
        }
        if (localTransactionMetadata == null || (purchasesAreCompletedBy = localTransactionMetadata.getPurchasesAreCompletedBy()) == null) {
            purchasesAreCompletedBy = getPurchasesAreCompletedBy();
        }
        if (purchaseState != PurchaseState.PENDING) {
            performPostReceipt(appUserID, purchaseToken, isRestore, receiptInfo2, initiationSource, paywallPostReceiptData, purchasesAreCompletedBy, localTransactionMetadata != null || didCacheData, onSuccess, onError);
            return;
        }
        PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PaymentPendingError, str, 2, objArr == true ? 1 : 0);
        LogUtilsKt.errorLog(purchasesError);
        onError.invoke(purchasesError, PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME, null);
    }

    public final void useOfflineEntitlementsCustomerInfoIfNeeded(PostReceiptErrorHandlingBehavior errorHandlingBehavior, String appUserID, k onSuccess, u00.a onError) {
        if (this.offlineEntitlementsManager.shouldCalculateOfflineCustomerInfoInPostReceipt(errorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_USE_OFFLINE_ENTITLEMENTS_AND_NOT_CONSUME)) {
            calculateOfflineCustomerInfo(appUserID, onSuccess, new C00491(onError));
        } else {
            onError.invoke();
        }
    }

    public final void postRemainingCachedTransactionMetadata(String appUserID, boolean allowSharingPlayStoreAccount, Set<String> pendingTransactionsTokens, u00.a onNoTransactionsToSync, k onError, k onSuccess) {
        String appUserID2 = appUserID;
        m.e(appUserID2, "appUserID");
        m.e(pendingTransactionsTokens, "pendingTransactionsTokens");
        m.e(onNoTransactionsToSync, "onNoTransactionsToSync");
        k onError2 = onError;
        m.e(onError2, "onError");
        k onSuccess2 = onSuccess;
        m.e(onSuccess2, "onSuccess");
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        PostReceiptHelper postReceiptHelper = this;
        List<LocalTransactionMetadata> allLocalTransactionMetadata = postReceiptHelper.localTransactionMetadataStore.getAllLocalTransactionMetadata();
        ArrayList<LocalTransactionMetadata> arrayList = new ArrayList();
        for (Object obj : allLocalTransactionMetadata) {
            if (!pendingTransactionsTokens.contains(((LocalTransactionMetadata) obj).getToken())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            onNoTransactionsToSync.invoke();
            return;
        }
        for (LocalTransactionMetadata localTransactionMetadata : arrayList) {
            performPostReceipt(appUserID2, localTransactionMetadata.getToken(), allowSharingPlayStoreAccount, localTransactionMetadata.getReceiptInfo(), PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES, localTransactionMetadata.getPaywallPostReceiptData(), localTransactionMetadata.getPurchasesAreCompletedBy(), true, new PostReceiptHelper$postRemainingCachedTransactionMetadata$1$1(concurrentLinkedQueue, postReceiptHelper, arrayList, onError2, onSuccess2), new PostReceiptHelper$postRemainingCachedTransactionMetadata$1$2(concurrentLinkedQueue, this, arrayList, onError, onSuccess));
            postReceiptHelper = this;
            appUserID2 = appUserID;
            onError2 = onError;
            onSuccess2 = onSuccess;
            concurrentLinkedQueue = concurrentLinkedQueue;
            arrayList = arrayList;
        }
    }

    public final void postTokenWithoutConsuming(String purchaseToken, ReceiptInfo receiptInfo, boolean isRestore, String appUserID, PostReceiptInitiationSource initiationSource, k onSuccess, k onError, Boolean isAutoRenewing) {
        m.e(purchaseToken, "purchaseToken");
        m.e(receiptInfo, "receiptInfo");
        m.e(appUserID, "appUserID");
        m.e(initiationSource, "initiationSource");
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        postReceiptAndSubscriberAttributes(appUserID, purchaseToken, isRestore, receiptInfo, initiationSource, PurchaseState.UNSPECIFIED_STATE, new C00451(purchaseToken, isAutoRenewing, onSuccess), new C00462(purchaseToken, isAutoRenewing, appUserID, onSuccess, onError));
    }

    public final void postTransactionAndConsumeIfNeeded(StoreTransaction purchase, StoreProduct storeProduct, Map<String, ? extends SubscriptionOption> subscriptionOptionForProductIDs, boolean isRestore, String appUserID, PostReceiptInitiationSource initiationSource, boolean sdkOriginated, u00.n onSuccess, u00.n onError) {
        m.e(purchase, "purchase");
        m.e(appUserID, "appUserID");
        m.e(initiationSource, "initiationSource");
        postReceiptAndSubscriberAttributes(appUserID, purchase.getPurchaseToken(), isRestore, ReceiptInfo.INSTANCE.from(purchase, storeProduct, subscriptionOptionForProductIDs, sdkOriginated), initiationSource, purchase.getPurchaseState(), new C00471(purchase, initiationSource, onSuccess), new C00482(purchase, initiationSource, appUserID, onSuccess, onError));
    }
}

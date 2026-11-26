package com.revenuecat.purchases;

import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.interfaces.GetCustomerCenterConfigCallback;
import java.util.Locale;
import java.util.Map;
import k00.k;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import qd.s0;
import ri.t1;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a\u0014\u0010\u000b\u001a\u00020\u0003*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\r\u001a\u00020\u0003*\u00020\u0000H\u0086@¢\u0006\u0004\b\r\u0010\f\u001a\u0014\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000f\u0010\f\u001a(\u0010\u0012\u001a\u00020\u000e*\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0010H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0015\u001a\u00020\u0014*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0015\u0010\f\u001a\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u0000H\u0087@¢\u0006\u0004\b\u0017\u0010\f\u001a\u0014\u0010\u0019\u001a\u00020\u0018*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0019\u0010\f\u001a\u0014\u0010\u001b\u001a\u00020\u001a*\u00020\u0000H\u0087@¢\u0006\u0004\b\u001b\u0010\f\u001a$\u0010\u001f\u001a\u00020\u001e*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0087@¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/revenuecat/purchases/Purchases;", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "fetchPolicy", "Lcom/revenuecat/purchases/CustomerInfo;", "awaitCustomerInfo", "(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/CacheFetchPolicy;Lk00/c;)Ljava/lang/Object;", "", "appUserID", "Lcom/revenuecat/purchases/data/LogInResult;", "awaitLogIn", "(Lcom/revenuecat/purchases/Purchases;Ljava/lang/String;Lk00/c;)Ljava/lang/Object;", "awaitLogOut", "(Lcom/revenuecat/purchases/Purchases;Lk00/c;)Ljava/lang/Object;", "awaitSyncPurchases", "Lcom/revenuecat/purchases/Offerings;", "awaitSyncAttributesAndOfferingsIfNeeded", "", "data", "awaitSetAppstackAttributionParams", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/Map;Lk00/c;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/AmazonLWAConsentStatus;", "getAmazonLWAConsentStatus", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "awaitCustomerCenterConfigData", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "awaitGetVirtualCurrencies", "Ljava/util/Locale;", "awaitStorefrontLocale", "email", "description", "Lcom/revenuecat/purchases/CreateSupportTicketResult;", "awaitCreateSupportTicket", "(Lcom/revenuecat/purchases/Purchases;Ljava/lang/String;Ljava/lang/String;Lk00/c;)Ljava/lang/Object;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CoroutinesExtensionsKt {
    public static final Object awaitCreateSupportTicket(Purchases purchases, String str, String str2, k00.c cVar) throws PurchasesException {
        k kVar = new k(s0.j0(cVar));
        purchases.createSupportTicket(str, str2, new CoroutinesExtensionsKt$awaitCreateSupportTicket$2$1(kVar), new CoroutinesExtensionsKt$awaitCreateSupportTicket$2$2(kVar));
        Object objA = kVar.a();
        l00.a aVar = l00.a.A;
        return objA;
    }

    public static final Object awaitCustomerCenterConfigData(Purchases purchases, k00.c cVar) throws PurchasesException {
        final k kVar = new k(s0.j0(cVar));
        purchases.getCustomerCenterConfigData$purchases_defaultsBc8Release(new GetCustomerCenterConfigCallback() {
            @Override
            public void onError(PurchasesError error) {
                m.e(error, "error");
                kVar.resumeWith(t1.s(new PurchasesException(error)));
            }

            @Override
            public void onSuccess(CustomerCenterConfigData customerCenterConfig) {
                m.e(customerCenterConfig, "customerCenterConfig");
                kVar.resumeWith(customerCenterConfig);
            }
        });
        Object objA = kVar.a();
        l00.a aVar = l00.a.A;
        return objA;
    }

    public static final Object awaitCustomerInfo(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, k00.c cVar) throws PurchasesException {
        k kVar = new k(s0.j0(cVar));
        ListenerConversionsKt.getCustomerInfoWith(purchases, cacheFetchPolicy, new CoroutinesExtensionsKt$awaitCustomerInfo$2$2(kVar), new CoroutinesExtensionsKt$awaitCustomerInfo$2$1(kVar));
        Object objA = kVar.a();
        l00.a aVar = l00.a.A;
        return objA;
    }

    public static Object awaitCustomerInfo$default(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, k00.c cVar, int i, Object obj) throws PurchasesException {
        if ((i & 1) != 0) {
            cacheFetchPolicy = CacheFetchPolicy.INSTANCE.m1default();
        }
        return awaitCustomerInfo(purchases, cacheFetchPolicy, cVar);
    }

    public static final Object awaitGetVirtualCurrencies(Purchases purchases, k00.c cVar) throws PurchasesException {
        k kVar = new k(s0.j0(cVar));
        ListenerConversionsKt.getVirtualCurrenciesWith(purchases, new CoroutinesExtensionsKt$awaitGetVirtualCurrencies$2$1(kVar), new CoroutinesExtensionsKt$awaitGetVirtualCurrencies$2$2(kVar));
        Object objA = kVar.a();
        l00.a aVar = l00.a.A;
        return objA;
    }

    public static final Object awaitLogIn(Purchases purchases, String str, k00.c cVar) throws PurchasesTransactionException {
        k kVar = new k(s0.j0(cVar));
        ListenerConversionsKt.logInWith(purchases, str, new CoroutinesExtensionsKt$awaitLogIn$2$1(kVar), new CoroutinesExtensionsKt$awaitLogIn$2$2(kVar));
        Object objA = kVar.a();
        l00.a aVar = l00.a.A;
        return objA;
    }

    public static final Object awaitLogOut(Purchases purchases, k00.c cVar) throws PurchasesTransactionException {
        k kVar = new k(s0.j0(cVar));
        ListenerConversionsKt.logOutWith(purchases, new CoroutinesExtensionsKt$awaitLogOut$2$1(kVar), new CoroutinesExtensionsKt$awaitLogOut$2$2(kVar));
        Object objA = kVar.a();
        l00.a aVar = l00.a.A;
        return objA;
    }

    public static final Object awaitSetAppstackAttributionParams(Purchases purchases, Map map, k00.c cVar) throws PurchasesException {
        k kVar = new k(s0.j0(cVar));
        purchases.setAppstackAttributionParams(map, ListenerConversionsKt.syncAttributesAndOfferingsListener(new CoroutinesExtensionsKt$awaitSetAppstackAttributionParams$2$1(kVar), new CoroutinesExtensionsKt$awaitSetAppstackAttributionParams$2$2(kVar)));
        Object objA = kVar.a();
        l00.a aVar = l00.a.A;
        return objA;
    }

    public static final Object awaitStorefrontLocale(Purchases purchases, k00.c<? super Locale> cVar) throws PurchasesException {
        k kVar = new k(s0.j0(cVar));
        ListenerConversionsKt.getStorefrontLocaleWith(purchases, new CoroutinesExtensionsKt$awaitStorefrontLocale$2$2(kVar), new CoroutinesExtensionsKt$awaitStorefrontLocale$2$1(kVar));
        Object objA = kVar.a();
        l00.a aVar = l00.a.A;
        return objA;
    }

    public static final Object awaitSyncAttributesAndOfferingsIfNeeded(Purchases purchases, k00.c cVar) throws PurchasesException {
        k kVar = new k(s0.j0(cVar));
        ListenerConversionsKt.syncAttributesAndOfferingsIfNeededWith(purchases, new CoroutinesExtensionsKt$awaitSyncAttributesAndOfferingsIfNeeded$2$2(kVar), new CoroutinesExtensionsKt$awaitSyncAttributesAndOfferingsIfNeeded$2$1(kVar));
        Object objA = kVar.a();
        l00.a aVar = l00.a.A;
        return objA;
    }

    public static final Object awaitSyncPurchases(Purchases purchases, k00.c cVar) throws PurchasesException {
        k kVar = new k(s0.j0(cVar));
        ListenerConversionsKt.syncPurchasesWith(purchases, new CoroutinesExtensionsKt$awaitSyncPurchases$2$2(kVar), new CoroutinesExtensionsKt$awaitSyncPurchases$2$1(kVar));
        Object objA = kVar.a();
        l00.a aVar = l00.a.A;
        return objA;
    }

    public static final Object getAmazonLWAConsentStatus(Purchases purchases, k00.c cVar) throws PurchasesException {
        k kVar = new k(s0.j0(cVar));
        ListenerConversionsKt.getAmazonLWAConsentStatusWith(purchases, new CoroutinesExtensionsKt$getAmazonLWAConsentStatus$2$2(kVar), new CoroutinesExtensionsKt$getAmazonLWAConsentStatus$2$1(kVar));
        Object objA = kVar.a();
        l00.a aVar = l00.a.A;
        return objA;
    }
}

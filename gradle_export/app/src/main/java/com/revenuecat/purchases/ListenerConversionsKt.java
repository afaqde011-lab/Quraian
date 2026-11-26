package com.revenuecat.purchases;

import android.app.Activity;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.interfaces.GetAmazonLWAConsentStatusCallback;
import com.revenuecat.purchases.interfaces.GetCustomerCenterConfigCallback;
import com.revenuecat.purchases.interfaces.GetStorefrontLocaleCallback;
import com.revenuecat.purchases.interfaces.GetVirtualCurrenciesCallback;
import com.revenuecat.purchases.interfaces.LogInCallback;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback;
import com.revenuecat.purchases.interfaces.SyncPurchasesCallback;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import u00.k;
import u00.n;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u001aA\u0010\t\u001a\u00020\b2\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\r\u001a\u00020\f2\u001a\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00002\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a7\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a7\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a7\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a7\u0010 \u001a\u00020\u001f2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0000¢\u0006\u0004\b \u0010!\u001aY\u0010'\u001a\u00020\u0003*\u00020\"2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\u0007¢\u0006\u0004\b'\u0010(\u001aY\u0010+\u001a\u00020\u0003*\u00020\"2\u0006\u0010$\u001a\u00020#2\u0006\u0010*\u001a\u00020)2\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\u0007¢\u0006\u0004\b+\u0010,\u001aI\u0010/\u001a\u00020\u0003*\u00020\"2\u0006\u0010.\u001a\u00020-2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000¢\u0006\u0004\b/\u00100\u001a;\u00101\u001a\u00020\u0003*\u00020\"2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b1\u00102\u001a;\u00103\u001a\u00020\u0003*\u00020\"2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b3\u00102\u001aC\u00103\u001a\u00020\u0003*\u00020\"2\u0006\u00105\u001a\u0002042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b3\u00106\u001a;\u00107\u001a\u00020\u0003*\u00020\"2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b7\u00102\u001a;\u00108\u001a\u00020\u0003*\u00020\"2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b8\u00102\u001a;\u00109\u001a\u00020\u0003*\u00020\"2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b9\u00102\u001a;\u0010:\u001a\u00020\u0003*\u00020\"2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b:\u00102\u001a=\u0010<\u001a\u00020\u0003*\u00020\"2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b<\u00102\u001aQ\u0010@\u001a\u00020\u0003*\u00020\"2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020-0=2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0018\u0010?\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0=\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b@\u0010A\u001aO\u0010B\u001a\u00020\u0003*\u00020\"2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020-0=2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0018\u0010?\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0=\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\bB\u0010A¨\u0006C"}, d2 = {"Lkotlin/Function2;", "Lcom/revenuecat/purchases/CustomerInfo;", "", "Lg00/b0;", "onSuccess", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "Lcom/revenuecat/purchases/interfaces/LogInCallback;", "logInSuccessListener", "(Lu00/n;Lu00/k;)Lcom/revenuecat/purchases/interfaces/LogInCallback;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "productChangeCompletedListener", "(Lu00/n;Lu00/n;)Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;", "syncPurchasesListener", "(Lu00/k;Lu00/k;)Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;", "Lcom/revenuecat/purchases/Offerings;", "Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;", "syncAttributesAndOfferingsListener", "(Lu00/k;Lu00/k;)Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;", "Lcom/revenuecat/purchases/AmazonLWAConsentStatus;", "Lcom/revenuecat/purchases/interfaces/GetAmazonLWAConsentStatusCallback;", "getAmazonLWAConsentStatusListener", "(Lu00/k;Lu00/k;)Lcom/revenuecat/purchases/interfaces/GetAmazonLWAConsentStatusCallback;", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "Lcom/revenuecat/purchases/interfaces/GetVirtualCurrenciesCallback;", "getVirtualCurrenciesCallback", "(Lu00/k;Lu00/k;)Lcom/revenuecat/purchases/interfaces/GetVirtualCurrenciesCallback;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "Lcom/revenuecat/purchases/interfaces/GetCustomerCenterConfigCallback;", "getCustomerCenterConfigDataListener", "(Lu00/k;Lu00/k;)Lcom/revenuecat/purchases/interfaces/GetCustomerCenterConfigCallback;", "Lcom/revenuecat/purchases/Purchases;", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "purchaseProductWith", "(Lcom/revenuecat/purchases/Purchases;Landroid/app/Activity;Lcom/revenuecat/purchases/models/StoreProduct;Lu00/n;Lu00/n;)V", "Lcom/revenuecat/purchases/Package;", "packageToPurchase", "purchasePackageWith", "(Lcom/revenuecat/purchases/Purchases;Landroid/app/Activity;Lcom/revenuecat/purchases/Package;Lu00/n;Lu00/n;)V", "", "appUserID", "logInWith", "(Lcom/revenuecat/purchases/Purchases;Ljava/lang/String;Lu00/k;Lu00/n;)V", "logOutWith", "(Lcom/revenuecat/purchases/Purchases;Lu00/k;Lu00/k;)V", "getCustomerInfoWith", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "fetchPolicy", "(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/CacheFetchPolicy;Lu00/k;Lu00/k;)V", "syncPurchasesWith", "syncAttributesAndOfferingsIfNeededWith", "getAmazonLWAConsentStatusWith", "getVirtualCurrenciesWith", "Ljava/util/Locale;", "getStorefrontLocaleWith", "", "skus", "onReceiveSkus", "getSubscriptionSkusWith", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lu00/k;Lu00/k;)V", "getNonSubscriptionSkusWith", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ListenerConversionsKt {
    public static final GetAmazonLWAConsentStatusCallback getAmazonLWAConsentStatusListener(final k onSuccess, final k onError) {
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        return new GetAmazonLWAConsentStatusCallback() {
            @Override
            public void onError(PurchasesError error) {
                m.e(error, "error");
                onError.invoke(error);
            }

            @Override
            public void onSuccess(AmazonLWAConsentStatus consentStatus) {
                m.e(consentStatus, "consentStatus");
                onSuccess.invoke(consentStatus);
            }
        };
    }

    public static final void getAmazonLWAConsentStatusWith(Purchases purchases, k onError, k onSuccess) {
        m.e(purchases, "<this>");
        m.e(onError, "onError");
        m.e(onSuccess, "onSuccess");
        purchases.getAmazonLWAConsentStatus(getAmazonLWAConsentStatusListener(onSuccess, onError));
    }

    public static void getAmazonLWAConsentStatusWith$default(Purchases purchases, k kVar, k kVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getAmazonLWAConsentStatusWith(purchases, kVar, kVar2);
    }

    public static final GetCustomerCenterConfigCallback getCustomerCenterConfigDataListener(final k onSuccess, final k onError) {
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        return new GetCustomerCenterConfigCallback() {
            @Override
            public void onError(PurchasesError error) {
                m.e(error, "error");
                onError.invoke(error);
            }

            @Override
            public void onSuccess(CustomerCenterConfigData customerCenterConfig) {
                m.e(customerCenterConfig, "customerCenterConfig");
                onSuccess.invoke(customerCenterConfig);
            }
        };
    }

    public static final void getCustomerInfoWith(Purchases purchases, CacheFetchPolicy fetchPolicy, k onError, k onSuccess) {
        m.e(purchases, "<this>");
        m.e(fetchPolicy, "fetchPolicy");
        m.e(onError, "onError");
        m.e(onSuccess, "onSuccess");
        purchases.getCustomerInfo(fetchPolicy, ListenerConversionsCommonKt.receiveCustomerInfoCallback(onSuccess, onError));
    }

    public static final void getCustomerInfoWith(Purchases purchases, k onError, k onSuccess) {
        m.e(purchases, "<this>");
        m.e(onError, "onError");
        m.e(onSuccess, "onSuccess");
        purchases.getCustomerInfo(ListenerConversionsCommonKt.receiveCustomerInfoCallback(onSuccess, onError));
    }

    public static void getCustomerInfoWith$default(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, k kVar, k kVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            kVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getCustomerInfoWith(purchases, cacheFetchPolicy, kVar, kVar2);
    }

    public static void getCustomerInfoWith$default(Purchases purchases, k kVar, k kVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getCustomerInfoWith(purchases, kVar, kVar2);
    }

    @g00.c
    public static final void getNonSubscriptionSkusWith(Purchases purchases, List<String> skus, k onError, k onReceiveSkus) {
        m.e(purchases, "<this>");
        m.e(skus, "skus");
        m.e(onError, "onError");
        m.e(onReceiveSkus, "onReceiveSkus");
        purchases.getProducts(skus, ProductType.INAPP, ListenerConversionsCommonKt.getStoreProductsCallback(onReceiveSkus, onError));
    }

    public static final void getStorefrontLocaleWith(Purchases purchases, final k onError, final k onSuccess) {
        m.e(purchases, "<this>");
        m.e(onError, "onError");
        m.e(onSuccess, "onSuccess");
        purchases.getStorefrontLocale(new GetStorefrontLocaleCallback() {
            @Override
            public void onError(PurchasesError error) {
                m.e(error, "error");
                onError.invoke(error);
            }

            @Override
            public void onReceived(Locale storefrontLocale) {
                m.e(storefrontLocale, "storefrontLocale");
                onSuccess.invoke(storefrontLocale);
            }
        });
    }

    public static void getStorefrontLocaleWith$default(Purchases purchases, k kVar, k kVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getStorefrontLocaleWith(purchases, kVar, kVar2);
    }

    @g00.c
    public static final void getSubscriptionSkusWith(Purchases purchases, List<String> skus, k onError, k onReceiveSkus) {
        m.e(purchases, "<this>");
        m.e(skus, "skus");
        m.e(onError, "onError");
        m.e(onReceiveSkus, "onReceiveSkus");
        purchases.getProducts(skus, ProductType.SUBS, ListenerConversionsCommonKt.getStoreProductsCallback(onReceiveSkus, onError));
    }

    public static void getSubscriptionSkusWith$default(Purchases purchases, List list, k kVar, k kVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            kVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getSubscriptionSkusWith(purchases, list, kVar, kVar2);
    }

    public static final GetVirtualCurrenciesCallback getVirtualCurrenciesCallback(final k onSuccess, final k onError) {
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        return new GetVirtualCurrenciesCallback() {
            @Override
            public void onError(PurchasesError error) {
                m.e(error, "error");
                onError.invoke(error);
            }

            @Override
            public void onReceived(VirtualCurrencies virtualCurrencies) {
                m.e(virtualCurrencies, "virtualCurrencies");
                onSuccess.invoke(virtualCurrencies);
            }
        };
    }

    public static final void getVirtualCurrenciesWith(Purchases purchases, k onError, k onSuccess) {
        m.e(purchases, "<this>");
        m.e(onError, "onError");
        m.e(onSuccess, "onSuccess");
        purchases.getVirtualCurrencies(getVirtualCurrenciesCallback(onSuccess, onError));
    }

    public static void getVirtualCurrenciesWith$default(Purchases purchases, k kVar, k kVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getVirtualCurrenciesWith(purchases, kVar, kVar2);
    }

    public static final LogInCallback logInSuccessListener(final n onSuccess, final k onError) {
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        return new LogInCallback() {
            @Override
            public void onError(PurchasesError error) {
                m.e(error, "error");
                k kVar = onError;
                if (kVar != null) {
                }
            }

            @Override
            public void onReceived(CustomerInfo customerInfo, boolean created) {
                m.e(customerInfo, "customerInfo");
                n nVar = onSuccess;
                if (nVar != null) {
                }
            }
        };
    }

    public static final void logInWith(Purchases purchases, String appUserID, k onError, n onSuccess) {
        m.e(purchases, "<this>");
        m.e(appUserID, "appUserID");
        m.e(onError, "onError");
        m.e(onSuccess, "onSuccess");
        purchases.logIn(appUserID, logInSuccessListener(onSuccess, onError));
    }

    public static void logInWith$default(Purchases purchases, String str, k kVar, n nVar, int i, Object obj) {
        if ((i & 2) != 0) {
            kVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        logInWith(purchases, str, kVar, nVar);
    }

    public static final void logOutWith(Purchases purchases, k onError, k onSuccess) {
        m.e(purchases, "<this>");
        m.e(onError, "onError");
        m.e(onSuccess, "onSuccess");
        purchases.logOut(ListenerConversionsCommonKt.receiveCustomerInfoCallback(onSuccess, onError));
    }

    public static void logOutWith$default(Purchases purchases, k kVar, k kVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        logOutWith(purchases, kVar, kVar2);
    }

    public static final ProductChangeCallback productChangeCompletedListener(final n onSuccess, final n onError) {
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        return new ProductChangeCallback() {
            @Override
            public void onCompleted(StoreTransaction purchase, CustomerInfo customerInfo) {
                m.e(customerInfo, "customerInfo");
                onSuccess.invoke(purchase, customerInfo);
            }

            @Override
            public void onError(PurchasesError error, boolean userCancelled) {
                m.e(error, "error");
                onError.invoke(error, Boolean.valueOf(userCancelled));
            }
        };
    }

    @g00.c
    public static final void purchasePackageWith(Purchases purchases, Activity activity, Package packageToPurchase, n onError, n onSuccess) throws PurchasesException {
        m.e(purchases, "<this>");
        m.e(activity, "activity");
        m.e(packageToPurchase, "packageToPurchase");
        m.e(onError, "onError");
        m.e(onSuccess, "onSuccess");
        purchases.purchasePackage(activity, packageToPurchase, ListenerConversionsCommonKt.purchaseCompletedCallback(onSuccess, onError));
    }

    public static void purchasePackageWith$default(Purchases purchases, Activity activity, Package r2, n nVar, n nVar2, int i, Object obj) throws PurchasesException {
        if ((i & 4) != 0) {
            nVar = ListenerConversionsCommonKt.getON_PURCHASE_ERROR_STUB();
        }
        purchasePackageWith(purchases, activity, r2, nVar, nVar2);
    }

    @g00.c
    public static final void purchaseProductWith(Purchases purchases, Activity activity, StoreProduct storeProduct, n onError, n onSuccess) throws PurchasesException {
        m.e(purchases, "<this>");
        m.e(activity, "activity");
        m.e(storeProduct, "storeProduct");
        m.e(onError, "onError");
        m.e(onSuccess, "onSuccess");
        purchases.purchaseProduct(activity, storeProduct, ListenerConversionsCommonKt.purchaseCompletedCallback(onSuccess, onError));
    }

    public static void purchaseProductWith$default(Purchases purchases, Activity activity, StoreProduct storeProduct, n nVar, n nVar2, int i, Object obj) throws PurchasesException {
        if ((i & 4) != 0) {
            nVar = ListenerConversionsCommonKt.getON_PURCHASE_ERROR_STUB();
        }
        purchaseProductWith(purchases, activity, storeProduct, nVar, nVar2);
    }

    public static final void syncAttributesAndOfferingsIfNeededWith(Purchases purchases, k onError, k onSuccess) {
        m.e(purchases, "<this>");
        m.e(onError, "onError");
        m.e(onSuccess, "onSuccess");
        purchases.syncAttributesAndOfferingsIfNeeded(syncAttributesAndOfferingsListener(onSuccess, onError));
    }

    public static void syncAttributesAndOfferingsIfNeededWith$default(Purchases purchases, k kVar, k kVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        syncAttributesAndOfferingsIfNeededWith(purchases, kVar, kVar2);
    }

    public static final SyncAttributesAndOfferingsCallback syncAttributesAndOfferingsListener(final k onSuccess, final k onError) {
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        return new SyncAttributesAndOfferingsCallback() {
            @Override
            public void onError(PurchasesError error) {
                m.e(error, "error");
                onError.invoke(error);
            }

            @Override
            public void onSuccess(Offerings offerings) {
                m.e(offerings, "offerings");
                onSuccess.invoke(offerings);
            }
        };
    }

    public static final SyncPurchasesCallback syncPurchasesListener(final k onSuccess, final k onError) {
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        return new SyncPurchasesCallback() {
            @Override
            public void onError(PurchasesError error) {
                m.e(error, "error");
                onError.invoke(error);
            }

            @Override
            public void onSuccess(CustomerInfo customerInfo) {
                m.e(customerInfo, "customerInfo");
                onSuccess.invoke(customerInfo);
            }
        };
    }

    public static final void syncPurchasesWith(Purchases purchases, k onError, k onSuccess) {
        m.e(purchases, "<this>");
        m.e(onError, "onError");
        m.e(onSuccess, "onSuccess");
        purchases.syncPurchases(syncPurchasesListener(onSuccess, onError));
    }

    public static void syncPurchasesWith$default(Purchases purchases, k kVar, k kVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        syncPurchasesWith(purchases, kVar, kVar2);
    }
}

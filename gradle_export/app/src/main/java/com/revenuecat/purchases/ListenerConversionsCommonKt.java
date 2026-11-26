package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.GetStorefrontCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import u00.k;
import u00.n;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u001aC\u0010\t\u001a\u00020\b2\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\u0010\u001a\u00020\u000f2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a;\u0010\u001a\u001a\u00020\u0003*\u00020\u00192\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b\u001a\u0010\u001b\u001aQ\u0010\u001e\u001a\u00020\u0003*\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00002\u001a\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001aO\u0010#\u001a\u00020\u0003*\u00020\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\f2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0018\u0010\"\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b#\u0010$\u001aY\u0010#\u001a\u00020\u0003*\u00020\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\f2\b\u0010&\u001a\u0004\u0018\u00010%2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0018\u0010\"\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b#\u0010'\u001a;\u0010(\u001a\u00020\u0003*\u00020\u00192\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b(\u0010\u001b\u001a;\u0010)\u001a\u00020\u0003*\u00020\u00192\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b)\u0010\u001b\"&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\",\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lkotlin/Function2;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lg00/b0;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "", "onError", "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "purchaseCompletedCallback", "(Lu00/n;Lu00/n;)Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "onReceived", "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "getStoreProductsCallback", "(Lu00/k;Lu00/k;)Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "Lcom/revenuecat/purchases/Offerings;", "Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "receiveOfferingsCallback", "(Lu00/k;Lu00/k;)Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "receiveCustomerInfoCallback", "(Lu00/k;Lu00/k;)Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "Lcom/revenuecat/purchases/Purchases;", "getOfferingsWith", "(Lcom/revenuecat/purchases/Purchases;Lu00/k;Lu00/k;)V", "Lcom/revenuecat/purchases/PurchaseParams;", "purchaseParams", "purchaseWith", "(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/PurchaseParams;Lu00/n;Lu00/n;)V", "", "productIds", "onGetStoreProducts", "getProductsWith", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lu00/k;Lu00/k;)V", "Lcom/revenuecat/purchases/ProductType;", "type", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lu00/k;Lu00/k;)V", "restorePurchasesWith", "getStorefrontCountryCodeWith", "ON_ERROR_STUB", "Lu00/k;", "getON_ERROR_STUB", "()Lu00/k;", "ON_PURCHASE_ERROR_STUB", "Lu00/n;", "getON_PURCHASE_ERROR_STUB", "()Lu00/n;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ListenerConversionsCommonKt {
    private static final k ON_ERROR_STUB = ListenerConversionsCommonKt$ON_ERROR_STUB$1.INSTANCE;
    private static final n ON_PURCHASE_ERROR_STUB = ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1.INSTANCE;

    public static final k getON_ERROR_STUB() {
        return ON_ERROR_STUB;
    }

    public static final n getON_PURCHASE_ERROR_STUB() {
        return ON_PURCHASE_ERROR_STUB;
    }

    public static final void getOfferingsWith(Purchases purchases, k onError, k onSuccess) {
        m.e(purchases, "<this>");
        m.e(onError, "onError");
        m.e(onSuccess, "onSuccess");
        purchases.getOfferings(receiveOfferingsCallback(onSuccess, onError));
    }

    public static void getOfferingsWith$default(Purchases purchases, k kVar, k kVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = ON_ERROR_STUB;
        }
        getOfferingsWith(purchases, kVar, kVar2);
    }

    public static final void getProductsWith(Purchases purchases, List<String> productIds, ProductType productType, k onError, k onGetStoreProducts) {
        m.e(purchases, "<this>");
        m.e(productIds, "productIds");
        m.e(onError, "onError");
        m.e(onGetStoreProducts, "onGetStoreProducts");
        purchases.getProducts(productIds, productType, getStoreProductsCallback(onGetStoreProducts, onError));
    }

    public static final void getProductsWith(Purchases purchases, List<String> productIds, k onError, k onGetStoreProducts) {
        m.e(purchases, "<this>");
        m.e(productIds, "productIds");
        m.e(onError, "onError");
        m.e(onGetStoreProducts, "onGetStoreProducts");
        purchases.getProducts(productIds, getStoreProductsCallback(onGetStoreProducts, onError));
    }

    public static void getProductsWith$default(Purchases purchases, List list, ProductType productType, k kVar, k kVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            kVar = ON_ERROR_STUB;
        }
        getProductsWith(purchases, list, productType, kVar, kVar2);
    }

    public static void getProductsWith$default(Purchases purchases, List list, k kVar, k kVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            kVar = ON_ERROR_STUB;
        }
        getProductsWith(purchases, list, kVar, kVar2);
    }

    public static final GetStoreProductsCallback getStoreProductsCallback(final k onReceived, final k onError) {
        m.e(onReceived, "onReceived");
        m.e(onError, "onError");
        return new GetStoreProductsCallback() {
            @Override
            public void onError(PurchasesError error) {
                m.e(error, "error");
                onError.invoke(error);
            }

            @Override
            public void onReceived(List<? extends StoreProduct> storeProducts) {
                m.e(storeProducts, "storeProducts");
                onReceived.invoke(storeProducts);
            }
        };
    }

    public static final void getStorefrontCountryCodeWith(Purchases purchases, final k onError, final k onSuccess) {
        m.e(purchases, "<this>");
        m.e(onError, "onError");
        m.e(onSuccess, "onSuccess");
        purchases.getStorefrontCountryCode(new GetStorefrontCallback() {
            @Override
            public void onError(PurchasesError error) {
                m.e(error, "error");
                onError.invoke(error);
            }

            @Override
            public void onReceived(String storefrontCountryCode) {
                m.e(storefrontCountryCode, "storefrontCountryCode");
                onSuccess.invoke(storefrontCountryCode);
            }
        });
    }

    public static void getStorefrontCountryCodeWith$default(Purchases purchases, k kVar, k kVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = ON_ERROR_STUB;
        }
        getStorefrontCountryCodeWith(purchases, kVar, kVar2);
    }

    public static final PurchaseCallback purchaseCompletedCallback(final n onSuccess, final n onError) {
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        return new PurchaseCallback() {
            @Override
            public void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
                m.e(storeTransaction, "storeTransaction");
                m.e(customerInfo, "customerInfo");
                onSuccess.invoke(storeTransaction, customerInfo);
            }

            @Override
            public void onError(PurchasesError error, boolean userCancelled) {
                m.e(error, "error");
                onError.invoke(error, Boolean.valueOf(userCancelled));
            }
        };
    }

    public static final void purchaseWith(Purchases purchases, PurchaseParams purchaseParams, n onError, n onSuccess) throws PurchasesException {
        m.e(purchases, "<this>");
        m.e(purchaseParams, "purchaseParams");
        m.e(onError, "onError");
        m.e(onSuccess, "onSuccess");
        purchases.purchase(purchaseParams, purchaseCompletedCallback(onSuccess, onError));
    }

    public static void purchaseWith$default(Purchases purchases, PurchaseParams purchaseParams, n nVar, n nVar2, int i, Object obj) throws PurchasesException {
        if ((i & 2) != 0) {
            nVar = ON_PURCHASE_ERROR_STUB;
        }
        purchaseWith(purchases, purchaseParams, nVar, nVar2);
    }

    public static final ReceiveCustomerInfoCallback receiveCustomerInfoCallback(final k onSuccess, final k onError) {
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        return new ReceiveCustomerInfoCallback() {
            @Override
            public void onError(PurchasesError error) {
                m.e(error, "error");
                k kVar = onError;
                if (kVar != null) {
                }
            }

            @Override
            public void onReceived(CustomerInfo customerInfo) {
                m.e(customerInfo, "customerInfo");
                k kVar = onSuccess;
                if (kVar != null) {
                }
            }
        };
    }

    public static final ReceiveOfferingsCallback receiveOfferingsCallback(final k onSuccess, final k onError) {
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        return new ReceiveOfferingsCallback() {
            @Override
            public void onError(PurchasesError error) {
                m.e(error, "error");
                onError.invoke(error);
            }

            @Override
            public void onReceived(Offerings offerings) {
                m.e(offerings, "offerings");
                onSuccess.invoke(offerings);
            }
        };
    }

    public static final void restorePurchasesWith(Purchases purchases, k onError, k onSuccess) {
        m.e(purchases, "<this>");
        m.e(onError, "onError");
        m.e(onSuccess, "onSuccess");
        purchases.restorePurchases(receiveCustomerInfoCallback(onSuccess, onError));
    }

    public static void restorePurchasesWith$default(Purchases purchases, k kVar, k kVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = ON_ERROR_STUB;
        }
        restorePurchasesWith(purchases, kVar, kVar2);
    }
}

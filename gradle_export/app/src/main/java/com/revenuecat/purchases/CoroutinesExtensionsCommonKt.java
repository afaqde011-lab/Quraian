package com.revenuecat.purchases;

import android.content.Context;
import com.revenuecat.purchases.common.events.EventsManager;
import com.revenuecat.purchases.interfaces.Callback;
import g00.n;
import h00.x;
import java.util.List;
import k00.k;
import kotlin.Metadata;
import qd.s0;
import ri.t1;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u001c\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0004*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\n\u001a4\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f*\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013\u001a:\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u0004*\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0016\u0010\u0003\u001a\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0017\u0010\u0003\u001a\u0014\u0010\u0018\u001a\u00020\r*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0018\u0010\u0003\u001a,\u0010\u001f\u001a\u00020\u001e*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\fH\u0086@¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/revenuecat/purchases/Purchases;", "Lcom/revenuecat/purchases/Offerings;", "awaitOfferings", "(Lcom/revenuecat/purchases/Purchases;Lk00/c;)Ljava/lang/Object;", "Lg00/n;", "awaitOfferingsResult", "Lcom/revenuecat/purchases/PurchaseParams;", "purchaseParams", "Lcom/revenuecat/purchases/PurchaseResult;", "awaitPurchase", "(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/PurchaseParams;Lk00/c;)Ljava/lang/Object;", "awaitPurchaseResult", "", "", "productIds", "Lcom/revenuecat/purchases/ProductType;", "type", "Lcom/revenuecat/purchases/models/StoreProduct;", "awaitGetProducts", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lk00/c;)Ljava/lang/Object;", "awaitGetProductsResult", "Lcom/revenuecat/purchases/CustomerInfo;", "awaitRestore", "awaitRestoreResult", "awaitStorefrontCountryCode", "Lcom/revenuecat/purchases/Purchases$Companion;", "Landroid/content/Context;", "context", "Lcom/revenuecat/purchases/models/BillingFeature;", "features", "", "awaitCanMakePayments", "(Lcom/revenuecat/purchases/Purchases$Companion;Landroid/content/Context;Ljava/util/List;Lk00/c;)Ljava/lang/Object;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CoroutinesExtensionsCommonKt {

    @m00.e(c = "com.revenuecat.purchases.CoroutinesExtensionsCommonKt", f = "CoroutinesExtensionsCommon.kt", l = {171}, m = "awaitGetProductsResult")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends m00.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        Object result;

        public AnonymousClass1(k00.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objAwaitGetProductsResult = CoroutinesExtensionsCommonKt.awaitGetProductsResult(null, null, null, this);
            return objAwaitGetProductsResult == l00.a.A ? objAwaitGetProductsResult : new n(objAwaitGetProductsResult);
        }
    }

    @m00.e(c = "com.revenuecat.purchases.CoroutinesExtensionsCommonKt", f = "CoroutinesExtensionsCommon.kt", l = {EventsManager.EVENTS_TO_CLEAR_ON_LIMIT}, m = "awaitOfferingsResult")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C00271 extends m00.c {
        Object L$0;
        int label;
        Object result;

        public C00271(k00.c<? super C00271> cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objAwaitOfferingsResult = CoroutinesExtensionsCommonKt.awaitOfferingsResult(null, this);
            return objAwaitOfferingsResult == l00.a.A ? objAwaitOfferingsResult : new n(objAwaitOfferingsResult);
        }
    }

    @m00.e(c = "com.revenuecat.purchases.CoroutinesExtensionsCommonKt", f = "CoroutinesExtensionsCommon.kt", l = {109}, m = "awaitPurchaseResult")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C00281 extends m00.c {
        Object L$0;
        Object L$1;
        int label;
        Object result;

        public C00281(k00.c<? super C00281> cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) throws PurchasesException {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objAwaitPurchaseResult = CoroutinesExtensionsCommonKt.awaitPurchaseResult(null, null, this);
            return objAwaitPurchaseResult == l00.a.A ? objAwaitPurchaseResult : new n(objAwaitPurchaseResult);
        }
    }

    @m00.e(c = "com.revenuecat.purchases.CoroutinesExtensionsCommonKt", f = "CoroutinesExtensionsCommon.kt", l = {230}, m = "awaitRestoreResult")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C00291 extends m00.c {
        Object L$0;
        int label;
        Object result;

        public C00291(k00.c<? super C00291> cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objAwaitRestoreResult = CoroutinesExtensionsCommonKt.awaitRestoreResult(null, this);
            return objAwaitRestoreResult == l00.a.A ? objAwaitRestoreResult : new n(objAwaitRestoreResult);
        }
    }

    public static final Object awaitCanMakePayments(Purchases.Companion companion, Context context, List list, k00.c cVar) {
        final k kVar = new k(s0.j0(cVar));
        companion.canMakePayments(context, list, new Callback() {
            @Override
            public final void onReceived(Boolean bool) {
                kVar.resumeWith(bool);
            }
        });
        Object objA = kVar.a();
        l00.a aVar = l00.a.A;
        return objA;
    }

    public static Object awaitCanMakePayments$default(Purchases.Companion companion, Context context, List list, k00.c cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            list = x.A;
        }
        return awaitCanMakePayments(companion, context, list, cVar);
    }

    public static final Object awaitGetProducts(Purchases purchases, List list, ProductType productType, k00.c cVar) throws PurchasesTransactionException {
        k kVar = new k(s0.j0(cVar));
        ListenerConversionsCommonKt.getProductsWith(purchases, list, productType, new CoroutinesExtensionsCommonKt$awaitGetProducts$2$2(kVar), new CoroutinesExtensionsCommonKt$awaitGetProducts$2$1(kVar));
        Object objA = kVar.a();
        l00.a aVar = l00.a.A;
        return objA;
    }

    public static Object awaitGetProducts$default(Purchases purchases, List list, ProductType productType, k00.c cVar, int i, Object obj) throws PurchasesTransactionException {
        if ((i & 2) != 0) {
            productType = null;
        }
        return awaitGetProducts(purchases, list, productType, cVar);
    }

    public static final Object awaitGetProductsResult(Purchases purchases, List list, ProductType productType, k00.c cVar) {
        AnonymousClass1 anonymousClass1;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object objA = anonymousClass1.result;
        l00.a aVar = l00.a.A;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            t1.O(objA);
            anonymousClass1.L$0 = purchases;
            anonymousClass1.L$1 = list;
            anonymousClass1.L$2 = productType;
            anonymousClass1.label = 1;
            k kVar = new k(s0.j0(anonymousClass1));
            ListenerConversionsCommonKt.getProductsWith(purchases, list, productType, new CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$1(kVar), new CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$2(kVar));
            objA = kVar.a();
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objA);
        }
        return ((n) objA).A;
    }

    public static Object awaitGetProductsResult$default(Purchases purchases, List list, ProductType productType, k00.c cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            productType = null;
        }
        return awaitGetProductsResult(purchases, list, productType, cVar);
    }

    public static final Object awaitOfferings(Purchases purchases, k00.c cVar) throws PurchasesException {
        k kVar = new k(s0.j0(cVar));
        ListenerConversionsCommonKt.getOfferingsWith(purchases, new CoroutinesExtensionsCommonKt$awaitOfferings$2$2(kVar), new CoroutinesExtensionsCommonKt$awaitOfferings$2$1(kVar));
        Object objA = kVar.a();
        l00.a aVar = l00.a.A;
        return objA;
    }

    public static final Object awaitOfferingsResult(Purchases purchases, k00.c cVar) {
        C00271 c00271;
        if (cVar instanceof C00271) {
            c00271 = (C00271) cVar;
            int i = c00271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00271.label = i - Integer.MIN_VALUE;
            } else {
                c00271 = new C00271(cVar);
            }
        } else {
            c00271 = new C00271(cVar);
        }
        Object objA = c00271.result;
        l00.a aVar = l00.a.A;
        int i2 = c00271.label;
        if (i2 == 0) {
            t1.O(objA);
            c00271.L$0 = purchases;
            c00271.label = 1;
            k kVar = new k(s0.j0(c00271));
            ListenerConversionsCommonKt.getOfferingsWith(purchases, new CoroutinesExtensionsCommonKt$awaitOfferingsResult$2$1(kVar), new CoroutinesExtensionsCommonKt$awaitOfferingsResult$2$2(kVar));
            objA = kVar.a();
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objA);
        }
        return ((n) objA).A;
    }

    public static final Object awaitPurchase(Purchases purchases, PurchaseParams purchaseParams, k00.c cVar) throws PurchasesException {
        k kVar = new k(s0.j0(cVar));
        purchases.purchase(purchaseParams, ListenerConversionsCommonKt.purchaseCompletedCallback(new CoroutinesExtensionsCommonKt$awaitPurchase$2$1(kVar), new CoroutinesExtensionsCommonKt$awaitPurchase$2$2(kVar)));
        Object objA = kVar.a();
        l00.a aVar = l00.a.A;
        return objA;
    }

    public static final Object awaitPurchaseResult(Purchases purchases, PurchaseParams purchaseParams, k00.c cVar) throws PurchasesException {
        C00281 c00281;
        if (cVar instanceof C00281) {
            c00281 = (C00281) cVar;
            int i = c00281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00281.label = i - Integer.MIN_VALUE;
            } else {
                c00281 = new C00281(cVar);
            }
        } else {
            c00281 = new C00281(cVar);
        }
        Object objA = c00281.result;
        l00.a aVar = l00.a.A;
        int i2 = c00281.label;
        if (i2 == 0) {
            t1.O(objA);
            c00281.L$0 = purchases;
            c00281.L$1 = purchaseParams;
            c00281.label = 1;
            k kVar = new k(s0.j0(c00281));
            purchases.purchase(purchaseParams, ListenerConversionsCommonKt.purchaseCompletedCallback(new CoroutinesExtensionsCommonKt$awaitPurchaseResult$2$1(kVar), new CoroutinesExtensionsCommonKt$awaitPurchaseResult$2$2(kVar)));
            objA = kVar.a();
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objA);
        }
        return ((n) objA).A;
    }

    public static final Object awaitRestore(Purchases purchases, k00.c cVar) throws PurchasesTransactionException {
        k kVar = new k(s0.j0(cVar));
        ListenerConversionsCommonKt.restorePurchasesWith(purchases, new CoroutinesExtensionsCommonKt$awaitRestore$2$1(kVar), new CoroutinesExtensionsCommonKt$awaitRestore$2$2(kVar));
        Object objA = kVar.a();
        l00.a aVar = l00.a.A;
        return objA;
    }

    public static final Object awaitRestoreResult(Purchases purchases, k00.c cVar) {
        C00291 c00291;
        if (cVar instanceof C00291) {
            c00291 = (C00291) cVar;
            int i = c00291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00291.label = i - Integer.MIN_VALUE;
            } else {
                c00291 = new C00291(cVar);
            }
        } else {
            c00291 = new C00291(cVar);
        }
        Object objA = c00291.result;
        l00.a aVar = l00.a.A;
        int i2 = c00291.label;
        if (i2 == 0) {
            t1.O(objA);
            c00291.L$0 = purchases;
            c00291.label = 1;
            k kVar = new k(s0.j0(c00291));
            ListenerConversionsCommonKt.restorePurchasesWith(purchases, new CoroutinesExtensionsCommonKt$awaitRestoreResult$2$1(kVar), new CoroutinesExtensionsCommonKt$awaitRestoreResult$2$2(kVar));
            objA = kVar.a();
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objA);
        }
        return ((n) objA).A;
    }

    public static final Object awaitStorefrontCountryCode(Purchases purchases, k00.c<? super String> cVar) {
        k kVar = new k(s0.j0(cVar));
        ListenerConversionsCommonKt.getStorefrontCountryCodeWith(purchases, new CoroutinesExtensionsCommonKt$awaitStorefrontCountryCode$2$2(kVar), new CoroutinesExtensionsCommonKt$awaitStorefrontCountryCode$2$1(kVar));
        Object objA = kVar.a();
        l00.a aVar = l00.a.A;
        return objA;
    }
}

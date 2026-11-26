package com.revenuecat.purchases.google;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import h00.r;
import h00.x;
import h00.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import qd.m;
import qd.o;
import qd.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqd/p;", "Lcom/revenuecat/purchases/models/StoreProduct;", "toInAppStoreProduct", "(Lqd/p;)Lcom/revenuecat/purchases/models/StoreProduct;", "", "Lqd/o;", "offerDetails", "Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "toStoreProduct", "(Lqd/p;Ljava/util/List;)Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "Lcom/revenuecat/purchases/models/Price;", "createOneTimeProductPrice", "(Lqd/p;)Lcom/revenuecat/purchases/models/Price;", "toStoreProducts", "(Ljava/util/List;)Ljava/util/List;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StoreProductConversionsKt {
    private static final Price createOneTimeProductPrice(p pVar) {
        m mVarA;
        if (ProductTypeConversionsKt.toRevenueCatProductType(pVar.d) != ProductType.INAPP || (mVarA = pVar.a()) == null) {
            return null;
        }
        String str = mVarA.a;
        kotlin.jvm.internal.m.d(str, "it.formattedPrice");
        long j = mVarA.b;
        String str2 = mVarA.c;
        kotlin.jvm.internal.m.d(str2, "it.priceCurrencyCode");
        return new Price(str, j, str2);
    }

    public static final StoreProduct toInAppStoreProduct(p pVar) {
        kotlin.jvm.internal.m.e(pVar, "<this>");
        return toStoreProduct(pVar, x.A);
    }

    public static final GoogleStoreProduct toStoreProduct(p pVar, List<o> offerDetails) {
        SubscriptionOptions subscriptionOptions;
        PricingPhase fullPricePhase;
        kotlin.jvm.internal.m.e(pVar, "<this>");
        String productId = pVar.c;
        kotlin.jvm.internal.m.e(offerDetails, "offerDetails");
        String str = pVar.d;
        if (ProductTypeConversionsKt.toRevenueCatProductType(str) == ProductType.SUBS) {
            ArrayList arrayList = new ArrayList(r.q0(offerDetails, 10));
            for (o oVar : offerDetails) {
                kotlin.jvm.internal.m.d(productId, "productId");
                arrayList.add(SubscriptionOptionConversionsKt.toSubscriptionOption(oVar, productId, pVar));
            }
            subscriptionOptions = new SubscriptionOptions(arrayList);
        } else {
            subscriptionOptions = null;
        }
        SubscriptionOption basePlan = subscriptionOptions != null ? subscriptionOptions.getBasePlan() : null;
        Price price = (basePlan == null || (fullPricePhase = basePlan.getFullPricePhase()) == null) ? null : fullPricePhase.getPrice();
        Price priceCreateOneTimeProductPrice = createOneTimeProductPrice(pVar);
        if (priceCreateOneTimeProductPrice != null) {
            price = priceCreateOneTimeProductPrice;
        } else if (price == null) {
            return null;
        }
        kotlin.jvm.internal.m.d(productId, "productId");
        String id = basePlan != null ? basePlan.getId() : null;
        ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(str);
        String name = pVar.f;
        kotlin.jvm.internal.m.d(name, "name");
        String title = pVar.e;
        kotlin.jvm.internal.m.d(title, "title");
        String description = pVar.g;
        kotlin.jvm.internal.m.d(description, "description");
        return new GoogleStoreProduct(productId, id, revenueCatProductType, price, name, title, description, basePlan != null ? basePlan.getBillingPeriod() : null, subscriptionOptions, subscriptionOptions != null ? subscriptionOptions.getDefaultOffer() : null, pVar, (PresentedOfferingContext) null);
    }

    public static final List<StoreProduct> toStoreProducts(List<p> list) {
        ?? arrayList;
        ?? linkedHashMap;
        LogHandler currentLogHandler;
        String strK;
        Object objInvoke;
        kotlin.jvm.internal.m.e(list, "<this>");
        ArrayList arrayList2 = new ArrayList();
        for (p pVar : list) {
            ArrayList arrayList3 = pVar.j;
            x xVar = x.A;
            if (arrayList3 != null) {
                arrayList = new ArrayList();
                for (Object obj : arrayList3) {
                    o it = (o) obj;
                    kotlin.jvm.internal.m.d(it, "it");
                    if (SubscriptionOptionConversionsKt.isBasePlan(it)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = xVar;
            }
            ArrayList arrayList4 = pVar.j;
            if (arrayList4 != null) {
                linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList4) {
                    String str = ((o) obj2).a;
                    Object arrayList5 = linkedHashMap.get(str);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        linkedHashMap.put(str, arrayList5);
                    }
                    ((List) arrayList5).add(obj2);
                }
            } else {
                linkedHashMap = y.A;
            }
            boolean zIsEmpty = arrayList.isEmpty();
            ?? r4 = arrayList;
            if (zIsEmpty) {
                r4 = 0;
            }
            if (r4 == 0) {
                StoreProduct inAppStoreProduct = toInAppStoreProduct(pVar);
                if (inAppStoreProduct == null) {
                    LogIntent logIntent = LogIntent.RC_ERROR;
                    StoreProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1 storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1 = new StoreProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1(logIntent, pVar);
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                        case 1:
                            LogLevel logLevel = LogLevel.DEBUG;
                            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                currentLogHandler2.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                            }
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke(), null);
                            break;
                        case 3:
                            LogLevel logLevel2 = LogLevel.WARN;
                            LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                currentLogHandler3.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                            }
                            break;
                        case 4:
                            LogLevel logLevel3 = LogLevel.INFO;
                            LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                currentLogHandler4.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                            }
                            break;
                        case 5:
                            LogLevel logLevel4 = LogLevel.DEBUG;
                            LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                currentLogHandler5.d(x5.k(logLevel4, new StringBuilder("[Purchases] - ")), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                            }
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke(), null);
                            break;
                        case 7:
                            LogLevel logLevel5 = LogLevel.INFO;
                            LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                currentLogHandler6.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                            }
                            break;
                        case 8:
                            LogLevel logLevel6 = LogLevel.DEBUG;
                            LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                currentLogHandler7.d(x5.k(logLevel6, new StringBuilder("[Purchases] - ")), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                            }
                            break;
                        case 9:
                            LogLevel logLevel7 = LogLevel.DEBUG;
                            LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                currentLogHandler8.d(x5.k(logLevel7, new StringBuilder("[Purchases] - ")), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                            }
                            break;
                        case 10:
                            LogLevel logLevel8 = LogLevel.WARN;
                            LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                                currentLogHandler9.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                            }
                            break;
                        case 11:
                            LogLevel logLevel9 = LogLevel.WARN;
                            LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                                currentLogHandler10.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                            }
                            break;
                        case 12:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke(), null);
                            break;
                        case 13:
                            LogLevel logLevel10 = LogLevel.WARN;
                            LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                                currentLogHandler11.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke());
                            }
                            break;
                        case 14:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1.invoke(), null);
                            break;
                    }
                } else {
                    arrayList2.add(inAppStoreProduct);
                }
            } else {
                Iterator it2 = r4.iterator();
                while (it2.hasNext()) {
                    List list2 = (List) linkedHashMap.get(((o) it2.next()).a);
                    if (list2 == null) {
                        list2 = xVar;
                    }
                    GoogleStoreProduct storeProduct = toStoreProduct(pVar, list2);
                    if (storeProduct == null) {
                        LogIntent logIntent2 = LogIntent.RC_ERROR;
                        StoreProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1 storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1 = new StoreProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1(logIntent2, pVar);
                        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                            case 1:
                                LogLevel logLevel11 = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                                    strK = x5.k(logLevel11, new StringBuilder("[Purchases] - "));
                                    objInvoke = storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke();
                                    currentLogHandler.d(strK, (String) objInvoke);
                                }
                                break;
                            case 2:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke(), null);
                                break;
                            case 3:
                                LogLevel logLevel12 = LogLevel.WARN;
                                LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                                    currentLogHandler12.w(x5.k(logLevel12, new StringBuilder("[Purchases] - ")), (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke());
                                }
                                break;
                            case 4:
                                LogLevel logLevel13 = LogLevel.INFO;
                                LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                                    currentLogHandler13.i(x5.k(logLevel13, new StringBuilder("[Purchases] - ")), (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke());
                                }
                                break;
                            case 5:
                                LogLevel logLevel14 = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                                    strK = x5.k(logLevel14, new StringBuilder("[Purchases] - "));
                                    objInvoke = storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke();
                                    currentLogHandler.d(strK, (String) objInvoke);
                                }
                                break;
                            case 6:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke(), null);
                                break;
                            case 7:
                                LogLevel logLevel15 = LogLevel.INFO;
                                LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                                    currentLogHandler14.i(x5.k(logLevel15, new StringBuilder("[Purchases] - ")), (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke());
                                }
                                break;
                            case 8:
                                LogLevel logLevel16 = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                                    strK = x5.k(logLevel16, new StringBuilder("[Purchases] - "));
                                    objInvoke = storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke();
                                    currentLogHandler.d(strK, (String) objInvoke);
                                }
                                break;
                            case 9:
                                LogLevel logLevel17 = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                                    strK = x5.k(logLevel17, new StringBuilder("[Purchases] - "));
                                    objInvoke = storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke();
                                    currentLogHandler.d(strK, (String) objInvoke);
                                }
                                break;
                            case 10:
                                LogLevel logLevel18 = LogLevel.WARN;
                                LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                                    currentLogHandler15.w(x5.k(logLevel18, new StringBuilder("[Purchases] - ")), (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke());
                                }
                                break;
                            case 11:
                                LogLevel logLevel19 = LogLevel.WARN;
                                LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                                    currentLogHandler16.w(x5.k(logLevel19, new StringBuilder("[Purchases] - ")), (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke());
                                }
                                break;
                            case 12:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke(), null);
                                break;
                            case 13:
                                LogLevel logLevel20 = LogLevel.WARN;
                                LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                                    currentLogHandler17.w(x5.k(logLevel20, new StringBuilder("[Purchases] - ")), (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke());
                                }
                                break;
                            case 14:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProducts$lambda$10$lambda$7$$inlined$log$1.invoke(), null);
                                break;
                        }
                    } else {
                        arrayList2.add(storeProduct);
                    }
                }
            }
        }
        return arrayList2;
    }
}

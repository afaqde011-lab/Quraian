package com.revenuecat.purchases.amazon;

import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductType;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import h00.q;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import org.json.JSONObject;
import r30.k;
import r30.r;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\u001a\u000e\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u0004H\u0000\u001a\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"pattern", "Ljava/util/regex/Pattern;", "createPeriod", "Lcom/revenuecat/purchases/models/Period;", "", "createPrice", "Lcom/revenuecat/purchases/models/Price;", "marketplace", "parsePriceUsingRegex", "Ljava/math/BigDecimal;", "toStoreProduct", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lcom/amazon/device/iap/model/Product;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StoreProductConversionsKt {
    private static final Pattern pattern;

    static {
        Pattern patternCompile = Pattern.compile("(\\d+[[\\.,\\s]\\d+]*)");
        m.d(patternCompile, "compile(\"(\\\\d+[[\\\\.,\\\\s]\\\\d+]*)\")");
        pattern = patternCompile;
    }

    public static final com.revenuecat.purchases.models.Period createPeriod(java.lang.String r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.amazon.StoreProductConversionsKt.createPeriod(java.lang.String):com.revenuecat.purchases.models.Period");
    }

    public static final Price createPrice(String str, String marketplace) throws IOException {
        m.e(str, "<this>");
        m.e(marketplace, "marketplace");
        BigDecimal priceNumeric = parsePriceUsingRegex(str);
        if (priceNumeric == null) {
            priceNumeric = BigDecimal.ZERO;
        }
        m.d(priceNumeric, "priceNumeric");
        BigDecimal bigDecimalMultiply = priceNumeric.multiply(new BigDecimal(1000000.0d));
        m.d(bigDecimalMultiply, "multiply(...)");
        return new Price(str, bigDecimalMultiply.longValue(), ISO3166Alpha2ToISO42170Converter.INSTANCE.convertOrEmpty(marketplace));
    }

    public static final BigDecimal parsePriceUsingRegex(String str) throws IOException {
        m.e(str, "<this>");
        Matcher matcher = pattern.matcher(str);
        if ((matcher.find() ? matcher : null) == null) {
            return null;
        }
        String dirtyPrice = matcher.group();
        m.d(dirtyPrice, "dirtyPrice");
        String string = k.j1(r.v0(r.v0(r.v0(dirtyPrice, " ", ""), " ", ""), " ", "")).toString();
        List listW0 = k.W0(string, new String[]{".", ","}, 6);
        if (listW0.size() != 1) {
            if (((String) q.T0(listW0)).length() == 3) {
                string = r.v0(r.v0(string, ".", ""), ",", "");
            } else {
                string = q.R0(q.I0(listW0), "", null, null, null, 62) + '.' + ((String) q.T0(listW0));
            }
        }
        return new BigDecimal(k.j1(string).toString());
    }

    public static final StoreProduct toStoreProduct(Product product, String marketplace) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        m.e(product, "<this>");
        m.e(marketplace, "marketplace");
        if (product.getPrice() != null) {
            String price = product.getPrice();
            m.d(price, "price");
            Price priceCreatePrice = createPrice(price, marketplace);
            String sku = product.getSku();
            m.d(sku, "sku");
            ProductType productType = product.getProductType();
            m.d(productType, "productType");
            com.revenuecat.purchases.ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(productType);
            String title = product.getTitle();
            m.d(title, "title");
            String title2 = product.getTitle();
            m.d(title2, "title");
            String description = product.getDescription();
            m.d(description, "description");
            String subscriptionPeriod = product.getSubscriptionPeriod();
            Period periodCreatePeriod = subscriptionPeriod != null ? createPeriod(subscriptionPeriod) : null;
            String smallIconUrl = product.getSmallIconUrl();
            m.d(smallIconUrl, "smallIconUrl");
            String freeTrialPeriod = product.getFreeTrialPeriod();
            Period periodCreatePeriod2 = freeTrialPeriod != null ? createPeriod(freeTrialPeriod) : null;
            JSONObject json = product.toJSON();
            m.d(json, "this.toJSON()");
            return new AmazonStoreProduct(sku, revenueCatProductType, title, title2, description, periodCreatePeriod, priceCreatePrice, (SubscriptionOptions) null, (SubscriptionOption) null, smallIconUrl, periodCreatePeriod2, json, (PresentedOfferingContext) null);
        }
        LogIntent logIntent = LogIntent.AMAZON_ERROR;
        StoreProductConversionsKt$toStoreProduct$$inlined$log$1 storeProductConversionsKt$toStoreProduct$$inlined$log$1 = new StoreProductConversionsKt$toStoreProduct$$inlined$log$1(logIntent, product);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                return null;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke(), null);
                return null;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke());
                }
                return null;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke());
                }
                return null;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                return null;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke(), null);
                return null;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke());
                }
                return null;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                return null;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                return null;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke());
                }
                return null;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke());
                }
                return null;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke(), null);
                return null;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke());
                }
                return null;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) storeProductConversionsKt$toStoreProduct$$inlined$log$1.invoke(), null);
                return null;
            default:
                return null;
        }
    }
}

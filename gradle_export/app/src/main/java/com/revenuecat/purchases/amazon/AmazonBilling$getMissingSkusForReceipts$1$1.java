package com.revenuecat.purchases.amazon;

import com.amazon.device.iap.model.Receipt;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import g00.b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.x;
import org.json.JSONException;
import org.json.JSONObject;
import u00.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "response", "Lg00/b0;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class AmazonBilling$getMissingSkusForReceipts$1$1 extends n implements k {
    final Map<String, PurchasesError> $errorMap;
    final u00.n $onCompletion;
    final Receipt $receipt;
    final x $receiptsLeft;
    final Map<String, String> $successMap;
    final AmazonBilling this$0;

    public AmazonBilling$getMissingSkusForReceipts$1$1(Map<String, String> map, Receipt receipt, x xVar, AmazonBilling amazonBilling, u00.n nVar, Map<String, PurchasesError> map2) {
        super(1);
        this.$successMap = map;
        this.$receipt = receipt;
        this.$receiptsLeft = xVar;
        this.this$0 = amazonBilling;
        this.$onCompletion = nVar;
        this.$errorMap = map2;
    }

    @Override
    public Object invoke(Object obj) throws JSONException {
        invoke((JSONObject) obj);
        return b0.a;
    }

    public final void invoke(JSONObject response) throws JSONException {
        LogHandler currentLogHandler;
        String strK;
        String str;
        m.e(response, "response");
        LogIntent logIntent = LogIntent.DEBUG;
        AmazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1 amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1 = new AmazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1(logIntent, response);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke(), null);
                break;
        }
        Map<String, String> map = this.$successMap;
        String receiptId = this.$receipt.getReceiptId();
        m.d(receiptId, "receipt.receiptId");
        Object obj = response.get("termSku");
        m.c(obj, "null cannot be cast to non-null type kotlin.String");
        map.put(receiptId, (String) obj);
        x xVar = this.$receiptsLeft;
        int i = xVar.A - 1;
        xVar.A = i;
        if (i == 0) {
            this.this$0.cache.cacheSkusByToken(this.$successMap);
            this.$onCompletion.invoke(this.$successMap, this.$errorMap);
        }
    }
}

package com.revenuecat.purchases.common.offerings;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.GetOfferingsErrorHandlingBehavior;
import com.revenuecat.purchases.common.HTTPResponseOriginalSource;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.paywalls.OfferingFontPreDownloader;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import com.revenuecat.purchases.utils.OfferingImagePreDownloader;
import g00.b0;
import h00.y;
import h00.z;
import java.util.Date;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import u00.k;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u001b\b\u0000\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015Js\u0010\"\u001a2\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001a0\u001f\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001a0\u001f0\u001e2\u0006\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\"\u0010#J[\u0010*\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020 2\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001a0\u001f2\u0018\u0010)\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001a0\u001fH\u0002¢\u0006\u0004\b*\u0010+JE\u0010-\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b-\u0010.JW\u00104\u001a\u00020\u001a2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u000e2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b4\u00105J-\u00107\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\u00192\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b7\u00108J\u001d\u0010;\u001a\u00020\u001a2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001a09H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u001aH\u0002¢\u0006\u0004\b=\u0010>JI\u0010B\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010'\u001a\u00020 2\b\u00106\u001a\u0004\u0018\u00010\u00192\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010?2\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010?H\u0002¢\u0006\u0004\bB\u0010CJW\u0010E\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000e2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\b\b\u0002\u0010D\u001a\u00020\u000e¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\u001a¢\u0006\u0004\bG\u0010>J\u0015\u0010H\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\bH\u0010IJM\u0010J\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000e2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018¢\u0006\u0004\bJ\u0010KR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010LR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010MR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010NR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010OR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010PR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010QR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010RR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010SR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010TR\u0014\u0010U\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0013\u0010Y\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006Z"}, d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsManager;", "", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "offeringsCache", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;", "offeringsFactory", "Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;", "offeringImagePreDownloader", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/paywalls/OfferingFontPreDownloader;", "offeringFontPreDownloader", "", "uiPreviewMode", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "Landroid/os/Handler;", "mainHandler", "<init>", "(Lcom/revenuecat/purchases/common/offerings/OfferingsCache;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/paywalls/OfferingFontPreDownloader;ZLcom/revenuecat/purchases/common/DateProvider;Landroid/os/Handler;)V", "Ljava/util/Date;", "startTime", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Lg00/b0;", "onError", "Lcom/revenuecat/purchases/Offerings;", "onSuccess", "Lg00/k;", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;", "Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;", "createTrackedOfferingsCallbacks", "(Ljava/util/Date;Lu00/k;Lu00/k;)Lg00/k;", "", "appUserID", "appInBackground", "cacheStatus", "onErrorTracked", "onSuccessTracked", "fetchOfferingsFromNetwork", "(Ljava/lang/String;ZLcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;Lu00/n;Lu00/n;)V", "cachedOfferings", "vendCachedOfferingsAndMaybeRefresh", "(Ljava/lang/String;ZLcom/revenuecat/purchases/Offerings;Ljava/util/Date;Lu00/k;)V", "Lorg/json/JSONObject;", "offeringsJSON", "Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "originalDataSource", "loadedFromDiskCache", "createAndCacheOfferings", "(Lorg/json/JSONObject;Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;ZLu00/k;Lu00/k;)V", "error", "handleErrorFetchingOfferings", "(Lcom/revenuecat/purchases/PurchasesError;Lu00/k;)V", "Lkotlin/Function0;", "action", "dispatch", "(Lu00/a;)V", "trackGetOfferingsStartedIfNeeded", "()V", "", "requestedProductIds", "notFoundProductIds", "trackGetOfferingsResultIfNeeded", "(Ljava/util/Date;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;Lcom/revenuecat/purchases/PurchasesError;Ljava/util/Set;Ljava/util/Set;)V", "fetchCurrent", "getOfferings", "(Ljava/lang/String;ZLu00/k;Lu00/k;Z)V", "clearInMemoryOfferingsCache", "onAppForeground", "(Ljava/lang/String;)V", "fetchAndCacheOfferings", "(Ljava/lang/String;ZLu00/k;Lu00/k;)V", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;", "Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/paywalls/OfferingFontPreDownloader;", "Z", "Lcom/revenuecat/purchases/common/DateProvider;", "Landroid/os/Handler;", "emptyOfferings", "Lcom/revenuecat/purchases/Offerings;", "getCachedCurrentOfferingIdentifier", "()Ljava/lang/String;", "cachedCurrentOfferingIdentifier", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OfferingsManager {
    private final Backend backend;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Offerings emptyOfferings;
    private final Handler mainHandler;
    private final OfferingFontPreDownloader offeringFontPreDownloader;
    private final OfferingImagePreDownloader offeringImagePreDownloader;
    private final OfferingsCache offeringsCache;
    private final OfferingsFactory offeringsFactory;
    private final boolean uiPreviewMode;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DiagnosticsTracker.CacheStatus.values().length];
            try {
                iArr[DiagnosticsTracker.CacheStatus.NOT_CHECKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DiagnosticsTracker.CacheStatus.NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements k {
        final k $onError;

        public AnonymousClass1(k kVar) {
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
            OfferingsManager.this.handleErrorFetchingOfferings(error, this.$onError);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;", "offeringsResultData", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends n implements k {
        final JSONObject $offeringsJSON;
        final k $onSuccess;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C00152 extends n implements u00.a {
            final OfferingsResultData $offeringsResultData;
            final k $onSuccess;

            public C00152(k kVar, OfferingsResultData offeringsResultData) {
                super(0);
                this.$onSuccess = kVar;
                this.$offeringsResultData = offeringsResultData;
            }

            @Override
            public Object invoke() {
                m142invoke();
                return b0.a;
            }

            public final void m142invoke() {
                k kVar = this.$onSuccess;
                if (kVar != null) {
                    kVar.invoke(this.$offeringsResultData);
                }
            }
        }

        public AnonymousClass2(JSONObject jSONObject, k kVar) {
            super(1);
            this.$offeringsJSON = jSONObject;
            this.$onSuccess = kVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((OfferingsResultData) obj);
            return b0.a;
        }

        public final void invoke(OfferingsResultData offeringsResultData) {
            m.e(offeringsResultData, "offeringsResultData");
            Offering current = offeringsResultData.getOfferings().getCurrent();
            if (current != null) {
                OfferingsManager.this.offeringImagePreDownloader.preDownloadOfferingImages(current);
            }
            OfferingsManager.this.offeringFontPreDownloader.preDownloadOfferingFontsIfNeeded(offeringsResultData.getOfferings());
            OfferingsManager.this.offeringsCache.cacheOfferings(offeringsResultData.getOfferings(), this.$offeringsJSON);
            OfferingsManager.this.dispatch(new C00152(this.$onSuccess, offeringsResultData));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00981 extends n implements u00.a {
        final k $onSuccess;
        final OfferingsManager this$0;

        public C00981(k kVar, OfferingsManager offeringsManager) {
            super(0);
            this.$onSuccess = kVar;
            this.this$0 = offeringsManager;
        }

        @Override
        public Object invoke() {
            m143invoke();
            return b0.a;
        }

        public final void m143invoke() {
            k kVar = this.$onSuccess;
            if (kVar != null) {
                Offerings offerings = this.this$0.emptyOfferings;
                z zVar = z.A;
                kVar.invoke(new OfferingsResultData(offerings, zVar, zVar));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lorg/json/JSONObject;", "body", "Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "originalDataSource", "Lg00/b0;", "invoke", "(Lorg/json/JSONObject;Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass3 extends n implements u00.n {
        final k $onError;
        final k $onSuccess;

        public AnonymousClass3(k kVar, k kVar2) {
            super(2);
            this.$onError = kVar;
            this.$onSuccess = kVar2;
        }

        @Override
        public Object invoke(Object obj, Object obj2) {
            invoke((JSONObject) obj, (HTTPResponseOriginalSource) obj2);
            return b0.a;
        }

        public final void invoke(JSONObject body, HTTPResponseOriginalSource originalDataSource) {
            m.e(body, "body");
            m.e(originalDataSource, "originalDataSource");
            OfferingsManager.this.createAndCacheOfferings(body, originalDataSource, false, this.$onError, this.$onSuccess);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "Lcom/revenuecat/purchases/common/GetOfferingsErrorHandlingBehavior;", "errorBehavior", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/GetOfferingsErrorHandlingBehavior;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass4 extends n implements u00.n {
        final k $onError;
        final k $onSuccess;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[GetOfferingsErrorHandlingBehavior.values().length];
                try {
                    iArr[GetOfferingsErrorHandlingBehavior.SHOULD_FALLBACK_TO_CACHED_OFFERINGS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[GetOfferingsErrorHandlingBehavior.SHOULD_NOT_FALLBACK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass4(k kVar, k kVar2) {
            super(2);
            this.$onError = kVar;
            this.$onSuccess = kVar2;
        }

        @Override
        public Object invoke(Object obj, Object obj2) {
            invoke((PurchasesError) obj, (GetOfferingsErrorHandlingBehavior) obj2);
            return b0.a;
        }

        public final void invoke(PurchasesError backendError, GetOfferingsErrorHandlingBehavior errorBehavior) {
            HTTPResponseOriginalSource hTTPResponseOriginalSourceValueOf;
            m.e(backendError, "backendError");
            m.e(errorBehavior, "errorBehavior");
            int i = WhenMappings.$EnumSwitchMapping$0[errorBehavior.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                OfferingsManager.this.handleErrorFetchingOfferings(backendError, this.$onError);
                return;
            }
            JSONObject cachedOfferingsResponse = OfferingsManager.this.offeringsCache.getCachedOfferingsResponse();
            if (cachedOfferingsResponse == null) {
                OfferingsManager.this.handleErrorFetchingOfferings(backendError, this.$onError);
                return;
            }
            LogLevel logLevel = LogLevel.WARN;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.w("[Purchases] - " + logLevel.name(), OfferingStrings.ERROR_FETCHING_OFFERINGS_USING_DISK_CACHE);
            }
            String strOptNullableString = JSONObjectExtensionsKt.optNullableString(cachedOfferingsResponse, OfferingsCache.ORIGINAL_SOURCE_KEY);
            if (strOptNullableString != null) {
                try {
                    hTTPResponseOriginalSourceValueOf = HTTPResponseOriginalSource.valueOf(strOptNullableString);
                } catch (IllegalArgumentException e) {
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Invalid original data source for cached offerings", e);
                    hTTPResponseOriginalSourceValueOf = null;
                }
                if (hTTPResponseOriginalSourceValueOf == null) {
                    hTTPResponseOriginalSourceValueOf = HTTPResponseOriginalSource.MAIN;
                }
            } else {
                hTTPResponseOriginalSourceValueOf = HTTPResponseOriginalSource.MAIN;
            }
            OfferingsManager.this.createAndCacheOfferings(cachedOfferingsResponse, hTTPResponseOriginalSourceValueOf, true, this.$onError, this.$onSuccess);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00992 extends n implements k {
        final DiagnosticsTracker.CacheStatus $cacheStatus;
        final u00.n $onErrorTracked;

        public C00992(u00.n nVar, DiagnosticsTracker.CacheStatus cacheStatus) {
            super(1);
            this.$onErrorTracked = nVar;
            this.$cacheStatus = cacheStatus;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return b0.a;
        }

        public final void invoke(PurchasesError it) {
            m.e(it, "it");
            this.$onErrorTracked.invoke(it, this.$cacheStatus);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;", "it", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C01003 extends n implements k {
        final DiagnosticsTracker.CacheStatus $cacheStatus;
        final u00.n $onSuccessTracked;

        public C01003(u00.n nVar, DiagnosticsTracker.CacheStatus cacheStatus) {
            super(1);
            this.$onSuccessTracked = nVar;
            this.$cacheStatus = cacheStatus;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((OfferingsResultData) obj);
            return b0.a;
        }

        public final void invoke(OfferingsResultData it) {
            m.e(it, "it");
            this.$onSuccessTracked.invoke(it, this.$cacheStatus);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C01011 extends n implements u00.a {
        final k $onSuccess;
        final OfferingsManager this$0;

        public C01011(k kVar, OfferingsManager offeringsManager) {
            super(0);
            this.$onSuccess = kVar;
            this.this$0 = offeringsManager;
        }

        @Override
        public Object invoke() {
            m144invoke();
            return b0.a;
        }

        public final void m144invoke() {
            k kVar = this.$onSuccess;
            if (kVar != null) {
                kVar.invoke(this.this$0.emptyOfferings);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C01022 extends n implements u00.a {
        final PurchasesError $error;
        final k $onError;

        public C01022(k kVar, PurchasesError purchasesError) {
            super(0);
            this.$onError = kVar;
            this.$error = purchasesError;
        }

        @Override
        public Object invoke() {
            m145invoke();
            return b0.a;
        }

        public final void m145invoke() {
            k kVar = this.$onError;
            if (kVar != null) {
                kVar.invoke(this.$error);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C01032 extends n implements u00.a {
        final Offerings $cachedOfferings;
        final k $onSuccess;

        public C01032(k kVar, Offerings offerings) {
            super(0);
            this.$onSuccess = kVar;
            this.$cachedOfferings = offerings;
        }

        @Override
        public Object invoke() {
            m146invoke();
            return b0.a;
        }

        public final void m146invoke() {
            k kVar = this.$onSuccess;
            if (kVar != null) {
                kVar.invoke(this.$cachedOfferings);
            }
        }
    }

    public OfferingsManager(OfferingsCache offeringsCache, Backend backend, OfferingsFactory offeringsFactory, OfferingImagePreDownloader offeringImagePreDownloader, DiagnosticsTracker diagnosticsTracker, OfferingFontPreDownloader offeringFontPreDownloader, boolean z, DateProvider dateProvider, Handler handler) {
        m.e(offeringsCache, "offeringsCache");
        m.e(backend, "backend");
        m.e(offeringsFactory, "offeringsFactory");
        m.e(offeringImagePreDownloader, "offeringImagePreDownloader");
        m.e(offeringFontPreDownloader, "offeringFontPreDownloader");
        m.e(dateProvider, "dateProvider");
        this.offeringsCache = offeringsCache;
        this.backend = backend;
        this.offeringsFactory = offeringsFactory;
        this.offeringImagePreDownloader = offeringImagePreDownloader;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.offeringFontPreDownloader = offeringFontPreDownloader;
        this.uiPreviewMode = z;
        this.dateProvider = dateProvider;
        this.mainHandler = handler;
        this.emptyOfferings = new Offerings(null, y.A);
    }

    public OfferingsManager(OfferingsCache offeringsCache, Backend backend, OfferingsFactory offeringsFactory, OfferingImagePreDownloader offeringImagePreDownloader, DiagnosticsTracker diagnosticsTracker, OfferingFontPreDownloader offeringFontPreDownloader, boolean z, DateProvider dateProvider, Handler handler, int i, f fVar) {
        this(offeringsCache, backend, offeringsFactory, offeringImagePreDownloader, diagnosticsTracker, offeringFontPreDownloader, (i & 64) != 0 ? false : z, (i & 128) != 0 ? new DefaultDateProvider() : dateProvider, (i & 256) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }

    public final void createAndCacheOfferings(JSONObject offeringsJSON, HTTPResponseOriginalSource originalDataSource, boolean loadedFromDiskCache, k onError, k onSuccess) {
        this.offeringsFactory.createOfferings(offeringsJSON, originalDataSource, loadedFromDiskCache, new AnonymousClass1(onError), new AnonymousClass2(offeringsJSON, onSuccess));
    }

    public static void createAndCacheOfferings$default(OfferingsManager offeringsManager, JSONObject jSONObject, HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z, k kVar, k kVar2, int i, Object obj) {
        if ((i & 8) != 0) {
            kVar = null;
        }
        if ((i & 16) != 0) {
            kVar2 = null;
        }
        offeringsManager.createAndCacheOfferings(jSONObject, hTTPResponseOriginalSource, z, kVar, kVar2);
    }

    private final g00.k createTrackedOfferingsCallbacks(Date startTime, k onError, k onSuccess) {
        return new g00.k(new OfferingsManager$createTrackedOfferingsCallbacks$onErrorWithTracking$1(this, startTime, onError), new OfferingsManager$createTrackedOfferingsCallbacks$onSuccessWithTracking$1(this, startTime, onSuccess));
    }

    public final void dispatch(u00.a action) {
        if (m.a(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            action.invoke();
            return;
        }
        Handler handler = this.mainHandler;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new b4.a(8, action));
    }

    public static void fetchAndCacheOfferings$default(OfferingsManager offeringsManager, String str, boolean z, k kVar, k kVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            kVar = null;
        }
        if ((i & 8) != 0) {
            kVar2 = null;
        }
        offeringsManager.fetchAndCacheOfferings(str, z, kVar, kVar2);
    }

    private final void fetchOfferingsFromNetwork(String appUserID, boolean appInBackground, DiagnosticsTracker.CacheStatus cacheStatus, u00.n onErrorTracked, u00.n onSuccessTracked) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        LogIntent logIntent = LogIntent.DEBUG;
        OfferingsManager$fetchOfferingsFromNetwork$$inlined$log$1 offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1 = new OfferingsManager$fetchOfferingsFromNetwork$$inlined$log$1(logIntent, cacheStatus);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke(), null);
                break;
        }
        fetchAndCacheOfferings(appUserID, appInBackground, new C00992(onErrorTracked, cacheStatus), new C01003(onSuccessTracked, cacheStatus));
    }

    public static void getOfferings$default(OfferingsManager offeringsManager, String str, boolean z, k kVar, k kVar2, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            kVar = null;
        }
        if ((i & 8) != 0) {
            kVar2 = null;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        offeringsManager.getOfferings(str, z, kVar, kVar2, z2);
    }

    public final void handleErrorFetchingOfferings(PurchasesError error, k onError) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        LogIntent logIntent = h00.n.X0(new PurchasesErrorCode[]{PurchasesErrorCode.ConfigurationError, PurchasesErrorCode.UnexpectedBackendResponseError}).contains(error.getCode()) ? LogIntent.RC_ERROR : LogIntent.GOOGLE_ERROR;
        OfferingsManager$handleErrorFetchingOfferings$$inlined$log$1 offeringsManager$handleErrorFetchingOfferings$$inlined$log$1 = new OfferingsManager$handleErrorFetchingOfferings$$inlined$log$1(logIntent, error);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke(), null);
                break;
        }
        this.offeringsCache.forceCacheStale();
        dispatch(new C01022(onError, error));
    }

    public final void trackGetOfferingsResultIfNeeded(Date startTime, DiagnosticsTracker.CacheStatus cacheStatus, PurchasesError error, Set<String> requestedProductIds, Set<String> notFoundProductIds) {
        PurchasesErrorCode code;
        if (this.diagnosticsTrackerIfEnabled == null) {
            return;
        }
        long jBetween = DurationExtensionsKt.between(s30.b.B, startTime, this.dateProvider.getNow());
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        Integer numValueOf = null;
        String message = error != null ? error.getMessage() : null;
        if (error != null && (code = error.getCode()) != null) {
            numValueOf = Integer.valueOf(code.getCode());
        }
        diagnosticsTracker.m122trackGetOfferingsResultB8UsjHI(requestedProductIds, notFoundProductIds, message, numValueOf, null, cacheStatus, jBetween);
    }

    private final void trackGetOfferingsStartedIfNeeded() {
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.trackGetOfferingsStarted();
        }
    }

    private final void vendCachedOfferingsAndMaybeRefresh(String appUserID, boolean appInBackground, Offerings cachedOfferings, Date startTime, k onSuccess) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        LogIntent logIntent = LogIntent.DEBUG;
        OfferingsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1 offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1 = new OfferingsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1(logIntent);
        int[] iArr = LogWrapperKt.WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke(), null);
                break;
        }
        boolean zIsOfferingsCacheStale = this.offeringsCache.isOfferingsCacheStale(appInBackground);
        trackGetOfferingsResultIfNeeded(startTime, zIsOfferingsCacheStale ? DiagnosticsTracker.CacheStatus.STALE : DiagnosticsTracker.CacheStatus.VALID, null, null, null);
        dispatch(new C01032(onSuccess, cachedOfferings));
        if (zIsOfferingsCacheStale) {
            OfferingsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2 offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2 = new OfferingsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2(logIntent, appInBackground);
            switch (iArr[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.d(x5.k(logLevel11, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.w(x5.k(logLevel12, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.i(x5.k(logLevel13, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.d(x5.k(logLevel14, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.i(x5.k(logLevel15, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d(x5.k(logLevel16, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.d(x5.k(logLevel17, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w(x5.k(logLevel18, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w(x5.k(logLevel19, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w(x5.k(logLevel20, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke(), null);
                    break;
            }
            fetchAndCacheOfferings$default(this, appUserID, appInBackground, null, null, 12, null);
        }
    }

    public final void clearInMemoryOfferingsCache() {
        this.offeringsCache.clearInMemoryOfferingsCache();
    }

    public final void fetchAndCacheOfferings(String appUserID, boolean appInBackground, k onError, k onSuccess) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        m.e(appUserID, "appUserID");
        if (this.uiPreviewMode) {
            dispatch(new C00981(onSuccess, this));
            return;
        }
        LogIntent logIntent = LogIntent.RC_SUCCESS;
        OfferingsManager$fetchAndCacheOfferings$$inlined$log$1 offeringsManager$fetchAndCacheOfferings$$inlined$log$1 = new OfferingsManager$fetchAndCacheOfferings$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke(), null);
                break;
        }
        this.backend.getOfferings(appUserID, appInBackground, new AnonymousClass3(onError, onSuccess), new AnonymousClass4(onError, onSuccess));
    }

    public final String getCachedCurrentOfferingIdentifier() {
        Offering current;
        Offerings cachedOfferings = this.offeringsCache.getCachedOfferings();
        if (cachedOfferings == null || (current = cachedOfferings.getCurrent()) == null) {
            return null;
        }
        return current.getIdentifier();
    }

    public final void getOfferings(String appUserID, boolean appInBackground, k onError, k onSuccess, boolean fetchCurrent) {
        m.e(appUserID, "appUserID");
        if (this.uiPreviewMode) {
            dispatch(new C01011(onSuccess, this));
            return;
        }
        trackGetOfferingsStartedIfNeeded();
        Date now = this.dateProvider.getNow();
        g00.k kVarCreateTrackedOfferingsCallbacks = createTrackedOfferingsCallbacks(now, onError, onSuccess);
        u00.n nVar = (u00.n) kVarCreateTrackedOfferingsCallbacks.A;
        u00.n nVar2 = (u00.n) kVarCreateTrackedOfferingsCallbacks.B;
        Offerings cachedOfferings = this.offeringsCache.getCachedOfferings();
        if (fetchCurrent) {
            fetchOfferingsFromNetwork(appUserID, appInBackground, DiagnosticsTracker.CacheStatus.NOT_CHECKED, nVar, nVar2);
        } else if (cachedOfferings == null) {
            fetchOfferingsFromNetwork(appUserID, appInBackground, DiagnosticsTracker.CacheStatus.NOT_FOUND, nVar, nVar2);
        } else {
            vendCachedOfferingsAndMaybeRefresh(appUserID, appInBackground, cachedOfferings, now, onSuccess);
        }
    }

    public final void onAppForeground(String appUserID) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        m.e(appUserID, "appUserID");
        if (!this.uiPreviewMode && this.offeringsCache.isOfferingsCacheStale(false)) {
            LogIntent logIntent = LogIntent.DEBUG;
            OfferingsManager$onAppForeground$$inlined$log$1 offeringsManager$onAppForeground$$inlined$log$1 = new OfferingsManager$onAppForeground$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                        str = (String) offeringsManager$onAppForeground$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$onAppForeground$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                        str = (String) offeringsManager$onAppForeground$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$onAppForeground$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                        str = (String) offeringsManager$onAppForeground$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                        str = (String) offeringsManager$onAppForeground$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$onAppForeground$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$onAppForeground$$inlined$log$1.invoke(), null);
                    break;
            }
            fetchAndCacheOfferings$default(this, appUserID, false, null, null, 12, null);
        }
    }
}

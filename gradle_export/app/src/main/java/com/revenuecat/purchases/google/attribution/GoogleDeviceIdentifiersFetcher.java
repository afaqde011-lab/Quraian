package com.revenuecat.purchases.google.attribution;

import ab.e;
import android.app.Application;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import h00.d0;
import ie.a;
import ie.b;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import u00.k;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u001e\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher;", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "<init>", "(Lcom/revenuecat/purchases/common/Dispatcher;)V", "Landroid/app/Application;", "applicationContext", "", "getAdvertisingID", "(Landroid/app/Application;)Ljava/lang/String;", "Lkotlin/Function1;", "", "Lg00/b0;", "completion", "getDeviceIdentifiers", "(Landroid/app/Application;Lu00/k;)V", "Lcom/revenuecat/purchases/common/Dispatcher;", "noPermissionAdvertisingIdValue", "Ljava/lang/String;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GoogleDeviceIdentifiersFetcher implements DeviceIdentifiersFetcher {
    private final Dispatcher dispatcher;
    private final String noPermissionAdvertisingIdValue;

    public GoogleDeviceIdentifiersFetcher(Dispatcher dispatcher) {
        m.e(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        this.noPermissionAdvertisingIdValue = "00000000-0000-0000-0000-000000000000";
    }

    private final String getAdvertisingID(Application applicationContext) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            a aVarA = b.a(applicationContext);
            String str3 = aVarA.a;
            if (!aVarA.a()) {
                if (!m.a(str3, this.noPermissionAdvertisingIdValue)) {
                    return str3;
                }
                LogIntent logIntent = LogIntent.WARNING;
                GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1 googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1 = new GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1(logIntent);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str = "[Purchases] - " + logLevel.name();
                            str2 = (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            return null;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke(), null);
                        return null;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke());
                            return null;
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke());
                            return null;
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            str2 = (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            return null;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke(), null);
                        return null;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke());
                            return null;
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            str2 = (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            return null;
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            str2 = (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            return null;
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke());
                            return null;
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke());
                            return null;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke(), null);
                        return null;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke());
                            return null;
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$1.invoke(), null);
                        return null;
                    default:
                        break;
                }
            }
        } catch (IOException e) {
            LogIntent logIntent2 = LogIntent.GOOGLE_ERROR;
            GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5 googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5 = new GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5(logIntent2, e);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.d(x5.k(logLevel11, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.w(x5.k(logLevel12, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.i(x5.k(logLevel13, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.d(x5.k(logLevel14, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.i(x5.k(logLevel15, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d(x5.k(logLevel16, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.d(x5.k(logLevel17, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w(x5.k(logLevel18, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w(x5.k(logLevel19, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w(x5.k(logLevel20, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5.invoke(), null);
                    break;
            }
        } catch (NoSuchMethodError unused) {
            LogIntent logIntent3 = LogIntent.GOOGLE_ERROR;
            GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7 googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7 = new GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7(logIntent3);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent3.ordinal()]) {
                case 1:
                    LogLevel logLevel21 = LogLevel.DEBUG;
                    LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                        currentLogHandler18.d(x5.k(logLevel21, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel22 = LogLevel.WARN;
                    LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                        currentLogHandler19.w(x5.k(logLevel22, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel23 = LogLevel.INFO;
                    LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                        currentLogHandler20.i(x5.k(logLevel23, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel24 = LogLevel.DEBUG;
                    LogHandler currentLogHandler21 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                        currentLogHandler21.d(x5.k(logLevel24, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel25 = LogLevel.INFO;
                    LogHandler currentLogHandler22 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                        currentLogHandler22.i(x5.k(logLevel25, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel26 = LogLevel.DEBUG;
                    LogHandler currentLogHandler23 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                        currentLogHandler23.d(x5.k(logLevel26, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel27 = LogLevel.DEBUG;
                    LogHandler currentLogHandler24 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                        currentLogHandler24.d(x5.k(logLevel27, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel28 = LogLevel.WARN;
                    LogHandler currentLogHandler25 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                        currentLogHandler25.w(x5.k(logLevel28, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel29 = LogLevel.WARN;
                    LogHandler currentLogHandler26 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                        currentLogHandler26.w(x5.k(logLevel29, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel30 = LogLevel.WARN;
                    LogHandler currentLogHandler27 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                        currentLogHandler27.w(x5.k(logLevel30, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7.invoke(), null);
                    break;
            }
        } catch (NullPointerException e2) {
            LogIntent logIntent4 = LogIntent.GOOGLE_ERROR;
            GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6 googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6 = new GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6(logIntent4, e2);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent4.ordinal()]) {
                case 1:
                    LogLevel logLevel31 = LogLevel.DEBUG;
                    LogHandler currentLogHandler28 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel31) <= 0) {
                        currentLogHandler28.d(x5.k(logLevel31, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel32 = LogLevel.WARN;
                    LogHandler currentLogHandler29 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel32) <= 0) {
                        currentLogHandler29.w(x5.k(logLevel32, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel33 = LogLevel.INFO;
                    LogHandler currentLogHandler30 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel33) <= 0) {
                        currentLogHandler30.i(x5.k(logLevel33, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel34 = LogLevel.DEBUG;
                    LogHandler currentLogHandler31 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel34) <= 0) {
                        currentLogHandler31.d(x5.k(logLevel34, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel35 = LogLevel.INFO;
                    LogHandler currentLogHandler32 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel35) <= 0) {
                        currentLogHandler32.i(x5.k(logLevel35, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel36 = LogLevel.DEBUG;
                    LogHandler currentLogHandler33 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel36) <= 0) {
                        currentLogHandler33.d(x5.k(logLevel36, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel37 = LogLevel.DEBUG;
                    LogHandler currentLogHandler34 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel37) <= 0) {
                        currentLogHandler34.d(x5.k(logLevel37, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel38 = LogLevel.WARN;
                    LogHandler currentLogHandler35 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel38) <= 0) {
                        currentLogHandler35.w(x5.k(logLevel38, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel39 = LogLevel.WARN;
                    LogHandler currentLogHandler36 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel39) <= 0) {
                        currentLogHandler36.w(x5.k(logLevel39, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel40 = LogLevel.WARN;
                    LogHandler currentLogHandler37 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel40) <= 0) {
                        currentLogHandler37.w(x5.k(logLevel40, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6.invoke(), null);
                    break;
            }
        } catch (TimeoutException e3) {
            LogIntent logIntent5 = LogIntent.GOOGLE_ERROR;
            GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4 googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4 = new GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4(logIntent5, e3);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent5.ordinal()]) {
                case 1:
                    LogLevel logLevel41 = LogLevel.DEBUG;
                    LogHandler currentLogHandler38 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel41) <= 0) {
                        currentLogHandler38.d(x5.k(logLevel41, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel42 = LogLevel.WARN;
                    LogHandler currentLogHandler39 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel42) <= 0) {
                        currentLogHandler39.w(x5.k(logLevel42, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel43 = LogLevel.INFO;
                    LogHandler currentLogHandler40 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel43) <= 0) {
                        currentLogHandler40.i(x5.k(logLevel43, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel44 = LogLevel.DEBUG;
                    LogHandler currentLogHandler41 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel44) <= 0) {
                        currentLogHandler41.d(x5.k(logLevel44, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel45 = LogLevel.INFO;
                    LogHandler currentLogHandler42 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel45) <= 0) {
                        currentLogHandler42.i(x5.k(logLevel45, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel46 = LogLevel.DEBUG;
                    LogHandler currentLogHandler43 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel46) <= 0) {
                        currentLogHandler43.d(x5.k(logLevel46, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel47 = LogLevel.DEBUG;
                    LogHandler currentLogHandler44 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel47) <= 0) {
                        currentLogHandler44.d(x5.k(logLevel47, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel48 = LogLevel.WARN;
                    LogHandler currentLogHandler45 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel48) <= 0) {
                        currentLogHandler45.w(x5.k(logLevel48, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel49 = LogLevel.WARN;
                    LogHandler currentLogHandler46 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel49) <= 0) {
                        currentLogHandler46.w(x5.k(logLevel49, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel50 = LogLevel.WARN;
                    LogHandler currentLogHandler47 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel50) <= 0) {
                        currentLogHandler47.w(x5.k(logLevel50, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$4.invoke(), null);
                    break;
            }
        } catch (GooglePlayServicesNotAvailableException e4) {
            LogIntent logIntent6 = LogIntent.GOOGLE_ERROR;
            GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2 googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2 = new GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2(logIntent6, e4);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent6.ordinal()]) {
                case 1:
                    LogLevel logLevel51 = LogLevel.DEBUG;
                    LogHandler currentLogHandler48 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel51) <= 0) {
                        currentLogHandler48.d(x5.k(logLevel51, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel52 = LogLevel.WARN;
                    LogHandler currentLogHandler49 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel52) <= 0) {
                        currentLogHandler49.w(x5.k(logLevel52, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel53 = LogLevel.INFO;
                    LogHandler currentLogHandler50 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel53) <= 0) {
                        currentLogHandler50.i(x5.k(logLevel53, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel54 = LogLevel.DEBUG;
                    LogHandler currentLogHandler51 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel54) <= 0) {
                        currentLogHandler51.d(x5.k(logLevel54, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel55 = LogLevel.INFO;
                    LogHandler currentLogHandler52 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel55) <= 0) {
                        currentLogHandler52.i(x5.k(logLevel55, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel56 = LogLevel.DEBUG;
                    LogHandler currentLogHandler53 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel56) <= 0) {
                        currentLogHandler53.d(x5.k(logLevel56, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel57 = LogLevel.DEBUG;
                    LogHandler currentLogHandler54 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel57) <= 0) {
                        currentLogHandler54.d(x5.k(logLevel57, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel58 = LogLevel.WARN;
                    LogHandler currentLogHandler55 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel58) <= 0) {
                        currentLogHandler55.w(x5.k(logLevel58, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel59 = LogLevel.WARN;
                    LogHandler currentLogHandler56 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel59) <= 0) {
                        currentLogHandler56.w(x5.k(logLevel59, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel60 = LogLevel.WARN;
                    LogHandler currentLogHandler57 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel60) <= 0) {
                        currentLogHandler57.w(x5.k(logLevel60, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2.invoke(), null);
                    break;
            }
        } catch (GooglePlayServicesRepairableException e5) {
            LogIntent logIntent7 = LogIntent.GOOGLE_ERROR;
            GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3 googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3 = new GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3(logIntent7, e5);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent7.ordinal()]) {
                case 1:
                    LogLevel logLevel61 = LogLevel.DEBUG;
                    LogHandler currentLogHandler58 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel61) <= 0) {
                        currentLogHandler58.d(x5.k(logLevel61, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel62 = LogLevel.WARN;
                    LogHandler currentLogHandler59 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel62) <= 0) {
                        currentLogHandler59.w(x5.k(logLevel62, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel63 = LogLevel.INFO;
                    LogHandler currentLogHandler60 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel63) <= 0) {
                        currentLogHandler60.i(x5.k(logLevel63, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel64 = LogLevel.DEBUG;
                    LogHandler currentLogHandler61 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel64) <= 0) {
                        currentLogHandler61.d(x5.k(logLevel64, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel65 = LogLevel.INFO;
                    LogHandler currentLogHandler62 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel65) <= 0) {
                        currentLogHandler62.i(x5.k(logLevel65, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel66 = LogLevel.DEBUG;
                    LogHandler currentLogHandler63 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel66) <= 0) {
                        currentLogHandler63.d(x5.k(logLevel66, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel67 = LogLevel.DEBUG;
                    LogHandler currentLogHandler64 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel67) <= 0) {
                        currentLogHandler64.d(x5.k(logLevel67, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel68 = LogLevel.WARN;
                    LogHandler currentLogHandler65 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel68) <= 0) {
                        currentLogHandler65.w(x5.k(logLevel68, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel69 = LogLevel.WARN;
                    LogHandler currentLogHandler66 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel69) <= 0) {
                        currentLogHandler66.w(x5.k(logLevel69, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel70 = LogLevel.WARN;
                    LogHandler currentLogHandler67 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel70) <= 0) {
                        currentLogHandler67.w(x5.k(logLevel70, new StringBuilder("[Purchases] - ")), (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) googleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3.invoke(), null);
                    break;
            }
        }
        return null;
    }

    public static final void getDeviceIdentifiers$lambda$0(GoogleDeviceIdentifiersFetcher googleDeviceIdentifiersFetcher, Application application, k kVar) {
        kVar.invoke(MapExtensionsKt.filterNotNullValues(d0.R(new g00.k(SubscriberAttributeKey.DeviceIdentifiers.GPSAdID.INSTANCE.getBackendKey(), googleDeviceIdentifiersFetcher.getAdvertisingID(application)), new g00.k(SubscriberAttributeKey.DeviceIdentifiers.IP.INSTANCE.getBackendKey(), "true"), new g00.k(SubscriberAttributeKey.DeviceIdentifiers.DeviceVersion.INSTANCE.getBackendKey(), "true"))));
    }

    @Override
    public void getDeviceIdentifiers(Application applicationContext, k completion) {
        m.e(applicationContext, "applicationContext");
        m.e(completion, "completion");
        Dispatcher.enqueue$default(this.dispatcher, new e(this, applicationContext, completion, 5), null, 2, null);
    }
}

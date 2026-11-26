package com.revenuecat.purchases.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.backup.RevenueCatBackupAgent;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import g00.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import r30.r;
import u00.a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\fJ\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001f¨\u0006!²\u0006\f\u0010\u0012\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/revenuecat/purchases/common/SharedPreferencesManager;", "", "Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "revenueCatSharedPreferences", "Lg00/h;", "legacySharedPreferences", "<init>", "(Landroid/content/Context;Landroid/content/SharedPreferences;Lg00/h;)V", "Lg00/b0;", "ensureMigrated", "()V", "performMigration", "", "", "getRevenueCatKeysToMigrate", "()Ljava/util/List;", "legacyPrefs", "Landroid/content/SharedPreferences$Editor;", "editor", SubscriberAttributeKt.JSON_NAME_KEY, "", "migratePreferenceValue", "(Landroid/content/SharedPreferences;Landroid/content/SharedPreferences$Editor;Ljava/lang/String;)Z", "hasRevenueCatVersion", "()Z", "updateSharedPreferencesVersion", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "Lg00/h;", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SharedPreferencesManager {

    public static final Companion INSTANCE = new Companion(null);
    public static final int EXPECTED_VERSION = 1;
    public static final String EXPECTED_VERSION_KEY = "com.revenuecat.purchases.shared_preferences_version";
    public static final String SHARED_PREFERENCES_PREFIX = "com.revenuecat.purchases.";
    private final h legacySharedPreferences;
    private final SharedPreferences revenueCatSharedPreferences;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends n implements a {
        final Context $context;

        public AnonymousClass1(Context context) {
            super(0);
            this.$context = context;
        }

        @Override
        public final SharedPreferences invoke() {
            return PreferenceManager.getDefaultSharedPreferences(this.$context);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0002¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/common/SharedPreferencesManager$Companion;", "", "()V", "EXPECTED_VERSION", "", "getEXPECTED_VERSION$annotations", "EXPECTED_VERSION_KEY", "", "getEXPECTED_VERSION_KEY$annotations", "SHARED_PREFERENCES_PREFIX", "getSHARED_PREFERENCES_PREFIX$annotations", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public static void getEXPECTED_VERSION$annotations() {
        }

        public static void getEXPECTED_VERSION_KEY$annotations() {
        }

        public static void getSHARED_PREFERENCES_PREFIX$annotations() {
        }
    }

    public SharedPreferencesManager(Context context, SharedPreferences revenueCatSharedPreferences, h legacySharedPreferences) {
        m.e(context, "context");
        m.e(revenueCatSharedPreferences, "revenueCatSharedPreferences");
        m.e(legacySharedPreferences, "legacySharedPreferences");
        this.revenueCatSharedPreferences = revenueCatSharedPreferences;
        this.legacySharedPreferences = legacySharedPreferences;
    }

    public SharedPreferencesManager(Context context, SharedPreferences sharedPreferences, h hVar, int i, f fVar) {
        if ((i & 2) != 0) {
            sharedPreferences = context.getSharedPreferences(RevenueCatBackupAgent.REVENUECAT_PREFS_FILE_NAME, 0);
            m.d(sharedPreferences, "context.getSharedPrefere…ntext.MODE_PRIVATE,\n    )");
        }
        this(context, sharedPreferences, (i & 4) != 0 ? rd.a.J(new AnonymousClass1(context)) : hVar);
    }

    private final void ensureMigrated() {
        if (hasRevenueCatVersion()) {
            return;
        }
        Set<String> setKeySet = ((SharedPreferences) this.legacySharedPreferences.getValue()).getAll().keySet();
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            for (String key : setKeySet) {
                m.d(key, "key");
                if (r.x0(key, SHARED_PREFERENCES_PREFIX, false)) {
                    performMigration();
                    break;
                }
            }
        }
        updateSharedPreferencesVersion();
    }

    private final List<String> getRevenueCatKeysToMigrate() {
        Set<String> setKeySet = getRevenueCatKeysToMigrate$lambda$6(this.legacySharedPreferences).getAll().keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            String key = (String) obj;
            m.d(key, "key");
            if (r.x0(key, SHARED_PREFERENCES_PREFIX, false)) {
                arrayList.add(obj);
            }
        }
        LogIntent logIntent = LogIntent.DEBUG;
        SharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1 sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1 = new SharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1(logIntent, arrayList);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke());
                }
                return arrayList;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke(), null);
                return arrayList;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke());
                    return arrayList;
                }
                return arrayList;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke());
                    return arrayList;
                }
                return arrayList;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    currentLogHandler4.d(x5.k(logLevel4, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke());
                    return arrayList;
                }
                return arrayList;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke(), null);
                return arrayList;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler5.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke());
                    return arrayList;
                }
                return arrayList;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    currentLogHandler6.d(x5.k(logLevel6, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke());
                    return arrayList;
                }
                return arrayList;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    currentLogHandler7.d(x5.k(logLevel7, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke());
                    return arrayList;
                }
                return arrayList;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler8.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke());
                    return arrayList;
                }
                return arrayList;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler9.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke());
                    return arrayList;
                }
                return arrayList;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke(), null);
                return arrayList;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler10.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke());
                    return arrayList;
                }
                return arrayList;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1.invoke(), null);
                return arrayList;
            default:
                return arrayList;
        }
    }

    private static final SharedPreferences getRevenueCatKeysToMigrate$lambda$6(h hVar) {
        return (SharedPreferences) hVar.getValue();
    }

    private final boolean hasRevenueCatVersion() {
        return this.revenueCatSharedPreferences.contains(EXPECTED_VERSION_KEY);
    }

    private final boolean migratePreferenceValue(SharedPreferences legacyPrefs, SharedPreferences.Editor editor, String key) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        try {
            Object obj = legacyPrefs.getAll().get(key);
            if (obj instanceof String) {
                editor.putString(key, (String) obj);
                return true;
            }
            if (obj instanceof Boolean) {
                editor.putBoolean(key, ((Boolean) obj).booleanValue());
                return true;
            }
            if (obj instanceof Integer) {
                editor.putInt(key, ((Number) obj).intValue());
                return true;
            }
            if (obj instanceof Long) {
                editor.putLong(key, ((Number) obj).longValue());
                return true;
            }
            if (obj instanceof Float) {
                editor.putFloat(key, ((Number) obj).floatValue());
                return true;
            }
            if (obj instanceof Set) {
                editor.putStringSet(key, (Set) obj);
                return true;
            }
            LogIntent logIntent = LogIntent.WARNING;
            SharedPreferencesManager$migratePreferenceValue$$inlined$log$1 sharedPreferencesManager$migratePreferenceValue$$inlined$log$1 = new SharedPreferencesManager$migratePreferenceValue$$inlined$log$1(logIntent, key, obj);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    return false;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke(), null);
                    return false;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke());
                    }
                    return false;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke());
                    }
                    return false;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    return false;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke(), null);
                    return false;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke());
                    }
                    return false;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    return false;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                    }
                    return false;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke());
                    }
                    return false;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke());
                    }
                    return false;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke(), null);
                    return false;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke());
                    }
                    return false;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$migratePreferenceValue$$inlined$log$1.invoke(), null);
                    return false;
                default:
                    return false;
            }
        } catch (ClassCastException e) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to migrate preference with key due to type casting: " + key, e);
            return false;
        }
    }

    private final void performMigration() {
        LogHandler currentLogHandler;
        String strK;
        String str;
        LogIntent logIntent = LogIntent.DEBUG;
        SharedPreferencesManager$performMigration$$inlined$log$1 sharedPreferencesManager$performMigration$$inlined$log$1 = new SharedPreferencesManager$performMigration$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$performMigration$$inlined$log$1.invoke(), null);
                break;
        }
        List<String> revenueCatKeysToMigrate = getRevenueCatKeysToMigrate();
        h hVar = this.legacySharedPreferences;
        SharedPreferences.Editor editor = this.revenueCatSharedPreferences.edit();
        m.d(editor, "editor");
        Iterator<String> it = revenueCatKeysToMigrate.iterator();
        while (it.hasNext()) {
            migratePreferenceValue(performMigration$lambda$3(hVar), editor, it.next());
        }
        editor.apply();
        LogIntent logIntent2 = LogIntent.DEBUG;
        SharedPreferencesManager$performMigration$$inlined$log$2 sharedPreferencesManager$performMigration$$inlined$log$2 = new SharedPreferencesManager$performMigration$$inlined$log$2(logIntent2);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
            case 1:
                LogLevel logLevel11 = LogLevel.DEBUG;
                LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                    currentLogHandler8.d(x5.k(logLevel11, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke());
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke(), null);
                break;
            case 3:
                LogLevel logLevel12 = LogLevel.WARN;
                LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                    currentLogHandler9.w(x5.k(logLevel12, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke());
                }
                break;
            case 4:
                LogLevel logLevel13 = LogLevel.INFO;
                LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                    currentLogHandler10.i(x5.k(logLevel13, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke());
                }
                break;
            case 5:
                LogLevel logLevel14 = LogLevel.DEBUG;
                LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                    currentLogHandler11.d(x5.k(logLevel14, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke());
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke(), null);
                break;
            case 7:
                LogLevel logLevel15 = LogLevel.INFO;
                LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                    currentLogHandler12.i(x5.k(logLevel15, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke());
                }
                break;
            case 8:
                LogLevel logLevel16 = LogLevel.DEBUG;
                LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                    currentLogHandler13.d(x5.k(logLevel16, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke());
                }
                break;
            case 9:
                LogLevel logLevel17 = LogLevel.DEBUG;
                LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                    currentLogHandler14.d(x5.k(logLevel17, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke());
                }
                break;
            case 10:
                LogLevel logLevel18 = LogLevel.WARN;
                LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                    currentLogHandler15.w(x5.k(logLevel18, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke());
                }
                break;
            case 11:
                LogLevel logLevel19 = LogLevel.WARN;
                LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                    currentLogHandler16.w(x5.k(logLevel19, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke(), null);
                break;
            case 13:
                LogLevel logLevel20 = LogLevel.WARN;
                LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                    currentLogHandler17.w(x5.k(logLevel20, new StringBuilder("[Purchases] - ")), (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) sharedPreferencesManager$performMigration$$inlined$log$2.invoke(), null);
                break;
        }
    }

    private static final SharedPreferences performMigration$lambda$3(h hVar) {
        return (SharedPreferences) hVar.getValue();
    }

    private final void updateSharedPreferencesVersion() {
        SharedPreferences.Editor editor = this.revenueCatSharedPreferences.edit();
        m.d(editor, "editor");
        editor.putInt(EXPECTED_VERSION_KEY, 1);
        editor.apply();
    }

    public final SharedPreferences getSharedPreferences() {
        synchronized (this) {
            ensureMigrated();
        }
        return this.revenueCatSharedPreferences;
    }
}

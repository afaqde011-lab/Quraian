package com.revenuecat.purchases.common.caching;

import a1.b;
import android.content.Context;
import android.content.SharedPreferences;
import com.revenuecat.purchases.JsonTools;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import h00.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.SerializationException;
import q40.c;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\b\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadataStore;", "", "Landroid/content/Context;", "context", "", "apiKey", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lq40/c;", "json", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/SharedPreferences;Lq40/c;)V", "tokenHash", "", "hasCachedData", "(Ljava/lang/String;)Z", "purchaseToken", "getTokenHash", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;", "data", "Lg00/b0;", "cacheLocalTransactionMetadata", "(Ljava/lang/String;Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;)V", "getLocalTransactionMetadata", "(Ljava/lang/String;)Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;", "", "getAllLocalTransactionMetadata", "()Ljava/util/List;", "", "purchaseTokens", "clearLocalTransactionMetadata", "(Ljava/util/Set;)V", "Ljava/lang/String;", "Landroid/content/SharedPreferences;", "Lq40/c;", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LocalTransactionMetadataStore {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_PREFIX = "local_transaction_metadata_";
    private final String apiKey;
    private final c json;
    private final SharedPreferences sharedPreferences;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadataStore$Companion;", "", "()V", "KEY_PREFIX", "", "initializeSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "apiKey", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final SharedPreferences initializeSharedPreferences(Context context, String apiKey) {
            m.e(context, "context");
            m.e(apiKey, "apiKey");
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.revenuecat.purchases.transaction_metadata.".concat(apiKey), 0);
            m.d(sharedPreferences, "context.getSharedPrefere…DE_PRIVATE,\n            )");
            return sharedPreferences;
        }
    }

    public LocalTransactionMetadataStore(Context context, String apiKey, SharedPreferences sharedPreferences, c json) {
        m.e(context, "context");
        m.e(apiKey, "apiKey");
        m.e(sharedPreferences, "sharedPreferences");
        m.e(json, "json");
        this.apiKey = apiKey;
        this.sharedPreferences = sharedPreferences;
        this.json = json;
    }

    public LocalTransactionMetadataStore(Context context, String str, SharedPreferences sharedPreferences, c cVar, int i, f fVar) {
        this(context, str, (i & 4) != 0 ? Companion.initializeSharedPreferences(context, str) : sharedPreferences, (i & 8) != 0 ? JsonTools.INSTANCE.getJson() : cVar);
    }

    private final String getTokenHash(String purchaseToken) {
        return UtilsKt.sha1(purchaseToken);
    }

    private final boolean hasCachedData(String tokenHash) {
        return this.sharedPreferences.contains(KEY_PREFIX + tokenHash);
    }

    public final synchronized void cacheLocalTransactionMetadata(String purchaseToken, LocalTransactionMetadata data) {
        m.e(purchaseToken, "purchaseToken");
        m.e(data, "data");
        String tokenHash = getTokenHash(purchaseToken);
        if (hasCachedData(tokenHash)) {
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), "Purchase data already cached for token: " + purchaseToken + ". Skipping cache.");
            }
            return;
        }
        try {
            String str = KEY_PREFIX + tokenHash;
            String strD = this.json.d(LocalTransactionMetadata.INSTANCE.serializer(), data);
            SharedPreferences.Editor editor = this.sharedPreferences.edit();
            m.d(editor, "editor");
            editor.putString(str, strD);
            editor.apply();
            LogLevel logLevel2 = LogLevel.DEBUG;
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                currentLogHandler2.d("[Purchases] - " + logLevel2.name(), "Local transaction metadata cache updated");
            }
        } catch (SerializationException e) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to serialize local transaction metadata", e);
        }
    }

    public final synchronized void clearLocalTransactionMetadata(Set<String> purchaseTokens) {
        try {
            m.e(purchaseTokens, "purchaseTokens");
            if (purchaseTokens.isEmpty()) {
                return;
            }
            Set<String> set = purchaseTokens;
            ArrayList arrayList = new ArrayList(r.q0(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(getTokenHash((String) it.next()));
            }
            SharedPreferences.Editor editor = this.sharedPreferences.edit();
            m.d(editor, "editor");
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                String str = KEY_PREFIX + ((String) it2.next());
                if (this.sharedPreferences.contains(str)) {
                    editor.remove(str);
                    i++;
                }
            }
            editor.apply();
            if (i > 0) {
                LogLevel logLevel = LogLevel.VERBOSE;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v("[Purchases] - " + logLevel.name(), "Cleared local transaction metadata for " + i + " token(s)");
                }
            } else {
                LogLevel logLevel2 = LogLevel.DEBUG;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.d("[Purchases] - " + logLevel2.name(), "No transaction metadata found to clear from local cache.");
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final List<LocalTransactionMetadata> getAllLocalTransactionMetadata() {
        Set<String> setKeySet = this.sharedPreferences.getAll().keySet();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            String it = (String) obj;
            m.d(it, "it");
            if (r30.r.x0(it, KEY_PREFIX, false)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            String string = this.sharedPreferences.getString(str, null);
            if (string != null) {
                try {
                    arrayList2.add((LocalTransactionMetadata) this.json.b(string, LocalTransactionMetadata.INSTANCE.serializer()));
                } catch (SerializationException e) {
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to deserialize transaction metadata for key: " + str, e);
                    SharedPreferences.Editor editor = this.sharedPreferences.edit();
                    m.d(editor, "editor");
                    editor.remove(str);
                    editor.apply();
                }
            }
        }
        return arrayList2;
    }

    public final LocalTransactionMetadata getLocalTransactionMetadata(String purchaseToken) {
        m.e(purchaseToken, "purchaseToken");
        String strO = b.o(KEY_PREFIX, getTokenHash(purchaseToken));
        String string = this.sharedPreferences.getString(strO, null);
        if (string == null) {
            return null;
        }
        try {
            return (LocalTransactionMetadata) this.json.b(string, LocalTransactionMetadata.INSTANCE.serializer());
        } catch (SerializationException e) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to deserialize local transaction metadata. Clearing cache.", e);
            SharedPreferences.Editor editor = this.sharedPreferences.edit();
            m.d(editor, "editor");
            editor.remove(strO);
            editor.apply();
            return null;
        }
    }
}

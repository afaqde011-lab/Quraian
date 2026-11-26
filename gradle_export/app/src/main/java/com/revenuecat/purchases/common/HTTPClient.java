package com.revenuecat.purchases.common;

import a.a;
import android.os.Build;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.ForceServerErrorStrategy;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.api.BuildConfig;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.networking.ConnectionErrorReason;
import com.revenuecat.purchases.common.networking.ETagManager;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPRequest;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import com.revenuecat.purchases.common.networking.MapConverter;
import com.revenuecat.purchases.common.networking.NullPointerReadingErrorStreamException;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.common.verification.SignatureVerificationException;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.interfaces.StorefrontProvider;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import g00.g;
import g00.k;
import h00.d0;
import h00.q;
import h00.x;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;
import r30.r;
import s30.b;

@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0016\b\u0000\u0018\u0000 }2\u00020\u0001:\u0001}Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001d\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\u001d\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u0004\u0018\u00010\u001a2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020#H\u0002¢\u0006\u0004\b-\u0010.Jy\u0010<\u001a\u0004\u0018\u00010;2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001052\u001a\u00108\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#07\u0018\u0001062\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#052\u0006\u0010:\u001a\u000201H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020#2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJK\u0010I\u001a\u00020,2\u0006\u00100\u001a\u00020/2\u0006\u00104\u001a\u0002032\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u0002012\b\u0010E\u001a\u0004\u0018\u00010;2\u0006\u0010F\u001a\u0002012\b\u0010H\u001a\u0004\u0018\u00010GH\u0002¢\u0006\u0004\bI\u0010JJ[\u0010P\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#052\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#052\u0006\u0010L\u001a\u00020/2\u0006\u0010:\u001a\u0002012\b\u0010M\u001a\u0004\u0018\u00010#2\u0006\u0010N\u001a\u0002012\b\u0010O\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\bP\u0010QJ\u001f\u0010U\u001a\u00020&2\u0006\u0010R\u001a\u00020>2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020#H\u0002¢\u0006\u0004\bW\u0010XJ=\u0010]\u001a\u00020\\2\u0006\u0010Y\u001a\u00020#2\u0006\u0010'\u001a\u00020Z2\b\u0010[\u001a\u0004\u0018\u00010#2\b\u0010M\u001a\u0004\u0018\u00010#2\b\u0010O\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b]\u0010^J\u001f\u0010`\u001a\n _*\u0004\u0018\u00010#0#2\u0006\u0010'\u001a\u00020ZH\u0002¢\u0006\u0004\b`\u0010aJ\u0019\u0010b\u001a\u0004\u0018\u00010#2\u0006\u0010'\u001a\u00020ZH\u0002¢\u0006\u0004\bb\u0010aJ\u0019\u0010c\u001a\u0004\u0018\u00010B2\u0006\u0010'\u001a\u00020ZH\u0002¢\u0006\u0004\bc\u0010dJ\u0017\u0010e\u001a\u0002012\u0006\u0010'\u001a\u00020ZH\u0002¢\u0006\u0004\be\u0010fJ\u0089\u0001\u0010j\u001a\u00020;2\u0006\u00100\u001a\u00020/2\u0006\u00104\u001a\u0002032\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001052\u001a\u00108\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#07\u0018\u0001062\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#052\b\b\u0002\u0010:\u001a\u0002012\u000e\b\u0002\u0010g\u001a\b\u0012\u0004\u0012\u00020/062\b\b\u0002\u0010i\u001a\u00020h¢\u0006\u0004\bj\u0010kJ\r\u0010l\u001a\u00020,¢\u0006\u0004\bl\u0010mR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010oR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010pR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010q\u001a\u0004\br\u0010sR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010tR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010uR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010vR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010wR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010xR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010yR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010zR\u0014\u0010{\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|¨\u0006~"}, d2 = {"Lcom/revenuecat/purchases/common/HTTPClient;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/networking/ETagManager;", "eTagManager", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/verification/SigningManager;", "signingManager", "Lcom/revenuecat/purchases/interfaces/StorefrontProvider;", "storefrontProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "Lcom/revenuecat/purchases/common/networking/MapConverter;", "mapConverter", "Lcom/revenuecat/purchases/common/LocaleProvider;", "localeProvider", "Lcom/revenuecat/purchases/ForceServerErrorStrategy;", "forceServerErrorStrategy", "Lcom/revenuecat/purchases/common/RequestResponseListener;", "requestResponseListener", "Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;", "timeoutManager", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/networking/ETagManager;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/common/verification/SigningManager;Lcom/revenuecat/purchases/interfaces/StorefrontProvider;Lcom/revenuecat/purchases/common/DateProvider;Lcom/revenuecat/purchases/common/networking/MapConverter;Lcom/revenuecat/purchases/common/LocaleProvider;Lcom/revenuecat/purchases/ForceServerErrorStrategy;Lcom/revenuecat/purchases/common/RequestResponseListener;Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;)V", "Ljava/io/InputStream;", "inputStream", "Ljava/io/BufferedReader;", "buffer", "(Ljava/io/InputStream;)Ljava/io/BufferedReader;", "Ljava/io/OutputStream;", "outputStream", "Ljava/io/BufferedWriter;", "(Ljava/io/OutputStream;)Ljava/io/BufferedWriter;", "", "readFully", "(Ljava/io/InputStream;)Ljava/lang/String;", "Ljava/net/HttpURLConnection;", "connection", "getInputStream", "(Ljava/net/HttpURLConnection;)Ljava/io/InputStream;", "writer", "body", "Lg00/b0;", "writeFully", "(Ljava/io/BufferedWriter;Ljava/lang/String;)V", "Ljava/net/URL;", "baseURL", "", "isFallbackURL", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "endpoint", "", "", "Lg00/k;", "postFieldsToSign", "requestHeaders", "refreshETag", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "performCall", "(Ljava/net/URL;ZLcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Z)Lcom/revenuecat/purchases/common/networking/HTTPResult;", "Lcom/revenuecat/purchases/common/networking/HTTPRequest;", "httpRequest", "toCurlRequest", "(Lcom/revenuecat/purchases/common/networking/HTTPRequest;)Ljava/lang/String;", "Ljava/util/Date;", "requestStartTime", "callSuccessful", "callResult", "isRetry", "Ljava/io/IOException;", "connectionException", "trackHttpRequestPerformedIfNeeded", "(Ljava/net/URL;Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Date;ZLcom/revenuecat/purchases/common/networking/HTTPResult;ZLjava/io/IOException;)V", "authenticationHeaders", "fullURL", "nonce", "shouldSignResponse", "postFieldsToSignHeader", "getHeaders", "(Ljava/util/Map;Ljava/net/URL;ZLjava/lang/String;ZLjava/lang/String;)Ljava/util/Map;", "request", "", "timeoutMs", "getConnection", "(Lcom/revenuecat/purchases/common/networking/HTTPRequest;J)Ljava/net/HttpURLConnection;", "getXPlatformHeader", "()Ljava/lang/String;", "urlPath", "Ljava/net/URLConnection;", "payload", "Lcom/revenuecat/purchases/VerificationResult;", "verifyResponse", "(Ljava/lang/String;Ljava/net/URLConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/VerificationResult;", "kotlin.jvm.PlatformType", "getETagHeader", "(Ljava/net/URLConnection;)Ljava/lang/String;", "getRequestTimeHeader", "getRequestDateHeader", "(Ljava/net/URLConnection;)Ljava/util/Date;", "getLoadShedderHeader", "(Ljava/net/URLConnection;)Z", "fallbackBaseURLs", "", "fallbackURLIndex", "performRequest", "(Ljava/net/URL;Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;ZLjava/util/List;I)Lcom/revenuecat/purchases/common/networking/HTTPResult;", "clearCaches", "()V", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/networking/ETagManager;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/common/verification/SigningManager;", "getSigningManager", "()Lcom/revenuecat/purchases/common/verification/SigningManager;", "Lcom/revenuecat/purchases/interfaces/StorefrontProvider;", "Lcom/revenuecat/purchases/common/DateProvider;", "Lcom/revenuecat/purchases/common/networking/MapConverter;", "Lcom/revenuecat/purchases/common/LocaleProvider;", "Lcom/revenuecat/purchases/ForceServerErrorStrategy;", "Lcom/revenuecat/purchases/common/RequestResponseListener;", "Lcom/revenuecat/purchases/common/networking/HTTPTimeoutManager;", "enableExtraRequestLogging", "Z", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HTTPClient {
    public static final int NO_STATUS_CODE = -1;
    private final AppConfig appConfig;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final ETagManager eTagManager;
    private final boolean enableExtraRequestLogging;
    private final ForceServerErrorStrategy forceServerErrorStrategy;
    private final LocaleProvider localeProvider;
    private final MapConverter mapConverter;
    private final RequestResponseListener requestResponseListener;
    private final SigningManager signingManager;
    private final StorefrontProvider storefrontProvider;
    private final HTTPTimeoutManager timeoutManager;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.AMAZON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HTTPClient(AppConfig appConfig, ETagManager eTagManager, DiagnosticsTracker diagnosticsTracker, SigningManager signingManager, StorefrontProvider storefrontProvider, DateProvider dateProvider, MapConverter mapConverter, LocaleProvider localeProvider, ForceServerErrorStrategy forceServerErrorStrategy, RequestResponseListener requestResponseListener, HTTPTimeoutManager timeoutManager) {
        m.e(appConfig, "appConfig");
        m.e(eTagManager, "eTagManager");
        m.e(signingManager, "signingManager");
        m.e(storefrontProvider, "storefrontProvider");
        m.e(dateProvider, "dateProvider");
        m.e(mapConverter, "mapConverter");
        m.e(localeProvider, "localeProvider");
        m.e(timeoutManager, "timeoutManager");
        this.appConfig = appConfig;
        this.eTagManager = eTagManager;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.signingManager = signingManager;
        this.storefrontProvider = storefrontProvider;
        this.dateProvider = dateProvider;
        this.mapConverter = mapConverter;
        this.localeProvider = localeProvider;
        this.forceServerErrorStrategy = forceServerErrorStrategy;
        this.requestResponseListener = requestResponseListener;
        this.timeoutManager = timeoutManager;
        this.enableExtraRequestLogging = false;
    }

    public HTTPClient(AppConfig appConfig, ETagManager eTagManager, DiagnosticsTracker diagnosticsTracker, SigningManager signingManager, StorefrontProvider storefrontProvider, DateProvider dateProvider, MapConverter mapConverter, LocaleProvider localeProvider, ForceServerErrorStrategy forceServerErrorStrategy, RequestResponseListener requestResponseListener, HTTPTimeoutManager hTTPTimeoutManager, int i, f fVar) {
        DateProvider defaultDateProvider = (i & 32) != 0 ? new DefaultDateProvider() : dateProvider;
        this(appConfig, eTagManager, diagnosticsTracker, signingManager, storefrontProvider, defaultDateProvider, (i & 64) != 0 ? new MapConverter() : mapConverter, localeProvider, (i & 256) != 0 ? null : forceServerErrorStrategy, (i & 512) != 0 ? null : requestResponseListener, (i & 1024) != 0 ? new HTTPTimeoutManager(appConfig, defaultDateProvider) : hTTPTimeoutManager);
    }

    private final BufferedReader buffer(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    private final BufferedWriter buffer(OutputStream outputStream) {
        return new BufferedWriter(new OutputStreamWriter(outputStream));
    }

    private final HttpURLConnection getConnection(HTTPRequest request, long timeoutMs) throws IOException {
        URLConnection uRLConnectionOpenConnection = request.getFullURL().openConnection();
        m.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setConnectTimeout((int) timeoutMs);
        for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
        }
        JSONObject body = request.getBody();
        if (body != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            OutputStream os2 = httpURLConnection.getOutputStream();
            m.d(os2, "os");
            BufferedWriter bufferedWriterBuffer = buffer(os2);
            String string = body.toString();
            m.d(string, "body.toString()");
            writeFully(bufferedWriterBuffer, string);
        }
        return httpURLConnection;
    }

    private final String getETagHeader(URLConnection connection) {
        return connection.getHeaderField("X-RevenueCat-ETag");
    }

    private final Map<String, String> getHeaders(Map<String, String> authenticationHeaders, URL fullURL, boolean refreshETag, String nonce, boolean shouldSignResponse, String postFieldsToSignHeader) {
        LinkedHashMap linkedHashMapU = d0.U(d0.R(new k("Content-Type", "application/json"), new k("X-Platform", getXPlatformHeader()), new k("X-Platform-Flavor", this.appConfig.getPlatformInfo().getFlavor()), new k("X-Platform-Flavor-Version", this.appConfig.getPlatformInfo().getVersion()), new k("X-Platform-Version", String.valueOf(Build.VERSION.SDK_INT)), new k("X-Platform-Device", Build.MODEL), new k("X-Platform-Brand", Build.BRAND), new k("X-Version", "10.2.0"), new k("X-Preferred-Locales", r.u0(this.localeProvider.getCurrentLocalesLanguageTags(), '-', '_')), new k("X-Client-Locale", this.appConfig.getLanguageTag()), new k("X-Client-Version", this.appConfig.getVersionName()), new k("X-Client-Bundle-ID", this.appConfig.getPackageName()), new k("X-Observer-Mode-Enabled", this.appConfig.getFinishTransactions() ? "false" : "true"), new k("X-Nonce", nonce), new k(HTTPRequest.POST_PARAMS_HASH, postFieldsToSignHeader), new k("X-Custom-Entitlements-Computation", this.appConfig.getCustomEntitlementComputation() ? "true" : null), new k("X-UI-Preview-Mode", this.appConfig.getUiPreviewMode() ? "true" : null), new k("X-Storefront", this.storefrontProvider.getStorefront()), new k("X-Is-Debug-Build", String.valueOf(this.appConfig.getIsDebugBuild())), new k("X-Kotlin-Version", g.E.toString()), new k("X-Is-Backgrounded", String.valueOf(this.appConfig.isAppBackgrounded())), new k("X-Billing-Client-Sdk-Version", BuildConfig.BILLING_CLIENT_VERSION)), authenticationHeaders);
        ETagManager eTagManager = this.eTagManager;
        String string = fullURL.toString();
        m.d(string, "fullURL.toString()");
        return MapExtensionsKt.filterNotNullValues(d0.U(linkedHashMapU, eTagManager.getETagHeaders$purchases_defaultsBc8Release(string, shouldSignResponse, refreshETag)));
    }

    private final InputStream getInputStream(HttpURLConnection connection) throws Exception {
        LogHandler currentLogHandler;
        String strK;
        String str;
        try {
            return connection.getInputStream();
        } catch (Exception e) {
            if (!(e instanceof IllegalArgumentException ? true : e instanceof IOException)) {
                throw e;
            }
            LogIntent logIntent = LogIntent.WARNING;
            HTTPClient$getInputStream$$inlined$log$1 hTTPClient$getInputStream$$inlined$log$1 = new HTTPClient$getInputStream$$inlined$log$1(logIntent, e);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                        str = (String) hTTPClient$getInputStream$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) hTTPClient$getInputStream$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) hTTPClient$getInputStream$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) hTTPClient$getInputStream$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                        str = (String) hTTPClient$getInputStream$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) hTTPClient$getInputStream$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) hTTPClient$getInputStream$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                        str = (String) hTTPClient$getInputStream$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                        str = (String) hTTPClient$getInputStream$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) hTTPClient$getInputStream$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) hTTPClient$getInputStream$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) hTTPClient$getInputStream$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) hTTPClient$getInputStream$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) hTTPClient$getInputStream$$inlined$log$1.invoke(), null);
                    break;
            }
            try {
                return connection.getErrorStream();
            } catch (NullPointerException e2) {
                throw new NullPointerReadingErrorStreamException(e2.getMessage(), e2);
            }
        }
    }

    private final boolean getLoadShedderHeader(URLConnection connection) {
        String lowerCase;
        String headerField = connection.getHeaderField(HTTPResult.LOAD_SHEDDER_HEADER_NAME);
        if (headerField != null) {
            lowerCase = headerField.toLowerCase(Locale.ROOT);
            m.d(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        return m.a(lowerCase, "true");
    }

    private final Date getRequestDateHeader(URLConnection connection) {
        String requestTimeHeader = getRequestTimeHeader(connection);
        if (requestTimeHeader != null) {
            return new Date(Long.parseLong(requestTimeHeader));
        }
        return null;
    }

    private final String getRequestTimeHeader(URLConnection connection) {
        String headerField = connection.getHeaderField(HTTPResult.REQUEST_TIME_HEADER_NAME);
        if (headerField == null || r30.k.L0(headerField)) {
            return null;
        }
        return headerField;
    }

    private final String getXPlatformHeader() {
        return WhenMappings.$EnumSwitchMapping$0[this.appConfig.getStore().ordinal()] == 1 ? "amazon" : "android";
    }

    private final HTTPResult performCall(URL baseURL, boolean isFallbackURL, Endpoint endpoint, Map<String, ? extends Object> body, List<k> postFieldsToSign, Map<String, String> requestHeaders, boolean refreshETag) throws Exception {
        URL url;
        String postParamsForSigningHeaderIfNeeded;
        URL url2;
        String str;
        URL url3;
        String str2;
        int i;
        boolean z;
        String str3;
        HTTPClient hTTPClient;
        HttpURLConnection httpURLConnection;
        String str4;
        VerificationResult verificationResultVerifyResponse;
        RequestResponseListener requestResponseListener;
        ForceServerErrorStrategy forceServerErrorStrategy;
        ForceServerErrorStrategy forceServerErrorStrategy2;
        HTTPResult hTTPResultFakeResponseWithoutPerformingRequest;
        JSONObject jSONObjectConvertToJSON$purchases_defaultsBc8Release = body != null ? this.mapConverter.convertToJSON$purchases_defaultsBc8Release(body) : null;
        String path = endpoint.getPath(isFallbackURL);
        boolean zShouldVerifyEndpoint = this.signingManager.shouldVerifyEndpoint(endpoint);
        boolean z2 = zShouldVerifyEndpoint && endpoint.getNeedsNonceToPerformSigning();
        if (this.appConfig.getRunningTests() && (forceServerErrorStrategy2 = this.forceServerErrorStrategy) != null && (hTTPResultFakeResponseWithoutPerformingRequest = forceServerErrorStrategy2.fakeResponseWithoutPerformingRequest(baseURL, endpoint)) != null) {
            LogLevel logLevel = LogLevel.WARN;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.w(x5.k(logLevel, new StringBuilder("[Purchases] - ")), "Faking response for request to " + Endpoint.getPath$default(endpoint, false, 1, null));
            }
            return hTTPResultFakeResponseWithoutPerformingRequest;
        }
        try {
            if (this.appConfig.getRunningTests() && (forceServerErrorStrategy = this.forceServerErrorStrategy) != null && forceServerErrorStrategy.shouldForceServerError(baseURL, endpoint)) {
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), "Forcing server error for request to " + new URL(baseURL, path));
                }
                url = new URL(this.forceServerErrorStrategy.getServerErrorURL());
            } else {
                url = new URL(baseURL, path);
            }
            String strCreateRandomNonce = z2 ? this.signingManager.createRandomNonce() : null;
            if (postFieldsToSign == null) {
                postParamsForSigningHeaderIfNeeded = null;
            } else if ((zShouldVerifyEndpoint ? postFieldsToSign : null) != null) {
                postParamsForSigningHeaderIfNeeded = this.signingManager.getPostParamsForSigningHeaderIfNeeded(endpoint, postFieldsToSign);
            } else {
                postParamsForSigningHeaderIfNeeded = null;
            }
            URL url4 = url;
            HTTPRequest hTTPRequest = new HTTPRequest(url4, getHeaders(requestHeaders, url4, refreshETag, strCreateRandomNonce, zShouldVerifyEndpoint, postParamsForSigningHeaderIfNeeded), jSONObjectConvertToJSON$purchases_defaultsBc8Release);
            if (this.enableExtraRequestLogging) {
                LogLevel logLevel3 = LogLevel.DEBUG;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                url2 = url4;
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.d("[Purchases] - " + logLevel3.name(), "HTTP request:\\n " + toCurlRequest(hTTPRequest));
                }
            } else {
                url2 = url4;
            }
            HttpURLConnection connection = getConnection(hTTPRequest, this.timeoutManager.getTimeoutForRequest(isFallbackURL, endpoint.getSupportsFallbackBaseURLs() && !this.appConfig.getFallbackBaseURLs().isEmpty()));
            InputStream inputStream = getInputStream(connection);
            try {
                LogLevel logLevel4 = LogLevel.DEBUG;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                Config config = Config.INSTANCE;
                if (config.getLogLevel().compareTo(logLevel4) <= 0) {
                    currentLogHandler4.d("[Purchases] - " + logLevel4.name(), String.format(NetworkStrings.API_REQUEST_STARTED, Arrays.copyOf(new Object[]{connection.getRequestMethod(), path}, 2)));
                }
                int responseCode = connection.getResponseCode();
                String fully = inputStream != null ? readFully(inputStream) : null;
                if (this.enableExtraRequestLogging) {
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (config.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler5.d("[Purchases] - " + logLevel4.name(), "HTTP response:\\n  status code: " + responseCode + " \\n  body: " + fully);
                    }
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                connection.disconnect();
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (config.getLogLevel().compareTo(logLevel4) <= 0) {
                    currentLogHandler6.d(x5.k(logLevel4, new StringBuilder("[Purchases] - ")), String.format(NetworkStrings.API_REQUEST_COMPLETED, Arrays.copyOf(new Object[]{connection.getRequestMethod(), path, Integer.valueOf(responseCode)}, 3)));
                }
                if (fully == null) {
                    throw new IOException(NetworkStrings.HTTP_RESPONSE_PAYLOAD_NULL);
                }
                if (!this.appConfig.getRunningTests() || (requestResponseListener = this.requestResponseListener) == null) {
                    str = strCreateRandomNonce;
                    url3 = url2;
                    str2 = fully;
                    i = responseCode;
                    z = zShouldVerifyEndpoint;
                    str3 = postParamsForSigningHeaderIfNeeded;
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Map<String, List<String>> headerFields = connection.getHeaderFields();
                    m.d(headerFields, "connection.headerFields");
                    for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                        String key = entry.getKey();
                        List<String> values = entry.getValue();
                        if (key != null) {
                            m.d(values, "values");
                            if (!values.isEmpty()) {
                                linkedHashMap.put(key, q.R0(values, ", ", null, null, null, 62));
                            }
                        }
                    }
                    try {
                        URL url5 = new URL(baseURL, path);
                        String string = url5.toString();
                        m.d(string, "fullURL.toString()");
                        String requestMethod = connection.getRequestMethod();
                        m.d(requestMethod, "connection.requestMethod");
                        url3 = url2;
                        str2 = fully;
                        z = zShouldVerifyEndpoint;
                        str3 = postParamsForSigningHeaderIfNeeded;
                        str = strCreateRandomNonce;
                        try {
                            try {
                                requestResponseListener.onRequestResponse(string, requestMethod, getHeaders(requestHeaders, url5, refreshETag, str, z, str3), jSONObjectConvertToJSON$purchases_defaultsBc8Release != null ? jSONObjectConvertToJSON$purchases_defaultsBc8Release.toString() : null, responseCode, linkedHashMap, str2);
                                i = responseCode;
                            } catch (Throwable th) {
                                th = th;
                                i = responseCode;
                                LogLevel logLevel5 = LogLevel.WARN;
                                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                    currentLogHandler7.w(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), "RequestResponseListener error: " + th.getMessage());
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            i = responseCode;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str = strCreateRandomNonce;
                        url3 = url2;
                        str2 = fully;
                        i = responseCode;
                        z = zShouldVerifyEndpoint;
                        str3 = postParamsForSigningHeaderIfNeeded;
                    }
                }
                if (z && RCHTTPStatusCodes.INSTANCE.isSuccessful(i)) {
                    hTTPClient = this;
                    httpURLConnection = connection;
                    str4 = path;
                    verificationResultVerifyResponse = hTTPClient.verifyResponse(str4, httpURLConnection, str2, str, str3);
                } else {
                    hTTPClient = this;
                    httpURLConnection = connection;
                    str4 = path;
                    verificationResultVerifyResponse = VerificationResult.NOT_REQUESTED;
                }
                VerificationResult verificationResult = verificationResultVerifyResponse;
                if (verificationResult == VerificationResult.FAILED && (hTTPClient.signingManager.getSignatureVerificationMode() instanceof SignatureVerificationMode.Enforced)) {
                    throw new SignatureVerificationException(str4);
                }
                boolean loadShedderHeader = hTTPClient.getLoadShedderHeader(httpURLConnection);
                ETagManager eTagManager = hTTPClient.eTagManager;
                String eTagHeader = hTTPClient.getETagHeader(httpURLConnection);
                String string2 = url3.toString();
                m.d(string2, "fullURL.toString()");
                return eTagManager.getHTTPResultFromCacheOrBackend$purchases_defaultsBc8Release(i, str2, eTagHeader, string2, refreshETag, hTTPClient.getRequestDateHeader(httpURLConnection), verificationResult, loadShedderHeader, isFallbackURL);
            } catch (Throwable th4) {
                try {
                    if (this.enableExtraRequestLogging) {
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "HTTP request failed", th4);
                    }
                    throw th4;
                } catch (Throwable th5) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    connection.disconnect();
                    throw th5;
                }
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    private static final boolean performRequest$canUseFallback(Endpoint endpoint, int i, List<URL> list) {
        return endpoint.getSupportsFallbackBaseURLs() && i >= 0 && i < list.size();
    }

    public static HTTPResult performRequest$default(HTTPClient hTTPClient, URL url, Endpoint endpoint, Map map, List list, Map map2, boolean z, List list2, int i, int i2, Object obj) throws JSONException, IOException {
        if ((i2 & 32) != 0) {
            z = false;
        }
        if ((i2 & 64) != 0) {
            list2 = x.A;
        }
        if ((i2 & 128) != 0) {
            i = 0;
        }
        return hTTPClient.performRequest(url, endpoint, map, list, map2, z, list2, i);
    }

    private static final HTTPResult performRequest$performRequestToFallbackURL(List<URL> list, int i, HTTPClient hTTPClient, Endpoint endpoint, Map<String, ? extends Object> map, List<k> list2, Map<String, String> map2, boolean z) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        URL url = list.get(i);
        LogIntent logIntent = LogIntent.DEBUG;
        HTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1 hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1 = new HTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1(logIntent, endpoint, url);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) hTTPClient$performRequest$performRequestToFallbackURL$$inlined$log$1.invoke(), null);
                break;
        }
        return hTTPClient.performRequest(url, endpoint, map, list2, map2, z, list, i + 1);
    }

    private final String readFully(InputStream inputStream) throws IOException {
        return a.Y(buffer(inputStream));
    }

    private final String toCurlRequest(HTTPRequest httpRequest) {
        StringBuilder sb = new StringBuilder("curl -v -X ");
        sb.append(httpRequest.getBody() == null ? "GET" : "POST");
        sb.append(" \\\n  ");
        for (Map.Entry<String, String> entry : httpRequest.getHeaders().entrySet()) {
            sb.append("-H \"");
            sb.append(entry.getKey());
            sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            sb.append(entry.getValue());
            sb.append("\" \\\n  ");
        }
        if (httpRequest.getBody() != null) {
            sb.append("-d '");
            sb.append(httpRequest.getBody().toString());
            sb.append("' \\\n  ");
        }
        sb.append("\"");
        sb.append(httpRequest.getFullURL());
        sb.append("\"");
        String string = sb.toString();
        m.d(string, "builder.toString()");
        return string;
    }

    private final void trackHttpRequestPerformedIfNeeded(URL baseURL, Endpoint endpoint, Date requestStartTime, boolean callSuccessful, HTTPResult callResult, boolean isRetry, IOException connectionException) {
        int responseCode;
        VerificationResult verificationResult;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            long jBetween = DurationExtensionsKt.between(b.B, requestStartTime, this.dateProvider.getNow());
            if (callSuccessful) {
                responseCode = callResult != null ? callResult.getResponseCode() : RCHTTPStatusCodes.NOT_MODIFIED;
            } else {
                responseCode = -1;
            }
            int i = responseCode;
            HTTPResult.Origin origin = callResult != null ? callResult.getOrigin() : null;
            if (callResult == null || (verificationResult = callResult.getVerificationResult()) == null) {
                verificationResult = VerificationResult.NOT_REQUESTED;
            }
            VerificationResult verificationResult2 = verificationResult;
            boolean z = callSuccessful && RCHTTPStatusCodes.INSTANCE.isSuccessful(i);
            ConnectionErrorReason connectionErrorReasonFromIOException = connectionException != null ? ConnectionErrorReason.INSTANCE.fromIOException(connectionException) : null;
            String host = baseURL.getHost();
            m.d(host, "baseURL.host");
            diagnosticsTracker.m127trackHttpRequestPerformedXzGXFE(host, endpoint, jBetween, z, i, callResult != null ? callResult.getBackendErrorCode() : null, origin, verificationResult2, isRetry, connectionErrorReasonFromIOException);
        }
    }

    private final VerificationResult verifyResponse(String urlPath, URLConnection connection, String payload, String nonce, String postFieldsToSignHeader) {
        return this.signingManager.verifyResponse(urlPath, connection.getHeaderField(HTTPResult.SIGNATURE_HEADER_NAME), nonce, payload, getRequestTimeHeader(connection), getETagHeader(connection), postFieldsToSignHeader);
    }

    private final void writeFully(BufferedWriter writer, String body) throws IOException {
        writer.write(body);
        writer.flush();
    }

    public final void clearCaches() {
        this.eTagManager.clearCaches$purchases_defaultsBc8Release();
    }

    public final SigningManager getSigningManager() {
        return this.signingManager;
    }

    public final HTTPResult performRequest(URL baseURL, Endpoint endpoint, Map<String, ? extends Object> body, List<k> postFieldsToSign, Map<String, String> requestHeaders, boolean refreshETag, List<URL> fallbackBaseURLs, int fallbackURLIndex) throws Throwable {
        IOException iOException;
        boolean z;
        HTTPResult hTTPResult;
        Endpoint endpoint2;
        IOException iOException2;
        HTTPResult hTTPResult2;
        IOException iOException3;
        HTTPResult hTTPResult3;
        LogHandler currentLogHandler;
        String strK;
        String str;
        IOException iOException4;
        HTTPResult hTTPResultPerformRequest$performRequestToFallbackURL;
        HTTPClient hTTPClient = this;
        m.e(baseURL, "baseURL");
        m.e(endpoint, "endpoint");
        m.e(requestHeaders, "requestHeaders");
        m.e(fallbackBaseURLs, "fallbackBaseURLs");
        boolean z2 = fallbackURLIndex == 0;
        Date now = hTTPClient.dateProvider.getNow();
        HTTPTimeoutManager.RequestResult requestResult = HTTPTimeoutManager.RequestResult.OTHER_RESULT;
        try {
            HTTPResult hTTPResultPerformCall = hTTPClient.performCall(baseURL, fallbackURLIndex > 0, endpoint, body, postFieldsToSign, requestHeaders, refreshETag);
            z = true;
            if (z2 && hTTPResultPerformCall != null) {
                try {
                    if (RCHTTPStatusCodes.INSTANCE.isSuccessful(hTTPResultPerformCall.getResponseCode())) {
                        requestResult = HTTPTimeoutManager.RequestResult.SUCCESS_ON_MAIN_BACKEND;
                    }
                } catch (IOException e) {
                    iOException2 = e;
                    hTTPResult2 = hTTPResultPerformCall;
                    z = true;
                    endpoint2 = endpoint;
                    try {
                        try {
                            if ((iOException2 instanceof SocketTimeoutException) && z2) {
                                try {
                                    if (performRequest$canUseFallback(endpoint2, fallbackURLIndex, fallbackBaseURLs)) {
                                        requestResult = HTTPTimeoutManager.RequestResult.TIMEOUT_ON_MAIN_BACKEND_FOR_FALLBACK_SUPPORTED_ENDPOINT;
                                        iOException4 = iOException2;
                                        try {
                                            hTTPResultPerformRequest$performRequestToFallbackURL = performRequest$performRequestToFallbackURL(fallbackBaseURLs, fallbackURLIndex, this, endpoint2, body, postFieldsToSign, requestHeaders, refreshETag);
                                            hTTPClient = this;
                                        } catch (Throwable th) {
                                            th = th;
                                            hTTPClient = this;
                                            iOException = iOException4;
                                            hTTPResult = hTTPResult2;
                                            now = now;
                                            z = z;
                                            hTTPClient.timeoutManager.recordRequestResult(requestResult);
                                            hTTPClient.trackHttpRequestPerformedIfNeeded(baseURL, endpoint, now, z, hTTPResult, refreshETag, iOException);
                                            throw th;
                                        }
                                    }
                                    hTTPResult3 = hTTPResultPerformRequest$performRequestToFallbackURL;
                                    hTTPClient.timeoutManager.recordRequestResult(requestResult);
                                    iOException3 = iOException4;
                                    z = z;
                                } catch (Throwable th2) {
                                    th = th2;
                                    iOException4 = iOException2;
                                }
                            }
                            if (!performRequest$canUseFallback(endpoint2, fallbackURLIndex, fallbackBaseURLs)) {
                                hTTPClient = this;
                                iOException = iOException4;
                                try {
                                    throw iOException;
                                } catch (Throwable th3) {
                                    th = th3;
                                    hTTPResult = hTTPResult2;
                                    hTTPClient.timeoutManager.recordRequestResult(requestResult);
                                    hTTPClient.trackHttpRequestPerformedIfNeeded(baseURL, endpoint, now, z, hTTPResult, refreshETag, iOException);
                                    throw th;
                                }
                            }
                            try {
                                hTTPResultPerformRequest$performRequestToFallbackURL = performRequest$performRequestToFallbackURL(fallbackBaseURLs, fallbackURLIndex, this, endpoint2, body, postFieldsToSign, requestHeaders, refreshETag);
                                hTTPClient = this;
                                hTTPResult3 = hTTPResultPerformRequest$performRequestToFallbackURL;
                                hTTPClient.timeoutManager.recordRequestResult(requestResult);
                                iOException3 = iOException4;
                                z = z;
                            } catch (Throwable th4) {
                                th = th4;
                                hTTPClient = this;
                                iOException = iOException4;
                                hTTPResult = hTTPResult2;
                                hTTPClient.timeoutManager.recordRequestResult(requestResult);
                                hTTPClient.trackHttpRequestPerformedIfNeeded(baseURL, endpoint, now, z, hTTPResult, refreshETag, iOException);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            hTTPClient = this;
                        }
                        iOException4 = iOException2;
                    } catch (Throwable th6) {
                        th = th6;
                        iOException = iOException2;
                        hTTPClient = this;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    hTTPResult = hTTPResultPerformCall;
                    now = now;
                    iOException = null;
                    hTTPClient.timeoutManager.recordRequestResult(requestResult);
                    hTTPClient.trackHttpRequestPerformedIfNeeded(baseURL, endpoint, now, z, hTTPResult, refreshETag, iOException);
                    throw th;
                }
            }
            hTTPClient.timeoutManager.recordRequestResult(requestResult);
            hTTPResult3 = hTTPResultPerformCall;
            iOException3 = null;
        } catch (IOException e2) {
            endpoint2 = endpoint;
            iOException2 = e2;
            z = false;
            hTTPResult2 = null;
        } catch (Throwable th8) {
            th = th8;
            iOException = null;
            hTTPClient = this;
            z = false;
            now = now;
            hTTPResult = null;
        }
        hTTPClient.trackHttpRequestPerformedIfNeeded(baseURL, endpoint, now, z, hTTPResult3, refreshETag, iOException3);
        HTTPResult hTTPResult4 = hTTPResult3;
        if (hTTPResult4 != null) {
            return (RCHTTPStatusCodes.INSTANCE.isServerError(hTTPResult4.getResponseCode()) && performRequest$canUseFallback(endpoint, fallbackURLIndex, fallbackBaseURLs)) ? performRequest$performRequestToFallbackURL(fallbackBaseURLs, fallbackURLIndex, this, endpoint, body, postFieldsToSign, requestHeaders, refreshETag) : hTTPResult4;
        }
        LogIntent logIntent = LogIntent.WARNING;
        HTTPClient$performRequest$$inlined$log$1 hTTPClient$performRequest$$inlined$log$1 = new HTTPClient$performRequest$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) hTTPClient$performRequest$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) hTTPClient$performRequest$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) hTTPClient$performRequest$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) hTTPClient$performRequest$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) hTTPClient$performRequest$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) hTTPClient$performRequest$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) hTTPClient$performRequest$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) hTTPClient$performRequest$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) hTTPClient$performRequest$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) hTTPClient$performRequest$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) hTTPClient$performRequest$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) hTTPClient$performRequest$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) hTTPClient$performRequest$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) hTTPClient$performRequest$$inlined$log$1.invoke(), null);
                break;
        }
        return performRequest(baseURL, endpoint, body, postFieldsToSign, requestHeaders, true, fallbackBaseURLs, fallbackURLIndex);
    }
}

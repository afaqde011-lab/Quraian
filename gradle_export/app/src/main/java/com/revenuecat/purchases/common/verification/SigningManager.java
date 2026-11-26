package com.revenuecat.purchases.common.verification;

import a1.b;
import android.util.Base64;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.Result;
import g00.b0;
import g4.c;
import h00.n;
import h00.q;
import h00.r;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import r30.a;
import r30.k;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 %2\u00020\u0001:\u0002%&B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\u001a\u0010\u0013\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015JQ\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SigningManager;", "", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "signatureVerificationMode", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "", "apiKey", "<init>", "(Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;Lcom/revenuecat/purchases/common/AppConfig;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "endpoint", "", "shouldVerifyEndpoint", "(Lcom/revenuecat/purchases/common/networking/Endpoint;)Z", "createRandomNonce", "()Ljava/lang/String;", "", "Lg00/k;", "postFieldsToSign", "getPostParamsForSigningHeaderIfNeeded", "(Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/List;)Ljava/lang/String;", "urlPath", "signatureString", "nonce", "body", "requestTime", "eTag", "postFieldsToSignHeader", "Lcom/revenuecat/purchases/VerificationResult;", "verifyResponse", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/VerificationResult;", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "getSignatureVerificationMode", "()Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "Lcom/revenuecat/purchases/common/AppConfig;", "Ljava/lang/String;", "Companion", "Parameters", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SigningManager {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int NONCE_BYTES_SIZE = 12;

    @Deprecated
    public static final String POST_PARAMS_ALGORITHM = "sha256";

    @Deprecated
    public static final byte POST_PARAMS_SEPARATOR = 0;
    private final String apiKey;
    private final AppConfig appConfig;
    private final SignatureVerificationMode signatureVerificationMode;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SigningManager$Companion;", "", "()V", "NONCE_BYTES_SIZE", "", "POST_PARAMS_ALGORITHM", "", "POST_PARAMS_SEPARATOR", "", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003Ja\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\u0006\u0010%\u001a\u00020\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SigningManager$Parameters;", "", "salt", "", "apiKey", "", "nonce", "urlPath", "postParamsHashHeader", "requestTime", "eTag", "body", "([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiKey", "()Ljava/lang/String;", "getBody", "getETag", "getNonce", "getPostParamsHashHeader", "getRequestTime", "getSalt", "()[B", "getUrlPath", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toSignatureToVerify", "toString", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Parameters {
        private final String apiKey;
        private final String body;
        private final String eTag;
        private final String nonce;
        private final String postParamsHashHeader;
        private final String requestTime;
        private final byte[] salt;
        private final String urlPath;

        public Parameters(byte[] salt, String apiKey, String str, String urlPath, String str2, String requestTime, String str3, String str4) {
            m.e(salt, "salt");
            m.e(apiKey, "apiKey");
            m.e(urlPath, "urlPath");
            m.e(requestTime, "requestTime");
            this.salt = salt;
            this.apiKey = apiKey;
            this.nonce = str;
            this.urlPath = urlPath;
            this.postParamsHashHeader = str2;
            this.requestTime = requestTime;
            this.eTag = str3;
            this.body = str4;
        }

        public static Parameters copy$default(Parameters parameters, byte[] bArr, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                bArr = parameters.salt;
            }
            if ((i & 2) != 0) {
                str = parameters.apiKey;
            }
            if ((i & 4) != 0) {
                str2 = parameters.nonce;
            }
            if ((i & 8) != 0) {
                str3 = parameters.urlPath;
            }
            if ((i & 16) != 0) {
                str4 = parameters.postParamsHashHeader;
            }
            if ((i & 32) != 0) {
                str5 = parameters.requestTime;
            }
            if ((i & 64) != 0) {
                str6 = parameters.eTag;
            }
            if ((i & 128) != 0) {
                str7 = parameters.body;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str4;
            String str11 = str5;
            return parameters.copy(bArr, str, str2, str3, str10, str11, str8, str9);
        }

        public final byte[] getSalt() {
            return this.salt;
        }

        public final String getApiKey() {
            return this.apiKey;
        }

        public final String getNonce() {
            return this.nonce;
        }

        public final String getUrlPath() {
            return this.urlPath;
        }

        public final String getPostParamsHashHeader() {
            return this.postParamsHashHeader;
        }

        public final String getRequestTime() {
            return this.requestTime;
        }

        public final String getETag() {
            return this.eTag;
        }

        public final String getBody() {
            return this.body;
        }

        public final Parameters copy(byte[] salt, String apiKey, String nonce, String urlPath, String postParamsHashHeader, String requestTime, String eTag, String body) {
            m.e(salt, "salt");
            m.e(apiKey, "apiKey");
            m.e(urlPath, "urlPath");
            m.e(requestTime, "requestTime");
            return new Parameters(salt, apiKey, nonce, urlPath, postParamsHashHeader, requestTime, eTag, body);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!Parameters.class.equals(other != null ? other.getClass() : null)) {
                return false;
            }
            m.c(other, "null cannot be cast to non-null type com.revenuecat.purchases.common.verification.SigningManager.Parameters");
            Parameters parameters = (Parameters) other;
            return Arrays.equals(this.salt, parameters.salt) && m.a(this.apiKey, parameters.apiKey) && m.a(this.nonce, parameters.nonce) && m.a(this.urlPath, parameters.urlPath) && m.a(this.postParamsHashHeader, parameters.postParamsHashHeader) && m.a(this.requestTime, parameters.requestTime) && m.a(this.eTag, parameters.eTag) && m.a(this.body, parameters.body);
        }

        public final String getApiKey() {
            return this.apiKey;
        }

        public final String getBody() {
            return this.body;
        }

        public final String getETag() {
            return this.eTag;
        }

        public final String getNonce() {
            return this.nonce;
        }

        public final String getPostParamsHashHeader() {
            return this.postParamsHashHeader;
        }

        public final String getRequestTime() {
            return this.requestTime;
        }

        public final byte[] getSalt() {
            return this.salt;
        }

        public final String getUrlPath() {
            return this.urlPath;
        }

        public int hashCode() {
            int iE = x5.e(Arrays.hashCode(this.salt) * 31, this.apiKey, 31);
            String str = this.nonce;
            int iE2 = x5.e((iE + (str != null ? str.hashCode() : 0)) * 31, this.urlPath, 31);
            String str2 = this.postParamsHashHeader;
            int iE3 = x5.e((iE2 + (str2 != null ? str2.hashCode() : 0)) * 31, this.requestTime, 31);
            String str3 = this.eTag;
            int iHashCode = (iE3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.body;
            return iHashCode + (str4 != null ? str4.hashCode() : 0);
        }

        public final byte[] toSignatureToVerify() {
            byte[] bytes;
            byte[] bytes2;
            byte[] bytes3;
            byte[] bArr = this.salt;
            String str = this.apiKey;
            Charset charset = a.a;
            byte[] bytes4 = str.getBytes(charset);
            m.d(bytes4, "getBytes(...)");
            byte[] bArrP0 = n.P0(bArr, bytes4);
            String str2 = this.nonce;
            byte[] bArrDecode = str2 != null ? Base64.decode(str2, 0) : null;
            if (bArrDecode == null) {
                bArrDecode = new byte[0];
            }
            byte[] bArrP1 = n.P0(bArrP0, bArrDecode);
            byte[] bytes5 = this.urlPath.getBytes(charset);
            m.d(bytes5, "getBytes(...)");
            byte[] bArrP2 = n.P0(bArrP1, bytes5);
            String str3 = this.postParamsHashHeader;
            if (str3 != null) {
                bytes = str3.getBytes(charset);
                m.d(bytes, "getBytes(...)");
            } else {
                bytes = new byte[0];
            }
            byte[] bArrP3 = n.P0(bArrP2, bytes);
            byte[] bytes6 = this.requestTime.getBytes(charset);
            m.d(bytes6, "getBytes(...)");
            byte[] bArrP4 = n.P0(bArrP3, bytes6);
            String str4 = this.eTag;
            if (str4 != null) {
                bytes2 = str4.getBytes(charset);
                m.d(bytes2, "getBytes(...)");
            } else {
                bytes2 = new byte[0];
            }
            byte[] bArrP5 = n.P0(bArrP4, bytes2);
            String str5 = this.body;
            if (str5 != null) {
                bytes3 = str5.getBytes(charset);
                m.d(bytes3, "getBytes(...)");
            } else {
                bytes3 = new byte[0];
            }
            return n.P0(bArrP5, bytes3);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Parameters(salt=");
            sb.append(Arrays.toString(this.salt));
            sb.append(", apiKey=");
            sb.append(this.apiKey);
            sb.append(", nonce=");
            sb.append(this.nonce);
            sb.append(", urlPath=");
            sb.append(this.urlPath);
            sb.append(", postParamsHashHeader=");
            sb.append(this.postParamsHashHeader);
            sb.append(", requestTime=");
            sb.append(this.requestTime);
            sb.append(", eTag=");
            sb.append(this.eTag);
            sb.append(", body=");
            return c.k(sb, this.body, ')');
        }
    }

    public SigningManager(SignatureVerificationMode signatureVerificationMode, AppConfig appConfig, String apiKey) {
        m.e(signatureVerificationMode, "signatureVerificationMode");
        m.e(appConfig, "appConfig");
        m.e(apiKey, "apiKey");
        this.signatureVerificationMode = signatureVerificationMode;
        this.appConfig = appConfig;
        this.apiKey = apiKey;
    }

    public final String createRandomNonce() {
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        byte[] bArrEncode = Base64.encode(bArr, 0);
        m.d(bArrEncode, "encode(bytes, Base64.DEFAULT)");
        return k.j1(new String(bArrEncode, a.a)).toString();
    }

    public final String getPostParamsForSigningHeaderIfNeeded(Endpoint endpoint, List<g00.k> postFieldsToSign) {
        m.e(endpoint, "endpoint");
        if (postFieldsToSign == null || postFieldsToSign.isEmpty() || !shouldVerifyEndpoint(endpoint)) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        ArrayList arrayList = new ArrayList(r.q0(postFieldsToSign, 10));
        int i = 0;
        for (Object obj : postFieldsToSign) {
            int i2 = i + 1;
            if (i < 0) {
                va.a.k0();
                throw null;
            }
            g00.k kVar = (g00.k) obj;
            if (i > 0) {
                messageDigest.update((byte) 0);
            }
            byte[] bytes = ((String) kVar.B).getBytes(a.a);
            m.d(bytes, "getBytes(...)");
            messageDigest.update(bytes);
            arrayList.add(b0.a);
            i = i2;
        }
        byte[] bArrDigest = messageDigest.digest();
        m.d(bArrDigest, "sha256Digest.digest()");
        String strR = "";
        for (byte b : bArrDigest) {
            strR = b.r(new Object[]{Byte.valueOf(b)}, 1, "%02x", x5.q(strR));
        }
        return q.R0(va.a.S(new String[]{q.R0(postFieldsToSign, ",", null, null, SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1.INSTANCE, 30), POST_PARAMS_ALGORITHM, strR}), Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, null, null, null, 62);
    }

    public final SignatureVerificationMode getSignatureVerificationMode() {
        return this.signatureVerificationMode;
    }

    public final boolean shouldVerifyEndpoint(Endpoint endpoint) {
        m.e(endpoint, "endpoint");
        return endpoint.getSupportsSignatureVerification() && this.signatureVerificationMode.getShouldVerify();
    }

    public final VerificationResult verifyResponse(String urlPath, String signatureString, String nonce, String body, String requestTime, String eTag, String postFieldsToSignHeader) {
        m.e(urlPath, "urlPath");
        if (this.appConfig.getForceSigningErrors()) {
            LogLevel logLevel = LogLevel.WARN;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.w(x5.k(logLevel, new StringBuilder("[Purchases] - ")), "Forcing signing error for request with path: ".concat(urlPath));
            }
            return VerificationResult.FAILED;
        }
        IntermediateSignatureHelper intermediateSignatureHelper = this.signatureVerificationMode.getIntermediateSignatureHelper();
        if (intermediateSignatureHelper == null) {
            return VerificationResult.NOT_REQUESTED;
        }
        if (signatureString == null) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", String.format(NetworkStrings.VERIFICATION_MISSING_SIGNATURE, Arrays.copyOf(new Object[]{urlPath}, 1)), null);
            return VerificationResult.FAILED;
        }
        if (requestTime == null) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", String.format(NetworkStrings.VERIFICATION_MISSING_REQUEST_TIME, Arrays.copyOf(new Object[]{urlPath}, 1)), null);
            return VerificationResult.FAILED;
        }
        if (body == null && eTag == null) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", String.format(NetworkStrings.VERIFICATION_MISSING_BODY_OR_ETAG, Arrays.copyOf(new Object[]{urlPath}, 1)), null);
            return VerificationResult.FAILED;
        }
        try {
            Signature signatureFromString$purchases_defaultsBc8Release = Signature.INSTANCE.fromString$purchases_defaultsBc8Release(signatureString);
            Result<SignatureVerifier, PurchasesError> resultCreateIntermediateKeyVerifierIfVerified = intermediateSignatureHelper.createIntermediateKeyVerifierIfVerified(signatureFromString$purchases_defaultsBc8Release);
            if (resultCreateIntermediateKeyVerifierIfVerified instanceof Result.Error) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", String.format(NetworkStrings.VERIFICATION_INTERMEDIATE_KEY_FAILED, Arrays.copyOf(new Object[]{urlPath, ((PurchasesError) ((Result.Error) resultCreateIntermediateKeyVerifierIfVerified).getValue()).getUnderlyingErrorMessage()}, 2)), null);
                return VerificationResult.FAILED;
            }
            if (!(resultCreateIntermediateKeyVerifierIfVerified instanceof Result.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!((SignatureVerifier) ((Result.Success) resultCreateIntermediateKeyVerifierIfVerified).getValue()).verify(signatureFromString$purchases_defaultsBc8Release.getPayload(), new Parameters(signatureFromString$purchases_defaultsBc8Release.getSalt(), this.apiKey, nonce, urlPath, postFieldsToSignHeader, requestTime, eTag, body).toSignatureToVerify())) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", String.format(NetworkStrings.VERIFICATION_ERROR, Arrays.copyOf(new Object[]{urlPath}, 1)), null);
                return VerificationResult.FAILED;
            }
            LogLevel logLevel2 = LogLevel.VERBOSE;
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                currentLogHandler2.v(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), String.format(NetworkStrings.VERIFICATION_SUCCESS, Arrays.copyOf(new Object[]{urlPath}, 1)));
            }
            return VerificationResult.VERIFIED;
        } catch (InvalidSignatureSizeException e) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", String.format(NetworkStrings.VERIFICATION_INVALID_SIZE, Arrays.copyOf(new Object[]{urlPath, e.getMessage()}, 2)), null);
            return VerificationResult.FAILED;
        }
    }
}

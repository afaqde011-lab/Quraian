package com.revenuecat.purchases.paywalls.components.common;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.utils.serializers.GoogleListSerializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import g00.c;
import h00.x;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import p40.b1;
import p40.g0;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0007\u0018\u0000 I2\u00020\u0001:\u0002JIB\u0085\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t0\t\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B«\u0001\b\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\"\b\u0001\u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ(\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 HÁ\u0001¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010(R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010.R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b3\u0010+\u001a\u0004\b1\u00102R8\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00104\u0012\u0004\b7\u0010+\u001a\u0004\b5\u00106R&\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000e\u0010&\u0012\u0004\b9\u0010+\u001a\u0004\b8\u0010(R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b;\u0010<R&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010=\u0012\u0004\b@\u0010+\u001a\u0004\b>\u0010?R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010A\u0012\u0004\bD\u0010+\u001a\u0004\bB\u0010CR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010E\u0012\u0004\bH\u0010+\u001a\u0004\bF\u0010G\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006K"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "", "", DiagnosticsEntry.ID_KEY, "templateName", "Ljava/net/URL;", "assetBaseURL", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;", "componentsConfig", "", "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "componentsLocalizations", "defaultLocaleIdentifier", "", "revision", "", "zeroDecimalPlaceCountries", "Lcom/revenuecat/purchases/paywalls/components/common/ExitOffers;", "exitOffers", "Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;", "productChangeConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;Ljava/util/Map;Ljava/lang/String;ILjava/util/List;Lcom/revenuecat/purchases/paywalls/components/common/ExitOffers;Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;Lkotlin/jvm/internal/f;)V", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;Ljava/util/Map;Ljava/lang/String;ILjava/util/List;Lcom/revenuecat/purchases/paywalls/components/common/ExitOffers;Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;Lp40/x0;Lkotlin/jvm/internal/f;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;Lo40/b;Ln40/e;)V", "write$Self", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTemplateName", "getTemplateName$annotations", "()V", "Ljava/net/URL;", "getAssetBaseURL", "()Ljava/net/URL;", "getAssetBaseURL$annotations", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;", "getComponentsConfig", "()Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;", "getComponentsConfig$annotations", "Ljava/util/Map;", "getComponentsLocalizations", "()Ljava/util/Map;", "getComponentsLocalizations$annotations", "getDefaultLocaleIdentifier-uqtKvyA", "getDefaultLocaleIdentifier-uqtKvyA$annotations", "I", "getRevision", "()I", "Ljava/util/List;", "getZeroDecimalPlaceCountries", "()Ljava/util/List;", "getZeroDecimalPlaceCountries$annotations", "Lcom/revenuecat/purchases/paywalls/components/common/ExitOffers;", "getExitOffers", "()Lcom/revenuecat/purchases/paywalls/components/common/ExitOffers;", "getExitOffers$annotations", "Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;", "getProductChangeConfig", "()Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;", "getProductChangeConfig$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallComponentsData {
    private final URL assetBaseURL;
    private final ComponentsConfig componentsConfig;
    private final Map<LocaleId, Map<LocalizationKey, LocalizationData>> componentsLocalizations;
    private final String defaultLocaleIdentifier;
    private final ExitOffers exitOffers;
    private final String id;
    private final ProductChangeConfig productChangeConfig;
    private final int revision;
    private final String templateName;
    private final List<String> zeroDecimalPlaceCountries;

    public static final Companion INSTANCE = new Companion(null);
    private static final a[] $childSerializers = {null, null, null, null, new g0(LocaleId$$serializer.INSTANCE, new g0(LocalizationKey$$serializer.INSTANCE, LocalizationDataSerializer.INSTANCE)), null, null, null, null, null};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return PaywallComponentsData$$serializer.INSTANCE;
        }
    }

    private PaywallComponentsData(int i, String str, String str2, URL url, ComponentsConfig componentsConfig, Map<LocaleId, ? extends Map<LocalizationKey, ? extends LocalizationData>> map, String str3, int i2, List<String> list, ExitOffers exitOffers, ProductChangeConfig productChangeConfig, x0 x0Var) {
        if (62 != (i & 62)) {
            o0.g(i, 62, PaywallComponentsData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.templateName = str2;
        this.assetBaseURL = url;
        this.componentsConfig = componentsConfig;
        this.componentsLocalizations = map;
        this.defaultLocaleIdentifier = str3;
        if ((i & 64) == 0) {
            this.revision = 0;
        } else {
            this.revision = i2;
        }
        if ((i & 128) == 0) {
            this.zeroDecimalPlaceCountries = x.A;
        } else {
            this.zeroDecimalPlaceCountries = list;
        }
        if ((i & 256) == 0) {
            this.exitOffers = null;
        } else {
            this.exitOffers = exitOffers;
        }
        if ((i & 512) == 0) {
            this.productChangeConfig = null;
        } else {
            this.productChangeConfig = productChangeConfig;
        }
    }

    @c
    public PaywallComponentsData(int i, String str, String str2, URL url, ComponentsConfig componentsConfig, Map map, String str3, int i2, List list, ExitOffers exitOffers, ProductChangeConfig productChangeConfig, x0 x0Var, f fVar) {
        this(i, str, str2, url, componentsConfig, (Map<LocaleId, ? extends Map<LocalizationKey, ? extends LocalizationData>>) map, str3, i2, (List<String>) list, exitOffers, productChangeConfig, x0Var);
    }

    private PaywallComponentsData(String str, String templateName, URL assetBaseURL, ComponentsConfig componentsConfig, Map<LocaleId, ? extends Map<LocalizationKey, ? extends LocalizationData>> componentsLocalizations, String defaultLocaleIdentifier, int i, List<String> zeroDecimalPlaceCountries, ExitOffers exitOffers, ProductChangeConfig productChangeConfig) {
        m.e(templateName, "templateName");
        m.e(assetBaseURL, "assetBaseURL");
        m.e(componentsConfig, "componentsConfig");
        m.e(componentsLocalizations, "componentsLocalizations");
        m.e(defaultLocaleIdentifier, "defaultLocaleIdentifier");
        m.e(zeroDecimalPlaceCountries, "zeroDecimalPlaceCountries");
        this.id = str;
        this.templateName = templateName;
        this.assetBaseURL = assetBaseURL;
        this.componentsConfig = componentsConfig;
        this.componentsLocalizations = componentsLocalizations;
        this.defaultLocaleIdentifier = defaultLocaleIdentifier;
        this.revision = i;
        this.zeroDecimalPlaceCountries = zeroDecimalPlaceCountries;
        this.exitOffers = exitOffers;
        this.productChangeConfig = productChangeConfig;
    }

    public PaywallComponentsData(String str, String str2, URL url, ComponentsConfig componentsConfig, Map map, String str3, int i, List list, ExitOffers exitOffers, ProductChangeConfig productChangeConfig, int i2, f fVar) {
        this((i2 & 1) != 0 ? null : str, str2, url, componentsConfig, map, str3, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? x.A : list, (i2 & 256) != 0 ? null : exitOffers, (i2 & 512) != 0 ? null : productChangeConfig, null);
    }

    public PaywallComponentsData(String str, String str2, URL url, ComponentsConfig componentsConfig, Map map, String str3, int i, List list, ExitOffers exitOffers, ProductChangeConfig productChangeConfig, f fVar) {
        this(str, str2, url, componentsConfig, map, str3, i, list, exitOffers, productChangeConfig);
    }

    public static void getAssetBaseURL$annotations() {
    }

    public static void getComponentsConfig$annotations() {
    }

    public static void getComponentsLocalizations$annotations() {
    }

    public static void m240getDefaultLocaleIdentifieruqtKvyA$annotations() {
    }

    public static void getExitOffers$annotations() {
    }

    public static void getProductChangeConfig$annotations() {
    }

    public static void getTemplateName$annotations() {
    }

    public static void getZeroDecimalPlaceCountries$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(PaywallComponentsData self, b output, e serialDesc) {
        a[] aVarArr = $childSerializers;
        if (output.k(serialDesc) || self.id != null) {
            output.x(serialDesc, 0, b1.a, self.id);
        }
        output.i(serialDesc, 1, self.templateName);
        output.C(serialDesc, 2, URLSerializer.INSTANCE, self.assetBaseURL);
        output.C(serialDesc, 3, ComponentsConfig$$serializer.INSTANCE, self.componentsConfig);
        output.C(serialDesc, 4, aVarArr[4], self.componentsLocalizations);
        output.C(serialDesc, 5, LocaleId$$serializer.INSTANCE, LocaleId.m195boximpl(self.defaultLocaleIdentifier));
        if (output.k(serialDesc) || self.revision != 0) {
            output.w(6, self.revision, serialDesc);
        }
        if (output.k(serialDesc) || !m.a(self.zeroDecimalPlaceCountries, x.A)) {
            output.C(serialDesc, 7, GoogleListSerializer.INSTANCE, self.zeroDecimalPlaceCountries);
        }
        if (output.k(serialDesc) || self.exitOffers != null) {
            output.x(serialDesc, 8, ExitOffers$$serializer.INSTANCE, self.exitOffers);
        }
        if (!output.k(serialDesc) && self.productChangeConfig == null) {
            return;
        }
        output.x(serialDesc, 9, ProductChangeConfigSerializer.INSTANCE, self.productChangeConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallComponentsData)) {
            return false;
        }
        PaywallComponentsData paywallComponentsData = (PaywallComponentsData) obj;
        return m.a(this.id, paywallComponentsData.id) && m.a(this.templateName, paywallComponentsData.templateName) && m.a(this.assetBaseURL, paywallComponentsData.assetBaseURL) && m.a(this.componentsConfig, paywallComponentsData.componentsConfig) && m.a(this.componentsLocalizations, paywallComponentsData.componentsLocalizations) && LocaleId.m198equalsimpl0(this.defaultLocaleIdentifier, paywallComponentsData.defaultLocaleIdentifier) && this.revision == paywallComponentsData.revision && m.a(this.zeroDecimalPlaceCountries, paywallComponentsData.zeroDecimalPlaceCountries) && m.a(this.exitOffers, paywallComponentsData.exitOffers) && m.a(this.productChangeConfig, paywallComponentsData.productChangeConfig);
    }

    public final URL getAssetBaseURL() {
        return this.assetBaseURL;
    }

    public final ComponentsConfig getComponentsConfig() {
        return this.componentsConfig;
    }

    public final Map getComponentsLocalizations() {
        return this.componentsLocalizations;
    }

    public final String getDefaultLocaleIdentifier() {
        return this.defaultLocaleIdentifier;
    }

    public final ExitOffers getExitOffers() {
        return this.exitOffers;
    }

    public final String getId() {
        return this.id;
    }

    public final ProductChangeConfig getProductChangeConfig() {
        return this.productChangeConfig;
    }

    public final int getRevision() {
        return this.revision;
    }

    public final String getTemplateName() {
        return this.templateName;
    }

    public final List getZeroDecimalPlaceCountries() {
        return this.zeroDecimalPlaceCountries;
    }

    public int hashCode() {
        String str = this.id;
        int iA = g4.c.a((((LocaleId.m199hashCodeimpl(this.defaultLocaleIdentifier) + ((this.componentsLocalizations.hashCode() + ((this.componentsConfig.hashCode() + ((this.assetBaseURL.hashCode() + x5.e((str == null ? 0 : str.hashCode()) * 31, this.templateName, 31)) * 31)) * 31)) * 31)) * 31) + this.revision) * 31, 31, this.zeroDecimalPlaceCountries);
        ExitOffers exitOffers = this.exitOffers;
        int iHashCode = (iA + (exitOffers == null ? 0 : exitOffers.hashCode())) * 31;
        ProductChangeConfig productChangeConfig = this.productChangeConfig;
        return iHashCode + (productChangeConfig != null ? productChangeConfig.hashCode() : 0);
    }

    public String toString() {
        return "PaywallComponentsData(id=" + this.id + ", templateName=" + this.templateName + ", assetBaseURL=" + this.assetBaseURL + ", componentsConfig=" + this.componentsConfig + ", componentsLocalizations=" + this.componentsLocalizations + ", defaultLocaleIdentifier=" + ((Object) LocaleId.m200toStringimpl(this.defaultLocaleIdentifier)) + ", revision=" + this.revision + ", zeroDecimalPlaceCountries=" + this.zeroDecimalPlaceCountries + ", exitOffers=" + this.exitOffers + ", productChangeConfig=" + this.productChangeConfig + ')';
    }
}

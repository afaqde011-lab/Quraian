package com.revenuecat.purchases.common.networking;

import com.google.android.gms.internal.measurement.x5;
import g00.c;
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

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u0000 82\u00020\u0001:\u000298BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fBi\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\\\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b1\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b2\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010\u001cR,\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00105\u0012\u0004\b7\u00100\u001a\u0004\b6\u0010\"¨\u0006:"}, d2 = {"Lcom/revenuecat/purchases/common/networking/WebBillingProductResponse;", "", "", "identifier", "productType", "title", "description", "defaultPurchaseOptionId", "", "Lcom/revenuecat/purchases/common/networking/WebBillingPurchaseOption;", "purchaseOptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/networking/WebBillingProductResponse;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/revenuecat/purchases/common/networking/WebBillingProductResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier", "getProductType", "getProductType$annotations", "()V", "getTitle", "getDescription", "getDefaultPurchaseOptionId", "getDefaultPurchaseOptionId$annotations", "Ljava/util/Map;", "getPurchaseOptions", "getPurchaseOptions$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebBillingProductResponse {
    private final String defaultPurchaseOptionId;
    private final String description;
    private final String identifier;
    private final String productType;
    private final Map<String, WebBillingPurchaseOption> purchaseOptions;
    private final String title;

    public static final Companion INSTANCE = new Companion(null);
    private static final a[] $childSerializers = {null, null, null, null, null, new g0(b1.a, WebBillingPurchaseOption$$serializer.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/networking/WebBillingProductResponse$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/common/networking/WebBillingProductResponse;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return WebBillingProductResponse$$serializer.INSTANCE;
        }
    }

    @c
    public WebBillingProductResponse(int i, String str, String str2, String str3, String str4, String str5, Map map, x0 x0Var) {
        if (39 != (i & 39)) {
            o0.g(i, 39, WebBillingProductResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.identifier = str;
        this.productType = str2;
        this.title = str3;
        if ((i & 8) == 0) {
            this.description = null;
        } else {
            this.description = str4;
        }
        if ((i & 16) == 0) {
            this.defaultPurchaseOptionId = null;
        } else {
            this.defaultPurchaseOptionId = str5;
        }
        this.purchaseOptions = map;
    }

    public WebBillingProductResponse(String identifier, String productType, String title, String str, String str2, Map<String, WebBillingPurchaseOption> purchaseOptions) {
        m.e(identifier, "identifier");
        m.e(productType, "productType");
        m.e(title, "title");
        m.e(purchaseOptions, "purchaseOptions");
        this.identifier = identifier;
        this.productType = productType;
        this.title = title;
        this.description = str;
        this.defaultPurchaseOptionId = str2;
        this.purchaseOptions = purchaseOptions;
    }

    public WebBillingProductResponse(String str, String str2, String str3, String str4, String str5, Map map, int i, f fVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, map);
    }

    public static WebBillingProductResponse copy$default(WebBillingProductResponse webBillingProductResponse, String str, String str2, String str3, String str4, String str5, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webBillingProductResponse.identifier;
        }
        if ((i & 2) != 0) {
            str2 = webBillingProductResponse.productType;
        }
        if ((i & 4) != 0) {
            str3 = webBillingProductResponse.title;
        }
        if ((i & 8) != 0) {
            str4 = webBillingProductResponse.description;
        }
        if ((i & 16) != 0) {
            str5 = webBillingProductResponse.defaultPurchaseOptionId;
        }
        if ((i & 32) != 0) {
            map = webBillingProductResponse.purchaseOptions;
        }
        String str6 = str5;
        Map map2 = map;
        return webBillingProductResponse.copy(str, str2, str3, str4, str6, map2);
    }

    public static void getDefaultPurchaseOptionId$annotations() {
    }

    public static void getProductType$annotations() {
    }

    public static void getPurchaseOptions$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(WebBillingProductResponse self, b output, e serialDesc) {
        a[] aVarArr = $childSerializers;
        output.i(serialDesc, 0, self.identifier);
        output.i(serialDesc, 1, self.productType);
        output.i(serialDesc, 2, self.title);
        if (output.k(serialDesc) || self.description != null) {
            output.x(serialDesc, 3, b1.a, self.description);
        }
        if (output.k(serialDesc) || self.defaultPurchaseOptionId != null) {
            output.x(serialDesc, 4, b1.a, self.defaultPurchaseOptionId);
        }
        output.C(serialDesc, 5, aVarArr[5], self.purchaseOptions);
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getProductType() {
        return this.productType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDefaultPurchaseOptionId() {
        return this.defaultPurchaseOptionId;
    }

    public final Map<String, WebBillingPurchaseOption> component6() {
        return this.purchaseOptions;
    }

    public final WebBillingProductResponse copy(String identifier, String productType, String title, String description, String defaultPurchaseOptionId, Map<String, WebBillingPurchaseOption> purchaseOptions) {
        m.e(identifier, "identifier");
        m.e(productType, "productType");
        m.e(title, "title");
        m.e(purchaseOptions, "purchaseOptions");
        return new WebBillingProductResponse(identifier, productType, title, description, defaultPurchaseOptionId, purchaseOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebBillingProductResponse)) {
            return false;
        }
        WebBillingProductResponse webBillingProductResponse = (WebBillingProductResponse) other;
        return m.a(this.identifier, webBillingProductResponse.identifier) && m.a(this.productType, webBillingProductResponse.productType) && m.a(this.title, webBillingProductResponse.title) && m.a(this.description, webBillingProductResponse.description) && m.a(this.defaultPurchaseOptionId, webBillingProductResponse.defaultPurchaseOptionId) && m.a(this.purchaseOptions, webBillingProductResponse.purchaseOptions);
    }

    public final String getDefaultPurchaseOptionId() {
        return this.defaultPurchaseOptionId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getProductType() {
        return this.productType;
    }

    public final Map<String, WebBillingPurchaseOption> getPurchaseOptions() {
        return this.purchaseOptions;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iE = x5.e(x5.e(this.identifier.hashCode() * 31, this.productType, 31), this.title, 31);
        String str = this.description;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.defaultPurchaseOptionId;
        return this.purchaseOptions.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WebBillingProductResponse(identifier=");
        sb.append(this.identifier);
        sb.append(", productType=");
        sb.append(this.productType);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", defaultPurchaseOptionId=");
        sb.append(this.defaultPurchaseOptionId);
        sb.append(", purchaseOptions=");
        return w.c.m(sb, this.purchaseOptions, ')');
    }
}

package com.revenuecat.purchases.common.networking;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import oi.k;
import p40.c;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B-\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016¨\u0006("}, d2 = {"Lcom/revenuecat/purchases/common/networking/WebBillingProductsResponse;", "", "", "Lcom/revenuecat/purchases/common/networking/WebBillingProductResponse;", "productDetails", "<init>", "(Ljava/util/List;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/util/List;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/networking/WebBillingProductsResponse;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/revenuecat/purchases/common/networking/WebBillingProductsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getProductDetails", "getProductDetails$annotations", "()V", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebBillingProductsResponse {
    private final List<WebBillingProductResponse> productDetails;

    public static final Companion INSTANCE = new Companion(null);
    private static final a[] $childSerializers = {new c(WebBillingProductResponse$$serializer.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/networking/WebBillingProductsResponse$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/common/networking/WebBillingProductsResponse;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return WebBillingProductsResponse$$serializer.INSTANCE;
        }
    }

    @g00.c
    public WebBillingProductsResponse(int i, List list, x0 x0Var) {
        if (1 == (i & 1)) {
            this.productDetails = list;
        } else {
            o0.g(i, 1, WebBillingProductsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public WebBillingProductsResponse(List<WebBillingProductResponse> productDetails) {
        m.e(productDetails, "productDetails");
        this.productDetails = productDetails;
    }

    public static WebBillingProductsResponse copy$default(WebBillingProductsResponse webBillingProductsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = webBillingProductsResponse.productDetails;
        }
        return webBillingProductsResponse.copy(list);
    }

    public static void getProductDetails$annotations() {
    }

    public final List<WebBillingProductResponse> component1() {
        return this.productDetails;
    }

    public final WebBillingProductsResponse copy(List<WebBillingProductResponse> productDetails) {
        m.e(productDetails, "productDetails");
        return new WebBillingProductsResponse(productDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WebBillingProductsResponse) && m.a(this.productDetails, ((WebBillingProductsResponse) other).productDetails);
    }

    public final List<WebBillingProductResponse> getProductDetails() {
        return this.productDetails;
    }

    public int hashCode() {
        return this.productDetails.hashCode();
    }

    public String toString() {
        return k.n(new StringBuilder("WebBillingProductsResponse(productDetails="), this.productDetails, ')');
    }
}

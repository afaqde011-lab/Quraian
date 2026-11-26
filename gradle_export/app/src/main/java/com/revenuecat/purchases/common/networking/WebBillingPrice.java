package com.revenuecat.purchases.common.networking;

import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006+"}, d2 = {"Lcom/revenuecat/purchases/common/networking/WebBillingPrice;", "", "", "amountMicros", "", "currency", "<init>", "(JLjava/lang/String;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(IJLjava/lang/String;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/networking/WebBillingPrice;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()J", "component2", "()Ljava/lang/String;", "copy", "(JLjava/lang/String;)Lcom/revenuecat/purchases/common/networking/WebBillingPrice;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getAmountMicros", "getAmountMicros$annotations", "()V", "Ljava/lang/String;", "getCurrency", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebBillingPrice {

    public static final Companion INSTANCE = new Companion(null);
    private final long amountMicros;
    private final String currency;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/networking/WebBillingPrice$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/common/networking/WebBillingPrice;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return WebBillingPrice$$serializer.INSTANCE;
        }
    }

    @c
    public WebBillingPrice(int i, long j, String str, x0 x0Var) {
        if (3 != (i & 3)) {
            o0.g(i, 3, WebBillingPrice$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.amountMicros = j;
        this.currency = str;
    }

    public WebBillingPrice(long j, String currency) {
        m.e(currency, "currency");
        this.amountMicros = j;
        this.currency = currency;
    }

    public static WebBillingPrice copy$default(WebBillingPrice webBillingPrice, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = webBillingPrice.amountMicros;
        }
        if ((i & 2) != 0) {
            str = webBillingPrice.currency;
        }
        return webBillingPrice.copy(j, str);
    }

    public static void getAmountMicros$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(WebBillingPrice self, b output, e serialDesc) {
        output.t(serialDesc, 0, self.amountMicros);
        output.i(serialDesc, 1, self.currency);
    }

    public final long getAmountMicros() {
        return this.amountMicros;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final WebBillingPrice copy(long amountMicros, String currency) {
        m.e(currency, "currency");
        return new WebBillingPrice(amountMicros, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebBillingPrice)) {
            return false;
        }
        WebBillingPrice webBillingPrice = (WebBillingPrice) other;
        return this.amountMicros == webBillingPrice.amountMicros && m.a(this.currency, webBillingPrice.currency);
    }

    public final long getAmountMicros() {
        return this.amountMicros;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return this.currency.hashCode() + (Long.hashCode(this.amountMicros) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WebBillingPrice(amountMicros=");
        sb.append(this.amountMicros);
        sb.append(", currency=");
        return g4.c.k(sb, this.currency, ')');
    }
}

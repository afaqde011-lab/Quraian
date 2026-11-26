package com.revenuecat.purchases.common.networking;

import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import oi.k;
import p40.b1;
import p40.x0;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002/.B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB;\b\u0011\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ2\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u001cJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u001c¨\u00060"}, d2 = {"Lcom/revenuecat/purchases/common/networking/WebBillingPhase;", "", "Lcom/revenuecat/purchases/common/networking/WebBillingPrice;", "price", "", "periodDuration", "", "cycleCount", "<init>", "(Lcom/revenuecat/purchases/common/networking/WebBillingPrice;Ljava/lang/String;I)V", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/common/networking/WebBillingPrice;Ljava/lang/String;ILp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/networking/WebBillingPhase;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/common/networking/WebBillingPrice;", "component2", "()Ljava/lang/String;", "component3", "()I", "copy", "(Lcom/revenuecat/purchases/common/networking/WebBillingPrice;Ljava/lang/String;I)Lcom/revenuecat/purchases/common/networking/WebBillingPhase;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/common/networking/WebBillingPrice;", "getPrice", "Ljava/lang/String;", "getPeriodDuration", "getPeriodDuration$annotations", "()V", "I", "getCycleCount", "getCycleCount$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebBillingPhase {

    public static final Companion INSTANCE = new Companion(null);
    private final int cycleCount;
    private final String periodDuration;
    private final WebBillingPrice price;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/networking/WebBillingPhase$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/common/networking/WebBillingPhase;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return WebBillingPhase$$serializer.INSTANCE;
        }
    }

    public WebBillingPhase() {
        this((WebBillingPrice) null, (String) null, 0, 7, (f) null);
    }

    @c
    public WebBillingPhase(int i, WebBillingPrice webBillingPrice, String str, int i2, x0 x0Var) {
        if ((i & 1) == 0) {
            this.price = null;
        } else {
            this.price = webBillingPrice;
        }
        if ((i & 2) == 0) {
            this.periodDuration = null;
        } else {
            this.periodDuration = str;
        }
        if ((i & 4) == 0) {
            this.cycleCount = 1;
        } else {
            this.cycleCount = i2;
        }
    }

    public WebBillingPhase(WebBillingPrice webBillingPrice, String str, int i) {
        this.price = webBillingPrice;
        this.periodDuration = str;
        this.cycleCount = i;
    }

    public WebBillingPhase(WebBillingPrice webBillingPrice, String str, int i, int i2, f fVar) {
        this((i2 & 1) != 0 ? null : webBillingPrice, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 1 : i);
    }

    public static WebBillingPhase copy$default(WebBillingPhase webBillingPhase, WebBillingPrice webBillingPrice, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            webBillingPrice = webBillingPhase.price;
        }
        if ((i2 & 2) != 0) {
            str = webBillingPhase.periodDuration;
        }
        if ((i2 & 4) != 0) {
            i = webBillingPhase.cycleCount;
        }
        return webBillingPhase.copy(webBillingPrice, str, i);
    }

    public static void getCycleCount$annotations() {
    }

    public static void getPeriodDuration$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(WebBillingPhase self, b output, e serialDesc) {
        if (output.k(serialDesc) || self.price != null) {
            output.x(serialDesc, 0, WebBillingPrice$$serializer.INSTANCE, self.price);
        }
        if (output.k(serialDesc) || self.periodDuration != null) {
            output.x(serialDesc, 1, b1.a, self.periodDuration);
        }
        if (!output.k(serialDesc) && self.cycleCount == 1) {
            return;
        }
        output.w(2, self.cycleCount, serialDesc);
    }

    public final WebBillingPrice getPrice() {
        return this.price;
    }

    public final String getPeriodDuration() {
        return this.periodDuration;
    }

    public final int getCycleCount() {
        return this.cycleCount;
    }

    public final WebBillingPhase copy(WebBillingPrice price, String periodDuration, int cycleCount) {
        return new WebBillingPhase(price, periodDuration, cycleCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebBillingPhase)) {
            return false;
        }
        WebBillingPhase webBillingPhase = (WebBillingPhase) other;
        return m.a(this.price, webBillingPhase.price) && m.a(this.periodDuration, webBillingPhase.periodDuration) && this.cycleCount == webBillingPhase.cycleCount;
    }

    public final int getCycleCount() {
        return this.cycleCount;
    }

    public final String getPeriodDuration() {
        return this.periodDuration;
    }

    public final WebBillingPrice getPrice() {
        return this.price;
    }

    public int hashCode() {
        WebBillingPrice webBillingPrice = this.price;
        int iHashCode = (webBillingPrice == null ? 0 : webBillingPrice.hashCode()) * 31;
        String str = this.periodDuration;
        return Integer.hashCode(this.cycleCount) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WebBillingPhase(price=");
        sb.append(this.price);
        sb.append(", periodDuration=");
        sb.append(this.periodDuration);
        sb.append(", cycleCount=");
        return k.l(sb, this.cycleCount, ')');
    }
}

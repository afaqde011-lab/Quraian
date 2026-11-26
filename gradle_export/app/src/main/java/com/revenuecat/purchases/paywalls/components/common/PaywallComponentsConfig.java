package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.paywalls.components.HeaderComponent;
import com.revenuecat.purchases.paywalls.components.HeaderComponent$$serializer;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent$$serializer;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent$$serializer;
import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002)(B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBE\b\u0011\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;", "", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "background", "Lcom/revenuecat/purchases/paywalls/components/StickyFooterComponent;", "stickyFooter", "Lcom/revenuecat/purchases/paywalls/components/HeaderComponent;", "header", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/StickyFooterComponent;Lcom/revenuecat/purchases/paywalls/components/HeaderComponent;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/StickyFooterComponent;Lcom/revenuecat/purchases/paywalls/components/HeaderComponent;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;Lo40/b;Ln40/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "getBackground", "()Lcom/revenuecat/purchases/paywalls/components/common/Background;", "Lcom/revenuecat/purchases/paywalls/components/StickyFooterComponent;", "getStickyFooter", "()Lcom/revenuecat/purchases/paywalls/components/StickyFooterComponent;", "getStickyFooter$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/HeaderComponent;", "getHeader", "()Lcom/revenuecat/purchases/paywalls/components/HeaderComponent;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallComponentsConfig {

    public static final Companion INSTANCE = new Companion(null);
    private final Background background;
    private final HeaderComponent header;
    private final StackComponent stack;
    private final StickyFooterComponent stickyFooter;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return PaywallComponentsConfig$$serializer.INSTANCE;
        }
    }

    @c
    public PaywallComponentsConfig(int i, StackComponent stackComponent, Background background, StickyFooterComponent stickyFooterComponent, HeaderComponent headerComponent, x0 x0Var) {
        if (3 != (i & 3)) {
            o0.g(i, 3, PaywallComponentsConfig$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.stack = stackComponent;
        this.background = background;
        if ((i & 4) == 0) {
            this.stickyFooter = null;
        } else {
            this.stickyFooter = stickyFooterComponent;
        }
        if ((i & 8) == 0) {
            this.header = null;
        } else {
            this.header = headerComponent;
        }
    }

    public PaywallComponentsConfig(StackComponent stack, Background background, StickyFooterComponent stickyFooterComponent, HeaderComponent headerComponent) {
        m.e(stack, "stack");
        m.e(background, "background");
        this.stack = stack;
        this.background = background;
        this.stickyFooter = stickyFooterComponent;
        this.header = headerComponent;
    }

    public PaywallComponentsConfig(StackComponent stackComponent, Background background, StickyFooterComponent stickyFooterComponent, HeaderComponent headerComponent, int i, f fVar) {
        this(stackComponent, background, (i & 4) != 0 ? null : stickyFooterComponent, (i & 8) != 0 ? null : headerComponent);
    }

    public static void getStickyFooter$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(PaywallComponentsConfig self, b output, e serialDesc) {
        output.C(serialDesc, 0, StackComponent$$serializer.INSTANCE, self.stack);
        output.C(serialDesc, 1, BackgroundDeserializer.INSTANCE, self.background);
        if (output.k(serialDesc) || self.stickyFooter != null) {
            output.x(serialDesc, 2, StickyFooterComponent$$serializer.INSTANCE, self.stickyFooter);
        }
        if (!output.k(serialDesc) && self.header == null) {
            return;
        }
        output.x(serialDesc, 3, HeaderComponent$$serializer.INSTANCE, self.header);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallComponentsConfig)) {
            return false;
        }
        PaywallComponentsConfig paywallComponentsConfig = (PaywallComponentsConfig) obj;
        return m.a(this.stack, paywallComponentsConfig.stack) && m.a(this.background, paywallComponentsConfig.background) && m.a(this.stickyFooter, paywallComponentsConfig.stickyFooter) && m.a(this.header, paywallComponentsConfig.header);
    }

    public final Background getBackground() {
        return this.background;
    }

    public final HeaderComponent getHeader() {
        return this.header;
    }

    public final StackComponent getStack() {
        return this.stack;
    }

    public final StickyFooterComponent getStickyFooter() {
        return this.stickyFooter;
    }

    public int hashCode() {
        int iHashCode = (this.background.hashCode() + (this.stack.hashCode() * 31)) * 31;
        StickyFooterComponent stickyFooterComponent = this.stickyFooter;
        int iHashCode2 = (iHashCode + (stickyFooterComponent == null ? 0 : stickyFooterComponent.hashCode())) * 31;
        HeaderComponent headerComponent = this.header;
        return iHashCode2 + (headerComponent != null ? headerComponent.hashCode() : 0);
    }

    public String toString() {
        return "PaywallComponentsConfig(stack=" + this.stack + ", background=" + this.background + ", stickyFooter=" + this.stickyFooter + ", header=" + this.header + ')';
    }
}

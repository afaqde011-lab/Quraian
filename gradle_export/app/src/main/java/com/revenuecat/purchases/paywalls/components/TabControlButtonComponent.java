package com.revenuecat.purchases.paywalls.components;

import com.google.android.gms.internal.measurement.x5;
import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002$#B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB;\b\u0011\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabControlButtonComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "", "tabIndex", "", "tabId", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "<init>", "(ILjava/lang/String;Lcom/revenuecat/purchases/paywalls/components/StackComponent;)V", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(IILjava/lang/String;Lcom/revenuecat/purchases/paywalls/components/StackComponent;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/TabControlButtonComponent;Lo40/b;Ln40/e;)V", "write$Self", "I", "getTabIndex", "()I", "getTabIndex$annotations", "()V", "Ljava/lang/String;", "getTabId", "()Ljava/lang/String;", "getTabId$annotations", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TabControlButtonComponent implements PaywallComponent {

    public static final Companion INSTANCE = new Companion(null);
    private final StackComponent stack;
    private final String tabId;
    private final int tabIndex;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabControlButtonComponent$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/TabControlButtonComponent;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return TabControlButtonComponent$$serializer.INSTANCE;
        }
    }

    @c
    public TabControlButtonComponent(int i, int i2, String str, StackComponent stackComponent, x0 x0Var) {
        if (7 != (i & 7)) {
            o0.g(i, 7, TabControlButtonComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.tabIndex = i2;
        this.tabId = str;
        this.stack = stackComponent;
    }

    public TabControlButtonComponent(int i, String tabId, StackComponent stack) {
        m.e(tabId, "tabId");
        m.e(stack, "stack");
        this.tabIndex = i;
        this.tabId = tabId;
        this.stack = stack;
    }

    public static void getTabId$annotations() {
    }

    public static void getTabIndex$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(TabControlButtonComponent self, b output, e serialDesc) {
        output.w(0, self.tabIndex, serialDesc);
        output.i(serialDesc, 1, self.tabId);
        output.C(serialDesc, 2, StackComponent$$serializer.INSTANCE, self.stack);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabControlButtonComponent)) {
            return false;
        }
        TabControlButtonComponent tabControlButtonComponent = (TabControlButtonComponent) obj;
        return this.tabIndex == tabControlButtonComponent.tabIndex && m.a(this.tabId, tabControlButtonComponent.tabId) && m.a(this.stack, tabControlButtonComponent.stack);
    }

    public final StackComponent getStack() {
        return this.stack;
    }

    public final String getTabId() {
        return this.tabId;
    }

    public final int getTabIndex() {
        return this.tabIndex;
    }

    public int hashCode() {
        return this.stack.hashCode() + x5.e(this.tabIndex * 31, this.tabId, 31);
    }

    public String toString() {
        return "TabControlButtonComponent(tabIndex=" + this.tabIndex + ", tabId=" + this.tabId + ", stack=" + this.stack + ')';
    }
}

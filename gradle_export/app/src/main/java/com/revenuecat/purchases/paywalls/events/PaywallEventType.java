package com.revenuecat.purchases.paywalls.events;

import g00.h;
import g00.i;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.n;
import p40.o0;
import rd.a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "IMPRESSION", "CANCEL", "CLOSE", "PURCHASE_INITIATED", "PURCHASE_ERROR", "EXIT_OFFER", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum PaywallEventType {
    IMPRESSION("paywall_impression"),
    CANCEL("paywall_cancel"),
    CLOSE("paywall_close"),
    PURCHASE_INITIATED("paywall_purchase_initiated"),
    PURCHASE_ERROR("paywall_purchase_error"),
    EXIT_OFFER("paywall_exit_offer");

    private final String value;

    public static final Companion INSTANCE = new Companion(null);
    private static final h $cachedSerializer$delegate = a.I(i.B, Companion.AnonymousClass1.INSTANCE);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEventType$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass1 extends n implements u00.a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override
            public final l40.a invoke() {
                return o0.e("com.revenuecat.purchases.paywalls.events.PaywallEventType", PaywallEventType.values());
            }
        }

        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        private final l40.a get$cachedSerializer() {
            return (l40.a) PaywallEventType.$cachedSerializer$delegate.getValue();
        }

        public final l40.a serializer() {
            return get$cachedSerializer();
        }
    }

    PaywallEventType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}

package com.revenuecat.purchases.paywalls.components;

import g00.h;
import g00.i;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import p40.v;
import rd.a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabControlComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "<init>", "()V", "Ll40/a;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TabControlComponent implements PaywallComponent {
    public static final TabControlComponent INSTANCE = new TabControlComponent();
    private static final h $cachedSerializer$delegate = a.I(i.B, AnonymousClass1.INSTANCE);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends n implements u00.a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override
        public final l40.a invoke() {
            return new v("tab_control", TabControlComponent.INSTANCE, new Annotation[0]);
        }
    }

    private TabControlComponent() {
    }

    private final l40.a get$cachedSerializer() {
        return (l40.a) $cachedSerializer$delegate.getValue();
    }

    public final l40.a serializer() {
        return get$cachedSerializer();
    }
}

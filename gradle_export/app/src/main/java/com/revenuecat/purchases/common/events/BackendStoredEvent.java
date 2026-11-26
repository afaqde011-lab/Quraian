package com.revenuecat.purchases.common.events;

import a10.d;
import com.revenuecat.purchases.utils.Event;
import g00.c;
import g00.h;
import g00.i;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import n40.e;
import o40.b;
import p40.o0;
import p40.x0;
import rd.a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00112\u00020\u0001:\u0005\u0012\u0011\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "Lcom/revenuecat/purchases/utils/Event;", "<init>", "()V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self", "(Lcom/revenuecat/purchases/common/events/BackendStoredEvent;Lo40/b;Ln40/e;)V", "Companion", "Ad", "CustomPaywall", "CustomerCenter", "Paywalls", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Ad;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomPaywall;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomerCenter;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Paywalls;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BackendStoredEvent implements Event {

    public static final Companion INSTANCE = new Companion(null);
    private static final h $cachedSerializer$delegate = a.I(i.B, Companion.AnonymousClass1.INSTANCE);

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Ad;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;", "event", "<init>", "(Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/common/events/BackendEvent$Ad;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Ad;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;", "copy", "(Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;)Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Ad;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;", "getEvent", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Ad extends BackendStoredEvent {

        public static final Companion INSTANCE = new Companion(null);
        private final BackendEvent.Ad event;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Ad$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Ad;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final l40.a serializer() {
                return BackendStoredEvent$Ad$$serializer.INSTANCE;
            }
        }

        @c
        public Ad(int i, BackendEvent.Ad ad, x0 x0Var) {
            super(i, x0Var);
            if (1 != (i & 1)) {
                o0.g(i, 1, BackendStoredEvent$Ad$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.event = ad;
        }

        public Ad(BackendEvent.Ad event) {
            super(null);
            m.e(event, "event");
            this.event = event;
        }

        public static Ad copy$default(Ad ad, BackendEvent.Ad ad2, int i, Object obj) {
            if ((i & 1) != 0) {
                ad2 = ad.event;
            }
            return ad.copy(ad2);
        }

        public static final void write$Self$purchases_defaultsBc8Release(Ad self, b output, e serialDesc) {
            BackendStoredEvent.write$Self(self, output, serialDesc);
            output.C(serialDesc, 0, BackendEvent$Ad$$serializer.INSTANCE, self.event);
        }

        public final BackendEvent.Ad getEvent() {
            return this.event;
        }

        public final Ad copy(BackendEvent.Ad event) {
            m.e(event, "event");
            return new Ad(event);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ad) && m.a(this.event, ((Ad) other).event);
        }

        public final BackendEvent.Ad getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        @Override
        public String toString() {
            return "Ad(event=" + this.event + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass1 extends n implements u00.a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override
            public final l40.a invoke() {
                b0 b0Var = a0.a;
                return new l40.c("com.revenuecat.purchases.common.events.BackendStoredEvent", b0Var.b(BackendStoredEvent.class), new d[]{b0Var.b(Ad.class), b0Var.b(CustomPaywall.class), b0Var.b(CustomerCenter.class), b0Var.b(Paywalls.class)}, new l40.a[]{BackendStoredEvent$Ad$$serializer.INSTANCE, BackendStoredEvent$CustomPaywall$$serializer.INSTANCE, BackendStoredEvent$CustomerCenter$$serializer.INSTANCE, BackendStoredEvent$Paywalls$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        private final l40.a get$cachedSerializer() {
            return (l40.a) BackendStoredEvent.$cachedSerializer$delegate.getValue();
        }

        public final l40.a serializer() {
            return get$cachedSerializer();
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomPaywall;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;", "event", "<init>", "(Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomPaywall;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;", "copy", "(Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;)Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomPaywall;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;", "getEvent", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CustomPaywall extends BackendStoredEvent {

        public static final Companion INSTANCE = new Companion(null);
        private final BackendEvent.CustomPaywall event;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomPaywall$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomPaywall;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final l40.a serializer() {
                return BackendStoredEvent$CustomPaywall$$serializer.INSTANCE;
            }
        }

        @c
        public CustomPaywall(int i, BackendEvent.CustomPaywall customPaywall, x0 x0Var) {
            super(i, x0Var);
            if (1 != (i & 1)) {
                o0.g(i, 1, BackendStoredEvent$CustomPaywall$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.event = customPaywall;
        }

        public CustomPaywall(BackendEvent.CustomPaywall event) {
            super(null);
            m.e(event, "event");
            this.event = event;
        }

        public static CustomPaywall copy$default(CustomPaywall customPaywall, BackendEvent.CustomPaywall customPaywall2, int i, Object obj) {
            if ((i & 1) != 0) {
                customPaywall2 = customPaywall.event;
            }
            return customPaywall.copy(customPaywall2);
        }

        public static final void write$Self$purchases_defaultsBc8Release(CustomPaywall self, b output, e serialDesc) {
            BackendStoredEvent.write$Self(self, output, serialDesc);
            output.C(serialDesc, 0, BackendEvent$CustomPaywall$$serializer.INSTANCE, self.event);
        }

        public final BackendEvent.CustomPaywall getEvent() {
            return this.event;
        }

        public final CustomPaywall copy(BackendEvent.CustomPaywall event) {
            m.e(event, "event");
            return new CustomPaywall(event);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CustomPaywall) && m.a(this.event, ((CustomPaywall) other).event);
        }

        public final BackendEvent.CustomPaywall getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        @Override
        public String toString() {
            return "CustomPaywall(event=" + this.event + ')';
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomerCenter;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "event", "<init>", "(Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomerCenter;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "copy", "(Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;)Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomerCenter;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "getEvent", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CustomerCenter extends BackendStoredEvent {

        public static final Companion INSTANCE = new Companion(null);
        private final BackendEvent.CustomerCenter event;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomerCenter$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomerCenter;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final l40.a serializer() {
                return BackendStoredEvent$CustomerCenter$$serializer.INSTANCE;
            }
        }

        @c
        public CustomerCenter(int i, BackendEvent.CustomerCenter customerCenter, x0 x0Var) {
            super(i, x0Var);
            if (1 != (i & 1)) {
                o0.g(i, 1, BackendStoredEvent$CustomerCenter$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.event = customerCenter;
        }

        public CustomerCenter(BackendEvent.CustomerCenter event) {
            super(null);
            m.e(event, "event");
            this.event = event;
        }

        public static CustomerCenter copy$default(CustomerCenter customerCenter, BackendEvent.CustomerCenter customerCenter2, int i, Object obj) {
            if ((i & 1) != 0) {
                customerCenter2 = customerCenter.event;
            }
            return customerCenter.copy(customerCenter2);
        }

        public static final void write$Self$purchases_defaultsBc8Release(CustomerCenter self, b output, e serialDesc) {
            BackendStoredEvent.write$Self(self, output, serialDesc);
            output.C(serialDesc, 0, BackendEvent$CustomerCenter$$serializer.INSTANCE, self.event);
        }

        public final BackendEvent.CustomerCenter getEvent() {
            return this.event;
        }

        public final CustomerCenter copy(BackendEvent.CustomerCenter event) {
            m.e(event, "event");
            return new CustomerCenter(event);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CustomerCenter) && m.a(this.event, ((CustomerCenter) other).event);
        }

        public final BackendEvent.CustomerCenter getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        @Override
        public String toString() {
            return "CustomerCenter(event=" + this.event + ')';
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Paywalls;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "event", "<init>", "(Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Paywalls;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "copy", "(Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;)Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Paywalls;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "getEvent", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Paywalls extends BackendStoredEvent {

        public static final Companion INSTANCE = new Companion(null);
        private final BackendEvent.Paywalls event;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Paywalls$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Paywalls;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final l40.a serializer() {
                return BackendStoredEvent$Paywalls$$serializer.INSTANCE;
            }
        }

        @c
        public Paywalls(int i, BackendEvent.Paywalls paywalls, x0 x0Var) {
            super(i, x0Var);
            if (1 != (i & 1)) {
                o0.g(i, 1, BackendStoredEvent$Paywalls$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.event = paywalls;
        }

        public Paywalls(BackendEvent.Paywalls event) {
            super(null);
            m.e(event, "event");
            this.event = event;
        }

        public static Paywalls copy$default(Paywalls paywalls, BackendEvent.Paywalls paywalls2, int i, Object obj) {
            if ((i & 1) != 0) {
                paywalls2 = paywalls.event;
            }
            return paywalls.copy(paywalls2);
        }

        public static final void write$Self$purchases_defaultsBc8Release(Paywalls self, b output, e serialDesc) {
            BackendStoredEvent.write$Self(self, output, serialDesc);
            output.C(serialDesc, 0, BackendEvent$Paywalls$$serializer.INSTANCE, self.event);
        }

        public final BackendEvent.Paywalls getEvent() {
            return this.event;
        }

        public final Paywalls copy(BackendEvent.Paywalls event) {
            m.e(event, "event");
            return new Paywalls(event);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Paywalls) && m.a(this.event, ((Paywalls) other).event);
        }

        public final BackendEvent.Paywalls getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        @Override
        public String toString() {
            return "Paywalls(event=" + this.event + ')';
        }
    }

    private BackendStoredEvent() {
    }

    @c
    public BackendStoredEvent(int i, x0 x0Var) {
    }

    public BackendStoredEvent(f fVar) {
        this();
    }

    public static final void write$Self(BackendStoredEvent self, b output, e serialDesc) {
    }
}

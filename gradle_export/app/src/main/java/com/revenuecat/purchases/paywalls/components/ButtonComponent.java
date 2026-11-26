package com.revenuecat.purchases.paywalls.components;

import a10.d;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import g00.h;
import g00.i;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import l40.a;
import l40.c;
import n40.e;
import o40.b;
import p40.b1;
import p40.o0;
import p40.v;
import p40.x0;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 !2\u00020\u0001:\u0005\"#!$%B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "action", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;", "transition", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;Lcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;Lcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent;Lo40/b;Ln40/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "getAction", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;", "getTransition", "()Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;", "Companion", "$serializer", "Action", "Destination", "UrlMethod", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ButtonComponent implements PaywallComponent {

    public static final Companion INSTANCE = new Companion(null);
    private final Action action;
    private final StackComponent stack;
    private final PaywallTransition transition;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "", "Companion", "NavigateBack", "NavigateTo", "RestorePurchases", "Unknown", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateBack;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateTo;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$RestorePurchases;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$Unknown;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Action {

        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final a serializer() {
                return ActionSerializer.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateBack;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "<init>", "()V", "Ll40/a;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateBack implements Action {
            public static final NavigateBack INSTANCE = new NavigateBack();
            private static final h $cachedSerializer$delegate = rd.a.I(i.B, AnonymousClass1.INSTANCE);

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass1 extends n implements u00.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override
                public final a invoke() {
                    return new v("com.revenuecat.purchases.paywalls.components.ButtonComponent.Action.NavigateBack", NavigateBack.INSTANCE, new Annotation[0]);
                }
            }

            private NavigateBack() {
            }

            private final a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateTo;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "destination", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateTo;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "copy", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;)Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateTo;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "getDestination", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateTo implements Action {
            private static final a[] $childSerializers;

            public static final Companion INSTANCE = new Companion(null);
            private final Destination destination;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateTo$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateTo;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return ButtonComponent$Action$NavigateTo$$serializer.INSTANCE;
                }
            }

            static {
                b0 b0Var = a0.a;
                $childSerializers = new a[]{new c("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination", b0Var.b(Destination.class), new d[]{b0Var.b(Destination.CustomerCenter.class), b0Var.b(Destination.PrivacyPolicy.class), b0Var.b(Destination.Sheet.class), b0Var.b(Destination.Terms.class), b0Var.b(Destination.Unknown.class), b0Var.b(Destination.Url.class)}, new a[]{new v("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.CustomerCenter", Destination.CustomerCenter.INSTANCE, new Annotation[0]), ButtonComponent$Destination$PrivacyPolicy$$serializer.INSTANCE, ButtonComponent$Destination$Sheet$$serializer.INSTANCE, ButtonComponent$Destination$Terms$$serializer.INSTANCE, new v("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Unknown", Destination.Unknown.INSTANCE, new Annotation[0]), ButtonComponent$Destination$Url$$serializer.INSTANCE}, new Annotation[0])};
            }

            @g00.c
            public NavigateTo(int i, Destination destination, x0 x0Var) {
                if (1 == (i & 1)) {
                    this.destination = destination;
                } else {
                    o0.g(i, 1, ButtonComponent$Action$NavigateTo$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public NavigateTo(Destination destination) {
                m.e(destination, "destination");
                this.destination = destination;
            }

            public static NavigateTo copy$default(NavigateTo navigateTo, Destination destination, int i, Object obj) {
                if ((i & 1) != 0) {
                    destination = navigateTo.destination;
                }
                return navigateTo.copy(destination);
            }

            public final Destination getDestination() {
                return this.destination;
            }

            public final NavigateTo copy(Destination destination) {
                m.e(destination, "destination");
                return new NavigateTo(destination);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NavigateTo) && m.a(this.destination, ((NavigateTo) other).destination);
            }

            public final Destination getDestination() {
                return this.destination;
            }

            public int hashCode() {
                return this.destination.hashCode();
            }

            public String toString() {
                return "NavigateTo(destination=" + this.destination + ')';
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$RestorePurchases;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "<init>", "()V", "Ll40/a;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class RestorePurchases implements Action {
            public static final RestorePurchases INSTANCE = new RestorePurchases();
            private static final h $cachedSerializer$delegate = rd.a.I(i.B, AnonymousClass1.INSTANCE);

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass1 extends n implements u00.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override
                public final a invoke() {
                    return new v("com.revenuecat.purchases.paywalls.components.ButtonComponent.Action.RestorePurchases", RestorePurchases.INSTANCE, new Annotation[0]);
                }
            }

            private RestorePurchases() {
            }

            private final a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$Unknown;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "<init>", "()V", "Ll40/a;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Unknown implements Action {
            public static final Unknown INSTANCE = new Unknown();
            private static final h $cachedSerializer$delegate = rd.a.I(i.B, AnonymousClass1.INSTANCE);

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass1 extends n implements u00.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override
                public final a invoke() {
                    return new v("com.revenuecat.purchases.paywalls.components.ButtonComponent.Action.Unknown", Unknown.INSTANCE, new Annotation[0]);
                }
            }

            private Unknown() {
            }

            private final a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return ButtonComponent$$serializer.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "", "Companion", "CustomerCenter", "PrivacyPolicy", "Sheet", "Terms", "Unknown", "Url", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$CustomerCenter;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$PrivacyPolicy;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Terms;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Unknown;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Url;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Destination {

        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final a serializer() {
                b0 b0Var = a0.a;
                return new c("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination", b0Var.b(Destination.class), new d[]{b0Var.b(CustomerCenter.class), b0Var.b(PrivacyPolicy.class), b0Var.b(Sheet.class), b0Var.b(Terms.class), b0Var.b(Unknown.class), b0Var.b(Url.class)}, new a[]{new v("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.CustomerCenter", CustomerCenter.INSTANCE, new Annotation[0]), ButtonComponent$Destination$PrivacyPolicy$$serializer.INSTANCE, ButtonComponent$Destination$Sheet$$serializer.INSTANCE, ButtonComponent$Destination$Terms$$serializer.INSTANCE, new v("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Unknown", Unknown.INSTANCE, new Annotation[0]), ButtonComponent$Destination$Url$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$CustomerCenter;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "<init>", "()V", "Ll40/a;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class CustomerCenter implements Destination {
            public static final CustomerCenter INSTANCE = new CustomerCenter();
            private static final h $cachedSerializer$delegate = rd.a.I(i.B, AnonymousClass1.INSTANCE);

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass1 extends n implements u00.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override
                public final a invoke() {
                    return new v("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.CustomerCenter", CustomerCenter.INSTANCE, new Annotation[0]);
                }
            }

            private CustomerCenter() {
            }

            private final a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0018\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001a\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$PrivacyPolicy;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "urlLid", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "method", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lkotlin/jvm/internal/f;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lp40/x0;Lkotlin/jvm/internal/f;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$PrivacyPolicy;Lo40/b;Ln40/e;)V", "write$Self", "component1-z7Tp-4o", "()Ljava/lang/String;", "component1", "component2", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "copy-26kQY28", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$PrivacyPolicy;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrlLid-z7Tp-4o", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "getMethod", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class PrivacyPolicy implements Destination {

            public static final Companion INSTANCE = new Companion(null);
            private final UrlMethod method;
            private final String urlLid;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$PrivacyPolicy$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$PrivacyPolicy;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return ButtonComponent$Destination$PrivacyPolicy$$serializer.INSTANCE;
                }
            }

            private PrivacyPolicy(int i, String str, UrlMethod urlMethod, x0 x0Var) {
                if (3 != (i & 3)) {
                    o0.g(i, 3, ButtonComponent$Destination$PrivacyPolicy$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.urlLid = str;
                this.method = urlMethod;
            }

            @g00.c
            public PrivacyPolicy(int i, String str, UrlMethod urlMethod, x0 x0Var, f fVar) {
                this(i, str, urlMethod, x0Var);
            }

            private PrivacyPolicy(String urlLid, UrlMethod method) {
                m.e(urlLid, "urlLid");
                m.e(method, "method");
                this.urlLid = urlLid;
                this.method = method;
            }

            public PrivacyPolicy(String str, UrlMethod urlMethod, f fVar) {
                this(str, urlMethod);
            }

            public static PrivacyPolicy m157copy26kQY28$default(PrivacyPolicy privacyPolicy, String str, UrlMethod urlMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = privacyPolicy.urlLid;
                }
                if ((i & 2) != 0) {
                    urlMethod = privacyPolicy.method;
                }
                return privacyPolicy.m159copy26kQY28(str, urlMethod);
            }

            public static final void write$Self$purchases_defaultsBc8Release(PrivacyPolicy self, b output, e serialDesc) {
                output.C(serialDesc, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.m231boximpl(self.urlLid));
                output.C(serialDesc, 1, UrlMethodDeserializer.INSTANCE, self.method);
            }

            public final String getUrlLid() {
                return this.urlLid;
            }

            public final UrlMethod getMethod() {
                return this.method;
            }

            public final PrivacyPolicy m159copy26kQY28(String urlLid, UrlMethod method) {
                m.e(urlLid, "urlLid");
                m.e(method, "method");
                return new PrivacyPolicy(urlLid, method, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PrivacyPolicy)) {
                    return false;
                }
                PrivacyPolicy privacyPolicy = (PrivacyPolicy) other;
                return LocalizationKey.m234equalsimpl0(this.urlLid, privacyPolicy.urlLid) && this.method == privacyPolicy.method;
            }

            public final UrlMethod getMethod() {
                return this.method;
            }

            public final String m160getUrlLidz7Tp4o() {
                return this.urlLid;
            }

            public int hashCode() {
                return this.method.hashCode() + (LocalizationKey.m235hashCodeimpl(this.urlLid) * 31);
            }

            public String toString() {
                return "PrivacyPolicy(urlLid=" + ((Object) LocalizationKey.m236toStringimpl(this.urlLid)) + ", method=" + this.method + ')';
            }
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JF\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001fR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010#¨\u0006:"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "", DiagnosticsEntry.ID_KEY, DiagnosticsEntry.NAME_KEY, "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "", "backgroundBlur", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/StackComponent;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/StackComponent;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "component4", "()Z", "component5", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/StackComponent;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;)Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "Z", "getBackgroundBlur", "getBackgroundBlur$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Sheet implements Destination {

            public static final Companion INSTANCE = new Companion(null);
            private final boolean backgroundBlur;
            private final String id;
            private final String name;
            private final Size size;
            private final StackComponent stack;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return ButtonComponent$Destination$Sheet$$serializer.INSTANCE;
                }
            }

            @g00.c
            public Sheet(int i, String str, String str2, StackComponent stackComponent, boolean z, Size size, x0 x0Var) {
                if (31 != (i & 31)) {
                    o0.g(i, 31, ButtonComponent$Destination$Sheet$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.id = str;
                this.name = str2;
                this.stack = stackComponent;
                this.backgroundBlur = z;
                this.size = size;
            }

            public Sheet(String id, String str, StackComponent stack, boolean z, Size size) {
                m.e(id, "id");
                m.e(stack, "stack");
                this.id = id;
                this.name = str;
                this.stack = stack;
                this.backgroundBlur = z;
                this.size = size;
            }

            public static Sheet copy$default(Sheet sheet, String str, String str2, StackComponent stackComponent, boolean z, Size size, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sheet.id;
                }
                if ((i & 2) != 0) {
                    str2 = sheet.name;
                }
                if ((i & 4) != 0) {
                    stackComponent = sheet.stack;
                }
                if ((i & 8) != 0) {
                    z = sheet.backgroundBlur;
                }
                if ((i & 16) != 0) {
                    size = sheet.size;
                }
                Size size2 = size;
                StackComponent stackComponent2 = stackComponent;
                return sheet.copy(str, str2, stackComponent2, z, size2);
            }

            public static void getBackgroundBlur$annotations() {
            }

            public static final void write$Self$purchases_defaultsBc8Release(Sheet self, b output, e serialDesc) {
                output.i(serialDesc, 0, self.id);
                output.x(serialDesc, 1, b1.a, self.name);
                output.C(serialDesc, 2, StackComponent$$serializer.INSTANCE, self.stack);
                output.u(serialDesc, 3, self.backgroundBlur);
                output.x(serialDesc, 4, Size$$serializer.INSTANCE, self.size);
            }

            public final String getId() {
                return this.id;
            }

            public final String getName() {
                return this.name;
            }

            public final StackComponent getStack() {
                return this.stack;
            }

            public final boolean getBackgroundBlur() {
                return this.backgroundBlur;
            }

            public final Size getSize() {
                return this.size;
            }

            public final Sheet copy(String id, String name, StackComponent stack, boolean backgroundBlur, Size size) {
                m.e(id, "id");
                m.e(stack, "stack");
                return new Sheet(id, name, stack, backgroundBlur, size);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Sheet)) {
                    return false;
                }
                Sheet sheet = (Sheet) other;
                return m.a(this.id, sheet.id) && m.a(this.name, sheet.name) && m.a(this.stack, sheet.stack) && this.backgroundBlur == sheet.backgroundBlur && m.a(this.size, sheet.size);
            }

            public final boolean getBackgroundBlur() {
                return this.backgroundBlur;
            }

            public final String getId() {
                return this.id;
            }

            public final String getName() {
                return this.name;
            }

            public final Size getSize() {
                return this.size;
            }

            public final StackComponent getStack() {
                return this.stack;
            }

            public int hashCode() {
                int iHashCode = this.id.hashCode() * 31;
                String str = this.name;
                int iE = w.c.e((this.stack.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.backgroundBlur);
                Size size = this.size;
                return iE + (size != null ? size.hashCode() : 0);
            }

            public String toString() {
                return "Sheet(id=" + this.id + ", name=" + this.name + ", stack=" + this.stack + ", backgroundBlur=" + this.backgroundBlur + ", size=" + this.size + ')';
            }
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0018\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001a\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Terms;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "urlLid", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "method", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lkotlin/jvm/internal/f;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lp40/x0;Lkotlin/jvm/internal/f;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Terms;Lo40/b;Ln40/e;)V", "write$Self", "component1-z7Tp-4o", "()Ljava/lang/String;", "component1", "component2", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "copy-26kQY28", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Terms;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrlLid-z7Tp-4o", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "getMethod", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Terms implements Destination {

            public static final Companion INSTANCE = new Companion(null);
            private final UrlMethod method;
            private final String urlLid;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Terms$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Terms;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return ButtonComponent$Destination$Terms$$serializer.INSTANCE;
                }
            }

            private Terms(int i, String str, UrlMethod urlMethod, x0 x0Var) {
                if (3 != (i & 3)) {
                    o0.g(i, 3, ButtonComponent$Destination$Terms$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.urlLid = str;
                this.method = urlMethod;
            }

            @g00.c
            public Terms(int i, String str, UrlMethod urlMethod, x0 x0Var, f fVar) {
                this(i, str, urlMethod, x0Var);
            }

            private Terms(String urlLid, UrlMethod method) {
                m.e(urlLid, "urlLid");
                m.e(method, "method");
                this.urlLid = urlLid;
                this.method = method;
            }

            public Terms(String str, UrlMethod urlMethod, f fVar) {
                this(str, urlMethod);
            }

            public static Terms m161copy26kQY28$default(Terms terms, String str, UrlMethod urlMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = terms.urlLid;
                }
                if ((i & 2) != 0) {
                    urlMethod = terms.method;
                }
                return terms.m163copy26kQY28(str, urlMethod);
            }

            public static final void write$Self$purchases_defaultsBc8Release(Terms self, b output, e serialDesc) {
                output.C(serialDesc, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.m231boximpl(self.urlLid));
                output.C(serialDesc, 1, UrlMethodDeserializer.INSTANCE, self.method);
            }

            public final String getUrlLid() {
                return this.urlLid;
            }

            public final UrlMethod getMethod() {
                return this.method;
            }

            public final Terms m163copy26kQY28(String urlLid, UrlMethod method) {
                m.e(urlLid, "urlLid");
                m.e(method, "method");
                return new Terms(urlLid, method, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Terms)) {
                    return false;
                }
                Terms terms = (Terms) other;
                return LocalizationKey.m234equalsimpl0(this.urlLid, terms.urlLid) && this.method == terms.method;
            }

            public final UrlMethod getMethod() {
                return this.method;
            }

            public final String m164getUrlLidz7Tp4o() {
                return this.urlLid;
            }

            public int hashCode() {
                return this.method.hashCode() + (LocalizationKey.m235hashCodeimpl(this.urlLid) * 31);
            }

            public String toString() {
                return "Terms(urlLid=" + ((Object) LocalizationKey.m236toStringimpl(this.urlLid)) + ", method=" + this.method + ')';
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Unknown;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "<init>", "()V", "Ll40/a;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Unknown implements Destination {
            public static final Unknown INSTANCE = new Unknown();
            private static final h $cachedSerializer$delegate = rd.a.I(i.B, AnonymousClass1.INSTANCE);

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass1 extends n implements u00.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override
                public final a invoke() {
                    return new v("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Unknown", Unknown.INSTANCE, new Annotation[0]);
                }
            }

            private Unknown() {
            }

            private final a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0018\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001a\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Url;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "urlLid", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "method", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lkotlin/jvm/internal/f;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lp40/x0;Lkotlin/jvm/internal/f;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Url;Lo40/b;Ln40/e;)V", "write$Self", "component1-z7Tp-4o", "()Ljava/lang/String;", "component1", "component2", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "copy-26kQY28", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Url;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrlLid-z7Tp-4o", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "getMethod", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Url implements Destination {

            public static final Companion INSTANCE = new Companion(null);
            private final UrlMethod method;
            private final String urlLid;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Url$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Url;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return ButtonComponent$Destination$Url$$serializer.INSTANCE;
                }
            }

            private Url(int i, String str, UrlMethod urlMethod, x0 x0Var) {
                if (3 != (i & 3)) {
                    o0.g(i, 3, ButtonComponent$Destination$Url$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.urlLid = str;
                this.method = urlMethod;
            }

            @g00.c
            public Url(int i, String str, UrlMethod urlMethod, x0 x0Var, f fVar) {
                this(i, str, urlMethod, x0Var);
            }

            private Url(String urlLid, UrlMethod method) {
                m.e(urlLid, "urlLid");
                m.e(method, "method");
                this.urlLid = urlLid;
                this.method = method;
            }

            public Url(String str, UrlMethod urlMethod, f fVar) {
                this(str, urlMethod);
            }

            public static Url m165copy26kQY28$default(Url url, String str, UrlMethod urlMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = url.urlLid;
                }
                if ((i & 2) != 0) {
                    urlMethod = url.method;
                }
                return url.m167copy26kQY28(str, urlMethod);
            }

            public static final void write$Self$purchases_defaultsBc8Release(Url self, b output, e serialDesc) {
                output.C(serialDesc, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.m231boximpl(self.urlLid));
                output.C(serialDesc, 1, UrlMethodDeserializer.INSTANCE, self.method);
            }

            public final String getUrlLid() {
                return this.urlLid;
            }

            public final UrlMethod getMethod() {
                return this.method;
            }

            public final Url m167copy26kQY28(String urlLid, UrlMethod method) {
                m.e(urlLid, "urlLid");
                m.e(method, "method");
                return new Url(urlLid, method, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Url)) {
                    return false;
                }
                Url url = (Url) other;
                return LocalizationKey.m234equalsimpl0(this.urlLid, url.urlLid) && this.method == url.method;
            }

            public final UrlMethod getMethod() {
                return this.method;
            }

            public final String m168getUrlLidz7Tp4o() {
                return this.urlLid;
            }

            public int hashCode() {
                return this.method.hashCode() + (LocalizationKey.m235hashCodeimpl(this.urlLid) * 31);
            }

            public String toString() {
                return "Url(urlLid=" + ((Object) LocalizationKey.m236toStringimpl(this.urlLid)) + ", method=" + this.method + ')';
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "", "(Ljava/lang/String;I)V", "IN_APP_BROWSER", "EXTERNAL_BROWSER", "DEEP_LINK", "UNKNOWN", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UrlMethod {
        IN_APP_BROWSER,
        EXTERNAL_BROWSER,
        DEEP_LINK,
        UNKNOWN;


        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return UrlMethodDeserializer.INSTANCE;
            }
        }
    }

    @g00.c
    public ButtonComponent(int i, Action action, StackComponent stackComponent, PaywallTransition paywallTransition, x0 x0Var) {
        if (3 != (i & 3)) {
            o0.g(i, 3, ButtonComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.action = action;
        this.stack = stackComponent;
        if ((i & 4) == 0) {
            this.transition = null;
        } else {
            this.transition = paywallTransition;
        }
    }

    public ButtonComponent(Action action, StackComponent stack, PaywallTransition paywallTransition) {
        m.e(action, "action");
        m.e(stack, "stack");
        this.action = action;
        this.stack = stack;
        this.transition = paywallTransition;
    }

    public ButtonComponent(Action action, StackComponent stackComponent, PaywallTransition paywallTransition, int i, f fVar) {
        this(action, stackComponent, (i & 4) != 0 ? null : paywallTransition);
    }

    public static final void write$Self$purchases_defaultsBc8Release(ButtonComponent self, b output, e serialDesc) {
        output.C(serialDesc, 0, ActionSerializer.INSTANCE, self.action);
        output.C(serialDesc, 1, StackComponent$$serializer.INSTANCE, self.stack);
        if (!output.k(serialDesc) && self.transition == null) {
            return;
        }
        output.x(serialDesc, 2, PaywallTransition$$serializer.INSTANCE, self.transition);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonComponent)) {
            return false;
        }
        ButtonComponent buttonComponent = (ButtonComponent) obj;
        return m.a(this.action, buttonComponent.action) && m.a(this.stack, buttonComponent.stack) && m.a(this.transition, buttonComponent.transition);
    }

    public final Action getAction() {
        return this.action;
    }

    public final StackComponent getStack() {
        return this.stack;
    }

    public final PaywallTransition getTransition() {
        return this.transition;
    }

    public int hashCode() {
        int iHashCode = (this.stack.hashCode() + (this.action.hashCode() * 31)) * 31;
        PaywallTransition paywallTransition = this.transition;
        return iHashCode + (paywallTransition == null ? 0 : paywallTransition.hashCode());
    }

    public String toString() {
        return "ButtonComponent(action=" + this.action + ", stack=" + this.stack + ", transition=" + this.transition + ')';
    }
}

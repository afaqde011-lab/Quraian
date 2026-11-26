package com.revenuecat.purchases.paywalls.components.common;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.paywalls.components.PartialComponent;
import g00.h;
import g00.i;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import l40.a;
import n40.e;
import o40.b;
import oi.k;
import p40.b1;
import p40.c;
import p40.o0;
import p40.q0;
import p40.v;
import p40.x0;
import q40.b0;
import q40.c0;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 !*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0005\"#!$%B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tB5\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJB\u0010\u001a\u001a\u00020\u0017\"\u0004\b\u0001\u0010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "T", "", "", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "conditions", DiagnosticsEntry.PROPERTIES_KEY, "<init>", "(Ljava/util/List;Lcom/revenuecat/purchases/paywalls/components/PartialComponent;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/revenuecat/purchases/paywalls/components/PartialComponent;Lp40/x0;)V", "T0", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Ll40/a;", "typeSerial0", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;Lo40/b;Ln40/e;Ll40/a;)V", "write$Self", "Ljava/util/List;", "getConditions", "()Ljava/util/List;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "getProperties", "()Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "Companion", "$serializer", "ArrayOperator", "Condition", "EqualityOperator", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComponentOverride<T extends PartialComponent> {
    private static final e $cachedDescriptor;
    private final List<Condition> conditions;
    private final T properties;

    public static final Companion INSTANCE = new Companion(null);
    private static final a[] $childSerializers = {new c(ConditionSerializer.INSTANCE), null};

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;", "", "(Ljava/lang/String;I)V", "IN", "NOT_IN", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ArrayOperator {
        IN,
        NOT_IN;


        public static final Companion INSTANCE = new Companion(null);
        private static final h $cachedSerializer$delegate = rd.a.I(i.B, Companion.AnonymousClass1.INSTANCE);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass1 extends n implements u00.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override
                public final a invoke() {
                    return o0.d("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.ArrayOperator", ArrayOperator.values(), new String[]{"in", "not in"}, new Annotation[][]{null, null});
                }
            }

            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            private final a get$cachedSerializer() {
                return (a) ArrayOperator.$cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0005\"\u0004\b\u0001\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Companion;", "", "<init>", "()V", "T0", "Ll40/a;", "typeSerial0", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "serializer", "(Ll40/a;)Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final <T0> a serializer(a typeSerial0) {
            m.e(typeSerial0, "typeSerial0");
            return new ComponentOverride$$serializer(typeSerial0);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \b2\u00020\u0001:\r\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013R\u001a\u0010\u0002\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0006\u0082\u0001\f\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "", "isRule", "", "isRule$annotations", "()V", "()Z", "Compact", "Companion", "Expanded", "IntroOffer", "IntroOfferRule", "Medium", "MultiplePhaseOffers", "PromoOffer", "PromoOfferRule", "Selected", "SelectedPackage", "Unsupported", "Variable", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Compact;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Expanded;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOffer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOfferRule;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Medium;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$MultiplePhaseOffers;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOffer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOfferRule;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Selected;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Unsupported;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Variable;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Condition {

        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Compact;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "<init>", "()V", "Ll40/a;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Compact implements Condition {
            public static final Compact INSTANCE = new Compact();
            private static final h $cachedSerializer$delegate = rd.a.I(i.B, AnonymousClass1.INSTANCE);

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass1 extends n implements u00.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override
                public final a invoke() {
                    return new v("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Compact", Compact.INSTANCE, new Annotation[0]);
                }
            }

            private Compact() {
            }

            private final a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final a serializer() {
                return ConditionSerializer.INSTANCE;
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            public static boolean isRule(Condition condition) {
                return Condition.super.isRule();
            }

            public static void isRule$annotations() {
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Expanded;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "<init>", "()V", "Ll40/a;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Expanded implements Condition {
            public static final Expanded INSTANCE = new Expanded();
            private static final h $cachedSerializer$delegate = rd.a.I(i.B, AnonymousClass1.INSTANCE);

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass1 extends n implements u00.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override
                public final a invoke() {
                    return new v("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Expanded", Expanded.INSTANCE, new Annotation[0]);
                }
            }

            private Expanded() {
            }

            private final a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOffer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "<init>", "()V", "Ll40/a;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class IntroOffer implements Condition {
            public static final IntroOffer INSTANCE = new IntroOffer();
            private static final h $cachedSerializer$delegate = rd.a.I(i.B, AnonymousClass1.INSTANCE);

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass1 extends n implements u00.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override
                public final a invoke() {
                    return new v("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.IntroOffer", IntroOffer.INSTANCE, new Annotation[0]);
                }
            }

            private IntroOffer() {
            }

            private final a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019R\u0014\u0010)\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0019¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOfferRule;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "operator", "", "value", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Z)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;ZLp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOfferRule;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "component2", "()Z", "copy", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Z)Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOfferRule;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "getOperator", "Z", "getValue", "isRule", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class IntroOfferRule implements Condition {
            private final EqualityOperator operator;
            private final boolean value;

            public static final Companion INSTANCE = new Companion(null);
            private static final a[] $childSerializers = {EqualityOperator.INSTANCE.serializer(), null};

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOfferRule$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOfferRule;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return ComponentOverride$Condition$IntroOfferRule$$serializer.INSTANCE;
                }
            }

            @g00.c
            public IntroOfferRule(int i, EqualityOperator equalityOperator, boolean z, x0 x0Var) {
                if (3 != (i & 3)) {
                    o0.g(i, 3, ComponentOverride$Condition$IntroOfferRule$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.operator = equalityOperator;
                this.value = z;
            }

            public IntroOfferRule(EqualityOperator operator, boolean z) {
                m.e(operator, "operator");
                this.operator = operator;
                this.value = z;
            }

            public static IntroOfferRule copy$default(IntroOfferRule introOfferRule, EqualityOperator equalityOperator, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    equalityOperator = introOfferRule.operator;
                }
                if ((i & 2) != 0) {
                    z = introOfferRule.value;
                }
                return introOfferRule.copy(equalityOperator, z);
            }

            public static final void write$Self$purchases_defaultsBc8Release(IntroOfferRule self, b output, e serialDesc) {
                output.C(serialDesc, 0, $childSerializers[0], self.operator);
                output.u(serialDesc, 1, self.value);
            }

            public final EqualityOperator getOperator() {
                return this.operator;
            }

            public final boolean getValue() {
                return this.value;
            }

            public final IntroOfferRule copy(EqualityOperator operator, boolean value) {
                m.e(operator, "operator");
                return new IntroOfferRule(operator, value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof IntroOfferRule)) {
                    return false;
                }
                IntroOfferRule introOfferRule = (IntroOfferRule) other;
                return this.operator == introOfferRule.operator && this.value == introOfferRule.value;
            }

            public final EqualityOperator getOperator() {
                return this.operator;
            }

            public final boolean getValue() {
                return this.value;
            }

            public int hashCode() {
                return Boolean.hashCode(this.value) + (this.operator.hashCode() * 31);
            }

            @Override
            public boolean isRule() {
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("IntroOfferRule(operator=");
                sb.append(this.operator);
                sb.append(", value=");
                return x5.o(sb, this.value, ')');
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Medium;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "<init>", "()V", "Ll40/a;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Medium implements Condition {
            public static final Medium INSTANCE = new Medium();
            private static final h $cachedSerializer$delegate = rd.a.I(i.B, AnonymousClass1.INSTANCE);

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass1 extends n implements u00.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override
                public final a invoke() {
                    return new v("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Medium", Medium.INSTANCE, new Annotation[0]);
                }
            }

            private Medium() {
            }

            private final a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$MultiplePhaseOffers;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "<init>", "()V", "Ll40/a;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class MultiplePhaseOffers implements Condition {
            public static final MultiplePhaseOffers INSTANCE = new MultiplePhaseOffers();
            private static final h $cachedSerializer$delegate = rd.a.I(i.B, AnonymousClass1.INSTANCE);

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass1 extends n implements u00.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override
                public final a invoke() {
                    return new v("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.MultiplePhaseOffers", MultiplePhaseOffers.INSTANCE, new Annotation[0]);
                }
            }

            private MultiplePhaseOffers() {
            }

            private final a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOffer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "<init>", "()V", "Ll40/a;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class PromoOffer implements Condition {
            public static final PromoOffer INSTANCE = new PromoOffer();
            private static final h $cachedSerializer$delegate = rd.a.I(i.B, AnonymousClass1.INSTANCE);

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass1 extends n implements u00.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override
                public final a invoke() {
                    return new v("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOffer", PromoOffer.INSTANCE, new Annotation[0]);
                }
            }

            private PromoOffer() {
            }

            private final a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019R\u0014\u0010)\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0019¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOfferRule;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "operator", "", "value", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Z)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;ZLp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOfferRule;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "component2", "()Z", "copy", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Z)Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOfferRule;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "getOperator", "Z", "getValue", "isRule", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class PromoOfferRule implements Condition {
            private final EqualityOperator operator;
            private final boolean value;

            public static final Companion INSTANCE = new Companion(null);
            private static final a[] $childSerializers = {EqualityOperator.INSTANCE.serializer(), null};

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOfferRule$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOfferRule;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return ComponentOverride$Condition$PromoOfferRule$$serializer.INSTANCE;
                }
            }

            @g00.c
            public PromoOfferRule(int i, EqualityOperator equalityOperator, boolean z, x0 x0Var) {
                if (3 != (i & 3)) {
                    o0.g(i, 3, ComponentOverride$Condition$PromoOfferRule$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.operator = equalityOperator;
                this.value = z;
            }

            public PromoOfferRule(EqualityOperator operator, boolean z) {
                m.e(operator, "operator");
                this.operator = operator;
                this.value = z;
            }

            public static PromoOfferRule copy$default(PromoOfferRule promoOfferRule, EqualityOperator equalityOperator, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    equalityOperator = promoOfferRule.operator;
                }
                if ((i & 2) != 0) {
                    z = promoOfferRule.value;
                }
                return promoOfferRule.copy(equalityOperator, z);
            }

            public static final void write$Self$purchases_defaultsBc8Release(PromoOfferRule self, b output, e serialDesc) {
                output.C(serialDesc, 0, $childSerializers[0], self.operator);
                output.u(serialDesc, 1, self.value);
            }

            public final EqualityOperator getOperator() {
                return this.operator;
            }

            public final boolean getValue() {
                return this.value;
            }

            public final PromoOfferRule copy(EqualityOperator operator, boolean value) {
                m.e(operator, "operator");
                return new PromoOfferRule(operator, value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PromoOfferRule)) {
                    return false;
                }
                PromoOfferRule promoOfferRule = (PromoOfferRule) other;
                return this.operator == promoOfferRule.operator && this.value == promoOfferRule.value;
            }

            public final EqualityOperator getOperator() {
                return this.operator;
            }

            public final boolean getValue() {
                return this.value;
            }

            public int hashCode() {
                return Boolean.hashCode(this.value) + (this.operator.hashCode() * 31);
            }

            @Override
            public boolean isRule() {
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("PromoOfferRule(operator=");
                sb.append(this.operator);
                sb.append(", value=");
                return x5.o(sb, this.value, ')');
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Selected;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "<init>", "()V", "Ll40/a;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Selected implements Condition {
            public static final Selected INSTANCE = new Selected();
            private static final h $cachedSerializer$delegate = rd.a.I(i.B, AnonymousClass1.INSTANCE);

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass1 extends n implements u00.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override
                public final a invoke() {
                    return new v("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Selected", Selected.INSTANCE, new Annotation[0]);
                }
            }

            private Selected() {
            }

            private final a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001aR\u0014\u0010*\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;", "operator", "", "", "packages", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;Ljava/util/List;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;Ljava/util/List;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;", "component2", "()Ljava/util/List;", "copy", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;Ljava/util/List;)Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;", "getOperator", "Ljava/util/List;", "getPackages", "isRule", "()Z", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class SelectedPackage implements Condition {
            private final ArrayOperator operator;
            private final List<String> packages;

            public static final Companion INSTANCE = new Companion(null);
            private static final a[] $childSerializers = {ArrayOperator.INSTANCE.serializer(), new c(b1.a)};

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return ComponentOverride$Condition$SelectedPackage$$serializer.INSTANCE;
                }
            }

            @g00.c
            public SelectedPackage(int i, ArrayOperator arrayOperator, List list, x0 x0Var) {
                if (3 != (i & 3)) {
                    o0.g(i, 3, ComponentOverride$Condition$SelectedPackage$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.operator = arrayOperator;
                this.packages = list;
            }

            public SelectedPackage(ArrayOperator operator, List<String> packages) {
                m.e(operator, "operator");
                m.e(packages, "packages");
                this.operator = operator;
                this.packages = packages;
            }

            public static SelectedPackage copy$default(SelectedPackage selectedPackage, ArrayOperator arrayOperator, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    arrayOperator = selectedPackage.operator;
                }
                if ((i & 2) != 0) {
                    list = selectedPackage.packages;
                }
                return selectedPackage.copy(arrayOperator, list);
            }

            public static final void write$Self$purchases_defaultsBc8Release(SelectedPackage self, b output, e serialDesc) {
                a[] aVarArr = $childSerializers;
                output.C(serialDesc, 0, aVarArr[0], self.operator);
                output.C(serialDesc, 1, aVarArr[1], self.packages);
            }

            public final ArrayOperator getOperator() {
                return this.operator;
            }

            public final List<String> component2() {
                return this.packages;
            }

            public final SelectedPackage copy(ArrayOperator operator, List<String> packages) {
                m.e(operator, "operator");
                m.e(packages, "packages");
                return new SelectedPackage(operator, packages);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelectedPackage)) {
                    return false;
                }
                SelectedPackage selectedPackage = (SelectedPackage) other;
                return this.operator == selectedPackage.operator && m.a(this.packages, selectedPackage.packages);
            }

            public final ArrayOperator getOperator() {
                return this.operator;
            }

            public final List<String> getPackages() {
                return this.packages;
            }

            public int hashCode() {
                return this.packages.hashCode() + (this.operator.hashCode() * 31);
            }

            @Override
            public boolean isRule() {
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("SelectedPackage(operator=");
                sb.append(this.operator);
                sb.append(", packages=");
                return k.n(sb, this.packages, ')');
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Unsupported;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "<init>", "()V", "Ll40/a;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Unsupported implements Condition {
            public static final Unsupported INSTANCE = new Unsupported();
            private static final h $cachedSerializer$delegate = rd.a.I(i.B, AnonymousClass1.INSTANCE);

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass1 extends n implements u00.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override
                public final a invoke() {
                    return new v("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Unsupported", Unsupported.INSTANCE, new Annotation[0]);
                }
            }

            private Unsupported() {
            }

            private final a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001dR\u0014\u0010.\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Variable;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "operator", "", "variable", "Lq40/b0;", "value", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Ljava/lang/String;Lq40/b0;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Ljava/lang/String;Lq40/b0;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Variable;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "component2", "()Ljava/lang/String;", "component3", "()Lq40/b0;", "copy", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Ljava/lang/String;Lq40/b0;)Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Variable;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "getOperator", "Ljava/lang/String;", "getVariable", "Lq40/b0;", "getValue", "isRule", "()Z", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Variable implements Condition {
            private final EqualityOperator operator;
            private final b0 value;
            private final String variable;

            public static final Companion INSTANCE = new Companion(null);
            private static final a[] $childSerializers = {EqualityOperator.INSTANCE.serializer(), null, null};

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Variable$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Variable;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return ComponentOverride$Condition$Variable$$serializer.INSTANCE;
                }
            }

            @g00.c
            public Variable(int i, EqualityOperator equalityOperator, String str, b0 b0Var, x0 x0Var) {
                if (7 != (i & 7)) {
                    o0.g(i, 7, ComponentOverride$Condition$Variable$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.operator = equalityOperator;
                this.variable = str;
                this.value = b0Var;
            }

            public Variable(EqualityOperator operator, String variable, b0 value) {
                m.e(operator, "operator");
                m.e(variable, "variable");
                m.e(value, "value");
                this.operator = operator;
                this.variable = variable;
                this.value = value;
            }

            public static Variable copy$default(Variable variable, EqualityOperator equalityOperator, String str, b0 b0Var, int i, Object obj) {
                if ((i & 1) != 0) {
                    equalityOperator = variable.operator;
                }
                if ((i & 2) != 0) {
                    str = variable.variable;
                }
                if ((i & 4) != 0) {
                    b0Var = variable.value;
                }
                return variable.copy(equalityOperator, str, b0Var);
            }

            public static final void write$Self$purchases_defaultsBc8Release(Variable self, b output, e serialDesc) {
                output.C(serialDesc, 0, $childSerializers[0], self.operator);
                output.i(serialDesc, 1, self.variable);
                output.C(serialDesc, 2, c0.a, self.value);
            }

            public final EqualityOperator getOperator() {
                return this.operator;
            }

            public final String getVariable() {
                return this.variable;
            }

            public final b0 getValue() {
                return this.value;
            }

            public final Variable copy(EqualityOperator operator, String variable, b0 value) {
                m.e(operator, "operator");
                m.e(variable, "variable");
                m.e(value, "value");
                return new Variable(operator, variable, value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Variable)) {
                    return false;
                }
                Variable variable = (Variable) other;
                return this.operator == variable.operator && m.a(this.variable, variable.variable) && m.a(this.value, variable.value);
            }

            public final EqualityOperator getOperator() {
                return this.operator;
            }

            public final b0 getValue() {
                return this.value;
            }

            public final String getVariable() {
                return this.variable;
            }

            public int hashCode() {
                return this.value.hashCode() + x5.e(this.operator.hashCode() * 31, this.variable, 31);
            }

            @Override
            public boolean isRule() {
                return true;
            }

            public String toString() {
                return "Variable(operator=" + this.operator + ", variable=" + this.variable + ", value=" + this.value + ')';
            }
        }

        default boolean isRule() {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "", "(Ljava/lang/String;I)V", "EQUALS", "NOT_EQUALS", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum EqualityOperator {
        EQUALS,
        NOT_EQUALS;


        public static final Companion INSTANCE = new Companion(null);
        private static final h $cachedSerializer$delegate = rd.a.I(i.B, Companion.AnonymousClass1.INSTANCE);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass1 extends n implements u00.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override
                public final a invoke() {
                    return o0.d("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator", EqualityOperator.values(), new String[]{"=", "!="}, new Annotation[][]{null, null});
                }
            }

            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            private final a get$cachedSerializer() {
                return (a) EqualityOperator.$cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }
    }

    static {
        q0 q0Var = new q0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride", null, 2);
        q0Var.j("conditions", false);
        q0Var.j(DiagnosticsEntry.PROPERTIES_KEY, false);
        $cachedDescriptor = q0Var;
    }

    @g00.c
    public ComponentOverride(int i, List list, PartialComponent partialComponent, x0 x0Var) {
        if (3 != (i & 3)) {
            o0.g(i, 3, $cachedDescriptor);
            throw null;
        }
        this.conditions = list;
        this.properties = partialComponent;
    }

    public ComponentOverride(List<? extends Condition> conditions, T properties) {
        m.e(conditions, "conditions");
        m.e(properties, "properties");
        this.conditions = conditions;
        this.properties = properties;
    }

    public static final void write$Self$purchases_defaultsBc8Release(ComponentOverride self, b output, e serialDesc, a typeSerial0) {
        output.C(serialDesc, 0, $childSerializers[0], self.conditions);
        output.C(serialDesc, 1, typeSerial0, self.properties);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComponentOverride)) {
            return false;
        }
        ComponentOverride componentOverride = (ComponentOverride) obj;
        return m.a(this.conditions, componentOverride.conditions) && m.a(this.properties, componentOverride.properties);
    }

    public final List getConditions() {
        return this.conditions;
    }

    public final PartialComponent getProperties() {
        return this.properties;
    }

    public int hashCode() {
        return this.properties.hashCode() + (this.conditions.hashCode() * 31);
    }

    public String toString() {
        return "ComponentOverride(conditions=" + this.conditions + ", properties=" + this.properties + ')';
    }
}

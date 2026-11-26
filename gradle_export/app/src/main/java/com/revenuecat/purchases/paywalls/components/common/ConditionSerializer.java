package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.utils.serializers.SealedDeserializerWithDefault;
import h00.d0;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.a;
import u00.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer;", "Lcom/revenuecat/purchases/utils/serializers/SealedDeserializerWithDefault;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "()V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConditionSerializer extends SealedDeserializerWithDefault<ComponentOverride.Condition> {
    public static final ConditionSerializer INSTANCE = new ConditionSerializer();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Compact;", "invoke", "()Ll40/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override
        public final l40.a invoke() {
            return ComponentOverride.Condition.Compact.INSTANCE.serializer();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage;", "invoke", "()Ll40/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass10 extends n implements a {
        public static final AnonymousClass10 INSTANCE = new AnonymousClass10();

        public AnonymousClass10() {
            super(0);
        }

        @Override
        public final l40.a invoke() {
            return ComponentOverride.Condition.SelectedPackage.INSTANCE.serializer();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Variable;", "invoke", "()Ll40/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass11 extends n implements a {
        public static final AnonymousClass11 INSTANCE = new AnonymousClass11();

        public AnonymousClass11() {
            super(0);
        }

        @Override
        public final l40.a invoke() {
            return ComponentOverride.Condition.Variable.INSTANCE.serializer();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass12 extends n implements k {
        public static final AnonymousClass12 INSTANCE = new AnonymousClass12();

        public AnonymousClass12() {
            super(1);
        }

        @Override
        public final ComponentOverride.Condition invoke(String it) {
            m.e(it, "it");
            return ComponentOverride.Condition.Unsupported.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Medium;", "invoke", "()Ll40/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends n implements a {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override
        public final l40.a invoke() {
            return ComponentOverride.Condition.Medium.INSTANCE.serializer();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Expanded;", "invoke", "()Ll40/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass3 extends n implements a {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override
        public final l40.a invoke() {
            return ComponentOverride.Condition.Expanded.INSTANCE.serializer();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOffer;", "invoke", "()Ll40/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass4 extends n implements a {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(0);
        }

        @Override
        public final l40.a invoke() {
            return ComponentOverride.Condition.IntroOffer.INSTANCE.serializer();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOfferRule;", "invoke", "()Ll40/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass5 extends n implements a {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override
        public final l40.a invoke() {
            return ComponentOverride.Condition.IntroOfferRule.INSTANCE.serializer();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$MultiplePhaseOffers;", "invoke", "()Ll40/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass6 extends n implements a {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public AnonymousClass6() {
            super(0);
        }

        @Override
        public final l40.a invoke() {
            return ComponentOverride.Condition.MultiplePhaseOffers.INSTANCE.serializer();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Selected;", "invoke", "()Ll40/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass7 extends n implements a {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        public AnonymousClass7() {
            super(0);
        }

        @Override
        public final l40.a invoke() {
            return ComponentOverride.Condition.Selected.INSTANCE.serializer();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOffer;", "invoke", "()Ll40/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass8 extends n implements a {
        public static final AnonymousClass8 INSTANCE = new AnonymousClass8();

        public AnonymousClass8() {
            super(0);
        }

        @Override
        public final l40.a invoke() {
            return ComponentOverride.Condition.PromoOffer.INSTANCE.serializer();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOfferRule;", "invoke", "()Ll40/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass9 extends n implements a {
        public static final AnonymousClass9 INSTANCE = new AnonymousClass9();

        public AnonymousClass9() {
            super(0);
        }

        @Override
        public final l40.a invoke() {
            return ComponentOverride.Condition.PromoOfferRule.INSTANCE.serializer();
        }
    }

    private ConditionSerializer() {
        super("Condition", d0.R(new g00.k("compact", AnonymousClass1.INSTANCE), new g00.k("medium", AnonymousClass2.INSTANCE), new g00.k("expanded", AnonymousClass3.INSTANCE), new g00.k("intro_offer", AnonymousClass4.INSTANCE), new g00.k("intro_offer_condition", AnonymousClass5.INSTANCE), new g00.k("multiple_intro_offers", AnonymousClass6.INSTANCE), new g00.k("selected", AnonymousClass7.INSTANCE), new g00.k("promo_offer", AnonymousClass8.INSTANCE), new g00.k("promo_offer_condition", AnonymousClass9.INSTANCE), new g00.k("selected_package_condition", AnonymousClass10.INSTANCE), new g00.k("variable_condition", AnonymousClass11.INSTANCE)), AnonymousClass12.INSTANCE, null, 8, null);
    }
}

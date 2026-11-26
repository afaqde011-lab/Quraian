package com.revenuecat.purchases.paywalls.components;

import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 #2\u00020\u0001:\u0004$#%&B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB;\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;", "", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;", "type", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;", "displacementStrategy", "Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;", "animation", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;Lo40/b;Ln40/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;", "getType", "()Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;", "getDisplacementStrategy", "()Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;", "getDisplacementStrategy$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;", "getAnimation", "()Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;", "Companion", "$serializer", "DisplacementStrategy", "TransitionType", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallTransition {

    public static final Companion INSTANCE = new Companion(null);
    private final PaywallAnimation animation;
    private final DisplacementStrategy displacementStrategy;
    private final TransitionType type;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return PaywallTransition$$serializer.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;", "", "(Ljava/lang/String;I)V", "GREEDY", "LAZY", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum DisplacementStrategy {
        GREEDY,
        LAZY;


        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return DisplacementStrategyDeserializer.INSTANCE;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;", "", "(Ljava/lang/String;I)V", "FADE", "FADE_AND_SCALE", "SCALE", "SLIDE", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum TransitionType {
        FADE,
        FADE_AND_SCALE,
        SCALE,
        SLIDE;


        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return TransitionTypeSerializer.INSTANCE;
            }
        }
    }

    @c
    public PaywallTransition(int i, TransitionType transitionType, DisplacementStrategy displacementStrategy, PaywallAnimation paywallAnimation, x0 x0Var) {
        if (2 != (i & 2)) {
            o0.g(i, 2, PaywallTransition$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = (i & 1) == 0 ? TransitionType.FADE : transitionType;
        this.displacementStrategy = displacementStrategy;
        if ((i & 4) == 0) {
            this.animation = null;
        } else {
            this.animation = paywallAnimation;
        }
    }

    public PaywallTransition(TransitionType type, DisplacementStrategy displacementStrategy, PaywallAnimation paywallAnimation) {
        m.e(type, "type");
        m.e(displacementStrategy, "displacementStrategy");
        this.type = type;
        this.displacementStrategy = displacementStrategy;
        this.animation = paywallAnimation;
    }

    public PaywallTransition(TransitionType transitionType, DisplacementStrategy displacementStrategy, PaywallAnimation paywallAnimation, int i, f fVar) {
        this((i & 1) != 0 ? TransitionType.FADE : transitionType, displacementStrategy, (i & 4) != 0 ? null : paywallAnimation);
    }

    public static void getDisplacementStrategy$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(PaywallTransition self, b output, e serialDesc) {
        if (output.k(serialDesc) || self.type != TransitionType.FADE) {
            output.C(serialDesc, 0, TransitionTypeSerializer.INSTANCE, self.type);
        }
        output.C(serialDesc, 1, DisplacementStrategyDeserializer.INSTANCE, self.displacementStrategy);
        if (!output.k(serialDesc) && self.animation == null) {
            return;
        }
        output.x(serialDesc, 2, PaywallAnimation$$serializer.INSTANCE, self.animation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallTransition)) {
            return false;
        }
        PaywallTransition paywallTransition = (PaywallTransition) obj;
        return this.type == paywallTransition.type && this.displacementStrategy == paywallTransition.displacementStrategy && m.a(this.animation, paywallTransition.animation);
    }

    public final PaywallAnimation getAnimation() {
        return this.animation;
    }

    public final DisplacementStrategy getDisplacementStrategy() {
        return this.displacementStrategy;
    }

    public final TransitionType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.displacementStrategy.hashCode() + (this.type.hashCode() * 31)) * 31;
        PaywallAnimation paywallAnimation = this.animation;
        return iHashCode + (paywallAnimation == null ? 0 : paywallAnimation.hashCode());
    }

    public String toString() {
        return "PaywallTransition(type=" + this.type + ", displacementStrategy=" + this.displacementStrategy + ", animation=" + this.animation + ')';
    }
}

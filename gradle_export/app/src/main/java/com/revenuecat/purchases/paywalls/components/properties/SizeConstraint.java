package com.revenuecat.purchases.paywalls.components.properties;

import g00.c;
import g00.h;
import g00.i;
import g00.u;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.n;
import l40.a;
import p40.o0;
import p40.v;
import p40.x0;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "", "Companion", "Fill", "Fit", "Fixed", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SizeConstraint {

    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final a serializer() {
            return SizeConstraintDeserializer.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "<init>", "()V", "Ll40/a;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Fill implements SizeConstraint {
        public static final Fill INSTANCE = new Fill();
        private static final h $cachedSerializer$delegate = rd.a.I(i.B, AnonymousClass1.INSTANCE);

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass1 extends n implements u00.a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override
            public final a invoke() {
                return new v("com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fill", Fill.INSTANCE, new Annotation[0]);
            }
        }

        private Fill() {
        }

        private final a get$cachedSerializer() {
            return (a) $cachedSerializer$delegate.getValue();
        }

        public final a serializer() {
            return get$cachedSerializer();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "<init>", "()V", "Ll40/a;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Fit implements SizeConstraint {
        public static final Fit INSTANCE = new Fit();
        private static final h $cachedSerializer$delegate = rd.a.I(i.B, AnonymousClass1.INSTANCE);

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass1 extends n implements u00.a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override
            public final a invoke() {
                return new v("com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fit", Fit.INSTANCE, new Annotation[0]);
            }
        }

        private Fit() {
        }

        private final a get$cachedSerializer() {
            return (a) $cachedSerializer$delegate.getValue();
        }

        public final a serializer() {
            return get$cachedSerializer();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "Lg00/u;", "value", "<init>", "(ILkotlin/jvm/internal/f;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILg00/u;Lp40/x0;Lkotlin/jvm/internal/f;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;Lo40/b;Ln40/e;)V", "write$Self", "I", "getValue-pVg5ArA", "()I", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Fixed implements SizeConstraint {

        public static final Companion INSTANCE = new Companion(null);
        private final int value;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return SizeConstraint$Fixed$$serializer.INSTANCE;
            }
        }

        private Fixed(int i) {
            this.value = i;
        }

        private Fixed(int i, u uVar, x0 x0Var) {
            if (1 == (i & 1)) {
                this.value = uVar.A;
            } else {
                o0.g(i, 1, SizeConstraint$Fixed$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        @c
        public Fixed(int i, u uVar, x0 x0Var, f fVar) {
            this(i, uVar, x0Var);
        }

        public Fixed(int i, f fVar) {
            this(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fixed) && this.value == ((Fixed) obj).value;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return "Fixed(value=" + ((Object) u.a(this.value)) + ')';
        }
    }
}

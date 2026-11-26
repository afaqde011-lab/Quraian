package com.revenuecat.purchases.paywalls.components.properties;

import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import l40.a;
import n40.e;
import o40.b;
import oi.k;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "", "Companion", "Dp", "Percentage", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface CornerRadiuses {

    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final a serializer() {
            return CornerRadiusesSerializer.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002'&B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nBC\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0007\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u0012\u0004\b!\u0010\u001f\u001a\u0004\b \u0010\u001dR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u0012\u0004\b#\u0010\u001f\u001a\u0004\b\"\u0010\u001dR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u0012\u0004\b%\u0010\u001f\u001a\u0004\b$\u0010\u001d¨\u0006("}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "", "topLeading", "topTrailing", "bottomLeading", "bottomTrailing", "<init>", "(DDDD)V", "all", "(D)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(IDDDDLp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;Lo40/b;Ln40/e;)V", "write$Self", "copy", "(DDDD)Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;", "D", "getTopLeading", "()D", "getTopLeading$annotations", "()V", "getTopTrailing", "getTopTrailing$annotations", "getBottomLeading", "getBottomLeading$annotations", "getBottomTrailing", "getBottomTrailing$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dp implements CornerRadiuses {

        public static final Companion INSTANCE = new Companion(null);

        private static final Dp f2default;
        private static final Dp zero;
        private final double bottomLeading;
        private final double bottomTrailing;
        private final double topLeading;
        private final double topTrailing;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00058F¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00058F¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;", "serializer", "()Ll40/a;", "zero", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;", "getZero", "()Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;", "default", "getDefault", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final Dp getDefault() {
                return Dp.f2default;
            }

            public final Dp getZero() {
                return Dp.zero;
            }

            public final a serializer() {
                return CornerRadiuses$Dp$$serializer.INSTANCE;
            }
        }

        static {
            Dp dp2 = new Dp(0.0d, 0.0d, 0.0d, 0.0d);
            zero = dp2;
            f2default = dp2;
        }

        public Dp(double d) {
            this(d, d, d, d);
        }

        public Dp(double d, double d2, double d3, double d4) {
            this.topLeading = d;
            this.topTrailing = d2;
            this.bottomLeading = d3;
            this.bottomTrailing = d4;
        }

        @c
        public Dp(int i, double d, double d2, double d3, double d4, x0 x0Var) {
            if (15 != (i & 15)) {
                o0.g(i, 15, CornerRadiuses$Dp$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.topLeading = d;
            this.topTrailing = d2;
            this.bottomLeading = d3;
            this.bottomTrailing = d4;
        }

        public static Dp copy$default(Dp dp2, double d, double d2, double d3, double d4, int i, Object obj) {
            if ((i & 1) != 0) {
                d = dp2.topLeading;
            }
            double d5 = d;
            if ((i & 2) != 0) {
                d2 = dp2.topTrailing;
            }
            double d6 = d2;
            if ((i & 4) != 0) {
                d3 = dp2.bottomLeading;
            }
            return dp2.copy(d5, d6, d3, (i & 8) != 0 ? dp2.bottomTrailing : d4);
        }

        public static void getBottomLeading$annotations() {
        }

        public static void getBottomTrailing$annotations() {
        }

        public static void getTopLeading$annotations() {
        }

        public static void getTopTrailing$annotations() {
        }

        public static final void write$Self$purchases_defaultsBc8Release(Dp self, b output, e serialDesc) {
            output.B(serialDesc, 0, self.topLeading);
            output.B(serialDesc, 1, self.topTrailing);
            output.B(serialDesc, 2, self.bottomLeading);
            output.B(serialDesc, 3, self.bottomTrailing);
        }

        public final Dp copy(double topLeading, double topTrailing, double bottomLeading, double bottomTrailing) {
            return new Dp(topLeading, topTrailing, bottomLeading, bottomTrailing);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dp)) {
                return false;
            }
            Dp dp2 = (Dp) obj;
            return Double.compare(this.topLeading, dp2.topLeading) == 0 && Double.compare(this.topTrailing, dp2.topTrailing) == 0 && Double.compare(this.bottomLeading, dp2.bottomLeading) == 0 && Double.compare(this.bottomTrailing, dp2.bottomTrailing) == 0;
        }

        public final double getBottomLeading() {
            return this.bottomLeading;
        }

        public final double getBottomTrailing() {
            return this.bottomTrailing;
        }

        public final double getTopLeading() {
            return this.topLeading;
        }

        public final double getTopTrailing() {
            return this.topTrailing;
        }

        public int hashCode() {
            return Double.hashCode(this.bottomTrailing) + ((Double.hashCode(this.bottomLeading) + ((Double.hashCode(this.topTrailing) + (Double.hashCode(this.topLeading) * 31)) * 31)) * 31);
        }

        public String toString() {
            return "Dp(topLeading=" + this.topLeading + ", topTrailing=" + this.topTrailing + ", bottomLeading=" + this.bottomLeading + ", bottomTrailing=" + this.bottomTrailing + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002$#B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nBC\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0018\u0012\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001f\u0010\u001aR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0018\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b!\u0010\u001a¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "", "topLeading", "topTrailing", "bottomLeading", "bottomTrailing", "<init>", "(IIII)V", "all", "(I)V", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(IIIIILp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;Lo40/b;Ln40/e;)V", "write$Self", "I", "getTopLeading", "()I", "getTopLeading$annotations", "()V", "getTopTrailing", "getTopTrailing$annotations", "getBottomLeading", "getBottomLeading$annotations", "getBottomTrailing", "getBottomTrailing$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Percentage implements CornerRadiuses {

        public static final Companion INSTANCE = new Companion(null);
        private final int bottomLeading;
        private final int bottomTrailing;
        private final int topLeading;
        private final int topTrailing;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return CornerRadiuses$Percentage$$serializer.INSTANCE;
            }
        }

        public Percentage(int i) {
            this(i, i, i, i);
        }

        public Percentage(int i, int i2, int i3, int i4) {
            this.topLeading = i;
            this.topTrailing = i2;
            this.bottomLeading = i3;
            this.bottomTrailing = i4;
        }

        @c
        public Percentage(int i, int i2, int i3, int i4, int i5, x0 x0Var) {
            if (15 != (i & 15)) {
                o0.g(i, 15, CornerRadiuses$Percentage$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.topLeading = i2;
            this.topTrailing = i3;
            this.bottomLeading = i4;
            this.bottomTrailing = i5;
        }

        public static void getBottomLeading$annotations() {
        }

        public static void getBottomTrailing$annotations() {
        }

        public static void getTopLeading$annotations() {
        }

        public static void getTopTrailing$annotations() {
        }

        public static final void write$Self$purchases_defaultsBc8Release(Percentage self, b output, e serialDesc) {
            output.w(0, self.topLeading, serialDesc);
            output.w(1, self.topTrailing, serialDesc);
            output.w(2, self.bottomLeading, serialDesc);
            output.w(3, self.bottomTrailing, serialDesc);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Percentage)) {
                return false;
            }
            Percentage percentage = (Percentage) obj;
            return this.topLeading == percentage.topLeading && this.topTrailing == percentage.topTrailing && this.bottomLeading == percentage.bottomLeading && this.bottomTrailing == percentage.bottomTrailing;
        }

        public final int getBottomLeading() {
            return this.bottomLeading;
        }

        public final int getBottomTrailing() {
            return this.bottomTrailing;
        }

        public final int getTopLeading() {
            return this.topLeading;
        }

        public final int getTopTrailing() {
            return this.topTrailing;
        }

        public int hashCode() {
            return (((((this.topLeading * 31) + this.topTrailing) * 31) + this.bottomLeading) * 31) + this.bottomTrailing;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Percentage(topLeading=");
            sb.append(this.topLeading);
            sb.append(", topTrailing=");
            sb.append(this.topTrailing);
            sb.append(", bottomLeading=");
            sb.append(this.bottomLeading);
            sb.append(", bottomTrailing=");
            return k.l(sb, this.bottomTrailing, ')');
        }
    }
}
